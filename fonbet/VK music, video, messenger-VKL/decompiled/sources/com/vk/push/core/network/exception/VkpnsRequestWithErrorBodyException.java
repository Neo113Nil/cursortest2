package com.vk.push.core.network.exception;

/* compiled from: VkpnsRequestWithErrorBodyException.kt */
/* loaded from: classes5.dex */
public final class VkpnsRequestWithErrorBodyException extends Exception {
    private final int code;

    public VkpnsRequestWithErrorBodyException(String str, int i) {
        super("Request ended with: ".concat(str));
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }
}
