package com.vk.network.eventhub.impl.exception;

import com.vk.network.eventhub.api.exception.EventHubServiceException;
import xsna.epx;
import xsna.ho8;

/* compiled from: InvalidTokenException.kt */
/* loaded from: classes3.dex */
public final class InvalidTokenException extends EventHubServiceException {
    private final String message;

    public InvalidTokenException(String str) {
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvalidTokenException) && epx.f(this.message, ((InvalidTokenException) obj).message);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        String str = this.message;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return ho8.a(new StringBuilder("InvalidTokenException(message="), this.message, ')');
    }
}
