package com.google.android.gms.internal.cast;

import android.graphics.Bitmap;
import java.util.Objects;
import xsna.ttz0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzcy implements ttz0 {
    final /* synthetic */ zzda zza;

    public zzcy(zzda zzdaVar) {
        Objects.requireNonNull(zzdaVar);
        this.zza = zzdaVar;
    }

    @Override // xsna.ttz0
    public final void zza(Bitmap bitmap) {
        if (bitmap != null) {
            zzda zzdaVar = this.zza;
            if (zzdaVar.zzb() != null) {
                zzdaVar.zzb().setVisibility(4);
            }
            zzdaVar.zza().setVisibility(0);
            zzdaVar.zza().setImageBitmap(bitmap);
            if (zzdaVar.zzc() != null) {
                zzdaVar.zzc().zza();
            }
        }
    }
}
