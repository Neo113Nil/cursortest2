package com.vk.auth.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* compiled from: WrapRelativeLayout.kt */
/* loaded from: classes15.dex */
public final class WrapRelativeLayout extends RelativeLayout {
    public WrapRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return getMinimumHeight();
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return getMinimumWidth();
    }
}
