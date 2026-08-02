package com.vk.clips.design.view.editor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: FrameLayoutDisabledTouches.kt */
/* loaded from: classes16.dex */
public final class FrameLayoutDisabledTouches extends FrameLayout {
    public FrameLayoutDisabledTouches(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
