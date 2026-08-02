package io.agora.base.internal.video;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
class GPUPBOUtil {
    private long nativeHandle = nativeObjectInit();

    private native long nativeObjectInit();

    private native boolean nativeReadFrame(long j10, int i10, int i11, int i12, int i13, boolean z10, int i14, int i15, ByteBuffer byteBuffer, boolean z11);

    private native void nativeRelease(long j10);

    public boolean readFrame(int i10, int i11, int i12, int i13, boolean z10, int i14, int i15, ByteBuffer byteBuffer, boolean z11) {
        long j10 = this.nativeHandle;
        if (j10 == 0) {
            return false;
        }
        return nativeReadFrame(j10, i10, i11, i12, i13, z10, i14, i15, byteBuffer, z11);
    }

    public void release() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeRelease(j10);
            this.nativeHandle = 0L;
        }
    }
}
