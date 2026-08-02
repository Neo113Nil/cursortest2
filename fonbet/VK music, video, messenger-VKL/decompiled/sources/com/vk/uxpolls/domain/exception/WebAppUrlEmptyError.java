package com.vk.uxpolls.domain.exception;

import xsna.epx;
import xsna.ho8;

/* compiled from: WebAppUrlEmptyError.kt */
/* loaded from: classes6.dex */
public final class WebAppUrlEmptyError extends Exception {
    private final String message = "Retrieve webapp first";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WebAppUrlEmptyError) && epx.f(this.message, ((WebAppUrlEmptyError) obj).message);
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
        return ho8.a(new StringBuilder("WebAppUrlEmptyError(message="), this.message, ')');
    }
}
