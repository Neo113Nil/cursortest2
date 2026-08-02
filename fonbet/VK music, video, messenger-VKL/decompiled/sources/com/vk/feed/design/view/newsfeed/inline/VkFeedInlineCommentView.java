package com.vk.feed.design.view.newsfeed.inline;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import xsna.an10;
import xsna.cn70;
import xsna.cqi;
import xsna.dhr0;
import xsna.elx0;
import xsna.gp10;
import xsna.lep;
import xsna.qup0;
import xsna.swe0;
import xsna.xxk0;

/* compiled from: VkFeedInlineCommentView.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes18.dex */
public final class VkFeedInlineCommentView extends ViewGroup implements View.OnClickListener, lep {
    public b A;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public StaticLayout f;
    public final TextPaint g;
    public StaticLayout h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public float p;
    public int q;
    public final SpannableStringBuilder r;
    public final SpannableStringBuilder s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public final boolean x;
    public float y;
    public final SingleLineTransformationMethod z;

    /* compiled from: VkFeedInlineCommentView.kt */
    public static final class a extends ViewGroup.MarginLayoutParams {
    }

    /* compiled from: VkFeedInlineCommentView.kt */
    public interface b {
        void onClick(View view);
    }

    public VkFeedInlineCommentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TextPaint textPaint = new TextPaint(1);
        this.g = textPaint;
        this.i = Integer.MAX_VALUE;
        this.r = new SpannableStringBuilder();
        this.s = new SpannableStringBuilder();
        this.y = 1.0f;
        SingleLineTransformationMethod singleLineTransformationMethod = SingleLineTransformationMethod.getInstance();
        this.z = singleLineTransformationMethod;
        LayoutInflater.from(context).inflate(R.layout.pds_inline_comment, (ViewGroup) this, true);
        setClipChildren(false);
        setClipToPadding(false);
        setAddStatesFromChildren(true);
        if (isInEditMode()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "Pavel");
            Typeface a2 = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, getContext());
            TextSizeUnit textSizeUnit = TextSizeUnit.SP;
            spannableStringBuilder.setSpan(new qup0(a2, -16777216), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sit amet auctor turpis. Fusce volutpat felis in posuere hendrerit");
            this.b = spannableStringBuilder;
            this.c = spannableStringBuilder2;
            this.d = singleLineTransformationMethod.getTransformation(spannableStringBuilder3, this);
            requestLayout();
            invalidate();
            setMaxLines(2);
            setTextColor(-7829368);
            com.vk.typography.b.j(textPaint, getContext(), FontFamily.REGULAR, Float.valueOf(14.0f), 8);
            setTextMarginStart((int) (getResources().getDisplayMetrics().density * 8));
            setAttachText("Document");
        }
        com.vk.typography.b.j(textPaint, getContext(), FontFamily.REGULAR, Float.valueOf(13.0f), 8);
        setPadding(cn70.b(16), cn70.b(1), cn70.b(16), cn70.b(4));
        setTextLineSpacingExtra(cn70.a() * 1.0f);
        setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
        setLikesGravity(16);
        setNameTextSpaceWidth(cn70.b(8));
        setExtraPaddingVertical(0);
        if (!this.x) {
            this.x = true;
            requestLayout();
            invalidate();
        }
        setMaxLines(1);
        setNameMaxWidthRatio(0.5f);
        setOnClickListener(this);
    }

    private final int getTextWidth() {
        StaticLayout staticLayout;
        if (!a() || (staticLayout = this.h) == null || staticLayout.getLineCount() <= 0) {
            return 0;
        }
        return an10.b(staticLayout.getLineWidth(0));
    }

    private final void setExtraPaddingVertical(int i) {
        if (this.w != i) {
            this.w = i;
            requestLayout();
            invalidate();
        }
    }

    private final void setLikesGravity(int i) {
        if (this.u != i) {
            this.u = i;
            requestLayout();
            invalidate();
        }
    }

    private final void setMaxLines(int i) {
        if (i < 1) {
            i = 1;
        }
        if (this.i != i) {
            this.i = i;
            requestLayout();
            invalidate();
        }
    }

    private final void setNameMaxWidthRatio(float f) {
        float f2 = swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (this.y == f2) {
            return;
        }
        this.y = f2;
        requestLayout();
        invalidate();
    }

    private final void setTextColor(int i) {
        TextPaint textPaint = this.g;
        if (textPaint.getColor() != i) {
            textPaint.setColor(i);
            invalidate();
        }
    }

    private final void setTextLineSpacingExtra(float f) {
        if (this.p == f) {
            return;
        }
        this.p = f;
        this.q = (int) (f + 0.5f);
        requestLayout();
        invalidate();
    }

    private final void setTextMarginStart(int i) {
        if (this.o != i) {
            this.o = i;
            requestLayout();
            invalidate();
        }
    }

    public final boolean a() {
        return (this.h == null || this.l == 0 || this.m == 0) ? false : true;
    }

    public final void b(int i, int i2, int i3) {
        StaticLayout staticLayout;
        this.j = i + this.o;
        int i4 = this.m;
        if (i4 <= 0) {
            i4 = (this.n <= 0 || (staticLayout = this.f) == null) ? 0 : staticLayout.getHeight();
        }
        this.k = an10.b(((i3 - i2) - i4) / 2.0f) + i2;
    }

    public final int c(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            Layout.Alignment alignment = getLayoutDirection() == 1 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
            float f = this.p;
            TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
            StaticLayout a2 = new xxk0(charSequence, this.g, Integer.MAX_VALUE, alignment, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, null, 1, 1368).a();
            if (a2.getLineCount() > 0) {
                return (int) (a2.getLineWidth(0) + 0.5f);
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (a()) {
            canvas.save();
            canvas.translate(this.j, this.k);
            StaticLayout staticLayout = this.h;
            if (staticLayout != null) {
                staticLayout.draw(canvas);
            }
            canvas.restore();
        }
        if (this.f == null || this.n <= 0) {
            return;
        }
        if (this.m == 0 || a()) {
            int textWidth = this.j + getTextWidth() + (a() ? an10.b(this.g.measureText(" ")) : 0);
            canvas.save();
            canvas.translate(textWidth, this.k);
            StaticLayout staticLayout2 = this.f;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            }
            canvas.restore();
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
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.A;
        if (bVar != null) {
            bVar.onClick(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        StaticLayout staticLayout = this.h;
        if (staticLayout == null || staticLayout.getLineCount() < 2) {
            b(getPaddingLeft(), getPaddingTop() + this.w, (((i4 - i2) - getPaddingBottom()) - this.w) - (this.x ? this.q : 0));
        } else {
            b(getPaddingLeft(), getPaddingTop() + this.w, (((i4 - i2) - getPaddingBottom()) - this.w) - (this.x ? this.q : 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        StaticLayout staticLayout;
        int a2 = gp10.a(i, getSuggestedMinimumWidth(), Integer.MAX_VALUE, getPaddingRight() + getPaddingLeft());
        CharSequence charSequence = this.e;
        TextPaint textPaint = this.g;
        int measureText = (charSequence == null || charSequence.length() == 0) ? 0 : (int) (textPaint.measureText(charSequence, 0, charSequence.length()) + 0.5f);
        this.n = measureText;
        boolean z = true;
        if (measureText > 0) {
            boolean z2 = getLayoutDirection() == 1;
            CharSequence charSequence2 = this.e;
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            int i3 = this.n;
            Layout.Alignment alignment = z2 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
            float f = this.p;
            TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
            staticLayout = null;
            this.f = new xxk0(charSequence2, textPaint, i3, alignment, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, null, 1, 1368).a();
        } else {
            staticLayout = null;
            this.f = null;
        }
        int i4 = a2 - this.o;
        int i5 = i4 - this.n;
        if (i5 < 0) {
            i5 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = this.s;
        spannableStringBuilder.clear();
        spannableStringBuilder.clearSpans();
        CharSequence charSequence3 = this.b;
        if (charSequence3 == null) {
            charSequence3 = "";
        }
        CharSequence charSequence4 = this.c;
        if (charSequence4 == null) {
            charSequence4 = "";
        }
        float c = (i4 - c(charSequence4)) * this.y;
        if (c(charSequence3) > c) {
            spannableStringBuilder.append(TextUtils.ellipsize(charSequence3, textPaint, c, TextUtils.TruncateAt.END));
            spannableStringBuilder.append(charSequence4);
            this.t = true;
        } else {
            spannableStringBuilder.append(charSequence3).append(charSequence4);
            this.t = false;
        }
        if ((!this.t || this.i == 1) && spannableStringBuilder.length() > 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) " ");
            int length2 = spannableStringBuilder.length();
            CharSequence charSequence5 = this.c;
            spannableStringBuilder.setSpan(new elx0((charSequence5 == null || charSequence5.length() == 0) ? this.v : cn70.b(8)), length, length2, 33);
        } else if (this.t && spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) "\n");
        }
        CharSequence charSequence6 = this.d;
        if (charSequence6 == null) {
            charSequence6 = "";
        }
        spannableStringBuilder.append(charSequence6);
        SpannableStringBuilder spannableStringBuilder2 = this.r;
        spannableStringBuilder2.clear();
        spannableStringBuilder2.clearSpans();
        if (spannableStringBuilder.length() == 0) {
            this.l = 0;
            this.m = 0;
            this.h = staticLayout;
        } else {
            Layout.Alignment alignment2 = getLayoutDirection() == 1 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
            int i6 = this.i;
            TextUtils.TruncateAt truncateAt = i6 == 1 ? TextUtils.TruncateAt.END : staticLayout;
            float f2 = this.p;
            TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.LOCALE;
            StaticLayout a3 = new xxk0(spannableStringBuilder, textPaint, i4, alignment2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, truncateAt, i6, 1368).a();
            int min = Math.min(this.i, a3.getLineCount()) - 1;
            if (min < this.i - 1) {
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder.toString());
            } else {
                int lineStart = a3.getLineStart(min);
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder.subSequence(lineStart, spannableStringBuilder.length()), textPaint, i5, TextUtils.TruncateAt.END);
                if (lineStart != 0) {
                    spannableStringBuilder2.append((CharSequence) spannableStringBuilder.toString(), 0, lineStart);
                }
                if (!TextUtils.isEmpty(ellipsize)) {
                    spannableStringBuilder2.append((CharSequence) ellipsize.toString());
                }
            }
            boolean z3 = spannableStringBuilder.length() != spannableStringBuilder2.length();
            Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
            int length3 = z3 ? spannableStringBuilder2.length() - 1 : spannableStringBuilder2.length();
            for (Object obj : spans) {
                int spanStart = spannableStringBuilder.getSpanStart(obj);
                int spanEnd = spannableStringBuilder.getSpanEnd(obj);
                int spanFlags = spannableStringBuilder.getSpanFlags(obj);
                if (spanStart <= length3) {
                    spannableStringBuilder2.setSpan(obj, spanStart, Math.min(spanEnd, length3), spanFlags);
                }
            }
            Layout.Alignment alignment3 = getLayoutDirection() == 1 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
            int i7 = this.i;
            TextUtils.TruncateAt truncateAt2 = i7 == 1 ? TextUtils.TruncateAt.END : null;
            float f3 = this.p;
            TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.LOCALE;
            StaticLayout a4 = new xxk0(spannableStringBuilder2, textPaint, i4, alignment3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, truncateAt2, i7, 1368).a();
            this.l = a4.getWidth();
            this.m = a4.getHeight();
            this.l = a4.getLineCount() > 0 ? an10.b(a4.getLineWidth(0)) : a4.getWidth();
            StaticLayout staticLayout2 = this.f;
            if (staticLayout2 != null) {
                this.l += staticLayout2.getLineCount() > 0 ? an10.b(staticLayout2.getLineWidth(0)) : staticLayout2.getWidth();
            }
            this.h = a4;
        }
        StaticLayout staticLayout3 = this.h;
        if (staticLayout3 != null && staticLayout3.getLineCount() >= 2) {
            z = false;
        }
        int i8 = (!z || this.x) ? this.q : 0;
        int i9 = !z ? this.w : 0;
        int i10 = this.m;
        if (i10 > 0) {
            r3 = (i9 * 2) + i10 + i8;
        } else if (this.n > 0) {
            StaticLayout staticLayout4 = this.f;
            r3 = (staticLayout4 != null ? staticLayout4.getHeight() : 0) + i8;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), getPaddingBottom() + getPaddingTop() + r3);
    }

    public final void setAttachText(CharSequence charSequence) {
        this.e = charSequence;
        requestLayout();
        invalidate();
    }

    public final void setListener(b bVar) {
        this.A = bVar;
    }

    public final void setNameTextSpaceWidth(int i) {
        if (this.v != i) {
            this.v = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setTextFontSize(float f) {
        FontFamily fontFamily = FontFamily.REGULAR;
        com.vk.typography.b.j(this.g, getContext(), fontFamily, Float.valueOf(f), 8);
    }

    @Override // xsna.lep
    public final void y() {
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public final void setTextStyle(int i) {
    }
}
