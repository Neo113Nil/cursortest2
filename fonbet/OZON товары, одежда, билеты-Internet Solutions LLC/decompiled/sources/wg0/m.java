package wg0;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.o;
import androidx.lifecycle.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wg0.InterfaceC10555b;
import wg0.InterfaceC10556c;
import wg0.g;
import xe.C10720e0;
import xe.C10727i;
import xe.I;
import xe.J;
import yg0.C10900c;

/* loaded from: classes3.dex */
public final class m extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10900c f104553a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final I f104554b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C0 f104555c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final B0<InterfaceC10556c> f104556d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final x0<g> f104557e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final M0<g> f104558f;

    public m(C10900c sendTestSentryEventUseCase, Bb0.a aVar) {
        g value;
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b dispatcher = He.b.f10879b;
        Intrinsics.checkNotNullParameter(sendTestSentryEventUseCase, "sendTestSentryEventUseCase");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f104553a = sendTestSentryEventUseCase;
        this.f104554b = dispatcher;
        C0 b11 = E0.b(0, 0, null, 7);
        this.f104555c = b11;
        this.f104556d = C2399j.a(b11);
        x0<g> a11 = O0.a(new g(false, 7));
        this.f104557e = a11;
        this.f104558f = C2399j.b(a11);
        if (aVar != null) {
            boolean a12 = aVar.a().a().a();
            do {
                value = a11.getValue();
            } while (!a11.b(value, g.a(value, null, null, a12, 3)));
        }
    }

    @NotNull
    public final B0<InterfaceC10556c> g0() {
        return this.f104556d;
    }

    @NotNull
    public final M0<g> getUiState() {
        return this.f104558f;
    }

    public final void h0(@NotNull InterfaceC10555b action) {
        g value;
        g value2;
        g value3;
        g value4;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof InterfaceC10555b.a) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new h(this, InterfaceC10556c.a.f104515a, null), 3);
            return;
        }
        boolean z11 = action instanceof InterfaceC10555b.C2261b;
        x0<g> x0Var = this.f104557e;
        if (z11) {
            do {
                value4 = x0Var.getValue();
            } while (!x0Var.b(value4, g.a(value4, ((InterfaceC10555b.C2261b) action).a(), null, false, 6)));
            return;
        }
        boolean z12 = action instanceof InterfaceC10555b.d;
        I i11 = this.f104554b;
        if (z12) {
            C10727i.c(androidx.lifecycle.x0.a(this), i11.plus(new i(J.f105405n0)), null, new j(this, null), 2);
            return;
        }
        if (action instanceof InterfaceC10555b.e) {
            C10727i.c(androidx.lifecycle.x0.a(this), i11.plus(new k(J.f105405n0)), null, new l(this, null), 2);
            return;
        }
        if (action instanceof InterfaceC10555b.c) {
            do {
                value3 = x0Var.getValue();
            } while (!x0Var.b(value3, g.a(value3, null, null, false, 5)));
        } else {
            if (!(action instanceof InterfaceC10555b.f)) {
                throw new o();
            }
            if (x0Var.getValue().d()) {
                do {
                    value2 = x0Var.getValue();
                } while (!x0Var.b(value2, g.a(value2, null, g.a.C2263a.f104538c, false, 5)));
            } else {
                do {
                    value = x0Var.getValue();
                } while (!x0Var.b(value, g.a(value, null, g.a.C2264g.f104544c, false, 5)));
            }
        }
    }
}
