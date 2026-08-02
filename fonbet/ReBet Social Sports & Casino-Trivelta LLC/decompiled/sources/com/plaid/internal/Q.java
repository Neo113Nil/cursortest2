package com.plaid.internal;

import android.app.Application;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Q {
    @NotNull
    public static final String a(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "<this>");
        String format = String.format("intent://redirect/#Intent;scheme=plaid;package=%s;end;", Arrays.copyOf(new Object[]{application.getApplicationContext().getPackageName()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
