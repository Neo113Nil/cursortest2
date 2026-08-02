package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.k;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b extends a {
    public b(k kVar, String str) {
        super(str, kVar, null);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(k kVar, String str) {
        kVar.getClass();
        String str2 = str + "_global_timeout";
        int i = k.d(str) ? 30000 : 10000;
        Integer a = kVar.a(str2);
        return a != null ? a.intValue() : i;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b(k kVar, String str) {
        kVar.getClass();
        String a = k.a(str, "min", "rat");
        "read".equalsIgnoreCase(str);
        Integer a2 = kVar.a(a);
        if (a2 != null) {
            return a2.intValue();
        }
        return 5000;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c(k kVar, String str) {
        kVar.getClass();
        String a = k.a(str, "rat_perc");
        int i = "read".equalsIgnoreCase(str) ? 15 : 10;
        Integer a2 = kVar.a(a);
        return a2 != null ? a2.intValue() : i;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(k kVar) {
        kVar.getClass();
        Integer a = kVar.a(k.a("timeout", "threshold"));
        if (a != null) {
            return a.intValue();
        }
        return 300;
    }
}
