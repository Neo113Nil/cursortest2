package com.vk.core.tool.view.disableable;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import xsna.c0n;

/* compiled from: DisableableFrameLayout.kt */
/* loaded from: classes17.dex */
public class DisableableFrameLayout extends FrameLayout implements c0n {
    public boolean b;

    public DisableableFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // xsna.c0n
    public void setTouchEnabled(boolean z) {
        this.b = z;
    }

    public /* synthetic */ DisableableFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public DisableableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = true;
    }
}
