package w0;

import B1.m0;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import x0.InterfaceC10575D;

/* renamed from: w0.E, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10378E implements InterfaceC10395k, InterfaceC10575D {

    /* renamed from: a, reason: collision with root package name */
    private final int f103149a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f103150b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f103151c;

    /* renamed from: d, reason: collision with root package name */
    private final int f103152d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Z1.s f103153e;

    /* renamed from: f, reason: collision with root package name */
    private final int f103154f;

    /* renamed from: g, reason: collision with root package name */
    private final int f103155g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<m0> f103156h;

    /* renamed from: i, reason: collision with root package name */
    private final long f103157i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f103158j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final LazyLayoutItemAnimator<C10378E> f103159k;

    /* renamed from: l, reason: collision with root package name */
    private final long f103160l;

    /* renamed from: m, reason: collision with root package name */
    private final int f103161m;

    /* renamed from: n, reason: collision with root package name */
    private final int f103162n;

    /* renamed from: o, reason: collision with root package name */
    private final int f103163o;

    /* renamed from: p, reason: collision with root package name */
    private final int f103164p;

    /* renamed from: q, reason: collision with root package name */
    private int f103165q;

    /* renamed from: r, reason: collision with root package name */
    private int f103166r;

    /* renamed from: s, reason: collision with root package name */
    private int f103167s;

    /* renamed from: t, reason: collision with root package name */
    private final long f103168t;

    /* renamed from: u, reason: collision with root package name */
    private long f103169u;

    /* renamed from: v, reason: collision with root package name */
    private int f103170v;

    /* renamed from: w, reason: collision with root package name */
    private int f103171w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f103172x;

    private C10378E() {
        throw null;
    }

    public C10378E(int i11, Object obj, int i12, int i13, Z1.s sVar, int i14, int i15, List list, long j11, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j12, int i16, int i17) {
        this.f103149a = i11;
        this.f103150b = obj;
        this.f103151c = true;
        this.f103152d = i12;
        this.f103153e = sVar;
        this.f103154f = i14;
        this.f103155g = i15;
        this.f103156h = list;
        this.f103157i = j11;
        this.f103158j = obj2;
        this.f103159k = lazyLayoutItemAnimator;
        this.f103160l = j12;
        this.f103161m = i16;
        this.f103162n = i17;
        this.f103165q = LinearLayoutManager.INVALID_OFFSET;
        int size = list.size();
        int i18 = 0;
        for (int i19 = 0; i19 < size; i19++) {
            m0 m0Var = (m0) list.get(i19);
            i18 = Math.max(i18, this.f103151c ? m0Var.l0() : m0Var.u0());
        }
        this.f103163o = i18;
        int i21 = i13 + i18;
        this.f103164p = i21 >= 0 ? i21 : 0;
        this.f103168t = this.f103151c ? Z1.r.a(this.f103152d, i18) : Z1.r.a(i18, this.f103152d);
        this.f103169u = 0L;
        this.f103170v = -1;
        this.f103171w = -1;
    }

    private final int p(long j11) {
        return (int) (this.f103151c ? j11 & 4294967295L : j11 >> 32);
    }

    @Override // w0.InterfaceC10395k
    public final long a() {
        return this.f103168t;
    }

    @Override // x0.InterfaceC10575D
    public final int b() {
        return this.f103156h.size();
    }

    @Override // x0.InterfaceC10575D
    public final long c() {
        return this.f103160l;
    }

    @Override // x0.InterfaceC10575D
    public final boolean d() {
        return this.f103151c;
    }

    @Override // w0.InterfaceC10395k
    public final int e() {
        return this.f103171w;
    }

    @Override // x0.InterfaceC10575D
    public final void f(int i11, int i12, int i13, int i14) {
        t(i11, i12, i13, i14, -1, -1);
    }

    @Override // x0.InterfaceC10575D
    public final void g() {
        this.f103172x = true;
    }

    @Override // w0.InterfaceC10395k, x0.InterfaceC10575D
    public final int getIndex() {
        return this.f103149a;
    }

    @Override // x0.InterfaceC10575D
    @NotNull
    public final Object getKey() {
        return this.f103150b;
    }

    @Override // w0.InterfaceC10395k
    public final long h() {
        return this.f103169u;
    }

    @Override // w0.InterfaceC10395k
    public final int i() {
        return this.f103170v;
    }

    @Override // x0.InterfaceC10575D
    public final int j() {
        return this.f103164p;
    }

    @Override // x0.InterfaceC10575D
    public final Object k(int i11) {
        return this.f103156h.get(i11).m();
    }

    @Override // x0.InterfaceC10575D
    public final long l(int i11) {
        return this.f103169u;
    }

    @Override // x0.InterfaceC10575D
    public final int m() {
        return this.f103162n;
    }

    @Override // x0.InterfaceC10575D
    public final int n() {
        return this.f103161m;
    }

    public final void o(int i11) {
        if (this.f103172x) {
            return;
        }
        long j11 = this.f103169u;
        boolean z11 = this.f103151c;
        this.f103169u = Z1.n.a(z11 ? (int) (j11 >> 32) : ((int) (j11 >> 32)) + i11, z11 ? ((int) (j11 & 4294967295L)) + i11 : (int) (j11 & 4294967295L));
        int size = this.f103156h.size();
        for (int i12 = 0; i12 < size; i12++) {
            androidx.compose.foundation.lazy.layout.b d11 = this.f103159k.d(i12, this.f103150b);
            if (d11 != null) {
                long m11 = d11.m();
                d11.u(Z1.n.a(z11 ? (int) (m11 >> 32) : ((int) (m11 >> 32)) + i11, z11 ? ((int) (m11 & 4294967295L)) + i11 : (int) (m11 & 4294967295L)));
            }
        }
    }

    public final int q() {
        return this.f103163o;
    }

    public final boolean r() {
        return this.f103172x;
    }

    public final void s(@NotNull m0.a aVar) {
        o1.d dVar;
        long j11;
        m0.a aVar2;
        if (this.f103165q == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        List<m0> list = this.f103156h;
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            m0 m0Var = list.get(i11);
            int i12 = this.f103166r;
            boolean z11 = this.f103151c;
            int l02 = i12 - (z11 ? m0Var.l0() : m0Var.u0());
            int i13 = this.f103167s;
            long j12 = this.f103169u;
            androidx.compose.foundation.lazy.layout.b d11 = this.f103159k.d(i11, this.f103150b);
            if (d11 != null) {
                j11 = Z1.m.e(j12, d11.l());
                if ((p(j12) <= l02 && p(j11) <= l02) || (p(j12) >= i13 && p(j11) >= i13)) {
                    d11.h();
                }
                dVar = d11.j();
            } else {
                dVar = null;
                j11 = j12;
            }
            o1.d dVar2 = dVar;
            long e11 = Z1.m.e(j11, this.f103157i);
            if (d11 != null) {
                d11.s(e11);
            }
            if (!z11) {
                aVar2 = aVar;
                if (dVar2 != null) {
                    m0.a.m(aVar2, m0Var, e11, dVar2);
                } else {
                    m0.a.l(aVar2, m0Var, e11);
                }
            } else if (dVar2 != null) {
                aVar2 = aVar;
                aVar2.q(m0Var, e11, dVar2, 0.0f);
            } else {
                aVar2 = aVar;
                m0.a.r(aVar2, m0Var, e11);
            }
            i11++;
            aVar = aVar2;
        }
    }

    public final void t(int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z11 = this.f103151c;
        this.f103165q = z11 ? i14 : i13;
        if (!z11) {
            i13 = i14;
        }
        if (z11 && this.f103153e == Z1.s.Rtl) {
            i12 = (i13 - i12) - this.f103152d;
        }
        this.f103169u = z11 ? Z1.n.a(i12, i11) : Z1.n.a(i11, i12);
        this.f103170v = i15;
        this.f103171w = i16;
        this.f103166r = -this.f103154f;
        this.f103167s = this.f103165q + this.f103155g;
    }

    public final void u(int i11) {
        this.f103165q = i11;
        this.f103167s = i11 + this.f103155g;
    }
}
