package com.vk.attachpicker.screen;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.screen.a;
import com.vk.attachpicker.screen.p;
import com.vk.attachpicker.widget.VkViewPager;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.awt0;
import xsna.bwt0;
import xsna.cm1;
import xsna.cn70;
import xsna.d5;
import xsna.dfc0;
import xsna.dhr0;
import xsna.e4;
import xsna.eko;
import xsna.f4m;
import xsna.g2u0;
import xsna.go2;
import xsna.iah0;
import xsna.ic3;
import xsna.js2;
import xsna.k140;
import xsna.k82;
import xsna.ktc0;
import xsna.mic;
import xsna.msy;
import xsna.ni0;
import xsna.o15;
import xsna.qq2;
import xsna.s770;
import xsna.sdy;
import xsna.tlo0;
import xsna.tq;
import xsna.v16;
import xsna.w16;
import xsna.x16;
import xsna.yn3;
import xsna.ypc0;
import xsna.zjt;
import xsna.zle;
import xsna.zmw;
import xsna.zpc0;

/* compiled from: PostingViewerScreenViewDelegate.kt */
/* loaded from: classes15.dex */
public final class k implements t {
    public final Object A;
    public final Object B;
    public final int C;
    public final boolean a;
    public final boolean b;
    public final Window c;
    public final o15 d;
    public final zle e;
    public final k82 f;
    public final s770 g;
    public FrameLayout h;
    public View i;
    public View j;
    public VkViewPager k;
    public View l;
    public VkButton m;
    public VkButton n;
    public View o;
    public View p;
    public View q;
    public View r;
    public View s;
    public int t;
    public boolean u;
    public boolean v;
    public ArrayList w;
    public VkTopBar x;
    public View y;
    public boolean z;

    /* compiled from: PostingViewerScreenViewDelegate.kt */
    public static final class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            k.this.C();
        }
    }

    public k(boolean z, boolean z2, Window window, o15 o15Var, zle zleVar, k82 k82Var, dfc0 dfc0Var) {
        this.a = z;
        this.b = z2;
        this.c = window;
        this.d = o15Var;
        this.e = zleVar;
        this.f = k82Var;
        this.g = dfc0Var;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.A = msy.a(lazyThreadSafetyMode, ypc0.b);
        this.B = msy.a(lazyThreadSafetyMode, zpc0.b);
        this.C = 5380;
    }

    @Override // com.vk.attachpicker.screen.t
    public final LayoutInflater A(Activity activity) {
        dhr0.a.getClass();
        return LayoutInflater.from(dhr0.t(activity));
    }

    @Override // com.vk.attachpicker.screen.t
    public final void B(ic3 ic3Var) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(qq2.b);
        VkTopBar vkTopBar = this.x;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vkTopBar, (Property<VkTopBar, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.n, (Property<VkButton, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        View view = this.l;
        animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view != null ? view.getHeight() : 0.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        animatorSet.addListener(new mic(ic3Var, 1));
        animatorSet.setDuration(175L);
        animatorSet.start();
    }

    @Override // com.vk.attachpicker.screen.t
    public final void C() {
        VkButton vkButton = this.n;
        if (vkButton != null) {
            f4m.j(vkButton);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void D(r rVar) {
        VkViewPager vkViewPager = this.k;
        if (vkViewPager != null) {
            vkViewPager.setAdapter(rVar);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final ArrayList E() {
        ArrayList arrayList = new ArrayList();
        View view = this.l;
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        arrayList.add(ObjectAnimator.ofFloat(this.n, (Property<VkButton, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        arrayList.add(ObjectAnimator.ofFloat(this.x, (Property<VkTopBar, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        return arrayList;
    }

    @Override // com.vk.attachpicker.screen.t
    public final void F(final View view) {
        WindowManager.LayoutParams attributes;
        if (view == null) {
            return;
        }
        this.j = view;
        this.h = (FrameLayout) view.findViewById(R.id.fl_container);
        this.i = view.findViewById(R.id.fl_container_background);
        this.k = (VkViewPager) view.findViewById(R.id.vp_pager);
        this.x = (VkTopBar) view.findViewById(R.id.fl_action_bar);
        this.y = view.findViewById(R.id.fl_action_bar_separator);
        this.n = (VkButton) view.findViewById(R.id.eb_edit_button);
        this.o = view.findViewById(R.id.eb_space);
        this.l = view.findViewById(R.id.fl_bottom_button);
        this.m = (VkButton) view.findViewById(R.id.acv_bottom_panel_counter);
        this.p = view.findViewById(R.id.pv_content_scrim);
        this.q = view.findViewById(R.id.pv_bottom_nav_scrim);
        this.r = view.findViewById(R.id.pv_left_nav_scrim);
        this.s = view.findViewById(R.id.pv_right_nav_scrim);
        VkButton vkButton = this.n;
        if (vkButton != null) {
            awt0.v(vkButton, this.b && a());
        }
        if (this.a) {
            VkButton vkButton2 = this.m;
            if (vkButton2 != null) {
                vkButton2.setVisibility(0);
            }
            View view2 = this.o;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            VkButton vkButton3 = this.m;
            if (vkButton3 != null) {
                f4m.j(vkButton3);
            }
            View view3 = this.o;
            if (view3 != null) {
                f4m.j(view3);
            }
        }
        Window window = this.c;
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: xsna.xpc0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view4, WindowInsets windowInsets) {
                int stableInsetTop = windowInsets.getStableInsetTop();
                int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
                int stableInsetRight = windowInsets.getStableInsetRight();
                int stableInsetLeft = windowInsets.getStableInsetLeft();
                com.vk.attachpicker.screen.k kVar = com.vk.attachpicker.screen.k.this;
                boolean z = kVar.v;
                View view5 = view;
                if (!z) {
                    view5.setPadding(stableInsetLeft, stableInsetTop, stableInsetRight, systemWindowInsetBottom);
                    return windowInsets;
                }
                view5.setPadding(0, 0, 0, 0);
                View view6 = kVar.p;
                if (view6 != null) {
                    bwt0.c0(stableInsetTop, view6);
                }
                View view7 = kVar.q;
                if (view7 != null) {
                    bwt0.c0(systemWindowInsetBottom, view7);
                }
                View view8 = kVar.r;
                if (view8 != null) {
                    bwt0.r0(stableInsetLeft, view8);
                }
                View view9 = kVar.s;
                if (view9 != null) {
                    bwt0.r0(stableInsetRight, view9);
                }
                View view10 = kVar.p;
                if (view10 != null) {
                    f4m.s(stableInsetLeft, view10);
                }
                View view11 = kVar.p;
                if (view11 != null) {
                    f4m.r(stableInsetRight, view11);
                }
                View view12 = kVar.l;
                if (view12 != null) {
                    bwt0.e0(view12, stableInsetLeft, stableInsetTop, stableInsetRight, systemWindowInsetBottom);
                }
                return windowInsets;
            }
        });
        VkViewPager vkViewPager = this.k;
        if (vkViewPager != null) {
            vkViewPager.setPageMargin(iah0.a(10));
        }
        VkViewPager vkViewPager2 = this.k;
        if (vkViewPager2 != null) {
            vkViewPager2.setOffscreenPageLimit(1);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void G(int i) {
        this.t = i;
    }

    @Override // com.vk.attachpicker.screen.t
    public final ktc0 H(MediaStoreEntry mediaStoreEntry) {
        return (ktc0) this.f.invoke(mediaStoreEntry);
    }

    @Override // com.vk.attachpicker.screen.t
    public final void I(x16 x16Var) {
        VkButton vkButton = this.m;
        if (vkButton != null) {
            vkButton.setOnClickListener(x16Var);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void J(int i) {
        VkTopBar vkTopBar = this.x;
        if (vkTopBar != null) {
            f4m.y(i, vkTopBar);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void K(int i) {
        this.d.invoke(Integer.valueOf(i));
    }

    @Override // com.vk.attachpicker.screen.t
    public final void L(int i) {
        VkViewPager vkViewPager = this.k;
        if (vkViewPager != null) {
            vkViewPager.setCurrentItem(i, false);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final ArrayList M() {
        ArrayList arrayList = new ArrayList();
        View view = this.l;
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.n, (Property<VkButton, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.x, (Property<VkTopBar, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        return arrayList;
    }

    @Override // com.vk.attachpicker.screen.t
    public final s770 N() {
        return this.g;
    }

    @Override // com.vk.attachpicker.screen.t
    public final VkViewPager P() {
        return this.k;
    }

    @Override // com.vk.attachpicker.screen.t
    public final void Q(js2 js2Var) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(qq2.c);
        VkTopBar vkTopBar = this.x;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vkTopBar, (Property<VkTopBar, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.n, (Property<VkButton, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        View view = this.l;
        animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view != null ? view.getHeight() : 0.0f));
        animatorSet.addListener(new go2(js2Var, 1));
        animatorSet.setDuration(175L);
        animatorSet.start();
    }

    @Override // com.vk.attachpicker.screen.t
    public final void R(int i) {
        VkButton vkButton = this.m;
        if (vkButton != null) {
            vkButton.setCount(i == 0 ? null : Integer.valueOf(i));
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void S(yn3 yn3Var) {
        VkButton vkButton = this.n;
        if (vkButton != null) {
            bwt0.h0(new cm1(5, this, yn3Var), vkButton);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final int T() {
        VkViewPager vkViewPager = this.k;
        if (vkViewPager != null) {
            return vkViewPager.getCurrentItem();
        }
        return 0;
    }

    @Override // com.vk.attachpicker.screen.t
    public final void U(String str) {
        VkTopBar vkTopBar = this.x;
        if (vkTopBar != null) {
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(str, (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.attachpicker.screen.t
    public final void V(boolean z) {
        VkTopBar.a after;
        if (this.a) {
            Drawable drawable = z ? ((eko) this.A.getValue()).a : ((eko) this.B.getValue()).a;
            int i = z ? R.string.accessibility_cancel : R.string.accessibility_select;
            VkTopBar vkTopBar = this.x;
            VkTopBar.a.c b = (vkTopBar == null || (after = vkTopBar.getAfter()) == null) ? null : after.b();
            VkTopBar.a.c.f fVar = b instanceof VkTopBar.a.c.f ? (VkTopBar.a.c.f) b : null;
            VkTopBar.a.c.f a2 = fVar != null ? VkTopBar.a.c.f.a(fVar, new eko(drawable), tq.h(tlo0.Companion, i), null, null, 60) : new VkTopBar.a.c.f(new eko(drawable), tq.h(tlo0.Companion, i), null, null, null, null, 60);
            VkTopBar vkTopBar2 = this.x;
            if (vkTopBar2 != null) {
                vkTopBar2.setAfter(VkTopBar.a.C0875a.a(a2, null, 6));
            }
            this.z = z;
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void W(String str) {
        VkButton vkButton = this.m;
        if (vkButton != null) {
            vkButton.setText(str);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void X(com.vk.core.simplescreen.a aVar) {
        Window window = aVar.getWindow();
        if (window != null) {
            window.addFlags(201326592);
        }
        this.v = true;
    }

    @Override // com.vk.attachpicker.screen.t
    public final void Y(ArrayList arrayList) {
        this.w = arrayList;
    }

    @Override // com.vk.attachpicker.screen.t
    public final void Z(boolean z, boolean z2) {
        VkButton vkButton = this.n;
        if (vkButton == null) {
            return;
        }
        if (!a()) {
            C();
            return;
        }
        if (z2) {
            if (!z) {
                vkButton.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new a()).setDuration(200L).start();
                return;
            } else {
                vkButton.setVisibility(0);
                vkButton.animate().alpha(1.0f).setListener(null).setDuration(200L).start();
                return;
            }
        }
        if (z) {
            vkButton.setAlpha(1.0f);
            vkButton.setVisibility(0);
        } else {
            vkButton.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            C();
        }
    }

    public final boolean a() {
        ArrayList arrayList = this.w;
        MediaStoreEntry mediaStoreEntry = arrayList != null ? (MediaStoreEntry) arrayList.get(this.t) : null;
        if (mediaStoreEntry == null || URLUtil.isFileUrl(mediaStoreEntry.f().toString()) || URLUtil.isContentUrl(mediaStoreEntry.f().toString())) {
            return mediaStoreEntry == null || !sdy.p(mediaStoreEntry);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.attachpicker.screen.t
    public final void a0(w16 w16Var) {
        VkTopBar.a after;
        if (this.a) {
            VkTopBar vkTopBar = this.x;
            VkTopBar.a.c b = (vkTopBar == null || (after = vkTopBar.getAfter()) == null) ? null : after.b();
            VkTopBar.a.c.f fVar = b instanceof VkTopBar.a.c.f ? (VkTopBar.a.c.f) b : null;
            Drawable drawable = this.z ? ((eko) this.A.getValue()).a : ((eko) this.B.getValue()).a;
            int i = this.z ? R.string.accessibility_cancel : R.string.accessibility_select;
            d5 d5Var = new d5(21, w16Var, this);
            VkTopBar.a.c.f a2 = fVar != null ? VkTopBar.a.c.f.a(fVar, null, null, d5Var, null, 59) : new VkTopBar.a.c.f(new eko(drawable), tq.h(tlo0.Companion, i), d5Var, null, null, null, 56);
            VkTopBar vkTopBar2 = this.x;
            if (vkTopBar2 != null) {
                vkTopBar2.setAfter(VkTopBar.a.C0875a.a(a2, null, 6));
            }
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final int p() {
        return R.layout.picker_layout_image_viewer_v2;
    }

    @Override // com.vk.attachpicker.screen.t
    public final Context q() {
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            return frameLayout.getContext();
        }
        return null;
    }

    @Override // com.vk.attachpicker.screen.t
    public final PagerAdapter r() {
        VkViewPager vkViewPager = this.k;
        if (vkViewPager != null) {
            return vkViewPager.getAdapter();
        }
        return null;
    }

    @Override // com.vk.attachpicker.screen.t
    public final void setAlpha(int i) {
        VkTopBar vkTopBar;
        VkTopBar vkTopBar2;
        float f = i / 255.0f;
        View view = this.l;
        if (view != null) {
            view.setAlpha(f);
        }
        VkTopBar vkTopBar3 = this.x;
        if (vkTopBar3 != null) {
            vkTopBar3.setAlpha(f);
        }
        View view2 = this.y;
        if (view2 != null) {
            view2.setAlpha(f);
        }
        View view3 = this.i;
        if (view3 != null) {
            view3.setAlpha(f);
        }
        View view4 = this.p;
        if (view4 != null) {
            view4.setAlpha(f);
        }
        View view5 = this.q;
        if (view5 != null) {
            view5.setAlpha(f);
        }
        View view6 = this.r;
        if (view6 != null) {
            view6.setAlpha(f);
        }
        View view7 = this.s;
        if (view7 != null) {
            view7.setAlpha(f);
        }
        Window window = this.c;
        if (window != null) {
            window.setDimAmount(f);
        }
        if (i == 255 && !this.u && (vkTopBar2 = this.x) != null) {
            vkTopBar2.setVisibility(0);
        }
        if (i != 0 || (vkTopBar = this.x) == null) {
            return;
        }
        vkTopBar.setVisibility(4);
    }

    @Override // com.vk.attachpicker.screen.t
    public final void t(p.a aVar) {
        VkViewPager vkViewPager = this.k;
        if (vkViewPager != null) {
            vkViewPager.addOnPageChangeListener(aVar);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void u(com.vk.core.simplescreen.a aVar) {
        Window window = aVar.getWindow();
        if (window != null) {
            window.clearFlags(201326592);
        }
        this.v = false;
    }

    @Override // com.vk.attachpicker.screen.t
    public final void w(zmw zmwVar) {
        zmwVar.setBorderEnabled(true);
        zmwVar.setBorderWidth(cn70.a() * 0.5f);
        View view = this.j;
        if (view != null) {
            zmwVar.setBorderColor(g2u0.a(R.color.vk_black_alpha8, view));
        }
        zmwVar.setImageListener(new k140(this));
    }

    @Override // com.vk.attachpicker.screen.t
    public final void x(float f) {
        View view = this.l;
        if (view != null) {
            view.setAlpha(f);
        }
        VkButton vkButton = this.n;
        if (vkButton != null) {
            vkButton.setAlpha(f);
        }
        VkTopBar vkTopBar = this.x;
        if (vkTopBar != null) {
            vkTopBar.setAlpha(f);
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final void y(v16 v16Var) {
        VkTopBar vkTopBar = this.x;
        if (vkTopBar != null) {
            vkTopBar.setBack(new VkTopBar.b(new ni0(14, v16Var, this), tq.h(tlo0.Companion, R.string.talkback_ic_back), null, null, null, 28));
        }
    }

    @Override // com.vk.attachpicker.screen.t
    public final int z(Activity activity) {
        return 0;
    }

    @Override // com.vk.attachpicker.screen.t
    public final void O(int i) {
    }

    @Override // com.vk.attachpicker.screen.t
    public final void v(boolean z) {
    }

    @Override // com.vk.attachpicker.screen.t
    public final void s(a.c cVar, zjt<?> zjtVar) {
    }
}
