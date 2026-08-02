package io.sentry.transport;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.twilio.voice.VoiceURLConnection;
import io.sentry.C4866x2;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.I1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import zendesk.core.Constants;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f52741e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Proxy f52742a;

    /* renamed from: b, reason: collision with root package name */
    public final I1 f52743b;

    /* renamed from: c, reason: collision with root package name */
    public final F3 f52744c;

    /* renamed from: d, reason: collision with root package name */
    public final z f52745d;

    public n(F3 f32, I1 i12, z zVar) {
        this(f32, i12, l.a(), zVar);
    }

    public final void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public final HttpURLConnection b() {
        HttpURLConnection e10 = e();
        for (Map.Entry entry : this.f52743b.a().entrySet()) {
            e10.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        e10.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
        e10.setDoOutput(true);
        e10.setRequestProperty("Content-Encoding", "gzip");
        e10.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        e10.setRequestProperty(Constants.ACCEPT_HEADER, "application/json");
        e10.setRequestProperty("Connection", "close");
        e10.setConnectTimeout(this.f52744c.getConnectionTimeoutMillis());
        e10.setReadTimeout(this.f52744c.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = this.f52744c.getSslSocketFactory();
        if ((e10 instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) e10).setSSLSocketFactory(sslSocketFactory);
        }
        e10.connect();
        return e10;
    }

    public final String c(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f52741e));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    boolean z10 = true;
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (!z10) {
                            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                        }
                        sb2.append(readLine);
                        z10 = false;
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

    public final boolean d(int i10) {
        return i10 == 200;
    }

    public HttpURLConnection e() {
        return (HttpURLConnection) (this.f52742a == null ? this.f52743b.b().openConnection() : this.f52743b.b().openConnection(this.f52742a));
    }

    public final B f(HttpURLConnection httpURLConnection) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                i(httpURLConnection, responseCode);
                if (d(responseCode)) {
                    this.f52744c.getLogger().c(EnumC4788n3.DEBUG, "Envelope sent successfully.", new Object[0]);
                    B e10 = B.e();
                    a(httpURLConnection);
                    return e10;
                }
                if (responseCode == 413) {
                    this.f52744c.getLogger().c(EnumC4788n3.ERROR, "Envelope was discarded by the server because it was too large. Consider reducing the size of events, breadcrumbs, or attachments. You can use the `SentryOptions.onOversizedEvent` callback to customize how oversized events are handled.", new Object[0]);
                } else {
                    this.f52744c.getLogger().c(EnumC4788n3.ERROR, "Request failed, API returned %s", Integer.valueOf(responseCode));
                }
                if (this.f52744c.isDebug()) {
                    this.f52744c.getLogger().c(EnumC4788n3.ERROR, "%s", c(httpURLConnection));
                }
                B b10 = B.b(responseCode);
                a(httpURLConnection);
                return b10;
            } catch (IOException e11) {
                this.f52744c.getLogger().a(EnumC4788n3.ERROR, e11, "Error reading and logging the response stream", new Object[0]);
                a(httpURLConnection);
                return B.a();
            }
        } catch (Throwable th2) {
            a(httpURLConnection);
            throw th2;
        }
    }

    public final Proxy g(F3.m mVar) {
        if (mVar == null) {
            return null;
        }
        String c10 = mVar.c();
        String a10 = mVar.a();
        if (c10 == null || a10 == null) {
            return null;
        }
        try {
            return new Proxy(mVar.d() != null ? mVar.d() : Proxy.Type.HTTP, new InetSocketAddress(a10, Integer.parseInt(c10)));
        } catch (NumberFormatException e10) {
            this.f52744c.getLogger().a(EnumC4788n3.ERROR, e10, "Failed to parse Sentry Proxy port: " + mVar.c() + ". Proxy is ignored", new Object[0]);
            return null;
        }
    }

    public B h(C4866x2 c4866x2) {
        B f10;
        this.f52744c.getSocketTagger().b();
        try {
            OutputStream outputStream = b().getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f52744c.getSerializer().b(c4866x2, gZIPOutputStream);
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
        return f10;
    }

    public void i(HttpURLConnection httpURLConnection, int i10) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        this.f52745d.Z1(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i10);
    }

    public n(F3 f32, I1 i12, l lVar, z zVar) {
        this.f52743b = i12;
        this.f52744c = f32;
        this.f52745d = zVar;
        Proxy g10 = g(f32.getProxy());
        this.f52742a = g10;
        if (g10 == null || f32.getProxy() == null) {
            return;
        }
        String e10 = f32.getProxy().e();
        String b10 = f32.getProxy().b();
        if (e10 == null || b10 == null) {
            return;
        }
        lVar.b(new u(e10, b10));
    }
}
