package io.appmetrica.analytics.impl;

import android.content.Intent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class M0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f12556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f12557b;

    public M0(C0493t1 c0493t1, Intent intent) {
        this.f12557b = c0493t1;
        this.f12556a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0624y7 c0624y7 = this.f12557b.d().f14031b;
        Intent intent = this.f12556a;
        c0624y7.getClass();
        if (intent != null) {
            c0624y7.a(intent.getDataString(), false);
        }
    }
}
