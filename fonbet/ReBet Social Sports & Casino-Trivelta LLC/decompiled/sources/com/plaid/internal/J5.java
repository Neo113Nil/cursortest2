package com.plaid.internal;

import Ph.AbstractC1459k;
import Ph.C1483w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class J5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final C3575c5 f39312a;

    public J5(@NotNull C3575c5 plaidCrashReporter) {
        Intrinsics.checkNotNullParameter(plaidCrashReporter, "plaidCrashReporter");
        this.f39312a = plaidCrashReporter;
    }

    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        C3575c5 c3575c5 = this.f39312a;
        c3575c5.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC1459k.d(C1483w0.f9135a, null, null, new C3555a5(c3575c5, message, null), 3, null);
    }
}
