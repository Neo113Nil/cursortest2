package com.vk.photos.root.presentation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.a;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.core.view.VKTabLayout;
import com.vk.dto.common.id.UserId;
import com.vk.photos.root.tabs.PhotosRootTab;
import com.vk.profile.core.content.ProfileOnboardingBanner;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.abg0;
import xsna.aor;
import xsna.awt0;
import xsna.b9;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e3m;
import xsna.f4m;
import xsna.f5x;
import xsna.f5z;
import xsna.f880;
import xsna.fnj;
import xsna.gm50;
import xsna.h440;
import xsna.h4x;
import xsna.iah0;
import xsna.io60;
import xsna.jga0;
import xsna.kga0;
import xsna.m33;
import xsna.n13;
import xsna.nb;
import xsna.nly;
import xsna.owv;
import xsna.p31;
import xsna.rj4;
import xsna.s0e0;
import xsna.too0;
import xsna.ux40;
import xsna.w620;
import xsna.w8i;
import xsna.z1h0;
import xsna.z8;

/* compiled from: PhotosRootView.kt */
/* loaded from: classes4.dex */
public final class h implements gm50, w8i, too0 {
    public final Context b;
    public final PhotosRootFragment c;
    public final h440 d;
    public final ux40 e;
    public final f5z f;
    public final View g;
    public final CoordinatorLayout h;
    public final AppBarLayout i;
    public final View j;
    public final VKTabLayout k;
    public final ViewPager2 l;
    public final PhotoFlowToolbarView m;
    public com.google.android.material.tabs.c n;
    public final ProfileOnboardingBanner o;
    public UserId p;
    public final bpn0 q;
    public final Handler r;
    public final p31 s;

    public h(Context context, PhotosRootFragment photosRootFragment, h440 h440Var, ux40 ux40Var, f5z f5zVar) {
        this.b = context;
        this.c = photosRootFragment;
        this.d = h440Var;
        this.e = ux40Var;
        this.f = f5zVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.photos_root_fragment, (ViewGroup) null);
        this.g = inflate;
        this.h = (CoordinatorLayout) inflate.findViewById(R.id.photos_root_content_container);
        AppBarLayout appBarLayout = (AppBarLayout) inflate.findViewById(R.id.photos_root_app_bar_layout);
        this.i = appBarLayout;
        this.j = inflate.findViewById(R.id.gradient);
        this.k = (VKTabLayout) inflate.findViewById(R.id.tab_layout);
        ViewPager2 viewPager2 = (ViewPager2) inflate.findViewById(R.id.viewpager);
        this.l = viewPager2;
        PhotoFlowToolbarView photoFlowToolbarView = (PhotoFlowToolbarView) inflate.findViewById(R.id.toolbar);
        this.m = photoFlowToolbarView;
        ProfileOnboardingBanner profileOnboardingBanner = (ProfileOnboardingBanner) inflate.findViewById(R.id.banner);
        this.o = profileOnboardingBanner;
        this.p = UserId.d;
        this.q = new bpn0(new f5x(this, 27));
        this.r = new Handler(Looper.getMainLooper());
        this.s = new p31(this, 16);
        HashSet hashSet = iah0.a;
        int i = 10;
        if (fnj.d(context)) {
            bwt0.f0(photoFlowToolbarView, cn70.b(2), cn70.b(10), 0, cn70.b(11), 4);
        }
        profileOnboardingBanner.setOnClose(new nly(this, 26));
        bwt0.i0(profileOnboardingBanner, new w620(this, 13));
        viewPager2.b(new f(this));
        n13.a(appBarLayout, new io60(this, i), new f880(this, 3));
    }

    @Override // xsna.too0
    public final void Ng() {
        f();
    }

    public final Rect a(Rect rect) {
        awt0.x(this.h, 0, rect.top, 0, 0, 13);
        rect.top = 0;
        return rect;
    }

    public final boolean a0() {
        kga0 b = b();
        if (b != null) {
            return b.a0();
        }
        return false;
    }

    public final kga0 b() {
        z1h0 H = this.c.getChildFragmentManager().H(InneractiveMediationDefs.GENDER_FEMALE + this.l.getCurrentItem());
        if (H instanceof kga0) {
            return (kga0) H;
        }
        return null;
    }

    public final void c() {
        this.r.removeCallbacks(this.s);
        com.google.android.material.tabs.c cVar = this.n;
        if (cVar != null) {
            cVar.b();
        }
    }

    public final void d(Bundle bundle) {
        int i = bundle.getInt("PHOTO_TAGS_COUNT", -1);
        int i2 = bundle.getInt("RECOGNITION_TAGS_COUNT", -1);
        String string = bundle.getString("USER_NAME_GEN");
        UserId userId = (UserId) bundle.getParcelable("uid");
        if (userId != null) {
            this.p = userId;
        }
        int i3 = bundle.getInt("tab", PhotosRootTab.PHOTO_FLOW.h());
        int i4 = ((s0e0) this.q.getValue()).a(this.p) ? R.string.photos_root_toolbar_title_self : R.string.photos_root_toolbar_title_other;
        PhotoFlowToolbarView photoFlowToolbarView = this.m;
        photoFlowToolbarView.setTitle(photoFlowToolbarView.getContext().getString(i4));
        photoFlowToolbarView.setTitleClickListener(new b9(this, 28));
        photoFlowToolbarView.P4(new rj4(this, 27));
        String string2 = photoFlowToolbarView.getContext().getString(R.string.retry_photo_flow_onboarding);
        ImageView imageView = photoFlowToolbarView.t;
        abg0 abg0Var = dhr0.t;
        imageView.setImageDrawable(abg0Var.b(R.drawable.vk_icon_help_circle_outline_28, R.attr.vk_ui_icon_tertiary));
        imageView.setContentDescription(string2);
        f4m.t(cn70.b(2) + bwt0.P(photoFlowToolbarView.getMenuButton()), photoFlowToolbarView.getMenuButton());
        photoFlowToolbarView.setMenuClickListener(new nb(this, 28));
        f();
        UserId userId2 = this.p;
        PhotosRootFragment photosRootFragment = this.c;
        jga0 jga0Var = new jga0(photosRootFragment, this.l, photosRootFragment.D, photosRootFragment.In().a, userId2, i, i2, string);
        ViewPager2 viewPager2 = this.l;
        viewPager2.setAdapter(jga0Var);
        if (i3 != viewPager2.getCurrentItem()) {
            viewPager2.e(i3, false);
        }
        g gVar = new g(this);
        VKTabLayout vKTabLayout = this.k;
        vKTabLayout.f(gVar);
        com.google.android.material.tabs.c cVar = new com.google.android.material.tabs.c(vKTabLayout, viewPager2, new z8(this, 23));
        this.n = cVar;
        cVar.a();
        h4x c = h4x.c(cn70.b(4), cn70.b(5), cn70.b(3), cn70.b(12));
        int color = this.b.getResources().getColor(R.color.vk_black_alpha8, null);
        float a = cn70.a() * 8.0f;
        a.C0123a c0123a = new a.C0123a();
        c0123a.c(a);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(c0123a.a());
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_background_modal)));
        materialShapeDrawable.setElevation(7.0f);
        materialShapeDrawable.setShadowColor(color);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        vKTabLayout.setSelectedTabIndicator(new InsetDrawable((Drawable) materialShapeDrawable, c.a, c.b, c.c, c.d));
        vKTabLayout.setSelectedTabIndicatorColor(0);
        int i5 = aor.i;
        vKTabLayout.setSelectedTabIndicator(new aor.a(vKTabLayout, vKTabLayout.getTabSelectedIndicator()));
    }

    public final void e(i iVar) {
        gm50.a.b(this, iVar.a, new owv(this, 24));
    }

    public final void f() {
        boolean M = dhr0.M();
        Context context = this.b;
        this.j.setBackground(M ? new ColorDrawable(e3m.f(R.attr.vk_ui_background, context)) : m33.a(R.drawable.gradient_background_light, context));
    }

    public final View getView() {
        return this.g;
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.f;
    }
}
