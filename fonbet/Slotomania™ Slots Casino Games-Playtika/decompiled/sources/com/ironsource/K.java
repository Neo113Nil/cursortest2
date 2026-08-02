package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface K {
    default void a(B2 bannerAdInstance) {
        Intrinsics.checkNotNullParameter(bannerAdInstance, "bannerAdInstance");
    }

    default void a(C2451h6 fullscreenAdInstance) {
        Intrinsics.checkNotNullParameter(fullscreenAdInstance, "fullscreenAdInstance");
    }

    default void a(Vb nativeAdInstance) {
        Intrinsics.checkNotNullParameter(nativeAdInstance, "nativeAdInstance");
    }
}
