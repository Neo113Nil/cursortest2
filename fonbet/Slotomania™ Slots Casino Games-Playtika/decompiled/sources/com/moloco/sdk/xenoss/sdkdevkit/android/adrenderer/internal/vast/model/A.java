package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class A {
    public static final int d = 8;
    public final z a;
    public final List<z> b;
    public final List<z> c;

    public A(z zVar, List<z> clickTrackingList, List<z> customClickList) {
        Intrinsics.checkNotNullParameter(clickTrackingList, "clickTrackingList");
        Intrinsics.checkNotNullParameter(customClickList, "customClickList");
        this.a = zVar;
        this.b = clickTrackingList;
        this.c = customClickList;
    }

    public final z a() {
        return this.a;
    }

    public final List<z> b() {
        return this.b;
    }

    public final List<z> c() {
        return this.c;
    }
}
