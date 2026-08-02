package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {
    public static final int c = 0;
    public final String a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r b;

    public g(String url, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r offset) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.a = url;
        this.b = offset;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }
}
