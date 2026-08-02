package com.squareup.moshi;

import com.squareup.moshi.AdapterMethodsFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.squareup.moshi.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5969a extends AdapterMethodsFactory.a {
    @Override // com.squareup.moshi.AdapterMethodsFactory.a
    public final Object b(@NotNull Moshi moshi, @NotNull n reader) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(reader, "reader");
        return g(reader);
    }
}
