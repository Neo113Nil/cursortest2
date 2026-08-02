package com.fyber.inneractive.sdk.util;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes12.dex */
public final class m implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int displayCutout;
        Insets insets;
        int i;
        int i2;
        int i3;
        int i4;
        displayCutout = WindowInsets.Type.displayCutout();
        insets = windowInsets.getInsets(displayCutout);
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
