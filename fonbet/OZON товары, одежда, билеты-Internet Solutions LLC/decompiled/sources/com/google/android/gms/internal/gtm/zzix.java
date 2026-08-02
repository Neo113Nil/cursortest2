package com.google.android.gms.internal.gtm;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
final class zzix implements ComponentCallbacks2 {
    final /* synthetic */ zzje zza;

    zzix(zzje zzjeVar) {
        this.zza = zzjeVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i11) {
        ExecutorService executorService;
        if (i11 == 20) {
            executorService = this.zza.zzh;
            executorService.execute(new zziw(this));
        }
    }
}
