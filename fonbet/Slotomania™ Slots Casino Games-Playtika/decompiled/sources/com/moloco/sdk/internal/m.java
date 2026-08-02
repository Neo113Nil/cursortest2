package com.moloco.sdk.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class m {
    public static final int c = 0;
    public final String a;
    public final int b;

    public m(String description, int i) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.a = description;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }
}
