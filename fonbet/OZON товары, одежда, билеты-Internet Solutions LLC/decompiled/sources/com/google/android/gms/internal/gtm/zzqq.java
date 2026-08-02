package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzqq {
    private final Integer zza;
    private final Object zzb;
    private final List<Integer> zzc = new ArrayList();
    private boolean zzd = false;

    public zzqq(int i11, Object obj) {
        this.zza = Integer.valueOf(i11);
        this.zzb = obj;
    }

    public final zzqq zza(int i11) {
        this.zzc.add(Integer.valueOf(i11));
        return this;
    }

    public final zzqq zzb(boolean z11) {
        this.zzd = true;
        return this;
    }

    public final zzqs zzc() {
        Preconditions.checkNotNull(this.zza);
        Preconditions.checkNotNull(this.zzb);
        return new zzqs(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
