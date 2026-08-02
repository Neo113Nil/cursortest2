package com.unity3d.services.core.extensions;

/* compiled from: TaskExtensions.kt */
/* loaded from: classes14.dex */
public final class AbortRetryException extends Exception {
    private final String reason;

    public AbortRetryException(String str) {
        super(str);
        this.reason = str;
    }
}
