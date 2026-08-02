package com.moloco.sdk.internal.publisher;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.internal.publisher.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2803k {
    public static final int c = 0;
    public final String a;
    public final Float b;

    public C2803k(String burl, Float f) {
        Intrinsics.checkNotNullParameter(burl, "burl");
        this.a = burl;
        this.b = f;
    }

    public final String a() {
        return this.a;
    }

    public final Float b() {
        return this.b;
    }
}
