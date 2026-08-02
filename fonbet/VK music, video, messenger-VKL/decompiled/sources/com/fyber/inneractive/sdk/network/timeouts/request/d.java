package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.k;
import ru.ok.tracer.base.ucum.UcumUtils;

/* loaded from: classes12.dex */
public final class d extends a {
    public d(String str, k kVar, String str2) {
        super(str, kVar, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(k kVar, String str) {
        return kVar.c(str, this.l);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b(k kVar, String str) {
        String str2 = this.l;
        kVar.getClass();
        String a = k.a(str, UcumUtils.UCUM_MINUTES, "rat", k.e(str2));
        "read".equalsIgnoreCase(str);
        Integer a2 = kVar.a(k.a(str, UcumUtils.UCUM_MINUTES, "rat", "all_mediators"));
        int intValue = a2 != null ? a2.intValue() : 5000;
        Integer a3 = kVar.a(a);
        return a3 != null ? a3.intValue() : intValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c(k kVar, String str) {
        String str2 = this.l;
        kVar.getClass();
        String a = k.a(str, "rat", "perc", k.e(str2));
        String a2 = k.a(str, "rat", "perc", "all_mediators");
        int i = "read".equalsIgnoreCase(str) ? 15 : 10;
        Integer a3 = kVar.a(a2);
        if (a3 != null) {
            i = a3.intValue();
        }
        Integer a4 = kVar.a(a);
        return a4 != null ? a4.intValue() : i;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(k kVar) {
        String str = this.l;
        kVar.getClass();
        String a = k.a("timeout", "threshold", k.e(str));
        Integer a2 = kVar.a(k.a("timeout", "threshold", "all_mediators"));
        int intValue = a2 != null ? a2.intValue() : 300;
        Integer a3 = kVar.a(a);
        return a3 != null ? a3.intValue() : intValue;
    }
}
