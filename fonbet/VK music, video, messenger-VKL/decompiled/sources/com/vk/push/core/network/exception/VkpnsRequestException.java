package com.vk.push.core.network.exception;

/* compiled from: VkpnsRequestException.kt */
/* loaded from: classes5.dex */
public final class VkpnsRequestException extends Exception {
    private final int httpStatusCode;
    private final String message;

    public VkpnsRequestException(String str, int i) {
        super(str);
        this.message = str;
        this.httpStatusCode = i;
    }

    public final int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
