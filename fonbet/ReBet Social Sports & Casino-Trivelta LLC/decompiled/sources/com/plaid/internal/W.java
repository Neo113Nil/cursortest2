package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final E5 f39728a;

    public W(@NotNull E5 plaidRetrofitFactory) {
        Intrinsics.checkNotNullParameter(plaidRetrofitFactory, "plaidRetrofitFactory");
        this.f39728a = plaidRetrofitFactory;
    }

    @NotNull
    public final X6 a(@Nullable String str) {
        if (Intrinsics.areEqual(str, X6.class.getSimpleName())) {
            return new X6(this.f39728a);
        }
        throw new IllegalArgumentException("Unknown crash api class: " + str);
    }
}
