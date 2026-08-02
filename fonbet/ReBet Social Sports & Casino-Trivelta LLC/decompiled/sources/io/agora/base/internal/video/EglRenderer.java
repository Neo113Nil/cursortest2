package io.agora.base.internal.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import io.agora.base.AlphaStitchMode;
import io.agora.base.ColorSpace;
import io.agora.base.TextureBuffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.RendererCommon;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public class EglRenderer implements VideoSink {
    public static boolean DEBUG = false;
    private static long DEFAULT_FRAME_INTERVAL_NANOS = 16666666;
    private static boolean ENABLE_LAST_FRAME = false;
    private static final long LOG_INTERVAL_SEC = 4;
    private static final int MAX_INVOKE_TIME_MS = 1000;
    private static final long NANOS_PER_SECOND = 1000000000;
    private static final String TAG = "EglRenderer";
    private RendererCommon.GlDrawer drawer;
    private EglBase eglBase;
    protected boolean isFirstFrameRendered;
    private long minRenderPeriodNs;
    private boolean mirror;
    protected final String name;
    private long nextFrameTimeNs;
    private Rect rect;
    private int renderMode;
    private Handler renderThreadHandler;
    protected RendererCommon.RendererEvents rendererEvents;
    private float viewHeight;
    private float viewWidth;
    private int transferID = ColorSpace.Transfer.Unspecified.getTransfer();
    private final Object handlerLock = new Object();
    private final Object surfaceLock = new Object();
    private final ArrayList<FrameListenerAndParams> frameListeners = new ArrayList<>();
    private final Object fpsReductionLock = new Object();
    private boolean eglContextAttached = false;
    private final VideoFrameDrawer frameDrawer = new VideoFrameDrawer();
    private final Matrix drawMatrix = new Matrix();
    private VideoFrame lastFrame = null;
    private final Object layoutLock = new Object();
    private boolean enableAlphaMask = false;
    private StatisticsInfo statisticsInfo = new StatisticsInfo();
    private long frameIntervalNanos = 0;
    private boolean switchToStartVsync = false;
    private boolean isVsyncCallbackStared = false;
    private boolean isRenderOnSurfaceView = false;
    private boolean surfaceValid = true;
    private volatile boolean isReleasing = false;
    private volatile boolean islut10Update = false;
    private volatile boolean textureCoordUpdate = false;
    private final GlTextureFrameBuffer bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
    private int lastVideoFrameWidth = 0;
    private int lastVideoFrameHeight = 0;
    private final Runnable logStatisticsRunnable = new Runnable() { // from class: io.agora.base.internal.video.EglRenderer.1
        @Override // java.lang.Runnable
        public void run() {
            EglRenderer.this.statisticsInfo.logStatistics();
            synchronized (EglRenderer.this.handlerLock) {
                try {
                    if (EglRenderer.this.renderThreadHandler != null) {
                        EglRenderer.this.renderThreadHandler.removeCallbacks(EglRenderer.this.logStatisticsRunnable);
                        EglRenderer.this.renderThreadHandler.postDelayed(EglRenderer.this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(EglRenderer.LOG_INTERVAL_SEC));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };
    private final EglSurfaceCreation eglSurfaceCreationRunnable = new EglSurfaceCreation();
    protected Color backgroudColor = new Color(0);

    public class Color {
        public float alpha;
        public float blue;
        public float green;
        public float red;

        public Color(int i10) {
            this.red = ((i10 >> 24) & 255) / 255.0f;
            this.green = ((i10 >> 16) & 255) / 255.0f;
            this.blue = ((i10 >> 8) & 255) / 255.0f;
            this.alpha = (i10 & 255) / 255.0f;
        }
    }

    public class EglSurfaceCreation implements Runnable {
        private Object surface;

        private EglSurfaceCreation() {
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            try {
                if (this.surface != null && EglRenderer.this.eglBase != null && !EglRenderer.this.eglBase.hasSurface()) {
                    Object obj = this.surface;
                    if (obj instanceof Surface) {
                        EglRenderer.this.eglBase.createSurface((Surface) this.surface);
                    } else {
                        if (!(obj instanceof SurfaceTexture)) {
                            throw new IllegalStateException("Invalid surface: " + this.surface);
                        }
                        EglRenderer.this.eglBase.createSurface((SurfaceTexture) this.surface);
                    }
                    EglRenderer.this.eglBase.makeCurrent();
                    EglRenderer.this.eglContextAttached = true;
                    GLES20.glPixelStorei(3317, 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }
    }

    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    public static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f10, RendererCommon.GlDrawer glDrawer, boolean z10) {
            this.listener = frameListener;
            this.scale = f10;
            this.drawer = glDrawer;
            this.applyFpsReduction = z10;
        }
    }

    public static class HandlerWithFrameSyncControl extends Handler implements Choreographer.FrameCallback {
        private static final int MSG_SEND_CHOREOGRAPHER_QUIT_SIGNAL = 0;
        private static final int MSG_SEND_DROP_FRAME = 1;
        private static final int MSG_SEND_RENDER_FRAME_SIGNAL = 2;
        private static final int QUEUE_BUFFER = 3;
        private final Runnable exceptionCallback;
        private boolean isPreviousFrameDrawn;
        private VsyncStats lastPersionStats;
        private long mLastFrameTimeNanos;
        private final Object queueLock;
        private final Queue<VideoFrameInternal> renderFrames;
        private WeakReference<EglRenderer> weakRenderer;

        public HandlerWithFrameSyncControl(Looper looper, Runnable runnable, EglRenderer eglRenderer) {
            super(looper);
            this.queueLock = new Object();
            this.mLastFrameTimeNanos = 0L;
            this.lastPersionStats = VsyncStats.NORMAL;
            this.exceptionCallback = runnable;
            this.renderFrames = new LinkedList();
            this.weakRenderer = new WeakReference<>(eglRenderer);
            this.mLastFrameTimeNanos = 0L;
            this.isPreviousFrameDrawn = false;
        }

        private void doLut10Frame(byte[] bArr) {
            EglRenderer eglRenderer = this.weakRenderer.get();
            if (eglRenderer == null) {
                Logging.e(EglRenderer.TAG, "handleMessage: weak is null");
            } else {
                eglRenderer.doLut10Frame(bArr);
            }
        }

        private void doRenderFrame(long j10) {
            VideoFrameInternal poll;
            EglRenderer eglRenderer = this.weakRenderer.get();
            if (eglRenderer == null) {
                Logging.e(EglRenderer.TAG, "handleMessage: weak is null");
                return;
            }
            if (!eglRenderer.checkSurfaceValid()) {
                Logging.d(EglRenderer.TAG, "Skip render frame - Not valid surface.");
                return;
            }
            long j11 = 0;
            if (eglRenderer.frameIntervalNanos == 0) {
                return;
            }
            if (this.mLastFrameTimeNanos == 0) {
                this.mLastFrameTimeNanos = j10;
            }
            double d10 = (j10 - this.mLastFrameTimeNanos) / 1000000.0d;
            if (EglRenderer.DEBUG) {
                Logging.d(EglRenderer.TAG, "period start diffMs:" + d10);
            }
            long j12 = j10 - this.mLastFrameTimeNanos;
            this.mLastFrameTimeNanos = j10;
            if (j12 >= eglRenderer.frameIntervalNanos + (eglRenderer.frameIntervalNanos / 2)) {
                j11 = j12 / eglRenderer.frameIntervalNanos;
                this.lastPersionStats = VsyncStats.DELAY;
            } else {
                this.lastPersionStats = VsyncStats.NORMAL;
            }
            eglRenderer.statisticsInfo.updateEveryVsyncStatistics(this.lastPersionStats, this.isPreviousFrameDrawn, j11, j12);
            this.isPreviousFrameDrawn = false;
            synchronized (this.queueLock) {
                poll = this.renderFrames.poll();
            }
            if (poll == null) {
                if (EglRenderer.DEBUG) {
                    Logging.d(EglRenderer.TAG, "get no frame in renderFrames ,is a jank");
                }
            } else {
                this.isPreviousFrameDrawn = true;
                eglRenderer.renderFrameOnRenderThread(poll, j10);
                if (poll.frame.getAlphaBuffer() != null) {
                    poll.frame.releaseAlphaBuffer();
                }
            }
        }

        private void stopChoreographer() {
            synchronized (this.queueLock) {
                try {
                    for (VideoFrameInternal videoFrameInternal : this.renderFrames) {
                        videoFrameInternal.frame.release();
                        if (videoFrameInternal.frame.getAlphaBuffer() != null) {
                            videoFrameInternal.frame.releaseAlphaBuffer();
                        }
                    }
                    this.renderFrames.clear();
                    EglRenderer eglRenderer = this.weakRenderer.get();
                    if (eglRenderer == null) {
                        Logging.e(EglRenderer.TAG, "handleMessage: weak is null");
                    } else if (eglRenderer.switchToStartVsync) {
                        Choreographer.getInstance().removeFrameCallback(this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Exception e10) {
                Logging.e(EglRenderer.TAG, "Exception on EglRenderer thread", e10);
                this.exceptionCallback.run();
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            EglRenderer eglRenderer = this.weakRenderer.get();
            if (eglRenderer == null) {
                Logging.e(EglRenderer.TAG, "doFrame: weak is null");
                return;
            }
            if (!eglRenderer.isVsyncCallbackStared) {
                Log.i(EglRenderer.TAG, "Choreographer real start");
            }
            eglRenderer.isVsyncCallbackStared = true;
            sendMessage(obtainMessage(2, new Long(j10)));
            Choreographer.getInstance().postFrameCallback(this);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            EglRenderer eglRenderer = this.weakRenderer.get();
            if (eglRenderer == null) {
                Logging.e(EglRenderer.TAG, "handleMessage: weak is null");
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                stopChoreographer();
                return;
            }
            if (i10 == 1) {
                RendererCommon.RendererEvents rendererEvents = eglRenderer.rendererEvents;
                if (rendererEvents != null) {
                    rendererEvents.onFrameDropped();
                }
                eglRenderer.statisticsInfo.updateFramesDropped();
                return;
            }
            if (i10 == 2) {
                long nanoTime = System.nanoTime();
                Object obj = message.obj;
                if (obj != null) {
                    nanoTime = ((Long) obj).longValue();
                }
                doRenderFrame(nanoTime);
                return;
            }
            try {
                super.handleMessage(message);
            } catch (Exception e10) {
                Logging.e(EglRenderer.TAG, "setRepeatingRequest failed, error message : " + e10.getMessage());
            }
        }

        public void sendFrameToRenderThread(long j10, VideoFrame videoFrame) {
            synchronized (this.queueLock) {
                try {
                    videoFrame.retain();
                    if (this.renderFrames.size() >= 3) {
                        if (EglRenderer.DEBUG && (videoFrame.getBuffer() instanceof TextureBuffer) && this.weakRenderer.get() != null) {
                            Logging.d(EglRenderer.TAG, "logStatistics " + this.weakRenderer.get() + " change thread drop sequence:" + ((TextureBuffer) videoFrame.getBuffer()).getSequence());
                        }
                        VideoFrameInternal poll = this.renderFrames.poll();
                        if (poll != null) {
                            poll.frame.release();
                            if (poll.frame.getAlphaBuffer() != null) {
                                poll.frame.releaseAlphaBuffer();
                            }
                        }
                        sendMessage(obtainMessage(1));
                    }
                    VideoFrameInternal videoFrameInternal = new VideoFrameInternal(videoFrame, j10);
                    if (!this.renderFrames.add(videoFrameInternal)) {
                        Logging.e(EglRenderer.TAG, "offer error ");
                    } else if (videoFrameInternal.frame.getAlphaBuffer() != null) {
                        videoFrameInternal.frame.retainAlphaBuffer();
                    }
                    EglRenderer eglRenderer = this.weakRenderer.get();
                    if (eglRenderer != null && !eglRenderer.isVsyncCallbackStared) {
                        sendMessage(obtainMessage(2));
                    }
                    if (EglRenderer.DEBUG && (videoFrame.getBuffer() instanceof TextureBuffer) && this.weakRenderer.get() != null) {
                        Logging.d(EglRenderer.TAG, "offer texture id:" + ((VideoFrame.TextureBuffer) videoFrameInternal.frame.getBuffer()).getTextureId() + " queue size: " + this.renderFrames.size());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void sendLastFrameToRenderThread(long j10) {
            EglRenderer eglRenderer = this.weakRenderer.get();
            synchronized (this.queueLock) {
                try {
                    if (EglRenderer.ENABLE_LAST_FRAME && eglRenderer != null) {
                        if (!this.renderFrames.add(new VideoFrameInternal(eglRenderer.lastFrame, j10))) {
                            Logging.e(EglRenderer.TAG, "sendLastFrameToRenderThread offer error ");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void sendStopChoreographer() {
            sendMessage(obtainMessage(0));
        }

        public void trigToRenderFrame() {
            EglRenderer eglRenderer = this.weakRenderer.get();
            if (eglRenderer == null) {
                Logging.e(EglRenderer.TAG, "trigToRenderFrame failed: weak is null");
            } else {
                if (eglRenderer.isVsyncCallbackStared) {
                    return;
                }
                sendMessage(obtainMessage(2));
            }
        }
    }

    public class StatisticsInfo {
        private long statisticsStartTimeNs = 0;
        private long framesReceived = 0;
        private long framesDropped = 0;
        private long framesRendered = 0;
        private long framesDrawTimeNs = 0;
        private long renderTimeNs = 0;
        private long renderSwapBufferTimeNs = 0;
        private int frameDrawn = 0;
        private Object statisticsLock = new Object();
        private long vsyncNum = 0;
        private long vsyncRenderJankCount = 0;

        public StatisticsInfo() {
        }

        private String averageTimeAsString(long j10, long j11) {
            if (j11 <= 0) {
                return "NA";
            }
            return TimeUnit.NANOSECONDS.toMicros(j10 / j11) + " us";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void logStatistics() {
            DecimalFormat decimalFormat = new DecimalFormat("#.0");
            long nanoTime = System.nanoTime();
            synchronized (this.statisticsLock) {
                try {
                    long j10 = nanoTime - this.statisticsStartTimeNs;
                    if (j10 <= 0) {
                        return;
                    }
                    long j11 = this.framesRendered;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    float f10 = j10;
                    float nanos = (j11 * timeUnit.toNanos(1L)) / f10;
                    float nanos2 = (this.framesReceived * timeUnit.toNanos(1L)) / f10;
                    EglRenderer.this.logI("logStatistics Duration: " + TimeUnit.NANOSECONDS.toMillis(j10) + " ms. Frames received: " + this.framesReceived + ". Dropped: " + this.framesDropped + ". Rendered: " + this.framesRendered + ". vsync jank:" + this.vsyncRenderJankCount + ". received fps: " + decimalFormat.format(nanos2) + ". Render fps: " + decimalFormat.format(nanos) + ". Average frame draw time: " + averageTimeAsString(this.framesDrawTimeNs, this.framesRendered) + ". Average render time: " + averageTimeAsString(this.renderTimeNs, this.framesRendered) + ". Average swapBuffer time: " + averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered) + ".");
                    resetStatistics(nanoTime);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void resetStatistics(long j10) {
            synchronized (this.statisticsLock) {
                this.statisticsStartTimeNs = j10;
                this.framesReceived = 0L;
                this.framesDropped = 0L;
                this.framesRendered = 0L;
                this.framesDrawTimeNs = 0L;
                this.renderTimeNs = 0L;
                this.renderSwapBufferTimeNs = 0L;
                this.vsyncRenderJankCount = 0L;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateEveryVsyncStatistics(VsyncStats vsyncStats, boolean z10, long j10, long j11) {
            synchronized (this.statisticsLock) {
                try {
                    if (vsyncStats != VsyncStats.NORMAL) {
                        if (EglRenderer.DEBUG) {
                            Logging.d(EglRenderer.TAG, "Missed vsync by " + (j11 * 1.0E-6f) + " ms which skip " + j10 + " is a jank");
                        }
                        if (z10) {
                            j10--;
                        }
                        this.vsyncRenderJankCount += j10;
                    } else if (!z10) {
                        if (EglRenderer.DEBUG) {
                            Logging.d(EglRenderer.TAG, "drawn no frame in last vsync ,is a jank");
                        }
                        this.vsyncRenderJankCount++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateFrameReceived() {
            synchronized (this.statisticsLock) {
                this.framesReceived++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateFramesDropped() {
            synchronized (this.statisticsLock) {
                this.framesDropped++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateFramesHasDrawn(long j10, long j11, long j12, long j13) {
            synchronized (this.statisticsLock) {
                this.framesRendered++;
                this.framesDrawTimeNs += j10 - j11;
                this.renderTimeNs += j10 - j12;
                this.renderSwapBufferTimeNs += j10 - j13;
                this.frameDrawn++;
            }
        }
    }

    public static class VideoFrameInternal {
        public VideoFrame frame;
        public long frameDrawStartTimeNs;

        public VideoFrameInternal(VideoFrame videoFrame, long j10) {
            this.frame = videoFrame;
            this.frameDrawStartTimeNs = j10;
        }
    }

    public enum VsyncStats {
        NORMAL,
        DELAY
    }

    public EglRenderer(String str) {
        this.name = str;
    }

    public static float[] DoConvertRectFromAndroidGraphicsRect(Rect rect, VideoFrame videoFrame, boolean z10) {
        float rotatedHeight;
        float rotatedHeight2;
        float rotatedWidth;
        float f10;
        int rotatedWidth2;
        float f11;
        int rotatedWidth3;
        float f12;
        float rotatedWidth4;
        float f13;
        int rotatedWidth5;
        float f14;
        int rotatedWidth6;
        float f15;
        int rotation = videoFrame.getRotation() % 360;
        if (rotation != 0) {
            if (rotation == 90) {
                rotatedHeight = rect.top / videoFrame.getRotatedHeight();
                rotatedHeight2 = rect.bottom / videoFrame.getRotatedHeight();
                if (z10) {
                    rotatedWidth4 = 1.0f - (rect.left / videoFrame.getRotatedWidth());
                    f14 = rect.right;
                    rotatedWidth6 = videoFrame.getRotatedWidth();
                    f15 = 1.0f - (f14 / rotatedWidth6);
                } else {
                    rotatedWidth4 = rect.right / videoFrame.getRotatedWidth();
                    f13 = rect.left;
                    rotatedWidth5 = videoFrame.getRotatedWidth();
                    f15 = f13 / rotatedWidth5;
                }
            } else if (rotation == 180) {
                rotatedHeight = 1.0f - (rect.top / videoFrame.getRotatedHeight());
                rotatedHeight2 = 1.0f - (rect.bottom / videoFrame.getRotatedHeight());
                if (z10) {
                    rotatedWidth4 = rect.right / videoFrame.getRotatedWidth();
                    f13 = rect.left;
                    rotatedWidth5 = videoFrame.getRotatedWidth();
                    f15 = f13 / rotatedWidth5;
                } else {
                    rotatedWidth4 = 1.0f - (rect.left / videoFrame.getRotatedWidth());
                    f14 = rect.right;
                    rotatedWidth6 = videoFrame.getRotatedWidth();
                    f15 = 1.0f - (f14 / rotatedWidth6);
                }
            } else if (rotation != 270) {
                rotatedWidth = 0.0f;
                rotatedHeight2 = 0.0f;
                f12 = 1.0f;
                rotatedHeight = 1.0f;
            } else {
                rotatedHeight = 1.0f - (rect.top / videoFrame.getRotatedHeight());
                rotatedHeight2 = 1.0f - (rect.bottom / videoFrame.getRotatedHeight());
                if (z10) {
                    rotatedWidth = rect.left / videoFrame.getRotatedWidth();
                    f10 = rect.right;
                    rotatedWidth2 = videoFrame.getRotatedWidth();
                    f12 = f10 / rotatedWidth2;
                } else {
                    rotatedWidth = 1.0f - (rect.right / videoFrame.getRotatedWidth());
                    f11 = rect.left;
                    rotatedWidth3 = videoFrame.getRotatedWidth();
                    f12 = 1.0f - (f11 / rotatedWidth3);
                }
            }
            float f16 = rotatedWidth4;
            rotatedWidth = f15;
            f12 = f16;
        } else {
            rotatedHeight = 1.0f - (rect.top / videoFrame.getRotatedHeight());
            rotatedHeight2 = 1.0f - (rect.bottom / videoFrame.getRotatedHeight());
            if (z10) {
                rotatedWidth = 1.0f - (rect.right / videoFrame.getRotatedWidth());
                f11 = rect.left;
                rotatedWidth3 = videoFrame.getRotatedWidth();
                f12 = 1.0f - (f11 / rotatedWidth3);
            } else {
                rotatedWidth = rect.left / videoFrame.getRotatedWidth();
                f10 = rect.right;
                rotatedWidth2 = videoFrame.getRotatedWidth();
                f12 = f10 / rotatedWidth2;
            }
        }
        if (f12 > 1.0f) {
            f12 = 1.0f;
        }
        if (rotatedHeight2 > 1.0f) {
            rotatedHeight2 = 1.0f;
        }
        if (rotatedHeight > 1.0f) {
            rotatedHeight = 1.0f;
        }
        float f17 = rotatedWidth <= 1.0f ? rotatedWidth : 1.0f;
        return new float[]{f17, rotatedHeight2, f12, rotatedHeight2, f17, rotatedHeight, f12, rotatedHeight};
    }

    private void checkHDR() {
        VideoRenderUtils.isSupportedHDRByType(2);
        VideoRenderUtils.getDesiredMaxAverageLuminance();
        VideoRenderUtils.getDesiredMaxLuminance();
        VideoRenderUtils.getDesiredMinLuminance();
        VideoRenderUtils.isWideColorGamut();
        VideoRenderUtils.getPreferredWideGamutColorSpaceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkSurfaceValid() {
        boolean z10;
        synchronized (this.surfaceLock) {
            z10 = this.surfaceValid;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSurfaceOnRenderThread(float f10, float f11, float f12, float f13) {
        EglBase eglBase = this.eglBase;
        if (eglBase == null || !eglBase.hasSurface()) {
            return;
        }
        logI("clearSurface");
        GLES20.glClearColor(f10, f11, f12, f13);
        GLES20.glClear(16384);
        this.eglBase.swapBuffers();
    }

    private float[] convertRectFromAndroidGraphicsRect(Rect rect, VideoFrame videoFrame) {
        float[] DoConvertRectFromAndroidGraphicsRect = DoConvertRectFromAndroidGraphicsRect(rect, videoFrame, this.mirror);
        logI("rotation " + (videoFrame.getRotation() % 360) + " mirror " + this.mirror + " left " + DoConvertRectFromAndroidGraphicsRect[0] + " right " + DoConvertRectFromAndroidGraphicsRect[2] + " top " + DoConvertRectFromAndroidGraphicsRect[5] + " bottom " + DoConvertRectFromAndroidGraphicsRect[1]);
        return DoConvertRectFromAndroidGraphicsRect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        if (r5.mirror != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        r0 = 1.0f - r2;
        r2 = 1.0f - r7;
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (r5.mirror != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r5.mirror != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        if (r5.mirror != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private float[] convertRectFromAndroidGraphicsRectForHiddenMode(float f10, float f11, Rect rect, VideoFrame videoFrame) {
        int i10 = rect.bottom - rect.top;
        int i11 = rect.right - rect.left;
        if (f11 > f10) {
            i11 = (int) (i10 * f10);
        } else {
            i10 = (int) (i11 / f10);
        }
        int i12 = i11 / 2;
        float rotatedWidth = ((((r2 + r1) / 2) - i12) * 1.0f) / videoFrame.getRotatedWidth();
        float rotatedWidth2 = ((((rect.right + rect.left) / 2) + i12) * 1.0f) / videoFrame.getRotatedWidth();
        int i13 = i10 / 2;
        float rotatedHeight = ((((rect.top + rect.bottom) / 2) - i13) * 1.0f) / videoFrame.getRotatedHeight();
        float rotatedHeight2 = ((((rect.top + rect.bottom) / 2) + i13) * 1.0f) / videoFrame.getRotatedHeight();
        int rotation = videoFrame.getRotation() % 360;
        if (rotation == 0) {
            rotatedHeight = 1.0f - rotatedHeight;
            rotatedHeight2 = 1.0f - rotatedHeight2;
        } else if (rotation == 90) {
            rotatedHeight = 1.0f - rotatedHeight;
            rotatedHeight2 = 1.0f - rotatedHeight2;
        } else if (rotation == 180) {
            rotatedHeight = 1.0f - rotatedHeight;
            rotatedHeight2 = 1.0f - rotatedHeight2;
        } else if (rotation == 270) {
            rotatedHeight = 1.0f - rotatedHeight;
            rotatedHeight2 = 1.0f - rotatedHeight2;
        }
        if (rotatedWidth2 > 1.0f) {
            rotatedWidth2 = 1.0f;
        }
        if (rotatedHeight2 > 1.0f) {
            rotatedHeight2 = 1.0f;
        }
        if (rotatedHeight > 1.0f) {
            rotatedHeight = 1.0f;
        }
        float f12 = rotatedWidth <= 1.0f ? rotatedWidth : 1.0f;
        logI("hidden mode: rotation " + (videoFrame.getRotation() % 360) + " mirror " + this.mirror + " left " + f12 + " right " + rotatedWidth2 + " top " + rotatedHeight + " bottom " + rotatedHeight2 + "frame texture type: " + (videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer));
        return new float[]{f12, rotatedHeight2, rotatedWidth2, rotatedHeight2, f12, rotatedHeight, rotatedWidth2, rotatedHeight};
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        synchronized (this.surfaceLock) {
            this.surfaceValid = true;
        }
        postToRenderThread(this.eglSurfaceCreationRunnable);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    ((HandlerWithFrameSyncControl) handler).trigToRenderFrame();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doLut10Frame(byte[] bArr) {
        if (this.renderThreadHandler == null) {
            logD("Lut10Frame failed, Already released");
        } else if (this.drawer != null) {
            this.islut10Update = true;
            this.frameDrawer.doLut10Frame(this.drawer, bArr);
        }
    }

    public static double getDefaultDisplayRefreshRateParams() {
        WindowManager windowManager;
        Display defaultDisplay;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (windowManager = (WindowManager) applicationContext.getApplicationContext().getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 0.0d;
        }
        return defaultDisplay.getRefreshRate();
    }

    private void logD(String str) {
        Logging.d(TAG, this.name + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logI(String str) {
        Logging.i(TAG, this.name + str);
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z10) {
        if (this.frameListeners.isEmpty()) {
            return;
        }
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        if (this.mirror) {
            this.drawMatrix.preScale(-1.0f, 1.0f);
        }
        this.drawMatrix.preScale(1.0f, -1.0f);
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            FrameListenerAndParams next = it.next();
            if (z10 || !next.applyFpsReduction) {
                it.remove();
                int rotatedWidth = (int) (next.scale * videoFrame.getRotatedWidth());
                int rotatedHeight = (int) (next.scale * videoFrame.getRotatedHeight());
                ByteBuffer byteBuffer = null;
                if (rotatedWidth == 0 || rotatedHeight == 0) {
                    next.listener.onFrame(null);
                } else {
                    this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                    GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                    Color color = this.backgroudColor;
                    GLES20.glClearColor(color.red, color.green, color.blue, color.alpha);
                    GLES20.glClear(16384);
                    this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight, false);
                    try {
                        byteBuffer = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                    } catch (IllegalArgumentException e10) {
                        e10.printStackTrace();
                    }
                    GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                    GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, byteBuffer);
                    GLES20.glBindFramebuffer(36160, 0);
                    GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(byteBuffer);
                        next.listener.onFrame(createBitmap);
                    } catch (IllegalArgumentException e11) {
                        e11.printStackTrace();
                    } catch (IllegalStateException e12) {
                        e12.printStackTrace();
                    }
                }
            }
        }
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.post(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderFrameOnRenderThread(VideoFrameInternal videoFrameInternal, long j10) {
        boolean z10;
        float f10;
        int i10;
        int i11;
        int i12;
        float f11;
        int i13;
        int i14;
        int i15;
        float f12;
        int i16;
        int i17;
        boolean z11;
        float f13;
        float f14;
        if (this.renderThreadHandler == null) {
            logI("renderFrameOnRenderThread failed, Already released");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (videoFrameInternal == null) {
            return;
        }
        VideoFrame videoFrame = videoFrameInternal.frame;
        EglBase eglBase = this.eglBase;
        if (eglBase == null || !eglBase.hasSurface() || this.isReleasing) {
            logI("Dropping frame - No Surface");
            videoFrame.release();
            return;
        }
        synchronized (this.surfaceLock) {
            try {
                if (!this.surfaceValid) {
                    logI("Dropping frame - surface not valid");
                    videoFrame.release();
                    return;
                }
                if (ENABLE_LAST_FRAME) {
                    VideoFrame videoFrame2 = this.lastFrame;
                    if (videoFrame2 != null && videoFrame2 != videoFrame) {
                        videoFrame2.release();
                    }
                    this.lastFrame = videoFrame;
                    videoFrame.retain();
                }
                synchronized (this.fpsReductionLock) {
                    try {
                        long j11 = this.minRenderPeriodNs;
                        if (j11 != LongCompanionObject.MAX_VALUE) {
                            if (j11 > 0) {
                                long nanoTime = System.nanoTime();
                                long j12 = this.nextFrameTimeNs;
                                if (nanoTime < j12) {
                                    logI("Skipping frame rendering - fps reduction is active.");
                                } else {
                                    long j13 = j12 + this.minRenderPeriodNs;
                                    this.nextFrameTimeNs = j13;
                                    this.nextFrameTimeNs = Math.max(j13, nanoTime);
                                }
                            }
                            z10 = true;
                        }
                        z10 = false;
                    } finally {
                    }
                }
                long nanoTime2 = System.nanoTime();
                float sampleAspectRatio = videoFrame.getSampleAspectRatio();
                if (sampleAspectRatio == 1.0f || sampleAspectRatio <= 0.0f) {
                    sampleAspectRatio = 1.0f;
                }
                float rotatedWidth = (videoFrame.getRotatedWidth() / videoFrame.getRotatedHeight()) * sampleAspectRatio;
                if (this.rect != null) {
                    videoFrame.getRotation();
                    Rect rect = this.rect;
                    int i18 = rect.right - rect.left;
                    int i19 = rect.bottom - rect.top;
                    if (i18 <= videoFrame.getRotatedWidth() && i19 <= videoFrame.getRotatedHeight()) {
                        rotatedWidth = i18 / i19;
                    }
                    if (this.lastVideoFrameHeight != videoFrame.getRotatedHeight() || this.lastVideoFrameWidth != videoFrame.getRotatedWidth()) {
                        this.textureCoordUpdate = true;
                        this.lastVideoFrameWidth = videoFrame.getRotatedWidth();
                        this.lastVideoFrameHeight = videoFrame.getRotatedHeight();
                    }
                }
                synchronized (this.layoutLock) {
                    try {
                        float f15 = this.viewHeight;
                        f10 = f15 > 0.0f ? this.viewWidth / f15 : 0.0f;
                        if (f10 == 0.0f) {
                            f10 = rotatedWidth;
                        }
                    } finally {
                    }
                }
                int surfaceWidth = this.eglBase.surfaceWidth();
                int surfaceHeight = this.eglBase.surfaceHeight();
                int i20 = this.renderMode;
                if (i20 == 1) {
                    if (this.rect != null) {
                        f13 = 1.0f;
                        f14 = 1.0f;
                    } else if (rotatedWidth > f10) {
                        f13 = f10 / rotatedWidth;
                        f14 = 1.0f;
                    } else {
                        f14 = rotatedWidth / f10;
                        f13 = 1.0f;
                    }
                    i14 = surfaceHeight;
                    f11 = f14;
                    i13 = 0;
                    i15 = surfaceWidth;
                    f12 = f13;
                    i11 = 0;
                } else {
                    if (i20 == 10) {
                        if (rotatedWidth > f10) {
                            i17 = (int) (((1.0f - (f10 / rotatedWidth)) * surfaceHeight) / 2.0f);
                            i16 = 0;
                        } else {
                            i16 = (int) (((1.0f - (rotatedWidth / f10)) * surfaceWidth) / 2.0f);
                            i17 = 0;
                        }
                        i12 = surfaceWidth - (i16 * 2);
                        i14 = surfaceHeight - (i17 * 2);
                        f11 = 1.0f;
                        i13 = i16;
                        i11 = surfaceHeight - i14;
                    } else {
                        if (rotatedWidth > f10) {
                            i11 = (int) (((1.0f - (f10 / rotatedWidth)) * surfaceHeight) / 2.0f);
                            i10 = 0;
                        } else {
                            i10 = (int) (((1.0f - (rotatedWidth / f10)) * surfaceWidth) / 2.0f);
                            i11 = 0;
                        }
                        i12 = surfaceWidth - (i10 * 2);
                        f11 = 1.0f;
                        i13 = i10;
                        i14 = surfaceHeight - (i11 * 2);
                    }
                    i15 = i12;
                    f12 = f11;
                }
                this.drawMatrix.reset();
                this.drawMatrix.preTranslate(0.5f, 0.5f);
                if (this.mirror) {
                    this.drawMatrix.preScale(-1.0f, 1.0f);
                }
                this.drawMatrix.preScale(f12, f11);
                this.drawMatrix.preTranslate(-0.5f, -0.5f);
                if (this.rect == null || !this.textureCoordUpdate) {
                    z11 = false;
                } else {
                    z11 = false;
                    this.textureCoordUpdate = false;
                    int i21 = this.renderMode;
                    if (i21 == 2 || i21 == 10) {
                        this.drawer.setTextureCropCoord(GlUtil.createFloatBuffer(convertRectFromAndroidGraphicsRect(this.rect, videoFrame)));
                    } else {
                        this.drawer.setTextureCropCoord(GlUtil.createFloatBuffer(convertRectFromAndroidGraphicsRectForHiddenMode(f10, rotatedWidth, this.rect, videoFrame)));
                    }
                }
                if (!this.islut10Update && HdrUtil.isNeedHdrSdrTrans(this.transferID)) {
                    Logging.i(TAG, "doLut10Frame getTransfer: " + videoFrame.getColorSpace().getTransfer().getTransfer());
                    byte[] nativeGetLut10Buffer = HdrUtil.nativeGetLut10Buffer(videoFrame.getColorSpace().getTransfer().getTransfer(), videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer);
                    if (nativeGetLut10Buffer != null && nativeGetLut10Buffer.length != 0) {
                        doLut10Frame(nativeGetLut10Buffer);
                    }
                }
                if (z10) {
                    GLES20.glClear(16384);
                    boolean z12 = videoFrame.getAlphaStitchMode() != AlphaStitchMode.ALPHA_NO_STITCH.value() ? true : z11;
                    boolean z13 = this.enableAlphaMask;
                    if (z13) {
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                        GLES20.glEnable(3042);
                        GLES20.glBlendFuncSeparate(770, 771, z12 ? 770 : 1, 771);
                    } else {
                        Color color = this.backgroudColor;
                        GLES20.glClearColor(color.red, color.green, color.blue, color.alpha);
                    }
                    if (DEBUG && (videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer)) {
                        Logging.d(TAG, "render texture id:" + ((VideoFrame.TextureBuffer) videoFrame.getBuffer()).getTextureId() + " render fenceObject:" + ((VideoFrame.TextureBuffer) videoFrame.getBuffer()).getFenceObject());
                    }
                    this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, i13, i11, i15, i14, this.enableAlphaMask);
                    if (z13) {
                        GLES20.glDisable(3042);
                    }
                    long nanoTime3 = System.nanoTime();
                    EglBase eglBase2 = this.eglBase;
                    if ((eglBase2 instanceof EglBase14) && this.isVsyncCallbackStared) {
                        ((EglBase14) eglBase2).setPresentationTime(j10 + this.frameIntervalNanos);
                    }
                    this.eglBase.swapBuffers();
                    long nanoTime4 = System.nanoTime();
                    this.statisticsInfo.updateFramesHasDrawn(nanoTime4, videoFrameInternal.frameDrawStartTimeNs, nanoTime2, nanoTime3);
                    if (this.rendererEvents != null) {
                        ColorSpace renderedColorSpace = this.frameDrawer.renderedColorSpace();
                        int range = ColorSpace.Range.Invalid.getRange();
                        int matrix = ColorSpace.Matrix.Unspecified.getMatrix();
                        int transfer = ColorSpace.Transfer.Unspecified.getTransfer();
                        int primary = ColorSpace.Primary.Unspecified.getPrimary();
                        if (renderedColorSpace != null) {
                            range = renderedColorSpace.getRange().getRange();
                            matrix = renderedColorSpace.getMatrix().getMatrix();
                            transfer = renderedColorSpace.getTransfer().getTransfer();
                            primary = renderedColorSpace.getPrimary().getPrimary();
                        }
                        this.rendererEvents.onFrameDrawn(videoFrame.getTimestampNs() / 1000000, (nanoTime4 - videoFrameInternal.frameDrawStartTimeNs) / 1000000, range, matrix, transfer, primary);
                    }
                    if (!this.isFirstFrameRendered) {
                        this.isFirstFrameRendered = true;
                        logI("Reporting first rendered frame.");
                        if (this.rendererEvents != null && videoFrame.getBuffer() != null) {
                            this.rendererEvents.onFirstFrameRendered(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                        }
                    }
                }
                notifyCallbacks(videoFrame, z10);
                videoFrame.release();
                if (DEBUG) {
                    Logging.d(TAG, "renderFrameOnRenderThread end: " + (System.currentTimeMillis() - currentTimeMillis) + " vsyncNum:" + this.statisticsInfo.vsyncNum + " costFromCpp:" + (System.currentTimeMillis() - videoFrame.getRenderStartTimeMs()) + "ms");
                }
            } finally {
            }
        }
    }

    public void addFrameListener(FrameListener frameListener, float f10) {
        addFrameListener(frameListener, f10, null, false);
    }

    public void clearImage() {
        Color color = this.backgroudColor;
        clearImage(color.red, color.green, color.blue, color.alpha);
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void enableAlphaMask(boolean z10) {
        logI("enableAlphaMask: " + z10);
        if (this.enableAlphaMask != z10) {
            this.enableAlphaMask = z10;
        }
    }

    public int getFrameDrawn() {
        return this.statisticsInfo.frameDrawn;
    }

    public void init(final EglBase.Context context, int i10, RendererCommon.GlDrawer glDrawer, boolean z10) {
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler != null) {
                    throw new IllegalStateException(this.name + "Already initialized");
                }
                logI("Initializing EglRenderer");
                this.drawer = glDrawer;
                this.isReleasing = false;
                this.islut10Update = false;
                this.transferID = i10;
                HandlerThread handlerThread = new HandlerThread(this.name + TAG);
                handlerThread.start();
                HandlerWithFrameSyncControl handlerWithFrameSyncControl = new HandlerWithFrameSyncControl(handlerThread.getLooper(), new Runnable() { // from class: io.agora.base.internal.video.EglRenderer.2
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (EglRenderer.this.surfaceLock) {
                            EglRenderer.this.logI("Initializing EglRenderer set surfaceValid.");
                            EglRenderer.this.surfaceValid = false;
                        }
                    }
                }, this);
                this.renderThreadHandler = handlerWithFrameSyncControl;
                ThreadUtils.invokeAtFrontUninterruptibly(handlerWithFrameSyncControl, new Runnable() { // from class: io.agora.base.internal.video.EglRenderer.3
                    @Override // java.lang.Runnable
                    public void run() {
                        int i11 = EglRenderer.this.transferID;
                        if (context == null) {
                            EglRenderer.this.logI("EglBase10.create context, transfer: " + i11);
                            EglRenderer eglRenderer = EglRenderer.this;
                            eglRenderer.eglBase = EglBaseFactory.createEgl10(i11, true, eglRenderer.enableAlphaMask ? EglBase.EglConfigType.CONFIG_RGBA_TYPE : EglBase.EglConfigType.CONFIG_PLAIN_TYPE);
                        } else {
                            EglRenderer.this.logI("EglBase.create shared context, transfer: " + i11);
                            EglRenderer eglRenderer2 = EglRenderer.this;
                            eglRenderer2.eglBase = EglBaseFactory.create(context, i11, true, eglRenderer2.enableAlphaMask ? EglBase.EglConfigType.CONFIG_RGBA_TYPE : EglBase.EglConfigType.CONFIG_PLAIN_TYPE);
                        }
                        EglRenderer eglRenderer3 = EglRenderer.this;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Frame Buffer Type:");
                        sb2.append(HdrUtil.is10BitLumaDepth(EglRenderer.this.transferID) ? "10" : "8");
                        sb2.append(", HDR capbility:");
                        sb2.append(HdrUtil.isBt2020PqExtensionSupported() && HdrUtil.isScreenSupportHdrVision());
                        sb2.append(", HDR SDR transform type:");
                        sb2.append(HdrUtil.nativeHdrSdrTransform());
                        eglRenderer3.logI(sb2.toString());
                    }
                });
                this.switchToStartVsync = z10;
                logI("renderThreadHandler useVsync:" + z10);
                if (this.switchToStartVsync) {
                    this.renderThreadHandler.post(new Runnable() { // from class: io.agora.base.internal.video.EglRenderer.4
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                Choreographer.getInstance().postFrameCallback((Choreographer.FrameCallback) EglRenderer.this.renderThreadHandler);
                                EglRenderer.this.logI("renderThreadHandler Choreographer start");
                            } catch (Exception e10) {
                                Logging.e(EglRenderer.TAG, "Exception on Choreographer start and not use vsync to render", e10);
                            }
                        }
                    });
                } else {
                    logI("renderThreadHandler Choreographer disable");
                }
                this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
                this.renderThreadHandler.post(new Runnable() { // from class: io.agora.base.internal.video.EglRenderer.5
                    @Override // java.lang.Runnable
                    public void run() {
                        double defaultDisplayRefreshRateParams = EglRenderer.getDefaultDisplayRefreshRateParams();
                        if (defaultDisplayRefreshRateParams != 0.0d) {
                            EglRenderer.this.frameIntervalNanos = new Double(1.0E9d / defaultDisplayRefreshRateParams).longValue();
                        } else {
                            EglRenderer.this.frameIntervalNanos = EglRenderer.DEFAULT_FRAME_INTERVAL_NANOS;
                        }
                    }
                });
                this.statisticsInfo.resetStatistics(System.nanoTime());
                this.renderThreadHandler.postDelayed(this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(LOG_INTERVAL_SEC));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void isRenderOnSurfaceView(boolean z10) {
        this.isRenderOnSurfaceView = z10;
    }

    public void notifySurfaceSizeChanged() {
        this.textureCoordUpdate = true;
        if (ENABLE_LAST_FRAME) {
            synchronized (this.handlerLock) {
                try {
                    if (this.renderThreadHandler == null) {
                        logI("notifySurfaceSizeChanged ");
                        return;
                    }
                    if (this.lastFrame != null) {
                        ((HandlerWithFrameSyncControl) this.renderThreadHandler).sendLastFrameToRenderThread(System.nanoTime());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // io.agora.base.internal.video.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        this.statisticsInfo.updateFrameReceived();
        long nanoTime = System.nanoTime();
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    logI("Dropping frame - Not initialized or already released.");
                } else {
                    ((HandlerWithFrameSyncControl) handler).sendFrameToRenderThread(nanoTime, videoFrame);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public void printStackTrace() {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                Thread thread = handler == null ? null : handler.getLooper().getThread();
                if (thread != null) {
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    if (stackTrace.length > 0) {
                        logI("EglRenderer stack trace:");
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            logI(stackTraceElement.toString());
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void release() {
        VideoFrame videoFrame;
        logI("Releasing.");
        this.isReleasing = true;
        this.islut10Update = true;
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    logI("Already released");
                    return;
                }
                handler.removeCallbacks(this.logStatisticsRunnable);
                try {
                    ThreadUtils.invokeAtFrontUninterruptibly(this.renderThreadHandler, 1000L, new Callable<Void>() { // from class: io.agora.base.internal.video.EglRenderer.6
                        @Override // java.util.concurrent.Callable
                        public Void call() {
                            EglRenderer.this.logI("release egl and gl resources on render thread");
                            if (!EglRenderer.this.eglContextAttached && EglRenderer.this.eglBase != null && !EglRenderer.this.eglBase.hasSurface()) {
                                EglRenderer.this.logI("egl context not attached, make current to release gl resource");
                                try {
                                    EglRenderer.this.eglBase.createDummyPbufferSurface();
                                    EglRenderer.this.eglBase.makeCurrent();
                                    EglRenderer.this.eglContextAttached = true;
                                } catch (RuntimeException e10) {
                                    EglRenderer.this.logI("failed to make current: " + e10);
                                }
                            }
                            synchronized (EglBase.lock) {
                                GLES20.glUseProgram(0);
                            }
                            if (EglRenderer.this.drawer != null) {
                                EglRenderer.this.drawer.release();
                                EglRenderer.this.drawer = null;
                            }
                            EglRenderer.this.frameDrawer.release();
                            EglRenderer.this.bitmapTextureFramebuffer.release();
                            if (EglRenderer.this.eglBase != null) {
                                EglRenderer.this.logI("eglBase detach and release.");
                                EglRenderer.this.eglBase.detachCurrent();
                                EglRenderer.this.eglContextAttached = false;
                                EglRenderer.this.eglBase.release();
                                EglRenderer.this.eglBase = null;
                            }
                            EglRenderer.this.frameListeners.clear();
                            return null;
                        }
                    });
                } catch (Exception e10) {
                    logI("failed to make current and detach: " + e10);
                }
                ((HandlerWithFrameSyncControl) this.renderThreadHandler).sendStopChoreographer();
                this.renderThreadHandler.getLooper().quitSafely();
                this.renderThreadHandler = null;
                this.isVsyncCallbackStared = false;
                if (ENABLE_LAST_FRAME && (videoFrame = this.lastFrame) != null) {
                    videoFrame.release();
                    this.lastFrame = null;
                }
                logI("Releasing done.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void releaseEglSurface() {
        logI("releaseEglSurface");
        synchronized (this.surfaceLock) {
            this.surfaceValid = false;
        }
        logI("release surface");
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                    logI("releaseEglSurface call");
                    ThreadUtils.invokeAtFrontUninterruptibly(this.renderThreadHandler, 1000L, new Callable<Void>() { // from class: io.agora.base.internal.video.EglRenderer.10
                        @Override // java.util.concurrent.Callable
                        public Void call() {
                            EglRenderer.this.logI("detach egl context and release egl surface");
                            if (EglRenderer.this.eglContextAttached && EglRenderer.this.eglBase != null) {
                                EglRenderer.this.eglBase.detachCurrent();
                                EglRenderer.this.eglContextAttached = false;
                                EglRenderer.this.eglBase.releaseSurface();
                            }
                            EglRenderer.this.logI("releaseEglSurface in renderThread done.");
                            return null;
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void removeFrameListener(final FrameListener frameListener) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    return;
                }
                if (Thread.currentThread() == this.renderThreadHandler.getLooper().getThread()) {
                    throw new RuntimeException("removeFrameListener must not be called on the render thread.");
                }
                postToRenderThread(new Runnable() { // from class: io.agora.base.internal.video.EglRenderer.9
                    @Override // java.lang.Runnable
                    public void run() {
                        countDownLatch.countDown();
                        Iterator it = EglRenderer.this.frameListeners.iterator();
                        while (it.hasNext()) {
                            if (((FrameListenerAndParams) it.next()).listener == frameListener) {
                                it.remove();
                            }
                        }
                    }
                });
                ThreadUtils.awaitUninterruptibly(countDownLatch);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void resetFirstFrameFlag() {
        this.isFirstFrameRendered = false;
    }

    public void setBackgroundColor(int i10) {
        logI("setBackgroundColor" + Integer.toHexString(i10));
        this.backgroudColor = new Color(i10);
    }

    public void setFpsReduction(float f10) {
        logI("setFpsReduction: " + f10);
        synchronized (this.fpsReductionLock) {
            try {
                long j10 = this.minRenderPeriodNs;
                if (f10 <= 0.0f) {
                    this.minRenderPeriodNs = LongCompanionObject.MAX_VALUE;
                } else {
                    this.minRenderPeriodNs = (long) (TimeUnit.SECONDS.toNanos(1L) / f10);
                }
                if (this.minRenderPeriodNs != j10) {
                    this.nextFrameTimeNs = System.nanoTime();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setMirror(boolean z10) {
        logI("setMirror: " + z10);
        synchronized (this.layoutLock) {
            try {
                if (this.mirror != z10) {
                    this.mirror = z10;
                    this.textureCoordUpdate = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setRenderMode(int i10) {
        logI("setRenderMode: " + i10);
        synchronized (this.layoutLock) {
            this.renderMode = i10;
        }
    }

    public void setViewSize(float f10, float f11) {
        logI("setViewSize width: " + f10 + " height: " + f11);
        synchronized (this.layoutLock) {
            this.viewWidth = f10;
            this.viewHeight = f11;
        }
        this.textureCoordUpdate = true;
    }

    public void updateCropArea(Rect rect) {
        logI("updateCropArea: " + rect.toString());
        synchronized (this.layoutLock) {
            try {
                Rect rect2 = this.rect;
                if (rect2 == null) {
                    this.rect = rect;
                    this.textureCoordUpdate = true;
                } else if (rect2 != null && !rect2.equals(rect)) {
                    this.rect = rect;
                    this.textureCoordUpdate = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void updateVsyncDuration(final long j10) {
        Handler handler = this.renderThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: io.agora.base.internal.video.EglRenderer.7
                @Override // java.lang.Runnable
                public void run() {
                    EglRenderer.this.logI("update vsync duration, old:" + EglRenderer.this.frameIntervalNanos + " new:" + j10);
                    EglRenderer.this.frameIntervalNanos = j10;
                }
            });
        }
    }

    public void addFrameListener(FrameListener frameListener, float f10, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f10, glDrawer, false);
    }

    public void clearImage(final float f10, final float f11, final float f12, final float f13) {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    return;
                }
                handler.postAtFrontOfQueue(new Runnable() { // from class: io.agora.base.internal.video.EglRenderer.11
                    @Override // java.lang.Runnable
                    public void run() {
                        EglRenderer.this.clearSurfaceOnRenderThread(f10, f11, f12, f13);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public void addFrameListener(final FrameListener frameListener, final float f10, final RendererCommon.GlDrawer glDrawer, final boolean z10) {
        postToRenderThread(new Runnable() { // from class: io.agora.base.internal.video.EglRenderer.8
            @Override // java.lang.Runnable
            public void run() {
                RendererCommon.GlDrawer glDrawer2 = glDrawer;
                if (glDrawer2 == null) {
                    glDrawer2 = EglRenderer.this.drawer;
                }
                EglRenderer.this.frameListeners.add(new FrameListenerAndParams(frameListener, f10, glDrawer2, z10));
            }
        });
    }
}
