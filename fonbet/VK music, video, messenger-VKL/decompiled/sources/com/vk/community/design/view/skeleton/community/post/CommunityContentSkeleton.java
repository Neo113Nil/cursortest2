package com.vk.community.design.view.skeleton.community.post;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.bwt0;
import xsna.f3g;
import xsna.ful0;
import xsna.iah0;
import xsna.krv0;
import xsna.msy;
import xsna.too0;
import xsna.uo6;
import xsna.w3r0;

/* compiled from: CommunityContentSkeleton.kt */
/* loaded from: classes17.dex */
public final class CommunityContentSkeleton extends ConstraintLayout implements too0 {
    public static final /* synthetic */ int y = 0;
    public final VkSkeleton t;
    public final LinearLayout u;
    public final LinearLayout v;
    public final Object w;
    public final Object x;

    public CommunityContentSkeleton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        f3g f3gVar = new f3g(context, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.w = msy.a(lazyThreadSafetyMode, f3gVar);
        this.x = msy.a(lazyThreadSafetyMode, new uo6(context, 2));
        LayoutInflater.from(context).inflate(R.layout.community_content_skeleton, (ViewGroup) this, true);
        bwt0.d(this, iah0.a(20), false, true);
        this.t = (VkSkeleton) findViewById(R.id.ll_skeleton_cover);
        this.u = (LinearLayout) findViewById(R.id.ll_tab_container);
        this.v = (LinearLayout) findViewById(R.id.ll_content_container);
        setupContent(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ThemableShimmer getDarkShimmer() {
        return (ThemableShimmer) this.x.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ThemableShimmer getLightShimmer() {
        return (ThemableShimmer) this.w.getValue();
    }

    private final GradientDrawable getSelectedDrawable() {
        GradientDrawable a = ful0.a(0);
        a.setCornerRadius(iah0.a(8));
        a.setStroke((int) iah0.b(0.5f), ColorStateList.valueOf(krv0.m(R.attr.vk_ui_separator_primary, getContext())));
        return a;
    }

    private final void setupContent(Context context) {
        w3r0.a(this.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getLightShimmer(), 5);
        setupTabs(context);
        setupWallPosts(context);
    }

    private final void setupTabs(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        ViewGroup P4 = P4(from, true);
        LinearLayout linearLayout = this.u;
        linearLayout.addView(P4);
        P4.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int z = iah0.z(context) / P4.getMeasuredWidth();
        int i = z >= 1 ? z : 1;
        for (int i2 = 0; i2 < i; i2++) {
            linearLayout.addView(P4(from, false));
        }
    }

    private final void setupWallPosts(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        for (int i = 0; i < 2; i++) {
            LinearLayout linearLayout = this.v;
            View inflate = from.inflate(R.layout.community_wall_item_skeleton, (ViewGroup) linearLayout, false);
            w3r0.b((VkSkeleton) inflate.findViewById(R.id.v_avatar), getDarkShimmer());
            float f = 1;
            w3r0.a((VkSkeleton) inflate.findViewById(R.id.v_title), iah0.a(f), getDarkShimmer(), 4);
            w3r0.a((VkSkeleton) inflate.findViewById(R.id.v_info1), iah0.a(f), getDarkShimmer(), 4);
            w3r0.a((VkSkeleton) inflate.findViewById(R.id.v_info2), iah0.a(f), getDarkShimmer(), 4);
            w3r0.a((VkSkeleton) inflate.findViewById(R.id.v_image), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getDarkShimmer(), 5);
            linearLayout.addView(inflate);
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        LinearLayout linearLayout = this.u;
        if (linearLayout.getChildCount() != 0) {
            View childAt = linearLayout.getChildAt(0);
            ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup != null) {
                viewGroup.setBackground(getSelectedDrawable());
            }
        }
    }

    public final ViewGroup P4(LayoutInflater layoutInflater, boolean z) {
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(R.layout.community_content_tab_item_skeleton, (ViewGroup) this.u, false);
        viewGroup.setBackground(z ? getSelectedDrawable() : null);
        w3r0.b((VkSkeleton) viewGroup.findViewById(R.id.tab_icon_skeleton), getDarkShimmer());
        w3r0.a((VkSkeleton) viewGroup.findViewById(R.id.tab_text_skeleton), iah0.a(1), getDarkShimmer(), 4);
        return viewGroup;
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
