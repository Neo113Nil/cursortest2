package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzaqp {
    private final List zza;
    private final zzahb[] zzc;
    private final String zzb = MimeTypes.VIDEO_MP2T;
    private final zzgy zzd = new zzgy(new zzgx() { // from class: com.google.android.gms.internal.ads.zzaqo
        @Override // com.google.android.gms.internal.ads.zzgx
        public final /* synthetic */ void zza(long j, zzes zzesVar) {
            zzaqp.this.zzf(j, zzesVar);
        }
    });

    public zzaqp(List list, String str) {
        this.zza = list;
        this.zzc = new zzahb[list.size()];
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
            String str2 = zzvVar.zza;
            if (str2 == null) {
                str2 = zzaraVar.zzc();
            }
            zzt zztVar = new zzt();
            zztVar.zza(str2);
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

    public final void zzb(int i) {
        this.zzd.zza(i);
    }

    public final void zzc(long j, zzes zzesVar) {
        this.zzd.zzc(j, zzesVar);
    }

    public final void zzd() {
        this.zzd.zze();
    }

    public final void zze() {
        this.zzd.zze();
    }

    final /* synthetic */ void zzf(long j, zzes zzesVar) {
        zzafc.zza(j, zzesVar, this.zzc);
    }
}
