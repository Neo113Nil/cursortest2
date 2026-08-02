package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes3.dex */
public final class i4 implements ILogger {
    @Override // io.sentry.ILogger
    public void a(EnumC4788n3 enumC4788n3, Throwable th2, String str, Object... objArr) {
        if (th2 == null) {
            c(enumC4788n3, str, objArr);
        } else {
            System.out.println(String.format("%s: %s \n %s\n%s", enumC4788n3, String.format(str, objArr), th2.toString(), e(th2)));
        }
    }

    @Override // io.sentry.ILogger
    public void b(EnumC4788n3 enumC4788n3, String str, Throwable th2) {
        if (th2 == null) {
            c(enumC4788n3, str, new Object[0]);
        } else {
            System.out.println(String.format("%s: %s\n%s", enumC4788n3, String.format(str, th2.toString()), e(th2)));
        }
    }

    @Override // io.sentry.ILogger
    public void c(EnumC4788n3 enumC4788n3, String str, Object... objArr) {
        System.out.println(String.format("%s: %s", enumC4788n3, String.format(str, objArr)));
    }

    @Override // io.sentry.ILogger
    public boolean d(EnumC4788n3 enumC4788n3) {
        return true;
    }

    public final String e(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
