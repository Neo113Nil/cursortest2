package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbbp extends zzaza {
    public Long zza;
    public Long zzb;
    public Long zzc;
    public Long zzd;
    public Long zze;

    public zzbbp() {
    }

    public zzbbp(String str) {
        HashMap zzb = zzb(str);
        if (zzb != null) {
            this.zza = (Long) zzb.get(0);
            this.zzb = (Long) zzb.get(1);
            this.zzc = (Long) zzb.get(2);
            this.zzd = (Long) zzb.get(3);
            this.zze = (Long) zzb.get(4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaza
    protected final HashMap zza() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        hashMap.put(3, this.zzd);
        hashMap.put(4, this.zze);
        return hashMap;
    }
}
