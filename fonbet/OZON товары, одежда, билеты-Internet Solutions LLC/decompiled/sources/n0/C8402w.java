package n0;

import D1.AbstractC2810k0;
import D1.AbstractC2813m;
import D1.C2809k;
import D1.E0;
import D1.InterfaceC2821v;
import I1.C3222a;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

/* renamed from: n0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8402w extends AbstractC2813m implements j1.e, E0, InterfaceC2821v, j1.t {

    /* renamed from: c, reason: collision with root package name */
    private j1.w f76240c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C8401v f76241d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C8405z f76242e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C8360A f76243f;

    /* renamed from: n0.w$a */
    static final class a extends AbstractC7737t implements Function0<Boolean> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(j1.u.b(C8402w.this));
        }
    }

    public C8402w(t0.q qVar) {
        C8401v c8401v = new C8401v(qVar);
        I1(c8401v);
        this.f76241d = c8401v;
        C8405z c8405z = new C8405z();
        I1(c8405z);
        this.f76242e = c8405z;
        C8360A c8360a = new C8360A();
        I1(c8360a);
        this.f76243f = c8360a;
        I1(new FocusTargetNode());
    }

    @Override // j1.e
    public final void L(@NotNull j1.w wVar) {
        if (Intrinsics.d(this.f76240c, wVar)) {
            return;
        }
        boolean a11 = wVar.a();
        if (a11) {
            C10727i.c(getCoroutineScope(), null, null, new C8403x(this, null), 3);
        }
        if (isAttached()) {
            C2809k.f(this).x0();
        }
        this.f76241d.J1(a11);
        this.f76243f.J1(a11);
        this.f76242e.I1(a11);
        this.f76240c = wVar;
    }

    public final void N1(t0.q qVar) {
        this.f76241d.K1(qVar);
    }

    @Override // D1.E0
    public final void applySemantics(@NotNull I1.D d11) {
        j1.w wVar = this.f76240c;
        boolean z11 = false;
        if (wVar != null && wVar.a()) {
            z11 = true;
        }
        I1.z.l(d11, z11);
        d11.b(I1.k.s(), new C3222a(null, new a()));
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // D1.InterfaceC2821v
    public final void s(@NotNull AbstractC2810k0 abstractC2810k0) {
        this.f76243f.s(abstractC2810k0);
    }
}
