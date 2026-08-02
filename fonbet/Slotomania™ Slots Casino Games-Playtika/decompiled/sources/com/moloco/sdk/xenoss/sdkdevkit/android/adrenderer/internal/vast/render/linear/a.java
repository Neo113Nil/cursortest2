package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final long b;

    public a(String url, long j) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = url;
        this.b = j;
    }

    public final long a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }
}
