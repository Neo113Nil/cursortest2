package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* loaded from: classes9.dex */
public final class zznt implements zzjt {
    private Clock zza = DefaultClock.getInstance();

    public final void zza(Clock clock) {
        this.zza = (Clock) Preconditions.checkNotNull(clock);
    }

    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(zzqwVarArr != null);
        Preconditions.checkArgument(zzqwVarArr.length == 0);
        return new zzqy(Double.valueOf(this.zza.currentTimeMillis()));
    }
}
