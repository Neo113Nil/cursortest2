package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
final class zzjt implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zzjx zzb;

    zzjt(zzjx zzjxVar, ComponentName componentName) {
        this.zzb = zzjxVar;
        this.zza = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjy.zzo(this.zzb.zza, this.zza);
    }
}
