package io.agora.base.internal.video;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class HardwareBufferHelper {
    private final long nativeHandle = nativeObjectInit();

    private native int nativeGetOesTextureId(long j10);

    private native long nativeObjectInit();

    private native boolean nativePrepare(long j10, int i10, int i11, int i12, long j11, boolean z10);

    private native boolean nativeReadFrame(long j10, int i10, int i11, int i12, int i13, ByteBuffer byteBuffer);

    private native void nativeRelease(long j10);

    public int getOesTextureId() {
        return nativeGetOesTextureId(this.nativeHandle);
    }

    public boolean prepare(int i10, int i11, int i12, long j10, boolean z10) {
        return nativePrepare(this.nativeHandle, i10, i11, i12, j10, z10);
    }

    public boolean readFrame(int i10, int i11, int i12, int i13, ByteBuffer byteBuffer) {
        return nativeReadFrame(this.nativeHandle, i10, i11, i12, i13, byteBuffer);
    }

    public void release() {
        nativeRelease(this.nativeHandle);
    }
}
