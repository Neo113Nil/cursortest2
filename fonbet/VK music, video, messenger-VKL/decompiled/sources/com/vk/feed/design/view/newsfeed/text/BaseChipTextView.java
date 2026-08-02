package com.vk.feed.design.view.newsfeed.text;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.text.VkText;
import com.vk.feed.design.view.newsfeed.text.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;
import xsna.hfo0;
import xsna.n8g;
import xsna.oiq;
import xsna.wkc;

/* compiled from: BaseChipTextView.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes18.dex */
public final class BaseChipTextView extends VkText {
    public hfo0 b;
    public a c;
    public final wkc d;

    public BaseChipTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = c.a;
        this.c = a.C1055a.a;
        this.d = new wkc();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        oiq oiqVar;
        wkc wkcVar = this.d;
        Path path = wkcVar.d;
        if (!path.isEmpty()) {
            canvas.save();
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getPaddingTop());
            canvas.drawPath(path, wkcVar.c);
            canvas.restore();
        }
        a aVar = this.c;
        if (epx.f(aVar, a.C1055a.a)) {
            super.onDraw(canvas);
            return;
        }
        if (!(aVar instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a.b bVar = (a.b) aVar;
        float paddingLeft = getPaddingLeft();
        float width = getWidth() - getPaddingRight();
        if (width - paddingLeft <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        bVar.getClass();
        getLineHeight();
        boolean z = getLayoutDirection() == 0;
        float lineHeight = getLineHeight();
        if (z) {
            float f = width - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            oiqVar = new oiq(paddingLeft, f, f - b.a(lineHeight, f - paddingLeft), f, Paint.Align.LEFT);
        } else {
            float f2 = paddingLeft + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float a = f2 + b.a(lineHeight, width - f2);
            Paint.Align align = Paint.Align.RIGHT;
            Paint.Align align2 = Paint.Align.LEFT;
            oiqVar = new oiq(width, paddingLeft, f2, a, align);
            paddingLeft = paddingLeft;
        }
        int save = canvas.save();
        Shader shader = getPaint().getShader();
        Paint.Align textAlign = getPaint().getTextAlign();
        int color = getPaint().getColor();
        int currentTextColor = getCurrentTextColor();
        try {
            canvas.clipRect(paddingLeft, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, getHeight());
            getPaint().setColor(currentTextColor);
            TextPaint paint = getPaint();
            float f3 = oiqVar.c;
            float f4 = oiqVar.d;
            int argb = Color.argb(0, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor));
            paint.setShader(new LinearGradient(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z ? currentTextColor : argb, z ? argb : currentTextColor, Shader.TileMode.CLAMP));
            getPaint().setTextAlign(oiqVar.e);
            throw null;
        } catch (Throwable th) {
            getPaint().setShader(shader);
            getPaint().setTextAlign(textAlign);
            getPaint().setColor(color);
            canvas.restoreToCount(save);
            throw th;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        this.c = this.b.a(this, i);
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wkc wkcVar = this.d;
        Path path = wkcVar.d;
        int action = motionEvent.getAction();
        if (action == 0) {
            Rect rect = wkcVar.a;
            rect.setEmpty();
            RectF rectF = wkcVar.b;
            rectF.setEmpty();
            Layout layout = getLayout();
            layout.getLineBounds(0, rect);
            rect.right = (int) layout.getLineMax(0);
            rectF.set(rect);
            path.reset();
            path.addRect(rectF, Path.Direction.CW);
            path.offset(getPaddingLeft(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            wkcVar.c.setColor(n8g.l(getPaint().getColor(), 51));
            invalidate();
        } else if (action == 1) {
            path.reset();
            invalidate();
        } else if (action == 3) {
            path.reset();
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setEllipsizeDelegate$design_release(hfo0 hfo0Var) {
        if (epx.f(this.b, hfo0Var)) {
            return;
        }
        this.b = hfo0Var;
        requestLayout();
        invalidate();
    }
}
