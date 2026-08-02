package com.vk.core.view.components.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.text.VkFadeText;
import xsna.cdi;
import xsna.drm0;
import xsna.epx;
import xsna.gzs;
import xsna.ro;
import xsna.s3q0;

/* compiled from: VkFadeText.kt */
/* loaded from: classes.dex */
public final class VkFadeText extends VkText {
    public static final /* synthetic */ int n = 0;
    public boolean b;
    public int c;
    public int d;
    public final Paint e;
    public LinearGradient f;
    public final RectF g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public Float l;
    public int m;

    public VkFadeText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public static boolean e(Layout layout, int i) {
        if (i < 0 || i >= layout.getLineCount()) {
            return true;
        }
        int lineStart = layout.getLineStart(i);
        int lineVisibleEnd = layout.getLineVisibleEnd(i);
        if (lineVisibleEnd < lineStart) {
            lineVisibleEnd = lineStart;
        }
        while (lineStart < lineVisibleEnd) {
            char charAt = layout.getText().charAt(lineStart);
            if (charAt != 10240 && !ro.j(charAt) && charAt != 8230 && charAt != 8229) {
                return false;
            }
            lineStart++;
        }
        return true;
    }

    public final int b() {
        Layout layout = getLayout();
        if (layout != null && layout.getLineCount() != 0) {
            int i = this.c;
            int lineCount = layout.getLineCount() - 1;
            if (i > lineCount) {
                i = lineCount;
            }
            while (-1 < i) {
                if (!e(layout, i)) {
                    return i;
                }
                i--;
            }
        }
        return -1;
    }

    public final boolean f() {
        int i;
        int lineEnd;
        Layout layout = getLayout();
        if (layout != null && this.j && this.d > 1) {
            int lineCount = layout.getLineCount();
            int i2 = this.d;
            if (lineCount >= i2 && (i = i2 - 1) < layout.getLineCount() && (lineEnd = layout.getLineEnd(i)) < getText().length()) {
                CharSequence subSequence = getText().subSequence(lineEnd, getText().length());
                for (int i3 = 0; i3 < subSequence.length(); i3++) {
                    if (!ro.j(subSequence.charAt(i3))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void i(float f, float f2, float f3, float f4, boolean z) {
        Float f5 = this.l;
        float floatValue = f5 != null ? f5.floatValue() : 1.5f * f4;
        RectF rectF = this.g;
        if (z) {
            float f6 = f2 - floatValue;
            if (f6 >= f) {
                f = f6;
            }
            rectF.set(f, f3, f2, f4 + f3);
            this.f = new LinearGradient(rectF.left, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectF.right, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -16777216, 0, Shader.TileMode.CLAMP);
            return;
        }
        float f7 = floatValue + f;
        if (f7 <= f2) {
            f2 = f7;
        }
        rectF.set(f, f3, f2, f4 + f3);
        this.f = new LinearGradient(rectF.right, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectF.left, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -16777216, 0, Shader.TileMode.CLAMP);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.b) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(final Canvas canvas) {
        int save;
        Layout.Alignment alignment;
        LinearGradient linearGradient = this.f;
        if (linearGradient == null && !f()) {
            Layout layout = getLayout();
            if (getTextAlignment() == 4 && layout != null && this.k) {
                cdi.y(this, canvas, layout);
                return;
            } else {
                super.onDraw(canvas);
                return;
            }
        }
        boolean z = this.j;
        RectF rectF = this.g;
        Paint paint = this.e;
        if (!z || !f()) {
            if (!this.j) {
                int saveLayer = canvas.saveLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight(), null);
                super.onDraw(canvas);
                s3q0 s3q0Var = s3q0.a;
                if (linearGradient != null) {
                    paint.setShader(linearGradient);
                    canvas.drawRect(rectF, paint);
                    paint.setShader(null);
                }
                canvas.restoreToCount(saveLayer);
                return;
            }
            int width = getWidth();
            int height = getHeight();
            save = canvas.save();
            canvas.clipRect(0, 0, width, height);
            try {
                int saveLayer2 = canvas.saveLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight(), null);
                super.onDraw(canvas);
                s3q0 s3q0Var2 = s3q0.a;
                if (linearGradient != null) {
                    paint.setShader(linearGradient);
                    canvas.drawRect(rectF, paint);
                    paint.setShader(null);
                }
                canvas.restoreToCount(saveLayer2);
                return;
            } finally {
            }
        }
        Layout layout2 = getLayout();
        if (layout2 == null) {
            return;
        }
        final int lineBottom = layout2.getLineBottom(this.d - 2) + getExtendedPaddingTop() + getPaddingTop();
        int width2 = getWidth();
        save = canvas.save();
        canvas.clipRect(0, 0, width2, lineBottom);
        try {
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            CharSequence t0 = drm0.t0(getText().subSequence(this.m, getText().length()));
            int width3 = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            if (width3 <= 0 || t0.length() == 0) {
                return;
            }
            StaticLayout build = StaticLayout.Builder.obtain(t0, 0, t0.length(), getPaint(), 1073741823).setIncludePad(false).build();
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(t0, 0, t0.length(), getPaint(), Math.max(width3, (int) (build.getLineCount() > 0 ? build.getLineWidth(0) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
            Layout layout3 = getLayout();
            if (layout3 == null || (alignment = layout3.getAlignment()) == null) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            final StaticLayout build2 = obtain.setAlignment(alignment).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(false).setMaxLines(1).build();
            final float compoundPaddingLeft = getLayoutDirection() == 0 ? getCompoundPaddingLeft() : (getWidth() - getCompoundPaddingRight()) - build2.getWidth();
            int compoundPaddingLeft2 = getCompoundPaddingLeft();
            int width4 = getWidth() - getCompoundPaddingRight();
            int height2 = getHeight();
            save = canvas.save();
            canvas.clipRect(compoundPaddingLeft2, lineBottom, width4, height2);
            try {
                gzs gzsVar = new gzs() { // from class: xsna.dtu0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        float f = compoundPaddingLeft;
                        int i = lineBottom;
                        StaticLayout staticLayout = build2;
                        int i2 = VkFadeText.n;
                        Canvas canvas2 = canvas;
                        int save2 = canvas2.save();
                        try {
                            canvas2.translate(f, i);
                            staticLayout.draw(canvas2);
                            canvas2.restoreToCount(save2);
                            return s3q0.a;
                        } catch (Throwable th) {
                            canvas2.restoreToCount(save2);
                            throw th;
                        }
                    }
                };
                int saveLayer3 = canvas.saveLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight(), null);
                gzsVar.invoke();
                if (linearGradient != null) {
                    paint.setShader(linearGradient);
                    canvas.drawRect(rectF, paint);
                    paint.setShader(null);
                }
                canvas.restoreToCount(saveLayer3);
            } finally {
            }
        } finally {
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Layout layout;
        int b;
        super.onLayout(z, i, i2, i3, i4);
        this.g.setEmpty();
        if (this.i && (layout = getLayout()) != null && layout.getLineCount() != 0 && (r8 = b()) >= 0) {
            if (!this.h) {
                float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int lineCount = layout.getLineCount();
                int i5 = this.d;
                if (lineCount <= i5) {
                    if (i5 == 1) {
                    }
                }
            }
            if (f()) {
                if (getLayout() == null) {
                    return;
                }
                i(getCompoundPaddingLeft(), getWidth() - getCompoundPaddingRight(), r7.getLineBottom(this.d - 2) + getExtendedPaddingTop() + getPaddingTop(), r7.getLineBottom(this.d - 1) - r7.getLineTop(this.d - 1), getLayoutDirection() == 0);
                return;
            }
            Layout layout2 = getLayout();
            if (layout2 != null && (b = b()) >= 0) {
                float lineTop = layout2.getLineTop(b);
                float lineBottom = layout2.getLineBottom(b) - lineTop;
                if (lineBottom <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return;
                }
                float paddingTop = getPaddingTop() + lineTop;
                float lineLeft = layout2.getLineLeft(b) + getPaddingLeft();
                float lineRight = layout2.getLineRight(b) + getPaddingLeft();
                float width2 = getWidth() - getPaddingRight();
                i(lineLeft, lineRight > width2 ? width2 : lineRight, paddingTop, lineBottom, getLayoutDirection() == 0);
                return;
            }
            return;
        }
        this.f = null;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        this.b = true;
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout == null) {
            this.b = false;
            return;
        }
        if (layout.getLineCount() == 0) {
            this.b = false;
            return;
        }
        int max = Math.max(1, Math.min(this.d, layout.getLineCount())) - 1;
        this.c = max;
        setMeasuredDimension(getMeasuredWidth(), getPaddingBottom() + layout.getLineBottom(max));
        Layout layout2 = getLayout();
        if (layout2 != null) {
            int measuredHeight = getMeasuredHeight();
            int i3 = this.c + 1;
            if (i3 < 1) {
                i3 = 1;
            }
            loop0: for (int i4 = i3 - 1; -1 < i4; i4--) {
                if (i4 >= 0 && i4 < layout2.getLineCount()) {
                    if (!e(layout2, i4)) {
                        break;
                    }
                    int lineStart = layout2.getLineStart(i4);
                    int lineVisibleEnd = layout2.getLineVisibleEnd(i4);
                    if (lineVisibleEnd < lineStart) {
                        lineVisibleEnd = lineStart;
                    }
                    while (lineStart < lineVisibleEnd) {
                        char charAt = layout2.getText().charAt(lineStart);
                        if (charAt == 8230 || charAt == 8229) {
                            break loop0;
                        } else {
                            lineStart++;
                        }
                    }
                    measuredHeight -= layout2.getLineBottom(i4) - layout2.getLineTop(i4);
                }
            }
            int lineBottom = layout2.getLineCount() > 0 ? layout2.getLineBottom(0) - layout2.getLineTop(0) : 0;
            int measuredWidth = getMeasuredWidth();
            if (measuredHeight < lineBottom) {
                measuredHeight = lineBottom;
            }
            setMeasuredDimension(measuredWidth, measuredHeight);
        }
        this.m = f() ? layout.getLineEnd(this.d - 2) : 0;
        this.b = false;
    }

    @Override // android.view.View
    public final void requestLayout() {
        if (this.b) {
            return;
        }
        super.requestLayout();
    }

    public final void setAlwaysFade(boolean z) {
        if (this.h != z) {
            this.h = z;
            this.f = null;
            requestLayout();
            invalidate();
        }
    }

    public final void setClipToEdge(boolean z) {
        if (this.j != z) {
            this.j = z;
            setEllipsize(null);
            if (this.d == 1) {
                setSingleLine(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public final void setCustomCenterAlignmentEllipsize(boolean z) {
        if (this.k != z) {
            this.k = z;
            invalidate();
        }
    }

    public final void setFade(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (!z) {
                this.f = null;
            }
            super.setEllipsize(z ? null : TextUtils.TruncateAt.END);
            requestLayout();
            invalidate();
        }
    }

    public final void setFadeLength(float f) {
        if (epx.d(this.l, f)) {
            return;
        }
        this.l = Float.valueOf(f);
        requestLayout();
        invalidate();
    }

    public final void setMaxTextLines(int i) {
        if (i < 1) {
            i = 1;
        }
        if (this.d != i) {
            this.d = i;
            setMaxLines(i);
            this.f = null;
            requestLayout();
            invalidate();
        }
    }

    public VkFadeText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.d = Integer.MAX_VALUE;
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.e = paint;
        this.g = new RectF();
        this.i = true;
        super.setEllipsize(null);
        setMaxLines(this.d);
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }
}
