package io.sentry;

import io.sentry.util.C4843a;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: io.sentry.l3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4778l3 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4778l3 f52167c;

    /* renamed from: d, reason: collision with root package name */
    public static final C4843a f52168d = new C4843a();

    /* renamed from: e, reason: collision with root package name */
    public static volatile Boolean f52169e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final C4843a f52170f = new C4843a();

    /* renamed from: a, reason: collision with root package name */
    public final Set f52171a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public final Set f52172b = new CopyOnWriteArraySet();

    public static C4778l3 d() {
        if (f52167c == null) {
            InterfaceC4765j0 d10 = f52168d.d();
            try {
                if (f52167c == null) {
                    f52167c = new C4778l3();
                }
                if (d10 != null) {
                    d10.close();
                }
            } catch (Throwable th2) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return f52167c;
    }

    public void a(String str) {
        io.sentry.util.w.c(str, "integration is required.");
        this.f52171a.add(str);
    }

    public void b(String str, String str2) {
        io.sentry.util.w.c(str, "name is required.");
        io.sentry.util.w.c(str2, "version is required.");
        this.f52172b.add(new io.sentry.protocol.v(str, str2));
        InterfaceC4765j0 d10 = f52170f.d();
        try {
            f52169e = null;
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public boolean c(ILogger iLogger) {
        Boolean bool = f52169e;
        if (bool != null) {
            return bool.booleanValue();
        }
        InterfaceC4765j0 d10 = f52170f.d();
        try {
            boolean z10 = false;
            for (io.sentry.protocol.v vVar : this.f52172b) {
                if (vVar.a().startsWith("maven:io.sentry:") && !"8.48.0".equalsIgnoreCase(vVar.b())) {
                    iLogger.c(EnumC4788n3.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", vVar.a(), "8.48.0", vVar.b());
                    z10 = true;
                }
            }
            if (z10) {
                EnumC4788n3 enumC4788n3 = EnumC4788n3.ERROR;
                iLogger.c(enumC4788n3, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(enumC4788n3, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(enumC4788n3, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(enumC4788n3, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            f52169e = Boolean.valueOf(z10);
            if (d10 != null) {
                d10.close();
            }
            return z10;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public Set e() {
        return this.f52171a;
    }

    public Set f() {
        return this.f52172b;
    }
}
