package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ke implements InterfaceC0529uc, ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0451r9 f12474a;

    /* renamed from: b, reason: collision with root package name */
    public final C0504tc f12475b;

    /* renamed from: c, reason: collision with root package name */
    public final C0504tc f12476c;

    public Ke(@NotNull InterfaceC0451r9 interfaceC0451r9, @NotNull Qg qg2, @NotNull C0372o4 c0372o4, @NotNull We we2) {
        this.f12474a = interfaceC0451r9;
        C0504tc c0504tc = new C0504tc(qg2, c0372o4, we2);
        this.f12475b = c0504tc;
        this.f12476c = c0504tc;
        if (c0504tc.b()) {
            return;
        }
        C0353na.k().a().subscribe(TimeUnit.SECONDS.toMillis(I7.f12373a.longValue()), C0353na.k().w().d(), this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0529uc
    @NotNull
    public final F8 a() {
        return this.f12476c;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f12475b.a();
        ((C0273k5) this.f12474a.a()).e();
    }
}
