package com.ironsource;

import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import defpackage.wt3;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class W5 implements Callable<C3954a5> {
    private static final String d = "FileWorkerThread";
    private static final String e = "X-Android-Protocols";
    private static final String f = "http/1.1,h2";
    private final Z4 a;
    private final String b;
    private long c;

    public W5(Z4 z4, String str, long j) {
        this.a = z4;
        this.b = str;
        this.c = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f A[Catch: all -> 0x00a3, TRY_ENTER, TryCatch #2 {all -> 0x00a3, blocks: (B:21:0x009f, B:22:0x00a5, B:45:0x00df, B:47:0x00e4), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0199 A[Catch: all -> 0x0195, TRY_LEAVE, TryCatch #10 {all -> 0x0195, blocks: (B:92:0x0191, B:84:0x0199), top: B:91:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3954a5 a(String str, int i, int i2, int i3, boolean z) {
        HttpURLConnection httpURLConnection;
        C3954a5 c3954a5 = new C3954a5();
        if (TextUtils.isEmpty(str)) {
            c3954a5.a(str);
            c3954a5.a(1007);
            return c3954a5;
        }
        InputStream inputStream = null;
        Object[] objArr = 0;
        InputStream inputStream2 = null;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        int i4 = 0;
        try {
            try {
                try {
                    try {
                        URL url = new URL(str);
                        url.toURI();
                        httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                    } catch (Throwable th) {
                        C4157k4.d().a(th);
                        IronLog.INTERNAL.error(th.toString());
                        c3954a5.a(str);
                        c3954a5.a(this);
                        return c3954a5;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            C4157k4.d().a(th3);
                            IronLog.INTERNAL.error(th3.toString());
                            c3954a5.a(str);
                            c3954a5.a(0);
                            throw th;
                        }
                    }
                    if (0 != 0) {
                        (objArr == true ? 1 : 0).disconnect();
                    }
                    c3954a5.a(str);
                    c3954a5.a(0);
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                e = e2;
                httpURLConnection = null;
            } catch (Error e3) {
                e = e3;
                httpURLConnection = null;
            } catch (MalformedURLException e4) {
                e = e4;
                httpURLConnection = null;
            } catch (SocketTimeoutException e5) {
                e = e5;
                httpURLConnection = null;
            } catch (URISyntaxException e6) {
                e = e6;
                httpURLConnection = null;
            } catch (Exception e7) {
                e = e7;
                httpURLConnection = null;
            } catch (Throwable th4) {
                th = th4;
                if (0 != 0) {
                }
                if (0 != 0) {
                }
                c3954a5.a(str);
                c3954a5.a(0);
                throw th;
            }
        } catch (Throwable th5) {
            C4157k4.d().a(th5);
            IronLog.INTERNAL.error(th5.toString());
        }
        try {
            httpURLConnection.setRequestMethod(C4094gc.a);
            if (z) {
                try {
                    httpURLConnection.setRequestProperty(e, f);
                } catch (IllegalStateException e8) {
                    C4157k4.d().a(e8);
                }
            }
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i3);
            httpURLConnection.connect();
            i4 = httpURLConnection.getResponseCode();
        } catch (FileNotFoundException e9) {
            e = e9;
            C4157k4.d().a(e);
            this = 1018;
            this = 1018;
            if (0 != 0) {
                (objArr2 == true ? 1 : 0).close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            c3954a5.a(str);
            c3954a5.a(this);
            return c3954a5;
        } catch (Error e10) {
            e = e10;
            C4157k4.d().a(e);
            i4 = 1019;
            if (!TextUtils.isEmpty(e.getMessage())) {
                Logger.i(d, e.getMessage());
            }
            if (0 != 0) {
                (objArr3 == true ? 1 : 0).close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            c3954a5.a(str);
            c3954a5.a(i4);
            return c3954a5;
        } catch (MalformedURLException e11) {
            e = e11;
            C4157k4.d().a(e);
            this = 1004;
            this = 1004;
            if (0 != 0) {
                (objArr4 == true ? 1 : 0).close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            c3954a5.a(str);
            c3954a5.a(this);
            return c3954a5;
        } catch (SocketTimeoutException e12) {
            e = e12;
            C4157k4.d().a(e);
            this = 1008;
            this = 1008;
            if (0 != 0) {
                (objArr5 == true ? 1 : 0).close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            c3954a5.a(str);
            c3954a5.a(this);
            return c3954a5;
        } catch (URISyntaxException e13) {
            e = e13;
            C4157k4.d().a(e);
            this = 1010;
            this = 1010;
            if (0 != 0) {
                (objArr6 == true ? 1 : 0).close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            c3954a5.a(str);
            c3954a5.a(this);
            return c3954a5;
        } catch (Exception e14) {
            e = e14;
            C4157k4.d().a(e);
            if (!TextUtils.isEmpty(e.getMessage())) {
                Logger.i(d, e.getMessage());
            }
            this = 1009;
            this = 1009;
            if (0 != 0) {
                (objArr7 == true ? 1 : 0).close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            c3954a5.a(str);
            c3954a5.a(this);
            return c3954a5;
        }
        if (i4 >= 200 && i4 < 400) {
            inputStream2 = httpURLConnection.getInputStream();
            c3954a5.a(a(inputStream2));
            if (inputStream2 != null) {
                inputStream2.close();
            }
            httpURLConnection.disconnect();
            c3954a5.a(str);
            c3954a5.a(i4);
            return c3954a5;
        }
        Logger.i(d, " RESPONSE CODE: " + i4 + " URL: " + str + " ATTEMPT: " + i);
        i4 = 1011;
        if (inputStream2 != null) {
        }
        httpURLConnection.disconnect();
        c3954a5.a(str);
        c3954a5.a(i4);
        return c3954a5;
    }

    public boolean a(String str, String str2) throws Exception {
        return IronSourceStorageUtils.renameFile(str, str2);
    }

    public byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3954a5 call() {
        W5 w5;
        if (this.c == 0) {
            this.c = 1L;
        }
        C3954a5 c3954a5 = null;
        int i = 0;
        while (true) {
            if (i >= this.c) {
                w5 = this;
                break;
            }
            w5 = this;
            c3954a5 = w5.a(this.a.e(), i, this.a.a(), this.a.c(), this.a.f());
            int b = c3954a5.b();
            if (b != 1008 && b != 1009) {
                break;
            }
            i++;
            this = w5;
        }
        C3954a5 c3954a52 = c3954a5;
        if (c3954a52 != null && c3954a52.a() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(w5.b);
            String str = File.separator;
            sb.append(str);
            sb.append(w5.a.b().getName());
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            wt3.A(w5.a.d(), str, sb3, W3.E);
            sb3.append(w5.a.b().getName());
            String sb4 = sb3.toString();
            try {
                if (w5.a(c3954a52.a(), sb4) == 0) {
                    c3954a52.a(1006);
                    return c3954a52;
                }
                if (!w5.a(sb4, sb2)) {
                    c3954a52.a(W3.j);
                    return c3954a52;
                }
            } catch (FileNotFoundException e2) {
                C4157k4.d().a(e2);
                c3954a52.a(1018);
            } catch (Error e3) {
                C4157k4.d().a(e3);
                if (!TextUtils.isEmpty(e3.getMessage())) {
                    Logger.i(d, e3.getMessage());
                }
                c3954a52.a(1019);
            } catch (Exception e4) {
                C4157k4.d().a(e4);
                if (!TextUtils.isEmpty(e4.getMessage())) {
                    Logger.i(d, e4.getMessage());
                }
                c3954a52.a(1009);
            }
        }
        return c3954a52;
    }

    public int a(byte[] bArr, String str) throws Exception {
        return IronSourceStorageUtils.saveFile(bArr, str);
    }
}
