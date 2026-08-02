package ru.ozon.id.nativeauth.credentials.countryCode;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {
    @NotNull
    public static final a a(@NotNull Function1 onClick) {
        Intrinsics.checkNotNullParameter(a.f97191e, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new a(new b(onClick));
    }
}
