package io.appmetrica.analytics.screenshot.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f15359a;

    /* renamed from: b, reason: collision with root package name */
    public final U f15360b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f15361c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f15362d;

    /* renamed from: e, reason: collision with root package name */
    public volatile C0679n f15363e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f15364f = new d0(this);

    public g0(@NotNull ClientContext clientContext, @NotNull U u10) {
        this.f15359a = clientContext;
        this.f15360b = u10;
        this.f15361c = clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(@Nullable C0678m c0678m) {
        this.f15363e = c0678m != null ? c0678m.f15383b : null;
    }

    @NotNull
    public final String b() {
        return "ServiceScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f15359a.getActivityLifecycleRegistry().registerListener(new f0(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
