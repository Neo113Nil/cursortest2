package com.vk.superapp.pip.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: TouchHandlingFrameLayout.kt */
/* loaded from: classes6.dex */
public final class TouchHandlingFrameLayout extends FrameLayout {
    public TouchHandlingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
