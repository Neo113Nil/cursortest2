package com.ironsource;

import xsna.drm0;
import xsna.epx;

/* renamed from: com.ironsource.m4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4434m4 {
    private final Throwable a;
    private final String b;
    private final boolean c;

    public C4434m4(Throwable th) {
        this.a = th;
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = th.getStackTrace();
        sb.append(th.toString());
        sb.append(System.lineSeparator());
        boolean z = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append(";" + System.lineSeparator());
            if (drm0.D(stackTraceElement.toString(), C4452n4.d().e(), false)) {
                z = true;
            }
        }
        Throwable cause = this.a.getCause();
        if (cause != null) {
            sb.append("--CAUSE");
            sb.append(System.lineSeparator());
            sb.append(cause.toString());
            sb.append(System.lineSeparator());
            for (StackTraceElement stackTraceElement2 : cause.getStackTrace()) {
                sb.append(stackTraceElement2.toString());
                sb.append(";" + System.lineSeparator());
                if (drm0.D(stackTraceElement2.toString(), C4452n4.d().e(), false)) {
                    z = true;
                }
            }
        }
        this.b = sb.toString();
        this.c = z;
    }

    public final Throwable a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Throwable c() {
        return this.a;
    }

    public final boolean d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4434m4) && epx.f(this.a, ((C4434m4) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "CrashReportWrapper(throwable=" + this.a + ")";
    }

    public final C4434m4 a(Throwable th) {
        return new C4434m4(th);
    }

    public static /* synthetic */ C4434m4 a(C4434m4 c4434m4, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = c4434m4.a;
        }
        return c4434m4.a(th);
    }
}
