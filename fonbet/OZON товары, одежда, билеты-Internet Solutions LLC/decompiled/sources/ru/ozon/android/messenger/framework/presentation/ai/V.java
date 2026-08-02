package ru.ozon.android.messenger.framework.presentation.ai;

import S0.InterfaceC3978p0;
import androidx.core.view.C5342t;

/* loaded from: classes10.dex */
public final class V implements S0.M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.J f89394a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5342t f89395b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f89396c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f89397d;

    public V(androidx.lifecycle.J j11, C5342t c5342t, InterfaceC3978p0 interfaceC3978p0, InterfaceC3978p0 interfaceC3978p02) {
        this.f89394a = j11;
        this.f89395b = c5342t;
        this.f89396c = interfaceC3978p0;
        this.f89397d = interfaceC3978p02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // S0.M
    public final void dispose() {
        int i11 = U.f89357b;
        U.f((v0.I) this.f89396c.getValue(), (ru.ozon.android.messenger.framework.core.d) this.f89397d.getValue());
        this.f89394a.getLifecycle().e(this.f89395b);
    }
}
