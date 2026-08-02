package com.vk.feed.design.view.newsfeed.reply;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vkontakte.android.R;
import xsna.cn70;
import xsna.dhr0;
import xsna.jno0;
import xsna.m33;
import xsna.s3q0;
import xsna.too0;

/* compiled from: ReplyBarPlaceholderView.kt */
/* loaded from: classes18.dex */
public final class ReplyBarPlaceholderView extends FrameLayout implements too0 {
    public final VkLinkedText b;
    public final VkImageSimple c;
    public final ColorDrawable d;

    public ReplyBarPlaceholderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        VkLinkedText vkLinkedText = new VkLinkedText(new ContextThemeWrapper(context, R.style.VkUiTypography_Subhead), null, 0);
        this.b = vkLinkedText;
        VkImageSimple vkImageSimple = new VkImageSimple(context, null, 6, 0);
        this.c = vkImageSimple;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.d = colorDrawable;
        setClickable(true);
        setBackground(colorDrawable);
        colorDrawable.setColor(dhr0.t.c(R.attr.vk_ui_background_secondary));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(cn70.b(52), cn70.b(48));
        layoutParams.gravity = 8388693;
        s3q0 s3q0Var = s3q0.a;
        addView(vkImageSimple, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 8388627;
        layoutParams2.setMarginStart(cn70.b(16));
        layoutParams2.topMargin = cn70.b(12);
        layoutParams2.setMarginEnd(cn70.b(56));
        layoutParams2.bottomMargin = cn70.b(12);
        addView(vkLinkedText, layoutParams2);
        jno0.c(vkLinkedText, R.attr.vk_ui_text_subhead);
    }

    @Override // xsna.too0
    public final void Ng() {
        this.d.setColor(dhr0.t.c(R.attr.vk_ui_background_secondary));
    }

    public final void setImage(int i) {
        this.c.setImageDrawable(m33.a(i, getContext()));
    }

    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
