package com.ironsource;

import defpackage.l98;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.h4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4104h4 {
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
            Method[] declaredMethods = l98.class.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (Intrinsics.c(method.getName(), "chunked") && method.getParameterCount() == 2) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @NotNull
    public final String a() {
        return d() ? "1.9.0+" : c() ? "1.6.0-1.8.x" : b() ? "1.3.0-1.5.x" : "<1.3.0";
    }
}
