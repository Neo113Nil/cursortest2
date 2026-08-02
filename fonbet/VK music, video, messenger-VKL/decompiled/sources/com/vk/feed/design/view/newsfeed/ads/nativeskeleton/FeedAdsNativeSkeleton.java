package com.vk.feed.design.view.newsfeed.ads.nativeskeleton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.components.skeleton.a;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vkontakte.android.R;
import xsna.vjv0;

/* compiled from: FeedAdsNativeSkeleton.kt */
/* loaded from: classes18.dex */
public final class FeedAdsNativeSkeleton extends ConstraintLayout implements vjv0 {
    public final ThemableShimmer t;
    public final VkSkeleton u;
    public final VkSkeleton v;
    public final VkSkeleton w;
    public final VkSkeleton x;
    public boolean y;
    public a z;

    public FeedAdsNativeSkeleton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.t = new ThemableShimmer.a(context).a();
        this.z = a.c.a;
        LayoutInflater.from(context).inflate(R.layout.feed_ads_native_skeleton, this);
        VkSkeleton vkSkeleton = (VkSkeleton) findViewById(R.id.feed_ads_avatar_skeleton);
        this.u = vkSkeleton;
        VkSkeleton vkSkeleton2 = (VkSkeleton) findViewById(R.id.feed_ads_title_skeleton);
        this.v = vkSkeleton2;
        VkSkeleton vkSkeleton3 = (VkSkeleton) findViewById(R.id.feed_ads_subtitle_skeleton);
        this.w = vkSkeleton3;
        VkSkeleton vkSkeleton4 = (VkSkeleton) findViewById(R.id.feed_ads_image_skeleton);
        this.x = vkSkeleton4;
        setUpDefaultParams(vkSkeleton);
        setUpDefaultParams(vkSkeleton2);
        setUpDefaultParams(vkSkeleton3);
        setUpDefaultParams(vkSkeleton4);
        vkSkeleton.setType(VkSkeleton.a.b.a);
        vkSkeleton2.setType(new VkSkeleton.a.C0862a(4.0f));
        vkSkeleton3.setType(new VkSkeleton.a.C0862a(2.0f));
        vkSkeleton4.setType(VkSkeleton.a.d.a);
    }

    private final void setUpDefaultParams(VkSkeleton vkSkeleton) {
        vkSkeleton.setArea(getArea());
        vkSkeleton.setShimmerManagedExternally(true);
        vkSkeleton.setShimmer(this.t);
    }

    public a getArea() {
        return this.z;
    }

    public boolean getShimmerManagedExternally() {
        return this.y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getShimmerManagedExternally()) {
            return;
        }
        this.t.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getShimmerManagedExternally()) {
            return;
        }
        this.t.c();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (getShimmerManagedExternally()) {
            return;
        }
        ThemableShimmer themableShimmer = this.t;
        if (i == 0) {
            themableShimmer.b();
        } else if (i == 4 || i == 8) {
            themableShimmer.c();
        }
    }

    @Override // xsna.vjv0
    public void setArea(a aVar) {
        this.z = aVar;
        this.u.setArea(aVar);
        this.v.setArea(aVar);
        this.w.setArea(aVar);
        this.x.setArea(aVar);
    }

    @Override // xsna.vjv0
    public void setShimmer(ThemableShimmer themableShimmer) {
        this.u.setShimmer(themableShimmer);
        this.v.setShimmer(themableShimmer);
        this.w.setShimmer(themableShimmer);
        this.x.setShimmer(themableShimmer);
    }

    @Override // xsna.vjv0
    public void setShimmerManagedExternally(boolean z) {
        this.y = z;
    }
}
