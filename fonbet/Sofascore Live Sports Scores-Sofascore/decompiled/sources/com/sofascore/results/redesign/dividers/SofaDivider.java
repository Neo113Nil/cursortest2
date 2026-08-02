package com.sofascore.results.redesign.dividers;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4018c8;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.ujf;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/sofascore/results/redesign/dividers/SofaDivider;", "Landroid/view/View;", "", "color", "", "setBackgroundColor", "(I)V", "Landroid/graphics/drawable/Drawable;", "background", "setBackground", "(Landroid/graphics/drawable/Drawable;)V", "", C4018c8.k, "setDividerVisibility", "(Z)V", "a", "I", "getMinHeight", "()I", "setMinHeight", "minHeight", InneractiveMediationDefs.GENDER_FEMALE, "getHorizontalMarginPx", "setHorizontalMarginPx", "horizontalMarginPx", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SofaDivider extends View {

    /* renamed from: a, reason: from kotlin metadata */
    public int minHeight;
    public boolean b;
    public boolean c;
    public final Paint d;
    public final Paint e;

    /* renamed from: f, reason: from kotlin metadata */
    public int horizontalMarginPx;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SofaDivider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        this.minHeight = ao2.v(8, context);
        Paint paint = new Paint();
        paint.setColor(context.getColor(R.color.surface_1));
        this.d = paint;
        Paint paint2 = new Paint();
        paint2.setColor(context.getColor(R.color.n_lv_4));
        paint2.setStrokeWidth(ao2.u(1, context));
        this.e = paint2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ujf.o, 0, 0);
        obtainStyledAttributes.getClass();
        this.b = obtainStyledAttributes.getBoolean(0, false);
        this.c = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
    }

    public final int getHorizontalMarginPx() {
        return this.horizontalMarginPx;
    }

    public final int getMinHeight() {
        return this.minHeight;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.getClass();
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        if (this.c) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth, measuredHeight, this.d);
        }
        if (this.b) {
            Paint paint = this.e;
            float strokeWidth = measuredHeight - (paint.getStrokeWidth() / 2.0f);
            int i = this.horizontalMarginPx;
            canvas2.drawLine(i + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, strokeWidth, measuredWidth - i, strokeWidth, paint);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = this.minHeight;
        }
        setMeasuredDimension(defaultSize, size);
    }

    @Override // android.view.View
    public void setBackground(@Nullable Drawable background) {
        if (background == null) {
            this.d.setColor(0);
            invalidate();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        this.d.setColor(color);
        invalidate();
    }

    public final void setDividerVisibility(boolean isVisible) {
        this.b = isVisible;
        invalidate();
    }

    public final void setHorizontalMarginPx(int i) {
        this.horizontalMarginPx = i;
    }

    public final void setMinHeight(int i) {
        this.minHeight = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SofaDivider(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
