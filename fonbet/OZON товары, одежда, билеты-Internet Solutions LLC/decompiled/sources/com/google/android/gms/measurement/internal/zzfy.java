package com.google.android.gms.measurement.internal;

import androidx.collection.C5155y;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
final class zzfy extends C5155y {
    final /* synthetic */ zzgb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfy(zzgb zzgbVar, int i11) {
        super(20);
        this.zza = zzgbVar;
    }

    @Override // androidx.collection.C5155y
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzgb.zzd(this.zza, str);
    }
}
