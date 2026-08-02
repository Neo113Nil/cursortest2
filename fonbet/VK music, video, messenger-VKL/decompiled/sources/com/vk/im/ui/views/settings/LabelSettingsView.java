package com.vk.im.ui.views.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.abg0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.iah0;
import xsna.m33;
import xsna.qcy;
import xsna.too0;

/* compiled from: LabelSettingsView.kt */
/* loaded from: classes2.dex */
public class LabelSettingsView extends ConstraintLayout implements too0 {
    public final AppCompatImageView t;
    public final TextView u;
    public final TextView v;
    public final float[] w;
    public Integer x;

    public LabelSettingsView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public void Ng() {
        abg0 abg0Var = dhr0.t;
        this.u.setTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
        this.v.setTextColor(abg0Var.c(R.attr.vk_ui_text_secondary));
        Integer num = this.x;
        if (num != null) {
            Drawable icon = getIcon();
            if (icon != null) {
                icon.setTint(abg0Var.c(num.intValue()));
                return;
            }
            return;
        }
        Drawable icon2 = getIcon();
        if (icon2 != null) {
            icon2.setTint(abg0Var.c(R.attr.vk_ui_icon_accent));
        }
    }

    public Drawable getIcon() {
        return this.t.getDrawable();
    }

    public int getIconSize() {
        return this.t.getLayoutParams().width;
    }

    public final AppCompatImageView getIconView() {
        return this.t;
    }

    public CharSequence getSubtitle() {
        return this.v.getText();
    }

    public final TextView getSubtitleView() {
        return this.v;
    }

    public CharSequence getTitle() {
        return this.u.getText();
    }

    public final TextView getTitleView() {
        return this.u;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float[] fArr = this.w;
        fArr[0] = rawX;
        fArr[1] = motionEvent.getRawY();
        return super.onTouchEvent(motionEvent);
    }

    public void setIcon(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.t;
        appCompatImageView.setImageDrawable(drawable);
        bwt0.p0(appCompatImageView, drawable != null);
    }

    public void setIconSize(int i) {
        bwt0.m0(i, i, this.t);
    }

    public final void setIconTint(int i) {
        this.x = Integer.valueOf(i);
        bwt0.o0(this.t, dhr0.t.c(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        TextView textView = this.v;
        textView.setText(charSequence);
        textView.setVisibility(charSequence.length() == 0 ? 8 : 0);
    }

    public void setTitle(CharSequence charSequence) {
        this.u.setText(charSequence);
    }

    public LabelSettingsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public LabelSettingsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ LabelSettingsView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public LabelSettingsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        dhr0 dhr0Var = dhr0.a;
        this.w = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(View.generateViewId());
        float f = 28;
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(iah0.a(f), iah0.a(f)));
        appCompatImageView.setContentDescription(null);
        appCompatImageView.setImportantForAccessibility(2);
        this.t = appCompatImageView;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        textView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setIncludeFontPadding(false);
        this.u = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(View.generateViewId());
        textView2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textView2.setGravity(16);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        textView2.setIncludeFontPadding(false);
        this.v = textView2;
        addView(appCompatImageView);
        addView(textView);
        addView(textView2);
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.J = 2;
            bVar.E = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            bVar.i = 0;
            bVar.l = 0;
            bVar.e = 0;
            bVar.g = textView.getId();
            appCompatImageView.setLayoutParams(bVar);
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 != null) {
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
                float f2 = 16;
                ((ViewGroup.MarginLayoutParams) bVar2).leftMargin = iah0.a(f2);
                bVar2.w = 0;
                bVar2.i = 0;
                bVar2.l = 0;
                bVar2.E = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                bVar2.f = appCompatImageView.getId();
                bVar2.g = textView2.getId();
                bVar2.setMarginEnd(iah0.a(f2));
                bVar2.W = true;
                textView.setLayoutParams(bVar2);
                ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
                if (layoutParams3 != null) {
                    ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
                    bVar3.J = 2;
                    bVar3.i = 0;
                    bVar3.l = 0;
                    bVar3.h = 0;
                    bVar3.y = 0;
                    bVar3.E = 1.0f;
                    bVar3.W = true;
                    textView2.setLayoutParams(bVar3);
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.n, i, i2);
                    String string = obtainStyledAttributes.getString(6);
                    setTitle(string == null ? "" : string);
                    int resourceId = obtainStyledAttributes.getResourceId(7, 0);
                    qcy<Object>[] qcyVarArr = bwt0.a;
                    textView.setTextAppearance(resourceId);
                    CharSequence string2 = obtainStyledAttributes.getString(3);
                    setSubtitle(string2 != null ? string2 : "");
                    textView2.setTextAppearance(obtainStyledAttributes.getResourceId(4, 0));
                    int resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
                    setIcon(resourceId2 > 0 ? m33.a(resourceId2, context) : null);
                    setIconSize(obtainStyledAttributes.getDimensionPixelSize(1, iah0.a(f)));
                    if (obtainStyledAttributes.hasValue(2)) {
                        bwt0.o0(appCompatImageView, obtainStyledAttributes.getColor(2, -16777216));
                    }
                    bwt0.p0(appCompatImageView, getIcon() != null);
                    if (obtainStyledAttributes.hasValue(5)) {
                        textView.setMaxLines(obtainStyledAttributes.getInteger(5, 1));
                    }
                    obtainStyledAttributes.recycle();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}
