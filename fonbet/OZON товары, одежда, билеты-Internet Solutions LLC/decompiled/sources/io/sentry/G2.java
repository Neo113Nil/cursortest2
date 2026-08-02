package io.sentry;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class G2 {

    /* renamed from: c, reason: collision with root package name */
    private static volatile G2 f66623c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final io.sentry.util.a f66624d = new io.sentry.util.a();

    /* renamed from: e, reason: collision with root package name */
    private static volatile Boolean f66625e = null;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final io.sentry.util.a f66626f = new io.sentry.util.a();

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArraySet f66627a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArraySet f66628b = new CopyOnWriteArraySet();

    private G2() {
    }

    @NotNull
    public static G2 d() {
        if (f66623c == null) {
            InterfaceC7097a0 a11 = f66624d.a();
            try {
                if (f66623c == null) {
                    f66623c = new G2();
                }
                a11.close();
            } catch (Throwable th2) {
                try {
                    a11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return f66623c;
    }

    public final void a(@NotNull String str) {
        io.sentry.util.p.b(str, "integration is required.");
        this.f66627a.add(str);
    }

    public final void b(@NotNull String str, @NotNull String str2) {
        this.f66628b.add(new io.sentry.protocol.u(str, str2));
        InterfaceC7097a0 a11 = f66626f.a();
        try {
            f66625e = null;
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean c(@NotNull ILogger iLogger) {
        Boolean bool = f66625e;
        if (bool != null) {
            return bool.booleanValue();
        }
        InterfaceC7097a0 a11 = f66626f.a();
        try {
            Iterator it = this.f66628b.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                io.sentry.protocol.u uVar = (io.sentry.protocol.u) it.next();
                if (uVar.a().startsWith("maven:io.sentry:") && !"8.34.1".equalsIgnoreCase(uVar.b())) {
                    iLogger.c(I2.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", uVar.a(), "8.34.1", uVar.b());
                    z11 = true;
                }
            }
            if (z11) {
                I2 i22 = I2.ERROR;
                iLogger.c(i22, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(i22, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(i22, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(i22, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            f66625e = Boolean.valueOf(z11);
            a11.close();
            return z11;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NotNull
    public final CopyOnWriteArraySet e() {
        return this.f66627a;
    }

    @NotNull
    public final CopyOnWriteArraySet f() {
        return this.f66628b;
    }
}
