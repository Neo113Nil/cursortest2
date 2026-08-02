package com.unity3d.ads.core.data.model.exception;

/* compiled from: LoadException.kt */
/* loaded from: classes14.dex */
public final class LoadException extends Exception {
    private final int errorCode;

    public LoadException(int i, String str) {
        super(str);
        this.errorCode = i;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
