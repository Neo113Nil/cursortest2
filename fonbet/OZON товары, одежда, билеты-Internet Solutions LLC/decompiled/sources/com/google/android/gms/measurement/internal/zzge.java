package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* loaded from: classes.dex */
final class zzge implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzgh zza;
    private final String zzb;

    public zzge(zzgh zzghVar, String str) {
        this.zza = zzghVar;
        Preconditions.checkNotNull(str);
        this.zzb = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.zza.zzs.zzay().zzd().zzb(this.zzb, th2);
    }
}
