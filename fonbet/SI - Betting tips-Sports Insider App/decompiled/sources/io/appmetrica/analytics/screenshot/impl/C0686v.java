package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.screenshot.impl.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686v implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f15395a;

    /* renamed from: b, reason: collision with root package name */
    public final U f15396b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0676k f15397c;

    /* renamed from: d, reason: collision with root package name */
    public final Z f15398d;

    public C0686v(@NotNull ClientContext clientContext, @NotNull U u10) {
        this.f15395a = clientContext;
        this.f15396b = u10;
        this.f15398d = new Z(clientContext, new C0683s(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(@Nullable C0678m c0678m) {
        this.f15397c = c0678m != null ? c0678m.f15384c : null;
        this.f15398d.f15345c = this.f15397c;
    }

    @NotNull
    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f15395a.getActivityLifecycleRegistry().registerListener(new C0685u(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
