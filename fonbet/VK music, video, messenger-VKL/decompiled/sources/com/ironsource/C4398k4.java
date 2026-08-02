package com.ironsource;

import java.lang.reflect.Method;
import xsna.epx;
import xsna.rsr;

/* renamed from: com.ironsource.k4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4398k4 {
    private final boolean b() {
        return true;
    }

    private final boolean c() {
        try {
            Class.forName("kotlinx.coroutines.test.TestScope");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private final boolean d() {
        try {
            for (Method method : rsr.class.getDeclaredMethods()) {
                if (epx.f(method.getName(), "chunked") && method.getParameterCount() == 2) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final String a() {
        return d() ? "1.9.0+" : c() ? "1.6.0-1.8.x" : b() ? "1.3.0-1.5.x" : "<1.3.0";
    }
}
