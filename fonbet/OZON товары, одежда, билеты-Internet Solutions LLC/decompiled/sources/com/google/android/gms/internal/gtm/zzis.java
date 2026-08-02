package com.google.android.gms.internal.gtm;

import C.o0;
import android.os.Bundle;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
final class zzis extends com.google.android.gms.tagmanager.zzci {
    final /* synthetic */ zzje zza;

    zzis(zzje zzjeVar) {
        this.zza = zzjeVar;
    }

    @Override // com.google.android.gms.tagmanager.zzcj
    public final void zze(String str, String str2, Bundle bundle, long j11) {
        ExecutorService executorService;
        if (str.endsWith("+gtm")) {
            return;
        }
        String c11 = o0.c(new StringBuilder(str.length() + 4), str, "+gtm");
        executorService = this.zza.zzh;
        executorService.execute(new zzir(this, str2, bundle, c11, j11, str));
    }
}
