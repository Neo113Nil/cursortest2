package com.vk.feed.tool.view.newsfeed.coauthors;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.text.VkFadeText;
import xsna.gp10;
import xsna.gzs;
import xsna.jno0;
import xsna.jw5;
import xsna.s3q0;
import xsna.tr;

/* compiled from: CoauthorsTextLayout.kt */
/* loaded from: classes18.dex */
public final class CoauthorsTextLayout extends ViewGroup {
    public final TextView[] b;
    public final int[] c;
    public boolean d;
    public gzs<s3q0> e;
    public final StringBuilder f;

    /* compiled from: CoauthorsTextLayout.kt */
    public static final class a extends ViewGroup.MarginLayoutParams {
    }

    public CoauthorsTextLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new TextView[3];
        this.c = new int[3];
        this.d = true;
        this.f = new StringBuilder();
    }

    public static int a(TextView textView) {
        Layout layout = textView.getLayout();
        if (layout == null) {
            return 0;
        }
        return ((textView instanceof VkFadeText) && b(textView)) ? ((VkFadeText) textView).getMeasuredWidth() : (int) (layout.getLineWidth(0) + 0.5f);
    }

    public static boolean b(TextView textView) {
        if (!(textView instanceof VkFadeText)) {
            return jno0.b(textView);
        }
        VkFadeText vkFadeText = (VkFadeText) textView;
        Layout layout = vkFadeText.getLayout();
        if (layout != null) {
            int measuredWidth = (vkFadeText.getMeasuredWidth() - vkFadeText.getCompoundPaddingLeft()) - vkFadeText.getCompoundPaddingRight();
            if (measuredWidth < 0) {
                measuredWidth = 0;
            }
            if (layout.getLineCount() != 0 && ((vkFadeText.getMaxLines() > 0 && layout.getLineCount() > vkFadeText.getMaxLines()) || layout.getLineMax(0) > measuredWidth + 0.5f)) {
                return true;
            }
        }
        return false;
    }

    private final TextView getAuthorTextView() {
        TextView textView = this.b[0];
        if (textView != null) {
            return textView;
        }
        throw new IllegalStateException("No view at position #0");
    }

    private final TextView getCoauthorTextView() {
        TextView textView = this.b[1];
        if (textView != null) {
            return textView;
        }
        throw new IllegalStateException("No view at position #1");
    }

    private final TextView getCountTextView() {
        TextView textView = this.b[2];
        if (textView != null) {
            return textView;
        }
        throw new IllegalStateException("No view at position #2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount == 3) {
            throw new IllegalArgumentException("CoauthorsTextLayout must contain at most 3 children");
        }
        if (!(view instanceof TextView)) {
            throw new IllegalArgumentException("CoauthorsTextLayout must contain only TextView's: " + view.getClass().getSimpleName() + " was given");
        }
        if (view instanceof VkFadeText) {
            ((VkFadeText) view).setMaxTextLines(1);
        }
        super.addView(view, i, layoutParams);
        if (i < 0) {
            i = childCount;
        }
        getContext();
        this.b[i] = view;
    }

    public final int c(TextView textView, int i, int i2) {
        if (textView.getVisibility() == 8) {
            return 0;
        }
        measureChildWithMargins(textView, i, 0, i2, 0);
        int a2 = a(textView);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return a2 + (marginLayoutParams != null ? marginLayoutParams.leftMargin + marginLayoutParams.rightMargin : 0);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams != null ? new a(layoutParams) : generateDefaultLayoutParams();
    }

    public final gzs<s3q0> getOnTextViewsVisibilityCalculatedListener() {
        return this.e;
    }

    public final String getVisibleText() {
        StringBuilder sb = this.f;
        sb.setLength(0);
        int[] iArr = this.c;
        if (iArr[0] == 0) {
            sb.append(getAuthorTextView().getText());
        }
        if (iArr[1] == 0) {
            CharSequence text = getCoauthorTextView().getText();
            if (text == null) {
                text = "";
            }
            if (text.length() > 0) {
                sb.append(text);
            }
        }
        if (iArr[2] == 0) {
            CharSequence text2 = getCountTextView().getText();
            CharSequence charSequence = text2 != null ? text2 : "";
            if (charSequence.length() > 0) {
                sb.append(charSequence);
            }
        }
        return sb.toString();
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int measuredHeight;
        int i5;
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int absoluteGravity = Gravity.getAbsoluteGravity(8388611, getLayoutDirection()) & 7;
        TextView[] textViewArr = this.b;
        int length = textViewArr.length;
        int i9 = measuredWidth;
        for (int i10 = 0; i10 < length; i10++) {
            TextView textView = textViewArr[i10];
            if (textView != null) {
                if (this.c[i10] == 8 || textView.getLayout() == null) {
                    textView.layout(0, 0, 0, 0);
                } else {
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
                    ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                    int marginEnd = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0;
                    int a2 = a(textView);
                    if (absoluteGravity == 5) {
                        i7 = i9 - marginEnd;
                        i5 = i7 - a2;
                        ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
                        marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                        i8 = (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) + paddingTop;
                        measuredHeight = textView.getMeasuredHeight() + i8;
                        i6 = i5 - marginStart;
                    } else {
                        int min = Math.min(measuredWidth - a2, paddingLeft + marginStart);
                        ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
                        marginLayoutParams = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                        int i11 = (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) + paddingTop;
                        int i12 = a2 + min;
                        measuredHeight = textView.getMeasuredHeight() + i11;
                        int i13 = marginEnd + i12;
                        i5 = min;
                        paddingLeft = i13;
                        i6 = i9;
                        i7 = i12;
                        i8 = i11;
                    }
                    textView.layout(i5, i8, i7, measuredHeight);
                    i9 = i6;
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.d) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            if (getMeasuredWidth() == size && mode == 1073741824) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
        }
        this.d = false;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int a2 = gp10.a(i, suggestedMinimumWidth, Integer.MAX_VALUE, paddingRight);
        int a3 = tr.a(gp10.a(i2, suggestedMinimumHeight, Integer.MAX_VALUE, paddingBottom), 1073741823, 0, Integer.MIN_VALUE);
        int[] iArr = this.c;
        jw5.o(0, 0, 6, iArr);
        int c = c(getCountTextView(), tr.a(a2, 1073741823, 0, Integer.MIN_VALUE), a3);
        TextView authorTextView = getAuthorTextView();
        int c2 = c(authorTextView, View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(a2 - c, 1073741823)), Integer.MIN_VALUE), a3);
        int i3 = c + c2;
        if (c2 == 0 || b(authorTextView)) {
            iArr[1] = 8;
        } else {
            TextView coauthorTextView = getCoauthorTextView();
            int c3 = c(coauthorTextView, View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(a2 - c2, 1073741823)), Integer.MIN_VALUE), a3);
            if (c3 == 0 || b(coauthorTextView)) {
                iArr[1] = 8;
            } else {
                i3 = c2 + c3;
                iArr[2] = 8;
            }
        }
        gzs<s3q0> gzsVar = this.e;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        TextView[] textViewArr = this.b;
        int length = textViewArr.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            TextView textView = textViewArr[i5];
            if (textView != null && iArr[i5] != 8) {
                i4 = Math.max(i4, textView.getMeasuredHeight());
            }
        }
        setMeasuredDimension(Math.min(a2, i3 + paddingRight), i4 + paddingBottom);
    }

    public final void setAuthorName(CharSequence charSequence) {
        getAuthorTextView().setText(charSequence);
        getAuthorTextView().setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        this.d = true;
    }

    public final void setCoauthorName(CharSequence charSequence) {
        getCoauthorTextView().setText(charSequence);
        getCoauthorTextView().setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        this.d = true;
    }

    public final void setCoauthorsCount(CharSequence charSequence) {
        getCountTextView().setText(charSequence);
        getCountTextView().setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        this.d = true;
    }

    public final void setOnAuthorNameClickListener(View.OnClickListener onClickListener) {
        getAuthorTextView().setOnClickListener(onClickListener);
    }

    public final void setOnCoauthorNameClickListener(View.OnClickListener onClickListener) {
        getCoauthorTextView().setOnClickListener(onClickListener);
    }

    public final void setOnCoauthorsCounterClickListener(View.OnClickListener onClickListener) {
        getCountTextView().setOnClickListener(onClickListener);
    }

    public final void setOnTextViewsVisibilityCalculatedListener(gzs<s3q0> gzsVar) {
        this.e = gzsVar;
    }

    public final void setTextColor(ColorStateList colorStateList) {
        for (TextView textView : this.b) {
            if (textView != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }
}
