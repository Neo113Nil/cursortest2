package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzasm implements Executor {
    final /* synthetic */ Handler zza;

    zzasm(zzaso zzasoVar, Handler handler) {
        this.zza = handler;
        Objects.requireNonNull(zzasoVar);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
