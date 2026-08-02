package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f11866a;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f11868c;

    /* renamed from: d, reason: collision with root package name */
    public final n f11869d;

    /* renamed from: e, reason: collision with root package name */
    public volatile IdSyncConfig f11870e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f11871f;

    /* renamed from: b, reason: collision with root package name */
    public final long f11867b = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: g, reason: collision with root package name */
    public final C0007f f11872g = new C0007f(this);

    public h(ServiceContext serviceContext, SdkIdentifiers sdkIdentifiers) {
        this.f11866a = serviceContext;
        this.f11868c = serviceContext.getExecutorProvider().getModuleExecutor();
        this.f11869d = new n(serviceContext, new G(serviceContext.getServiceStorageProvider().modulePreferences("id-sync")), sdkIdentifiers);
    }

    public final synchronized void a(IdSyncConfig idSyncConfig, SdkIdentifiers sdkIdentifiers) {
        try {
            this.f11869d.f11897c = sdkIdentifiers;
            if (!Intrinsics.areEqual(this.f11870e, idSyncConfig)) {
                this.f11870e = idSyncConfig;
                if (a(idSyncConfig) && !this.f11871f) {
                    this.f11866a.getActivationBarrier().subscribe(idSyncConfig.getLaunchDelay(), this.f11868c, new C0008g(this));
                    this.f11871f = true;
                } else if (!a(idSyncConfig) && this.f11871f) {
                    this.f11871f = false;
                    IHandlerExecutor iHandlerExecutor = this.f11868c;
                    C0007f c0007f = this.f11872g;
                    if (c0007f == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("syncRunnable");
                        c0007f = null;
                    }
                    iHandlerExecutor.remove(c0007f);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean a(IdSyncConfig idSyncConfig) {
        idSyncConfig.getEnabled();
        return idSyncConfig.getEnabled() && !idSyncConfig.getRequests().isEmpty();
    }
}
