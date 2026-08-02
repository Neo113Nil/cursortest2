package org.chromium.net.impl;

import android.net.http.QuicException;

/* loaded from: classes10.dex */
final class r extends org.chromium.net.v {

    /* renamed from: a, reason: collision with root package name */
    private final C8776o f78938a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    r(QuicException quicException) {
        super(r0, quicException);
        String message;
        message = quicException.getMessage();
        this.f78938a = new C8776o(quicException, true);
    }

    @Override // org.chromium.net.r
    public final int a() {
        return this.f78938a.a();
    }
}
