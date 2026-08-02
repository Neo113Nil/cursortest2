package io.sentry.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface f {
    default Double a(@NotNull String str) {
        String f7 = f(str);
        if (f7 == null) {
            return null;
        }
        try {
            return Double.valueOf(f7);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @NotNull
    default List<String> b(@NotNull String str) {
        String f7 = f(str);
        return f7 != null ? Arrays.asList(f7.split(",")) : Collections.EMPTY_LIST;
    }

    default Boolean c(@NotNull String str) {
        String f7 = f(str);
        if (f7 != null) {
            return Boolean.valueOf(f7);
        }
        return null;
    }

    default List<String> d(@NotNull String str) {
        String f7 = f(str);
        if (f7 != null) {
            return Arrays.asList(f7.split(","));
        }
        return null;
    }

    default Long e(@NotNull String str) {
        String f7 = f(str);
        if (f7 == null) {
            return null;
        }
        try {
            return Long.valueOf(f7);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    String f(@NotNull String str);

    @NotNull
    Map getMap();
}
