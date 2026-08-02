package com.vk.superapp.api.internal.oauthrequests;

/* compiled from: EmptyDataException.kt */
/* loaded from: classes6.dex */
public final class EmptyDataException extends IllegalStateException {
    private final String message;

    public EmptyDataException(String str) {
        super(str);
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
