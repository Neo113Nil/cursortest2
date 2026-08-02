package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jla implements xi5 {
    public final String a;
    public final nkk b;
    public final nm2 c;
    public usj d;
    public String e;
    public sm8 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public jla(String str) {
        this.a = str;
        nkk nkkVar = new nkk(1024);
        this.b = nkkVar;
        byte[] bArr = nkkVar.a;
        this.c = new nm2(bArr, bArr.length, 2, (byte) 0);
        this.k = C.TIME_UNSET;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x018c, code lost:
    
        if (r23.l == false) goto L88;
     */
    @Override // defpackage.xi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(nkk nkkVar) {
        int i;
        boolean h;
        qx9.u(this.d);
        while (nkkVar.c() > 0) {
            int i2 = this.g;
            if (i2 != 0) {
                if (i2 != 1) {
                    nkk nkkVar2 = this.b;
                    nm2 nm2Var = this.c;
                    if (i2 == 2) {
                        int s = ((this.j & (-225)) << 8) | nkkVar.s();
                        this.i = s;
                        if (s > nkkVar2.a.length) {
                            nkkVar2.B(s);
                            byte[] bArr = nkkVar2.a;
                            nm2Var.p(bArr, bArr.length);
                        }
                        this.h = 0;
                        this.g = 3;
                    } else {
                        if (i2 != 3) {
                            zzl.s();
                            return;
                        }
                        int min = Math.min(nkkVar.c(), this.i - this.h);
                        nkkVar.e(nm2Var.d, this.h, min);
                        int i3 = this.h + min;
                        this.h = i3;
                        if (i3 == this.i) {
                            nm2Var.q(0);
                            if (!nm2Var.h()) {
                                this.l = true;
                                int i4 = nm2Var.i(1);
                                int i5 = i4 == 1 ? nm2Var.i(1) : 0;
                                this.m = i5;
                                if (i5 != 0) {
                                    throw r9e.a(null, null);
                                }
                                if (i4 == 1) {
                                    nm2Var.i((nm2Var.i(2) + 1) * 8);
                                }
                                if (!nm2Var.h()) {
                                    throw r9e.a(null, null);
                                }
                                this.n = nm2Var.i(6);
                                int i6 = nm2Var.i(4);
                                int i7 = nm2Var.i(3);
                                if (i6 != 0 || i7 != 0) {
                                    throw r9e.a(null, null);
                                }
                                if (i4 == 0) {
                                    int g = nm2Var.g();
                                    int b = nm2Var.b();
                                    d0 O = kik.O(nm2Var, true);
                                    this.u = O.c;
                                    this.r = O.a;
                                    this.t = O.b;
                                    int b2 = b - nm2Var.b();
                                    nm2Var.q(g);
                                    byte[] bArr2 = new byte[(b2 + 7) / 8];
                                    nm2Var.j(b2, bArr2);
                                    pm8 pm8Var = new pm8();
                                    pm8Var.a = this.e;
                                    pm8Var.k = MimeTypes.AUDIO_AAC;
                                    pm8Var.h = this.u;
                                    pm8Var.x = this.t;
                                    pm8Var.y = this.r;
                                    pm8Var.m = Collections.singletonList(bArr2);
                                    pm8Var.c = this.a;
                                    sm8 sm8Var = new sm8(pm8Var);
                                    if (!sm8Var.equals(this.f)) {
                                        this.f = sm8Var;
                                        this.s = 1024000000 / sm8Var.z;
                                        this.d.a(sm8Var);
                                    }
                                } else {
                                    int b3 = nm2Var.b();
                                    d0 O2 = kik.O(nm2Var, true);
                                    this.u = O2.c;
                                    this.r = O2.a;
                                    this.t = O2.b;
                                    nm2Var.t(nm2Var.i((nm2Var.i(2) + 1) * 8) - (b3 - nm2Var.b()));
                                }
                                int i8 = nm2Var.i(3);
                                this.o = i8;
                                if (i8 == 0) {
                                    nm2Var.t(8);
                                } else if (i8 == 1) {
                                    nm2Var.t(9);
                                } else if (i8 == 3 || i8 == 4 || i8 == 5) {
                                    nm2Var.t(6);
                                } else {
                                    if (i8 != 6 && i8 != 7) {
                                        zzl.s();
                                        return;
                                    }
                                    nm2Var.t(1);
                                }
                                boolean h2 = nm2Var.h();
                                this.p = h2;
                                this.q = 0L;
                                if (h2) {
                                    if (i4 == 1) {
                                        this.q = nm2Var.i((nm2Var.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            h = nm2Var.h();
                                            this.q = (this.q << 8) + nm2Var.i(8);
                                        } while (h);
                                    }
                                }
                                if (nm2Var.h()) {
                                    nm2Var.t(8);
                                }
                            }
                            if (this.m != 0) {
                                throw r9e.a(null, null);
                            }
                            if (this.n != 0) {
                                throw r9e.a(null, null);
                            }
                            if (this.o != 0) {
                                throw r9e.a(null, null);
                            }
                            int i9 = 0;
                            do {
                                i = nm2Var.i(8);
                                i9 += i;
                            } while (i == 255);
                            int g2 = nm2Var.g();
                            if ((g2 & 7) == 0) {
                                nkkVar2.E(g2 >> 3);
                            } else {
                                nm2Var.j(i9 * 8, nkkVar2.a);
                                nkkVar2.E(0);
                            }
                            this.d.d(i9, nkkVar2);
                            long j = this.k;
                            if (j != C.TIME_UNSET) {
                                this.d.c(j, 1, i9, 0, null);
                                this.k += this.s;
                            }
                            if (this.p) {
                                nm2Var.t((int) this.q);
                            }
                            this.g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int s2 = nkkVar.s();
                    if ((s2 & 224) == 224) {
                        this.j = s2;
                        this.g = 2;
                    } else if (s2 != 86) {
                        this.g = 0;
                    }
                }
            } else if (nkkVar.s() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // defpackage.xi5
    public final void g(int i, long j) {
        if (j != C.TIME_UNSET) {
            this.k = j;
        }
    }

    @Override // defpackage.xi5
    public final void h(ol6 ol6Var, c2k c2kVar) {
        c2kVar.a();
        c2kVar.b();
        this.d = ol6Var.track(c2kVar.e, 1);
        c2kVar.b();
        this.e = c2kVar.f;
    }

    @Override // defpackage.xi5
    public final void seek() {
        this.g = 0;
        this.k = C.TIME_UNSET;
        this.l = false;
    }

    @Override // defpackage.xi5
    public final void packetFinished() {
    }
}
