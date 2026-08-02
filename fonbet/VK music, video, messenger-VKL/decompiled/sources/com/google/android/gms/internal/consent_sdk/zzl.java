package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import xsna.a5j;
import xsna.c5j;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes12.dex */
final class zzl {
    private final Application zza;
    private final zzap zzb;

    public zzl(Application application, zzap zzapVar) {
        this.zza = application;
        this.zzb = zzapVar;
    }

    public final zzci zzc(Activity activity, c5j c5jVar) throws zzg {
        c5jVar.getClass();
        a5j.a aVar = new a5j.a(this.zza);
        boolean z = true;
        if (!zzct.zza(true)) {
            if (!aVar.a.contains(zzcl.zza(aVar.b))) {
                z = false;
            }
        }
        return zzn.zza(new zzn(this, activity, new a5j(z, aVar), c5jVar, null));
    }
}
