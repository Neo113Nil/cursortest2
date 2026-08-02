package io.agora.base.internal.video;

import io.agora.base.JavaP010Buffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.JniCommon;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class WrappedNativeP010Buffer extends JavaP010Buffer {
    private final ByteBuffer dataUV;
    private final ByteBuffer dataY;
    private final int height;
    private final long nativeBuffer;
    private final int strideUV;
    private final int strideY;
    private final int width;

    @CalledByNative
    public WrappedNativeP010Buffer(int i10, int i11, ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, long j10) {
        super(i10, i11, byteBuffer, i12, byteBuffer2, i13, null);
        this.width = i10;
        this.height = i11;
        this.dataY = byteBuffer;
        this.strideY = i12;
        this.dataUV = byteBuffer2;
        this.strideUV = i13;
        this.nativeBuffer = j10;
        retain();
    }

    @Override // io.agora.base.JavaP010Buffer, io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        return null;
    }

    @Override // io.agora.base.JavaP010Buffer, io.agora.base.VideoFrame.P010Buffer
    public ByteBuffer getDataUV() {
        return this.dataUV.slice();
    }

    @Override // io.agora.base.JavaP010Buffer, io.agora.base.VideoFrame.P010Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // io.agora.base.JavaP010Buffer, io.agora.base.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // io.agora.base.JavaP010Buffer, io.agora.base.VideoFrame.P010Buffer
    public int getStrideUV() {
        return this.strideUV;
    }

    @Override // io.agora.base.JavaP010Buffer, io.agora.base.VideoFrame.P010Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // io.agora.base.JavaP010Buffer, io.agora.base.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // io.agora.base.JavaP010Buffer, io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer mirror(int i10) {
        return null;
    }

    @Override // io.agora.base.JavaP010Buffer, io.agora.base.VideoFrame.Buffer, io.agora.base.internal.RefCounted
    public void release() {
        long j10 = this.nativeBuffer;
        if (j10 != 0) {
            JniCommon.nativeReleaseRef(j10);
        }
    }

    @Override // io.agora.base.JavaP010Buffer, io.agora.base.VideoFrame.Buffer, io.agora.base.internal.RefCounted
    public void retain() {
        long j10 = this.nativeBuffer;
        if (j10 != 0) {
            JniCommon.nativeAddRef(j10);
        }
    }

    @Override // io.agora.base.JavaP010Buffer, io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer rotate(int i10) {
        return null;
    }

    @Override // io.agora.base.JavaP010Buffer, io.agora.base.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return super.toI420();
    }

    @Override // io.agora.base.JavaP010Buffer, io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer transform(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return null;
    }
}
