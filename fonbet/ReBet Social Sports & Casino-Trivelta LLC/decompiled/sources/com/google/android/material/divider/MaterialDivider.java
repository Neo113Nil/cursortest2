package com.google.android.material.divider;

import La.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.shape.i;
import ia.c;
import ia.e;
import ia.l;
import ia.m;
import l0.AbstractC5338c;

/* loaded from: classes3.dex */
public class MaterialDivider extends View {

    /* renamed from: f, reason: collision with root package name */
    public static final int f35444f = l.f48555G;

    /* renamed from: a, reason: collision with root package name */
    public final i f35445a;

    /* renamed from: b, reason: collision with root package name */
    public int f35446b;

    /* renamed from: c, reason: collision with root package name */
    public int f35447c;

    /* renamed from: d, reason: collision with root package name */
    public int f35448d;

    /* renamed from: e, reason: collision with root package name */
    public int f35449e;

    public MaterialDivider(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f48208M);
    }

    public int getDividerColor() {
        return this.f35447c;
    }

    public int getDividerInsetEnd() {
        return this.f35449e;
    }

    public int getDividerInsetStart() {
        return this.f35448d;
    }

    public int getDividerThickness() {
        return this.f35446b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z10 = getLayoutDirection() == 1;
        int i11 = z10 ? this.f35449e : this.f35448d;
        if (z10) {
            width = getWidth();
            i10 = this.f35448d;
        } else {
            width = getWidth();
            i10 = this.f35449e;
        }
        this.f35445a.setBounds(i11, 0, width - i10, getBottom() - getTop());
        this.f35445a.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f35446b;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.f35447c != i10) {
            this.f35447c = i10;
            this.f35445a.f0(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(AbstractC5338c.getColor(getContext(), i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.f35449e = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f35448d = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.f35446b != i10) {
            this.f35446b = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i10) {
        super(a.d(context, attributeSet, i10, r4), attributeSet, i10);
        int i11 = f35444f;
        Context context2 = getContext();
        this.f35445a = new i();
        TypedArray i12 = xa.l.i(context2, attributeSet, m.MaterialDivider, i10, i11, new int[0]);
        this.f35446b = i12.getDimensionPixelSize(m.f48945k4, getResources().getDimensionPixelSize(e.f48315N));
        this.f35448d = i12.getDimensionPixelOffset(m.f48935j4, 0);
        this.f35449e = i12.getDimensionPixelOffset(m.f48925i4, 0);
        setDividerColor(Ca.c.a(context2, i12, m.f48915h4).getDefaultColor());
        i12.recycle();
    }
}
