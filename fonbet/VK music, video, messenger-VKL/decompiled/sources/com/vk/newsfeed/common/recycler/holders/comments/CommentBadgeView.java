package com.vk.newsfeed.common.recycler.holders.comments;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.common.R$styleable;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.e3m;
import xsna.f4m;
import xsna.krv0;

/* compiled from: CommentBadgeView.kt */
/* loaded from: classes4.dex */
public final class CommentBadgeView extends LinearLayout {
    public final TextView b;
    public final VKImageView c;
    public final int d;

    public CommentBadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int dimension = (int) context.getResources().getDimension(R.dimen.badge_image_size);
        int dimension2 = (int) context.getResources().getDimension(R.dimen.badge_text_top_margin);
        this.d = e3m.a(R.dimen.badge_container_width, context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.comment_badge_view, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, dimension);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, dimension2);
            boolean z = obtainStyledAttributes.getBoolean(2, true);
            View findViewById = findViewById(R.id.badge_image);
            bwt0.m0(dimensionPixelSize, dimensionPixelSize, (VKImageView) findViewById);
            this.c = (VKImageView) findViewById;
            View findViewById2 = findViewById(R.id.badge_title);
            TextView textView = (TextView) findViewById2;
            f4m.t(dimensionPixelSize2, textView);
            if (z) {
                textView.setTextAppearance(R.style.VkUiTypography_Title2);
                textView.setTextColor(context.getColor(R.color.vk_white));
            } else {
                textView.setIncludeFontPadding(false);
                textView.setTextColor(krv0.m(R.attr.vk_ui_text_subhead, context));
                textView.setTextSize(2, 14.0f);
            }
            this.b = (TextView) findViewById2;
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        super.onMeasure(size > 0 ? View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(size, 0), i2);
        int measuredWidth = getMeasuredWidth();
        int i3 = this.d;
        if (measuredWidth < i3) {
            setMeasuredDimension(i3, getMeasuredHeight());
        }
    }

    public final void setText(String str) {
        this.b.setText(str);
    }

    public final void setTextColor(int i) {
        this.b.setTextColor(i);
    }
}
