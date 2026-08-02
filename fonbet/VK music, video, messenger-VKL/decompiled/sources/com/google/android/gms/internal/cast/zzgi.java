package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Status;
import com.ironsource.X3;
import com.vk.movika.sdk.android.defaultplayer.interactive.c;
import xsna.exc0;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzgi implements qdg0 {
    private final Status zza;
    private final zzgc zzb;

    public zzgi(Status status, zzgc zzgcVar) {
        this.zza = status;
        this.zzb = zzgcVar;
    }

    @Override // xsna.qdg0
    public final Status getStatus() {
        return this.zza;
    }

    public final String toString() {
        zzgc zzgcVar = this.zzb;
        exc0.i(zzgcVar);
        return c.a("OptInOptionsResultImpl[", X3.j.e, zzgcVar.zza() == 1);
    }

    public final boolean zza() {
        zzgc zzgcVar = this.zzb;
        exc0.i(zzgcVar);
        return zzgcVar.zza() == 1;
    }
}
