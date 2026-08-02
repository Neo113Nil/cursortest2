package com.google.android.gms.internal.ads;

import android.os.Looper;
import com.google.android.exoplayer2.C;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzym extends zzwb implements zzya {
    private final zzhi zza;
    private final zzxu zzb;
    private final zzuf zzc;
    private final int zzd;
    private boolean zze = true;
    private long zzf = C.TIME_UNSET;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private zzih zzj;
    private zzak zzk;
    private final zzabm zzl;

    /* synthetic */ zzym(zzak zzakVar, zzhi zzhiVar, zzxu zzxuVar, zzuf zzufVar, zzabm zzabmVar, int i, boolean z, int i2, zzv zzvVar, zzgto zzgtoVar, byte[] bArr) {
        this.zzk = zzakVar;
        this.zza = zzhiVar;
        this.zzb = zzxuVar;
        this.zzc = zzufVar;
        this.zzl = zzabmVar;
        this.zzd = i;
    }

    private final void zzu() {
        long j = this.zzf;
        boolean z = this.zzg;
        boolean z2 = this.zzh;
        zzak zzJ = zzJ();
        zzbf zzyyVar = new zzyy(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j, j, 0L, 0L, z, false, false, null, zzJ, z2 ? zzJ.zzc : null);
        if (this.zze) {
            zzyyVar = new zzyj(this, zzyyVar);
        }
        zze(zzyyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final synchronized void zzA(zzak zzakVar) {
        this.zzk = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final void zzD(zzxa zzxaVar) {
        ((zzyi) zzxaVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final zzxa zzG(zzxc zzxcVar, zzabd zzabdVar, long j) {
        zzhj zza = this.zza.zza();
        zzih zzihVar = this.zzj;
        if (zzihVar != null) {
            zza.zze(zzihVar);
        }
        zzag zzagVar = zzJ().zzb;
        zzagVar.getClass();
        return new zzyi(zzagVar.zza, zza, this.zzb.zza(zzk()), this.zzc, zzh(zzxcVar), this.zzl, zzf(zzxcVar), this, zzabdVar, null, this.zzd, false, 0, null, zzfk.zzs(C.TIME_UNSET), null);
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final synchronized zzak zzJ() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    protected final void zza(zzih zzihVar) {
        this.zzj = zzihVar;
        Looper.myLooper().getClass();
        zzk();
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzb(long j, zzags zzagsVar, boolean z) {
        if (this.zzi && zzagsVar.zzj()) {
            return;
        }
        this.zzi = !zzagsVar.zzj();
        if (j == C.TIME_UNSET) {
            j = this.zzf;
        }
        boolean zzb = zzagsVar.zzb();
        if (!this.zze && this.zzf == j && this.zzg == zzb && this.zzh == z) {
            return;
        }
        this.zzf = j;
        this.zzg = zzb;
        this.zzh = z;
        this.zze = false;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    protected final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final void zzt() {
    }
}
