package com.vk.onepasspromo.impl;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.hints.HintId;
import com.vk.fullscreen.promo.core.PromoSessionInfo;
import com.vk.superapp.ui.toolbar.VkAuthToolbar;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.aeg0;
import xsna.d2y;
import xsna.dbg0;
import xsna.gj80;
import xsna.jgz;
import xsna.jjc;
import xsna.k7y;
import xsna.krv0;
import xsna.lw20;
import xsna.msy;
import xsna.oz50;
import xsna.s1x;
import xsna.sjo;
import xsna.tb0;
import xsna.tzv;
import xsna.ubw;
import xsna.wvw;
import xsna.zys;

/* compiled from: OnePassPromoFragment.kt */
/* loaded from: classes4.dex */
public final class OnePassPromoFragment extends FragmentImpl implements tb0 {
    public static final /* synthetic */ int R = 0;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    /* compiled from: OnePassPromoFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(OnePassPromoFragment.class, null, null);
        }
    }

    public OnePassPromoFragment() {
        s1x s1xVar = new s1x(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, s1xVar);
        this.O = msy.a(lazyThreadSafetyMode, new tzv(this, 19));
        this.P = msy.a(lazyThreadSafetyMode, new k7y(this, 20));
        this.Q = msy.a(lazyThreadSafetyMode, new ubw(this, 17));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void eo() {
        Bundle arguments = getArguments();
        PromoSessionInfo promoSessionInfo = arguments != null ? (PromoSessionInfo) arguments.getParcelable("bundle_key_promo_session") : null;
        if (promoSessionInfo != null) {
            ((zys) this.P.getValue()).a(promoSessionInfo);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 723) {
            eo();
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater.Factory activity = getActivity();
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.Li(this);
        }
        return layoutInflater.inflate(R.layout.vk_one_pass_promo_layout, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        LayoutInflater.Factory activity = getActivity();
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.yk(this);
        }
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Button button = (Button) view.findViewById(R.id.enable_one_pass_button);
        if (button != null) {
            jjc.g(button, new gj80(this, 0));
        }
        jjc.g((Button) view.findViewById(R.id.later_button), new d2y(this, 14));
        VkAuthToolbar vkAuthToolbar = (VkAuthToolbar) view.findViewById(R.id.toolbar);
        if (vkAuthToolbar != null) {
            vkAuthToolbar.setNavigationOnClickListener(new lw20(this, 11));
            Resources resources = getResources();
            ThreadLocal<TypedValue> threadLocal = dbg0.a;
            Drawable drawable = resources.getDrawable(R.drawable.vk_icon_dismiss_24, null);
            if (drawable != null) {
                vkAuthToolbar.setNavigationIcon(drawable);
            }
            Drawable navigationIcon = vkAuthToolbar.getNavigationIcon();
            if (navigationIcon != null) {
                sjo.b(navigationIcon, krv0.m(R.attr.vk_ui_icon_secondary, requireContext()), PorterDuff.Mode.SRC_IN);
            }
            vkAuthToolbar.setPicture(jgz.r(requireContext()));
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.one_pass_promo_lottie);
        if (lottieAnimationView != null) {
            lottieAnimationView.m0();
        }
        com.vk.onepasspromo.impl.a.c = false;
        ((wvw) this.Q.getValue()).b().b(HintId.ACCOUNT_ONEPASS_PROMO.getId());
    }
}
