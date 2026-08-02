package com.google.android.gms.internal.cast;

import android.content.Context;
import xsna.ex10;
import xsna.fx10;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzby {
    public fx10 zza;
    private final Context zzb;

    public zzby(Context context) {
        this.zzb = context;
    }

    public final fx10 zza() {
        if (this.zza == null) {
            this.zza = fx10.d(this.zzb);
        }
        return this.zza;
    }

    public final void zzb(ex10 ex10Var, fx10.a aVar, int i) {
        zza().a(ex10Var, aVar, 4);
    }

    public final void zzc(fx10.a aVar) {
        fx10 zza = zza();
        if (zza != null) {
            zza.h(aVar);
        }
    }
}
