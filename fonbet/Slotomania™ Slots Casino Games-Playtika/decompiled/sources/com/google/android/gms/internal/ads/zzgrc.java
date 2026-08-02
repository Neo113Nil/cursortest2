package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgrc extends zzgqa {
    final /* synthetic */ zzgre zza;
    private final zzgrj zzb;

    zzgrc(zzgre zzgreVar, zzgrj zzgrjVar) {
        Objects.requireNonNull(zzgreVar);
        this.zza = zzgreVar;
        this.zzb = zzgrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqb
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i2 = bundle.getInt("uiMode", 0);
        zzgrh zzd = zzgri.zzd();
        zzd.zza(i);
        if (string != null) {
            zzd.zzb(string);
        }
        zzd.zzc(i2);
        this.zzb.zza(zzd.zzd());
        if (i == 8157) {
            this.zza.zzd();
        }
    }
}
