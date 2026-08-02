package com.vk.network.proxy.data;

import com.vk.core.preference.Preference;
import xsna.lev0;

/* compiled from: VkProxyPreferences.kt */
/* loaded from: classes.dex */
public final class VkProxyPreferences implements lev0 {

    /* compiled from: VkProxyPreferences.kt */
    public static final class StoreNetworkException extends IllegalStateException {
    }

    @Override // xsna.lev0
    public final String a() {
        String s;
        if (!Preference.d("NetworkProxy", "is_last_enabled_proxy", false)) {
            return "";
        }
        s = Preference.s("NetworkProxy", "last_enabled_proxy", new String());
        return s;
    }
}
