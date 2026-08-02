package io.sentry.util;

import io.sentry.C7133d;
import io.sentry.J0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class y {
    @NotNull
    public static C7133d a(C7133d c7133d, Boolean bool, Double d11, Double d12) {
        if (c7133d == null) {
            c7133d = new C7133d(J0.e());
        }
        if (c7133d.d() == null) {
            Double e11 = c7133d.e();
            if (e11 != null) {
                d11 = e11;
            }
            c7133d.h(t.b(d12, d11, bool));
        }
        return c7133d;
    }
}
