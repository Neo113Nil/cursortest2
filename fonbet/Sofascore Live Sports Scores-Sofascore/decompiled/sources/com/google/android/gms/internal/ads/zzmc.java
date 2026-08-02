package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface zzmc {
    default void a(zzmb zzmbVar, zzabe[] zzabeVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default boolean b(zzmb zzmbVar) {
        throw null;
    }

    zzabp c(zzqj zzqjVar);

    default void d(zzqj zzqjVar) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default void e(zzqj zzqjVar) {
        throw new IllegalStateException("onReleased not implemented");
    }

    default void f(zzqj zzqjVar) {
        throw new IllegalStateException("onStopped not implemented");
    }

    default boolean g(zzmb zzmbVar) {
        throw null;
    }

    default long zzf() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default void zzg() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default boolean zzj() {
        zzeh.c("shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}
