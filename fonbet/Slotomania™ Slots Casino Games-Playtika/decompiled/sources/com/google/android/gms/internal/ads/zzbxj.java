package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzbxj implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbxl zza;

    zzbxj(zzbxl zzbxlVar) {
        Objects.requireNonNull(zzbxlVar);
        this.zza = zzbxlVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbxl zzbxlVar = this.zza;
        Intent zzb = zzbxlVar.zzb();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzY(zzbxlVar.zzc(), zzb);
    }
}
