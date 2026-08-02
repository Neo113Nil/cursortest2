package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ll9 implements xd4 {
    public final qz8 a;
    public final int b;
    public HttpURLConnection c;
    public InputStream d;
    public volatile boolean e;

    public ll9(qz8 qz8Var, int i) {
        this.a = qz8Var;
        this.b = i;
    }

    @Override // defpackage.xd4
    public final void a() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.xd4
    public final void b(k7f k7fVar, wd4 wd4Var) {
        qz8 qz8Var = this.a;
        int i = vib.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            try {
                URL url = qz8Var.f;
                if (url == null) {
                    url = new URL(qz8Var.d());
                    qz8Var.f = url;
                }
                wd4Var.l(d(url, 0, null, qz8Var.b.a()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (IOException e) {
                wd4Var.d(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            throw th;
        }
    }

    @Override // defpackage.xd4
    public final Class c() {
        return InputStream.class;
    }

    @Override // defpackage.xd4
    public final void cancel() {
        this.e = true;
    }

    public final InputStream d(URL url, int i, URL url2, Map map) {
        int i2;
        int i3 = -1;
        if (i >= 5) {
            throw new jz2(-1, (IOException) null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new jz2(-1, (IOException) null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i4 = this.b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i4);
            httpURLConnection.setReadTimeout(i4);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                try {
                    i2 = this.c.getResponseCode();
                } catch (IOException unused2) {
                    i2 = -1;
                }
                int i5 = i2 / 100;
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i2 == -1) {
                            throw new jz2(i2, (IOException) null, "Http request failed");
                        }
                        try {
                            throw new jz2(i2, (IOException) null, this.c.getResponseMessage());
                        } catch (IOException e) {
                            throw new jz2(i2, e, "Failed to get a response message");
                        }
                    }
                    String headerField = this.c.getHeaderField("Location");
                    if (TextUtils.isEmpty(headerField)) {
                        throw new jz2(i2, (IOException) null, "Received empty or null redirect url");
                    }
                    try {
                        URL url3 = new URL(url, headerField);
                        a();
                        return d(url3, i + 1, url, map);
                    } catch (MalformedURLException e2) {
                        throw new jz2(i2, e2, dmi.q("Bad redirect url: ", headerField));
                    }
                }
                HttpURLConnection httpURLConnection2 = this.c;
                try {
                    if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                        cp3 cp3Var = new cp3(httpURLConnection2.getContentLength(), httpURLConnection2.getInputStream());
                        this.d = cp3Var;
                        return cp3Var;
                    }
                    if (Log.isLoggable("HttpUrlFetcher", 3)) {
                        httpURLConnection2.getContentEncoding();
                    }
                    InputStream inputStream = httpURLConnection2.getInputStream();
                    this.d = inputStream;
                    return inputStream;
                } catch (IOException e3) {
                    try {
                        i3 = httpURLConnection2.getResponseCode();
                    } catch (IOException unused3) {
                    }
                    throw new jz2(i3, e3, "Failed to obtain InputStream");
                }
            } catch (IOException e4) {
                try {
                    i3 = this.c.getResponseCode();
                } catch (IOException unused4) {
                }
                throw new jz2(i3, e4, "Failed to connect or obtain data");
            }
        } catch (IOException e5) {
            throw new jz2(0, e5, "URL.openConnection threw");
        }
    }

    @Override // defpackage.xd4
    public final int e() {
        return 2;
    }
}
