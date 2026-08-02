package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0592x0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0617y0 f14884a;

    public RunnableC0592x0(C0617y0 c0617y0) {
        this.f14884a = c0617y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0040b4.l().f13374c.a().executeDelayed(new RunnableC0543v1(this.f14884a.f14939a), TimeUnit.SECONDS.toMillis(5L));
    }
}
