package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzgaj {
    private final zzgaf zza;

    public final /* synthetic */ zzgah zza() {
        zzidr zzbu = this.zza.zzbu();
        Intrinsics.checkNotNullExpressionValue(zzbu, "build(...)");
        return (zzgah) zzbu;
    }

    public final /* synthetic */ zzigx zzb() {
        Map zzb = this.zza.zzb();
        Intrinsics.checkNotNullExpressionValue(zzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zzigx(zzb);
    }

    public final void zzc(zzigx zzigxVar, String key, zzgad value) {
        Intrinsics.checkNotNullParameter(zzigxVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.zza.zzc(key, value);
    }

    public final /* synthetic */ void zzd(zzigx zzigxVar, String key) {
        Intrinsics.checkNotNullParameter(zzigxVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        this.zza.zza(key);
    }
}
