package s7;

import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22957a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final URL f22958b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f22959c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22960d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f22961e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f22962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.x f22963g;

    public q0(r0 r0Var, String str, URL url, byte[] bArr, Map map, p0 p0Var) {
        Objects.requireNonNull(r0Var);
        this.f22963g = r0Var;
        g6.v.e(str);
        g6.v.h(url);
        this.f22958b = url;
        this.f22959c = bArr;
        this.f22962f = p0Var;
        this.f22960d = str;
        this.f22961e = map;
    }

    public void a(int i5, IOException iOException, byte[] bArr, Map map) {
        d1 d1Var = ((f1) ((h2) this.f22963g).f3328a).f22746g;
        f1.m(d1Var);
        d1Var.s(new androidx.fragment.app.z1(this, i5, iOException, bArr, map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0285: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:646), block:B:177:0x0283 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0288: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:649), block:B:174:0x0287 */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v50 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i5;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int i10;
        Map map2;
        Throwable th2;
        int responseCode;
        Map map3;
        Map map4;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        int i11;
        HttpURLConnection httpURLConnection2;
        Map map5;
        Map map6;
        Map map7;
        Map map8;
        Map map9;
        Throwable th3;
        Map map10;
        IOException iOException2;
        ?? r82;
        ?? r83;
        Map map11;
        InputStream inputStream2;
        ?? hasNext;
        switch (this.f22957a) {
            case 0:
                String str = this.f22960d;
                r0 r0Var = (r0) this.f22963g;
                f1 f1Var = (f1) r0Var.f3328a;
                f1 f1Var2 = (f1) r0Var.f3328a;
                d1 d1Var = f1Var.f22746g;
                f1.m(d1Var);
                d1Var.n();
                OutputStream outputStream = null;
                try {
                    URLConnection openConnection = this.f22958b.openConnection();
                    if (!(openConnection instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection = (HttpURLConnection) openConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    f1Var2.getClass();
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    try {
                        Map map12 = this.f22961e;
                        if (map12 != null) {
                            for (Map.Entry entry : map12.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        byte[] bArr = this.f22959c;
                        if (bArr != null) {
                            r0 r0Var2 = r0Var.f22859b.f22993g;
                            r3.U(r0Var2);
                            byte[] V = r0Var2.V(bArr);
                            n0 n0Var = f1Var2.f22745f;
                            f1.m(n0Var);
                            l0 l0Var = n0Var.f22910n;
                            int length = V.length;
                            l0Var.b(Integer.valueOf(length), "Uploading data. size");
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream2 = httpURLConnection.getOutputStream();
                            try {
                                outputStream2.write(V);
                                outputStream2.close();
                            } catch (IOException e7) {
                                iOException = e7;
                                i10 = 0;
                                map2 = null;
                                outputStream = outputStream2;
                                if (outputStream != null) {
                                }
                                if (httpURLConnection != null) {
                                }
                                p0 p0Var = (p0) this.f22962f;
                                d1 d1Var2 = f1Var2.f22746g;
                                f1.m(d1Var2);
                                d1Var2.s(new k0(this.f22960d, p0Var, i10, iOException, (byte[]) null, map2));
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                i5 = 0;
                                map = null;
                                outputStream = outputStream2;
                                th2 = th;
                                if (outputStream != null) {
                                }
                                if (httpURLConnection != null) {
                                }
                                p0 p0Var2 = (p0) this.f22962f;
                                d1 d1Var3 = f1Var2.f22746g;
                                f1.m(d1Var3);
                                d1Var3.s(new k0(this.f22960d, p0Var2, i5, (IOException) null, (byte[]) null, map));
                                throw th2;
                            }
                        }
                        responseCode = httpURLConnection.getResponseCode();
                    } catch (IOException e9) {
                        iOException = e9;
                        i10 = 0;
                        map2 = null;
                    } catch (Throwable th5) {
                        th = th5;
                        i5 = 0;
                        map = null;
                    }
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                            } catch (Throwable th6) {
                                th = th6;
                                inputStream = null;
                            }
                            try {
                                byte[] bArr2 = new byte[Segment.SHARE_MINIMUM];
                                while (true) {
                                    int read = inputStream.read(bArr2);
                                    if (read <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        p0 p0Var3 = (p0) this.f22962f;
                                        d1 d1Var4 = f1Var2.f22746g;
                                        f1.m(d1Var4);
                                        d1Var4.s(new k0(this.f22960d, p0Var3, responseCode, (IOException) null, byteArray, headerFields));
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, read);
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (IOException e10) {
                            e = e10;
                            i10 = responseCode;
                            map2 = map4;
                            iOException = e;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e11) {
                                    n0 n0Var2 = f1Var2.f22745f;
                                    f1.m(n0Var2);
                                    n0Var2.f22903f.c(n0.r(str), e11, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            p0 p0Var4 = (p0) this.f22962f;
                            d1 d1Var22 = f1Var2.f22746g;
                            f1.m(d1Var22);
                            d1Var22.s(new k0(this.f22960d, p0Var4, i10, iOException, (byte[]) null, map2));
                            return;
                        } catch (Throwable th8) {
                            th2 = th8;
                            i5 = responseCode;
                            map = map3;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e12) {
                                    n0 n0Var3 = f1Var2.f22745f;
                                    f1.m(n0Var3);
                                    n0Var3.f22903f.c(n0.r(str), e12, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            p0 p0Var22 = (p0) this.f22962f;
                            d1 d1Var32 = f1Var2.f22746g;
                            f1.m(d1Var32);
                            d1Var32.s(new k0(this.f22960d, p0Var22, i5, (IOException) null, (byte[]) null, map));
                            throw th2;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        map2 = null;
                        i10 = responseCode;
                        iOException = e;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        p0 p0Var42 = (p0) this.f22962f;
                        d1 d1Var222 = f1Var2.f22746g;
                        f1.m(d1Var222);
                        d1Var222.s(new k0(this.f22960d, p0Var42, i10, iOException, (byte[]) null, map2));
                        return;
                    } catch (Throwable th9) {
                        th2 = th9;
                        map = null;
                        i5 = responseCode;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        p0 p0Var222 = (p0) this.f22962f;
                        d1 d1Var322 = f1Var2.f22746g;
                        f1.m(d1Var322);
                        d1Var322.s(new k0(this.f22960d, p0Var222, i5, (IOException) null, (byte[]) null, map));
                        throw th2;
                    }
                } catch (IOException e14) {
                    iOException = e14;
                    i10 = 0;
                    httpURLConnection = null;
                    map2 = null;
                } catch (Throwable th10) {
                    th = th10;
                    i5 = 0;
                    httpURLConnection = null;
                    map = null;
                }
            default:
                String str2 = this.f22960d;
                h2 h2Var = (h2) this.f22963g;
                f1 f1Var3 = (f1) h2Var.f3328a;
                f1 f1Var4 = (f1) h2Var.f3328a;
                d1 d1Var5 = f1Var3.f22746g;
                f1.m(d1Var5);
                d1Var5.n();
                try {
                    URLConnection openConnection2 = this.f22958b.openConnection();
                    if (!(openConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection2 = (HttpURLConnection) openConnection2;
                    httpURLConnection2.setDefaultUseCaches(false);
                    f1Var4.getClass();
                    httpURLConnection2.setConnectTimeout(60000);
                    httpURLConnection2.setReadTimeout(61000);
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setDoInput(true);
                    try {
                        try {
                            Map map13 = this.f22961e;
                            if (map13 != null) {
                                Iterator it = map13.entrySet().iterator();
                                while (true) {
                                    hasNext = it.hasNext();
                                    if (hasNext != 0) {
                                        Map.Entry entry2 = (Map.Entry) it.next();
                                        httpURLConnection2.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                    }
                                }
                            }
                            byte[] bArr3 = this.f22959c;
                            map11 = hasNext;
                            if (bArr3 != null) {
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                                    gZIPOutputStream.write(bArr3);
                                    gZIPOutputStream.close();
                                    byteArrayOutputStream2.close();
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    n0 n0Var4 = f1Var4.f22745f;
                                    f1.m(n0Var4);
                                    l0 l0Var2 = n0Var4.f22910n;
                                    int length2 = byteArray2.length;
                                    l0Var2.b(Integer.valueOf(length2), "Uploading data. size");
                                    httpURLConnection2.setDoOutput(true);
                                    httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                                    httpURLConnection2.setFixedLengthStreamingMode(length2);
                                    httpURLConnection2.connect();
                                    ?? outputStream3 = httpURLConnection2.getOutputStream();
                                    try {
                                        outputStream3.write(byteArray2);
                                        outputStream3.close();
                                        map11 = outputStream3;
                                    } catch (IOException e15) {
                                        e = e15;
                                        i11 = 0;
                                        map8 = null;
                                        map10 = outputStream3;
                                        iOException2 = e;
                                        r83 = map10;
                                        if (r83 != 0) {
                                        }
                                        if (httpURLConnection2 != null) {
                                        }
                                        a(i11, iOException2, null, map8);
                                        return;
                                    } catch (Throwable th11) {
                                        th = th11;
                                        i11 = 0;
                                        map7 = null;
                                        map9 = outputStream3;
                                        th3 = th;
                                        r82 = map9;
                                        if (r82 != 0) {
                                        }
                                        if (httpURLConnection2 != null) {
                                        }
                                        a(i11, null, null, map7);
                                        throw th3;
                                    }
                                } catch (IOException e16) {
                                    n0 n0Var5 = f1Var4.f22745f;
                                    f1.m(n0Var5);
                                    n0Var5.f22903f.b(e16, "Failed to gzip post request content");
                                    throw e16;
                                }
                            }
                            i11 = httpURLConnection2.getResponseCode();
                        } catch (IOException e17) {
                            e = e17;
                            i11 = 0;
                            map6 = null;
                            map8 = map6;
                            map10 = map6;
                            iOException2 = e;
                            r83 = map10;
                            if (r83 != 0) {
                                try {
                                    r83.close();
                                } catch (IOException e18) {
                                    n0 n0Var6 = f1Var4.f22745f;
                                    f1.m(n0Var6);
                                    n0Var6.f22903f.c(n0.r(str2), e18, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            a(i11, iOException2, null, map8);
                            return;
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        i11 = 0;
                        map5 = null;
                        map7 = map5;
                        map9 = map5;
                        th3 = th;
                        r82 = map9;
                        if (r82 != 0) {
                            try {
                                r82.close();
                            } catch (IOException e19) {
                                n0 n0Var7 = f1Var4.f22745f;
                                f1.m(n0Var7);
                                n0Var7.f22903f.c(n0.r(str2), e19, "Error closing HTTP compressed POST connection output stream. appId");
                            }
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        a(i11, null, null, map7);
                        throw th3;
                    }
                    try {
                        try {
                            Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                inputStream2 = httpURLConnection2.getInputStream();
                                try {
                                    byte[] bArr4 = new byte[Segment.SHARE_MINIMUM];
                                    while (true) {
                                        int read2 = inputStream2.read(bArr4);
                                        if (read2 <= 0) {
                                            byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                            inputStream2.close();
                                            httpURLConnection2.disconnect();
                                            a(i11, null, byteArray3, headerFields2);
                                            return;
                                        }
                                        byteArrayOutputStream3.write(bArr4, 0, read2);
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th14) {
                                th = th14;
                                inputStream2 = null;
                            }
                        } catch (IOException e20) {
                            iOException2 = e20;
                            map8 = map11;
                            r83 = 0;
                            if (r83 != 0) {
                            }
                            if (httpURLConnection2 != null) {
                            }
                            a(i11, iOException2, null, map8);
                            return;
                        } catch (Throwable th15) {
                            th3 = th15;
                            map7 = map11;
                            r82 = 0;
                            if (r82 != 0) {
                            }
                            if (httpURLConnection2 != null) {
                            }
                            a(i11, null, null, map7);
                            throw th3;
                        }
                    } catch (IOException e21) {
                        iOException2 = e21;
                        r83 = 0;
                        map8 = null;
                        if (r83 != 0) {
                        }
                        if (httpURLConnection2 != null) {
                        }
                        a(i11, iOException2, null, map8);
                        return;
                    } catch (Throwable th16) {
                        th3 = th16;
                        r82 = 0;
                        map7 = null;
                        if (r82 != 0) {
                        }
                        if (httpURLConnection2 != null) {
                        }
                        a(i11, null, null, map7);
                        throw th3;
                    }
                } catch (IOException e22) {
                    e = e22;
                    i11 = 0;
                    httpURLConnection2 = null;
                    map6 = null;
                } catch (Throwable th17) {
                    th = th17;
                    i11 = 0;
                    httpURLConnection2 = null;
                    map5 = null;
                }
        }
    }

    public q0(h2 h2Var, String str, URL url, byte[] bArr, HashMap hashMap, g2 g2Var) {
        Objects.requireNonNull(h2Var);
        this.f22963g = h2Var;
        g6.v.e(str);
        this.f22958b = url;
        this.f22959c = bArr;
        this.f22962f = g2Var;
        this.f22960d = str;
        this.f22961e = hashMap;
    }
}
