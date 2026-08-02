package com.vk.api.sdk.exceptions;

import com.vk.movika.sdk.base.model.history.b;

/* compiled from: VKInternalServerErrorException.kt */
/* loaded from: classes.dex */
public class VKInternalServerErrorException extends Exception {
    private final int httpStatus;

    public VKInternalServerErrorException(int i, String str) {
        super(b.b(i, "Server returned httpStatusCode=", " with body: ", str));
        this.httpStatus = i;
    }

    public final int d() {
        return this.httpStatus;
    }
}
