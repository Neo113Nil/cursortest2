package u0;

import B1.m0;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: u0.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9907p implements B1.J, C1.d, C1.j<J> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final J f99672a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f99673b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3991w0 f99674c;

    /* renamed from: u0.p$a */
    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f99675b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f99676c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f99677d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, int i12, m0 m0Var) {
            super(1);
            this.f99675b = m0Var;
            this.f99676c = i11;
            this.f99677d = i12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.d(this.f99675b, this.f99676c, this.f99677d, 0.0f);
            return Unit.f71690a;
        }
    }

    public C9907p(@NotNull J j11) {
        C3991w0 f7;
        C3991w0 f11;
        this.f99672a = j11;
        f7 = n1.f(j11, D1.f25195a);
        this.f99673b = f7;
        f11 = n1.f(j11, D1.f25195a);
        this.f99674c = f11;
    }

    @Override // B1.J
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        B1.W z02;
        C3991w0 c3991w0 = this.f99673b;
        int a11 = ((J) c3991w0.getValue()).a(y11, y11.getLayoutDirection());
        int c11 = ((J) c3991w0.getValue()).c(y11);
        int d11 = ((J) c3991w0.getValue()).d(y11, y11.getLayoutDirection()) + a11;
        int b11 = ((J) c3991w0.getValue()).b(y11) + c11;
        m0 a02 = u11.a0(Z1.c.k(-d11, -b11, j11));
        z02 = y11.z0(Z1.c.h(a02.u0() + d11, j11), Z1.c.g(a02.l0() + b11, j11), kotlin.collections.U.c(), new a(a11, c11, a02));
        return z02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9907p) {
            return Intrinsics.d(((C9907p) obj).f99672a, this.f99672a);
        }
        return false;
    }

    @Override // C1.j
    @NotNull
    public final C1.m<J> getKey() {
        return O.b();
    }

    @Override // C1.j
    public final J getValue() {
        return (J) this.f99674c.getValue();
    }

    public final int hashCode() {
        return this.f99672a.hashCode();
    }

    @Override // C1.d
    public final void w1(@NotNull C1.l lVar) {
        J j11 = (J) lVar.G(O.b());
        J j12 = this.f99672a;
        this.f99673b.setValue(new C9901j(j12, j11));
        this.f99674c.setValue(new G(j11, j12));
    }
}
