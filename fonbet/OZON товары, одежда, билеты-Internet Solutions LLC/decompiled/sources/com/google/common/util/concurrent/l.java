package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* loaded from: classes.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Object f59204a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final String f59205b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Logger f59206c;

    l(Class<?> cls) {
        this.f59205b = cls.getName();
    }

    final Logger a() {
        Logger logger = this.f59206c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f59204a) {
            try {
                Logger logger2 = this.f59206c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f59205b);
                this.f59206c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
