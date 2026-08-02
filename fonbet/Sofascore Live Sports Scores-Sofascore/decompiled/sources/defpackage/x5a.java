package defpackage;

import com.google.firebase.perf.util.Timer;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x5a extends HttpURLConnection {
    public final z5a a;

    public x5a(HttpURLConnection httpURLConnection, Timer timer, xad xadVar) {
        super(httpURLConnection.getURL());
        this.a = new z5a(httpURLConnection, timer, xadVar);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.a.a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.a.a();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        z5a z5aVar = this.a;
        xad xadVar = z5aVar.b;
        xadVar.j(z5aVar.e.a());
        xadVar.b();
        z5aVar.a.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.a.a.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.a.a.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.a.a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.a.b();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        z5a z5aVar = this.a;
        z5aVar.i();
        return z5aVar.a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        z5a z5aVar = this.a;
        z5aVar.i();
        return z5aVar.a.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        z5a z5aVar = this.a;
        z5aVar.i();
        return z5aVar.a.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        z5a z5aVar = this.a;
        z5aVar.i();
        return z5aVar.a.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        z5a z5aVar = this.a;
        z5aVar.i();
        return z5aVar.a.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.a.a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.a.a.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.a.a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.a.d();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        z5a z5aVar = this.a;
        z5aVar.i();
        return z5aVar.a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        z5a z5aVar = this.a;
        z5aVar.i();
        return z5aVar.a.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j) {
        z5a z5aVar = this.a;
        z5aVar.i();
        return z5aVar.a.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        z5a z5aVar = this.a;
        z5aVar.i();
        return z5aVar.a.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        z5a z5aVar = this.a;
        z5aVar.i();
        return z5aVar.a.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j) {
        z5a z5aVar = this.a;
        z5aVar.i();
        return z5aVar.a.getHeaderFieldLong(str, j);
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        z5a z5aVar = this.a;
        z5aVar.i();
        return z5aVar.a.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.a.a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.a.e();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.a.a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        z5a z5aVar = this.a;
        z5aVar.i();
        return z5aVar.a.getLastModified();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.a.f();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        z5a z5aVar = this.a;
        xad xadVar = z5aVar.b;
        try {
            return z5aVar.a.getPermission();
        } catch (IOException e) {
            fc6.y(z5aVar.e, xadVar, xadVar);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.a.a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.a.a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.a.a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.a.a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.a.g();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.a.h();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.a.a.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.a.a.getUseCaches();
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.a.a.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.a.a.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.a.a.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.a.a.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.a.a.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.a.a.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.a.a.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.a.a.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.a.a.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.a.a.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) {
        this.a.a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        boolean equalsIgnoreCase = Command.HTTP_HEADER_USER_AGENT.equalsIgnoreCase(str);
        z5a z5aVar = this.a;
        if (equalsIgnoreCase) {
            z5aVar.b.f = str2;
        }
        z5aVar.a.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.a.a.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.a.a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.a.a.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.a.c(clsArr);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.a.a.setFixedLengthStreamingMode(j);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        z5a z5aVar = this.a;
        z5aVar.i();
        return z5aVar.a.getHeaderField(str);
    }
}
