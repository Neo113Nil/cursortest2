package com.vk.im.ui.views.msg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.im.ui.views.span.SpanPressableTextView;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.b;
import com.vk.ui.R$styleable;
import xsna.cn70;
import xsna.hux0;
import xsna.lhg;
import xsna.swe0;

/* compiled from: MsgPartTextView.kt */
/* loaded from: classes2.dex */
public final class MsgPartTextView extends SpanPressableTextView implements hux0 {
    public final TextPaint l;
    public int m;
    public boolean n;
    public final Paint o;
    public final Paint.FontMetricsInt p;
    public int q;
    public int r;
    public int s;
    public int t;
    public final SpannableStringBuilder u;
    public final TimeAndStatusView v;

    public MsgPartTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TextPaint textPaint = new TextPaint();
        this.l = textPaint;
        this.o = new Paint();
        this.p = new Paint.FontMetricsInt();
        this.u = new SpannableStringBuilder();
        TimeAndStatusView timeAndStatusView = new TimeAndStatusView(context, attributeSet, 0, 8, 0);
        timeAndStatusView.setDarkBackground(this.n);
        timeAndStatusView.setTimeTextColor(this.m);
        this.v = timeAndStatusView;
        textPaint.setAntiAlias(true);
        this.q = 0;
        this.r = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.t, 0, 0);
        setupAttrsStyle(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static int b(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return (size < i2 || size < i3) ? size : swe0.g(i3, i2, Integer.MAX_VALUE);
        }
        if (mode == 0) {
            return swe0.g(i3, i2, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException(lhg.a(mode, "Unknown specMode: "));
    }

    private final void setTimeText(CharSequence charSequence) {
        requestLayout();
        invalidate();
    }

    @SuppressLint({"CustomViewStyleable"})
    private final void setupAttrsStyle(TypedArray typedArray) {
        int i;
        int e = (int) (cn70.e() * 12.0f);
        int resourceId = typedArray.getResourceId(5, 0);
        int i2 = -16777216;
        String str = C.SANS_SERIF_NAME;
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(resourceId, R$styleable.u);
            i2 = obtainStyledAttributes.getColor(2, -16777216);
            e = obtainStyledAttributes.getDimensionPixelSize(0, e);
            i = obtainStyledAttributes.getInteger(1, 0);
            String string = obtainStyledAttributes.getString(3);
            if (string != null) {
                str = string;
            }
            obtainStyledAttributes.recycle();
        } else {
            i = 0;
        }
        int color = typedArray.getColor(6, i2);
        int color2 = typedArray.getColor(0, 0);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, e);
        typedArray.getInteger(8, i);
        String string2 = typedArray.getString(1);
        if (string2 != null) {
            str = string2;
        }
        setTimeTextColor(color);
        setTimeBgColor(color2);
        b.e(this.l, getContext(), str, Float.valueOf(dimensionPixelSize), TextSizeUnit.PX);
        setTimeTextSpaceX(typedArray.getDimensionPixelSize(2, cn70.b(15)));
        setTimeTextSpaceY(typedArray.getDimensionPixelSize(3, cn70.b(15)));
    }

    @Override // xsna.hux0
    public final void X3() {
        requestLayout();
        invalidate();
    }

    public final boolean e() {
        Paint paint = this.o;
        return (paint.getColor() == 0 || paint.getAlpha() == 0) ? false : true;
    }

    @Override // xsna.hux0
    public TimeAndStatusView getTimeAndStatusView() {
        return this.v;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        TimeAndStatusView timeAndStatusView = getTimeAndStatusView();
        float measuredWidth = ((getMeasuredWidth() - getPaddingRight()) - this.q) - (e() ? cn70.b(4) : 0);
        float measuredHeight = ((getMeasuredHeight() - getPaddingBottom()) - this.p.descent) - cn70.f(1);
        int b = e() ? cn70.b(1) : 0;
        canvas.save();
        canvas.translate(measuredWidth, (measuredHeight - b) - this.r);
        timeAndStatusView.draw(canvas);
        canvas.restore();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getTimeAndStatusView().layout(0, 0, getTimeAndStatusView().getMeasuredWidth(), getTimeAndStatusView().getMeasuredHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0154, code lost:
    
        if ((r16.s + r7) <= (r4 - r16.q)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0172, code lost:
    
        r8 = (r8 + r16.r) + xsna.cn70.f(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0164, code lost:
    
        r7 = java.lang.Math.max(r7, (r1 + r16.s) + r16.q);
        r8 = r8 + r16.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0162, code lost:
    
        if (r9 <= (r7 < r11 ? r4 - r11 : r7 - r11)) goto L56;
     */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int max = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size < suggestedMinimumWidth ? Math.max(0, suggestedMinimumWidth - paddingRight) : size > Integer.MAX_VALUE ? Math.max(0, Integer.MAX_VALUE - paddingRight) : Math.max(0, size - paddingRight) : Math.max(0, Integer.MAX_VALUE - paddingRight);
        if (layout == null || layout.getLineCount() == 0) {
            return;
        }
        if (layout.getLineCount() > getMaxLines() && getEllipsize() == TextUtils.TruncateAt.END) {
            SpannableStringBuilder spannableStringBuilder = this.u;
            spannableStringBuilder.clear();
            spannableStringBuilder.clearSpans();
            int lineVisibleEnd = getLayout().getLineVisibleEnd(getMaxLines() - 1);
            int lineEnd = getLayout().getLineEnd(getMaxLines() - 1);
            while (lineEnd > lineVisibleEnd && getText().charAt(lineEnd) == '\n') {
                lineEnd--;
            }
            spannableStringBuilder.append(getText().subSequence(0, lineEnd));
            spannableStringBuilder.append((CharSequence) "…");
            setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            return;
        }
        int measuredWidth = getMeasuredWidth() - paddingRight;
        int measuredHeight = getMeasuredHeight() - paddingBottom;
        int lineCount = layout.getLineCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i3 >= lineCount) {
                break;
            }
            int ceil = (int) Math.ceil(layout.getLineRight(i3) - layout.getLineLeft(i3));
            boolean z = layout.getEllipsisCount(i3) > 0;
            i3++;
            if (i4 < ceil) {
                i4 = ceil;
            }
            if (z) {
                i5 = i3;
                break;
            }
            i5 = i3;
        }
        if (i4 >= 0) {
            measuredWidth = Math.min(i4, layout.getEllipsizedWidth());
        }
        int ceil2 = (int) Math.ceil(layout.getLineRight(i5 - 1));
        if (getTimeAndStatusView().getVisibility() == 8) {
            this.q = 0;
            this.r = 0;
        } else {
            getTimeAndStatusView().measure(0, 0);
            this.q = getTimeAndStatusView().getMeasuredWidth();
            this.r = getTimeAndStatusView().getMeasuredHeight();
            if (this.l.getTypeface().isItalic()) {
                this.q += (int) (cn70.e() * 1.25f);
            }
            if (i5 != 1) {
                int i6 = this.s + ceil2;
                int i7 = this.q;
            }
        }
        setMeasuredDimension(b(i, suggestedMinimumWidth, measuredWidth + paddingRight + (e() ? cn70.b(8) : 0)), b(i2, suggestedMinimumHeight, measuredHeight + paddingBottom + (e() ? cn70.b(4) : 0)));
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void setTimeBgColor(int i) {
        this.o.setColor(i);
        this.n = i != 0;
        getTimeAndStatusView().setDarkBackground(this.n);
        invalidate();
    }

    public final void setTimeTextColor(int i) {
        this.m = i;
        this.l.setColor(i);
        getTimeAndStatusView().setTimeTextColor(i);
        invalidate();
    }

    public final void setTimeTextSpaceX(int i) {
        this.s = i;
        requestLayout();
        invalidate();
    }

    public final void setTimeTextSpaceY(int i) {
        this.t = i;
        requestLayout();
        invalidate();
    }
}
