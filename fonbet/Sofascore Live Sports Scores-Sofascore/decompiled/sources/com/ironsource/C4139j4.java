package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.j4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4139j4 {

    @NotNull
    private final Throwable a;

    @NotNull
    private final String b;
    private final boolean c;

    public C4139j4(@NotNull Throwable th) {
        th.getClass();
        this.a = th;
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        sb.append(th.toString());
        sb.append(System.lineSeparator());
        boolean z = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append(";" + System.lineSeparator());
            String stackTraceElement2 = stackTraceElement.toString();
            stackTraceElement2.getClass();
            String e = C4157k4.d().e();
            e.getClass();
            if (StringsKt.J(stackTraceElement2, e, false)) {
                z = true;
            }
        }
        Throwable cause = this.a.getCause();
        if (cause != null) {
            sb.append("--CAUSE");
            sb.append(System.lineSeparator());
            sb.append(cause.toString());
            sb.append(System.lineSeparator());
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            stackTrace2.getClass();
            for (StackTraceElement stackTraceElement3 : stackTrace2) {
                sb.append(stackTraceElement3.toString());
                sb.append(";" + System.lineSeparator());
                String stackTraceElement4 = stackTraceElement3.toString();
                stackTraceElement4.getClass();
                String e2 = C4157k4.d().e();
                e2.getClass();
                if (StringsKt.J(stackTraceElement4, e2, false)) {
                    z = true;
                }
            }
        }
        this.b = sb.toString();
        this.c = z;
    }

    public static /* synthetic */ C4139j4 a(C4139j4 c4139j4, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = c4139j4.a;
        }
        return c4139j4.a(th);
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final Throwable c() {
        return this.a;
    }

    public final boolean d() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4139j4) && Intrinsics.c(this.a, ((C4139j4) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "CrashReportWrapper(throwable=" + this.a + ")";
    }

    @NotNull
    public final C4139j4 a(@NotNull Throwable th) {
        th.getClass();
        return new C4139j4(th);
    }

    @NotNull
    public final Throwable a() {
        return this.a;
    }
}
