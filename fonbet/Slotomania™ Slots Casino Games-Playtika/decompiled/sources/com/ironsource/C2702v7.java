package com.ironsource;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.v7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2702v7 {
    public static final C2702v7 a = new C2702v7();

    private C2702v7() {
    }

    public final UUID a() {
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
        return randomUUID;
    }
}
