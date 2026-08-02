package com.vk.community.tool.view.donut.feedactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;
import com.vk.community.design.R$styleable;
import com.vk.core.view.components.text.VkText;
import xsna.an10;
import xsna.qv20;

/* compiled from: FadeOutText.kt */
/* loaded from: classes17.dex */
public final class FadeOutText extends VkText {
    public final Paint b;
    public final GradientDrawable c;
    public final RectF d;
    public final RectF e;
    public final float f;

    public FadeOutText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        this.b = paint;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.c = gradientDrawable;
        this.d = new RectF();
        this.e = new RectF();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
            try {
                int color = obtainStyledAttributes.getColor(0, 0);
                this.f = obtainStyledAttributes.getDimension(1, 1.0f);
                gradientDrawable.setGradientType(0);
                gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawable.setColors(new int[]{0, color});
                paint.setColor(color);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.d;
        if (!rectF.isEmpty()) {
            float f = rectF.left;
            float f2 = rectF.top;
            int save = canvas.save();
            try {
                canvas.translate(f, f2);
                this.c.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
        RectF rectF2 = this.e;
        if (rectF2.isEmpty()) {
            return;
        }
        canvas.drawRect(rectF2, this.b);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.e;
        rectF.setEmpty();
        RectF rectF2 = this.d;
        rectF2.setEmpty();
        if (qv20.l(this)) {
            boolean z2 = getLayoutDirection() == 0;
            GradientDrawable.Orientation orientation = z2 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT;
            GradientDrawable gradientDrawable = this.c;
            if (gradientDrawable.getOrientation() != orientation) {
                gradientDrawable.setOrientation(orientation);
            }
            float f = this.f;
            if (!z2) {
                Layout layout = getLayout();
                if (layout == null) {
                    return;
                }
                float lineWidth = layout.getLineWidth(0);
                float lineTop = layout.getLineTop(0);
                float paddingLeft = getPaddingLeft();
                rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, layout.getLineBottom(0) - lineTop);
                rectF2.offset(paddingLeft + (lineWidth - f), getPaddingTop() + lineTop);
                gradientDrawable.setBounds(0, 0, an10.b(rectF2.width()), an10.b(rectF2.height()));
                return;
            }
            Layout layout2 = getLayout();
            if (layout2 == null) {
                return;
            }
            float lineWidth2 = layout2.getLineWidth(0);
            float lineTop2 = layout2.getLineTop(0);
            float lineBottom = layout2.getLineBottom(0);
            int ellipsisStart = layout2.getEllipsisStart(0);
            if (ellipsisStart != 0) {
                lineWidth2 = layout2.getPrimaryHorizontal(layout2.getLineStart(0) + ellipsisStart);
            }
            float lineMax = layout2.getLineMax(0);
            float f2 = lineBottom - lineTop2;
            float paddingLeft2 = getPaddingLeft();
            float paddingTop = getPaddingTop() + lineTop2;
            if (ellipsisStart != 0) {
                if (lineWidth2 >= lineMax) {
                    lineMax = layout2.getWidth();
                }
                rectF.set(lineWidth2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lineMax, f2);
                rectF.offset(paddingLeft2, paddingTop);
            }
            rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
            rectF2.offset(paddingLeft2 + (lineWidth2 - f), paddingTop);
            gradientDrawable.setBounds(0, 0, (int) rectF2.width(), an10.b(rectF2.height()));
        }
    }
}
