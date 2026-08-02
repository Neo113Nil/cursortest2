package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzare {
    private final List zza;
    private final String zzb = MimeTypes.VIDEO_MP2T;
    private final zzahb[] zzc;
    private final zzgy zzd;

    public zzare(List list, String str) {
        this.zza = list;
        this.zzc = new zzahb[list.size()];
        zzgy zzgyVar = new zzgy(new zzgx() { // from class: com.google.android.gms.internal.ads.zzard
            @Override // com.google.android.gms.internal.ads.zzgx
            public final /* synthetic */ void zza(long j, zzes zzesVar) {
                zzare.this.zzc(j, zzesVar);
            }
        });
        this.zzd = zzgyVar;
        zzgyVar.zza(3);
    }

    public final void zza(zzafs zzafsVar, zzara zzaraVar) {
        int i = 0;
        while (true) {
            zzahb[] zzahbVarArr = this.zzc;
            if (i >= zzahbVarArr.length) {
                return;
            }
            zzaraVar.zza();
            zzahb zzu = zzafsVar.zzu(zzaraVar.zzb(), 3);
            zzv zzvVar = (zzv) this.zza.get(i);
            String str = zzvVar.zzp;
            boolean z = true;
            if (!MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str)) {
                z = false;
            }
            zzgsw.zzf(z, "Invalid closed caption MIME type provided: %s", str);
            zzt zztVar = new zzt();
            zztVar.zza(zzaraVar.zzc());
            zztVar.zzn(this.zzb);
            zztVar.zzo(str);
            zztVar.zzf(zzvVar.zze);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzL(zzvVar.zzM);
            zztVar.zzr(zzvVar.zzs);
            zzu.zzA(zztVar.zzO());
            zzahbVarArr[i] = zzu;
            i++;
        }
    }

    public final void zzb(long j, zzes zzesVar) {
        if (zzesVar.zzd() < 9) {
            return;
        }
        int zzB = zzesVar.zzB();
        int zzB2 = zzesVar.zzB();
        int zzs = zzesVar.zzs();
        if (zzB == 434 && zzB2 == 1195456820 && zzs == 3) {
            this.zzd.zzc(j, zzesVar);
        }
    }

    final /* synthetic */ void zzc(long j, zzes zzesVar) {
        zzafc.zzb(j, zzesVar, this.zzc);
    }
}
