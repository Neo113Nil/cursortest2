package com.vk.community.design.view.skeleton.community.header;

import android.content.Context;
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
import xsna.e9h;
import xsna.f3g;
import xsna.f4m;
import xsna.fnj;
import xsna.gjf0;
import xsna.iah0;
import xsna.msy;
import xsna.too0;
import xsna.w3r0;

/* compiled from: CommunityLiveHeaderSkeleton.kt */
/* loaded from: classes17.dex */
public final class CommunityLiveHeaderSkeleton extends ConstraintLayout implements too0 {
    public static final /* synthetic */ int v = 0;
    public final Object t;
    public final Object u;

    public CommunityLiveHeaderSkeleton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        e9h e9hVar = new e9h(context, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = msy.a(lazyThreadSafetyMode, e9hVar);
        this.u = msy.a(lazyThreadSafetyMode, new f3g(context, 2));
        LayoutInflater.from(context).inflate(R.layout.community_live_header_skeleton, (ViewGroup) this, true);
        VkSkeleton vkSkeleton = (VkSkeleton) findViewById(R.id.v_cover);
        VkSkeleton vkSkeleton2 = (VkSkeleton) findViewById(R.id.v_block);
        VkSkeleton vkSkeleton3 = (VkSkeleton) findViewById(R.id.v_avatar);
        VkSkeleton vkSkeleton4 = (VkSkeleton) findViewById(R.id.v_name);
        VkSkeleton vkSkeleton5 = (VkSkeleton) findViewById(R.id.v_button_1);
        VkSkeleton vkSkeleton6 = (VkSkeleton) findViewById(R.id.v_button_2);
        VkSkeleton vkSkeleton7 = (VkSkeleton) findViewById(R.id.v_info_1);
        VkSkeleton vkSkeleton8 = (VkSkeleton) findViewById(R.id.v_info_2);
        int a = e3m.a(R.dimen.community_header_live_cover_corner_radius, getContext());
        int a2 = iah0.a(getContext().getResources().getConfiguration().screenWidthDp);
        int a3 = (int) ((fnj.b(getContext()) ? a2 - (iah0.a(84) + (gjf0.a(getContext(), true) * 2)) : a2) * 1.25f);
        int p = iah0.p(getContext());
        a3 = a3 > p ? p : a3;
        f4m.k(a3, vkSkeleton);
        f4m.t(a3 - a, vkSkeleton2);
        w3r0.a(vkSkeleton, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getDarkShimmer(), 5);
        float f = 20;
        bwt0.d(vkSkeleton, iah0.a(f), true, false);
        w3r0.a(vkSkeleton2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getLightShimmer(), 5);
        bwt0.d(vkSkeleton2, iah0.a(f), true, false);
        w3r0.b(vkSkeleton3, getLightShimmer());
        float f2 = 2;
        w3r0.a(vkSkeleton4, iah0.a(f2), getLightShimmer(), 4);
        float f3 = 4;
        w3r0.a(vkSkeleton5, iah0.a(f3), getLightShimmer(), 4);
        w3r0.a(vkSkeleton6, iah0.a(f3), getLightShimmer(), 4);
        w3r0.a(vkSkeleton7, iah0.a(f2), getDarkShimmer(), 4);
        w3r0.a(vkSkeleton8, iah0.a(f2), getDarkShimmer(), 4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ThemableShimmer getDarkShimmer() {
        return (ThemableShimmer) this.u.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ThemableShimmer getLightShimmer() {
        return (ThemableShimmer) this.t.getValue();
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

    @Override // xsna.too0
    public final void Ng() {
    }
}
