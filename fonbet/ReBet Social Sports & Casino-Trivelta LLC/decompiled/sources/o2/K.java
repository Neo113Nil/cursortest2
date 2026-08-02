package o2;

import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.J;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import b1.C2338G;
import com.plaid.internal.EnumC3631g;
import e1.AbstractC4134a;
import e1.Q;
import e1.Z;
import e2.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o2.L;

/* loaded from: classes.dex */
public final class K implements InterfaceC1183p {

    /* renamed from: v, reason: collision with root package name */
    public static final H1.u f58951v = new H1.u() { // from class: o2.J
        @Override // H1.u
        public final InterfaceC1183p[] f() {
            return K.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f58952a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58953b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58954c;

    /* renamed from: d, reason: collision with root package name */
    public final List f58955d;

    /* renamed from: e, reason: collision with root package name */
    public final e1.J f58956e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseIntArray f58957f;

    /* renamed from: g, reason: collision with root package name */
    public final L.c f58958g;

    /* renamed from: h, reason: collision with root package name */
    public final s.a f58959h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseArray f58960i;

    /* renamed from: j, reason: collision with root package name */
    public final SparseBooleanArray f58961j;

    /* renamed from: k, reason: collision with root package name */
    public final SparseBooleanArray f58962k;

    /* renamed from: l, reason: collision with root package name */
    public final I f58963l;

    /* renamed from: m, reason: collision with root package name */
    public H f58964m;

    /* renamed from: n, reason: collision with root package name */
    public H1.r f58965n;

    /* renamed from: o, reason: collision with root package name */
    public int f58966o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f58967p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f58968q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f58969r;

    /* renamed from: s, reason: collision with root package name */
    public L f58970s;

    /* renamed from: t, reason: collision with root package name */
    public int f58971t;

    /* renamed from: u, reason: collision with root package name */
    public int f58972u;

    public K(int i10, s.a aVar) {
        this(1, i10, aVar, new Q(0L), new C5790j(0), 112800);
    }

    public static /* synthetic */ InterfaceC1183p[] b() {
        return new InterfaceC1183p[]{new K(1, s.a.f45617a)};
    }

    public static /* synthetic */ int m(K k10) {
        int i10 = k10.f58966o;
        k10.f58966o = i10 + 1;
        return i10;
    }

    private void y(long j10) {
        if (this.f58968q) {
            return;
        }
        this.f58968q = true;
        if (this.f58963l.b() == -9223372036854775807L) {
            this.f58965n.q(new J.b(this.f58963l.b()));
            return;
        }
        H h10 = new H(this.f58963l.c(), this.f58963l.b(), j10, this.f58972u, this.f58954c);
        this.f58964m = h10;
        this.f58965n.q(h10.b());
    }

    public final boolean A(int i10) {
        return this.f58952a == 2 || this.f58967p || !this.f58962k.get(i10, false);
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        H h10;
        AbstractC4134a.g(this.f58952a != 2);
        int size = this.f58955d.size();
        for (int i10 = 0; i10 < size; i10++) {
            Q q10 = (Q) this.f58955d.get(i10);
            boolean z10 = q10.f() == -9223372036854775807L;
            if (!z10) {
                long d10 = q10.d();
                z10 = (d10 == -9223372036854775807L || d10 == 0 || d10 == j11) ? false : true;
            }
            if (z10) {
                q10.i(j11);
            }
        }
        if (j11 != 0 && (h10 = this.f58964m) != null) {
            h10.h(j11);
        }
        this.f58956e.X(0);
        this.f58957f.clear();
        for (int i11 = 0; i11 < this.f58960i.size(); i11++) {
            ((L) this.f58960i.valueAt(i11)).b();
        }
        this.f58971t = 0;
    }

    @Override // H1.InterfaceC1183p
    public void c(H1.r rVar) {
        if ((this.f58953b & 1) == 0) {
            rVar = new e2.t(rVar, this.f58959h);
        }
        this.f58965n = rVar;
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, H1.I i10) {
        int i11;
        long length = interfaceC1184q.getLength();
        boolean z10 = this.f58952a == 2;
        if (this.f58967p) {
            if (length != -1 && !z10 && !this.f58963l.d()) {
                return this.f58963l.e(interfaceC1184q, i10, this.f58972u);
            }
            y(length);
            if (this.f58969r) {
                this.f58969r = false;
                a(0L, 0L);
                if (interfaceC1184q.getPosition() != 0) {
                    i10.f4333a = 0L;
                    return 1;
                }
            }
            H h10 = this.f58964m;
            if (h10 != null && h10.d()) {
                return this.f58964m.c(interfaceC1184q, i10);
            }
        }
        if (!w(interfaceC1184q)) {
            for (int i12 = 0; i12 < this.f58960i.size(); i12++) {
                L l10 = (L) this.f58960i.valueAt(i12);
                if (l10 instanceof y) {
                    y yVar = (y) l10;
                    if (yVar.d(z10)) {
                        yVar.a(new e1.J(), 1);
                    }
                }
            }
            return -1;
        }
        int x10 = x();
        int j10 = this.f58956e.j();
        if (x10 > j10) {
            return 0;
        }
        int v10 = this.f58956e.v();
        if ((8388608 & v10) != 0) {
            this.f58956e.b0(x10);
            return 0;
        }
        int i13 = (4194304 & v10) != 0 ? 1 : 0;
        int i14 = (2096896 & v10) >> 8;
        boolean z11 = (v10 & 32) != 0;
        L l11 = (v10 & 16) != 0 ? (L) this.f58960i.get(i14) : null;
        if (l11 == null) {
            this.f58956e.b0(x10);
            return 0;
        }
        if (this.f58952a != 2) {
            int i15 = v10 & 15;
            i11 = 0;
            int i16 = this.f58957f.get(i14, i15 - 1);
            this.f58957f.put(i14, i15);
            if (i16 == i15) {
                this.f58956e.b0(x10);
                return 0;
            }
            if (i15 != ((i16 + 1) & 15)) {
                l11.b();
            }
        } else {
            i11 = 0;
        }
        if (z11) {
            int M10 = this.f58956e.M();
            i13 |= (this.f58956e.M() & 64) != 0 ? 2 : i11;
            this.f58956e.c0(M10 - 1);
        }
        boolean z12 = this.f58967p;
        if (A(i14)) {
            this.f58956e.a0(x10);
            l11.a(this.f58956e, i13);
            this.f58956e.a0(j10);
        }
        if (this.f58952a != 2 && !z12 && this.f58967p && length != -1) {
            this.f58969r = true;
        }
        this.f58956e.b0(x10);
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // H1.InterfaceC1183p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean j(InterfaceC1184q interfaceC1184q) {
        byte[] f10 = this.f58956e.f();
        interfaceC1184q.n(f10, 0, 940);
        int i10 = 0;
        while (i10 < 188) {
            for (int i11 = 0; i11 < 5; i11++) {
                if (f10[(i11 * 188) + i10] != 71) {
                    break;
                }
            }
            interfaceC1184q.l(i10);
            return true;
        }
        return false;
    }

    public final boolean w(InterfaceC1184q interfaceC1184q) {
        byte[] f10 = this.f58956e.f();
        if (9400 - this.f58956e.g() < 188) {
            int a10 = this.f58956e.a();
            if (a10 > 0) {
                System.arraycopy(f10, this.f58956e.g(), f10, 0, a10);
            }
            this.f58956e.Z(f10, a10);
        }
        while (this.f58956e.a() < 188) {
            int j10 = this.f58956e.j();
            int read = interfaceC1184q.read(f10, j10, 9400 - j10);
            if (read == -1) {
                return false;
            }
            this.f58956e.a0(j10 + read);
        }
        return true;
    }

    public final int x() {
        int g10 = this.f58956e.g();
        int j10 = this.f58956e.j();
        int a10 = M.a(this.f58956e.f(), g10, j10);
        this.f58956e.b0(a10);
        int i10 = a10 + 188;
        if (i10 <= j10) {
            this.f58971t = 0;
            return i10;
        }
        int i11 = this.f58971t + (a10 - g10);
        this.f58971t = i11;
        if (this.f58952a != 2 || i11 <= 376) {
            return i10;
        }
        throw C2338G.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    public final void z() {
        this.f58961j.clear();
        this.f58960i.clear();
        SparseArray b10 = this.f58958g.b();
        int size = b10.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f58960i.put(b10.keyAt(i10), (L) b10.valueAt(i10));
        }
        this.f58960i.put(0, new C5778E(new a()));
        this.f58970s = null;
    }

    public K(int i10, int i11, s.a aVar, Q q10, L.c cVar, int i12) {
        this.f58958g = (L.c) AbstractC4134a.e(cVar);
        this.f58954c = i12;
        this.f58952a = i10;
        this.f58953b = i11;
        this.f58959h = aVar;
        if (i10 == 1 || i10 == 2) {
            this.f58955d = Collections.singletonList(q10);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f58955d = arrayList;
            arrayList.add(q10);
        }
        this.f58956e = new e1.J(new byte[9400], 0);
        this.f58961j = new SparseBooleanArray();
        this.f58962k = new SparseBooleanArray();
        this.f58960i = new SparseArray();
        this.f58957f = new SparseIntArray();
        this.f58963l = new I(i12);
        this.f58965n = H1.r.f4477Q;
        this.f58972u = -1;
        z();
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }

    public class a implements InterfaceC5777D {

        /* renamed from: a, reason: collision with root package name */
        public final e1.I f58973a = new e1.I(new byte[4]);

        public a() {
        }

        @Override // o2.InterfaceC5777D
        public void a(e1.J j10) {
            if (j10.M() == 0 && (j10.M() & 128) != 0) {
                j10.c0(6);
                int a10 = j10.a() / 4;
                for (int i10 = 0; i10 < a10; i10++) {
                    j10.p(this.f58973a, 4);
                    int h10 = this.f58973a.h(16);
                    this.f58973a.r(3);
                    if (h10 == 0) {
                        this.f58973a.r(13);
                    } else {
                        int h11 = this.f58973a.h(13);
                        if (K.this.f58960i.get(h11) == null) {
                            K.this.f58960i.put(h11, new C5778E(K.this.new b(h11)));
                            K.m(K.this);
                        }
                    }
                }
                if (K.this.f58952a != 2) {
                    K.this.f58960i.remove(0);
                }
            }
        }

        @Override // o2.InterfaceC5777D
        public void c(Q q10, H1.r rVar, L.d dVar) {
        }
    }

    public class b implements InterfaceC5777D {

        /* renamed from: a, reason: collision with root package name */
        public final e1.I f58975a = new e1.I(new byte[5]);

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray f58976b = new SparseArray();

        /* renamed from: c, reason: collision with root package name */
        public final SparseIntArray f58977c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        public final int f58978d;

        public b(int i10) {
            this.f58978d = i10;
        }

        @Override // o2.InterfaceC5777D
        public void a(e1.J j10) {
            Q q10;
            if (j10.M() != 2) {
                return;
            }
            if (K.this.f58952a == 1 || K.this.f58952a == 2 || K.this.f58966o == 1) {
                q10 = (Q) K.this.f58955d.get(0);
            } else {
                q10 = new Q(((Q) K.this.f58955d.get(0)).d());
                K.this.f58955d.add(q10);
            }
            if ((j10.M() & 128) == 0) {
                return;
            }
            j10.c0(1);
            int U10 = j10.U();
            int i10 = 3;
            j10.c0(3);
            j10.p(this.f58975a, 2);
            this.f58975a.r(3);
            int i11 = 13;
            K.this.f58972u = this.f58975a.h(13);
            j10.p(this.f58975a, 2);
            int i12 = 4;
            this.f58975a.r(4);
            j10.c0(this.f58975a.h(12));
            if (K.this.f58952a == 2 && K.this.f58970s == null) {
                L.b bVar = new L.b(21, null, 0, null, Z.EMPTY_BYTE_ARRAY);
                K k10 = K.this;
                k10.f58970s = k10.f58958g.a(21, bVar);
                if (K.this.f58970s != null) {
                    K.this.f58970s.c(q10, K.this.f58965n, new L.d(U10, 21, 8192));
                }
            }
            this.f58976b.clear();
            this.f58977c.clear();
            int a10 = j10.a();
            while (a10 > 0) {
                j10.p(this.f58975a, 5);
                int h10 = this.f58975a.h(8);
                this.f58975a.r(i10);
                int h11 = this.f58975a.h(i11);
                this.f58975a.r(i12);
                int h12 = this.f58975a.h(12);
                L.b b10 = b(j10, h12);
                if (h10 == 6 || h10 == 5) {
                    h10 = b10.f58982a;
                }
                a10 -= h12 + 5;
                int i13 = K.this.f58952a == 2 ? h10 : h11;
                if (!K.this.f58961j.get(i13)) {
                    L a11 = (K.this.f58952a == 2 && h10 == 21) ? K.this.f58970s : K.this.f58958g.a(h10, b10);
                    if (K.this.f58952a != 2 || h11 < this.f58977c.get(i13, 8192)) {
                        this.f58977c.put(i13, h11);
                        this.f58976b.put(i13, a11);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f58977c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int keyAt = this.f58977c.keyAt(i14);
                int valueAt = this.f58977c.valueAt(i14);
                K.this.f58961j.put(keyAt, true);
                K.this.f58962k.put(valueAt, true);
                L l10 = (L) this.f58976b.valueAt(i14);
                if (l10 != null) {
                    if (l10 != K.this.f58970s) {
                        l10.c(q10, K.this.f58965n, new L.d(U10, keyAt, 8192));
                    }
                    K.this.f58960i.put(valueAt, l10);
                }
            }
            if (K.this.f58952a == 2) {
                if (K.this.f58967p) {
                    return;
                }
                K.this.f58965n.s();
                K.this.f58966o = 0;
                K.this.f58967p = true;
                return;
            }
            K.this.f58960i.remove(this.f58978d);
            K k11 = K.this;
            k11.f58966o = k11.f58952a == 1 ? 0 : K.this.f58966o - 1;
            if (K.this.f58966o == 0) {
                K.this.f58965n.s();
                K.this.f58967p = true;
            }
        }

        public final L.b b(e1.J j10, int i10) {
            int i11;
            int g10 = j10.g();
            int i12 = g10 + i10;
            int i13 = -1;
            String str = null;
            ArrayList arrayList = null;
            int i14 = 0;
            while (j10.g() < i12) {
                int M10 = j10.M();
                int g11 = j10.g() + j10.M();
                if (g11 > i12) {
                    break;
                }
                if (M10 == 5) {
                    long O10 = j10.O();
                    if (O10 != 1094921523) {
                        if (O10 != 1161904947) {
                            if (O10 != 1094921524) {
                                if (O10 == 1212503619) {
                                    i13 = 36;
                                }
                            }
                            i13 = 172;
                        }
                        i13 = 135;
                    }
                    i13 = 129;
                } else {
                    if (M10 != 106) {
                        if (M10 != 122) {
                            if (M10 == 127) {
                                int M11 = j10.M();
                                if (M11 != 21) {
                                    if (M11 == 14) {
                                        i13 = 136;
                                    } else if (M11 == 33) {
                                        i13 = EnumC3631g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE;
                                    }
                                }
                                i13 = 172;
                            } else {
                                if (M10 == 123) {
                                    i11 = EnumC3631g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE;
                                } else if (M10 == 10) {
                                    String trim = j10.J(3).trim();
                                    i14 = j10.M();
                                    str = trim;
                                } else if (M10 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (j10.g() < g11) {
                                        String trim2 = j10.J(3).trim();
                                        int M12 = j10.M();
                                        byte[] bArr = new byte[4];
                                        j10.q(bArr, 0, 4);
                                        arrayList2.add(new L.a(trim2, M12, bArr));
                                    }
                                    arrayList = arrayList2;
                                    i13 = 89;
                                } else if (M10 == 111) {
                                    i11 = EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                                }
                                i13 = i11;
                            }
                        }
                        i13 = 135;
                    }
                    i13 = 129;
                }
                j10.c0(g11 - j10.g());
            }
            j10.b0(i12);
            return new L.b(i13, str, i14, arrayList, Arrays.copyOfRange(j10.f(), g10, i12));
        }

        @Override // o2.InterfaceC5777D
        public void c(Q q10, H1.r rVar, L.d dVar) {
        }
    }
}
