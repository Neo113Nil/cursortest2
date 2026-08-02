package io.agora.base;

import io.agora.base.VideoFrame;
import io.agora.base.internal.RefCountDelegate;
import io.agora.base.internal.video.YuvHelper;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class JavaP010Buffer implements VideoFrame.P010Buffer {
    private static final int BYTE_PER_CHANNEL = 2;
    private final ByteBuffer dataUV;
    private final ByteBuffer dataY;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int strideUV;
    private final int strideY;
    private final int width;

    public JavaP010Buffer(int i10, int i11, ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, Runnable runnable) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
        this.width = i10;
        this.height = i11;
        this.strideY = i12;
        this.strideUV = i13;
        this.dataY = byteBuffer;
        this.dataUV = byteBuffer2;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public static JavaP010Buffer allocate(int i10, int i11) {
        int i12 = i10 / 2;
        return new JavaP010Buffer(i10, i11, ByteBuffer.allocateDirect(i10 * i11 * 2), i10, ByteBuffer.allocateDirect((i11 / 2) * i12 * 4), i12, null);
    }

    private static void checkCapacity(ByteBuffer byteBuffer, int i10, int i11) {
        int i12 = i11 * i10 * 2;
        if (byteBuffer.capacity() >= i12) {
            return;
        }
        throw new IllegalArgumentException("p010 Buffer must be at least " + i12 + " bytes, but was " + byteBuffer.capacity() + "in p010");
    }

    public static JavaP010Buffer wrap(int i10, int i11, ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null) {
            throw new IllegalArgumentException("Data p010 buffers cannot be null.");
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect()) {
            throw new IllegalArgumentException("Data p010 buffers must be direct byte buffers.");
        }
        ByteBuffer slice = byteBuffer.slice();
        ByteBuffer slice2 = byteBuffer2.slice();
        checkCapacity(slice, i11, i12);
        checkCapacity(slice2, (i11 + 1) / 2, i13 * 2);
        return new JavaP010Buffer(i10, i11, slice, i12, slice2, i13, runnable);
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        JavaP010Buffer allocate = allocate(i14, i15);
        YuvHelper.nativeP010CropAndScale(i10, i11, i12, i13, i14, i15, this.dataY, this.dataUV, this.width, this.height, allocate.getDataY(), allocate.getStrideY(), allocate.getDataUV(), allocate.getStrideUV());
        return allocate;
    }

    @Override // io.agora.base.VideoFrame.P010Buffer
    public ByteBuffer getDataUV() {
        return this.dataUV;
    }

    @Override // io.agora.base.VideoFrame.P010Buffer
    public ByteBuffer getDataY() {
        return this.dataY;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // io.agora.base.VideoFrame.P010Buffer
    public int getStrideUV() {
        return this.strideUV;
    }

    @Override // io.agora.base.VideoFrame.P010Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer mirror(int i10) {
        return null;
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
        return null;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.I010Buffer toI010() {
        JavaI010Buffer allocate = JavaI010Buffer.allocate(this.width, this.height);
        ByteBuffer byteBuffer = this.dataY;
        int i10 = this.width;
        YuvHelper.P010ToI010(byteBuffer, i10, this.dataUV, i10, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), this.width, this.height);
        return allocate;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return toI010().toI420();
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer transform(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return null;
    }
}
