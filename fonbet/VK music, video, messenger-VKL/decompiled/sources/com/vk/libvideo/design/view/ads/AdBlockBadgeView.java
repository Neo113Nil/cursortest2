package com.vk.libvideo.design.view.ads;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.cut0;
import xsna.ey2;
import xsna.f4m;
import xsna.too0;
import xsna.vev0;
import xsna.x7g;

/* compiled from: AdBlockBadgeView.kt */
/* loaded from: classes2.dex */
public final class AdBlockBadgeView extends FrameLayout implements too0 {
    public final VkText b;
    public final GradientDrawable c;

    public AdBlockBadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = new GradientDrawable();
        LayoutInflater.from(context).inflate(R.layout.catalog2_mytarget_ad_badge, (ViewGroup) this, true);
        VkText vkText = (VkText) findViewById(R.id.title);
        this.b = vkText;
        vkText.setIncludeFontPadding(false);
        setClipToOutline(true);
        a();
    }

    @Override // xsna.too0
    public final void Ng() {
        a();
    }

    public final void a() {
        int a = cut0.a.a(new x7g(R.attr.vk_ui_overlay_secondary), getContext());
        GradientDrawable gradientDrawable = this.c;
        gradientDrawable.setColor(a);
        gradientDrawable.setCornerRadius(vev0.c);
        setBackground(gradientDrawable);
    }

    public final void setText(CharSequence charSequence) {
        ey2.i(this.b, charSequence);
    }

    public final void setText(int i) {
        VkText vkText = this.b;
        vkText.setText(i);
        CharSequence text = vkText.getText();
        f4m.D(vkText, !(text == null || text.length() == 0));
    }
}
