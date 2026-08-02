package com.moloco.sdk.internal.publisher.nativead.parser;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class b extends Exception {
    public static final int c = 8;
    public final int a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b;

    public b(int i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c errorSubType) {
        Intrinsics.checkNotNullParameter(errorSubType, "errorSubType");
        this.a = i;
        this.b = errorSubType;
    }

    public final int a() {
        return this.a;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b() {
        return this.b;
    }
}
