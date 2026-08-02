package org.chromium.net.impl;

import android.net.http.NetworkException;

/* renamed from: org.chromium.net.impl.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C8776o extends org.chromium.net.r {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkException f78937a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    C8776o(NetworkException networkException, boolean z11) {
        super(r0, networkException);
        String message;
        message = networkException.getMessage();
        this.f78937a = networkException;
        if (!z11 && C2.T.d(networkException)) {
            throw new IllegalArgumentException("Translating QuicException as NetworkException results in loss of information. Make sure you handle QuicException first. See the stacktrace for where the translation is being performed, and the cause for the exception being translated.", networkException);
        }
    }

    @Override // org.chromium.net.r
    public final int a() {
        int errorCode;
        errorCode = this.f78937a.getErrorCode();
        return errorCode;
    }
}
