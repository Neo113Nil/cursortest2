package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.vj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0561vj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f14801a;

    public C0561vj(UserProfile userProfile) {
        this.f14801a = userProfile;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra2) {
        ra2.reportUserProfile(this.f14801a);
    }
}
