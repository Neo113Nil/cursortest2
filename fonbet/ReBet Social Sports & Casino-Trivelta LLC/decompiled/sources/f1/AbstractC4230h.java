package f1;

import b1.AbstractC2335D;
import b1.C2357k;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.AbstractC4144k;
import e1.AbstractC4156x;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* renamed from: f1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4230h {
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: a, reason: collision with root package name */
    public static final Object f46185a = new Object();
    private static int[] scratchEscapePositions = new int[10];

    /* renamed from: f1.h$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f46186a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46187b;

        public a(int i10, int i11) {
            this.f46186a = i10;
            this.f46187b = i11;
        }
    }

    /* renamed from: f1.h$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f46188a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46189b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46190c;

        public b(int i10, int i11, int i12) {
            this.f46188a = i10;
            this.f46189b = i11;
            this.f46190c = i12;
        }
    }

    /* renamed from: f1.h$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f46191a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f46192b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46193c;
        public final int[] constraintBytes;

        /* renamed from: d, reason: collision with root package name */
        public final int f46194d;

        /* renamed from: e, reason: collision with root package name */
        public final int f46195e;

        public c(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
            this.f46191a = i10;
            this.f46192b = z10;
            this.f46193c = i11;
            this.f46194d = i12;
            this.constraintBytes = iArr;
            this.f46195e = i13;
        }
    }

    /* renamed from: f1.h$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC3445z f46196a;
        public final int[] indices;

        public d(List list, int[] iArr) {
            this.f46196a = AbstractC3445z.o(list);
            this.indices = iArr;
        }
    }

    /* renamed from: f1.h$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f46197a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46198b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46199c;

        /* renamed from: d, reason: collision with root package name */
        public final int f46200d;

        /* renamed from: e, reason: collision with root package name */
        public final int f46201e;

        public e(int i10, int i11, int i12, int i13, int i14) {
            this.f46197a = i10;
            this.f46198b = i11;
            this.f46199c = i12;
            this.f46200d = i13;
            this.f46201e = i14;
        }
    }

    /* renamed from: f1.h$f */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC3445z f46202a;
        public final int[] indices;

        public f(List list, int[] iArr) {
            this.f46202a = AbstractC3445z.o(list);
            this.indices = iArr;
        }
    }

    /* renamed from: f1.h$g */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f46203a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46204b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46205c;

        /* renamed from: d, reason: collision with root package name */
        public final int f46206d;

        /* renamed from: e, reason: collision with root package name */
        public final int f46207e;

        /* renamed from: f, reason: collision with root package name */
        public final int f46208f;

        /* renamed from: g, reason: collision with root package name */
        public final int f46209g;

        /* renamed from: h, reason: collision with root package name */
        public final int f46210h;

        /* renamed from: i, reason: collision with root package name */
        public final int f46211i;

        public g(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f46203a = i10;
            this.f46204b = i11;
            this.f46205c = i12;
            this.f46206d = i13;
            this.f46207e = i14;
            this.f46208f = i15;
            this.f46209g = i16;
            this.f46210h = i17;
            this.f46211i = i18;
        }
    }

    /* renamed from: f1.h$h, reason: collision with other inner class name */
    public static final class C0670h {

        /* renamed from: a, reason: collision with root package name */
        public final b f46212a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46213b;

        /* renamed from: c, reason: collision with root package name */
        public final c f46214c;

        /* renamed from: d, reason: collision with root package name */
        public final int f46215d;

        /* renamed from: e, reason: collision with root package name */
        public final int f46216e;

        /* renamed from: f, reason: collision with root package name */
        public final int f46217f;

        /* renamed from: g, reason: collision with root package name */
        public final int f46218g;

        /* renamed from: h, reason: collision with root package name */
        public final int f46219h;

        /* renamed from: i, reason: collision with root package name */
        public final int f46220i;

        /* renamed from: j, reason: collision with root package name */
        public final int f46221j;

        /* renamed from: k, reason: collision with root package name */
        public final int f46222k;

        /* renamed from: l, reason: collision with root package name */
        public final float f46223l;

        /* renamed from: m, reason: collision with root package name */
        public final int f46224m;

        /* renamed from: n, reason: collision with root package name */
        public final int f46225n;

        /* renamed from: o, reason: collision with root package name */
        public final int f46226o;

        /* renamed from: p, reason: collision with root package name */
        public final int f46227p;

        public C0670h(b bVar, int i10, c cVar, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, int i19, int i20, int i21, int i22) {
            this.f46212a = bVar;
            this.f46213b = i10;
            this.f46214c = cVar;
            this.f46215d = i11;
            this.f46216e = i12;
            this.f46217f = i13;
            this.f46218g = i14;
            this.f46219h = i15;
            this.f46220i = i16;
            this.f46223l = f10;
            this.f46224m = i19;
            this.f46225n = i20;
            this.f46226o = i21;
            this.f46227p = i22;
            this.f46221j = i17;
            this.f46222k = i18;
        }
    }

    /* renamed from: f1.h$i */
    public static final class i {

        /* renamed from: a, reason: collision with root package name */
        public final int f46228a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46229b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46230c;

        public i(int i10, int i11, int i12) {
            this.f46228a = i10;
            this.f46229b = i11;
            this.f46230c = i12;
        }
    }

    /* renamed from: f1.h$j */
    public static final class j {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC3445z f46231a;
        public final int[] indices;

        public j(List list, int[] iArr) {
            this.f46231a = AbstractC3445z.o(list);
            this.indices = iArr;
        }
    }

    /* renamed from: f1.h$k */
    public static final class k {

        /* renamed from: a, reason: collision with root package name */
        public final b f46232a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC3445z f46233b;

        /* renamed from: c, reason: collision with root package name */
        public final d f46234c;

        /* renamed from: d, reason: collision with root package name */
        public final f f46235d;

        /* renamed from: e, reason: collision with root package name */
        public final j f46236e;

        public k(b bVar, List list, d dVar, f fVar, j jVar) {
            this.f46232a = bVar;
            this.f46233b = list != null ? AbstractC3445z.o(list) : AbstractC3445z.t();
            this.f46234c = dVar;
            this.f46235d = fVar;
            this.f46236e = jVar;
        }
    }

    /* renamed from: f1.h$l */
    public static final class l {

        /* renamed from: a, reason: collision with root package name */
        public final int f46237a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46238b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f46239c;

        public l(int i10, int i11, boolean z10) {
            this.f46237a = i10;
            this.f46238b = i11;
            this.f46239c = z10;
        }
    }

    /* renamed from: f1.h$m */
    public static final class m {

        /* renamed from: a, reason: collision with root package name */
        public final int f46240a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46241b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46242c;

        /* renamed from: d, reason: collision with root package name */
        public final int f46243d;

        /* renamed from: e, reason: collision with root package name */
        public final int f46244e;

        /* renamed from: f, reason: collision with root package name */
        public final int f46245f;

        /* renamed from: g, reason: collision with root package name */
        public final int f46246g;

        /* renamed from: h, reason: collision with root package name */
        public final float f46247h;

        /* renamed from: i, reason: collision with root package name */
        public final int f46248i;

        /* renamed from: j, reason: collision with root package name */
        public final int f46249j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f46250k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f46251l;

        /* renamed from: m, reason: collision with root package name */
        public final int f46252m;

        /* renamed from: n, reason: collision with root package name */
        public final int f46253n;

        /* renamed from: o, reason: collision with root package name */
        public final int f46254o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f46255p;

        /* renamed from: q, reason: collision with root package name */
        public final int f46256q;

        /* renamed from: r, reason: collision with root package name */
        public final int f46257r;

        /* renamed from: s, reason: collision with root package name */
        public final int f46258s;

        /* renamed from: t, reason: collision with root package name */
        public final int f46259t;

        public m(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, int i17, int i18, boolean z10, boolean z11, int i19, int i20, int i21, boolean z12, int i22, int i23, int i24, int i25) {
            this.f46240a = i10;
            this.f46241b = i11;
            this.f46242c = i12;
            this.f46243d = i13;
            this.f46244e = i14;
            this.f46245f = i15;
            this.f46246g = i16;
            this.f46247h = f10;
            this.f46248i = i17;
            this.f46249j = i18;
            this.f46250k = z10;
            this.f46251l = z11;
            this.f46252m = i19;
            this.f46253n = i20;
            this.f46254o = i21;
            this.f46255p = z12;
            this.f46256q = i22;
            this.f46257r = i23;
            this.f46258s = i24;
            this.f46259t = i25;
        }
    }

    public static l A(byte[] bArr, int i10, int i11) {
        return B(bArr, i10 + 1, i11);
    }

    public static l B(byte[] bArr, int i10, int i11) {
        C4232j c4232j = new C4232j(bArr, i10, i11);
        int i12 = c4232j.i();
        int i13 = c4232j.i();
        c4232j.l();
        return new l(i12, i13, c4232j.e());
    }

    public static m C(byte[] bArr, int i10, int i11) {
        return D(bArr, i10 + 1, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m D(byte[] bArr, int i10, int i11) {
        int i12;
        boolean e10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        int i18;
        int i19;
        int i20;
        int i21;
        float f10;
        int i22;
        int i23;
        int i24;
        boolean z11;
        int i25;
        int i26;
        int i27;
        boolean e11;
        boolean e12;
        int i28;
        int i29;
        C4232j c4232j = new C4232j(bArr, i10, i11);
        int f11 = c4232j.f(8);
        int f12 = c4232j.f(8);
        int f13 = c4232j.f(8);
        int i30 = c4232j.i();
        if (f11 == 100 || f11 == 110 || f11 == 122 || f11 == 244 || f11 == 44 || f11 == 83 || f11 == 86 || f11 == 118 || f11 == 128 || f11 == 138) {
            i12 = c4232j.i();
            e10 = i12 == 3 ? c4232j.e() : false;
            i13 = c4232j.i();
            int i31 = c4232j.i();
            c4232j.l();
            if (c4232j.e()) {
                int i32 = i12 != 3 ? 8 : 12;
                i14 = 16;
                int i33 = 0;
                while (i33 < i32) {
                    if (c4232j.e()) {
                        J(c4232j, i33 < 6 ? 16 : 64);
                    }
                    i33++;
                }
            } else {
                i14 = 16;
            }
            i15 = i31;
        } else {
            i12 = 1;
            i14 = 16;
            i15 = 0;
            e10 = false;
            i13 = 0;
        }
        int i34 = c4232j.i() + 4;
        int i35 = c4232j.i();
        if (i35 == 0) {
            i18 = c4232j.i() + 4;
            i16 = f11;
            i17 = i35;
            z10 = false;
        } else {
            if (i35 == 1) {
                boolean e13 = c4232j.e();
                c4232j.h();
                c4232j.h();
                i16 = f11;
                long i36 = c4232j.i();
                i17 = i35;
                for (int i37 = 0; i37 < i36; i37++) {
                    c4232j.i();
                }
                z10 = e13;
            } else {
                i16 = f11;
                i17 = i35;
                z10 = false;
            }
            i18 = 0;
        }
        int i38 = c4232j.i();
        c4232j.l();
        int i39 = c4232j.i() + 1;
        int i40 = c4232j.i() + 1;
        boolean e14 = c4232j.e();
        int i41 = (2 - (e14 ? 1 : 0)) * i40;
        if (!e14) {
            c4232j.l();
        }
        c4232j.l();
        int i42 = i39 * 16;
        int i43 = i41 * 16;
        if (c4232j.e()) {
            int i44 = c4232j.i();
            int i45 = c4232j.i();
            int i46 = c4232j.i();
            int i47 = c4232j.i();
            if (i12 == 0) {
                i29 = 2 - (e14 ? 1 : 0);
                i28 = 1;
            } else {
                i28 = i12 == 3 ? 1 : 2;
                i29 = (i12 == 1 ? 2 : 1) * (2 - (e14 ? 1 : 0));
            }
            i42 -= (i44 + i45) * i28;
            i43 -= (i46 + i47) * i29;
        }
        int i48 = i42;
        int i49 = i16;
        int i50 = ((i49 == 44 || i49 == 86 || i49 == 100 || i49 == 110 || i49 == 122 || i49 == 244) && (f12 & 16) != 0) ? 0 : i14;
        float f14 = 1.0f;
        if (c4232j.e()) {
            if (c4232j.e()) {
                int f15 = c4232j.f(8);
                if (f15 == 255) {
                    int i51 = i14;
                    int f16 = c4232j.f(i51);
                    int f17 = c4232j.f(i51);
                    if (f16 != 0 && f17 != 0) {
                        f14 = f16 / f17;
                    }
                } else {
                    float[] fArr = ASPECT_RATIO_IDC_VALUES;
                    if (f15 < fArr.length) {
                        f14 = fArr[f15];
                    } else {
                        AbstractC4156x.i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + f15);
                    }
                }
            }
            if (c4232j.e()) {
                c4232j.l();
            }
            if (c4232j.e()) {
                c4232j.m(3);
                i26 = c4232j.e() ? 1 : 2;
                if (c4232j.e()) {
                    int f18 = c4232j.f(8);
                    int f19 = c4232j.f(8);
                    c4232j.m(8);
                    int j10 = C2357k.j(f18);
                    int k10 = C2357k.k(f19);
                    i27 = j10;
                    i25 = k10;
                    if (c4232j.e()) {
                        c4232j.i();
                        c4232j.i();
                    }
                    if (c4232j.e()) {
                        c4232j.m(65);
                    }
                    e11 = c4232j.e();
                    if (e11) {
                        I(c4232j);
                    }
                    e12 = c4232j.e();
                    if (e12) {
                        I(c4232j);
                    }
                    if (!e11 || e12) {
                        c4232j.l();
                    }
                    c4232j.l();
                    if (c4232j.e()) {
                        c4232j.l();
                        c4232j.i();
                        c4232j.i();
                        c4232j.i();
                        c4232j.i();
                        i50 = c4232j.i();
                        c4232j.i();
                    }
                    i24 = i25;
                    i23 = i26;
                    i19 = i50;
                    i20 = i13;
                    i21 = i18;
                    f10 = f14;
                    z11 = z10;
                    i22 = i27;
                } else {
                    i25 = -1;
                }
            } else {
                i25 = -1;
                i26 = -1;
            }
            i27 = -1;
            if (c4232j.e()) {
            }
            if (c4232j.e()) {
            }
            e11 = c4232j.e();
            if (e11) {
            }
            e12 = c4232j.e();
            if (e12) {
            }
            if (!e11) {
            }
            c4232j.l();
            c4232j.l();
            if (c4232j.e()) {
            }
            i24 = i25;
            i23 = i26;
            i19 = i50;
            i20 = i13;
            i21 = i18;
            f10 = f14;
            z11 = z10;
            i22 = i27;
        } else {
            i19 = i50;
            i20 = i13;
            i21 = i18;
            f10 = 1.0f;
            i22 = -1;
            i23 = -1;
            i24 = -1;
            z11 = z10;
        }
        return new m(i49, f12, f13, i30, i38, i48, i43, f10, i20, i15, e10, e14, i34, i17, i21, z11, i22, i23, i24, i19);
    }

    public static void E(C4232j c4232j, int i10, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i11 = 1; i11 < i10; i11++) {
            boolean e10 = c4232j.e();
            int i12 = 0;
            while (i12 < iArr[i11]) {
                if ((i12 <= 0 || !e10) ? i12 == 0 : c4232j.e()) {
                    for (int i13 = 0; i13 < iArr2[i11]; i13++) {
                        if (zArr[i11][i13]) {
                            c4232j.i();
                        }
                    }
                    c4232j.i();
                    c4232j.i();
                }
                i12++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static void F(C4232j c4232j, boolean z10, int i10) {
        ?? r92;
        ?? r12;
        boolean z11;
        boolean e10;
        if (z10) {
            boolean e11 = c4232j.e();
            boolean e12 = c4232j.e();
            if (e11 || e12) {
                z11 = c4232j.e();
                if (z11) {
                    c4232j.m(19);
                }
                c4232j.m(8);
                if (z11) {
                    c4232j.m(4);
                }
                c4232j.m(15);
                r12 = e12;
                r92 = e11;
            } else {
                z11 = false;
                r12 = e12;
                r92 = e11;
            }
        } else {
            r92 = 0;
            r12 = 0;
            z11 = false;
        }
        for (int i11 = 0; i11 <= i10; i11++) {
            boolean e13 = c4232j.e();
            if (!e13) {
                e13 = c4232j.e();
            }
            if (e13) {
                c4232j.i();
                e10 = false;
            } else {
                e10 = c4232j.e();
            }
            int i12 = !e10 ? c4232j.i() : 0;
            int i13 = r92 + r12;
            for (int i14 = 0; i14 < i13; i14++) {
                for (int i15 = 0; i15 <= i12; i15++) {
                    c4232j.i();
                    c4232j.i();
                    if (z11) {
                        c4232j.i();
                        c4232j.i();
                    }
                    c4232j.l();
                }
            }
        }
    }

    public static void G(C4232j c4232j) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (c4232j.e()) {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        c4232j.h();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        c4232j.h();
                    }
                } else {
                    c4232j.i();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    public static void H(C4232j c4232j) {
        int i10 = c4232j.i();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i13 == 0 || !c4232j.e()) {
                int i14 = c4232j.i();
                int i15 = c4232j.i();
                int[] iArr3 = new int[i14];
                int i16 = 0;
                while (i16 < i14) {
                    iArr3[i16] = (i16 > 0 ? iArr3[i16 - 1] : 0) - (c4232j.i() + 1);
                    c4232j.l();
                    i16++;
                }
                int[] iArr4 = new int[i15];
                int i17 = 0;
                while (i17 < i15) {
                    iArr4[i17] = (i17 > 0 ? iArr4[i17 - 1] : 0) + c4232j.i() + 1;
                    c4232j.l();
                    i17++;
                }
                i11 = i14;
                iArr = iArr3;
                i12 = i15;
                iArr2 = iArr4;
            } else {
                int i18 = i11 + i12;
                int i19 = (1 - ((c4232j.e() ? 1 : 0) * 2)) * (c4232j.i() + 1);
                int i20 = i18 + 1;
                boolean[] zArr = new boolean[i20];
                for (int i21 = 0; i21 <= i18; i21++) {
                    if (c4232j.e()) {
                        zArr[i21] = true;
                    } else {
                        zArr[i21] = c4232j.e();
                    }
                }
                int[] iArr5 = new int[i20];
                int[] iArr6 = new int[i20];
                int i22 = 0;
                for (int i23 = i12 - 1; i23 >= 0; i23--) {
                    int i24 = iArr2[i23] + i19;
                    if (i24 < 0 && zArr[i11 + i23]) {
                        iArr5[i22] = i24;
                        i22++;
                    }
                }
                if (i19 < 0 && zArr[i18]) {
                    iArr5[i22] = i19;
                    i22++;
                }
                for (int i25 = 0; i25 < i11; i25++) {
                    int i26 = iArr[i25] + i19;
                    if (i26 < 0 && zArr[i25]) {
                        iArr5[i22] = i26;
                        i22++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i22);
                int i27 = 0;
                for (int i28 = i11 - 1; i28 >= 0; i28--) {
                    int i29 = iArr[i28] + i19;
                    if (i29 > 0 && zArr[i28]) {
                        iArr6[i27] = i29;
                        i27++;
                    }
                }
                if (i19 > 0 && zArr[i18]) {
                    iArr6[i27] = i19;
                    i27++;
                }
                for (int i30 = 0; i30 < i12; i30++) {
                    int i31 = iArr2[i30] + i19;
                    if (i31 > 0 && zArr[i11 + i30]) {
                        iArr6[i27] = i31;
                        i27++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr6, i27);
                iArr = copyOf;
                i11 = i22;
                i12 = i27;
            }
        }
    }

    public static void I(C4232j c4232j) {
        int i10 = c4232j.i() + 1;
        c4232j.m(8);
        for (int i11 = 0; i11 < i10; i11++) {
            c4232j.i();
            c4232j.i();
            c4232j.l();
        }
        c4232j.m(20);
    }

    public static void J(C4232j c4232j, int i10) {
        int i11 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != 0) {
                i11 = ((c4232j.h() + i12) + 256) % 256;
            }
            if (i11 != 0) {
                i12 = i11;
            }
        }
    }

    public static void K(C4232j c4232j, int i10, boolean[][] zArr) {
        int i11 = c4232j.i() + 2;
        if (c4232j.e()) {
            c4232j.m(i11);
        } else {
            for (int i12 = 1; i12 < i10; i12++) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (zArr[i12][i13]) {
                        c4232j.m(i11);
                    }
                }
            }
        }
        int i14 = c4232j.i();
        for (int i15 = 1; i15 <= i14; i15++) {
            c4232j.m(8);
        }
    }

    public static int L(byte[] bArr, int i10) {
        int i11;
        synchronized (f46185a) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                try {
                    i12 = g(bArr, i12, i10);
                    if (i12 < i10) {
                        int[] iArr = scratchEscapePositions;
                        if (iArr.length <= i13) {
                            scratchEscapePositions = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        scratchEscapePositions[i13] = i12;
                        i12 += 3;
                        i13++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = scratchEscapePositions[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }

    public static int a(int i10, int i11, int i12, int i13) {
        return i10 - ((i11 == 1 ? 2 : 1) * (i12 + i13));
    }

    public static int b(int i10, int i11, int i12, int i13) {
        int i14 = 2;
        if (i11 != 1 && i11 != 2) {
            i14 = 1;
        }
        return i10 - (i14 * (i12 + i13));
    }

    public static void c(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String d(C4232j c4232j) {
        c4232j.m(4);
        int f10 = c4232j.f(3);
        c4232j.l();
        c q10 = q(c4232j, true, f10, null);
        return AbstractC4144k.j(q10.f46191a, q10.f46192b, q10.f46193c, q10.f46194d, q10.constraintBytes, q10.f46195e);
    }

    public static int e(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        AbstractC4134a.g(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            c(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            c(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            c(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    c(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static AbstractC3445z f(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        AbstractC3445z.a k10 = AbstractC3445z.k();
        int i10 = 0;
        while (i10 < bArr.length) {
            int e10 = e(bArr, i10, bArr.length, zArr);
            if (e10 != bArr.length) {
                k10.a(Integer.valueOf(e10));
            }
            i10 = e10 + 3;
        }
        return k10.m();
    }

    public static int g(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static String h(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = (byte[]) list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                AbstractC3445z f10 = f(bArr);
                for (int i11 = 0; i11 < f10.size(); i11++) {
                    if (((Integer) f10.get(i11)).intValue() + 3 < length) {
                        C4232j c4232j = new C4232j(bArr, ((Integer) f10.get(i11)).intValue() + 3, length);
                        b p10 = p(c4232j);
                        if (p10.f46188a == 33 && p10.f46189b == 0) {
                            return d(c4232j);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int i(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int j(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean k(byte[] bArr, int i10, int i11, androidx.media3.common.a aVar) {
        if (Objects.equals(aVar.f20543o, "video/avc")) {
            return l(bArr[i10]);
        }
        if (Objects.equals(aVar.f20543o, "video/hevc")) {
            return m(bArr, i10, i11, aVar);
        }
        return true;
    }

    public static boolean l(byte b10) {
        if (((b10 & 96) >> 5) != 0) {
            return true;
        }
        int i10 = b10 & 31;
        return (i10 == 1 || i10 == 9 || i10 == 14) ? false : true;
    }

    public static boolean m(byte[] bArr, int i10, int i11, androidx.media3.common.a aVar) {
        b p10 = p(new C4232j(bArr, i10, i11 + i10));
        int i12 = p10.f46188a;
        if (i12 == 35) {
            return false;
        }
        return (i12 <= 14 && i12 % 2 == 0 && p10.f46190c == aVar.f20517E - 1) ? false : true;
    }

    public static boolean n(androidx.media3.common.a aVar, byte b10) {
        return ((Objects.equals(aVar.f20543o, "video/avc") || AbstractC2335D.b(aVar.f20539k, "video/avc")) && (b10 & 31) == 6) || ((Objects.equals(aVar.f20543o, "video/hevc") || AbstractC2335D.b(aVar.f20539k, "video/hevc")) && ((b10 & 126) >> 1) == 39);
    }

    public static int o(androidx.media3.common.a aVar) {
        if (Objects.equals(aVar.f20543o, "video/avc")) {
            return 1;
        }
        return (Objects.equals(aVar.f20543o, "video/hevc") || AbstractC2335D.b(aVar.f20539k, "video/hevc")) ? 2 : 0;
    }

    public static b p(C4232j c4232j) {
        c4232j.l();
        return new b(c4232j.f(6), c4232j.f(6), c4232j.f(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c q(C4232j c4232j, boolean z10, int i10, c cVar) {
        int[] iArr;
        int i11;
        boolean z11;
        int i12;
        int i13;
        boolean z12;
        int i14;
        int i15;
        int[] iArr2 = new int[6];
        if (z10) {
            int f10 = c4232j.f(2);
            z12 = c4232j.e();
            i14 = c4232j.f(5);
            i15 = 0;
            for (int i16 = 0; i16 < 32; i16++) {
                if (c4232j.e()) {
                    i15 |= 1 << i16;
                }
            }
            for (int i17 = 0; i17 < 6; i17++) {
                iArr2[i17] = c4232j.f(8);
            }
            i11 = f10;
        } else {
            if (cVar == null) {
                iArr = iArr2;
                i11 = 0;
                z11 = false;
                i12 = 0;
                i13 = 0;
                int f11 = c4232j.f(8);
                int i18 = 0;
                for (int i19 = 0; i19 < i10; i19++) {
                    if (c4232j.e()) {
                        i18 += 88;
                    }
                    if (c4232j.e()) {
                        i18 += 8;
                    }
                }
                c4232j.m(i18);
                if (i10 > 0) {
                    c4232j.m((8 - i10) * 2);
                }
                return new c(i11, z11, i12, i13, iArr, f11);
            }
            int i20 = cVar.f46191a;
            z12 = cVar.f46192b;
            i14 = cVar.f46193c;
            i15 = cVar.f46194d;
            iArr2 = cVar.constraintBytes;
            i11 = i20;
        }
        iArr = iArr2;
        z11 = z12;
        i12 = i14;
        i13 = i15;
        int f112 = c4232j.f(8);
        int i182 = 0;
        while (i19 < i10) {
        }
        c4232j.m(i182);
        if (i10 > 0) {
        }
        return new c(i11, z11, i12, i13, iArr, f112);
    }

    public static e r(C4232j c4232j) {
        int i10;
        int i11;
        int i12;
        int f10 = c4232j.f(16);
        int f11 = c4232j.f(16);
        if (c4232j.e()) {
            int f12 = c4232j.f(2);
            if (f12 == 3) {
                c4232j.l();
            }
            int f13 = c4232j.f(4);
            i12 = c4232j.f(4);
            i11 = f13;
            i10 = f12;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        if (c4232j.e()) {
            int i13 = c4232j.i();
            int i14 = c4232j.i();
            int i15 = c4232j.i();
            int i16 = c4232j.i();
            f10 = b(f10, i10, i13, i14);
            f11 = a(f11, i10, i15, i16);
        }
        return new e(i10, i11, i12, f10, f11);
    }

    public static f s(C4232j c4232j, int i10) {
        int i11 = c4232j.i();
        int i12 = i11 + 1;
        AbstractC3445z.a l10 = AbstractC3445z.l(i12);
        int[] iArr = new int[i10];
        for (int i13 = 0; i13 < i12; i13++) {
            l10.a(r(c4232j));
        }
        int i14 = 1;
        if (i12 <= 1 || !c4232j.e()) {
            while (i14 < i10) {
                iArr[i14] = Math.min(i14, i11);
                i14++;
            }
        } else {
            int d10 = com.google.common.math.b.d(i12, RoundingMode.CEILING);
            while (i14 < i10) {
                iArr[i14] = c4232j.f(d10);
                i14++;
            }
        }
        return new f(l10.m(), iArr);
    }

    public static g t(byte[] bArr, int i10, int i11) {
        byte b10;
        int i12 = i10 + 2;
        int i13 = i11 - 1;
        while (true) {
            b10 = bArr[i13];
            if (b10 != 0 || i13 <= i12) {
                break;
            }
            i13--;
        }
        if (b10 != 0 && i13 > i12) {
            C4232j c4232j = new C4232j(bArr, i12, i13 + 1);
            while (c4232j.c(16)) {
                int f10 = c4232j.f(8);
                int i14 = 0;
                while (f10 == 255) {
                    i14 += 255;
                    f10 = c4232j.f(8);
                }
                int i15 = i14 + f10;
                int f11 = c4232j.f(8);
                int i16 = 0;
                while (f11 == 255) {
                    i16 += 255;
                    f11 = c4232j.f(8);
                }
                int i17 = i16 + f11;
                if (i17 == 0 || !c4232j.c(i17)) {
                    break;
                }
                if (i15 == 176) {
                    int i18 = c4232j.i();
                    boolean e10 = c4232j.e();
                    int i19 = e10 ? c4232j.i() : 0;
                    int i20 = c4232j.i();
                    int i21 = -1;
                    int i22 = -1;
                    int i23 = -1;
                    int i24 = -1;
                    int i25 = -1;
                    int i26 = -1;
                    for (int i27 = 0; i27 <= i20; i27++) {
                        i21 = c4232j.i();
                        i22 = c4232j.i();
                        i23 = c4232j.f(6);
                        if (i23 == 63) {
                            return null;
                        }
                        i24 = c4232j.f(i23 == 0 ? Math.max(0, i18 - 30) : Math.max(0, (i23 + i18) - 31));
                        if (e10) {
                            int f12 = c4232j.f(6);
                            if (f12 == 63) {
                                return null;
                            }
                            i25 = f12;
                            i26 = c4232j.f(f12 == 0 ? Math.max(0, i19 - 30) : Math.max(0, (f12 + i19) - 31));
                        }
                        if (c4232j.e()) {
                            c4232j.m(10);
                        }
                    }
                    return new g(i18, i19, i20 + 1, i21, i22, i23, i24, i25, i26);
                }
                c4232j.m(i17 * 8);
            }
        }
        return null;
    }

    public static C0670h u(byte[] bArr, int i10, int i11, k kVar) {
        return v(bArr, i10 + 2, i11, p(new C4232j(bArr, i10, i11)), kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0670h v(byte[] bArr, int i10, int i11, b bVar, k kVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        float f10;
        int i25;
        int i26;
        int i27;
        int i28;
        j jVar;
        int i29;
        int i30;
        int i31;
        f fVar;
        C4232j c4232j = new C4232j(bArr, i10, i11);
        c4232j.m(4);
        int f11 = c4232j.f(3);
        boolean z10 = bVar.f46189b != 0 && f11 == 7;
        int i32 = (kVar == null || kVar.f46233b.isEmpty()) ? 0 : ((a) kVar.f46233b.get(Math.min(bVar.f46189b, kVar.f46233b.size() - 1))).f46186a;
        c cVar = null;
        if (!z10) {
            c4232j.l();
            cVar = q(c4232j, true, f11, null);
        } else if (kVar != null) {
            d dVar = kVar.f46234c;
            int i33 = dVar.indices[i32];
            if (dVar.f46196a.size() > i33) {
                cVar = (c) kVar.f46234c.f46196a.get(i33);
            }
        }
        int i34 = c4232j.i();
        if (z10) {
            int f12 = c4232j.e() ? c4232j.f(8) : -1;
            if (kVar != null && (fVar = kVar.f46235d) != null) {
                if (f12 == -1) {
                    f12 = fVar.indices[i32];
                }
                if (f12 != -1 && fVar.f46202a.size() > f12) {
                    e eVar = (e) kVar.f46235d.f46202a.get(f12);
                    i12 = eVar.f46197a;
                    i18 = eVar.f46200d;
                    i16 = eVar.f46201e;
                    i19 = eVar.f46198b;
                    i15 = eVar.f46199c;
                    i17 = i16;
                    i20 = i18;
                }
            }
            i17 = 0;
            i16 = 0;
            i19 = 0;
            i20 = 0;
            i15 = 0;
            i12 = 0;
            i18 = 0;
        } else {
            i12 = c4232j.i();
            if (i12 == 3) {
                c4232j.l();
            }
            int i35 = c4232j.i();
            int i36 = c4232j.i();
            if (c4232j.e()) {
                int i37 = c4232j.i();
                int i38 = c4232j.i();
                int i39 = c4232j.i();
                int i40 = c4232j.i();
                i14 = b(i35, i12, i37, i38);
                i13 = a(i36, i12, i39, i40);
            } else {
                i13 = i36;
                i14 = i35;
            }
            int i41 = c4232j.i();
            i15 = c4232j.i();
            i16 = i13;
            i17 = i36;
            i18 = i14;
            i19 = i41;
            i20 = i35;
        }
        int i42 = c4232j.i();
        if (z10) {
            i21 = -1;
        } else {
            int i43 = c4232j.e() ? 0 : f11;
            i21 = -1;
            while (i43 <= f11) {
                c4232j.i();
                i21 = Math.max(c4232j.i(), i21);
                c4232j.i();
                i43++;
                i17 = i17;
            }
        }
        int i44 = i17;
        c4232j.i();
        c4232j.i();
        c4232j.i();
        c4232j.i();
        c4232j.i();
        c4232j.i();
        if (c4232j.e()) {
            if (z10 ? c4232j.e() : false) {
                c4232j.m(6);
            } else if (c4232j.e()) {
                G(c4232j);
            }
        }
        int i45 = 2;
        c4232j.m(2);
        if (c4232j.e()) {
            c4232j.m(8);
            c4232j.i();
            c4232j.i();
            c4232j.l();
        }
        H(c4232j);
        if (c4232j.e()) {
            int i46 = c4232j.i();
            int i47 = 0;
            while (i47 < i46) {
                c4232j.m(i42 + 5);
                i47++;
                i45 = 2;
            }
        }
        c4232j.m(i45);
        if (c4232j.e()) {
            if (c4232j.e()) {
                int f13 = c4232j.f(8);
                if (f13 == 255) {
                    int f14 = c4232j.f(16);
                    int f15 = c4232j.f(16);
                    if (f14 != 0 && f15 != 0) {
                        f10 = f14 / f15;
                        if (c4232j.e()) {
                            c4232j.l();
                        }
                        if (c4232j.e()) {
                            c4232j.m(3);
                            i28 = c4232j.e() ? 1 : 2;
                            if (c4232j.e()) {
                                int f16 = c4232j.f(8);
                                int f17 = c4232j.f(8);
                                c4232j.m(8);
                                i30 = C2357k.j(f16);
                                i31 = C2357k.k(f17);
                                if (c4232j.e()) {
                                    c4232j.i();
                                    c4232j.i();
                                }
                                c4232j.l();
                                if (c4232j.e()) {
                                    i16 *= 2;
                                }
                                i22 = f11;
                                i27 = i31;
                                i23 = i12;
                                i24 = i18;
                                i26 = i28;
                                i25 = i30;
                            }
                            i30 = -1;
                            i31 = -1;
                            if (c4232j.e()) {
                            }
                            c4232j.l();
                            if (c4232j.e()) {
                            }
                            i22 = f11;
                            i27 = i31;
                            i23 = i12;
                            i24 = i18;
                            i26 = i28;
                            i25 = i30;
                        } else if (kVar == null || (jVar = kVar.f46236e) == null || jVar.f46231a.size() <= (i29 = jVar.indices[i32])) {
                            i28 = -1;
                            i30 = -1;
                            i31 = -1;
                            if (c4232j.e()) {
                            }
                            c4232j.l();
                            if (c4232j.e()) {
                            }
                            i22 = f11;
                            i27 = i31;
                            i23 = i12;
                            i24 = i18;
                            i26 = i28;
                            i25 = i30;
                        } else {
                            i iVar = (i) kVar.f46236e.f46231a.get(i29);
                            i30 = iVar.f46228a;
                            int i48 = iVar.f46229b;
                            i31 = iVar.f46230c;
                            i28 = i48;
                            if (c4232j.e()) {
                            }
                            c4232j.l();
                            if (c4232j.e()) {
                            }
                            i22 = f11;
                            i27 = i31;
                            i23 = i12;
                            i24 = i18;
                            i26 = i28;
                            i25 = i30;
                        }
                    }
                } else {
                    float[] fArr = ASPECT_RATIO_IDC_VALUES;
                    if (f13 < fArr.length) {
                        f10 = fArr[f13];
                        if (c4232j.e()) {
                        }
                        if (c4232j.e()) {
                        }
                    } else {
                        AbstractC4156x.i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + f13);
                    }
                }
            }
            f10 = 1.0f;
            if (c4232j.e()) {
            }
            if (c4232j.e()) {
            }
        } else {
            i22 = f11;
            i23 = i12;
            i24 = i18;
            f10 = 1.0f;
            i25 = -1;
            i26 = -1;
            i27 = -1;
        }
        return new C0670h(bVar, i22, cVar, i23, i19, i15, i34, i24, i16, i20, i44, f10, i21, i25, i26, i27);
    }

    public static i w(C4232j c4232j) {
        c4232j.m(3);
        int i10 = c4232j.e() ? 1 : 2;
        int j10 = C2357k.j(c4232j.f(8));
        int k10 = C2357k.k(c4232j.f(8));
        c4232j.m(8);
        return new i(j10, i10, k10);
    }

    public static j x(C4232j c4232j, int i10, int i11, int[] iArr) {
        if (!c4232j.e() ? c4232j.e() : true) {
            c4232j.l();
        }
        boolean e10 = c4232j.e();
        boolean e11 = c4232j.e();
        if (e10 || e11) {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < iArr[i12]; i13++) {
                    boolean e12 = e10 ? c4232j.e() : false;
                    boolean e13 = e11 ? c4232j.e() : false;
                    if (e12) {
                        c4232j.m(32);
                    }
                    if (e13) {
                        c4232j.m(18);
                    }
                }
            }
        }
        boolean e14 = c4232j.e();
        int f10 = e14 ? c4232j.f(4) + 1 : i10;
        AbstractC3445z.a l10 = AbstractC3445z.l(f10);
        int[] iArr2 = new int[i10];
        for (int i14 = 0; i14 < f10; i14++) {
            l10.a(w(c4232j));
        }
        if (e14 && f10 > 1) {
            for (int i15 = 0; i15 < i10; i15++) {
                iArr2[i15] = c4232j.f(4);
            }
        }
        return new j(l10.m(), iArr2);
    }

    public static k y(byte[] bArr, int i10, int i11) {
        C4232j c4232j = new C4232j(bArr, i10, i11);
        return z(c4232j, p(c4232j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k z(C4232j c4232j, b bVar) {
        int[] iArr;
        int i10;
        int i11;
        int[] iArr2;
        j jVar;
        int i12;
        int i13;
        int i14;
        int[] iArr3;
        AbstractC3445z abstractC3445z;
        int i15;
        boolean[][] zArr;
        int[] iArr4;
        int i16;
        int i17;
        c4232j.m(4);
        boolean e10 = c4232j.e();
        boolean e11 = c4232j.e();
        int f10 = c4232j.f(6);
        int i18 = f10 + 1;
        int f11 = c4232j.f(3);
        c4232j.m(17);
        c q10 = q(c4232j, true, f11, null);
        boolean z10 = false;
        for (int i19 = c4232j.e() ? 0 : f11; i19 <= f11; i19++) {
            c4232j.i();
            c4232j.i();
            c4232j.i();
        }
        int f12 = c4232j.f(6);
        int i20 = c4232j.i() + 1;
        d dVar = new d(AbstractC3445z.u(q10), new int[1]);
        Object[] objArr = i18 >= 2 && i20 >= 2;
        Object[] objArr2 = e10 && e11;
        int i21 = f12 + 1;
        Object[] objArr3 = i21 >= i18;
        if (objArr != true || objArr2 != true || objArr3 != true) {
            return new k(bVar, null, dVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, i20, i21);
        int i22 = 1;
        int[] iArr6 = new int[i20];
        int[] iArr7 = new int[i20];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i23 = 1; i23 < i20; i23++) {
            int i24 = 0;
            for (int i25 = 0; i25 <= f12; i25++) {
                if (c4232j.e()) {
                    iArr5[i23][i24] = i25;
                    iArr7[i23] = i25;
                    i24++;
                }
                iArr6[i23] = i24;
            }
        }
        if (c4232j.e()) {
            c4232j.m(64);
            if (c4232j.e()) {
                c4232j.i();
            }
            int i26 = c4232j.i();
            int i27 = 0;
            while (i27 < i26) {
                c4232j.i();
                if (i27 == 0 || c4232j.e()) {
                    z10 = true;
                }
                F(c4232j, z10, f11);
                i27++;
                z10 = false;
            }
        }
        if (!c4232j.e()) {
            return new k(bVar, null, dVar, null, null);
        }
        c4232j.b();
        c q11 = q(c4232j, false, f11, q10);
        boolean e12 = c4232j.e();
        int i28 = 6;
        boolean[] zArr2 = new boolean[16];
        int i29 = 0;
        for (int i30 = 0; i30 < 16; i30++) {
            boolean e13 = c4232j.e();
            zArr2[i30] = e13;
            if (e13) {
                i29++;
            }
        }
        if (i29 == 0 || !zArr2[1]) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr8 = new int[i29];
        for (int i31 = 0; i31 < i29 - (e12 ? 1 : 0); i31++) {
            iArr8[i31] = c4232j.f(3);
        }
        int[] iArr9 = new int[i29 + 1];
        if (e12) {
            int i32 = 1;
            while (i32 < i29) {
                int[] iArr10 = iArr9;
                for (int i33 = 0; i33 < i32; i33++) {
                    iArr10[i32] = iArr10[i32] + iArr8[i33] + 1;
                }
                i32++;
                iArr9 = iArr10;
            }
            iArr = iArr9;
            iArr[i29] = 6;
        } else {
            iArr = iArr9;
        }
        int[][] iArr11 = (int[][]) Array.newInstance((Class<?>) cls, i18, i29);
        int[] iArr12 = new int[i18];
        iArr12[0] = 0;
        boolean e14 = c4232j.e();
        int i34 = 1;
        while (i34 < i18) {
            if (e14) {
                i17 = i34;
                iArr12[i17] = c4232j.f(i28);
            } else {
                i17 = i34;
                iArr12[i17] = i17;
            }
            if (e12) {
                for (int i35 = 0; i35 < i29; i35++) {
                    iArr11[i17][i35] = (iArr12[i17] & ((1 << iArr[r33]) - 1)) >> iArr[i35];
                }
            } else {
                int i36 = 0;
                while (i36 < i29) {
                    int i37 = i36;
                    iArr11[i17][i37] = c4232j.f(iArr8[i36] + 1);
                    i36 = i37 + 1;
                }
            }
            i34 = i17 + 1;
            i28 = 6;
        }
        int[] iArr13 = new int[i21];
        int i38 = 1;
        int i39 = 0;
        while (i39 < i18) {
            iArr13[iArr12[i39]] = -1;
            int[] iArr14 = iArr13;
            int i40 = 0;
            int i41 = 0;
            while (i40 < 16) {
                if (zArr2[i40]) {
                    if (i40 == i22) {
                        iArr14[iArr12[i39]] = iArr11[i39][i41];
                    }
                    i41++;
                }
                i40++;
                i22 = 1;
            }
            if (i39 > 0) {
                int i42 = 0;
                while (true) {
                    if (i42 >= i39) {
                        i38++;
                        break;
                    }
                    int i43 = i42;
                    if (iArr14[iArr12[i39]] == iArr14[iArr12[i42]]) {
                        break;
                    }
                    i42 = i43 + 1;
                }
            }
            i39++;
            iArr13 = iArr14;
            i22 = 1;
        }
        int[] iArr15 = iArr13;
        int f13 = c4232j.f(4);
        if (i38 < 2 || f13 == 0) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr16 = new int[i38];
        for (int i44 = 0; i44 < i38; i44++) {
            iArr16[i44] = c4232j.f(f13);
        }
        int[] iArr17 = new int[i21];
        int i45 = 0;
        while (i45 < i18) {
            int[] iArr18 = iArr17;
            iArr18[Math.min(iArr12[i45], f12)] = i45;
            i45++;
            iArr17 = iArr18;
        }
        int[] iArr19 = iArr17;
        AbstractC3445z.a k10 = AbstractC3445z.k();
        int i46 = 0;
        while (i46 <= f12) {
            int i47 = i38;
            int[] iArr20 = iArr7;
            int min = Math.min(iArr15[i46], i47 - 1);
            k10.a(new a(iArr19[i46], min >= 0 ? iArr16[min] : -1));
            i46++;
            i38 = i47;
            iArr7 = iArr20;
            iArr16 = iArr16;
        }
        int[] iArr21 = iArr7;
        AbstractC3445z m10 = k10.m();
        if (((a) m10.get(0)).f46187b == -1) {
            return new k(bVar, null, dVar, null, null);
        }
        int i48 = 1;
        while (true) {
            if (i48 > f12) {
                i10 = -1;
                i11 = -1;
                break;
            }
            i10 = -1;
            if (((a) m10.get(i48)).f46187b != -1) {
                i11 = i48;
                break;
            }
            i48++;
        }
        if (i11 == i10) {
            return new k(bVar, null, dVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr3 = (boolean[][]) Array.newInstance((Class<?>) cls2, i18, i18);
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i18, i18);
        int i49 = 1;
        while (i49 < i18) {
            boolean[][] zArr5 = zArr4;
            for (int i50 = 0; i50 < i49; i50++) {
                boolean[] zArr6 = zArr3[i49];
                boolean[] zArr7 = zArr5[i49];
                boolean e15 = c4232j.e();
                zArr7[i50] = e15;
                zArr6[i50] = e15;
            }
            i49++;
            zArr4 = zArr5;
        }
        boolean[][] zArr8 = zArr4;
        for (int i51 = 1; i51 < i18; i51++) {
            int i52 = 0;
            while (i52 < f10) {
                int[] iArr22 = iArr12;
                int i53 = 0;
                while (true) {
                    if (i53 < i51) {
                        boolean[] zArr9 = zArr8[i51];
                        if (zArr9[i53] && zArr8[i53][i52]) {
                            zArr9[i52] = true;
                            break;
                        }
                        i53++;
                    }
                }
                i52++;
                iArr12 = iArr22;
            }
        }
        int[] iArr23 = iArr12;
        int[] iArr24 = new int[i21];
        for (int i54 = 0; i54 < i18; i54++) {
            int i55 = 0;
            for (int i56 = 0; i56 < i54; i56++) {
                i55 += zArr3[i54][i56] ? 1 : 0;
            }
            iArr24[iArr23[i54]] = i55;
        }
        int i57 = 0;
        for (int i58 = 0; i58 < i18; i58++) {
            if (iArr24[iArr23[i58]] == 0) {
                i57++;
            }
        }
        if (i57 > 1) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr25 = new int[i18];
        int[] iArr26 = new int[i20];
        if (c4232j.e()) {
            iArr2 = iArr24;
            int i59 = 0;
            while (i59 < i18) {
                int i60 = i59;
                iArr25[i60] = c4232j.f(3);
                i59 = i60 + 1;
            }
        } else {
            iArr2 = iArr24;
            Arrays.fill(iArr25, 0, i18, f11);
        }
        int i61 = 0;
        while (i61 < i20) {
            int i62 = i61;
            boolean[][] zArr10 = zArr3;
            int[] iArr27 = iArr25;
            int i63 = 0;
            for (int i64 = 0; i64 < iArr6[i62]; i64++) {
                i63 = Math.max(i63, iArr27[((a) m10.get(iArr5[i62][i64])).f46186a]);
            }
            iArr26[i62] = i63 + 1;
            i61 = i62 + 1;
            iArr25 = iArr27;
            zArr3 = zArr10;
        }
        boolean[][] zArr11 = zArr3;
        if (c4232j.e()) {
            int i65 = 0;
            while (i65 < f10) {
                int i66 = i65 + 1;
                int i67 = i66;
                while (i67 < i18) {
                    if (zArr11[i67][i65]) {
                        i16 = i65;
                        c4232j.m(3);
                    } else {
                        i16 = i65;
                    }
                    i67++;
                    i65 = i16;
                }
                i65 = i66;
            }
        }
        c4232j.l();
        int i68 = c4232j.i() + 1;
        AbstractC3445z.a k11 = AbstractC3445z.k();
        k11.a(q10);
        if (i68 > 1) {
            k11.a(q11);
            for (int i69 = 2; i69 < i68; i69++) {
                q11 = q(c4232j, c4232j.e(), f11, q11);
                k11.a(q11);
            }
        }
        AbstractC3445z m11 = k11.m();
        int i70 = c4232j.i() + i20;
        if (i70 > i20) {
            return new k(bVar, null, dVar, null, null);
        }
        int f14 = c4232j.f(2);
        boolean[][] zArr12 = (boolean[][]) Array.newInstance((Class<?>) cls2, i70, i21);
        int[] iArr28 = new int[i70];
        int i71 = 0;
        int[] iArr29 = new int[i70];
        int i72 = 0;
        while (i72 < i20) {
            iArr28[i72] = i71;
            iArr29[i72] = iArr21[i72];
            if (f14 == 0) {
                i15 = i72;
                zArr = zArr12;
                abstractC3445z = m11;
                iArr4 = iArr28;
                Arrays.fill(zArr12[i15], i71, iArr6[i15], true);
                iArr4[i15] = iArr6[i15];
            } else {
                abstractC3445z = m11;
                i15 = i72;
                zArr = zArr12;
                iArr4 = iArr28;
                if (f14 == 1) {
                    int i73 = iArr21[i15];
                    for (int i74 = 0; i74 < iArr6[i15]; i74++) {
                        zArr[i15][i74] = iArr5[i15][i74] == i73;
                    }
                    iArr4[i15] = 1;
                } else {
                    i71 = 0;
                    zArr[0][0] = true;
                    iArr4[0] = 1;
                    i72 = i15 + 1;
                    zArr12 = zArr;
                    iArr28 = iArr4;
                    m11 = abstractC3445z;
                }
            }
            i71 = 0;
            i72 = i15 + 1;
            zArr12 = zArr;
            iArr28 = iArr4;
            m11 = abstractC3445z;
        }
        AbstractC3445z abstractC3445z2 = m11;
        boolean[][] zArr13 = zArr12;
        int[] iArr30 = iArr28;
        int[] iArr31 = new int[i21];
        int i75 = 2;
        int[] iArr32 = new int[2];
        iArr32[1] = i21;
        iArr32[i71] = i70;
        boolean[][] zArr14 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr32);
        int i76 = 1;
        int i77 = 0;
        while (i76 < i70) {
            if (f14 == i75) {
                for (int i78 = 0; i78 < iArr6[i76]; i78++) {
                    zArr13[i76][i78] = c4232j.e();
                    int i79 = iArr30[i76];
                    boolean z11 = zArr13[i76][i78];
                    iArr30[i76] = i79 + (z11 ? 1 : 0);
                    if (z11) {
                        iArr29[i76] = iArr5[i76][i78];
                    }
                }
            }
            if (i77 == 0) {
                i12 = 0;
                if (iArr5[i76][0] == 0 && zArr13[i76][0]) {
                    for (int i80 = 1; i80 < iArr6[i76]; i80++) {
                        if (iArr5[i76][i80] == i11 && zArr13[i76][i11]) {
                            i77 = i76;
                        }
                    }
                }
            } else {
                i12 = 0;
            }
            int i81 = i12;
            while (i81 < iArr6[i76]) {
                if (i68 > 1) {
                    zArr14[i76][i81] = zArr13[i76][i81];
                    i14 = i11;
                    iArr3 = iArr31;
                    i13 = i68;
                    int d10 = com.google.common.math.b.d(i68, RoundingMode.CEILING);
                    if (!zArr14[i76][i81]) {
                        int i82 = ((a) m10.get(iArr5[i76][i81])).f46186a;
                        int i83 = i12;
                        while (true) {
                            if (i83 >= i81) {
                                break;
                            }
                            int i84 = i82;
                            if (zArr8[i84][((a) m10.get(iArr5[i76][i83])).f46186a]) {
                                zArr14[i76][i81] = true;
                                break;
                            }
                            i83++;
                            i82 = i84;
                        }
                    }
                    if (zArr14[i76][i81]) {
                        if (i77 <= 0 || i76 != i77) {
                            c4232j.m(d10);
                        } else {
                            iArr3[i81] = c4232j.f(d10);
                        }
                    }
                } else {
                    i13 = i68;
                    i14 = i11;
                    iArr3 = iArr31;
                }
                i81++;
                i11 = i14;
                iArr31 = iArr3;
                i68 = i13;
            }
            int i85 = i68;
            int i86 = i11;
            int[] iArr33 = iArr31;
            if (iArr30[i76] == 1 && iArr2[iArr29[i76]] > 0) {
                c4232j.l();
            }
            i76++;
            i11 = i86;
            iArr31 = iArr33;
            i68 = i85;
            i75 = 2;
        }
        int[] iArr34 = iArr31;
        if (i77 == 0) {
            return new k(bVar, null, dVar, null, null);
        }
        f s10 = s(c4232j, i18);
        c4232j.m(2);
        for (int i87 = 1; i87 < i18; i87++) {
            if (iArr2[iArr23[i87]] == 0) {
                c4232j.l();
            }
        }
        E(c4232j, i70, iArr26, iArr6, zArr14);
        K(c4232j, i18, zArr11);
        if (c4232j.e()) {
            c4232j.b();
            jVar = x(c4232j, i18, i20, iArr26);
        } else {
            jVar = null;
        }
        return new k(bVar, m10, new d(abstractC3445z2, iArr34), s10, jVar);
    }
}
