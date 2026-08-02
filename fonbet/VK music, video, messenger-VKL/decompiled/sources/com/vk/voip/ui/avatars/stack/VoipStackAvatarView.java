package com.vk.voip.ui.avatars.stack;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.voip.ui.R$styleable;
import java.util.LinkedHashMap;
import xsna.rcc;

/* compiled from: VoipStackAvatarView.kt */
/* loaded from: classes7.dex */
public final class VoipStackAvatarView extends ViewGroup {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final Path j;
    public final Rect k;
    public final LinkedHashMap l;

    public VoipStackAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.e = -16777216;
        this.f = -7829368;
        this.g = true;
        this.h = true;
        this.i = -16777216;
        this.j = new Path();
        this.k = new Rect();
        this.l = new LinkedHashMap();
        setChildrenDrawingOrderEnabled(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.m, 0, 0);
        setIconSize(obtainStyledAttributes.getDimensionPixelSize(4, 0));
        setOffset(obtainStyledAttributes.getDimensionPixelSize(3, 0));
        setStrokeWidth(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        setStrokeColor(obtainStyledAttributes.getColor(5, -16777216));
        setExtraColor(obtainStyledAttributes.getColor(1, -7829368));
        setExtraTextColor(obtainStyledAttributes.getColor(2, this.e));
        setUseExtraView(obtainStyledAttributes.getBoolean(7, false));
        setReverseDrawingOrder(obtainStyledAttributes.getInt(0, 0) == 1);
        obtainStyledAttributes.recycle();
    }

    public final void a() {
        for (int i = 0; i < getChildCount(); i++) {
            AvatarView avatarView = (AvatarView) getChildAt(i);
            rcc rccVar = (rcc) avatarView.getBackground();
            rccVar.c = this.e;
            rccVar.e = true;
            rccVar.invalidateSelf();
            int i2 = this.d;
            avatarView.setPadding(i2, i2, i2, i2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (((this.e >> 24) & 255) != 0) {
            return super.drawChild(canvas, view, j);
        }
        Object obj = this.l.get(view);
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int save = canvas.save();
        canvas.clipPath((Path) obj);
        try {
            return super.drawChild(canvas, view, j);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return this.g ? (i - i2) - 1 : i2;
    }

    public final int getExtraColor() {
        return this.f;
    }

    public final int getExtraTextColor() {
        return this.i;
    }

    public final int getIconSize() {
        return this.b;
    }

    public final int getOffset() {
        return this.c;
    }

    public final boolean getReverseDrawingOrder() {
        return this.g;
    }

    public final int getStrokeColor() {
        return this.e;
    }

    public final int getStrokeWidth() {
        return this.d;
    }

    public final boolean getUseExtraView() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Path path;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
            paddingLeft = childAt.getRight() + this.c;
            Path path2 = this.j;
            path2.reset();
            int left = childAt.getLeft();
            int top = childAt.getTop();
            int right = childAt.getRight();
            int bottom = childAt.getBottom();
            Rect rect = this.k;
            rect.set(left, top, right, bottom);
            path2.addCircle(rect.exactCenterX(), rect.exactCenterY(), Math.min(rect.width(), rect.height()) / 2.0f, Path.Direction.CCW);
            LinkedHashMap linkedHashMap = this.l;
            if (i5 > 0 && (path = (Path) linkedHashMap.get(getChildAt(i5 - 1))) != null) {
                if (this.g) {
                    path.op(path2, Path.Op.DIFFERENCE);
                } else {
                    path2.op(path, Path.Op.DIFFERENCE);
                }
            }
            Path path3 = (Path) linkedHashMap.get(childAt);
            if (path3 != null) {
                path3.set(path2);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = (this.d * 2) + this.b;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            getChildAt(i4).measure(makeMeasureSpec, makeMeasureSpec);
        }
        setMeasuredDimension((Math.max(0, getChildCount() - 1) * this.c) + (getChildCount() * i3) + paddingRight, paddingBottom + i3);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.l.put(view, new Path());
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        this.l.remove(view);
        super.onViewRemoved(view);
    }

    public final void setExtraColor(int i) {
        this.f = i;
        a();
    }

    public final void setExtraTextColor(int i) {
        this.i = i;
        if (this.h) {
            requestLayout();
            invalidate();
        }
    }

    public final void setIconSize(int i) {
        this.b = i;
        requestLayout();
        invalidate();
    }

    public final void setOffset(int i) {
        this.c = i;
        requestLayout();
        invalidate();
    }

    public final void setReverseDrawingOrder(boolean z) {
        this.g = z;
        requestLayout();
        invalidate();
    }

    public final void setStrokeColor(int i) {
        this.e = i;
        a();
    }

    public final void setStrokeWidth(int i) {
        this.d = i;
        a();
        requestLayout();
    }

    public final void setUseExtraView(boolean z) {
        this.h = z;
        requestLayout();
        invalidate();
    }
}
