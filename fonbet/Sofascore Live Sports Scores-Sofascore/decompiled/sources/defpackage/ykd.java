package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ykd {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;

    public ykd(xkd xkdVar) {
        boolean z;
        boolean h;
        byte b;
        byte b2;
        byte b3;
        int i = xkdVar.a;
        ByteBuffer byteBuffer = xkdVar.b;
        boolean z2 = true;
        z1a.s(i == 1);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        nm2 nm2Var = new nm2(bArr, remaining, 3, (byte) 0);
        this.g = nm2Var.i(3);
        nm2Var.s();
        boolean h2 = nm2Var.h();
        this.a = h2;
        if (h2) {
            nm2Var.i(5);
            this.b = false;
            this.h = false;
        } else {
            if (nm2Var.h()) {
                nm2Var.t(64);
                if (nm2Var.h()) {
                    int i2 = 0;
                    while (!nm2Var.h()) {
                        i2++;
                    }
                    if (i2 < 32) {
                        nm2Var.t(i2);
                    }
                }
                boolean h3 = nm2Var.h();
                this.b = h3;
                if (h3) {
                    nm2Var.t(47);
                }
            } else {
                this.b = false;
            }
            this.h = nm2Var.h();
            int i3 = nm2Var.i(5);
            for (int i4 = 0; i4 <= i3; i4++) {
                nm2Var.t(12);
                if (i4 == 0) {
                    if (nm2Var.i(5) > 7) {
                        nm2Var.h();
                    }
                } else if (nm2Var.i(5) > 7) {
                    nm2Var.s();
                }
                if (this.b) {
                    nm2Var.s();
                }
                if (this.h && nm2Var.h()) {
                    if (i4 == 0) {
                        nm2Var.i(4);
                    } else {
                        nm2Var.t(4);
                    }
                }
            }
        }
        int i5 = nm2Var.i(4);
        int i6 = nm2Var.i(4);
        nm2Var.t(i5 + 1);
        nm2Var.t(i6 + 1);
        if (this.a) {
            this.c = false;
            z = false;
        } else {
            z = nm2Var.h();
            this.c = z;
        }
        if (z) {
            nm2Var.t(4);
            nm2Var.t(3);
        }
        nm2Var.t(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            nm2Var.t(4);
            boolean h4 = nm2Var.h();
            if (h4) {
                nm2Var.t(2);
            }
            if (nm2Var.h()) {
                this.d = true;
                h = true;
            } else {
                h = nm2Var.h();
                this.d = h;
            }
            if (!h) {
                this.e = true;
            } else if (nm2Var.h()) {
                this.e = true;
            } else {
                this.e = nm2Var.h();
            }
            if (h4) {
                this.f = nm2Var.i(3) + 1;
            } else {
                this.f = 0;
            }
        }
        nm2Var.t(3);
        boolean h5 = (this.g == 2 && nm2Var.h()) ? nm2Var.h() : false;
        boolean h6 = this.g != 1 ? nm2Var.h() : false;
        if (nm2Var.h()) {
            b2 = (byte) nm2Var.i(8);
            b3 = (byte) nm2Var.i(8);
            b = (byte) nm2Var.i(8);
        } else {
            b = 0;
            b2 = 0;
            b3 = 0;
        }
        if (h6) {
            nm2Var.s();
        } else if (b2 != 1 || b3 != 13 || b != 0) {
            nm2Var.s();
            int i7 = this.g;
            if (i7 == 0) {
                r1 = true;
            } else if (i7 == 1) {
                z2 = false;
            } else if (h5) {
                boolean h7 = nm2Var.h();
                z2 = h7 ? nm2Var.h() : false;
                r1 = h7;
            } else {
                z2 = false;
                r1 = true;
            }
            if (r1 && z2) {
                nm2Var.i(2);
            }
        }
        nm2Var.s();
    }
}
