package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface zzcp {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void a(ByteBuffer byteBuffer);

    default void b(zzcn zzcnVar) {
        zzh();
        throw null;
    }

    zzcl d(zzcl zzclVar);

    boolean zzc();

    void zze();

    ByteBuffer zzf();

    boolean zzg();

    default void zzh() {
        throw new IllegalStateException("AudioProcessor must implement at least one #flush() overload.");
    }

    void zzj();

    default long c(long j) {
        return j;
    }
}
