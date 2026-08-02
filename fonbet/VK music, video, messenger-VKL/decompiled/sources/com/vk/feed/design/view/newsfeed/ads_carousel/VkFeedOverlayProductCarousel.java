package com.vk.feed.design.view.newsfeed.ads_carousel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.feed.design.view.newsfeed.overlay.VkOverlayCircleButton;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.b04;
import xsna.bwt0;
import xsna.d3m;
import xsna.ef2;
import xsna.eko;
import xsna.enj;
import xsna.f4m;
import xsna.gbt0;
import xsna.gko;
import xsna.gzs;
import xsna.izs;
import xsna.j1;
import xsna.m5o0;
import xsna.msy;
import xsna.n93;
import xsna.o93;
import xsna.qah0;
import xsna.s3q0;
import xsna.shy;
import xsna.tlo0;
import xsna.tq;
import xsna.xb60;
import xsna.xuu0;
import xsna.yyl0;

/* compiled from: VkFeedOverlayProductCarousel.kt */
/* loaded from: classes18.dex */
public final class VkFeedOverlayProductCarousel extends ConstraintLayout implements xuu0, xb60 {
    public static final /* synthetic */ int A = 0;
    public final Object t;
    public final Object u;
    public final Object v;
    public final ArrayList w;
    public xuu0.a x;
    public izs<? super Integer, s3q0> y;
    public final PathInterpolator z;

    /* compiled from: VkFeedOverlayProductCarousel.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final VkOverlayCircleButton.ColorPalette d;

        public a(int i, int i2, int i3, VkOverlayCircleButton.ColorPalette colorPalette) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = colorPalette;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            return "ProductControlAppearance(iconRes=" + this.a + ", colorId=" + this.b + ", contentDescription=" + this.c + ", backgroundColorPalette=" + this.d + ')';
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class b implements gzs<s3q0> {
        public final /* synthetic */ Ref$IntRef c;
        public final /* synthetic */ Ref$IntRef d;
        public final /* synthetic */ VkFeedOverlayProductCarousel e;

        public b(Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, VkFeedOverlayProductCarousel vkFeedOverlayProductCarousel) {
            this.c = ref$IntRef;
            this.d = ref$IntRef2;
            this.e = vkFeedOverlayProductCarousel;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            VkFeedOverlayProductCarousel vkFeedOverlayProductCarousel = VkFeedOverlayProductCarousel.this;
            int measuredWidth = vkFeedOverlayProductCarousel.getMeasuredWidth();
            int measuredHeight = vkFeedOverlayProductCarousel.getMeasuredHeight();
            Ref$IntRef ref$IntRef = this.c;
            int i = ref$IntRef.element;
            Ref$IntRef ref$IntRef2 = this.d;
            if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
                ref$IntRef.element = measuredWidth;
                ref$IntRef2.element = measuredHeight;
                VkFeedOverlayProductCarousel vkFeedOverlayProductCarousel2 = this.e;
                if (bwt0.K(vkFeedOverlayProductCarousel2.getProductContainer())) {
                    izs<? super Integer, s3q0> izsVar = vkFeedOverlayProductCarousel2.y;
                    if (izsVar != null) {
                        izsVar.invoke(Integer.valueOf(measuredHeight));
                    }
                } else {
                    izs<? super Integer, s3q0> izsVar2 = vkFeedOverlayProductCarousel2.y;
                    if (izsVar2 != null) {
                        izsVar2.invoke(0);
                    }
                }
            }
            return s3q0.a;
        }
    }

    public VkFeedOverlayProductCarousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        gbt0 gbt0Var = new gbt0(this, 5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = msy.a(lazyThreadSafetyMode, gbt0Var);
        this.u = msy.a(lazyThreadSafetyMode, new m5o0(this, 14));
        this.v = msy.a(lazyThreadSafetyMode, new qah0(this, 25));
        this.w = new ArrayList();
        this.z = new PathInterpolator(0.2f, 0.8f, 0.2f, 1.0f);
        LayoutInflater.from(getContext()).inflate(R.layout.feed_overlay_product_carousel, (ViewGroup) this, true);
        bwt0.i0(getProductControl(), new yyl0(this, 19));
        VkOverlayCircleButton soundControl = getSoundControl();
        gko gkoVar = new gko(R.drawable.vk_icon_volume_16);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        VkOverlayCircleButton.a(soundControl, gkoVar, null, VkOverlayCircleButton.ColorPalette.Transparent, null, 20);
        setProductControlSelected(true);
        getProductContainer().setVisibility(4);
    }

    public static void P4(VkFeedOverlayProductCarousel vkFeedOverlayProductCarousel) {
        bwt0.p0(vkFeedOverlayProductCarousel.getProductContainer(), true);
        FrameLayout productContainer = vkFeedOverlayProductCarousel.getProductContainer();
        productContainer.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        productContainer.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        productContainer.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        productContainer.setPivotY(productContainer.getMeasuredHeight());
    }

    public static void Q4(VkFeedOverlayProductCarousel vkFeedOverlayProductCarousel) {
        bwt0.p0(vkFeedOverlayProductCarousel.getProductContainer(), true);
        FrameLayout productContainer = vkFeedOverlayProductCarousel.getProductContainer();
        productContainer.setScaleX(1.0f);
        productContainer.setScaleY(1.0f);
        productContainer.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        productContainer.setPivotY(productContainer.getMeasuredHeight());
    }

    public static void T4(VkFeedOverlayProductCarousel vkFeedOverlayProductCarousel) {
        bwt0.p0(vkFeedOverlayProductCarousel.getProductContainer(), false);
        FrameLayout productContainer = vkFeedOverlayProductCarousel.getProductContainer();
        d3m.b(productContainer, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        productContainer.setScaleX(1.0f);
        productContainer.setScaleY(1.0f);
        productContainer.setPivotX(productContainer.getWidth() / 2.0f);
        productContainer.setPivotY(productContainer.getHeight() / 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final FrameLayout getProductContainer() {
        return (FrameLayout) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkOverlayCircleButton getProductControl() {
        return (VkOverlayCircleButton) this.u.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkOverlayCircleButton getSoundControl() {
        return (VkOverlayCircleButton) this.v.getValue();
    }

    private final void setProductControlSelected(boolean z) {
        getProductControl().setSelected(z);
        a aVar = getProductControl().isSelected() ? new a(R.drawable.vk_icon_market_12, R.color.vk_gray_800, R.string.accessibility_carousel_product_hide_items_control, VkOverlayCircleButton.ColorPalette.Transparent) : new a(R.drawable.vk_icon_market_slash_12, R.color.vk_white, R.string.accessibility_carousel_show_items_control, VkOverlayCircleButton.ColorPalette.Transparent);
        VkOverlayCircleButton.a(getProductControl(), new eko(enj.d(aVar.a, aVar.b, getContext())), tq.h(tlo0.Companion, aVar.c), aVar.d, null, 18);
    }

    @Override // xsna.xb60
    public final void G(boolean z) {
        if (z) {
            d3m.c(this, (r15 & 1) != 0 ? 300L : 250L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            d3m.e(this, (r15 & 1) != 0 ? 300L : 250L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        }
    }

    @Override // xsna.xuu0
    public final void N(j1 j1Var) {
        this.w.add(j1Var);
    }

    public final void V4(boolean z) {
        boolean isSelected = getProductControl().isSelected();
        setProductControlSelected(!isSelected);
        PathInterpolator pathInterpolator = this.z;
        if (isSelected) {
            getProductContainer().animate().withStartAction(new ef2(this, 18)).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(pathInterpolator).setDuration(250L).withEndAction(new n93(this, 9));
            izs<? super Integer, s3q0> izsVar = this.y;
            if (izsVar != null) {
                izsVar.invoke(Integer.valueOf(getMeasuredHeight()));
            }
        } else {
            getProductContainer().animate().withStartAction(new o93(this, 26)).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(250L).setInterpolator(pathInterpolator).withEndAction(new b04(this, 18));
            izs<? super Integer, s3q0> izsVar2 = this.y;
            if (izsVar2 != null) {
                izsVar2.invoke(0);
            }
        }
        if (isSelected) {
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                ((gzs) it.next()).invoke();
            }
        } else {
            izs<? super Integer, s3q0> izsVar3 = this.y;
            if (izsVar3 != null) {
                izsVar3.invoke(0);
            }
        }
        xuu0.a aVar = this.x;
        if (aVar != null) {
            aVar.a(isSelected, z);
        }
    }

    @Override // xsna.xuu0
    public final void a1(boolean z, boolean z2) {
        if (z == bwt0.K(getProductContainer())) {
            return;
        }
        V4(z2);
    }

    @Override // xsna.xuu0
    public final boolean b4() {
        return bwt0.K(getProductContainer());
    }

    @Override // xsna.xb60
    public final void l4() {
        setProductControlSelected(true);
        getProductContainer().setVisibility(4);
    }

    @Override // xsna.xuu0
    public void setOnCarouselHeightListener(izs<? super Integer, s3q0> izsVar) {
        this.y = izsVar;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = getMeasuredHeight();
        f4m.a(this, new b(ref$IntRef, ref$IntRef2, this));
    }

    @Override // xsna.xuu0
    public void setOnClickListener(xuu0.a aVar) {
        this.x = aVar;
    }

    @Override // xsna.xuu0
    public void setupBlurContent(VkBlurContentView vkBlurContentView) {
        getProductControl().setupBlurContent(vkBlurContentView);
        getSoundControl().setupBlurContent(vkBlurContentView);
    }

    @Override // xsna.xuu0
    public final void x3(View view, boolean z, boolean z2) {
        if (view != null && getProductContainer().indexOfChild(view) == -1) {
            getProductContainer().addView(view);
        }
        VkOverlayCircleButton.a(getSoundControl(), null, null, null, Boolean.valueOf(!z2), 15);
        setProductControlSelected(true);
        getProductContainer().setVisibility(4);
        if (z) {
            d3m.c(getProductControl(), (r15 & 1) != 0 ? 300L : 250L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        f4m.j(getProductControl());
        f4m.j(getProductContainer());
        izs<? super Integer, s3q0> izsVar = this.y;
        if (izsVar != null) {
            izsVar.invoke(0);
        }
    }
}
