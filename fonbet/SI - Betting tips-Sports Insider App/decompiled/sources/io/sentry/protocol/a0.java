package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public enum a0 implements c2 {
    AUTO,
    ALL,
    ALL_BUT_FIRST,
    NONE;

    @Override // io.sentry.c2
    public void serialize(@NotNull b3 b3Var, @NotNull ILogger iLogger) throws IOException {
        ((l1.a) b3Var).K(toString().toLowerCase(Locale.ROOT));
    }
}
