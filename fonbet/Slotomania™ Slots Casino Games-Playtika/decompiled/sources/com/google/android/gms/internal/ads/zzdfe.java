package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzdfe implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzdfg zzdfgVar = (zzdfg) this.zza.get();
        if (zzdfgVar != null) {
            zzdfgVar.zzs(zzdfd.zza);
        }
    }
}
