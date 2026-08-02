package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfgm implements zzfhk {
    private zzdbn zza;
    private final Executor zzb = zzhbz.zza();

    public final zzdbn zza() {
        return this.zza;
    }

    public final ListenableFuture zzb(zzfhl zzfhlVar, zzfhj zzfhjVar, zzdbn zzdbnVar) {
        zzdbm zza = zzfhjVar.zza(zzfhlVar.zzb);
        zza.zzj(new zzfho(true));
        zzdbn zzdbnVar2 = (zzdbn) zza.zzh();
        this.zza = zzdbnVar2;
        final zzcyl zza2 = zzdbnVar2.zza();
        final zzfmk zzfmkVar = new zzfmk();
        zzhba zzw = zzhba.zzw(zza2.zzb());
        zzhaq zzhaqVar = new zzhaq(this) { // from class: com.google.android.gms.internal.ads.zzfgl
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                zzfke zzfkeVar = (zzfke) obj;
                zzfmkVar.zzb = zzfkeVar;
                Iterator it = zzfkeVar.zzb.zza.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((zzfjt) it.next()).zza.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return zza2.zzc(zzhbi.zza(zzfkeVar));
                    }
                }
                return zzhbi.zza(null);
            }
        };
        Executor executor = this.zzb;
        return (zzhba) zzhbi.zzk((zzhba) zzhbi.zzj(zzw, zzhaqVar, executor), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzfgk
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                zzfmk zzfmkVar2 = zzfmk.this;
                zzfmkVar2.zzc = (zzcxh) obj;
                return zzfmkVar2;
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfhk
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfhl zzfhlVar, zzfhj zzfhjVar, Object obj) {
        return zzb(zzfhlVar, zzfhjVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfhk
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
