package com.vk.feed.design.view.newsfeed.banner.before;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.feed.design.view.newsfeed.banner.VkFeedLegoBanner;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.f4m;
import xsna.too0;

/* compiled from: VkFeedLegoBannerBeforeView.kt */
/* loaded from: classes18.dex */
public final class VkFeedLegoBannerBeforeView extends FrameLayout implements too0 {
    public final VkImage b;
    public final VkPicture c;

    public VkFeedLegoBannerBeforeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.feed_lego_banner_before, (ViewGroup) this, true);
        this.b = (VkImage) findViewById(R.id.feed_lego_banner_image);
        this.c = (VkPicture) findViewById(R.id.feed_lego_banner_picture);
    }

    private final void setImage(VkFeedLegoBanner.b.a aVar) {
        aVar.getClass();
        VkImage vkImage = this.b;
        vkImage.setScaleType(null);
        vkImage.setFixedSize(0);
        vkImage.p0(null);
        vkImage.setVisibility(0);
    }

    private final void setPicture(VkFeedLegoBanner.b.C1041b c1041b) {
        c1041b.getClass();
        VkPicture vkPicture = this.c;
        vkPicture.setCornerRadius((VkPicture.CornerRadius) null);
        vkPicture.setFixedSize(0);
        vkPicture.p0(null);
        vkPicture.setVisibility(0);
    }

    @Override // xsna.too0
    public final void Ng() {
        this.b.invalidate();
        this.c.Ng();
    }

    public final void a(VkFeedLegoBanner.b bVar) {
        f4m.j(this.b);
        f4m.j(this.c);
        if (bVar instanceof VkFeedLegoBanner.b.a) {
            setImage((VkFeedLegoBanner.b.a) bVar);
        } else {
            if (!(bVar instanceof VkFeedLegoBanner.b.C1041b)) {
                throw new NoWhenBranchMatchedException();
            }
            setPicture((VkFeedLegoBanner.b.C1041b) bVar);
        }
    }
}
