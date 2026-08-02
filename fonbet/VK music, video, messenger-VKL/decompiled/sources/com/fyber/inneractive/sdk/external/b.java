package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.o;
import com.vk.core.preference.Preference;

/* loaded from: classes12.dex */
public final class b implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        IAConfigManager iAConfigManager = IAConfigManager.N;
        if (Preference.h(o.a, 0, "IAConfigurationPreferences").contains("IAConfigFQE")) {
            return;
        }
        IAConfigManager.f();
        new w(u.FIRST_OPENED, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null).a((String) null);
    }
}
