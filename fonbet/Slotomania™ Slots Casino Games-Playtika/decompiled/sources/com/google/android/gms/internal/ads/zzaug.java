package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzaug extends zzilt implements Closeable {
    static {
        zzima.zzb(zzaug.class);
    }

    public zzaug(zzilu zziluVar, zzauf zzaufVar) throws IOException {
        zzd(zziluVar, zziluVar.zzb(), zzaufVar);
    }

    @Override // com.google.android.gms.internal.ads.zzilt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzilt
    public final String toString() {
        String obj = this.zzc.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
