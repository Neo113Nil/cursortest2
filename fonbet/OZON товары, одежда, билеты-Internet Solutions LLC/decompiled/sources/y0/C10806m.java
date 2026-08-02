package y0;

import B1.m0;
import androidx.recyclerview.widget.LinearLayoutManager;
import e1.d;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;

/* renamed from: y0.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10806m implements InterfaceC10807n {

    /* renamed from: a, reason: collision with root package name */
    private final int f105832a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<m0> f105833b;

    /* renamed from: c, reason: collision with root package name */
    private final long f105834c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f105835d;

    /* renamed from: e, reason: collision with root package name */
    private final d.a f105836e;

    /* renamed from: f, reason: collision with root package name */
    private final d.b f105837f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Z1.s f105838g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f105839h;

    /* renamed from: i, reason: collision with root package name */
    private final int f105840i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final int[] f105841j;

    /* renamed from: k, reason: collision with root package name */
    private int f105842k;

    /* renamed from: l, reason: collision with root package name */
    private int f105843l;

    private C10806m() {
        throw null;
    }

    public C10806m(int i11, int i12, List list, long j11, Object obj, EnumC9142v enumC9142v, d.a aVar, d.b bVar, Z1.s sVar) {
        this.f105832a = i11;
        this.f105833b = list;
        this.f105834c = j11;
        this.f105835d = obj;
        this.f105836e = aVar;
        this.f105837f = bVar;
        this.f105838g = sVar;
        this.f105839h = enumC9142v == EnumC9142v.Vertical;
        int size = list.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            m0 m0Var = (m0) list.get(i14);
            i13 = Math.max(i13, !this.f105839h ? m0Var.l0() : m0Var.u0());
        }
        this.f105840i = i13;
        this.f105841j = new int[this.f105833b.size() * 2];
        this.f105843l = LinearLayoutManager.INVALID_OFFSET;
    }

    public final void a(int i11) {
        this.f105842k += i11;
        int[] iArr = this.f105841j;
        int length = iArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            boolean z11 = this.f105839h;
            if ((z11 && i12 % 2 == 1) || (!z11 && i12 % 2 == 0)) {
                iArr[i12] = iArr[i12] + i11;
            }
        }
    }

    public final int b() {
        return this.f105840i;
    }

    @NotNull
    public final Object c() {
        return this.f105835d;
    }

    public final void d(@NotNull m0.a aVar) {
        if (this.f105843l == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        List<m0> list = this.f105833b;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            m0 m0Var = list.get(i11);
            int i12 = i11 * 2;
            int[] iArr = this.f105841j;
            long e11 = Z1.m.e(Z1.n.a(iArr[i12], iArr[i12 + 1]), this.f105834c);
            if (this.f105839h) {
                m0.a.r(aVar, m0Var, e11);
            } else {
                m0.a.l(aVar, m0Var, e11);
            }
        }
    }

    public final void e(int i11, int i12, int i13) {
        int u02;
        this.f105842k = i11;
        boolean z11 = this.f105839h;
        this.f105843l = z11 ? i13 : i12;
        List<m0> list = this.f105833b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            m0 m0Var = list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f105841j;
            if (z11) {
                d.a aVar = this.f105836e;
                if (aVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment");
                }
                iArr[i15] = aVar.a(m0Var.u0(), i12, this.f105838g);
                iArr[i15 + 1] = i11;
                u02 = m0Var.l0();
            } else {
                iArr[i15] = i11;
                int i16 = i15 + 1;
                d.b bVar = this.f105837f;
                if (bVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment");
                }
                iArr[i16] = bVar.a(m0Var.l0(), i13);
                u02 = m0Var.u0();
            }
            i11 = u02 + i11;
        }
    }

    @Override // y0.InterfaceC10807n
    public final int getIndex() {
        return this.f105832a;
    }

    @Override // y0.InterfaceC10807n
    public final int getOffset() {
        return this.f105842k;
    }
}
