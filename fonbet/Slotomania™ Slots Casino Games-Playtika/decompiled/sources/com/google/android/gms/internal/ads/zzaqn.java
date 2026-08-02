package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzaqn implements zzarb {
    private final zzaqm zza;
    private final zzes zzb = new zzes(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzaqn(zzaqm zzaqmVar) {
        this.zza = zzaqmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzarb
    public final void zza(zzfh zzfhVar, zzafs zzafsVar, zzara zzaraVar) {
        this.zza.zza(zzfhVar, zzafsVar, zzaraVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzarb
    public final void zzb() {
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzarb
    public final void zzc(zzes zzesVar, int i) {
        int i2 = i & 1;
        int zzg = i2 != 0 ? zzesVar.zzg() + zzesVar.zzs() : -1;
        if (this.zzf) {
            if (i2 == 0) {
                return;
            }
            this.zzf = false;
            zzesVar.zzh(zzg);
            this.zzd = 0;
        }
        while (zzesVar.zzd() > 0) {
            int i3 = this.zzd;
            if (i3 < 3) {
                if (i3 == 0) {
                    int zzs = zzesVar.zzs();
                    zzesVar.zzh(zzesVar.zzg() - 1);
                    if (zzs == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzesVar.zzd(), 3 - this.zzd);
                zzes zzesVar2 = this.zzb;
                zzesVar.zzm(zzesVar2.zzi(), this.zzd, min);
                int i4 = this.zzd + min;
                this.zzd = i4;
                if (i4 == 3) {
                    zzesVar2.zzh(0);
                    zzesVar2.zzf(3);
                    zzesVar2.zzk(1);
                    int zzs2 = zzesVar2.zzs();
                    boolean z = (zzs2 & 128) != 0;
                    int zzs3 = zzesVar2.zzs();
                    this.zze = z;
                    this.zzc = (((zzs2 & 15) << 8) | zzs3) + 3;
                    int zzj = zzesVar2.zzj();
                    int i5 = this.zzc;
                    if (zzj < i5) {
                        int zzj2 = zzesVar2.zzj();
                        zzesVar2.zzc(Math.min(4098, Math.max(i5, zzj2 + zzj2)));
                    }
                }
            } else {
                int min2 = Math.min(zzesVar.zzd(), this.zzc - this.zzd);
                zzes zzesVar3 = this.zzb;
                zzesVar.zzm(zzesVar3.zzi(), this.zzd, min2);
                int i6 = this.zzd + min2;
                this.zzd = i6;
                int i7 = this.zzc;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.zze) {
                        zzesVar3.zzf(i7);
                    } else {
                        if (zzfk.zzI(zzesVar3.zzi(), 0, i7, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        zzesVar3.zzf(this.zzc - 4);
                    }
                    zzesVar3.zzh(0);
                    this.zza.zzb(zzesVar3);
                    this.zzd = 0;
                }
            }
        }
    }
}
