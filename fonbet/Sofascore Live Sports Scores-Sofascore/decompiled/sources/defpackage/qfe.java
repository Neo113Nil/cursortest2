package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qfe implements e2k {
    public final yi5 a;
    public final nm2 b = new nm2(new byte[10], 10, 3, (byte) 0);
    public int c = 0;
    public int d;
    public djj e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public qfe(yi5 yi5Var) {
        this.a = yi5Var;
    }

    @Override // defpackage.e2k
    public final void a(int i, j9e j9eVar) {
        long j;
        this.e.getClass();
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        yi5 yi5Var = this.a;
        if (i2 != 0) {
            int i5 = this.c;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    tgj.d0("Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        zzl.s();
                        return;
                    }
                    if (this.j != -1) {
                        tgj.d0("Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    yi5Var.c(j9eVar.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i6 = i;
        while (j9eVar.a() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                nm2 nm2Var = this.b;
                if (i7 != 1) {
                    if (i7 == i4) {
                        if (b(j9eVar, nm2Var.d, Math.min(10, this.i)) && b(j9eVar, null, this.i)) {
                            nm2Var.q(0);
                            if (this.f) {
                                nm2Var.t(4);
                                nm2Var.t(1);
                                nm2Var.t(1);
                                long i8 = (nm2Var.i(15) << 15) | (nm2Var.i(3) << 30) | nm2Var.i(15);
                                nm2Var.t(1);
                                if (!this.h && this.g) {
                                    nm2Var.t(4);
                                    nm2Var.t(1);
                                    nm2Var.t(1);
                                    nm2Var.t(1);
                                    this.e.b((nm2Var.i(3) << 30) | (nm2Var.i(15) << 15) | nm2Var.i(15));
                                    this.h = true;
                                }
                                j = this.e.b(i8);
                            } else {
                                j = C.TIME_UNSET;
                            }
                            i6 |= this.k ? 4 : 0;
                            yi5Var.g(i6, j);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i7 != 3) {
                            zzl.s();
                            return;
                        }
                        int a = j9eVar.a();
                        int i9 = this.j;
                        int i10 = i9 == i3 ? 0 : a - i9;
                        if (i10 > 0) {
                            a -= i10;
                            j9eVar.M(j9eVar.b + a);
                        }
                        yi5Var.b(j9eVar);
                        int i11 = this.j;
                        if (i11 != i3) {
                            int i12 = i11 - a;
                            this.j = i12;
                            if (i12 == 0) {
                                yi5Var.c(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (b(j9eVar, nm2Var.d, 9)) {
                    this.c = d() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                j9eVar.O(j9eVar.a());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    public final boolean b(j9e j9eVar, byte[] bArr, int i) {
        int min = Math.min(j9eVar.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            j9eVar.O(min);
        } else {
            j9eVar.k(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    @Override // defpackage.e2k
    public final void c(djj djjVar, pl6 pl6Var, c2k c2kVar) {
        this.e = djjVar;
        this.a.d(pl6Var, c2kVar);
    }

    public final boolean d() {
        nm2 nm2Var = this.b;
        nm2Var.q(0);
        int i = nm2Var.i(24);
        if (i != 1) {
            fn0.r(i, "Unexpected start code prefix: ");
            this.j = -1;
            return false;
        }
        nm2Var.t(8);
        int i2 = nm2Var.i(16);
        nm2Var.t(5);
        this.k = nm2Var.h();
        nm2Var.t(2);
        this.f = nm2Var.h();
        this.g = nm2Var.h();
        nm2Var.t(6);
        int i3 = nm2Var.i(8);
        this.i = i3;
        if (i2 == 0) {
            this.j = -1;
            return true;
        }
        int i4 = (i2 - 3) - i3;
        this.j = i4;
        if (i4 < 0) {
            tgj.d0("Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }

    @Override // defpackage.e2k
    public final void seek() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.seek();
    }
}
