package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
final class zzff implements Runnable {
    final /* synthetic */ zzfg zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzfc zzd;
    private final String zze;
    private final Map zzf;

    public zzff(zzfg zzfgVar, String str, URL url, byte[] bArr, Map map, zzfc zzfcVar) {
        this.zza = zzfgVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzfcVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzfcVar;
        this.zze = str;
        this.zzf = map;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0108: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:80:0x0106 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x010b: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:78:0x010a */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i11;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int i12;
        Map map2;
        Throwable th2;
        int responseCode;
        Map map3;
        Map map4;
        InputStream inputStream;
        this.zza.zzax();
        OutputStream outputStream = null;
        try {
            zzfg zzfgVar = this.zza;
            URLConnection openConnection = this.zzb.openConnection();
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzfgVar.zzs.zzf();
            httpURLConnection.setConnectTimeout(60000);
            zzfgVar.zzs.zzf();
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
                    zzey zzj = this.zza.zzs.zzay().zzj();
                    int length = zzy.length;
                    zzj.zzb("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(zzy);
                        outputStream2.close();
                    } catch (IOException e11) {
                        iOException = e11;
                        i12 = 0;
                        map2 = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        this.zza.zzs.zzaz().zzp(new zzfe(this.zze, this.zzd, i12, iOException, null, map2, null));
                    } catch (Throwable th3) {
                        th = th3;
                        map = null;
                        outputStream = outputStream2;
                        i11 = 0;
                        th2 = th;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        this.zza.zzs.zzaz().zzp(new zzfe(this.zze, this.zzd, i11, null, null, map, null));
                        throw th2;
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
            } catch (IOException e12) {
                iOException = e12;
                i12 = 0;
                map2 = null;
            } catch (Throwable th4) {
                th = th4;
                i11 = 0;
                map = null;
            }
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
                                    this.zza.zzs.zzaz().zzp(new zzfe(this.zze, this.zzd, responseCode, null, byteArray, headerFields, null));
                                    return;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        inputStream = null;
                    }
                } catch (IOException e13) {
                    e = e13;
                    map2 = null;
                    i12 = responseCode;
                    iOException = e;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e14) {
                            this.zza.zzs.zzay().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzfa.zzn(this.zze), e14);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.zza.zzs.zzaz().zzp(new zzfe(this.zze, this.zzd, i12, iOException, null, map2, null));
                } catch (Throwable th7) {
                    th2 = th7;
                    map = null;
                    i11 = responseCode;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e15) {
                            this.zza.zzs.zzay().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzfa.zzn(this.zze), e15);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.zza.zzs.zzaz().zzp(new zzfe(this.zze, this.zzd, i11, null, null, map, null));
                    throw th2;
                }
            } catch (IOException e16) {
                e = e16;
                i12 = responseCode;
                map2 = map4;
                iOException = e;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                this.zza.zzs.zzaz().zzp(new zzfe(this.zze, this.zzd, i12, iOException, null, map2, null));
            } catch (Throwable th8) {
                th2 = th8;
                i11 = responseCode;
                map = map3;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                this.zza.zzs.zzaz().zzp(new zzfe(this.zze, this.zzd, i11, null, null, map, null));
                throw th2;
            }
        } catch (IOException e17) {
            iOException = e17;
            i12 = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th9) {
            th = th9;
            i11 = 0;
            httpURLConnection = null;
            map = null;
        }
    }
}
