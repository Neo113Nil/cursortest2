package io.sentry;

import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public enum I2 implements InterfaceC7220x0 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    public static final class a implements InterfaceC7174n0<I2> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final I2 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return I2.valueOf(interfaceC7131c1.nextString().toUpperCase(Locale.ROOT));
        }
    }

    @Override // io.sentry.InterfaceC7220x0
    public void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        ((C7212v0) interfaceC7135d1).p(name().toLowerCase(Locale.ROOT));
    }
}
