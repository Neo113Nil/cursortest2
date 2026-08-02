package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzguz extends zzgvc {
    final /* synthetic */ zzgvg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzguz(zzgvg zzgvgVar) {
        super(zzgvgVar, null);
        Objects.requireNonNull(zzgvgVar);
        this.zza = zzgvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    final /* bridge */ /* synthetic */ Object zza(int i) {
        return new zzgve(this.zza, i);
    }
}
