package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbcm extends zzbcy {
    public zzbcm(zzbbl zzbblVar, String str, String str2, zzaxf zzaxfVar, int i, int i2) {
        super(zzbblVar, "IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", "0Td4x6cMqS7UG7AA2zcqm+bK2AW+gIwIgEtwqP1CguA=", zzaxfVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbcy
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzbar zzbarVar = new zzbar((String) this.zze.invoke(null, this.zza.zzb(), Boolean.valueOf(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdN)).booleanValue())));
        zzaxf zzaxfVar = this.zzd;
        synchronized (zzaxfVar) {
            zzaxfVar.zzc(zzbarVar.zza);
            zzaxfVar.zzP(zzbarVar.zzb);
        }
    }
}
