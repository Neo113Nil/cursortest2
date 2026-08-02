package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pfe implements d2k {
    public final xi5 a;
    public final nm2 b = new nm2(new byte[10], 10, 2, (byte) 0);
    public int c = 0;
    public int d;
    public cjj e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public pfe(xi5 xi5Var) {
        this.a = xi5Var;
    }

    @Override // defpackage.d2k
    public final void a(int i, nkk nkkVar) {
        int i2;
        int i3;
        int i4;
        long j;
        qx9.u(this.e);
        int i5 = i & 1;
        xi5 xi5Var = this.a;
        int i6 = 2;
        int i7 = 0;
        if (i5 != 0) {
            int i8 = this.c;
            if (i8 != 0 && i8 != 1) {
                if (i8 == 2) {
                    m6k.f0();
                } else if (i8 != 3) {
                    zzl.s();
                    return;
                } else {
                    if (this.j != -1) {
                        m6k.f0();
                    }
                    xi5Var.packetFinished();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i9 = i;
        while (nkkVar.c() > 0) {
            int i10 = this.c;
            if (i10 != 0) {
                nm2 nm2Var = this.b;
                if (i10 != 1) {
                    if (i10 == i6) {
                        if (b(nkkVar, nm2Var.d, Math.min(10, this.i)) && b(nkkVar, null, this.i)) {
                            nm2Var.q(i7);
                            if (this.f) {
                                nm2Var.t(4);
                                nm2Var.t(1);
                                nm2Var.t(1);
                                long i11 = (nm2Var.i(15) << 15) | (nm2Var.i(3) << 30) | nm2Var.i(15);
                                nm2Var.t(1);
                                if (!this.h && this.g) {
                                    nm2Var.t(4);
                                    nm2Var.t(1);
                                    nm2Var.t(1);
                                    nm2Var.t(1);
                                    this.e.b((nm2Var.i(3) << 30) | (nm2Var.i(15) << 15) | nm2Var.i(15));
                                    this.h = true;
                                }
                                j = this.e.b(i11);
                            } else {
                                j = C.TIME_UNSET;
                            }
                            i9 |= this.k ? 4 : 0;
                            xi5Var.g(i9, j);
                            this.c = 3;
                            this.d = 0;
                            i7 = 0;
                            i6 = 2;
                        }
                    } else {
                        if (i10 != 3) {
                            zzl.s();
                            return;
                        }
                        int c = nkkVar.c();
                        int i12 = this.j;
                        int i13 = i12 == -1 ? i7 : c - i12;
                        if (i13 > 0) {
                            c -= i13;
                            nkkVar.D(nkkVar.b + c);
                        }
                        xi5Var.f(nkkVar);
                        int i14 = this.j;
                        if (i14 != -1) {
                            int i15 = i14 - c;
                            this.j = i15;
                            if (i15 == 0) {
                                xi5Var.packetFinished();
                                this.c = 1;
                                this.d = i7;
                            }
                        }
                    }
                    i2 = i6;
                    i3 = i7;
                } else {
                    i3 = i7;
                    if (b(nkkVar, nm2Var.d, 9)) {
                        nm2Var.q(i3);
                        if (nm2Var.i(24) != 1) {
                            m6k.f0();
                            this.j = -1;
                            i4 = 0;
                            i2 = 2;
                        } else {
                            nm2Var.t(8);
                            int i16 = nm2Var.i(16);
                            nm2Var.t(5);
                            this.k = nm2Var.h();
                            i2 = 2;
                            nm2Var.t(2);
                            this.f = nm2Var.h();
                            this.g = nm2Var.h();
                            nm2Var.t(6);
                            int i17 = nm2Var.i(8);
                            this.i = i17;
                            if (i16 == 0) {
                                this.j = -1;
                            } else {
                                int i18 = (i16 - 3) - i17;
                                this.j = i18;
                                if (i18 < 0) {
                                    m6k.f0();
                                    this.j = -1;
                                }
                            }
                            i4 = 2;
                        }
                        this.c = i4;
                        i3 = 0;
                        this.d = 0;
                    } else {
                        i2 = 2;
                    }
                }
            } else {
                i2 = i6;
                i3 = i7;
                nkkVar.F(nkkVar.c());
            }
            i7 = i3;
            i6 = i2;
        }
    }

    public final boolean b(nkk nkkVar, byte[] bArr, int i) {
        int min = Math.min(nkkVar.c(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            nkkVar.F(min);
        } else {
            nkkVar.e(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    @Override // defpackage.d2k
    public final void j(cjj cjjVar, ol6 ol6Var, c2k c2kVar) {
        this.e = cjjVar;
        this.a.h(ol6Var, c2kVar);
    }

    @Override // defpackage.d2k
    public final void seek() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.seek();
    }
}
