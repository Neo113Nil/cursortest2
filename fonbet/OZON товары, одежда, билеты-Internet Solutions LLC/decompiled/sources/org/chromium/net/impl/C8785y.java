package org.chromium.net.impl;

import android.net.http.HttpException;
import android.net.http.UrlRequest;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlResponseInfo;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.chromium.net.C;
import org.chromium.net.impl.G;

/* renamed from: org.chromium.net.impl.y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C8785y implements UrlRequest$Callback {

    /* renamed from: a, reason: collision with root package name */
    private final C.b f78951a;

    /* renamed from: b, reason: collision with root package name */
    private C8786z f78952b;

    public C8785y(C.b bVar) {
        Objects.requireNonNull(bVar, "Callback is required.");
        this.f78951a = bVar;
    }

    final void d(C8786z c8786z) {
        this.f78952b = c8786z;
    }

    public final void onCanceled(@NonNull UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        A i11 = A.i(urlResponseInfo);
        try {
            this.f78951a.a(this.f78952b, i11);
        } finally {
            this.f78952b.f(2, i11, null);
        }
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        A i11 = A.i(urlResponseInfo);
        org.chromium.net.f b11 = G.b(httpException);
        try {
            this.f78951a.b(this.f78952b, i11, b11);
        } finally {
            this.f78952b.f(1, i11, b11);
        }
    }

    public final void onReadCompleted(UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final ByteBuffer byteBuffer) throws Exception {
        G.a(new G.a() { // from class: org.chromium.net.impl.w
            @Override // org.chromium.net.impl.G.a
            public final void run() {
                UrlResponseInfo urlResponseInfo2 = urlResponseInfo;
                r1.f78951a.c(C8785y.this.f78952b, A.i(urlResponseInfo2), byteBuffer);
            }
        });
    }

    public final void onRedirectReceived(UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final String str) throws Exception {
        G.a(new G.a() { // from class: org.chromium.net.impl.x
            @Override // org.chromium.net.impl.G.a
            public final void run() {
                UrlResponseInfo urlResponseInfo2 = urlResponseInfo;
                r1.f78951a.d(C8785y.this.f78952b, A.i(urlResponseInfo2), str);
            }
        });
    }

    public final void onResponseStarted(UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) throws Exception {
        G.a(new G.a() { // from class: org.chromium.net.impl.v
            @Override // org.chromium.net.impl.G.a
            public final void run() {
                r0.f78951a.e(C8785y.this.f78952b, A.i(urlResponseInfo));
            }
        });
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        A i11 = A.i(urlResponseInfo);
        try {
            this.f78951a.f(this.f78952b, i11);
        } finally {
            this.f78952b.f(0, i11, null);
        }
    }
}
