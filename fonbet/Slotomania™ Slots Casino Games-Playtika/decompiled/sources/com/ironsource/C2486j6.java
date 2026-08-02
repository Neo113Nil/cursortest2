package com.ironsource;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.j6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2486j6 implements K {
    private final Activity a;

    public C2486j6(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = activity;
    }

    @Override // com.ironsource.K
    public void a(C2451h6 fullscreenAdInstance) {
        Intrinsics.checkNotNullParameter(fullscreenAdInstance, "fullscreenAdInstance");
        fullscreenAdInstance.a(this.a);
    }
}
