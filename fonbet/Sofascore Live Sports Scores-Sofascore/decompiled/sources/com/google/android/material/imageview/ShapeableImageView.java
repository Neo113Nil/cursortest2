package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ach;
import defpackage.bch;
import defpackage.eq3;
import defpackage.oyn;
import defpackage.pjf;
import defpackage.qn2;
import defpackage.qzb;
import defpackage.w3a;
import defpackage.xah;
import defpackage.yah;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class ShapeableImageView extends AppCompatImageView implements ach {
    public final qn2 a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final Paint e;
    public final Path f;
    public ColorStateList g;
    public qzb h;
    public xah i;
    public float j;
    public final Path k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public boolean r;

    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(oyn.U(context, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, 0);
        this.a = yah.a;
        this.f = new Path();
        this.r = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.b = new RectF();
        this.c = new RectF();
        this.k = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, pjf.N, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.g = w3a.x(context2, obtainStyledAttributes, 9);
        this.j = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.l = dimensionPixelSize;
        this.m = dimensionPixelSize;
        this.n = dimensionPixelSize;
        this.o = dimensionPixelSize;
        this.l = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.m = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.n = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.o = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.p = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.q = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.i = xah.h(context2, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView).a();
        setOutlineProvider(new bch(this));
    }

    public final boolean b() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.b;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        xah xahVar = this.i;
        qn2 qn2Var = this.a;
        Path path = this.f;
        qn2Var.c(xahVar, null, 1.0f, rectF, null, path);
        Path path2 = this.k;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.c;
        rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.o;
    }

    public final int getContentPaddingEnd() {
        int i = this.q;
        return i != Integer.MIN_VALUE ? i : b() ? this.l : this.n;
    }

    public int getContentPaddingLeft() {
        int i = this.q;
        int i2 = this.p;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (b() && i != Integer.MIN_VALUE) {
                return i;
            }
            if (!b() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.l;
    }

    public int getContentPaddingRight() {
        int i = this.q;
        int i2 = this.p;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (b() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!b() && i != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.n;
    }

    public final int getContentPaddingStart() {
        int i = this.p;
        return i != Integer.MIN_VALUE ? i : b() ? this.n : this.l;
    }

    public int getContentPaddingTop() {
        return this.m;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @NonNull
    public xah getShapeAppearanceModel() {
        return this.i;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.g;
    }

    public float getStrokeWidth() {
        return this.j;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.k, this.e);
        if (this.g == null) {
            return;
        }
        float f = this.j;
        Paint paint = this.d;
        paint.setStrokeWidth(f);
        int colorForState = this.g.getColorForState(getDrawableState(), this.g.getDefaultColor());
        if (this.j <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.r && isLayoutDirectionResolved()) {
            this.r = true;
            if (!isPaddingRelative() && this.p == Integer.MIN_VALUE && this.q == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        d(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // defpackage.ach
    public void setShapeAppearanceModel(@NonNull xah xahVar) {
        this.i = xahVar;
        qzb qzbVar = this.h;
        if (qzbVar != null) {
            qzbVar.setShapeAppearanceModel(xahVar);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        this.g = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(eq3.q(i, getContext()));
    }

    public void setStrokeWidth(float f) {
        if (this.j != f) {
            this.j = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }
}
