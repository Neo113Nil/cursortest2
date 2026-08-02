package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzaol implements zzane {
    public static final zzamw zza = new zzamw(zzgvz.zzi(), C.TIME_UNSET, C.TIME_UNSET);
    private final zzes zzb = new zzes();
    private final zzes zzc = new zzes();
    private final zzaok zzd;
    private Inflater zze;

    public zzaol(List list) {
        zzaok zzaokVar = new zzaok();
        this.zzd = zzaokVar;
        zzaokVar.zza(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzane
    public final void zza(byte[] bArr, int i, int i2, zzand zzandVar, zzds zzdsVar) {
        zzamw zzamwVar;
        zzes zzesVar = this.zzb;
        zzesVar.zzb(bArr, i2 + i);
        zzesVar.zzh(i);
        if (this.zze == null) {
            this.zze = new Inflater();
        }
        zzes zzesVar2 = this.zzc;
        if (zzfk.zzN(zzesVar, zzesVar2, this.zze)) {
            zzesVar.zzb(zzesVar2.zzi(), zzesVar2.zze());
        }
        zzaok zzaokVar = this.zzd;
        zzaokVar.zzc();
        int zzd = zzesVar.zzd();
        if (zzd < 2 || zzesVar.zzt() != zzd) {
            zzamwVar = zza;
        } else {
            zzaokVar.zzd(zzesVar);
            long zzf = zzaokVar.zzf();
            zzcx zzb = zzaokVar.zzb(zzesVar);
            long j = C.TIME_UNSET;
            if (zzf != C.TIME_UNSET) {
                if (zzaokVar.zze() != C.TIME_UNSET) {
                    if (zzaokVar.zzf() > zzaokVar.zze()) {
                        j = zzaokVar.zzf() - zzaokVar.zze();
                    }
                }
                j = zzaokVar.zzf();
            }
            zzamwVar = new zzamw(zzb != null ? zzgvz.zzj(zzb) : zzgvz.zzi(), zzaokVar.zze(), j);
        }
        zzdsVar.zza(zzamwVar);
    }
}
