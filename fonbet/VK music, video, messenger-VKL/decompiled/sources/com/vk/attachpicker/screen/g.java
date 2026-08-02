package com.vk.attachpicker.screen;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.screen.a;
import com.vk.attachpicker.screen.p;
import com.vk.attachpicker.widget.EditButton;
import com.vk.attachpicker.widget.ViewerToolbar;
import com.vk.attachpicker.widget.VkViewPager;
import com.vk.core.view.components.button.VkButton;
import com.vk.imageloader.ImageScreenSize;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import xsna.bwt0;
import xsna.f4m;
import xsna.iah0;
import xsna.ic3;
import xsna.jrl;
import xsna.js2;
import xsna.krl;
import xsna.ktc0;
import xsna.mcr0;
import xsna.qq2;
import xsna.s770;
import xsna.v16;
import xsna.w16;
import xsna.x16;
import xsna.yn3;
import xsna.zjt;
import xsna.zmw;

/* compiled from: DefaultViewerScreenViewDelegate.kt */
/* loaded from: classes15.dex */
public final class g implements t {
    public FrameLayout a;
    public VkViewPager b;
    public View c;
    public VkButton d;
    public EditButton e;
    public ViewerToolbar f;

    /* compiled from: DefaultViewerScreenViewDelegate.kt */
    public static final class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            g.this.C();
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final LayoutInflater A(Activity activity) {
        return activity.getLayoutInflater();
    }

    @Override // com.vk.attachpicker.screen.t
    public final void B(ic3 ic3Var) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(qq2.b);
        ViewerToolbar viewerToolbar = this.f;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewerToolbar, (Property<ViewerToolbar, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.e, (Property<EditButton, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        View view = this.c;
        animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view != null ? view.getHeight() : 0.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        animatorSet.addListener(new jrl(ic3Var));
        animatorSet.setDuration(175L);
        animatorSet.start();
    }

    @Override // com.vk.attachpicker.screen.t
    public final void C() {
        EditButton editButton = this.e;
        if (editButton != null) {
            f4m.j(editButton);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void D(r rVar) {
        VkViewPager vkViewPager = this.b;
        if (vkViewPager != null) {
            vkViewPager.setAdapter(rVar);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final ArrayList E() {
        ArrayList arrayList = new ArrayList();
        View view = this.c;
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<EditButton, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<ViewerToolbar, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        return arrayList;
    }

    @Override // com.vk.attachpicker.screen.t
    public final void F(View view) {
        if (view == null) {
            return;
        }
        this.a = (FrameLayout) view.findViewById(R.id.fl_container);
        this.b = (VkViewPager) view.findViewById(R.id.vp_pager);
        this.f = (ViewerToolbar) view.findViewById(R.id.fl_action_bar);
        this.e = (EditButton) view.findViewById(R.id.eb_edit_button);
        this.c = view.findViewById(R.id.fl_bottom_button);
        this.d = (VkButton) view.findViewById(R.id.acv_bottom_panel_counter);
        VkViewPager vkViewPager = this.b;
        if (vkViewPager != null) {
            vkViewPager.setPageMargin(iah0.a(10));
        }
        VkViewPager vkViewPager2 = this.b;
        if (vkViewPager2 != null) {
            vkViewPager2.setOffscreenPageLimit(1);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void G(int i) {
        ViewerToolbar viewerToolbar = this.f;
        if (viewerToolbar != null) {
            viewerToolbar.setCurrentPagerPosition(i);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final ktc0 H(MediaStoreEntry mediaStoreEntry) {
        return null;
    }

    @Override // com.vk.attachpicker.screen.t
    public final void I(x16 x16Var) {
        VkButton vkButton = this.d;
        if (vkButton != null) {
            vkButton.setOnClickListener(x16Var);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void J(int i) {
        ViewerToolbar viewerToolbar = this.f;
        if (viewerToolbar != null) {
            f4m.y(i, viewerToolbar);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void L(int i) {
        VkViewPager vkViewPager = this.b;
        if (vkViewPager != null) {
            vkViewPager.setCurrentItem(i, false);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final ArrayList M() {
        ArrayList arrayList = new ArrayList();
        View view = this.c;
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<EditButton, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<ViewerToolbar, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        return arrayList;
    }

    @Override // com.vk.attachpicker.screen.t
    public final s770 N() {
        return null;
    }

    @Override // com.vk.attachpicker.screen.t
    public final void O(int i) {
        VkButton vkButton = this.d;
        if (vkButton != null) {
            vkButton.setBackgroundTint(i);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final VkViewPager P() {
        return this.b;
    }

    @Override // com.vk.attachpicker.screen.t
    public final void Q(js2 js2Var) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(qq2.c);
        ViewerToolbar viewerToolbar = this.f;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewerToolbar, (Property<ViewerToolbar, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.e, (Property<EditButton, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        View view = this.c;
        animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view != null ? view.getHeight() : 0.0f));
        animatorSet.addListener(new krl(js2Var));
        animatorSet.setDuration(175L);
        animatorSet.start();
    }

    @Override // com.vk.attachpicker.screen.t
    public final void R(int i) {
        Integer valueOf = i == 0 ? null : Integer.valueOf(i);
        VkButton vkButton = this.d;
        if (vkButton != null) {
            vkButton.setCount(valueOf);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void S(yn3 yn3Var) {
        EditButton editButton = this.e;
        if (editButton != null) {
            bwt0.h0(yn3Var, editButton);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final int T() {
        VkViewPager vkViewPager = this.b;
        if (vkViewPager != null) {
            return vkViewPager.getCurrentItem();
        }
        return 0;
    }

    @Override // com.vk.attachpicker.screen.t
    public final void U(String str) {
        ViewerToolbar viewerToolbar = this.f;
        if (viewerToolbar != null) {
            viewerToolbar.setTitle(str);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void V(boolean z) {
        ViewerToolbar viewerToolbar = this.f;
        if (viewerToolbar != null) {
            viewerToolbar.setChecked(z);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void W(String str) {
        VkButton vkButton = this.d;
        if (vkButton != null) {
            vkButton.setText(str);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void Z(boolean z, boolean z2) {
        EditButton editButton = this.e;
        if (editButton == null) {
            return;
        }
        if (z2) {
            if (!z) {
                editButton.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new a()).setDuration(200L).start();
                return;
            } else {
                editButton.setVisibility(0);
                editButton.animate().alpha(1.0f).setListener(null).setDuration(200L).start();
                return;
            }
        }
        if (z) {
            editButton.setAlpha(1.0f);
            editButton.setVisibility(0);
        } else {
            editButton.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            C();
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void a0(w16 w16Var) {
        ViewerToolbar viewerToolbar = this.f;
        if (viewerToolbar != null) {
            viewerToolbar.setOnCheckListener(w16Var);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final int p() {
        return R.layout.picker_layout_image_viewer;
    }

    @Override // com.vk.attachpicker.screen.t
    public final Context q() {
        FrameLayout frameLayout = this.a;
        if (frameLayout != null) {
            return frameLayout.getContext();
        }
        return null;
    }

    @Override // com.vk.attachpicker.screen.t
    public final PagerAdapter r() {
        VkViewPager vkViewPager = this.b;
        if (vkViewPager != null) {
            return vkViewPager.getAdapter();
        }
        return null;
    }

    @Override // com.vk.attachpicker.screen.t
    public final void s(a.c cVar, zjt<?> zjtVar) {
        if (zjtVar == null) {
            return;
        }
        MediaStoreEntry mediaStoreEntry = cVar.d;
        Uri f = mediaStoreEntry != null ? mediaStoreEntry.f() : null;
        Field field = mcr0.a;
        zjtVar.m0(f, ImageScreenSize.SMALL.i());
        MediaStoreEntry mediaStoreEntry2 = cVar.d;
        cVar.f = mediaStoreEntry2 != null ? mediaStoreEntry2.getHeight() : 0;
        MediaStoreEntry mediaStoreEntry3 = cVar.d;
        cVar.e = mediaStoreEntry3 != null ? mediaStoreEntry3.getWidth() : 0;
    }

    @Override // com.vk.attachpicker.screen.t
    public final void t(p.a aVar) {
        VkViewPager vkViewPager = this.b;
        if (vkViewPager != null) {
            vkViewPager.addOnPageChangeListener(aVar);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void v(boolean z) {
        EditButton editButton = this.e;
        if (editButton != null) {
            editButton.setTrimMode(z);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void x(float f) {
        View view = this.c;
        if (view != null) {
            view.setAlpha(f);
        }
        EditButton editButton = this.e;
        if (editButton != null) {
            editButton.setAlpha(f);
        }
        ViewerToolbar viewerToolbar = this.f;
        if (viewerToolbar != null) {
            viewerToolbar.setAlpha(f);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void y(v16 v16Var) {
        ViewerToolbar viewerToolbar = this.f;
        if (viewerToolbar != null) {
            viewerToolbar.setOnBackListener(v16Var);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final int z(Activity activity) {
        return (int) activity.getResources().getDimension(R.dimen.picker_viewer_bottom_padding);
    }

    @Override // com.vk.attachpicker.screen.t
    public final void K(int i) {
    }

    @Override // com.vk.attachpicker.screen.t
    public final void X(com.vk.core.simplescreen.a aVar) {
    }

    @Override // com.vk.attachpicker.screen.t
    public final void Y(ArrayList arrayList) {
    }

    @Override // com.vk.attachpicker.screen.t
    public final void setAlpha(int i) {
    }

    @Override // com.vk.attachpicker.screen.t
    public final void u(com.vk.core.simplescreen.a aVar) {
    }

    @Override // com.vk.attachpicker.screen.t
    public final void w(zmw zmwVar) {
    }
}
