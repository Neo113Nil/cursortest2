package com.google.android.gms.internal.cast;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzko implements Closeable {
    private static final ThreadLocal zza = new zzkn();
    private int zzb = 0;

    public static int zza() {
        return ((zzko) zza.get()).zzb;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.zzb;
        if (i <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.zzb = i - 1;
    }
}
