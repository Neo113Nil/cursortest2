package com.google.android.gms.internal.measurement;

import defpackage.gl5;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzwi implements Runnable, zzwt {
    public zzws a;
    public boolean b;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zzws zzwsVar = this.a;
        try {
            this.a = null;
            if (this.b) {
                throw new IllegalStateException("Span was already closed!");
            }
            this.b = true;
            if (zzwsVar != null) {
                zzwsVar.close();
            }
        } catch (Throwable th) {
            if (zzwsVar != null) {
                try {
                    zzwsVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzrn.a().post(gl5.e);
    }
}
