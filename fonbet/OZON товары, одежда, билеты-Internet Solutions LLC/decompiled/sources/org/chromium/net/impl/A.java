package org.chromium.net.impl;

import android.net.http.HeaderBlock;
import android.net.http.UrlResponseInfo;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
final class A extends org.chromium.net.D {

    /* renamed from: a, reason: collision with root package name */
    private final UrlResponseInfo f78713a;

    private A(UrlResponseInfo urlResponseInfo) {
        this.f78713a = urlResponseInfo;
    }

    public static A i(UrlResponseInfo urlResponseInfo) {
        if (urlResponseInfo == null) {
            return null;
        }
        try {
            urlResponseInfo.getUrl();
            return new A(urlResponseInfo);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // org.chromium.net.D
    public final Map<String, List<String>> a() {
        HeaderBlock headers;
        Map<String, List<String>> asMap;
        headers = this.f78713a.getHeaders();
        asMap = headers.getAsMap();
        return asMap;
    }

    @Override // org.chromium.net.D
    public final int b() {
        int httpStatusCode;
        httpStatusCode = this.f78713a.getHttpStatusCode();
        return httpStatusCode;
    }

    @Override // org.chromium.net.D
    public final String c() {
        String httpStatusText;
        httpStatusText = this.f78713a.getHttpStatusText();
        return httpStatusText;
    }

    @Override // org.chromium.net.D
    public final String d() {
        String negotiatedProtocol;
        negotiatedProtocol = this.f78713a.getNegotiatedProtocol();
        return negotiatedProtocol;
    }

    @Override // org.chromium.net.D
    public final String e() {
        return ":0";
    }

    @Override // org.chromium.net.D
    public final long f() {
        long receivedByteCount;
        receivedByteCount = this.f78713a.getReceivedByteCount();
        return receivedByteCount;
    }

    @Override // org.chromium.net.D
    public final String g() {
        String url;
        url = this.f78713a.getUrl();
        return url;
    }

    @Override // org.chromium.net.D
    public final boolean h() {
        boolean wasCached;
        wasCached = this.f78713a.wasCached();
        return wasCached;
    }
}
