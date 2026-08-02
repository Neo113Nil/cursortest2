package com.vk.uxpolls.domain.exception;

import xsna.epx;
import xsna.ho8;

/* compiled from: RetrievePollsError.kt */
/* loaded from: classes6.dex */
public final class RetrievePollsError extends Exception {
    private final String message;

    public RetrievePollsError(String str) {
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RetrievePollsError) && epx.f(this.message, ((RetrievePollsError) obj).message);
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
        return ho8.a(new StringBuilder("RetrievePollsError(message="), this.message, ')');
    }
}
