package io.appmetrica.analytics.impl;

import android.app.Activity;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0192h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f13863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f13864b;

    public RunnableC0192h1(C0493t1 c0493t1, Activity activity) {
        this.f13864b = c0493t1;
        this.f13863a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0493t1 c0493t1 = this.f13864b;
        Wk wk = c0493t1.f14661h;
        Activity activity = this.f13863a;
        Ia ia2 = c0493t1.d().f14030a;
        if (activity != null) {
            wk.f13118f.a(activity);
        }
        if (wk.f13117e.a(activity, EnumC0392p.RESUMED)) {
            ia2.a(activity);
        }
    }
}
