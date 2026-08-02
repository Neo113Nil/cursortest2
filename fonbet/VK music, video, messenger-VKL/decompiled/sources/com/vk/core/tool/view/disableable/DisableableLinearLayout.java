package com.vk.core.tool.view.disableable;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import xsna.c0n;

/* compiled from: DisableableLinearLayout.kt */
/* loaded from: classes17.dex */
public class DisableableLinearLayout extends LinearLayout implements c0n {
    public boolean b;

    public DisableableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // xsna.c0n
    public void setTouchEnabled(boolean z) {
        this.b = z;
    }
}
