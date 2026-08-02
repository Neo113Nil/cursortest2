package io.agora.base.internal.video;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import io.agora.base.TextureBuffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.EglBase;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class TimerSurfaceTextureHelper implements ISurfaceTextureHelper {
    private static final int ANDROID_API_TEXTURE_IN_USE = 10;
    private static final int DEFAULT_MAX_BUFFER_COUNT = 4;
    private static final String TAG = "TSurfaceTextureHelper";
    private final VideoDecimator auxiliaryDecimator;
    private int dropFrameCount;
    private EglBase eglBase;
    private int frameRate;
    private int frameRotation;
    private final Handler handler;
    private boolean hasFrameRate;
    private boolean hasPendingTexture;
    private volatile boolean isOesTextureInUse;
    private boolean isQuitting;
    private boolean isTextureUpdatable;
    private VideoSink listener;
    private int notifyIntervalInMS;
    private final int oesTextureId;
    private VideoSink pendingListener;
    private volatile long prevTimeMillis;
    private final Handler proxyHandler;
    final Runnable scheduledExecutorRunnable;
    private ScheduledExecutorService scheduledService;
    final Runnable setListenerRunnable;

    @NonNull
    private final EglBase.Context sharedContext;
    private final boolean smoothCapture;
    final Runnable supplementRunnable;
    private final SurfaceTexture surfaceTexture;
    final Runnable systemGenerateRunnable;
    private final TextureBufferPool textureBufferPool;
    private int textureHeight;
    private int textureWidth;
    final Runnable timerNotifyRunnable;
    final Runnable timerRunnable;
    private final VideoDecimator videoDecimator;
    private final YuvConverter yuvConverter;

    public interface IVideoCapture extends VideoSink {
        void onFrameDropped(int i10);
    }

    public static TimerSurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, false, context, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSmoothCapture() {
        return this.smoothCapture || this.frameRate <= 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        }
        if (this.isOesTextureInUse || this.textureBufferPool.anyTextureInUse() || !this.isQuitting) {
            throw new IllegalStateException("Unexpected release.");
        }
        this.yuvConverter.release();
        this.textureBufferPool.dispose();
        GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
        this.surfaceTexture.release();
        this.eglBase.release();
        this.proxyHandler.getLooper().quit();
        this.handler.getLooper().quit();
        this.hasFrameRate = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void returnTextureFrame() {
        this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.15
            @Override // java.lang.Runnable
            public void run() {
                TimerSurfaceTextureHelper.this.isOesTextureInUse = false;
                if (!TimerSurfaceTextureHelper.this.isQuitting || TimerSurfaceTextureHelper.this.textureBufferPool.anyTextureInUse()) {
                    return;
                }
                TimerSurfaceTextureHelper.this.release();
            }
        });
    }

    @TargetApi(21)
    private static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tryDeliverTextureFrame() {
        int i10;
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        }
        if (this.isQuitting || this.listener == null) {
            return false;
        }
        if (this.isOesTextureInUse) {
            VideoSink videoSink = this.listener;
            if (videoSink instanceof IVideoCapture) {
                ((IVideoCapture) videoSink).onFrameDropped(10);
            }
            Logging.i(TAG, "frame Dropped texture in use. ");
            return true;
        }
        this.isOesTextureInUse = true;
        if (this.hasPendingTexture && this.isTextureUpdatable) {
            updateTexImage();
            this.hasPendingTexture = false;
        }
        float[] fArr = new float[16];
        this.surfaceTexture.getTransformMatrix(fArr);
        long nanoTime = System.nanoTime();
        int i11 = this.textureWidth;
        if (i11 == 0 || (i10 = this.textureHeight) == 0) {
            throw new RuntimeException("Texture size has not been set.");
        }
        if (this.dropFrameCount <= 0) {
            VideoFrame videoFrame = new VideoFrame(new TextureBuffer(this.sharedContext, i11, i10, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.17
                @Override // java.lang.Runnable
                public void run() {
                    TimerSurfaceTextureHelper.this.returnTextureFrame();
                }
            }, false), this.frameRotation, nanoTime);
            this.listener.onFrame(videoFrame);
            videoFrame.release();
            return true;
        }
        Logging.i(TAG, "frame Dropped for dropFrameCount > 0. dropFrameCount=" + this.dropFrameCount);
        this.dropFrameCount = this.dropFrameCount - 1;
        this.isOesTextureInUse = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTexImage() {
        try {
            synchronized (EglBase.lock) {
                this.surfaceTexture.updateTexImage();
            }
        } catch (Exception e10) {
            Logging.e(TAG, "failed to updateTexImage. " + e10.getMessage());
        }
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public void dispose() {
        Logging.i(TAG, "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.16
            @Override // java.lang.Runnable
            public void run() {
                TimerSurfaceTextureHelper.this.isQuitting = true;
                if (!TimerSurfaceTextureHelper.this.isOesTextureInUse && !TimerSurfaceTextureHelper.this.textureBufferPool.anyTextureInUse()) {
                    TimerSurfaceTextureHelper.this.release();
                    return;
                }
                Logging.i(TimerSurfaceTextureHelper.TAG, " not release yet, this: " + this + " isOesTextureInUse: " + TimerSurfaceTextureHelper.this.isOesTextureInUse);
            }
        });
    }

    public void executeSmoothCapture(int i10) {
        stopScheduledService();
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(4);
        this.scheduledService = newScheduledThreadPool;
        newScheduledThreadPool.scheduleAtFixedRate(this.scheduledExecutorRunnable, 0L, i10, TimeUnit.MILLISECONDS);
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public Handler getHandler() {
        return this.handler;
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public boolean isOesTextureInUse() {
        return this.isOesTextureInUse;
    }

    public void setFrameRate(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("invalid frame rate");
        }
        this.frameRate = i10;
        this.hasFrameRate = true;
        Logging.i(TAG, "setFrameRate frameRate:" + i10 + " smoothCapture: " + this.smoothCapture);
        if (isSmoothCapture()) {
            this.notifyIntervalInMS = (int) (1000.0f / ((float) Math.min(i10 + 3, i10 * 1.067d)));
            VideoDecimator videoDecimator = this.videoDecimator;
            if (videoDecimator != null) {
                videoDecimator.setTargetFramerate(i10);
            }
            VideoDecimator videoDecimator2 = this.auxiliaryDecimator;
            if (videoDecimator2 != null) {
                videoDecimator2.setTargetFramerate(i10);
            }
            Logging.i(TAG, "scheduledRunnable notifyIntervalInMS:" + this.notifyIntervalInMS);
            executeSmoothCapture(this.notifyIntervalInMS);
            return;
        }
        int i11 = i10 + 3;
        int i12 = i11 < 5 ? i11 : 5;
        if (i11 >= 15) {
            i12 = 15;
        }
        if (i11 >= 30) {
            i12 = 30;
        }
        float f10 = i12;
        this.notifyIntervalInMS = (int) (1000.0f / f10);
        VideoDecimator videoDecimator3 = this.videoDecimator;
        if (videoDecimator3 != null) {
            videoDecimator3.setTargetFramerate(i11);
        }
        VideoDecimator videoDecimator4 = this.auxiliaryDecimator;
        if (videoDecimator4 != null) {
            videoDecimator4.setTargetFramerate(f10);
        }
        this.proxyHandler.postDelayed(this.timerRunnable, this.notifyIntervalInMS);
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public void setFrameRotation(final int i10) {
        this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.14
            @Override // java.lang.Runnable
            public void run() {
                TimerSurfaceTextureHelper.this.frameRotation = i10;
            }
        });
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public void setTextureSize(final int i10, final int i11) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Texture width must be positive, but was " + i10);
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("Texture height must be positive, but was " + i11);
        }
        Logging.i(TAG, "setTextureSize textureWidth: " + i10 + " textureHeight: " + i11);
        this.surfaceTexture.setDefaultBufferSize(i10, i11);
        this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.13
            @Override // java.lang.Runnable
            public void run() {
                TimerSurfaceTextureHelper.this.textureWidth = i10;
                TimerSurfaceTextureHelper.this.textureHeight = i11;
            }
        });
    }

    public void setTextureUpdatable(final boolean z10, final int i10) {
        this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.10
            @Override // java.lang.Runnable
            public void run() {
                TimerSurfaceTextureHelper.this.isTextureUpdatable = z10;
                TimerSurfaceTextureHelper.this.dropFrameCount = i10;
            }
        });
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public void startListening(VideoSink videoSink) {
        if (this.listener != null || this.pendingListener != null) {
            throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
        }
        if (this.notifyIntervalInMS == 0) {
            throw new IllegalStateException("frame rate not set");
        }
        this.pendingListener = videoSink;
        this.handler.post(this.setListenerRunnable);
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public void stopListening() {
        Logging.i(TAG, "stopListening()");
        stopScheduledService();
        this.proxyHandler.removeCallbacks(this.systemGenerateRunnable);
        this.proxyHandler.removeCallbacks(this.supplementRunnable);
        this.proxyHandler.removeCallbacks(this.timerRunnable);
        this.handler.removeCallbacks(this.setListenerRunnable);
        this.videoDecimator.reset();
        this.auxiliaryDecimator.reset();
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.12
            @Override // java.lang.Runnable
            public void run() {
                TimerSurfaceTextureHelper.this.listener = null;
                TimerSurfaceTextureHelper.this.pendingListener = null;
            }
        });
    }

    public void stopScheduledService() {
        ScheduledExecutorService scheduledExecutorService = this.scheduledService;
        if (scheduledExecutorService == null) {
            return;
        }
        try {
            scheduledExecutorService.shutdownNow();
            this.scheduledService = null;
        } catch (Throwable unused) {
            this.scheduledService = null;
            Logging.i(TAG, "shutdownNow error.");
        }
    }

    public VideoFrame.TextureBuffer textureCopy(final VideoFrame.TextureBuffer textureBuffer) {
        if (textureBuffer.getTextureId() == this.oesTextureId) {
            return (VideoFrame.TextureBuffer) ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Callable<VideoFrame.TextureBuffer>() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.11
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoFrame.TextureBuffer call() {
                    return TimerSurfaceTextureHelper.this.textureBufferPool.textureCopy(textureBuffer, null);
                }
            });
        }
        throw new IllegalStateException("textureCopy called with unexpected textureId");
    }

    @Deprecated
    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    private TimerSurfaceTextureHelper(String str, boolean z10, EglBase.Context context, Handler handler, int i10) {
        this.notifyIntervalInMS = 67;
        this.prevTimeMillis = 0L;
        this.isTextureUpdatable = true;
        this.dropFrameCount = 0;
        YuvConverter yuvConverter = new YuvConverter();
        this.yuvConverter = yuvConverter;
        this.hasPendingTexture = false;
        this.isOesTextureInUse = false;
        this.isQuitting = false;
        this.setListenerRunnable = new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.2
            @Override // java.lang.Runnable
            public void run() {
                Logging.i(TimerSurfaceTextureHelper.TAG, "Setting listener to " + TimerSurfaceTextureHelper.this.pendingListener);
                TimerSurfaceTextureHelper timerSurfaceTextureHelper = TimerSurfaceTextureHelper.this;
                timerSurfaceTextureHelper.listener = timerSurfaceTextureHelper.pendingListener;
                TimerSurfaceTextureHelper.this.pendingListener = null;
                if (TimerSurfaceTextureHelper.this.hasPendingTexture && TimerSurfaceTextureHelper.this.isTextureUpdatable) {
                    TimerSurfaceTextureHelper.this.updateTexImage();
                    TimerSurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        this.timerNotifyRunnable = new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.3
            @Override // java.lang.Runnable
            public void run() {
                TimerSurfaceTextureHelper.this.tryDeliverTextureFrame();
            }
        };
        this.systemGenerateRunnable = new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.4
            @Override // java.lang.Runnable
            public void run() {
                if (TimerSurfaceTextureHelper.this.isOesTextureInUse || TimerSurfaceTextureHelper.this.isQuitting || TimerSurfaceTextureHelper.this.listener == null) {
                    return;
                }
                TimerSurfaceTextureHelper.this.videoDecimator.updateIncomingFramerate();
                if (TimerSurfaceTextureHelper.this.videoDecimator.dropFrame()) {
                    Logging.i(TimerSurfaceTextureHelper.TAG, "systemGenerate dropFrame.");
                } else {
                    TimerSurfaceTextureHelper.this.handler.post(TimerSurfaceTextureHelper.this.timerNotifyRunnable);
                    TimerSurfaceTextureHelper.this.prevTimeMillis = System.currentTimeMillis();
                }
                TimerSurfaceTextureHelper.this.proxyHandler.removeCallbacks(TimerSurfaceTextureHelper.this.supplementRunnable);
                float inputFramerate = TimerSurfaceTextureHelper.this.videoDecimator.inputFramerate() - TimerSurfaceTextureHelper.this.auxiliaryDecimator.getTargetFrameRate();
                if ((inputFramerate >= 0.0f || Math.abs(inputFramerate) <= 3.0f || Math.abs(inputFramerate) <= TimerSurfaceTextureHelper.this.auxiliaryDecimator.getTargetFrameRate() * 0.1d) && System.currentTimeMillis() - TimerSurfaceTextureHelper.this.prevTimeMillis <= TimerSurfaceTextureHelper.this.notifyIntervalInMS * 2) {
                    return;
                }
                TimerSurfaceTextureHelper.this.proxyHandler.postDelayed(TimerSurfaceTextureHelper.this.supplementRunnable, r1.notifyIntervalInMS);
            }
        };
        this.supplementRunnable = new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.5
            @Override // java.lang.Runnable
            public void run() {
                if (TimerSurfaceTextureHelper.this.isOesTextureInUse || TimerSurfaceTextureHelper.this.isQuitting || TimerSurfaceTextureHelper.this.listener == null) {
                    return;
                }
                TimerSurfaceTextureHelper.this.videoDecimator.updateIncomingFramerate();
                if (TimerSurfaceTextureHelper.this.videoDecimator.dropFrame()) {
                    Logging.i(TimerSurfaceTextureHelper.TAG, "supplement dropFrame.");
                } else {
                    TimerSurfaceTextureHelper.this.prevTimeMillis = System.currentTimeMillis();
                    TimerSurfaceTextureHelper.this.handler.post(TimerSurfaceTextureHelper.this.timerNotifyRunnable);
                }
                TimerSurfaceTextureHelper.this.proxyHandler.removeCallbacks(TimerSurfaceTextureHelper.this.supplementRunnable);
                float inputFramerate = TimerSurfaceTextureHelper.this.videoDecimator.inputFramerate() - TimerSurfaceTextureHelper.this.auxiliaryDecimator.getTargetFrameRate();
                if ((inputFramerate >= 0.0f || Math.abs(inputFramerate) <= 3.0f || Math.abs(inputFramerate) <= TimerSurfaceTextureHelper.this.auxiliaryDecimator.getTargetFrameRate() * 0.1d) && System.currentTimeMillis() - TimerSurfaceTextureHelper.this.prevTimeMillis <= TimerSurfaceTextureHelper.this.notifyIntervalInMS * 2) {
                    return;
                }
                TimerSurfaceTextureHelper.this.proxyHandler.postDelayed(TimerSurfaceTextureHelper.this.supplementRunnable, r1.notifyIntervalInMS);
            }
        };
        this.timerRunnable = new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.6
            @Override // java.lang.Runnable
            public void run() {
                float inputFramerate = TimerSurfaceTextureHelper.this.videoDecimator.inputFramerate() - TimerSurfaceTextureHelper.this.auxiliaryDecimator.getTargetFrameRate();
                if ((inputFramerate < 0.0f && Math.abs(inputFramerate) > 3.0f && Math.abs(inputFramerate) > TimerSurfaceTextureHelper.this.auxiliaryDecimator.getTargetFrameRate() * 0.1d) || System.currentTimeMillis() - TimerSurfaceTextureHelper.this.prevTimeMillis > TimerSurfaceTextureHelper.this.notifyIntervalInMS * 2) {
                    TimerSurfaceTextureHelper.this.proxyHandler.postDelayed(TimerSurfaceTextureHelper.this.supplementRunnable, r1.notifyIntervalInMS);
                }
                TimerSurfaceTextureHelper.this.proxyHandler.postDelayed(TimerSurfaceTextureHelper.this.timerRunnable, r1.notifyIntervalInMS);
            }
        };
        this.scheduledExecutorRunnable = new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.7
            @Override // java.lang.Runnable
            public void run() {
                if (TimerSurfaceTextureHelper.this.isOesTextureInUse || TimerSurfaceTextureHelper.this.isQuitting || TimerSurfaceTextureHelper.this.listener == null) {
                    return;
                }
                TimerSurfaceTextureHelper.this.videoDecimator.updateIncomingFramerate();
                if (TimerSurfaceTextureHelper.this.videoDecimator.dropFrame()) {
                    Logging.i(TimerSurfaceTextureHelper.TAG, "smoothDecimator dropFrame.");
                } else {
                    TimerSurfaceTextureHelper.this.handler.post(TimerSurfaceTextureHelper.this.timerNotifyRunnable);
                }
            }
        };
        if (handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
        }
        this.handler = handler;
        this.smoothCapture = z10;
        Logging.d(TAG, "TimerSurfaceTextureHelper construct. name=" + str + ", smoothCapture=" + z10 + ", sharedContext=" + context + ", handler=" + handler + ", maxBufCount=" + i10);
        HandlerThread handlerThread = new HandlerThread("delayThread");
        handlerThread.start();
        this.proxyHandler = new Handler(handlerThread.getLooper());
        try {
            EglBase create = EglBaseFactory.create(context, EglBase.CONFIG_PIXEL_BUFFER);
            this.eglBase = create;
            create.createDummyPbufferSurface();
            this.eglBase.makeCurrent();
            this.videoDecimator = new VideoDecimator();
            this.auxiliaryDecimator = new VideoDecimator();
            this.sharedContext = context != null ? context : this.eglBase.getEglBaseContext();
            int generateTexture = GlUtil.generateTexture(36197);
            this.oesTextureId = generateTexture;
            SurfaceTexture surfaceTexture = new SurfaceTexture(generateTexture);
            this.surfaceTexture = surfaceTexture;
            TextureBufferPool createWithinGlThread = TextureBufferPool.createWithinGlThread(str, i10, 6407, handler, this.eglBase, context, yuvConverter);
            this.textureBufferPool = createWithinGlThread;
            createWithinGlThread.setPoolBufferReleaseCallback(new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.8
                @Override // java.lang.Runnable
                public void run() {
                    TimerSurfaceTextureHelper.this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.8.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (!TimerSurfaceTextureHelper.this.isQuitting || TimerSurfaceTextureHelper.this.isOesTextureInUse || TimerSurfaceTextureHelper.this.textureBufferPool.anyTextureInUse()) {
                                return;
                            }
                            TimerSurfaceTextureHelper.this.release();
                        }
                    });
                }
            });
            setOnFrameAvailableListener(surfaceTexture, new SurfaceTexture.OnFrameAvailableListener() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.9
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    TimerSurfaceTextureHelper.this.hasPendingTexture = true;
                    if (!TimerSurfaceTextureHelper.this.hasFrameRate || TimerSurfaceTextureHelper.this.isSmoothCapture()) {
                        return;
                    }
                    TimerSurfaceTextureHelper.this.proxyHandler.post(TimerSurfaceTextureHelper.this.systemGenerateRunnable);
                }
            }, handler);
        } catch (RuntimeException e10) {
            Logging.e(TAG, "EglBase create error.", e10);
            EglBase eglBase = this.eglBase;
            if (eglBase != null) {
                try {
                    eglBase.release();
                } catch (Exception e11) {
                    Logging.e(TAG, "EglBase release error.", e11);
                }
            }
            handler.getLooper().quit();
            this.proxyHandler.getLooper().quit();
            throw e10;
        }
    }

    public static TimerSurfaceTextureHelper create(String str, boolean z10, EglBase.Context context) {
        return create(str, z10, context, 4);
    }

    public static TimerSurfaceTextureHelper create(final String str, final boolean z10, final EglBase.Context context, final int i10) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (TimerSurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<TimerSurfaceTextureHelper>() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public TimerSurfaceTextureHelper call() {
                try {
                    return new TimerSurfaceTextureHelper(str, z10, context, handler, i10);
                } catch (RuntimeException e10) {
                    Logging.e(TimerSurfaceTextureHelper.TAG, str + " create failure", e10);
                    return null;
                }
            }
        });
    }
}
