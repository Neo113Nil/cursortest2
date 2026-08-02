package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface zzxq {
    void a(Handler handler, zzxz zzxzVar);

    zzak b();

    void c(zzxm zzxmVar);

    void d(zzuo zzuoVar);

    void e(zzxz zzxzVar);

    default void f(zzxp zzxpVar, zzqj zzqjVar, zzabu zzabuVar) {
        zzabuVar.getClass();
        throw new IllegalStateException("prepareSource(MediaSourceCaller, TransferListener, PlayerId) not implemented");
    }

    void h(zzxp zzxpVar);

    void i(zzxp zzxpVar);

    void j(zzxp zzxpVar);

    zzxm k(zzxo zzxoVar, zzabp zzabpVar, long j);

    void m(Handler handler, zzuo zzuoVar);

    void zzu();

    default void l() {
    }

    default void zzJ() {
    }

    default void g(zzak zzakVar) {
    }
}
