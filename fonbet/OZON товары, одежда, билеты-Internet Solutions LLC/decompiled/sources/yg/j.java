package yg;

import android.content.Context;
import android.net.TrafficStats;
import bd.C5652b;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class j implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f106617a;

    /* renamed from: b, reason: collision with root package name */
    private final String f106618b;

    /* renamed from: c, reason: collision with root package name */
    private final int f106619c;

    public j(Context context, int i11, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f106617a = context;
        this.f106618b = str;
        this.f106619c = i11;
    }

    private static void b(HttpURLConnection httpURLConnection, int i11) throws IOException {
        int i12;
        if (i11 != -1) {
            i12 = TrafficStats.getThreadStatsTag();
            TrafficStats.setThreadStatsTag(i11);
        } else {
            i12 = -1;
        }
        try {
            try {
                try {
                    try {
                        httpURLConnection.connect();
                    } catch (SecurityException e11) {
                        Throwable cause = e11.getCause();
                        if (cause == null) {
                            throw e11;
                        }
                        String name = cause.getClass().getName();
                        if (!name.equals("libcore.io.GaiException") && !name.equals("android.system.GaiException")) {
                            throw e11;
                        }
                        throw new UnknownHostException();
                    }
                } catch (IllegalArgumentException e12) {
                    throw e12;
                }
            } catch (NullPointerException e13) {
                throw e13;
            }
        } finally {
            if (i12 != -1) {
                TrafficStats.setThreadStatsTag(i12);
            }
        }
    }

    @Override // yg.b
    @NotNull
    public final i a(@NotNull g request) throws IOException {
        String str;
        BufferedInputStream bufferedInputStream;
        byte[] c11;
        Intrinsics.checkNotNullParameter(request, "request");
        String b11 = request.b();
        String c12 = request.c();
        h a11 = request.a();
        URLConnection openConnection = new URL(c12).openConnection();
        Intrinsics.g(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        if (httpURLConnection instanceof HttpsURLConnection) {
            X509TrustManager trustManager = ug.b.a(this.f106617a);
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getInstance(\"SSL\")\n     … }\n        .socketFactory");
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(socketFactory);
        }
        try {
            httpURLConnection.setRequestMethod(b11);
            String str2 = this.f106618b;
            if (str2 != null) {
                httpURLConnection.setRequestProperty("User-Agent", str2);
            }
            if (a11 != null) {
                httpURLConnection.setRequestProperty("Content-Type", a11.c());
                httpURLConnection.setDoOutput(true);
                if (a11.d() >= 0) {
                    httpURLConnection.setFixedLengthStreamingMode(a11.d());
                } else {
                    httpURLConnection.setChunkedStreamingMode(4096);
                }
            }
            b(httpURLConnection, this.f106619c);
            if (a11 != null) {
                OutputStream it = httpURLConnection.getOutputStream();
                try {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    a11.writeTo(it);
                    Unit unit = Unit.f71690a;
                    it.close();
                } finally {
                }
            }
            try {
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                List<String> list = httpURLConnection.getHeaderFields().get("Content-Type");
                if (list == null || (str = (String) C7714v.M(list)) == null) {
                    str = "application/octet-stream";
                }
                if (responseCode < 400) {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    Intrinsics.checkNotNullExpressionValue(inputStream, "conn.inputStream");
                    bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
                    try {
                        c11 = C5652b.c(bufferedInputStream);
                        bufferedInputStream.close();
                    } finally {
                    }
                } else {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    Intrinsics.checkNotNullExpressionValue(errorStream, "conn.errorStream");
                    bufferedInputStream = errorStream instanceof BufferedInputStream ? (BufferedInputStream) errorStream : new BufferedInputStream(errorStream, 8192);
                    try {
                        c11 = C5652b.c(bufferedInputStream);
                        bufferedInputStream.close();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                Intrinsics.checkNotNullExpressionValue(responseMessage, "responseMessage");
                return new i(responseCode, responseMessage, new C10897a(str, c11));
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new IOException(e11);
            } catch (NullPointerException e12) {
                String message = e12.getMessage();
                if (message == null || !kotlin.text.h.e0(message, "Attempt to read from field 'int com.android.okhttp.okio.Segment.limit'", false)) {
                    throw e12;
                }
                throw new IOException(e12);
            }
        } catch (IOException e13) {
            httpURLConnection.disconnect();
            throw e13;
        }
    }
}
