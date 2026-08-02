package com.vk.im.engine.exceptions;

import com.vk.api.sdk.exceptions.VKApiException;
import xsna.lhg;
import xsna.vu5;

/* compiled from: ApiLongPollException.kt */
/* loaded from: classes2.dex */
public final class ApiLongPollException extends VKApiException {
    public static final long serialVersionUID = 1447966795082531724L;
    private final int code;

    public ApiLongPollException(int i) {
        super(lhg.a(i, "ApiLongPollException: "));
        this.code = i;
    }

    public final boolean d() {
        int i = this.code;
        return i == 1 || i == 2 || i == 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApiLongPollException) && this.code == ((ApiLongPollException) obj).code;
    }

    public final int hashCode() {
        return Integer.hashCode(this.code);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return vu5.b(new StringBuilder("ApiLongPollException(code="), this.code, ')');
    }
}
