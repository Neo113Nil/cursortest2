package io.sentry.rrweb;

import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public enum c implements G0 {
    DomContentLoaded,
    Load,
    FullSnapshot,
    IncrementalSnapshot,
    Meta,
    Custom,
    Plugin;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            return c.values()[interfaceC4809q1.nextInt()];
        }
    }

    @Override // io.sentry.G0
    public void serialize(@NotNull InterfaceC4813r1 interfaceC4813r1, @NotNull ILogger iLogger) {
        interfaceC4813r1.a(ordinal());
    }
}
