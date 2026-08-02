package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kla implements yi5 {
    public final String a;
    public final int b;
    public final j9e c;
    public final nm2 d;
    public vsj e;
    public String f;
    public b g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public kla(String str, int i) {
        this.a = str;
        this.b = i;
        j9e j9eVar = new j9e(1024);
        this.c = j9eVar;
        byte[] bArr = j9eVar.a;
        this.d = new nm2(bArr, bArr.length, 3, (byte) 0);
        this.l = C.TIME_UNSET;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x019c, code lost:
    
        if (r23.m == false) goto L89;
     */
    @Override // defpackage.yi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(j9e j9eVar) {
        int i;
        boolean h;
        this.e.getClass();
        while (j9eVar.a() > 0) {
            int i2 = this.h;
            if (i2 != 0) {
                if (i2 != 1) {
                    j9e j9eVar2 = this.c;
                    nm2 nm2Var = this.d;
                    if (i2 == 2) {
                        int A = ((this.k & (-225)) << 8) | j9eVar.A();
                        this.j = A;
                        if (A > j9eVar2.a.length) {
                            j9eVar2.K(A);
                            byte[] bArr = j9eVar2.a;
                            nm2Var.p(bArr, bArr.length);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i2 != 3) {
                            zzl.s();
                            return;
                        }
                        int min = Math.min(j9eVar.a(), this.j - this.i);
                        j9eVar.k(nm2Var.d, this.i, min);
                        int i3 = this.i + min;
                        this.i = i3;
                        if (i3 == this.j) {
                            nm2Var.q(0);
                            if (!nm2Var.h()) {
                                this.m = true;
                                int i4 = nm2Var.i(1);
                                int i5 = i4 == 1 ? nm2Var.i(1) : 0;
                                this.n = i5;
                                if (i5 != 0) {
                                    throw s9e.a(null, null);
                                }
                                if (i4 == 1) {
                                    nm2Var.i((nm2Var.i(2) + 1) * 8);
                                }
                                if (!nm2Var.h()) {
                                    throw s9e.a(null, null);
                                }
                                this.o = nm2Var.i(6);
                                int i6 = nm2Var.i(4);
                                int i7 = nm2Var.i(3);
                                if (i6 != 0 || i7 != 0) {
                                    throw s9e.a(null, null);
                                }
                                if (i4 == 0) {
                                    int g = nm2Var.g();
                                    int b = nm2Var.b();
                                    d0 K = lz.K(nm2Var, true);
                                    this.v = K.c;
                                    this.s = K.a;
                                    this.u = K.b;
                                    int b2 = b - nm2Var.b();
                                    nm2Var.q(g);
                                    byte[] bArr2 = new byte[(b2 + 7) / 8];
                                    nm2Var.j(b2, bArr2);
                                    qm8 qm8Var = new qm8();
                                    qm8Var.a = this.f;
                                    qm8Var.m = sjc.p("video/mp2t");
                                    qm8Var.n = sjc.p(MimeTypes.AUDIO_AAC);
                                    qm8Var.j = this.v;
                                    qm8Var.F = this.u;
                                    qm8Var.G = this.s;
                                    qm8Var.q = Collections.singletonList(bArr2);
                                    qm8Var.d = this.a;
                                    qm8Var.f = this.b;
                                    b bVar = new b(qm8Var);
                                    if (!bVar.equals(this.g)) {
                                        this.g = bVar;
                                        this.t = 1024000000 / bVar.H;
                                        this.e.d(bVar);
                                    }
                                } else {
                                    int b3 = nm2Var.b();
                                    d0 K2 = lz.K(nm2Var, true);
                                    this.v = K2.c;
                                    this.s = K2.a;
                                    this.u = K2.b;
                                    nm2Var.t(nm2Var.i((nm2Var.i(2) + 1) * 8) - (b3 - nm2Var.b()));
                                }
                                int i8 = nm2Var.i(3);
                                this.p = i8;
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
                                this.q = h2;
                                this.r = 0L;
                                if (h2) {
                                    if (i4 == 1) {
                                        this.r = nm2Var.i((nm2Var.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            h = nm2Var.h();
                                            this.r = (this.r << 8) + nm2Var.i(8);
                                        } while (h);
                                    }
                                }
                                if (nm2Var.h()) {
                                    nm2Var.t(8);
                                }
                            }
                            if (this.n != 0) {
                                throw s9e.a(null, null);
                            }
                            if (this.o != 0) {
                                throw s9e.a(null, null);
                            }
                            if (this.p != 0) {
                                throw s9e.a(null, null);
                            }
                            int i9 = 0;
                            do {
                                i = nm2Var.i(8);
                                i9 += i;
                            } while (i == 255);
                            int g2 = nm2Var.g();
                            if ((g2 & 7) == 0) {
                                j9eVar2.N(g2 >> 3);
                            } else {
                                nm2Var.j(i9 * 8, j9eVar2.a);
                                j9eVar2.N(0);
                            }
                            this.e.g(i9, j9eVar2);
                            z1a.E(this.l != C.TIME_UNSET);
                            this.e.a(this.l, 1, i9, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                nm2Var.t((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int A2 = j9eVar.A();
                    if ((A2 & 224) == 224) {
                        this.k = A2;
                        this.h = 2;
                    } else if (A2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (j9eVar.A() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // defpackage.yi5
    public final void d(pl6 pl6Var, c2k c2kVar) {
        c2kVar.a();
        c2kVar.b();
        this.e = pl6Var.mo2track(c2kVar.e, 1);
        c2kVar.b();
        this.f = c2kVar.f;
    }

    @Override // defpackage.yi5
    public final void g(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.yi5
    public final void seek() {
        this.h = 0;
        this.l = C.TIME_UNSET;
        this.m = false;
    }

    @Override // defpackage.yi5
    public final void c(boolean z) {
    }
}
