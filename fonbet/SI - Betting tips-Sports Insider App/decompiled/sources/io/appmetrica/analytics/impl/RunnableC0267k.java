package io.appmetrica.analytics.impl;

import android.app.Activity;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0267k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f14083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0317m f14084b;

    public RunnableC0267k(C0317m c0317m, Activity activity) {
        this.f14084b = c0317m;
        this.f14083a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14084b.a(this.f14083a);
    }
}
