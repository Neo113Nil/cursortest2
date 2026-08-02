package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzggm implements zzimi {
    private final zzimr zza;

    private zzggm(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzggm zza(zzimr zzimrVar) {
        return new zzggm(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        DisplayMetrics displayMetrics = ((Context) this.zza.zzb()).getResources().getDisplayMetrics();
        zzimq.zzb(displayMetrics);
        return displayMetrics;
    }
}
