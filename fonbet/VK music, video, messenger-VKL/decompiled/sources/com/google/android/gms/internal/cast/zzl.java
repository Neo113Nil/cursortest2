package com.google.android.gms.internal.cast;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Objects;
import xsna.exc0;
import xsna.g0a;
import xsna.iui0;
import xsna.o100;
import xsna.ssi0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzl implements iui0 {
    final /* synthetic */ zzn zza;

    public zzl(zzn zznVar) {
        Objects.requireNonNull(zznVar);
        this.zza = zznVar;
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionEnded(ssi0 ssi0Var, int i) {
        zzn zznVar = this.zza;
        zznVar.zzo((g0a) ssi0Var);
        zznVar.zzh(i);
    }

    @Override // xsna.iui0
    public final /* synthetic */ void onSessionEnding(ssi0 ssi0Var) {
        this.zza.zzo((g0a) ssi0Var);
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionResumeFailed(ssi0 ssi0Var, int i) {
        zzn zznVar = this.zza;
        zznVar.zzo((g0a) ssi0Var);
        zznVar.zzh(i);
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionResumed(ssi0 ssi0Var, boolean z) {
        o100 o100Var;
        int i = zzn.zza;
        Object[] objArr = {Boolean.valueOf(z)};
        o100Var = zzn.zzb;
        o100Var.a("onSessionResumed with wasSuspended = %b", objArr);
        zzn zznVar = this.zza;
        zznVar.zzo((g0a) ssi0Var);
        zznVar.zze();
        exc0.i(zznVar.zzm());
        zznVar.zzj().zzd(zznVar.zzk().zzd(zznVar.zzm(), z), Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE);
        zznVar.zzg();
        zznVar.zzb();
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionResuming(ssi0 ssi0Var, String str) {
        o100 o100Var;
        o100Var = zzn.zzb;
        o100Var.a("onSessionResuming with sessionId = %s", str);
        zzn zznVar = this.zza;
        zznVar.zzo((g0a) ssi0Var);
        zznVar.zzf(zznVar.zzl(), str);
        exc0.i(zznVar.zzm());
        zznVar.zzj().zzd(zznVar.zzk().zzc(zznVar.zzm()), Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE);
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionStartFailed(ssi0 ssi0Var, int i) {
        zzn zznVar = this.zza;
        zznVar.zzo((g0a) ssi0Var);
        zznVar.zzh(i);
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionStarted(ssi0 ssi0Var, String str) {
        o100 o100Var;
        o100Var = zzn.zzb;
        o100Var.a("onSessionStarted with sessionId = %s", str);
        zzn zznVar = this.zza;
        zznVar.zzo((g0a) ssi0Var);
        zznVar.zze();
        zznVar.zzm().zzf = str;
        zznVar.zzj().zzd(zznVar.zzk().zza(zznVar.zzm()), Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
        zznVar.zzg();
        zznVar.zzb();
    }

    @Override // xsna.iui0
    public final void onSessionStarting(ssi0 ssi0Var) {
        o100 o100Var;
        o100 o100Var2;
        o100Var = zzn.zzb;
        o100Var.a("onSessionStarting", new Object[0]);
        zzn zznVar = this.zza;
        zznVar.zzo((g0a) ssi0Var);
        if (zznVar.zzm() != null) {
            o100Var2 = zzn.zzb;
            o100Var2.c("Start a session while there's already an active session. Create a new one.", new Object[0]);
        }
        zznVar.zzd();
        zzo zzm = zznVar.zzm();
        zznVar.zzj().zzd(zznVar.zzk().zzb(zzm), Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE);
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionSuspended(ssi0 ssi0Var, int i) {
        o100 o100Var;
        int i2 = zzn.zza;
        Object[] objArr = {Integer.valueOf(i)};
        o100Var = zzn.zzb;
        o100Var.a("onSessionSuspended with reason = %d", objArr);
        zzn zznVar = this.zza;
        zznVar.zzo((g0a) ssi0Var);
        zznVar.zze();
        exc0.i(zznVar.zzm());
        zznVar.zzj().zzd(zznVar.zzk().zze(zznVar.zzm(), i), Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
        zznVar.zzg();
        zznVar.zzc();
    }
}
