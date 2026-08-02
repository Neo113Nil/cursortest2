package com.vk.stickers.keyboard.navigation;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.v;

/* compiled from: KeyboardNavigationAdapter.kt */
/* loaded from: classes6.dex */
public final class b extends v {
    @Override // androidx.recyclerview.widget.v
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.v
    public final int getHorizontalSnapPreference() {
        return -1;
    }
}
