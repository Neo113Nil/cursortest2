package h4;

import B90.C2606h;
import Ij.C3261b;
import N3.B;
import N3.C3656g;
import N3.C3657h;
import N3.C3659j;
import N3.G;
import N3.H;
import N3.InterfaceC3665p;
import N3.L;
import N3.M;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.AbstractC5880y;
import j3.C7270l;
import j3.C7272n;
import j3.t;
import j3.v;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k4.o;
import m3.C8050C;
import m3.C8056I;
import m3.N;
import n3.AbstractC8431d;
import n3.C8434g;
import n3.C8436i;

/* renamed from: h4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6798d implements InterfaceC3665p {

    /* renamed from: N, reason: collision with root package name */
    private static final byte[] f64801N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: O, reason: collision with root package name */
    private static final C7272n f64802O;

    /* renamed from: B, reason: collision with root package name */
    private b f64804B;

    /* renamed from: C, reason: collision with root package name */
    private int f64805C;

    /* renamed from: D, reason: collision with root package name */
    private int f64806D;

    /* renamed from: E, reason: collision with root package name */
    private int f64807E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f64808F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f64809G;

    /* renamed from: K, reason: collision with root package name */
    private boolean f64813K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f64814L;

    /* renamed from: a, reason: collision with root package name */
    private final o.a f64816a;

    /* renamed from: b, reason: collision with root package name */
    private final int f64817b;

    /* renamed from: c, reason: collision with root package name */
    private final List<C7272n> f64818c;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f64823h;

    /* renamed from: i, reason: collision with root package name */
    private final C8050C f64824i;

    /* renamed from: j, reason: collision with root package name */
    private final C8056I f64825j;

    /* renamed from: r, reason: collision with root package name */
    private int f64833r;

    /* renamed from: s, reason: collision with root package name */
    private int f64834s;

    /* renamed from: t, reason: collision with root package name */
    private long f64835t;

    /* renamed from: u, reason: collision with root package name */
    private int f64836u;

    /* renamed from: v, reason: collision with root package name */
    private C8050C f64837v;

    /* renamed from: w, reason: collision with root package name */
    private long f64838w;

    /* renamed from: x, reason: collision with root package name */
    private int f64839x;

    /* renamed from: k, reason: collision with root package name */
    private final Ef.m f64826k = new Ef.m();

    /* renamed from: l, reason: collision with root package name */
    private final C8050C f64827l = new C8050C(16);

    /* renamed from: e, reason: collision with root package name */
    private final C8050C f64820e = new C8050C(C8434g.f76385a);

    /* renamed from: f, reason: collision with root package name */
    private final C8050C f64821f = new C8050C(6);

    /* renamed from: g, reason: collision with root package name */
    private final C8050C f64822g = new C8050C();

    /* renamed from: m, reason: collision with root package name */
    private final ArrayDeque<AbstractC8431d.a> f64828m = new ArrayDeque<>();

    /* renamed from: n, reason: collision with root package name */
    private final ArrayDeque<a> f64829n = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray<b> f64819d = new SparseArray<>();

    /* renamed from: q, reason: collision with root package name */
    private AbstractC5880y<L> f64832q = AbstractC5880y.v();

    /* renamed from: z, reason: collision with root package name */
    private long f64841z = -9223372036854775807L;

    /* renamed from: y, reason: collision with root package name */
    private long f64840y = -9223372036854775807L;

    /* renamed from: A, reason: collision with root package name */
    private long f64803A = -9223372036854775807L;

    /* renamed from: H, reason: collision with root package name */
    private N3.r f64810H = N3.r.f18647V;

    /* renamed from: I, reason: collision with root package name */
    private M[] f64811I = new M[0];

    /* renamed from: J, reason: collision with root package name */
    private M[] f64812J = new M[0];

    /* renamed from: o, reason: collision with root package name */
    private final C8436i f64830o = new C8436i(new BY.c(this));

    /* renamed from: p, reason: collision with root package name */
    private final C3657h f64831p = new C3657h();

    /* renamed from: M, reason: collision with root package name */
    private long f64815M = -1;

    /* renamed from: h4.d$a */
    /* loaded from: classes8.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f64842a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f64843b;

        /* renamed from: c, reason: collision with root package name */
        public final int f64844c;

        public a(long j11, int i11, boolean z11) {
            this.f64842a = j11;
            this.f64843b = z11;
            this.f64844c = i11;
        }
    }

    /* renamed from: h4.d$b */
    /* loaded from: classes8.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final M f64845a;

        /* renamed from: d, reason: collision with root package name */
        public r f64848d;

        /* renamed from: e, reason: collision with root package name */
        public C6796b f64849e;

        /* renamed from: f, reason: collision with root package name */
        public int f64850f;

        /* renamed from: g, reason: collision with root package name */
        public int f64851g;

        /* renamed from: h, reason: collision with root package name */
        public int f64852h;

        /* renamed from: i, reason: collision with root package name */
        public int f64853i;

        /* renamed from: j, reason: collision with root package name */
        private final C7272n f64854j;

        /* renamed from: m, reason: collision with root package name */
        private boolean f64857m;

        /* renamed from: b, reason: collision with root package name */
        public final q f64846b = new q();

        /* renamed from: c, reason: collision with root package name */
        public final C8050C f64847c = new C8050C();

        /* renamed from: k, reason: collision with root package name */
        private final C8050C f64855k = new C8050C(1);

        /* renamed from: l, reason: collision with root package name */
        private final C8050C f64856l = new C8050C();

        public b(M m11, r rVar, C6796b c6796b, C7272n c7272n) {
            this.f64845a = m11;
            this.f64848d = rVar;
            this.f64849e = c6796b;
            this.f64854j = c7272n;
            j(rVar, c6796b);
        }

        public final int c() {
            int i11 = !this.f64857m ? this.f64848d.f64950g[this.f64850f] : this.f64846b.f64936j[this.f64850f] ? 1 : 0;
            return g() != null ? i11 | 1073741824 : i11;
        }

        public final long d() {
            return !this.f64857m ? this.f64848d.f64946c[this.f64850f] : this.f64846b.f64932f[this.f64852h];
        }

        public final long e() {
            if (!this.f64857m) {
                return this.f64848d.f64949f[this.f64850f];
            }
            return this.f64846b.f64935i[this.f64850f];
        }

        public final int f() {
            return !this.f64857m ? this.f64848d.f64947d[this.f64850f] : this.f64846b.f64934h[this.f64850f];
        }

        public final p g() {
            if (!this.f64857m) {
                return null;
            }
            q qVar = this.f64846b;
            C6796b c6796b = qVar.f64927a;
            int i11 = N.f74289a;
            int i12 = c6796b.f64790a;
            p pVar = qVar.f64939m;
            if (pVar == null) {
                pVar = this.f64848d.f64944a.b(i12);
            }
            if (pVar == null || !pVar.f64922a) {
                return null;
            }
            return pVar;
        }

        public final boolean h() {
            this.f64850f++;
            if (!this.f64857m) {
                return false;
            }
            int i11 = this.f64851g + 1;
            this.f64851g = i11;
            int[] iArr = this.f64846b.f64933g;
            int i12 = this.f64852h;
            if (i11 != iArr[i12]) {
                return true;
            }
            this.f64852h = i12 + 1;
            this.f64851g = 0;
            return false;
        }

        public final int i(int i11, int i12) {
            C8050C c8050c;
            p g10 = g();
            if (g10 == null) {
                return 0;
            }
            q qVar = this.f64846b;
            int i13 = g10.f64925d;
            if (i13 != 0) {
                c8050c = qVar.f64940n;
            } else {
                int i14 = N.f74289a;
                byte[] bArr = g10.f64926e;
                int length = bArr.length;
                C8050C c8050c2 = this.f64856l;
                c8050c2.P(length, bArr);
                i13 = bArr.length;
                c8050c = c8050c2;
            }
            boolean z11 = qVar.f64937k && qVar.f64938l[this.f64850f];
            boolean z12 = z11 || i12 != 0;
            C8050C c8050c3 = this.f64855k;
            c8050c3.e()[0] = (byte) ((z12 ? UserVerificationMethods.USER_VERIFY_PATTERN : 0) | i13);
            c8050c3.R(0);
            M m11 = this.f64845a;
            m11.f(c8050c3, 1, 1);
            m11.f(c8050c, i13, 1);
            if (!z12) {
                return i13 + 1;
            }
            C8050C c8050c4 = this.f64847c;
            if (!z11) {
                c8050c4.O(8);
                byte[] e11 = c8050c4.e();
                e11[0] = 0;
                e11[1] = 1;
                e11[2] = (byte) 0;
                e11[3] = (byte) (i12 & 255);
                e11[4] = (byte) ((i11 >> 24) & 255);
                e11[5] = (byte) ((i11 >> 16) & 255);
                e11[6] = (byte) ((i11 >> 8) & 255);
                e11[7] = (byte) (i11 & 255);
                m11.f(c8050c4, 8, 1);
                return i13 + 9;
            }
            C8050C c8050c5 = qVar.f64940n;
            int L11 = c8050c5.L();
            c8050c5.S(-2);
            int i15 = (L11 * 6) + 2;
            if (i12 != 0) {
                c8050c4.O(i15);
                byte[] e12 = c8050c4.e();
                c8050c5.n(0, i15, e12);
                int i16 = (((e12[2] & 255) << 8) | (e12[3] & 255)) + i12;
                e12[2] = (byte) ((i16 >> 8) & 255);
                e12[3] = (byte) (i16 & 255);
            } else {
                c8050c4 = c8050c5;
            }
            m11.f(c8050c4, i15, 1);
            return i13 + 1 + i15;
        }

        public final void j(r rVar, C6796b c6796b) {
            this.f64848d = rVar;
            this.f64849e = c6796b;
            this.f64845a.a(this.f64854j);
            k();
        }

        public final void k() {
            q qVar = this.f64846b;
            qVar.f64930d = 0;
            qVar.f64942p = 0L;
            qVar.f64943q = false;
            qVar.f64937k = false;
            qVar.f64941o = false;
            qVar.f64939m = null;
            this.f64850f = 0;
            this.f64852h = 0;
            this.f64851g = 0;
            this.f64853i = 0;
            this.f64857m = false;
        }

        public final void l(long j11) {
            int i11 = this.f64850f;
            while (true) {
                q qVar = this.f64846b;
                if (i11 >= qVar.f64931e || qVar.f64935i[i11] > j11) {
                    return;
                }
                if (qVar.f64936j[i11]) {
                    this.f64853i = i11;
                }
                i11++;
            }
        }

        public final void m() {
            p g10 = g();
            if (g10 == null) {
                return;
            }
            q qVar = this.f64846b;
            C8050C c8050c = qVar.f64940n;
            int i11 = g10.f64925d;
            if (i11 != 0) {
                c8050c.S(i11);
            }
            int i12 = this.f64850f;
            if (qVar.f64937k && qVar.f64938l[i12]) {
                c8050c.S(c8050c.L() * 6);
            }
        }

        public final void n(C7270l c7270l) {
            r rVar = this.f64848d;
            C6796b c6796b = this.f64846b.f64927a;
            int i11 = N.f74289a;
            p b11 = rVar.f64944a.b(c6796b.f64790a);
            C7270l a11 = c7270l.a(b11 != null ? b11.f64923b : null);
            C7272n.a a12 = this.f64854j.a();
            a12.c0(a11);
            this.f64845a.a(a12.P());
        }
    }

    static {
        C7272n.a aVar = new C7272n.a();
        aVar.y0("application/x-emsg");
        f64802O = aVar.P();
    }

    public C6798d(o.a aVar, int i11, C8056I c8056i, List list) {
        this.f64816a = aVar;
        this.f64817b = i11;
        this.f64825j = c8056i;
        this.f64818c = Collections.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.f64823h = bArr;
        this.f64824i = new C8050C(bArr);
    }

    private void h() {
        this.f64833r = 0;
        this.f64836u = 0;
    }

    private static C7270l i(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC8431d.b bVar = (AbstractC8431d.b) arrayList.get(i11);
            if (bVar.f76375a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] e11 = bVar.f76379b.e();
                UUID d11 = k.d(e11);
                if (d11 == null) {
                    m3.s.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new C7270l.b(d11, "video/mp4", e11));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C7270l(arrayList2);
    }

    private static void j(C8050C c8050c, int i11, q qVar) throws v {
        c8050c.R(i11 + 8);
        int p11 = c8050c.p();
        int i12 = C6795a.f64748b;
        if ((p11 & 1) != 0) {
            throw v.e("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z11 = (p11 & 2) != 0;
        int I11 = c8050c.I();
        if (I11 == 0) {
            Arrays.fill(qVar.f64938l, 0, qVar.f64931e, false);
            return;
        }
        if (I11 != qVar.f64931e) {
            StringBuilder f7 = P4.f.f(I11, "Senc sample count ", " is different from fragment sample count");
            f7.append(qVar.f64931e);
            throw v.a(null, f7.toString());
        }
        Arrays.fill(qVar.f64938l, 0, I11, z11);
        qVar.c(c8050c.a());
        qVar.b(c8050c);
    }

    private static Pair k(long j11, C8050C c8050c) throws v {
        long K11;
        long K12;
        C8050C c8050c2 = c8050c;
        c8050c2.R(8);
        int d11 = C6795a.d(c8050c2.p());
        c8050c2.S(4);
        long G11 = c8050c2.G();
        if (d11 == 0) {
            K11 = c8050c2.G();
            K12 = c8050c2.G();
        } else {
            K11 = c8050c2.K();
            K12 = c8050c2.K();
        }
        long j12 = K12 + j11;
        int i11 = N.f74289a;
        long Z11 = N.Z(K11, 1000000L, G11, RoundingMode.DOWN);
        c8050c2.S(2);
        int L11 = c8050c2.L();
        int[] iArr = new int[L11];
        long[] jArr = new long[L11];
        long[] jArr2 = new long[L11];
        long[] jArr3 = new long[L11];
        long j13 = j12;
        long j14 = Z11;
        int i12 = 0;
        while (i12 < L11) {
            int p11 = c8050c2.p();
            if ((Integer.MIN_VALUE & p11) != 0) {
                throw v.a(null, "Unhandled indirect reference");
            }
            long G12 = c8050c2.G();
            iArr[i12] = p11 & Integer.MAX_VALUE;
            jArr[i12] = j13;
            jArr3[i12] = j14;
            K11 += G12;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long Z12 = N.Z(K11, 1000000L, G11, RoundingMode.DOWN);
            jArr4[i12] = Z12 - jArr5[i12];
            c8050c2.S(4);
            j13 += iArr[i12];
            i12++;
            L11 = L11;
            c8050c2 = c8050c;
            j14 = Z12;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(Z11), new C3656g(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x041b, code lost:
    
        if ((m3.N.Z(r41, 1000000, r1.f64913d, r47) + m3.N.Z(r6[0], 1000000, r1.f64912c, r47)) >= r1.f64914e) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x07e2, code lost:
    
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x07e5, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void l(long j11) throws v {
        t tVar;
        C6796b c6796b;
        ArrayList arrayList;
        int i11;
        C6796b c6796b2;
        int i12;
        ArrayList arrayList2;
        int i13;
        int i14;
        ArrayList arrayList3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        byte[] bArr;
        int i21;
        boolean z11;
        int i22;
        int i23;
        int i24;
        ArrayList arrayList4;
        int i25;
        boolean z12;
        boolean z13;
        int i26;
        boolean[] zArr;
        int i27;
        C6796b c6796b3;
        int i28;
        long[] jArr;
        while (true) {
            ArrayDeque<AbstractC8431d.a> arrayDeque = this.f64828m;
            if (arrayDeque.isEmpty() || arrayDeque.peek().f76376b != j11) {
                break;
            }
            AbstractC8431d.a pop = arrayDeque.pop();
            int i29 = pop.f76375a;
            SparseArray<b> sparseArray = this.f64819d;
            ArrayList arrayList5 = pop.f76377c;
            int i31 = this.f64817b;
            int i32 = 12;
            int i33 = 2;
            int i34 = 16;
            if (i29 == 1836019574) {
                C7270l i35 = i(arrayList5);
                AbstractC8431d.a b11 = pop.b(1836475768);
                b11.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList6 = b11.f76377c;
                int size = arrayList6.size();
                int i36 = 0;
                long j12 = -9223372036854775807L;
                while (i36 < size) {
                    AbstractC8431d.b bVar = (AbstractC8431d.b) arrayList6.get(i36);
                    int i37 = bVar.f76375a;
                    C8050C c8050c = bVar.f76379b;
                    if (i37 == 1953654136) {
                        c8050c.R(i32);
                        i12 = i36;
                        Pair create = Pair.create(Integer.valueOf(c8050c.p()), new C6796b(c8050c.p() - 1, c8050c.p(), c8050c.p(), c8050c.p()));
                        sparseArray2.put(((Integer) create.first).intValue(), (C6796b) create.second);
                    } else {
                        i12 = i36;
                        if (i37 == 1835362404) {
                            c8050c.R(8);
                            j12 = C6795a.d(c8050c.p()) == 0 ? c8050c.G() : c8050c.K();
                        }
                    }
                    i36 = i12 + 1;
                    i32 = 12;
                }
                int i38 = 0;
                AbstractC8431d.a b12 = pop.b(1835365473);
                t e11 = b12 != null ? C6795a.e(b12) : null;
                B b13 = new B();
                AbstractC8431d.b c11 = pop.c(1969517665);
                if (c11 != null) {
                    t j13 = C6795a.j(c11);
                    b13.b(j13);
                    tVar = j13;
                } else {
                    tVar = null;
                }
                AbstractC8431d.b c12 = pop.c(1836476516);
                c12.getClass();
                t tVar2 = new t(C6795a.f(c12.f76379b));
                ArrayList i39 = C6795a.i(pop, b13, j12, i35, (i31 & 16) != 0, false, new C2606h(this, 3));
                int size2 = i39.size();
                if (sparseArray.size() == 0) {
                    String a11 = g.a(i39);
                    int i41 = 0;
                    while (i41 < size2) {
                        r rVar = (r) i39.get(i41);
                        o oVar = rVar.f64944a;
                        M track = this.f64810H.track(i41, oVar.f64911b);
                        track.getClass();
                        C7272n c7272n = oVar.f64916g;
                        C7272n.a a12 = c7272n.a();
                        a12.W(a11);
                        String str = a11;
                        int i42 = oVar.f64911b;
                        int i43 = i41;
                        if (i42 == 1) {
                            int i44 = b13.f18466a;
                            arrayList = i39;
                            i11 = size2;
                            if (i44 != -1 && b13.f18467b != -1) {
                                a12.d0(i44);
                                a12.e0(b13.f18467b);
                            }
                        } else {
                            arrayList = i39;
                            i11 = size2;
                        }
                        f.i(i42, e11, a12, c7272n.f69124l, tVar, tVar2);
                        int size3 = sparseArray2.size();
                        int i45 = oVar.f64910a;
                        if (size3 == 1) {
                            c6796b2 = (C6796b) sparseArray2.valueAt(i38);
                        } else {
                            c6796b2 = (C6796b) sparseArray2.get(i45);
                            c6796b2.getClass();
                        }
                        sparseArray.put(i45, new b(track, rVar, c6796b2, a12.P()));
                        this.f64841z = Math.max(this.f64841z, oVar.f64914e);
                        i41 = i43 + 1;
                        a11 = str;
                        i39 = arrayList;
                        size2 = i11;
                        i38 = 0;
                    }
                    this.f64810H.endTracks();
                } else {
                    ArrayList arrayList7 = i39;
                    G10.a.h(sparseArray.size() == size2);
                    int i46 = 0;
                    while (i46 < size2) {
                        ArrayList arrayList8 = arrayList7;
                        r rVar2 = (r) arrayList8.get(i46);
                        o oVar2 = rVar2.f64944a;
                        b bVar2 = sparseArray.get(oVar2.f64910a);
                        if (sparseArray2.size() == 1) {
                            c6796b = (C6796b) sparseArray2.valueAt(0);
                        } else {
                            c6796b = (C6796b) sparseArray2.get(oVar2.f64910a);
                            c6796b.getClass();
                        }
                        bVar2.j(rVar2, c6796b);
                        i46++;
                        arrayList7 = arrayList8;
                    }
                }
            } else {
                int i47 = 4;
                if (i29 == 1836019558) {
                    ArrayList arrayList9 = pop.f76378d;
                    int size4 = arrayList9.size();
                    int i48 = 0;
                    while (i48 < size4) {
                        AbstractC8431d.a aVar = (AbstractC8431d.a) arrayList9.get(i48);
                        if (aVar.f76375a == 1953653094) {
                            AbstractC8431d.b c13 = aVar.c(1952868452);
                            c13.getClass();
                            C8050C c8050c2 = c13.f76379b;
                            c8050c2.R(8);
                            int p11 = c8050c2.p();
                            int i49 = C6795a.f64748b;
                            b bVar3 = sparseArray.get(c8050c2.p());
                            if (bVar3 == null) {
                                bVar3 = null;
                            } else {
                                int i51 = p11 & 1;
                                q qVar = bVar3.f64846b;
                                if (i51 != 0) {
                                    long K11 = c8050c2.K();
                                    qVar.f64928b = K11;
                                    qVar.f64929c = K11;
                                }
                                C6796b c6796b4 = bVar3.f64849e;
                                qVar.f64927a = new C6796b((p11 & 2) != 0 ? c8050c2.p() - 1 : c6796b4.f64790a, (p11 & 8) != 0 ? c8050c2.p() : c6796b4.f64791b, (p11 & 16) != 0 ? c8050c2.p() : c6796b4.f64792c, (p11 & 32) != 0 ? c8050c2.p() : c6796b4.f64793d);
                            }
                            if (bVar3 == null) {
                                arrayList2 = arrayList9;
                                i13 = size4;
                                i14 = i48;
                                arrayList3 = arrayList5;
                                i15 = i31;
                                i16 = i34;
                                i17 = i47;
                            } else {
                                q qVar2 = bVar3.f64846b;
                                long j14 = qVar2.f64942p;
                                boolean z14 = qVar2.f64943q;
                                bVar3.k();
                                bVar3.f64857m = true;
                                AbstractC8431d.b c14 = aVar.c(1952867444);
                                if (c14 == null || (i31 & 2) != 0) {
                                    qVar2.f64942p = j14;
                                    qVar2.f64943q = z14;
                                } else {
                                    C8050C c8050c3 = c14.f76379b;
                                    c8050c3.R(8);
                                    qVar2.f64942p = C6795a.d(c8050c3.p()) == 1 ? c8050c3.K() : c8050c3.G();
                                    qVar2.f64943q = true;
                                }
                                ArrayList arrayList10 = aVar.f76377c;
                                int size5 = arrayList10.size();
                                int i52 = 0;
                                int i53 = 0;
                                int i54 = 0;
                                while (true) {
                                    i18 = 1953658222;
                                    if (i52 >= size5) {
                                        break;
                                    }
                                    ArrayList arrayList11 = arrayList9;
                                    AbstractC8431d.b bVar4 = (AbstractC8431d.b) arrayList10.get(i52);
                                    int i55 = size4;
                                    if (bVar4.f76375a == 1953658222) {
                                        C8050C c8050c4 = bVar4.f76379b;
                                        c8050c4.R(12);
                                        int I11 = c8050c4.I();
                                        if (I11 > 0) {
                                            i54 += I11;
                                            i53++;
                                            i52++;
                                            size4 = i55;
                                            arrayList9 = arrayList11;
                                        }
                                    }
                                    i52++;
                                    size4 = i55;
                                    arrayList9 = arrayList11;
                                }
                                arrayList2 = arrayList9;
                                i13 = size4;
                                bVar3.f64852h = 0;
                                bVar3.f64851g = 0;
                                bVar3.f64850f = 0;
                                qVar2.d(i53, i54);
                                int i56 = 0;
                                int i57 = 0;
                                int i58 = 0;
                                while (i56 < size5) {
                                    long j15 = 0;
                                    AbstractC8431d.b bVar5 = (AbstractC8431d.b) arrayList10.get(i56);
                                    if (bVar5.f76375a == i18) {
                                        int i59 = i57 + 1;
                                        C8050C c8050c5 = bVar5.f76379b;
                                        c8050c5.R(8);
                                        int p12 = c8050c5.p();
                                        int i61 = C6795a.f64748b;
                                        i22 = i56;
                                        r rVar3 = bVar3.f64848d;
                                        int i62 = i57;
                                        C6796b c6796b5 = qVar2.f64927a;
                                        int i63 = N.f74289a;
                                        i23 = i48;
                                        qVar2.f64933g[i62] = c8050c5.I();
                                        long[] jArr2 = qVar2.f64932f;
                                        i24 = size5;
                                        int i64 = i58;
                                        long j16 = qVar2.f64928b;
                                        jArr2[i62] = j16;
                                        if ((p12 & 1) != 0) {
                                            jArr2[i62] = j16 + c8050c5.p();
                                        }
                                        boolean z15 = (p12 & 4) != 0;
                                        int i65 = c6796b5.f64793d;
                                        if (z15) {
                                            i65 = c8050c5.p();
                                        }
                                        boolean z16 = (p12 & 256) != 0;
                                        boolean z17 = z15;
                                        boolean z18 = (p12 & UserVerificationMethods.USER_VERIFY_NONE) != 0;
                                        boolean z19 = (p12 & UserVerificationMethods.USER_VERIFY_ALL) != 0;
                                        boolean z21 = (p12 & 2048) != 0;
                                        o oVar3 = rVar3.f64944a;
                                        boolean z22 = z19;
                                        long[] jArr3 = oVar3.f64918i;
                                        int i66 = i65;
                                        if (jArr3 == null || jArr3.length != 1 || (jArr = oVar3.f64919j) == null) {
                                            z12 = z16;
                                        } else {
                                            long j17 = jArr3[0];
                                            if (j17 == 0) {
                                                z12 = z16;
                                            } else {
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                                z12 = z16;
                                            }
                                            j15 = jArr[0];
                                        }
                                        int[] iArr = qVar2.f64934h;
                                        long[] jArr4 = qVar2.f64935i;
                                        boolean[] zArr2 = qVar2.f64936j;
                                        boolean z23 = oVar3.f64911b == i33 && (i31 & 1) != 0;
                                        int i67 = i64 + qVar2.f64933g[i62];
                                        arrayList4 = arrayList5;
                                        long j18 = qVar2.f64942p;
                                        int i68 = i64;
                                        while (i68 < i67) {
                                            if (z12) {
                                                z13 = z23;
                                                i26 = c8050c5.p();
                                            } else {
                                                z13 = z23;
                                                i26 = c6796b5.f64791b;
                                            }
                                            int i69 = i67;
                                            if (i26 < 0) {
                                                throw v.a(null, "Unexpected negative value: " + i26);
                                            }
                                            if (z18) {
                                                zArr = zArr2;
                                                i27 = c8050c5.p();
                                            } else {
                                                zArr = zArr2;
                                                i27 = c6796b5.f64792c;
                                            }
                                            if (i27 < 0) {
                                                throw v.a(null, "Unexpected negative value: " + i27);
                                            }
                                            int p13 = z22 ? c8050c5.p() : (i68 == 0 && z17) ? i66 : c6796b5.f64793d;
                                            if (z21) {
                                                c6796b3 = c6796b5;
                                                i28 = c8050c5.p();
                                            } else {
                                                c6796b3 = c6796b5;
                                                i28 = 0;
                                            }
                                            int i71 = i31;
                                            boolean z24 = z21;
                                            long Z11 = N.Z((i28 + j18) - j15, 1000000L, oVar3.f64912c, RoundingMode.DOWN);
                                            jArr4[i68] = Z11;
                                            if (!qVar2.f64943q) {
                                                jArr4[i68] = Z11 + bVar3.f64848d.f64951h;
                                            }
                                            iArr[i68] = i27;
                                            zArr[i68] = ((p13 >> 16) & 1) == 0 && (!z13 || i68 == 0);
                                            j18 += i26;
                                            i68++;
                                            i67 = i69;
                                            z23 = z13;
                                            zArr2 = zArr;
                                            c6796b5 = c6796b3;
                                            i31 = i71;
                                            z21 = z24;
                                        }
                                        i25 = i31;
                                        qVar2.f64942p = j18;
                                        i58 = i67;
                                        i57 = i59;
                                    } else {
                                        i22 = i56;
                                        i23 = i48;
                                        i24 = size5;
                                        arrayList4 = arrayList5;
                                        i25 = i31;
                                    }
                                    i56 = i22 + 1;
                                    i48 = i23;
                                    size5 = i24;
                                    arrayList5 = arrayList4;
                                    i31 = i25;
                                    i18 = 1953658222;
                                    i33 = 2;
                                }
                                i14 = i48;
                                arrayList3 = arrayList5;
                                i15 = i31;
                                r rVar4 = bVar3.f64848d;
                                C6796b c6796b6 = qVar2.f64927a;
                                c6796b6.getClass();
                                p b14 = rVar4.f64944a.b(c6796b6.f64790a);
                                AbstractC8431d.b c15 = aVar.c(1935763834);
                                if (c15 != null) {
                                    b14.getClass();
                                    C8050C c8050c6 = c15.f76379b;
                                    c8050c6.R(8);
                                    int p14 = c8050c6.p();
                                    int i72 = C6795a.f64748b;
                                    if ((p14 & 1) == 1) {
                                        c8050c6.S(8);
                                    }
                                    int E11 = c8050c6.E();
                                    int I12 = c8050c6.I();
                                    if (I12 > qVar2.f64931e) {
                                        StringBuilder f7 = P4.f.f(I12, "Saiz sample count ", " is greater than fragment sample count");
                                        f7.append(qVar2.f64931e);
                                        throw v.a(null, f7.toString());
                                    }
                                    int i73 = b14.f64925d;
                                    if (E11 == 0) {
                                        boolean[] zArr3 = qVar2.f64938l;
                                        i21 = 0;
                                        for (int i74 = 0; i74 < I12; i74++) {
                                            int E12 = c8050c6.E();
                                            i21 += E12;
                                            zArr3[i74] = E12 > i73;
                                        }
                                        z11 = false;
                                    } else {
                                        boolean z25 = E11 > i73;
                                        i21 = E11 * I12;
                                        z11 = false;
                                        Arrays.fill(qVar2.f64938l, 0, I12, z25);
                                    }
                                    Arrays.fill(qVar2.f64938l, I12, qVar2.f64931e, z11);
                                    if (i21 > 0) {
                                        qVar2.c(i21);
                                    }
                                }
                                AbstractC8431d.b c16 = aVar.c(1935763823);
                                if (c16 != null) {
                                    C8050C c8050c7 = c16.f76379b;
                                    c8050c7.R(8);
                                    int p15 = c8050c7.p();
                                    int i75 = C6795a.f64748b;
                                    if ((p15 & 1) == 1) {
                                        c8050c7.S(8);
                                    }
                                    int I13 = c8050c7.I();
                                    if (I13 != 1) {
                                        throw v.a(null, "Unexpected saio entry count: " + I13);
                                    }
                                    qVar2.f64929c += C6795a.d(p15) == 0 ? c8050c7.G() : c8050c7.K();
                                }
                                AbstractC8431d.b c17 = aVar.c(1936027235);
                                if (c17 != null) {
                                    j(c17.f76379b, 0, qVar2);
                                }
                                String str2 = b14 != null ? b14.f64923b : null;
                                C8050C c8050c8 = null;
                                C8050C c8050c9 = null;
                                for (int i76 = 0; i76 < arrayList10.size(); i76++) {
                                    AbstractC8431d.b bVar6 = (AbstractC8431d.b) arrayList10.get(i76);
                                    C8050C c8050c10 = bVar6.f76379b;
                                    int i77 = bVar6.f76375a;
                                    if (i77 == 1935828848) {
                                        c8050c10.R(12);
                                        if (c8050c10.p() == 1936025959) {
                                            c8050c8 = c8050c10;
                                        }
                                    } else if (i77 == 1936158820) {
                                        c8050c10.R(12);
                                        if (c8050c10.p() == 1936025959) {
                                            c8050c9 = c8050c10;
                                        }
                                    }
                                }
                                if (c8050c8 == null || c8050c9 == null) {
                                    i17 = i47;
                                    i33 = 2;
                                } else {
                                    c8050c8.R(8);
                                    int d11 = C6795a.d(c8050c8.p());
                                    i17 = i47;
                                    c8050c8.S(i17);
                                    if (d11 == 1) {
                                        c8050c8.S(i17);
                                    }
                                    if (c8050c8.p() != 1) {
                                        throw v.e("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    c8050c9.R(8);
                                    int d12 = C6795a.d(c8050c9.p());
                                    c8050c9.S(i17);
                                    if (d12 != 1) {
                                        i19 = 2;
                                        if (d12 >= 2) {
                                            c8050c9.S(i17);
                                        }
                                    } else {
                                        if (c8050c9.G() == 0) {
                                            throw v.e("Variable length description in sgpd found (unsupported)");
                                        }
                                        i19 = 2;
                                    }
                                    if (c8050c9.G() != 1) {
                                        throw v.e("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    c8050c9.S(1);
                                    int E13 = c8050c9.E();
                                    int i78 = (E13 & 240) >> i17;
                                    int i79 = E13 & 15;
                                    i33 = i19;
                                    boolean z26 = c8050c9.E() == 1;
                                    if (z26) {
                                        int E14 = c8050c9.E();
                                        int i81 = i34;
                                        byte[] bArr2 = new byte[i81];
                                        c8050c9.n(0, i81, bArr2);
                                        if (E14 == 0) {
                                            int E15 = c8050c9.E();
                                            byte[] bArr3 = new byte[E15];
                                            c8050c9.n(0, E15, bArr3);
                                            bArr = bArr3;
                                        } else {
                                            bArr = null;
                                        }
                                        qVar2.f64937k = true;
                                        qVar2.f64939m = new p(z26, str2, E14, bArr2, i78, i79, bArr);
                                    }
                                }
                                int size6 = arrayList10.size();
                                for (int i82 = 0; i82 < size6; i82++) {
                                    AbstractC8431d.b bVar7 = (AbstractC8431d.b) arrayList10.get(i82);
                                    if (bVar7.f76375a == 1970628964) {
                                        C8050C c8050c11 = bVar7.f76379b;
                                        c8050c11.R(8);
                                        byte[] bArr4 = this.f64823h;
                                        c8050c11.n(0, 16, bArr4);
                                        if (Arrays.equals(bArr4, f64801N)) {
                                            j(c8050c11, 16, qVar2);
                                        }
                                    }
                                }
                                i16 = 16;
                            }
                        } else {
                            arrayList2 = arrayList9;
                            i13 = size4;
                            i14 = i48;
                            arrayList3 = arrayList5;
                            i15 = i31;
                            i16 = i34;
                            i17 = i47;
                        }
                        i48 = i14 + 1;
                        i34 = i16;
                        i47 = i17;
                        size4 = i13;
                        arrayList9 = arrayList2;
                        arrayList5 = arrayList3;
                        i31 = i15;
                    }
                    C7270l i83 = i(arrayList5);
                    if (i83 != null) {
                        int size7 = sparseArray.size();
                        for (int i84 = 0; i84 < size7; i84++) {
                            sparseArray.valueAt(i84).n(i83);
                        }
                    }
                    if (this.f64840y != -9223372036854775807L) {
                        int size8 = sparseArray.size();
                        for (int i85 = 0; i85 < size8; i85++) {
                            sparseArray.valueAt(i85).l(this.f64840y);
                        }
                        this.f64840y = -9223372036854775807L;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    arrayDeque.peek().f76378d.add(pop);
                }
            }
        }
    }

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        SparseArray<b> sparseArray = this.f64819d;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.valueAt(i11).k();
        }
        this.f64829n.clear();
        this.f64839x = 0;
        this.f64830o.b();
        this.f64840y = j12;
        this.f64828m.clear();
        h();
    }

    @Override // N3.InterfaceC3665p
    public final void b(N3.r rVar) {
        int i11;
        int i12 = this.f64817b;
        if ((i12 & 32) == 0) {
            rVar = new k4.p(rVar, this.f64816a);
        }
        this.f64810H = rVar;
        h();
        M[] mArr = new M[2];
        this.f64811I = mArr;
        int i13 = 0;
        int i14 = 100;
        if ((i12 & 4) != 0) {
            mArr[0] = this.f64810H.track(100, 5);
            i11 = 1;
            i14 = 101;
        } else {
            i11 = 0;
        }
        M[] mArr2 = (M[]) N.S(i11, this.f64811I);
        this.f64811I = mArr2;
        for (M m11 : mArr2) {
            m11.a(f64802O);
        }
        List<C7272n> list = this.f64818c;
        this.f64812J = new M[list.size()];
        while (i13 < this.f64812J.length) {
            M track = this.f64810H.track(i14, 3);
            track.a(list.get(i13));
            this.f64812J[i13] = track;
            i13++;
            i14++;
        }
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(N3.q qVar) throws IOException {
        L b11 = n.b((C3659j) qVar);
        this.f64832q = b11 != null ? AbstractC5880y.B(b11) : AbstractC5880y.v();
        return b11 == null;
    }

    @Override // N3.InterfaceC3665p
    public final List e() {
        return this.f64832q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:345:0x00ae, code lost:
    
        r3 = r35.f64833r;
        r5 = r2.f64845a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x00b8, code lost:
    
        if (r3 != 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x00ba, code lost:
    
        r35.f64805C = r2.f();
        r3 = r2.f64848d.f64944a.f64916g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x00cc, code lost:
    
        if (java.util.Objects.equals(r3.f69127o, "video/avc") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x00d0, code lost:
    
        if ((r10 & 64) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x00d2, code lost:
    
        r3 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x00e4, code lost:
    
        r35.f64808F = !r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x00ec, code lost:
    
        if (r2.f64850f >= r2.f64853i) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x00ee, code lost:
    
        ((N3.C3659j) r36).m(r35.f64805C, false);
        r2.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x00fc, code lost:
    
        if (r2.h() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x00fe, code lost:
    
        r35.f64804B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0101, code lost:
    
        r35.f64833r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0104, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x010d, code lost:
    
        if (r2.f64848d.f64944a.f64917h != r22) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x010f, code lost:
    
        r35.f64805C -= 8;
        ((N3.C3659j) r36).m(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x012b, code lost:
    
        if ("audio/ac4".equals(r2.f64848d.f64944a.f64916g.f69127o) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x012d, code lost:
    
        r35.f64806D = r2.i(r35.f64805C, 7);
        N3.C3652c.a(r35.f64805C, r11);
        r5.e(7, r11);
        r35.f64806D += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x014c, code lost:
    
        r35.f64805C += r35.f64806D;
        r35.f64833r = 4;
        r35.f64807E = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0144, code lost:
    
        r35.f64806D = r2.i(r35.f64805C, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x00d5, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x00dd, code lost:
    
        if (java.util.Objects.equals(r3.f69127o, "video/hevc") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x00e1, code lost:
    
        if ((r10 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0157, code lost:
    
        r3 = r2.f64848d;
        r10 = r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x015d, code lost:
    
        if (r8 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x015f, code lost:
    
        r10 = r8.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0163, code lost:
    
        r3 = r3.f64944a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0167, code lost:
    
        if (r3.f64920k == 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0169, code lost:
    
        r14 = r35.f64821f;
        r15 = r14.e();
        r15[0] = 0;
        r15[1] = 0;
        r15[r20] = 0;
        r4 = r3.f64920k;
        r6 = 4 - r4;
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x017d, code lost:
    
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0183, code lost:
    
        if (r35.f64806D >= r35.f64805C) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0185, code lost:
    
        r2 = r35.f64807E;
        r4 = r3.f64916g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0189, code lost:
    
        if (r2 != 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x018e, code lost:
    
        if (r35.f64812J.length > 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0192, code lost:
    
        if (r35.f64808F != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0195, code lost:
    
        r23 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x01af, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x01b0, code lost:
    
        r31 = r7;
        r32 = r8;
        ((N3.C3659j) r36).b(r15, r6, r17 + r2, false);
        r14.R(0);
        r3 = r14.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x01c4, code lost:
    
        if (r3 < 0) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x01c6, code lost:
    
        r35.f64807E = r3 - r2;
        r3 = r35.f64820e;
        r3.R(0);
        r5.e(4, r3);
        r35.f64806D += 4;
        r35.f64805C += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x01df, code lost:
    
        if (r35.f64812J.length <= 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x01e1, code lost:
    
        if (r2 <= 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x01e3, code lost:
    
        r3 = r15[4];
        r7 = java.util.Objects.equals(r4.f69127o, "video/avc");
        r8 = r4.f69123k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x01ed, code lost:
    
        if (r7 != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x01f3, code lost:
    
        if (j3.u.b(r8, "video/avc") == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x01f6, code lost:
    
        r19 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0206, code lost:
    
        if (java.util.Objects.equals(r4.f69127o, "video/hevc") != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x020c, code lost:
    
        if (j3.u.b(r8, "video/hevc") == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0216, code lost:
    
        if (((r19 & 126) >> 1) != 39) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0218, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x021b, code lost:
    
        r35.f64809G = r3;
        r5.e(r2, r14);
        r35.f64806D += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0225, code lost:
    
        if (r2 <= 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0229, code lost:
    
        if (r35.f64808F != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x022f, code lost:
    
        if (n3.C8434g.d(r15, r2, r4) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0231, code lost:
    
        r35.f64808F = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0234, code lost:
    
        r4 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0236, code lost:
    
        r3 = r23;
        r7 = r31;
        r8 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x01f9, code lost:
    
        r19 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x01fe, code lost:
    
        if ((r3 & 31) == 6) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x021a, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0245, code lost:
    
        throw j3.v.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0198, code lost:
    
        r2 = n3.C8434g.e(r4);
        r23 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x01aa, code lost:
    
        if ((r17 + r2) > (r35.f64805C - r35.f64806D)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x01ac, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0246, code lost:
    
        r23 = r3;
        r31 = r7;
        r32 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x024e, code lost:
    
        if (r35.f64809G == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0250, code lost:
    
        r3 = r35.f64822g;
        r3.O(r2);
        r19 = r6;
        ((N3.C3659j) r36).b(r3.e(), 0, r35.f64807E, false);
        r5.e(r35.f64807E, r3);
        r2 = r35.f64807E;
        r7 = n3.C8434g.m(r3.i(), r3.e());
        r3.R(0);
        r3.Q(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0280, code lost:
    
        if (r4.f69129q != (-1)) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0286, code lost:
    
        if (r9.e() == 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0288, code lost:
    
        r9.f(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0297, code lost:
    
        r9.a(r10, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x02a0, code lost:
    
        if ((r16.c() & 4) == 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x02a2, code lost:
    
        r9.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x02ae, code lost:
    
        r35.f64806D += r2;
        r35.f64807E -= r2;
        r4 = r17;
        r6 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x028c, code lost:
    
        r6 = r9.e();
        r4 = r4.f69129q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0292, code lost:
    
        if (r6 == r4) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0294, code lost:
    
        r9.f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x02a6, code lost:
    
        r19 = r6;
        r2 = r5.d(r36, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x02be, code lost:
    
        r31 = r7;
        r32 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x02db, code lost:
    
        r1 = r16.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x02e1, code lost:
    
        if (r35.f64808F != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x02e3, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x02e6, code lost:
    
        r26 = r1;
        r1 = r16.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x02ec, code lost:
    
        if (r1 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x02ee, code lost:
    
        r29 = r1.f64924c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x02f5, code lost:
    
        r24 = r10;
        r5.b(r24, r26, r35.f64805C, 0, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0306, code lost:
    
        if (r31.isEmpty() != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0308, code lost:
    
        r1 = r31.removeFirst();
        r35.f64839x -= r1.f64844c;
        r2 = r1.f64843b;
        r3 = r1.f64842a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0319, code lost:
    
        if (r2 == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x031b, code lost:
    
        r3 = r3 + r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x031d, code lost:
    
        r2 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x031f, code lost:
    
        if (r32 == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0321, code lost:
    
        r3 = r2.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0325, code lost:
    
        r6 = r3;
        r3 = r35.f64811I;
        r4 = r3.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x032a, code lost:
    
        if (r12 >= r4) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x032c, code lost:
    
        r3[r12].b(r6, 1, r1.f64844c, r35.f64839x, null);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x033a, code lost:
    
        r32 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0341, code lost:
    
        if (r16.h() != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0343, code lost:
    
        r35.f64804B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0346, code lost:
    
        r35.f64833r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x034b, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x02f3, code lost:
    
        r29 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x02c3, code lost:
    
        r16 = r2;
        r31 = r7;
        r32 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x02c9, code lost:
    
        r2 = r35.f64806D;
        r3 = r35.f64805C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x02cd, code lost:
    
        if (r2 >= r3) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x02cf, code lost:
    
        r35.f64806D += r5.d(r36, r3 - r2, false);
     */
    @Override // N3.InterfaceC3665p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(N3.q qVar, G g10) throws IOException {
        boolean z11;
        char c11;
        long j11;
        long j12;
        long G11;
        String str;
        String str2;
        long j13;
        while (true) {
            int i11 = this.f64833r;
            ArrayDeque<AbstractC8431d.a> arrayDeque = this.f64828m;
            SparseArray<b> sparseArray = this.f64819d;
            boolean z12 = true;
            C8436i c8436i = this.f64830o;
            C8050C c8050c = this.f64824i;
            C3657h c3657h = this.f64831p;
            if (i11 != 0) {
                ArrayDeque<a> arrayDeque2 = this.f64829n;
                C8056I c8056i = this.f64825j;
                int i12 = this.f64817b;
                if (i11 != 1) {
                    long j14 = Long.MAX_VALUE;
                    if (i11 != 2) {
                        b bVar = this.f64804B;
                        if (bVar != null) {
                            z11 = true;
                            c11 = 2;
                            break;
                        }
                        int size = sparseArray.size();
                        c11 = 2;
                        b bVar2 = null;
                        int i13 = 0;
                        while (i13 < size) {
                            boolean z13 = z12;
                            b valueAt = sparseArray.valueAt(i13);
                            if ((valueAt.f64857m || valueAt.f64850f != valueAt.f64848d.f64945b) && (!valueAt.f64857m || valueAt.f64852h != valueAt.f64846b.f64930d)) {
                                long d11 = valueAt.d();
                                if (d11 < j14) {
                                    bVar2 = valueAt;
                                    j14 = d11;
                                }
                            }
                            i13++;
                            z12 = z13;
                        }
                        z11 = z12;
                        if (bVar2 == null) {
                            C3659j c3659j = (C3659j) qVar;
                            int position = (int) (this.f64838w - c3659j.getPosition());
                            if (position < 0) {
                                throw v.a(null, "Offset to end of mdat was negative.");
                            }
                            c3659j.m(position, false);
                            h();
                        } else {
                            C3659j c3659j2 = (C3659j) qVar;
                            int d12 = (int) (bVar2.d() - c3659j2.getPosition());
                            if (d12 < 0) {
                                m3.s.f("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                d12 = 0;
                            }
                            c3659j2.m(d12, false);
                            this.f64804B = bVar2;
                            bVar = bVar2;
                        }
                    } else {
                        int size2 = sparseArray.size();
                        b bVar3 = null;
                        for (int i14 = 0; i14 < size2; i14++) {
                            q qVar2 = sparseArray.valueAt(i14).f64846b;
                            if (qVar2.f64941o) {
                                long j15 = qVar2.f64929c;
                                if (j15 < j14) {
                                    bVar3 = sparseArray.valueAt(i14);
                                    j14 = j15;
                                }
                            }
                        }
                        if (bVar3 == null) {
                            this.f64833r = 3;
                        } else {
                            C3659j c3659j3 = (C3659j) qVar;
                            int position2 = (int) (j14 - c3659j3.getPosition());
                            if (position2 < 0) {
                                throw v.a(null, "Offset to encryption data was negative.");
                            }
                            c3659j3.m(position2, false);
                            bVar3.f64846b.a(c3659j3);
                        }
                    }
                } else {
                    int i15 = (int) (this.f64835t - this.f64836u);
                    C8050C c8050c2 = this.f64837v;
                    if (c8050c2 != null) {
                        ((C3659j) qVar).b(c8050c2.e(), 8, i15, false);
                        int i16 = this.f64834s;
                        AbstractC8431d.b bVar4 = new AbstractC8431d.b(i16, c8050c2);
                        if (!arrayDeque.isEmpty()) {
                            arrayDeque.peek().f76377c.add(bVar4);
                        } else if (i16 == 1936286840) {
                            C3659j c3659j4 = (C3659j) qVar;
                            Pair k11 = k(c3659j4.getPosition(), c8050c2);
                            c3657h.a((C3656g) k11.second);
                            if (!this.f64813K) {
                                this.f64803A = ((Long) k11.first).longValue();
                                this.f64810H.seekMap((H) k11.second);
                                this.f64813K = true;
                            } else if ((i12 & 256) != 0 && !this.f64814L && c3657h.c() > 1) {
                                this.f64815M = c3659j4.getPosition();
                            }
                        } else if (i16 == 1701671783 && this.f64811I.length != 0) {
                            c8050c2.R(8);
                            int d13 = C6795a.d(c8050c2.p());
                            if (d13 == 0) {
                                String z14 = c8050c2.z();
                                z14.getClass();
                                String z15 = c8050c2.z();
                                z15.getClass();
                                long G12 = c8050c2.G();
                                long G13 = c8050c2.G();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long Z11 = N.Z(G13, 1000000L, G12, roundingMode);
                                long j16 = this.f64803A;
                                long j17 = j16 != -9223372036854775807L ? j16 + Z11 : -9223372036854775807L;
                                long Z12 = N.Z(c8050c2.G(), 1000L, G12, roundingMode);
                                long j18 = j17;
                                j11 = Z11;
                                j12 = j18;
                                G11 = c8050c2.G();
                                str = z14;
                                str2 = z15;
                                j13 = Z12;
                            } else if (d13 != 1) {
                                C3261b.f(d13, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long G14 = c8050c2.G();
                                long K11 = c8050c2.K();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                j12 = N.Z(K11, 1000000L, G14, roundingMode2);
                                long Z13 = N.Z(c8050c2.G(), 1000L, G14, roundingMode2);
                                long G15 = c8050c2.G();
                                String z16 = c8050c2.z();
                                z16.getClass();
                                String z17 = c8050c2.z();
                                z17.getClass();
                                G11 = G15;
                                str = z16;
                                str2 = z17;
                                j13 = Z13;
                                j11 = -9223372036854775807L;
                            }
                            byte[] bArr = new byte[c8050c2.a()];
                            c8050c2.n(0, c8050c2.a(), bArr);
                            C8050C c8050c3 = new C8050C(this.f64826k.a(new Y3.a(str, str2, j13, G11, bArr)));
                            int a11 = c8050c3.a();
                            for (M m11 : this.f64811I) {
                                c8050c3.R(0);
                                m11.e(a11, c8050c3);
                            }
                            if (j12 == -9223372036854775807L) {
                                arrayDeque2.addLast(new a(j11, a11, true));
                                this.f64839x += a11;
                            } else if (!arrayDeque2.isEmpty()) {
                                arrayDeque2.addLast(new a(j12, a11, false));
                                this.f64839x += a11;
                            } else if (c8056i == null || c8056i.g()) {
                                if (c8056i != null) {
                                    j12 = c8056i.a(j12);
                                }
                                long j19 = j12;
                                for (M m12 : this.f64811I) {
                                    m12.b(j19, 1, a11, 0, null);
                                }
                            } else {
                                arrayDeque2.addLast(new a(j12, a11, false));
                                this.f64839x += a11;
                            }
                        }
                    } else {
                        ((C3659j) qVar).m(i15, false);
                    }
                    l(((C3659j) qVar).getPosition());
                }
            } else {
                int i17 = this.f64836u;
                C8050C c8050c4 = this.f64827l;
                if (i17 == 0) {
                    if (!((C3659j) qVar).b(c8050c4.e(), 0, 8, true)) {
                        long j21 = this.f64815M;
                        if (j21 == -1) {
                            c8436i.c();
                            return -1;
                        }
                        g10.f18501a = j21;
                        this.f64815M = -1L;
                        this.f64810H.seekMap(c3657h.b());
                        this.f64814L = true;
                        return 1;
                    }
                    this.f64836u = 8;
                    c8050c4.R(0);
                    this.f64835t = c8050c4.G();
                    this.f64834s = c8050c4.p();
                }
                long j22 = this.f64835t;
                if (j22 == 1) {
                    ((C3659j) qVar).b(c8050c4.e(), 8, 8, false);
                    this.f64836u += 8;
                    this.f64835t = c8050c4.K();
                } else if (j22 == 0) {
                    C3659j c3659j5 = (C3659j) qVar;
                    long length = c3659j5.getLength();
                    if (length == -1 && !arrayDeque.isEmpty()) {
                        length = arrayDeque.peek().f76376b;
                    }
                    if (length != -1) {
                        this.f64835t = (length - c3659j5.getPosition()) + this.f64836u;
                    }
                }
                long j23 = this.f64835t;
                long j24 = this.f64836u;
                if (j23 < j24) {
                    throw v.e("Atom size less than header length (unsupported).");
                }
                if (this.f64815M != -1) {
                    if (this.f64834s == 1936286840) {
                        c8050c.O((int) j23);
                        System.arraycopy(c8050c4.e(), 0, c8050c.e(), 0, 8);
                        ((C3659j) qVar).b(c8050c.e(), 8, (int) (this.f64835t - this.f64836u), false);
                        c3657h.a((C3656g) k(((C3659j) qVar).f(), c8050c).second);
                    } else {
                        ((C3659j) qVar).m((int) (j23 - j24), true);
                    }
                    h();
                } else {
                    C3659j c3659j6 = (C3659j) qVar;
                    long position3 = c3659j6.getPosition() - this.f64836u;
                    int i18 = this.f64834s;
                    if ((i18 == 1836019558 || i18 == 1835295092) && !this.f64813K) {
                        this.f64810H.seekMap(new H.b(this.f64841z, position3));
                        this.f64813K = true;
                    }
                    if (this.f64834s == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i19 = 0; i19 < size3; i19++) {
                            q qVar3 = sparseArray.valueAt(i19).f64846b;
                            qVar3.getClass();
                            qVar3.f64929c = position3;
                            qVar3.f64928b = position3;
                        }
                    }
                    int i21 = this.f64834s;
                    if (i21 == 1835295092) {
                        this.f64804B = null;
                        this.f64838w = position3 + this.f64835t;
                        this.f64833r = 2;
                    } else if (i21 == 1836019574 || i21 == 1953653099 || i21 == 1835297121 || i21 == 1835626086 || i21 == 1937007212 || i21 == 1836019558 || i21 == 1953653094 || i21 == 1836475768 || i21 == 1701082227 || i21 == 1835365473) {
                        long position4 = c3659j6.getPosition();
                        long j25 = this.f64835t;
                        long j26 = (position4 + j25) - 8;
                        if (j25 != this.f64836u && this.f64834s == 1835365473) {
                            c8050c.O(8);
                            c3659j6.d(c8050c.e(), 0, 8, false);
                            C6795a.a(c8050c);
                            c3659j6.m(c8050c.f(), false);
                            c3659j6.e();
                        }
                        arrayDeque.push(new AbstractC8431d.a(this.f64834s, j26));
                        if (this.f64835t == this.f64836u) {
                            l(j26);
                        } else {
                            h();
                        }
                    } else if (i21 == 1751411826 || i21 == 1835296868 || i21 == 1836476516 || i21 == 1936286840 || i21 == 1937011556 || i21 == 1937011827 || i21 == 1668576371 || i21 == 1937011555 || i21 == 1937011578 || i21 == 1937013298 || i21 == 1937007471 || i21 == 1668232756 || i21 == 1937011571 || i21 == 1952867444 || i21 == 1952868452 || i21 == 1953196132 || i21 == 1953654136 || i21 == 1953658222 || i21 == 1886614376 || i21 == 1935763834 || i21 == 1935763823 || i21 == 1936027235 || i21 == 1970628964 || i21 == 1935828848 || i21 == 1936158820 || i21 == 1701606260 || i21 == 1835362404 || i21 == 1701671783 || i21 == 1969517665 || i21 == 1801812339 || i21 == 1768715124) {
                        if (this.f64836u != 8) {
                            throw v.e("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.f64835t > 2147483647L) {
                            throw v.e("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        C8050C c8050c5 = new C8050C((int) this.f64835t);
                        System.arraycopy(c8050c4.e(), 0, c8050c5.e(), 0, 8);
                        this.f64837v = c8050c5;
                        this.f64833r = 1;
                    } else {
                        if (this.f64835t > 2147483647L) {
                            throw v.e("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.f64837v = null;
                        this.f64833r = 1;
                    }
                }
            }
        }
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }
}
