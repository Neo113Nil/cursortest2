package com.plaid.internal;

import com.plaid.internal.N2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class O2 {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final String a(@NotNull N2 n22) {
        String c10;
        Intrinsics.checkNotNullParameter(n22, "<this>");
        N2.h hVar = n22 instanceof N2.h ? (N2.h) n22 : null;
        return (hVar == null || (c10 = hVar.c()) == null) ? "" : c10;
    }
}
