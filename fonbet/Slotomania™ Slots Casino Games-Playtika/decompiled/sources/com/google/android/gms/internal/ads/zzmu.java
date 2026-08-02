package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public interface zzmu extends zzmp {
    String zzU();

    default long zzV(long j, long j2) {
        if (zze() == 1) {
            return (zzaa() || zzab()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    default boolean zzW(long j) {
        return false;
    }

    default void zzX(float f, float f2) throws zzje {
    }

    default void zzY() {
    }

    void zzZ(long j, long j2) throws zzje;

    int zza();

    boolean zzaa();

    boolean zzab();

    zzmw zzb();

    void zzc(int i, zzpz zzpzVar, zzdo zzdoVar);

    void zzcT() throws zzje;

    void zzcU(zzv[] zzvVarArr, zzyu zzyuVar, long j, long j2, zzxc zzxcVar) throws zzje;

    zzyu zzcV();

    boolean zzcW();

    zzlv zzd();

    int zze();

    void zzf(zzmx zzmxVar, zzv[] zzvVarArr, zzyu zzyuVar, long j, boolean z, boolean z2, long j2, long j3, zzxc zzxcVar) throws zzje;

    long zzk();

    void zzl();

    boolean zzm();

    void zzn() throws IOException;

    void zzo(zzbf zzbfVar);

    void zzp(long j, boolean z) throws zzje;

    void zzq();

    void zzr();

    void zzs();

    default void zzt() {
    }
}
