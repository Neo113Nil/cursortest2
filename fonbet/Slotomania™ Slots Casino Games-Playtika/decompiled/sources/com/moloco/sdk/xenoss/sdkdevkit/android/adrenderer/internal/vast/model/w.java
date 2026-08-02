package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class w {
    public static final int d = 8;
    public final List<C2866a> a;
    public final String b;
    public final String c;

    public w(List<C2866a> ads, String str, String str2) {
        Intrinsics.checkNotNullParameter(ads, "ads");
        this.a = ads;
        this.b = str;
        this.c = str2;
    }

    public final List<C2866a> a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }
}
