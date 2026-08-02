package com.plaid.internal;

import Ph.AbstractC1457j;
import com.plaid.BuildConfig;
import com.plaid.internal.C3556a6;
import com.plaid.internal.Z4;
import java.lang.Thread;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nPlaidCrashHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaidCrashHandler.kt\ncom/plaid/internal/core/crashreporting/internal/PlaidCrashHandler\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,86:1\n13309#2,2:87\n13309#2,2:89\n*S KotlinDebug\n*F\n+ 1 PlaidCrashHandler.kt\ncom/plaid/internal/core/crashreporting/internal/PlaidCrashHandler\n*L\n72#1:87,2\n77#1:89,2\n*E\n"})
/* loaded from: classes3.dex */
public final class Z4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final C3560b0 f39806a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final C3668k0 f39807b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final M2 f39808c;

    public Z4(@NotNull C3560b0 crashReportFactory, @NotNull C3668k0 crashWorkManager, @NotNull M2 interceptor) {
        Intrinsics.checkNotNullParameter(crashReportFactory, "crashReportFactory");
        Intrinsics.checkNotNullParameter(crashWorkManager, "crashWorkManager");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.f39806a = crashReportFactory;
        this.f39807b = crashWorkManager;
        this.f39808c = interceptor;
    }

    public final void a() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: hc.l
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th2) {
                Z4.a(Z4.this, defaultUncaughtExceptionHandler, thread, th2);
            }
        });
    }

    public static final void a(Z4 this$0, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread paramThread, Throwable paramThrowable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(paramThread);
        Intrinsics.checkNotNull(paramThrowable);
        this$0.getClass();
        Intrinsics.checkNotNullParameter(paramThread, "paramThread");
        Intrinsics.checkNotNullParameter(paramThrowable, "paramThrowable");
        Throwable cause = paramThrowable.getCause();
        if (cause != null) {
            StackTraceElement[] stackTrace = cause.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = className.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, (Object) null)) {
                }
                try {
                    break;
                } catch (Exception e10) {
                    C3556a6.a.a(C3556a6.f39823a, e10);
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(paramThread, paramThrowable);
                        return;
                    } else {
                        System.exit(2);
                        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                    }
                }
            }
        }
        StackTraceElement[] stackTrace2 = paramThrowable.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace2, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement2 : stackTrace2) {
            String className2 = stackTraceElement2.getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase2 = className2.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (!StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, (Object) null)) {
            }
            break;
            AbstractC1457j.b(null, new Y4(this$0, paramThrowable, null), 1, null);
            if (this$0.f39808c.a(paramThrowable)) {
                return;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(paramThread, paramThrowable);
                return;
            } else {
                System.exit(2);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(paramThread, paramThrowable);
        } else {
            System.exit(2);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }
}
