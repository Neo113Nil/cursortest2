package io.sentry.util;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class p {
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void b(Object obj, @NotNull String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
