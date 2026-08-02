package com.google.android.gms.internal.cast;

import androidx.annotation.Nullable;
import xsna.exc0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzy {
    private final zzj zza;
    private final zzax zzb;
    private final String zzc;

    @Nullable
    private zzaa zzd;
    private final zzv zze = new zzv(this, null);

    public zzy(zzj zzjVar, zzax zzaxVar, String str) {
        this.zza = zzjVar;
        this.zzb = zzaxVar;
        this.zzc = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzaa zzb() {
        if (this.zzd == null) {
            zzaa zza = zzaa.zza(this.zza, this.zzc);
            this.zzd = zza;
            zza.zzj(1);
        }
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zzc() {
        zzaa zzaaVar = this.zzd;
        if (zzaaVar != null) {
            zzaaVar.zzi();
            this.zzd = null;
        }
    }

    public final /* synthetic */ void zza(zzcs zzcsVar) {
        if (zzcsVar.zzc() == 2 && this.zzd != null) {
            zzc();
        }
        if (zzcsVar.zzc() == 2) {
            this.zzd = zzaa.zza(this.zza, this.zzc);
        } else {
            this.zzd = zzb();
        }
        zzaa zzaaVar = this.zzd;
        exc0.i(zzaaVar);
        zzaaVar.zzb(zzcsVar);
    }

    public final /* synthetic */ zzax zzd() {
        return this.zzb;
    }

    public final /* synthetic */ zzaa zze() {
        return this.zzd;
    }

    public final /* synthetic */ zzv zzf() {
        return this.zze;
    }
}
