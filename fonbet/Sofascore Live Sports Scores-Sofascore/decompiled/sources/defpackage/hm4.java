package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class hm4 extends ffb {
    public final d74 g;
    public ByteBuffer h;
    public boolean i;
    public long j;
    public ByteBuffer k;
    public final int l;

    static {
        jh6.a("goog.exo.decoder");
    }

    public hm4(int i) {
        super(2);
        this.g = new d74(0);
        this.l = i;
    }

    public void A() {
        this.b = 0;
        ByteBuffer byteBuffer = this.h;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.k;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.i = false;
    }

    public final ByteBuffer B(int i) {
        int i2 = this.l;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.h;
        throw new fm4(lnb.j(byteBuffer == null ? 0 : byteBuffer.capacity(), i, "Buffer too small (", " < ", ")"));
    }

    public final void C(int i) {
        ByteBuffer byteBuffer = this.h;
        if (byteBuffer == null) {
            this.h = B(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.h = byteBuffer;
            return;
        }
        ByteBuffer B = B(i2);
        B.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            B.put(byteBuffer);
        }
        this.h = B;
    }

    public final void D() {
        ByteBuffer byteBuffer = this.h;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.k;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
