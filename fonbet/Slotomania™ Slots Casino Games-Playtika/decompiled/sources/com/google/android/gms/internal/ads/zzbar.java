package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbar extends zzaza {
    public long zza;
    public long zzb;

    public zzbar() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    public zzbar(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap zzb = zzb(str);
        if (zzb != null) {
            this.zza = ((Long) zzb.get(0)).longValue();
            this.zzb = ((Long) zzb.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaza
    protected final HashMap zza() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.zza));
        hashMap.put(1, Long.valueOf(this.zzb));
        return hashMap;
    }
}
