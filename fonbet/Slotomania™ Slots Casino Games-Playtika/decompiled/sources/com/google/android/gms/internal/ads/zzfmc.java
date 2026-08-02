package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbhj;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzfmc implements zzfmb {
    private final ConcurrentHashMap zza;
    private final zzfmi zzb;
    private final zzfme zzc = new zzfme();

    public zzfmc(zzfmi zzfmiVar) {
        this.zza = new ConcurrentHashMap(zzfmiVar.zzd);
        this.zzb = zzfmiVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfmi> creator = zzfmi.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhn)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            zzfmi zzfmiVar = this.zzb;
            sb.append(zzfmiVar.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzg());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfml) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfma) entry.getValue()).zzc(); i2++) {
                    sb.append("[O]");
                }
                for (int zzc = ((zzfma) entry.getValue()).zzc(); zzc < zzfmiVar.zzd; zzc++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfma) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < zzfmiVar.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            String sb2 = sb.toString();
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmb
    public final synchronized zzfmk zza(zzfml zzfmlVar) {
        zzfmk zzfmkVar;
        zzfma zzfmaVar = (zzfma) this.zza.get(zzfmlVar);
        if (zzfmaVar != null) {
            zzfmkVar = zzfmaVar.zzb();
            if (zzfmkVar == null) {
                this.zzc.zzb();
            }
            zzfmy zzh = zzfmaVar.zzh();
            if (zzfmkVar != null) {
                zzbhj.zzb.zzc zzs = zzbhj.zzb.zzs();
                zzbhj.zzb.zza.C0129zza zzs2 = zzbhj.zzb.zza.zzs();
                zzs2.zzc(zzbhj.zzb.zzd.IN_MEMORY);
                zzbhj.zzb.zze.zza zzq = zzbhj.zzb.zze.zzq();
                zzq.zzc(zzh.zza);
                zzq.zzg(zzh.zzb);
                zzs2.zzh(zzq);
                zzs.zzh(zzs2);
                zzfmkVar.zza.zza().zzd().zzj(zzs.zzbu());
            }
            zzf();
        } else {
            this.zzc.zza();
            zzf();
            zzfmkVar = null;
        }
        return zzfmkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmb
    public final synchronized boolean zzb(zzfml zzfmlVar, zzfmk zzfmkVar) {
        boolean zza;
        ConcurrentHashMap concurrentHashMap = this.zza;
        zzfma zzfmaVar = (zzfma) concurrentHashMap.get(zzfmlVar);
        zzfmkVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        if (zzfmaVar == null) {
            zzfmi zzfmiVar = this.zzb;
            zzfma zzfmaVar2 = new zzfma(zzfmiVar.zzd, zzfmiVar.zze * 1000);
            if (concurrentHashMap.size() == zzfmiVar.zzc) {
                int i = zzfmiVar.zzg;
                int i2 = i - 1;
                zzfml zzfmlVar2 = null;
                if (i == 0) {
                    throw null;
                }
                long j = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                        if (((zzfma) entry.getValue()).zzd() < j) {
                            j = ((zzfma) entry.getValue()).zzd();
                            zzfmlVar2 = (zzfml) entry.getKey();
                        }
                    }
                    if (zzfmlVar2 != null) {
                        concurrentHashMap.remove(zzfmlVar2);
                    }
                } else if (i2 == 1) {
                    for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                        if (((zzfma) entry2.getValue()).zze() < j) {
                            j = ((zzfma) entry2.getValue()).zze();
                            zzfmlVar2 = (zzfml) entry2.getKey();
                        }
                    }
                    if (zzfmlVar2 != null) {
                        concurrentHashMap.remove(zzfmlVar2);
                    }
                } else if (i2 == 2) {
                    int i3 = Integer.MAX_VALUE;
                    for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                        if (((zzfma) entry3.getValue()).zzf() < i3) {
                            i3 = ((zzfma) entry3.getValue()).zzf();
                            zzfmlVar2 = (zzfml) entry3.getKey();
                        }
                    }
                    if (zzfmlVar2 != null) {
                        concurrentHashMap.remove(zzfmlVar2);
                    }
                }
                this.zzc.zzd();
            }
            concurrentHashMap.put(zzfmlVar, zzfmaVar2);
            this.zzc.zzc();
            zzfmaVar = zzfmaVar2;
        }
        zza = zzfmaVar.zza(zzfmkVar);
        zzfme zzfmeVar = this.zzc;
        zzfmeVar.zze();
        zzfmd zzf = zzfmeVar.zzf();
        zzfmy zzh = zzfmaVar.zzh();
        if (zzfmkVar != null) {
            zzbhj.zzb.zzc zzs = zzbhj.zzb.zzs();
            zzbhj.zzb.zza.C0129zza zzs2 = zzbhj.zzb.zza.zzs();
            zzs2.zzc(zzbhj.zzb.zzd.IN_MEMORY);
            zzbhj.zzb.zzg.zza zzs3 = zzbhj.zzb.zzg.zzs();
            zzs3.zzc(zzf.zza);
            zzs3.zzg(zzf.zzb);
            zzs3.zzk(zzh.zzb);
            zzs2.zzn(zzs3);
            zzs.zzh(zzs2);
            zzfmkVar.zza.zza().zzd().zzk(zzs.zzbu());
        }
        zzf();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfmb
    public final synchronized boolean zzc(zzfml zzfmlVar) {
        zzfma zzfmaVar = (zzfma) this.zza.get(zzfmlVar);
        if (zzfmaVar == null) {
            return true;
        }
        return zzfmaVar.zzc() < this.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfmb
    @Deprecated
    public final zzfml zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        zzfmi zzfmiVar = this.zzb;
        return new zzfmm(zzmVar, str, new zzcau(zzfmiVar.zza).zza().zzj, zzfmiVar.zzf, zzxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfmb
    public final zzfmi zze() {
        return this.zzb;
    }
}
