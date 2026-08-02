package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2866a {
    public static final int d = 0;
    public final String a;
    public final Integer b;
    public final AbstractC2867b c;

    public C2866a(String str, Integer num, AbstractC2867b child) {
        Intrinsics.checkNotNullParameter(child, "child");
        this.a = str;
        this.b = num;
        this.c = child;
    }

    public final AbstractC2867b a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final Integer c() {
        return this.b;
    }
}
