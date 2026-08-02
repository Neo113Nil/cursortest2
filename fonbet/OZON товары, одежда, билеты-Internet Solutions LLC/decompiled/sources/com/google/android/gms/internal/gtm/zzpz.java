package com.google.android.gms.internal.gtm;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes9.dex */
final class zzpz implements zzqa {
    private HttpURLConnection zza;
    private InputStream zzb = null;

    zzpz() {
    }

    @Override // com.google.android.gms.internal.gtm.zzqa
    public final InputStream zza(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setConnectTimeout(20000);
        this.zza = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            this.zzb = inputStream;
            return inputStream;
        }
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("Bad response: ");
        sb2.append(responseCode);
        String sb3 = sb2.toString();
        if (responseCode == 404) {
            throw new FileNotFoundException(sb3);
        }
        if (responseCode == 503) {
            throw new zzqe(sb3);
        }
        throw new IOException(sb3);
    }

    @Override // com.google.android.gms.internal.gtm.zzqa
    public final void zzb() {
        HttpURLConnection httpURLConnection = this.zza;
        try {
            InputStream inputStream = this.zzb;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException e11) {
            String valueOf = String.valueOf(e11.getMessage());
            zzhl.zzb(valueOf.length() != 0 ? "HttpUrlConnectionNetworkClient: Error when closing http input stream: ".concat(valueOf) : new String("HttpUrlConnectionNetworkClient: Error when closing http input stream: "), e11);
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
