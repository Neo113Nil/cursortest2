package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
final class zzjx implements Runnable {
    private final /* synthetic */ Bundle zza;
    private final /* synthetic */ zziz zzb;

    zzjx(zziz zzizVar, Bundle bundle) {
        this.zza = bundle;
        this.zzb = zzizVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziz.zzb(this.zzb, this.zza);
    }
}
