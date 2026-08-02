package com.google.android.gms.analytics.ecommerce;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

@VisibleForTesting
/* loaded from: classes9.dex */
public class Promotion {

    @RecentlyNonNull
    public static final String ACTION_CLICK = "click";

    @RecentlyNonNull
    public static final String ACTION_VIEW = "view";
    Map<String, String> zza = new HashMap();

    @RecentlyNonNull
    public Promotion setCreative(@RecentlyNonNull String str) {
        zzb("cr", str);
        return this;
    }

    @RecentlyNonNull
    public Promotion setId(@RecentlyNonNull String str) {
        zzb("id", str);
        return this;
    }

    @RecentlyNonNull
    public Promotion setName(@RecentlyNonNull String str) {
        zzb("nm", str);
        return this;
    }

    @RecentlyNonNull
    public Promotion setPosition(@RecentlyNonNull String str) {
        zzb("ps", str);
        return this;
    }

    @RecentlyNonNull
    public String toString() {
        return zzj.zzb(this.zza);
    }

    @RecentlyNonNull
    public final Map<String, String> zza(@RecentlyNonNull String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : this.zza.entrySet()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(entry.getKey());
            hashMap.put(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), entry.getValue());
        }
        return hashMap;
    }

    final void zzb(String str, String str2) {
        Preconditions.checkNotNull(str, "Name should be non-null");
        this.zza.put(str, str2);
    }
}
