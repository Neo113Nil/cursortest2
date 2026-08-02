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
import java.util.WeakHashMap;
import xsna.awt0;
import xsna.b0u0;
import xsna.bwt0;
import xsna.cn70;
import xsna.iut0;
import xsna.lv50;
import xsna.s4e0;
import xsna.zu50;

/* compiled from: TopAdView.kt */
/* loaded from: classes18.dex */
public final class TopAdView extends BaseTopAdView {
    public static final /* synthetic */ int l = 0;
    public final ViewGroup e;
    public final VkText f;
    public final VkText g;
    public final VkButton h;
    public final IconAdView i;
    public final VkText j;
    public final a k;

    /* compiled from: TopAdView.kt */
    public final class a implements lv50 {
        public final View b;

        public a() {
            this.b = new View(TopAdView.this.getContext());
        }

        @Override // xsna.lv50
        public final View c() {
            return TopAdView.this.j;
        }

        @Override // xsna.lv50
        public final ViewGroup d() {
            return TopAdView.this.e;
        }

        @Override // xsna.lv50
        public final View e() {
            return TopAdView.this.j;
        }

        @Override // xsna.lv50
        public final View f() {
            return TopAdView.this.j;
        }

        @Override // xsna.lv50
        public final View g() {
            return TopAdView.this.h;
        }

        @Override // xsna.lv50
        public final View getDescriptionView() {
            return TopAdView.this.g;
        }

        @Override // xsna.lv50
        public final IconAdView getIconView() {
            return TopAdView.this.i;
        }

        @Override // xsna.lv50
        public final View getTitleView() {
            return TopAdView.this.f;
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
            return null;
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class b implements View.OnLayoutChangeListener {
        public final /* synthetic */ VkText b;

        public b(VkText vkText) {
            this.b = vkText;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            this.b.setTranslationX((r1.getMeasuredWidth() / 2.0f) - (r1.getMeasuredHeight() / 2.0f));
        }
    }

    public TopAdView(Context context) {
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

    public TopAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public TopAdView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ TopAdView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public TopAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.k = new a();
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_top_ad, (ViewGroup) this, true);
        this.e = (ViewGroup) bwt0.p(inflate, R.id.nativeads_ad_view, null, null, 6);
        this.f = (VkText) bwt0.p(inflate, R.id.nativeads_title, null, null, 6);
        this.g = (VkText) bwt0.p(inflate, R.id.nativeads_description, null, null, 6);
        this.h = (VkButton) bwt0.p(inflate, R.id.nativeads_call_to_action, null, null, 6);
        IconAdView iconAdView = (IconAdView) bwt0.p(inflate, R.id.nativeads_icon, null, null, 6);
        bwt0.d(iconAdView, cn70.a() * 8.0f, (r4 & 2) != 0, (r4 & 4) != 0);
        iconAdView.getImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.i = iconAdView;
        VkText vkText = (VkText) bwt0.p(inflate, R.id.nativeads_advertising, null, null, 6);
        vkText.setRotation(-90.0f);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (vkText.isLaidOut()) {
            vkText.setTranslationX((vkText.getMeasuredWidth() / 2.0f) - (vkText.getMeasuredHeight() / 2.0f));
        } else {
            vkText.addOnLayoutChangeListener(new b(vkText));
        }
        awt0.j(((int) vkText.getResources().getDimension(R.dimen.top_ad_banner_disclaimer_width)) * 2, vkText);
        this.j = vkText;
    }
}
