package com.vk.api.sdk.exceptions;

import com.vk.dto.common.id.UserId;

/* compiled from: UnableToRefreshAccessTokenException.kt */
/* loaded from: classes15.dex */
public final class UnableToRefreshAccessTokenException extends RuntimeException {
    private final boolean isCritical;
    private final UserId userId;

    public UnableToRefreshAccessTokenException(boolean z, UserId userId, String str, Throwable th) {
        super(str, th);
        this.isCritical = z;
        this.userId = userId;
    }

    public final UserId d() {
        return this.userId;
    }

    public final boolean g() {
        return this.isCritical;
    }
}
