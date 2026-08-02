package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbbg extends zzaza {
    public Long zza;
    public Long zzb;

    public zzbbg() {
    }

    public zzbbg(String str) {
        HashMap zzb = zzb(str);
        if (zzb != null) {
            this.zza = (Long) zzb.get(0);
            this.zzb = (Long) zzb.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaza
    protected final HashMap zza() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        return hashMap;
    }
}
