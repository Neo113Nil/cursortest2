package com.vk.api.sdk.exceptions;

/* compiled from: InternalServerErrorOccurredException.kt */
/* loaded from: classes15.dex */
public final class InternalServerErrorOccurredException extends VKApiException {
    private final String reason;
    private final String section;

    public InternalServerErrorOccurredException(String str, String str2, String str3) {
        super(str);
        this.section = str2;
        this.reason = str3;
    }

    public final String d() {
        return this.reason;
    }

    public final String g() {
        return this.section;
    }
}
