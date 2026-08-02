package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0269k1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExternalAttribution f14086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f14087b;

    public RunnableC0269k1(C0493t1 c0493t1, ExternalAttribution externalAttribution) {
        this.f14087b = c0493t1;
        this.f14086a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0493t1.a(this.f14087b).a(this.f14086a);
    }
}
