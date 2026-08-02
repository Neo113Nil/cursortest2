package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzbbt implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzbbu zza;

    zzbbt(zzbbu zzbbuVar) {
        Objects.requireNonNull(zzbbuVar);
        this.zza = zzbbuVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            zzbbu zzbbuVar = this.zza;
            zzbbuVar.zze(System.currentTimeMillis());
            zzbbuVar.zzh(true);
            return;
        }
        zzbbu zzbbuVar2 = this.zza;
        long zzf = zzbbuVar2.zzf();
        long currentTimeMillis = System.currentTimeMillis();
        if (zzf > 0 && currentTimeMillis >= zzbbuVar2.zzf()) {
            zzbbuVar2.zzg(currentTimeMillis - zzbbuVar2.zzf());
        }
        zzbbuVar2.zzh(false);
    }
}
