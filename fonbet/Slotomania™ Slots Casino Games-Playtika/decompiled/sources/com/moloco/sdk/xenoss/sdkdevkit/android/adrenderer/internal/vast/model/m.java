package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class m {
    public static final int c = 8;
    public final String a;
    public final List<String> b;

    public m(String clickThroughUrl, List<String> clickTrackingUrlList) {
        Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        Intrinsics.checkNotNullParameter(clickTrackingUrlList, "clickTrackingUrlList");
        this.a = clickThroughUrl;
        this.b = clickTrackingUrlList;
    }

    public final String a() {
        return this.a;
    }

    public final List<String> b() {
        return this.b;
    }
}
