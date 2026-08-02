package io.sentry.transport;

import androidx.appcompat.widget.c1;
import com.google.android.gms.internal.measurement.y3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.y5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f17128e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Proxy f17129a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f17130b;

    /* renamed from: c, reason: collision with root package name */
    public final b6 f17131c;

    /* renamed from: d, reason: collision with root package name */
    public final e5.j f17132d;

    public e(b6 b6Var, io.sentry.internal.debugmeta.c cVar, e5.j jVar) {
        Proxy proxy;
        this.f17130b = cVar;
        this.f17131c = b6Var;
        this.f17132d = jVar;
        y5 proxy2 = b6Var.getProxy();
        if (proxy2 != null) {
            String str = proxy2.f17258b;
            String str2 = proxy2.f17257a;
            if (str != null) {
                try {
                    proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str2, Integer.parseInt(str)));
                } catch (NumberFormatException e7) {
                    this.f17131c.getLogger().b(b5.ERROR, e7, c1.n("Failed to parse Sentry Proxy port: ", str, ". Proxy is ignored"), new Object[0]);
                }
                this.f17129a = proxy;
                if (proxy != null || b6Var.getProxy() == null) {
                }
                String str3 = b6Var.getProxy().f17259c;
                String str4 = b6Var.getProxy().f17260d;
                if (str3 == null || str4 == null) {
                    return;
                }
                Authenticator.setDefault(new l(str3, str4));
                return;
            }
        }
        proxy = null;
        this.f17129a = proxy;
        if (proxy != null) {
        }
    }

    public static void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public static String b(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f17128e));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    boolean z5 = true;
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (!z5) {
                            sb2.append("\n");
                        }
                        sb2.append(readLine);
                        z5 = false;
                    }
                    String sb3 = sb2.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return sb3;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    public final y3 c(HttpURLConnection httpURLConnection) {
        b6 b6Var = this.f17131c;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                e(httpURLConnection, responseCode);
                if (responseCode == 200) {
                    b6Var.getLogger().h(b5.DEBUG, "Envelope sent successfully.", new Object[0]);
                    return r.f17145b;
                }
                ILogger logger = b6Var.getLogger();
                b5 b5Var = b5.ERROR;
                logger.h(b5Var, "Request failed, API returned %s", Integer.valueOf(responseCode));
                if (b6Var.isDebug()) {
                    b6Var.getLogger().h(b5Var, "%s", b(httpURLConnection));
                }
                return new q(responseCode);
            } catch (IOException e7) {
                b6Var.getLogger().b(b5.ERROR, e7, "Error reading and logging the response stream", new Object[0]);
                a(httpURLConnection);
                return new q(-1);
            }
        } finally {
            a(httpURLConnection);
        }
    }

    public final y3 d(l1.a aVar) {
        b6 b6Var = this.f17131c;
        b6Var.getSocketTagger().d();
        io.sentry.internal.debugmeta.c cVar = this.f17130b;
        URL url = (URL) cVar.f16517b;
        Proxy proxy = this.f17129a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
        for (Map.Entry entry : ((HashMap) cVar.f16518c).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setConnectTimeout(b6Var.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(b6Var.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = b6Var.getSslSocketFactory();
        if ((httpURLConnection instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnection.connect();
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    b6Var.getSerializer().e(aVar, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            try {
            } finally {
            }
        }
        return c(httpURLConnection);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(HttpURLConnection httpURLConnection, int i5) {
        long parseDouble;
        String[] strArr;
        double d10;
        int i10;
        long parseDouble2;
        int i11;
        String[] strArr2;
        boolean z5;
        io.sentry.l lVar;
        String str;
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        String headerField2 = httpURLConnection.getHeaderField("X-Sentry-Rate-Limits");
        e5.j jVar = this.f17132d;
        b6 b6Var = (b6) jVar.f8646c;
        d dVar = (d) jVar.f8645b;
        double d11 = 1000.0d;
        if (headerField2 == null) {
            if (i5 == 429) {
                if (headerField != null) {
                    try {
                        parseDouble = (long) (Double.parseDouble(headerField) * 1000.0d);
                    } catch (NumberFormatException unused) {
                    }
                    dVar.getClass();
                    jVar.c(io.sentry.l.All, new Date(System.currentTimeMillis() + parseDouble));
                    return;
                }
                parseDouble = 60000;
                dVar.getClass();
                jVar.c(io.sentry.l.All, new Date(System.currentTimeMillis() + parseDouble));
                return;
            }
            return;
        }
        int i12 = -1;
        String[] split = headerField2.split(StringUtils.COMMA, -1);
        int length = split.length;
        int i13 = 0;
        int i14 = 0;
        while (i14 < length) {
            String[] split2 = split[i14].replace(" ", "").split(StringUtils.PROCESS_POSTFIX_DELIMITER, i12);
            if (split2.length > 0) {
                String str2 = split2[i13];
                if (str2 != null) {
                    try {
                        parseDouble2 = (long) (Double.parseDouble(str2) * d11);
                        d10 = d11;
                    } catch (NumberFormatException unused2) {
                    }
                    if (split2.length > 1) {
                        String str3 = split2[1];
                        dVar.getClass();
                        Date date = new Date(System.currentTimeMillis() + parseDouble2);
                        if (str3 == null || str3.isEmpty()) {
                            strArr = split;
                            i10 = i13;
                            jVar.c(io.sentry.l.All, date);
                            i14++;
                            i13 = i10;
                            d11 = d10;
                            split = strArr;
                            i12 = -1;
                        } else {
                            String[] split3 = str3.split(";", i12);
                            int length2 = split3.length;
                            int i15 = i13;
                            while (i15 < length2) {
                                String str4 = split3[i15];
                                io.sentry.l lVar2 = io.sentry.l.Unknown;
                                try {
                                    Charset charset = io.sentry.util.l.f17171a;
                                    if (str4 == null || str4.isEmpty()) {
                                        i11 = i13;
                                        str = str4;
                                    } else {
                                        String[] split4 = io.sentry.util.l.f17172b.split(str4, i12);
                                        StringBuilder sb2 = new StringBuilder();
                                        i11 = i13;
                                        try {
                                            int length3 = split4.length;
                                            int i16 = i11;
                                            while (i16 < length3) {
                                                sb2.append(io.sentry.util.l.b(split4[i16]));
                                                i16++;
                                                split4 = split4;
                                            }
                                            str = sb2.toString();
                                        } catch (IllegalArgumentException e7) {
                                            e = e7;
                                            strArr2 = split;
                                            ILogger logger = b6Var.getLogger();
                                            b5 b5Var = b5.INFO;
                                            z5 = true;
                                            Object[] objArr = new Object[1];
                                            objArr[i11] = str4;
                                            logger.b(b5Var, e, "Unknown category: %s", objArr);
                                            lVar = lVar2;
                                            if (!io.sentry.l.Unknown.equals(lVar)) {
                                            }
                                            i15++;
                                            split = strArr2;
                                            i12 = -1;
                                            i13 = i11;
                                        }
                                    }
                                    if (str != null) {
                                        lVar2 = io.sentry.l.valueOf(str);
                                        strArr2 = split;
                                    } else {
                                        ILogger logger2 = b6Var.getLogger();
                                        b5 b5Var2 = b5.ERROR;
                                        strArr2 = split;
                                        try {
                                            Object[] objArr2 = new Object[1];
                                            objArr2[i11] = str4;
                                            logger2.h(b5Var2, "Couldn't capitalize: %s", objArr2);
                                        } catch (IllegalArgumentException e9) {
                                            e = e9;
                                            ILogger logger3 = b6Var.getLogger();
                                            b5 b5Var3 = b5.INFO;
                                            z5 = true;
                                            Object[] objArr3 = new Object[1];
                                            objArr3[i11] = str4;
                                            logger3.b(b5Var3, e, "Unknown category: %s", objArr3);
                                            lVar = lVar2;
                                            if (!io.sentry.l.Unknown.equals(lVar)) {
                                            }
                                            i15++;
                                            split = strArr2;
                                            i12 = -1;
                                            i13 = i11;
                                        }
                                    }
                                    z5 = true;
                                } catch (IllegalArgumentException e10) {
                                    e = e10;
                                    i11 = i13;
                                }
                                lVar = lVar2;
                                if (!io.sentry.l.Unknown.equals(lVar)) {
                                    jVar.c(lVar, date);
                                }
                                i15++;
                                split = strArr2;
                                i12 = -1;
                                i13 = i11;
                            }
                        }
                    }
                    strArr = split;
                }
                d10 = d11;
                parseDouble2 = 60000;
                if (split2.length > 1) {
                }
                strArr = split;
            } else {
                strArr = split;
                d10 = d11;
            }
            i10 = i13;
            i14++;
            i13 = i10;
            d11 = d10;
            split = strArr;
            i12 = -1;
        }
    }
}
