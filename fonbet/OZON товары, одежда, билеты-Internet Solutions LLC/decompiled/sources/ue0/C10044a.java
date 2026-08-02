package ue0;

import java.io.PrintStream;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ue0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10044a extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Throwable f100665a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f100666b;

    public C10044a(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f100665a = exception;
        this.f100666b = exception.getCause();
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f100666b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f100665a.getMessage();
    }

    @Override // java.lang.Throwable
    @NotNull
    public final StackTraceElement[] getStackTrace() {
        StackTraceElement[] stackTrace = this.f100665a.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        return stackTrace;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        this.f100665a.printStackTrace();
    }

    @Override // java.lang.Throwable
    public final void setStackTrace(@NotNull StackTraceElement[] stackTrace) {
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        this.f100665a.setStackTrace(stackTrace);
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String toString() {
        return this.f100665a.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(@NotNull PrintStream s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        this.f100665a.printStackTrace(s11);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(@NotNull PrintWriter s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        this.f100665a.printStackTrace(s11);
    }
}
