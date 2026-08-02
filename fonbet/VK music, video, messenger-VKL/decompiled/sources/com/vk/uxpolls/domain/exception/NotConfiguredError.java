package com.vk.uxpolls.domain.exception;

import xsna.epx;
import xsna.ho8;

/* compiled from: NotConfiguredError.kt */
/* loaded from: classes6.dex */
public final class NotConfiguredError extends Exception {
    private final String message;

    public NotConfiguredError(String str) {
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotConfiguredError) && epx.f(this.message, ((NotConfiguredError) obj).message);
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
        return ho8.a(new StringBuilder("NotConfiguredError(message="), this.message, ')');
    }
}
