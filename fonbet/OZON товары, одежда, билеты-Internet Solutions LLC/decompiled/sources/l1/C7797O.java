package l1;

import B1.m0;
import D1.AbstractC2810k0;
import D1.C2809k;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7797O extends e.c implements D1.E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Function1<? super InterfaceC7825i0, Unit> f72235a;

    /* renamed from: l1.O$a */
    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B1.m0 f72236b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7797O f72237c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B1.m0 m0Var, C7797O c7797o) {
            super(1);
            this.f72236b = m0Var;
            this.f72237c = c7797o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a.o(aVar, this.f72236b, 0, 0, this.f72237c.I1(), 4);
            return Unit.f71690a;
        }
    }

    public C7797O(@NotNull Function1<? super InterfaceC7825i0, Unit> function1) {
        this.f72235a = function1;
    }

    @Override // D1.E
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        B1.W z02;
        B1.m0 a02 = u11.a0(j11);
        z02 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new a(a02, this));
        return z02;
    }

    @NotNull
    public final Function1<InterfaceC7825i0, Unit> I1() {
        return this.f72235a;
    }

    public final void J1() {
        AbstractC2810k0 f22 = C2809k.d(this, 2).f2();
        if (f22 != null) {
            f22.M2(this.f72235a, true);
        }
    }

    public final void K1(@NotNull Function1<? super InterfaceC7825i0, Unit> function1) {
        this.f72235a = function1;
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @NotNull
    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f72235a + ')';
    }
}
