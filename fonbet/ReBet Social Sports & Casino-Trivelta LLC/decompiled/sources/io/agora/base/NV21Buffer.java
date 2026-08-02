package io.agora.base;

import io.agora.base.VideoFrame;
import io.agora.base.internal.RefCountDelegate;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class NV21Buffer implements VideoFrame.Buffer {
    private final byte[] data;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private int sliceHeight;
    private int stride;
    private final int width;

    public NV21Buffer(byte[] bArr, int i10, int i11, Runnable runnable) {
        this.data = bArr;
        this.width = i10;
        this.height = i11;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private static native void nativeCropAndScale(int i10, int i11, int i12, int i13, int i14, int i15, byte[] bArr, int i16, int i17, ByteBuffer byteBuffer, int i18, ByteBuffer byteBuffer2, int i19, ByteBuffer byteBuffer3, int i20);

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        JavaI420Buffer allocate = JavaI420Buffer.allocate(i14, i15);
        int i16 = this.stride;
        if (i16 == 0) {
            i16 = this.width;
        }
        int i17 = i16;
        int i18 = this.sliceHeight;
        if (i18 == 0) {
            i18 = this.height;
        }
        nativeCropAndScale(i10, i11, i12, i13, i14, i15, this.data, i17, i18, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV());
        return allocate;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
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
        return null;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        int i10 = this.width;
        int i11 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i10, i11, i10, i11);
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer transform(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return null;
    }

    public NV21Buffer(int i10, int i11, int i12, int i13, ByteBuffer byteBuffer, Runnable runnable) {
        if (byteBuffer.isDirect()) {
            this.width = i10;
            this.height = i11;
            this.stride = i12;
            this.sliceHeight = i13;
            byte[] bArr = new byte[byteBuffer.remaining()];
            this.data = bArr;
            byteBuffer.get(bArr, 0, bArr.length);
            this.refCountDelegate = new RefCountDelegate(runnable);
            return;
        }
        throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
    }
}
