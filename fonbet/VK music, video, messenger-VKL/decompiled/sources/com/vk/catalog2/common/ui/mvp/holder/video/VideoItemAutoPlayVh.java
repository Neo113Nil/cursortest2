package com.vk.catalog2.common.ui.mvp.holder.video;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.OfferVkVideo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.autoplay.AutoPlayMinifiedState;
import com.vk.libvideo.design.view.actionlink.ActionLinkView;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.models.videotracker.ScreenType;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.toggle.d;
import com.vkontakte.android.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.b5a;
import xsna.bpn0;
import xsna.cfp0;
import xsna.djs0;
import xsna.dnt0;
import xsna.ent0;
import xsna.epx;
import xsna.fg1;
import xsna.fh5;
import xsna.fxc0;
import xsna.g2u0;
import xsna.g7s0;
import xsna.jjc;
import xsna.joj0;
import xsna.kbj0;
import xsna.km1;
import xsna.mba;
import xsna.nr4;
import xsna.oos0;
import xsna.q01;
import xsna.qqs0;
import xsna.s3q0;
import xsna.sj0;
import xsna.tbe0;
import xsna.uc;
import xsna.uoj0;
import xsna.vfo0;
import xsna.wwr0;
import xsna.xcs0;
import xsna.yg5;

/* compiled from: VideoItemAutoPlayVh.kt */
/* loaded from: classes16.dex */
public final class VideoItemAutoPlayVh extends VideoItemVh implements sj0, ent0 {
    public fg1 A;
    public final qqs0 B;
    public final VideoItemVh m;
    public final SearchStatInfoProvider n;
    public final boolean o;
    public final boolean p;
    public final SubtitlesConfigurationMode q;
    public final mba r;
    public final boolean s;
    public VideoErrorView t;
    public ImageView u;
    public ActionLinkView v;
    public View w;
    public View x;
    public xcs0 y;
    public fh5 z;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoItemAutoPlayVh(AutoPlayingVideoItemViewHolder autoPlayingVideoItemViewHolder, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, boolean z, boolean z2, SubtitlesConfigurationMode subtitlesConfigurationMode, mba mbaVar, boolean z3, int i) {
        super(b5aVar, searchStatInfoProvider, r3, null, null, null, null, null, 248);
        boolean z4 = (i & 8) != 0 ? false : z;
        boolean z5 = (i & 16) != 0 ? true : z2;
        mba mbaVar2 = (i & 64) != 0 ? null : mbaVar;
        g7s0 B = fxc0.B();
        boolean z6 = (i & 256) != 0 ? false : z3;
        this.m = (VideoItemVh) autoPlayingVideoItemViewHolder;
        this.n = searchStatInfoProvider;
        this.o = z4;
        this.p = z5;
        this.q = subtitlesConfigurationMode;
        this.r = mbaVar2;
        this.s = z6;
        this.B = new qqs0(this, B);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.m.L();
        fg1 fg1Var = this.A;
        if (fg1Var != null) {
            fg1Var.invoke();
        }
        this.A = null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.vk.catalog2.common.ui.holders.api.CatalogViewHolder, com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder, com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ?? r2 = this.m;
        Trace.beginSection("VideoItemAutoPlayVh.bindData");
        try {
            fg1 fg1Var = this.A;
            if (fg1Var != null) {
                fg1Var.invoke();
            }
            fh5 fh5Var = null;
            this.A = null;
            super.N6(uIBlock);
            r2.N6(uIBlock);
            UIBlockVideo uIBlockVideo = uIBlock instanceof UIBlockVideo ? (UIBlockVideo) uIBlock : null;
            if (uIBlockVideo != null) {
                VideoFile videoFile = uIBlockVideo.B;
                ProgressBar Zb = r2.Zb();
                if (Zb != null) {
                    Zb.setMax((int) TimeUnit.SECONDS.toMillis(videoFile.getDuration()));
                }
                fh5 fh5Var2 = this.z;
                if (fh5Var2 == null) {
                    fh5Var2 = null;
                }
                tbe0 tbe0Var = new tbe0(uIBlockVideo, 24);
                boolean z = this.s;
                fh5Var2.l0(videoFile, tbe0Var, new com.vk.libvideo.autoplay.a(false, z ? RepeatMode.ALWAYS : RepeatMode.BY_VIDEO_PARAMS, null, false, false, this.p, null, this.q, null, null, PlayerType.INLINE, ScreenType.INLINE, z, null, 289788), new vfo0(3, this, uIBlockVideo));
                fh5 fh5Var3 = this.z;
                if (fh5Var3 != null) {
                    fh5Var = fh5Var3;
                }
                e(fh5Var, uIBlockVideo);
                s3q0 s3q0Var = s3q0.a;
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void e(fh5 fh5Var, UIBlockVideo uIBlockVideo) {
        StringBuilder sb = new StringBuilder();
        String str = uIBlockVideo.b;
        VideoFile videoFile = uIBlockVideo.B;
        sb.append(str);
        sb.append('|');
        sb.append(str);
        fh5Var.s(sb.toString());
        fh5Var.w(uIBlockVideo.f);
        fh5Var.n = this.o;
        uoj0 uoj0Var = fh5Var.H0;
        List<joj0> list = uoj0Var != null ? uoj0Var.c : null;
        xcs0 xcs0Var = this.y;
        if (xcs0Var != null) {
            ActionLink m1 = videoFile.m1();
            xcs0Var.a(new xcs0.a(epx.f(m1 != null ? m1.c : null, "video"), this, list, new wwr0(videoFile, this, xcs0Var.getContext()), new djs0(videoFile)));
        }
    }

    public final void g(View view, boolean z) {
        String str;
        UIBlockVideo uIBlockVideo = this.j;
        if (uIBlockVideo != null) {
            this.b.a(new cfp0(uIBlockVideo, null));
        }
        mba mbaVar = this.r;
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
        fh5 fh5Var = this.z;
        fh5 fh5Var2 = fh5Var == null ? null : fh5Var;
        UIBlockVideo uIBlockVideo3 = this.j;
        uc.o(fh5Var2, c, z, uIBlockVideo3 != null ? uIBlockVideo3.y : null, b, null, 48);
    }

    @Override // xsna.sj0
    public final int getAdapterPosition() {
        return 0;
    }

    public final void h(View view) {
        int id = view.getId();
        if (id == R.id.sound_control) {
            fh5 fh5Var = this.z;
            (fh5Var != null ? fh5Var : null).u0();
            return;
        }
        if (id == R.id.video_subtitles_control) {
            fh5 fh5Var2 = this.z;
            (fh5Var2 != null ? fh5Var2 : null).v0();
            return;
        }
        if (id == R.id.retry) {
            fh5 fh5Var3 = this.z;
            (fh5Var3 != null ? fh5Var3 : null).m0();
            return;
        }
        if (id == R.id.play) {
            fh5 fh5Var4 = this.z;
            if (fh5Var4 == null) {
                fh5Var4 = null;
            }
            if (fh5Var4.o.T3()) {
                yg5 yg5Var = fh5Var4.j;
                if (yg5Var == null) {
                    yg5Var = null;
                }
                if (yg5Var.p0()) {
                    fh5 fh5Var5 = this.z;
                    (fh5Var5 != null ? fh5Var5 : null).m0();
                    return;
                }
            }
            g(view, true);
            return;
        }
        if (id == R.id.replay || id == R.id.interactive_video_replay || id == R.id.video_end_replay) {
            fh5 fh5Var6 = this.z;
            (fh5Var6 != null ? fh5Var6 : null).n0();
            return;
        }
        if (id == R.id.video_end_add) {
            fh5 fh5Var7 = this.z;
            (fh5Var7 != null ? fh5Var7 : null).x();
            return;
        }
        if (id == R.id.video_action_link_view) {
            Activity c = g2u0.c(view);
            if (c == null) {
                return;
            }
            fh5 fh5Var8 = this.z;
            (fh5Var8 != null ? fh5Var8 : null).j0(c);
            return;
        }
        if (id == R.id.video_end_share) {
            kbj0 b = nr4.b();
            Context context = view.getContext();
            fh5 fh5Var9 = this.z;
            kbj0.u(b, context, (fh5Var9 != null ? fh5Var9 : null).o, false, false, null, null, 60);
            return;
        }
        if (id == R.id.interactive_video_end_watch_full || id == R.id.watch_full_button) {
            g(view, false);
        } else {
            g(view, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.catalog2.common.ui.holders.api.CatalogViewHolder, com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder, com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ?? r0 = this.m;
        View k5 = r0.k5(layoutInflater, viewGroup, bundle);
        this.t = r0.m0();
        this.w = r0.Gd();
        this.x = r0.O3();
        this.y = r0.hg();
        this.u = r0.G7();
        this.v = r0.Oi();
        this.z = r0.Tl(this);
        VideoErrorView videoErrorView = this.t;
        if (videoErrorView != null) {
            videoErrorView.a(new VideoErrorView.a(null, this, true, 57));
        }
        View view = this.w;
        if (view != null) {
            bpn0 bpn0Var = jjc.a;
            view.setOnClickListener(new q01(this, 2));
        }
        View view2 = this.x;
        if (view2 != null) {
            bpn0 bpn0Var2 = jjc.a;
            view2.setOnClickListener(new q01(this, 2));
        }
        ImageView imageView = this.u;
        if (imageView != null) {
            bpn0 bpn0Var3 = jjc.a;
            imageView.setOnClickListener(new q01(this, 2));
        }
        ActionLinkView actionLinkView = this.v;
        if (actionLinkView != null) {
            bpn0 bpn0Var4 = jjc.a;
            actionLinkView.setOnClickListener(new q01(this, 2));
        }
        bpn0 bpn0Var5 = jjc.a;
        k5.setOnClickListener(new q01(this, 2));
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh, android.view.View.OnClickListener
    public final void onClick(View view) {
        oos0 x;
        fh5 fh5Var = this.z;
        if (fh5Var == null) {
            fh5Var = null;
        }
        yg5 yg5Var = fh5Var.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        if (yg5Var.R0() == AutoPlayMinifiedState.PIP) {
            return;
        }
        if (fxc0.B().J().v()) {
            fh5 fh5Var2 = this.z;
            if (fh5Var2 == null) {
                fh5Var2 = null;
            }
            if (fh5Var2.o.ab() == OfferVkVideo.LISTING || ((x = d.x()) != null && x.j)) {
                Activity c = g2u0.c(view);
                if (c == null) {
                    h(view);
                    return;
                }
                g7s0 B = fxc0.B();
                fh5 fh5Var3 = this.z;
                if (fh5Var3 == null) {
                    fh5Var3 = null;
                }
                String a1 = fh5Var3.o.a1();
                oos0 x2 = d.x();
                boolean z = x2 != null ? x2.b : true;
                fh5 fh5Var4 = this.z;
                if (fh5Var4 == null) {
                    fh5Var4 = null;
                }
                yg5 yg5Var2 = fh5Var4.j;
                B.K(c, a1, z, (yg5Var2 != null ? yg5Var2 : null).getPosition(), new km1(21, this, view));
                return;
            }
        }
        h(view);
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        fh5 fh5Var = this.z;
        if (fh5Var == null) {
            return null;
        }
        return fh5Var;
    }
}
