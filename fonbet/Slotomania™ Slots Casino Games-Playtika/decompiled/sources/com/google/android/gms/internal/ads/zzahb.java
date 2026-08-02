package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public interface zzahb {
    void zzA(zzv zzvVar);

    default void zzO(long j) {
    }

    default int zza(zzj zzjVar, int i, boolean z) throws IOException {
        return zzb(zzjVar, i, z, 0);
    }

    int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException;

    default void zzc(zzes zzesVar, int i) {
        zzd(zzesVar, i, 0);
    }

    void zzd(zzes zzesVar, int i, int i2);

    void zze(long j, int i, int i2, int i3, zzaha zzahaVar);
}
