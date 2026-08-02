package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkParametersListener f13252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f13253b;

    public Z0(C0493t1 c0493t1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f13253b = c0493t1;
        this.f13252a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13253b.f14654a.getClass();
        C0617y0 c0617y0 = C0617y0.f14936e;
        c0617y0.f().a(this.f13252a);
    }
}
