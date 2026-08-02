package com.vk.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

/* compiled from: BottomSheetWebView.kt */
/* loaded from: classes17.dex */
public final class BottomSheetWebView extends WebView {
    public boolean b;
    public float c;
    public boolean d;
    public boolean e;

    public BottomSheetWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
        this.c = Float.MIN_VALUE;
    }

    public final boolean getInterceptScrollEvent() {
        return this.b;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        this.e = this.d && z2;
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.c = motionEvent.getY();
        } else {
            boolean z = motionEvent.getY() > this.c;
            this.d = z;
            if (!z) {
                this.e = false;
            }
            this.b = z && !this.e;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setInterceptScrollEvent(boolean z) {
        this.b = z;
    }
}
