package com.vk.catalog2.common.ui.holders.ads;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UiBlockAdBanner;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.ads.AdBannerStyle;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.ads.AdBlockBadgeView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.ai0;
import xsna.bi0;
import xsna.ci0;
import xsna.f4m;
import xsna.lv50;
import xsna.m4;
import xsna.msy;
import xsna.qj80;
import xsna.s4e0;
import xsna.tc0;
import xsna.zu50;

/* compiled from: AdShowCaseBannerVh.kt */
/* loaded from: classes16.dex */
public final class AdShowCaseBannerVh implements CatalogViewHolder {
    public final tc0 b;
    public VKImageView c;
    public VkImageSimple d;
    public VkText e;
    public VkContentBadge f;
    public VkContentBadge g;
    public AdBlockBadgeView h;
    public VkAvatar i;
    public VkText j;
    public VkButton k;
    public ImageView l;
    public LinearLayout m;
    public ConstraintLayout n;
    public Guideline o;
    public zu50 q;
    public final Object p = msy.a(LazyThreadSafetyMode.NONE, new m4(this, 2));
    public final ai0 r = new ai0(this, 0);

    /* compiled from: AdShowCaseBannerVh.kt */
    public final class a implements zu50.b {
        public a() {
        }

        @Override // xsna.zu50.b
        public final boolean e() {
            return true;
        }

        @Override // xsna.zu50.b
        public final void g(zu50 zu50Var) {
            zu50 zu50Var2 = AdShowCaseBannerVh.this.q;
            if (zu50Var2 != null) {
                zu50Var2.a();
            }
        }

        @Override // xsna.zu50.b
        public final void h(zu50 zu50Var) {
            AdShowCaseBannerVh.this.b.a();
        }
    }

    /* compiled from: AdShowCaseBannerVh.kt */
    public final class b implements lv50 {
        public final IconAdView b;
        public final MediaAdView c;

        public b() {
            ConstraintLayout constraintLayout = AdShowCaseBannerVh.this.n;
            this.b = new IconAdView((constraintLayout == null ? null : constraintLayout).getContext(), null);
            ConstraintLayout constraintLayout2 = AdShowCaseBannerVh.this.n;
            this.c = new MediaAdView((constraintLayout2 != null ? constraintLayout2 : null).getContext());
        }

        @Override // xsna.lv50
        public final View c() {
            AdBlockBadgeView adBlockBadgeView = AdShowCaseBannerVh.this.h;
            if (adBlockBadgeView == null) {
                return null;
            }
            return adBlockBadgeView;
        }

        @Override // xsna.lv50
        public final ViewGroup d() {
            ConstraintLayout constraintLayout = AdShowCaseBannerVh.this.n;
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
            VkImageSimple vkImageSimple = AdShowCaseBannerVh.this.d;
            if (vkImageSimple == null) {
                return null;
            }
            return vkImageSimple;
        }

        @Override // xsna.lv50
        public final View g() {
            VkButton vkButton = AdShowCaseBannerVh.this.k;
            if (vkButton == null) {
                return null;
            }
            return vkButton;
        }

        @Override // xsna.lv50
        public final View getDescriptionView() {
            VkText vkText = AdShowCaseBannerVh.this.j;
            if (vkText == null) {
                return null;
            }
            return vkText;
        }

        @Override // xsna.lv50
        public final IconAdView getIconView() {
            return this.b;
        }

        @Override // xsna.lv50
        public final View getTitleView() {
            VkText vkText = AdShowCaseBannerVh.this.e;
            if (vkText == null) {
                return null;
            }
            return vkText;
        }

        @Override // xsna.lv50
        public final View h() {
            return this.b;
        }

        @Override // xsna.lv50
        public final View i() {
            AdBlockBadgeView adBlockBadgeView = AdShowCaseBannerVh.this.h;
            if (adBlockBadgeView == null) {
                return null;
            }
            return adBlockBadgeView;
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

    /* compiled from: AdShowCaseBannerVh.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdBannerStyle.values().length];
            try {
                iArr[AdBannerStyle.BOTTOM_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdBannerStyle.BOTTOM_DOTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: View.kt */
    public static final class d implements Runnable {
        public final /* synthetic */ View b;
        public final /* synthetic */ AdShowCaseBannerVh c;

        public d(VkText vkText, AdShowCaseBannerVh adShowCaseBannerVh) {
            this.b = vkText;
            this.c = adShowCaseBannerVh;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AdShowCaseBannerVh adShowCaseBannerVh = this.c;
            VkText vkText = adShowCaseBannerVh.j;
            if (vkText == null) {
                vkText = null;
            }
            VkText vkText2 = adShowCaseBannerVh.e;
            vkText.setMaxLines((vkText2 != null ? vkText2 : null).getLineCount() <= 1 ? 2 : 1);
        }
    }

    public AdShowCaseBannerVh(tc0 tc0Var) {
        this.b = tc0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        zu50 zu50Var = this.q;
        if (zu50Var != null) {
            zu50Var.a();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UiBlockAdBanner uiBlockAdBanner = uIBlock instanceof UiBlockAdBanner ? (UiBlockAdBanner) uIBlock : null;
        if (uiBlockAdBanner == null) {
            return;
        }
        VKImageView vKImageView = this.c;
        if (vKImageView == null) {
            vKImageView = null;
        }
        vKImageView.clear();
        VkAvatar vkAvatar = this.i;
        if (vkAvatar == null) {
            vkAvatar = null;
        }
        vkAvatar.clear();
        VkText vkText = this.e;
        if (vkText == null) {
            vkText = null;
        }
        vkText.setVisibility(4);
        VkText vkText2 = this.j;
        if (vkText2 == null) {
            vkText2 = null;
        }
        vkText2.setVisibility(4);
        AdBlockBadgeView adBlockBadgeView = this.h;
        if (adBlockBadgeView == null) {
            adBlockBadgeView = null;
        }
        f4m.j(adBlockBadgeView);
        ImageView imageView = this.l;
        if (imageView == null) {
            imageView = null;
        }
        f4m.j(imageView);
        VkContentBadge vkContentBadge = this.g;
        if (vkContentBadge == null) {
            vkContentBadge = null;
        }
        f4m.j(vkContentBadge);
        VkImageSimple vkImageSimple = this.d;
        if (vkImageSimple == null) {
            vkImageSimple = null;
        }
        f4m.j(vkImageSimple);
        VkButton vkButton = this.k;
        if (vkButton == null) {
            vkButton = null;
        }
        f4m.j(vkButton);
        VKImageView vKImageView2 = this.c;
        if (vKImageView2 == null) {
            vKImageView2 = null;
        }
        vKImageView2.setPlaceholderImage(R.drawable.default_placeholder);
        VkAvatar vkAvatar2 = this.i;
        if (vkAvatar2 == null) {
            vkAvatar2 = null;
        }
        vkAvatar2.setPlaceholderImage(R.drawable.user_placeholder);
        String str = uiBlockAdBanner.A;
        String str2 = ((UiBlockAdBanner) uIBlock).y;
        bi0 bi0Var = new bi0(0, this, uiBlockAdBanner);
        tc0 tc0Var = this.b;
        tc0Var.e = str2;
        tc0Var.f = bi0Var;
        tc0Var.d.f(str);
        VkContentBadge vkContentBadge2 = this.g;
        (vkContentBadge2 != null ? vkContentBadge2 : null).setOnClickListener(new ci0(this, 0));
    }

    public final void a() {
        LinearLayout linearLayout = this.m;
        if (linearLayout == null) {
            linearLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar != null) {
            bVar.l = -1;
            ImageView imageView = this.l;
            if (imageView == null) {
                imageView = null;
            }
            bVar.u = imageView.getId();
            LinearLayout linearLayout2 = this.m;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            linearLayout2.setLayoutParams(bVar);
        }
        VkText vkText = this.e;
        if (vkText == null) {
            vkText = null;
        }
        vkText.setMaxLines(2);
        VkText vkText2 = this.e;
        if (vkText2 == null) {
            vkText2 = null;
        }
        vkText2.setVisibility(0);
        VkText vkText3 = this.e;
        if (vkText3 == null) {
            vkText3 = null;
        }
        qj80.a(vkText3, new d(vkText3, this));
        VkText vkText4 = this.j;
        if (vkText4 == null) {
            vkText4 = null;
        }
        vkText4.setVisibility(0);
        VkContentBadge vkContentBadge = this.f;
        if (vkContentBadge == null) {
            vkContentBadge = null;
        }
        f4m.j(vkContentBadge);
        VkButton vkButton = this.k;
        if (vkButton == null) {
            vkButton = null;
        }
        f4m.j(vkButton);
        ImageView imageView2 = this.l;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setVisibility(0);
        VkContentBadge vkContentBadge2 = this.g;
        if (vkContentBadge2 == null) {
            vkContentBadge2 = null;
        }
        vkContentBadge2.setVisibility(0);
        ImageView imageView3 = this.l;
        (imageView3 != null ? imageView3 : null).setOnClickListener(this.r);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_ad_banner, viewGroup, false);
        this.n = (ConstraintLayout) inflate.findViewById(R.id.container);
        this.c = (VKImageView) inflate.findViewById(R.id.ad_banner_image);
        this.d = (VkImageSimple) inflate.findViewById(R.id.ad_disclaimer);
        this.e = (VkText) inflate.findViewById(R.id.ad_title);
        this.f = (VkContentBadge) inflate.findViewById(R.id.ad_dots);
        this.g = (VkContentBadge) inflate.findViewById(R.id.close_ad);
        this.h = (AdBlockBadgeView) inflate.findViewById(R.id.ad_age);
        this.i = (VkAvatar) inflate.findViewById(R.id.avatar);
        this.j = (VkText) inflate.findViewById(R.id.ad_subtitle);
        this.k = (VkButton) inflate.findViewById(R.id.action_button);
        this.l = (ImageView) inflate.findViewById(R.id.action_dots);
        this.m = (LinearLayout) inflate.findViewById(R.id.text_container);
        this.o = (Guideline) inflate.findViewById(R.id.guideline_disclaimer);
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

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
