package com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAlbumAnalyticsInfo;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.a;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.bottomsheet.VideoPlaylistBottomSheet;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.aam0;
import xsna.aer0;
import xsna.b5a;
import xsna.bpn0;
import xsna.cfp0;
import xsna.cpu;
import xsna.e3m;
import xsna.e5t0;
import xsna.epx;
import xsna.f5t0;
import xsna.fxc0;
import xsna.g5t0;
import xsna.g7s0;
import xsna.h8l0;
import xsna.iah0;
import xsna.ie90;
import xsna.izs;
import xsna.jwr0;
import xsna.lxh0;
import xsna.mba;
import xsna.msy;
import xsna.nda;
import xsna.rcg0;
import xsna.s3q0;
import xsna.u4a;
import xsna.u4t0;
import xsna.wgm0;
import xsna.wjs0;
import xsna.xg5;
import xsna.yyl0;
import xsna.z0h0;
import xsna.zak0;

/* compiled from: VideoPlaylistToolbarComposeVh.kt */
/* loaded from: classes16.dex */
public final class VideoPlaylistToolbarComposeVh extends VideoPlaylistToolbar {
    public final nda e;
    public final u4t0 f;
    public final u4a.a g;
    public c h;
    public VideoAlbum i;
    public com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.b j;
    public final Object k;

    /* compiled from: VideoPlaylistToolbarComposeVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoPlaylistBottomSheet.Action.values().length];
            try {
                iArr[VideoPlaylistBottomSheet.Action.ShowAuthor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoPlaylistBottomSheet.Action.CopyLink.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoPlaylistBottomSheet.Action.Share.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoPlaylistBottomSheetRedesign.Action.values().length];
            try {
                iArr2[VideoPlaylistBottomSheetRedesign.Action.ShowAuthor.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VideoPlaylistBottomSheetRedesign.Action.CopyLink.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VideoPlaylistBottomSheetRedesign.Action.Share.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: VideoPlaylistToolbarComposeVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.a, s3q0> {
        /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.a aVar) {
            Context context;
            VideoShareComponent value;
            VideoShareComponent value2;
            Context context2;
            Context context3;
            Activity h;
            com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.a aVar2 = aVar;
            VideoPlaylistToolbarComposeVh videoPlaylistToolbarComposeVh = (VideoPlaylistToolbarComposeVh) this.receiver;
            videoPlaylistToolbarComposeVh.getClass();
            if (epx.f(aVar2, a.C0514a.a)) {
                videoPlaylistToolbarComposeVh.e.c(false);
            } else {
                com.vk.video.ui.share.api.b bVar = null;
                r10 = null;
                com.vk.video.ui.share.api.b bVar2 = null;
                bVar = null;
                if (epx.f(aVar2, a.b.a)) {
                    com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.b bVar3 = videoPlaylistToolbarComposeVh.j;
                    if (bVar3 != null && (context3 = bVar3.getContext()) != null && (h = e3m.h(context3)) != null) {
                        g7s0 B = fxc0.B();
                        VideoAlbum videoAlbum = videoPlaylistToolbarComposeVh.i;
                        B.g(h, videoAlbum != null ? videoAlbum : null, true);
                    }
                } else if (epx.f(aVar2, a.d.a)) {
                    VideoAlbum videoAlbum2 = videoPlaylistToolbarComposeVh.i;
                    if (videoAlbum2 == null) {
                        videoAlbum2 = null;
                    }
                    VideoAlbumAnalyticsInfo.ClickTarget clickTarget = videoAlbum2.l ? VideoAlbumAnalyticsInfo.ClickTarget.Unsubscribe : VideoAlbumAnalyticsInfo.ClickTarget.Subscribe;
                    UIBlock uIBlock = videoPlaylistToolbarComposeVh.d;
                    if (uIBlock != null) {
                        videoPlaylistToolbarComposeVh.c.a(new cfp0(uIBlock, new VideoAlbumAnalyticsInfo(clickTarget, null)));
                    }
                    com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.b bVar4 = videoPlaylistToolbarComposeVh.j;
                    if (bVar4 != null && (context2 = bVar4.getContext()) != null) {
                        u4t0 u4t0Var = videoPlaylistToolbarComposeVh.f;
                        VideoAlbum videoAlbum3 = videoPlaylistToolbarComposeVh.i;
                        VideoAlbum videoAlbum4 = videoAlbum3 != null ? videoAlbum3 : null;
                        if (u4t0Var.j.h()) {
                            u4t0Var.e(context2, videoAlbum4);
                        }
                    }
                } else {
                    if (!epx.f(aVar2, a.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.b bVar5 = videoPlaylistToolbarComposeVh.j;
                    if (bVar5 != null && (context = bVar5.getContext()) != null) {
                        u4a.a aVar3 = videoPlaylistToolbarComposeVh.g;
                        if (((Boolean) videoPlaylistToolbarComposeVh.k.getValue()).booleanValue()) {
                            VideoAlbum videoAlbum5 = videoPlaylistToolbarComposeVh.i;
                            VideoAlbum videoAlbum6 = videoAlbum5 == null ? null : videoAlbum5;
                            yyl0 yyl0Var = new yyl0(videoPlaylistToolbarComposeVh, 16);
                            e5t0 e5t0Var = new e5t0(1, videoPlaylistToolbarComposeVh, VideoPlaylistToolbarComposeVh.class, "trackClickToAnalytics", "trackClickToAnalytics(Lcom/vk/libvideo/bottomsheet/videoplaylist/VideoPlaylistBottomSheetRedesign$Action;)V", 0);
                            aVar3.getClass();
                            Lazy<VideoShareComponent> lazy = aVar3.S;
                            if (lazy != null && (value2 = lazy.getValue()) != null) {
                                bVar2 = value2.S();
                            }
                            new VideoPlaylistBottomSheetRedesign(new VideoPlaylistBottomSheetRedesign.a(videoAlbum6, yyl0Var, e5t0Var, (rcg0) null, bVar2)).c(e3m.h(context));
                        } else {
                            VideoAlbum videoAlbum7 = videoPlaylistToolbarComposeVh.i;
                            VideoAlbum videoAlbum8 = videoAlbum7 == null ? null : videoAlbum7;
                            ie90 ie90Var = new ie90(videoPlaylistToolbarComposeVh, 28);
                            f5t0 f5t0Var = new f5t0(1, videoPlaylistToolbarComposeVh, VideoPlaylistToolbarComposeVh.class, "trackClickToAnalytics", "trackClickToAnalytics(Lcom/vk/libvideo/bottomsheet/VideoPlaylistBottomSheet$Action;)V", 0);
                            aVar3.getClass();
                            Lazy<VideoShareComponent> lazy2 = aVar3.S;
                            if (lazy2 != null && (value = lazy2.getValue()) != null) {
                                bVar = value.S();
                            }
                            new VideoPlaylistBottomSheet(context, videoAlbum8, ie90Var, f5t0Var, (rcg0) null, bVar).c();
                        }
                    }
                }
            }
            return s3q0.a;
        }
    }

    public VideoPlaylistToolbarComposeVh(mba mbaVar, b5a b5aVar, nda ndaVar, u4t0 u4t0Var, u4a.a aVar) {
        super(mbaVar, b5aVar);
        this.e = ndaVar;
        this.f = u4t0Var;
        this.g = aVar;
        this.h = EmptyDisposable.INSTANCE;
        this.k = msy.a(LazyThreadSafetyMode.NONE, new z0h0(10));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.h.dispose();
    }

    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder
    public final void b(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockVideoAlbum) {
            c((UIBlockVideoAlbum) uIBlock);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (xsna.sua.p(r0 != null ? r0 : null) != false) goto L29;
     */
    @Override // com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.VideoPlaylistToolbar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(UIBlockVideoAlbum uIBlockVideoAlbum) {
        VideoAlbum videoAlbum = uIBlockVideoAlbum.y;
        this.i = videoAlbum;
        bpn0 bpn0Var = xg5.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        cpu cpuVar = (cpu) bpn0Var.getValue();
        VideoAlbum videoAlbum2 = this.i;
        if (videoAlbum2 == null) {
            videoAlbum2 = null;
        }
        boolean a2 = cpuVar.a(videoAlbum2.c);
        com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.b bVar = this.j;
        if (bVar != null) {
            g5t0 value = bVar.getViewState().getValue();
            VideoAlbum videoAlbum3 = this.i;
            if (videoAlbum3 == null) {
                videoAlbum3 = null;
            }
            String str = videoAlbum3.d;
            boolean z = true;
            boolean z2 = iah0.r(bVar.getContext()) && this.f.i;
            if (a2) {
                VideoAlbum videoAlbum4 = this.i;
            }
            z = false;
            ((zak0) bVar.m).setValue(g5t0.a(value, str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z, z2, videoAlbum.l, null, 34));
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.VideoPlaylistToolbar
    public final void d(float f) {
        com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.b bVar = this.j;
        if (bVar != null) {
            ((zak0) bVar.m).setValue(g5t0.a(bVar.getViewState().getValue(), null, 1.0f - f, false, false, false, null, 61));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.b bVar = new com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.b(layoutInflater.getContext());
        bVar.setId(R.id.toolbar);
        this.j = bVar;
        g5t0 value = bVar.getViewState().getValue();
        boolean r = iah0.r(bVar.getContext());
        u4t0 u4t0Var = this.f;
        ((zak0) bVar.m).setValue(g5t0.a(value, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, r && u4t0Var.i, false, new b(1, this, VideoPlaylistToolbarComposeVh.class, "handleAction", "handleAction(Lcom/vk/catalog2/common/ui/mvp/holder/video/playlist/toolbar/VideoPlaylistToolbarAction;)V", 0), 23));
        u4t0Var.f.add(new aer0(bVar, 3));
        this.h = new i0(wjs0.b.b0(jwr0.class), new aam0(new lxh0(this, 10), 5)).subscribe(new h8l0(new wgm0(this, 13), 7));
        return bVar;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.VideoPlaylistToolbar
    public final void e(boolean z) {
    }
}
