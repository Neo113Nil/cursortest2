package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgzf extends zzgyw {
    private final File zza;

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 20);
        sb.append("Files.asByteSource(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* bridge */ /* synthetic */ InputStream zza() throws IOException {
        return new FileInputStream(this.zza);
    }
}
