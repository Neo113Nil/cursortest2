package com.google.android.gms.internal.ads;

import com.ironsource.Ua;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface zzne extends zzmz {
    void A(zzbf zzbfVar);

    default boolean B(long j) {
        return false;
    }

    void D(zznh zznhVar, zzv[] zzvVarArr, zzzg zzzgVar, boolean z, boolean z2, long j, long j2, zzxo zzxoVar);

    void E();

    default long F(long j, long j2) {
        if (zze() != 1) {
            return Ua.s;
        }
        if (x() || h()) {
            return 1000000L;
        }
        return Ua.s;
    }

    void G(int i, zzqj zzqjVar, zzdp zzdpVar);

    zzzg H();

    void I(zzv[] zzvVarArr, zzzg zzzgVar, long j, long j2, zzxo zzxoVar);

    boolean J();

    String a();

    boolean h();

    boolean x();

    void y(long j, long j2);

    void z(long j, boolean z);

    int zza();

    zzja zzb();

    zzmf zzd();

    int zze();

    long zzk();

    void zzl();

    boolean zzm();

    void zzn();

    void zzq();

    void zzr();

    void zzs();

    default void i() {
    }

    default void zzt() {
    }

    default void C(float f, float f2) {
    }
}
