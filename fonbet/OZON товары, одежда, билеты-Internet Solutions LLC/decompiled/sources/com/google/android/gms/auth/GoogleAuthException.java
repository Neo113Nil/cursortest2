package com.google.android.gms.auth;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class GoogleAuthException extends Exception {
    public GoogleAuthException() {
    }

    public GoogleAuthException(String str) {
        super(str);
    }

    public GoogleAuthException(String str, @NonNull Throwable th2) {
        super(str, th2);
    }

    public GoogleAuthException(@NonNull Throwable th2) {
        super(th2);
    }
}
