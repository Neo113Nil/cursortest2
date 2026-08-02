package io.agora.base.internal.video;

import android.os.Handler;
import androidx.annotation.NonNull;
import io.agora.base.TextureBuffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.EglBase10;
import io.agora.base.internal.video.EglBase14;
import java.util.concurrent.Callable;
import javax.microedition.khronos.egl.EGLContext;

/* loaded from: classes2.dex */
public class VideoFrameSenderExImpl {
    private static final String TAG = "VideoFrameSenderEx";
    private EglBase.Context eglContext = null;
    private SurfaceTextureHelper surfaceTextureHelper = null;
    private Handler toI420Handler = null;
    private YuvConverter yuvConverter = null;
    private boolean enableTextureCopy = false;
    private int textureBufferCount = 4;
    private final Object surfaceTextureHelperLock = new Object();
    private long prevFenceObject = 0;

    public @interface VIDEO_PIXEL_FORMAT {
        public static final int VIDEO_TEXTURE_2D = 10;
        public static final int VIDEO_TEXTURE_OES = 11;
    }

    @CalledByNative
    public VideoFrameSenderExImpl() {
        Logging.i(TAG, "constructor() enableTextureCopy:" + this.enableTextureCopy);
    }

    private VideoFrame.Buffer copyToNewTextureBuffer(VideoFrame.Buffer buffer, int i10) {
        if (!(buffer instanceof IHandlerReplaceable) && !(buffer instanceof VideoFrame.TextureBuffer)) {
            return buffer;
        }
        VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
        IHandlerReplaceable iHandlerReplaceable = (IHandlerReplaceable) buffer;
        if (getSurfaceTextureHelper(textureBuffer.getEglBaseContext(), i10)) {
            VideoFrame.Buffer applyNewI420Handler = iHandlerReplaceable.applyNewI420Handler(this.toI420Handler, this.yuvConverter);
            return (!this.enableTextureCopy || HdrUtil.is10BitLumaDepth(i10)) ? applyNewI420Handler : this.surfaceTextureHelper.textureCopy((VideoFrame.TextureBuffer) applyNewI420Handler, i10);
        }
        Logging.e(TAG, "Failed to create surfaceTextureHelper in copyToNewTextureBuffer");
        return null;
    }

    public static EglBase.Context createEglBaseContext(Object obj) {
        if (obj instanceof EglBase.Context) {
            return (EglBase.Context) obj;
        }
        if (obj instanceof EGLContext) {
            return new EglBase10.Context((EGLContext) obj);
        }
        if (obj instanceof android.opengl.EGLContext) {
            return new EglBase14.Context((android.opengl.EGLContext) obj);
        }
        throw new IllegalArgumentException("illegal egl context");
    }

    @CalledByNative
    private void enableTextureCopy(boolean z10) {
        Logging.i(TAG, "enableTextureCopy new:" + z10 + ", old:" + this.enableTextureCopy);
        this.enableTextureCopy = z10;
    }

    private boolean getSurfaceTextureHelper(@NonNull EglBase.Context context, int i10) {
        synchronized (this.surfaceTextureHelperLock) {
            try {
                if (this.surfaceTextureHelper != null) {
                    return true;
                }
                Logging.e(TAG, "getSurfaceTextureHelper, transfer: " + i10);
                SurfaceTextureHelper create = SurfaceTextureHelper.create("VideoFrameSender", context, this.textureBufferCount, i10);
                this.surfaceTextureHelper = create;
                if (create == null) {
                    Logging.e(TAG, "Failed to create surfaceTextureHelper");
                    return false;
                }
                this.toI420Handler = create.getHandler();
                this.yuvConverter = new YuvConverter();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean reInitSurfaceTextureHelper(@NonNull EglBase.Context context, int i10) {
        Logging.i(TAG, "reInitI420Converter()");
        if (this.surfaceTextureHelper != null) {
            dispose();
        }
        if (getSurfaceTextureHelper(context, i10)) {
            this.eglContext = context;
            return true;
        }
        Logging.e(TAG, "Failed to create surfaceTextureHelper in reInitI420Converter");
        return false;
    }

    private boolean reInitSurfaceTextureHelperIfNeed(EglBase.Context context, int i10) {
        EglBase.Context context2 = this.eglContext;
        return (context2 != null && context2.equals(context)) || reInitSurfaceTextureHelper(context, i10);
    }

    @CalledByNative
    private void setTextureBufferCount(int i10) {
        Logging.i(TAG, "setTextureBufferCount bufferCount:" + i10);
        this.textureBufferCount = i10;
    }

    @CalledByNative
    public void dispose() {
        Logging.i(TAG, "dispose()");
        synchronized (this.surfaceTextureHelperLock) {
            Handler handler = this.toI420Handler;
            if (handler != null) {
                try {
                    ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: io.agora.base.internal.video.VideoFrameSenderExImpl.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (VideoFrameSenderExImpl.this.prevFenceObject != 0) {
                                TextureBufferPool.deleteFenceObject(VideoFrameSenderExImpl.this.prevFenceObject, "VideoFrameSenderExImpl");
                            }
                            VideoFrameSenderExImpl.this.yuvConverter.release();
                        }
                    });
                } catch (Exception e10) {
                    Logging.e(TAG, "yuvConverter release failed:" + e10.toString());
                }
            }
            SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.dispose();
                this.surfaceTextureHelper = null;
            }
        }
    }

    @CalledByNative
    public VideoFrame.Buffer newTextureBuffer(Object obj, int i10, int i11, int i12, int i13, long j10, float[] fArr) {
        VideoFrame.TextureBuffer.Type type;
        EglBase.Context createEglBaseContext = createEglBaseContext(obj);
        if (i12 == 10) {
            type = VideoFrame.TextureBuffer.Type.RGB;
        } else {
            if (i12 != 11) {
                throw new IllegalArgumentException("illegal pixel format");
            }
            type = VideoFrame.TextureBuffer.Type.OES;
        }
        VideoFrame.TextureBuffer.Type type2 = type;
        if (fArr.length != 16) {
            throw new IllegalArgumentException("unsupported matrix");
        }
        TextureBuffer textureBuffer = new TextureBuffer(createEglBaseContext, i10, i11, type2, i13, j10, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), (Handler) null, (YuvConverter) null, (Runnable) null);
        VideoFrame.Buffer reconstructTextureBuffer = reconstructTextureBuffer(textureBuffer, 0);
        textureBuffer.release();
        return reconstructTextureBuffer;
    }

    @CalledByNative
    public VideoFrame.Buffer reconstructTextureBuffer(VideoFrame.Buffer buffer, int i10) {
        YuvConverter yuvConverter;
        if ((buffer instanceof IHandlerReplaceable) || (buffer instanceof VideoFrame.TextureBuffer)) {
            SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.invoke(new Callable<Void>() { // from class: io.agora.base.internal.video.VideoFrameSenderExImpl.1
                    @Override // java.util.concurrent.Callable
                    public Void call() {
                        TextureBufferPool.deleteFenceObject(VideoFrameSenderExImpl.this.prevFenceObject, "VideoFrameSenderExImpl");
                        return null;
                    }
                });
            }
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
            if (textureBuffer.getFenceObject() != 0) {
                this.prevFenceObject = textureBuffer.getFenceObject();
            }
            if (this.enableTextureCopy && !HdrUtil.is10BitLumaDepth(i10)) {
                if (reInitSurfaceTextureHelperIfNeed(textureBuffer.getEglBaseContext(), i10)) {
                    return copyToNewTextureBuffer(buffer, i10);
                }
                return null;
            }
            IHandlerReplaceable iHandlerReplaceable = (IHandlerReplaceable) buffer;
            if (iHandlerReplaceable.getToI420Handler() == null || iHandlerReplaceable.getYuvConverter() == null) {
                if (!reInitSurfaceTextureHelperIfNeed(textureBuffer.getEglBaseContext(), i10)) {
                    return null;
                }
                Handler handler = this.toI420Handler;
                if (handler != null && (yuvConverter = this.yuvConverter) != null) {
                    return iHandlerReplaceable.applyNewI420Handler(handler, yuvConverter);
                }
                Logging.e(TAG, "converter null");
                return null;
            }
        }
        return buffer;
    }
}
