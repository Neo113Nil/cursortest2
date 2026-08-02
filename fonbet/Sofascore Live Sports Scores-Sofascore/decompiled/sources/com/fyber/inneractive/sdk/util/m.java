package com.fyber.inneractive.sdk.util;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int i;
        int i2;
        int i3;
        int i4;
        Insets insets = windowInsets.getInsets(WindowInsets.Type.displayCutout());
        int b = o.b();
        if (b == 1) {
            i = insets.left;
            view.setPadding(i, 0, 0, 0);
            return windowInsets;
        }
        if (b == 2) {
            i2 = insets.bottom;
            view.setPadding(0, 0, 0, i2);
            return windowInsets;
        }
        if (b != 3) {
            i4 = insets.top;
            view.setPadding(0, i4, 0, 0);
            return windowInsets;
        }
        i3 = insets.right;
        view.setPadding(0, 0, i3, 0);
        return windowInsets;
    }
}
