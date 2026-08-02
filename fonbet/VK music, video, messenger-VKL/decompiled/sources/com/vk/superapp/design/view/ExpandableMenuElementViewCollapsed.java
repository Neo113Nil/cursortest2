package com.vk.superapp.design.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.core.view.components.picture.VkImage;
import com.vkontakte.android.R;
import xsna.t0w0;

/* compiled from: ExpandableMenuElementViewCollapsed.kt */
/* loaded from: classes6.dex */
public final class ExpandableMenuElementViewCollapsed extends FrameLayout {
    public final int b;
    public final int c;
    public final VkImage d;
    public final TextView e;
    public final View f;
    public final View g;

    public ExpandableMenuElementViewCollapsed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.vk_expandable_menu_item_width);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.vk_expandable_menu_more_arrow);
        LayoutInflater.from(context).inflate(R.layout.vk_super_app_showcase_expandable_menu_collapsed_item, this);
        this.d = (VkImage) findViewById(R.id.image);
        this.e = (TextView) findViewById(R.id.counter_badge_view);
        this.f = findViewById(R.id.dot_badge_view);
        this.g = findViewById(R.id.new_badge_view);
        setOutlineProvider(new t0w0(6, context.getResources().getDimension(R.dimen.vk_button_corner_big_radius), false, false));
        setClipToOutline(true);
    }
}
