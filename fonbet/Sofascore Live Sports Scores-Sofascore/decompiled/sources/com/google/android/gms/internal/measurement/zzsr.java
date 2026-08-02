package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzsr implements zzrt {
    public final boolean a = false;

    static {
        new AtomicInteger();
    }

    private zzsr() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzrt
    public final Object a(zzrs zzrsVar) {
        if (this.a) {
            if (zzrsVar.b.isEmpty()) {
                return zzrsVar.a.b(zzrsVar.d);
            }
            throw new zzsk("Short circuit would skip transforms.");
        }
        InputStream b = zzst.b(zzrsVar);
        zzsj zzsjVar = new zzsj(b);
        try {
            if (!(b instanceof zzsf)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File zza = ((zzsf) b).zza();
            zzsjVar.close();
            return zza;
        } catch (Throwable th) {
            try {
                zzsjVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
