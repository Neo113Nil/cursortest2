package com.vungle.ads.internal;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v1 {
    public final ServiceLocator a(Context context) {
        ServiceLocator serviceLocator;
        ServiceLocator serviceLocator2;
        context.getClass();
        serviceLocator = ServiceLocator.INSTANCE;
        if (serviceLocator != null) {
            return serviceLocator;
        }
        synchronized (this) {
            serviceLocator2 = ServiceLocator.INSTANCE;
            if (serviceLocator2 == null) {
                serviceLocator2 = new ServiceLocator(context, 0);
                ServiceLocator.INSTANCE = serviceLocator2;
            }
        }
        return serviceLocator2;
    }
}
