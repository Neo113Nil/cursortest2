package com.google.android.gms.internal.ads;

import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzatw extends FilterInputStream {
    private final HttpURLConnection zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzatw(HttpURLConnection httpURLConnection) {
        super(r0);
        InputStream errorStream;
        try {
            errorStream = AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
        } catch (IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        this.zza = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        AdMobNetworkBridge.httpUrlConnectionDisconnect(this.zza);
    }
}
