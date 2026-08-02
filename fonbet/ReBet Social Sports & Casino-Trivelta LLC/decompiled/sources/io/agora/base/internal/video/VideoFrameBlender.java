package io.agora.base.internal.video;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import io.agora.base.TextureBuffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.ATrace;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.RendererCommon;
import io.agora.base.internal.video.VideoSourceLayout;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class VideoFrameBlender {
    private static final boolean DEBUG = false;
    private static final int MAX_INVOKE_TIME_MS = 2000;
    private static final String TAG = "AndroidVideoFrameBlender";
    private final YuvConverter yuvConverter = new YuvConverter();
    private Handler mBlenderHandler = null;
    private EglBase mEglBase = null;
    private ArrayList<VideoSourceLayout> mVideoSourceLayouts = new ArrayList<>();
    private HashMap<String, VideoFrame> mVideoSources = new HashMap<>();
    private final Object mSourceLock = new Object();
    private final VideoFrameDrawer mFrameDrawer = new VideoFrameDrawer();
    private RendererCommon.GlDrawer mDrawer = new GlRectDrawer();
    private final Matrix drawMatrix = new Matrix();
    private String mCanvasId = "_agora_canvas_";
    private int mVideoBufferId = 0;
    private int mFramebuffer = 0;
    private int mCanvasWidth = 0;
    private int mCanvasHeight = 0;
    private volatile boolean shouldResetCanvas = false;
    private volatile boolean isBlenderReleased = false;
    private AtomicInteger videoBufferIdRefCount = new AtomicInteger(0);

    @CalledByNative
    public VideoFrameBlender() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TextureBuffer blenderSourcesWithinGlThread() {
        synchronized (this.mSourceLock) {
            try {
                if (this.mVideoBufferId <= 0) {
                    Logging.w(TAG, "blenderSourceList failed for  mVideoBufferId is:" + this.mVideoBufferId);
                    return null;
                }
                this.mEglBase.makeCurrent();
                GLES20.glBindFramebuffer(36160, this.mFramebuffer);
                GlUtil.checkNoGLES2Error("glBindFramebuffer mFramebuffer");
                boolean checkIfNeedAlphaRender = checkIfNeedAlphaRender();
                if (checkIfNeedAlphaRender) {
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glEnable(3042);
                    GLES20.glBlendFuncSeparate(770, 771, 1, 771);
                } else {
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                }
                GlUtil.checkNoGLES2Error("glClearColor");
                GLES20.glClear(16384);
                GlUtil.checkNoGLES2Error("glClear");
                Iterator<VideoSourceLayout> it = this.mVideoSourceLayouts.iterator();
                while (it.hasNext()) {
                    VideoSourceLayout next = it.next();
                    if (this.mVideoSources.get(next.getSourceId()) != null) {
                        doBlenderSource(next, this.mVideoSources.get(next.getSourceId()), checkIfNeedAlphaRender);
                    }
                }
                if (checkIfNeedAlphaRender) {
                    GLES20.glDisable(3042);
                }
                GLES20.glBindFramebuffer(36160, 0);
                GlUtil.checkNoGLES2Error("glBindFramebuffer 0");
                GLES20.glUseProgram(0);
                GlUtil.checkNoGLES2Error("glUseProgram");
                GLES20.glFlush();
                GlUtil.checkNoGLES2Error("glFlush");
                this.videoBufferIdRefCount.getAndIncrement();
                return new TextureBuffer(this.mEglBase.getEglBaseContext(), this.mCanvasWidth, this.mCanvasHeight, VideoFrame.TextureBuffer.Type.RGB, this.mVideoBufferId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(GlUtil.IDENTITY_MATRIX), this.mBlenderHandler, this.yuvConverter, new Runnable() { // from class: io.agora.base.internal.video.VideoFrameBlender.4
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (VideoFrameBlender.this.mSourceLock) {
                            try {
                                VideoFrameBlender.this.videoBufferIdRefCount.getAndDecrement();
                                if (VideoFrameBlender.this.isBlenderReleased) {
                                    VideoFrameBlender.this.releaseEgl();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean checkIfNeedAlphaRender() {
        Iterator<VideoSourceLayout> it = this.mVideoSourceLayouts.iterator();
        while (it.hasNext()) {
            VideoFrame videoFrame = this.mVideoSources.get(it.next().getSourceId());
            if (videoFrame != null && videoFrame.getAlphaBuffer() != null) {
                return true;
            }
        }
        return false;
    }

    private boolean createAndBindTextureBuffer(final int i10, final int i11) {
        return ((Boolean) ThreadUtils.invokeAtFrontUninterruptibly(this.mBlenderHandler, 2000L, new Callable<Boolean>() { // from class: io.agora.base.internal.video.VideoFrameBlender.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() {
                Logging.i(VideoFrameBlender.TAG, "into createAndBindTextureBuffer width:" + i10 + " ,height:" + i11);
                try {
                    VideoFrameBlender.this.mEglBase.makeCurrent();
                    VideoFrameBlender.this.releaseTextureBuffer();
                    VideoFrameBlender.this.mVideoBufferId = GlUtil.generateTexture(3553);
                    if (VideoFrameBlender.this.mVideoBufferId <= 0) {
                        Logging.e(VideoFrameBlender.TAG, "generateTexture failed");
                        return Boolean.FALSE;
                    }
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, VideoFrameBlender.this.mVideoBufferId);
                    ATrace.beginSection("glTexImage2D");
                    GLES20.glTexParameterf(3553, 10242, 33071.0f);
                    GLES20.glTexParameterf(3553, 10243, 33071.0f);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glTexImage2D(3553, 0, 6408, i10, i11, 0, 6408, 5121, null);
                    ATrace.endSection();
                    GlUtil.checkNoGLES2Error("TextureBufferPool.glTexImage2D");
                    GLES20.glBindTexture(3553, 0);
                    int[] iArr = new int[1];
                    GLES20.glGenFramebuffers(1, iArr, 0);
                    GlUtil.checkNoGLES2Error("glGenFramebuffers");
                    VideoFrameBlender.this.mFramebuffer = iArr[0];
                    GLES20.glBindFramebuffer(36160, VideoFrameBlender.this.mFramebuffer);
                    GlUtil.checkNoGLES2Error("glBindFramebuffer " + VideoFrameBlender.this.mFramebuffer);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, VideoFrameBlender.this.mVideoBufferId, 0);
                    GlUtil.checkNoGLES2Error("glFramebufferTexture2D");
                    int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
                    if (glCheckFramebufferStatus != 36053) {
                        Logging.w(VideoFrameBlender.TAG, "Framebuffer not complete, status: " + glCheckFramebufferStatus);
                        return Boolean.FALSE;
                    }
                    GLES20.glBindFramebuffer(36160, 0);
                    Logging.i(VideoFrameBlender.TAG, "createAndBindTextureBuffer success width:" + i10 + " ,height:" + i11);
                    return Boolean.TRUE;
                } catch (RuntimeException unused) {
                    return Boolean.FALSE;
                }
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int createImageTexture(ByteBuffer byteBuffer, int i10, int i11, int i12) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i13 = iArr[0];
        GlUtil.checkNoGLES2Error("glGenTextures");
        GLES20.glBindTexture(3553, i13);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GlUtil.checkNoGLES2Error("loadImageTexture");
        GLES20.glTexImage2D(3553, 0, i12, i10, i11, 0, i12, 5121, byteBuffer);
        GlUtil.checkNoGLES2Error("loadImageTexture");
        return i13;
    }

    private void doBlenderSource(VideoSourceLayout videoSourceLayout, VideoFrame videoFrame, boolean z10) {
        this.mDrawer.setTextureCropCoord(GlUtil.createFloatBuffer(EglRenderer.DoConvertRectFromAndroidGraphicsRect(new Rect(videoSourceLayout.getCroppedX(), videoSourceLayout.getCroppedY(), videoSourceLayout.getCroppedX() + videoSourceLayout.getCroppedWidth(), videoSourceLayout.getCroppedY() + videoSourceLayout.getCroppedHeight()), videoFrame, videoSourceLayout.isMirrorY())));
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        if (videoSourceLayout.isMirrorY()) {
            this.drawMatrix.preScale(-1.0f, 1.0f);
        }
        if (videoSourceLayout.getVideoSourceType() != VideoSourceLayout.VideoSourceType.STREAM) {
            this.drawMatrix.preScale(1.0f, -1.0f);
        }
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        int positionX = videoSourceLayout.getPositionX();
        int positionY = videoSourceLayout.getPositionY();
        if (!videoSourceLayout.getSourceId().equals(this.mCanvasId)) {
            positionX = videoSourceLayout.getPositionX();
            positionY = (this.mCanvasHeight - videoSourceLayout.getPositionY()) - videoSourceLayout.getDestHeight();
        }
        int i10 = positionX;
        int i11 = positionY;
        this.mFrameDrawer.disableNegativeAlphaData();
        this.mFrameDrawer.drawFrame(videoFrame, this.mDrawer, this.drawMatrix, i10, i11, videoSourceLayout.getDestWidth(), videoSourceLayout.getDestHeight(), z10 && videoFrame.getAlphaBuffer() != null);
    }

    private boolean isVideoBufferIdUsing() {
        return this.videoBufferIdRefCount.get() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseEgl() {
        if (isVideoBufferIdUsing()) {
            Logging.w(TAG, "releaseEgl failed for isVideoBufferIdUsing");
            return;
        }
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mBlenderHandler, 2000L, new Callable<Void>() { // from class: io.agora.base.internal.video.VideoFrameBlender.7
                @Override // java.util.concurrent.Callable
                public Void call() {
                    Logging.i(VideoFrameBlender.TAG, "release egl resources on render thread");
                    if (VideoFrameBlender.this.mEglBase != null) {
                        try {
                            VideoFrameBlender.this.mEglBase.makeCurrent();
                        } catch (RuntimeException unused) {
                            Logging.e(VideoFrameBlender.TAG, "releaseBlender failed to make current");
                        }
                    }
                    VideoFrameBlender.this.yuvConverter.release();
                    Logging.i(VideoFrameBlender.TAG, "release texture resources on render thread");
                    VideoFrameBlender.this.releaseTextureBuffer();
                    VideoFrameBlender.this.mDrawer.release();
                    VideoFrameBlender.this.mFrameDrawer.release();
                    synchronized (EglBase.lock) {
                        GLES20.glUseProgram(0);
                    }
                    if (VideoFrameBlender.this.mEglBase != null) {
                        Logging.i(VideoFrameBlender.TAG, "releaseBlender detachCurrent");
                        VideoFrameBlender.this.mEglBase.detachCurrent();
                        VideoFrameBlender.this.mEglBase.release();
                        VideoFrameBlender.this.mEglBase = null;
                    }
                    return null;
                }
            });
        } catch (Exception e10) {
            Logging.e(TAG, "releaseBlender faild for " + e10.toString());
        }
        this.mBlenderHandler.getLooper().quitSafely();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseTextureBuffer() {
        int[] iArr = new int[1];
        int i10 = this.mVideoBufferId;
        if (i10 > 0) {
            iArr[0] = i10;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.mVideoBufferId = -1;
        }
        int i11 = this.mFramebuffer;
        if (i11 > 0) {
            iArr[0] = i11;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.mFramebuffer = -1;
        }
    }

    private void removeSourceLayoutIfNeed(String str) {
        for (int size = this.mVideoSourceLayouts.size() - 1; size >= 0; size--) {
            if (this.mVideoSourceLayouts.get(size).getSourceId().equals(str)) {
                this.mVideoSourceLayouts.remove(size);
            }
        }
    }

    private VideoFrame.TextureBuffer uploadImageSourceToTexture(final VideoFrame videoFrame) {
        try {
            return (VideoFrame.TextureBuffer) ThreadUtils.invokeAtFrontUninterruptibly(this.mBlenderHandler, 2000L, new Callable<VideoFrame.TextureBuffer>() { // from class: io.agora.base.internal.video.VideoFrameBlender.6
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoFrame.TextureBuffer call() {
                    if (!(videoFrame.getBuffer() instanceof VideoFrame.RgbaBuffer)) {
                        return null;
                    }
                    VideoFrameBlender.this.mEglBase.makeCurrent();
                    final int createImageTexture = VideoFrameBlender.createImageTexture(((VideoFrame.RgbaBuffer) videoFrame.getBuffer()).getData(), videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), 6408);
                    GLES20.glFlush();
                    return new TextureBuffer(VideoFrameBlender.this.mEglBase.getEglBaseContext(), videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), VideoFrame.TextureBuffer.Type.RGB, createImageTexture, RendererCommon.convertMatrixToAndroidGraphicsMatrix(GlUtil.IDENTITY_MATRIX), VideoFrameBlender.this.mBlenderHandler, VideoFrameBlender.this.yuvConverter, new Runnable() { // from class: io.agora.base.internal.video.VideoFrameBlender.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            VideoFrameBlender.this.mBlenderHandler.post(new Runnable() { // from class: io.agora.base.internal.video.VideoFrameBlender.6.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    GLES20.glDeleteTextures(1, new int[]{createImageTexture}, 0);
                                }
                            });
                        }
                    });
                }
            });
        } catch (Exception e10) {
            Logging.e(TAG, "uploadImageSourceToTexture faild for " + e10.toString());
            return null;
        }
    }

    @CalledByNative
    public VideoFrame.Buffer blenderSourceList() {
        if (this.isBlenderReleased) {
            Logging.w(TAG, "blenderSourceList failed for BlenderRelased");
            return null;
        }
        if (this.mCanvasWidth != 0 && this.mCanvasHeight != 0) {
            try {
                return (VideoFrame.Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.mBlenderHandler, 2000L, new Callable<VideoFrame.Buffer>() { // from class: io.agora.base.internal.video.VideoFrameBlender.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.concurrent.Callable
                    public VideoFrame.Buffer call() {
                        return VideoFrameBlender.this.blenderSourcesWithinGlThread();
                    }
                });
            } catch (Exception e10) {
                Logging.e(TAG, "blenderSourceList failed.", e10);
                return null;
            }
        }
        Logging.w(TAG, "blenderSourceList failed for mCanvasWidth:" + this.mCanvasWidth + ", mCanvasHeight:" + this.mCanvasHeight);
        return null;
    }

    public boolean hasSourceContent(String str) {
        return this.mVideoSources.get(str) != null;
    }

    public boolean hasSourceLayout(String str) {
        Iterator<VideoSourceLayout> it = this.mVideoSourceLayouts.iterator();
        while (it.hasNext()) {
            if (it.next().getSourceId().equals(str)) {
                return true;
            }
        }
        return false;
    }

    @CalledByNative
    public boolean initBlender(String str, final EglBase.Context context) {
        HandlerThread handlerThread = new HandlerThread(str + "VideoFameBlender");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mBlenderHandler = handler;
        try {
            return ((Boolean) ThreadUtils.invokeAtFrontUninterruptibly(handler, 2000L, new Callable<Boolean>() { // from class: io.agora.base.internal.video.VideoFrameBlender.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Boolean call() {
                    EglBase.Context context2 = context;
                    if (context2 == null) {
                        Logging.e(VideoFrameBlender.TAG, "initBlender failed for sharedContext is null");
                        return Boolean.FALSE;
                    }
                    VideoFrameBlender.this.mEglBase = EglBaseFactory.create(context2, EglBase.CONFIG_RGBA);
                    if (VideoFrameBlender.this.mEglBase == null) {
                        Logging.e(VideoFrameBlender.TAG, "initBlender failed for mEglBase is null");
                        return Boolean.FALSE;
                    }
                    try {
                        VideoFrameBlender.this.mEglBase.createDummyPbufferSurface();
                        VideoFrameBlender.this.mEglBase.makeCurrent();
                        GLES20.glPixelStorei(3317, 1);
                        VideoFrameBlender.this.isBlenderReleased = false;
                        return Boolean.TRUE;
                    } catch (RuntimeException unused) {
                        VideoFrameBlender.this.mEglBase.release();
                        return Boolean.FALSE;
                    }
                }
            })).booleanValue();
        } catch (Exception unused) {
            Logging.e(TAG, "initBlender faild for EglBaseFactory failed");
            return false;
        }
    }

    public boolean isShouldResetCanvas() {
        return this.shouldResetCanvas;
    }

    @SuppressLint({"NewApi"})
    @CalledByNative
    public void releaseBlender() {
        if (this.mBlenderHandler == null) {
            return;
        }
        this.isBlenderReleased = true;
        releaseBlenderResource();
        synchronized (this.mSourceLock) {
            releaseEgl();
        }
    }

    @CalledByNative
    public void releaseBlenderResource() {
        synchronized (this.mSourceLock) {
            try {
                this.mVideoSourceLayouts.clear();
                Iterator<Map.Entry<String, VideoFrame>> it = this.mVideoSources.entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().release();
                }
                this.mVideoSources.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @CalledByNative
    public void updateSourceContent(String str, VideoFrame videoFrame) {
        if (this.isBlenderReleased) {
            Logging.w(TAG, "updateSourceContent failed for BlenderRelased");
            return;
        }
        synchronized (this.mSourceLock) {
            try {
                if (this.mVideoSources.get(str) != null) {
                    this.mVideoSources.get(str).release();
                    this.mVideoSources.remove(str);
                }
                if (videoFrame.getBuffer() instanceof VideoFrame.RgbaBuffer) {
                    VideoFrame.TextureBuffer uploadImageSourceToTexture = uploadImageSourceToTexture(videoFrame);
                    if (uploadImageSourceToTexture == null) {
                        return;
                    }
                    VideoFrame videoFrame2 = new VideoFrame(uploadImageSourceToTexture, videoFrame.getRotation(), videoFrame.getTimestampNs());
                    if (videoFrame.getAlphaBuffer() != null) {
                        videoFrame2.fillAlphaData(videoFrame.getAlphaBuffer());
                    }
                    this.mVideoSources.put(str, videoFrame2);
                } else {
                    videoFrame.retain();
                    this.mVideoSources.put(str, videoFrame);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @CalledByNative
    public void updateVideoSourceLayout(VideoSourceLayout videoSourceLayout) {
        if (this.isBlenderReleased) {
            Logging.w(TAG, "updateSourceLayout failed for BlenderRelased");
            return;
        }
        synchronized (this.mSourceLock) {
            try {
                removeSourceLayoutIfNeed(videoSourceLayout.getSourceId());
                if (videoSourceLayout.getSourceId().equals(this.mCanvasId)) {
                    this.mCanvasWidth = videoSourceLayout.getDestWidth();
                    this.mCanvasHeight = videoSourceLayout.getDestHeight();
                    this.shouldResetCanvas = true;
                }
                if (this.shouldResetCanvas) {
                    if (isVideoBufferIdUsing()) {
                        Logging.w(TAG, "updateSourceLayout reset canvas failed for isVideoBufferIdUsing");
                    } else {
                        createAndBindTextureBuffer(this.mCanvasWidth, this.mCanvasHeight);
                        this.shouldResetCanvas = false;
                    }
                }
                this.mVideoSourceLayouts.add(videoSourceLayout);
                Collections.sort(this.mVideoSourceLayouts, new Comparator<VideoSourceLayout>() { // from class: io.agora.base.internal.video.VideoFrameBlender.5
                    @Override // java.util.Comparator
                    public int compare(VideoSourceLayout videoSourceLayout2, VideoSourceLayout videoSourceLayout3) {
                        return videoSourceLayout2.getZorder() - videoSourceLayout3.getZorder();
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
