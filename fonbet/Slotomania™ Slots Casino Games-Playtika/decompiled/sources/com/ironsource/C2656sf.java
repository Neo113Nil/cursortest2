package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.sf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2656sf {
    private final String a;
    private final String b;

    public C2656sf(String identifier, String baseConst) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(baseConst, "baseConst");
        this.a = identifier;
        this.b = baseConst;
    }

    public final String a() {
        return this.a + "_" + this.b;
    }
}
