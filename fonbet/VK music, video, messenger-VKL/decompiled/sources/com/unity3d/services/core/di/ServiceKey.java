package com.unity3d.services.core.di;

import xsna.dcy;
import xsna.epx;
import xsna.zcl;

/* compiled from: ServiceKey.kt */
/* loaded from: classes14.dex */
public final class ServiceKey {
    private final dcy<?> instanceClass;
    private final String named;

    public ServiceKey(String str, dcy<?> dcyVar) {
        this.named = str;
        this.instanceClass = dcyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServiceKey copy$default(ServiceKey serviceKey, String str, dcy dcyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceKey.named;
        }
        if ((i & 2) != 0) {
            dcyVar = serviceKey.instanceClass;
        }
        return serviceKey.copy(str, dcyVar);
    }

    public final String component1() {
        return this.named;
    }

    public final dcy<?> component2() {
        return this.instanceClass;
    }

    public final ServiceKey copy(String str, dcy<?> dcyVar) {
        return new ServiceKey(str, dcyVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceKey)) {
            return false;
        }
        ServiceKey serviceKey = (ServiceKey) obj;
        return epx.f(this.named, serviceKey.named) && epx.f(this.instanceClass, serviceKey.instanceClass);
    }

    public final dcy<?> getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return this.instanceClass.hashCode() + (this.named.hashCode() * 31);
    }

    public String toString() {
        return "ServiceKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ ServiceKey(String str, dcy dcyVar, int i, zcl zclVar) {
        this((i & 1) != 0 ? "" : str, dcyVar);
    }
}
