package com.vk.dzenarticle.impl.ui.view.ad;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.awt0;
import xsna.bwt0;
import xsna.cn70;
import xsna.lv50;
import xsna.s4e0;
import xsna.zu50;

/* compiled from: MiddleAdView.kt */
/* loaded from: classes18.dex */
public final class MiddleAdView extends BaseTopAdView {
    public static final /* synthetic */ int n = 0;
    public final ViewGroup e;
    public final VkText f;
    public final VkText g;
    public final VkButton h;
    public final MediaAdView i;
    public final IconAdView j;
    public final VkText k;
    public String l;
    public final a m;

    /* compiled from: MiddleAdView.kt */
    public final class a implements lv50 {
        public final View b;

        public a() {
            this.b = new View(MiddleAdView.this.getContext());
        }

        @Override // xsna.lv50
        public final View c() {
            return MiddleAdView.this.k;
        }

        @Override // xsna.lv50
        public final ViewGroup d() {
            return MiddleAdView.this.e;
        }

        @Override // xsna.lv50
        public final View e() {
            return MiddleAdView.this.k;
        }

        @Override // xsna.lv50
        public final View f() {
            return MiddleAdView.this.k;
        }

        @Override // xsna.lv50
        public final View g() {
            return MiddleAdView.this.h;
        }

        @Override // xsna.lv50
        public final View getDescriptionView() {
            return MiddleAdView.this.g;
        }

        @Override // xsna.lv50
        public final /* bridge */ /* synthetic */ IconAdView getIconView() {
            return null;
        }

        @Override // xsna.lv50
        public final View getTitleView() {
            return MiddleAdView.this.f;
        }

        @Override // xsna.lv50
        public final View h() {
            return this.b;
        }

        @Override // xsna.lv50
        public final /* bridge */ /* synthetic */ View i() {
            return null;
        }

        @Override // xsna.lv50
        public final s4e0 j0() {
            return null;
        }

        @Override // xsna.lv50
        public final MediaAdView o() {
            return MiddleAdView.this.i;
        }
    }

    public MiddleAdView(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zu50 nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.a();
        }
    }

    public MiddleAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public MiddleAdView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ MiddleAdView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public MiddleAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.m = new a();
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_middle_ad, (ViewGroup) this, true);
        this.e = (ViewGroup) bwt0.p(inflate, R.id.nativeads_ad_view, null, null, 6);
        this.f = (VkText) bwt0.p(inflate, R.id.nativeads_title, null, null, 6);
        this.g = (VkText) bwt0.p(inflate, R.id.nativeads_description, null, null, 6);
        this.h = (VkButton) bwt0.p(inflate, R.id.nativeads_call_to_action, null, null, 6);
        IconAdView iconAdView = (IconAdView) bwt0.p(inflate, R.id.nativeads_icon, null, null, 6);
        ImageView imageView = iconAdView.getImageView();
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        imageView.setScaleType(scaleType);
        this.j = iconAdView;
        MediaAdView mediaAdView = (MediaAdView) bwt0.p(inflate, R.id.nativeads_media_view, null, null, 6);
        mediaAdView.getImageView().setScaleType(scaleType);
        this.i = mediaAdView;
        VkText vkText = (VkText) bwt0.p(inflate, R.id.nativeads_advertising, null, null, 6);
        awt0.j(cn70.b(16), vkText);
        this.k = vkText;
    }
}
