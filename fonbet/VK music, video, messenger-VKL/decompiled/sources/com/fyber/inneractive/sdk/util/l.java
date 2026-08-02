package com.fyber.inneractive.sdk.util;

import com.vk.core.preference.Preference;

/* loaded from: classes12.dex */
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
            Preference.h(o.a, 0, "IAConfigurationPreferences").edit().remove(aVar.b()).apply();
        } catch (Throwable unused) {
        }
    }
}
