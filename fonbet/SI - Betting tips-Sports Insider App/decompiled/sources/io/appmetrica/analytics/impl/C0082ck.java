package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycle;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.ActiveNetworkTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ck, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0082ck implements ServiceContext {

    /* renamed from: a, reason: collision with root package name */
    public final ModuleServiceLifecycleController f13533a;

    /* renamed from: b, reason: collision with root package name */
    public final Sd f13534b = new Sd(getContext());

    /* renamed from: c, reason: collision with root package name */
    public final Zc f13535c = new Zc();

    /* renamed from: d, reason: collision with root package name */
    public final Ck f13536d = new Ck(getContext(), new Bk(new M1()));

    /* renamed from: e, reason: collision with root package name */
    public final C0662zk f13537e = new C0662zk(getContext(), C0353na.k().y(), C0353na.k().B().f(getContext()));

    /* renamed from: f, reason: collision with root package name */
    public final C0626y9 f13538f = new C0626y9();

    /* renamed from: g, reason: collision with root package name */
    public final C0399p6 f13539g = new C0399p6();

    public C0082ck(@NotNull ModuleServiceLifecycleController moduleServiceLifecycleController) {
        this.f13533a = moduleServiceLifecycleController;
    }

    @NotNull
    public final Sd a() {
        return this.f13534b;
    }

    @NotNull
    public final Zc b() {
        return this.f13535c;
    }

    @NotNull
    public final C0662zk c() {
        return this.f13537e;
    }

    @NotNull
    public final Ck d() {
        return this.f13536d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ActivationBarrier getActivationBarrier() {
        return C0353na.I.B.getActivationBarrier();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ActiveNetworkTypeProvider getActiveNetworkTypeProvider() {
        return C0353na.I.G;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ApplicationStateProvider getApplicationStateProvider() {
        return C0353na.I.l().f12221b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ChargeTypeProvider getChargeTypeProvider() {
        R2 r22;
        C0353na c0353na = C0353na.I;
        R2 r23 = c0353na.f14325e;
        if (r23 != null) {
            return r23;
        }
        synchronized (c0353na) {
            try {
                r22 = c0353na.f14325e;
                if (r22 == null) {
                    r22 = new R2(c0353na.f14324d.a(), c0353na.l().f12220a);
                    c0353na.f14325e = r22;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r22;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final Context getContext() {
        return C0353na.I.f14321a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final CryptoProvider getCryptoProvider() {
        return this.f13539g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final DataSendingRestrictionController getDataSendingRestrictionController() {
        return C0353na.I.h();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ExecutorProvider getExecutorProvider() {
        return this.f13538f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final FirstExecutionConditionService getFirstExecutionConditionService() {
        return C0353na.I.B.getFirstExecutionService();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final LocationServiceApi getLocationServiceApi() {
        return C0353na.I.m();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ModuleServiceLifecycleController getModuleServiceLifecycleController() {
        return this.f13533a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceNetworkContext getNetworkContext() {
        return this.f13534b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final PermissionExtractor getPermissionExtractor() {
        return C0353na.I.j();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final PlatformIdentifiers getPlatformIdentifiers() {
        return C0353na.I.s();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final SdkEnvironmentProvider getSdkEnvironmentProvider() {
        return C0353na.I.v();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ModuleSelfReporter getSelfReporter() {
        return this.f13535c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ServiceModuleReporterComponentLifecycle getServiceModuleReporterComponentLifecycle() {
        return C0353na.I.F;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceStorageProvider getServiceStorageProvider() {
        return this.f13537e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceWakeLock getServiceWakeLock() {
        return this.f13536d;
    }
}
