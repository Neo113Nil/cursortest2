package ru.ozon.tracker.debug.menu.presentation;

import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements D {
    @Override // androidx.core.view.D
    public final C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        m<Object>[] mVarArr = TrackerDebugMenuActivity.f97738k;
        androidx.core.graphics.d a11 = Ql.c.a(view, "view", c5353y0, "insets", 7);
        Intrinsics.checkNotNullExpressionValue(a11, "getInsets(...)");
        view.setPadding(a11.f42126a, a11.f42127b, a11.f42128c, a11.f42129d);
        return c5353y0;
    }
}
