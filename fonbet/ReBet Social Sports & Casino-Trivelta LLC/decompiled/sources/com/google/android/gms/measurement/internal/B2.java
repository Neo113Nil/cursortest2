package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzcj;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class B2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final URL f33295a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3408z2 f33296b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33297c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f33298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2 f33299e;
    private final byte[] zzc;

    public B2(C2 c22, String str, URL url, byte[] bArr, Map map, InterfaceC3408z2 interfaceC3408z2) {
        Objects.requireNonNull(c22);
        this.f33299e = c22;
        AbstractC3191o.g(str);
        AbstractC3191o.m(url);
        AbstractC3191o.m(interfaceC3408z2);
        this.f33295a = url;
        this.zzc = bArr;
        this.f33296b = interfaceC3408z2;
        this.f33297c = str;
        this.f33298d = map;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00fe: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:255), block:B:80:0x00fc */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0101: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:258), block:B:78:0x0100 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int i11;
        Map map2;
        Throwable th2;
        Map map3;
        Map map4;
        InputStream inputStream;
        C2 c22 = this.f33299e;
        c22.g();
        OutputStream outputStream = null;
        try {
            URL url = this.f33295a;
            int i12 = zzcj.zzb;
            URLConnection openConnection = url.openConnection();
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            C3298l3 c3298l3 = c22.f33578a;
            c3298l3.w();
            httpURLConnection.setConnectTimeout(60000);
            c3298l3.w();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map5 = this.f33298d;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr = this.zzc;
                if (bArr != null) {
                    byte[] V10 = c22.f34418b.K0().V(bArr);
                    C3376v2 w10 = c3298l3.a().w();
                    int length = V10.length;
                    w10.b("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(V10);
                        outputStream2.close();
                    } catch (IOException e10) {
                        iOException = e10;
                        i11 = 0;
                        map2 = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        this.f33299e.f33578a.b().t(new A2(this.f33297c, this.f33296b, i11, iOException, null, map2, null));
                    } catch (Throwable th3) {
                        th = th3;
                        i10 = 0;
                        map = null;
                        outputStream = outputStream2;
                        th2 = th;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        this.f33299e.f33578a.b().t(new A2(this.f33297c, this.f33296b, i10, null, null, map, null));
                        throw th2;
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int read = inputStream.read(bArr2);
                                    if (read <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        this.f33299e.f33578a.b().t(new A2(this.f33297c, this.f33296b, responseCode, null, byteArray, headerFields, null));
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, read);
                                }
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
                    } catch (IOException e11) {
                        e = e11;
                        map2 = null;
                        i11 = responseCode;
                        iOException = e;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e12) {
                                this.f33299e.f33578a.a().o().c("Error closing HTTP compressed POST connection output stream. appId", C3392x2.x(this.f33297c), e12);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f33299e.f33578a.b().t(new A2(this.f33297c, this.f33296b, i11, iOException, null, map2, null));
                    } catch (Throwable th6) {
                        th2 = th6;
                        map = null;
                        i10 = responseCode;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e13) {
                                this.f33299e.f33578a.a().o().c("Error closing HTTP compressed POST connection output stream. appId", C3392x2.x(this.f33297c), e13);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f33299e.f33578a.b().t(new A2(this.f33297c, this.f33296b, i10, null, null, map, null));
                        throw th2;
                    }
                } catch (IOException e14) {
                    e = e14;
                    i11 = responseCode;
                    map2 = map4;
                    iOException = e;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.f33299e.f33578a.b().t(new A2(this.f33297c, this.f33296b, i11, iOException, null, map2, null));
                } catch (Throwable th7) {
                    th2 = th7;
                    i10 = responseCode;
                    map = map3;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.f33299e.f33578a.b().t(new A2(this.f33297c, this.f33296b, i10, null, null, map, null));
                    throw th2;
                }
            } catch (IOException e15) {
                iOException = e15;
                i11 = 0;
                map2 = null;
            } catch (Throwable th8) {
                th = th8;
                i10 = 0;
                map = null;
            }
        } catch (IOException e16) {
            iOException = e16;
            i11 = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th9) {
            th = th9;
            i10 = 0;
            httpURLConnection = null;
            map = null;
        }
    }
}
