package e;

import S0.InterfaceC3978p0;
import androidx.activity.C;
import androidx.activity.C5035b;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.M;

/* renamed from: e.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6242q extends C {

    /* renamed from: a, reason: collision with root package name */
    private C6237l f61722a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M f61723b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f61724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6242q(boolean z11, M m11, InterfaceC3978p0 interfaceC3978p0) {
        super(z11);
        this.f61723b = m11;
        this.f61724c = interfaceC3978p0;
    }

    @Override // androidx.activity.C
    public final void handleOnBackCancelled() {
        super.handleOnBackCancelled();
        C6237l c6237l = this.f61722a;
        if (c6237l != null) {
            c6237l.a();
        }
        C6237l c6237l2 = this.f61722a;
        if (c6237l2 == null) {
            return;
        }
        c6237l2.f();
    }

    @Override // androidx.activity.C
    public final void handleOnBackPressed() {
        C6237l c6237l = this.f61722a;
        if (c6237l != null && !c6237l.d()) {
            c6237l.a();
            this.f61722a = null;
        }
        if (this.f61722a == null) {
            this.f61722a = new C6237l(this.f61723b, false, (Function2) this.f61724c.getValue());
        }
        C6237l c6237l2 = this.f61722a;
        if (c6237l2 != null) {
            c6237l2.b();
        }
        C6237l c6237l3 = this.f61722a;
        if (c6237l3 == null) {
            return;
        }
        c6237l3.f();
    }

    @Override // androidx.activity.C
    public final void handleOnBackProgressed(@NotNull C5035b c5035b) {
        super.handleOnBackProgressed(c5035b);
        C6237l c6237l = this.f61722a;
        if (c6237l != null) {
            c6237l.e(c5035b);
        }
    }

    @Override // androidx.activity.C
    public final void handleOnBackStarted(@NotNull C5035b c5035b) {
        super.handleOnBackStarted(c5035b);
        C6237l c6237l = this.f61722a;
        if (c6237l != null) {
            c6237l.a();
        }
        this.f61722a = new C6237l(this.f61723b, true, (Function2) this.f61724c.getValue());
    }
}
