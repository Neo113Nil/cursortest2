package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
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
import java.util.concurrent.Callable;

/* loaded from: classes13.dex */
class Z5 implements Callable<C4256c5> {
    private static final String d = "FileWorkerThread";
    private static final String e = "X-Android-Protocols";
    private static final String f = "http/1.1,h2";
    private final C4238b5 a;
    private final String b;
    private long c;

    public Z5(C4238b5 c4238b5, String str, long j) {
        this.a = c4238b5;
        this.b = str;
        this.c = j;
    }

    public int a(byte[] bArr, String str) throws Exception {
        return IronSourceStorageUtils.saveFile(bArr, str);
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
    public C4256c5 call() {
        Z5 z5;
        if (this.c == 0) {
            this.c = 1L;
        }
        C4256c5 c4256c5 = null;
        int i = 0;
        while (true) {
            if (i >= this.c) {
                z5 = this;
                break;
            }
            z5 = this;
            c4256c5 = z5.a(this.a.e(), i, this.a.a(), this.a.c(), this.a.f());
            int b = c4256c5.b();
            if (b != 1008 && b != 1009) {
                break;
            }
            i++;
        }
        C4256c5 c4256c52 = c4256c5;
        if (c4256c52 != null && c4256c52.a() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(z5.b);
            String str = File.separator;
            sb.append(str);
            sb.append(z5.a.b().getName());
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            xsna.jh.f(sb3, z5.a.d(), str, Z3.E);
            sb3.append(z5.a.b().getName());
            String sb4 = sb3.toString();
            try {
                if (a(c4256c52.a(), sb4) == 0) {
                    c4256c52.a(1006);
                    return c4256c52;
                }
                if (!a(sb4, sb2)) {
                    c4256c52.a(Z3.j);
                    return c4256c52;
                }
            } catch (FileNotFoundException e2) {
                C4452n4.d().a(e2);
                c4256c52.a(1018);
            } catch (Error e3) {
                C4452n4.d().a(e3);
                if (!TextUtils.isEmpty(e3.getMessage())) {
                    Logger.i(d, e3.getMessage());
                }
                c4256c52.a(1019);
            } catch (Exception e4) {
                C4452n4.d().a(e4);
                if (!TextUtils.isEmpty(e4.getMessage())) {
                    Logger.i(d, e4.getMessage());
                }
                c4256c52.a(1009);
            }
        }
        return c4256c52;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[Catch: all -> 0x009d, TRY_ENTER, TryCatch #14 {all -> 0x009d, blocks: (B:20:0x0099, B:21:0x009f, B:44:0x00d9, B:46:0x00de), top: B:8:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0193 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #6 {all -> 0x018f, blocks: (B:89:0x018b, B:81:0x0193), top: B:88:0x018b }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4256c5 a(String str, int i, int i2, int i3, boolean z) {
        HttpURLConnection httpURLConnection;
        C4256c5 c4256c5 = new C4256c5();
        if (TextUtils.isEmpty(str)) {
            c4256c5.a(str);
            c4256c5.a(1007);
            return c4256c5;
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
                        httpURLConnection = (HttpURLConnection) url.openConnection();
                    } catch (Throwable th) {
                        th = th;
                        if (0 != 0) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                C4452n4.d().a(th2);
                                IronLog.INTERNAL.error(th2.toString());
                                c4256c5.a(str);
                                c4256c5.a(0);
                                throw th;
                            }
                        }
                        if (0 != 0) {
                            (objArr == true ? 1 : 0).disconnect();
                        }
                        c4256c5.a(str);
                        c4256c5.a(0);
                        throw th;
                    }
                } catch (Throwable th3) {
                    C4452n4.d().a(th3);
                    IronLog.INTERNAL.error(th3.toString());
                }
                try {
                    httpURLConnection.setRequestMethod("GET");
                    if (z) {
                        try {
                            httpURLConnection.setRequestProperty(e, f);
                        } catch (IllegalStateException e2) {
                            C4452n4.d().a(e2);
                        }
                    }
                    httpURLConnection.setConnectTimeout(i2);
                    httpURLConnection.setReadTimeout(i3);
                    httpURLConnection.connect();
                    i4 = httpURLConnection.getResponseCode();
                } catch (FileNotFoundException e3) {
                    e = e3;
                    C4452n4.d().a(e);
                    i = 1018;
                    if (0 != 0) {
                        (objArr2 == true ? 1 : 0).close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    c4256c5.a(str);
                    c4256c5.a(i);
                    return c4256c5;
                } catch (Error e4) {
                    e = e4;
                    C4452n4.d().a(e);
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
                    c4256c5.a(str);
                    c4256c5.a(i4);
                    return c4256c5;
                } catch (MalformedURLException e5) {
                    e = e5;
                    C4452n4.d().a(e);
                    i = 1004;
                    if (0 != 0) {
                        (objArr4 == true ? 1 : 0).close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    c4256c5.a(str);
                    c4256c5.a(i);
                    return c4256c5;
                } catch (SocketTimeoutException e6) {
                    e = e6;
                    C4452n4.d().a(e);
                    i = 1008;
                    if (0 != 0) {
                        (objArr5 == true ? 1 : 0).close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    c4256c5.a(str);
                    c4256c5.a(i);
                    return c4256c5;
                } catch (URISyntaxException e7) {
                    e = e7;
                    C4452n4.d().a(e);
                    i = 1010;
                    if (0 != 0) {
                        (objArr6 == true ? 1 : 0).close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    c4256c5.a(str);
                    c4256c5.a(i);
                    return c4256c5;
                } catch (Exception e8) {
                    e = e8;
                    C4452n4.d().a(e);
                    if (!TextUtils.isEmpty(e.getMessage())) {
                        Logger.i(d, e.getMessage());
                    }
                    i = 1009;
                    if (0 != 0) {
                        (objArr7 == true ? 1 : 0).close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    c4256c5.a(str);
                    c4256c5.a(i);
                    return c4256c5;
                }
            } catch (FileNotFoundException e9) {
                e = e9;
                httpURLConnection = null;
            } catch (Error e10) {
                e = e10;
                httpURLConnection = null;
            } catch (MalformedURLException e11) {
                e = e11;
                httpURLConnection = null;
            } catch (SocketTimeoutException e12) {
                e = e12;
                httpURLConnection = null;
            } catch (URISyntaxException e13) {
                e = e13;
                httpURLConnection = null;
            } catch (Exception e14) {
                e = e14;
                httpURLConnection = null;
            } catch (Throwable th4) {
                th = th4;
                if (0 != 0) {
                }
                if (0 != 0) {
                }
                c4256c5.a(str);
                c4256c5.a(0);
                throw th;
            }
        } catch (Throwable th5) {
            C4452n4.d().a(th5);
            IronLog.INTERNAL.error(th5.toString());
        }
        if (i4 >= 200 && i4 < 400) {
            inputStream2 = httpURLConnection.getInputStream();
            c4256c5.a(a(inputStream2));
            if (inputStream2 != null) {
                inputStream2.close();
            }
            httpURLConnection.disconnect();
            c4256c5.a(str);
            c4256c5.a(i4);
            return c4256c5;
        }
        Logger.i(d, " RESPONSE CODE: " + i4 + " URL: " + str + " ATTEMPT: " + i);
        i4 = 1011;
        if (inputStream2 != null) {
        }
        httpURLConnection.disconnect();
        c4256c5.a(str);
        c4256c5.a(i4);
        return c4256c5;
    }
}
