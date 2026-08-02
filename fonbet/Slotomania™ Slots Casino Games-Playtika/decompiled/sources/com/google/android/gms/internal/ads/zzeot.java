package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzeot {
    private final zzflf zza;
    private final zzdwn zzb;
    private final zzdyz zzc;

    public zzeot(zzflf zzflfVar, zzdwn zzdwnVar, zzdyz zzdyzVar) {
        this.zza = zzflfVar;
        this.zzb = zzdwnVar;
        this.zzc = zzdyzVar;
    }

    public final void zza(zzfjw zzfjwVar, zzfjt zzfjtVar, int i, @Nullable zzelk zzelkVar, long j) {
        zzdwm zzdwmVar;
        zzdyy zza = this.zzc.zza();
        zza.zza(zzfjwVar);
        zza.zzb(zzfjtVar);
        zza.zzc("action", "adapter_status");
        zza.zzc("adapter_l", String.valueOf(j));
        zza.zzc("sc", Integer.toString(i));
        if (zzelkVar != null) {
            zza.zzc("arec", Integer.toString(zzelkVar.zzb().zza));
            String zza2 = this.zza.zza(zzelkVar.getMessage());
            if (zza2 != null) {
                zza.zzc("areec", zza2);
            }
        }
        zzdwn zzdwnVar = this.zzb;
        Iterator it = zzfjtVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdwmVar = null;
                break;
            } else {
                zzdwmVar = zzdwnVar.zzc((String) it.next());
                if (zzdwmVar != null) {
                    break;
                }
            }
        }
        if (zzdwmVar != null) {
            zza.zzc("ancn", zzdwmVar.zza);
            zzbxe zzbxeVar = zzdwmVar.zzb;
            if (zzbxeVar != null) {
                zza.zzc("adapter_v", zzbxeVar.toString());
            }
            zzbxe zzbxeVar2 = zzdwmVar.zzc;
            if (zzbxeVar2 != null) {
                zza.zzc("adapter_sv", zzbxeVar2.toString());
            }
        }
        zza.zzd();
    }
}
