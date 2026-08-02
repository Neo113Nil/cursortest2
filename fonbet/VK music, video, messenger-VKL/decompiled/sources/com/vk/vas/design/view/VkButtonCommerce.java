package com.vk.vas.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.vas.design.R$styleable;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.ey2;
import xsna.f4m;
import xsna.hav0;
import xsna.ip8;
import xsna.jp8;
import xsna.kp8;
import xsna.krv0;

/* compiled from: VkButtonCommerce.kt */
/* loaded from: classes6.dex */
public final class VkButtonCommerce extends FrameLayout {
    public VkButton.Appearance b;
    public VkButton.Mode c;
    public VkButton.Size d;
    public final VkButton e;
    public final TextView f;
    public final TextView g;
    public final ImageView h;
    public final TextView i;

    /* JADX WARN: Multi-variable type inference failed */
    public VkButtonCommerce(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = VkButton.Appearance.Neutral;
        this.c = VkButton.Mode.Primary;
        this.d = VkButton.Size.Large;
        LayoutInflater.from(context).inflate(R.layout.commerce_button_content, (ViewGroup) this, true);
        VkButton vkButton = (VkButton) findViewById(R.id.vk_button);
        this.e = vkButton;
        this.f = (TextView) findViewById(R.id.gifts_btn_title);
        this.g = (TextView) findViewById(R.id.gifts_btn_subtitle);
        this.h = (ImageView) findViewById(R.id.icon_start);
        this.i = (TextView) findViewById(R.id.discount_text);
        setClipToOutline(true);
        setOutlineProvider(hav0.c);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        String string = obtainStyledAttributes.getString(5);
        string = string == null ? obtainStyledAttributes.getString(0) : string;
        String string2 = obtainStyledAttributes.getString(4);
        setAppearance((VkButton.Appearance) VkButton.Appearance.h().get(obtainStyledAttributes.getInteger(1, 0)));
        setMode((VkButton.Mode) VkButton.Mode.h().get(obtainStyledAttributes.getInteger(2, 0)));
        setSize((VkButton.Size) VkButton.Size.h().get(obtainStyledAttributes.getInteger(3, 1)));
        setText(string);
        setSubText(string2);
        vkButton.setAppearance(this.b);
        obtainStyledAttributes.recycle();
    }

    public final VkButton.Appearance getAppearance() {
        return this.b;
    }

    public final VkButton.Mode getMode() {
        return this.c;
    }

    public final VkButton.Size getSize() {
        return this.d;
    }

    public final void setAppearance(VkButton.Appearance appearance) {
        ip8 ip8Var;
        this.b = appearance;
        VkButton.Mode mode = this.c;
        int i = jp8.$EnumSwitchMapping$2[mode.ordinal()];
        if (i == 1) {
            int i2 = jp8.$EnumSwitchMapping$1[appearance.ordinal()];
            if (i2 == 1) {
                ip8Var = new ip8(R.attr.vk_ui_background_accent_themed, R.attr.vk_ui_text_contrast_themed, R.attr.vk_ui_icon_contrast_themed, R.attr.vk_ui_text_accent_themed, R.attr.vk_ui_background_content);
            } else if (i2 == 2) {
                ip8Var = new ip8(R.attr.vk_ui_background_positive, R.attr.vk_ui_text_contrast, R.attr.vk_ui_icon_contrast, R.attr.vk_ui_accent_green, R.attr.vk_ui_background_contrast);
            } else if (i2 == 3) {
                ip8Var = new ip8(R.attr.vk_ui_background_negative, R.attr.vk_ui_icon_contrast, R.attr.vk_ui_icon_contrast, R.attr.vk_ui_accent_red, R.attr.vk_ui_background_contrast);
            } else if (i2 == 4) {
                ip8Var = new ip8(R.attr.vk_ui_background_content_inverse, R.attr.vk_ui_text_contrast_themed, R.attr.vk_ui_icon_contrast_themed, R.attr.vk_ui_text_primary, R.attr.vk_ui_background_content);
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                ip8Var = new ip8(R.attr.vk_ui_background_contrast, R.attr.vk_ui_text_primary_invariably, R.attr.vk_ui_icon_primary_invariably, R.attr.vk_ui_text_contrast, R.attr.vk_ui_background_contrast_inverse);
            }
        } else {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = mode == VkButton.Mode.Secondary ? appearance == VkButton.Appearance.Overlay ? R.attr.vk_ui_background_contrast_secondary_alpha : R.attr.vk_ui_background_secondary_alpha : R.attr.vk_ui_transparent;
            int i4 = jp8.$EnumSwitchMapping$1[appearance.ordinal()];
            if (i4 == 1) {
                ip8Var = new ip8(i3, R.attr.vk_ui_text_accent_themed, R.attr.vk_ui_icon_accent_themed, R.attr.vk_ui_text_contrast_themed, R.attr.vk_ui_background_accent_themed);
            } else if (i4 == 2) {
                ip8Var = new ip8(i3, R.attr.vk_ui_text_positive, R.attr.vk_ui_icon_positive, R.attr.vk_ui_text_contrast, R.attr.vk_ui_accent_green);
            } else if (i4 == 3) {
                ip8Var = new ip8(i3, R.attr.vk_ui_text_negative, R.attr.vk_ui_icon_negative, R.attr.vk_ui_text_contrast, R.attr.vk_ui_accent_red);
            } else if (i4 == 4) {
                ip8Var = new ip8(i3, R.attr.vk_ui_text_primary, R.attr.vk_ui_icon_primary, R.attr.vk_ui_text_contrast, R.attr.vk_ui_icon_secondary);
            } else {
                if (i4 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                ip8Var = new ip8(i3, R.attr.vk_ui_text_contrast, R.attr.vk_ui_icon_contrast, R.attr.vk_ui_text_primary_invariably, R.attr.vk_ui_background_contrast);
            }
        }
        TextView textView = this.f;
        boolean a = kp8.a(textView.getContext());
        int i5 = ip8Var.b;
        if (a) {
            textView.setTextColor(krv0.m(i5, textView.getContext()));
        } else {
            krv0.q(textView, i5);
        }
        TextView textView2 = this.g;
        if (kp8.a(textView2.getContext())) {
            textView2.setTextColor(krv0.m(i5, textView2.getContext()));
        } else {
            krv0.q(textView2, i5);
        }
        ImageView imageView = this.h;
        imageView.setImageTintList(null);
        boolean a2 = kp8.a(imageView.getContext());
        int i6 = ip8Var.c;
        if (a2) {
            imageView.setColorFilter(krv0.m(i6, imageView.getContext()));
        } else {
            krv0.o(imageView, i6);
        }
        invalidate();
        this.e.setAppearance(appearance);
    }

    public final void setDiscountText(CharSequence charSequence) {
        ey2.i(this.i, charSequence);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.64f);
    }

    public final void setIcon(Integer num) {
        ImageView imageView = this.h;
        if (num == null || num.intValue() == 0) {
            imageView.setImageDrawable(null);
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(num.intValue());
            imageView.setVisibility(0);
        }
    }

    public final void setMode(VkButton.Mode mode) {
        this.c = mode;
        this.e.setMode(mode);
        invalidate();
    }

    public final void setSize(VkButton.Size size) {
        this.d = size;
        this.e.setSize(size);
        invalidate();
    }

    public final void setSubText(CharSequence charSequence) {
        ey2.i(this.g, charSequence);
    }

    public final void setText(CharSequence charSequence) {
        ey2.i(this.f, charSequence);
    }

    public final void setText(int i) {
        TextView textView = this.f;
        textView.setText(i);
        CharSequence text = textView.getText();
        f4m.D(textView, !(text == null || text.length() == 0));
    }

    public final void setIcon(Drawable drawable) {
        ImageView imageView = this.h;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(0);
    }
}
