package com.google.android.gms.internal.cast;

import java.util.Objects;
import xsna.exc0;
import xsna.g0a;
import xsna.iui0;
import xsna.ssi0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzw implements iui0 {
    final /* synthetic */ zzy zza;

    public zzw(zzy zzyVar) {
        Objects.requireNonNull(zzyVar);
        this.zza = zzyVar;
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionEnded(ssi0 ssi0Var, int i) {
        zzcr zzcrVar = new zzcr(9);
        zzcrVar.zza(Integer.valueOf(i));
        zzy zzyVar = this.zza;
        zzcrVar.zzb(Boolean.valueOf(zzyVar.zzd().zze()));
        zzyVar.zza(new zzcs(zzcrVar));
        zzyVar.zzc();
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionEnding(ssi0 ssi0Var) {
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionResumeFailed(ssi0 ssi0Var, int i) {
        zzcr zzcrVar = new zzcr(8);
        zzcrVar.zza(Integer.valueOf(i));
        zzcs zzcsVar = new zzcs(zzcrVar);
        zzy zzyVar = this.zza;
        zzyVar.zza(zzcsVar);
        zzyVar.zzc();
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionResumed(ssi0 ssi0Var, boolean z) {
        zzcs zzcsVar = new zzcs(new zzcr(4));
        zzy zzyVar = this.zza;
        zzyVar.zza(zzcsVar);
        zzaa zze = zzyVar.zze();
        exc0.i(zze);
        zze.zzh((g0a) ssi0Var);
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionResuming(ssi0 ssi0Var, String str) {
        zzcs zzcsVar = new zzcs(new zzcr(7));
        zzy zzyVar = this.zza;
        zzyVar.zza(zzcsVar);
        zzaa zze = zzyVar.zze();
        exc0.i(zze);
        zze.zzh((g0a) ssi0Var);
        zzaa zze2 = zzyVar.zze();
        exc0.i(zze2);
        zze2.zzg(str);
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionStartFailed(ssi0 ssi0Var, int i) {
        zzcr zzcrVar = new zzcr(5);
        zzcrVar.zza(Integer.valueOf(i));
        zzcs zzcsVar = new zzcs(zzcrVar);
        zzy zzyVar = this.zza;
        zzyVar.zza(zzcsVar);
        zzyVar.zzc();
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionStarted(ssi0 ssi0Var, String str) {
        zzcs zzcsVar = new zzcs(new zzcr(4));
        zzy zzyVar = this.zza;
        zzyVar.zza(zzcsVar);
        zzaa zze = zzyVar.zze();
        exc0.i(zze);
        zze.zzh((g0a) ssi0Var);
        zzaa zze2 = zzyVar.zze();
        exc0.i(zze2);
        zze2.zzg(str);
    }

    @Override // xsna.iui0
    public final void onSessionStarting(ssi0 ssi0Var) {
        g0a g0aVar = (g0a) ssi0Var;
        zzcr zzcrVar = new zzcr(2);
        zzy zzyVar = this.zza;
        zzcrVar.zzb(Boolean.valueOf(zzyVar.zzd().zze()));
        zzyVar.zza(new zzcs(zzcrVar));
        zzaa zze = zzyVar.zze();
        exc0.i(zze);
        zze.zzh(g0aVar);
        g0aVar.m = zzyVar.zzf();
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionSuspended(ssi0 ssi0Var, int i) {
        zzcr zzcrVar = new zzcr(6);
        zzcrVar.zza(Integer.valueOf(i));
        zzcs zzcsVar = new zzcs(zzcrVar);
        zzy zzyVar = this.zza;
        zzyVar.zza(zzcsVar);
        zzaa zze = zzyVar.zze();
        exc0.i(zze);
        zze.zzh((g0a) ssi0Var);
    }
}
