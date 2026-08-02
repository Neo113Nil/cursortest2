package com.vk.tab.presentation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.abg0;
import xsna.an10;
import xsna.bwt0;
import xsna.cp6;
import xsna.dhr0;
import xsna.ksn0;
import xsna.of0;

/* compiled from: TabView.kt */
/* loaded from: classes6.dex */
public class TabView extends cp6 {
    public boolean b;
    public final CardView c;
    public final TextView d;
    public final ImageView e;
    public final ImageView f;
    public final ValueAnimator g;
    public final ValueAnimator h;

    public TabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        LayoutInflater.from(getContext()).inflate(R.layout.view_tab, (ViewGroup) this, true);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        setClipToPadding(false);
        this.b = true;
        this.c = (CardView) findViewById(R.id.cv_tab);
        this.d = (TextView) findViewById(R.id.tv_tab);
        this.e = (ImageView) findViewById(R.id.iv_tab_icon);
        this.f = (ImageView) findViewById(R.id.iv_right_icon);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f);
        ofFloat.setDuration(195L);
        ofFloat.setInterpolator(new LinearInterpolator());
        int i2 = 3;
        ofFloat.addUpdateListener(new of0(this, i2));
        this.g = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat2.setDuration(195L);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new of0(this, i2));
        this.h = ofFloat2;
    }

    public final void b(CardView cardView, boolean z) {
        ValueAnimator valueAnimator = this.g;
        ValueAnimator valueAnimator2 = this.h;
        if (z) {
            valueAnimator2.cancel();
            if (this.b) {
                cardView.setCardElevation(12.0f);
            } else if (!valueAnimator.isRunning() && cardView.getCardElevation() != 12.0f) {
                valueAnimator.start();
            }
        } else {
            valueAnimator.cancel();
            if (this.b) {
                cardView.setCardElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else if (!valueAnimator2.isRunning() && cardView.getCardElevation() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                valueAnimator2.start();
            }
        }
        this.b = false;
    }

    public final CardView getCardView() {
        return this.c;
    }

    public CardView getContainer() {
        return this.c;
    }

    public final ImageView getIconView() {
        return this.e;
    }

    public final ImageView getRightIconView() {
        return this.f;
    }

    public final boolean getSkipAnimation() {
        return this.b;
    }

    public final TextView getTextView() {
        return this.d;
    }

    public int getUnselectedBackground() {
        return R.drawable.bg_tab_default;
    }

    public final void setCardTint(Integer num) {
        ColorStateList colorStateList;
        if (num != null) {
            colorStateList = ColorStateList.valueOf(dhr0.t.c(num.intValue()));
        } else {
            colorStateList = null;
        }
        this.c.setBackgroundTintList(colorStateList);
    }

    public final void setIcon(Integer num) {
        int intValue = num != null ? num.intValue() : 0;
        ImageView imageView = this.e;
        imageView.setImageResource(intValue);
        bwt0.p0(imageView, num != null);
    }

    public final void setSkipAnimation(boolean z) {
        this.b = z;
    }

    public final void setTab(ksn0 ksn0Var) {
        String str;
        setIcon(ksn0Var.h());
        Integer g = ksn0Var.g();
        int intValue = g != null ? g.intValue() : 0;
        ImageView imageView = this.f;
        imageView.setImageResource(intValue);
        bwt0.p0(imageView, ksn0Var.g() != null);
        Integer d = ksn0Var.d();
        TextView textView = this.d;
        if (d == null || (str = textView.getContext().getString(d.intValue())) == null) {
            str = "";
        }
        textView.setText(str);
        bwt0.p0(textView, ksn0Var.d() != null);
        textView.setIncludeFontPadding(false);
        a(ksn0Var);
        setTabSelected(false);
    }

    @Override // xsna.cp6
    public void setTabSelected(boolean z) {
        CardView cardView = this.c;
        b(cardView, z);
        cardView.setBackgroundTintList(null);
        cardView.setBackground(cardView.getContext().getDrawable(z ? R.drawable.bg_tab_selected : getUnselectedBackground()));
        int i = z ? R.attr.vk_ui_text_accent_themed : R.attr.vk_ui_text_secondary;
        abg0 abg0Var = dhr0.t;
        this.d.setTextColor(abg0Var.c(i));
        this.e.setColorFilter(abg0Var.c(z ? R.attr.vk_ui_icon_accent_themed : R.attr.vk_ui_icon_medium));
    }

    @Override // xsna.cp6
    public void setText(CharSequence charSequence) {
        TextView textView = this.d;
        textView.setText(charSequence);
        textView.setIncludeFontPadding(true);
        ImageView imageView = this.e;
        bwt0.p0(imageView, imageView.getDrawable() != null);
        if (getResources().getConfiguration().fontScale > 1.0f) {
            Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
            float f = (fontMetrics.bottom - fontMetrics.top) + fontMetrics.leading;
            float floor = (float) Math.floor(Resources.getSystem().getDisplayMetrics().density * 12);
            CardView cardView = this.c;
            ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = an10.b(f + floor);
            cardView.setLayoutParams(layoutParams);
        }
        setTabSelected(false);
    }

    public final void setTextColor(int i) {
        this.d.setTextColor(dhr0.t.c(i));
    }

    public TabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(ksn0 ksn0Var) {
    }
}
