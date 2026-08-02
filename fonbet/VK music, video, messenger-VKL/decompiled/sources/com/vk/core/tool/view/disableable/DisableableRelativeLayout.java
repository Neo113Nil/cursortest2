package com.vk.core.tool.view.disableable;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import xsna.c0n;

/* compiled from: DisableableRelativeLayout.kt */
/* loaded from: classes17.dex */
public class DisableableRelativeLayout extends RelativeLayout implements c0n {
    public boolean b;

    public DisableableRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
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

    public DisableableRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = true;
    }
}
