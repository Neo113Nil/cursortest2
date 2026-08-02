package org.chromium.base;

/* loaded from: classes10.dex */
public class JavaUtils {
    private JavaUtils() {
    }

    public static <T extends Throwable> RuntimeException throwUnchecked(Throwable t) throws Throwable {
        throw t;
    }
}
