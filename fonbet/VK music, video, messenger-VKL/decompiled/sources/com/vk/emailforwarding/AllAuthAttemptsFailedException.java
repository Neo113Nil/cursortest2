package com.vk.emailforwarding;

import xsna.epx;
import xsna.oq;

/* compiled from: AllAuthAttemptsFailedException.kt */
/* loaded from: classes18.dex */
public final class AllAuthAttemptsFailedException extends Exception {
    private final Throwable satAuthCause;
    private final Throwable silentAuthCause;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllAuthAttemptsFailedException)) {
            return false;
        }
        AllAuthAttemptsFailedException allAuthAttemptsFailedException = (AllAuthAttemptsFailedException) obj;
        return epx.f(this.silentAuthCause, allAuthAttemptsFailedException.silentAuthCause) && epx.f(this.satAuthCause, allAuthAttemptsFailedException.satAuthCause);
    }

    public final int hashCode() {
        return this.satAuthCause.hashCode() + (this.silentAuthCause.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("AllAuthAttemptsFailedException(silentAuthCause=");
        sb.append(this.silentAuthCause);
        sb.append(", satAuthCause=");
        return oq.c(sb, this.satAuthCause, ')');
    }
}
