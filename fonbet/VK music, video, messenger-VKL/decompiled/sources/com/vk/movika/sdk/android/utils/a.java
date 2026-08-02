package com.vk.movika.sdk.android.utils;

import android.util.TypedValue;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;

/* loaded from: classes3.dex */
public final class a {
    public static final float a(DefaultSeekBarView defaultSeekBarView, float f) {
        return TypedValue.applyDimension(1, f, defaultSeekBarView.getContext().getResources().getDisplayMetrics());
    }
}
