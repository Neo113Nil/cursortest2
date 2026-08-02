package com.google.android.gms.internal.cast;

import java.util.Objects;
import xsna.iui0;
import xsna.o100;
import xsna.ssi0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzbz implements iui0 {
    final /* synthetic */ zzce zza;

    public /* synthetic */ zzbz(zzce zzceVar, byte[] bArr) {
        Objects.requireNonNull(zzceVar);
        this.zza = zzceVar;
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionEnded(ssi0 ssi0Var, int i) {
        o100 o100Var;
        int i2 = zzce.zza;
        Object[] objArr = {Integer.valueOf(i)};
        o100Var = zzce.zzb;
        o100Var.a("onSessionEnded with error = %d", objArr);
        zzce zzceVar = this.zza;
        zzceVar.zzm();
        if (zzceVar.zzp() == 2) {
            return;
        }
        zzceVar.zzl();
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionEnding(ssi0 ssi0Var) {
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionResumeFailed(ssi0 ssi0Var, int i) {
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionResumed(ssi0 ssi0Var, boolean z) {
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionResuming(ssi0 ssi0Var, String str) {
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionStartFailed(ssi0 ssi0Var, int i) {
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionStarted(ssi0 ssi0Var, String str) {
        o100 o100Var;
        zzce zzceVar = this.zza;
        Object[] objArr = {Integer.valueOf(zzceVar.zzp())};
        o100Var = zzce.zzb;
        o100Var.a("onSessionStarted with transferType = %d", objArr);
        if (zzceVar.zzg() && zzceVar.zzp() == 2) {
            zzceVar.zzn();
        }
        zzceVar.zzl();
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionStarting(ssi0 ssi0Var) {
    }

    @Override // xsna.iui0
    public final /* bridge */ /* synthetic */ void onSessionSuspended(ssi0 ssi0Var, int i) {
    }
}
