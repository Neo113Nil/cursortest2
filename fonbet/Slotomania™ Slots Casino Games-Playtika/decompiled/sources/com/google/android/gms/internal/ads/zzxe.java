package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public interface zzxe {
    default void zzA(zzak zzakVar) {
    }

    void zzD(zzxa zzxaVar);

    zzxa zzG(zzxc zzxcVar, zzabd zzabdVar, long j);

    default zzbf zzH() {
        return null;
    }

    default boolean zzI() {
        return true;
    }

    zzak zzJ();

    void zzl(Handler handler, zzxn zzxnVar);

    void zzm(zzxn zzxnVar);

    void zzn(Handler handler, zzub zzubVar);

    void zzo(zzub zzubVar);

    void zzp(zzxd zzxdVar, zzih zzihVar, zzpz zzpzVar);

    void zzq(zzxd zzxdVar);

    void zzr(zzxd zzxdVar);

    void zzs(zzxd zzxdVar);

    void zzt() throws IOException;
}
