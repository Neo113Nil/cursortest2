package io.sentry;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class p3 implements ILogger {
    @Override // io.sentry.ILogger
    public final void a(@NotNull I2 i22, @NotNull String str, Throwable th2) {
        if (th2 == null) {
            c(i22, str, new Object[0]);
            return;
        }
        PrintStream printStream = System.out;
        String format = String.format(str, th2.toString());
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(i22 + ": " + format + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.ILogger
    public final void b(@NotNull I2 i22, Throwable th2, @NotNull String str, Object... objArr) {
        PrintStream printStream = System.out;
        String format = String.format(str, objArr);
        String th3 = th2.toString();
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(i22 + ": " + format + " \n " + th3 + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.ILogger
    public final void c(@NotNull I2 i22, @NotNull String str, Object... objArr) {
        System.out.println(i22 + ": " + String.format(str, objArr));
    }

    @Override // io.sentry.ILogger
    public final boolean d(I2 i22) {
        return true;
    }
}
