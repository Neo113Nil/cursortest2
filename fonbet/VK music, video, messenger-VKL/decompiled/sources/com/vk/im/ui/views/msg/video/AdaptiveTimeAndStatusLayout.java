package com.vk.im.ui.views.msg.video;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import xsna.cn70;
import xsna.hux0;

/* compiled from: AdaptiveTimeAndStatusLayout.kt */
/* loaded from: classes2.dex */
public final class AdaptiveTimeAndStatusLayout extends ConstraintLayout implements hux0 {
    public static final int w = cn70.b(4);
    public static final int x = cn70.b(2);
    public static final int y = cn70.b(3);
    public int t;
    public int u;
    public final TimeAndStatusView v;

    public AdaptiveTimeAndStatusLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v = new TimeAndStatusView(context, attributeSet, 0, 12, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TimeAndStatusView timeAndStatusView = getTimeAndStatusView();
        canvas.save();
        canvas.translate((getMeasuredWidth() - getPaddingRight()) - this.t, (((getMeasuredHeight() - getPaddingBottom()) - this.u) + x) - y);
        timeAndStatusView.draw(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
    }

    @Override // xsna.hux0
    public TimeAndStatusView getTimeAndStatusView() {
        return this.v;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getTimeAndStatusView().layout(0, 0, getTimeAndStatusView().getMeasuredWidth(), getTimeAndStatusView().getMeasuredHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (r1 != 1073741824) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        if (r6 < r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r6 < r0) goto L26;
     */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth() - (getPaddingRight() + getPaddingLeft());
        int i4 = 0;
        if (getTimeAndStatusView().getVisibility() == 8) {
            this.u = 0;
            this.t = 0;
            return;
        }
        getTimeAndStatusView().measure(0, 0);
        this.t = getTimeAndStatusView().getMeasuredWidth();
        this.u = getTimeAndStatusView().getMeasuredHeight();
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            i5 += getChildAt(i6).getMeasuredWidth();
        }
        int i7 = measuredWidth - i5;
        int i8 = this.t + w;
        int i9 = y;
        if (i7 >= i8) {
            measuredHeight = getMeasuredHeight();
            i3 = x;
        } else {
            measuredHeight = getMeasuredHeight();
            i3 = this.u;
        }
        int i10 = measuredHeight + i3 + i9;
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            if (size >= suggestedMinimumHeight && size >= i10) {
            }
            i4 = size;
        } else if (mode != 0) {
        }
        setMeasuredDimension(getMeasuredWidth(), i4);
    }

    @Override // xsna.hux0
    public final void X3() {
    }
}
