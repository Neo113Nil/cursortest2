package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
final class zzis implements Runnable {
    final /* synthetic */ zzit zza;
    private final URL zzb;
    private final String zzc;
    private final zzgi zzd;

    public zzis(zzit zzitVar, String str, URL url, byte[] bArr, Map map, zzgi zzgiVar, byte[] bArr2) {
        this.zza = zzitVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzgiVar);
        this.zzb = url;
        this.zzd = zzgiVar;
        this.zzc = str;
    }

    private final void zzb(final int i11, final Exception exc, final byte[] bArr, final Map map) {
        this.zza.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzir
            @Override // java.lang.Runnable
            public final void run() {
                zzis.this.zza(i11, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.measurement.internal.zzis] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i11;
        Throwable th2;
        HttpURLConnection httpURLConnection;
        ?? r42;
        IOException e11;
        ?? r43;
        InputStream inputStream;
        this.zza.zzax();
        try {
            zzit zzitVar = this.zza;
            URLConnection openConnection = this.zzb.openConnection();
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzitVar.zzs.zzf();
            r42 = 60000;
            r43 = 60000;
            httpURLConnection.setConnectTimeout(60000);
            zzitVar.zzs.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                i11 = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                                while (true) {
                                    int read = inputStream.read(bArr);
                                    if (read <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        zzb(i11, null, byteArray, headerFields);
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, read);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream = null;
                        }
                    } catch (IOException e12) {
                        e11 = e12;
                        r43 = 0;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(i11, e11, null, r43);
                    } catch (Throwable th5) {
                        th2 = th5;
                        r42 = 0;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(i11, null, null, r42);
                        throw th2;
                    }
                } catch (IOException e13) {
                    e11 = e13;
                    if (httpURLConnection != null) {
                    }
                    zzb(i11, e11, null, r43);
                } catch (Throwable th6) {
                    th2 = th6;
                    if (httpURLConnection != null) {
                    }
                    zzb(i11, null, null, r42);
                    throw th2;
                }
            } catch (IOException e14) {
                i11 = 0;
                e11 = e14;
            } catch (Throwable th7) {
                i11 = 0;
                th2 = th7;
            }
        } catch (IOException e15) {
            i11 = 0;
            e11 = e15;
            httpURLConnection = null;
            r43 = 0;
        } catch (Throwable th8) {
            i11 = 0;
            th2 = th8;
            httpURLConnection = null;
            r42 = 0;
        }
    }

    final /* synthetic */ void zza(int i11, Exception exc, byte[] bArr, Map map) {
        zzgi zzgiVar = this.zzd;
        zzgiVar.zza.zzC(this.zzc, i11, exc, bArr, map);
    }
}
