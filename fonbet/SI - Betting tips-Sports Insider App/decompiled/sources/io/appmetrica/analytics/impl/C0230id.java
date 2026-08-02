package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.id, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230id extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0356nd f13942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f13943b;

    public C0230id(C0356nd c0356nd, ModuleEvent moduleEvent) {
        this.f13942a = c0356nd;
        this.f13943b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0356nd.a(this.f13942a).reportEvent(this.f13943b);
    }
}
