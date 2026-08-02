package com.vk.catalog2.common.ui.mvp.holder.video;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.video.VideoCatalogId;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.picture.VkImage;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.awt0;
import xsna.b0u0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.dbj0;
import xsna.dhr0;
import xsna.e3m;
import xsna.f4m;
import xsna.f9s0;
import xsna.fbx0;
import xsna.fxc0;
import xsna.gib0;
import xsna.gwd0;
import xsna.gzs;
import xsna.hbj0;
import xsna.iah0;
import xsna.iut0;
import xsna.izs;
import xsna.k7l0;
import xsna.msy;
import xsna.mwm0;
import xsna.nz9;
import xsna.oj70;
import xsna.pwh0;
import xsna.qcy;
import xsna.qkd0;
import xsna.r0r0;
import xsna.rq7;
import xsna.s3q0;
import xsna.u080;
import xsna.u4a;
import xsna.v5n0;
import xsna.vgb0;
import xsna.vpj0;
import xsna.zh0;

/* compiled from: VideoCatalogHeaderBrandedVh.kt */
/* loaded from: classes16.dex */
public final class VideoCatalogHeaderBrandedVh implements VideoCatalogHeaderVh {
    public static final /* synthetic */ int v = 0;
    public final VideoCatalogId b;
    public final gzs<s3q0> c;
    public final izs<View, s3q0> d;
    public final gzs<s3q0> e;
    public final gzs<s3q0> f;
    public View g;
    public oj70 h;
    public final boolean i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final bpn0 n;
    public final bpn0 o;
    public final bpn0 p;
    public ImageView q;
    public View r;
    public ImageView s;
    public View t;
    public final fbx0 u;

    public VideoCatalogHeaderBrandedVh(u4a u4aVar, VideoCatalogId videoCatalogId, vgb0 vgb0Var, r0r0 r0r0Var, mwm0 mwm0Var, gzs gzsVar) {
        this.b = videoCatalogId;
        this.c = vgb0Var;
        this.d = r0r0Var;
        this.e = mwm0Var;
        this.f = gzsVar;
        this.i = u4aVar.b.c && fxc0.B().J().x0();
        gwd0 gwd0Var = new gwd0(13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, gwd0Var);
        this.k = msy.a(lazyThreadSafetyMode, new qkd0(this, 21));
        this.l = msy.a(lazyThreadSafetyMode, new hbj0(this, 19));
        this.m = msy.a(lazyThreadSafetyMode, new pwh0(this, 21));
        this.n = new bpn0(new v5n0(this, 12));
        this.o = new bpn0(new dbj0(this, 12));
        this.p = new bpn0(new vpj0(this, 14));
        this.u = new fbx0(videoCatalogId);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderVh
    public final void Jm(int i) {
        oj70 oj70Var = this.h;
        if (oj70Var != null) {
            oj70Var.a(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.g = null;
        this.s = null;
        this.u.b(null);
        if (((Boolean) this.j.getValue()).booleanValue()) {
            ((nz9) this.m.getValue()).getClass();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderVh
    public final void hide() {
        View view = this.g;
        if (view != null) {
            f4m.j(view);
        }
    }

    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ImageView imageView;
        boolean z = this.i;
        final View inflate = layoutInflater.inflate(z ? R.layout.catalog_video_header_branded_tablet : R.layout.catalog_video_header_branded, viewGroup, false);
        this.q = (ImageView) inflate.findViewById(R.id.logo);
        this.r = inflate.findViewById(R.id.first_button);
        this.s = (ImageView) inflate.findViewById(R.id.search_button);
        bpn0 bpn0Var = this.p;
        if (((Boolean) bpn0Var.getValue()).booleanValue()) {
            ImageView imageView2 = this.s;
            if (imageView2 != null) {
                imageView2.clearColorFilter();
            }
            if (dhr0.M()) {
                ImageView imageView3 = this.s;
                if (imageView3 != null) {
                    imageView3.setImageResource(R.drawable.vk_video_kids_search_dark_28h);
                }
            } else {
                ImageView imageView4 = this.s;
                if (imageView4 != null) {
                    imageView4.setImageResource(R.drawable.vk_video_kids_search_light_28h);
                }
            }
        } else {
            ImageView imageView5 = this.s;
            if (imageView5 != null) {
                imageView5.setImageTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_accent_themed, imageView5.getContext())));
            }
            ImageView imageView6 = this.s;
            if (imageView6 != null) {
                imageView6.setImageResource(R.drawable.vk_icon_search_outline_28);
            }
        }
        ImageView imageView7 = this.q;
        if (imageView7 == null) {
            imageView7 = null;
        }
        imageView7.setImageResource(((Boolean) bpn0Var.getValue()).booleanValue() ? R.drawable.vk_video_kids_logo_video_36h : R.drawable.vk_icon_logo_vk_video_color_28);
        u080 u080Var = new u080() { // from class: xsna.e9s0
            @Override // xsna.u080
            public final bqx0 b(View view, bqx0 bqx0Var) {
                f4m.k(wqx0.a(bqx0Var) + ((int) inflate.getResources().getDimension(R.dimen.catalog_video_header_height)), view);
                return bqx0Var;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(inflate, u080Var);
        VkImage vkImage = (VkImage) inflate.findViewById(R.id.background_image);
        Drawable drawable = vkImage.getContext().getDrawable(R.drawable.top_bar_kids_background);
        if (drawable != null) {
            vkImage.setImageDrawable(drawable);
            vkImage.setBackgroundResource(R.drawable.top_bar_kids_gradient);
            vkImage.setScaleType(ImageView.ScaleType.MATRIX);
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = vkImage.getMeasuredWidth();
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            ref$IntRef2.element = vkImage.getMeasuredHeight();
            f4m.a(vkImage, new f9s0(vkImage, ref$IntRef, ref$IntRef2, vkImage, drawable));
            awt0.u(vkImage, ((Boolean) bpn0Var.getValue()).booleanValue());
        }
        View findViewById = inflate.findViewById(R.id.settings_button);
        this.t = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(this.b == VideoCatalogId.LIBRARY ? 0 : 8);
        }
        View view = this.t;
        if (view != null) {
            bwt0.i0(view, new gib0(this, 21));
        }
        if (((Boolean) this.j.getValue()).booleanValue()) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.cast_button);
            ((nz9) this.m.getValue()).getClass();
            bwt0.i0(lottieAnimationView, new k7l0(this, 16));
        }
        if (z) {
            View view2 = this.t;
            if (view2 == null || view2.getVisibility() != 0) {
                ImageView imageView8 = this.s;
                if (imageView8 != null) {
                    f4m.w(iah0.a(32), imageView8);
                }
            } else {
                View view3 = this.t;
                if (view3 != null) {
                    f4m.w(iah0.a(32), view3);
                }
            }
        }
        ImageView imageView9 = this.s;
        if (imageView9 != null) {
            imageView9.setOnClickListener(new zh0(this, 7));
        }
        View findViewById2 = inflate.findViewById(R.id.add_button);
        if (findViewById2 != null) {
            findViewById2.setVisibility(this.d != null ? 0 : 8);
        }
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new rq7(1, this, inflate));
        }
        qcy<Object>[] qcyVarArr = bwt0.a;
        f4m.n((int) inflate.getResources().getDimension(R.dimen.catalog_video_header_height_redesign), inflate);
        gzs<s3q0> gzsVar = this.e;
        if (gzsVar != null) {
            oj70 oj70Var = new oj70(inflate, gzsVar);
            this.h = oj70Var;
            View findViewById3 = inflate.findViewById(R.id.notifications_container);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            View findViewById4 = inflate.findViewById(R.id.add_button);
            if (findViewById4 != null) {
                f4m.j(findViewById4);
            }
            inflate = oj70Var.b();
        }
        if (fxc0.B().J().C() && (imageView = this.s) != null) {
            this.u.a(imageView);
        }
        this.g = inflate;
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderVh
    public final RectF p1() {
        return null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderVh
    public final void show() {
        View view = this.g;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderVh
    public final void A0() {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
    }
}
