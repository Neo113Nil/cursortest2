package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzaqt implements zzaqm {
    final /* synthetic */ zzaqw zza;
    private final zzer zzb;

    public zzaqt(zzaqw zzaqwVar) {
        Objects.requireNonNull(zzaqwVar);
        this.zza = zzaqwVar;
        this.zzb = new zzer(new byte[4], 4);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza(zzfh zzfhVar, zzafs zzafsVar, zzara zzaraVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zzb(zzes zzesVar) {
        if (zzesVar.zzs() == 0 && (zzesVar.zzs() & 128) != 0) {
            zzesVar.zzk(6);
            int zzd = zzesVar.zzd() / 4;
            for (int i = 0; i < zzd; i++) {
                zzer zzerVar = this.zzb;
                zzesVar.zzl(zzerVar, 4);
                int zzj = zzerVar.zzj(16);
                zzerVar.zzh(3);
                if (zzj == 0) {
                    zzerVar.zzh(13);
                } else {
                    int zzj2 = zzerVar.zzj(13);
                    zzaqw zzaqwVar = this.zza;
                    if (zzaqwVar.zzj().get(zzj2) == null) {
                        zzaqwVar.zzj().put(zzj2, new zzaqn(new zzaqu(zzaqwVar, zzj2)));
                        zzaqwVar.zzo(zzaqwVar.zzn() + 1);
                    }
                }
            }
            this.zza.zzj().remove(0);
        }
    }
}
