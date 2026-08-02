package com.vk.feed.core.parse;

import xsna.epx;
import xsna.oq;

/* compiled from: NewsfeedParseException.kt */
/* loaded from: classes18.dex */
public final class NewsfeedParseException extends Exception {
    private final Throwable th;

    public NewsfeedParseException(Throwable th) {
        super(th);
        this.th = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NewsfeedParseException) && epx.f(this.th, ((NewsfeedParseException) obj).th);
    }

    public final int hashCode() {
        return this.th.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return oq.c(new StringBuilder("NewsfeedParseException(th="), this.th, ')');
    }
}
