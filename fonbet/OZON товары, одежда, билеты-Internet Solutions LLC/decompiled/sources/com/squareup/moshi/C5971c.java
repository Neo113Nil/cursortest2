package com.squareup.moshi;

import com.squareup.moshi.AdapterMethodsFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.squareup.moshi.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5971c extends AdapterMethodsFactory.a {
    @Override // com.squareup.moshi.AdapterMethodsFactory.a
    public final void i(@NotNull Moshi moshi, @NotNull x writer, Object obj) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(writer, "writer");
        h(writer, obj);
    }
}
