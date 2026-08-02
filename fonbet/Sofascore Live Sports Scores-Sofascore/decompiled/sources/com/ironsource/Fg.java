package com.ironsource;

import android.graphics.Rect;
import android.view.View;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Fg {
    public static final boolean a(@NotNull View view, @NotNull Rect rect) {
        view.getClass();
        rect.getClass();
        return view.isShown() && view.hasWindowFocus() && view.getGlobalVisibleRect(rect);
    }
}
