package com.google.android.gms.tasks;

import java.util.Objects;
import xsna.exc0;

/* compiled from: com.google.android.gms:play-services-tasks@@18.4.1 */
/* loaded from: classes.dex */
final class zzk implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzl zzb;

    public zzk(zzl zzlVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zzlVar);
        this.zzb = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzl zzlVar = this.zzb;
        synchronized (zzlVar.zzc()) {
            try {
                if (zzlVar.zzd() != null) {
                    OnFailureListener zzd = zzlVar.zzd();
                    Exception exception = this.zza.getException();
                    exc0.i(exception);
                    zzd.onFailure(exception);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
