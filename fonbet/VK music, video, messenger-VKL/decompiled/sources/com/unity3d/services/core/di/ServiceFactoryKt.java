package com.unity3d.services.core.di;

import kotlin.Lazy;
import xsna.gzs;

/* compiled from: ServiceFactory.kt */
/* loaded from: classes14.dex */
public final class ServiceFactoryKt {
    public static final <T> Lazy<T> factoryOf(gzs<? extends T> gzsVar) {
        return new Factory(gzsVar);
    }
}
