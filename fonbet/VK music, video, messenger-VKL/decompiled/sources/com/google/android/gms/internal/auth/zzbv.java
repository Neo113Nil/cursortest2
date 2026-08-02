package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import xsna.exc0;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class zzbv implements qdg0 {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        exc0.i(status);
        this.zza = status;
        this.zzb = "";
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    @Override // xsna.qdg0
    public final Status getStatus() {
        return this.zza;
    }

    public zzbv(String str) {
        exc0.i(str);
        this.zzb = str;
        this.zza = Status.f;
    }
}
