package io.sentry.transport;

import io.sentry.C7197r1;
import io.sentry.I2;
import io.sentry.V1;
import io.sentry.W2;
import io.sentry.transport.o;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class d {

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f68525e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final Proxy f68526a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7197r1 f68527b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final W2 f68528c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final m f68529d;

    public d(@NotNull W2 w22, @NotNull C7197r1 c7197r1, @NotNull m mVar) {
        Proxy proxy;
        this.f68527b = c7197r1;
        this.f68528c = w22;
        this.f68529d = mVar;
        W2.m proxy2 = w22.getProxy();
        if (proxy2 != null) {
            String c11 = proxy2.c();
            String a11 = proxy2.a();
            if (c11 != null && a11 != null) {
                try {
                    proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(a11, Integer.parseInt(c11)));
                } catch (NumberFormatException e11) {
                    this.f68528c.getLogger().b(I2.ERROR, e11, "Failed to parse Sentry Proxy port: " + proxy2.c() + ". Proxy is ignored", new Object[0]);
                }
                this.f68526a = proxy;
                if (proxy != null || w22.getProxy() == null) {
                }
                String d11 = w22.getProxy().d();
                String b11 = w22.getProxy().b();
                if (d11 == null || b11 == null) {
                    return;
                }
                Authenticator.setDefault(new k(d11, b11));
                return;
            }
        }
        proxy = null;
        this.f68526a = proxy;
        if (proxy != null) {
        }
    }

    private static void a(@NotNull HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    @NotNull
    private static String b(@NotNull HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f68525e));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    boolean z11 = true;
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (!z11) {
                            sb2.append("\n");
                        }
                        sb2.append(readLine);
                        z11 = false;
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

    @NotNull
    private o c(@NotNull HttpURLConnection httpURLConnection) {
        W2 w22 = this.f68528c;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                String headerField = httpURLConnection.getHeaderField("Retry-After");
                this.f68529d.q(responseCode, httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField);
                if (responseCode == 200) {
                    w22.getLogger().c(I2.DEBUG, "Envelope sent successfully.", new Object[0]);
                    return o.b.f68550a;
                }
                if (responseCode == 413) {
                    w22.getLogger().c(I2.ERROR, "Envelope was discarded by the server because it was too large. Consider reducing the size of events, breadcrumbs, or attachments. You can use the `SentryOptions.onOversizedEvent` callback to customize how oversized events are handled.", new Object[0]);
                } else {
                    w22.getLogger().c(I2.ERROR, "Request failed, API returned %s", Integer.valueOf(responseCode));
                }
                if (w22.isDebug()) {
                    w22.getLogger().c(I2.ERROR, "%s", b(httpURLConnection));
                }
                return new o.a(responseCode);
            } catch (IOException e11) {
                w22.getLogger().b(I2.ERROR, e11, "Error reading and logging the response stream", new Object[0]);
                a(httpURLConnection);
                return new o.a(-1);
            }
        } finally {
            a(httpURLConnection);
        }
    }

    @NotNull
    public final o d(@NotNull V1 v12) throws IOException {
        W2 w22 = this.f68528c;
        w22.getSocketTagger().b();
        C7197r1 c7197r1 = this.f68527b;
        Proxy proxy = this.f68526a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? c7197r1.b().openConnection() : c7197r1.b().openConnection(proxy));
        for (Map.Entry entry : ((HashMap) c7197r1.a()).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setConnectTimeout(w22.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(w22.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = w22.getSslSocketFactory();
        if ((httpURLConnection instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnection.connect();
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    w22.getSerializer().b(v12, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    return c(httpURLConnection);
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                w22.getLogger().b(I2.ERROR, th2, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
                return c(httpURLConnection);
            } finally {
                c(httpURLConnection);
                w22.getSocketTagger().a();
            }
        }
    }
}
