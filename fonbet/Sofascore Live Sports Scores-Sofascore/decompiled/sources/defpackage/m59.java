package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class m59 implements xi5, yi5 {
    public final /* synthetic */ int a;
    public String b;
    public boolean c;
    public final boolean[] d;
    public long e;
    public long f;
    public final Object g;
    public Object h;
    public Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    public m59(b2h b2hVar) {
        this.a = 0;
        this.g = b2hVar;
        this.d = new boolean[3];
        this.j = new w2d(32, 0);
        this.k = new w2d(33, 0);
        this.l = new w2d(34, 0);
        this.m = new w2d(39, 0);
        this.n = new w2d(40, 0);
        this.f = C.TIME_UNSET;
        this.o = new nkk(4, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i, int i2, long j, long j2) {
        w2d w2dVar;
        w2d w2dVar2;
        w2d w2dVar3 = (w2d) this.l;
        w2d w2dVar4 = (w2d) this.k;
        w2d w2dVar5 = (w2d) this.j;
        w2d w2dVar6 = (w2d) this.n;
        w2d w2dVar7 = (w2d) this.m;
        jy0 jy0Var = (jy0) ((sx2) this.g).c;
        j9e j9eVar = (j9e) this.o;
        l59 l59Var = (l59) this.i;
        boolean z = this.c;
        if (l59Var.i && l59Var.f) {
            l59Var.l = l59Var.b;
            l59Var.i = false;
        } else if (l59Var.g || l59Var.f) {
            if (z && l59Var.h) {
                l59Var.a(i + ((int) (j - l59Var.a)));
            }
            l59Var.j = l59Var.a;
            l59Var.k = l59Var.d;
            l59Var.l = l59Var.b;
            l59Var.h = true;
        }
        if (!this.c) {
            w2dVar5.b(i2);
            w2dVar4.b(i2);
            w2dVar3.b(i2);
            if (w2dVar5.d && w2dVar4.d && w2dVar3.d) {
                String str = this.b;
                int i3 = w2dVar5.f;
                byte[] bArr = new byte[w2dVar4.f + i3 + w2dVar3.f];
                System.arraycopy((byte[]) w2dVar5.e, 0, bArr, 0, i3);
                w2dVar = w2dVar6;
                System.arraycopy((byte[]) w2dVar4.e, 0, bArr, w2dVar5.f, w2dVar4.f);
                System.arraycopy((byte[]) w2dVar3.e, 0, bArr, w2dVar5.f + w2dVar4.f, w2dVar3.f);
                c3d S = kik.S((byte[]) w2dVar4.e, 3, w2dVar4.f, null);
                y2d y2dVar = S.b;
                String a = y2dVar != null ? wz2.a(y2dVar.a, y2dVar.b, y2dVar.c, y2dVar.d, y2dVar.e, y2dVar.f) : null;
                qm8 qm8Var = new qm8();
                qm8Var.a = str;
                qm8Var.m = sjc.p("video/mp2t");
                qm8Var.n = sjc.p("video/hevc");
                qm8Var.j = a;
                qm8Var.u = S.e;
                qm8Var.v = S.f;
                qm8Var.w = S.g;
                qm8Var.x = S.h;
                qm8Var.D = new w13(S.k, S.l, S.m, S.c + 8, S.d + 8, null);
                qm8Var.A = S.i;
                qm8Var.p = S.j;
                qm8Var.E = S.a + 1;
                qm8Var.q = Collections.singletonList(bArr);
                b bVar = new b(qm8Var);
                ((vsj) this.h).d(bVar);
                int i4 = bVar.q;
                z1a.E(i4 != -1);
                jy0Var.f(i4);
                this.c = true;
                if (w2dVar7.b(i2)) {
                    j9eVar.L((byte[]) w2dVar7.e, kik.d0((byte[]) w2dVar7.e, w2dVar7.f));
                    j9eVar.O(5);
                    jy0Var.b(j2, j9eVar);
                }
                w2dVar2 = w2dVar;
                if (w2dVar2.b(i2)) {
                    return;
                }
                j9eVar.L((byte[]) w2dVar2.e, kik.d0((byte[]) w2dVar2.e, w2dVar2.f));
                j9eVar.O(5);
                jy0Var.b(j2, j9eVar);
                return;
            }
        }
        w2dVar = w2dVar6;
        if (w2dVar7.b(i2)) {
        }
        w2dVar2 = w2dVar;
        if (w2dVar2.b(i2)) {
        }
    }

    @Override // defpackage.yi5
    public void b(j9e j9eVar) {
        int i;
        ((vsj) this.h).getClass();
        String str = nik.a;
        while (j9eVar.a() > 0) {
            int i2 = j9eVar.b;
            int i3 = j9eVar.c;
            byte[] bArr = j9eVar.a;
            this.e += j9eVar.a();
            ((vsj) this.h).g(j9eVar.a(), j9eVar);
            while (i2 < i3) {
                int q = kik.q(bArr, i2, i3, this.d);
                if (q == i3) {
                    e(i2, i3, bArr);
                    return;
                }
                int i4 = (bArr[q + 3] & 126) >> 1;
                if (q <= 0 || bArr[q - 1] != 0) {
                    i = 3;
                } else {
                    q--;
                    i = 4;
                }
                int i5 = q;
                int i6 = i;
                int i7 = i5 - i2;
                if (i7 > 0) {
                    e(i2, i5, bArr);
                }
                int i8 = i3 - i5;
                long j = this.e - i8;
                a(i8, i7 < 0 ? -i7 : 0, j, this.f);
                i(j, i8, i4, this.f);
                i2 = i5 + i6;
            }
        }
    }

    @Override // defpackage.yi5
    public void c(boolean z) {
        ((vsj) this.h).getClass();
        String str = nik.a;
        if (z) {
            ((jy0) ((sx2) this.g).c).d(0);
            a(0, 0, this.e, this.f);
            i(this.e, 0, 48, this.f);
        }
    }

    @Override // defpackage.yi5
    public void d(pl6 pl6Var, c2k c2kVar) {
        c2kVar.a();
        c2kVar.b();
        this.b = c2kVar.f;
        c2kVar.b();
        vsj mo2track = pl6Var.mo2track(c2kVar.e, 2);
        this.h = mo2track;
        this.i = new l59(mo2track);
        ((sx2) this.g).j(pl6Var, c2kVar);
    }

    public final void e(int i, int i2, byte[] bArr) {
        int i3 = this.a;
        Object obj = this.n;
        Object obj2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        switch (i3) {
            case 0:
                l59 l59Var = (l59) this.i;
                if (l59Var.e) {
                    int i4 = l59Var.c;
                    int i5 = (i + 2) - i4;
                    if (i5 < i2) {
                        l59Var.f = (bArr[i5] & 128) != 0;
                        l59Var.e = false;
                    } else {
                        l59Var.c = (i2 - i) + i4;
                    }
                }
                if (!this.c) {
                    ((w2d) obj5).a(bArr, i, i2);
                    ((w2d) obj4).a(bArr, i, i2);
                    ((w2d) obj3).a(bArr, i, i2);
                }
                ((w2d) obj2).a(bArr, i, i2);
                ((w2d) obj).a(bArr, i, i2);
                break;
            default:
                l59 l59Var2 = (l59) this.i;
                if (l59Var2.e) {
                    int i6 = l59Var2.c;
                    int i7 = (i + 2) - i6;
                    if (i7 < i2) {
                        l59Var2.f = (bArr[i7] & 128) != 0;
                        l59Var2.e = false;
                    } else {
                        l59Var2.c = (i2 - i) + i6;
                    }
                }
                if (!this.c) {
                    ((w2d) obj5).a(bArr, i, i2);
                    ((w2d) obj4).a(bArr, i, i2);
                    ((w2d) obj3).a(bArr, i, i2);
                }
                ((w2d) obj2).a(bArr, i, i2);
                ((w2d) obj).a(bArr, i, i2);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f0  */
    @Override // defpackage.xi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(nkk nkkVar) {
        byte[] bArr;
        nkk nkkVar2;
        w2d w2dVar;
        w2d w2dVar2;
        w2d w2dVar3;
        w2d w2dVar4;
        usj[] usjVarArr;
        long j;
        long j2;
        nkk nkkVar3;
        usj[] usjVarArr2;
        long j3;
        boolean z;
        boolean z2;
        w2d w2dVar5;
        nkk nkkVar4 = nkkVar;
        w2d w2dVar6 = (w2d) this.m;
        w2d w2dVar7 = (w2d) this.n;
        w2d w2dVar8 = (w2d) this.j;
        w2d w2dVar9 = (w2d) this.k;
        w2d w2dVar10 = (w2d) this.l;
        qx9.u((usj) this.h);
        int i = lik.a;
        while (nkkVar4.c() > 0) {
            int i2 = nkkVar4.b;
            int i3 = nkkVar4.c;
            byte[] bArr2 = nkkVar4.a;
            this.e += nkkVar4.c();
            ((usj) this.h).d(nkkVar4.c(), nkkVar4);
            while (i2 < i3) {
                int L = hkg.L(bArr2, i2, i3, this.d);
                if (L == i3) {
                    e(i2, i3, bArr2);
                    return;
                }
                int i4 = L + 3;
                int i5 = (bArr2[i4] & 126) >> 1;
                int i6 = L - i2;
                if (i6 > 0) {
                    e(i2, L, bArr2);
                }
                int i7 = i3 - L;
                long j4 = this.e - i7;
                int i8 = i6 < 0 ? -i6 : 0;
                long j5 = this.f;
                usj[] usjVarArr3 = ((b2h) this.g).c;
                nkk nkkVar5 = (nkk) this.o;
                l59 l59Var = (l59) this.i;
                int i9 = i3;
                boolean z3 = this.c;
                if (l59Var.i && l59Var.f) {
                    l59Var.l = l59Var.b;
                    l59Var.i = false;
                } else if (l59Var.g || l59Var.f) {
                    if (z3 && l59Var.h) {
                        bArr = bArr2;
                        long j6 = l59Var.a;
                        int i10 = i7 + ((int) (j4 - j6));
                        long j7 = l59Var.k;
                        if (j7 != C.TIME_UNSET) {
                            ((usj) l59Var.m).c(j7, l59Var.l ? 1 : 0, (int) (j6 - l59Var.j), i10, null);
                        }
                    } else {
                        bArr = bArr2;
                    }
                    l59Var.j = l59Var.a;
                    l59Var.k = l59Var.d;
                    l59Var.l = l59Var.b;
                    l59Var.h = true;
                    if (!this.c) {
                        w2dVar8.b(i8);
                        w2dVar9.b(i8);
                        w2dVar10.b(i8);
                        if (w2dVar8.d && w2dVar9.d && w2dVar10.d) {
                            usj usjVar = (usj) this.h;
                            String str = this.b;
                            int i11 = w2dVar8.f;
                            j2 = j4;
                            byte[] bArr3 = new byte[w2dVar9.f + i11 + w2dVar10.f];
                            w2dVar = w2dVar7;
                            System.arraycopy((byte[]) w2dVar8.e, 0, bArr3, 0, i11);
                            usjVarArr = usjVarArr3;
                            System.arraycopy((byte[]) w2dVar9.e, 0, bArr3, w2dVar8.f, w2dVar9.f);
                            System.arraycopy((byte[]) w2dVar10.e, 0, bArr3, w2dVar8.f + w2dVar9.f, w2dVar10.f);
                            nm2 nm2Var = new nm2((byte[]) w2dVar9.e, 0, w2dVar9.f);
                            nm2Var.t(44);
                            int i12 = nm2Var.i(3);
                            nm2Var.s();
                            int i13 = nm2Var.i(2);
                            boolean h = nm2Var.h();
                            int i14 = nm2Var.i(5);
                            int i15 = 0;
                            for (int i16 = 0; i16 < 32; i16++) {
                                if (nm2Var.h()) {
                                    i15 |= 1 << i16;
                                }
                            }
                            int[] iArr = new int[6];
                            for (int i17 = 0; i17 < 6; i17++) {
                                iArr[i17] = nm2Var.i(8);
                            }
                            int i18 = nm2Var.i(8);
                            int i19 = 0;
                            for (int i20 = 0; i20 < i12; i20++) {
                                if (nm2Var.h()) {
                                    i19 += 89;
                                }
                                if (nm2Var.h()) {
                                    i19 += 8;
                                }
                            }
                            nm2Var.t(i19);
                            if (i12 > 0) {
                                nm2Var.t((8 - i12) * 2);
                            }
                            nm2Var.m();
                            int m = nm2Var.m();
                            if (m == 3) {
                                nm2Var.s();
                            }
                            int m2 = nm2Var.m();
                            int m3 = nm2Var.m();
                            if (nm2Var.h()) {
                                w2dVar4 = w2dVar10;
                                int m4 = nm2Var.m();
                                w2dVar3 = w2dVar9;
                                int m5 = nm2Var.m();
                                w2dVar2 = w2dVar8;
                                int m6 = nm2Var.m();
                                j = j5;
                                int m7 = nm2Var.m();
                                int i21 = (m == 1 || m == 2) ? 2 : 1;
                                nkkVar2 = nkkVar5;
                                int i22 = m == 1 ? 2 : 1;
                                m2 = lnb.x(m4, m5, i21, m2);
                                m3 = lnb.x(m6, m7, i22, m3);
                            } else {
                                nkkVar2 = nkkVar5;
                                w2dVar2 = w2dVar8;
                                w2dVar3 = w2dVar9;
                                w2dVar4 = w2dVar10;
                                j = j5;
                            }
                            nm2Var.m();
                            nm2Var.m();
                            int m8 = nm2Var.m();
                            for (int i23 = nm2Var.h() ? 0 : i12; i23 <= i12; i23++) {
                                nm2Var.m();
                                nm2Var.m();
                                nm2Var.m();
                            }
                            nm2Var.m();
                            nm2Var.m();
                            nm2Var.m();
                            nm2Var.m();
                            nm2Var.m();
                            nm2Var.m();
                            if (nm2Var.h() && nm2Var.h()) {
                                int i24 = 0;
                                while (i24 < 4) {
                                    for (int i25 = 0; i25 < 6; i25 += i24 == 3 ? 3 : 1) {
                                        if (nm2Var.h()) {
                                            int min = Math.min(64, 1 << ((i24 << 1) + 4));
                                            if (i24 > 1) {
                                                nm2Var.n();
                                            }
                                            for (int i26 = 0; i26 < min; i26++) {
                                                nm2Var.n();
                                            }
                                        } else {
                                            nm2Var.m();
                                        }
                                    }
                                    i24++;
                                }
                            }
                            nm2Var.t(2);
                            if (nm2Var.h()) {
                                nm2Var.t(8);
                                nm2Var.m();
                                nm2Var.m();
                                nm2Var.s();
                            }
                            int m9 = nm2Var.m();
                            boolean z4 = false;
                            int i27 = 0;
                            for (int i28 = 0; i28 < m9; i28++) {
                                if (i28 != 0) {
                                    z4 = nm2Var.h();
                                }
                                if (z4) {
                                    nm2Var.s();
                                    nm2Var.m();
                                    for (int i29 = 0; i29 <= i27; i29++) {
                                        if (nm2Var.h()) {
                                            nm2Var.s();
                                        }
                                    }
                                } else {
                                    int m10 = nm2Var.m();
                                    int m11 = nm2Var.m();
                                    int i30 = m10 + m11;
                                    for (int i31 = 0; i31 < m10; i31++) {
                                        nm2Var.m();
                                        nm2Var.s();
                                    }
                                    for (int i32 = 0; i32 < m11; i32++) {
                                        nm2Var.m();
                                        nm2Var.s();
                                    }
                                    i27 = i30;
                                }
                            }
                            if (nm2Var.h()) {
                                for (int i33 = 0; i33 < nm2Var.m(); i33++) {
                                    nm2Var.t(m8 + 5);
                                }
                            }
                            nm2Var.t(2);
                            float f = 1.0f;
                            if (nm2Var.h()) {
                                if (nm2Var.h()) {
                                    int i34 = nm2Var.i(8);
                                    if (i34 == 255) {
                                        int i35 = nm2Var.i(16);
                                        int i36 = nm2Var.i(16);
                                        if (i35 != 0 && i36 != 0) {
                                            f = i35 / i36;
                                        }
                                    } else {
                                        float[] fArr = hkg.s;
                                        if (i34 < 17) {
                                            f = fArr[i34];
                                        } else {
                                            m6k.f0();
                                        }
                                    }
                                }
                                if (nm2Var.h()) {
                                    nm2Var.s();
                                }
                                if (nm2Var.h()) {
                                    nm2Var.t(4);
                                    if (nm2Var.h()) {
                                        nm2Var.t(24);
                                    }
                                }
                                if (nm2Var.h()) {
                                    nm2Var.m();
                                    nm2Var.m();
                                }
                                nm2Var.s();
                                if (nm2Var.h()) {
                                    m3 *= 2;
                                }
                            }
                            String v = pco.v(i13, h, i14, i15, iArr, i18);
                            pm8 pm8Var = new pm8();
                            pm8Var.a = str;
                            pm8Var.k = "video/hevc";
                            pm8Var.h = v;
                            pm8Var.p = m2;
                            pm8Var.q = m3;
                            pm8Var.t = f;
                            pm8Var.m = Collections.singletonList(bArr3);
                            usjVar.a(new sm8(pm8Var));
                            this.c = true;
                            if (w2dVar6.b(i8)) {
                                nkkVar3 = nkkVar2;
                                nkkVar3.C((byte[]) w2dVar6.e, hkg.t0((byte[]) w2dVar6.e, w2dVar6.f));
                                nkkVar3.F(5);
                                usjVarArr2 = usjVarArr;
                                j3 = j;
                                zm2.q(j3, nkkVar3, usjVarArr2);
                            } else {
                                nkkVar3 = nkkVar2;
                                usjVarArr2 = usjVarArr;
                                j3 = j;
                            }
                            w2dVar7 = w2dVar;
                            if (w2dVar7.b(i8)) {
                                nkkVar3.C((byte[]) w2dVar7.e, hkg.t0((byte[]) w2dVar7.e, w2dVar7.f));
                                nkkVar3.F(5);
                                zm2.q(j3, nkkVar3, usjVarArr2);
                            }
                            long j8 = this.f;
                            l59 l59Var2 = (l59) this.i;
                            boolean z5 = this.c;
                            l59Var2.f = false;
                            l59Var2.g = false;
                            l59Var2.d = j8;
                            l59Var2.c = 0;
                            long j9 = j2;
                            l59Var2.a = j9;
                            if (i5 >= 32 || i5 == 40) {
                                z = false;
                            } else {
                                if (!l59Var2.h || l59Var2.i) {
                                    z = false;
                                } else {
                                    if (z5) {
                                        long j10 = l59Var2.k;
                                        if (j10 != C.TIME_UNSET) {
                                            ((usj) l59Var2.m).c(j10, l59Var2.l ? 1 : 0, (int) (j9 - l59Var2.j), i7, null);
                                        }
                                    }
                                    z = false;
                                    l59Var2.h = false;
                                }
                                if ((32 <= i5 && i5 <= 35) || i5 == 39) {
                                    z2 = true;
                                    l59Var2.g = !l59Var2.i;
                                    l59Var2.i = true;
                                    boolean z6 = (i5 >= 16 || i5 > 21) ? z : z2;
                                    l59Var2.b = z6;
                                    l59Var2.e = (!z6 || i5 <= 9) ? z2 : z;
                                    if (this.c) {
                                        w2dVar5 = w2dVar2;
                                        w2dVar5.e(i5);
                                        w2dVar9 = w2dVar3;
                                        w2dVar9.e(i5);
                                        w2dVar10 = w2dVar4;
                                        w2dVar10.e(i5);
                                    } else {
                                        w2dVar10 = w2dVar4;
                                        w2dVar9 = w2dVar3;
                                        w2dVar5 = w2dVar2;
                                    }
                                    w2dVar6.e(i5);
                                    w2dVar7.e(i5);
                                    w2dVar8 = w2dVar5;
                                    i2 = i4;
                                    i3 = i9;
                                    bArr2 = bArr;
                                }
                            }
                            z2 = true;
                            if (i5 >= 16) {
                            }
                            l59Var2.b = z6;
                            l59Var2.e = (!z6 || i5 <= 9) ? z2 : z;
                            if (this.c) {
                            }
                            w2dVar6.e(i5);
                            w2dVar7.e(i5);
                            w2dVar8 = w2dVar5;
                            i2 = i4;
                            i3 = i9;
                            bArr2 = bArr;
                        }
                    }
                    nkkVar2 = nkkVar5;
                    w2dVar = w2dVar7;
                    w2dVar2 = w2dVar8;
                    w2dVar3 = w2dVar9;
                    w2dVar4 = w2dVar10;
                    usjVarArr = usjVarArr3;
                    j = j5;
                    j2 = j4;
                    if (w2dVar6.b(i8)) {
                    }
                    w2dVar7 = w2dVar;
                    if (w2dVar7.b(i8)) {
                    }
                    long j82 = this.f;
                    l59 l59Var22 = (l59) this.i;
                    boolean z52 = this.c;
                    l59Var22.f = false;
                    l59Var22.g = false;
                    l59Var22.d = j82;
                    l59Var22.c = 0;
                    long j92 = j2;
                    l59Var22.a = j92;
                    if (i5 >= 32) {
                    }
                    z = false;
                    z2 = true;
                    if (i5 >= 16) {
                    }
                    l59Var22.b = z6;
                    l59Var22.e = (!z6 || i5 <= 9) ? z2 : z;
                    if (this.c) {
                    }
                    w2dVar6.e(i5);
                    w2dVar7.e(i5);
                    w2dVar8 = w2dVar5;
                    i2 = i4;
                    i3 = i9;
                    bArr2 = bArr;
                }
                bArr = bArr2;
                if (!this.c) {
                }
                nkkVar2 = nkkVar5;
                w2dVar = w2dVar7;
                w2dVar2 = w2dVar8;
                w2dVar3 = w2dVar9;
                w2dVar4 = w2dVar10;
                usjVarArr = usjVarArr3;
                j = j5;
                j2 = j4;
                if (w2dVar6.b(i8)) {
                }
                w2dVar7 = w2dVar;
                if (w2dVar7.b(i8)) {
                }
                long j822 = this.f;
                l59 l59Var222 = (l59) this.i;
                boolean z522 = this.c;
                l59Var222.f = false;
                l59Var222.g = false;
                l59Var222.d = j822;
                l59Var222.c = 0;
                long j922 = j2;
                l59Var222.a = j922;
                if (i5 >= 32) {
                }
                z = false;
                z2 = true;
                if (i5 >= 16) {
                }
                l59Var222.b = z6;
                l59Var222.e = (!z6 || i5 <= 9) ? z2 : z;
                if (this.c) {
                }
                w2dVar6.e(i5);
                w2dVar7.e(i5);
                w2dVar8 = w2dVar5;
                i2 = i4;
                i3 = i9;
                bArr2 = bArr;
            }
            nkkVar4 = nkkVar;
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
        this.b = c2kVar.f;
        c2kVar.b();
        usj track = ol6Var.track(c2kVar.e, 2);
        this.h = track;
        this.i = new l59(track);
        ((b2h) this.g).b(ol6Var, c2kVar);
    }

    public void i(long j, int i, int i2, long j2) {
        l59 l59Var = (l59) this.i;
        boolean z = this.c;
        l59Var.f = false;
        l59Var.g = false;
        l59Var.d = j2;
        l59Var.c = 0;
        l59Var.a = j;
        if (i2 >= 32 && i2 != 40) {
            if (l59Var.h && !l59Var.i) {
                if (z) {
                    l59Var.a(i);
                }
                l59Var.h = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                l59Var.g = !l59Var.i;
                l59Var.i = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        l59Var.b = z2;
        l59Var.e = z2 || i2 <= 9;
        if (!this.c) {
            ((w2d) this.j).e(i2);
            ((w2d) this.k).e(i2);
            ((w2d) this.l).e(i2);
        }
        ((w2d) this.m).e(i2);
        ((w2d) this.n).e(i2);
    }

    @Override // defpackage.xi5
    public final void seek() {
        int i = this.a;
        Object obj = this.n;
        Object obj2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        boolean[] zArr = this.d;
        switch (i) {
            case 0:
                this.e = 0L;
                this.f = C.TIME_UNSET;
                hkg.z(zArr);
                ((w2d) obj5).d();
                ((w2d) obj4).d();
                ((w2d) obj3).d();
                ((w2d) obj2).d();
                ((w2d) obj).d();
                l59 l59Var = (l59) this.i;
                if (l59Var != null) {
                    l59Var.e = false;
                    l59Var.f = false;
                    l59Var.g = false;
                    l59Var.h = false;
                    l59Var.i = false;
                    break;
                }
                break;
            default:
                this.e = 0L;
                this.f = C.TIME_UNSET;
                kik.m(zArr);
                ((w2d) obj5).d();
                ((w2d) obj4).d();
                ((w2d) obj3).d();
                ((w2d) obj2).d();
                ((w2d) obj).d();
                ((jy0) ((sx2) this.g).c).d(0);
                l59 l59Var2 = (l59) this.i;
                if (l59Var2 != null) {
                    l59Var2.e = false;
                    l59Var2.f = false;
                    l59Var2.g = false;
                    l59Var2.h = false;
                    l59Var2.i = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xi5
    public void packetFinished() {
    }

    public m59(sx2 sx2Var) {
        this.a = 1;
        this.g = sx2Var;
        this.d = new boolean[3];
        this.j = new w2d(32, 1);
        this.k = new w2d(33, 1);
        this.l = new w2d(34, 1);
        this.m = new w2d(39, 1);
        this.n = new w2d(40, 1);
        this.f = C.TIME_UNSET;
        this.o = new j9e();
    }
}
