package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzdn;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.1 */
/* loaded from: classes6.dex */
final class zzc implements Callable<String> {
    private final /* synthetic */ FirebaseAnalytics zza;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        zzdn zzdnVar;
        zzdnVar = this.zza.zzb;
        return zzdnVar.zze();
    }

    zzc(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }
}
