package io.sentry;

import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public enum f5 implements c2 {
    TRACE(1),
    DEBUG(5),
    INFO(9),
    WARN(13),
    ERROR(17),
    FATAL(21);

    private final int severityNumber;

    f5(int i5) {
        this.severityNumber = i5;
    }

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    @Override // io.sentry.c2
    public void serialize(@NotNull b3 b3Var, @NotNull ILogger iLogger) throws IOException {
        ((l1.a) b3Var).K(name().toLowerCase(Locale.ROOT));
    }
}
