package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzqk {
    private final List<zzqj> zza = new ArrayList();
    private final List<zzqj> zzb = new ArrayList();
    private final List<zzqj> zzc = new ArrayList();
    private final List<zzqj> zzd = new ArrayList();

    public final zzqk zza(zzqj zzqjVar) {
        this.zzc.add(zzqjVar);
        return this;
    }

    public final zzqk zzb(zzqj zzqjVar) {
        this.zzb.add(zzqjVar);
        return this;
    }

    public final zzqk zzc(zzqj zzqjVar) {
        this.zza.add(zzqjVar);
        return this;
    }

    public final zzqk zzd(zzqj zzqjVar) {
        this.zzd.add(zzqjVar);
        return this;
    }

    public final zzqm zze() {
        return new zzqm(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
