package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ad, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0023ad implements ModuleServiceLifecycleController {

    /* renamed from: a, reason: collision with root package name */
    public final J1 f13354a;

    public C0023ad(@NotNull J1 j12) {
        this.f13354a = j12;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(@NotNull ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.f13354a.b(new jp(0, moduleServiceLifecycleObserver));
        this.f13354a.a(new jp(1, moduleServiceLifecycleObserver));
    }
}
