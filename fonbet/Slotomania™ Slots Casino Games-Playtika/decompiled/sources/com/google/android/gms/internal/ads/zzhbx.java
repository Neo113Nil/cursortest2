package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhab;
import com.ironsource.X3;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzhbx extends zzhab.zzf implements Runnable {
    private final Runnable zza;

    @Override // com.google.android.gms.internal.ads.zzhab
    protected final String zzd() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append(X3.j.e);
        return sb.toString();
    }

    zzhbx(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzb(th);
            throw th;
        }
    }
}
