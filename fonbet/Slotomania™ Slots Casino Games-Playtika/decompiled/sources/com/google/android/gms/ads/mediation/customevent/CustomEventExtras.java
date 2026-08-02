package com.google.android.gms.ads.mediation.customevent;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
@Deprecated
/* loaded from: classes8.dex */
public final class CustomEventExtras {
    private final HashMap zza = new HashMap();

    public Object getExtra(String str) {
        return this.zza.get(str);
    }

    public void setExtra(String str, Object obj) {
        this.zza.put(str, obj);
    }
}
