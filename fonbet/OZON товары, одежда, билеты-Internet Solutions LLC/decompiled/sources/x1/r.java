package x1;

import D1.C0;
import D1.C2805i;
import D1.H0;
import D1.I0;
import D1.InterfaceC2803h;
import D1.J0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class r extends e.c implements I0, C0, InterfaceC2803h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f104900a = "androidx.compose.ui.input.pointer.PointerHoverIcon";

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private C10627b f104901b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f104902c;

    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function1<r, H0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.I f104903b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.I i11) {
            super(1);
            this.f104903b = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final H0 invoke(r rVar) {
            if (!rVar.f104902c) {
                return H0.ContinueTraversal;
            }
            this.f104903b.f71783a = false;
            return H0.CancelTraversal;
        }
    }

    public r(@NotNull C10627b c10627b) {
        this.f104901b = c10627b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void J1() {
        C10627b c10627b;
        kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        J0.c(this, new C10643s(m11));
        r rVar = (r) m11.f71787a;
        if (rVar == null || (c10627b = rVar.f104901b) == null) {
            c10627b = this.f104901b;
        }
        u uVar = (u) C2805i.a(this, K0.l());
        if (uVar != null) {
            uVar.a(c10627b);
        }
    }

    private final void K1() {
        kotlin.jvm.internal.I i11 = new kotlin.jvm.internal.I();
        i11.f71783a = true;
        J0.d(this, new a(i11));
        if (i11.f71783a) {
            J1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void L1() {
        Unit unit;
        u uVar;
        if (this.f104902c) {
            this.f104902c = false;
            if (isAttached()) {
                kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
                J0.c(this, new C10642q(m11));
                r rVar = (r) m11.f71787a;
                if (rVar != null) {
                    rVar.J1();
                    unit = Unit.f71690a;
                } else {
                    unit = null;
                }
                if (unit != null || (uVar = (u) C2805i.a(this, K0.l())) == null) {
                    return;
                }
                uVar.a(null);
            }
        }
    }

    @Override // D1.I0
    public final Object K0() {
        return this.f104900a;
    }

    public final void M1(@NotNull C10627b c10627b) {
        if (Intrinsics.d(this.f104901b, c10627b)) {
            return;
        }
        this.f104901b = c10627b;
        if (this.f104902c) {
            K1();
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        L1();
        super.onDetach();
    }

    @Override // D1.C0
    public final void p1(@NotNull C10638m c10638m, @NotNull EnumC10640o enumC10640o, long j11) {
        if (enumC10640o == EnumC10640o.Main) {
            if (c10638m.e() == 4) {
                this.f104902c = true;
                K1();
            } else if (c10638m.e() == 5) {
                L1();
            }
        }
    }

    @Override // D1.C0
    public final void r0() {
        L1();
    }
}
