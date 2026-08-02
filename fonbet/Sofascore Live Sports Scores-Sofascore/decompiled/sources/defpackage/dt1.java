package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dt1 extends im4 {
    public long n;
    public int o;
    public int p;

    @Override // defpackage.im4
    public final void A() {
        super.A();
        this.o = 0;
    }

    public final boolean E(im4 im4Var) {
        ByteBuffer byteBuffer;
        z1a.s(!im4Var.i(1073741824));
        z1a.s(!im4Var.i(268435456));
        z1a.s(!im4Var.i(4));
        if (F()) {
            if (this.o >= this.p) {
                return false;
            }
            ByteBuffer byteBuffer2 = im4Var.i;
            if (byteBuffer2 != null && (byteBuffer = this.i) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.o;
        this.o = i + 1;
        if (i == 0) {
            this.k = im4Var.k;
            if (im4Var.i(1)) {
                this.b = 1;
            }
        }
        ByteBuffer byteBuffer3 = im4Var.i;
        if (byteBuffer3 != null) {
            C(byteBuffer3.remaining());
            this.i.put(byteBuffer3);
        }
        this.n = im4Var.k;
        return true;
    }

    public final boolean F() {
        return this.o > 0;
    }
}
