package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.jd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255jd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0356nd f14032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14034c;

    public C0255jd(C0356nd c0356nd, int i5, String str) {
        this.f14032a = c0356nd;
        this.f14033b = i5;
        this.f14034c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0356nd.a(this.f14032a).a(new F9(this.f14033b, this.f14034c));
    }
}
