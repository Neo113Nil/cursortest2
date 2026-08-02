package com.vk.video.ad;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vk.libvideo.design.view.ad.VideoAdLayout;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.video.ad.VideoAdDialog;
import com.vk.video.ad.data.VideoAdInfo;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.bwt0;
import xsna.cfi0;
import xsna.d2c0;
import xsna.e3m;
import xsna.e43;
import xsna.emh0;
import xsna.f5z;
import xsna.g2c0;
import xsna.g8n0;
import xsna.gm50;
import xsna.gz80;
import xsna.iah0;
import xsna.io2;
import xsna.kzr0;
import xsna.l8g;
import xsna.msy;
import xsna.om60;
import xsna.qcy;
import xsna.tn10;
import xsna.vpn0;
import xsna.xm2;

/* compiled from: VideoAdView.kt */
/* loaded from: classes5.dex */
public final class e implements gm50 {
    public final VideoAdDialog.c b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final f5z g;
    public final View h;
    public final View i;
    public final CoordinatorLayout j;
    public final ConstraintLayout k;
    public final View l;
    public final VideoTextureView m;
    public final VideoAdLayout n;
    public final ImageView o;
    public final FrameLayout p;
    public final ImageView q;
    public final f r;
    public final int s;
    public final xm2 t;
    public final Handler u;
    public final kzr0 v;

    /* compiled from: VideoAdView.kt */
    public final class a {
        public a() {
        }

        public final tn10 a() {
            return e.this.m.getMatrixProvider();
        }
    }

    public e(f5z f5zVar, Context context, io2 io2Var, VideoAdDialog.c cVar) {
        this.b = cVar;
        om60 om60Var = new om60(12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, om60Var);
        this.d = msy.a(lazyThreadSafetyMode, new d2c0(11));
        this.e = msy.a(lazyThreadSafetyMode, new cfi0(4));
        this.f = msy.a(lazyThreadSafetyMode, new g2c0(11));
        this.g = f5zVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.video_ad_view, (ViewGroup) null);
        this.h = inflate;
        this.i = inflate.findViewById(R.id.background_view);
        this.j = (CoordinatorLayout) inflate.findViewById(R.id.parent_view);
        this.k = (ConstraintLayout) inflate.findViewById(R.id.container_view);
        this.l = inflate.findViewById(R.id.video_frame_view);
        this.m = (VideoTextureView) inflate.findViewById(R.id.video_view);
        this.n = (VideoAdLayout) inflate.findViewById(R.id.video_ad_layout);
        this.o = (ImageView) inflate.findViewById(R.id.play_view);
        this.p = (FrameLayout) inflate.findViewById(R.id.ad_container);
        this.q = (ImageView) inflate.findViewById(R.id.close_view);
        this.r = new f(this);
        int a2 = iah0.a(12);
        this.s = a2;
        int i = 8;
        this.t = new xm2(io2Var, new a(), a2, new emh0(this, 15), new vpn0(this, i), new g8n0(this, i));
        this.u = new Handler(Looper.getMainLooper());
        this.v = new kzr0(false, true, false, io2Var, false);
    }

    public final void a(VideoAdInfo videoAdInfo) {
        boolean h = videoAdInfo.h();
        View view = this.h;
        if (h) {
            qcy<Object>[] qcyVarArr = bwt0.a;
            int systemUiVisibility = view.getSystemUiVisibility();
            if (gz80.a(23)) {
                Activity h2 = e3m.h(view.getContext());
                boolean d = h2 != null ? l8g.d(h2.getWindow().getStatusBarColor()) : false;
                if (d && systemUiVisibility != 8192) {
                    view.setSystemUiVisibility(8192);
                } else if (!d && systemUiVisibility != 0) {
                    view.setSystemUiVisibility(0);
                }
            } else if (systemUiVisibility != 0) {
                view.setSystemUiVisibility(0);
            }
        } else {
            bwt0.H(view);
        }
        this.j.setFitsSystemWindows(h);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        ConstraintLayout constraintLayout = this.k;
        bVar.i(constraintLayout);
        bVar.g(R.id.video_frame_view);
        if (h) {
            bVar.k(R.id.video_frame_view, 6, 0, 6);
            bVar.k(R.id.video_frame_view, 3, 0, 3);
            bVar.k(R.id.video_frame_view, 7, 0, 7);
            bVar.k(R.id.video_frame_view, 4, R.id.ad_container, 3);
        } else {
            bVar.k(R.id.video_frame_view, 6, 0, 6);
            bVar.k(R.id.video_frame_view, 3, 0, 3);
            bVar.k(R.id.video_frame_view, 7, R.id.ad_container, 6);
            bVar.k(R.id.video_frame_view, 4, 0, 4);
        }
        bVar.b(constraintLayout);
        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
        bVar2.i(constraintLayout);
        bVar2.g(R.id.ad_container);
        if (h) {
            bVar2.k(R.id.ad_container, 6, 0, 6);
            bVar2.k(R.id.ad_container, 3, R.id.video_frame_view, 4);
            bVar2.k(R.id.ad_container, 7, 0, 7);
            bVar2.k(R.id.ad_container, 4, 0, 4);
        } else {
            bVar2.k(R.id.ad_container, 6, R.id.video_frame_view, 7);
            bVar2.k(R.id.ad_container, 3, 0, 3);
            bVar2.k(R.id.ad_container, 7, 0, 7);
            bVar2.k(R.id.ad_container, 4, 0, 4);
        }
        bVar2.b(constraintLayout);
        int i = iah0.f().widthPixels;
        int i2 = iah0.f().heightPixels;
        View view2 = this.l;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Size parseSize = Size.parseSize(videoAdInfo.g().c);
        if (h) {
            double width = parseSize.getWidth();
            double d2 = width / i;
            double height = parseSize.getHeight();
            double d3 = height / i2;
            Size size = d2 >= d3 ? new Size(i, (int) Math.rint(height / d2)) : new Size((int) Math.rint(width / d3), i2);
            layoutParams.width = Math.min(i, size.getWidth());
            layoutParams.height = Math.min(i2 / 2, size.getHeight());
        } else {
            int i3 = (int) ((i / 3) * 2);
            double width2 = parseSize.getWidth();
            double d4 = width2 / i3;
            double height2 = parseSize.getHeight();
            double d5 = height2 / i2;
            Size size2 = d4 >= d5 ? new Size(i3, (int) Math.rint(height2 / d4)) : new Size((int) Math.rint(width2 / d5), i2);
            layoutParams.width = i3;
            layoutParams.height = Math.min(i2, size2.getHeight());
        }
        view2.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        VideoTextureView videoTextureView = this.m;
        ViewGroup.LayoutParams layoutParams3 = videoTextureView.getLayoutParams();
        Size parseSize2 = Size.parseSize(videoAdInfo.g().c);
        int a2 = h ? 0 : iah0.a(16);
        int i4 = layoutParams2.width - a2;
        int i5 = layoutParams2.height - a2;
        double width3 = parseSize2.getWidth();
        double d6 = width3 / i4;
        double height3 = parseSize2.getHeight();
        double d7 = height3 / i5;
        Size size3 = d6 >= d7 ? new Size(i4, (int) Math.rint(height3 / d6)) : new Size((int) Math.rint(width3 / d7), i5);
        layoutParams3.width = size3.getWidth();
        layoutParams3.height = size3.getHeight();
        videoTextureView.setLayoutParams(layoutParams3);
    }

    public final void b(boolean z) {
        VideoAdLayout videoAdLayout = this.n;
        VideoTextureView videoTextureView = this.m;
        if (z) {
            for (View view : e43.l(videoTextureView, videoAdLayout)) {
                view.setClipToOutline(false);
                view.setOutlineProvider(null);
            }
            return;
        }
        for (View view2 : e43.l(videoTextureView, videoAdLayout)) {
            float f = this.s;
            bwt0.d(view2, f, (r4 & 2) != 0, (r4 & 4) != 0);
            bwt0.d(view2, f, (r4 & 2) != 0, (r4 & 4) != 0);
        }
    }

    public final void c(boolean z) {
        this.o.setImageResource(z ? R.drawable.one_video_ic_pause_shadow_96 : R.drawable.one_video_ic_play_shadow_96);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.g;
    }
}
