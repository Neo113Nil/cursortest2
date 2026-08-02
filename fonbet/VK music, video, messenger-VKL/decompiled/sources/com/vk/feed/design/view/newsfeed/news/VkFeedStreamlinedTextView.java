package com.vk.feed.design.view.newsfeed.news;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.metrics.eventtracking.b;
import com.vk.typography.FontFamily;
import java.util.ArrayList;
import xsna.an10;
import xsna.bwt0;
import xsna.dhr0;
import xsna.epx;
import xsna.gp10;
import xsna.iah0;
import xsna.rik0;
import xsna.swe0;
import xsna.too0;
import xsna.tr;
import xsna.xxk0;

/* compiled from: VkFeedStreamlinedTextView.kt */
/* loaded from: classes18.dex */
public final class VkFeedStreamlinedTextView extends ViewGroup implements too0 {
    public final ArrayList b;
    public CharSequence c;
    public final TextPaint d;
    public Float e;
    public FontFamily f;
    public StaticLayout g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final SpannableStringBuilder l;
    public final SpannableStringBuilder m;
    public int n;
    public int o;
    public Integer p;
    public final Rect q;

    /* compiled from: VkFeedStreamlinedTextView.kt */
    public static final class a extends ViewGroup.MarginLayoutParams {
    }

    public VkFeedStreamlinedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new ArrayList();
        this.d = new TextPaint(1);
        this.e = Float.valueOf(16.0f);
        this.f = FontFamily.REGULAR;
        this.h = Integer.MAX_VALUE;
        this.l = new SpannableStringBuilder();
        this.m = new SpannableStringBuilder();
        this.q = new Rect();
        new Rect();
    }

    private final int getContentHeight() {
        int i = this.j;
        if (i > 0) {
            int i2 = this.o;
            return i < i2 ? i2 : i;
        }
        int i3 = this.o;
        if (i3 > 0) {
            return i3;
        }
        return 0;
    }

    private final Layout.Alignment getFinalTextAlignment() {
        return getLayoutDirection() == 1 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
    }

    @Override // xsna.too0
    public final void Ng() {
        Integer num = this.p;
        if (num != null) {
            this.d.setColor(dhr0.t.c(num.intValue()));
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        try {
            if ((this.g == null || this.i == 0) ? false : true) {
                canvas.save();
                Rect rect = this.q;
                canvas.translate(rect.left, rect.top);
                try {
                    StaticLayout staticLayout = this.g;
                    if (staticLayout != null) {
                        staticLayout.draw(canvas);
                    }
                } catch (IndexOutOfBoundsException e) {
                    b.a.a(e);
                }
                canvas.restore();
            }
        } catch (Exception e2) {
            b.a.a(e2);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams != null ? new a(layoutParams) : new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        view.measure(ViewGroup.getChildMeasureSpec(i, marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Integer num;
        int i5;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        StaticLayout staticLayout = this.g;
        Rect rect = this.q;
        if (staticLayout != null && this.i != 0) {
            rect.left = this.k + paddingLeft;
            int b = an10.b(((paddingBottom - paddingTop) - this.j) / 2.0f) + paddingTop;
            rect.top = b;
            rect.right = rect.left + this.i;
            rect.bottom = b + this.j;
        }
        int lineCount = staticLayout != null ? staticLayout.getLineCount() - 1 : -1;
        if (staticLayout == null || staticLayout.getLineCount() <= 0) {
            num = null;
            i5 = 0;
        } else {
            paddingLeft = getFinalTextAlignment() == Layout.Alignment.ALIGN_CENTER ? an10.b(staticLayout.getLineRight(lineCount)) - this.n : paddingLeft + an10.b(staticLayout.getLineRight(lineCount) - staticLayout.getLineLeft(lineCount)) + this.k;
            i5 = staticLayout.getLineBottom(lineCount) - staticLayout.getLineTop(lineCount);
            num = Integer.valueOf(rect.bottom);
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            if (view.getVisibility() == 0) {
                int intValue = num != null ? num.intValue() : view.getMeasuredHeight();
                int measuredHeight = intValue - view.getMeasuredHeight();
                if (i5 > 0) {
                    view.getLayoutParams();
                    int i7 = i5 - (intValue - measuredHeight);
                    if (i7 > 0) {
                        int i8 = i7 / 2;
                        measuredHeight -= i8;
                        intValue -= i8;
                    }
                }
                int P = bwt0.P(view) + measuredHeight;
                int P2 = bwt0.P(view) + intValue;
                int M = P - bwt0.M(view);
                int M2 = P2 - bwt0.M(view);
                int i9 = i6 + 1;
                if (bwt0.K(view)) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        int measuredWidth = view.getMeasuredWidth();
                        int marginStart = (i9 != 0 ? marginLayoutParams.getMarginStart() : 0) + paddingLeft;
                        view.layout(marginStart, M, measuredWidth + marginStart, M2);
                    }
                }
                int measuredWidth2 = view.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                paddingLeft = (marginLayoutParams2 != null ? marginLayoutParams2.getMarginEnd() + marginLayoutParams2.getMarginStart() : 0) + measuredWidth2 + paddingLeft;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0223, code lost:
    
        if (r2 > r3) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0225, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x023c, code lost:
    
        if (r2 > r3) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        StaticLayout staticLayout;
        int i4;
        int size;
        int size2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int a2 = gp10.a(i, suggestedMinimumWidth, Integer.MAX_VALUE, paddingRight);
        int i5 = 1073741823;
        int i6 = 0;
        int i7 = Integer.MIN_VALUE;
        int a3 = tr.a(gp10.a(i2, suggestedMinimumHeight, Integer.MAX_VALUE, paddingBottom), 1073741823, 0, Integer.MIN_VALUE);
        int i8 = a2 - this.k;
        this.n = 0;
        this.o = 0;
        ArrayList arrayList = this.b;
        int size3 = arrayList.size() - 1;
        int i9 = 0;
        while (-1 < size3) {
            View view = (View) arrayList.get(size3);
            if (view.getVisibility() == 0) {
                int a4 = tr.a(a2, i5, 0, i7);
                if (view.getVisibility() != 8) {
                    measureChildWithMargins(view, a4, 0, a3, 0);
                    view.getMeasuredWidth();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.getMarginStart();
                        marginLayoutParams.getMarginEnd();
                    }
                }
                if ((view.getVisibility() != 8 ? view.getMeasuredHeight() : 0) > this.o) {
                    this.o = view.getVisibility() != 8 ? view.getMeasuredHeight() : 0;
                }
                int measuredWidth = this.n + (view.getVisibility() != 8 ? view.getMeasuredWidth() : 0);
                this.n = measuredWidth;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                int marginStart = measuredWidth + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0);
                this.n = marginStart;
                if (i9 > 0) {
                    ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    this.n = marginStart + (layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd() : 0);
                }
                i9++;
            }
            size3--;
            i5 = 1073741823;
            i7 = Integer.MIN_VALUE;
        }
        int i10 = this.n;
        CharSequence charSequence = this.c;
        SpannableStringBuilder spannableStringBuilder = this.m;
        spannableStringBuilder.clear();
        this.l.clear();
        Layout.Alignment finalTextAlignment = getFinalTextAlignment();
        int i11 = this.h;
        if (i11 <= 0) {
            i3 = 0;
        } else {
            if (charSequence != null && charSequence.length() != 0) {
                TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                TextPaint textPaint = this.d;
                StaticLayout a5 = new xxk0(charSequence, textPaint, i8, finalTextAlignment, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, i11, 1368).a();
                int g = swe0.g(a5.getLineCount(), 1, i11) - 1;
                if (g < 0) {
                    g = 0;
                }
                int lineStart = a5.getLineStart(g);
                CharSequence subSequence = charSequence.subSequence(lineStart, charSequence.length());
                int i12 = (i8 - this.k) - i10;
                if (i12 < 0) {
                    i12 = 0;
                }
                CharSequence ellipsize = TextUtils.ellipsize(subSequence, textPaint, i12, TextUtils.TruncateAt.END);
                spannableStringBuilder.append((CharSequence) charSequence.toString(), 0, lineStart);
                if (ellipsize != null && ellipsize.length() != 0) {
                    spannableStringBuilder.append((CharSequence) ellipsize.toString());
                }
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                    int length = spannableStringBuilder.length();
                    int length2 = spans.length;
                    int i13 = 0;
                    while (i13 < length2) {
                        Object obj = spans[i13];
                        int i14 = i11;
                        int g2 = swe0.g(spanned.getSpanStart(obj), i6, spannableStringBuilder.length());
                        int g3 = swe0.g(spanned.getSpanEnd(obj), g2, spannableStringBuilder.length());
                        int spanFlags = spanned.getSpanFlags(obj);
                        if (g2 <= length) {
                            if (g3 > length) {
                                g3 = length;
                            }
                            spannableStringBuilder.setSpan(obj, g2, g3, spanFlags);
                        }
                        i13++;
                        i11 = i14;
                        i6 = 0;
                    }
                }
                int i15 = i11;
                if (finalTextAlignment == Layout.Alignment.ALIGN_CENTER && i10 > 0) {
                    spannableStringBuilder.append((CharSequence) rik0.b(i10 / iah0.f().density));
                }
                TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.LOCALE;
                StaticLayout a6 = new xxk0(spannableStringBuilder, textPaint, i8, finalTextAlignment, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, i15, 1368).a();
                this.i = a6.getWidth();
                this.j = a6.getHeight();
                this.g = a6;
                int contentHeight = getContentHeight();
                staticLayout = this.g;
                if (staticLayout == null) {
                    i4 = 1;
                    if (staticLayout.getLineCount() > 1) {
                        size = View.MeasureSpec.getSize(i);
                        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + contentHeight);
                    }
                } else {
                    i4 = 1;
                }
                if (staticLayout == null && staticLayout.getLineCount() == i4) {
                    size = an10.b(staticLayout.getLineWidth(0)) + getPaddingRight() + getPaddingLeft() + this.n + this.k;
                    size2 = View.MeasureSpec.getSize(i);
                } else if (staticLayout != null) {
                    size = this.k + getPaddingRight() + getPaddingLeft() + this.n;
                    size2 = View.MeasureSpec.getSize(i);
                } else {
                    size = View.MeasureSpec.getSize(i);
                }
                setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + contentHeight);
            }
            i3 = 0;
        }
        this.i = i3;
        this.j = i3;
        this.g = null;
        int contentHeight2 = getContentHeight();
        staticLayout = this.g;
        if (staticLayout == null) {
        }
        if (staticLayout == null) {
        }
        if (staticLayout != null) {
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + contentHeight2);
    }

    public final void setDynamicTextColor(Integer num) {
        int i;
        if (epx.f(this.p, num)) {
            return;
        }
        this.p = num;
        if (num != null) {
            i = dhr0.t.c(num.intValue());
        } else {
            i = -16777216;
        }
        this.d.setColor(i);
        invalidate();
    }

    public final void setMaxLines(int i) {
        if (this.h == i) {
            return;
        }
        this.h = i;
        requestLayout();
        invalidate();
    }

    public final void setSingleLine(boolean z) {
        if (z) {
            setMaxLines(1);
        } else {
            setMaxLines(Integer.MAX_VALUE);
        }
    }

    public final void setText(CharSequence charSequence) {
        if (TextUtils.equals(this.c, charSequence)) {
            return;
        }
        this.c = charSequence;
        requestLayout();
        invalidate();
    }

    public final void setTextColor(int i) {
        TextPaint textPaint = this.d;
        if (textPaint.getColor() == i) {
            return;
        }
        textPaint.setColor(i);
        invalidate();
    }

    public final void setTextMarginStart(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        requestLayout();
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }
}
