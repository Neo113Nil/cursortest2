package com.google.gson.internal;

/* loaded from: classes9.dex */
final class w extends x {
    w() {
    }

    @Override // com.google.gson.internal.x
    public final <T> T a(Class<T> cls) {
        throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
    }
}
