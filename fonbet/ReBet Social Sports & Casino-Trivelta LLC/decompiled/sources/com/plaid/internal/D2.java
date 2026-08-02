package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class D2 extends B2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D2(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
