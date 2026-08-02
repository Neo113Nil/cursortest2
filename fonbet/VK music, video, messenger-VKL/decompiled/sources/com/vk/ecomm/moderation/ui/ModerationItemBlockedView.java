package com.vk.ecomm.moderation.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.abg0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.dpg0;
import xsna.iah0;

/* compiled from: ModerationItemBlockedView.kt */
/* loaded from: classes18.dex */
public final class ModerationItemBlockedView extends LinearLayout {
    public final TextView b;
    public final dpg0 c;

    public ModerationItemBlockedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.moderation_blocked_item, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        float dimension = obtainStyledAttributes.getDimension(0, 8.0f);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        obtainStyledAttributes.recycle();
        ImageView imageView = (ImageView) findViewById(R.id.icon);
        if (dimensionPixelSize != -1) {
            bwt0.m0(dimensionPixelSize, dimensionPixelSize, imageView);
        }
        this.b = (TextView) findViewById(R.id.textView);
        abg0 abg0Var = dhr0.t;
        dpg0 dpg0Var = new dpg0(new ColorDrawable(abg0Var.c(R.attr.vk_ui_background_secondary)), dimension);
        this.c = dpg0Var;
        imageView.setImageDrawable(new LayerDrawable(new Drawable[]{dpg0Var, new InsetDrawable((Drawable) abg0Var.b(R.drawable.vk_icon_hide_outline_28, R.attr.vk_ui_icon_medium), iah0.a(8))}));
    }

    public final void setIconBackgroundColor(int i) {
        this.c.setTint(i);
    }

    public final void setTextColor(int i) {
        this.b.setTextColor(i);
    }
}
