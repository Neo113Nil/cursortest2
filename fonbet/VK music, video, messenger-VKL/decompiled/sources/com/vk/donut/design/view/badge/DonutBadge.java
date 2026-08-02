package com.vk.donut.design.view.badge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vkontakte.android.R;
import xsna.too0;
import xsna.x7g;

/* compiled from: DonutBadge.kt */
/* loaded from: classes18.dex */
public final class DonutBadge extends FrameLayout implements too0 {
    public final VkContentBadge b;

    public DonutBadge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.too0
    public final void Ng() {
        this.b.Ng();
    }

    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public DonutBadge(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.donut_badge_item, (ViewGroup) this, true);
        VkContentBadge vkContentBadge = (VkContentBadge) findViewById(R.id.donut_content_badge);
        this.b = vkContentBadge;
        getContext();
        vkContentBadge.setAppearance(new VkContentBadge.Appearance.a(new x7g(R.attr.vk_ui_text_primary_invariably), new x7g(R.attr.vk_ui_background_contrast), null, 12));
        vkContentBadge.setMode(VkContentBadge.Mode.Primary);
        vkContentBadge.g(false, Integer.valueOf(R.drawable.vk_icon_donut_color_12));
        vkContentBadge.setSize(VkContentBadge.Size.Medium);
    }
}
