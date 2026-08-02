package com.vk.voip.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.voip.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.baf0;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e3m;
import xsna.f4m;
import xsna.iah0;
import xsna.m33;

/* compiled from: VoipActionMultiLineViewLight.kt */
/* loaded from: classes7.dex */
public class VoipActionMultiLineViewLight extends LinearLayout {
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public boolean e;

    public VoipActionMultiLineViewLight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(0);
        f4m.l(cn70.b(16), cn70.b(16), this);
        ImageView imageView = new ImageView(context);
        addView(imageView);
        bwt0.m0(cn70.b(28), cn70.b(28), imageView);
        f4m.m(16, imageView);
        f4m.r(cn70.b(16), imageView);
        imageView.setColorFilter(dhr0.Y(R.attr.vk_ui_text_primary, context), PorterDuff.Mode.SRC_IN);
        this.b = imageView;
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout);
        linearLayout.setOrientation(1);
        bwt0.m0(cn70.b(0), -2, linearLayout);
        f4m.m(16, linearLayout);
        bwt0.q0(linearLayout, 1.0f);
        TextView textView = new TextView(context);
        this.c = textView;
        linearLayout.addView(textView);
        bwt0.m0(-2, -2, textView);
        f4m.m(16, textView);
        textView.setTextAppearance(R.style.VkLegacyTypography_Headline_Regular);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        linearLayout.addView(textView2);
        bwt0.m0(-2, cn70.b(0), textView2);
        f4m.t(cn70.b(2), textView2);
        bwt0.q0(textView2, 1.0f);
        textView2.setLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setTextAppearance(R.style.VkLegacyTypography_Caption_Regular);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.g, 0, 0);
        setupAttrsStyle(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        imageView.setImportantForAccessibility(2);
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
    }

    private final void setupAttrsStyle(TypedArray typedArray) {
        Drawable drawable = typedArray.getDrawable(0);
        ImageView imageView = this.b;
        if (drawable != null) {
            int color = isInEditMode() ? -3355444 : typedArray.getColor(1, dhr0.Y(R.attr.vk_ui_text_primary, getContext()));
            imageView.setVisibility(0);
            imageView.setImageDrawable(new baf0(drawable, color));
        } else {
            imageView.setVisibility(8);
        }
        setTitle(typedArray.getString(7));
        setTitleLines(typedArray.getInt(8, 1));
        setSubtitleLines(typedArray.getInt(4, 1));
        setTitleMaxLines(typedArray.getInt(9, 1));
        setSubtitle(typedArray.getString(3));
        setSubtitleStartIcon(typedArray.getDrawable(6));
        setSubtitleMaxLines(typedArray.getInt(5, 1));
        this.e = typedArray.getBoolean(2, false);
    }

    public final Drawable getIcon() {
        return this.b.getDrawable();
    }

    public final CharSequence getSubtitle() {
        return this.d.getText();
    }

    public final CharSequence getTitle() {
        return this.c.getText();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        float f = z ? 1.0f : 0.4f;
        this.b.setAlpha(f);
        this.c.setAlpha(f);
        this.d.setAlpha(f);
    }

    public final void setIcon(int i) {
        Drawable a;
        if (i == 0) {
            a = null;
        } else {
            Context context = getContext();
            e3m.a aVar = e3m.a;
            a = m33.a(i, context);
        }
        ImageView imageView = this.b;
        if (a == null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        } else {
            imageView.setVisibility(0);
            imageView.setImageDrawable(new baf0(a, dhr0.Y(R.attr.vk_ui_text_primary, getContext())));
            imageView.setBackground(null);
        }
    }

    public final void setSubtitle(CharSequence charSequence) {
        TextView textView = this.d;
        textView.setText(charSequence);
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    public final void setSubtitleLines(int i) {
        this.d.setLines(i);
    }

    public final void setSubtitleMaxLines(int i) {
        this.d.setMaxLines(i);
    }

    public final void setSubtitleStartIcon(int i) {
        Drawable a;
        if (i == 0) {
            a = null;
        } else {
            Context context = getContext();
            e3m.a aVar = e3m.a;
            a = m33.a(i, context);
        }
        setSubtitleStartIcon(a);
    }

    public final void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
        if (this.e) {
            return;
        }
        setContentDescription(charSequence);
    }

    public final void setTitleLines(int i) {
        this.c.setLines(i);
    }

    public final void setTitleMaxLines(int i) {
        this.c.setMaxLines(i);
    }

    public final void setTitleTextColor(ColorStateList colorStateList) {
        this.c.setTextColor(colorStateList);
    }

    public final void setSubtitle(int i) {
        setSubtitle(i == 0 ? null : getContext().getString(i));
    }

    public final void setSubtitleStartIcon(Drawable drawable) {
        TextView textView = this.d;
        if (drawable == null) {
            textView.setCompoundDrawablePadding(0);
            textView.setCompoundDrawables(null, null, null, null);
            return;
        }
        textView.setCompoundDrawablePadding(iah0.a(4));
        ColorStateList valueOf = ColorStateList.valueOf(e3m.f(R.attr.vk_ui_text_secondary, getContext()));
        if (valueOf != null) {
            drawable = drawable.mutate();
            drawable.setTintList(valueOf);
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void setTitle(int i) {
        setTitle(i == 0 ? null : getContext().getString(i));
    }
}
