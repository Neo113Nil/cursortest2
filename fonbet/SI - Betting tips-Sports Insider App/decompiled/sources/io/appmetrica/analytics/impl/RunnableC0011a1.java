package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0011a1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkListener f13325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f13326b;

    public RunnableC0011a1(C0493t1 c0493t1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f13326b = c0493t1;
        this.f13325a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13326b.f14654a.getClass();
        C0617y0 c0617y0 = C0617y0.f14936e;
        c0617y0.f().a(this.f13325a);
    }
}
