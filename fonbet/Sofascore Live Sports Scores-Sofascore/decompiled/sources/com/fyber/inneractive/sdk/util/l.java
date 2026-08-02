package com.fyber.inneractive.sdk.util;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l implements Runnable {
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.a a;

    public l(com.fyber.inneractive.sdk.cache.a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.cache.a aVar;
        try {
            if (o.a == null || (aVar = this.a) == null) {
                return;
            }
            o.a.getSharedPreferences("IAConfigurationPreferences", 0).edit().remove(aVar.b()).apply();
        } catch (Throwable unused) {
        }
    }
}
