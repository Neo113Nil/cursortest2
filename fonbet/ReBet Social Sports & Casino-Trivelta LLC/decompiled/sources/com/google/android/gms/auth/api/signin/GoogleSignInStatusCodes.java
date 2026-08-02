package com.google.android.gms.auth.api.signin;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.c;

@Deprecated
/* loaded from: classes2.dex */
public final class GoogleSignInStatusCodes extends c {
    public static final int SIGN_IN_CANCELLED = 12501;
    public static final int SIGN_IN_CURRENTLY_IN_PROGRESS = 12502;
    public static final int SIGN_IN_FAILED = 12500;

    private GoogleSignInStatusCodes() {
    }

    @NonNull
    public static String getStatusCodeString(int i10) {
        switch (i10) {
            case SIGN_IN_FAILED /* 12500 */:
                return "A non-recoverable sign in failure occurred";
            case SIGN_IN_CANCELLED /* 12501 */:
                return "Sign in action cancelled";
            case SIGN_IN_CURRENTLY_IN_PROGRESS /* 12502 */:
                return "Sign-in in progress";
            default:
                return c.getStatusCodeString(i10);
        }
    }
}
