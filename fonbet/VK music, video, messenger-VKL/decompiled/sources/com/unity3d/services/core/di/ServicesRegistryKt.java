package com.unity3d.services.core.di;

import xsna.izs;
import xsna.s3q0;

/* compiled from: ServicesRegistry.kt */
/* loaded from: classes14.dex */
public final class ServicesRegistryKt {
    public static final ServicesRegistry registry(izs<? super ServicesRegistry, s3q0> izsVar) {
        ServicesRegistry servicesRegistry = new ServicesRegistry();
        izsVar.invoke(servicesRegistry);
        return servicesRegistry;
    }
}
