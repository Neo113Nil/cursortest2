package com.swmansion.rnscreens;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f41763a;

    public final void a(b0 config, C3834z c3834z) {
        Intrinsics.checkNotNullParameter(config, "config");
        int height = config.j() ? 0 : config.getToolbar().getHeight();
        Integer num = this.f41763a;
        if (num != null && height == num.intValue()) {
            return;
        }
        this.f41763a = Integer.valueOf(height);
        if (c3834z != null) {
            c3834z.t(height);
        }
    }
}
