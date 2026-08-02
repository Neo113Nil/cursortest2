package io.agora.base.internal.video;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import io.agora.base.TextureBuffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.EglBase10;
import io.agora.base.internal.video.EglBase14;
import io.agora.base.internal.video.HdrUtil;
import java.util.concurrent.Callable;
import javax.microedition.khronos.egl.EGL10;

/* loaded from: classes2.dex */
public class SurfaceTextureHelper implements ISurfaceTextureHelper {
    private static final int ANDROID_API_TEXTURE_IN_USE = 10;
    private static final int DEFAULT_MAX_BUFFER_COUNT = 4;
    private static final String TAG = "SurfaceTextureHelper";
    private EglBase eglBase;
    private int frameRotation;
    private final Handler handler;
    private boolean hasPendingTexture;
    private volatile boolean isOesTextureInUse;
    private boolean isQuitting;
    private VideoSink listener;
    private int mLumaBitDepth;
    private final String name;
    private final int oesTextureId;
    private VideoSink pendingListener;
    final Runnable setListenerRunnable;

    @NonNull
    private final EglBase.Context sharedContext;
    private final SurfaceTexture surfaceTexture;
    private final TextureBufferPool textureBufferPool;
    private int textureHeight;
    private int textureWidth;
    private final YuvConverter yuvConverter;

    public interface IVideoCapture extends VideoSink {
        void onFrameDropped(int i10);
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, context, 4, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        Logging.i(TAG, "release()");
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
        this.handler.getLooper().quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void returnTextureFrame() {
        this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.8
            @Override // java.lang.Runnable
            public void run() {
                SurfaceTextureHelper.this.isOesTextureInUse = false;
                if (!SurfaceTextureHelper.this.isQuitting) {
                    SurfaceTextureHelper.this.tryDeliverTextureFrame();
                } else {
                    if (SurfaceTextureHelper.this.textureBufferPool.anyTextureInUse()) {
                        return;
                    }
                    SurfaceTextureHelper.this.release();
                }
            }
        });
    }

    @TargetApi(21)
    private static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryDeliverTextureFrame() {
        int i10;
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        }
        if (this.isQuitting || !this.hasPendingTexture || this.listener == null) {
            return;
        }
        if (this.isOesTextureInUse) {
            VideoSink videoSink = this.listener;
            if (videoSink instanceof IVideoCapture) {
                ((IVideoCapture) videoSink).onFrameDropped(10);
                return;
            }
            return;
        }
        EglBase.Context context = this.sharedContext;
        if ((context instanceof EglBase10.Context) && ((EglBase10.Context) context).getEglContext().equals(EGL10.EGL_NO_CONTEXT)) {
            return;
        }
        EglBase.Context context2 = this.sharedContext;
        if ((context2 instanceof EglBase14.Context) && ((EglBase14.Context) context2).getEglContext().equals(EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        this.isOesTextureInUse = true;
        this.hasPendingTexture = false;
        updateTexImage();
        float[] fArr = new float[16];
        this.surfaceTexture.getTransformMatrix(fArr);
        long timestamp = this.surfaceTexture.getTimestamp();
        int i11 = this.textureWidth;
        if (i11 == 0 || (i10 = this.textureHeight) == 0) {
            throw new RuntimeException("Texture size has not been set.");
        }
        VideoFrame videoFrame = new VideoFrame(new TextureBuffer(this.sharedContext, i11, i10, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, new Runnable() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.11
            @Override // java.lang.Runnable
            public void run() {
                SurfaceTextureHelper.this.returnTextureFrame();
            }
        }, this.mLumaBitDepth == HdrUtil.LumaBitDepth.LUMA10BIT.depth()), this.frameRotation, timestamp);
        this.listener.onFrame(videoFrame);
        videoFrame.release();
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
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.9
            @Override // java.lang.Runnable
            public void run() {
                SurfaceTextureHelper.this.isQuitting = true;
                if (!SurfaceTextureHelper.this.isOesTextureInUse && !SurfaceTextureHelper.this.textureBufferPool.anyTextureInUse()) {
                    SurfaceTextureHelper.this.release();
                    return;
                }
                Logging.i(SurfaceTextureHelper.TAG, SurfaceTextureHelper.this.name + " not release yet, this: " + SurfaceTextureHelper.this + " isOesTextureInUse: " + SurfaceTextureHelper.this.isOesTextureInUse);
            }
        });
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public Handler getHandler() {
        return this.handler;
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public <V> V invoke(Callable<V> callable) {
        return (V) ThreadUtils.invokeAtFrontUninterruptibly(this.handler, callable);
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public boolean isOesTextureInUse() {
        return this.isOesTextureInUse;
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public void setFrameRotation(final int i10) {
        this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.7
            @Override // java.lang.Runnable
            public void run() {
                SurfaceTextureHelper.this.frameRotation = i10;
            }
        });
    }

    public void setLumaBitDepth(int i10) {
        this.mLumaBitDepth = i10;
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public void setTextureSize(final int i10, final int i11) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Texture width must be positive, but was " + i10);
        }
        if (i11 > 0) {
            this.surfaceTexture.setDefaultBufferSize(i10, i11);
            this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.6
                @Override // java.lang.Runnable
                public void run() {
                    SurfaceTextureHelper.this.textureWidth = i10;
                    SurfaceTextureHelper.this.textureHeight = i11;
                }
            });
        } else {
            throw new IllegalArgumentException("Texture height must be positive, but was " + i11);
        }
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public void startListening(VideoSink videoSink) {
        if (this.listener != null || this.pendingListener != null) {
            throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
        }
        this.pendingListener = videoSink;
        this.handler.post(this.setListenerRunnable);
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public void stopListening() {
        Logging.i(TAG, "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.5
            @Override // java.lang.Runnable
            public void run() {
                SurfaceTextureHelper.this.listener = null;
                SurfaceTextureHelper.this.pendingListener = null;
            }
        });
    }

    public VideoFrame.TextureBuffer textureCopy(final VideoFrame.TextureBuffer textureBuffer, final int i10) {
        if (textureBuffer == null) {
            Logging.w(TAG, "textureCopy: " + this.name + " textureBuffer is null, IllegalStateException");
            throw new IllegalStateException("textureCopy called unexpected with textureBuffer is null");
        }
        if (this.handler != null && ((IHandlerReplaceable) textureBuffer).getToI420Handler() != null) {
            return (VideoFrame.TextureBuffer) ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Callable<VideoFrame.TextureBuffer>() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.10
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoFrame.TextureBuffer call() {
                    return SurfaceTextureHelper.this.textureBufferPool.textureCopy(textureBuffer, i10, null);
                }
            });
        }
        Logging.w(TAG, "textureCopy: " + this.name + " handler is null, IllegalStateException");
        throw new IllegalStateException("textureCopy called unexpected with handler is null");
    }

    @Deprecated
    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    private SurfaceTextureHelper(String str, EglBase.Context context, Handler handler, int i10, int i11) {
        YuvConverter yuvConverter = new YuvConverter();
        this.yuvConverter = yuvConverter;
        this.hasPendingTexture = false;
        this.isOesTextureInUse = false;
        this.isQuitting = false;
        this.mLumaBitDepth = 0;
        this.setListenerRunnable = new Runnable() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.2
            @Override // java.lang.Runnable
            public void run() {
                Logging.i(SurfaceTextureHelper.TAG, "Setting listener to " + SurfaceTextureHelper.this.pendingListener);
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                SurfaceTextureHelper.this.pendingListener = null;
                if (SurfaceTextureHelper.this.hasPendingTexture) {
                    SurfaceTextureHelper.this.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        Logging.i(TAG, "construct");
        if (handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
        }
        this.name = str;
        this.handler = handler;
        try {
            EglBase create = EglBaseFactory.create(context, i11, false, EglBase.EglConfigType.CONFIG_PIXEL_BUFFER_TYPE);
            this.eglBase = create;
            create.createDummyPbufferSurface();
            this.eglBase.makeCurrent();
            this.sharedContext = context != null ? context : this.eglBase.getEglBaseContext();
            TextureBufferPool createWithinGlThread = TextureBufferPool.createWithinGlThread(str, i10, 6407, handler, this.eglBase, context, yuvConverter);
            this.textureBufferPool = createWithinGlThread;
            createWithinGlThread.setPoolBufferReleaseCallback(new Runnable() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.3
                @Override // java.lang.Runnable
                public void run() {
                    SurfaceTextureHelper.this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (!SurfaceTextureHelper.this.isQuitting || SurfaceTextureHelper.this.isOesTextureInUse || SurfaceTextureHelper.this.textureBufferPool.anyTextureInUse()) {
                                return;
                            }
                            SurfaceTextureHelper.this.release();
                        }
                    });
                }
            });
            int generateTexture = GlUtil.generateTexture(36197);
            this.oesTextureId = generateTexture;
            SurfaceTexture surfaceTexture = new SurfaceTexture(generateTexture);
            this.surfaceTexture = surfaceTexture;
            setOnFrameAvailableListener(surfaceTexture, new SurfaceTexture.OnFrameAvailableListener() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.4
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    SurfaceTextureHelper.this.hasPendingTexture = true;
                    SurfaceTextureHelper.this.tryDeliverTextureFrame();
                }
            }, handler);
        } catch (RuntimeException e10) {
            Logging.e(TAG, str + " create eglBase failure", e10);
            try {
                this.eglBase.release();
            } catch (Exception e11) {
                Logging.e(TAG, "Failed to release EglBase: " + this.eglBase, e11);
            }
            handler.getLooper().quit();
            throw e10;
        }
    }

    public static SurfaceTextureHelper create(String str, final EglBase.Context context, final int i10, final int i11) {
        final String str2;
        Logging.i(TAG, "create " + str);
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        try {
            str2 = str;
        } catch (Exception e10) {
            e = e10;
            str2 = str;
        }
        try {
            return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<SurfaceTextureHelper>() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public SurfaceTextureHelper call() {
                    try {
                        return new SurfaceTextureHelper(str2, context, handler, i10, i11);
                    } catch (RuntimeException e11) {
                        Logging.e(SurfaceTextureHelper.TAG, str2 + " create failure", e11);
                        return null;
                    }
                }
            });
        } catch (Exception e11) {
            e = e11;
            Logging.e(TAG, str2 + " create failure", e);
            return null;
        }
    }

    public VideoFrame.TextureBuffer textureCopy(VideoFrame.TextureBuffer textureBuffer) {
        return textureCopy(textureBuffer, 0);
    }
}
