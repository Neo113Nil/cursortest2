package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.zzwa;
import com.ironsource.X3;
import xsna.tdj;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzwr extends zzwa.zzf implements Runnable {
    private final Runnable zzd;

    public zzwr(Runnable runnable) {
        runnable.getClass();
        this.zzd = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzd.run();
        } catch (Throwable th) {
            zzd(th);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwa
    public final String zzg() {
        String obj = this.zzd.toString();
        return tdj.a(new StringBuilder(obj.length() + 7), "task=[", obj, X3.j.e);
    }
}
