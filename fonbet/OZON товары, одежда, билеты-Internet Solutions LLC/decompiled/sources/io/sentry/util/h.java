package io.sentry.util;

import io.sentry.E;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h {
    public static E a(Object obj) {
        E e11 = new E();
        e11.k(obj, "sentry:typeCheckHint");
        return e11;
    }

    public static boolean b(@NotNull E e11, @NotNull Class<?> cls) {
        return cls.isInstance(e11.d("sentry:typeCheckHint"));
    }

    public static boolean c(@NotNull E e11) {
        return Boolean.TRUE.equals(e11.e(Boolean.class, "sentry:isFromHybridSdk"));
    }

    public static boolean d(@NotNull E e11) {
        return !(io.sentry.hints.e.class.isInstance(e11.d("sentry:typeCheckHint")) || io.sentry.hints.c.class.isInstance(e11.d("sentry:typeCheckHint"))) || io.sentry.hints.b.class.isInstance(e11.d("sentry:typeCheckHint"));
    }
}
