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
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.android.gms.measurement.internal.a5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3212a5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final URL f33918a;

    /* renamed from: b, reason: collision with root package name */
    public final Y4 f33919b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33920c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f33921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3220b5 f33922e;
    private final byte[] zzc;

    public RunnableC3212a5(C3220b5 c3220b5, String str, URL url, byte[] bArr, Map map, Y4 y42) {
        Objects.requireNonNull(c3220b5);
        this.f33922e = c3220b5;
        AbstractC3191o.g(str);
        AbstractC3191o.m(url);
        AbstractC3191o.m(y42);
        this.f33918a = url;
        this.zzc = bArr;
        this.f33919b = y42;
        this.f33920c = str;
        this.f33921d = map;
    }

    public final /* synthetic */ void a(int i10, Exception exc, byte[] bArr, Map map) {
        this.f33919b.a(this.f33920c, i10, exc, bArr, map);
    }

    public final void b(final int i10, final Exception exc, final byte[] bArr, final Map map) {
        this.f33922e.f33578a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.Z4
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                RunnableC3212a5.this.a(i10, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.OutputStream] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map map;
        Map map2;
        Map map3;
        ?? r52;
        Map map4;
        ?? r53;
        int responseCode;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        C3220b5 c3220b5 = this.f33922e;
        c3220b5.g();
        int i10 = 0;
        try {
            URL url = this.f33918a;
            int i11 = zzcj.zzb;
            URLConnection openConnection = url.openConnection();
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            C3298l3 c3298l3 = c3220b5.f33578a;
            c3298l3.w();
            httpURLConnection.setConnectTimeout(60000);
            c3298l3.w();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            ?? r54 = 1;
            httpURLConnection.setDoInput(true);
            try {
                try {
                    Map map5 = this.f33921d;
                    if (map5 != null) {
                        for (Map.Entry entry : map5.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] bArr = this.zzc;
                    if (bArr != null) {
                        try {
                            c3298l3.c();
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream2.close();
                            byte[] byteArray = byteArrayOutputStream2.toByteArray();
                            C3376v2 w10 = this.f33922e.f33578a.a().w();
                            int length = byteArray.length;
                            w10.b("Uploading data. size", Integer.valueOf(length));
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            try {
                                outputStream.write(byteArray);
                                outputStream.close();
                                r54 = outputStream;
                            } catch (IOException e10) {
                                e = e10;
                                map4 = null;
                                r53 = outputStream;
                                if (r53 != 0) {
                                    try {
                                        r53.close();
                                    } catch (IOException e11) {
                                        this.f33922e.f33578a.a().o().c("Error closing HTTP compressed POST connection output stream. appId", C3392x2.x(this.f33920c), e11);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                b(i10, e, null, map4);
                            } catch (Throwable th2) {
                                th = th2;
                                map3 = null;
                                r52 = outputStream;
                                if (r52 != 0) {
                                    try {
                                        r52.close();
                                    } catch (IOException e12) {
                                        this.f33922e.f33578a.a().o().c("Error closing HTTP compressed POST connection output stream. appId", C3392x2.x(this.f33920c), e12);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                b(i10, null, null, map3);
                                throw th;
                            }
                        } catch (IOException e13) {
                            this.f33922e.f33578a.a().o().b("Failed to gzip post request content", e13);
                            throw e13;
                        }
                    }
                    responseCode = httpURLConnection.getResponseCode();
                } catch (IOException e14) {
                    e = e14;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                try {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        inputStream = httpURLConnection.getInputStream();
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                    }
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr2);
                            if (read <= 0) {
                                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                                inputStream.close();
                                httpURLConnection.disconnect();
                                b(responseCode, null, byteArray2, headerFields);
                                return;
                            }
                            byteArrayOutputStream.write(bArr2, 0, read);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th;
                    }
                } catch (IOException e15) {
                    i10 = responseCode;
                    e = e15;
                    map2 = null;
                    map4 = map2;
                    r53 = map2;
                    if (r53 != 0) {
                    }
                    if (httpURLConnection != null) {
                    }
                    b(i10, e, null, map4);
                } catch (Throwable th6) {
                    i10 = responseCode;
                    th = th6;
                    map = null;
                    map3 = map;
                    r52 = map;
                    if (r52 != 0) {
                    }
                    if (httpURLConnection != null) {
                    }
                    b(i10, null, null, map3);
                    throw th;
                }
            } catch (IOException e16) {
                i10 = responseCode;
                e = e16;
                map4 = r54;
                r53 = 0;
                if (r53 != 0) {
                }
                if (httpURLConnection != null) {
                }
                b(i10, e, null, map4);
            } catch (Throwable th7) {
                i10 = responseCode;
                th = th7;
                map3 = r54;
                r52 = 0;
                if (r52 != 0) {
                }
                if (httpURLConnection != null) {
                }
                b(i10, null, null, map3);
                throw th;
            }
        } catch (IOException e17) {
            e = e17;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            map = null;
        }
    }
}
