package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Nh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f12653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0183gi f12654b;

    public Nh(C0183gi c0183gi, UserProfile userProfile) {
        this.f12654b = c0183gi;
        this.f12653a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0183gi c0183gi = this.f12654b;
        C0183gi.a(c0183gi.f13834a, c0183gi.f13837d, c0183gi.f13838e).reportUserProfile(this.f12653a);
    }
}
