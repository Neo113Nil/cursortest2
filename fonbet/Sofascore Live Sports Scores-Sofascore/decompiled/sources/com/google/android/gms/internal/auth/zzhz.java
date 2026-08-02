package com.google.android.gms.internal.auth;

import android.util.Base64;
import defpackage.a70;
import defpackage.swn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhz implements zzhx {
    static {
        zzcz zzczVar = new zzcz(new zzcz(zzcr.a(), false, false).a().a, true, true);
        Double valueOf = Double.valueOf(0.0d);
        new swn(zzczVar, valueOf);
        zzczVar.c(true);
        zzczVar.b(20L);
        zzczVar.b(0L);
        try {
            zzhs i = zzhs.i(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3));
            int i2 = zzhy.a;
            new swn(zzczVar, i);
            zzczVar.c(true);
            zzczVar.b(20L);
            zzczVar.b(20L);
            zzczVar.c(false);
            zzczVar.c(false);
            zzczVar.b(120L);
            zzczVar.c(true);
            new swn(zzczVar, valueOf);
        } catch (Exception e) {
            a70.j(e);
        }
    }
}
