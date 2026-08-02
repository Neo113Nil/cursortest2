package com.vk.catalog2.feature.music.holders.audiobook;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.Iterator;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.iut0;
import xsna.swe0;

/* compiled from: AudiobookPersonCollapsingToolbarLayout.kt */
/* loaded from: classes16.dex */
public final class AudiobookPersonCollapsingToolbarLayout extends CollapsingToolbarLayout {
    public AudiobookPersonCollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.google.android.material.appbar.CollapsingToolbarLayout, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (getFitsSystemWindows()) {
            int mode = View.MeasureSpec.getMode(i2);
            int systemWindowInsetTop = getRootWindowInsets().getSystemWindowInsetTop();
            if (mode != 0 || systemWindowInsetTop <= 0) {
                return;
            }
            Iterator<Integer> it = swe0.q(0, getChildCount()).iterator();
            while (it.hasNext()) {
                if (getChildAt(it.next().intValue()).getFitsSystemWindows()) {
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - systemWindowInsetTop, 1073741824));
                    return;
                }
            }
        }
    }
}
