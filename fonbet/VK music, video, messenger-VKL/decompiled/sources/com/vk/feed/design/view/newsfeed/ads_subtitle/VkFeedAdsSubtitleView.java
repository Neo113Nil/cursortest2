package com.vk.feed.design.view.newsfeed.ads_subtitle;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.R$styleable;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.b;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.drm0;
import xsna.jno0;
import xsna.qcy;

/* compiled from: VkFeedAdsSubtitleView.kt */
/* loaded from: classes18.dex */
public final class VkFeedAdsSubtitleView extends ViewGroup {
    public final TextView b;
    public final TextView c;
    public String d;
    public String e;
    public String f;
    public int g;
    public String h;
    public Integer i;
    public Integer j;

    public VkFeedAdsSubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = (int) ((13.0f * getDisplayMetrics().scaledDensity) + 0.5f);
        this.h = "·";
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
            if (obtainStyledAttributes.hasValue(3)) {
                this.g = obtainStyledAttributes.getDimensionPixelSize(3, this.g);
            }
            if (obtainStyledAttributes.hasValue(1)) {
                String string = obtainStyledAttributes.getString(1);
                this.h = string == null ? this.h : string;
            }
            if (obtainStyledAttributes.hasValue(2)) {
                this.i = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(2, 0));
            }
            if (obtainStyledAttributes.hasValue(0)) {
                this.j = Integer.valueOf(obtainStyledAttributes.getInt(0, 0));
            }
            obtainStyledAttributes.recycle();
        }
        TextView a = a(true);
        this.b = a;
        addView(a);
        TextView a2 = a(false);
        this.c = a2;
        addView(a2);
    }

    public final TextView a(boolean z) {
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        b.g(textView, FontFamily.REGULAR, Float.valueOf(this.g), TextSizeUnit.PX);
        textView.setIncludeFontPadding(false);
        Integer num = this.i;
        if (num != null) {
            int intValue = num.intValue();
            textView.setMinHeight(intValue);
            textView.setMinimumHeight(intValue);
        }
        Integer num2 = this.j;
        if (num2 != null) {
            textView.setGravity(num2.intValue());
            textView.setTextAlignment(1);
        }
        textView.setLineSpacing(2.0f, 1.0f);
        jno0.c(textView, R.attr.vk_ui_text_secondary);
        textView.setSingleLine(true);
        if (z) {
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        return textView;
    }

    public final String getAge() {
        return this.f;
    }

    public final DisplayMetrics getDisplayMetrics() {
        return Resources.getSystem().getDisplayMetrics();
    }

    public final String getGenre() {
        return this.e;
    }

    public final String getTextDelimiter() {
        return this.h;
    }

    public final Integer getTextGravity() {
        return this.j;
    }

    public final Integer getTextMinHeight() {
        return this.i;
    }

    public final int getTextSize() {
        return this.g;
    }

    public final String getType() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        TextView textView = this.b;
        int measuredWidth = textView.getMeasuredWidth();
        int measuredHeight = textView.getMeasuredHeight();
        TextView textView2 = this.c;
        int measuredWidth2 = textView2.getMeasuredWidth();
        int i5 = measuredWidth + paddingStart;
        textView.layout(paddingStart, paddingTop, i5, measuredHeight);
        textView2.layout(i5, paddingTop, measuredWidth2 + i5, measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        int size = View.MeasureSpec.getSize(i);
        measureChildren(i, i2);
        TextView textView = this.b;
        int measuredWidth = textView.getMeasuredWidth();
        int measuredHeight = textView.getMeasuredHeight();
        int measuredWidth2 = this.c.getMeasuredWidth();
        int i3 = measuredWidth + measuredWidth2;
        int paddingStart = (size - getPaddingStart()) - getPaddingEnd();
        if (i3 > paddingStart) {
            qcy<Object>[] qcyVarArr = bwt0.a;
            textView.measure(View.MeasureSpec.makeMeasureSpec(paddingStart - measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final void setAge(String str) {
        this.f = str;
        boolean N = drm0.N(str);
        TextView textView = this.c;
        if (N) {
            textView.setText("");
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (this.h.length() > 0) {
            sb.append(" ");
            sb.append(this.h);
            sb.append(" ");
        } else {
            sb.append(" ");
        }
        sb.append(str);
        textView.setText(sb.toString());
    }

    public final void setGenre(String str) {
        this.e = str;
        boolean N = drm0.N(str);
        TextView textView = this.b;
        if (N) {
            textView.setText(this.d);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        if (this.h.length() > 0) {
            sb.append(" ");
            sb.append(this.h);
            sb.append(" ");
        } else {
            sb.append(" ");
        }
        sb.append(this.e);
        textView.setText(sb.toString());
    }

    public final void setTextDelimiter(String str) {
        this.h = str;
    }

    public final void setTextGravity(Integer num) {
        this.j = num;
    }

    public final void setTextMinHeight(Integer num) {
        this.i = num;
    }

    public final void setTextSize(int i) {
        this.g = i;
    }

    public final void setType(String str) {
        this.d = str;
        this.b.setText(str);
    }
}
