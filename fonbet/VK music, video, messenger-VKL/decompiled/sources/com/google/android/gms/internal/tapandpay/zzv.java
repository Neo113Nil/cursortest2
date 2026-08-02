package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import xsna.ehz;
import xsna.ue6;
import xsna.x2o0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
public final class zzv extends zzk {
    private static final ehz.b<x2o0.a> zzc = new zzy();
    private final ue6<Status> zza;
    private final ehz<x2o0.a> zzb;

    public zzv(ue6<Status> ue6Var, ehz<x2o0.a> ehzVar) {
        this.zza = ue6Var;
        this.zzb = ehzVar;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzk, com.google.android.gms.internal.tapandpay.zzf
    public final void zza() {
        this.zzb.c(zzc);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzk, com.google.android.gms.internal.tapandpay.zzf
    public final void zzd(Status status) {
        ue6<Status> ue6Var = this.zza;
        if (ue6Var != null) {
            ue6Var.setResult(status);
        }
    }
}
