package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public interface zzls {
    default void zza(zzpz zzpzVar) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default void zzb(zzlr zzlrVar, zzzf zzzfVar, zzaas[] zzaasVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default void zzc(zzpz zzpzVar) {
        throw new IllegalStateException("onStopped not implemented");
    }

    default void zzd(zzpz zzpzVar) {
        throw new IllegalStateException("onReleased not implemented");
    }

    zzabd zze(zzpz zzpzVar);

    default long zzf(zzpz zzpzVar) {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default boolean zzg(zzpz zzpzVar) {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default boolean zzh(zzlr zzlrVar) {
        long j = zzlrVar.zzd;
        throw null;
    }

    default boolean zzi(zzlr zzlrVar) {
        zzbf zzbfVar = zzlrVar.zzb;
        throw null;
    }

    default boolean zzj(zzpz zzpzVar, zzbf zzbfVar, zzxc zzxcVar, long j) {
        zzef.zzc("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}
