package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* loaded from: classes9.dex */
public final class zzps implements Result {
    private final Status zza;
    private final int zzb;
    private final zzpr zzc;
    private final zzqp zzd;

    public zzps(Status status, int i11, zzpr zzprVar, zzqp zzqpVar) {
        this.zza = status;
        this.zzb = i11;
        this.zzc = zzprVar;
        this.zzd = zzqpVar;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzpr zzb() {
        return this.zzc;
    }

    public final zzqp zzc() {
        return this.zzd;
    }

    public final String zzd() {
        int i11 = this.zzb;
        if (i11 == 0) {
            return "Network";
        }
        if (i11 == 1) {
            return "Saved file on disk";
        }
        if (i11 == 2) {
            return "Default resource";
        }
        throw new IllegalStateException("Resource source is unknown.");
    }
}
