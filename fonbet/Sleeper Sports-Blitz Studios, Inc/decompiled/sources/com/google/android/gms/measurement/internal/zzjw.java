package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
final class zzjw implements Runnable {
    private final /* synthetic */ Bundle zza;
    private final /* synthetic */ zziz zzb;

    zzjw(zziz zzizVar, Bundle bundle) {
        this.zza = bundle;
        this.zzb = zzizVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziz.zza(this.zzb, this.zza);
    }
}
