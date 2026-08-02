package b2;

import H1.AbstractC1170c;
import H1.B;
import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.J;
import H1.K;
import H1.N;
import H1.O;
import H1.P;
import androidx.media3.common.a;
import b1.C2334C;
import b1.C2338G;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.Z;
import e2.s;
import f1.AbstractC4227e;
import f1.AbstractC4230h;
import f1.C4225c;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public final class n implements InterfaceC1183p, J {

    /* renamed from: F, reason: collision with root package name */
    public static final H1.u f24900F = new H1.u() { // from class: b2.m
        @Override // H1.u
        public final InterfaceC1183p[] f() {
            return n.o();
        }
    };

    /* renamed from: A, reason: collision with root package name */
    public long[][] f24901A;

    /* renamed from: B, reason: collision with root package name */
    public int f24902B;

    /* renamed from: C, reason: collision with root package name */
    public long f24903C;

    /* renamed from: D, reason: collision with root package name */
    public int f24904D;

    /* renamed from: E, reason: collision with root package name */
    public W1.a f24905E;

    /* renamed from: a, reason: collision with root package name */
    public final s.a f24906a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24907b;

    /* renamed from: c, reason: collision with root package name */
    public final e1.J f24908c;

    /* renamed from: d, reason: collision with root package name */
    public final e1.J f24909d;

    /* renamed from: e, reason: collision with root package name */
    public final e1.J f24910e;

    /* renamed from: f, reason: collision with root package name */
    public final e1.J f24911f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f24912g;

    /* renamed from: h, reason: collision with root package name */
    public final q f24913h;

    /* renamed from: i, reason: collision with root package name */
    public final List f24914i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC3445z f24915j = AbstractC3445z.t();

    /* renamed from: k, reason: collision with root package name */
    public int f24916k;

    /* renamed from: l, reason: collision with root package name */
    public int f24917l;

    /* renamed from: m, reason: collision with root package name */
    public long f24918m;

    /* renamed from: n, reason: collision with root package name */
    public int f24919n;

    /* renamed from: o, reason: collision with root package name */
    public e1.J f24920o;

    /* renamed from: p, reason: collision with root package name */
    public int f24921p;

    /* renamed from: q, reason: collision with root package name */
    public int f24922q;

    /* renamed from: r, reason: collision with root package name */
    public int f24923r;

    /* renamed from: s, reason: collision with root package name */
    public int f24924s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f24925t;
    private a[] tracks;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24926u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f24927v;

    /* renamed from: w, reason: collision with root package name */
    public long f24928w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f24929x;

    /* renamed from: y, reason: collision with root package name */
    public long f24930y;

    /* renamed from: z, reason: collision with root package name */
    public H1.r f24931z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final t f24932a;

        /* renamed from: b, reason: collision with root package name */
        public final w f24933b;

        /* renamed from: c, reason: collision with root package name */
        public final O f24934c;

        /* renamed from: d, reason: collision with root package name */
        public final P f24935d;

        /* renamed from: e, reason: collision with root package name */
        public int f24936e;

        public a(t tVar, w wVar, O o10) {
            this.f24932a = tVar;
            this.f24933b = wVar;
            this.f24934c = o10;
            this.f24935d = "audio/true-hd".equals(tVar.f24954g.f20543o) ? new P() : null;
        }
    }

    public n(s.a aVar, int i10) {
        this.f24906a = aVar;
        this.f24907b = i10;
        this.f24916k = (i10 & 4) != 0 ? 3 : 0;
        this.f24913h = new q();
        this.f24914i = new ArrayList();
        this.f24911f = new e1.J(16);
        this.f24912g = new ArrayDeque();
        this.f24908c = new e1.J(AbstractC4230h.NAL_START_CODE);
        this.f24909d = new e1.J(6);
        this.f24910e = new e1.J();
        this.f24921p = -1;
        this.f24931z = H1.r.f4477Q;
        this.tracks = new a[0];
    }

    public static long A(w wVar, long j10, long j11) {
        int y10 = y(wVar, j10);
        return y10 == -1 ? j11 : Math.min(wVar.offsets[y10], j11);
    }

    public static int F(e1.J j10) {
        j10.b0(8);
        int p10 = p(j10.v());
        if (p10 != 0) {
            return p10;
        }
        j10.c0(4);
        while (j10.a() > 0) {
            int p11 = p(j10.v());
            if (p11 != 0) {
                return p11;
            }
        }
        return 0;
    }

    public static boolean M(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473 || i10 == 1635284069;
    }

    public static boolean N(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    public static /* synthetic */ t n(t tVar) {
        return tVar;
    }

    public static /* synthetic */ InterfaceC1183p[] o() {
        return new InterfaceC1183p[]{new n(s.a.f45617a, 16)};
    }

    public static int p(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public static long[][] q(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f24933b.f24974b];
            jArr2[i10] = aVarArr[i10].f24933b.timestampsUs[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = LongCompanionObject.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            w wVar = aVarArr[i12].f24933b;
            j10 += wVar.sizes[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = wVar.timestampsUs[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    public static int s(int i10) {
        int i11 = (i10 & 1) != 0 ? 32 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    public static int y(w wVar, long j10) {
        int a10 = wVar.a(j10);
        return a10 == -1 ? wVar.b(j10) : a10;
    }

    public final void B(C2334C c2334c) {
        C4225c a10 = AbstractC2380j.a(c2334c, "auxiliary.tracks.interleaved");
        if (a10 == null || a10.value[0] != 0) {
            return;
        }
        this.f24930y = this.f24928w + 16;
    }

    public final void C(InterfaceC1184q interfaceC1184q) {
        this.f24910e.X(8);
        interfaceC1184q.n(this.f24910e.f(), 0, 8);
        AbstractC2372b.g(this.f24910e);
        interfaceC1184q.l(this.f24910e.g());
        interfaceC1184q.g();
    }

    public final void D(long j10) {
        while (!this.f24912g.isEmpty() && ((AbstractC4227e.b) this.f24912g.peek()).f46176b == j10) {
            AbstractC4227e.b bVar = (AbstractC4227e.b) this.f24912g.pop();
            if (bVar.f46175a == 1836019574) {
                G(bVar);
                this.f24912g.clear();
                if (!this.f24927v) {
                    this.f24916k = 2;
                }
            } else if (!this.f24912g.isEmpty()) {
                ((AbstractC4227e.b) this.f24912g.peek()).b(bVar);
            }
        }
        if (this.f24916k != 2) {
            t();
        }
    }

    public final void E() {
        if (this.f24904D != 2 || (this.f24907b & 2) == 0) {
            return;
        }
        O c10 = this.f24931z.c(0, 4);
        W1.a aVar = this.f24905E;
        c10.c(new a.b().r0(aVar == null ? null : new C2334C(aVar)).P());
        this.f24931z.s();
        this.f24931z.q(new J.b(-9223372036854775807L));
    }

    public final void G(AbstractC4227e.b bVar) {
        List list;
        C2334C c2334c;
        C2334C c2334c2;
        List list2;
        C2334C c2334c3;
        C2334C c2334c4;
        B b10;
        String str;
        ArrayList arrayList;
        AbstractC4227e.b d10 = bVar.d(1835365473);
        List arrayList2 = new ArrayList();
        if (d10 != null) {
            C2334C u10 = AbstractC2372b.u(d10);
            if (this.f24929x) {
                AbstractC4134a.i(u10);
                B(u10);
                arrayList2 = u(u10);
            } else if (O(u10)) {
                this.f24927v = true;
                return;
            }
            c2334c = u10;
            list = arrayList2;
        } else {
            list = arrayList2;
            c2334c = null;
        }
        ArrayList arrayList3 = new ArrayList();
        boolean z10 = this.f24904D == 1;
        B b11 = new B();
        AbstractC4227e.c e10 = bVar.e(1969517665);
        if (e10 != null) {
            C2334C I10 = AbstractC2372b.I(e10);
            b11.c(I10);
            c2334c2 = I10;
        } else {
            c2334c2 = null;
        }
        C2334C c2334c5 = new C2334C(AbstractC2372b.w(((AbstractC4227e.c) AbstractC4134a.e(bVar.e(1836476516))).f46179b));
        List H10 = AbstractC2372b.H(bVar, b11, -9223372036854775807L, null, (this.f24907b & 1) != 0, z10, new Ra.f() { // from class: b2.l
            @Override // Ra.f
            public final Object apply(Object obj) {
                return n.n((t) obj);
            }
        });
        if (this.f24929x) {
            AbstractC4134a.h(list.size() == H10.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(list.size()), Integer.valueOf(H10.size())));
        }
        String b12 = AbstractC2381k.b(H10);
        int i10 = 0;
        int i11 = 0;
        long j10 = -9223372036854775807L;
        int i12 = -1;
        while (i10 < H10.size()) {
            w wVar = (w) H10.get(i10);
            if (wVar.f24974b == 0) {
                list2 = H10;
                b10 = b11;
                str = b12;
                c2334c3 = c2334c;
                arrayList = arrayList3;
            } else {
                t tVar = wVar.f24973a;
                list2 = H10;
                ArrayList arrayList4 = arrayList3;
                int i13 = i11 + 1;
                String str2 = b12;
                a aVar = new a(tVar, wVar, this.f24931z.c(i11, tVar.f24949b));
                c2334c3 = c2334c;
                long j11 = tVar.f24952e;
                if (j11 == -9223372036854775807L) {
                    j11 = wVar.f24976d;
                }
                aVar.f24934c.d(j11);
                j10 = Math.max(j10, j11);
                int i14 = "audio/true-hd".equals(tVar.f24954g.f20543o) ? wVar.f24975c * 16 : wVar.f24975c + 30;
                a.b b13 = tVar.f24954g.b();
                b13.o0(i14);
                if (tVar.f24949b == 2) {
                    int i15 = tVar.f24954g.f20534f;
                    if ((this.f24907b & 8) != 0) {
                        i15 |= i12 == -1 ? 1 : 2;
                    }
                    if (this.f24929x) {
                        i15 |= 32768;
                        b13.R(((Integer) list.get(i10)).intValue());
                    }
                    b13.w0(i15);
                }
                AbstractC2380j.l(tVar.f24949b, b11, b13);
                int i16 = tVar.f24949b;
                C2334C c2334c6 = tVar.f24954g.f20540l;
                if (this.f24914i.isEmpty()) {
                    b10 = b11;
                    c2334c4 = null;
                } else {
                    b10 = b11;
                    c2334c4 = new C2334C(this.f24914i);
                }
                AbstractC2380j.m(i16, c2334c3, b13, c2334c6, c2334c4, c2334c2, c2334c5);
                str = str2;
                b13.W(str);
                aVar.f24934c.c(b13.P());
                if (tVar.f24949b == 2 && i12 == -1) {
                    i12 = arrayList4.size();
                }
                arrayList = arrayList4;
                arrayList.add(aVar);
                i11 = i13;
            }
            i10++;
            c2334c = c2334c3;
            arrayList3 = arrayList;
            H10 = list2;
            b12 = str;
            b11 = b10;
        }
        this.f24902B = i12;
        this.f24903C = j10;
        a[] aVarArr = (a[]) arrayList3.toArray(new a[0]);
        this.tracks = aVarArr;
        this.f24901A = q(aVarArr);
        this.f24931z.s();
        this.f24931z.q(this);
    }

    public final void H(long j10) {
        if (this.f24917l == 1836086884) {
            int i10 = this.f24919n;
            this.f24905E = new W1.a(0L, j10, -9223372036854775807L, j10 + i10, this.f24918m - i10);
        }
    }

    public final boolean I(InterfaceC1184q interfaceC1184q) {
        AbstractC4227e.b bVar;
        if (this.f24919n == 0) {
            if (!interfaceC1184q.h(this.f24911f.f(), 0, 8, true)) {
                E();
                return false;
            }
            this.f24919n = 8;
            this.f24911f.b0(0);
            this.f24918m = this.f24911f.O();
            this.f24917l = this.f24911f.v();
        }
        long j10 = this.f24918m;
        if (j10 == 1) {
            interfaceC1184q.readFully(this.f24911f.f(), 8, 8);
            this.f24919n += 8;
            this.f24918m = this.f24911f.T();
        } else if (j10 == 0) {
            long length = interfaceC1184q.getLength();
            if (length == -1 && (bVar = (AbstractC4227e.b) this.f24912g.peek()) != null) {
                length = bVar.f46176b;
            }
            if (length != -1) {
                this.f24918m = (length - interfaceC1184q.getPosition()) + this.f24919n;
            }
        }
        if (this.f24918m < this.f24919n) {
            throw C2338G.d("Atom size less than header length (unsupported).");
        }
        if (M(this.f24917l)) {
            long position = interfaceC1184q.getPosition();
            long j11 = this.f24918m;
            int i10 = this.f24919n;
            long j12 = (position + j11) - i10;
            if (j11 != i10 && this.f24917l == 1835365473) {
                C(interfaceC1184q);
            }
            this.f24912g.push(new AbstractC4227e.b(this.f24917l, j12));
            if (this.f24918m == this.f24919n) {
                D(j12);
            } else {
                t();
            }
        } else if (N(this.f24917l)) {
            AbstractC4134a.g(this.f24919n == 8);
            AbstractC4134a.g(this.f24918m <= 2147483647L);
            e1.J j13 = new e1.J((int) this.f24918m);
            System.arraycopy(this.f24911f.f(), 0, j13.f(), 0, 8);
            this.f24920o = j13;
            this.f24916k = 1;
        } else {
            H(interfaceC1184q.getPosition() - this.f24919n);
            this.f24920o = null;
            this.f24916k = 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J(InterfaceC1184q interfaceC1184q, I i10) {
        boolean z10;
        long j10 = this.f24918m - this.f24919n;
        long position = interfaceC1184q.getPosition() + j10;
        e1.J j11 = this.f24920o;
        if (j11 != null) {
            interfaceC1184q.readFully(j11.f(), this.f24919n, (int) j10);
            if (this.f24917l == 1718909296) {
                this.f24926u = true;
                this.f24904D = F(j11);
            } else if (!this.f24912g.isEmpty()) {
                ((AbstractC4227e.b) this.f24912g.peek()).c(new AbstractC4227e.c(this.f24917l, j11));
            }
        } else {
            if (!this.f24926u && this.f24917l == 1835295092) {
                this.f24904D = 1;
            }
            if (j10 >= 262144) {
                i10.f4333a = interfaceC1184q.getPosition() + j10;
                z10 = true;
                D(position);
                if (this.f24927v) {
                    this.f24929x = true;
                    i10.f4333a = this.f24928w;
                    this.f24927v = false;
                    z10 = true;
                }
                return (z10 || this.f24916k == 2) ? false : true;
            }
            interfaceC1184q.l((int) j10);
        }
        z10 = false;
        D(position);
        if (this.f24927v) {
        }
        if (z10) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    public final int K(InterfaceC1184q interfaceC1184q, I i10) {
        O.a aVar;
        ?? r12;
        int i11;
        long position = interfaceC1184q.getPosition();
        if (this.f24921p == -1) {
            int z10 = z(position);
            this.f24921p = z10;
            if (z10 == -1) {
                return -1;
            }
        }
        a aVar2 = this.tracks[this.f24921p];
        O o10 = aVar2.f24934c;
        int i12 = aVar2.f24936e;
        w wVar = aVar2.f24933b;
        long j10 = wVar.offsets[i12] + this.f24930y;
        int i13 = wVar.sizes[i12];
        P p10 = aVar2.f24935d;
        long j11 = (j10 - position) + this.f24922q;
        if (j11 < 0 || j11 >= 262144) {
            i10.f4333a = j10;
            return 1;
        }
        if (aVar2.f24932a.f24955h == 1) {
            j11 += 8;
            i13 -= 8;
        }
        interfaceC1184q.l((int) j11);
        if (!r(aVar2.f24932a.f24954g)) {
            this.f24925t = true;
        }
        t tVar = aVar2.f24932a;
        if (tVar.f24956i == 0) {
            aVar = null;
            if ("audio/ac4".equals(tVar.f24954g.f20543o)) {
                if (this.f24923r == 0) {
                    AbstractC1170c.b(i13, this.f24910e);
                    o10.a(this.f24910e, 7);
                    this.f24923r += 7;
                }
                i13 += 7;
            } else if (p10 != null) {
                p10.d(interfaceC1184q);
            }
            while (true) {
                int i14 = this.f24923r;
                if (i14 >= i13) {
                    break;
                }
                int e10 = o10.e(interfaceC1184q, i13 - i14, false);
                this.f24922q += e10;
                this.f24923r += e10;
                this.f24924s -= e10;
            }
        } else {
            byte[] f10 = this.f24909d.f();
            f10[0] = 0;
            f10[1] = 0;
            f10[2] = 0;
            int i15 = 4 - aVar2.f24932a.f24956i;
            i13 += i15;
            while (this.f24923r < i13) {
                int i16 = this.f24924s;
                if (i16 == 0) {
                    t tVar2 = aVar2.f24932a;
                    int i17 = tVar2.f24956i;
                    if (this.f24925t || AbstractC4230h.o(tVar2.f24954g) + i17 > aVar2.f24933b.sizes[i12] - this.f24922q) {
                        i11 = 0;
                    } else {
                        i11 = AbstractC4230h.o(aVar2.f24932a.f24954g);
                        i17 = aVar2.f24932a.f24956i + i11;
                    }
                    interfaceC1184q.readFully(f10, i15, i17);
                    this.f24922q += i17;
                    this.f24909d.b0(0);
                    int v10 = this.f24909d.v();
                    if (v10 < 0) {
                        throw C2338G.a("Invalid NAL length", null);
                    }
                    this.f24924s = v10 - i11;
                    this.f24908c.b0(0);
                    o10.a(this.f24908c, 4);
                    this.f24923r += 4;
                    if (i11 > 0) {
                        o10.a(this.f24909d, i11);
                        this.f24923r += i11;
                        if (AbstractC4230h.k(f10, 4, i11, aVar2.f24932a.f24954g)) {
                            this.f24925t = true;
                        }
                    }
                } else {
                    int e11 = o10.e(interfaceC1184q, i16, false);
                    this.f24922q += e11;
                    this.f24923r += e11;
                    this.f24924s -= e11;
                }
            }
            aVar = null;
        }
        int i18 = i13;
        w wVar2 = aVar2.f24933b;
        long j12 = wVar2.timestampsUs[i12];
        int i19 = wVar2.flags[i12];
        if (!this.f24925t) {
            i19 |= AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        }
        int i20 = i19;
        if (p10 != null) {
            boolean z11 = false;
            p10.c(o10, j12, i20, i18, 0, null);
            r12 = z11;
            if (i12 + 1 == aVar2.f24933b.f24974b) {
                p10.a(o10, aVar);
                r12 = z11;
            }
        } else {
            r12 = 0;
            o10.g(j12, i20, i18, 0, null);
        }
        aVar2.f24936e++;
        this.f24921p = -1;
        this.f24922q = r12;
        this.f24923r = r12;
        this.f24924s = r12;
        this.f24925t = r12;
        return r12;
    }

    public final int L(InterfaceC1184q interfaceC1184q, I i10) {
        int c10 = this.f24913h.c(interfaceC1184q, i10, this.f24914i);
        if (c10 == 1 && i10.f4333a == 0) {
            t();
        }
        return c10;
    }

    public final boolean O(C2334C c2334c) {
        C4225c a10;
        if (c2334c != null && (this.f24907b & 64) != 0 && (a10 = AbstractC2380j.a(c2334c, "auxiliary.tracks.offset")) != null) {
            long T10 = new e1.J(a10.value).T();
            if (T10 > 0) {
                this.f24928w = T10;
                return true;
            }
        }
        return false;
    }

    public final void P(a aVar, long j10) {
        w wVar = aVar.f24933b;
        int a10 = wVar.a(j10);
        if (a10 == -1) {
            a10 = wVar.b(j10);
        }
        aVar.f24936e = a10;
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        this.f24912g.clear();
        this.f24919n = 0;
        this.f24921p = -1;
        this.f24922q = 0;
        this.f24923r = 0;
        this.f24924s = 0;
        this.f24925t = false;
        if (j10 == 0) {
            if (this.f24916k != 3) {
                t();
                return;
            } else {
                this.f24913h.g();
                this.f24914i.clear();
                return;
            }
        }
        for (a aVar : this.tracks) {
            P(aVar, j11);
            P p10 = aVar.f24935d;
            if (p10 != null) {
                p10.b();
            }
        }
    }

    @Override // H1.InterfaceC1183p
    public void c(H1.r rVar) {
        if ((this.f24907b & 16) == 0) {
            rVar = new e2.t(rVar, this.f24906a);
        }
        this.f24931z = rVar;
    }

    @Override // H1.J
    public J.a e(long j10) {
        return w(j10, -1);
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, I i10) {
        while (true) {
            int i11 = this.f24916k;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return K(interfaceC1184q, i10);
                    }
                    if (i11 == 3) {
                        return L(interfaceC1184q, i10);
                    }
                    throw new IllegalStateException();
                }
                if (J(interfaceC1184q, i10)) {
                    return 1;
                }
            } else if (!I(interfaceC1184q)) {
                return -1;
            }
        }
    }

    @Override // H1.J
    public boolean i() {
        return true;
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        N d10 = s.d(interfaceC1184q, (this.f24907b & 2) != 0);
        this.f24915j = d10 != null ? AbstractC3445z.u(d10) : AbstractC3445z.t();
        return d10 == null;
    }

    @Override // H1.J
    public long m() {
        return this.f24903C;
    }

    public final boolean r(androidx.media3.common.a aVar) {
        return Objects.equals(aVar.f20543o, "video/avc") ? (this.f24907b & 32) != 0 : Objects.equals(aVar.f20543o, "video/hevc") && (this.f24907b & 128) != 0;
    }

    public final void t() {
        this.f24916k = 0;
        this.f24919n = 0;
    }

    public final List u(C2334C c2334c) {
        List d10 = ((C4225c) AbstractC4134a.i(AbstractC2380j.a(c2334c, "auxiliary.tracks.map"))).d();
        ArrayList arrayList = new ArrayList(d10.size());
        for (int i10 = 0; i10 < d10.size(); i10++) {
            int intValue = ((Integer) d10.get(i10)).intValue();
            int i11 = 1;
            if (intValue != 0) {
                if (intValue != 1) {
                    i11 = 3;
                    if (intValue != 2) {
                        i11 = intValue != 3 ? 0 : 4;
                    }
                } else {
                    i11 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    public long[] v(int i10) {
        a[] aVarArr = this.tracks;
        return aVarArr.length <= i10 ? new long[0] : aVarArr[i10].f24933b.timestampsUs;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public J.a w(long j10, int i10) {
        long j11;
        long j12;
        long j13;
        long j14;
        int b10;
        a[] aVarArr = this.tracks;
        if (aVarArr.length == 0) {
            return new J.a(K.f4338c);
        }
        int i11 = i10 != -1 ? i10 : this.f24902B;
        if (i11 != -1) {
            w wVar = aVarArr[i11].f24933b;
            int y10 = y(wVar, j10);
            if (y10 == -1) {
                return new J.a(K.f4338c);
            }
            j12 = wVar.timestampsUs[y10];
            j11 = wVar.offsets[y10];
            if (j12 < j10 && y10 < wVar.f24974b - 1 && (b10 = wVar.b(j10)) != -1 && b10 != y10) {
                j14 = wVar.timestampsUs[b10];
                j13 = wVar.offsets[b10];
                if (i10 == -1) {
                    int i12 = 0;
                    while (true) {
                        a[] aVarArr2 = this.tracks;
                        if (i12 >= aVarArr2.length) {
                            break;
                        }
                        if (i12 != this.f24902B) {
                            w wVar2 = aVarArr2[i12].f24933b;
                            long A10 = A(wVar2, j12, j11);
                            if (j14 != -9223372036854775807L) {
                                j13 = A(wVar2, j14, j13);
                            }
                            j11 = A10;
                        }
                        i12++;
                    }
                }
                K k10 = new K(j12, j11);
                return j14 != -9223372036854775807L ? new J.a(k10) : new J.a(k10, new K(j14, j13));
            }
        } else {
            j11 = LongCompanionObject.MAX_VALUE;
            j12 = j10;
        }
        j13 = -1;
        j14 = -9223372036854775807L;
        if (i10 == -1) {
        }
        K k102 = new K(j12, j11);
        if (j14 != -9223372036854775807L) {
        }
    }

    @Override // H1.InterfaceC1183p
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public AbstractC3445z k() {
        return this.f24915j;
    }

    public final int z(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = LongCompanionObject.MAX_VALUE;
        boolean z10 = true;
        long j12 = LongCompanionObject.MAX_VALUE;
        boolean z11 = true;
        long j13 = LongCompanionObject.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.tracks;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f24936e;
            w wVar = aVar.f24933b;
            if (i13 != wVar.f24974b) {
                long j14 = wVar.offsets[i13];
                long j15 = ((long[][]) Z.i(this.f24901A))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j12 = j15;
                    i11 = i12;
                    j13 = j16;
                }
                if (j15 < j11) {
                    z10 = z12;
                    j11 = j15;
                    i10 = i12;
                }
            }
            i12++;
        }
        return (j11 == LongCompanionObject.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }
}
