package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g59 implements xi5, yi5 {
    public static final float[] m = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public static final float[] n = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final /* synthetic */ int a;
    public final boolean[] b;
    public long c;
    public String d;
    public boolean e;
    public long f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public Object k;
    public Object l;

    public g59(b2h b2hVar) {
        this.a = 0;
        this.g = b2hVar;
        this.b = new boolean[4];
        e59 e59Var = new e59(0);
        e59Var.f = new byte[128];
        this.i = e59Var;
        this.f = C.TIME_UNSET;
        this.j = new w2d(178, 0);
        this.h = new nkk(4, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
    @Override // defpackage.yi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(j9e j9eVar) {
        j9e j9eVar2;
        int i;
        int i2;
        j9e j9eVar3;
        boolean z;
        int i3;
        int i4;
        float f;
        j9e j9eVar4 = j9eVar;
        j9e j9eVar5 = (j9e) this.h;
        e59 e59Var = (e59) this.i;
        w2d w2dVar = (w2d) this.j;
        ((f59) this.k).getClass();
        ((vsj) this.l).getClass();
        int i5 = j9eVar4.b;
        int i6 = j9eVar4.c;
        byte[] bArr = j9eVar4.a;
        this.c += j9eVar4.a();
        ((vsj) this.l).g(j9eVar4.a(), j9eVar4);
        while (true) {
            int q = kik.q(bArr, i5, i6, this.b);
            if (q == i6) {
                if (!this.e) {
                    e59Var.a(bArr, i5, i6);
                }
                ((f59) this.k).a(bArr, i5, i6);
                if (w2dVar != null) {
                    w2dVar.a(bArr, i5, i6);
                    return;
                }
                return;
            }
            int i7 = q + 3;
            byte b = j9eVar4.a[i7];
            int i8 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i9 = q - i5;
            if (this.e) {
                j9eVar2 = j9eVar5;
                i = i6;
                i2 = i7;
            } else {
                if (i9 > 0) {
                    e59Var.a(bArr, i5, q);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                int i11 = e59Var.c;
                if (i11 == 0) {
                    j9eVar2 = j9eVar5;
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 == 176) {
                        e59Var.c = 1;
                        e59Var.b = true;
                    }
                } else if (i11 == 1) {
                    j9eVar2 = j9eVar5;
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 != 181) {
                        tgj.d0("Unexpected start code value");
                        e59Var.b = false;
                        e59Var.d = 0;
                        e59Var.c = 0;
                    } else {
                        e59Var.c = 2;
                    }
                } else if (i11 != 2) {
                    i = i6;
                    if (i11 == 3) {
                        j9eVar2 = j9eVar5;
                        i2 = i7;
                        if ((b & 240) != 32) {
                            tgj.d0("Unexpected start code value");
                            i4 = 0;
                            e59Var.b = false;
                            e59Var.d = 0;
                            e59Var.c = 0;
                        } else {
                            i4 = 0;
                            e59Var.e = e59Var.d;
                            e59Var.c = 4;
                        }
                    } else {
                        if (i11 != 4) {
                            zzl.s();
                            return;
                        }
                        if (i8 == 179 || i8 == 181) {
                            e59Var.d -= i10;
                            e59Var.b = false;
                            vsj vsjVar = (vsj) this.l;
                            int i12 = e59Var.e;
                            String str = this.d;
                            str.getClass();
                            byte[] copyOf = Arrays.copyOf(e59Var.f, e59Var.d);
                            i2 = i7;
                            j9eVar2 = j9eVar5;
                            nm2 nm2Var = new nm2(copyOf, copyOf.length, 3, (byte) 0);
                            nm2Var.u(i12);
                            nm2Var.u(4);
                            nm2Var.s();
                            nm2Var.t(8);
                            if (nm2Var.h()) {
                                nm2Var.t(4);
                                nm2Var.t(3);
                            }
                            int i13 = nm2Var.i(4);
                            if (i13 == 15) {
                                int i14 = nm2Var.i(8);
                                int i15 = nm2Var.i(8);
                                if (i15 == 0) {
                                    tgj.d0("Invalid aspect ratio");
                                    f = 1.0f;
                                    if (nm2Var.h()) {
                                        nm2Var.t(2);
                                        nm2Var.t(1);
                                        if (nm2Var.h()) {
                                            nm2Var.t(15);
                                            nm2Var.s();
                                            nm2Var.t(15);
                                            nm2Var.s();
                                            nm2Var.t(15);
                                            nm2Var.s();
                                            nm2Var.t(3);
                                            nm2Var.t(11);
                                            nm2Var.s();
                                            nm2Var.t(15);
                                            nm2Var.s();
                                        }
                                    }
                                    if (nm2Var.i(2) != 0) {
                                        tgj.d0("Unhandled video object layer shape");
                                    }
                                    nm2Var.s();
                                    int i16 = nm2Var.i(16);
                                    nm2Var.s();
                                    if (nm2Var.h()) {
                                        if (i16 == 0) {
                                            tgj.d0("Invalid vop_increment_time_resolution");
                                        } else {
                                            int i17 = 0;
                                            for (int i18 = i16 - 1; i18 > 0; i18 >>= 1) {
                                                i17++;
                                            }
                                            nm2Var.t(i17);
                                        }
                                    }
                                    nm2Var.s();
                                    int i19 = nm2Var.i(13);
                                    nm2Var.s();
                                    int i20 = nm2Var.i(13);
                                    nm2Var.s();
                                    nm2Var.s();
                                    qm8 qm8Var = new qm8();
                                    qm8Var.a = str;
                                    qm8Var.m = sjc.p("video/mp2t");
                                    qm8Var.n = sjc.p(MimeTypes.VIDEO_MP4V);
                                    qm8Var.u = i19;
                                    qm8Var.v = i20;
                                    qm8Var.A = f;
                                    qm8Var.q = Collections.singletonList(copyOf);
                                    w1l.r(qm8Var, vsjVar);
                                    this.e = true;
                                } else {
                                    f = i14 / i15;
                                    if (nm2Var.h()) {
                                    }
                                    if (nm2Var.i(2) != 0) {
                                    }
                                    nm2Var.s();
                                    int i162 = nm2Var.i(16);
                                    nm2Var.s();
                                    if (nm2Var.h()) {
                                    }
                                    nm2Var.s();
                                    int i192 = nm2Var.i(13);
                                    nm2Var.s();
                                    int i202 = nm2Var.i(13);
                                    nm2Var.s();
                                    nm2Var.s();
                                    qm8 qm8Var2 = new qm8();
                                    qm8Var2.a = str;
                                    qm8Var2.m = sjc.p("video/mp2t");
                                    qm8Var2.n = sjc.p(MimeTypes.VIDEO_MP4V);
                                    qm8Var2.u = i192;
                                    qm8Var2.v = i202;
                                    qm8Var2.A = f;
                                    qm8Var2.q = Collections.singletonList(copyOf);
                                    w1l.r(qm8Var2, vsjVar);
                                    this.e = true;
                                }
                            } else if (i13 < 7) {
                                f = n[i13];
                                if (nm2Var.h()) {
                                }
                                if (nm2Var.i(2) != 0) {
                                }
                                nm2Var.s();
                                int i1622 = nm2Var.i(16);
                                nm2Var.s();
                                if (nm2Var.h()) {
                                }
                                nm2Var.s();
                                int i1922 = nm2Var.i(13);
                                nm2Var.s();
                                int i2022 = nm2Var.i(13);
                                nm2Var.s();
                                nm2Var.s();
                                qm8 qm8Var22 = new qm8();
                                qm8Var22.a = str;
                                qm8Var22.m = sjc.p("video/mp2t");
                                qm8Var22.n = sjc.p(MimeTypes.VIDEO_MP4V);
                                qm8Var22.u = i1922;
                                qm8Var22.v = i2022;
                                qm8Var22.A = f;
                                qm8Var22.q = Collections.singletonList(copyOf);
                                w1l.r(qm8Var22, vsjVar);
                                this.e = true;
                            } else {
                                tgj.d0("Invalid aspect ratio");
                                f = 1.0f;
                                if (nm2Var.h()) {
                                }
                                if (nm2Var.i(2) != 0) {
                                }
                                nm2Var.s();
                                int i16222 = nm2Var.i(16);
                                nm2Var.s();
                                if (nm2Var.h()) {
                                }
                                nm2Var.s();
                                int i19222 = nm2Var.i(13);
                                nm2Var.s();
                                int i20222 = nm2Var.i(13);
                                nm2Var.s();
                                nm2Var.s();
                                qm8 qm8Var222 = new qm8();
                                qm8Var222.a = str;
                                qm8Var222.m = sjc.p("video/mp2t");
                                qm8Var222.n = sjc.p(MimeTypes.VIDEO_MP4V);
                                qm8Var222.u = i19222;
                                qm8Var222.v = i20222;
                                qm8Var222.A = f;
                                qm8Var222.q = Collections.singletonList(copyOf);
                                w1l.r(qm8Var222, vsjVar);
                                this.e = true;
                            }
                        } else {
                            j9eVar2 = j9eVar5;
                            i2 = i7;
                            i4 = 0;
                        }
                    }
                } else {
                    j9eVar2 = j9eVar5;
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 > 31) {
                        tgj.d0("Unexpected start code value");
                        e59Var.b = false;
                        e59Var.d = 0;
                        e59Var.c = 0;
                    } else {
                        e59Var.c = 3;
                    }
                }
                e59Var.a(e59.h, i4, 3);
            }
            ((f59) this.k).a(bArr, i5, q);
            if (w2dVar != null) {
                if (i9 > 0) {
                    w2dVar.a(bArr, i5, q);
                    i3 = 0;
                } else {
                    i3 = -i9;
                }
                if (w2dVar.b(i3)) {
                    int d0 = kik.d0((byte[]) w2dVar.e, w2dVar.f);
                    String str2 = nik.a;
                    j9eVar3 = j9eVar2;
                    j9eVar3.L((byte[]) w2dVar.e, d0);
                    ((ejg) this.g).e(this.f, j9eVar3);
                } else {
                    j9eVar3 = j9eVar2;
                }
                if (i8 == 178) {
                    j9eVar4 = j9eVar;
                    z = true;
                    if (j9eVar4.a[q + 2] == 1) {
                        w2dVar.e(i8);
                    }
                    int i21 = i - q;
                    ((f59) this.k).b(this.c - i21, i21, this.e);
                    f59 f59Var = (f59) this.k;
                    long j = this.f;
                    f59Var.e = i8;
                    f59Var.d = false;
                    f59Var.b = (i8 != 182 || i8 == 179) ? z : false;
                    if (i8 == 182) {
                        z = false;
                    }
                    f59Var.c = z;
                    f59Var.f = 0;
                    f59Var.h = j;
                    j9eVar5 = j9eVar3;
                    i6 = i;
                    i5 = i2;
                } else {
                    j9eVar4 = j9eVar;
                }
            } else {
                j9eVar4 = j9eVar;
                j9eVar3 = j9eVar2;
            }
            z = true;
            int i212 = i - q;
            ((f59) this.k).b(this.c - i212, i212, this.e);
            f59 f59Var2 = (f59) this.k;
            long j2 = this.f;
            f59Var2.e = i8;
            f59Var2.d = false;
            f59Var2.b = (i8 != 182 || i8 == 179) ? z : false;
            if (i8 == 182) {
            }
            f59Var2.c = z;
            f59Var2.f = 0;
            f59Var2.h = j2;
            j9eVar5 = j9eVar3;
            i6 = i;
            i5 = i2;
        }
    }

    @Override // defpackage.yi5
    public void c(boolean z) {
        ((f59) this.k).getClass();
        if (z) {
            ((f59) this.k).b(this.c, 0, this.e);
            f59 f59Var = (f59) this.k;
            f59Var.b = false;
            f59Var.c = false;
            f59Var.d = false;
            f59Var.e = -1;
        }
    }

    @Override // defpackage.yi5
    public void d(pl6 pl6Var, c2k c2kVar) {
        c2kVar.a();
        c2kVar.b();
        this.d = c2kVar.f;
        c2kVar.b();
        vsj mo2track = pl6Var.mo2track(c2kVar.e, 2);
        this.l = mo2track;
        this.k = new f59(mo2track, 1);
        ((ejg) this.g).g(pl6Var, c2kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02bf  */
    @Override // defpackage.xi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(nkk nkkVar) {
        nkk nkkVar2;
        int i;
        int i2;
        nkk nkkVar3;
        f59 f59Var;
        byte[] bArr;
        long j;
        int i3;
        int i4;
        nkk nkkVar4 = nkkVar;
        nkk nkkVar5 = (nkk) this.h;
        e59 e59Var = (e59) this.i;
        w2d w2dVar = (w2d) this.j;
        qx9.u((f59) this.k);
        qx9.u((usj) this.l);
        int i5 = nkkVar4.b;
        int i6 = nkkVar4.c;
        byte[] bArr2 = nkkVar4.a;
        this.c += nkkVar4.c();
        ((usj) this.l).d(nkkVar4.c(), nkkVar4);
        while (true) {
            int L = hkg.L(bArr2, i5, i6, this.b);
            if (L == i6) {
                if (!this.e) {
                    e59Var.a(bArr2, i5, i6);
                }
                ((f59) this.k).a(bArr2, i5, i6);
                if (w2dVar != null) {
                    w2dVar.a(bArr2, i5, i6);
                    return;
                }
                return;
            }
            int i7 = L + 3;
            byte b = nkkVar4.a[i7];
            int i8 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i9 = L - i5;
            if (this.e) {
                nkkVar2 = nkkVar5;
                i = i6;
                i2 = i7;
            } else {
                if (i9 > 0) {
                    e59Var.a(bArr2, i5, L);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                int i11 = e59Var.c;
                if (i11 != 0) {
                    i = i6;
                    if (i11 == 1) {
                        nkkVar2 = nkkVar5;
                        i2 = i7;
                        i4 = 0;
                        if (i8 != 181) {
                            m6k.f0();
                            e59Var.b = false;
                            e59Var.d = 0;
                            e59Var.c = 0;
                        } else {
                            e59Var.c = 2;
                        }
                    } else if (i11 == 2) {
                        nkkVar2 = nkkVar5;
                        i2 = i7;
                        i4 = 0;
                        if (i8 > 31) {
                            m6k.f0();
                            e59Var.b = false;
                            e59Var.d = 0;
                            e59Var.c = 0;
                        } else {
                            e59Var.c = 3;
                        }
                    } else if (i11 == 3) {
                        nkkVar2 = nkkVar5;
                        i2 = i7;
                        if ((b & 240) != 32) {
                            m6k.f0();
                            i4 = 0;
                            e59Var.b = false;
                            e59Var.d = 0;
                            e59Var.c = 0;
                        } else {
                            i4 = 0;
                            e59Var.e = e59Var.d;
                            e59Var.c = 4;
                        }
                    } else {
                        if (i11 != 4) {
                            zzl.s();
                            return;
                        }
                        if (i8 == 179 || i8 == 181) {
                            e59Var.d -= i10;
                            e59Var.b = false;
                            usj usjVar = (usj) this.l;
                            int i12 = e59Var.e;
                            String str = this.d;
                            str.getClass();
                            byte[] copyOf = Arrays.copyOf(e59Var.f, e59Var.d);
                            i2 = i7;
                            nkkVar2 = nkkVar5;
                            nm2 nm2Var = new nm2(copyOf, copyOf.length, 2, (byte) 0);
                            nm2Var.u(i12);
                            nm2Var.u(4);
                            nm2Var.s();
                            nm2Var.t(8);
                            if (nm2Var.h()) {
                                nm2Var.t(4);
                                nm2Var.t(3);
                            }
                            int i13 = nm2Var.i(4);
                            float f = 1.0f;
                            if (i13 == 15) {
                                int i14 = nm2Var.i(8);
                                int i15 = nm2Var.i(8);
                                if (i15 == 0) {
                                    m6k.f0();
                                } else {
                                    f = i14 / i15;
                                }
                            } else if (i13 < 7) {
                                f = m[i13];
                            } else {
                                m6k.f0();
                            }
                            if (nm2Var.h()) {
                                nm2Var.t(2);
                                nm2Var.t(1);
                                if (nm2Var.h()) {
                                    nm2Var.t(15);
                                    nm2Var.s();
                                    nm2Var.t(15);
                                    nm2Var.s();
                                    nm2Var.t(15);
                                    nm2Var.s();
                                    nm2Var.t(3);
                                    nm2Var.t(11);
                                    nm2Var.s();
                                    nm2Var.t(15);
                                    nm2Var.s();
                                }
                            }
                            if (nm2Var.i(2) != 0) {
                                m6k.f0();
                            }
                            nm2Var.s();
                            int i16 = nm2Var.i(16);
                            nm2Var.s();
                            if (nm2Var.h()) {
                                if (i16 == 0) {
                                    m6k.f0();
                                } else {
                                    int i17 = 0;
                                    for (int i18 = i16 - 1; i18 > 0; i18 >>= 1) {
                                        i17++;
                                    }
                                    nm2Var.t(i17);
                                }
                            }
                            nm2Var.s();
                            int i19 = nm2Var.i(13);
                            nm2Var.s();
                            int i20 = nm2Var.i(13);
                            nm2Var.s();
                            nm2Var.s();
                            pm8 pm8Var = new pm8();
                            pm8Var.a = str;
                            pm8Var.k = MimeTypes.VIDEO_MP4V;
                            pm8Var.p = i19;
                            pm8Var.q = i20;
                            pm8Var.t = f;
                            pm8Var.m = Collections.singletonList(copyOf);
                            usjVar.a(new sm8(pm8Var));
                            this.e = true;
                        } else {
                            nkkVar2 = nkkVar5;
                            i2 = i7;
                            i4 = 0;
                        }
                    }
                } else {
                    nkkVar2 = nkkVar5;
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 == 176) {
                        e59Var.c = 1;
                        e59Var.b = true;
                    }
                }
                e59Var.a(e59.g, i4, 3);
            }
            ((f59) this.k).a(bArr2, i5, L);
            if (w2dVar != null) {
                if (i9 > 0) {
                    w2dVar.a(bArr2, i5, L);
                    i3 = 0;
                } else {
                    i3 = -i9;
                }
                if (w2dVar.b(i3)) {
                    int t0 = hkg.t0((byte[]) w2dVar.e, w2dVar.f);
                    int i21 = lik.a;
                    nkkVar3 = nkkVar2;
                    nkkVar3.C((byte[]) w2dVar.e, t0);
                    ((b2h) this.g).a(this.f, nkkVar3);
                } else {
                    nkkVar3 = nkkVar2;
                }
                if (i8 == 178) {
                    nkkVar4 = nkkVar;
                    if (nkkVar4.a[L + 2] == 1) {
                        w2dVar.e(i8);
                    }
                    int i22 = i - L;
                    long j2 = this.c - i22;
                    f59Var = (f59) this.k;
                    boolean z = this.e;
                    if (f59Var.e == 182 && z && f59Var.b) {
                        j = f59Var.h;
                        if (j != C.TIME_UNSET) {
                            bArr = bArr2;
                            ((usj) f59Var.i).c(j, f59Var.d ? 1 : 0, (int) (j2 - f59Var.g), i22, null);
                            if (f59Var.e != 179) {
                                f59Var.g = j2;
                            }
                            f59 f59Var2 = (f59) this.k;
                            long j3 = this.f;
                            f59Var2.e = i8;
                            f59Var2.d = false;
                            f59Var2.b = i8 != 182 || i8 == 179;
                            f59Var2.c = i8 == 182;
                            f59Var2.f = 0;
                            f59Var2.h = j3;
                            nkkVar5 = nkkVar3;
                            bArr2 = bArr;
                            i6 = i;
                            i5 = i2;
                        }
                    }
                    bArr = bArr2;
                    if (f59Var.e != 179) {
                    }
                    f59 f59Var22 = (f59) this.k;
                    long j32 = this.f;
                    f59Var22.e = i8;
                    f59Var22.d = false;
                    f59Var22.b = i8 != 182 || i8 == 179;
                    f59Var22.c = i8 == 182;
                    f59Var22.f = 0;
                    f59Var22.h = j32;
                    nkkVar5 = nkkVar3;
                    bArr2 = bArr;
                    i6 = i;
                    i5 = i2;
                } else {
                    nkkVar4 = nkkVar;
                }
            } else {
                nkkVar4 = nkkVar;
                nkkVar3 = nkkVar2;
            }
            int i222 = i - L;
            long j22 = this.c - i222;
            f59Var = (f59) this.k;
            boolean z2 = this.e;
            if (f59Var.e == 182) {
                j = f59Var.h;
                if (j != C.TIME_UNSET) {
                }
            }
            bArr = bArr2;
            if (f59Var.e != 179) {
            }
            f59 f59Var222 = (f59) this.k;
            long j322 = this.f;
            f59Var222.e = i8;
            f59Var222.d = false;
            f59Var222.b = i8 != 182 || i8 == 179;
            f59Var222.c = i8 == 182;
            f59Var222.f = 0;
            f59Var222.h = j322;
            nkkVar5 = nkkVar3;
            bArr2 = bArr;
            i6 = i;
            i5 = i2;
        }
    }

    @Override // defpackage.xi5
    public final void g(int i, long j) {
        switch (this.a) {
            case 0:
                if (j != C.TIME_UNSET) {
                    this.f = j;
                    break;
                }
                break;
            default:
                this.f = j;
                break;
        }
    }

    @Override // defpackage.xi5
    public void h(ol6 ol6Var, c2k c2kVar) {
        c2kVar.a();
        c2kVar.b();
        this.d = c2kVar.f;
        c2kVar.b();
        usj track = ol6Var.track(c2kVar.e, 2);
        this.l = track;
        this.k = new f59(track, 0);
        ((b2h) this.g).b(ol6Var, c2kVar);
    }

    @Override // defpackage.xi5
    public final void seek() {
        int i = this.a;
        Object obj = this.j;
        Object obj2 = this.i;
        boolean[] zArr = this.b;
        switch (i) {
            case 0:
                hkg.z(zArr);
                e59 e59Var = (e59) obj2;
                e59Var.b = false;
                e59Var.d = 0;
                e59Var.c = 0;
                f59 f59Var = (f59) this.k;
                if (f59Var != null) {
                    f59Var.b = false;
                    f59Var.c = false;
                    f59Var.d = false;
                    f59Var.e = -1;
                }
                w2d w2dVar = (w2d) obj;
                if (w2dVar != null) {
                    w2dVar.d();
                }
                this.c = 0L;
                this.f = C.TIME_UNSET;
                break;
            default:
                kik.m(zArr);
                e59 e59Var2 = (e59) obj2;
                e59Var2.b = false;
                e59Var2.d = 0;
                e59Var2.c = 0;
                f59 f59Var2 = (f59) this.k;
                if (f59Var2 != null) {
                    f59Var2.b = false;
                    f59Var2.c = false;
                    f59Var2.d = false;
                    f59Var2.e = -1;
                }
                w2d w2dVar2 = (w2d) obj;
                if (w2dVar2 != null) {
                    w2dVar2.d();
                }
                this.c = 0L;
                this.f = C.TIME_UNSET;
                break;
        }
    }

    @Override // defpackage.xi5
    public void packetFinished() {
    }

    public g59(ejg ejgVar) {
        this.a = 1;
        this.g = ejgVar;
        this.b = new boolean[4];
        e59 e59Var = new e59(1);
        e59Var.f = new byte[128];
        this.i = e59Var;
        this.f = C.TIME_UNSET;
        this.j = new w2d(178, 1);
        this.h = new j9e();
    }
}
