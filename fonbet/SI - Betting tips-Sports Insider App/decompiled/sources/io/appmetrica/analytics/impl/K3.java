package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class K3 implements H5 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12455a;

    /* renamed from: b, reason: collision with root package name */
    public final K5 f12456b = new K5(new C0222i5());

    /* renamed from: c, reason: collision with root package name */
    public final C0092d4 f12457c = new C0092d4(C0040b4.l().b(getContext()));

    /* renamed from: d, reason: collision with root package name */
    public final C0021ab f12458d = new C0021ab();

    /* renamed from: e, reason: collision with root package name */
    public final C0367o f12459e = C0040b4.l().a();

    /* renamed from: f, reason: collision with root package name */
    public final I3 f12460f = new I3();

    /* renamed from: g, reason: collision with root package name */
    public final Qc f12461g = new Qc();

    /* renamed from: h, reason: collision with root package name */
    public final J3 f12462h = new J3();

    public K3(@NotNull Context context) {
        this.f12455a = context;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ActivityLifecycleRegistry getActivityLifecycleRegistry() {
        return this.f12459e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ModuleClientActivator getClientActivator() {
        return this.f12460f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ModuleClientExecutorProvider getClientExecutorProvider() {
        return this.f12461g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ClientStorageProvider getClientStorageProvider() {
        return this.f12457c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final Context getContext() {
        return this.f12455a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final InternalClientModuleFacade getInternalClientModuleFacade() {
        return this.f12458d;
    }

    @Override // io.appmetrica.analytics.impl.H5, io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final J5 getModuleAdRevenueContext() {
        return this.f12456b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ProcessDetector getProcessDetector() {
        return this.f12462h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.f12456b;
    }
}
