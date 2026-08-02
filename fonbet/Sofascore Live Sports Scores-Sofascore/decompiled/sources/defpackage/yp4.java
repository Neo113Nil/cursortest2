package defpackage;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.C4094gc;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yp4 extends k21 {
    public final boolean e;
    public final String f;
    public final ti9 g;
    public final ti9 h;
    public xe4 i;
    public HttpURLConnection j;
    public InputStream k;
    public boolean l;
    public int m;
    public long n;
    public long o;

    public yp4(String str, boolean z, ti9 ti9Var) {
        super(true);
        this.f = str;
        this.e = z;
        this.g = ti9Var;
        this.h = new ti9(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019a  */
    @Override // defpackage.re4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(xe4 xe4Var) {
        long parseLong;
        long j;
        long parseLong2;
        long j2;
        this.i = xe4Var;
        this.o = 0L;
        this.n = 0L;
        e();
        try {
            Thread currentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? currentThread.getId() : currentThread.threadId()));
            HttpURLConnection j3 = j(xe4Var);
            long j4 = xe4Var.g;
            long j5 = xe4Var.f;
            this.j = j3;
            this.m = j3.getResponseCode();
            j3.getResponseMessage();
            int i = this.m;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = j3.getHeaderFields();
                if (this.m == 416) {
                    String headerField = j3.getHeaderField("Content-Range");
                    Pattern pattern = nl9.a;
                    if (!TextUtils.isEmpty(headerField)) {
                        Matcher matcher = nl9.b.matcher(headerField);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            group.getClass();
                            parseLong = Long.parseLong(group);
                            if (j5 == parseLong) {
                                this.l = true;
                                g(xe4Var);
                                if (j4 != -1) {
                                    return j4;
                                }
                                return 0L;
                            }
                        }
                    }
                    parseLong = -1;
                    if (j5 == parseLong) {
                    }
                }
                InputStream errorStream = j3.getErrorStream();
                try {
                    if (errorStream != null) {
                        tb2.b(errorStream);
                    } else {
                        String str = nik.a;
                    }
                } catch (IOException unused) {
                    String str2 = nik.a;
                }
                h();
                throw new si9(this.m, this.m == 416 ? new te4(2008) : null, headerFields);
            }
            j3.getContentType();
            if (this.m != 200 || j5 == 0) {
                j5 = 0;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(j3.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                this.n = j4;
            } else if (j4 != -1) {
                this.n = j4;
            } else {
                String headerField2 = j3.getHeaderField("Content-Length");
                String headerField3 = j3.getHeaderField("Content-Range");
                Pattern pattern2 = nl9.a;
                if (TextUtils.isEmpty(headerField2)) {
                    j = 0;
                } else {
                    try {
                        j = 0;
                        parseLong2 = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        j = 0;
                        tgj.z("Unexpected Content-Length [" + headerField2 + U3.j.e);
                    }
                    if (!TextUtils.isEmpty(headerField3)) {
                        Matcher matcher2 = nl9.a.matcher(headerField3);
                        if (matcher2.matches()) {
                            j2 = -1;
                            try {
                                String group2 = matcher2.group(2);
                                group2.getClass();
                                long parseLong3 = Long.parseLong(group2);
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                long parseLong4 = (parseLong3 - Long.parseLong(group3)) + 1;
                                if (parseLong2 < j) {
                                    parseLong2 = parseLong4;
                                } else if (parseLong2 != parseLong4) {
                                    tgj.d0("Inconsistent headers [" + headerField2 + "] [" + headerField3 + U3.j.e);
                                    parseLong2 = Math.max(parseLong2, parseLong4);
                                }
                            } catch (NumberFormatException unused3) {
                                tgj.z("Unexpected Content-Range [" + headerField3 + U3.j.e);
                            }
                            this.n = parseLong2 != j2 ? parseLong2 - j5 : j2;
                        }
                    }
                    j2 = -1;
                    this.n = parseLong2 != j2 ? parseLong2 - j5 : j2;
                }
                parseLong2 = -1;
                if (!TextUtils.isEmpty(headerField3)) {
                }
                j2 = -1;
                this.n = parseLong2 != j2 ? parseLong2 - j5 : j2;
            }
            try {
                this.k = j3.getInputStream();
                if (equalsIgnoreCase) {
                    this.k = new GZIPInputStream(this.k);
                }
                this.l = true;
                g(xe4Var);
                try {
                    l(j5);
                    return this.n;
                } catch (IOException e) {
                    h();
                    if (e instanceof oi9) {
                        throw ((oi9) e);
                    }
                    throw new oi9(2000, 1, e);
                }
            } catch (IOException e2) {
                h();
                throw new oi9(2000, 1, e2);
            }
        } catch (IOException e3) {
            h();
            throw oi9.a(1, e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.re4
    public final void close() {
        try {
            InputStream inputStream = this.k;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = nik.a;
                    throw new oi9(2000, 3, e);
                }
            }
        } finally {
            this.k = null;
            h();
            if (this.l) {
                this.l = false;
                d();
            }
            this.j = null;
            this.i = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    @Override // defpackage.re4
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.j;
        return httpURLConnection == null ? awf.g : new wp4(httpURLConnection.getHeaderFields(), 1);
    }

    @Override // defpackage.re4
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        xe4 xe4Var = this.i;
        if (xe4Var != null) {
            return xe4Var.a;
        }
        return null;
    }

    public final void h() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                tgj.A("Unexpected error while disconnecting", e);
            }
        }
    }

    public final URL i(URL url, String str) {
        if (str == null) {
            throw new oi9("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new oi9(dmi.q("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new oi9("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e) {
            throw new oi9(2001, 1, e);
        }
    }

    public final HttpURLConnection j(xe4 xe4Var) {
        HttpURLConnection k;
        URL url = new URL(xe4Var.a.toString());
        int i = xe4Var.c;
        byte[] bArr = xe4Var.d;
        long j = xe4Var.f;
        long j2 = xe4Var.g;
        int i2 = 1;
        int i3 = 0;
        boolean z = (xe4Var.i & 1) == 1;
        if (!this.e) {
            return k(url, i, bArr, j, j2, z, true, xe4Var.e);
        }
        while (true) {
            int i4 = i3 + 1;
            if (i3 > 20) {
                throw new oi9(2001, 1, new NoRouteToHostException(ljg.j(i4, "Too many redirects: ")));
            }
            k = k(url, i, bArr, j, j2, z, false, xe4Var.e);
            int responseCode = k.getResponseCode();
            String headerField = k.getHeaderField("Location");
            if ((i == i2 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                k.disconnect();
                url = i(url, headerField);
            } else {
                if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                k.disconnect();
                url = i(url, headerField);
                bArr = null;
                i = 1;
            }
            i3 = i4;
            i2 = 1;
        }
        return k;
    }

    public final HttpURLConnection k(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(8000);
        httpURLConnection.setReadTimeout(8000);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.g.a());
        hashMap.putAll(this.h.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = nl9.a;
        if (j == 0 && j2 == -1) {
            sb = null;
        } else {
            StringBuilder o = ljg.o("bytes=", j, "-");
            if (j2 != -1) {
                o.append((j + j2) - 1);
            }
            sb = o.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, sb);
        }
        String str2 = this.f;
        if (str2 != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = xe4.j;
        if (i == 1) {
            str = C4094gc.a;
        } else if (i == 2) {
            str = C4094gc.b;
        } else {
            if (i != 3) {
                zzl.s();
                return null;
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void l(long j) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int min = (int) Math.min(j, 4096L);
            InputStream inputStream = this.k;
            String str = nik.a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new oi9(2000, 1, new InterruptedIOException());
            }
            if (read == -1) {
                throw new oi9();
            }
            j -= read;
            c(read);
        }
    }

    @Override // defpackage.ge4
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.n;
            if (j != -1) {
                long j2 = j - this.o;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.k;
            String str = nik.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.o += read;
                c(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = nik.a;
            throw oi9.a(2, e);
        }
    }
}
