package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzans implements zzane {
    private final zzes zza = new zzes();
    private final zzes zzb = new zzes();
    private final zzanr zzc = new zzanr();
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzane
    public final void zza(byte[] bArr, int i, int i2, zzand zzandVar, zzds zzdsVar) {
        zzes zzesVar = this.zza;
        zzesVar.zzb(bArr, i2 + i);
        zzesVar.zzh(i);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzes zzesVar2 = this.zzb;
        if (zzfk.zzN(zzesVar, zzesVar2, this.zzd)) {
            zzesVar.zzb(zzesVar2.zzi(), zzesVar2.zze());
        }
        zzanr zzanrVar = this.zzc;
        zzanrVar.zzb();
        ArrayList arrayList = new ArrayList();
        while (zzesVar.zzd() >= 3) {
            int zze = zzesVar.zze();
            int zzs = zzesVar.zzs();
            int zzt = zzesVar.zzt();
            int zzg = zzesVar.zzg() + zzt;
            zzcx zzcxVar = null;
            if (zzg > zze) {
                zzesVar.zzh(zze);
            } else {
                if (zzs != 128) {
                    switch (zzs) {
                        case 20:
                            zzanrVar.zzc(zzesVar, zzt);
                            break;
                        case 21:
                            zzanrVar.zzd(zzesVar, zzt);
                            break;
                        case 22:
                            zzanrVar.zze(zzesVar, zzt);
                            break;
                    }
                } else {
                    zzcx zza = zzanrVar.zza();
                    zzanrVar.zzb();
                    zzcxVar = zza;
                }
                zzesVar.zzh(zzg);
            }
            if (zzcxVar != null) {
                arrayList.add(zzcxVar);
            }
        }
        zzdsVar.zza(new zzamw(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }
}
