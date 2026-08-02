package com.squareup.moshi;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class F {
    @NotNull
    public static final Class<?> a(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        return D.c(type);
    }
}
