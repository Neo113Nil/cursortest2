package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public interface zzafp {
    boolean zza(zzafq zzafqVar) throws IOException;

    default List zzb() {
        return zzgvz.zzi();
    }

    void zzc(zzafs zzafsVar);

    int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException;

    void zze(long j, long j2);

    void zzf();

    @SideEffectFree
    default zzafp zzg() {
        return this;
    }
}
