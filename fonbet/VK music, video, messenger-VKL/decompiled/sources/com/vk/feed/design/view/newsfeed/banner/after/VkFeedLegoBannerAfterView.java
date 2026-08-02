package com.vk.feed.design.view.newsfeed.banner.after;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.feed.design.view.newsfeed.banner.VkFeedLegoBanner;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.gko;
import xsna.gpo0;

/* compiled from: VkFeedLegoBannerAfterView.kt */
/* loaded from: classes18.dex */
public final class VkFeedLegoBannerAfterView extends FrameLayout {
    public final VkImageSimple b;

    public VkFeedLegoBannerAfterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.feed_lego_banner_after, (ViewGroup) this, true);
        this.b = (VkImageSimple) findViewById(R.id.feed_lego_banner_dismiss);
    }

    private final void setDismiss(VkFeedLegoBanner.a.C1040a c1040a) {
        c1040a.getClass();
        VkImageSimple vkImageSimple = this.b;
        vkImageSimple.setImageDrawable(gko.b(R.drawable.vk_icon_lego_cross_circle_overlay_24, vkImageSimple.getContext()));
        gpo0.g(vkImageSimple, null);
        vkImageSimple.setContentDescription(null);
        vkImageSimple.setEnabled(false);
        vkImageSimple.setOnClickListener(null);
        vkImageSimple.setVisibility(0);
    }

    public final void a(VkFeedLegoBanner.a aVar) {
        if (!(aVar instanceof VkFeedLegoBanner.a.C1040a)) {
            throw new NoWhenBranchMatchedException();
        }
        setDismiss((VkFeedLegoBanner.a.C1040a) aVar);
    }
}
