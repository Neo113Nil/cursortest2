package com.vk.catalog2.common.ui.mvp.holder.video;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderDebrandedVh;
import com.vk.catalog2.video.VideoCatalogId;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.awt0;
import xsna.bwt0;
import xsna.f4m;
import xsna.fbx0;
import xsna.fxc0;
import xsna.fyd0;
import xsna.ggb0;
import xsna.gzs;
import xsna.ia90;
import xsna.izs;
import xsna.mga0;
import xsna.msy;
import xsna.mwm0;
import xsna.o25;
import xsna.oa6;
import xsna.ofc0;
import xsna.oj70;
import xsna.qcy;
import xsna.r0r0;
import xsna.r8f0;
import xsna.rrn0;
import xsna.s3q0;
import xsna.vgb0;
import xsna.wug0;
import xsna.xim0;
import xsna.yqd0;

/* compiled from: VideoCatalogHeaderDebrandedVh.kt */
/* loaded from: classes16.dex */
public final class VideoCatalogHeaderDebrandedVh implements VideoCatalogHeaderVh {
    public static final /* synthetic */ int x = 0;
    public final VideoCatalogId b;
    public final gzs<s3q0> c;
    public final izs<View, s3q0> d;
    public final gzs<s3q0> e;
    public final boolean f;
    public final gzs<Boolean> g;
    public final gzs<s3q0> h;
    public final gzs<s3q0> i;
    public final gzs<s3q0> j;
    public View k;
    public VKImageView l;
    public ImageView m;
    public LottieAnimationView n;
    public View o;
    public View p;
    public View q;
    public View r;
    public oj70 s;
    public final fbx0 t;
    public final Object u;
    public final Object v;
    public final Object w;

    public VideoCatalogHeaderDebrandedVh(VideoCatalogId videoCatalogId, vgb0 vgb0Var, r0r0 r0r0Var, gzs gzsVar, boolean z, gzs gzsVar2, mwm0 mwm0Var, fyd0 fyd0Var, yqd0 yqd0Var) {
        this.b = videoCatalogId;
        this.c = vgb0Var;
        this.d = r0r0Var;
        this.e = gzsVar;
        this.f = z;
        this.g = gzsVar2;
        this.h = mwm0Var;
        this.i = fyd0Var;
        this.j = yqd0Var;
        this.t = new fbx0(videoCatalogId);
        ia90 ia90Var = new ia90(13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.u = msy.a(lazyThreadSafetyMode, ia90Var);
        this.v = msy.a(lazyThreadSafetyMode, new ofc0(this, 21));
        this.w = msy.a(lazyThreadSafetyMode, new rrn0(this, 12));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderVh
    public final void A0() {
        a();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderVh
    public final void Jm(int i) {
        oj70 oj70Var = this.s;
        if (oj70Var != null) {
            oj70Var.a(i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.k = null;
        this.l = null;
        this.p = null;
        this.q = null;
        this.t.b(null);
        if (((Boolean) this.u.getValue()).booleanValue()) {
            this.n = null;
        }
    }

    public final void a() {
        VKImageView vKImageView = this.l;
        if (vKImageView == null) {
            return;
        }
        if (!this.g.invoke().booleanValue()) {
            f4m.j(vKImageView);
            ImageView imageView = this.m;
            if (imageView != null) {
                awt0.u(imageView, this.f);
                return;
            }
            return;
        }
        ImageView imageView2 = this.m;
        if (imageView2 != null) {
            f4m.j(imageView2);
        }
        vKImageView.setVisibility(0);
        vKImageView.load(o25.a().o().c);
        bwt0.i0(vKImageView, new xim0(this, 6));
        vKImageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.g9s0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                gzs<s3q0> gzsVar = VideoCatalogHeaderDebrandedVh.this.j;
                if (gzsVar == null) {
                    return true;
                }
                gzsVar.invoke();
                return true;
            }
        });
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderVh
    public final void hide() {
        View view = this.k;
        if (view != null) {
            f4m.j(view);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        LottieAnimationView lottieAnimationView;
        View inflate = layoutInflater.inflate(R.layout.catalog_video_header_debranded, viewGroup, false);
        this.l = (VKImageView) inflate.findViewById(R.id.user_photo);
        this.m = (ImageView) inflate.findViewById(R.id.navigation_icon);
        this.o = inflate.findViewById(R.id.first_button);
        this.p = inflate.findViewById(R.id.search_button);
        this.q = inflate.findViewById(R.id.add_button);
        this.r = inflate.findViewById(R.id.settings_button);
        this.n = (LottieAnimationView) inflate.findViewById(R.id.cast_button);
        View view2 = this.r;
        if (view2 != null) {
            view2.setVisibility(this.b == VideoCatalogId.LIBRARY ? 0 : 8);
        }
        View view3 = this.r;
        if (view3 != null) {
            bwt0.i0(view3, new mga0(this, 28));
        }
        ImageView imageView = this.m;
        if (imageView != null) {
            bwt0.i0(imageView, new ggb0(this, 27));
        }
        View view4 = this.p;
        if (view4 != null) {
            view4.setOnClickListener(new oa6(this, 12));
        }
        if (((Boolean) this.u.getValue()).booleanValue() && (lottieAnimationView = this.n) != null) {
            bwt0.i0(lottieAnimationView, new wug0(this, 25));
        }
        View view5 = this.q;
        if (view5 != null) {
            view5.setOnClickListener(new r8f0(1, this, inflate));
        }
        View view6 = this.q;
        if (view6 != null) {
            view6.setVisibility(this.d != null ? 0 : 8);
        }
        qcy<Object>[] qcyVarArr = bwt0.a;
        f4m.n((int) inflate.getResources().getDimension(R.dimen.catalog_video_header_height_redesign), inflate);
        a();
        gzs<s3q0> gzsVar = this.h;
        if (gzsVar != null) {
            oj70 oj70Var = new oj70(inflate, gzsVar);
            this.s = oj70Var;
            View findViewById = inflate.findViewById(R.id.notifications_container);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View findViewById2 = inflate.findViewById(R.id.add_button);
            if (findViewById2 != null) {
                f4m.j(findViewById2);
            }
            inflate = oj70Var.b();
        }
        if (fxc0.B().J().C() && (view = this.p) != null) {
            this.t.a(view);
        }
        this.k = inflate;
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderVh
    public final RectF p1() {
        VKImageView vKImageView = this.l;
        if (vKImageView != null) {
            return bwt0.G(vKImageView);
        }
        return null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderVh
    public final void show() {
        View view = this.k;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
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
