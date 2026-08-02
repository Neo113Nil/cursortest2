package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class U0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f12953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f12954b;

    public U0(C0493t1 c0493t1, UserProfile userProfile) {
        this.f12954b = c0493t1;
        this.f12953a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0493t1.a(this.f12954b).reportUserProfile(this.f12953a);
    }
}
