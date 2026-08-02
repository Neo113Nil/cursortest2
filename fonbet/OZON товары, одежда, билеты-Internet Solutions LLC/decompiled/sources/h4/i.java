package h4;

import B3.D;
import N3.B;
import N3.G;
import N3.H;
import N3.I;
import N3.InterfaceC3665p;
import N3.L;
import N3.M;
import N3.N;
import c4.C5743a;
import com.google.common.collect.AbstractC5880y;
import j3.C7272n;
import j3.t;
import j3.v;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import k4.o;
import m3.C8050C;
import n3.AbstractC8431d;
import n3.C8429b;
import n3.C8434g;

/* loaded from: classes.dex */
public final class i implements InterfaceC3665p, H {

    /* renamed from: A, reason: collision with root package name */
    private a[] f64860A;

    /* renamed from: B, reason: collision with root package name */
    private long[][] f64861B;

    /* renamed from: C, reason: collision with root package name */
    private int f64862C;

    /* renamed from: D, reason: collision with root package name */
    private long f64863D;

    /* renamed from: E, reason: collision with root package name */
    private int f64864E;

    /* renamed from: F, reason: collision with root package name */
    private C5743a f64865F;

    /* renamed from: a, reason: collision with root package name */
    private final o.a f64866a;

    /* renamed from: b, reason: collision with root package name */
    private final int f64867b;

    /* renamed from: c, reason: collision with root package name */
    private final C8050C f64868c;

    /* renamed from: d, reason: collision with root package name */
    private final C8050C f64869d;

    /* renamed from: e, reason: collision with root package name */
    private final C8050C f64870e;

    /* renamed from: f, reason: collision with root package name */
    private final C8050C f64871f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<AbstractC8431d.a> f64872g;

    /* renamed from: h, reason: collision with root package name */
    private final l f64873h;

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList f64874i;

    /* renamed from: j, reason: collision with root package name */
    private AbstractC5880y<L> f64875j = AbstractC5880y.v();

    /* renamed from: k, reason: collision with root package name */
    private int f64876k;

    /* renamed from: l, reason: collision with root package name */
    private int f64877l;

    /* renamed from: m, reason: collision with root package name */
    private long f64878m;

    /* renamed from: n, reason: collision with root package name */
    private int f64879n;

    /* renamed from: o, reason: collision with root package name */
    private C8050C f64880o;

    /* renamed from: p, reason: collision with root package name */
    private int f64881p;

    /* renamed from: q, reason: collision with root package name */
    private int f64882q;

    /* renamed from: r, reason: collision with root package name */
    private int f64883r;

    /* renamed from: s, reason: collision with root package name */
    private int f64884s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f64885t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f64886u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f64887v;

    /* renamed from: w, reason: collision with root package name */
    private long f64888w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f64889x;

    /* renamed from: y, reason: collision with root package name */
    private long f64890y;

    /* renamed from: z, reason: collision with root package name */
    private N3.r f64891z;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final o f64892a;

        /* renamed from: b, reason: collision with root package name */
        public final r f64893b;

        /* renamed from: c, reason: collision with root package name */
        public final M f64894c;

        /* renamed from: d, reason: collision with root package name */
        public final N f64895d;

        /* renamed from: e, reason: collision with root package name */
        public int f64896e;

        public a(o oVar, r rVar, M m11) {
            this.f64892a = oVar;
            this.f64893b = rVar;
            this.f64894c = m11;
            this.f64895d = "audio/true-hd".equals(oVar.f64916g.f69127o) ? new N() : null;
        }
    }

    public i(o.a aVar, int i11) {
        this.f64866a = aVar;
        this.f64867b = i11;
        this.f64876k = (i11 & 4) != 0 ? 3 : 0;
        this.f64873h = new l();
        this.f64874i = new ArrayList();
        this.f64871f = new C8050C(16);
        this.f64872g = new ArrayDeque<>();
        this.f64868c = new C8050C(C8434g.f76385a);
        this.f64869d = new C8050C(6);
        this.f64870e = new C8050C();
        this.f64881p = -1;
        this.f64891z = N3.r.f18647V;
        this.f64860A = new a[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0301 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void j(long j11) throws v {
        boolean z11;
        t tVar;
        ArrayDeque<AbstractC8431d.a> arrayDeque;
        t tVar2;
        t tVar3;
        boolean z12;
        int i11;
        ArrayList arrayList;
        String str;
        t tVar4;
        int i12;
        int i13;
        C8429b a11;
        int i14;
        ?? r12 = 0;
        int i15 = 1;
        while (true) {
            ArrayDeque<AbstractC8431d.a> arrayDeque2 = this.f64872g;
            if (arrayDeque2.isEmpty() || arrayDeque2.peek().f76376b != j11) {
                break;
            }
            AbstractC8431d.a pop = arrayDeque2.pop();
            if (pop.f76375a == 1836019574) {
                AbstractC8431d.a b11 = pop.b(1835365473);
                ArrayList arrayList2 = new ArrayList();
                int i16 = this.f64867b;
                if (b11 != null) {
                    tVar = C6795a.e(b11);
                    if (this.f64889x) {
                        G10.a.i(tVar);
                        C8429b a12 = f.a(tVar, "auxiliary.tracks.interleaved");
                        if (a12 != null && a12.f76371b[r12] == 0) {
                            this.f64890y = this.f64888w + 16;
                        }
                        C8429b a13 = f.a(tVar, "auxiliary.tracks.map");
                        G10.a.i(a13);
                        ArrayList d11 = a13.d();
                        ArrayList arrayList3 = new ArrayList(d11.size());
                        for (int i17 = r12; i17 < d11.size(); i17 += i15) {
                            int intValue = ((Integer) d11.get(i17)).intValue();
                            if (intValue == 0) {
                                i14 = i15;
                            } else if (intValue != i15) {
                                i14 = 3;
                                if (intValue != 2) {
                                    i14 = intValue != 3 ? r12 : 4;
                                }
                            } else {
                                i14 = 2;
                            }
                            arrayList3.add(Integer.valueOf(i14));
                        }
                        arrayList2 = arrayList3;
                    } else if (tVar != null && (i16 & 64) != 0 && (a11 = f.a(tVar, "auxiliary.tracks.offset")) != null) {
                        long K11 = new C8050C(a11.f76371b).K();
                        if (K11 > 0) {
                            this.f64888w = K11;
                            this.f64887v = i15;
                            z11 = i15;
                            arrayDeque = arrayDeque2;
                            arrayDeque.clear();
                            if (this.f64887v) {
                                this.f64876k = 2;
                            }
                        }
                    }
                } else {
                    tVar = null;
                }
                ArrayList arrayList4 = new ArrayList();
                boolean z13 = this.f64864E == i15 ? i15 : r12;
                ArrayList arrayList5 = arrayList2;
                B b12 = new B();
                AbstractC8431d.b c11 = pop.c(1969517665);
                if (c11 != null) {
                    tVar2 = C6795a.j(c11);
                    b12.b(tVar2);
                } else {
                    tVar2 = null;
                }
                AbstractC8431d.b c12 = pop.c(1836476516);
                c12.getClass();
                t.a[] aVarArr = new t.a[i15];
                aVarArr[r12] = C6795a.f(c12.f76379b);
                t tVar5 = new t(aVarArr);
                if ((i16 & 1) != 0) {
                    tVar3 = tVar2;
                    z12 = i15;
                } else {
                    tVar3 = tVar2;
                    z12 = r12;
                }
                t tVar6 = tVar3;
                t tVar7 = tVar5;
                ArrayList arrayList6 = arrayList4;
                ArrayList i18 = C6795a.i(pop, b12, -9223372036854775807L, null, z12, z13, new D());
                if (this.f64889x) {
                    boolean z14 = arrayList5.size() == i18.size() ? i15 : false;
                    Locale locale = Locale.US;
                    G10.a.g(Cm.e.c("The number of auxiliary track types from metadata (", arrayList5.size(), ") is not same as the number of auxiliary tracks (", ")", i18.size()), z14);
                }
                String a14 = g.a(i18);
                int i19 = i15;
                arrayDeque = arrayDeque2;
                long j12 = -9223372036854775807L;
                int i21 = -1;
                int i22 = 0;
                int i23 = 0;
                while (i22 < i18.size()) {
                    r rVar = (r) i18.get(i22);
                    if (rVar.f64945b == 0) {
                        arrayList = i18;
                        i11 = i23;
                        tVar4 = tVar7;
                        i12 = i19;
                        str = a14;
                    } else {
                        N3.r rVar2 = this.f64891z;
                        i11 = i23 + 1;
                        arrayList = i18;
                        o oVar = rVar.f64944a;
                        ArrayList arrayList7 = arrayList6;
                        M track = rVar2.track(i23, oVar.f64911b);
                        a aVar = new a(oVar, rVar, track);
                        str = a14;
                        long j13 = oVar.f64914e;
                        if (j13 == -9223372036854775807L) {
                            j13 = rVar.f64951h;
                        }
                        track.getClass();
                        long max = Math.max(j12, j13);
                        C7272n c7272n = oVar.f64916g;
                        boolean equals = "audio/true-hd".equals(c7272n.f69127o);
                        int i24 = rVar.f64948e;
                        int i25 = equals ? i24 * 16 : i24 + 30;
                        C7272n.a a15 = c7272n.a();
                        a15.o0(i25);
                        int i26 = oVar.f64911b;
                        if (i26 == 2) {
                            int i27 = i16 & 8;
                            int i28 = c7272n.f69118f;
                            if (i27 != 0) {
                                i28 |= i21 == -1 ? i19 : 2;
                            }
                            if (this.f64889x) {
                                i28 |= 32768;
                                a15.R(((Integer) arrayList5.get(i22)).intValue());
                            }
                            a15.w0(i28);
                        }
                        if (i26 == i19 && (i13 = b12.f18466a) != -1 && b12.f18467b != -1) {
                            a15.d0(i13);
                            a15.e0(b12.f18467b);
                        }
                        ArrayList arrayList8 = this.f64874i;
                        t tVar8 = arrayList8.isEmpty() ? null : new t(arrayList8);
                        tVar4 = tVar7;
                        f.i(i26, tVar, a15, c7272n.f69124l, tVar8, tVar6, tVar4);
                        a15.W(str);
                        track.a(a15.P());
                        if (i26 == 2 && i21 == -1) {
                            i21 = arrayList7.size();
                        }
                        arrayList6 = arrayList7;
                        arrayList6.add(aVar);
                        j12 = max;
                        i12 = 1;
                    }
                    i22 += i12;
                    tVar7 = tVar4;
                    a14 = str;
                    i23 = i11;
                    i18 = arrayList;
                    i19 = 1;
                }
                this.f64862C = i21;
                this.f64863D = j12;
                a[] aVarArr2 = (a[]) arrayList6.toArray(new a[0]);
                this.f64860A = aVarArr2;
                long[][] jArr = new long[aVarArr2.length][];
                int[] iArr = new int[aVarArr2.length];
                long[] jArr2 = new long[aVarArr2.length];
                boolean[] zArr = new boolean[aVarArr2.length];
                for (int i29 = 0; i29 < aVarArr2.length; i29++) {
                    jArr[i29] = new long[aVarArr2[i29].f64893b.f64945b];
                    jArr2[i29] = aVarArr2[i29].f64893b.f64949f[0];
                }
                int i31 = 0;
                long j14 = 0;
                while (i31 < aVarArr2.length) {
                    long j15 = Long.MAX_VALUE;
                    int i32 = -1;
                    for (int i33 = 0; i33 < aVarArr2.length; i33++) {
                        if (!zArr[i33]) {
                            long j16 = jArr2[i33];
                            if (j16 <= j15) {
                                i32 = i33;
                                j15 = j16;
                            }
                        }
                    }
                    int i34 = iArr[i32];
                    long[] jArr3 = jArr[i32];
                    jArr3[i34] = j14;
                    r rVar3 = aVarArr2[i32].f64893b;
                    j14 += rVar3.f64947d[i34];
                    int i35 = i34 + 1;
                    iArr[i32] = i35;
                    if (i35 < jArr3.length) {
                        jArr2[i32] = rVar3.f64949f[i35];
                    } else {
                        zArr[i32] = true;
                        i31++;
                    }
                }
                z11 = true;
                this.f64861B = jArr;
                this.f64891z.endTracks();
                this.f64891z.seekMap(this);
                arrayDeque.clear();
                if (this.f64887v) {
                }
            } else {
                z11 = i15;
                if (!arrayDeque2.isEmpty()) {
                    arrayDeque2.peek().f76378d.add(pop);
                }
            }
            i15 = z11;
            r12 = 0;
        }
        if (this.f64876k != 2) {
            this.f64876k = 0;
            this.f64879n = 0;
        }
    }

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        this.f64872g.clear();
        this.f64879n = 0;
        this.f64881p = -1;
        this.f64882q = 0;
        this.f64883r = 0;
        this.f64884s = 0;
        this.f64885t = false;
        if (j11 == 0) {
            if (this.f64876k != 3) {
                this.f64876k = 0;
                this.f64879n = 0;
                return;
            } else {
                this.f64873h.b();
                this.f64874i.clear();
                return;
            }
        }
        for (a aVar : this.f64860A) {
            r rVar = aVar.f64893b;
            int e11 = m3.N.e(rVar.f64949f, j12, false);
            while (true) {
                if (e11 < 0) {
                    e11 = -1;
                    break;
                } else if ((rVar.f64950g[e11] & 1) != 0) {
                    break;
                } else {
                    e11--;
                }
            }
            if (e11 == -1) {
                e11 = rVar.a(j12);
            }
            aVar.f64896e = e11;
            N n11 = aVar.f64895d;
            if (n11 != null) {
                n11.b();
            }
        }
    }

    @Override // N3.InterfaceC3665p
    public final void b(N3.r rVar) {
        if ((this.f64867b & 16) == 0) {
            rVar = new k4.p(rVar, this.f64866a);
        }
        this.f64891z = rVar;
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(N3.q qVar) throws IOException {
        L d11 = n.d(qVar, (this.f64867b & 2) != 0);
        this.f64875j = d11 != null ? AbstractC5880y.B(d11) : AbstractC5880y.v();
        return d11 == null;
    }

    @Override // N3.InterfaceC3665p
    public final List e() {
        return this.f64875j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x001e, code lost:
    
        if (r8 == r7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0263, code lost:
    
        r28 = r5;
        r3 = r36.f64878m - r36.f64879n;
        r6 = r37.getPosition() + r3;
        r8 = r36.f64880o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0273, code lost:
    
        if (r8 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0275, code lost:
    
        r37.readFully(r8.e(), r36.f64879n, (int) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0281, code lost:
    
        if (r36.f64877l != 1718909296) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0283, code lost:
    
        r36.f64886u = true;
        r8.R(8);
        r3 = r8.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0293, code lost:
    
        if (r3 == 1751476579) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0295, code lost:
    
        if (r3 == 1903435808) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0297, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x029d, code lost:
    
        if (r3 == 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02a0, code lost:
    
        r8.S(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02a8, code lost:
    
        if (r8.a() <= 0) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02aa, code lost:
    
        r3 = r8.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02ae, code lost:
    
        if (r3 == 1751476579) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02b0, code lost:
    
        if (r3 == 1903435808) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02b2, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02b8, code lost:
    
        if (r3 == 0) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02b4, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02b6, code lost:
    
        r3 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02bb, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02bc, code lost:
    
        r36.f64864E = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02ee, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02f8, code lost:
    
        j(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02fd, code lost:
    
        if (r36.f64887v == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02ff, code lost:
    
        r36.f64889x = true;
        r38.f18501a = r36.f64888w;
        r36.f64887v = false;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x030a, code lost:
    
        if (r3 == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0310, code lost:
    
        if (r36.f64876k == r28) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0312, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0314, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0299, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x029b, code lost:
    
        r3 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02c3, code lost:
    
        if (r9.isEmpty() != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02c5, code lost:
    
        r9.peek().f76377c.add(new n3.AbstractC8431d.b(r36.f64877l, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02da, code lost:
    
        if (r36.f64886u != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02e1, code lost:
    
        if (r36.f64877l != 1835295092) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e3, code lost:
    
        r36.f64864E = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02e8, code lost:
    
        if (r3 >= 262144) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02ea, code lost:
    
        r37.h((int) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02f0, code lost:
    
        r38.f18501a = r37.getPosition() + r3;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0020, code lost:
    
        if (r8 == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0023, code lost:
    
        if (r8 != 3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0025, code lost:
    
        r36.f64873h.a(r37, r38, r36.f64874i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0030, code lost:
    
        if (r38.f18501a != 0) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0032, code lost:
    
        r36.f64876k = r4;
        r36.f64879n = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0036, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x003c, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x003d, code lost:
    
        r8 = r37.getPosition();
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0043, code lost:
    
        if (r36.f64881p != (-1)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0045, code lost:
    
        r10 = r4;
        r28 = r5;
        r5 = r7;
        r11 = r5;
        r26 = -1;
        r27 = -1;
        r22 = Long.MAX_VALUE;
        r24 = Long.MAX_VALUE;
        r29 = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0062, code lost:
    
        r3 = r36.f64860A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0065, code lost:
    
        if (r10 >= r3.length) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0067, code lost:
    
        r3 = r3[r10];
        r13 = r3.f64896e;
        r3 = r3.f64893b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0071, code lost:
    
        if (r13 != r3.f64945b) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0074, code lost:
    
        r32 = r3.f64946c[r13];
        r3 = r36.f64861B;
        r6 = m3.N.f74289a;
        r34 = r3[r10][r13];
        r32 = r32 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0084, code lost:
    
        if (r32 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0088, code lost:
    
        if (r32 < 262144) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x008b, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x008e, code lost:
    
        if (r3 != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0090, code lost:
    
        if (r5 != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0098, code lost:
    
        r5 = r3;
        r27 = r10;
        r29 = r32;
        r24 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x00a1, code lost:
    
        if (r34 >= r22) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x00a3, code lost:
    
        r11 = r3;
        r26 = r10;
        r22 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x00a8, code lost:
    
        r10 = r10 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0092, code lost:
    
        if (r3 != r5) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0096, code lost:
    
        if (r32 >= r29) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x008d, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x00aa, code lost:
    
        r31 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x00ae, code lost:
    
        if (r22 == Long.MAX_VALUE) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x00b0, code lost:
    
        if (r11 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x00b9, code lost:
    
        if (r24 >= (r22 + 10485760)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x00bc, code lost:
    
        r3 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x00c1, code lost:
    
        r36.f64881p = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x00c3, code lost:
    
        if (r3 != (-1)) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x00cd, code lost:
    
        r3 = r36.f64860A[r36.f64881p];
        r5 = r3.f64894c;
        r6 = r3.f64896e;
        r10 = r3.f64893b;
        r13 = r4;
        r4 = r10.f64946c[r6] + r36.f64890y;
        r20 = r13;
        r13 = r10.f64947d;
        r21 = r13[r6];
        r8 = (r4 - r8) + r36.f64882q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x00f4, code lost:
    
        if (r8 < 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x00f8, code lost:
    
        if (r8 < 262144) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x00fe, code lost:
    
        r2 = r3.f64892a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0103, code lost:
    
        if (r2.f64917h != 1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0105, code lost:
    
        r8 = r8 + 8;
        r21 = r21 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x010a, code lost:
    
        r4 = r21;
        r37.h((int) r8);
        r5 = r2.f64916g;
        r7 = java.util.Objects.equals(r5.f69127o, "video/avc");
        r8 = r5.f69127o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x011c, code lost:
    
        if (r7 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0120, code lost:
    
        if ((r14 & 32) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0123, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0133, code lost:
    
        r36.f64885t = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0135, code lost:
    
        r2 = r2.f64920k;
        r9 = r3.f64895d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0139, code lost:
    
        if (r2 == 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x013b, code lost:
    
        r8 = r36.f64869d;
        r12 = r8.e();
        r12[r20] = r20;
        r12[r7] = r20;
        r12[r28] = r20;
        r7 = 4 - r2;
        r4 = r4 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x014c, code lost:
    
        if (r36.f64883r >= r4) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x014e, code lost:
    
        r14 = r36.f64884s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0150, code lost:
    
        if (r14 != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0154, code lost:
    
        if (r36.f64885t != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0156, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0162, code lost:
    
        if ((n3.C8434g.e(r5) + r2) > (r13[r6] - r36.f64882q)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0164, code lost:
    
        r2 = n3.C8434g.e(r5);
        r14 = r16 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0171, code lost:
    
        r37.readFully(r12, r7, r14);
        r36.f64882q += r14;
        r14 = r20;
        r8.R(r14);
        r15 = r8.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0182, code lost:
    
        if (r15 < 0) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0184, code lost:
    
        r36.f64884s = r15 - r2;
        r15 = r36.f64868c;
        r15.R(r14);
        r14 = r31;
        r5.e(r14, r15);
        r36.f64883r += r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0196, code lost:
    
        if (r2 <= 0) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0198, code lost:
    
        r5.e(r2, r8);
        r36.f64883r += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x01a4, code lost:
    
        if (n3.C8434g.d(r12, r2, r5) == false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01a6, code lost:
    
        r36.f64885t = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x01a9, code lost:
    
        r2 = r16;
        r20 = 0;
        r31 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x01b7, code lost:
    
        throw j3.v.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x016d, code lost:
    
        r14 = r16;
        r2 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x016b, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x01b8, code lost:
    
        r16 = r2;
        r14 = r5.d(r37, r14, r20);
        r36.f64882q += r14;
        r36.f64883r += r14;
        r36.f64884s -= r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x01d0, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x020f, code lost:
    
        r21 = r10.f64949f[r6];
        r1 = r10.f64950g[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0219, code lost:
    
        if (r36.f64885t != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x021b, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x021e, code lost:
    
        r23 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0220, code lost:
    
        if (r9 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0222, code lost:
    
        r9.c(r5, r21, r23, r24, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x023b, code lost:
    
        if ((r6 + 1) != r10.f64945b) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x023d, code lost:
    
        r9.a(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x024d, code lost:
    
        r3.f64896e++;
        r36.f64881p = -1;
        r36.f64882q = 0;
        r36.f64883r = 0;
        r36.f64884s = 0;
        r36.f64885t = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x025f, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0242, code lost:
    
        r5.b(r21, r23, r24, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x01d9, code lost:
    
        if ("audio/ac4".equals(r8) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x01dd, code lost:
    
        if (r36.f64883r != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x01df, code lost:
    
        N3.C3652c.a(r4, r12);
        r5 = 7;
        r5.e(7, r12);
        r36.f64883r += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x01ed, code lost:
    
        r4 = r4 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x01f4, code lost:
    
        r2 = r36.f64883r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x01f6, code lost:
    
        if (r2 >= r4) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x01f8, code lost:
    
        r2 = r5.d(r37, r4 - r2, false);
        r36.f64882q += r2;
        r36.f64883r += r2;
        r36.f64884s -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x01ec, code lost:
    
        r5 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x01ef, code lost:
    
        if (r9 == null) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x01f1, code lost:
    
        r9.d(r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0131, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x012b, code lost:
    
        if (java.util.Objects.equals(r8, "video/hevc") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x012f, code lost:
    
        if ((r14 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0260, code lost:
    
        r38.f18501a = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0262, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x00bf, code lost:
    
        r3 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x00c9, code lost:
    
        r28 = r5;
        r31 = 4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x050a A[LOOP:1: B:3:0x0009->B:19:0x050a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0507 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v29 */
    @Override // N3.InterfaceC3665p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(N3.q qVar, G g10) throws IOException {
        boolean z11;
        AbstractC8431d.a peek;
        boolean z12;
        byte b11;
        boolean z13;
        do {
            byte b12 = 0;
            int i11 = 2;
            ?? r72 = 1;
            while (true) {
                int i12 = this.f64876k;
                ArrayDeque<AbstractC8431d.a> arrayDeque = this.f64872g;
                C8050C c8050c = this.f64870e;
                int i13 = this.f64867b;
                if (i12 != 0) {
                    break;
                }
                int i14 = this.f64879n;
                C8050C c8050c2 = this.f64871f;
                if (i14 == 0) {
                    if (qVar.b(c8050c2.e(), 0, 8, r72)) {
                        this.f64879n = 8;
                        c8050c2.R(0);
                        this.f64878m = c8050c2.G();
                        this.f64877l = c8050c2.p();
                    } else {
                        if (this.f64864E == 2 && (i13 & 2) != 0) {
                            M track = this.f64891z.track(0, 4);
                            C5743a c5743a = this.f64865F;
                            t tVar = c5743a == null ? null : new t(c5743a);
                            C7272n.a aVar = new C7272n.a();
                            aVar.r0(tVar);
                            track.a(aVar.P());
                            this.f64891z.endTracks();
                            this.f64891z.seekMap(new H.b(-9223372036854775807L));
                        }
                        z12 = true;
                        b11 = 0;
                        z13 = false;
                        if (!z13) {
                            return -1;
                        }
                        r72 = z12;
                        b12 = b11;
                        i11 = 2;
                    }
                }
                long j11 = this.f64878m;
                if (j11 == 1) {
                    qVar.readFully(c8050c2.e(), 8, 8);
                    this.f64879n += 8;
                    this.f64878m = c8050c2.K();
                } else if (j11 == 0) {
                    long length = qVar.getLength();
                    if (length == -1 && (peek = arrayDeque.peek()) != null) {
                        length = peek.f76376b;
                    }
                    if (length != -1) {
                        this.f64878m = (length - qVar.getPosition()) + this.f64879n;
                    }
                }
                long j12 = this.f64878m;
                int i15 = this.f64879n;
                if (j12 < i15) {
                    throw v.e("Atom size less than header length (unsupported).");
                }
                int i16 = this.f64877l;
                if (i16 == 1836019574 || i16 == 1953653099 || i16 == 1835297121 || i16 == 1835626086 || i16 == 1937007212 || i16 == 1701082227 || i16 == 1835365473 || i16 == 1635284069) {
                    z12 = true;
                    long position = qVar.getPosition();
                    long j13 = this.f64878m;
                    long j14 = this.f64879n;
                    long j15 = (position + j13) - j14;
                    if (j13 != j14 && this.f64877l == 1835365473) {
                        c8050c.O(8);
                        qVar.a(0, 8, c8050c.e());
                        C6795a.a(c8050c);
                        qVar.h(c8050c.f());
                        qVar.e();
                    }
                    arrayDeque.push(new AbstractC8431d.a(this.f64877l, j15));
                    if (this.f64878m == this.f64879n) {
                        j(j15);
                    } else {
                        b11 = 0;
                        this.f64876k = 0;
                        this.f64879n = 0;
                        z13 = z12;
                        if (!z13) {
                        }
                    }
                } else if (i16 == 1835296868 || i16 == 1836476516 || i16 == 1751411826 || i16 == 1937011556 || i16 == 1937011827 || i16 == 1937011571 || i16 == 1668576371 || i16 == 1701606260 || i16 == 1937011555 || i16 == 1937011578 || i16 == 1937013298 || i16 == 1937007471 || i16 == 1668232756 || i16 == 1953196132 || i16 == 1718909296 || i16 == 1969517665 || i16 == 1801812339 || i16 == 1768715124) {
                    G10.a.h(i15 == 8);
                    G10.a.h(this.f64878m <= 2147483647L);
                    C8050C c8050c3 = new C8050C((int) this.f64878m);
                    System.arraycopy(c8050c2.e(), 0, c8050c3.e(), 0, 8);
                    this.f64880o = c8050c3;
                    z12 = true;
                    this.f64876k = 1;
                } else {
                    long position2 = qVar.getPosition();
                    long j16 = this.f64879n;
                    long j17 = position2 - j16;
                    if (this.f64877l == 1836086884) {
                        this.f64865F = new C5743a(0L, j17, -9223372036854775807L, j17 + j16, this.f64878m - j16);
                    }
                    this.f64880o = null;
                    this.f64876k = 1;
                    z12 = true;
                }
                b11 = 0;
                z13 = z12;
                if (!z13) {
                }
            }
        } while (!z11);
        return 1;
    }

    @Override // N3.H
    public final long getDurationUs() {
        return this.f64863D;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0 A[EDGE_INSN: B:69:0x00e0->B:70:0x00e0 BREAK  A[LOOP:1: B:28:0x0077->B:58:0x00db], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    @Override // N3.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final H.a getSeekPoints(long j11) {
        long j12;
        long j13;
        long j14;
        long j15;
        int i11;
        a[] aVarArr;
        int i12;
        int[] iArr;
        r rVar;
        int a11;
        a[] aVarArr2 = this.f64860A;
        int length = aVarArr2.length;
        I i13 = I.f18506c;
        if (length == 0) {
            return new H.a(i13);
        }
        int i14 = this.f64862C;
        boolean z11 = false;
        int i15 = -1;
        long j16 = -1;
        if (i14 != -1) {
            r rVar2 = aVarArr2[i14].f64893b;
            long[] jArr = rVar2.f64949f;
            int e11 = m3.N.e(jArr, j11, false);
            while (true) {
                if (e11 < 0) {
                    e11 = -1;
                    break;
                }
                if ((rVar2.f64950g[e11] & 1) != 0) {
                    break;
                }
                e11--;
            }
            if (e11 == -1) {
                e11 = rVar2.a(j11);
            }
            if (e11 == -1) {
                return new H.a(i13);
            }
            j14 = jArr[e11];
            long[] jArr2 = rVar2.f64946c;
            j13 = jArr2[e11];
            if (j14 < j11) {
                j12 = -9223372036854775807L;
                if (e11 < rVar2.f64945b - 1 && (a11 = rVar2.a(j11)) != -1 && a11 != e11) {
                    j15 = jArr[a11];
                    j16 = jArr2[a11];
                    i11 = 0;
                    long j17 = j13;
                    while (true) {
                        aVarArr = this.f64860A;
                        if (i11 < aVarArr.length) {
                            break;
                        }
                        if (i11 != this.f64862C) {
                            r rVar3 = aVarArr[i11].f64893b;
                            long[] jArr3 = rVar3.f64949f;
                            int e12 = m3.N.e(jArr3, j14, z11);
                            while (true) {
                                iArr = rVar3.f64950g;
                                if (e12 < 0) {
                                    e12 = i15;
                                    break;
                                }
                                if ((iArr[e12] & 1) != 0) {
                                    break;
                                }
                                e12--;
                            }
                            if (e12 == i15) {
                                e12 = rVar3.a(j14);
                            }
                            long[] jArr4 = rVar3.f64946c;
                            if (e12 == i15) {
                                rVar = rVar3;
                            } else {
                                rVar = rVar3;
                                j17 = Math.min(jArr4[e12], j17);
                            }
                            if (j15 != j12) {
                                int e13 = m3.N.e(jArr3, j15, false);
                                while (true) {
                                    if (e13 < 0) {
                                        e13 = -1;
                                        break;
                                    }
                                    if ((iArr[e13] & 1) != 0) {
                                        break;
                                    }
                                    e13--;
                                }
                                i12 = -1;
                                if (e13 == -1) {
                                    e13 = rVar.a(j15);
                                }
                                if (e13 != -1) {
                                    j16 = Math.min(jArr4[e13], j16);
                                }
                            } else {
                                i12 = -1;
                            }
                        } else {
                            i12 = i15;
                        }
                        i11++;
                        i15 = i12;
                        z11 = false;
                    }
                    I i16 = new I(j14, j17);
                    return j15 != j12 ? new H.a(i16) : new H.a(i16, new I(j15, j16));
                }
            } else {
                j12 = -9223372036854775807L;
            }
        } else {
            j12 = -9223372036854775807L;
            j13 = Long.MAX_VALUE;
            j14 = j11;
        }
        j15 = j12;
        i11 = 0;
        long j172 = j13;
        while (true) {
            aVarArr = this.f64860A;
            if (i11 < aVarArr.length) {
            }
            i11++;
            i15 = i12;
            z11 = false;
        }
        I i162 = new I(j14, j172);
        if (j15 != j12) {
        }
    }

    @Override // N3.H
    public final boolean isSeekable() {
        return true;
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }
}
