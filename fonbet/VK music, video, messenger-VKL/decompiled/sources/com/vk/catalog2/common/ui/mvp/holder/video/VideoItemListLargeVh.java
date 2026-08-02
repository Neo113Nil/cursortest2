package com.vk.catalog2.common.ui.mvp.holder.video;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Trace;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.holders.video.info_overlays.a;
import com.vk.core.apps.BuildInfo;
import com.vk.core.tool.view.AspectRatioFrameLayout;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.tools.VkViewStub;
import com.vk.donut.design.view.badge.DonutBadge;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoScreenSource;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.newsfeed.Owner;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.actionlink.ActionLinkView;
import com.vk.libvideo.design.view.ad.VideoAdLayout;
import com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarLayout2;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.play.PlayButton;
import com.vk.libvideo.design.view.spectators.SpectatorsCounterView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.ui.UpcomingIndicatorView;
import com.vk.media.player.subtitles.NoStyleSubtitleView;
import com.vk.movika.sdk.base.ui.l;
import com.vk.stat.scheme.CommonVideoStat$CommunityClickInfo;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AdaptedFunctionReference;
import one.video.ad.ux.AdRedirectView;
import one.video.transform.TransformController;
import xsna.a390;
import xsna.a5o;
import xsna.azn;
import xsna.b5a;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cfp0;
import xsna.cqj;
import xsna.cy0;
import xsna.dac0;
import xsna.dhr0;
import xsna.dp0;
import xsna.e3m;
import xsna.e43;
import xsna.ejc;
import xsna.ejf0;
import xsna.epx;
import xsna.f4m;
import xsna.fem0;
import xsna.fh5;
import xsna.fqj;
import xsna.fvq0;
import xsna.fxc0;
import xsna.g6z;
import xsna.g7s0;
import xsna.gqs0;
import xsna.h57;
import xsna.i1t0;
import xsna.iah0;
import xsna.icn0;
import xsna.izs;
import xsna.jcf0;
import xsna.jl80;
import xsna.jo60;
import xsna.jsf0;
import xsna.k5o;
import xsna.k7a;
import xsna.kis0;
import xsna.kld0;
import xsna.kud0;
import xsna.l5o;
import xsna.l5u0;
import xsna.lis0;
import xsna.m33;
import xsna.mau;
import xsna.mis0;
import xsna.mll0;
import xsna.msy;
import xsna.nid0;
import xsna.nkt0;
import xsna.nqj;
import xsna.odc0;
import xsna.q6s0;
import xsna.qc00;
import xsna.qs80;
import xsna.r11;
import xsna.rls0;
import xsna.rqs0;
import xsna.s3q0;
import xsna.stg0;
import xsna.tfm0;
import xsna.u4a;
import xsna.uh80;
import xsna.uhs0;
import xsna.uko;
import xsna.uv80;
import xsna.uzv;
import xsna.w8i;
import xsna.wfk0;
import xsna.wqj;
import xsna.ww;
import xsna.x1e0;
import xsna.x4o;
import xsna.xcs0;
import xsna.y1o;
import xsna.ydt0;
import xsna.yg5;
import xsna.z3s0;
import xsna.zet0;
import xsna.zof;
import xsna.zyn;

/* compiled from: VideoItemListLargeVh.kt */
/* loaded from: classes16.dex */
public final class VideoItemListLargeVh extends VideoItemVh implements w8i, AutoPlayingVideoItemViewHolder {
    public fqj A;
    public cqj B;
    public fqj C;
    public DurationView D;
    public SpectatorsCounterView E;
    public ImageView F;
    public AspectRatioFrameLayout G;
    public VideoTextureView H;
    public VKImageView I;
    public VideoOverlayView J;
    public FrameLayout K;
    public NoStyleSubtitleView L;
    public VideoAdLayout M;
    public LinearLayout N;
    public AdRedirectView O;
    public ProgressBar P;
    public DonutBadge Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public z3s0 V;
    public final Object W;
    public View X;
    public final Object Y;
    public final Object Z;
    public final com.vk.catalog2.common.ui.holders.video.info_overlays.a a0;
    public final com.vk.catalog2.common.ui.mvp.holder.video.c b0;
    public final g c0;
    public final boolean d0;
    public final boolean e0;
    public final boolean f0;
    public final Object g0;
    public final Object h0;
    public final Object i0;
    public final Object j0;
    public final Object k0;
    public final Object l0;
    public final VideoItemListSettings m;
    public final Object m0;
    public boolean n;
    public final mau n0;
    public final a o;
    public final Object o0;
    public final boolean p;
    public final Object p0;
    public final u4a.a q;
    public final Object q0;
    public final jsf0 r;
    public final float r0;
    public LinearLayout s;
    public FrameLayout t;
    public LinearLayout u;
    public UpcomingIndicatorView v;
    public xcs0 w;
    public ActionLinkView x;
    public VideoErrorView y;
    public PlayButton z;

    /* compiled from: VideoItemListLargeVh.kt */
    public interface a {

        /* compiled from: VideoItemListLargeVh.kt */
        /* renamed from: com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh$a$a, reason: collision with other inner class name */
        public static final class C0509a implements a {
            public static final C0509a a = new C0509a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0509a);
            }

            public final int hashCode() {
                return 98215730;
            }

            public final String toString() {
                return "Default";
            }
        }

        /* compiled from: VideoItemListLargeVh.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1181777282;
            }

            public final String toString() {
                return "Fit";
            }
        }
    }

    /* compiled from: VideoItemListLargeVh.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoItemListSettings.InfoViewType.values().length];
            try {
                iArr[VideoItemListSettings.InfoViewType.ClipTeaser.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoItemListSettings.InfoViewType.ClipTeaserDescViews.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoItemListSettings.InfoViewType.ClipTeaserDescViewsAuthor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoItemListSettings.InfoViewType.ClipTeaserDescPubAuthor.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoItemListSettings.CornerType.values().length];
            try {
                iArr2[VideoItemListSettings.CornerType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VideoItemListSettings.CornerType.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VideoItemListSettings.CornerType.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: VideoItemListLargeVh.kt */
    public static final /* synthetic */ class c extends AdaptedFunctionReference implements izs<io.reactivex.rxjava3.disposables.c, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(io.reactivex.rxjava3.disposables.c cVar) {
            ((g) this.receiver).b(cVar);
            return s3q0.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoItemListLargeVh(k7a k7aVar, VideoItemListSettings videoItemListSettings, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, a aVar, u4a.a aVar2, jsf0 jsf0Var, int i) {
        super(b5aVar, searchStatInfoProvider, r4, null, null, null, null, r9, 120);
        g7s0 B = fxc0.B();
        a aVar3 = (i & 128) != 0 ? a.C0509a.a : aVar;
        boolean z = (i & 256) != 0;
        u4a.a aVar4 = (i & 512) != 0 ? null : aVar2;
        jsf0 jsf0Var2 = (i & 1024) != 0 ? null : jsf0Var;
        this.m = videoItemListSettings;
        this.n = true;
        this.o = aVar3;
        this.p = z;
        this.q = aVar4;
        this.r = jsf0Var2;
        jo60 jo60Var = new jo60(19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.R = msy.a(lazyThreadSafetyMode, jo60Var);
        this.S = msy.a(lazyThreadSafetyMode, new qc00(19));
        this.T = msy.a(lazyThreadSafetyMode, new uv80(14));
        this.U = msy.a(lazyThreadSafetyMode, new kld0(B, 25));
        this.W = msy.a(lazyThreadSafetyMode, new kud0(9));
        Lazy a2 = msy.a(lazyThreadSafetyMode, new nid0(this, 24));
        this.Y = a2;
        this.Z = msy.a(lazyThreadSafetyMode, new x1e0(this, 26));
        this.a0 = a.C0491a.a(videoItemListSettings, k7aVar, ((zof) a2.getValue()).h());
        this.b0 = new com.vk.catalog2.common.ui.mvp.holder.video.c(videoItemListSettings, aVar3);
        this.c0 = new g();
        this.d0 = B.J().j0();
        this.e0 = B.J().B0();
        this.f0 = B.J().j1();
        this.g0 = msy.a(lazyThreadSafetyMode, new jcf0(this, 20));
        this.h0 = msy.a(lazyThreadSafetyMode, new uhs0(this, 1));
        this.i0 = msy.a(lazyThreadSafetyMode, new tfm0(this, 18));
        this.j0 = msy.a(lazyThreadSafetyMode, new stg0(this, 22));
        this.k0 = msy.a(lazyThreadSafetyMode, new ejf0(this, 19));
        this.l0 = msy.a(lazyThreadSafetyMode, new rqs0(this, 0));
        this.m0 = msy.a(lazyThreadSafetyMode, new dac0(this, 27));
        this.n0 = new mau(this, 18);
        this.o0 = msy.a(lazyThreadSafetyMode, new mll0(B, 13));
        this.p0 = msy.a(lazyThreadSafetyMode, new fem0(B, 7));
        this.q0 = msy.a(lazyThreadSafetyMode, new odc0(B, 28));
        this.r0 = videoItemListSettings.h.h();
    }

    public static s3q0 e(VideoItemListLargeVh videoItemListLargeVh, View view, qs80 qs80Var) {
        if (qs80Var instanceof qs80.c) {
            videoItemListLargeVh.o(CommonVideoStat$CommunityClickInfo.Direction.TO_PLAYER_LIVE);
        } else {
            videoItemListLargeVh.o(CommonVideoStat$CommunityClickInfo.Direction.TO_AUTHOR);
            if (view.isAttachedToWindow()) {
                super.onClick(view);
            }
        }
        return s3q0.a;
    }

    public static final void j(VideoItemListLargeVh videoItemListLargeVh, int[] iArr, int[] iArr2, VideoAutoPlaySeekBarLayout2 videoAutoPlaySeekBarLayout2) {
        FrameLayout frameLayout = videoItemListLargeVh.t;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.getLocationInWindow(iArr);
        VideoTextureView videoTextureView = videoItemListLargeVh.H;
        if (videoTextureView == null) {
            videoTextureView = null;
        }
        videoTextureView.getLocationInWindow(iArr2);
        int i = iArr2[1] - iArr[1];
        VideoTextureView videoTextureView2 = videoItemListLargeVh.H;
        videoAutoPlaySeekBarLayout2.setPreviewHeight(((videoTextureView2 != null ? videoTextureView2 : null).getHeight() + i) - i);
        videoAutoPlaySeekBarLayout2.setTranslationY(i);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder
    public final ImageView G7() {
        PlayButton playButton = this.z;
        if (playButton != null) {
            return playButton;
        }
        return null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder
    public final View Gd() {
        fqj fqjVar = this.A;
        if (fqjVar != null) {
            return fqjVar;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        if (this.f0) {
            kis0 kis0Var = (kis0) this.h0.getValue();
            kis0Var.a();
            ((mis0) kis0Var.f.getValue()).destroy();
            ((lis0) this.g0.getValue()).destroy();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0229 A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:3:0x000b, B:5:0x0012, B:7:0x0023, B:10:0x002c, B:14:0x0033, B:17:0x005d, B:18:0x0050, B:21:0x0055, B:23:0x0060, B:26:0x0065, B:29:0x006e, B:32:0x0076, B:34:0x007d, B:38:0x0085, B:42:0x00a8, B:45:0x00be, B:71:0x018a, B:73:0x0193, B:75:0x019d, B:76:0x01b3, B:81:0x01bc, B:84:0x01c3, B:87:0x01cb, B:90:0x01d3, B:93:0x01dc, B:95:0x01f3, B:98:0x01fa, B:101:0x0207, B:102:0x0218, B:104:0x0229, B:106:0x0233, B:107:0x023a, B:109:0x023e, B:110:0x0242, B:112:0x024a, B:113:0x024e, B:116:0x0255, B:124:0x01a3, B:126:0x01a7, B:128:0x01ad, B:139:0x0260, B:140:0x0263, B:141:0x00b5, B:142:0x009f, B:47:0x00cf, B:50:0x00d8, B:53:0x00df, B:56:0x00e6, B:58:0x0109, B:59:0x011d, B:61:0x0123, B:65:0x012f, B:67:0x013a, B:69:0x0140, B:70:0x0146), top: B:2:0x000b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a7 A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:3:0x000b, B:5:0x0012, B:7:0x0023, B:10:0x002c, B:14:0x0033, B:17:0x005d, B:18:0x0050, B:21:0x0055, B:23:0x0060, B:26:0x0065, B:29:0x006e, B:32:0x0076, B:34:0x007d, B:38:0x0085, B:42:0x00a8, B:45:0x00be, B:71:0x018a, B:73:0x0193, B:75:0x019d, B:76:0x01b3, B:81:0x01bc, B:84:0x01c3, B:87:0x01cb, B:90:0x01d3, B:93:0x01dc, B:95:0x01f3, B:98:0x01fa, B:101:0x0207, B:102:0x0218, B:104:0x0229, B:106:0x0233, B:107:0x023a, B:109:0x023e, B:110:0x0242, B:112:0x024a, B:113:0x024e, B:116:0x0255, B:124:0x01a3, B:126:0x01a7, B:128:0x01ad, B:139:0x0260, B:140:0x0263, B:141:0x00b5, B:142:0x009f, B:47:0x00cf, B:50:0x00d8, B:53:0x00df, B:56:0x00e6, B:58:0x0109, B:59:0x011d, B:61:0x0123, B:65:0x012f, B:67:0x013a, B:69:0x0140, B:70:0x0146), top: B:2:0x000b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00b5 A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:3:0x000b, B:5:0x0012, B:7:0x0023, B:10:0x002c, B:14:0x0033, B:17:0x005d, B:18:0x0050, B:21:0x0055, B:23:0x0060, B:26:0x0065, B:29:0x006e, B:32:0x0076, B:34:0x007d, B:38:0x0085, B:42:0x00a8, B:45:0x00be, B:71:0x018a, B:73:0x0193, B:75:0x019d, B:76:0x01b3, B:81:0x01bc, B:84:0x01c3, B:87:0x01cb, B:90:0x01d3, B:93:0x01dc, B:95:0x01f3, B:98:0x01fa, B:101:0x0207, B:102:0x0218, B:104:0x0229, B:106:0x0233, B:107:0x023a, B:109:0x023e, B:110:0x0242, B:112:0x024a, B:113:0x024e, B:116:0x0255, B:124:0x01a3, B:126:0x01a7, B:128:0x01ad, B:139:0x0260, B:140:0x0263, B:141:0x00b5, B:142:0x009f, B:47:0x00cf, B:50:0x00d8, B:53:0x00df, B:56:0x00e6, B:58:0x0109, B:59:0x011d, B:61:0x0123, B:65:0x012f, B:67:0x013a, B:69:0x0140, B:70:0x0146), top: B:2:0x000b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x009f A[Catch: all -> 0x004d, TRY_ENTER, TryCatch #1 {all -> 0x004d, blocks: (B:3:0x000b, B:5:0x0012, B:7:0x0023, B:10:0x002c, B:14:0x0033, B:17:0x005d, B:18:0x0050, B:21:0x0055, B:23:0x0060, B:26:0x0065, B:29:0x006e, B:32:0x0076, B:34:0x007d, B:38:0x0085, B:42:0x00a8, B:45:0x00be, B:71:0x018a, B:73:0x0193, B:75:0x019d, B:76:0x01b3, B:81:0x01bc, B:84:0x01c3, B:87:0x01cb, B:90:0x01d3, B:93:0x01dc, B:95:0x01f3, B:98:0x01fa, B:101:0x0207, B:102:0x0218, B:104:0x0229, B:106:0x0233, B:107:0x023a, B:109:0x023e, B:110:0x0242, B:112:0x024a, B:113:0x024e, B:116:0x0255, B:124:0x01a3, B:126:0x01a7, B:128:0x01ad, B:139:0x0260, B:140:0x0263, B:141:0x00b5, B:142:0x009f, B:47:0x00cf, B:50:0x00d8, B:53:0x00df, B:56:0x00e6, B:58:0x0109, B:59:0x011d, B:61:0x0123, B:65:0x012f, B:67:0x013a, B:69:0x0140, B:70:0x0146), top: B:2:0x000b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0109 A[Catch: all -> 0x0118, TryCatch #0 {all -> 0x0118, blocks: (B:47:0x00cf, B:50:0x00d8, B:53:0x00df, B:56:0x00e6, B:58:0x0109, B:59:0x011d, B:61:0x0123, B:65:0x012f, B:67:0x013a, B:69:0x0140, B:70:0x0146), top: B:46:0x00cf, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a A[Catch: all -> 0x0118, TryCatch #0 {all -> 0x0118, blocks: (B:47:0x00cf, B:50:0x00d8, B:53:0x00df, B:56:0x00e6, B:58:0x0109, B:59:0x011d, B:61:0x0123, B:65:0x012f, B:67:0x013a, B:69:0x0140, B:70:0x0146), top: B:46:0x00cf, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0193 A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:3:0x000b, B:5:0x0012, B:7:0x0023, B:10:0x002c, B:14:0x0033, B:17:0x005d, B:18:0x0050, B:21:0x0055, B:23:0x0060, B:26:0x0065, B:29:0x006e, B:32:0x0076, B:34:0x007d, B:38:0x0085, B:42:0x00a8, B:45:0x00be, B:71:0x018a, B:73:0x0193, B:75:0x019d, B:76:0x01b3, B:81:0x01bc, B:84:0x01c3, B:87:0x01cb, B:90:0x01d3, B:93:0x01dc, B:95:0x01f3, B:98:0x01fa, B:101:0x0207, B:102:0x0218, B:104:0x0229, B:106:0x0233, B:107:0x023a, B:109:0x023e, B:110:0x0242, B:112:0x024a, B:113:0x024e, B:116:0x0255, B:124:0x01a3, B:126:0x01a7, B:128:0x01ad, B:139:0x0260, B:140:0x0263, B:141:0x00b5, B:142:0x009f, B:47:0x00cf, B:50:0x00d8, B:53:0x00df, B:56:0x00e6, B:58:0x0109, B:59:0x011d, B:61:0x0123, B:65:0x012f, B:67:0x013a, B:69:0x0140, B:70:0x0146), top: B:2:0x000b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bc A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:3:0x000b, B:5:0x0012, B:7:0x0023, B:10:0x002c, B:14:0x0033, B:17:0x005d, B:18:0x0050, B:21:0x0055, B:23:0x0060, B:26:0x0065, B:29:0x006e, B:32:0x0076, B:34:0x007d, B:38:0x0085, B:42:0x00a8, B:45:0x00be, B:71:0x018a, B:73:0x0193, B:75:0x019d, B:76:0x01b3, B:81:0x01bc, B:84:0x01c3, B:87:0x01cb, B:90:0x01d3, B:93:0x01dc, B:95:0x01f3, B:98:0x01fa, B:101:0x0207, B:102:0x0218, B:104:0x0229, B:106:0x0233, B:107:0x023a, B:109:0x023e, B:110:0x0242, B:112:0x024a, B:113:0x024e, B:116:0x0255, B:124:0x01a3, B:126:0x01a7, B:128:0x01ad, B:139:0x0260, B:140:0x0263, B:141:0x00b5, B:142:0x009f, B:47:0x00cf, B:50:0x00d8, B:53:0x00df, B:56:0x00e6, B:58:0x0109, B:59:0x011d, B:61:0x0123, B:65:0x012f, B:67:0x013a, B:69:0x0140, B:70:0x0146), top: B:2:0x000b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f3 A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:3:0x000b, B:5:0x0012, B:7:0x0023, B:10:0x002c, B:14:0x0033, B:17:0x005d, B:18:0x0050, B:21:0x0055, B:23:0x0060, B:26:0x0065, B:29:0x006e, B:32:0x0076, B:34:0x007d, B:38:0x0085, B:42:0x00a8, B:45:0x00be, B:71:0x018a, B:73:0x0193, B:75:0x019d, B:76:0x01b3, B:81:0x01bc, B:84:0x01c3, B:87:0x01cb, B:90:0x01d3, B:93:0x01dc, B:95:0x01f3, B:98:0x01fa, B:101:0x0207, B:102:0x0218, B:104:0x0229, B:106:0x0233, B:107:0x023a, B:109:0x023e, B:110:0x0242, B:112:0x024a, B:113:0x024e, B:116:0x0255, B:124:0x01a3, B:126:0x01a7, B:128:0x01ad, B:139:0x0260, B:140:0x0263, B:141:0x00b5, B:142:0x009f, B:47:0x00cf, B:50:0x00d8, B:53:0x00df, B:56:0x00e6, B:58:0x0109, B:59:0x011d, B:61:0x0123, B:65:0x012f, B:67:0x013a, B:69:0x0140, B:70:0x0146), top: B:2:0x000b, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        boolean z;
        boolean z2;
        UpcomingIndicatorView upcomingIndicatorView;
        UpcomingIndicatorView upcomingIndicatorView2;
        LinearLayout linearLayout;
        DonutVideoUiModel a2;
        gqs0 gqs0Var;
        String str;
        azn a3;
        FrameLayout frameLayout;
        VideoFile A;
        String string;
        VideoItemListSettings videoItemListSettings = this.m;
        Trace.beginSection("VideoItemListLargeVh.bindData");
        try {
            super.N6(uIBlock);
            if (!(uIBlock instanceof UIBlockVideo)) {
                Trace.endSection();
                return;
            }
            UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
            VideoFile videoFile = uIBlockVideo.B;
            m(videoFile);
            UIBlockVideo.ItemViewContentDescription itemViewContentDescription = ((UIBlockVideo) uIBlock).F;
            if (itemViewContentDescription != null) {
                int i = itemViewContentDescription.b;
                FrameLayout frameLayout2 = this.t;
                FrameLayout frameLayout3 = frameLayout2 == null ? null : frameLayout2;
                List<String> list = itemViewContentDescription.c;
                if (list != null) {
                    if (frameLayout2 == null) {
                        frameLayout2 = null;
                    }
                    Context context = frameLayout2.getContext();
                    String[] strArr = (String[]) list.toArray(new String[0]);
                    string = context.getString(i, Arrays.copyOf(strArr, strArr.length));
                    if (string != null) {
                        frameLayout3.setContentDescription(string);
                    }
                }
                FrameLayout frameLayout4 = this.t;
                if (frameLayout4 == null) {
                    frameLayout4 = null;
                }
                string = frameLayout4.getContext().getString(i);
                frameLayout3.setContentDescription(string);
            }
            FrameLayout frameLayout5 = this.t;
            if (frameLayout5 == null) {
                frameLayout5 = null;
            }
            bwt0.r0(videoItemListSettings.b() ? -2 : -1, frameLayout5);
            AspectRatioFrameLayout aspectRatioFrameLayout = this.G;
            if (aspectRatioFrameLayout == null) {
                aspectRatioFrameLayout = null;
            }
            try {
                if (!videoItemListSettings.b() && !videoItemListSettings.e) {
                    z = false;
                    aspectRatioFrameLayout.setAspectRation(videoItemListSettings.c);
                    ViewGroup.LayoutParams layoutParams = aspectRatioFrameLayout.getLayoutParams();
                    layoutParams.width = videoItemListSettings.a;
                    layoutParams.height = videoItemListSettings.b;
                    aspectRatioFrameLayout.setLayoutParams(layoutParams);
                    com.vk.catalog2.common.ui.holders.video.info_overlays.a aVar = this.a0;
                    bwt0.e0(aspectRatioFrameLayout, !z ? 0 : iah0.a(aVar.c()), iah0.a(aVar.e()), !z ? 0 : iah0.a(aVar.c()), iah0.a(aVar.e()));
                    Trace.beginSection("VideoItemListLargeVh.bindPreviewOptimized");
                    bpn0 bpn0Var = VideoOverlayView.I;
                    VKImageView vKImageView = this.I;
                    VKImageView vKImageView2 = vKImageView == null ? vKImageView : null;
                    VideoOverlayView videoOverlayView = this.J;
                    VideoOverlayView videoOverlayView2 = videoOverlayView != null ? null : videoOverlayView;
                    DurationView durationView = this.D;
                    DurationView durationView2 = durationView == null ? durationView : null;
                    c cVar = new c(1, this.c0, g.class, "set", "set(Lio/reactivex/rxjava3/disposables/Disposable;)Z", 8);
                    boolean c2 = fxc0.B().c(videoFile);
                    VideoRestriction O = videoFile.O();
                    com.vk.libvideo.design.view.overlay.b a4 = O == null ? ((a390) this.T.getValue()).a(O) : null;
                    if (!videoFile.d8() && !videoFile.z0()) {
                        z2 = false;
                        VideoPipStateHolder.a.getClass();
                        yg5 c3 = VideoPipStateHolder.c();
                        VideoOverlayView.b.a(new VideoOverlayView.a(vKImageView2, videoOverlayView2, new dp0(24, this, videoFile), cVar, durationView2, false, false, c2, new icn0(videoFile, 10), new l(24, this, videoFile), a4, z2, epx.f((c3 != null || (A = c3.A()) == null) ? null : A.a1(), videoFile.a1()), new q6s0(this, 2), (i1t0) this.U.getValue(), null, 65696));
                        s3q0 s3q0Var = s3q0.a;
                        Trace.endSection();
                        int k1 = (videoFile.z0() || videoFile.Na() <= 0) ? (this.d0 || videoFile.k1() <= 0) ? 0 : videoFile.k1() : (int) videoFile.Na();
                        upcomingIndicatorView = this.v;
                        if (upcomingIndicatorView == null) {
                            upcomingIndicatorView = null;
                        }
                        upcomingIndicatorView.setVisibility((k1 == 0 && this.e0) ? 0 : 8);
                        upcomingIndicatorView2 = this.v;
                        if (upcomingIndicatorView2 == null) {
                            upcomingIndicatorView2 = null;
                        }
                        upcomingIndicatorView2.setUpcoming(k1);
                        linearLayout = this.s;
                        if (linearLayout == null) {
                            linearLayout = null;
                        }
                        linearLayout.setVisibility(!aVar.d() ? 0 : 8);
                        a2 = ((l5o) this.k0.getValue()).a(nkt0.a(videoFile), DonutVideoCardSource.LARGE_CARD);
                        if (a2 != null && (a3 = k5o.a(a2)) != null) {
                            zyn zynVar = (zyn) this.m0.getValue();
                            frameLayout = this.t;
                            if (frameLayout == null) {
                                frameLayout = null;
                            }
                            gqs0Var = new gqs0(zynVar.a(a3, frameLayout.getContext(), this.n0));
                            aVar.a(videoFile, uIBlock, gqs0Var);
                            n((UIBlockVideo) uIBlock);
                            h(a2);
                            UIBlockVideo.DynamicPollData dynamicPollData = uIBlockVideo.O;
                            if (this.f0) {
                                kis0 kis0Var = (kis0) this.h0.getValue();
                                if (dynamicPollData != null) {
                                    kis0Var.getClass();
                                    str = dynamicPollData.b;
                                } else {
                                    str = null;
                                }
                                kis0Var.d = str;
                                if (str == null) {
                                    kis0Var.a();
                                } else {
                                    String a1 = videoFile.a1();
                                    VideoFile videoFile2 = kis0Var.c;
                                    if (!epx.f(a1, videoFile2 != null ? videoFile2.a1() : null)) {
                                        kis0Var.c = videoFile;
                                        kis0Var.a.a();
                                    }
                                }
                            }
                            return;
                        }
                        gqs0Var = null;
                        aVar.a(videoFile, uIBlock, gqs0Var);
                        n((UIBlockVideo) uIBlock);
                        h(a2);
                        UIBlockVideo.DynamicPollData dynamicPollData2 = uIBlockVideo.O;
                        if (this.f0) {
                        }
                        return;
                    }
                    z2 = true;
                    VideoPipStateHolder.a.getClass();
                    yg5 c32 = VideoPipStateHolder.c();
                    VideoOverlayView.b.a(new VideoOverlayView.a(vKImageView2, videoOverlayView2, new dp0(24, this, videoFile), cVar, durationView2, false, false, c2, new icn0(videoFile, 10), new l(24, this, videoFile), a4, z2, epx.f((c32 != null || (A = c32.A()) == null) ? null : A.a1(), videoFile.a1()), new q6s0(this, 2), (i1t0) this.U.getValue(), null, 65696));
                    s3q0 s3q0Var2 = s3q0.a;
                    Trace.endSection();
                    if (videoFile.z0()) {
                    }
                    upcomingIndicatorView = this.v;
                    if (upcomingIndicatorView == null) {
                    }
                    upcomingIndicatorView.setVisibility((k1 == 0 && this.e0) ? 0 : 8);
                    upcomingIndicatorView2 = this.v;
                    if (upcomingIndicatorView2 == null) {
                    }
                    upcomingIndicatorView2.setUpcoming(k1);
                    linearLayout = this.s;
                    if (linearLayout == null) {
                    }
                    linearLayout.setVisibility(!aVar.d() ? 0 : 8);
                    a2 = ((l5o) this.k0.getValue()).a(nkt0.a(videoFile), DonutVideoCardSource.LARGE_CARD);
                    if (a2 != null) {
                        zyn zynVar2 = (zyn) this.m0.getValue();
                        frameLayout = this.t;
                        if (frameLayout == null) {
                        }
                        gqs0Var = new gqs0(zynVar2.a(a3, frameLayout.getContext(), this.n0));
                        aVar.a(videoFile, uIBlock, gqs0Var);
                        n((UIBlockVideo) uIBlock);
                        h(a2);
                        UIBlockVideo.DynamicPollData dynamicPollData22 = uIBlockVideo.O;
                        if (this.f0) {
                        }
                        return;
                    }
                    gqs0Var = null;
                    aVar.a(videoFile, uIBlock, gqs0Var);
                    n((UIBlockVideo) uIBlock);
                    h(a2);
                    UIBlockVideo.DynamicPollData dynamicPollData222 = uIBlockVideo.O;
                    if (this.f0) {
                    }
                    return;
                }
                bpn0 bpn0Var2 = VideoOverlayView.I;
                VKImageView vKImageView3 = this.I;
                if (vKImageView3 == null) {
                }
                VideoOverlayView videoOverlayView3 = this.J;
                if (videoOverlayView3 != null) {
                }
                DurationView durationView3 = this.D;
                if (durationView3 == null) {
                }
                c cVar2 = new c(1, this.c0, g.class, "set", "set(Lio/reactivex/rxjava3/disposables/Disposable;)Z", 8);
                boolean c22 = fxc0.B().c(videoFile);
                VideoRestriction O2 = videoFile.O();
                if (O2 == null) {
                }
                if (!videoFile.d8()) {
                    z2 = false;
                    VideoPipStateHolder.a.getClass();
                    yg5 c322 = VideoPipStateHolder.c();
                    VideoOverlayView.b.a(new VideoOverlayView.a(vKImageView2, videoOverlayView2, new dp0(24, this, videoFile), cVar2, durationView2, false, false, c22, new icn0(videoFile, 10), new l(24, this, videoFile), a4, z2, epx.f((c322 != null || (A = c322.A()) == null) ? null : A.a1(), videoFile.a1()), new q6s0(this, 2), (i1t0) this.U.getValue(), null, 65696));
                    s3q0 s3q0Var22 = s3q0.a;
                    Trace.endSection();
                    if (videoFile.z0()) {
                    }
                    upcomingIndicatorView = this.v;
                    if (upcomingIndicatorView == null) {
                    }
                    upcomingIndicatorView.setVisibility((k1 == 0 && this.e0) ? 0 : 8);
                    upcomingIndicatorView2 = this.v;
                    if (upcomingIndicatorView2 == null) {
                    }
                    upcomingIndicatorView2.setUpcoming(k1);
                    linearLayout = this.s;
                    if (linearLayout == null) {
                    }
                    linearLayout.setVisibility(!aVar.d() ? 0 : 8);
                    a2 = ((l5o) this.k0.getValue()).a(nkt0.a(videoFile), DonutVideoCardSource.LARGE_CARD);
                    if (a2 != null) {
                    }
                    gqs0Var = null;
                    aVar.a(videoFile, uIBlock, gqs0Var);
                    n((UIBlockVideo) uIBlock);
                    h(a2);
                    UIBlockVideo.DynamicPollData dynamicPollData2222 = uIBlockVideo.O;
                    if (this.f0) {
                    }
                    return;
                }
                z2 = true;
                VideoPipStateHolder.a.getClass();
                yg5 c3222 = VideoPipStateHolder.c();
                VideoOverlayView.b.a(new VideoOverlayView.a(vKImageView2, videoOverlayView2, new dp0(24, this, videoFile), cVar2, durationView2, false, false, c22, new icn0(videoFile, 10), new l(24, this, videoFile), a4, z2, epx.f((c3222 != null || (A = c3222.A()) == null) ? null : A.a1(), videoFile.a1()), new q6s0(this, 2), (i1t0) this.U.getValue(), null, 65696));
                s3q0 s3q0Var222 = s3q0.a;
                Trace.endSection();
                if (videoFile.z0()) {
                }
                upcomingIndicatorView = this.v;
                if (upcomingIndicatorView == null) {
                }
                upcomingIndicatorView.setVisibility((k1 == 0 && this.e0) ? 0 : 8);
                upcomingIndicatorView2 = this.v;
                if (upcomingIndicatorView2 == null) {
                }
                upcomingIndicatorView2.setUpcoming(k1);
                linearLayout = this.s;
                if (linearLayout == null) {
                }
                linearLayout.setVisibility(!aVar.d() ? 0 : 8);
                a2 = ((l5o) this.k0.getValue()).a(nkt0.a(videoFile), DonutVideoCardSource.LARGE_CARD);
                if (a2 != null) {
                }
                gqs0Var = null;
                aVar.a(videoFile, uIBlock, gqs0Var);
                n((UIBlockVideo) uIBlock);
                h(a2);
                UIBlockVideo.DynamicPollData dynamicPollData22222 = uIBlockVideo.O;
                if (this.f0) {
                }
                return;
            } finally {
                Trace.endSection();
            }
            z = true;
            aspectRatioFrameLayout.setAspectRation(videoItemListSettings.c);
            ViewGroup.LayoutParams layoutParams2 = aspectRatioFrameLayout.getLayoutParams();
            layoutParams2.width = videoItemListSettings.a;
            layoutParams2.height = videoItemListSettings.b;
            aspectRatioFrameLayout.setLayoutParams(layoutParams2);
            com.vk.catalog2.common.ui.holders.video.info_overlays.a aVar2 = this.a0;
            bwt0.e0(aspectRatioFrameLayout, !z ? 0 : iah0.a(aVar2.c()), iah0.a(aVar2.e()), !z ? 0 : iah0.a(aVar2.c()), iah0.a(aVar2.e()));
            Trace.beginSection("VideoItemListLargeVh.bindPreviewOptimized");
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder
    public final View O3() {
        fqj fqjVar = this.C;
        if (fqjVar != null) {
            return fqjVar;
        }
        return null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder
    public final ActionLinkView Oi() {
        ActionLinkView actionLinkView = this.x;
        if (actionLinkView != null) {
            return actionLinkView;
        }
        return null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder
    public final fh5 Tl(VideoItemAutoPlayVh videoItemAutoPlayVh) {
        wqj wqjVar = new wqj(this.B, m33.a(R.drawable.vk_icon_mute_24, e43.a), m33.a(R.drawable.vk_icon_volume_20, e43.a), m33.a(R.drawable.vk_icon_subtitles_slash_24, e43.a), m33.a(R.drawable.vk_icon_subtitles_24, e43.a), null, null, 6552);
        VideoErrorView videoErrorView = this.y;
        VideoErrorView videoErrorView2 = videoErrorView != null ? videoErrorView : null;
        PlayButton playButton = this.z;
        PlayButton playButton2 = playButton != null ? playButton : null;
        fqj fqjVar = this.A;
        if (fqjVar == null) {
            fqjVar = null;
        }
        wfk0.a aVar = new wfk0.a(fqjVar);
        fqj fqjVar2 = this.C;
        fqj fqjVar3 = fqjVar2 != null ? fqjVar2 : null;
        xcs0 xcs0Var = this.w;
        xcs0 xcs0Var2 = xcs0Var != null ? xcs0Var : null;
        VKImageView vKImageView = this.I;
        VKImageView vKImageView2 = vKImageView != null ? vKImageView : null;
        DurationView durationView = this.D;
        DurationView durationView2 = durationView != null ? durationView : null;
        VideoTextureView videoTextureView = this.H;
        if (videoTextureView == null) {
            videoTextureView = null;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.G;
        if (aspectRatioFrameLayout == null) {
            aspectRatioFrameLayout = null;
        }
        ProgressBar progressBar = this.P;
        z3s0 z3s0Var = this.V;
        SpectatorsCounterView spectatorsCounterView = this.E;
        SpectatorsCounterView spectatorsCounterView2 = spectatorsCounterView == null ? null : spectatorsCounterView;
        NoStyleSubtitleView noStyleSubtitleView = this.L;
        NoStyleSubtitleView noStyleSubtitleView2 = noStyleSubtitleView != null ? noStyleSubtitleView : null;
        VideoOverlayView videoOverlayView = this.J;
        VideoOverlayView videoOverlayView2 = videoOverlayView == null ? null : videoOverlayView;
        FrameLayout frameLayout = this.K;
        FrameLayout frameLayout2 = frameLayout == null ? null : frameLayout;
        ActionLinkView actionLinkView = this.x;
        ActionLinkView actionLinkView2 = actionLinkView != null ? actionLinkView : null;
        VideoAdLayout videoAdLayout = this.M;
        return new fh5(videoItemAutoPlayVh, videoTextureView, aspectRatioFrameLayout, this.r0, vKImageView2, playButton2, null, xcs0Var2, progressBar, z3s0Var, aVar, null, fqjVar3, durationView2, null, noStyleSubtitleView2, videoOverlayView2, videoErrorView2, frameLayout2, spectatorsCounterView2, true, actionLinkView2, videoAdLayout == null ? null : videoAdLayout, wqjVar, null, this.O, null, null, null, this.F, 1551893152, 15);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder
    public final LinearLayout Ug() {
        return this.N;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder
    public final ProgressBar Zb() {
        return this.P;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh
    public final float c() {
        return this.r0;
    }

    public final void g(FrameLayout frameLayout) {
        VideoTextureView videoTextureView = new VideoTextureView(frameLayout.getContext(), null, 6, 0);
        videoTextureView.i(TransformController.ScaleType.CROP, false);
        videoTextureView.setId(R.id.video_display);
        this.H = videoTextureView;
        frameLayout.addView(videoTextureView, new FrameLayout.LayoutParams(-1, -2));
    }

    public final void h(DonutVideoUiModel donutVideoUiModel) {
        CharSequence charSequence;
        DonutVideoUiModel.PreviewBadge previewBadge = donutVideoUiModel != null ? donutVideoUiModel.b : null;
        if (previewBadge == null) {
            DonutBadge donutBadge = this.Q;
            (donutBadge != null ? donutBadge : null).setVisibility(8);
            return;
        }
        DonutBadge donutBadge2 = this.Q;
        if (donutBadge2 == null) {
            donutBadge2 = null;
        }
        DonutPriceTemplate donutPriceTemplate = previewBadge.c;
        if (donutPriceTemplate != null) {
            FrameLayout frameLayout = this.t;
            if (frameLayout == null) {
                frameLayout = null;
            }
            charSequence = y1o.b(donutPriceTemplate, frameLayout.getContext());
        } else {
            charSequence = previewBadge.b;
        }
        donutBadge2.setText(charSequence);
        DonutBadge donutBadge3 = this.Q;
        if (donutBadge3 == null) {
            donutBadge3 = null;
        }
        donutBadge3.setContentDescription(previewBadge.d);
        DonutBadge donutBadge4 = this.Q;
        if (donutBadge4 == null) {
            donutBadge4 = null;
        }
        donutBadge4.setVisibility(0);
        DonutBadge donutBadge5 = this.Q;
        if (donutBadge5 == null) {
            donutBadge5 = null;
        }
        bwt0.i0(donutBadge5, new h57(28, this, previewBadge));
        DurationView durationView = this.D;
        (durationView != null ? durationView : null).setVisibility(0);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder
    public final xcs0 hg() {
        xcs0 xcs0Var = this.w;
        if (xcs0Var != null) {
            return xcs0Var;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void k(DonutVideoAction donutVideoAction, DonutVideoClickSource donutVideoClickSource) {
        FrameLayout frameLayout = this.t;
        if (frameLayout == null) {
            frameLayout = null;
        }
        Activity a2 = VideoItemVh.a(frameLayout);
        if (donutVideoAction == null || a2 == null) {
            return;
        }
        ((x4o) this.l0.getValue()).a(donutVideoAction, a2, new a5o(new a5o.a(DonutVideoScreenSource.VK_VIDEO.h(), donutVideoClickSource.h()), 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0537, code lost:
    
        if (r0 != 4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0549, code lost:
    
        if (((r0 != null ? r0.s : null) instanceof xsna.ozh0) != false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0580 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0583 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Drawable drawable;
        FrameLayout frameLayout;
        Context context = layoutInflater.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new RecyclerView.p(-1, -2));
        linearLayout.setOrientation(1);
        this.u = linearLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.content);
        frameLayout2.setLayoutParams(new RecyclerView.p(-1, -2));
        frameLayout2.setForeground(m33.a(R.drawable.highlight, context));
        frameLayout2.addView(linearLayout);
        this.t = frameLayout2;
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(context, null, 6);
        this.G = aspectRatioFrameLayout;
        a.b bVar = a.b.a;
        a aVar = this.o;
        if (epx.f(aVar, bVar)) {
            FrameLayout frameLayout3 = new FrameLayout(aspectRatioFrameLayout.getContext());
            frameLayout3.setBackgroundColor(-16777216);
            g(frameLayout3);
            aspectRatioFrameLayout.addView(frameLayout3, new FrameLayout.LayoutParams(-1, -1));
        } else {
            if (!epx.f(aVar, a.C0509a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            g(aspectRatioFrameLayout);
        }
        FrameLayout frameLayout4 = new FrameLayout(aspectRatioFrameLayout.getContext());
        frameLayout4.setId(R.id.video_inline_live_holder);
        f4m.j(frameLayout4);
        this.K = frameLayout4;
        aspectRatioFrameLayout.addView(frameLayout4, new FrameLayout.LayoutParams(-1, -1));
        NoStyleSubtitleView noStyleSubtitleView = new NoStyleSubtitleView(aspectRatioFrameLayout.getContext(), null);
        noStyleSubtitleView.setId(R.id.video_subtitles);
        f4m.j(noStyleSubtitleView);
        this.L = noStyleSubtitleView;
        aspectRatioFrameLayout.addView(noStyleSubtitleView, new FrameLayout.LayoutParams(-1, -1));
        VKImageView b2 = this.b0.b(aspectRatioFrameLayout.getContext());
        this.I = b2;
        aspectRatioFrameLayout.addView(b2);
        VideoItemListSettings videoItemListSettings = this.m;
        int i = 8;
        if (videoItemListSettings.f) {
            ProgressBar progressBar = new ProgressBar(aspectRatioFrameLayout.getContext(), null, 0, android.R.style.Widget.ProgressBar.Horizontal);
            progressBar.setId(R.id.video_progress);
            progressBar.setIndeterminate(false);
            progressBar.setLayoutParams(new FrameLayout.LayoutParams(-1, iah0.a(6.0f), 80));
            Context context2 = progressBar.getContext();
            e3m.a aVar2 = e3m.a;
            progressBar.setProgressDrawable(m33.a(R.drawable.video_progress_redesign, context2));
            float f = -1;
            f4m.u(progressBar, iah0.a(f), 0, iah0.a(f), iah0.a(f));
            progressBar.setVisibility(8);
            this.P = progressBar;
            aspectRatioFrameLayout.addView(progressBar);
        }
        VideoOverlayView videoOverlayView = new VideoOverlayView(aspectRatioFrameLayout.getContext(), VideoOverlayView.VideoRestrictionSize.SMALL);
        videoOverlayView.setId(R.id.catalog_video_large_item_overlay);
        f4m.j(videoOverlayView);
        this.J = videoOverlayView;
        aspectRatioFrameLayout.addView(videoOverlayView, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout2 = new LinearLayout(aspectRatioFrameLayout.getContext());
        linearLayout2.setId(R.id.duration_holder);
        f4m.j(linearLayout2);
        this.s = linearLayout2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        float f2 = 8;
        int a2 = iah0.a(f2);
        layoutParams.setMargins(a2, a2, a2, a2);
        layoutParams.gravity = 8388693;
        s3q0 s3q0Var = s3q0.a;
        aspectRatioFrameLayout.addView(linearLayout2, layoutParams);
        LinearLayout linearLayout3 = this.s;
        if (linearLayout3 == null) {
            linearLayout3 = null;
        }
        LinearLayout linearLayout4 = this.s;
        if (linearLayout4 == null) {
            linearLayout4 = null;
        }
        ImageView imageView = new ImageView(linearLayout4.getContext());
        Drawable a3 = m33.a(R.drawable.vk_icon_music_note_12, imageView.getContext());
        if (a3 != null) {
            ColorStateList valueOf = ColorStateList.valueOf(-1);
            uko.a aVar3 = uko.a;
            drawable = a3.mutate();
            drawable.setTintList(valueOf);
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        imageView.setId(R.id.music_note);
        f4m.j(imageView);
        this.F = imageView;
        imageView.setBackground(m33.a(R.drawable.bg_left_round_corner_overlay_primary, imageView.getContext()));
        float f3 = 4;
        f4m.x(iah0.a(f3), imageView);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 16;
        linearLayout3.addView(imageView, layoutParams2);
        LinearLayout linearLayout5 = this.s;
        if (linearLayout5 == null) {
            linearLayout5 = null;
        }
        LinearLayout linearLayout6 = this.s;
        if (linearLayout6 == null) {
            linearLayout6 = null;
        }
        DurationView durationView = new DurationView(linearLayout6.getContext(), null, 6);
        durationView.setId(R.id.duration);
        f4m.j(durationView);
        this.D = durationView;
        linearLayout5.addView(durationView, new LinearLayout.LayoutParams(-2, -2));
        LinearLayout linearLayout7 = this.s;
        if (linearLayout7 == null) {
            linearLayout7 = null;
        }
        LinearLayout linearLayout8 = this.s;
        if (linearLayout8 == null) {
            linearLayout8 = null;
        }
        SpectatorsCounterView spectatorsCounterView = new SpectatorsCounterView(linearLayout8.getContext(), null, 6);
        spectatorsCounterView.setId(R.id.spectators);
        f4m.j(spectatorsCounterView);
        this.E = spectatorsCounterView;
        linearLayout7.addView(spectatorsCounterView, new LinearLayout.LayoutParams(-2, -1));
        cqj cqjVar = new cqj(aspectRatioFrameLayout.getContext());
        cqjVar.setGravity(1);
        cqjVar.setId(R.id.control_description_message);
        this.B = cqjVar;
        f4m.j(cqjVar);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 1;
        aspectRatioFrameLayout.addView(cqjVar, layoutParams3);
        fqj fqjVar = new fqj(aspectRatioFrameLayout.getContext());
        ?? r7 = this.W;
        nqj nqjVar = (nqj) r7.getValue();
        nqjVar.c.add(new WeakReference(fqjVar));
        bwt0.g(fqjVar, new cy0(i, fqjVar, nqjVar));
        fqjVar.setId(R.id.sound_control);
        f4m.j(fqjVar);
        this.A = fqjVar;
        float f4 = 48;
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iah0.a(f4), iah0.a(f4));
        layoutParams4.gravity = 8388661;
        aspectRatioFrameLayout.addView(fqjVar, layoutParams4);
        fqj fqjVar2 = new fqj(aspectRatioFrameLayout.getContext());
        nqj nqjVar2 = (nqj) r7.getValue();
        nqjVar2.c.add(new WeakReference(fqjVar2));
        bwt0.g(fqjVar2, new cy0(i, fqjVar2, nqjVar2));
        fqjVar2.setId(R.id.video_subtitles_control);
        f4m.j(fqjVar2);
        this.C = fqjVar2;
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iah0.a(f4), iah0.a(f4));
        layoutParams5.setMarginEnd(iah0.a(f4));
        layoutParams5.gravity = 8388661;
        aspectRatioFrameLayout.addView(fqjVar2, layoutParams5);
        xcs0 xcs0Var = new xcs0(aspectRatioFrameLayout.getContext(), new xcs0.c(this.n), new uh80(13), 6);
        xcs0Var.setId(R.id.video_complete_view);
        xcs0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        xcs0Var.setVisibility(8);
        this.w = xcs0Var;
        aspectRatioFrameLayout.addView(xcs0Var);
        UpcomingIndicatorView upcomingIndicatorView = new UpcomingIndicatorView(new ContextThemeWrapper(aspectRatioFrameLayout.getContext(), R.style.VkUiTypography_FootnoteMedium), null, 6, 0);
        upcomingIndicatorView.setId(R.id.video_upcoming_indicator);
        this.v = upcomingIndicatorView;
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        int a4 = iah0.a(f2);
        layoutParams6.setMargins(a4, a4, a4, a4);
        layoutParams6.gravity = 8388691;
        aspectRatioFrameLayout.addView(upcomingIndicatorView, layoutParams6);
        PlayButton playButton = new PlayButton(aspectRatioFrameLayout.getContext());
        playButton.setId(R.id.play);
        f4m.j(playButton);
        playButton.c = R.drawable.vk_icon_play_button_48;
        this.z = playButton;
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams7.gravity = 17;
        aspectRatioFrameLayout.addView(playButton, layoutParams7);
        VideoErrorView videoErrorView = new VideoErrorView(aspectRatioFrameLayout.getContext(), null, 6);
        videoErrorView.setId(R.id.error_view);
        videoErrorView.setShouldBindOnlyWhenVisible(fxc0.B().J().O());
        f4m.j(videoErrorView);
        this.y = videoErrorView;
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams8.gravity = 17;
        aspectRatioFrameLayout.addView(videoErrorView, layoutParams8);
        ActionLinkView actionLinkView = new ActionLinkView(new ContextThemeWrapper(aspectRatioFrameLayout.getContext(), R.style.VideoActionLink), null, 6);
        actionLinkView.setId(R.id.video_action_link_view);
        f4m.j(actionLinkView);
        this.x = actionLinkView;
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, iah0.a(30));
        int a5 = iah0.a(f2);
        layoutParams9.setMargins(a5, a5, a5, a5);
        layoutParams9.gravity = 8388691;
        aspectRatioFrameLayout.addView(actionLinkView, layoutParams9);
        VkContentBadge vkContentBadge = new VkContentBadge(aspectRatioFrameLayout.getContext(), null, 6);
        vkContentBadge.setId(R.id.video_pinned_badge);
        vkContentBadge.setSize(VkContentBadge.Size.Medium);
        vkContentBadge.setAppearance(VkContentBadge.Appearance.Design.Overlay);
        vkContentBadge.setMode(VkContentBadge.Mode.Primary);
        vkContentBadge.setVisibility(8);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams10.gravity = 8388659;
        int a6 = iah0.a(f2);
        layoutParams10.setMargins(a6, a6, a6, a6);
        vkContentBadge.setLayoutParams(layoutParams10);
        aspectRatioFrameLayout.addView(vkContentBadge);
        DonutBadge donutBadge = new DonutBadge(aspectRatioFrameLayout.getContext(), null, 6);
        donutBadge.setId(R.id.video_donut_chip_view);
        donutBadge.setTag("donut_badge_tag");
        f4m.j(donutBadge);
        this.Q = donutBadge;
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-2, -2);
        int a7 = iah0.a(f2);
        layoutParams11.setMargins(a7, a7, a7, a7);
        layoutParams11.gravity = 8388691;
        aspectRatioFrameLayout.addView(donutBadge, layoutParams11);
        VideoAdLayout videoAdLayout = new VideoAdLayout(aspectRatioFrameLayout.getContext(), null, 6);
        videoAdLayout.setId(R.id.video_large_item_instream_ad);
        f4m.j(videoAdLayout);
        this.M = videoAdLayout;
        aspectRatioFrameLayout.addView(videoAdLayout, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout9 = new LinearLayout(aspectRatioFrameLayout.getContext());
        linearLayout9.setOrientation(0);
        this.N = linearLayout9;
        int dimension = (int) linearLayout9.getContext().getResources().getDimension(R.dimen.video_catalog_snippet_margin_between_marks);
        int i2 = 0;
        while (i2 < 2) {
            TextView textView = (TextView) LayoutInflater.from(linearLayout9.getContext()).inflate(R.layout.catalog_vk_video_snippet_mark, (ViewGroup) this.N, false);
            textView.setTextAppearance(R.style.VkUiTypography_Caption1);
            textView.setVisibility(i);
            LinearLayout linearLayout10 = this.N;
            if (linearLayout10 != null) {
                LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams12.setMargins(0, 0, i2 == 1 ? 0 : dimension, 0);
                s3q0 s3q0Var2 = s3q0.a;
                linearLayout10.addView(textView, layoutParams12);
            }
            i2++;
            i = 8;
        }
        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-2, -2);
        int dimension2 = (int) aspectRatioFrameLayout.getResources().getDimension(R.dimen.video_catalog_snippet_inset);
        layoutParams13.setMargins(dimension2, dimension2, dimension2, dimension2);
        s3q0 s3q0Var3 = s3q0.a;
        aspectRatioFrameLayout.addView(linearLayout9, layoutParams13);
        if (videoItemListSettings.e) {
            aspectRatioFrameLayout.setBackgroundResource(R.drawable.background_borders);
        } else {
            aspectRatioFrameLayout.setBackgroundResource(R.drawable.background_rounded);
            bwt0.d(aspectRatioFrameLayout, this.r0, (r4 & 2) != 0, (r4 & 4) != 0);
        }
        linearLayout.addView(aspectRatioFrameLayout, new LinearLayout.LayoutParams(-1, -2));
        AdRedirectView adRedirectView = new AdRedirectView(context, null, 0, 14, 0);
        adRedirectView.setImageLoader(new jl80());
        adRedirectView.setTextColor(dhr0.Y(R.attr.vk_ui_text_primary, context));
        f4m.j(adRedirectView);
        this.O = adRedirectView;
        adRedirectView.setBackground(m33.a(R.drawable.ad_instream_redirect_btn_background, context));
        float f5 = 16;
        f4m.x(iah0.a(f5), adRedirectView);
        f4m.w(iah0.a(f5), adRedirectView);
        f4m.q(iah0.a(f3), adRedirectView);
        linearLayout.addView(adRedirectView, new LinearLayout.LayoutParams(-1, -2));
        AspectRatioFrameLayout aspectRatioFrameLayout2 = this.G;
        this.a0.b(layoutInflater, linearLayout, aspectRatioFrameLayout2 == null ? null : aspectRatioFrameLayout2, this, new fvq0(this, 7));
        if (((Boolean) this.p0.getValue()).booleanValue()) {
            int i3 = b.$EnumSwitchMapping$0[videoItemListSettings.d.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                    }
                }
            }
            frameLayout = this.t;
            if (frameLayout != null) {
                return null;
            }
            return frameLayout;
        }
        if (BuildInfo.s()) {
            u4a.a aVar4 = this.q;
        }
        VkViewStub vkViewStub = new VkViewStub(context, null, 6);
        f4m.j(vkViewStub);
        vkViewStub.setViewFactory(new ww(23, context, this));
        this.V = new z3s0(vkViewStub, (zet0) this.Z.getValue());
        FrameLayout frameLayout5 = this.t;
        if (frameLayout5 == null) {
            frameLayout5 = null;
        }
        frameLayout5.addView(vkViewStub, new FrameLayout.LayoutParams(-2, -2));
        frameLayout = this.t;
        if (frameLayout != null) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean l() {
        UIBlockVideo uIBlockVideo;
        VideoFile videoFile;
        Owner s;
        return (!((Boolean) this.o0.getValue()).booleanValue() || (uIBlockVideo = this.j) == null || (videoFile = uIBlockVideo.B) == null || (s = videoFile.s()) == null || !s.w) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void m(VideoFile videoFile) {
        l5u0 l5u0Var = (l5u0) this.i0.getValue();
        l5u0Var.getClass();
        UserId I0 = videoFile.I0();
        r11.b(new StringBuilder(), I0.b, '_', videoFile.o0());
        if (((Boolean) l5u0Var.b.invoke()).booleanValue()) {
            View view = (View) l5u0Var.a.invoke();
            Rect rect = l5u0Var.c;
            if (!view.getGlobalVisibleRect(rect) || rect.width() <= 0) {
                return;
            }
            rect.height();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder
    public final VideoErrorView m0() {
        VideoErrorView videoErrorView = this.y;
        if (videoErrorView != null) {
            return videoErrorView;
        }
        return null;
    }

    public final void n(UIBlockVideo uIBlockVideo) {
        LinearLayout linearLayout;
        List<String> list = uIBlockVideo.D;
        List<String> list2 = uIBlockVideo.D;
        if (list.isEmpty() || (linearLayout = this.N) == null || linearLayout.getChildCount() != 2) {
            return;
        }
        for (int i = 0; i < 2; i++) {
            LinearLayout linearLayout2 = this.N;
            TextView textView = (TextView) (linearLayout2 != null ? linearLayout2.getChildAt(i) : null);
            if (i < list2.size()) {
                textView.setText(list2.get(i));
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
    }

    public final void o(CommonVideoStat$CommunityClickInfo.Direction direction) {
        UserId userId;
        UIBlockVideo uIBlockVideo = this.j;
        Long valueOf = (uIBlockVideo == null || (userId = uIBlockVideo.g) == null) ? null : Long.valueOf(userId.b);
        boolean l = l();
        UIBlockVideo uIBlockVideo2 = this.j;
        String str = uIBlockVideo2 != null ? uIBlockVideo2.b : null;
        UiTracker uiTracker = UiTracker.a;
        new ejc(l, valueOf, str, UiTracker.c(), direction).q();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh, android.view.View.OnClickListener
    public final void onClick(View view) {
        VideoFile videoFile;
        Owner s;
        View view2;
        int id = view.getId();
        int i = 1;
        b5a b5aVar = this.b;
        if (id == R.id.like) {
            UIBlockVideo uIBlockVideo = this.j;
            if (uIBlockVideo == null || (view2 = this.X) == null) {
                return;
            }
            boolean O9 = uIBlockVideo.B.O9();
            boolean z = !O9;
            b5aVar.a(new cfp0(uIBlockVideo, new VideoAnalyticsInfo(!O9 ? VideoAnalyticsInfo.ClickTarget.Like : VideoAnalyticsInfo.ClickTarget.Unlike)));
            Set<View> set = g6z.a;
            g6z.c(view2, view2, z, this.p, 48);
            g7s0 B = fxc0.B();
            FrameLayout frameLayout = this.t;
            g7s0.C(B, (frameLayout != null ? frameLayout : null).getContext(), uIBlockVideo.B, uIBlockVideo.f, new uzv(view2, O9, i), 8);
            return;
        }
        if (id != R.id.avatar_hover && id != R.id.avatar) {
            if (id == R.id.episodes) {
                d(view, this.j, b5aVar);
                return;
            } else {
                super.onClick(view);
                return;
            }
        }
        if (!((Boolean) this.q0.getValue()).booleanValue() || !l()) {
            o(CommonVideoStat$CommunityClickInfo.Direction.TO_AUTHOR);
            super.onClick(view);
            return;
        }
        rls0 rls0Var = new rls0(i, this, view);
        Activity a2 = VideoItemVh.a(view);
        UIBlockVideo uIBlockVideo2 = this.j;
        UserId userId = (uIBlockVideo2 == null || (videoFile = uIBlockVideo2.B) == null || (s = videoFile.s()) == null) ? null : s.b;
        if (a2 == null || userId == null) {
            return;
        }
        ydt0 Y = fxc0.B().Y();
        UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
        Y.q(a2, userId, uiTrackingScreen != null ? uiTrackingScreen.a : null, rls0Var);
    }
}
