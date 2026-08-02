package io.sentry;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.s3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4830s3 implements G0 {
    TRACE(1),
    DEBUG(5),
    INFO(9),
    WARN(13),
    ERROR(17),
    FATAL(21);

    private final int severityNumber;

    /* renamed from: io.sentry.s3$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC4830s3 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            return EnumC4830s3.valueOf(interfaceC4809q1.M0().toUpperCase(Locale.ROOT));
        }
    }

    EnumC4830s3(int i10) {
        this.severityNumber = i10;
    }

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    @Override // io.sentry.G0
    public void serialize(@NotNull InterfaceC4813r1 interfaceC4813r1, @NotNull ILogger iLogger) {
        interfaceC4813r1.e(name().toLowerCase(Locale.ROOT));
    }
}
