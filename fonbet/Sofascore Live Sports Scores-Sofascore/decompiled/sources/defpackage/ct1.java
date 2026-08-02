package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ct1 extends hm4 {
    public long m;
    public int n;
    public int o;

    @Override // defpackage.hm4
    public final void A() {
        super.A();
        this.n = 0;
    }

    public final boolean E(hm4 hm4Var) {
        ByteBuffer byteBuffer;
        qx9.r(!hm4Var.i(1073741824));
        qx9.r(!hm4Var.i(268435456));
        qx9.r(!hm4Var.i(4));
        int i = this.n;
        if (i > 0) {
            if (i >= this.o || hm4Var.i(Integer.MIN_VALUE) != i(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = hm4Var.h;
            if (byteBuffer2 != null && (byteBuffer = this.h) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i2 = this.n;
        this.n = i2 + 1;
        if (i2 == 0) {
            this.j = hm4Var.j;
            if (hm4Var.i(1)) {
                this.b = 1;
            }
        }
        if (hm4Var.i(Integer.MIN_VALUE)) {
            this.b = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = hm4Var.h;
        if (byteBuffer3 != null) {
            C(byteBuffer3.remaining());
            this.h.put(byteBuffer3);
        }
        this.m = hm4Var.j;
        return true;
    }
}
