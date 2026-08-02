package io.agora.base;

import android.graphics.Matrix;
import android.os.Handler;
import androidx.annotation.NonNull;
import io.agora.base.VideoFrame;
import io.agora.base.internal.Logging;
import io.agora.base.internal.RefCountDelegate;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.EglBaseFactory;
import io.agora.base.internal.video.IHandlerReplaceable;
import io.agora.base.internal.video.RendererCommon;
import io.agora.base.internal.video.TextureBufferPool;
import io.agora.base.internal.video.YuvConverter;
import javax.microedition.khronos.egl.EGLContext;

/* loaded from: classes2.dex */
public class TextureBuffer implements VideoFrame.TextureBuffer, IHandlerReplaceable {
    private static final long DEFAULT_FENCE_VALUE = 0;
    private static final String TAG = "TextureBuffer";
    private static final boolean VERBOSE = false;

    @NonNull
    private final EglBase.Context eglContext;
    private long fenceObject;
    private final int height;

    /* renamed from: id, reason: collision with root package name */
    private final int f49155id;
    private boolean is10bitTexture;
    private final RefCountDelegate refCountDelegate;
    private int sequence;
    private final TextureBufferPool sourceTexturePool;
    private final Handler toI420Handler;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int width;
    private final YuvConverter yuvConverter;

    public TextureBuffer(@NonNull EGLContext eGLContext, int i10, int i11, VideoFrame.TextureBuffer.Type type, int i12, Matrix matrix, Handler handler, YuvConverter yuvConverter, Runnable runnable) {
        this(EglBaseFactory.createEgl10Context(eGLContext), i10, i11, type, i12, matrix, handler, yuvConverter, runnable, null, 0L, -1, false);
    }

    @Override // io.agora.base.internal.video.IHandlerReplaceable
    public VideoFrame.Buffer applyNewI420Handler(@NonNull Handler handler, @NonNull YuvConverter yuvConverter) {
        retain();
        return new TextureBuffer(this.eglContext, this.width, this.height, this.type, this.f49155id, this.transformMatrix, handler, yuvConverter, new Runnable() { // from class: io.agora.base.TextureBuffer.1
            @Override // java.lang.Runnable
            public void run() {
                TextureBuffer.this.release();
            }
        }, this.sourceTexturePool, this.fenceObject, -1, this.is10bitTexture);
    }

    public TextureBuffer applyNewTextureInfo(VideoFrame.TextureBuffer.Type type, int i10, long j10, Matrix matrix, int i11, int i12) {
        retain();
        return new TextureBuffer(this.eglContext, i11, i12, type, i10, matrix, this.toI420Handler, this.yuvConverter, new Runnable() { // from class: io.agora.base.TextureBuffer.5
            @Override // java.lang.Runnable
            public void run() {
                TextureBuffer.this.release();
            }
        }, this.sourceTexturePool, j10, this.sequence, this.is10bitTexture);
    }

    public TextureBuffer applyTransformMatrix(Matrix matrix, int i10, int i11) {
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        retain();
        return new TextureBuffer(this.eglContext, i10, i11, this.type, this.f49155id, matrix2, this.toI420Handler, this.yuvConverter, new Runnable() { // from class: io.agora.base.TextureBuffer.4
            @Override // java.lang.Runnable
            public void run() {
                TextureBuffer.this.release();
            }
        }, this.sourceTexturePool, this.fenceObject, this.sequence, this.is10bitTexture);
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(i10 / this.width, (r1 - (i11 + i13)) / this.height);
        matrix.preScale(i12 / this.width, i13 / this.height);
        return applyTransformMatrix(matrix, i14, i15);
    }

    @Override // io.agora.base.VideoFrame.TextureBuffer
    @NonNull
    public EglBase.Context getEglBaseContext() {
        return this.eglContext;
    }

    @Override // io.agora.base.VideoFrame.TextureBuffer
    public int getEglContextType() {
        return EglBaseFactory.isEglBase14(this.eglContext) ? VideoFrame.TextureBuffer.ContextType.EGL_CONTEXT_14.ordinal() : VideoFrame.TextureBuffer.ContextType.EGL_CONTEXT_10.ordinal();
    }

    @Override // io.agora.base.VideoFrame.TextureBuffer
    public long getFenceObject() {
        return this.fenceObject;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // io.agora.base.VideoFrame.TextureBuffer
    public long getNativeEglContext() {
        return this.eglContext.getNativeEglContext();
    }

    @Override // io.agora.base.VideoFrame.TextureBuffer
    public int getSequence() {
        return this.sequence;
    }

    @Override // io.agora.base.VideoFrame.TextureBuffer
    public Object getSourceTexturePool() {
        return this.sourceTexturePool;
    }

    @Override // io.agora.base.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.f49155id;
    }

    @Override // io.agora.base.internal.video.IHandlerReplaceable
    public Handler getToI420Handler() {
        return this.toI420Handler;
    }

    @Override // io.agora.base.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // io.agora.base.VideoFrame.TextureBuffer
    public float[] getTransformMatrixArray() {
        return RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.transformMatrix);
    }

    @Override // io.agora.base.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // io.agora.base.internal.video.IHandlerReplaceable
    public YuvConverter getYuvConverter() {
        return this.yuvConverter;
    }

    @Override // io.agora.base.VideoFrame.TextureBuffer
    public boolean is10BitTexture() {
        return this.is10bitTexture;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer mirror(int i10) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        if (i10 == 90 || i10 == 270) {
            matrix.preScale(1.0f, -1.0f);
        } else {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preTranslate(-0.5f, -0.5f);
        return applyTransformMatrix(matrix, getWidth(), getHeight());
    }

    @Override // io.agora.base.VideoFrame.Buffer, io.agora.base.internal.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // io.agora.base.VideoFrame.Buffer, io.agora.base.internal.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer rotate(int i10) {
        Matrix matrix = new Matrix();
        int height = (i10 == 90 || i10 == 270) ? getHeight() : getWidth();
        int width = (i10 == 90 || i10 == 270) ? getWidth() : getHeight();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preRotate(i10);
        matrix.preTranslate(-0.5f, -0.5f);
        return applyTransformMatrix(matrix, height, width);
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.I010Buffer toI010() {
        Handler handler = this.toI420Handler;
        if (handler == null || this.yuvConverter == null) {
            throw new IllegalStateException("toI010Handler or yuvConverter is null");
        }
        final JavaI010Buffer[] javaI010BufferArr = {null};
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: io.agora.base.TextureBuffer.3
                @Override // java.lang.Runnable
                public void run() {
                    javaI010BufferArr[0] = TextureBuffer.this.yuvConverter.convertI010(TextureBuffer.this);
                }
            });
            return javaI010BufferArr[0];
        } catch (Exception e10) {
            Logging.e(TAG, "toI420 failure:" + e10.toString());
            return null;
        }
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        Handler handler = this.toI420Handler;
        if (handler == null || this.yuvConverter == null) {
            throw new IllegalStateException("toI420Handler or yuvConverter is null");
        }
        final VideoFrame.I420Buffer[] i420BufferArr = {null};
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: io.agora.base.TextureBuffer.2
                @Override // java.lang.Runnable
                public void run() {
                    i420BufferArr[0] = TextureBuffer.this.yuvConverter.convert(TextureBuffer.this);
                }
            });
            return i420BufferArr[0];
        } catch (Exception e10) {
            Logging.e(TAG, "toI420 failure:" + e10.toString());
            return null;
        }
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer transform(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(i10 / this.width, (r1 - (i11 + i13)) / this.height);
        matrix.preScale(i12 / this.width, i13 / this.height);
        if (i14 > 0 && i15 > 0 && i16 == 0) {
            return applyTransformMatrix(matrix, i14, i15);
        }
        matrix.preTranslate(0.5f, 0.5f);
        if (i14 < 0) {
            matrix.preScale(-1.0f, 1.0f);
            i14 = -i14;
        }
        if (i15 < 0) {
            matrix.preScale(1.0f, -1.0f);
            i15 = -i15;
        }
        if (i16 == 90 || i16 == 270) {
            int i17 = i15;
            i15 = i14;
            i14 = i17;
        }
        if (i16 != 0) {
            matrix.preRotate(i16);
        }
        matrix.preTranslate(-0.5f, -0.5f);
        return applyTransformMatrix(matrix, i14, i15);
    }

    public TextureBuffer withSequence(int i10) {
        this.sequence = i10;
        return this;
    }

    public TextureBuffer(@NonNull android.opengl.EGLContext eGLContext, int i10, int i11, VideoFrame.TextureBuffer.Type type, int i12, Matrix matrix, Handler handler, YuvConverter yuvConverter, Runnable runnable) {
        this(EglBaseFactory.createEgl14Context(eGLContext), i10, i11, type, i12, matrix, handler, yuvConverter, runnable, null, 0L, -1, false);
    }

    public TextureBuffer(@NonNull android.opengl.EGLContext eGLContext, int i10, int i11, VideoFrame.TextureBuffer.Type type, int i12, long j10, Matrix matrix, Handler handler, YuvConverter yuvConverter, Runnable runnable) {
        this(EglBaseFactory.createEgl14Context(eGLContext), i10, i11, type, i12, matrix, handler, yuvConverter, runnable, null, j10, -1, false);
    }

    public TextureBuffer(@NonNull EglBase.Context context, int i10, int i11, VideoFrame.TextureBuffer.Type type, int i12, long j10, Matrix matrix, @NonNull Handler handler, @NonNull YuvConverter yuvConverter, Runnable runnable) {
        this(context, i10, i11, type, i12, matrix, handler, yuvConverter, runnable, null, j10, -1, false);
    }

    public TextureBuffer(@NonNull EglBase.Context context, int i10, int i11, VideoFrame.TextureBuffer.Type type, int i12, Matrix matrix, @NonNull Handler handler, @NonNull YuvConverter yuvConverter, Runnable runnable, boolean z10) {
        this(context, i10, i11, type, i12, matrix, handler, yuvConverter, runnable, null, 0L, -1, z10);
    }

    public TextureBuffer(@NonNull EglBase.Context context, int i10, int i11, VideoFrame.TextureBuffer.Type type, int i12, Matrix matrix, @NonNull Handler handler, @NonNull YuvConverter yuvConverter, Runnable runnable) {
        this(context, i10, i11, type, i12, matrix, handler, yuvConverter, runnable, null, 0L, -1, false);
    }

    public TextureBuffer(@NonNull EglBase.Context context, int i10, int i11, VideoFrame.TextureBuffer.Type type, int i12, Matrix matrix, Handler handler, YuvConverter yuvConverter, Runnable runnable, TextureBufferPool textureBufferPool, long j10, int i13, boolean z10) {
        this.fenceObject = 0L;
        this.sequence = -1;
        this.is10bitTexture = false;
        this.eglContext = context;
        this.width = i10;
        this.height = i11;
        this.type = type;
        this.f49155id = i12;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.sourceTexturePool = textureBufferPool;
        this.refCountDelegate = new RefCountDelegate(runnable);
        this.sequence = i13;
        this.fenceObject = j10;
        this.is10bitTexture = z10;
    }
}
