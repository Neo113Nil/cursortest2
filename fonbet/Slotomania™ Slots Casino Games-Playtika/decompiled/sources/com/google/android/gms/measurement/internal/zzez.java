package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes8.dex */
final class zzez implements Runnable {
    final /* synthetic */ zzfa zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzew zzd;
    private final String zze;
    private final Map zzf;

    public zzez(zzfa zzfaVar, String str, URL url, byte[] bArr, Map map, zzew zzewVar) {
        this.zza = zzfaVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzewVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzewVar;
        this.zze = str;
        this.zzf = map;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0100: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:82:0x00fe */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0104: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:80:0x0103 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int i2;
        Map map2;
        Throwable th;
        int responseCode;
        Map map3;
        Map map4;
        InputStream inputStream;
        this.zza.zzaz();
        OutputStream outputStream = null;
        try {
            zzfa zzfaVar = this.zza;
            URLConnection openConnection = this.zzb.openConnection();
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzfaVar.zzt.zzf();
            httpURLConnection.setConnectTimeout(60000);
            zzfaVar.zzt.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map5 = this.zzf;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (this.zzc != null) {
                    byte[] zzy = this.zza.zzf.zzu().zzy(this.zzc);
                    zzes zzj = this.zza.zzt.zzaA().zzj();
                    int length = zzy.length;
                    zzj.zzb("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(zzy);
                        outputStream2.close();
                    } catch (IOException e) {
                        iOException = e;
                        i2 = 0;
                        map2 = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e2) {
                                this.zza.zzt.zzaA().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzeu.zzn(this.zze), e2);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzt.zzaB().zzp(new zzey(this.zze, this.zzd, i2, iOException, null, map2, null));
                    } catch (Throwable th2) {
                        th = th2;
                        map = null;
                        outputStream = outputStream2;
                        i = 0;
                        th = th;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e3) {
                                this.zza.zzt.zzaA().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzeu.zzn(this.zze), e3);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzt.zzaB().zzp(new zzey(this.zze, this.zzd, i, null, null, map, null));
                        throw th;
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
            } catch (IOException e4) {
                iOException = e4;
                i2 = 0;
                map2 = null;
            } catch (Throwable th3) {
                th = th3;
                i = 0;
                map = null;
            }
            try {
                try {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            this.zza.zzt.zzaB().zzp(new zzey(this.zze, this.zzd, responseCode, null, byteArray, headerFields, null));
                        } catch (Throwable th4) {
                            th = th4;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        inputStream = null;
                    }
                } catch (IOException e5) {
                    e = e5;
                    map2 = null;
                    i2 = responseCode;
                    iOException = e;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.zza.zzt.zzaB().zzp(new zzey(this.zze, this.zzd, i2, iOException, null, map2, null));
                } catch (Throwable th6) {
                    th = th6;
                    map = null;
                    i = responseCode;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.zza.zzt.zzaB().zzp(new zzey(this.zze, this.zzd, i, null, null, map, null));
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                i2 = responseCode;
                map2 = map4;
                iOException = e;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                this.zza.zzt.zzaB().zzp(new zzey(this.zze, this.zzd, i2, iOException, null, map2, null));
            } catch (Throwable th7) {
                th = th7;
                i = responseCode;
                map = map3;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                this.zza.zzt.zzaB().zzp(new zzey(this.zze, this.zzd, i, null, null, map, null));
                throw th;
            }
        } catch (IOException e7) {
            iOException = e7;
            i2 = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th8) {
            th = th8;
            i = 0;
            httpURLConnection = null;
            map = null;
        }
    }
}
