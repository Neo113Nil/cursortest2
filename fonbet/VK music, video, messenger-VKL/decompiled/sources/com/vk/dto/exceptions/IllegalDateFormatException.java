package com.vk.dto.exceptions;

import xsna.epx;
import xsna.m5k;
import xsna.oq;
import xsna.t33;

/* compiled from: IllegalDateFormatException.kt */
/* loaded from: classes18.dex */
public final class IllegalDateFormatException extends IllegalArgumentException {
    public static final long serialVersionUID = 8479387458275842941L;
    private final Throwable cause;
    private final String dateFormat;

    public IllegalDateFormatException(String str, Throwable th) {
        super(m5k.b(th, t33.a("Illegal date format: ", str, ". Error: ")), th);
        this.dateFormat = str;
        this.cause = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IllegalDateFormatException)) {
            return false;
        }
        IllegalDateFormatException illegalDateFormatException = (IllegalDateFormatException) obj;
        return epx.f(this.dateFormat, illegalDateFormatException.dateFormat) && epx.f(this.cause, illegalDateFormatException.cause);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    public final int hashCode() {
        return this.cause.hashCode() + (this.dateFormat.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("IllegalDateFormatException(dateFormat=");
        sb.append(this.dateFormat);
        sb.append(", cause=");
        return oq.c(sb, this.cause, ')');
    }
}
