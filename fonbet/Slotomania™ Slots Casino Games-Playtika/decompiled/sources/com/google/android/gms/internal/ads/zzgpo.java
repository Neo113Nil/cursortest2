package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgpo implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzgpq zza;

    zzgpo(zzgpq zzgpqVar) {
        Objects.requireNonNull(zzgpqVar);
        this.zza = zzgpqVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        zzgpq zzgpqVar = this.zza;
        synchronized (zzgpqVar) {
            if (z) {
                zzgpqVar.zzg(System.currentTimeMillis());
                zzgpqVar.zzj(true);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (zzgpqVar.zzh() > 0 && currentTimeMillis >= zzgpqVar.zzh()) {
                    zzgpqVar.zzi(currentTimeMillis - zzgpqVar.zzh());
                }
                zzgpqVar.zzj(false);
            }
        }
    }
}
