package com.vk.catalog2.common.ui.mvp.holder.video;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.OfferVkVideo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.autoplay.j;
import com.vk.libvideo.videobottomsheet.api.a;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.toggle.d;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b5a;
import xsna.bpn0;
import xsna.cfp0;
import xsna.cpu;
import xsna.e3m;
import xsna.e6s0;
import xsna.fl4;
import xsna.fog0;
import xsna.fxc0;
import xsna.g13;
import xsna.g2u0;
import xsna.g620;
import xsna.g7s0;
import xsna.gzs;
import xsna.h9s0;
import xsna.i6s0;
import xsna.izs;
import xsna.lyd;
import xsna.msy;
import xsna.o0r0;
import xsna.oos0;
import xsna.osp;
import xsna.pkd;
import xsna.pyr0;
import xsna.s6s0;
import xsna.sc5;
import xsna.u4a;
import xsna.w6s0;
import xsna.xg5;
import xsna.xqi0;
import xsna.xwk;
import xsna.ydt0;
import xsna.z6s0;
import xsna.z6s0.a;

/* compiled from: VideoItemVh.kt */
/* loaded from: classes16.dex */
public abstract class VideoItemVh implements CatalogViewHolder, View.OnClickListener {
    public final b5a b;
    public final SearchStatInfoProvider c;
    public final g7s0 d;
    public final fl4 e;
    public final o0r0 f;
    public final cpu g;
    public final pkd h;
    public u4a.a i;
    public UIBlockVideo j;
    public float k;
    public final Object l;

    /* compiled from: VideoItemVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<UserId, Boolean> {
        @Override // xsna.izs
        public final Boolean invoke(UserId userId) {
            return Boolean.valueOf(((cpu) this.receiver).d(userId));
        }
    }

    public VideoItemVh(b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, g7s0 g7s0Var, fl4 fl4Var, o0r0 o0r0Var, cpu cpuVar, pkd pkdVar, u4a.a aVar) {
        this.b = b5aVar;
        this.c = searchStatInfoProvider;
        this.d = g7s0Var;
        this.e = fl4Var;
        this.f = o0r0Var;
        this.g = cpuVar;
        this.h = pkdVar;
        this.i = aVar;
        this.l = msy.a(LazyThreadSafetyMode.NONE, new pyr0(this, 1));
    }

    public static Activity a(View view) {
        Activity h = e3m.h(view.getContext());
        return h == null ? g2u0.c(view) : h;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        this.j = uIBlock instanceof UIBlockVideo ? (UIBlockVideo) uIBlock : null;
    }

    public final s6s0 b(UIBlockVideo uIBlockVideo, boolean z) {
        com.vk.libvideo.videobottomsheet.api.a h9s0Var;
        u4a.a aVar = this.i;
        if (aVar == null || (h9s0Var = aVar.P) == null) {
            h9s0Var = new h9s0((bpn0) null, (bpn0) null, 6);
        }
        return h9s0Var.b().a(new a.InterfaceC1255a.C1256a(uIBlockVideo.B, new a.c(uIBlockVideo.N, uIBlockVideo.M, uIBlockVideo.g, uIBlockVideo.f, uIBlockVideo.H, uIBlockVideo.K), null, z), new i6s0(this.b, uIBlockVideo), new a(1, this.g, cpu.class, "isCurrentUserOrGroupAdmin", "isCurrentUserOrGroupAdmin(Lcom/vk/dto/common/id/UserId;)Z", 0));
    }

    public float c() {
        return this.k;
    }

    public final void d(View view, UIBlockVideo uIBlockVideo, b5a b5aVar) {
        if (uIBlockVideo != null) {
            b5aVar.a(new cfp0(uIBlockVideo, new VideoAnalyticsInfo(VideoAnalyticsInfo.ClickTarget.ExtendEpisodes)));
        }
        Context context = view.getContext();
        Activity activity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (activity == null) {
            activity = g2u0.c(view);
        }
        Activity activity2 = activity;
        VideoFile videoFile = uIBlockVideo != null ? uIBlockVideo.B : null;
        if (activity2 == null || videoFile == null) {
            return;
        }
        xqi0 xqi0Var = new xqi0(5);
        fog0 fog0Var = new fog0(6);
        g13 g13Var = new g13(28);
        sc5 sc5Var = new sc5(this, uIBlockVideo, b5aVar, 6);
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.SEARCH_AUTHOR;
        String r = videoFile.r();
        if (r == null) {
            r = "";
        }
        new osp.a(activity2, videoFile, true, xqi0Var, fog0Var, g13Var, null, true, sc5Var, this.c.b(type, r, false)).I0(null);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    public void onClick(View view) {
        final UIBlockVideo uIBlockVideo;
        oos0 x;
        com.vk.libvideo.videobottomsheet.api.a h9s0Var;
        final Activity a2 = a(view);
        if (a2 == null || (uIBlockVideo = this.j) == null) {
            return;
        }
        final VideoFile videoFile = uIBlockVideo.B;
        int id = view.getId();
        if (id == R.id.menu) {
            u4a.a aVar = this.i;
            if (aVar == null || (h9s0Var = aVar.P) == null) {
                h9s0Var = new h9s0((bpn0) null, (bpn0) null, 6);
            }
            z6s0.a aVar2 = h9s0Var.a().new a(uIBlockVideo.N, uIBlockVideo.M);
            if (((Boolean) this.l.getValue()).booleanValue()) {
                new w6s0(b(uIBlockVideo, true), aVar2).e(a2);
                return;
            } else {
                new e6s0(a2, b(uIBlockVideo, true), aVar2).c();
                return;
            }
        }
        b5a b5aVar = this.b;
        g7s0 g7s0Var = this.d;
        if (id == R.id.avatar_hover || id == R.id.avatar) {
            b5aVar.a(new cfp0(uIBlockVideo, new VideoAnalyticsInfo(VideoAnalyticsInfo.ClickTarget.ShowAuthor)));
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.SEARCH_AUTHOR;
            String r = videoFile.r();
            if (r == null) {
                r = "";
            }
            SearchStatsLoggingInfo b = this.c.b(type, r, false);
            if (!(videoFile instanceof MusicVideoFile) || g7s0Var.J().Y0()) {
                ydt0.f(g7s0Var.Y(), a2, videoFile, uIBlockVideo.f, b, null, 16);
                return;
            } else {
                fl4.y(this.e, view.getContext(), videoFile, b, 8);
                return;
            }
        }
        if (id == R.id.episodes) {
            d(view, uIBlockVideo, b5aVar);
            return;
        }
        if (!g7s0Var.J().v() || (videoFile.ab() != OfferVkVideo.LISTING && ((x = d.x()) == null || !x.j))) {
            g7s0Var.Y().k(a2, videoFile, (r43 & 4) != 0 ? null : uIBlockVideo.f, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : videoFile.r(), true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
            return;
        }
        String a1 = videoFile.a1();
        oos0 x2 = d.x();
        this.d.K(a2, a1, x2 != null ? x2.b : true, j.b(videoFile), new gzs() { // from class: xsna.sqs0
            @Override // xsna.gzs
            public final Object invoke() {
                ydt0 Y = VideoItemVh.this.d.Y();
                UIBlockVideo uIBlockVideo2 = uIBlockVideo;
                Y.k(a2, videoFile, (r43 & 4) != 0 ? null : uIBlockVideo2.f, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : uIBlockVideo2.B.r(), true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
                return s3q0.a;
            }
        });
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    public /* synthetic */ VideoItemVh(b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, g7s0 g7s0Var, fl4 fl4Var, o0r0 o0r0Var, cpu cpuVar, pkd pkdVar, u4a.a aVar, int i) {
        this(b5aVar, searchStatInfoProvider, (i & 4) != 0 ? fxc0.B() : g7s0Var, (i & 8) != 0 ? lyd.g() : fl4Var, (i & 16) != 0 ? xwk.e() : o0r0Var, (i & 32) != 0 ? xg5.a() : cpuVar, (i & 64) != 0 ? g620.f() : pkdVar, (i & 128) != 0 ? null : aVar);
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
