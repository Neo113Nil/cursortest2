package com.vk.feed.design.view.newsfeed.digest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.components.skeleton.a;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vkontakte.android.R;
import xsna.vjv0;

/* compiled from: FeedDigestBlockSkeleton.kt */
/* loaded from: classes18.dex */
public final class FeedDigestBlockSkeleton extends FrameLayout implements vjv0 {
    public final ThemableShimmer b;
    public final VkSkeleton c;
    public final VkSkeleton d;
    public final VkSkeleton e;
    public final VkSkeleton f;
    public final VkSkeleton g;
    public final VkSkeleton h;
    public final VkSkeleton i;
    public final VkSkeleton j;
    public final VkSkeleton k;
    public boolean l;
    public a m;

    public FeedDigestBlockSkeleton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ThemableShimmer a = new ThemableShimmer.a(context).a();
        this.b = a;
        ThemableShimmer.a aVar = new ThemableShimmer.a(context);
        ThemableShimmer themableShimmer = aVar.a;
        themableShimmer.i = R.attr.vk_ui_background_content;
        themableShimmer.j = Float.POSITIVE_INFINITY;
        ThemableShimmer a2 = aVar.a();
        this.m = new a.C0863a(this);
        LayoutInflater.from(context).inflate(R.layout.feed_digest_block_skeleton, this);
        VkSkeleton vkSkeleton = (VkSkeleton) findViewById(R.id.digest_header_skeleton);
        this.c = vkSkeleton;
        VkSkeleton vkSkeleton2 = (VkSkeleton) findViewById(R.id.digest_header_content_skeleton);
        this.d = vkSkeleton2;
        VkSkeleton vkSkeleton3 = (VkSkeleton) findViewById(R.id.digest_first_item_skeleton);
        this.e = vkSkeleton3;
        VkSkeleton vkSkeleton4 = (VkSkeleton) findViewById(R.id.digest_first_item_header_skeleton);
        this.f = vkSkeleton4;
        VkSkeleton vkSkeleton5 = (VkSkeleton) findViewById(R.id.digest_first_item_text_skeleton);
        this.g = vkSkeleton5;
        VkSkeleton vkSkeleton6 = (VkSkeleton) findViewById(R.id.digest_second_item_skeleton);
        this.h = vkSkeleton6;
        VkSkeleton vkSkeleton7 = (VkSkeleton) findViewById(R.id.digest_second_item_header_skeleton);
        this.i = vkSkeleton7;
        VkSkeleton vkSkeleton8 = (VkSkeleton) findViewById(R.id.digest_second_item_text_skeleton);
        this.j = vkSkeleton8;
        VkSkeleton vkSkeleton9 = (VkSkeleton) findViewById(R.id.digest_second_item_image_skeleton);
        this.k = vkSkeleton9;
        a(vkSkeleton, a);
        a(vkSkeleton2, a2);
        a(vkSkeleton3, a);
        a(vkSkeleton4, a2);
        a(vkSkeleton5, a2);
        a(vkSkeleton6, a);
        a(vkSkeleton7, a2);
        a(vkSkeleton8, a2);
        a(vkSkeleton9, a2);
        vkSkeleton.setType(new VkSkeleton.a.C0862a(10.0f));
        vkSkeleton2.setType(new VkSkeleton.a.C0862a(4.0f));
        vkSkeleton3.setType(new VkSkeleton.a.C0862a(10.0f));
        vkSkeleton4.setType(new VkSkeleton.a.C0862a(4.0f));
        vkSkeleton5.setType(new VkSkeleton.a.C0862a(4.0f));
        vkSkeleton6.setType(new VkSkeleton.a.C0862a(10.0f));
        vkSkeleton7.setType(new VkSkeleton.a.C0862a(4.0f));
        vkSkeleton8.setType(new VkSkeleton.a.C0862a(4.0f));
        vkSkeleton9.setType(new VkSkeleton.a.C0862a(4.0f));
    }

    public final void a(VkSkeleton vkSkeleton, ThemableShimmer themableShimmer) {
        vkSkeleton.setArea(getArea());
        vkSkeleton.setShimmerManagedExternally(true);
        vkSkeleton.setShimmer(themableShimmer);
    }

    public a getArea() {
        return this.m;
    }

    public boolean getShimmerManagedExternally() {
        return this.l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getShimmerManagedExternally()) {
            return;
        }
        this.b.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getShimmerManagedExternally()) {
            return;
        }
        this.b.c();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (getShimmerManagedExternally()) {
            return;
        }
        ThemableShimmer themableShimmer = this.b;
        if (i == 0) {
            themableShimmer.b();
        } else if (i == 4 || i == 8) {
            themableShimmer.c();
        }
    }

    @Override // xsna.vjv0
    public void setArea(a aVar) {
        this.m = aVar;
        this.c.setArea(aVar);
        this.e.setArea(aVar);
        this.h.setArea(aVar);
        this.d.setArea(aVar);
        this.f.setArea(aVar);
        this.g.setArea(aVar);
        this.i.setArea(aVar);
        this.j.setArea(aVar);
        this.k.setArea(aVar);
    }

    @Override // xsna.vjv0
    public void setShimmer(ThemableShimmer themableShimmer) {
        this.c.setShimmer(themableShimmer);
        this.e.setShimmer(themableShimmer);
        this.h.setShimmer(themableShimmer);
    }

    @Override // xsna.vjv0
    public void setShimmerManagedExternally(boolean z) {
        this.l = z;
    }
}
