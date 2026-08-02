package io.sentry.rrweb;

import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public enum c implements InterfaceC7220x0 {
    DomContentLoaded,
    Load,
    FullSnapshot,
    IncrementalSnapshot,
    Meta,
    Custom,
    Plugin;

    public static final class a implements InterfaceC7174n0<c> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final c a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return c.values()[interfaceC7131c1.nextInt()];
        }
    }

    @Override // io.sentry.InterfaceC7220x0
    public void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        ((C7212v0) interfaceC7135d1).l(ordinal());
    }
}
