package com.vk.im.engine.exception;

import xsna.epx;
import xsna.ho8;

/* compiled from: ImEngineIncorrectUsage.kt */
/* loaded from: classes2.dex */
public final class ImEngineIncorrectUsage extends RuntimeException {
    private final String message;

    public ImEngineIncorrectUsage(String str) {
        super(str);
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImEngineIncorrectUsage) && epx.f(this.message, ((ImEngineIncorrectUsage) obj).message);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        return this.message.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return ho8.a(new StringBuilder("ImEngineIncorrectUsage(message="), this.message, ')');
    }
}
