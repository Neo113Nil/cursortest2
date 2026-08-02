package com.plaid.internal;

import com.plaid.internal.C3556a6;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Y6 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public static J5 f39796a;

    public static final class a {
        @JvmStatic
        public static void a(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            C3556a6.a.b(C3556a6.f39823a, message);
            J5 j52 = Y6.f39796a;
            if (j52 != null) {
                j52.a(message);
            }
        }

        @JvmStatic
        public static void a(@Nullable Exception exc, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            C3556a6.a.a(C3556a6.f39823a, exc, message);
            J5 j52 = Y6.f39796a;
            if (j52 != null) {
                j52.a(message + " - " + exc.getMessage());
            }
        }
    }
}
