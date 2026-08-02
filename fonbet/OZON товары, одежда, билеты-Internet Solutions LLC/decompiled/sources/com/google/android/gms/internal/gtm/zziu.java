package com.google.android.gms.internal.gtm;

import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
final class zziu implements Runnable {
    final /* synthetic */ zziv zza;

    zziu(zziv zzivVar) {
        this.zza = zzivVar;
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x002f */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i11;
        Queue queue;
        ExecutorService executorService;
        Queue queue2;
        int i12;
        i11 = this.zza.zza.zzo;
        if (i11 != 1) {
            i12 = this.zza.zza.zzo;
            if (i12 != 2) {
                return;
            }
        }
        this.zza.zza.zzo = 4;
        zzhl.zza("Container load timed out after 5000ms.");
        while (!queue.isEmpty()) {
            executorService = this.zza.zza.zzh;
            queue2 = this.zza.zza.zzp;
            executorService.execute((Runnable) queue2.remove());
        }
    }
}
