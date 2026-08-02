package com.unity3d.ads;

/* compiled from: UnityAdsError.kt */
/* loaded from: classes14.dex */
public final class UnityAdsError {
    private final int code;
    private final String message;

    public UnityAdsError(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }
}
