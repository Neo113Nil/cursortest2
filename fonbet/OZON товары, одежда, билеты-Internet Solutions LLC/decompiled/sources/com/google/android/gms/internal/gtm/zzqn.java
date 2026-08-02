package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzqn {
    private final List<zzjs> zza = new ArrayList();
    private String zzb;

    public final zzqn zza(zzjs zzjsVar) {
        this.zza.add(zzjsVar);
        return this;
    }

    public final zzqn zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzqp zzc() {
        return new zzqp(this.zzb, this.zza, null);
    }
}
