package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.kd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281kd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0356nd f14122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14123b;

    public C0281kd(C0356nd c0356nd, boolean z5) {
        this.f14122a = c0356nd;
        this.f14123b = z5;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0356nd.a(this.f14122a).a(this.f14123b, false);
    }
}
