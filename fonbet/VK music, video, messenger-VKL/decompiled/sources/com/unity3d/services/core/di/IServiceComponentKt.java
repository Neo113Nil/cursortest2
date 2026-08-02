package com.unity3d.services.core.di;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.epx;

/* compiled from: IServiceComponent.kt */
/* loaded from: classes14.dex */
public final class IServiceComponentKt {
    public static final <T> T get(IServiceComponent iServiceComponent, String str) {
        iServiceComponent.getServiceProvider().getRegistry();
        epx.k();
        throw null;
    }

    public static Object get$default(IServiceComponent iServiceComponent, String str, int i, Object obj) {
        iServiceComponent.getServiceProvider().getRegistry();
        epx.k();
        throw null;
    }

    public static final <T> Lazy<T> inject(IServiceComponent iServiceComponent, String str, LazyThreadSafetyMode lazyThreadSafetyMode) {
        epx.k();
        throw null;
    }

    public static Lazy inject$default(IServiceComponent iServiceComponent, String str, LazyThreadSafetyMode lazyThreadSafetyMode, int i, Object obj) {
        if ((i & 2) != 0) {
            LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        epx.k();
        throw null;
    }
}
