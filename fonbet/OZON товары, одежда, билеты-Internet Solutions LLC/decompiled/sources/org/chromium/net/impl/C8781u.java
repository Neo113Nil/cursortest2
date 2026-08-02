package org.chromium.net.impl;

import android.net.http.UploadDataSink;
import java.net.HttpRetryException;

/* renamed from: org.chromium.net.impl.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C8781u extends org.chromium.net.h {

    /* renamed from: a, reason: collision with root package name */
    private final UploadDataSink f78942a;

    C8781u(UploadDataSink uploadDataSink) {
        this.f78942a = uploadDataSink;
    }

    @Override // org.chromium.net.h
    public final void a() {
        this.f78942a.onReadSucceeded(false);
    }

    @Override // org.chromium.net.h
    public final void b(HttpRetryException httpRetryException) {
        this.f78942a.onRewindError(httpRetryException);
    }

    @Override // org.chromium.net.h
    public final void c() {
        this.f78942a.onRewindSucceeded();
    }
}
