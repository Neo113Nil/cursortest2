package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.SessionState;
import java.util.Objects;
import xsna.o100;
import xsna.pxi0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzm extends pxi0 {
    final /* synthetic */ zzn zza;

    public zzm(zzn zznVar) {
        Objects.requireNonNull(zznVar);
        this.zza = zznVar;
    }

    @Override // xsna.pxi0
    public final void onTransferFailed(int i, int i2) {
        o100 o100Var;
        int i3 = zzn.zza;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        o100Var = zzn.zzb;
        o100Var.a("onTransferFailed with type = %d and reason = %d", objArr);
        zzn zznVar = this.zza;
        zznVar.zze();
        zznVar.zzj().zzd(zznVar.zzk().zzg(zznVar.zzm(), i, i2), 232);
        zznVar.zzp(false);
    }

    @Override // xsna.pxi0
    public final void onTransferred(int i, SessionState sessionState) {
        o100 o100Var;
        int i2 = zzn.zza;
        Object[] objArr = {Integer.valueOf(i)};
        o100Var = zzn.zzb;
        o100Var.a("onTransferred with type = %d", objArr);
        zzn zznVar = this.zza;
        zznVar.zze();
        zznVar.zzj().zzd(zznVar.zzk().zzf(zznVar.zzm(), i), 231);
        zznVar.zzp(false);
        zznVar.zzn(null);
    }

    @Override // xsna.pxi0
    public final void onTransferring(int i) {
        o100 o100Var;
        int i2 = zzn.zza;
        Object[] objArr = {Integer.valueOf(i)};
        o100Var = zzn.zzb;
        o100Var.a("onTransferring with type = %d", objArr);
        zzn zznVar = this.zza;
        zznVar.zzp(true);
        zznVar.zze();
        zznVar.zzj().zzd(zznVar.zzk().zzf(zznVar.zzm(), i), 230);
    }
}
