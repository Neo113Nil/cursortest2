package io.sentry;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.n3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4788n3 implements G0 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    /* renamed from: io.sentry.n3$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC4788n3 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            return EnumC4788n3.valueOf(interfaceC4809q1.M0().toUpperCase(Locale.ROOT));
        }
    }

    @Override // io.sentry.G0
    public void serialize(@NotNull InterfaceC4813r1 interfaceC4813r1, @NotNull ILogger iLogger) {
        interfaceC4813r1.e(name().toLowerCase(Locale.ROOT));
    }
}
