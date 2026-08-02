package com.vk.catalog2.common.ui.holders.ads;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UiBlockAdBanner;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.imageloader.view.VKImageView;
import com.vk.movika.sdk.base.observable.e;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.lv50;
import xsna.msy;
import xsna.s4e0;
import xsna.tc0;
import xsna.yg;
import xsna.zh0;
import xsna.zu50;

/* compiled from: AdSearchBannerVh.kt */
/* loaded from: classes16.dex */
public final class AdSearchBannerVh implements CatalogViewHolder {
    public final tc0 b;
    public FrameLayout c;
    public ConstraintLayout d;
    public VkSkeleton e;
    public TextView f;
    public TextView g;
    public TextView h;
    public VKImageView i;
    public View j;
    public Guideline k;
    public ImageView l;
    public zu50 n;
    public final Object m = msy.a(LazyThreadSafetyMode.NONE, new yg(this, 1));
    public final zh0 o = new zh0(this, 0);

    /* compiled from: AdSearchBannerVh.kt */
    public final class b implements lv50 {
        public final IconAdView b;
        public final MediaAdView c;

        public b() {
            ConstraintLayout constraintLayout = AdSearchBannerVh.this.d;
            this.b = new IconAdView((constraintLayout == null ? null : constraintLayout).getContext(), null);
            ConstraintLayout constraintLayout2 = AdSearchBannerVh.this.d;
            this.c = new MediaAdView((constraintLayout2 != null ? constraintLayout2 : null).getContext());
        }

        @Override // xsna.lv50
        public final View c() {
            return this.b;
        }

        @Override // xsna.lv50
        public final ViewGroup d() {
            ConstraintLayout constraintLayout = AdSearchBannerVh.this.d;
            if (constraintLayout == null) {
                return null;
            }
            return constraintLayout;
        }

        @Override // xsna.lv50
        public final View e() {
            return null;
        }

        @Override // xsna.lv50
        public final View f() {
            return this.b;
        }

        @Override // xsna.lv50
        public final View g() {
            return this.b;
        }

        @Override // xsna.lv50
        public final View getDescriptionView() {
            TextView textView = AdSearchBannerVh.this.g;
            if (textView == null) {
                return null;
            }
            return textView;
        }

        @Override // xsna.lv50
        public final IconAdView getIconView() {
            return this.b;
        }

        @Override // xsna.lv50
        public final View getTitleView() {
            TextView textView = AdSearchBannerVh.this.f;
            if (textView == null) {
                return null;
            }
            return textView;
        }

        @Override // xsna.lv50
        public final View h() {
            return this.b;
        }

        @Override // xsna.lv50
        public final View i() {
            TextView textView = AdSearchBannerVh.this.f;
            if (textView == null) {
                return null;
            }
            return textView;
        }

        @Override // xsna.lv50
        public final s4e0 j0() {
            return null;
        }

        @Override // xsna.lv50
        public final MediaAdView o() {
            return this.c;
        }
    }

    public AdSearchBannerVh(tc0 tc0Var) {
        this.b = tc0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        zu50 zu50Var = this.n;
        if (zu50Var != null) {
            zu50Var.a();
        }
        this.n = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UiBlockAdBanner uiBlockAdBanner = uIBlock instanceof UiBlockAdBanner ? (UiBlockAdBanner) uIBlock : null;
        if (uiBlockAdBanner == null) {
            return;
        }
        VKImageView vKImageView = this.i;
        (vKImageView != null ? vKImageView : null).setPlaceholderImage(R.drawable.default_placeholder);
        String str = uiBlockAdBanner.A;
        String str2 = ((UiBlockAdBanner) uIBlock).y;
        e eVar = new e(this, 1);
        tc0 tc0Var = this.b;
        tc0Var.e = str2;
        tc0Var.f = eVar;
        tc0Var.d.f(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_ad_banner_medium, viewGroup, false);
        this.c = (FrameLayout) inflate.findViewById(R.id.root);
        this.d = (ConstraintLayout) inflate.findViewById(R.id.container);
        this.e = (VkSkeleton) inflate.findViewById(R.id.skeleton);
        this.f = (TextView) inflate.findViewById(R.id.title);
        this.g = (TextView) inflate.findViewById(R.id.subtitle);
        this.h = (TextView) inflate.findViewById(R.id.label);
        this.i = (VKImageView) inflate.findViewById(R.id.media_view);
        this.j = inflate.findViewById(R.id.choices_button);
        this.k = (Guideline) inflate.findViewById(R.id.guideline_disclaimer);
        this.l = (ImageView) inflate.findViewById(R.id.disclaimer);
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    /* compiled from: AdSearchBannerVh.kt */
    public final class a implements zu50.b {
        public a() {
        }

        @Override // xsna.zu50.b
        public final boolean e() {
            return false;
        }

        @Override // xsna.zu50.b
        public final void g(zu50 zu50Var) {
            zu50Var.a();
            AdSearchBannerVh.this.b.a();
        }

        @Override // xsna.zu50.b
        public final void h(zu50 zu50Var) {
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
