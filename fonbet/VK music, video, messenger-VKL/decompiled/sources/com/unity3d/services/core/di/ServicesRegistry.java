package com.unity3d.services.core.di;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import xsna.dcy;
import xsna.epx;
import xsna.gzs;

/* compiled from: ServicesRegistry.kt */
/* loaded from: classes14.dex */
public final class ServicesRegistry implements IServicesRegistry {
    private final ConcurrentHashMap<ServiceKey, Lazy<?>> _services = new ConcurrentHashMap<>();

    public static ServiceKey factory$default(ServicesRegistry servicesRegistry, String str, gzs gzsVar, int i, Object obj) {
        epx.k();
        throw null;
    }

    public static Object get$default(ServicesRegistry servicesRegistry, String str, int i, Object obj) {
        epx.k();
        throw null;
    }

    public static Object getOrNull$default(ServicesRegistry servicesRegistry, String str, int i, Object obj) {
        epx.k();
        throw null;
    }

    public static ServiceKey single$default(ServicesRegistry servicesRegistry, String str, gzs gzsVar, int i, Object obj) {
        epx.k();
        throw null;
    }

    public final <T> ServiceKey factory(String str, gzs<? extends T> gzsVar) {
        epx.k();
        throw null;
    }

    public final <T> T get(String str) {
        epx.k();
        throw null;
    }

    public final <T> T getOrNull(String str) {
        epx.k();
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T getService(String str, dcy<?> dcyVar) {
        return (T) resolveService(new ServiceKey(str, dcyVar));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public Map<ServiceKey, Lazy<?>> getServices() {
        return this._services;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveService(ServiceKey serviceKey) {
        Lazy<?> lazy = getServices().get(serviceKey);
        if (lazy != null) {
            return (T) lazy.getValue();
        }
        throw new IllegalStateException("No service instance found for " + serviceKey);
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveServiceOrNull(ServiceKey serviceKey) {
        Lazy<?> lazy = getServices().get(serviceKey);
        if (lazy == null) {
            return null;
        }
        return (T) lazy.getValue();
    }

    public final <T> ServiceKey single(String str, gzs<? extends T> gzsVar) {
        epx.k();
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> void updateService(ServiceKey serviceKey, Lazy<? extends T> lazy) {
        if (!getServices().containsKey(serviceKey)) {
            this._services.put(serviceKey, lazy);
        } else {
            throw new IllegalStateException(("Cannot have multiple identical services: " + serviceKey).toString());
        }
    }
}
