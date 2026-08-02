package io.agora.base;

import io.agora.base.VideoFrame;
import io.agora.base.internal.JniCommon;
import io.agora.base.internal.RefCountDelegate;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class JavaI010Buffer implements VideoFrame.I010Buffer {
    private static final int BYTE_PER_CHANNEL = 2;
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    public JavaI010Buffer(int i10, int i11, ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, Runnable runnable) {
        this.width = i10;
        this.height = i11;
        this.strideY = i12;
        this.strideU = i13;
        this.strideV = i14;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public static JavaI010Buffer allocate(int i10, int i11) {
        int i12 = (i11 + 1) / 2;
        int i13 = (i10 + 1) / 2;
        int i14 = i10 * i11;
        int i15 = i14 * 2;
        int i16 = i13 * i12 * 2;
        int i17 = i15 + i16;
        final ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i14 + (i13 * 2 * i12)) * 2);
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i15);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i15);
        nativeAllocateByteBuffer.limit(i17);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i17);
        nativeAllocateByteBuffer.limit(i17 + i16);
        return new JavaI010Buffer(i10, i11, slice, i10, slice2, i13, nativeAllocateByteBuffer.slice(), i13, new Runnable() { // from class: io.agora.base.JavaI010Buffer.1
            @Override // java.lang.Runnable
            public void run() {
                JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
            }
        });
    }

    private static void checkCapacity(ByteBuffer byteBuffer, int i10, int i11) {
        int i12 = i11 * i10 * 2;
        if (byteBuffer.capacity() >= i12) {
            return;
        }
        throw new IllegalArgumentException("I010 Buffer must be at least " + i12 + " bytes, but was " + byteBuffer.capacity() + "in i010");
    }

    public static VideoFrame.I420Buffer i010BufferToI420(JavaI010Buffer javaI010Buffer) {
        JavaI420Buffer allocate = JavaI420Buffer.allocate(javaI010Buffer.width, javaI010Buffer.height);
        nativeI010toI420(javaI010Buffer.getDataY(), javaI010Buffer.getStrideY(), javaI010Buffer.getDataU(), javaI010Buffer.getStrideU(), javaI010Buffer.getDataV(), javaI010Buffer.getStrideV(), javaI010Buffer.width, javaI010Buffer.height, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), allocate.getWidth(), allocate.getHeight());
        return allocate;
    }

    private static native void nativeI010toI420(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, ByteBuffer byteBuffer4, int i15, ByteBuffer byteBuffer5, int i16, ByteBuffer byteBuffer6, int i17, int i18, int i19);

    public static JavaI010Buffer wrap(int i10, int i11, ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw new IllegalArgumentException("Data i010 buffers cannot be null.");
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalArgumentException("Data i010 buffers must be direct byte buffers.");
        }
        int i15 = (i11 + 1) / 2;
        ByteBuffer slice = byteBuffer.slice();
        ByteBuffer slice2 = byteBuffer2.slice();
        ByteBuffer slice3 = byteBuffer3.slice();
        checkCapacity(slice, i11, i12);
        checkCapacity(slice2, i15, i13);
        checkCapacity(slice3, i15, i14);
        return new JavaI010Buffer(i10, i11, slice, i12, slice2, i13, slice3, i14, runnable);
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        return null;
    }

    @Override // io.agora.base.VideoFrame.I010Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // io.agora.base.VideoFrame.I010Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // io.agora.base.VideoFrame.I010Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // io.agora.base.VideoFrame.I010Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // io.agora.base.VideoFrame.I010Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // io.agora.base.VideoFrame.I010Buffer
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
        retain();
        return this;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return i010BufferToI420(this);
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer transform(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return null;
    }
}
