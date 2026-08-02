package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.util.o;
import com.vk.core.preference.Preference;

/* loaded from: classes12.dex */
public final class c implements a {
    public final String a;

    public c(String str) {
        this.a = str;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        return str;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return "IALastModifiedFromHeader.endcard";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return String.valueOf(("fmp.endcard_" + this.a).hashCode());
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(Object obj) {
        String str = (String) obj;
        if (str != null) {
            Preference.h(o.a, 0, "IAConfigurationPreferences").edit().putString("fmp.endcard.data", str).apply();
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        return this.a;
    }
}
