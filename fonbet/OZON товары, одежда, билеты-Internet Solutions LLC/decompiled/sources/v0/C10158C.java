package v0;

import B1.m0;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import e1.InterfaceC6250b;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import x0.InterfaceC10575D;

/* renamed from: v0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10158C implements InterfaceC10174n, InterfaceC10575D {

    /* renamed from: a, reason: collision with root package name */
    private final int f101434a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<m0> f101435b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f101436c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6250b.InterfaceC0966b f101437d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6250b.c f101438e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Z1.s f101439f;

    /* renamed from: g, reason: collision with root package name */
    private final int f101440g;

    /* renamed from: h, reason: collision with root package name */
    private final int f101441h;

    /* renamed from: i, reason: collision with root package name */
    private final int f101442i;

    /* renamed from: j, reason: collision with root package name */
    private final long f101443j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Object f101444k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f101445l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final LazyLayoutItemAnimator<C10158C> f101446m;

    /* renamed from: n, reason: collision with root package name */
    private final long f101447n;

    /* renamed from: o, reason: collision with root package name */
    private int f101448o;

    /* renamed from: p, reason: collision with root package name */
    private final int f101449p;

    /* renamed from: q, reason: collision with root package name */
    private final int f101450q;

    /* renamed from: r, reason: collision with root package name */
    private final int f101451r;

    /* renamed from: s, reason: collision with root package name */
    private final int f101452s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f101453t;

    /* renamed from: u, reason: collision with root package name */
    private int f101454u;

    /* renamed from: v, reason: collision with root package name */
    private int f101455v;

    /* renamed from: w, reason: collision with root package name */
    private int f101456w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final int[] f101457x;

    private C10158C() {
        throw null;
    }

    public C10158C(int i11, List list, boolean z11, InterfaceC6250b.InterfaceC0966b interfaceC0966b, InterfaceC6250b.c cVar, Z1.s sVar, int i12, int i13, int i14, long j11, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j12) {
        this.f101434a = i11;
        this.f101435b = list;
        this.f101436c = z11;
        this.f101437d = interfaceC0966b;
        this.f101438e = cVar;
        this.f101439f = sVar;
        this.f101440g = i12;
        this.f101441h = i13;
        this.f101442i = i14;
        this.f101443j = j11;
        this.f101444k = obj;
        this.f101445l = obj2;
        this.f101446m = lazyLayoutItemAnimator;
        this.f101447n = j12;
        this.f101450q = 1;
        this.f101454u = LinearLayoutManager.INVALID_OFFSET;
        int size = list.size();
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            m0 m0Var = (m0) list.get(i17);
            i15 += this.f101436c ? m0Var.l0() : m0Var.u0();
            i16 = Math.max(i16, !this.f101436c ? m0Var.l0() : m0Var.u0());
        }
        this.f101449p = i15;
        int i18 = i15 + this.f101442i;
        this.f101451r = i18 >= 0 ? i18 : 0;
        this.f101452s = i16;
        this.f101457x = new int[this.f101435b.size() * 2];
    }

    private final int h(long j11) {
        return (int) (this.f101436c ? j11 & 4294967295L : j11 >> 32);
    }

    public final void a(int i11, boolean z11) {
        boolean z12;
        if (this.f101453t) {
            return;
        }
        this.f101448o += i11;
        int[] iArr = this.f101457x;
        int length = iArr.length;
        int i12 = 0;
        while (true) {
            z12 = this.f101436c;
            if (i12 >= length) {
                break;
            }
            if ((z12 && i12 % 2 == 1) || (!z12 && i12 % 2 == 0)) {
                iArr[i12] = iArr[i12] + i11;
            }
            i12++;
        }
        if (z11) {
            int size = this.f101435b.size();
            for (int i13 = 0; i13 < size; i13++) {
                androidx.compose.foundation.lazy.layout.b d11 = this.f101446m.d(i13, this.f101444k);
                if (d11 != null) {
                    long m11 = d11.m();
                    d11.u(Z1.n.a(z12 ? (int) (m11 >> 32) : ((int) (m11 >> 32)) + i11, z12 ? ((int) (m11 & 4294967295L)) + i11 : (int) (m11 & 4294967295L)));
                }
            }
        }
    }

    @Override // x0.InterfaceC10575D
    public final int b() {
        return this.f101435b.size();
    }

    @Override // x0.InterfaceC10575D
    public final long c() {
        return this.f101447n;
    }

    @Override // x0.InterfaceC10575D
    public final boolean d() {
        return this.f101436c;
    }

    public final int e() {
        return this.f101452s;
    }

    @Override // x0.InterfaceC10575D
    public final void f(int i11, int i12, int i13, int i14) {
        p(i11, i13, i14);
    }

    @Override // x0.InterfaceC10575D
    public final void g() {
        this.f101453t = true;
    }

    @Override // v0.InterfaceC10174n, x0.InterfaceC10575D
    public final int getIndex() {
        return this.f101434a;
    }

    @Override // v0.InterfaceC10174n, x0.InterfaceC10575D
    @NotNull
    public final Object getKey() {
        return this.f101444k;
    }

    @Override // v0.InterfaceC10174n
    public final int getOffset() {
        return this.f101448o;
    }

    @Override // v0.InterfaceC10174n
    public final int getSize() {
        return this.f101449p;
    }

    public final boolean i() {
        return this.f101453t;
    }

    @Override // x0.InterfaceC10575D
    public final int j() {
        return this.f101451r;
    }

    @Override // x0.InterfaceC10575D
    public final Object k(int i11) {
        return this.f101435b.get(i11).m();
    }

    @Override // x0.InterfaceC10575D
    public final long l(int i11) {
        int i12 = i11 * 2;
        int[] iArr = this.f101457x;
        return Z1.n.a(iArr[i12], iArr[i12 + 1]);
    }

    @Override // x0.InterfaceC10575D
    public final int m() {
        return this.f101450q;
    }

    @Override // x0.InterfaceC10575D
    public final int n() {
        return 0;
    }

    public final void o(@NotNull m0.a aVar, boolean z11) {
        o1.d dVar;
        if (this.f101454u == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        List<m0> list = this.f101435b;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            m0 m0Var = list.get(i11);
            int i12 = this.f101455v;
            boolean z12 = this.f101436c;
            int l02 = i12 - (z12 ? m0Var.l0() : m0Var.u0());
            int i13 = this.f101456w;
            long l11 = l(i11);
            androidx.compose.foundation.lazy.layout.b d11 = this.f101446m.d(i11, this.f101444k);
            if (d11 != null) {
                if (z11) {
                    d11.t(l11);
                } else {
                    long k11 = d11.k();
                    int i14 = androidx.compose.foundation.lazy.layout.b.f39607q;
                    if (!Z1.m.c(k11, b.a.a())) {
                        l11 = d11.k();
                    }
                    long e11 = Z1.m.e(l11, d11.l());
                    if ((h(l11) <= l02 && h(e11) <= l02) || (h(l11) >= i13 && h(e11) >= i13)) {
                        d11.h();
                    }
                    l11 = e11;
                }
                dVar = d11.j();
            } else {
                dVar = null;
            }
            o1.d dVar2 = dVar;
            long e12 = Z1.m.e(l11, this.f101443j);
            if (!z11 && d11 != null) {
                d11.s(e12);
            }
            if (z12) {
                if (dVar2 != null) {
                    aVar.q(m0Var, e12, dVar2, 0.0f);
                } else {
                    m0.a.r(aVar, m0Var, e12);
                }
            } else if (dVar2 != null) {
                m0.a.m(aVar, m0Var, e12, dVar2);
            } else {
                m0.a.l(aVar, m0Var, e12);
            }
        }
    }

    public final void p(int i11, int i12, int i13) {
        int u02;
        this.f101448o = i11;
        boolean z11 = this.f101436c;
        this.f101454u = z11 ? i13 : i12;
        List<m0> list = this.f101435b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            m0 m0Var = list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f101457x;
            if (z11) {
                InterfaceC6250b.InterfaceC0966b interfaceC0966b = this.f101437d;
                if (interfaceC0966b == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
                }
                iArr[i15] = interfaceC0966b.a(m0Var.u0(), i12, this.f101439f);
                iArr[i15 + 1] = i11;
                u02 = m0Var.l0();
            } else {
                iArr[i15] = i11;
                int i16 = i15 + 1;
                InterfaceC6250b.c cVar = this.f101438e;
                if (cVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false");
                }
                iArr[i16] = cVar.a(m0Var.l0(), i13);
                u02 = m0Var.u0();
            }
            i11 = u02 + i11;
        }
        this.f101455v = -this.f101440g;
        this.f101456w = this.f101454u + this.f101441h;
    }

    public final void q(int i11) {
        this.f101454u = i11;
        this.f101456w = i11 + this.f101441h;
    }
}
