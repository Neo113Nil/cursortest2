package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.hd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204hd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0356nd f13896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f13897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13898c;

    public C0204hd(C0356nd c0356nd, AdRevenue adRevenue, boolean z5) {
        this.f13896a = c0356nd;
        this.f13897b = adRevenue;
        this.f13898c = z5;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0356nd.a(this.f13896a).reportAdRevenue(this.f13897b, this.f13898c);
    }
}
