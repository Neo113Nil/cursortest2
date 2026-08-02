package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class t {
    public static final int c = 0;
    public final String a;
    public final i b;

    public t(String resource, i creativeType) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        this.a = resource;
        this.b = creativeType;
    }

    public final i a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }
}
