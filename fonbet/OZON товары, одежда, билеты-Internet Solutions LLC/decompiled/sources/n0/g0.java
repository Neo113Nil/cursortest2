package n0;

import B1.InterfaceC2552v;
import B1.m0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;

/* loaded from: classes8.dex */
public final class g0 extends e.c implements D1.E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private d0 f76179a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f76180b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f76181c;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f76183c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m0 f76184d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, m0 m0Var) {
            super(1);
            this.f76183c = i11;
            this.f76184d = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            g0 g0Var = g0.this;
            int m11 = g0Var.I1().m();
            int i11 = this.f76183c;
            int e11 = kotlin.ranges.h.e(m11, 0, i11);
            int i12 = g0Var.J1() ? e11 - i11 : -e11;
            aVar2.s(new f0(g0Var.K1() ? 0 : i12, g0Var.K1() ? i12 : 0, this.f76184d));
            return Unit.f71690a;
        }
    }

    public g0(@NotNull d0 d0Var, boolean z11, boolean z12) {
        this.f76179a = d0Var;
        this.f76180b = z11;
        this.f76181c = z12;
    }

    @Override // D1.E
    public final int A(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return this.f76181c ? interfaceC2552v.T(Integer.MAX_VALUE) : interfaceC2552v.T(i11);
    }

    @Override // D1.E
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        B1.W z02;
        C8393n.a(j11, this.f76181c ? EnumC9142v.Vertical : EnumC9142v.Horizontal);
        m0 a02 = u11.a0(Z1.b.c(0, this.f76181c ? Z1.b.k(j11) : Integer.MAX_VALUE, 0, this.f76181c ? Integer.MAX_VALUE : Z1.b.j(j11), 5, j11));
        int u02 = a02.u0();
        int k11 = Z1.b.k(j11);
        if (u02 > k11) {
            u02 = k11;
        }
        int l02 = a02.l0();
        int j12 = Z1.b.j(j11);
        if (l02 > j12) {
            l02 = j12;
        }
        int l03 = a02.l0() - l02;
        int u03 = a02.u0() - u02;
        if (!this.f76181c) {
            l03 = u03;
        }
        this.f76179a.o(l03);
        this.f76179a.p(this.f76181c ? l02 : u02);
        z02 = y11.z0(u02, l02, kotlin.collections.U.c(), new a(l03, a02));
        return z02;
    }

    @Override // D1.E
    public final int I(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return this.f76181c ? interfaceC2552v.D(i11) : interfaceC2552v.D(Integer.MAX_VALUE);
    }

    @NotNull
    public final d0 I1() {
        return this.f76179a;
    }

    public final boolean J1() {
        return this.f76180b;
    }

    @Override // D1.E
    public final int K(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return this.f76181c ? interfaceC2552v.O(i11) : interfaceC2552v.O(Integer.MAX_VALUE);
    }

    public final boolean K1() {
        return this.f76181c;
    }

    public final void L1(boolean z11) {
        this.f76180b = z11;
    }

    public final void M1(@NotNull d0 d0Var) {
        this.f76179a = d0Var;
    }

    public final void N1(boolean z11) {
        this.f76181c = z11;
    }

    @Override // D1.E
    public final int u(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return this.f76181c ? interfaceC2552v.Y(Integer.MAX_VALUE) : interfaceC2552v.Y(i11);
    }
}
