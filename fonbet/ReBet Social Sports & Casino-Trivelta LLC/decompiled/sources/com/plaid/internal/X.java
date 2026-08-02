package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel;
import java.util.Date;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nCrashBreadCrumb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashBreadCrumb.kt\ncom/plaid/internal/core/crashreporting/models/CrashBreadCrumb\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
/* loaded from: classes3.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Date f39755a = new Date();

    public static CrashLogLevel a(int i10) {
        switch (i10) {
            case 2:
                return CrashLogLevel.INFO;
            case 3:
                return CrashLogLevel.DEBUG;
            case 4:
                return CrashLogLevel.INFO;
            case 5:
                return CrashLogLevel.WARNING;
            case 6:
                return CrashLogLevel.ERROR;
            case 7:
                return CrashLogLevel.DEBUG;
            default:
                return CrashLogLevel.ERROR;
        }
    }
}
