package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.C4094gc;
import com.mbridge.msdk.foundation.download.Command;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xp4 extends j21 {
    public final ti9 e;
    public final ti9 f;
    public HttpURLConnection g;
    public InputStream h;
    public boolean i;
    public int j;
    public long k;
    public long l;

    public xp4(ti9 ti9Var) {
        super(true);
        this.e = ti9Var;
        this.f = new ti9(0);
    }

    public static void i(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection == null || (i = lik.a) < 19 || i > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.qe4
    public final void close() {
        try {
            InputStream inputStream = this.h;
            if (inputStream != null) {
                long j = this.k;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.l;
                }
                i(this.g, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = lik.a;
                    throw new ni9(2000, 3, e);
                }
            }
        } finally {
            this.h = null;
            g();
            if (this.i) {
                this.i = false;
                d();
            }
        }
    }

    public final void g() {
        HttpURLConnection httpURLConnection = this.g;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                m6k.C("Unexpected error while disconnecting", e);
            }
            this.g = null;
        }
    }

    @Override // defpackage.qe4
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.g;
        return httpURLConnection == null ? awf.g : new wp4(httpURLConnection.getHeaderFields(), 0);
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection h(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(8000);
        httpURLConnection.setReadTimeout(8000);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.e.a());
        hashMap.putAll(this.f.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = ml9.a;
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
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = we4.h;
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

    public final void j(long j) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int min = (int) Math.min(j, 4096L);
            InputStream inputStream = this.h;
            int i = lik.a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new ni9(2000, 1, new InterruptedIOException());
            }
            if (read == -1) {
                throw new ni9();
            }
            j -= read;
            b(read);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014e  */
    @Override // defpackage.qe4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k(we4 we4Var) {
        long parseLong;
        long parseLong2;
        this.l = 0L;
        this.k = 0L;
        e();
        try {
            HttpURLConnection h = h(new URL(we4Var.a.toString()), we4Var.b, we4Var.c, we4Var.e, we4Var.f, (we4Var.g & 1) == 1, true, we4Var.d);
            long j = we4Var.f;
            long j2 = we4Var.e;
            this.g = h;
            this.j = h.getResponseCode();
            h.getResponseMessage();
            int i = this.j;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = h.getHeaderFields();
                if (this.j == 416) {
                    String headerField = h.getHeaderField("Content-Range");
                    Pattern pattern = ml9.a;
                    if (!TextUtils.isEmpty(headerField)) {
                        Matcher matcher = ml9.b.matcher(headerField);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            group.getClass();
                            parseLong = Long.parseLong(group);
                            if (j2 == parseLong) {
                                this.i = true;
                                f(we4Var);
                                if (j != -1) {
                                    return j;
                                }
                                return 0L;
                            }
                        }
                    }
                    parseLong = -1;
                    if (j2 == parseLong) {
                    }
                }
                InputStream errorStream = h.getErrorStream();
                try {
                    if (errorStream != null) {
                        int i2 = lik.a;
                        byte[] bArr = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int read = errorStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byteArrayOutputStream.toByteArray();
                    } else {
                        int i3 = lik.a;
                    }
                } catch (IOException unused) {
                    int i4 = lik.a;
                }
                g();
                throw new ri9(this.j, this.j == 416 ? new se4(2008) : null, headerFields);
            }
            h.getContentType();
            if (this.j != 200 || j2 == 0) {
                j2 = 0;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(h.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                this.k = j;
            } else if (j != -1) {
                this.k = j;
            } else {
                String headerField2 = h.getHeaderField("Content-Length");
                String headerField3 = h.getHeaderField("Content-Range");
                Pattern pattern2 = ml9.a;
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        parseLong2 = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        m6k.B();
                    }
                    if (!TextUtils.isEmpty(headerField3)) {
                        Matcher matcher2 = ml9.a.matcher(headerField3);
                        if (matcher2.matches()) {
                            try {
                                String group2 = matcher2.group(2);
                                group2.getClass();
                                long parseLong3 = Long.parseLong(group2);
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                long parseLong4 = (parseLong3 - Long.parseLong(group3)) + 1;
                                if (parseLong2 < 0) {
                                    parseLong2 = parseLong4;
                                } else if (parseLong2 != parseLong4) {
                                    m6k.f0();
                                    parseLong2 = Math.max(parseLong2, parseLong4);
                                }
                            } catch (NumberFormatException unused3) {
                                m6k.B();
                            }
                        }
                    }
                    this.k = parseLong2 == -1 ? parseLong2 - j2 : -1L;
                }
                parseLong2 = -1;
                if (!TextUtils.isEmpty(headerField3)) {
                }
                this.k = parseLong2 == -1 ? parseLong2 - j2 : -1L;
            }
            try {
                this.h = h.getInputStream();
                if (equalsIgnoreCase) {
                    this.h = new GZIPInputStream(this.h);
                }
                this.i = true;
                f(we4Var);
                try {
                    j(j2);
                    return this.k;
                } catch (IOException e) {
                    g();
                    if (e instanceof ni9) {
                        throw ((ni9) e);
                    }
                    throw new ni9(2000, 1, e);
                }
            } catch (IOException e2) {
                g();
                throw new ni9(2000, 1, e2);
            }
        } catch (IOException e3) {
            g();
            throw ni9.a(1, e3);
        }
    }

    @Override // defpackage.fe4, defpackage.ge4
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.k;
            if (j != -1) {
                long j2 = j - this.l;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.h;
            int i3 = lik.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.l += read;
                b(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            int i4 = lik.a;
            throw ni9.a(2, e);
        }
    }
}
