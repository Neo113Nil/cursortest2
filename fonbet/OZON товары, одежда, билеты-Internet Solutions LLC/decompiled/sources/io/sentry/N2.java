package io.sentry;

import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public enum N2 implements InterfaceC7220x0 {
    TRACE(1),
    DEBUG(5),
    INFO(9),
    WARN(13),
    ERROR(17),
    FATAL(21);

    private final int severityNumber;

    public static final class a implements InterfaceC7174n0<N2> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final N2 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return N2.valueOf(interfaceC7131c1.nextString().toUpperCase(Locale.ROOT));
        }
    }

    N2(int i11) {
        this.severityNumber = i11;
    }

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    @Override // io.sentry.InterfaceC7220x0
    public void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        ((C7212v0) interfaceC7135d1).p(name().toLowerCase(Locale.ROOT));
    }
}
