package com.playtika.pras.c;

/* loaded from: classes7.dex */
public abstract class f {
    public static synchronized void a() {
        synchronized (f.class) {
            throw new IllegalStateException("f".concat(" is not initialized, call init() method first."));
        }
    }
}
