package com.moloco.sdk.internal.services.config;

import com.moloco.sdk.internal.MolocoLogger;
import defpackage.ljg;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final List c = kotlin.collections.a.c(new com.moloco.sdk.internal.services.config.handlers.a());

    public final Object a(Class cls, Object obj) {
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RemoteConfigService", ljg.l(cls, "Retrieving config: "), false, 4, null);
        Object obj2 = this.a.get(cls.getName());
        return obj2 == null ? obj : obj2;
    }
}
