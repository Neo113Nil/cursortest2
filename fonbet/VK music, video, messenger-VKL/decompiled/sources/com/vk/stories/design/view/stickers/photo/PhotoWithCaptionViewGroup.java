package com.vk.stories.design.view.stickers.photo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.vk.imageloader.view.VKImageView;
import xsna.bwt0;

/* compiled from: PhotoWithCaptionViewGroup.kt */
/* loaded from: classes6.dex */
public final class PhotoWithCaptionViewGroup extends ViewGroup {
    public View b;
    public View c;
    public View d;
    public boolean e;
    public boolean f;

    public PhotoWithCaptionViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void a(int i, int i2, View view) {
        measureChild(view, i, i2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if ((childAt instanceof ViewGroup) || (childAt instanceof VKImageView)) {
                    a(i, i2, childAt);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        View view = this.c;
        if (view == null) {
            view = null;
        }
        int measuredHeight2 = view.getMeasuredHeight();
        View view2 = this.d;
        int measuredHeight3 = (measuredHeight - measuredHeight2) - (view2 != null ? view2.getMeasuredHeight() : 0);
        View view3 = this.b;
        if (view3 == null) {
            view3 = null;
        }
        view3.layout(0, 0, measuredWidth, measuredHeight3);
        View view4 = this.c;
        int i5 = measuredHeight2 + measuredHeight3;
        (view4 != null ? view4 : null).layout(0, measuredHeight3, measuredWidth, i5);
        View view5 = this.d;
        if (view5 != null) {
            view5.layout(0, i5, measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int measuredWidth;
        if (getChildCount() < 2) {
            throw new IllegalStateException("PhotoWithCaptionView must have 2 or more children: photo, caption, and optional text.");
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
        this.b = getChildAt(0);
        this.c = getChildAt(1);
        this.d = getChildAt(2);
        int makeMeasureSpec2 = this.e ? View.MeasureSpec.makeMeasureSpec(0, 1073741824) : i2;
        View view = this.c;
        if (view == null) {
            view = null;
        }
        measureChild(view, makeMeasureSpec, makeMeasureSpec2);
        View view2 = this.c;
        if (view2 == null) {
            view2 = null;
        }
        int measuredHeight = view2.getMeasuredHeight();
        View view3 = this.d;
        if (view3 != null) {
            measureChild(view3, makeMeasureSpec, bwt0.K(view3) ? makeMeasureSpec2 : View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            i3 = view3.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        int i4 = (size - measuredHeight) - i3;
        View view4 = this.b;
        if (view4 == null) {
            view4 = null;
        }
        a(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i4, View.MeasureSpec.getMode(i2)), view4);
        View view5 = this.b;
        if (view5 == null) {
            view5 = null;
        }
        if (view5.getMeasuredHeight() > i4 || this.e) {
            View view6 = this.b;
            if (view6 == null) {
                view6 = null;
            }
            a(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i4, 1073741824), view6);
        }
        View view7 = this.b;
        if (view7 == null) {
            view7 = null;
        }
        int measuredHeight2 = view7.getMeasuredHeight() + measuredHeight + i3;
        if (measuredHeight2 <= size && !this.e) {
            size = measuredHeight2;
        }
        if (this.f) {
            View view8 = this.b;
            if (view8 == null) {
                view8 = null;
            }
            measuredWidth = view8.getMeasuredWidth();
            View view9 = this.c;
            if (view9 == null) {
                view9 = null;
            }
            int measuredWidth2 = view9.getMeasuredWidth();
            if (measuredWidth < measuredWidth2) {
                measuredWidth = measuredWidth2;
            }
        } else {
            View view10 = this.b;
            if (view10 == null) {
                view10 = null;
            }
            measuredWidth = view10.getMeasuredWidth();
        }
        View view11 = this.d;
        if (view11 != null) {
            measureChild(view11, View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), bwt0.K(view11) ? makeMeasureSpec2 : View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            view11.getMeasuredHeight();
        }
        View view12 = this.c;
        measureChild(view12 != null ? view12 : null, View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), makeMeasureSpec2);
        setMeasuredDimension(measuredWidth, size);
    }

    public final void setFullscreen(boolean z) {
        this.e = z;
        requestLayout();
    }

    public final void setOnlyText(boolean z) {
        this.f = z;
        requestLayout();
    }
}
