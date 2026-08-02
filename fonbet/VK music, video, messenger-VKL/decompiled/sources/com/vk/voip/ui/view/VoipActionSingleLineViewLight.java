package com.vk.voip.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
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
import xsna.m33;
import xsna.omw;

/* compiled from: VoipActionSingleLineViewLight.kt */
/* loaded from: classes7.dex */
public final class VoipActionSingleLineViewLight extends LinearLayout {
    public final ImageView b;
    public final TextView c;

    public VoipActionSingleLineViewLight(Context context, AttributeSet attributeSet) {
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
        TextView textView = new TextView(new ContextThemeWrapper(context, R.style.VkLegacyTypography_Headline_Regular));
        this.c = textView;
        addView(textView);
        bwt0.m0(cn70.b(0), -2, textView);
        f4m.m(16, textView);
        bwt0.q0(textView, 1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.j, 0, 0);
        setupAttrsStyle(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        imageView.setImportantForAccessibility(2);
        textView.setImportantForAccessibility(2);
    }

    private final void setupAttrsStyle(TypedArray typedArray) {
        Drawable drawable = typedArray.getDrawable(0);
        if (drawable != null) {
            a(new baf0(drawable, isInEditMode() ? -3355444 : typedArray.getColor(1, dhr0.Y(R.attr.vk_ui_text_primary, getContext()))), 0);
        } else {
            a(null, 0);
        }
        setTitle(typedArray.getString(2));
    }

    public final void a(Drawable drawable, int i) {
        ImageView imageView = this.b;
        if (drawable != null) {
            if (i != 0) {
                omw.c(i, drawable, imageView);
            } else {
                imageView.setImageDrawable(new baf0(drawable, dhr0.Y(R.attr.vk_ui_text_primary, getContext())));
            }
        }
        imageView.setVisibility(drawable != null ? 0 : 8);
    }

    public final Drawable getIcon() {
        return this.b.getDrawable();
    }

    public final CharSequence getTitle() {
        return this.c.getText();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        TextView textView = this.c;
        ImageView imageView = this.b;
        if (z) {
            imageView.setAlpha(1.0f);
            textView.setAlpha(1.0f);
        } else {
            imageView.setAlpha(0.4f);
            textView.setAlpha(0.4f);
        }
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
        a(a, 0);
    }

    public final void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
        setContentDescription(charSequence);
    }

    public final void setTitleTextColor(ColorStateList colorStateList) {
        this.c.setTextColor(colorStateList);
    }

    public final void setTitleTextColor(int i) {
        this.c.setTextColor(getContext().getColor(i));
    }

    public final void setTitle(int i) {
        setTitle(i == 0 ? null : getContext().getString(i));
    }
}
