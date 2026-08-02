package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class h implements c {
    public static final int d = 0;
    public final x a;
    public final f b;
    public final f c;

    public h(x vastOptions, f mraidOptions, f staticOptions) {
        Intrinsics.checkNotNullParameter(vastOptions, "vastOptions");
        Intrinsics.checkNotNullParameter(mraidOptions, "mraidOptions");
        Intrinsics.checkNotNullParameter(staticOptions, "staticOptions");
        this.a = vastOptions;
        this.b = mraidOptions;
        this.c = staticOptions;
    }

    public final f a() {
        return this.b;
    }

    public final f b() {
        return this.c;
    }

    public final x c() {
        return this.a;
    }
}
