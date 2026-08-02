package com.vk.init.network.exceptions;

import java.io.IOException;

/* compiled from: RetryRequestException.kt */
/* loaded from: classes2.dex */
public final class RetryRequestException extends IOException {
    private final String message;

    public RetryRequestException(String str) {
        super(str);
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
