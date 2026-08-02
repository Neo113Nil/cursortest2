package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
final class zzaj implements qdg0 {
    private final Status zza;

    public zzaj(Status status) {
        this.zza = status;
    }

    @Override // xsna.qdg0
    public final Status getStatus() {
        return this.zza;
    }
}
