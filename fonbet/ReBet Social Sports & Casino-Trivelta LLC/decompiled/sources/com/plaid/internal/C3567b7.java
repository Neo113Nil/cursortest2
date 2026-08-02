package com.plaid.internal;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.plaid.internal.b7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3567b7 {
    @NotNull
    public static final String a(@NotNull SharedPreferences sharedPreferences, @NotNull String str) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter("plaid_environment", "key");
        Intrinsics.checkNotNullParameter(str, "default");
        String string = sharedPreferences.getString("plaid_environment", str);
        return string == null ? str : string;
    }
}
