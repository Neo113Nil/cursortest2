package com.vk.community.design.view.skeleton.community.header;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.bwt0;
import xsna.e3m;
import xsna.f4m;
import xsna.fnj;
import xsna.ful0;
import xsna.g3g;
import xsna.gjf0;
import xsna.h3g;
import xsna.iah0;
import xsna.krv0;
import xsna.msy;
import xsna.too0;
import xsna.w3r0;

/* compiled from: CommunityHeaderSkeleton.kt */
/* loaded from: classes17.dex */
public final class CommunityHeaderSkeleton extends ConstraintLayout implements too0 {
    public static final /* synthetic */ int w = 0;
    public final VkSkeleton t;
    public final Object u;
    public final Object v;

    public CommunityHeaderSkeleton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        g3g g3gVar = new g3g(context, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.u = msy.a(lazyThreadSafetyMode, g3gVar);
        this.v = msy.a(lazyThreadSafetyMode, new h3g(context, 1));
        LayoutInflater.from(context).inflate(R.layout.community_header_skeleton, (ViewGroup) this, true);
        VkSkeleton vkSkeleton = (VkSkeleton) findViewById(R.id.v_cover);
        VkSkeleton vkSkeleton2 = (VkSkeleton) findViewById(R.id.v_block);
        VkSkeleton vkSkeleton3 = (VkSkeleton) findViewById(R.id.v_avatar);
        vkSkeleton3.setForeground(getAvatarDrawable());
        this.t = vkSkeleton3;
        VkSkeleton vkSkeleton4 = (VkSkeleton) findViewById(R.id.v_name);
        VkSkeleton vkSkeleton5 = (VkSkeleton) findViewById(R.id.v_info_2);
        VkSkeleton vkSkeleton6 = (VkSkeleton) findViewById(R.id.v_info_3);
        VkSkeleton vkSkeleton7 = (VkSkeleton) findViewById(R.id.v_buttons);
        int a = e3m.a(R.dimen.community_header_corner_radius, getContext());
        int a2 = iah0.a(getContext().getResources().getConfiguration().screenWidthDp);
        a2 = fnj.b(getContext()) ? a2 - (iah0.a(84) + (gjf0.a(getContext(), true) * 2)) : a2;
        int a3 = e3m.a(R.dimen.community_header_min_cover_height, getContext());
        int i = (int) (a2 / 2.5f);
        int i2 = (i >= a3 ? i : a3) + a;
        f4m.k(i2, vkSkeleton);
        f4m.t(i2 - a, vkSkeleton2);
        w3r0.a(vkSkeleton2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getLightShimmer(), 5);
        bwt0.d(vkSkeleton2, iah0.a(20), true, true);
        w3r0.a(vkSkeleton, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getDarkShimmer(), 5);
        w3r0.b(vkSkeleton3, getDarkShimmer());
        float f = 2;
        w3r0.a(vkSkeleton4, iah0.a(f), getDarkShimmer(), 4);
        w3r0.a(vkSkeleton5, iah0.a(f), getDarkShimmer(), 4);
        w3r0.a(vkSkeleton6, iah0.a(f), getDarkShimmer(), 4);
        w3r0.a(vkSkeleton7, iah0.a(f), getDarkShimmer(), 4);
    }

    private final GradientDrawable getAvatarDrawable() {
        GradientDrawable a = ful0.a(1);
        a.setStroke(iah0.a(4), krv0.m(R.attr.vk_ui_background_content, getContext()));
        a.setColor(0);
        return a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ThemableShimmer getDarkShimmer() {
        return (ThemableShimmer) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ThemableShimmer getLightShimmer() {
        return (ThemableShimmer) this.u.getValue();
    }

    @Override // xsna.too0
    public final void Ng() {
        this.t.setForeground(getAvatarDrawable());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getLightShimmer().b();
        getDarkShimmer().b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getLightShimmer().c();
        getDarkShimmer().c();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view.getId() != R.id.community_profile_skeleton) {
            return;
        }
        if (i == 0) {
            getLightShimmer().b();
            getDarkShimmer().b();
        } else if (i == 4 || i == 8) {
            getLightShimmer().c();
            getDarkShimmer().c();
        }
    }
}
