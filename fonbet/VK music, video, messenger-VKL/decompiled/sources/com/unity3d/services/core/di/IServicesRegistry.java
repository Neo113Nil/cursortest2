package com.unity3d.services.core.di;

import java.util.Map;
import kotlin.Lazy;
import xsna.dcy;

/* compiled from: IServicesRegistry.kt */
/* loaded from: classes14.dex */
public interface IServicesRegistry {

    /* compiled from: IServicesRegistry.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getService$default(IServicesRegistry iServicesRegistry, String str, dcy dcyVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getService");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            return iServicesRegistry.getService(str, dcyVar);
        }
    }

    <T> T getService(String str, dcy<?> dcyVar);

    Map<ServiceKey, Lazy<?>> getServices();

    <T> T resolveService(ServiceKey serviceKey);

    <T> T resolveServiceOrNull(ServiceKey serviceKey);

    <T> void updateService(ServiceKey serviceKey, Lazy<? extends T> lazy);
}
