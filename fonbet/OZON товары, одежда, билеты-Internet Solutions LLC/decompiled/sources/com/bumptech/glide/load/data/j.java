package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p6.C8863c;

/* loaded from: classes8.dex */
public final class j implements d<InputStream> {

    /* renamed from: f, reason: collision with root package name */
    static final a f57634f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Z5.h f57635a;

    /* renamed from: b, reason: collision with root package name */
    private final int f57636b;

    /* renamed from: c, reason: collision with root package name */
    private HttpURLConnection f57637c;

    /* renamed from: d, reason: collision with root package name */
    private InputStream f57638d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f57639e;

    private static class a {
    }

    public j(Z5.h hVar, int i11) {
        this.f57635a = hVar;
        this.f57636b = i11;
    }

    private static int a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e11) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e11);
            return -1;
        }
    }

    private InputStream b(URL url, int i11, URL url2, Map<String, String> map) throws T5.e {
        if (i11 >= 5) {
            throw new T5.e("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new T5.e("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            int i12 = this.f57636b;
            httpURLConnection.setConnectTimeout(i12);
            httpURLConnection.setReadTimeout(i12);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f57637c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f57638d = this.f57637c.getInputStream();
                if (this.f57639e) {
                    return null;
                }
                int a11 = a(this.f57637c);
                int i13 = a11 / 100;
                if (i13 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f57637c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f57638d = C8863c.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f57638d = httpURLConnection2.getInputStream();
                        }
                        return this.f57638d;
                    } catch (IOException e11) {
                        throw new T5.e("Failed to obtain InputStream", a(httpURLConnection2), e11);
                    }
                }
                if (i13 != 3) {
                    if (a11 == -1) {
                        throw new T5.e("Http request failed", a11, null);
                    }
                    try {
                        throw new T5.e(this.f57637c.getResponseMessage(), a11, null);
                    } catch (IOException e12) {
                        throw new T5.e("Failed to get a response message", a11, e12);
                    }
                }
                String headerField = this.f57637c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new T5.e("Received empty or null redirect url", a11, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    cleanup();
                    return b(url3, i11 + 1, url, map);
                } catch (MalformedURLException e13) {
                    throw new T5.e(Nk.a.b("Bad redirect url: ", headerField), a11, e13);
                }
            } catch (IOException e14) {
                throw new T5.e("Failed to connect or obtain data", a(this.f57637c), e14);
            }
        } catch (IOException e15) {
            throw new T5.e("URL.openConnection threw", 0, e15);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f57639e = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cleanup() {
        InputStream inputStream = this.f57638d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f57637c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f57637c = null;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public final Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public final T5.a getDataSource() {
        return T5.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void loadData(@NonNull com.bumptech.glide.i iVar, @NonNull d.a<? super InputStream> aVar) {
        Z5.h hVar = this.f57635a;
        int i11 = p6.g.f80269b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                aVar.a(b(hVar.e(), 0, null, hVar.b()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + p6.g.a(elapsedRealtimeNanos));
                }
            } catch (IOException e11) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e11);
                }
                aVar.onLoadFailed(e11);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + p6.g.a(elapsedRealtimeNanos));
                }
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + p6.g.a(elapsedRealtimeNanos));
            }
            throw th2;
        }
    }
}
