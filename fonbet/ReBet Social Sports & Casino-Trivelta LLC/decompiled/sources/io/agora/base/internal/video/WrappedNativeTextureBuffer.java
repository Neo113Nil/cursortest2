package io.agora.base.internal.video;

import android.graphics.Matrix;
import android.os.Handler;
import androidx.annotation.NonNull;
import io.agora.base.ColorSpace;
import io.agora.base.TextureBuffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.JniCommon;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.EglBase;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class WrappedNativeTextureBuffer implements VideoFrame.TextureBuffer, IHandlerReplaceable {
    private final ColorSpace colorSpace;

    @NonNull
    private final EglBase.Context eglContext;
    private long fenceObject;
    private final int height;

    /* renamed from: id, reason: collision with root package name */
    private final int f49158id;
    private boolean is10bitTexture;
    private long nativeRefCountedPointer;
    private final Object nativeRefLock;
    private final Handler toI420Handler;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int width;
    private final YuvConverter yuvConverter;

    @CalledByNative
    public WrappedNativeTextureBuffer(@NonNull EglBase.Context context, int i10, int i11, boolean z10, int i12, float[] fArr, Handler handler, YuvConverter yuvConverter, long j10, long j11, int i13, int i14, int i15, int i16) {
        this(context, i10, i11, z10 ? VideoFrame.TextureBuffer.Type.OES : VideoFrame.TextureBuffer.Type.RGB, i12, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), handler, yuvConverter, j10, j11, new WrappedNativeColorSpace(i16, i15, i14, i13));
    }

    @CalledByNative
    private static VideoFrame.TextureBuffer wrapNewTextureBuffer(TextureBuffer textureBuffer, int i10, int i11, int i12, int i13, long j10, float[] fArr) {
        return textureBuffer.applyNewTextureInfo(i12 == 0 ? VideoFrame.TextureBuffer.Type.OES : VideoFrame.TextureBuffer.Type.RGB, i13, j10, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), i10, i11);
    }

    @Override // io.agora.base.internal.video.IHandlerReplaceable
    public VideoFrame.Buffer applyNewI420Handler(@NonNull Handler handler, @NonNull YuvConverter yuvConverter) {
        WrappedNativeTextureBuffer wrappedNativeTextureBuffer;
        synchronized (this.nativeRefLock) {
            wrappedNativeTextureBuffer = new WrappedNativeTextureBuffer(this.eglContext, this.width, this.height, this.type, this.f49158id, this.transformMatrix, handler, yuvConverter, this.nativeRefCountedPointer, this.fenceObject, this.colorSpace);
        }
        return wrappedNativeTextureBuffer;
    }

    @CalledByNative
    public void applyNewRefCountedPointer(long j10) {
        synchronized (this.nativeRefLock) {
            release();
            this.nativeRefCountedPointer = j10;
            retain();
        }
    }

    public WrappedNativeTextureBuffer applyTransformMatrix(Matrix matrix, int i10, int i11) {
        Object obj;
        WrappedNativeTextureBuffer wrappedNativeTextureBuffer;
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        Object obj2 = this.nativeRefLock;
        synchronized (obj2) {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    wrappedNativeTextureBuffer = new WrappedNativeTextureBuffer(this.eglContext, i10, i11, this.type, this.f49158id, matrix2, this.toI420Handler, this.yuvConverter, this.nativeRefCountedPointer, this.fenceObject, this.colorSpace);
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
        return wrappedNativeTextureBuffer;
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
        return 0;
    }

    @Override // io.agora.base.VideoFrame.TextureBuffer
    public Object getSourceTexturePool() {
        return null;
    }

    @Override // io.agora.base.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.f49158id;
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
        JniCommon.nativeReleaseRef(this.nativeRefCountedPointer);
    }

    @Override // io.agora.base.VideoFrame.Buffer, io.agora.base.internal.RefCounted
    public void retain() {
        JniCommon.nativeAddRef(this.nativeRefCountedPointer);
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
        final VideoFrame.I010Buffer[] i010BufferArr = {null};
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: io.agora.base.internal.video.WrappedNativeTextureBuffer.1
                @Override // java.lang.Runnable
                public void run() {
                    i010BufferArr[0] = WrappedNativeTextureBuffer.this.yuvConverter.convertI010(WrappedNativeTextureBuffer.this);
                }
            });
        } catch (Exception e10) {
            Logging.e("WrappedNativeTextureBuffer", "toI010 failure:" + e10.toString());
        }
        return i010BufferArr[0];
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        Handler handler = this.toI420Handler;
        if (handler == null || this.yuvConverter == null) {
            throw new IllegalStateException("toI420Handler or yuvConverter is null");
        }
        try {
            return (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<VideoFrame.I420Buffer>() { // from class: io.agora.base.internal.video.WrappedNativeTextureBuffer.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoFrame.I420Buffer call() {
                    YuvConverter yuvConverter = WrappedNativeTextureBuffer.this.yuvConverter;
                    WrappedNativeTextureBuffer wrappedNativeTextureBuffer = WrappedNativeTextureBuffer.this;
                    return yuvConverter.convert(wrappedNativeTextureBuffer, wrappedNativeTextureBuffer.colorSpace);
                }
            });
        } catch (Exception unused) {
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

    public WrappedNativeTextureBuffer(@NonNull EglBase.Context context, int i10, int i11, VideoFrame.TextureBuffer.Type type, int i12, Matrix matrix, Handler handler, YuvConverter yuvConverter, long j10, long j11, ColorSpace colorSpace) {
        Object obj = new Object();
        this.nativeRefLock = obj;
        this.is10bitTexture = false;
        this.eglContext = context;
        this.width = i10;
        this.height = i11;
        this.type = type;
        this.f49158id = i12;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.colorSpace = colorSpace;
        this.fenceObject = j11;
        synchronized (obj) {
            this.nativeRefCountedPointer = j10;
            retain();
        }
    }
}
