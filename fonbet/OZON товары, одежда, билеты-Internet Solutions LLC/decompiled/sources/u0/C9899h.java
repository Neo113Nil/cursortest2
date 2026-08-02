package u0;

import B1.m0;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import androidx.compose.ui.platform.AbstractC5245f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: u0.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9899h extends AbstractC5245f1 implements B1.J, C1.d {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9892a f99656b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<J, Z1.d, Integer> f99657c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3991w0 f99658d;

    /* renamed from: u0.h$a */
    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f99659b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
            return Unit.f71690a;
        }
    }

    /* renamed from: u0.h$b */
    static final class b extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f99660b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m0 m0Var) {
            super(1);
            this.f99660b = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.h(this.f99660b, 0, 0, 0.0f);
            return Unit.f71690a;
        }
    }

    public C9899h(@NotNull C9892a c9892a, @NotNull Function1 function1, @NotNull Function2 function2) {
        super(function1);
        C3991w0 f7;
        this.f99656b = c9892a;
        this.f99657c = function2;
        f7 = n1.f(c9892a, D1.f25195a);
        this.f99658d = f7;
    }

    @Override // B1.J
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        B1.W z02;
        B1.W z03;
        int intValue = ((Number) ((W) this.f99657c).invoke((J) this.f99658d.getValue(), y11)).intValue();
        if (intValue == 0) {
            z03 = y11.z0(0, 0, kotlin.collections.U.c(), a.f99659b);
            return z03;
        }
        m0 a02 = u11.a0(Z1.b.c(0, 0, intValue, intValue, 3, j11));
        z02 = y11.z0(a02.u0(), intValue, kotlin.collections.U.c(), new b(a02));
        return z02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9899h)) {
            return false;
        }
        C9899h c9899h = (C9899h) obj;
        return Intrinsics.d(this.f99656b, c9899h.f99656b) && this.f99657c == c9899h.f99657c;
    }

    public final int hashCode() {
        return this.f99657c.hashCode() + (this.f99656b.hashCode() * 31);
    }

    @Override // C1.d
    public final void w1(@NotNull C1.l lVar) {
        this.f99658d.setValue(new C9901j(this.f99656b, (J) lVar.G(O.b())));
    }
}
