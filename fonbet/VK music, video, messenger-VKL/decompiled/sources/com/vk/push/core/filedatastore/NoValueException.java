package com.vk.push.core.filedatastore;

import xsna.zcl;

/* compiled from: Exceptions.kt */
/* loaded from: classes.dex */
public final class NoValueException extends IllegalStateException {
    private final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public NoValueException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public NoValueException(String str) {
        super(str);
        this.message = str;
    }

    public /* synthetic */ NoValueException(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? "No value found" : str);
    }
}
