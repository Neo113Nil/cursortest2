package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z {
    public static final int c = 0;
    public final String a;
    public final String b;

    public z(String str, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = str;
        this.b = url;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }
}
