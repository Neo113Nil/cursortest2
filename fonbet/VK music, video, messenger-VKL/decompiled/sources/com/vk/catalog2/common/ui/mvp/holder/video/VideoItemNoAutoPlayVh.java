package com.vk.catalog2.common.ui.mvp.holder.video;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.OfferVkVideo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.toggle.d;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.bpn0;
import xsna.cfp0;
import xsna.dbj0;
import xsna.djt0;
import xsna.epx;
import xsna.f4m;
import xsna.fxc0;
import xsna.g2u0;
import xsna.g4;
import xsna.g7s0;
import xsna.h270;
import xsna.hdt0;
import xsna.jjc;
import xsna.mba;
import xsna.oos0;
import xsna.q01;
import xsna.uc;
import xsna.w8i;
import xsna.yg5;

/* compiled from: VideoItemNoAutoPlayVh.kt */
/* loaded from: classes16.dex */
public final class VideoItemNoAutoPlayVh extends VideoItemVh implements w8i {
    public final VideoItemVh m;
    public final SearchStatInfoProvider n;
    public final boolean o;
    public final mba p;
    public final boolean q;
    public final boolean r;
    public View s;
    public h270 t;
    public ProgressBar u;
    public final bpn0 v;
    public final boolean w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoItemNoAutoPlayVh(VideoItemVh videoItemVh, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, boolean z, mba mbaVar, boolean z2, int i) {
        super(b5aVar, searchStatInfoProvider, r7, null, null, null, null, null, 248);
        boolean z3 = (i & 8) != 0 ? false : z;
        mba mbaVar2 = (i & 16) != 0 ? null : mbaVar;
        boolean z4 = (i & 32) != 0 ? false : z2;
        boolean z5 = (i & 64) != 0;
        g7s0 B = fxc0.B();
        this.m = videoItemVh;
        this.n = searchStatInfoProvider;
        this.o = z3;
        this.p = mbaVar2;
        this.q = z4;
        this.r = z5;
        this.v = new bpn0(new dbj0(this, 15));
        this.w = B.J().Y1();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.m.L();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        this.m.N6(uIBlock);
        UIBlockVideo uIBlockVideo = uIBlock instanceof UIBlockVideo ? (UIBlockVideo) uIBlock : null;
        if (uIBlockVideo != null) {
            String str = uIBlockVideo.b;
            VideoFile videoFile = uIBlockVideo.B;
            h270 h270Var = this.t;
            if (h270Var == null) {
                h270Var = null;
            }
            if (h270Var == null) {
                h270Var = null;
            }
            if (h270Var != null) {
                UIBlockVideo uIBlockVideo2 = (UIBlockVideo) uIBlock;
                VideoFile videoFile2 = uIBlockVideo2.B;
                if ((this.q || uIBlockVideo2.I || uIBlockVideo2.H || uIBlockVideo2.J || uIBlockVideo2.L) && !videoFile2.q0() && videoFile2.O() == null && !videoFile.W9()) {
                    ProgressBar progressBar = this.u;
                    h270Var.x = progressBar;
                    if (progressBar != null) {
                        progressBar.setVisibility(0);
                    }
                } else {
                    h270Var.x = null;
                    ProgressBar progressBar2 = this.u;
                    if (progressBar2 != null) {
                        f4m.j(progressBar2);
                    }
                }
            }
            h270 h270Var2 = this.t;
            if (h270Var2 == null) {
                h270Var2 = null;
            }
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            h270Var2.k(videoFile, b.C1208b.a().e(videoFile, null), com.vk.libvideo.autoplay.a.t);
            h270 h270Var3 = this.t;
            if (h270Var3 == null) {
                h270Var3 = null;
            }
            h270Var3.s(str + '|' + str);
            h270 h270Var4 = this.t;
            if (h270Var4 == null) {
                h270Var4 = null;
            }
            h270Var4.w(uIBlockVideo.f);
            h270 h270Var5 = this.t;
            (h270Var5 != null ? h270Var5 : null).n = this.o;
        }
    }

    public final void e(View view) {
        String str;
        UIBlockVideo uIBlockVideo = this.j;
        h270 h270Var = this.t;
        if (h270Var == null) {
            h270Var = null;
        }
        VideoRestriction O = h270Var.o.O();
        RestrictionButton restrictionButton = O != null ? O.e : null;
        if (this.w && restrictionButton != null) {
            String str2 = restrictionButton.b;
            if (!epx.f(str2, VideoRestriction.SupportedAction.PLAY.i())) {
                VideoRestriction.SupportedAction.Companion.getClass();
                if (VideoRestriction.SupportedAction.a.a(restrictionButton)) {
                    hdt0 hdt0Var = (hdt0) this.v.getValue();
                    Context context = view.getContext();
                    h270 h270Var2 = this.t;
                    hdt0Var.a(context, (h270Var2 != null ? h270Var2 : null).o, str2, null, null);
                    return;
                }
            }
        }
        mba mbaVar = this.p;
        if (mbaVar != null) {
            mbaVar.w(view, this.j, null);
            return;
        }
        Activity c = g2u0.c(view);
        if (c == null) {
            return;
        }
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
        UIBlockVideo uIBlockVideo2 = this.j;
        if (uIBlockVideo2 == null || (str = uIBlockVideo2.B.r()) == null) {
            str = "";
        }
        SearchStatsLoggingInfo b = this.n.b(type, str, false);
        h270 h270Var3 = this.t;
        if (h270Var3 == null) {
            h270Var3 = null;
        }
        h270Var3.v(uIBlockVideo.B);
        h270 h270Var4 = this.t;
        h270 h270Var5 = h270Var4 == null ? null : h270Var4;
        if (h270Var4 == null) {
            h270Var4 = null;
        }
        boolean z = !(h270Var4.o instanceof MusicVideoFile);
        UIBlockVideo uIBlockVideo3 = this.j;
        uc.o(h270Var5, c, z, uIBlockVideo3 != null ? uIBlockVideo3.y : null, b, uIBlockVideo3 != null ? uIBlockVideo3.B.r() : null, 16);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        DurationView durationView;
        VideoItemVh videoItemVh = this.m;
        View k5 = videoItemVh.k5(layoutInflater, viewGroup, bundle);
        this.s = k5;
        ImageView imageView = (ImageView) k5.findViewById(R.id.preview);
        ProgressBar progressBar = (ProgressBar) k5.findViewById(R.id.progress_bar);
        DurationView durationView2 = null;
        if (progressBar == null) {
            VideoItemListLargeVh videoItemListLargeVh = videoItemVh instanceof VideoItemListLargeVh ? (VideoItemListLargeVh) videoItemVh : null;
            progressBar = videoItemListLargeVh != null ? videoItemListLargeVh.P : null;
        }
        this.u = progressBar;
        float c = videoItemVh.c();
        VideoOverlayView videoOverlayView = (VideoOverlayView) k5.findViewById(R.id.overlay_view);
        VideoItemListLargeVh videoItemListLargeVh2 = videoItemVh instanceof VideoItemListLargeVh ? (VideoItemListLargeVh) videoItemVh : null;
        if (videoItemListLargeVh2 != null && (durationView = videoItemListLargeVh2.D) != null) {
            durationView2 = durationView;
        }
        this.t = new h270(imageView, videoOverlayView, c, null, this.r, durationView2, k5, 24);
        if (!(k5 instanceof djt0)) {
            bpn0 bpn0Var = jjc.a;
            k5.setOnClickListener(new q01(this, 2));
            return k5;
        }
        View frontView = ((djt0) k5).getFrontView();
        bpn0 bpn0Var2 = jjc.a;
        frontView.setOnClickListener(new q01(this, 2));
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh, android.view.View.OnClickListener
    public final void onClick(View view) {
        oos0 x;
        b5a b5aVar;
        UIBlockVideo uIBlockVideo = this.j;
        if (uIBlockVideo != null && (b5aVar = this.b) != null) {
            b5aVar.a(new cfp0(uIBlockVideo, null));
        }
        if (fxc0.B().J().v()) {
            h270 h270Var = this.t;
            if (h270Var == null) {
                h270Var = null;
            }
            if (h270Var.o.ab() == OfferVkVideo.LISTING || ((x = d.x()) != null && x.j)) {
                g7s0 B = fxc0.B();
                Context context = view.getContext();
                h270 h270Var2 = this.t;
                if (h270Var2 == null) {
                    h270Var2 = null;
                }
                String a1 = h270Var2.o.a1();
                oos0 x2 = d.x();
                boolean z = x2 != null ? x2.b : true;
                h270 h270Var3 = this.t;
                if (h270Var3 == null) {
                    h270Var3 = null;
                }
                yg5 yg5Var = h270Var3.j;
                B.K(context, a1, z, (yg5Var != null ? yg5Var : null).getPosition(), new g4(26, this, view));
                return;
            }
        }
        e(view);
    }
}
