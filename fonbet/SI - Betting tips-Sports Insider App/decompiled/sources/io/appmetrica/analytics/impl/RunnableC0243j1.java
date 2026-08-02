package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0243j1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnrListener f13993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f13994b;

    public RunnableC0243j1(C0493t1 c0493t1, AnrListener anrListener) {
        this.f13994b = c0493t1;
        this.f13993a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0493t1.a(this.f13994b).a(this.f13993a);
    }
}
