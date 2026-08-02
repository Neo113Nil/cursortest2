package com.facebook.ads.internal.dynamicloading;

import defpackage.r02;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b {
    public Method a;
    public final r02 b = new r02(this, 1);

    public final Object a(Class cls) {
        return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.b));
    }
}
