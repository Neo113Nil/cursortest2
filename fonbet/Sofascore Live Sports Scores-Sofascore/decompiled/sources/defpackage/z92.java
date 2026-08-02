package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class z92 implements cwh {
    public final ByteBuffer a;
    public final int b;

    public z92(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        this.a = slice;
        this.b = slice.capacity();
    }

    @Override // defpackage.cwh
    public final long read(x52 x52Var, long j) {
        ByteBuffer byteBuffer = this.a;
        int position = byteBuffer.position();
        int i = this.b;
        if (position == i) {
            return -1L;
        }
        int position2 = (int) (byteBuffer.position() + j);
        if (position2 <= i) {
            i = position2;
        }
        byteBuffer.limit(i);
        return x52Var.write(byteBuffer);
    }

    @Override // defpackage.cwh
    public final pij timeout() {
        return pij.d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
