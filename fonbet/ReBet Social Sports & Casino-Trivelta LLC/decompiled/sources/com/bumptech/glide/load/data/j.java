package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes2.dex */
public class j implements d {

    /* renamed from: g, reason: collision with root package name */
    public static final b f29678g = new a();

    /* renamed from: a, reason: collision with root package name */
    public final B4.h f29679a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29680b;

    /* renamed from: c, reason: collision with root package name */
    public final b f29681c;

    /* renamed from: d, reason: collision with root package name */
    public HttpURLConnection f29682d;

    /* renamed from: e, reason: collision with root package name */
    public InputStream f29683e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f29684f;

    public static class a implements b {
        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    public interface b {
        HttpURLConnection a(URL url);
    }

    public j(B4.h hVar, int i10) {
        this(hVar, i10, f29678g);
    }

    public static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            Log.isLoggable("HttpUrlFetcher", 3);
            return -1;
        }
    }

    public static boolean h(int i10) {
        return i10 / 100 == 2;
    }

    public static boolean i(int i10) {
        return i10 / 100 == 3;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f29683e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f29682d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f29682d = null;
    }

    public final HttpURLConnection c(URL url, Map map) {
        try {
            HttpURLConnection a10 = this.f29681c.a(url);
            for (Map.Entry entry : map.entrySet()) {
                a10.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            a10.setConnectTimeout(this.f29680b);
            a10.setReadTimeout(this.f29680b);
            a10.setUseCaches(false);
            a10.setDoInput(true);
            a10.setInstanceFollowRedirects(false);
            return a10;
        } catch (IOException e10) {
            throw new com.bumptech.glide.load.e("URL.openConnection threw", 0, e10);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f29684f = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.h hVar, d.a aVar) {
        long b10 = com.bumptech.glide.util.g.b();
        try {
            try {
                aVar.f(j(this.f29679a.i(), 0, null, this.f29679a.e()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    com.bumptech.glide.util.g.a(b10);
                }
            } catch (IOException e10) {
                Log.isLoggable("HttpUrlFetcher", 3);
                aVar.c(e10);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    com.bumptech.glide.util.g.a(b10);
                }
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                com.bumptech.glide.util.g.a(b10);
            }
            throw th2;
        }
    }

    public final InputStream g(HttpURLConnection httpURLConnection) {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f29683e = com.bumptech.glide.util.c.k(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.f29683e = httpURLConnection.getInputStream();
            }
            return this.f29683e;
        } catch (IOException e10) {
            throw new com.bumptech.glide.load.e("Failed to obtain InputStream", f(httpURLConnection), e10);
        }
    }

    public final InputStream j(URL url, int i10, URL url2, Map map) {
        if (i10 >= 5) {
            throw new com.bumptech.glide.load.e("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new com.bumptech.glide.load.e("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection c10 = c(url, map);
        this.f29682d = c10;
        try {
            c10.connect();
            this.f29683e = this.f29682d.getInputStream();
            if (this.f29684f) {
                return null;
            }
            int f10 = f(this.f29682d);
            if (h(f10)) {
                return g(this.f29682d);
            }
            if (!i(f10)) {
                if (f10 == -1) {
                    throw new com.bumptech.glide.load.e(f10);
                }
                try {
                    throw new com.bumptech.glide.load.e(this.f29682d.getResponseMessage(), f10);
                } catch (IOException e10) {
                    throw new com.bumptech.glide.load.e("Failed to get a response message", f10, e10);
                }
            }
            String headerField = this.f29682d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new com.bumptech.glide.load.e("Received empty or null redirect url", f10);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i10 + 1, url, map);
            } catch (MalformedURLException e11) {
                throw new com.bumptech.glide.load.e("Bad redirect url: " + headerField, f10, e11);
            }
        } catch (IOException e12) {
            throw new com.bumptech.glide.load.e("Failed to connect or obtain data", f(this.f29682d), e12);
        }
    }

    public j(B4.h hVar, int i10, b bVar) {
        this.f29679a = hVar;
        this.f29680b = i10;
        this.f29681c = bVar;
    }
}
