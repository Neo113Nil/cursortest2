package jf;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final f f69985a = new f();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(@NotNull LogRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        int i11 = C7420e.f69984c;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        int a11 = Gf.c.a(record);
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        C7420e.a(a11, loggerName, message, record.getThrown());
    }
}
