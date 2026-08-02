package com.facebook.common.util;

/* loaded from: classes2.dex */
public class a extends Exception {
    public a(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
