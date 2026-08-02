package com.vk.video.ui.discovery.minimizable;

import android.content.SharedPreferences;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.domain.video.DonutVideoModel;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.ads.PixelStats;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.OfferVkVideo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.music.Artist;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.uxpolls.UxPoll;
import com.vk.dto.video.Doc2DocItem;
import com.vk.dto.video.VideoAlbum;
import com.vk.dto.video.VideoAlbumType;
import com.vk.dto.video.VideoSeason;
import com.vk.libvideo.adfree.api.domain.objects.VideoAdFreeTrapEventTrigger;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.api.ad.a;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.api.di.VideoPlaylistReversionComponent;
import com.vk.libvideo.api.minimizable.DiscoveryAction;
import com.vk.libvideo.api.minimizable.TypeScreen;
import com.vk.libvideo.api.minimizable.VideoMinimizableScreenArgs;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vk.libvideo.api.seek.tracker.VideoSeekEventScreenMode;
import com.vk.libvideo.api.seek.tracker.VideoSeekEventSource;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.models.comment.ReplyInfo;
import com.vk.libvideo.tracker.VideoPlayerMode;
import com.vk.libvideo.video.queue.api.di.VideoQueueComponent;
import com.vk.libvideo.video.queue.api.model.VideoApplyNewVideoSourceType;
import com.vk.libvideo.video.queue.api.model.recommendations.VideoRecommendationVideosType;
import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosLoopMode;
import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosOrder;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.network.kbh.state.NetworkState;
import com.vk.stat.scheme.CommonStat$TypeCommonEventItem;
import com.vk.stat.scheme.CommonVideoAdsStat$TypeOverlayAdClose;
import com.vk.stat.scheme.CommonVideoStat$TypeNextVideoAnnouncement;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoMusicTrackAdd;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoMusicTrackAddLogIn;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoMusicTrackAddSuccess;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoMusicTrackCardOpenPlaylist;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoMusicTrackDelete;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoPlayerMusicTrackClick;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoPlayerMusicTrackView;
import com.vk.stat.scheme.CommonVideoStat$TypeVsidItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreSettingsStat$SettingNetworkType;
import com.vk.stat.scheme.MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset;
import com.vk.stat.scheme.MobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeAdsBottomBanner;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeVideoMiniplayerItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vk.stat.scheme.t0;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import com.vk.video.recast.domain.model.PlaybackSnapshot;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogSourceArgs;
import com.vk.video.ui.discovery.catalog.a;
import com.vk.video.ui.discovery.catalog.b;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoverySideEffect;
import com.vk.video.ui.discovery.minimizable.announce.VideoAnnounceState;
import com.vk.video.ui.discovery.minimizable.announce.author.AuthorAnnounceMode;
import com.vk.video.ui.discovery.minimizable.announce.author.AuthorAnnounceState;
import com.vk.video.ui.discovery.minimizable.announce.author.AuthorFullscreenSession;
import com.vk.video.ui.discovery.minimizable.b;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.dialog.VideoDialogType;
import com.vk.video.ui.discovery.minimizable.fullscreen_lock.FullscreenLockState;
import com.vk.video.ui.discovery.minimizable.fullscreen_lock.b;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Landscape;
import com.vk.video.ui.discovery.minimizable.n;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerProgress;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerStatInfo;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerState;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerStatus;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.discovery.minimizable.q;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs;
import com.vk.video.ui.discovery.minimizable.related_videos.c;
import com.vk.video.ui.discovery.minimizable.related_videos.data.VideoRelatedVideosPagingType;
import com.vk.video.ui.discovery.minimizable.related_videos.h;
import com.vk.video.ui.discovery.minimizable.related_videos.m;
import com.vk.video.ui.discovery.minimizable.related_videos.o;
import com.vk.video.ui.discovery.minimizable.tracker.VideoQualityTracker;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsRepository;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsSourceArgs;
import com.vk.video.ui.discovery.recommendations.a;
import com.vk.video.ui.discovery.recommendations.b;
import com.vkontakte.android.VKApplication;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.core.a0;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import io.reactivex.rxjava3.internal.operators.completable.w;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.random.Random;
import org.chromium.base.TimeUtils;
import xsna.a0m0;
import xsna.a2s0;
import xsna.a7f0;
import xsna.acb0;
import xsna.aer0;
import xsna.afl0;
import xsna.ahn;
import xsna.ai90;
import xsna.an80;
import xsna.arm0;
import xsna.asp;
import xsna.att0;
import xsna.aus0;
import xsna.b0a;
import xsna.b25;
import xsna.bbx0;
import xsna.be50;
import xsna.bek0;
import xsna.bnc0;
import xsna.bpn0;
import xsna.btl0;
import xsna.bvt0;
import xsna.byb;
import xsna.c5g;
import xsna.c71;
import xsna.c80;
import xsna.cgs0;
import xsna.csf0;
import xsna.cus0;
import xsna.cw50;
import xsna.cxd0;
import xsna.cyh0;
import xsna.d120;
import xsna.d220;
import xsna.d3j0;
import xsna.d5s0;
import xsna.d6q0;
import xsna.dac0;
import xsna.dcy;
import xsna.dnz;
import xsna.dz2;
import xsna.e43;
import xsna.e4s0;
import xsna.e5s0;
import xsna.eeh0;
import xsna.een0;
import xsna.efr0;
import xsna.efs0;
import xsna.eis0;
import xsna.epx;
import xsna.eqy;
import xsna.eyp0;
import xsna.ezs0;
import xsna.f4z;
import xsna.fbj0;
import xsna.fgs0;
import xsna.fks0;
import xsna.fos0;
import xsna.fpe0;
import xsna.fpf0;
import xsna.fvq0;
import xsna.fvr;
import xsna.fw3;
import xsna.fwr0;
import xsna.fxc0;
import xsna.fxi0;
import xsna.fyd0;
import xsna.g500;
import xsna.g620;
import xsna.ghn0;
import xsna.gqh0;
import xsna.gsi0;
import xsna.gsq0;
import xsna.gus0;
import xsna.gwn0;
import xsna.gzs;
import xsna.h0w0;
import xsna.h440;
import xsna.h7v;
import xsna.hdi0;
import xsna.hfs0;
import xsna.hfz;
import xsna.hg1;
import xsna.hij0;
import xsna.hmq0;
import xsna.hsf0;
import xsna.hxr0;
import xsna.hyu;
import xsna.i0b0;
import xsna.i0q0;
import xsna.i31;
import xsna.i4s0;
import xsna.i8c0;
import xsna.ian;
import xsna.ie40;
import xsna.irk;
import xsna.isb0;
import xsna.ius0;
import xsna.izs;
import xsna.j500;
import xsna.j5g;
import xsna.j6l0;
import xsna.j79;
import xsna.je0;
import xsna.jo60;
import xsna.jsf0;
import xsna.k5j0;
import xsna.k7l0;
import xsna.k9x;
import xsna.kwc;
import xsna.kxa0;
import xsna.kxr0;
import xsna.l31;
import xsna.l4k0;
import xsna.l5o;
import xsna.lav;
import xsna.lgs0;
import xsna.lhg;
import xsna.ljs;
import xsna.lkz;
import xsna.ltt0;
import xsna.lyl0;
import xsna.lyr0;
import xsna.m3y;
import xsna.m5t0;
import xsna.mct0;
import xsna.mdk0;
import xsna.mgs0;
import xsna.mll0;
import xsna.ms9;
import xsna.msy;
import xsna.mzp0;
import xsna.n85;
import xsna.n8c0;
import xsna.nkt0;
import xsna.nlf0;
import xsna.nvm0;
import xsna.o25;
import xsna.oan0;
import xsna.omk0;
import xsna.onm0;
import xsna.oos0;
import xsna.oq80;
import xsna.orj0;
import xsna.osk0;
import xsna.p1p0;
import xsna.pgn;
import xsna.pm90;
import xsna.pps;
import xsna.pu50;
import xsna.pwm0;
import xsna.q34;
import xsna.q4s0;
import xsna.q520;
import xsna.q5t0;
import xsna.q7a0;
import xsna.q8i0;
import xsna.qcy;
import xsna.qd0;
import xsna.qgs0;
import xsna.qh3;
import xsna.qu5;
import xsna.qw40;
import xsna.qyi0;
import xsna.r0r0;
import xsna.r1s0;
import xsna.r4k;
import xsna.r770;
import xsna.r8a0;
import xsna.rbt0;
import xsna.rdi;
import xsna.rl3;
import xsna.ro5;
import xsna.rqs0;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sdz;
import xsna.skj0;
import xsna.sts0;
import xsna.swe0;
import xsna.sxl0;
import xsna.sxr0;
import xsna.t3b;
import xsna.t5t0;
import xsna.tci;
import xsna.tfx;
import xsna.u3r0;
import xsna.u4;
import xsna.u4s0;
import xsna.u9t0;
import xsna.uft0;
import xsna.v3l;
import xsna.v8f0;
import xsna.v9a;
import xsna.veg0;
import xsna.vhs0;
import xsna.vit0;
import xsna.vnb0;
import xsna.vqs0;
import xsna.vts0;
import xsna.vvs0;
import xsna.vyr0;
import xsna.vz9;
import xsna.w4t0;
import xsna.w6;
import xsna.waf0;
import xsna.wbs0;
import xsna.wc0;
import xsna.wep0;
import xsna.wgs0;
import xsna.whd;
import xsna.whe;
import xsna.wjs0;
import xsna.wk50;
import xsna.wm8;
import xsna.x4r0;
import xsna.x6t0;
import xsna.x8p;
import xsna.xa9;
import xsna.xh5;
import xsna.xl50;
import xsna.xlq0;
import xsna.xvr0;
import xsna.xx40;
import xsna.y37;
import xsna.y4;
import xsna.ye0;
import xsna.yet0;
import xsna.yfb;
import xsna.yfs0;
import xsna.yg5;
import xsna.yh1;
import xsna.yts0;
import xsna.yyl0;
import xsna.zet0;
import xsna.znk0;
import xsna.zrp;
import xsna.zst0;
import xsna.zts0;

/* compiled from: VideoMinimizableDiscoveryFeature.kt */
/* loaded from: classes7.dex */
public final class g extends wk50<s, q, com.vk.video.ui.discovery.minimizable.c, n> {
    public static final /* synthetic */ qcy<Object>[] t0;
    public final l5o A;
    public final bpn0 B;
    public final wc0 C;
    public final boolean D;
    public final ian E;
    public final w6 F;
    public final irk G;
    public final Object H;
    public final bpn0 I;
    public final f4z<VideoMinimizableDiscoverySideEffect> J;
    public final d5s0 K;
    public final e5s0 L;
    public final com.vk.video.ui.discovery.recommendations.b M;
    public final com.vk.video.ui.discovery.catalog.b N;
    public final Object O;
    public final io.reactivex.rxjava3.subjects.d<Optional<VideoFile>> P;
    public final io.reactivex.rxjava3.subjects.d<com.vk.video.ui.discovery.minimizable.related_videos.h> Q;
    public final Object R;
    public final r1s0 S;
    public final e4s0 T;
    public final VideoQualityTracker U;
    public final hsf0 V;
    public final u4 W;
    public final pwm0 X;
    public boolean Y;
    public final com.vk.video.ui.discovery.minimizable.fullscreen_lock.a Z;
    public final io.reactivex.rxjava3.subjects.d<VideoPlayerState> a0;
    public final fgs0 b0;
    public final h c0;
    public final io.reactivex.rxjava3.subjects.d<lgs0> d0;
    public final io.reactivex.rxjava3.subjects.d<yfs0> e0;
    public final fks0 f;
    public final sts0 f0;
    public final vit0 g;
    public final bpn0 g0;
    public final vvs0 h;
    public final bpn0 h0;
    public final p i;
    public final a i0;
    public final com.vk.video.kidsprofile.restricteduseractions.a j;
    public io.reactivex.rxjava3.disposables.c j0;
    public final VideoPlaylistReversionComponent k;
    public io.reactivex.rxjava3.disposables.c k0;
    public final VideoAdvertisementsRepository l;
    public final Object l0;
    public final lyr0 m;
    public final pgn m0;
    public final i4s0 n;
    public boolean n0;
    public final x4r0 o;
    public final io.reactivex.rxjava3.subjects.d<Boolean> o0;
    public final VideoQueueComponent p;
    public final b.d p0;
    public final boolean q;
    public final bpn0 q0;
    public final bbx0 r;
    public final Object r0;
    public final h0w0 s;
    public final io.reactivex.rxjava3.subjects.d<Boolean> s0;
    public final m5t0 t;
    public final zet0 u;
    public final jsf0 v;
    public final b25 w;
    public final hfs0 x;
    public final ro5 y;
    public final VideoMinimizablePlayerComponent z;

    /* compiled from: VideoMinimizableDiscoveryFeature.kt */
    public final class a {
        public a() {
        }

        public final io.reactivex.rxjava3.core.q<List<hfz>> a(izs<? super VideoFile, ? extends List<? extends io.reactivex.rxjava3.core.q<List<hfz>>>> izsVar) {
            return g.this.P.s0(new cyh0(new byb(izsVar, 3), 6));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoMinimizableDiscoveryFeature.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b AUTO;
        public static final b CLICK;
        public static final b CLICK_ANNOUNCE;

        static {
            b bVar = new b("CLICK", 0);
            CLICK = bVar;
            b bVar2 = new b("CLICK_ANNOUNCE", 1);
            CLICK_ANNOUNCE = bVar2;
            b bVar3 = new b("AUTO", 2);
            AUTO = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoMinimizableDiscoveryFeature.kt */
    public static final class c {
        public final yfs0 a;
        public final List<Doc2DocItem> b;
        public final VideoDiscoveryCatalogRepository$Section c;
        public final List<VideoDiscoveryCatalogRepository$Section> d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(yfs0 yfs0Var, List<? extends Doc2DocItem> list, VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section, List<VideoDiscoveryCatalogRepository$Section> list2) {
            this.a = yfs0Var;
            this.b = list;
            this.c = videoDiscoveryCatalogRepository$Section;
            this.d = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            int a = fw3.a(this.a.hashCode() * 31, 31, this.b);
            VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = this.c;
            int hashCode = (a + (videoDiscoveryCatalogRepository$Section == null ? 0 : videoDiscoveryCatalogRepository$Section.hashCode())) * 31;
            List<VideoDiscoveryCatalogRepository$Section> list = this.d;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UnpackedCatalogPage(catalogState=");
            sb.append(this.a);
            sb.append(", newVideos=");
            sb.append(this.b);
            sb.append(", loadedSection=");
            sb.append(this.c);
            sb.append(", newTabs=");
            return ms9.a(')', sb, this.d);
        }
    }

    /* compiled from: VideoMinimizableDiscoveryFeature.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TypeScreen.values().length];
            try {
                iArr[TypeScreen.DISCOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypeScreen.FULLSCREEN_PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TypeScreen.FULLSCREEN_LANDSCAPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VideoMinimizableDiscoveryFeature.kt */
    public static final class e implements fos0 {
        public e() {
        }

        @Override // xsna.fos0
        public final void a() {
            g.this.J.b(VideoMinimizableDiscoverySideEffect.p.e.a);
        }

        @Override // xsna.fos0
        public final void b() {
            oos0 x = com.vk.toggle.d.x();
            if (x != null ? x.c : false) {
                g.this.C(c.c0.b);
            }
        }

        @Override // xsna.fos0
        public final void c() {
            g.this.J.b(new VideoMinimizableDiscoverySideEffect.p.b());
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(g.class, "networkStatusSubscription", "getNetworkStatusSubscription()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        t0 = new qcy[]{mutablePropertyReference1Impl};
    }

    public g() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r5v18, types: [T, com.vk.dto.common.id.UserId] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(ezs0 ezs0Var, VideoDiscoveryRecommendationsRepository videoDiscoveryRecommendationsRepository, com.vk.video.ui.discovery.catalog.d dVar, eis0 eis0Var, bpn0 bpn0Var, fks0 fks0Var, VideoMinimizableDiscoverySavedState videoMinimizableDiscoverySavedState, vit0 vit0Var, vvs0 vvs0Var, com.vk.video.kidsprofile.restricteduseractions.a aVar, VideoPlaylistReversionComponent videoPlaylistReversionComponent, u9t0 u9t0Var, VideoAdvertisementsRepository videoAdvertisementsRepository, lyr0 lyr0Var, i4s0 i4s0Var, x4r0 x4r0Var, VideoQueueComponent videoQueueComponent, boolean z, bbx0 bbx0Var, h0w0 h0w0Var, m5t0 m5t0Var, zet0 zet0Var, jsf0 jsf0Var, sdz sdzVar, b25 b25Var, hfs0 hfs0Var, h7v h7vVar, ro5 ro5Var, VideoMinimizablePlayerComponent videoMinimizablePlayerComponent, l5o l5oVar, bpn0 bpn0Var2, wc0 wc0Var, boolean z2, ian ianVar, w6 w6Var, irk irkVar, Lazy lazy, vyr0 vyr0Var, bpn0 bpn0Var3) {
        super(new c.o(videoMinimizableDiscoverySavedState), r3);
        MiniPlayerControllersWrapper.VideoInfo videoInfo;
        p pVar = new p(videoMinimizableDiscoverySavedState);
        this.f = fks0Var;
        this.g = vit0Var;
        this.h = vvs0Var;
        this.i = pVar;
        this.j = aVar;
        this.k = videoPlaylistReversionComponent;
        this.l = videoAdvertisementsRepository;
        this.m = lyr0Var;
        this.n = i4s0Var;
        this.o = x4r0Var;
        this.p = videoQueueComponent;
        this.q = z;
        this.r = bbx0Var;
        this.s = h0w0Var;
        this.t = m5t0Var;
        this.u = zet0Var;
        this.v = jsf0Var;
        this.w = b25Var;
        this.x = hfs0Var;
        this.y = ro5Var;
        this.z = videoMinimizablePlayerComponent;
        this.A = l5oVar;
        this.B = bpn0Var2;
        this.C = wc0Var;
        this.D = z2;
        this.E = ianVar;
        this.F = w6Var;
        this.G = irkVar;
        this.H = lazy;
        this.I = bpn0Var3;
        this.J = new f4z<>();
        d5s0 d5s0Var = new d5s0(lyr0Var, vyr0Var);
        this.K = d5s0Var;
        this.L = new e5s0();
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        this.M = new com.vk.video.ui.discovery.recommendations.b(videoDiscoveryRecommendationsRepository, bVar, new aer0(this, 2));
        this.N = new com.vk.video.ui.discovery.catalog.b(dVar, bVar, new vhs0(this, 1));
        ghn0 ghn0Var = new ghn0(this, 10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.O = msy.a(lazyThreadSafetyMode, ghn0Var);
        cgs0 cgs0Var = new cgs0(new uft0());
        io.reactivex.rxjava3.subjects.d<Optional<VideoFile>> O0 = io.reactivex.rxjava3.subjects.d.O0(Optional.ofNullable((videoMinimizableDiscoverySavedState == null || (videoInfo = videoMinimizableDiscoverySavedState.b) == null) ? null : videoInfo.b));
        this.P = O0;
        this.Q = io.reactivex.rxjava3.subjects.d.O0(h.d.a);
        this.R = msy.a(lazyThreadSafetyMode, new fyd0(this, 19));
        this.S = new r1s0();
        this.T = new e4s0();
        this.U = new VideoQualityTracker();
        this.V = new hsf0();
        this.W = new u4(1);
        pwm0 pwm0Var = new pwm0(new gsq0(this, 2), new skj0(this, 12), fks0Var);
        this.X = pwm0Var;
        this.Z = new com.vk.video.ui.discovery.minimizable.fullscreen_lock.a(new r4k(this));
        io.reactivex.rxjava3.subjects.d<VideoPlayerState> O02 = io.reactivex.rxjava3.subjects.d.O0(new VideoPlayerState(VideoPlayerStatus.Loading.b, new VideoPlayerProgress.Vod(0L, 0L), null, null, 12, null));
        this.a0 = O02;
        this.b0 = new fgs0(new wgs0(vit0Var, ezs0Var, eis0Var, u9t0Var, videoAdvertisementsRepository, lyr0Var, jsf0Var, aVar, cgs0Var), fxc0.B().J().j0(), z, x4r0Var.b, pwm0Var, sdzVar, b25Var, l5oVar, h7vVar, new gus0(this), d5s0Var);
        this.c0 = fxc0.B().J().e0().a ? new h(this) : null;
        io.reactivex.rxjava3.subjects.d<lgs0> O03 = io.reactivex.rxjava3.subjects.d.O0(lgs0.b.a);
        this.d0 = O03;
        io.reactivex.rxjava3.subjects.d<yfs0> O04 = io.reactivex.rxjava3.subjects.d.O0(new yfs0.b(null));
        this.e0 = O04;
        this.f0 = new sts0(new rqs0(this, 1), new dac0(this, 28));
        this.g0 = new bpn0(new i8c0(10));
        this.h0 = new bpn0(new mll0(this, 14));
        this.i0 = new a();
        this.l0 = msy.a(lazyThreadSafetyMode, new gqh0(this, 15));
        this.m0 = new pgn();
        Boolean bool = Boolean.FALSE;
        this.o0 = io.reactivex.rxjava3.subjects.d.O0(bool);
        this.p0 = com.vk.toggle.b.A.i(VideoFeatures.VIDEO_RETRANSLATION_POPUP);
        this.q0 = new bpn0(new d3j0(this, 15));
        this.r0 = msy.a(lazyThreadSafetyMode, new jo60(20));
        this.s0 = io.reactivex.rxjava3.subjects.d.O0(bool);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = b25Var.c();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = b25Var.b();
        this.e.b(b25Var.m(false).U(new gwn0(new pps(this, ref$BooleanRef, ref$ObjectRef, 5), 6)).subscribe(new hmq0(new q8i0(this, 21), 2)));
        this.e.b(hg1.h(((vqs0) bpn0Var.getValue()).a(), new cus0(this, 0)));
        i0 i0Var = new i0(O0, new oq80(new l4k0(8), 12));
        kxa0 kxa0Var = new kxa0(new c80(4), 13);
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        io.reactivex.rxjava3.core.q<R> s0 = new y(i0Var, qVar, kxa0Var).s0(new a0m0(new fvq0(this, 8), 9));
        s0.getClass();
        b.a aVar2 = io.reactivex.rxjava3.internal.functions.b.a;
        this.e.b(new y(s0, qVar, aVar2).subscribe(new lkz(new r0r0(this, 8), 28)));
        a7f0.a.e(this, O0, null, new j6l0(this, 18), null, null, 13);
        this.e.b(O03.subscribe(new wbs0(new bnc0(this, 22), 1)));
        this.e.b(O04.subscribe(new qw40(new sxl0(this, 8), 26)));
        io.reactivex.rxjava3.core.q m = io.reactivex.rxjava3.core.q.m(O0, new y(O02, qVar, new dnz(new whd(7), 24)), new n8c0(new v3l(4), 13));
        m.getClass();
        a7f0.a.e(this, new y(m, qVar, aVar2), null, new efr0(this, 5), null, null, 13);
        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        com.vk.core.utils.newtork.b.a.getClass();
        ref$BooleanRef2.element = com.vk.core.utils.newtork.b.d();
        a7f0.a.e(this, new y(com.vk.core.utils.newtork.b.d.U(new cxd0(new wep0(4), 12)), qVar, aVar2), null, new r770(10, this, ref$BooleanRef2), null, null, 13);
        this.e.b(wjs0.b.b0(sxr0.class).L(new pu50(new q520(28), 16), false).subscribe(new xvr0(new i0b0(this, 28), 2)));
    }

    public static boolean H0(VideoMinimizableState videoMinimizableState, VideoMinimizableState videoMinimizableState2, AuthorFullscreenSession authorFullscreenSession) {
        if (((videoMinimizableState2 instanceof VideoMinimizableState.FullscreenVertical) && !((VideoMinimizableState.FullscreenVertical) videoMinimizableState2).b) || (videoMinimizableState2 instanceof VideoMinimizableState.FullscreenHorizontal)) {
            return true;
        }
        if (videoMinimizableState2 instanceof VideoMinimizableState.Animating) {
            return (authorFullscreenSession != null && authorFullscreenSession.b) || com.vk.libvideo.api.minimizable.a.g(videoMinimizableState);
        }
        return false;
    }

    public static AuthorAnnounceState Q0(q qVar, VideoFile videoFile) {
        Owner s;
        Owner s2;
        VideoAnnounceState videoAnnounceState = qVar.o;
        VideoAnnounceState.Shown shown = videoAnnounceState instanceof VideoAnnounceState.Shown ? (VideoAnnounceState.Shown) videoAnnounceState : null;
        if (shown != null) {
            VideoFile videoFile2 = shown.b;
            UserId userId = (videoFile2 == null || (s2 = videoFile2.s()) == null) ? null : s2.b;
            UserId userId2 = (videoFile == null || (s = videoFile.s()) == null) ? null : s.b;
            if (userId != null && userId2 != null && userId.equals(userId2)) {
                return shown.f;
            }
        }
        return null;
    }

    public static void Y0(g gVar, q qVar, VideoMinimizableState videoMinimizableState, boolean z, int i) {
        AboutVideoItem.c.a aVar;
        xl50 eVar;
        if ((i & 2) != 0) {
            videoMinimizableState = qVar.n;
        }
        if ((i & 4) != 0) {
            z = qVar.l.f;
        }
        i31 i31Var = qVar.u;
        if (i31Var == null || (aVar = i31Var.a) == null) {
            List<hfz> list = qVar.f;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof AboutVideoItem.c.a) {
                    arrayList.add(obj);
                }
            }
            aVar = (AboutVideoItem.c.a) j5g.a0(arrayList);
        }
        if (aVar != null) {
            if (videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical) {
                eVar = new n.g0(aVar, (z || ((VideoMinimizableState.FullscreenVertical) videoMinimizableState).b) ? false : true);
            } else if (videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal) {
                eVar = new n.y(aVar, (z || ((VideoMinimizableState.FullscreenHorizontal) videoMinimizableState).c) ? false : true);
            } else {
                eVar = videoMinimizableState instanceof VideoMinimizableState.Animating ? n.i.b : new n.e(false);
            }
            gVar.T(eVar);
        }
    }

    public static void b1(g gVar, q qVar, VideoMinimizableState videoMinimizableState, boolean z, VideoPlayerStatus videoPlayerStatus, int i) {
        xl50 gVar2;
        if ((i & 2) != 0) {
            videoMinimizableState = qVar.n;
        }
        if ((i & 4) != 0) {
            z = qVar.l.f;
        }
        if ((i & 8) != 0) {
            videoPlayerStatus = qVar.l.d.b;
        }
        List<hfz> list = qVar.f;
        boolean z2 = qVar.z;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AboutVideoItem.q.b) {
                arrayList.add(obj);
            }
        }
        AboutVideoItem.q.b bVar = (AboutVideoItem.q.b) j5g.a0(arrayList);
        boolean z3 = false;
        boolean z4 = (z || com.vk.video.ui.discovery.minimizable.player.b.a(videoPlayerStatus)) ? false : true;
        if (bVar == null) {
            if (qVar.y != null) {
                gVar.T(new n.g(false));
                return;
            }
            return;
        }
        if (videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical) {
            gVar2 = new n.a0(bVar, false, (!z4 || ((VideoMinimizableState.FullscreenVertical) videoMinimizableState).b || z2) ? false : true);
        } else if (videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal) {
            if (z4 && !((VideoMinimizableState.FullscreenHorizontal) videoMinimizableState).c && !z2) {
                z3 = true;
            }
            gVar2 = new n.a0(bVar, true, z3);
        } else {
            gVar2 = videoMinimizableState instanceof VideoMinimizableState.Animating ? n.j.b : new n.g(false);
        }
        gVar.T(gVar2);
    }

    public static List c1(g gVar, q qVar, Boolean bool, Boolean bool2, int i) {
        Boolean bool3 = (i & 2) != 0 ? null : bool;
        Boolean bool4 = (i & 4) == 0 ? bool2 : null;
        gVar.getClass();
        List<hfz> list = qVar.f;
        AboutVideoItem.s x0 = x0(qVar);
        if (x0 == null) {
            return list;
        }
        int indexOf = list.indexOf(x0);
        ArrayList arrayList = new ArrayList(list);
        arrayList.set(indexOf, new AboutVideoItem.s(x0.b, x0.c, x0.d, x0.e, x0.f, x0.g, bool4 != null ? bool4.booleanValue() : x0.h, x0.i, x0.j, x0.k, bool3 != null ? bool3.booleanValue() : x0.l));
        return arrayList;
    }

    public static a2s0 w0(g gVar) {
        zst0 A0 = gVar.A0();
        if (A0 != null) {
            return A0.b(false, false);
        }
        return null;
    }

    public static AboutVideoItem.s x0(q qVar) {
        Object obj;
        Iterator<T> it = qVar.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((hfz) obj) instanceof AboutVideoItem.s) {
                break;
            }
        }
        if (obj instanceof AboutVideoItem.s) {
            return (AboutVideoItem.s) obj;
        }
        return null;
    }

    public final zst0 A0() {
        return (zst0) this.h0.getValue();
    }

    public final void B0(q qVar, c.C1974c c1974c) {
        yg5 yg5Var;
        T(new n.q(c1974c.b));
        if (this.f.L1() && c1974c.b && (qVar.n instanceof VideoMinimizableState.Collapsed) && epx.f(qVar.l.d.b, VideoPlayerStatus.AdPlaying.b)) {
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            xh5 xh5Var = b.C1208b.a().c;
            je0 N0 = (xh5Var == null || (yg5Var = xh5Var.a) == null) ? null : yg5Var.N0();
            Object j = N0 != null ? ((ye0.a) N0).j() : null;
            a.AbstractC1195a abstractC1195a = j instanceof a.AbstractC1195a ? (a.AbstractC1195a) j : null;
            this.J.b(new VideoMinimizableDiscoverySideEffect.p.g(N0, abstractC1195a != null ? abstractC1195a.c() : false));
        }
    }

    public final void C0(String str, boolean z) {
        if (fxc0.B().J().K().a) {
            ((v8f0) this.I.getValue()).b();
        }
    }

    public final void D0(List<UxPoll> list, boolean z) {
        if (z && fxc0.B().J().f1().c()) {
            return;
        }
        if (z || !fxc0.B().J().f1().b()) {
            j79 a2 = this.o.b.a();
            UxPollEntryPointLocation uxPollEntryPointLocation = UxPollEntryPointLocation.Discovery;
            UxPoll uxPoll = (UxPoll) j5g.a0(list);
            a2.getClass();
            io.reactivex.rxjava3.subjects.d dVar = (io.reactivex.rxjava3.subjects.d) a2.c;
            EnumMap enumMap = new EnumMap((Map) dVar.P0());
            enumMap.put((EnumMap) uxPollEntryPointLocation, (UxPollEntryPointLocation) uxPoll);
            dVar.onNext(enumMap);
        }
    }

    public final void E0(String str, boolean z) {
        if (fxc0.B().J().K().a) {
            ((v8f0) this.I.getValue()).a();
        }
    }

    public final void F0(q qVar, c.t tVar) {
        if (tVar.b == DiscoveryScreenMotionStates$Landscape.FullscreenWithSimilar) {
            T(n.i.b);
        }
        if (G0() && qVar.w.b) {
            T(new n.w(null, Boolean.FALSE, null, null, null, null, null, null, 253));
        }
    }

    public final boolean G0() {
        return this.f.f1().g;
    }

    public final void I0(q qVar, VideoMinimizableDiscoverySideEffect.Motion.MinimizeTrigger minimizeTrigger) {
        MiniPlayerControllersWrapper.VideoInfo videoInfo;
        VideoFile videoFile;
        boolean z = qVar.m.a;
        boolean T0 = T0(qVar);
        f4z<VideoMinimizableDiscoverySideEffect> f4zVar = this.J;
        if (T0 && (videoInfo = qVar.b) != null && (videoFile = videoInfo.b) != null && videoFile.W9() && !this.D) {
            f4zVar.b(VideoMinimizableDiscoverySideEffect.h.c.a);
            v0();
        } else {
            if (T0) {
                v0();
                return;
            }
            if (!z) {
                f4zVar.b(new VideoMinimizableDiscoverySideEffect.p.b());
                f4zVar.b(VideoMinimizableDiscoverySideEffect.Motion.c.a);
            } else if (com.vk.libvideo.api.minimizable.a.d(qVar.n)) {
                f4zVar.b(new VideoMinimizableDiscoverySideEffect.Motion.d(minimizeTrigger, 1));
            }
        }
    }

    public final void J0(VideoDiscoveryRecommendationsSourceArgs videoDiscoveryRecommendationsSourceArgs, VideoFile videoFile) {
        hg1.f(this.j0);
        if (videoDiscoveryRecommendationsSourceArgs == null || !(videoDiscoveryRecommendationsSourceArgs instanceof VideoDiscoveryRecommendationsSourceArgs.OfflineVideos)) {
            return;
        }
        io.reactivex.rxjava3.disposables.c subscribe = fxc0.B().s().B().subscribe(new eeh0(new isb0(12, this, videoFile), 14));
        this.e.b(subscribe);
        this.j0 = subscribe;
    }

    public final void K0(VideoDiscoveryRecommendationsSourceArgs videoDiscoveryRecommendationsSourceArgs) {
        qcy<Object>[] qcyVarArr = t0;
        qcy<Object> qcyVar = qcyVarArr[0];
        pgn pgnVar = this.m0;
        hg1.f((io.reactivex.rxjava3.disposables.c) pgnVar.b);
        this.j.getClass();
        if (videoDiscoveryRecommendationsSourceArgs == null || !(videoDiscoveryRecommendationsSourceArgs instanceof VideoDiscoveryRecommendationsSourceArgs.OfflineVideos)) {
            return;
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        com.vk.core.utils.newtork.b.a.getClass();
        ref$BooleanRef.element = com.vk.core.utils.newtork.b.d();
        io.reactivex.rxjava3.disposables.c subscribe = new y(com.vk.core.utils.newtork.b.d.U(new xx40(new oan0(8), 17)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new be50(new een0(8, ref$BooleanRef, this), 26));
        this.e.b(subscribe);
        qcy<Object> qcyVar2 = qcyVarArr[0];
        pgnVar.b(subscribe);
    }

    public final void L0(AboutVideoItem.a aVar) {
        String str;
        Long n;
        cw50 d2 = aVar.c.d();
        if (d2 == null || (str = d2.f) == null || (n = arm0.n(str)) == null || !((LinkedHashSet) this.W.b).add(n)) {
            return;
        }
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.BANNER, null, null, null, null, null, 62, null);
        MobileOfficialAppsVideoStat$TypeAdsBottomBanner.EventSubtype eventSubtype = MobileOfficialAppsVideoStat$TypeAdsBottomBanner.EventSubtype.SHOW;
        Long l = aVar.d;
        Long valueOf = aVar.e != null ? Long.valueOf(r1.intValue()) : null;
        String str2 = aVar.f;
        new bvt0(c2, SchemeStat$TypeView.a.b(schemeStat$EventItem, "", "", null, new MobileOfficialAppsVideoStat$TypeAdsBottomBanner(eventSubtype, null, n, l, valueOf, str2 != null ? new CommonVideoStat$TypeVsidItem(str2) : null), 8)).q();
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M0(q qVar, com.vk.video.ui.discovery.minimizable.related_videos.h hVar, com.vk.video.ui.discovery.minimizable.related_videos.h hVar2, boolean z) {
        Integer num;
        com.vk.video.ui.discovery.minimizable.related_videos.h hVar3;
        int i;
        VideoFile videoFile;
        io.reactivex.rxjava3.disposables.c cVar;
        VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs;
        Integer num2;
        mct0 e2;
        boolean z2;
        io.reactivex.rxjava3.disposables.c cVar2;
        int i2;
        int i3;
        VideoRelatedVideosOrder videoRelatedVideosOrder;
        com.vk.video.ui.discovery.minimizable.related_videos.h hVar4 = hVar2;
        if (hVar4 instanceof h.a) {
            hVar4 = h.a.h((h.a) hVar4, null, null, 0, null, null, null, null, null, null, false, false, z, 2047);
        }
        if (!q4s0.a.b()) {
            zst0 A0 = A0();
            if (A0 != null) {
                A0.e(hVar4 instanceof h.a ? (h.a) hVar4 : null);
            }
            boolean z3 = hVar4 instanceof h.a;
            VideoQueueComponent videoQueueComponent = this.p;
            if (z3) {
                h.a aVar = (h.a) hVar4;
                VideoAlbum a2 = com.vk.video.ui.discovery.minimizable.related_videos.g.a(aVar.h);
                att0 z9 = videoQueueComponent.z9();
                int i4 = a2.b;
                long j = a2.c.b;
                List<VideoSeason> list = a2.q;
                VideoRelatedVideosLoopMode videoRelatedVideosLoopMode = aVar.i;
                VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs2 = qVar.c;
                VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist = videoDiscoveryRelatedVideosSourceArgs2 instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist ? (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs2 : null;
                if (playlist == null || (videoRelatedVideosOrder = playlist.l) == null) {
                    videoRelatedVideosOrder = VideoRelatedVideosOrder.Original.b;
                }
                z9.d(new w4t0(i4, j, list, videoRelatedVideosLoopMode, videoRelatedVideosOrder, aVar.d, aVar.e));
            } else {
                videoQueueComponent.z9().d(null);
            }
        }
        this.Q.onNext(hVar4);
        T(new n.e0(hVar4));
        VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs3 = qVar.c;
        VideoMinimizableState videoMinimizableState = qVar.n;
        boolean z4 = videoDiscoveryRelatedVideosSourceArgs3 instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist;
        boolean z5 = hVar instanceof h.a;
        boolean z6 = !z5 && (hVar4 instanceof h.a) && ((videoDiscoveryRelatedVideosSourceArgs3 != null && com.vk.video.ui.discovery.minimizable.related_videos.f.b(videoDiscoveryRelatedVideosSourceArgs3) && this.f.X0()) || !(z4 && ((VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs3).k));
        boolean z7 = z5 && !(hVar4 instanceof h.a);
        f4z<VideoMinimizableDiscoverySideEffect> f4zVar = this.J;
        if (z6) {
            W0(videoMinimizableState, hVar4);
            f4zVar.b(VideoMinimizableDiscoverySideEffect.j.C1970j.a);
        } else if (z7) {
            f4zVar.b(VideoMinimizableDiscoverySideEffect.j.b.a);
        }
        VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist2 = z4 ? (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs3 : null;
        if (playlist2 != null) {
            Integer num3 = playlist2.h;
            num = Integer.valueOf(num3 != null ? num3.intValue() : playlist2.c);
        } else {
            num = null;
        }
        boolean z8 = hVar4 instanceof h.a;
        if (!z8 || num == null) {
            hVar3 = hVar4;
        } else {
            h.a aVar2 = (h.a) hVar4;
            VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource = aVar2.h;
            int i5 = aVar2.c;
            com.vk.video.ui.discovery.minimizable.related_videos.o oVar = aVar2.g;
            mct0 e3 = com.vk.video.ui.discovery.minimizable.related_videos.p.e(oVar, num.intValue());
            int i6 = -1;
            if (e3 != null ? mct0.f(e3, i5) : false) {
                i = 1;
                y0().d(qVar, VideoRelatedVideosPagingType.VideoQueue);
            } else {
                i = 1;
                int intValue = num.intValue();
                if (!(oVar instanceof o.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                mct0 mct0Var = (mct0) j5g.a0(((o.a) oVar).a);
                if (mct0Var != null && mct0Var.a == intValue && mct0Var.b.b == 0 && i5 + (-5) < 0) {
                    final com.vk.video.ui.discovery.minimizable.related_videos.e eVar = y0().i;
                    eVar.getClass();
                    final VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist3 = z4 ? (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs3 : null;
                    VideoDiscoveryRelatedVideosSource.Playlist playlist4 = videoDiscoveryRelatedVideosSource instanceof VideoDiscoveryRelatedVideosSource.Playlist ? (VideoDiscoveryRelatedVideosSource.Playlist) videoDiscoveryRelatedVideosSource : null;
                    if (playlist3 != null) {
                        VideoFile videoFile2 = playlist3.b;
                        if (playlist4 != null) {
                            List<VideoSeason> list2 = playlist4.b.q;
                            Iterator<VideoSeason> it = list2.iterator();
                            int i7 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    videoFile = videoFile2;
                                    hVar3 = hVar4;
                                    i7 = -1;
                                    break;
                                }
                                videoFile = videoFile2;
                                int i8 = it.next().b;
                                hVar3 = hVar4;
                                Integer num4 = playlist3.h;
                                if (num4 != null && i8 == num4.intValue()) {
                                    break;
                                }
                                i7++;
                                hVar4 = hVar3;
                                videoFile2 = videoFile;
                            }
                            final VideoSeason videoSeason = (VideoSeason) j5g.b0(i7 - 1, list2);
                            if (videoSeason != null && ((cVar = eVar.h) == null || cVar.h())) {
                                videoDiscoveryRelatedVideosSourceArgs = videoDiscoveryRelatedVideosSourceArgs3;
                                num2 = num;
                                eVar.h = hg1.i(x.A(new io.reactivex.rxjava3.internal.operators.single.b(new a0() { // from class: xsna.rgs0
                                    @Override // io.reactivex.rxjava3.core.a0
                                    public final void subscribe(io.reactivex.rxjava3.core.y yVar) {
                                        com.vk.video.ui.discovery.minimizable.related_videos.d dVar = com.vk.video.ui.discovery.minimizable.related_videos.e.this.b;
                                        VideoSeason videoSeason2 = videoSeason;
                                        int i9 = videoSeason2.b;
                                        int i10 = videoSeason2.d;
                                        iyd0 iyd0Var = new iyd0(yVar, 16);
                                        b8j0 b8j0Var = new b8j0(yVar, 14);
                                        int i11 = i10 > 50 ? i10 - 50 : 0;
                                        io.reactivex.rxjava3.disposables.c cVar3 = dVar.e;
                                        if (cVar3 != null) {
                                            cVar3.dispose();
                                        }
                                        dVar.e = io.reactivex.rxjava3.kotlin.c.e(dVar.c(playlist3, i9, i11, 50), new ehm0(iyd0Var, 10), new lwa(b8j0Var, dVar, i11));
                                    }
                                }), q5t0.a(eVar.a, videoSeason.b, playlist3.i, playlist3.j, false, videoFile.r(), com.vk.video.ui.discovery.minimizable.related_videos.f.a(playlist3)), q5t0.a(eVar.a, videoSeason.b, playlist3.i, playlist3.j, true, videoFile.r(), com.vk.video.ui.discovery.minimizable.related_videos.f.a(playlist3)), new osk0(new kxr0(1, videoSeason, eVar), 13)), new k7l0(eVar, 18));
                                e2 = com.vk.video.ui.discovery.minimizable.related_videos.p.e(oVar, num2.intValue());
                                if (e2 != null ? mct0.e(e2, i5) : false) {
                                    y0().c(qVar, VideoRelatedVideosPagingType.VideoQueue);
                                } else {
                                    int intValue2 = num2.intValue();
                                    if (!(oVar instanceof o.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    mct0 mct0Var2 = (mct0) j5g.k0(((o.a) oVar).a);
                                    if (mct0Var2 != null) {
                                        int i9 = mct0Var2.d;
                                        if (mct0Var2.a == intValue2 && mct0Var2.b.c >= i9) {
                                            rbt0 rbt0Var = (rbt0) j5g.k0(mct0Var2.e);
                                            if (rbt0Var != null) {
                                                i2 = i;
                                                if (rbt0Var.a() == i2) {
                                                    i3 = i2;
                                                    if (i3 != 0 && i5 + 5 > i9 - i2) {
                                                        z2 = true;
                                                        if (z2) {
                                                            final com.vk.video.ui.discovery.minimizable.related_videos.e eVar2 = y0().i;
                                                            eVar2.getClass();
                                                            final VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist5 = z4 ? (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs : null;
                                                            VideoDiscoveryRelatedVideosSource.Playlist playlist6 = videoDiscoveryRelatedVideosSource instanceof VideoDiscoveryRelatedVideosSource.Playlist ? (VideoDiscoveryRelatedVideosSource.Playlist) videoDiscoveryRelatedVideosSource : null;
                                                            if (playlist5 != null) {
                                                                VideoFile videoFile3 = playlist5.b;
                                                                if (playlist6 != null) {
                                                                    List<VideoSeason> list3 = playlist6.b.q;
                                                                    Iterator<VideoSeason> it2 = list3.iterator();
                                                                    int i10 = 0;
                                                                    while (true) {
                                                                        if (!it2.hasNext()) {
                                                                            break;
                                                                        }
                                                                        int i11 = it2.next().b;
                                                                        Integer num5 = playlist5.h;
                                                                        if (num5 != null && i11 == num5.intValue()) {
                                                                            i6 = i10;
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                    }
                                                                    final VideoSeason videoSeason2 = (VideoSeason) j5g.b0(i6 + 1, list3);
                                                                    if (videoSeason2 != null && ((cVar2 = eVar2.g) == null || cVar2.h())) {
                                                                        eVar2.g = hg1.i(x.A(new io.reactivex.rxjava3.internal.operators.single.b(new a0() { // from class: xsna.tgs0
                                                                            @Override // io.reactivex.rxjava3.core.a0
                                                                            public final void subscribe(io.reactivex.rxjava3.core.y yVar) {
                                                                                com.vk.video.ui.discovery.minimizable.related_videos.d dVar = com.vk.video.ui.discovery.minimizable.related_videos.e.this.b;
                                                                                int i12 = videoSeason2.b;
                                                                                qhg0 qhg0Var = new qhg0(yVar, 21);
                                                                                sgs0 sgs0Var = new sgs0(yVar, 0);
                                                                                io.reactivex.rxjava3.disposables.c cVar3 = dVar.d;
                                                                                if (cVar3 != null) {
                                                                                    cVar3.dispose();
                                                                                }
                                                                                dVar.d = io.reactivex.rxjava3.kotlin.c.e(dVar.c(playlist5, i12, 0, 50), new ece0(qhg0Var, 22), new dso0(sgs0Var, dVar));
                                                                            }
                                                                        }), q5t0.a(eVar2.a, videoSeason2.b, playlist5.i, playlist5.j, false, videoFile3.r(), com.vk.video.ui.discovery.minimizable.related_videos.f.a(playlist5)), q5t0.a(eVar2.a, videoSeason2.b, playlist5.i, playlist5.j, true, videoFile3.r(), com.vk.video.ui.discovery.minimizable.related_videos.f.a(playlist5)), new nlf0(new v9a(3, videoSeason2, eVar2), 11)), new h440(eVar2, 27));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                i2 = i;
                                            }
                                            i3 = 0;
                                            if (i3 != 0) {
                                                z2 = true;
                                                if (z2) {
                                                }
                                            }
                                        }
                                    }
                                    z2 = false;
                                    if (z2) {
                                    }
                                }
                            }
                            videoDiscoveryRelatedVideosSourceArgs = videoDiscoveryRelatedVideosSourceArgs3;
                            num2 = num;
                            e2 = com.vk.video.ui.discovery.minimizable.related_videos.p.e(oVar, num2.intValue());
                            if (e2 != null ? mct0.e(e2, i5) : false) {
                            }
                        }
                    }
                }
            }
            hVar3 = hVar4;
            videoDiscoveryRelatedVideosSourceArgs = videoDiscoveryRelatedVideosSourceArgs3;
            num2 = num;
            e2 = com.vk.video.ui.discovery.minimizable.related_videos.p.e(oVar, num2.intValue());
            if (e2 != null ? mct0.e(e2, i5) : false) {
            }
        }
        h.a aVar3 = z5 ? (h.a) hVar : null;
        h.a aVar4 = z8 ? (h.a) hVar3 : null;
        VideoRelatedVideosLoopMode videoRelatedVideosLoopMode2 = aVar3 != null ? aVar3.i : null;
        VideoRelatedVideosLoopMode videoRelatedVideosLoopMode3 = aVar4 != null ? aVar4.i : null;
        Boolean valueOf = aVar3 != null ? Boolean.valueOf(aVar3.j) : null;
        Boolean valueOf2 = aVar4 != null ? Boolean.valueOf(aVar4.j) : null;
        Boolean valueOf3 = aVar3 != null ? Boolean.valueOf(aVar3.k) : null;
        Boolean valueOf4 = aVar4 != null ? Boolean.valueOf(aVar4.k) : null;
        boolean z10 = videoMinimizableState instanceof VideoMinimizableState.Collapsed;
        if (videoRelatedVideosLoopMode2 != null && videoRelatedVideosLoopMode3 != null && videoRelatedVideosLoopMode2 != videoRelatedVideosLoopMode3) {
            f4zVar.b(new VideoMinimizableDiscoverySideEffect.c0(videoRelatedVideosLoopMode3));
            return;
        }
        if (valueOf != null && valueOf2 != null && !valueOf.equals(valueOf2)) {
            Boolean bool = Boolean.TRUE;
            if (valueOf2.equals(bool)) {
                f4zVar.b(VideoMinimizableDiscoverySideEffect.d0.a);
                return;
            } else {
                f4zVar.b(new VideoMinimizableDiscoverySideEffect.e0(epx.f(valueOf4, bool)));
                return;
            }
        }
        if (valueOf == null && epx.f(valueOf2, Boolean.TRUE) && !z10) {
            f4zVar.b(VideoMinimizableDiscoverySideEffect.d0.a);
        } else {
            if (valueOf3 == null || valueOf4 == null || valueOf3.equals(valueOf4)) {
                return;
            }
            f4zVar.b(new VideoMinimizableDiscoverySideEffect.e0(valueOf4.booleanValue()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:453:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:507:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x08a2  */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v37, types: [T, java.util.ArrayList] */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(q qVar, com.vk.video.ui.discovery.minimizable.c cVar) {
        Object obj;
        l31 a2;
        omk0 a3;
        PixelStats a4;
        VideoFile videoFile;
        VideoAnnounceState videoAnnounceState;
        VideoAnnounceState.Shown shown;
        int indexOf;
        List<hfz> list;
        boolean z;
        io.reactivex.rxjava3.disposables.c cVar2;
        io.reactivex.rxjava3.disposables.c cVar3;
        AboutVideoItem.d.c cVar4;
        AboutVideoItem.d.c cVar5;
        VideoFile videoFile2;
        a2s0 w0;
        VideoFile orElse;
        VideoRecommendationVideosType videoRecommendationVideosType;
        VideoPlayerStatInfo videoPlayerStatInfo;
        zst0 A0;
        VideoFile orElse2;
        q qVar2 = qVar;
        com.vk.video.ui.discovery.minimizable.c cVar6 = cVar;
        d5s0 d5s0Var = this.K;
        e5s0 e5s0Var = this.L;
        VideoAdvertisementsRepository videoAdvertisementsRepository = this.l;
        com.vk.video.ui.discovery.minimizable.fullscreen_lock.a aVar = this.Z;
        io.reactivex.rxjava3.subjects.d<Optional<VideoFile>> dVar = this.P;
        io.reactivex.rxjava3.subjects.d<VideoPlayerState> dVar2 = this.a0;
        irk irkVar = this.G;
        com.vk.video.ui.discovery.catalog.b bVar = this.N;
        wc0 wc0Var = this.C;
        pwm0 pwm0Var = this.X;
        f4z<VideoMinimizableDiscoverySideEffect> f4zVar = this.J;
        List<hfz> list2 = qVar2.f;
        FullscreenLockState fullscreenLockState = qVar2.t;
        VideoAnnounceState videoAnnounceState2 = qVar2.o;
        MiniPlayerControllersWrapper.VideoInfo videoInfo = qVar2.b;
        VideoMinimizableState videoMinimizableState = qVar2.n;
        if (cVar6 instanceof c.o) {
            VideoMinimizableDiscoverySavedState videoMinimizableDiscoverySavedState = ((c.o) cVar6).b;
            this.M.h = videoMinimizableDiscoverySavedState != null ? videoMinimizableDiscoverySavedState.e : null;
            bVar.f = videoMinimizableDiscoverySavedState != null ? videoMinimizableDiscoverySavedState.f : null;
            a aVar2 = this.i0;
            yyl0 yyl0Var = new yyl0(this, 13);
            qyi0 qyi0Var = new qyi0(this, 20);
            mdk0 mdk0Var = new mdk0(this, 14);
            g gVar = g.this;
            io.reactivex.rxjava3.core.q<List<hfz>> a5 = aVar2.a(new k7l0(gVar, 19));
            h hVar = g.this.c0;
            a7f0.a.e(gVar, znk0.P(a5, hVar, null), null, yyl0Var, new xlq0(4), null, 9);
            g gVar2 = g.this;
            a7f0.a.e(gVar2, znk0.P(aVar2.a(new waf0(gVar2, 22)), hVar, null), null, qyi0Var, new fxi0(9), null, 9);
            g gVar3 = g.this;
            a7f0.a.e(gVar3, znk0.P(aVar2.a(new lyl0(gVar3, 12)), hVar, null), null, mdk0Var, new eyp0(8), null, 9);
            com.vk.video.ui.discovery.minimizable.related_videos.k y0 = y0();
            VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs = videoMinimizableDiscoverySavedState != null ? videoMinimizableDiscoverySavedState.g : null;
            if (videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist) {
                y0.b(videoDiscoveryRelatedVideosSourceArgs);
            } else {
                y0.getClass();
            }
            if (videoMinimizableDiscoverySavedState != null) {
                f4zVar.b(VideoMinimizableDiscoverySideEffect.u.a);
                R0();
            }
            if (pwm0Var.c.R()) {
                pwm0Var.f = new i0(wjs0.b.b0(hxr0.class), new ie40(new hyu(23), 15)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new nvm0(new r8a0(pwm0Var, 27), 1), new ljs(new d220(21), 29));
            }
            if (G0()) {
                T(new n.w(Boolean.valueOf(irkVar.d()), null, null, null, null, null, null, null, 254));
                return;
            }
            return;
        }
        if (cVar6 instanceof c.b1) {
            c.b1 b1Var = (c.b1) cVar6;
            a1(videoInfo != null ? MiniPlayerControllersWrapper.VideoInfo.a(videoInfo, b1Var.b, null, null, 254) : null, false);
            if (p1p0.a(this.p0)) {
                final veg0 z0 = z0();
                VideoPlayerStatInfo videoPlayerStatInfo2 = dVar2.P0().d;
                String str = videoPlayerStatInfo2 != null ? videoPlayerStatInfo2.b : null;
                int duration = b1Var.b.getDuration();
                b0a b0aVar = (b0a) this.B.getValue();
                z0.getClass();
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"RETRANSLATION_UTILS", lhg.a(duration, "Binding new video with duration in seconds: ")});
                }
                z0.j = b0aVar;
                b0aVar.getClass();
                z0.l = null;
                z0.o = 0L;
                z0.p = 0L;
                z0.q = 0;
                z0.n = z0.d;
                z0.k = duration;
                boolean z2 = z0.b.getBoolean("pref_retranslations_notifications_enabled", true);
                Integer num = z0.n;
                Integer num2 = z0.g;
                final boolean z3 = num != null && (System.currentTimeMillis() - z0.o) / 3600000 >= ((long) num.intValue());
                final boolean z4 = num2 != null && (System.currentTimeMillis() - z0.p) / TimeUtils.MILLISECONDS_PER_DAY >= ((long) num2.intValue());
                Integer num3 = z0.h;
                final boolean z5 = num3 != null && num3.intValue() * 60 < z0.k;
                qu5.c().getClass();
                z0.r = z0.c && z2 && z3 && z4 && z5;
                L.c("RETRANSLATION_UTILS", new gzs() { // from class: xsna.ueg0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        StringBuilder sb = new StringBuilder("Setting shouldShowPopupOnCurrentVideo = ");
                        veg0 veg0Var = veg0.this;
                        sb.append(veg0Var.r);
                        sb.append(" (isFeatureEnabled: ");
                        gsi0.c(sb, veg0Var.c, ", castState: true, lastTimePast: ", z3, ", restTimePast: ");
                        sb.append(z4);
                        sb.append(", correctVideoDuration: ");
                        sb.append(z5);
                        sb.append(')');
                        return sb.toString();
                    }
                });
                if (z0.r) {
                    z0.m.clear();
                    BuildInfo.Client client = BuildInfo.a;
                    VKApplication vKApplication = com.vk.core.apps.a.a;
                    qu5.c().getClass();
                }
                z0.s = str;
                z0.t = 0L;
                z0.u = System.currentTimeMillis();
            }
            if (G0()) {
                Boolean bool = Boolean.FALSE;
                T(new n.w(null, bool, null, 0, bool, null, null, null, 229));
            }
            if (gsi0.b().h) {
                irkVar.clear();
                T(new n.w(Boolean.TRUE, null, null, null, null, null, null, null, 254));
                return;
            }
            return;
        }
        if (cVar6.equals(c.s.b)) {
            Optional<VideoFile> P0 = dVar.P0();
            if (P0 == null || (orElse2 = P0.orElse(null)) == null) {
                return;
            }
            f4zVar.b(new VideoMinimizableDiscoverySideEffect.j.i(orElse2));
            return;
        }
        if (cVar6 instanceof c.o0) {
            m0(qVar2, (c.o0) cVar6);
            return;
        }
        if (cVar6.equals(c.t0.b)) {
            if (!fxc0.B().J().f1().b()) {
                this.b0.f.g.onNext(s3q0.a);
                return;
            }
            yfs0 P02 = this.e0.P0();
            if (!(P02 instanceof yfs0.a)) {
                if (!(P02 instanceof yfs0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            yfs0.a aVar3 = (yfs0.a) P02;
            VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = aVar3.b;
            if (videoDiscoveryCatalogRepository$Section == null) {
                R0();
                return;
            } else {
                bVar.j = true;
                e0(videoDiscoveryCatalogRepository$Section, aVar3);
                return;
            }
        }
        if (cVar6 instanceof c.c1) {
            c.c1 c1Var = (c.c1) cVar6;
            zst0 A02 = A0();
            if (A02 != null) {
                A02.g();
            }
            C(c.s0.C1981c.b);
            a2s0 a2s0Var = new a2s0(c1Var.b, VideoApplyNewVideoSourceType.FromRecommendations);
            boolean z6 = c1Var.c;
            p0(a2s0Var, qVar2, z6, z6);
            Y();
            fxc0.B().s().l();
            return;
        }
        if (cVar6 instanceof c.u) {
            c0(qVar2, (c.u) cVar6);
            return;
        }
        if (cVar6 instanceof c.c0) {
            v0();
            return;
        }
        if (cVar6 instanceof c.j0) {
            io.reactivex.rxjava3.subjects.d<lgs0> dVar3 = this.d0;
            com.vk.video.ui.discovery.recommendations.a aVar4 = ((c.j0) cVar6).b;
            if (aVar4 instanceof a.b) {
                dVar3.onNext(lgs0.b.a);
                return;
            }
            if (!(aVar4 instanceof a.C1996a)) {
                throw new NoWhenBranchMatchedException();
            }
            a.C1996a c1996a = (a.C1996a) aVar4;
            b.a aVar5 = c1996a.a;
            VideoDiscoveryRecommendationsSourceArgs videoDiscoveryRecommendationsSourceArgs = aVar5.a;
            lgs0 P03 = dVar3.P0();
            Collection collection = P03 instanceof lgs0.a ? ((lgs0.a) P03).b : EmptyList.b;
            ArrayList arrayList = (ArrayList) aVar5.b.b;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            T t = arrayList;
            if (!c1996a.b) {
                t = epx.f(c1996a.c, Boolean.TRUE) ? j5g.u0(collection, arrayList) : j5g.u0(arrayList, collection);
            }
            ref$ObjectRef.element = t;
            if (!fxc0.B().J().J0()) {
                zst0 A03 = A0();
                if (((A03 != null ? A03.u() : null) instanceof zst0.a.C4199a) && (A0 = A0()) != null) {
                    Stack<a2s0> f = A0.f();
                    ArrayList arrayList2 = new ArrayList(c5g.u(f, 10));
                    Iterator<T> it = f.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((a2s0) it.next()).a.a1());
                    }
                    Iterable iterable = (Iterable) ref$ObjectRef.element;
                    ?? arrayList3 = new ArrayList();
                    for (Object obj2 : iterable) {
                        List<VideoFile> list3 = ((Doc2DocItem) obj2).b;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator<T> it2 = list3.iterator();
                            while (it2.hasNext()) {
                                if (arrayList2.contains(((VideoFile) it2.next()).a1())) {
                                    break;
                                }
                            }
                        }
                        arrayList3.add(obj2);
                    }
                    ref$ObjectRef.element = arrayList3;
                }
            }
            boolean z7 = aVar5.f;
            Optional<VideoFile> P04 = dVar.P0();
            if (P04 != null && (orElse = P04.orElse(null)) != null) {
                List list4 = (List) ref$ObjectRef.element;
                if (videoDiscoveryRecommendationsSourceArgs instanceof VideoDiscoveryRecommendationsSourceArgs.Recommendations) {
                    int i = ius0.$EnumSwitchMapping$0[((VideoDiscoveryRecommendationsSourceArgs.Recommendations) videoDiscoveryRecommendationsSourceArgs).f.ordinal()];
                    if (i == 1) {
                        videoRecommendationVideosType = VideoRecommendationVideosType.SIMILAR_MUSIC;
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        videoRecommendationVideosType = VideoRecommendationVideosType.SIMILAR_VIDEOS;
                    }
                } else if (videoDiscoveryRecommendationsSourceArgs instanceof VideoDiscoveryRecommendationsSourceArgs.OfflineVideos) {
                    videoRecommendationVideosType = VideoRecommendationVideosType.OFFLINE;
                } else {
                    if (!(videoDiscoveryRecommendationsSourceArgs instanceof VideoDiscoveryRecommendationsSourceArgs.MusicMix)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    videoRecommendationVideosType = VideoRecommendationVideosType.MUSIC_MIX;
                }
                VideoRecommendationVideosType videoRecommendationVideosType2 = videoRecommendationVideosType;
                VideoPlayerState P05 = dVar2.P0();
                dVar3.onNext(new lgs0.a(orElse, list4, videoRecommendationVideosType2, z7, (P05 == null || (videoPlayerStatInfo = P05.d) == null) ? null : videoPlayerStatInfo.b));
            }
            D0(aVar5.d, false);
            return;
        }
        if (cVar6 instanceof c.y) {
            W(qVar2, (c.y) cVar6);
            return;
        }
        if (cVar6 instanceof c.v) {
            boolean z8 = ((c.v) cVar6).b;
            T(new n.i0(z8));
            if ((videoMinimizableState instanceof VideoMinimizableState.Collapsed) && z8) {
                v0();
                return;
            }
            return;
        }
        if (cVar6 instanceof c.w) {
            T(new n.j0());
            return;
        }
        if (cVar6 instanceof c.z0) {
            c.z0 z0Var = (c.z0) cVar6;
            if (z0Var.equals(c.z0.b.b)) {
                if (videoInfo != null && (videoMinimizableState instanceof VideoMinimizableState.Collapsed)) {
                    sts0 sts0Var = this.f0;
                    sts0Var.getClass();
                    sts0Var.a(SchemeStat$TypeVideoMiniplayerItem.EventType.OPEN_ON_START);
                }
                if (videoAnnounceState2 instanceof VideoAnnounceState.Shown) {
                    V(qVar2, null);
                }
                aVar.getClass();
                if (BuildInfo.q() && (fullscreenLockState instanceof FullscreenLockState.Locked)) {
                    aVar.g(VideoMinimizableDiscoverySideEffect.e.a.a);
                    return;
                }
                return;
            }
            if (z0Var.equals(c.z0.d.b)) {
                if (videoInfo == null) {
                    videoMinimizableState = VideoMinimizableState.Hidden.b;
                }
                f4zVar.b(new VideoMinimizableDiscoverySideEffect.v(videoMinimizableState));
                return;
            }
            if (z0Var.equals(c.z0.C1982c.b)) {
                this.n.b();
                aVar.getClass();
                if (BuildInfo.s()) {
                    if (!(fullscreenLockState instanceof FullscreenLockState.Unlocked)) {
                        aVar.f(new n.x(b.d.a));
                    }
                } else if (videoMinimizableState instanceof VideoMinimizableState.Pip) {
                    aVar.h();
                }
                bpn0 bpn0Var = t5t0.e;
                t5t0 a6 = t5t0.a.a();
                ScheduledFuture<?> scheduledFuture = a6.a;
                if (scheduledFuture == null || scheduledFuture.isDone()) {
                    return;
                }
                scheduledFuture.cancel(true);
                a6.a();
                return;
            }
            if (!z0Var.equals(c.z0.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            VideoQueueComponent videoQueueComponent = this.p;
            u4s0 b2 = videoQueueComponent.z9().b();
            if (b2 != null) {
                videoQueueComponent.z9().a();
                if (b2.b == null) {
                    com.vk.video.ui.discovery.minimizable.related_videos.k y02 = y0();
                    y02.j();
                    y02.l(h.d.a);
                    y02.f.invoke(null);
                    this.J.b(VideoMinimizableDiscoverySideEffect.j.b.a);
                }
                VideoFile videoFile3 = b2.a;
                VideoApplyNewVideoSourceType videoApplyNewVideoSourceType = b2.c;
                if (videoApplyNewVideoSourceType == null) {
                    videoApplyNewVideoSourceType = VideoApplyNewVideoSourceType.Other;
                }
                p0(new a2s0(videoFile3, videoApplyNewVideoSourceType), qVar2, true, true);
            } else if ((videoAnnounceState2 instanceof VideoAnnounceState.Shown) && (qVar2.p instanceof b.a)) {
                com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
                if (com.vk.libvideo.autoplay.e.a() && (w0 = w0(this)) != null) {
                    r0(qVar2, w0.a, null);
                }
            }
            VideoPlayerMode videoPlayerMode = videoMinimizableState instanceof VideoMinimizableState.Collapsed ? VideoPlayerMode.MINIMIZED : videoMinimizableState instanceof VideoMinimizableState.Expanded ? VideoPlayerMode.DISCOVERY : videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal ? VideoPlayerMode.FULLSCREEN_LANDSCAPE : videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical ? VideoPlayerMode.FULLSCREEN_PORTRAIT : (videoMinimizableState.equals(VideoMinimizableState.Pip.b) && BuildInfo.q()) ? VideoPlayerMode.PIP_EXTERNAL : null;
            if (videoPlayerMode != null) {
                i0q0.j(new qd0(videoPlayerMode, 17));
                return;
            }
            return;
        }
        if (cVar6 instanceof c.d) {
            c.d dVar4 = (c.d) cVar6;
            io.reactivex.rxjava3.subjects.d<Boolean> dVar5 = pwm0Var.g;
            final c71 c71Var = pwm0Var.d;
            List<hfz> list5 = qVar2.f;
            MiniPlayerControllersWrapper.VideoInfo videoInfo2 = qVar2.b;
            String str2 = dVar4.d;
            if (str2 != null) {
                if (((videoInfo2 == null || (videoFile2 = videoInfo2.b) == null) ? null : videoFile2.a1()) != null && !str2.equals(videoInfo2.b.a1())) {
                    return;
                }
            }
            AboutVideoItem.d a7 = pwm0.a(qVar2);
            boolean f2 = (a7 == null || (cVar5 = a7.l) == null) ? false : epx.f(cVar5.a, Boolean.TRUE);
            boolean f3 = (a7 == null || (cVar4 = a7.l) == null) ? false : epx.f(cVar4.b, Boolean.TRUE);
            Boolean bool2 = dVar4.b;
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    c71Var.a();
                    if (epx.f(dVar5.P0(), Boolean.TRUE)) {
                        dVar5.onNext(Boolean.FALSE);
                    }
                    f3 = false;
                    f2 = true;
                } else {
                    f2 = false;
                }
            }
            Boolean bool3 = dVar4.c;
            if (bool3 != null) {
                if (!bool3.booleanValue()) {
                    c71Var.a();
                } else if (!f2) {
                    if (epx.f(dVar5.P0(), Boolean.TRUE)) {
                        dVar5.onNext(Boolean.FALSE);
                    }
                    c71Var.a();
                    afl0 afl0Var = new afl0(pwm0Var, 3);
                    orj0 orj0Var = new orj0(pwm0Var, 8);
                    final long incrementAndGet = c71Var.c.incrementAndGet();
                    AtomicReference<c71.a> atomicReference = c71Var.d;
                    c71.a andSet = atomicReference.getAndSet(null);
                    if (andSet != null && (cVar3 = andSet.b) != null) {
                        cVar3.dispose();
                    }
                    c71.a andSet2 = atomicReference.getAndSet(new c71.a(incrementAndGet, io.reactivex.rxjava3.core.a.s(c71Var.a, TimeUnit.SECONDS, c71Var.b).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.b71
                        @Override // io.reactivex.rxjava3.functions.a
                        public final void run() {
                            c71 c71Var2 = c71.this;
                            c71.a aVar6 = c71Var2.d.get();
                            if (aVar6 == null || aVar6.a != incrementAndGet) {
                                return;
                            }
                            AtomicReference<c71.a> atomicReference2 = c71Var2.d;
                            while (!atomicReference2.compareAndSet(aVar6, null)) {
                                if (atomicReference2.get() != aVar6) {
                                    return;
                                }
                            }
                            aVar6.c.invoke();
                        }
                    }), afl0Var, orj0Var));
                    if (andSet2 != null && (cVar2 = andSet2.b) != null) {
                        cVar2.dispose();
                    }
                    z = true;
                    f3 = z;
                }
                z = false;
                f3 = z;
            }
            Boolean valueOf = Boolean.valueOf(f2);
            Boolean valueOf2 = Boolean.valueOf(f3);
            AboutVideoItem.d a8 = pwm0.a(qVar2);
            if (a8 == null || (indexOf = list5.indexOf(a8)) == -1) {
                list = list5;
            } else {
                AboutVideoItem.d.c cVar7 = new AboutVideoItem.d.c(valueOf, valueOf2);
                ArrayList arrayList4 = new ArrayList(list5);
                arrayList4.set(indexOf, AboutVideoItem.d.a(a8, cVar7));
                list = arrayList4;
            }
            if (epx.f(list, list5)) {
                return;
            }
            pwm0Var.a.invoke(new n.a(list));
            return;
        }
        if (!(cVar6 instanceof c.r)) {
            if (cVar6 instanceof c.q) {
                ((c.q) cVar6).getClass();
                T(new n.s());
                return;
            }
            if (epx.f(cVar6, c.x.b)) {
                if (com.vk.libvideo.api.minimizable.a.g(qVar2.n)) {
                    U0();
                    return;
                } else {
                    I0(qVar2, VideoMinimizableDiscoverySideEffect.Motion.MinimizeTrigger.ByBackButton);
                    return;
                }
            }
            if (cVar6 instanceof c.a1) {
                f4zVar.b(VideoMinimizableDiscoverySideEffect.w.a.a);
                q0(qVar2, (c.a1) cVar6);
                return;
            }
            if (cVar6 instanceof c.s0) {
                o0(qVar2, (c.s0) cVar6);
                return;
            }
            if (cVar6 instanceof c.r0) {
                n0(qVar2, (c.r0) cVar6);
                return;
            }
            if (cVar6 instanceof c.i0) {
                k0(qVar2, (c.i0) cVar6);
                return;
            }
            if (cVar6 instanceof c.h0) {
                j0(qVar2, (c.h0) cVar6);
                return;
            }
            if (cVar6 instanceof c.e) {
                X(qVar2, (c.e) cVar6);
                return;
            }
            if (cVar6 instanceof c.f) {
                c.f fVar = (c.f) cVar6;
                MiniPlayerControllersWrapper.VideoInfo videoInfo3 = qVar2.b;
                if (videoInfo3 != null) {
                    V0(new DiscoveryAction.l(fVar.b), videoInfo3.b, fvr.A(qVar2.n));
                    return;
                }
                return;
            }
            if (cVar6 instanceof c.g0) {
                i0(qVar2, (c.g0) cVar6);
                return;
            }
            if (cVar6 instanceof c.d1) {
                s0(qVar2);
                return;
            }
            if (cVar6 instanceof c.p0) {
                N0(((c.p0) cVar6).b, qVar2);
                return;
            }
            if (cVar6 instanceof c.q0) {
                O0(((c.q0) cVar6).b, qVar2);
                return;
            }
            if (cVar6 instanceof c.n0) {
                MiniPlayerControllersWrapper.VideoInfo videoInfo4 = qVar2.b;
                if (videoInfo4 == null || (videoFile = videoInfo4.b) == null) {
                    return;
                }
                c.n0 n0Var = (c.n0) cVar6;
                V0(new DiscoveryAction.g(n0Var.b, n0Var.a()), videoFile, fvr.A(qVar2.b()));
                return;
            }
            if (cVar6 instanceof zts0) {
                f4zVar.b(new VideoMinimizableDiscoverySideEffect.p.a(0));
                return;
            }
            int i2 = 0;
            if (epx.f(cVar6, aus0.b)) {
                f4zVar.b(new VideoMinimizableDiscoverySideEffect.p.a(i2));
                return;
            }
            if (cVar6 instanceof yts0) {
                f4zVar.b(VideoMinimizableDiscoverySideEffect.p.f.a);
                return;
            }
            if (epx.f(cVar6, c.m.b)) {
                f4zVar.b(VideoMinimizableDiscoverySideEffect.c.a.a);
                return;
            }
            if (cVar6 instanceof c.n) {
                aVar.b(qVar2, (c.n) cVar6);
                return;
            }
            if (cVar6 instanceof c.k) {
                c.k kVar = (c.k) cVar6;
                T(new n.v(kVar.b));
                if (qVar2.u != null) {
                    Y0(this, qVar2, null, kVar.b, 2);
                }
                if (qVar2.c() != null) {
                    b1(this, qVar2, null, kVar.b, null, 10);
                    return;
                }
                return;
            }
            if (cVar6 instanceof c.a0) {
                wc0Var.e();
                wc0Var.d(CommonVideoAdsStat$TypeOverlayAdClose.CloseSource.USER, CommonVideoAdsStat$TypeOverlayAdClose.CloseReason.CLICKED);
                Iterator<T> it3 = qVar2.f.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj = it3.next();
                        if (obj instanceof AboutVideoItem.c.a) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (!(obj instanceof AboutVideoItem.c.a)) {
                    obj = null;
                }
                AboutVideoItem.c.a aVar6 = (AboutVideoItem.c.a) obj;
                i31 i31Var = qVar2.u;
                AboutVideoItem.c.a aVar7 = (AboutVideoItem.c.a) j5g.a0(e43.n(aVar6, i31Var != null ? i31Var.a() : null));
                if (aVar7 != null && (a2 = aVar7.a()) != null && (a3 = a2.a()) != null && (a4 = a3.a()) != null) {
                    f4zVar.b(new VideoMinimizableDiscoverySideEffect.n(a4.d()));
                }
                T(new n.e(true));
                return;
            }
            if (cVar6 instanceof c.g) {
                wc0Var.d(CommonVideoAdsStat$TypeOverlayAdClose.CloseSource.USER, CommonVideoAdsStat$TypeOverlayAdClose.CloseReason.CROSS_BUTTON);
                videoAdvertisementsRepository.c(VideoAdvertisementsRepository.AdType.SPORT_BANNER);
                T(new n.e(true));
                return;
            }
            if (cVar6 instanceof c.b0) {
                e5s0Var.getClass();
                e5s0.a();
                SharedPreferences.Editor edit = ((SharedPreferences) d5s0Var.c.a.getValue()).edit();
                edit.putLong("pref_key_banner_trap_dismissed_at", System.currentTimeMillis());
                edit.apply();
                d5s0Var.g.onNext(Boolean.TRUE);
                c.b0 b0Var = (c.b0) cVar6;
                if (b0Var.b.length() > 0) {
                    f4zVar.b(new VideoMinimizableDiscoverySideEffect.o(b0Var.b));
                    return;
                }
                return;
            }
            if (cVar6 instanceof c.j) {
                e5s0Var.getClass();
                e5s0.b();
                SharedPreferences.Editor edit2 = ((SharedPreferences) d5s0Var.c.a.getValue()).edit();
                edit2.putLong("pref_key_banner_trap_dismissed_at", System.currentTimeMillis());
                edit2.apply();
                d5s0Var.g.onNext(Boolean.TRUE);
                return;
            }
            if (cVar6 instanceof c.l0) {
                T(n.k.b);
                return;
            }
            if (cVar6 instanceof c.h) {
                T(n.f.b);
                return;
            }
            if (cVar6 instanceof c.b) {
                Y0(this, qVar2, null, false, 6);
                return;
            }
            if (cVar6 instanceof c.m0) {
                b1(this, qVar2, null, false, null, 14);
                return;
            }
            if (cVar6 instanceof c.i) {
                videoAdvertisementsRepository.c(VideoAdvertisementsRepository.AdType.OVERLAY);
                T(new n.g(true));
                return;
            }
            if (cVar6 instanceof c.a) {
                U(qVar2, (c.a) cVar6);
                return;
            }
            if (cVar6 instanceof c.t) {
                F0(qVar2, (c.t) cVar6);
                return;
            }
            if (cVar6 instanceof c.z) {
                f4zVar.b(new VideoMinimizableDiscoverySideEffect.a(((c.z) cVar6).a()));
                return;
            }
            if (cVar6 instanceof c.e0) {
                g0((c.e0) cVar6, qVar2);
                return;
            }
            if (cVar6 instanceof c.d0) {
                f4zVar.b(new VideoMinimizableDiscoverySideEffect.x(((c.d0) cVar6).a(), DonutVideoClickSource.DESCRIPTION));
                return;
            }
            if (cVar6 instanceof c.f0) {
                h0(qVar2);
                return;
            }
            if (cVar6 instanceof c.k0) {
                l0((c.k0) cVar6);
                return;
            }
            if (cVar6 instanceof c.x0) {
                PlaybackSnapshot playbackSnapshot = ((c.x0) cVar6).b;
                if (playbackSnapshot instanceof PlaybackSnapshot.AdsState) {
                    T(new n.C1992n((long) ((PlaybackSnapshot.AdsState) playbackSnapshot).d()));
                    return;
                }
                return;
            }
            if (cVar6 instanceof c.w0) {
                T(new n.m(((c.w0) cVar6).a()));
                return;
            }
            if (cVar6 instanceof c.u0) {
                T(n.h.b);
                return;
            }
            if (cVar6 instanceof c.v0) {
                f4zVar.b(new VideoMinimizableDiscoverySideEffect.n(((c.v0) cVar6).a()));
                return;
            }
            if (cVar6 instanceof c.C1974c) {
                B0(qVar2, (c.C1974c) cVar6);
                return;
            }
            if (cVar6 instanceof c.l) {
                if (G0()) {
                    Z(qVar2, (c.l) cVar6);
                    return;
                }
                return;
            } else if (cVar6 instanceof c.p) {
                c.p pVar = (c.p) cVar6;
                C0(pVar.a(), pVar.b());
                return;
            } else {
                if (!(cVar6 instanceof c.y0)) {
                    throw new NoWhenBranchMatchedException();
                }
                c.y0 y0Var = (c.y0) cVar6;
                E0(y0Var.a(), y0Var.b());
                return;
            }
        }
        c.r rVar = (c.r) cVar6;
        VideoMinimizableState videoMinimizableState2 = rVar.b;
        boolean z9 = videoMinimizableState2 instanceof VideoMinimizableState.Animating;
        Y0(this, qVar2, videoMinimizableState2, false, 4);
        if (qVar2.y != null && z9) {
            T(n.j.b);
        }
        if (z9) {
            return;
        }
        if (!com.vk.libvideo.api.minimizable.a.g(videoMinimizableState) && com.vk.libvideo.api.minimizable.a.g(videoMinimizableState2)) {
            List<hfz> list6 = gsi0.b().c ? qVar2.h : qVar2.g;
            if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                Iterator<T> it4 = list6.iterator();
                while (it4.hasNext()) {
                    if (((hfz) it4.next()) instanceof AboutVideoItem.a) {
                        break;
                    }
                }
            }
            List<hfz> list7 = list2;
            ArrayList arrayList5 = new ArrayList(c5g.u(list7, 10));
            for (hfz hfzVar : list7) {
                if (hfzVar instanceof AboutVideoItem.q.b) {
                    AboutVideoItem.q.b bVar2 = (AboutVideoItem.q.b) hfzVar;
                    if (!bVar2.f) {
                        hfzVar = new AboutVideoItem.q.b(bVar2.b, bVar2.c, bVar2.d, bVar2.e, true);
                    }
                }
                arrayList5.add(hfzVar);
            }
            if (!arrayList5.equals(list2)) {
                T(new n.a(arrayList5));
            }
        }
        boolean z10 = videoAnnounceState2 instanceof VideoAnnounceState.Shown;
        VideoAnnounceState.Shown shown2 = z10 ? (VideoAnnounceState.Shown) videoAnnounceState2 : null;
        boolean H0 = H0(videoMinimizableState, videoMinimizableState2, shown2 != null ? shown2.f.c : null);
        if (qVar2.o instanceof VideoAnnounceState.Shown) {
            if (epx.f(rVar.c, b.a.a)) {
                com.vk.libvideo.autoplay.e eVar2 = com.vk.libvideo.autoplay.e.a;
                if (com.vk.libvideo.autoplay.e.a()) {
                    a2s0 w02 = w0(this);
                    if (w02 != null) {
                        r0(qVar2, w02.a, Boolean.valueOf(H0));
                    }
                }
            }
            this.n.b();
            a2s0 w03 = w0(this);
            if (w03 != null) {
                MiniPlayerControllersWrapper.VideoInfo videoInfo5 = qVar2.b;
                VideoFile videoFile4 = videoInfo5 != null ? videoInfo5.b : null;
                VideoFile videoFile5 = w03.a;
                Boolean valueOf3 = Boolean.valueOf(H0);
                this.b0.a(videoFile5.a1());
                videoAnnounceState = videoAnnounceState2;
                P0(qVar2, videoFile4, videoFile5, false, valueOf3);
                b0(qVar2, rVar);
                shown = !z10 ? (VideoAnnounceState.Shown) videoAnnounceState : null;
                if (shown != null) {
                    Z0(qVar2, t0(H0, shown.f, videoInfo != null ? videoInfo.b : null));
                }
                if (pwm0Var.c.R() && pwm0Var.e && (videoMinimizableState2 instanceof VideoMinimizableState.Expanded)) {
                    pwm0Var.b.invoke(new c.d(5, null, Boolean.TRUE, null));
                    pwm0Var.e = false;
                }
                fxc0.B().s().l();
                b1(this, qVar2, rVar.b, false, null, 12);
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                if ((!BuildInfo.q() ? VideoFeatures.VIDEO_KBH_DETECT : CoreFeatures.KBH_DETECT).h()) {
                    return;
                }
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_APP_STABILITY_OFFLINE;
                videoFeatures.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures)) {
                    bpn0 bpn0Var2 = com.vk.libvideo.autoplay.b.B;
                    xh5 xh5Var = b.C1208b.a().c;
                    yg5 yg5Var = xh5Var != null ? xh5Var.a : null;
                    if (yg5Var != null && ((yg5Var.u0() || epx.f(yg5Var.d0(), "offline")) && com.vk.libvideo.api.minimizable.a.d(rVar.b))) {
                        d6q0.a.getClass();
                        d6q0.d();
                        return;
                    }
                    if (com.vk.libvideo.api.minimizable.a.d(rVar.b) && d6q0.t == NetworkState.UNSTABLE) {
                        d6q0.a.getClass();
                        d6q0.k();
                        return;
                    }
                    if (rVar.b instanceof VideoMinimizableState.Collapsed) {
                        UiTracker uiTracker = UiTracker.a;
                        if (epx.f(UiTracker.d(), t0.a(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DOWNLOADS))) {
                            d6q0.a.getClass();
                            d6q0.d();
                            return;
                        }
                    }
                    if ((rVar.b instanceof VideoMinimizableState.Collapsed) && d6q0.t == NetworkState.UNSTABLE) {
                        d6q0.a.getClass();
                        d6q0.k();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        videoAnnounceState = videoAnnounceState2;
        b0(qVar2, rVar);
        if (!z10) {
        }
        if (shown != null) {
        }
        if (pwm0Var.c.R()) {
            pwm0Var.b.invoke(new c.d(5, null, Boolean.TRUE, null));
            pwm0Var.e = false;
        }
        fxc0.B().s().l();
        b1(this, qVar2, rVar.b, false, null, 12);
        eqy<bek0> eqyVar2 = com.vk.toggle.d.a;
        if ((!BuildInfo.q() ? VideoFeatures.VIDEO_KBH_DETECT : CoreFeatures.KBH_DETECT).h()) {
        }
    }

    public final void N0(fpe0 fpe0Var, q qVar) {
        VideoFile videoFile;
        MiniPlayerControllersWrapper.VideoInfo videoInfo = qVar.b;
        if (videoInfo == null || (videoFile = videoInfo.b) == null) {
            return;
        }
        VideoQualityTracker videoQualityTracker = this.U;
        videoQualityTracker.getClass();
        i0q0.j(new wm8(videoFile, videoQualityTracker, fpe0Var, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O0(QualitySettingsType qualitySettingsType, q qVar) {
        VideoFile videoFile;
        MobileOfficialAppsCoreSettingsStat$SettingNetworkType mobileOfficialAppsCoreSettingsStat$SettingNetworkType;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset;
        MiniPlayerControllersWrapper.VideoInfo videoInfo = qVar.b;
        if (videoInfo == null || (videoFile = videoInfo.b) == null) {
            return;
        }
        VideoQualityTracker.QualityChangeSource qualityChangeSource = VideoQualityTracker.QualityChangeSource.PLAYER;
        this.U.getClass();
        int[] iArr = VideoQualityTracker.a.$EnumSwitchMapping$1;
        switch (iArr[qualitySettingsType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                mobileOfficialAppsCoreSettingsStat$SettingNetworkType = MobileOfficialAppsCoreSettingsStat$SettingNetworkType.WIFI;
                break;
            case 4:
            case 5:
            case 6:
                mobileOfficialAppsCoreSettingsStat$SettingNetworkType = MobileOfficialAppsCoreSettingsStat$SettingNetworkType.MOBILE;
                break;
            default:
                mobileOfficialAppsCoreSettingsStat$SettingNetworkType = null;
                break;
        }
        MobileOfficialAppsCoreSettingsStat$SettingNetworkType mobileOfficialAppsCoreSettingsStat$SettingNetworkType2 = mobileOfficialAppsCoreSettingsStat$SettingNetworkType;
        if (mobileOfficialAppsCoreSettingsStat$SettingNetworkType2 == null) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.w, new Object[]{"Cannot map " + qualitySettingsType + " to network type"});
            return;
        }
        int i = VideoQualityTracker.a.$EnumSwitchMapping$0[qualityChangeSource.ordinal()];
        if (i == 1) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_SINGLE_VIDEO;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.SETTINGS;
        }
        switch (iArr[qualitySettingsType.ordinal()]) {
            case 1:
            case 4:
            case 7:
                mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset = MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset.AUTO;
                break;
            case 2:
            case 5:
            case 8:
                mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset = MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset.HIGH;
                break;
            case 3:
            case 6:
            case 9:
                mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset = MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset.ECONOMY;
                break;
            case 10:
                mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset = MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset.OTHER;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        VideoQualityTracker.a(mobileOfficialAppsCoreNavStat$EventScreen, videoFile, new MobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem(MobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem.Type.TYPE_SETTINGS_VIDEO_QUALITY_PLAYBACK, new MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback(mobileOfficialAppsCoreSettingsStat$SettingNetworkType2, mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset, null, 4, null), 0 == true ? 1 : 0, null, null, 28, null));
    }

    public final void P0(q qVar, VideoFile videoFile, VideoFile videoFile2, boolean z, Boolean bool) {
        boolean H0;
        AuthorAnnounceState Q0 = Q0(qVar, videoFile);
        if (bool != null) {
            H0 = bool.booleanValue();
        } else {
            VideoMinimizableState videoMinimizableState = qVar.n;
            H0 = H0(videoMinimizableState, videoMinimizableState, Q0 != null ? Q0.c : null);
        }
        T(new n.h0(videoFile, videoFile2, 0L, z, t0(H0, Q0, videoFile), 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x011f  */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<com.vk.video.ui.discovery.minimizable.c> Q(q qVar, q qVar2, n nVar) {
        boolean z;
        q qVar3 = qVar;
        q qVar4 = qVar2;
        n nVar2 = nVar;
        q.b bVar = qVar4.w;
        super.Q(qVar3, qVar4, nVar2);
        if (nVar2 instanceof n.s) {
            boolean z2 = qVar4.m.a;
            VideoMinimizableState videoMinimizableState = qVar4.n;
            if (com.vk.libvideo.api.minimizable.a.d(videoMinimizableState)) {
                I0(qVar4, VideoMinimizableDiscoverySideEffect.Motion.MinimizeTrigger.Other);
                return null;
            }
            boolean z3 = videoMinimizableState instanceof VideoMinimizableState.Collapsed;
            f4z<VideoMinimizableDiscoverySideEffect> f4zVar = this.J;
            if (z3) {
                if (z2) {
                    f4zVar.b(new VideoMinimizableDiscoverySideEffect.Motion.d(null, 3));
                    return null;
                }
                f4zVar.b(new VideoMinimizableDiscoverySideEffect.p.b());
                f4zVar.b(VideoMinimizableDiscoverySideEffect.Motion.c.a);
                return null;
            }
            if ((videoMinimizableState instanceof VideoMinimizableState.Hidden) && qVar4.b != null) {
                if (!z2) {
                    f4zVar.b(VideoMinimizableDiscoverySideEffect.Motion.c.a);
                    return null;
                }
                f4zVar.b(VideoMinimizableDiscoverySideEffect.p.d.a);
                f4zVar.b(new VideoMinimizableDiscoverySideEffect.Motion.d(null, 3));
                return null;
            }
        } else if (nVar2 instanceof n.a) {
            AboutVideoItem.s x0 = x0(qVar3);
            AboutVideoItem.s x02 = x0(qVar4);
            Integer valueOf = x0 != null ? Integer.valueOf(x0.b) : null;
            UserId userId = x0 != null ? x0.c : null;
            Integer valueOf2 = x02 != null ? Integer.valueOf(x02.b) : null;
            UserId userId2 = x02 != null ? x02.c : null;
            if (!epx.f(valueOf, valueOf2) || !epx.f(userId, userId2)) {
                X0(qVar4, hsf0.a.i.a);
                return null;
            }
        } else if ((nVar2 instanceof n.w) && G0()) {
            if (((n.w) nVar2).c == null) {
                irk irkVar = this.G;
                if (irkVar.c(bVar)) {
                    irkVar.b();
                    T(new n.w(Boolean.FALSE, Boolean.TRUE, null, null, null, null, null, null, 252));
                    return null;
                }
                if (bVar.b) {
                    T(new n.w(null, Boolean.FALSE, null, null, null, null, null, null, 253));
                    return null;
                }
            }
        } else if ((nVar2 instanceof n.c) && G0()) {
            n.c cVar = (n.c) nVar2;
            VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = cVar.b;
            if (videoDiscoveryCatalogRepository$Section != null) {
                String str = videoDiscoveryCatalogRepository$Section.a;
                VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section2 = (VideoDiscoveryCatalogRepository$Section) j5g.a0(cVar.c);
                if (epx.f(str, videoDiscoveryCatalogRepository$Section2 != null ? videoDiscoveryCatalogRepository$Section2.a : null)) {
                    z = true;
                    if (bVar.h != z) {
                        T(new n.w(null, null, null, null, null, null, Boolean.valueOf(z), null, 191));
                    }
                }
            }
            z = false;
            if (bVar.h != z) {
            }
        }
        return null;
    }

    public final void R0() {
        io.reactivex.rxjava3.disposables.c cVar = this.N.e;
        if (cVar != null) {
            cVar.dispose();
        }
        this.J.b(VideoMinimizableDiscoverySideEffect.t.a);
    }

    public final void S0() {
        io.reactivex.rxjava3.subjects.d<VideoPlayerState> dVar = this.a0;
        VideoPlayerStatInfo videoPlayerStatInfo = dVar.P0().d;
        String str = videoPlayerStatInfo != null ? videoPlayerStatInfo.b : null;
        VideoPlayerStatInfo videoPlayerStatInfo2 = dVar.P0().d;
        this.m.a(str, videoPlayerStatInfo2 != null ? videoPlayerStatInfo2.c : null);
    }

    public final boolean T0(q qVar) {
        VideoFile videoFile;
        if (!(this.f.L1() ? false : com.vk.video.ui.discovery.minimizable.player.b.a(qVar.l.d.b)) && !epx.f(qVar.l.d.b, VideoPlayerStatus.Restricted.b)) {
            q.c cVar = qVar.m;
            if (!cVar.b && !cVar.c) {
                MiniPlayerControllersWrapper.VideoInfo videoInfo = qVar.b;
                if (!((videoInfo == null || (videoFile = videoInfo.b) == null || !videoFile.W9()) ? false : true) || this.D) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void U(q qVar, c.a aVar) {
        boolean z = qVar.z;
        boolean z2 = aVar.b;
        if (z == z2) {
            return;
        }
        q a2 = q.a(qVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, z2, 16777215);
        T(new n.p(aVar.b));
        b1(this, a2, null, false, null, 14);
    }

    public final void U0() {
        VideoFile orElse;
        Optional<VideoFile> P0 = this.P.P0();
        this.J.b(new VideoMinimizableDiscoverySideEffect.k0((P0 == null || (orElse = P0.orElse(null)) == null) ? false : orElse.e2()));
    }

    public final void V(q qVar, y4 y4Var) {
        VideoFile videoFile;
        VideoFile videoFile2;
        VideoDiscoveryRecommendationsSourceArgs videoDiscoveryRecommendationsSourceArgs = qVar.d;
        VideoDiscoveryCatalogSourceArgs videoDiscoveryCatalogSourceArgs = qVar.e;
        com.vk.video.ui.discovery.minimizable.related_videos.h hVar = qVar.s;
        MiniPlayerControllersWrapper.VideoInfo videoInfo = qVar.b;
        String type = (videoInfo == null || (videoFile2 = videoInfo.b) == null) ? null : videoFile2.getType();
        boolean z = (videoDiscoveryRecommendationsSourceArgs instanceof VideoDiscoveryRecommendationsSourceArgs.Recommendations) || (videoDiscoveryCatalogSourceArgs instanceof VideoDiscoveryCatalogSourceArgs.Catalog);
        boolean z2 = hVar instanceof h.d;
        boolean G = rl3.G(new String[]{"music_video", "ugc_music_video"}, type);
        boolean z3 = videoDiscoveryRecommendationsSourceArgs instanceof VideoDiscoveryRecommendationsSourceArgs.MusicMix;
        if (!z || !z2 || G || z3) {
            if (y4Var != null) {
                y4Var.invoke();
                return;
            }
            return;
        }
        a2s0 w0 = w0(this);
        if (w0 != null) {
            VideoFile videoFile3 = w0.a;
            if (videoInfo != null && (videoFile = videoInfo.b) != null) {
                try {
                    this.S.getClass();
                    r1s0.a(CommonVideoStat$TypeNextVideoAnnouncement.EventSubtype.SHOW, videoFile, videoFile3);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Exception e2) {
                    com.vk.metrics.eventtracking.b.a.a(e2);
                }
            }
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            if (com.vk.libvideo.autoplay.e.a() && epx.f(qVar.p, b.a.a)) {
                C(new c.a1.h(videoFile3));
                return;
            }
            this.b0.a(videoFile3.a1());
            VideoFile videoFile4 = videoInfo != null ? videoInfo.b : null;
            AuthorAnnounceState Q0 = Q0(qVar, videoFile4);
            VideoMinimizableState videoMinimizableState = qVar.n;
            T(new n.h0(videoFile4, videoFile3, 0L, false, t0(H0(videoMinimizableState, videoMinimizableState, Q0 != null ? Q0.c : null), Q0, videoFile4), 12));
        }
    }

    public final void V0(DiscoveryAction discoveryAction, VideoFile videoFile, TypeScreen typeScreen) {
        this.x.a(discoveryAction, new ai90(videoFile, typeScreen));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0269  */
    /* JADX WARN: Type inference failed for: r14v16, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [T, java.util.List<com.vk.dto.video.Doc2DocItem>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(q qVar, c.y yVar) {
        VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section;
        List list;
        List list2;
        List<VideoDiscoveryCatalogRepository$Section> list3;
        Collection collection;
        c cVar;
        VideoFile videoFile;
        Object obj;
        ArrayList arrayList;
        List list4;
        VideoDiscoveryCatalogRepository$Section a2;
        VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section2;
        List list5;
        List<UxPoll> list6;
        VideoFile videoFile2;
        VideoRecommendationVideosType videoRecommendationVideosType;
        VideoPlayerStatInfo videoPlayerStatInfo;
        Object obj2;
        zst0 A0;
        com.vk.video.ui.discovery.catalog.a aVar = yVar.b;
        if (aVar instanceof a.c) {
            f0(false);
            return;
        }
        if (aVar instanceof a.C1966a) {
            f0(true);
            return;
        }
        if (!(aVar instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a.b bVar = (a.b) aVar;
        b.a aVar2 = bVar.a;
        VideoDiscoveryCatalogSourceArgs videoDiscoveryCatalogSourceArgs = qVar.e;
        MiniPlayerControllersWrapper.VideoInfo videoInfo = qVar.b;
        boolean f = epx.f(videoDiscoveryCatalogSourceArgs, aVar2.a());
        io.reactivex.rxjava3.subjects.d<yfs0> dVar = this.e0;
        if (f) {
            yfs0 P0 = dVar.P0();
            if (!(P0 instanceof yfs0.a)) {
                if (!(P0 instanceof yfs0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                yfs0.a aVar3 = ((yfs0.b) P0).a;
                if (aVar3 != null) {
                    P0 = aVar3;
                }
            }
            if (aVar2 instanceof b.a.C1968b) {
                b.a.C1968b c1968b = (b.a.C1968b) aVar2;
                videoDiscoveryCatalogRepository$Section = c1968b.c;
                if (videoDiscoveryCatalogRepository$Section == null || (list2 = videoDiscoveryCatalogRepository$Section.d) == null) {
                    list2 = EmptyList.b;
                }
                list3 = c1968b.b;
            } else {
                if (!(aVar2 instanceof b.a.C1967a)) {
                    throw new NoWhenBranchMatchedException();
                }
                videoDiscoveryCatalogRepository$Section = ((b.a.C1967a) aVar2).a;
                if (videoDiscoveryCatalogRepository$Section == null || (list = videoDiscoveryCatalogRepository$Section.d) == null) {
                    list = EmptyList.b;
                }
                list2 = list;
                list3 = null;
            }
            if (P0 instanceof yfs0.a) {
                Iterator<T> it = ((yfs0.a) P0).c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (epx.f(((VideoDiscoveryCatalogRepository$Section) obj).a, videoDiscoveryCatalogRepository$Section != null ? videoDiscoveryCatalogRepository$Section.a : null)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section3 = (VideoDiscoveryCatalogRepository$Section) obj;
                if (videoDiscoveryCatalogRepository$Section3 == null || (collection = videoDiscoveryCatalogRepository$Section3.d) == null) {
                    collection = EmptyList.b;
                }
            } else {
                if (!(P0 instanceof yfs0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                collection = EmptyList.b;
            }
            if (!bVar.b) {
                list2 = j5g.u0(list2, collection);
            }
            if (!(r8 instanceof VideoDiscoveryCatalogSourceArgs.OfflineVideos)) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    List<VideoFile> list7 = ((Doc2DocItem) obj3).b;
                    if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                        Iterator<T> it2 = list7.iterator();
                        while (it2.hasNext()) {
                            if (epx.f(((VideoFile) it2.next()).r1(), (videoInfo == null || (videoFile = videoInfo.b) == null) ? null : videoFile.r1())) {
                                break;
                            }
                        }
                    }
                    arrayList2.add(obj3);
                }
                list2 = arrayList2;
            }
            cVar = new c(P0, list2, videoDiscoveryCatalogRepository$Section, list3);
        } else {
            cVar = null;
        }
        if (cVar == null) {
            return;
        }
        yfs0 yfs0Var = cVar.a;
        ?? r6 = cVar.b;
        VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section4 = cVar.c;
        List list8 = cVar.d;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = r6;
        if (!fxc0.B().J().J0()) {
            zst0 A02 = A0();
            if (((A02 != null ? A02.u() : null) instanceof zst0.a.C4199a) && (A0 = A0()) != null) {
                Stack<a2s0> f2 = A0.f();
                ArrayList arrayList3 = new ArrayList(c5g.u(f2, 10));
                Iterator<T> it3 = f2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((a2s0) it3.next()).a.a1());
                }
                Iterable iterable = (Iterable) ref$ObjectRef.element;
                ?? arrayList4 = new ArrayList();
                for (Object obj4 : iterable) {
                    List<VideoFile> list9 = ((Doc2DocItem) obj4).b;
                    if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                        Iterator<T> it4 = list9.iterator();
                        while (it4.hasNext()) {
                            if (arrayList3.contains(((VideoFile) it4.next()).a1())) {
                                break;
                            }
                        }
                    }
                    arrayList4.add(obj4);
                }
                ref$ObjectRef.element = arrayList4;
            }
        }
        q.a aVar4 = qVar.i;
        if (yfs0Var instanceof yfs0.a) {
            List<VideoDiscoveryCatalogRepository$Section> list10 = ((yfs0.a) yfs0Var).c;
            arrayList = new ArrayList(c5g.u(list10, 10));
            for (VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section5 : list10) {
                if (epx.f(videoDiscoveryCatalogRepository$Section5.a, videoDiscoveryCatalogRepository$Section4 != null ? videoDiscoveryCatalogRepository$Section4.a : null)) {
                    videoDiscoveryCatalogRepository$Section5 = VideoDiscoveryCatalogRepository$Section.a(videoDiscoveryCatalogRepository$Section4, (List) ref$ObjectRef.element);
                }
                arrayList.add(videoDiscoveryCatalogRepository$Section5);
            }
        } else {
            if (!(yfs0Var instanceof yfs0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList = null;
        }
        if (list8 == null) {
            if (arrayList != null) {
                list4 = arrayList;
                if (aVar4 != null) {
                    String str = aVar4.a;
                    if (!epx.f(str, videoDiscoveryCatalogRepository$Section4 != null ? videoDiscoveryCatalogRepository$Section4.a : null)) {
                        Iterator it5 = list4.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                obj2 = it5.next();
                                if (epx.f(((VideoDiscoveryCatalogRepository$Section) obj2).a, str)) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        a2 = (VideoDiscoveryCatalogRepository$Section) obj2;
                        boolean z = a2 == null && a2.f;
                        if (videoInfo != null || (videoFile2 = videoInfo.b) == null) {
                            videoDiscoveryCatalogRepository$Section2 = a2;
                            list5 = list4;
                        } else {
                            VideoDiscoveryCatalogSourceArgs a3 = bVar.a.a();
                            if (a3 instanceof VideoDiscoveryCatalogSourceArgs.Catalog) {
                                videoRecommendationVideosType = VideoRecommendationVideosType.SIMILAR_VIDEOS;
                            } else if (a3 instanceof VideoDiscoveryCatalogSourceArgs.OfflineVideos) {
                                videoRecommendationVideosType = VideoRecommendationVideosType.OFFLINE;
                            } else {
                                if (!(a3 instanceof VideoDiscoveryCatalogSourceArgs.MusicMix)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                videoRecommendationVideosType = VideoRecommendationVideosType.MUSIC_MIX;
                            }
                            VideoRecommendationVideosType videoRecommendationVideosType2 = videoRecommendationVideosType;
                            VideoPlayerState P02 = this.a0.P0();
                            VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section6 = a2;
                            yfs0.a aVar5 = new yfs0.a(videoFile2, videoDiscoveryCatalogRepository$Section6, list4, videoRecommendationVideosType2, z, (P02 == null || (videoPlayerStatInfo = P02.d) == null) ? null : videoPlayerStatInfo.b);
                            videoDiscoveryCatalogRepository$Section2 = videoDiscoveryCatalogRepository$Section6;
                            list5 = list4;
                            dVar.onNext(aVar5);
                        }
                        list6 = videoDiscoveryCatalogRepository$Section2 != null ? videoDiscoveryCatalogRepository$Section2.h : null;
                        if (list6 == null) {
                            list6 = EmptyList.b;
                        }
                        D0(list6, true);
                        T(new n.c(videoDiscoveryCatalogRepository$Section2, list5));
                    }
                }
                a2 = videoDiscoveryCatalogRepository$Section4 == null ? VideoDiscoveryCatalogRepository$Section.a(videoDiscoveryCatalogRepository$Section4, (List) ref$ObjectRef.element) : null;
                if (a2 == null) {
                }
                if (videoInfo != null) {
                }
                videoDiscoveryCatalogRepository$Section2 = a2;
                list5 = list4;
                if (videoDiscoveryCatalogRepository$Section2 != null) {
                }
                if (list6 == null) {
                }
                D0(list6, true);
                T(new n.c(videoDiscoveryCatalogRepository$Section2, list5));
            }
            list8 = EmptyList.b;
        }
        list4 = list8;
        if (aVar4 != null) {
        }
        if (videoDiscoveryCatalogRepository$Section4 == null) {
        }
        if (a2 == null) {
        }
        if (videoInfo != null) {
        }
        videoDiscoveryCatalogRepository$Section2 = a2;
        list5 = list4;
        if (videoDiscoveryCatalogRepository$Section2 != null) {
        }
        if (list6 == null) {
        }
        D0(list6, true);
        T(new n.c(videoDiscoveryCatalogRepository$Section2, list5));
    }

    public final void W0(VideoMinimizableState videoMinimizableState, com.vk.video.ui.discovery.minimizable.related_videos.h hVar) {
        h.a aVar = hVar instanceof h.a ? (h.a) hVar : null;
        if (aVar != null) {
            TypeScreen A = fvr.A(videoMinimizableState);
            int i = A == null ? -1 : d.$EnumSwitchMapping$0[A.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                VideoAlbum a2 = com.vk.video.ui.discovery.minimizable.related_videos.g.a(aVar.h);
                V0(new DiscoveryAction.h.b(new acb0(a2.c, a2.b, a2.r, null)), aVar.a, A);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.List<com.vk.dto.video.Doc2DocItem>] */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.util.ArrayList] */
    public final void X(q qVar, c.e eVar) {
        yfs0.a aVar;
        Object obj;
        ?? r0;
        VideoFile videoFile;
        zst0 A0;
        String str = eVar.b;
        io.reactivex.rxjava3.subjects.d<yfs0> dVar = this.e0;
        yfs0 P0 = dVar.P0();
        if (P0 instanceof yfs0.a) {
            aVar = (yfs0.a) P0;
        } else {
            if (!(P0 instanceof yfs0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = ((yfs0.b) P0).a;
            if (aVar == null) {
                return;
            }
        }
        Iterator<T> it = aVar.c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (epx.f(((VideoDiscoveryCatalogRepository$Section) obj).a, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = (VideoDiscoveryCatalogRepository$Section) obj;
        if (videoDiscoveryCatalogRepository$Section != null && (r0 = videoDiscoveryCatalogRepository$Section.d) != 0) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = r0;
            if (!fxc0.B().J().J0()) {
                zst0 A02 = A0();
                if (((A02 != null ? A02.u() : null) instanceof zst0.a.C4199a) && (A0 = A0()) != null) {
                    Stack<a2s0> f = A0.f();
                    ArrayList arrayList = new ArrayList(c5g.u(f, 10));
                    Iterator<T> it2 = f.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((a2s0) it2.next()).a.a1());
                    }
                    Iterable iterable = (Iterable) ref$ObjectRef.element;
                    ?? arrayList2 = new ArrayList();
                    for (Object obj2 : iterable) {
                        List<VideoFile> list = ((Doc2DocItem) obj2).b;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it3 = list.iterator();
                            while (it3.hasNext()) {
                                if (arrayList.contains(((VideoFile) it3.next()).a1())) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(obj2);
                    }
                    ref$ObjectRef.element = arrayList2;
                }
            }
            MiniPlayerControllersWrapper.VideoInfo videoInfo = qVar.b;
            if (videoInfo != null && (videoFile = videoInfo.b) != null) {
                dVar.onNext(yfs0.a.h(aVar, videoFile, VideoDiscoveryCatalogRepository$Section.a(videoDiscoveryCatalogRepository$Section, (List) ref$ObjectRef.element), 60));
            }
            com.vk.video.ui.discovery.catalog.b bVar = this.N;
            bVar.h = videoDiscoveryCatalogRepository$Section;
            bVar.i = null;
            this.J.b(new VideoMinimizableDiscoverySideEffect.q(videoDiscoveryCatalogRepository$Section));
            T(new n.c(videoDiscoveryCatalogRepository$Section, aVar.c));
        } else if (videoDiscoveryCatalogRepository$Section != null) {
            e0(videoDiscoveryCatalogRepository$Section, aVar);
        }
        MiniPlayerControllersWrapper.VideoInfo videoInfo2 = qVar.b;
        if (videoInfo2 != null) {
            V0(new DiscoveryAction.k(eVar.b), videoInfo2.b, fvr.A(qVar.n));
        }
        if (G0()) {
            this.G.a();
        }
    }

    public final void X0(q qVar, hsf0.a aVar) {
        MiniPlayerControllersWrapper.VideoInfo videoInfo;
        VideoFile videoFile;
        AboutVideoItem.s x0 = x0(qVar);
        if (x0 == null || (videoInfo = qVar.b) == null || (videoFile = videoInfo.b) == null) {
            return;
        }
        int i = x0.b;
        UserId userId = x0.c;
        this.V.getClass();
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), null, videoFile.r(), null, 40, null);
        CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem = new CommonStat$TypeCommonEventItem(Long.valueOf(i), Long.valueOf(userId.b), null, null, 12, null);
        if (aVar.equals(hsf0.a.i.a)) {
            hsf0.b(schemeStat$EventItem, new CommonVideoStat$TypeVideoPlayerMusicTrackView(CommonVideoStat$TypeVideoPlayerMusicTrackView.EventType.MUSIC_TRACK_SHOW, null, commonStat$TypeCommonEventItem, 2, null));
            return;
        }
        if (aVar.equals(hsf0.a.c.a)) {
            hsf0.a(schemeStat$EventItem, new CommonVideoStat$TypeVideoPlayerMusicTrackClick(CommonVideoStat$TypeVideoPlayerMusicTrackClick.EventType.MUSIC_TRACK_CLICK, null, commonStat$TypeCommonEventItem, 2, null));
            return;
        }
        if (aVar.equals(hsf0.a.C3019a.a)) {
            hsf0.a(schemeStat$EventItem, new CommonVideoStat$TypeVideoMusicTrackAdd(CommonVideoStat$TypeVideoMusicTrackAdd.EventType.MUSIC_TRACK_ADD, CommonVideoStat$TypeVideoMusicTrackAdd.EventSubtype.CARD, commonStat$TypeCommonEventItem));
            return;
        }
        if (aVar.equals(hsf0.a.e.a)) {
            hsf0.a(schemeStat$EventItem, new CommonVideoStat$TypeVideoMusicTrackDelete(CommonVideoStat$TypeVideoMusicTrackDelete.EventType.MUSIC_TRACK_DELETE, CommonVideoStat$TypeVideoMusicTrackDelete.EventSubtype.CARD, commonStat$TypeCommonEventItem));
            return;
        }
        if (aVar instanceof hsf0.a.b) {
            hsf0.b(schemeStat$EventItem, new CommonVideoStat$TypeVideoMusicTrackAddSuccess(CommonVideoStat$TypeVideoMusicTrackAddSuccess.EventType.MUSIC_TRACK_ADD_SUCCESS, commonStat$TypeCommonEventItem, ((hsf0.a.b) aVar).a ? CommonVideoStat$TypeVideoMusicTrackAddSuccess.EventSubtype.FIRST_TIME : null));
            return;
        }
        if (aVar.equals(hsf0.a.h.a)) {
            hsf0.a(schemeStat$EventItem, new CommonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick(CommonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick.EventType.MUSIC_TRACK_CARD_SIMILAR_MUSIC_CLICK, commonStat$TypeCommonEventItem));
            return;
        }
        if (aVar.equals(hsf0.a.g.a)) {
            hsf0.a(schemeStat$EventItem, new CommonVideoStat$TypeVideoMusicTrackCardOpenPlaylist(CommonVideoStat$TypeVideoMusicTrackCardOpenPlaylist.EventType.MUSIC_TRACK_CARD_OPEN_PLAYLIST, commonStat$TypeCommonEventItem));
        } else if (aVar.equals(hsf0.a.d.a)) {
            hsf0.a(schemeStat$EventItem, new MobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch(MobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch.EventType.MUSIC_TRACK_CARD_CONTINUE_WATCH, commonStat$TypeCommonEventItem));
        } else {
            if (!aVar.equals(hsf0.a.f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            hsf0.b(schemeStat$EventItem, new CommonVideoStat$TypeVideoMusicTrackAddLogIn(CommonVideoStat$TypeVideoMusicTrackAddLogIn.EventType.MUSIC_TRACK_ADD_LOG_IN));
        }
    }

    public final void Y() {
        this.b0.f.h.onNext("");
        T(new n.h0(null, null, 0L, false, new AuthorAnnounceState(null, null, null, 7, null), 28));
        i4s0 i4s0Var = this.n;
        ReentrantLock reentrantLock = i4s0Var.h;
        reentrantLock.lock();
        try {
            i4s0Var.g = false;
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
            i4s0Var.a();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void Z(q qVar, c.l lVar) {
        if (lVar instanceof c.l.b) {
            T(new n.w(null, null, null, Integer.valueOf(qVar.w.d + 1), null, null, null, null, 247));
            return;
        }
        if (lVar instanceof c.l.f) {
            T(new n.w(null, null, Boolean.valueOf(((c.l.f) lVar).b), null, null, null, null, null, 251));
            return;
        }
        if (lVar instanceof c.l.d) {
            T(new n.w(null, null, null, null, null, Boolean.valueOf(((c.l.d) lVar).b), null, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE));
            return;
        }
        if (lVar instanceof c.l.a) {
            T(new n.w(null, Boolean.FALSE, null, null, null, null, null, null, 253));
        } else if (epx.f(lVar, c.l.e.b)) {
            T(new n.w(null, null, null, null, Boolean.TRUE, null, null, null, 239));
        } else {
            if (!(lVar instanceof c.l.C1975c)) {
                throw new NoWhenBranchMatchedException();
            }
            T(new n.w(null, null, null, null, null, null, null, Boolean.valueOf(((c.l.C1975c) lVar).b), 127));
        }
    }

    public final void Z0(q qVar, AuthorAnnounceState authorAnnounceState) {
        VideoAnnounceState videoAnnounceState = qVar.o;
        VideoAnnounceState.Shown shown = videoAnnounceState instanceof VideoAnnounceState.Shown ? (VideoAnnounceState.Shown) videoAnnounceState : null;
        if (shown == null) {
            return;
        }
        T(new n.h0(shown.b, shown.c, shown.d, shown.e, authorAnnounceState, 8));
    }

    public final void a1(MiniPlayerControllersWrapper.VideoInfo videoInfo, boolean z) {
        MiniPlayerControllersWrapper.VideoInfo videoInfo2;
        VideoFile videoFile;
        VideoFile videoFile2;
        String str = null;
        this.P.onNext(Optional.ofNullable(videoInfo != null ? videoInfo.b : null));
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            this.z.Ua().onNext(Optional.ofNullable(videoInfo != null ? videoInfo.b : null));
        }
        com.vk.video.ui.discovery.minimizable.fullscreen_lock.a aVar = this.Z;
        q qVar = (q) this.i.c;
        aVar.getClass();
        MiniPlayerControllersWrapper.VideoInfo videoInfo3 = qVar.b;
        String a1 = (videoInfo3 == null || (videoFile2 = videoInfo3.b) == null) ? null : videoFile2.a1();
        if (videoInfo != null && (videoFile = videoInfo.b) != null) {
            str = videoFile.a1();
        }
        if (epx.f(a1, str)) {
            videoInfo2 = videoInfo;
        } else {
            videoInfo2 = videoInfo;
            com.vk.video.ui.discovery.minimizable.fullscreen_lock.a.e(aVar, qVar, null, null, null, videoInfo2, 14);
        }
        T(new n.u(videoInfo2, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(q qVar, c.r rVar) {
        q qVar2;
        boolean d2;
        VideoFile orElse;
        VideoFile orElse2;
        yg5 yg5Var;
        VideoFile orElse3;
        VideoMinimizableState videoMinimizableState = rVar.b;
        com.vk.video.ui.discovery.minimizable.b bVar = rVar.c;
        boolean z = videoMinimizableState instanceof VideoMinimizableState.Expanded.Compact;
        f4z<VideoMinimizableDiscoverySideEffect> f4zVar = this.J;
        if (!z) {
            f4zVar.b(VideoMinimizableDiscoverySideEffect.w.a.a);
        }
        com.vk.video.ui.discovery.minimizable.b bVar2 = rVar.c;
        com.vk.video.ui.discovery.minimizable.fullscreen_lock.a aVar = this.Z;
        aVar.getClass();
        VideoMinimizableState videoMinimizableState2 = qVar.n;
        VideoMiniPlayerState videoMiniPlayerState = qVar.l;
        if (!videoMinimizableState.equals(videoMinimizableState2) || !epx.f(qVar.p, bVar2)) {
            if (!(videoMinimizableState2 instanceof VideoMinimizableState.Pip) || !com.vk.libvideo.api.minimizable.a.g(videoMinimizableState) || !com.vk.video.ui.discovery.minimizable.player.b.b(videoMiniPlayerState.d.b)) {
                qVar2 = qVar;
                com.vk.video.ui.discovery.minimizable.fullscreen_lock.a.e(aVar, qVar2, videoMinimizableState, null, bVar2, null, 20);
                T(new n.z(videoMinimizableState, bVar));
                d2 = com.vk.libvideo.api.minimizable.a.d(videoMinimizableState);
                boolean z2 = false;
                io.reactivex.rxjava3.subjects.d<Optional<VideoFile>> dVar = this.P;
                if (d2) {
                    Optional<VideoFile> P0 = dVar.P0();
                    if (P0 != null && (orElse3 = P0.orElse(null)) != null) {
                        f4zVar.b(new VideoMinimizableDiscoverySideEffect.l(orElse3));
                    }
                    if (com.vk.video.ui.discovery.minimizable.player.b.c(videoMiniPlayerState.d.b) && bVar.equals(b.C1972b.a)) {
                        f4zVar.b(new VideoMinimizableDiscoverySideEffect.p.b());
                        T(new n.f0(true));
                    }
                    if (qVar2.q && com.vk.video.ui.discovery.minimizable.player.b.b(videoMiniPlayerState.d.b) && !bVar.equals(b.C1972b.a)) {
                        f4zVar.b(VideoMinimizableDiscoverySideEffect.p.e.a);
                        T(new n.f0(false));
                    }
                }
                if (this.f.L1() && videoMiniPlayerState.g && (videoMinimizableState instanceof VideoMinimizableState.Collapsed)) {
                    bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                    xh5 xh5Var = b.C1208b.a().c;
                    je0 N0 = (xh5Var != null || (yg5Var = xh5Var.a) == null) ? null : yg5Var.N0();
                    com.vk.libvideo.api.ad.a j = N0 == null ? ((ye0.a) N0).j() : null;
                    a.AbstractC1195a abstractC1195a = !(j instanceof a.AbstractC1195a) ? (a.AbstractC1195a) j : null;
                    f4zVar.b(new VideoMinimizableDiscoverySideEffect.p.g(N0, abstractC1195a == null ? abstractC1195a.c() : false));
                }
                if (videoMinimizableState instanceof VideoMinimizableState.Expanded) {
                    f4zVar.b(VideoMinimizableDiscoverySideEffect.g.a.a);
                } else if (bVar.equals(b.a.a)) {
                    f4zVar.b(VideoMinimizableDiscoverySideEffect.g.b.a);
                } else {
                    f4zVar.b(VideoMinimizableDiscoverySideEffect.g.a.a);
                }
                if (epx.f(videoMinimizableState2, videoMinimizableState)) {
                    if (!(videoMinimizableState instanceof VideoMinimizableState.Animating)) {
                        if (videoMinimizableState2 instanceof VideoMinimizableState.Animating) {
                            VideoMinimizableState.Animating animating = (VideoMinimizableState.Animating) videoMinimizableState2;
                            videoMinimizableState2 = !epx.f(animating.c, videoMinimizableState) ? animating.b : animating.c;
                        }
                        boolean z3 = videoMinimizableState instanceof VideoMinimizableState.Collapsed;
                        sts0 sts0Var = this.f0;
                        if (z3) {
                            sts0Var.getClass();
                            sts0Var.a(SchemeStat$TypeVideoMiniplayerItem.EventType.OPEN);
                        } else if ((videoMinimizableState2 instanceof VideoMinimizableState.Collapsed) && com.vk.libvideo.api.minimizable.a.d(videoMinimizableState)) {
                            sts0Var.getClass();
                            sts0Var.a(SchemeStat$TypeVideoMiniplayerItem.EventType.RESTORE);
                        }
                    }
                    Optional<VideoFile> P02 = dVar.P0();
                    if (P02 != null && (orElse2 = P02.orElse(null)) != null && fxc0.B().c(orElse2) && !(videoMinimizableState instanceof VideoMinimizableState.Collapsed)) {
                        f4zVar.b(VideoMinimizableDiscoverySideEffect.n0.a.a);
                    }
                    Optional<VideoFile> P03 = dVar.P0();
                    if (P03 != null && (orElse = P03.orElse(null)) != null) {
                        z2 = orElse.W9();
                    }
                    if (z2) {
                        if (videoMinimizableState instanceof VideoMinimizableState.Collapsed) {
                            f4zVar.b(VideoMinimizableDiscoverySideEffect.h.b.a);
                        } else {
                            f4zVar.b(VideoMinimizableDiscoverySideEffect.h.a.a);
                        }
                    }
                    if (videoMinimizableState instanceof VideoMinimizableState.Hidden) {
                        i4s0 i4s0Var = this.n;
                        ReentrantLock reentrantLock = i4s0Var.h;
                        reentrantLock.lock();
                        try {
                            if (i4s0Var.c != null) {
                                i4s0Var.f = true;
                            }
                            s3q0 s3q0Var = s3q0.a;
                            reentrantLock.unlock();
                            if (T0(qVar2)) {
                                v0();
                            } else {
                                f4zVar.b(new VideoMinimizableDiscoverySideEffect.p.b());
                            }
                        } catch (Throwable th) {
                            reentrantLock.unlock();
                            throw th;
                        }
                    }
                    if (videoMinimizableState instanceof VideoMinimizableState.PreparedToPip) {
                        I0(qVar2, VideoMinimizableDiscoverySideEffect.Motion.MinimizeTrigger.ByGesture);
                        return;
                    }
                    return;
                }
                return;
            }
            aVar.h();
        }
        qVar2 = qVar;
        T(new n.z(videoMinimizableState, bVar));
        d2 = com.vk.libvideo.api.minimizable.a.d(videoMinimizableState);
        boolean z22 = false;
        io.reactivex.rxjava3.subjects.d<Optional<VideoFile>> dVar2 = this.P;
        if (d2) {
        }
        if (this.f.L1()) {
            bpn0 bpn0Var2 = com.vk.libvideo.autoplay.b.B;
            xh5 xh5Var2 = b.C1208b.a().c;
            if (xh5Var2 != null) {
            }
            if (N0 == null) {
            }
            if (!(j instanceof a.AbstractC1195a)) {
            }
            f4zVar.b(new VideoMinimizableDiscoverySideEffect.p.g(N0, abstractC1195a == null ? abstractC1195a.c() : false));
        }
        if (videoMinimizableState instanceof VideoMinimizableState.Expanded) {
        }
        if (epx.f(videoMinimizableState2, videoMinimizableState)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04ad  */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0(q qVar, c.u uVar) {
        VideoDiscoveryRecommendationsSourceArgs recommendations;
        VideoDiscoveryCatalogSourceArgs.Catalog.CatalogType catalogType;
        VideoDiscoveryCatalogSourceArgs.Catalog.CatalogType catalogType2;
        VideoFile videoFile;
        VideoDiscoveryCatalogSourceArgs catalog;
        com.vk.video.ui.discovery.recommendations.b bVar;
        com.vk.video.ui.discovery.catalog.b bVar2;
        fks0 fks0Var;
        boolean z;
        VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs;
        VideoDiscoveryRelatedVideosSourceArgs temporaryPlaylist;
        boolean f;
        VideoMinimizableScreenArgs videoMinimizableScreenArgs;
        VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs2;
        VideoMinimizableScreenArgs.RelatedVideoArgs relatedVideoArgs;
        VideoMinimizableScreenArgs videoMinimizableScreenArgs2;
        boolean z2;
        VideoFile videoFile2;
        zst0 A0;
        boolean z3;
        boolean z4;
        zst0.a aVar;
        io.reactivex.rxjava3.disposables.c cVar;
        VideoRelatedVideosOrder videoRelatedVideosOrder;
        VideoMinimizableScreenArgs videoMinimizableScreenArgs3 = uVar.b;
        if (videoMinimizableScreenArgs3.b.g) {
            this.p.z9().a();
        }
        VideoMinimizableScreenArgs.ControllerArgs controllerArgs = videoMinimizableScreenArgs3.b;
        VideoMinimizableScreenArgs.RelatedVideoArgs relatedVideoArgs2 = videoMinimizableScreenArgs3.c;
        VideoMinimizableScreenArgs.ControllerArgs controllerArgs2 = videoMinimizableScreenArgs3.b;
        MiniPlayerControllersWrapper.VideoInfo videoInfo = new MiniPlayerControllersWrapper.VideoInfo(controllerArgs.b, controllerArgs.d, controllerArgs.c, controllerArgs.e, controllerArgs.f, null, controllerArgs.i, controllerArgs.j, 32, null);
        q.c cVar2 = qVar.m;
        MiniPlayerControllersWrapper.VideoInfo videoInfo2 = qVar.b;
        boolean z5 = cVar2.a;
        VideoFile videoFile3 = videoInfo.b;
        boolean z6 = z5 && !fxc0.B().c(videoFile3);
        boolean z7 = videoInfo2 != null;
        boolean z8 = videoInfo.f;
        if (!z8 || (!z7 && z6)) {
            mzp0 mzp0Var = this.E.b;
            if (mzp0Var != null) {
                mzp0Var.a();
            }
            Integer a6 = videoFile3.a6();
            int o0 = videoFile3.o0();
            jsf0 jsf0Var = this.v;
            VideoDiscoveryRecommendationsSourceArgs.Recommendations.RecommendationType recommendationType = jsf0Var.d(o0, a6) ? VideoDiscoveryRecommendationsSourceArgs.Recommendations.RecommendationType.MUSIC : VideoDiscoveryRecommendationsSourceArgs.Recommendations.RecommendationType.VIDEO;
            VideoFile videoFile4 = controllerArgs2.b;
            if ((relatedVideoArgs2 instanceof VideoMinimizableScreenArgs.RelatedVideoArgs.TemporaryPlaylist) || (relatedVideoArgs2 instanceof VideoMinimizableScreenArgs.RelatedVideoArgs.Playlist)) {
                recommendations = new VideoDiscoveryRecommendationsSourceArgs.Recommendations(videoFile4.o0(), videoFile4.I0(), videoFile4.r(), controllerArgs2.c, recommendationType);
            } else if (relatedVideoArgs2.equals(VideoMinimizableScreenArgs.RelatedVideoArgs.Recommendations.b)) {
                recommendations = new VideoDiscoveryRecommendationsSourceArgs.Recommendations(videoFile4.o0(), videoFile4.I0(), videoFile4.r(), controllerArgs2.c, recommendationType);
            } else if (relatedVideoArgs2 instanceof VideoMinimizableScreenArgs.RelatedVideoArgs.MusicMix) {
                recommendations = new VideoDiscoveryRecommendationsSourceArgs.MusicMix(videoFile4.o0(), videoFile4.I0(), ((VideoMinimizableScreenArgs.RelatedVideoArgs.MusicMix) relatedVideoArgs2).b, videoFile4.r(), controllerArgs2.c);
            } else {
                if (!relatedVideoArgs2.equals(VideoMinimizableScreenArgs.RelatedVideoArgs.OfflineVideos.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                recommendations = new VideoDiscoveryRecommendationsSourceArgs.OfflineVideos(controllerArgs2.c);
            }
            com.vk.video.ui.discovery.recommendations.b bVar3 = this.M;
            bVar3.h = recommendations;
            T(new n.c0(recommendations));
            if (MusicFeatures.AUDIO_VIDEO_RELATED_TAB.h()) {
                if (jsf0Var.d(videoFile3.o0(), videoFile3.a6())) {
                    catalogType = VideoDiscoveryCatalogSourceArgs.Catalog.CatalogType.MUSIC;
                    catalogType2 = catalogType;
                    fks0 fks0Var2 = this.f;
                    boolean v1 = fks0Var2.v1();
                    videoFile = controllerArgs2.b;
                    if (!(relatedVideoArgs2 instanceof VideoMinimizableScreenArgs.RelatedVideoArgs.TemporaryPlaylist) || (relatedVideoArgs2 instanceof VideoMinimizableScreenArgs.RelatedVideoArgs.Playlist)) {
                        catalog = new VideoDiscoveryCatalogSourceArgs.Catalog(videoFile.o0(), videoFile.I0(), videoFile.r(), controllerArgs2.c, catalogType2);
                    } else if (relatedVideoArgs2.equals(VideoMinimizableScreenArgs.RelatedVideoArgs.Recommendations.b)) {
                        catalog = new VideoDiscoveryCatalogSourceArgs.Catalog(videoFile.o0(), videoFile.I0(), videoFile.r(), controllerArgs2.c, catalogType2);
                    } else if (relatedVideoArgs2 instanceof VideoMinimizableScreenArgs.RelatedVideoArgs.MusicMix) {
                        catalog = v1 ? new VideoDiscoveryCatalogSourceArgs.Catalog(videoFile.o0(), videoFile.I0(), videoFile.r(), controllerArgs2.c, catalogType2) : new VideoDiscoveryCatalogSourceArgs.MusicMix(videoFile.I0(), videoFile.o0(), ((VideoMinimizableScreenArgs.RelatedVideoArgs.MusicMix) relatedVideoArgs2).b, videoFile.r(), null, 16, null);
                    } else {
                        if (!relatedVideoArgs2.equals(VideoMinimizableScreenArgs.RelatedVideoArgs.OfflineVideos.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        catalog = new VideoDiscoveryCatalogSourceArgs.OfflineVideos(controllerArgs2.c);
                    }
                    com.vk.video.ui.discovery.catalog.b bVar4 = this.N;
                    bVar4.f = catalog;
                    T(new n.t(catalog));
                    com.vk.video.ui.discovery.minimizable.related_videos.b bVar5 = (com.vk.video.ui.discovery.minimizable.related_videos.b) this.R.getValue();
                    bVar5.getClass();
                    if (relatedVideoArgs2 instanceof VideoMinimizableScreenArgs.RelatedVideoArgs.Playlist) {
                        bVar = bVar3;
                        bVar2 = bVar4;
                        fks0Var = fks0Var2;
                        z = z8;
                        if (!(relatedVideoArgs2 instanceof VideoMinimizableScreenArgs.RelatedVideoArgs.TemporaryPlaylist)) {
                            videoDiscoveryRelatedVideosSourceArgs = null;
                            y0().a(qVar, videoDiscoveryRelatedVideosSourceArgs, true);
                            f = epx.f(videoInfo2, videoInfo);
                            f4z<VideoMinimizableDiscoverySideEffect> f4zVar = this.J;
                            if (f) {
                                videoMinimizableScreenArgs = videoMinimizableScreenArgs3;
                                videoDiscoveryRelatedVideosSourceArgs2 = videoDiscoveryRelatedVideosSourceArgs;
                                relatedVideoArgs = relatedVideoArgs2;
                                if (qVar.n instanceof VideoMinimizableState.Hidden) {
                                    f4zVar.b(VideoMinimizableDiscoverySideEffect.p.e.a);
                                }
                            } else {
                                hg1.f(this.k0);
                                j500 j500Var = (j500) this.r0.getValue();
                                j500Var.getClass();
                                if (videoFile3.T1() && videoFile3.q0()) {
                                    tci tciVar = j500Var.a;
                                    int o02 = videoFile3.o0();
                                    Owner s = videoFile3.s();
                                    UserId userId = s != null ? s.b : null;
                                    int o03 = videoFile3.o0();
                                    Owner s2 = videoFile3.s();
                                    UserId userId2 = s2 != null ? s2.b : null;
                                    relatedVideoArgs = relatedVideoArgs2;
                                    videoDiscoveryRelatedVideosSourceArgs2 = videoDiscoveryRelatedVideosSourceArgs;
                                    videoMinimizableScreenArgs = videoMinimizableScreenArgs3;
                                    tfx tfxVar = new tfx("video.getLongPollServer", new fbj0(8), new x6t0(1));
                                    tfx.l(tfxVar, "video_id", o03, 0, 0, 8);
                                    if (userId2 != null) {
                                        tfx.n(tfxVar, "owner_id", userId2, 0L, 0L, 12);
                                    }
                                    dz2 x = yfb.x(tfxVar);
                                    x.n = true;
                                    ahn.D(x);
                                    cVar = rsg0.T(x).L(new yh1(new g500(tciVar, o02, userId), 22), false).subscribe(new lav(new defpackage.o(24, j500Var, videoFile3), 5));
                                } else {
                                    videoMinimizableScreenArgs = videoMinimizableScreenArgs3;
                                    videoDiscoveryRelatedVideosSourceArgs2 = videoDiscoveryRelatedVideosSourceArgs;
                                    relatedVideoArgs = relatedVideoArgs2;
                                    cVar = null;
                                }
                                this.k0 = cVar;
                                J0(recommendations, videoFile3);
                                K0(recommendations);
                                a1(videoInfo, true);
                                Y();
                                f4zVar.b(VideoMinimizableDiscoverySideEffect.u.a);
                                R0();
                                f4zVar.b(new VideoMinimizableDiscoverySideEffect.j.a((List<? extends VideoDialogType>) Collections.singletonList(VideoDialogType.RelatedVideos)));
                            }
                            bpn0 bpn0Var = this.g0;
                            if (z) {
                                f4zVar.b(new VideoMinimizableDiscoverySideEffect.Motion.d(null, 2));
                                sts0 sts0Var = this.f0;
                                sts0Var.getClass();
                                sts0Var.a(SchemeStat$TypeVideoMiniplayerItem.EventType.OPEN_ON_COLD_START);
                                videoMinimizableScreenArgs2 = videoMinimizableScreenArgs;
                            } else {
                                boolean q0 = controllerArgs2.b.q0();
                                vvs0 vvs0Var = this.h;
                                if (q0 && ((Boolean) bpn0Var.getValue()).booleanValue()) {
                                    vvs0Var.getClass();
                                } else {
                                    vvs0Var.getClass();
                                }
                                videoMinimizableScreenArgs2 = videoMinimizableScreenArgs;
                                f4zVar.b(new VideoMinimizableDiscoverySideEffect.d(!epx.f((videoInfo2 == null || (videoFile2 = videoInfo2.b) == null) ? null : videoFile2.a1(), videoFile3.a1()), videoMinimizableScreenArgs2.e));
                                f4zVar.b(new VideoMinimizableDiscoverySideEffect.l0(VideoAdFreeTrapEventTrigger.DISCOVERY_START));
                                com.vk.video.ui.discovery.minimizable.related_videos.h hVar = qVar.s;
                                VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs3 = videoDiscoveryRelatedVideosSourceArgs2;
                                boolean z9 = videoDiscoveryRelatedVideosSourceArgs3 instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist;
                                if (z9 && (hVar instanceof h.a)) {
                                    h.a aVar2 = (h.a) hVar;
                                    VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource = aVar2.h;
                                    if (videoDiscoveryRelatedVideosSource instanceof VideoDiscoveryRelatedVideosSource.Playlist) {
                                        VideoDiscoveryRelatedVideosSource.Playlist playlist = (VideoDiscoveryRelatedVideosSource.Playlist) videoDiscoveryRelatedVideosSource;
                                        VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist2 = (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs3;
                                        if (playlist.b.b == playlist2.c && epx.f(playlist.c.c, playlist2.i) && ((VideoDiscoveryRelatedVideosSource.Playlist) aVar2.h).b.q.isEmpty()) {
                                            z2 = true;
                                            boolean z10 = !z9 && ((VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs3).k;
                                            if (z2 && !z10) {
                                                VideoAlbum a2 = com.vk.video.ui.discovery.minimizable.related_videos.g.a(((h.a) hVar).h);
                                                V0(new DiscoveryAction.h.b(new acb0(a2.c, a2.b, a2.r, null)), ((VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs3).b, TypeScreen.DISCOVERY);
                                                f4zVar.b(VideoMinimizableDiscoverySideEffect.j.C1970j.a);
                                            }
                                        }
                                    }
                                }
                                z2 = false;
                                if (z9) {
                                }
                                if (z2) {
                                    VideoAlbum a22 = com.vk.video.ui.discovery.minimizable.related_videos.g.a(((h.a) hVar).h);
                                    V0(new DiscoveryAction.h.b(new acb0(a22.c, a22.b, a22.r, null)), ((VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs3).b, TypeScreen.DISCOVERY);
                                    f4zVar.b(VideoMinimizableDiscoverySideEffect.j.C1970j.a);
                                }
                            }
                            A0 = A0();
                            if (A0 != null) {
                                VideoMinimizableScreenArgs.RelatedVideoArgs relatedVideoArgs3 = relatedVideoArgs;
                                if ((relatedVideoArgs3 instanceof VideoMinimizableScreenArgs.RelatedVideoArgs.Recommendations) || (relatedVideoArgs3 instanceof VideoMinimizableScreenArgs.RelatedVideoArgs.MusicMix)) {
                                    z3 = true;
                                    z4 = false;
                                    aVar = zst0.a.C4199a.a;
                                } else if (relatedVideoArgs3 instanceof VideoMinimizableScreenArgs.RelatedVideoArgs.OfflineVideos) {
                                    z3 = true;
                                    aVar = new zst0.a.b(true);
                                    z4 = false;
                                } else {
                                    z3 = true;
                                    if (!(relatedVideoArgs3 instanceof VideoMinimizableScreenArgs.RelatedVideoArgs.TemporaryPlaylist) && !(relatedVideoArgs3 instanceof VideoMinimizableScreenArgs.RelatedVideoArgs.Playlist)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z4 = false;
                                    aVar = new zst0.a.b(false);
                                }
                                A0.h(aVar, controllerArgs2.g, (controllerArgs2.b.q0() && ((Boolean) bpn0Var.getValue()).booleanValue()) ? z3 : z4);
                            } else {
                                z3 = true;
                                z4 = false;
                            }
                            if (controllerArgs2.g) {
                                bVar.c(null);
                                bVar2.a(null);
                            }
                            this.X.b();
                            ReplyInfo replyInfo = videoMinimizableScreenArgs2.d;
                            if (fxc0.B().J().H0()) {
                                this.j.getClass();
                                if (replyInfo != null) {
                                    f4zVar.b(new VideoMinimizableDiscoverySideEffect.j.e(replyInfo));
                                }
                            }
                            VideoFile videoFile5 = controllerArgs2.b;
                            long j = controllerArgs2.i;
                            if (fks0Var.v()) {
                                oos0 x2 = com.vk.toggle.d.x();
                                if (x2 != null ? x2.b : z3) {
                                    u0(videoFile5, j);
                                }
                            }
                            f4zVar.b(new VideoMinimizableDiscoverySideEffect.b0(new VideoGrowthVideoParams(videoFile5.a1(), j, false, false, 12, null), videoFile5.ab() == OfferVkVideo.LISTING ? z3 : z4));
                        }
                        VideoMinimizableScreenArgs.RelatedVideoArgs.TemporaryPlaylist temporaryPlaylist2 = (VideoMinimizableScreenArgs.RelatedVideoArgs.TemporaryPlaylist) relatedVideoArgs2;
                        temporaryPlaylist = new VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist(controllerArgs2.b, temporaryPlaylist2.b, temporaryPlaylist2.c, controllerArgs2.c, temporaryPlaylist2.d, temporaryPlaylist2.e);
                    } else {
                        VideoMinimizableScreenArgs.RelatedVideoArgs.Playlist playlist3 = (VideoMinimizableScreenArgs.RelatedVideoArgs.Playlist) relatedVideoArgs2;
                        VideoPlaylistReversionComponent videoPlaylistReversionComponent = bVar5.a;
                        int i = playlist3.b;
                        fks0Var = fks0Var2;
                        z = z8;
                        long j2 = playlist3.c.b;
                        boolean L0 = videoPlaylistReversionComponent.L0(i, j2);
                        bVar2 = bVar4;
                        int i2 = playlist3.e;
                        bVar = bVar3;
                        if (i2 != -1) {
                            if (L0) {
                                videoPlaylistReversionComponent.M2(i, j2, false);
                                wjs0.a(new fwr0(i, j2));
                            }
                            videoRelatedVideosOrder = new VideoRelatedVideosOrder.Shuffled(i2, playlist3.f.a1());
                        } else {
                            videoRelatedVideosOrder = L0 ? VideoRelatedVideosOrder.Reverse.b : VideoRelatedVideosOrder.Original.b;
                        }
                        temporaryPlaylist = new VideoDiscoveryRelatedVideosSourceArgs.Playlist(controllerArgs2.b, playlist3.b, null, null, playlist3.c, controllerArgs2.c, playlist3.d, videoRelatedVideosOrder, 12, null);
                    }
                    videoDiscoveryRelatedVideosSourceArgs = temporaryPlaylist;
                    y0().a(qVar, videoDiscoveryRelatedVideosSourceArgs, true);
                    f = epx.f(videoInfo2, videoInfo);
                    f4z<VideoMinimizableDiscoverySideEffect> f4zVar2 = this.J;
                    if (f) {
                    }
                    bpn0 bpn0Var2 = this.g0;
                    if (z) {
                    }
                    A0 = A0();
                    if (A0 != null) {
                    }
                    if (controllerArgs2.g) {
                    }
                    this.X.b();
                    ReplyInfo replyInfo2 = videoMinimizableScreenArgs2.d;
                    if (fxc0.B().J().H0()) {
                    }
                    VideoFile videoFile52 = controllerArgs2.b;
                    long j3 = controllerArgs2.i;
                    if (fks0Var.v()) {
                    }
                    f4zVar2.b(new VideoMinimizableDiscoverySideEffect.b0(new VideoGrowthVideoParams(videoFile52.a1(), j3, false, false, 12, null), videoFile52.ab() == OfferVkVideo.LISTING ? z3 : z4));
                }
            }
            catalogType = VideoDiscoveryCatalogSourceArgs.Catalog.CatalogType.VIDEO;
            catalogType2 = catalogType;
            fks0 fks0Var22 = this.f;
            boolean v12 = fks0Var22.v1();
            videoFile = controllerArgs2.b;
            if (relatedVideoArgs2 instanceof VideoMinimizableScreenArgs.RelatedVideoArgs.TemporaryPlaylist) {
            }
            catalog = new VideoDiscoveryCatalogSourceArgs.Catalog(videoFile.o0(), videoFile.I0(), videoFile.r(), controllerArgs2.c, catalogType2);
            com.vk.video.ui.discovery.catalog.b bVar42 = this.N;
            bVar42.f = catalog;
            T(new n.t(catalog));
            com.vk.video.ui.discovery.minimizable.related_videos.b bVar52 = (com.vk.video.ui.discovery.minimizable.related_videos.b) this.R.getValue();
            bVar52.getClass();
            if (relatedVideoArgs2 instanceof VideoMinimizableScreenArgs.RelatedVideoArgs.Playlist) {
            }
            videoDiscoveryRelatedVideosSourceArgs = temporaryPlaylist;
            y0().a(qVar, videoDiscoveryRelatedVideosSourceArgs, true);
            f = epx.f(videoInfo2, videoInfo);
            f4z<VideoMinimizableDiscoverySideEffect> f4zVar22 = this.J;
            if (f) {
            }
            bpn0 bpn0Var22 = this.g0;
            if (z) {
            }
            A0 = A0();
            if (A0 != null) {
            }
            if (controllerArgs2.g) {
            }
            this.X.b();
            ReplyInfo replyInfo22 = videoMinimizableScreenArgs2.d;
            if (fxc0.B().J().H0()) {
            }
            VideoFile videoFile522 = controllerArgs2.b;
            long j32 = controllerArgs2.i;
            if (fks0Var.v()) {
            }
            f4zVar22.b(new VideoMinimizableDiscoverySideEffect.b0(new VideoGrowthVideoParams(videoFile522.a1(), j32, false, false, 12, null), videoFile522.ab() == OfferVkVideo.LISTING ? z3 : z4));
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void d0(q qVar, b bVar) {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            ((efs0) this.O.getValue()).getClass();
            qu5.c().getClass();
        }
        boolean z = bVar == b.CLICK;
        zst0 A0 = A0();
        a2s0 b2 = A0 != null ? A0.b(z, true) : null;
        if (b2 != null) {
            p0(b2, qVar, false, false);
            if (bVar == b.AUTO) {
                T(new n.o(true));
            }
            if (z) {
                MiniPlayerControllersWrapper.VideoInfo videoInfo = qVar.b;
                if ((videoInfo != null ? videoInfo.b : null) != null) {
                    ltt0.a(videoInfo.b, b2.a, false);
                }
            }
        }
    }

    public final void e0(VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section, yfs0.a aVar) {
        this.N.i = videoDiscoveryCatalogRepository$Section;
        this.J.b(new VideoMinimizableDiscoverySideEffect.i(videoDiscoveryCatalogRepository$Section, this.e0.P0() instanceof yfs0.b));
        T(new n.c(videoDiscoveryCatalogRepository$Section, aVar.c));
    }

    public final void f0(boolean z) {
        io.reactivex.rxjava3.subjects.d<yfs0> dVar = this.e0;
        if (z && (dVar.P0() instanceof yfs0.b)) {
            return;
        }
        yfs0.a aVar = null;
        if (z) {
            yfs0 P0 = dVar.P0();
            if (P0 instanceof yfs0.a) {
                aVar = (yfs0.a) P0;
            }
        } else {
            T(new n.c(null, EmptyList.b));
        }
        dVar.onNext(new yfs0.b(aVar));
    }

    public final void g0(c.e0 e0Var, q qVar) {
        Owner s;
        VideoRestriction O;
        RestrictionButton restrictionButton;
        if (fxc0.B().J().f1().a()) {
            R0();
        }
        MiniPlayerControllersWrapper.VideoInfo videoInfo = qVar.b;
        UserId userId = null;
        VideoFile videoFile = videoInfo != null ? videoInfo.b : null;
        String str = (videoFile == null || (O = videoFile.O()) == null || (restrictionButton = O.e) == null) ? null : restrictionButton.b;
        if (videoFile != null && (s = videoFile.s()) != null) {
            userId = s.b;
        }
        if (epx.f(userId, e0Var.b) && epx.f(str, RestrictionButton.Action.DONAT.h())) {
            this.J.b(VideoMinimizableDiscoverySideEffect.j0.a);
        }
    }

    public final void h0(q qVar) {
        DonutVideoAction donutVideoAction;
        DonutVideoUiModel.DescriptionChip descriptionChip;
        DonutVideoUiModel.PreviewBadge previewBadge;
        VideoFile videoFile;
        MiniPlayerControllersWrapper.VideoInfo videoInfo = qVar.b;
        DonutVideoAction donutVideoAction2 = null;
        DonutVideoUiModel a2 = this.A.a((videoInfo == null || (videoFile = videoInfo.b) == null) ? null : nkt0.a(videoFile), DonutVideoCardSource.LARGE_CARD);
        if (a2 == null || (previewBadge = a2.b) == null || (donutVideoAction = previewBadge.e) == null) {
            if (a2 != null && (descriptionChip = a2.c) != null) {
                donutVideoAction2 = descriptionChip.e;
            }
            if (donutVideoAction2 == null) {
                return;
            } else {
                donutVideoAction = donutVideoAction2;
            }
        }
        this.J.b(new VideoMinimizableDiscoverySideEffect.x(donutVideoAction, DonutVideoClickSource.PAYWALL));
    }

    public final void i0(q qVar, c.g0 g0Var) {
        boolean z = false;
        boolean z2 = g0Var.c && !g0Var.b;
        com.vk.video.ui.discovery.minimizable.related_videos.h hVar = qVar.s;
        if ((hVar instanceof h.b) || ((hVar instanceof h.a) && (((h.a) hVar).f instanceof m.b))) {
            z = true;
        }
        if (z2 && z) {
            y0().e(qVar);
        }
    }

    public final void j0(q qVar, c.h0 h0Var) {
        if (fxc0.B().J().f1().c()) {
            return;
        }
        zst0 A0 = A0();
        if (A0 != null) {
            yfs0 yfs0Var = h0Var.b;
            A0.i(yfs0Var instanceof yfs0.a ? (yfs0.a) yfs0Var : null);
        }
        if ((h0Var.b instanceof yfs0.a) && (qVar.o instanceof VideoAnnounceState.Shown)) {
            V(qVar, null);
        }
    }

    public final void k0(q qVar, c.i0 i0Var) {
        if (fxc0.B().J().f1().b()) {
            return;
        }
        zst0 A0 = A0();
        if (A0 != null) {
            lgs0 lgs0Var = i0Var.b;
            A0.i(lgs0Var instanceof lgs0.a ? (lgs0.a) lgs0Var : null);
        }
        if ((i0Var.b instanceof lgs0.a) && (qVar.o instanceof VideoAnnounceState.Shown)) {
            V(qVar, null);
        }
    }

    public final void l0(c.k0 k0Var) {
        SdkVideoFile c2 = g620.f().e0().c(k0Var.b);
        ListBuilder e2 = e43.e();
        ClipFeedTab.TopVideo.Mode mode = null;
        e2.add(new ClipFeedTab.TopVideo(mode, k0Var.c, k0Var.b.r(), null, null, 25, null));
        bpn0 bpn0Var = o25.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        if (((b25) bpn0Var.getValue()).b()) {
            e2.add(ClipFeedTab.UserSubscriptions.b);
        }
        this.J.b(new VideoMinimizableDiscoverySideEffect.m(e2.g(), new kwc(Collections.singletonList(c2), PaginationKey.Initial.b, 0)));
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v120, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0(q qVar, c.o0 o0Var) {
        VideoFile orElse;
        VideoFile videoFile;
        VideoFile videoFile2;
        VideoFile videoFile3;
        VideoFile videoFile4;
        VideoFile videoFile5;
        VideoFile videoFile6;
        DonutVideoModel a2;
        VideoFile videoFile7;
        VideoPlayerState videoPlayerState;
        VideoPlayerStatus videoPlayerStatus;
        VideoPlayerStatus videoPlayerStatus2;
        boolean z;
        boolean z2;
        boolean z3;
        VideoPlayerStatus.Completed completed;
        VideoFile videoFile8;
        VideoFile videoFile9;
        VideoFile orElse2;
        q qVar2 = qVar;
        com.vk.video.ui.discovery.minimizable.fullscreen_lock.a aVar = this.Z;
        io.reactivex.rxjava3.subjects.d<Optional<VideoFile>> dVar = this.P;
        fks0 fks0Var = this.f;
        f4z<VideoMinimizableDiscoverySideEffect> f4zVar = this.J;
        if (epx.f(o0Var, c.o0.b.b)) {
            sts0 sts0Var = this.f0;
            sts0Var.getClass();
            sts0Var.a(SchemeStat$TypeVideoMiniplayerItem.EventType.CLOSE);
            v0();
            return;
        }
        if (epx.f(o0Var, c.o0.C1977c.b)) {
            U0();
            return;
        }
        if (epx.f(o0Var, c.o0.e.b)) {
            I0(qVar2, VideoMinimizableDiscoverySideEffect.Motion.MinimizeTrigger.Other);
            return;
        }
        if (epx.f(o0Var, c.o0.i.b)) {
            f4zVar.b(VideoMinimizableDiscoverySideEffect.p.c.a);
            return;
        }
        boolean z4 = false;
        if (epx.f(o0Var, c.o0.j.b)) {
            if (fks0Var.L1() && (qVar2.n instanceof VideoMinimizableState.Collapsed) && com.vk.video.ui.discovery.minimizable.player.b.a(qVar2.l.d.b)) {
                f4zVar.b(VideoMinimizableDiscoverySideEffect.Motion.b.a);
                f4zVar.b(VideoMinimizableDiscoverySideEffect.p.e.a);
                return;
            }
            Optional<VideoFile> P0 = dVar.P0();
            VideoFile orElse3 = P0 != null ? P0.orElse(null) : null;
            if (orElse3 != null && fxc0.B().c(orElse3)) {
                f4zVar.b(VideoMinimizableDiscoverySideEffect.n0.a.a);
                fxc0.B().d(orElse3);
            }
            Optional<VideoFile> P02 = dVar.P0();
            if (P02 != null && (orElse2 = P02.orElse(null)) != null) {
                z4 = orElse2.W9();
            }
            f4zVar.b(z4 ? VideoMinimizableDiscoverySideEffect.h.b.a : VideoMinimizableDiscoverySideEffect.p.e.a);
            return;
        }
        if (epx.f(o0Var, c.o0.k.b)) {
            f4zVar.b(VideoMinimizableDiscoverySideEffect.c.a.a);
            MiniPlayerControllersWrapper.VideoInfo videoInfo = qVar2.b;
            if (videoInfo == null || (videoFile9 = videoInfo.b) == null || !videoFile9.q0() || !((Boolean) this.g0.getValue()).booleanValue()) {
                V(qVar2, new y4(29, this, qVar2));
                return;
            }
            return;
        }
        if (epx.f(o0Var, c.o0.g.b)) {
            fxc0.B().s().l();
            d0(qVar2, b.CLICK);
            return;
        }
        if (epx.f(o0Var, c.o0.m.b)) {
            fxc0.B().s().l();
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                ((efs0) this.O.getValue()).getClass();
                qu5.c().getClass();
            }
            MiniPlayerControllersWrapper.VideoInfo videoInfo2 = qVar2.b;
            VideoFile videoFile10 = videoInfo2 != null ? videoInfo2.b : null;
            zst0 A0 = A0();
            a2s0 c2 = A0 != null ? A0.c() : null;
            if (videoFile10 == null || c2 == null) {
                return;
            }
            p0(c2, qVar2, false, false);
            ltt0.a(videoFile10, c2.a, true);
            return;
        }
        if (!(o0Var instanceof c.o0.l)) {
            if (!(o0Var instanceof c.o0.h)) {
                if (epx.f(o0Var, c.o0.f.b)) {
                    if (qVar2.n instanceof VideoMinimizableState.Collapsed) {
                        f4zVar.b(VideoMinimizableDiscoverySideEffect.Motion.b.a);
                        if (fks0Var.L1()) {
                            VideoPlayerStatus videoPlayerStatus3 = qVar2.l.d.b;
                            if ((!(videoPlayerStatus3 instanceof VideoPlayerStatus.AdPaused) || ((VideoPlayerStatus.AdPaused) videoPlayerStatus3).b) && (!(videoPlayerStatus3 instanceof VideoPlayerStatus.Paused) || ((VideoPlayerStatus.Paused) videoPlayerStatus3).b)) {
                                return;
                            }
                            f4zVar.b(VideoMinimizableDiscoverySideEffect.p.e.a);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (epx.f(o0Var, c.o0.t.b)) {
                    v0();
                    return;
                }
                if (epx.f(o0Var, c.o0.q.b)) {
                    W0(qVar2.n, qVar2.s);
                    f4zVar.b(VideoMinimizableDiscoverySideEffect.j.C1970j.a);
                    return;
                }
                if (epx.f(o0Var, c.o0.d.b)) {
                    f4zVar.b(new VideoMinimizableDiscoverySideEffect.j.h(com.vk.libvideo.api.minimizable.a.g(qVar2.n) ? UxPollEntryPointLocation.PlayerFullscreen : UxPollEntryPointLocation.PlayerDiscovery));
                    return;
                }
                if (o0Var instanceof c.o0.a) {
                    MiniPlayerControllersWrapper.VideoInfo videoInfo3 = qVar2.b;
                    if (videoInfo3 == null || (videoFile3 = videoInfo3.b) == null) {
                        return;
                    }
                    VideoPlayerProgress videoPlayerProgress = qVar2.l.d.c;
                    VideoPlayerProgress.Vod vod = videoPlayerProgress instanceof VideoPlayerProgress.Vod ? (VideoPlayerProgress.Vod) videoPlayerProgress : null;
                    V0(new DiscoveryAction.b(Integer.valueOf((int) (vod != null ? vod.b / 1000 : 0L))), videoFile3, fvr.A(qVar2.n));
                    f4zVar.b(VideoMinimizableDiscoverySideEffect.w.a.a);
                    return;
                }
                if (o0Var instanceof c.o0.o) {
                    MiniPlayerControllersWrapper.VideoInfo videoInfo4 = qVar2.b;
                    if (videoInfo4 == null || (videoFile2 = videoInfo4.b) == null) {
                        return;
                    }
                    V0(new DiscoveryAction.i(((c.o0.o) o0Var).b), videoFile2, fvr.A(qVar2.n));
                    return;
                }
                if (epx.f(o0Var, c.o0.p.b)) {
                    MiniPlayerControllersWrapper.VideoInfo videoInfo5 = qVar2.b;
                    if (videoInfo5 == null || (videoFile = videoInfo5.b) == null) {
                        return;
                    }
                    V0(DiscoveryAction.j.a, videoFile, fvr.A(qVar2.n));
                    return;
                }
                if (epx.f(o0Var, c.o0.n.b)) {
                    this.X.b();
                    aVar.getClass();
                    FullscreenLockState fullscreenLockState = qVar2.t;
                    if ((fullscreenLockState instanceof FullscreenLockState.TemporarilyUnlocked) || (fullscreenLockState instanceof FullscreenLockState.Locked)) {
                        aVar.g(new VideoMinimizableDiscoverySideEffect.p.a(false));
                        return;
                    }
                    return;
                }
                if (!(o0Var instanceof c.o0.r)) {
                    if (!epx.f(o0Var, c.o0.s.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    T(n.d.b);
                    return;
                }
                boolean z5 = ((c.o0.r) o0Var).b;
                Optional<VideoFile> P03 = dVar.P0();
                if (P03 != null && (orElse = P03.orElse(null)) != null) {
                    z4 = orElse.e2();
                }
                if (z5) {
                    f4zVar.b(this.q ? new VideoMinimizableDiscoverySideEffect.k0(z4) : VideoMinimizableDiscoverySideEffect.z.a);
                    return;
                } else {
                    f4zVar.b(VideoMinimizableDiscoverySideEffect.h0.a);
                    f4zVar.b(new VideoMinimizableDiscoverySideEffect.k0(z4));
                    return;
                }
            }
            vts0 vts0Var = ((c.o0.h) o0Var).b;
            if (epx.f(vts0Var, vts0.b.a)) {
                MiniPlayerControllersWrapper.VideoInfo videoInfo6 = qVar2.b;
                if (videoInfo6 != null && (videoFile7 = videoInfo6.b) != null) {
                    V0(DiscoveryAction.d.a, videoFile7, fvr.A(qVar2.n));
                }
                f4zVar.b(VideoMinimizableDiscoverySideEffect.j.c.a);
                return;
            }
            if (epx.f(vts0Var, vts0.d.a)) {
                MiniPlayerControllersWrapper.VideoInfo videoInfo7 = qVar2.b;
                if (videoInfo7 != null && (videoFile6 = videoInfo7.b) != null && (a2 = nkt0.a(videoFile6)) != null && this.F.b(a2)) {
                    f4zVar.b(new VideoMinimizableDiscoverySideEffect.k(a2));
                    return;
                }
                MiniPlayerControllersWrapper.VideoInfo videoInfo8 = qVar2.b;
                if (videoInfo8 != null && (videoFile5 = videoInfo8.b) != null) {
                    V0(DiscoveryAction.c.a, videoFile5, fvr.A(qVar2.n));
                }
                f4zVar.b(new VideoMinimizableDiscoverySideEffect.j.e(null));
                f4zVar.b(VideoMinimizableDiscoverySideEffect.w.a.a);
                return;
            }
            if (epx.f(vts0Var, vts0.f.a)) {
                MiniPlayerControllersWrapper.VideoInfo videoInfo9 = qVar2.b;
                if (videoInfo9 != null && (videoFile4 = videoInfo9.b) != null) {
                    V0(DiscoveryAction.e.a, videoFile4, fvr.A(qVar2.n));
                }
                f4zVar.b(VideoMinimizableDiscoverySideEffect.j.g.a);
                return;
            }
            if (vts0Var instanceof vts0.e) {
                f4zVar.b(new VideoMinimizableDiscoverySideEffect.j.f(((vts0.e) vts0Var).a));
                return;
            }
            if (vts0Var instanceof vts0.c) {
                ((vts0.c) vts0Var).getClass();
                f4zVar.b(new VideoMinimizableDiscoverySideEffect.j.d());
                return;
            }
            if (!(vts0Var instanceof vts0.j)) {
                if (vts0Var instanceof vts0.g) {
                    this.n.b();
                    return;
                }
                if (vts0Var instanceof vts0.i) {
                    vts0.i iVar = (vts0.i) vts0Var;
                    if (!(iVar instanceof vts0.i.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zet0 zet0Var = this.u;
                    VideoFile videoFile11 = ((vts0.i.a) iVar).a.b;
                    yet0 yet0Var = new yet0(Long.valueOf(videoFile11.o0()), videoFile11.I0(), videoFile11.r());
                    VideoSeekEventSource videoSeekEventSource = VideoSeekEventSource.Episode;
                    VideoMinimizableState videoMinimizableState = qVar2.n;
                    zet0Var.a(yet0Var, videoSeekEventSource, videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal ? VideoSeekEventScreenMode.FullscreenLandscape : videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical ? VideoSeekEventScreenMode.FullscreenPortrait : VideoSeekEventScreenMode.Discovery, r2.a.g);
                    return;
                }
                return;
            }
            vts0.j jVar = (vts0.j) vts0Var;
            if (epx.f(jVar, vts0.j.c.a)) {
                y0().d(qVar2, VideoRelatedVideosPagingType.Playlist);
                return;
            }
            if (epx.f(jVar, vts0.j.b.a)) {
                y0().c(qVar2, VideoRelatedVideosPagingType.Playlist);
                return;
            }
            if (epx.f(jVar, vts0.j.d.a)) {
                y0().e(qVar2);
                return;
            }
            if (jVar instanceof vts0.j.f) {
                p0(new a2s0(((vts0.j.f) jVar).a, VideoApplyNewVideoSourceType.FromRelatedVideoDialog), qVar2, false, false);
                return;
            }
            if (epx.f(jVar, vts0.j.h.a)) {
                com.vk.video.ui.discovery.minimizable.related_videos.k y0 = y0();
                y0.getClass();
                VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs = qVar2.c;
                if (!(videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist)) {
                    if (!(videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist) && videoDiscoveryRelatedVideosSourceArgs != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist = (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs;
                int i = playlist.c;
                VideoRelatedVideosOrder videoRelatedVideosOrder = playlist.l;
                UserId userId = playlist.i;
                boolean z6 = videoRelatedVideosOrder instanceof VideoRelatedVideosOrder.Reverse;
                y0.c.M2(i, userId.b, !z6);
                wjs0.a(new fwr0(i, userId.b));
                y0.a(qVar2, VideoDiscoveryRelatedVideosSourceArgs.Playlist.e(playlist, null, null, null, !z6 ? VideoRelatedVideosOrder.Reverse.b : VideoRelatedVideosOrder.Original.b, 127), false);
                return;
            }
            if (epx.f(jVar, vts0.j.a.a)) {
                com.vk.video.ui.discovery.minimizable.related_videos.k y02 = y0();
                y02.getClass();
                com.vk.video.ui.discovery.minimizable.related_videos.h hVar = qVar2.s;
                if (hVar instanceof h.a) {
                    h.a aVar2 = (h.a) hVar;
                    y02.l(h.a.h(aVar2, null, null, 0, null, null, null, null, null, u3r0.a(aVar2.i), false, false, false, 3839));
                    return;
                }
                return;
            }
            if (epx.f(jVar, vts0.j.g.a)) {
                com.vk.video.ui.discovery.minimizable.related_videos.k y03 = y0();
                y03.getClass();
                VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs2 = qVar2.c;
                if (!(videoDiscoveryRelatedVideosSourceArgs2 instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist)) {
                    if (!(videoDiscoveryRelatedVideosSourceArgs2 instanceof VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist) && videoDiscoveryRelatedVideosSourceArgs2 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist2 = (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs2;
                if (playlist2.l instanceof VideoRelatedVideosOrder.Reverse) {
                    int i2 = playlist2.c;
                    UserId userId2 = playlist2.i;
                    y03.c.M2(i2, userId2.b, false);
                    wjs0.a(new fwr0(i2, userId2.b));
                }
                y03.a(qVar2, VideoDiscoveryRelatedVideosSourceArgs.Playlist.e(playlist2, null, null, null, playlist2.l instanceof VideoRelatedVideosOrder.Shuffled ? VideoRelatedVideosOrder.Original.b : new VideoRelatedVideosOrder.Shuffled(swe0.n(new k9x(0, Integer.MAX_VALUE, 1), Random.b), playlist2.b.a1()), 127), false);
                return;
            }
            if (!(jVar instanceof vts0.j.e)) {
                if (!(jVar instanceof vts0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                DonutVideoAction donutVideoAction = ((vts0.a) jVar).a;
                if (donutVideoAction != null) {
                    f4zVar.b(new VideoMinimizableDiscoverySideEffect.x(donutVideoAction, DonutVideoClickSource.DESCRIPTION));
                    return;
                }
                return;
            }
            com.vk.video.ui.discovery.minimizable.related_videos.h hVar2 = qVar2.s;
            h.a aVar3 = hVar2 instanceof h.a ? (h.a) hVar2 : null;
            if (aVar3 != null) {
                VideoSeason videoSeason = ((vts0.j.e) jVar).a;
                VideoAlbum a3 = com.vk.video.ui.discovery.minimizable.related_videos.g.a(aVar3.h);
                V0(new DiscoveryAction.h.a(new acb0(a3.c, videoSeason.b, VideoAlbumType.Season, Integer.valueOf(a3.b))), aVar3.a, fvr.A(qVar2.n));
            }
            y0().f(qVar2, ((vts0.j.e) jVar).a.b);
            return;
        }
        c.o0.l lVar = (c.o0.l) o0Var;
        if (fks0Var.C() && com.vk.video.ui.discovery.minimizable.player.b.c(lVar.b.b)) {
            MiniPlayerControllersWrapper.VideoInfo videoInfo10 = qVar2.b;
            String a1 = (videoInfo10 == null || (videoFile8 = videoInfo10.b) == null) ? null : videoFile8.a1();
            MiniPlayerControllersWrapper.VideoInfo videoInfo11 = qVar2.b;
            boolean z7 = (videoInfo11 != null ? videoInfo11.e : null) != null;
            if (a1 != null && z7) {
                this.r.getClass();
            }
        }
        h0w0 h0w0Var = this.s;
        VideoMinimizableState videoMinimizableState2 = qVar2.n;
        VideoMiniPlayerState videoMiniPlayerState = qVar2.l;
        if (com.vk.libvideo.api.minimizable.a.g(videoMinimizableState2)) {
            h0w0Var.a();
            VideoPlayerStatus videoPlayerStatus4 = lVar.b.b;
            VideoPlayerStatus.Paused paused = videoPlayerStatus4 instanceof VideoPlayerStatus.Paused ? (VideoPlayerStatus.Paused) videoPlayerStatus4 : null;
            boolean z8 = paused != null && paused.b;
            if (h0w0Var.c(z8) || h0w0Var.g(z8)) {
                f4zVar.b(VideoMinimizableDiscoverySideEffect.o0.b.a);
            }
        } else {
            h0w0Var.f();
        }
        io.reactivex.rxjava3.subjects.d<VideoPlayerState> dVar2 = this.a0;
        VideoPlayerState videoPlayerState2 = lVar.b;
        dVar2.onNext(videoPlayerState2);
        VideoPlayerStatus videoPlayerStatus5 = videoPlayerState2.b;
        VideoPlayerState videoPlayerState3 = videoMiniPlayerState.d;
        if (!com.vk.video.ui.discovery.minimizable.player.b.c(videoPlayerState3.b) && com.vk.video.ui.discovery.minimizable.player.b.c(videoPlayerStatus5) && epx.f(qVar2.p, b.C1972b.a)) {
            f4zVar.b(new VideoMinimizableDiscoverySideEffect.Motion.e(b.c.a));
        }
        if ((qVar2.o instanceof VideoAnnounceState.Shown) && (videoPlayerStatus5 instanceof VideoPlayerStatus.Playing)) {
            Y();
        }
        aVar.getClass();
        VideoPlayerStatus videoPlayerStatus6 = videoPlayerState3.b;
        VideoPlayerStatus videoPlayerStatus7 = videoPlayerState3.b;
        if (videoPlayerStatus6.getClass() != videoPlayerStatus5.getClass()) {
            videoPlayerStatus = videoPlayerStatus5;
            videoPlayerStatus2 = videoPlayerStatus7;
            com.vk.video.ui.discovery.minimizable.fullscreen_lock.a.e(aVar, qVar, null, videoPlayerState2, null, null, 26);
            aVar = aVar;
            qVar2 = qVar;
            videoPlayerState = videoPlayerState2;
        } else {
            videoPlayerState = videoPlayerState2;
            videoPlayerStatus = videoPlayerStatus5;
            videoPlayerStatus2 = videoPlayerStatus7;
        }
        FullscreenLockState fullscreenLockState2 = qVar2.t;
        if (((fullscreenLockState2 instanceof FullscreenLockState.Locked) || (fullscreenLockState2 instanceof FullscreenLockState.TemporarilyUnlocked)) && ((com.vk.video.ui.discovery.minimizable.player.b.a(videoPlayerStatus2) && (videoPlayerStatus instanceof VideoPlayerStatus.Paused)) || (((videoPlayerStatus2 instanceof VideoPlayerStatus.Paused) && (videoPlayerStatus instanceof VideoPlayerStatus.Playing)) || (((videoPlayerStatus2 instanceof VideoPlayerStatus.Loading) && (videoPlayerStatus instanceof VideoPlayerStatus.Playing)) || ((videoPlayerStatus2 instanceof VideoPlayerStatus.Completed) && (videoPlayerStatus instanceof VideoPlayerStatus.Playing)))))) {
            aVar.g(new VideoMinimizableDiscoverySideEffect.p.a(false));
        }
        if (com.vk.video.ui.discovery.minimizable.player.b.c(videoPlayerStatus2) != com.vk.video.ui.discovery.minimizable.player.b.c(videoPlayerStatus)) {
            com.vk.video.ui.discovery.minimizable.related_videos.h hVar3 = qVar2.s;
            M0(qVar2, hVar3, hVar3, com.vk.video.ui.discovery.minimizable.player.b.c(videoPlayerStatus));
        }
        int i3 = 3;
        List l = e43.l(fpf0.a(VideoPlayerStatus.Loading.class), fpf0.a(VideoPlayerStatus.Playing.class), fpf0.a(VideoPlayerStatus.Paused.class), fpf0.a(VideoPlayerStatus.Completed.class));
        if (!(l instanceof Collection) || !l.isEmpty()) {
            Iterator it = l.iterator();
            while (it.hasNext()) {
                if (((dcy) it.next()).c(videoPlayerStatus)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.o0.onNext(Boolean.valueOf(z));
        List l2 = e43.l(fpf0.a(VideoPlayerStatus.Loading.class), fpf0.a(VideoPlayerStatus.Playing.class), fpf0.a(VideoPlayerStatus.Paused.class), fpf0.a(VideoPlayerStatus.Completed.class));
        if (!(l2 instanceof Collection) || !l2.isEmpty()) {
            Iterator it2 = l2.iterator();
            while (it2.hasNext()) {
                if (((dcy) it2.next()).c(videoPlayerStatus)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        this.s0.onNext(Boolean.valueOf(z2));
        b1(this, qVar2, null, false, videoPlayerState.b, 6);
        T(new n.b0(videoPlayerState));
        if (qVar2.r && (videoPlayerStatus instanceof VideoPlayerStatus.Playing)) {
            T(new n.o(false));
            MiniPlayerControllersWrapper.VideoInfo videoInfo12 = qVar2.b;
            VideoFile videoFile12 = videoInfo12 != null ? videoInfo12.b : null;
            if (videoFile12 != null) {
                e4s0 e4s0Var = this.T;
                e4s0Var.getClass();
                i0q0.j(new x8p(i3, e4s0Var, videoFile12));
            }
        }
        if (fks0Var.i0()) {
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            if (com.vk.libvideo.autoplay.e.a()) {
                z3 = true;
                completed = VideoPlayerStatus.Completed.b;
                if (videoPlayerStatus.equals(completed) || epx.f(videoPlayerStatus2, completed) || !(qVar2.n instanceof VideoMinimizableState.Pip) || !z3) {
                    T(new n.b0(videoPlayerState));
                } else {
                    d0(qVar2, b.AUTO);
                }
                if (p1p0.a(this.p0)) {
                    return;
                }
                final veg0 z0 = z0();
                z0.getClass();
                VideoPlayerProgress videoPlayerProgress2 = videoPlayerState.c;
                boolean z9 = videoPlayerProgress2 instanceof VideoPlayerProgress.Vod;
                VideoPlayerProgress.Vod vod2 = z9 ? (VideoPlayerProgress.Vod) videoPlayerProgress2 : null;
                final long j = (vod2 != null ? vod2.b : 0L) / 1000;
                z0.t = j;
                Integer num = z0.i;
                VideoPlayerProgress.Vod vod3 = z9 ? (VideoPlayerProgress.Vod) videoPlayerProgress2 : null;
                Long valueOf = vod3 != null ? Long.valueOf(vod3.b) : null;
                boolean z10 = (videoPlayerStatus instanceof VideoPlayerStatus.Playing) && valueOf != null;
                BuildInfo.Client client = BuildInfo.a;
                VKApplication vKApplication = com.vk.core.apps.a.a;
                final boolean z11 = System.currentTimeMillis() - z0.u < ((long) ((num != null ? num.intValue() : 0) * 2000)) && z10 && num != null && valueOf.longValue() > ((long) (num.intValue() * 1000));
                boolean isEmpty = z0.m.isEmpty();
                final boolean z12 = !isEmpty;
                final boolean d2 = com.vk.libvideo.api.minimizable.a.d(z0.a.P0());
                L.c("RETRANSLATION_UTILS", new gzs() { // from class: xsna.teg0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        StringBuilder sb = new StringBuilder();
                        sb.append(j);
                        sb.append(" sec: shouldShowPopupOnCurrentVideo: ");
                        gsi0.c(sb, z0.r, ", isRightMoment: ", z11, ", hasDevices: ");
                        sb.append(z12);
                        sb.append(", correctDiscoveryState: ");
                        sb.append(d2);
                        return sb.toString();
                    }
                });
                if (z0.r && z11 && !isEmpty && d2) {
                    veg0 z02 = z0();
                    Iterator it3 = z02.m.iterator();
                    if (!it3.hasNext()) {
                        f4zVar.b(new VideoMinimizableDiscoverySideEffect.w.b(null, j5g.O0(z0().m)));
                        return;
                    }
                    ((vz9) it3.next()).getClass();
                    Pair<String, String> pair = z02.l;
                    if (pair == null) {
                        throw null;
                    }
                    pair.i();
                    throw null;
                }
                return;
            }
        }
        z3 = false;
        completed = VideoPlayerStatus.Completed.b;
        if (videoPlayerStatus.equals(completed)) {
        }
        T(new n.b0(videoPlayerState));
        if (p1p0.a(this.p0)) {
        }
    }

    public final void n0(final q qVar, c.r0 r0Var) {
        boolean z = r0Var instanceof c.r0.C1978c;
        f4z<VideoMinimizableDiscoverySideEffect> f4zVar = this.J;
        if (z) {
            AboutVideoItem.s x0 = x0(qVar);
            if (x0 != null) {
                f4zVar.b(new VideoMinimizableDiscoverySideEffect.s.b(x0.g, x0.d, x0.f, x0.h, x0.i));
                X0(qVar, hsf0.a.c.a);
                return;
            }
            return;
        }
        if (!(r0Var instanceof c.r0.b)) {
            if (r0Var instanceof c.r0.d) {
                f4zVar.b(VideoMinimizableDiscoverySideEffect.s.c.a);
                X0(qVar, hsf0.a.h.a);
                return;
            } else if (r0Var instanceof c.r0.f) {
                X0(qVar, hsf0.a.g.a);
                return;
            } else if (r0Var instanceof c.r0.a) {
                X0(qVar, hsf0.a.d.a);
                return;
            } else {
                if (!(r0Var instanceof c.r0.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                X0(qVar, hsf0.a.f.a);
                return;
            }
        }
        AboutVideoItem.s x02 = x0(qVar);
        if (x02 == null) {
            return;
        }
        String str = x02.k;
        int i = x02.b;
        UserId userId = x02.c;
        boolean z2 = x02.h;
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        jsf0 jsf0Var = this.v;
        if (!z2) {
            X0(qVar, hsf0.a.C3019a.a);
            x<csf0> c2 = jsf0Var.c(userId, Integer.valueOf(i), x02.j, str);
            d120 d120Var = new d120(new btl0(3, this, qVar), 26);
            c2.getClass();
            bVar.b(new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.n(c2, d120Var), new qh3(2, this, qVar)).subscribe(new k5j0(new pm90(9, this, qVar), 17), new onm0(new q7a0(11, this, qVar), 8)));
            return;
        }
        X0(qVar, hsf0.a.e.a);
        io.reactivex.rxjava3.core.a a2 = jsf0Var.a(userId, Integer.valueOf(i), str);
        qgs0 qgs0Var = new qgs0(new vnb0(7, this, qVar), 1);
        a2.getClass();
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        bVar.b(new w(a2, qgs0Var, lVar, kVar, kVar, kVar, kVar).j(new io.reactivex.rxjava3.functions.a() { // from class: xsna.fus0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                Boolean bool = Boolean.FALSE;
                com.vk.video.ui.discovery.minimizable.g gVar = com.vk.video.ui.discovery.minimizable.g.this;
                gVar.T(new n.a(com.vk.video.ui.discovery.minimizable.g.c1(gVar, qVar, bool, null, 4)));
            }
        }).subscribe(new an80(2, this, qVar), new m3y(new hij0(this, 14), 27)));
    }

    public final void o0(q qVar, c.s0 s0Var) {
        com.vk.video.ui.discovery.minimizable.related_videos.h hVar;
        VideoFile videoFile;
        VideoFile videoFile2;
        com.vk.video.ui.discovery.minimizable.related_videos.h hVar2;
        VideoFile videoFile3;
        if (s0Var instanceof c.s0.f) {
            M0(qVar, qVar.s, ((c.s0.f) s0Var).b, com.vk.video.ui.discovery.minimizable.player.b.c(qVar.l.d.b));
            return;
        }
        int i = 0;
        if (s0Var instanceof c.s0.j) {
            com.vk.video.ui.discovery.minimizable.related_videos.k y0 = y0();
            c.s0.j jVar = (c.s0.j) s0Var;
            int i2 = jVar.b;
            rbt0 rbt0Var = jVar.c;
            VideoRelatedVideosPagingType videoRelatedVideosPagingType = jVar.d;
            com.vk.video.ui.discovery.minimizable.related_videos.c cVar = y0.j;
            boolean z = cVar.c;
            xa9 xa9Var = cVar.d;
            VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs = qVar.c;
            VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist = videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist ? (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs : null;
            if (playlist != null && (!com.vk.video.ui.discovery.minimizable.related_videos.f.b(playlist) || epx.f(playlist.g, playlist.h))) {
                i = 1;
            }
            com.vk.video.ui.discovery.minimizable.related_videos.h hVar3 = qVar.s;
            h.a aVar = hVar3 instanceof h.a ? (h.a) hVar3 : null;
            if (aVar != null) {
                com.vk.video.ui.discovery.minimizable.related_videos.m mVar = aVar.f;
                com.vk.video.ui.discovery.minimizable.related_videos.o oVar = aVar.g;
                int i3 = c.a.$EnumSwitchMapping$0[videoRelatedVideosPagingType.ordinal()];
                if (i3 == 1) {
                    o.a b2 = com.vk.video.ui.discovery.minimizable.related_videos.p.b(oVar, i2, rbt0Var);
                    m.a b3 = com.vk.video.ui.discovery.minimizable.related_videos.n.b(mVar, i2, rbt0Var, z);
                    if (i != 0) {
                        xa9Var.invoke(h.a.h(aVar, null, null, 0, null, null, b3, b2, null, null, false, false, false, 3999));
                        return;
                    } else {
                        xa9Var.invoke(h.a.h(aVar, null, null, 0, null, null, null, b2, null, null, false, false, false, 4031));
                        return;
                    }
                }
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                o.a b4 = com.vk.video.ui.discovery.minimizable.related_videos.p.b(oVar, i2, rbt0Var);
                m.a b5 = com.vk.video.ui.discovery.minimizable.related_videos.n.b(mVar, i2, rbt0Var, z);
                if (i != 0) {
                    xa9Var.invoke(h.a.h(aVar, null, null, 0, null, null, b5, b4, null, null, false, false, false, 3999));
                    return;
                } else {
                    xa9Var.invoke(h.a.h(aVar, null, null, 0, null, null, b5, null, null, null, false, false, false, 4063));
                    return;
                }
            }
            return;
        }
        if (s0Var instanceof c.s0.g) {
            com.vk.video.ui.discovery.minimizable.related_videos.k y02 = y0();
            c.s0.g gVar = (c.s0.g) s0Var;
            int i4 = gVar.b;
            rbt0 rbt0Var2 = gVar.c;
            VideoRelatedVideosPagingType videoRelatedVideosPagingType2 = gVar.d;
            com.vk.video.ui.discovery.minimizable.related_videos.c cVar2 = y02.j;
            xa9 xa9Var2 = cVar2.d;
            VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs2 = qVar.c;
            VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist2 = videoDiscoveryRelatedVideosSourceArgs2 instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist ? (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs2 : null;
            if (playlist2 != null && (!com.vk.video.ui.discovery.minimizable.related_videos.f.b(playlist2) || epx.f(playlist2.g, playlist2.h))) {
                i = 1;
            }
            com.vk.video.ui.discovery.minimizable.related_videos.h hVar4 = qVar.s;
            h.a aVar2 = hVar4 instanceof h.a ? (h.a) hVar4 : null;
            if (aVar2 != null) {
                VideoFile videoFile4 = aVar2.a;
                com.vk.video.ui.discovery.minimizable.related_videos.o oVar2 = aVar2.g;
                int i5 = c.a.$EnumSwitchMapping$0[videoRelatedVideosPagingType2.ordinal()];
                if (i5 == 1) {
                    o.a a2 = com.vk.video.ui.discovery.minimizable.related_videos.p.a(oVar2, i4, rbt0Var2);
                    m.a a3 = com.vk.video.ui.discovery.minimizable.related_videos.n.a(aVar2.f, i4, rbt0Var2, cVar2.c, null, null);
                    if (i != 0) {
                        xa9Var2.invoke(h.a.h(aVar2, null, com.vk.video.ui.discovery.minimizable.related_videos.p.d(a2, videoFile4), 0, null, null, a3, a2, null, null, false, false, false, 3997));
                        return;
                    } else {
                        xa9Var2.invoke(h.a.h(aVar2, null, com.vk.video.ui.discovery.minimizable.related_videos.p.d(a2, videoFile4), 0, null, null, null, a2, null, null, false, false, false, 4029));
                        return;
                    }
                }
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                o.a a4 = com.vk.video.ui.discovery.minimizable.related_videos.p.a(oVar2, i4, rbt0Var2);
                m.a a5 = com.vk.video.ui.discovery.minimizable.related_videos.n.a(aVar2.f, i4, rbt0Var2, cVar2.c, null, null);
                if (i != 0) {
                    xa9Var2.invoke(h.a.h(aVar2, null, com.vk.video.ui.discovery.minimizable.related_videos.p.d(a4, videoFile4), 0, null, null, a5, a4, null, null, false, false, false, 3997));
                    return;
                } else {
                    xa9Var2.invoke(h.a.h(aVar2, null, null, 0, null, null, a5, null, null, null, false, false, false, 4063));
                    return;
                }
            }
            return;
        }
        boolean z2 = s0Var instanceof c.s0.a;
        f4z<VideoMinimizableDiscoverySideEffect> f4zVar = this.J;
        if (z2) {
            c.s0.a aVar3 = (c.s0.a) s0Var;
            if (epx.f(aVar3, c.s0.a.C1979a.b) || epx.f(aVar3, c.s0.a.b.b)) {
                W0(qVar.n, qVar.s);
                f4zVar.b(VideoMinimizableDiscoverySideEffect.j.C1970j.a);
                return;
            } else {
                if (!epx.f(aVar3, c.s0.a.C1980c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                W0(qVar.n, qVar.s);
                y0().e(qVar);
                f4zVar.b(VideoMinimizableDiscoverySideEffect.j.C1970j.a);
                return;
            }
        }
        if (epx.f(s0Var, com.vk.video.ui.discovery.minimizable.d.b) || epx.f(s0Var, c.s0.C1981c.b)) {
            com.vk.video.ui.discovery.minimizable.related_videos.k y03 = y0();
            y03.j();
            y03.l(h.d.a);
            y03.f.invoke(null);
            f4zVar.b(VideoMinimizableDiscoverySideEffect.j.b.a);
            return;
        }
        if (s0Var instanceof c.s0.d) {
            com.vk.video.ui.discovery.minimizable.related_videos.k y04 = y0();
            mgs0 mgs0Var = ((c.s0.d) s0Var).b;
            com.vk.video.ui.discovery.minimizable.related_videos.m mVar2 = mgs0Var.b;
            y04.getClass();
            MiniPlayerControllersWrapper.VideoInfo videoInfo = qVar.b;
            if (videoInfo == null || (videoFile3 = videoInfo.b) == null) {
                hVar2 = h.d.a;
            } else {
                m.a aVar4 = mVar2 instanceof m.a ? (m.a) mVar2 : null;
                mct0 mct0Var = aVar4 != null ? aVar4.a : null;
                hVar2 = new h.a(videoFile3, mct0Var != null ? mct0Var.d(videoFile3) : null, mct0Var != null ? mct0Var.b(videoFile3) : -1, mgs0Var.c, mgs0Var.d, mVar2, new o.a(mct0Var != null ? Collections.singletonList(mct0Var) : EmptyList.b), mgs0Var.a, VideoRelatedVideosLoopMode.DISABLED, mgs0Var.f, mgs0Var.e, false);
            }
            y04.l(hVar2);
            return;
        }
        if (s0Var instanceof c.s0.i) {
            com.vk.video.ui.discovery.minimizable.related_videos.k y05 = y0();
            com.vk.video.ui.discovery.minimizable.related_videos.m mVar3 = ((c.s0.i) s0Var).b;
            y05.getClass();
            com.vk.video.ui.discovery.minimizable.related_videos.h hVar5 = qVar.s;
            h.a aVar5 = hVar5 instanceof h.a ? (h.a) hVar5 : null;
            if (aVar5 != null) {
                VideoFile videoFile5 = aVar5.a;
                m.a aVar6 = mVar3 instanceof m.a ? (m.a) mVar3 : null;
                mct0 mct0Var2 = aVar6 != null ? aVar6.a : null;
                o.a aVar7 = new o.a(mct0Var2 != null ? Collections.singletonList(mct0Var2) : EmptyList.b);
                VideoFile d2 = mct0Var2 != null ? mct0Var2.d(videoFile5) : null;
                int b6 = mct0Var2 != null ? mct0Var2.b(videoFile5) : -1;
                if (mct0Var2 == null || (videoFile = mct0Var2.f) == null) {
                    videoFile = aVar5.d;
                }
                VideoFile videoFile6 = videoFile;
                if (mct0Var2 == null || (videoFile2 = mct0Var2.g) == null) {
                    videoFile2 = aVar5.e;
                }
                hVar = h.a.h(aVar5, null, d2, b6, videoFile6, videoFile2, mVar3, aVar7, null, null, false, false, false, 3969);
            } else {
                hVar = h.d.a;
            }
            y05.l(hVar);
            return;
        }
        if (s0Var instanceof f) {
            com.vk.video.ui.discovery.minimizable.related_videos.h hVar6 = qVar.s;
            h.a aVar8 = hVar6 instanceof h.a ? (h.a) hVar6 : null;
            if (aVar8 != null) {
                VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource = aVar8.h;
                if (videoDiscoveryRelatedVideosSource instanceof VideoDiscoveryRelatedVideosSource.Playlist) {
                    M0(qVar, aVar8, h.a.h(aVar8, null, null, 0, null, null, null, null, VideoDiscoveryRelatedVideosSource.Playlist.a((VideoDiscoveryRelatedVideosSource.Playlist) videoDiscoveryRelatedVideosSource, ((f) s0Var).b), null, false, false, false, 3967), com.vk.video.ui.discovery.minimizable.player.b.c(qVar.l.d.b));
                    return;
                }
                return;
            }
            return;
        }
        if (s0Var instanceof com.vk.video.ui.discovery.minimizable.e) {
            com.vk.video.ui.discovery.minimizable.related_videos.h hVar7 = qVar.s;
            h.a aVar9 = hVar7 instanceof h.a ? (h.a) hVar7 : null;
            VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs3 = qVar.c;
            VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist3 = videoDiscoveryRelatedVideosSourceArgs3 instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist ? (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs3 : null;
            if (aVar9 == null || playlist3 == null) {
                return;
            }
            com.vk.video.ui.discovery.minimizable.e eVar = (com.vk.video.ui.discovery.minimizable.e) s0Var;
            boolean L0 = this.k.L0(eVar.b, eVar.c);
            if (aVar9.k != L0) {
                com.vk.video.ui.discovery.minimizable.related_videos.k y06 = y0();
                y06.getClass();
                y06.a(qVar, VideoDiscoveryRelatedVideosSourceArgs.Playlist.e(playlist3, null, null, null, L0 ? VideoRelatedVideosOrder.Reverse.b : VideoRelatedVideosOrder.Original.b, 127), false);
                return;
            }
            return;
        }
        if (s0Var instanceof c.s0.e) {
            com.vk.video.ui.discovery.minimizable.related_videos.k y07 = y0();
            com.vk.video.ui.discovery.minimizable.related_videos.m mVar4 = ((c.s0.e) s0Var).b;
            com.vk.video.ui.discovery.minimizable.related_videos.e eVar2 = y07.i;
            eVar2.getClass();
            com.vk.video.ui.discovery.minimizable.related_videos.h hVar8 = qVar.s;
            h.a aVar10 = hVar8 instanceof h.a ? (h.a) hVar8 : null;
            if (aVar10 != null) {
                eVar2.d.invoke(h.a.h(aVar10, null, null, 0, null, null, mVar4, null, null, null, false, false, false, 4063));
                return;
            }
            return;
        }
        if (s0Var instanceof c.s0.h) {
            com.vk.video.ui.discovery.minimizable.related_videos.k y08 = y0();
            mct0 mct0Var3 = ((c.s0.h) s0Var).b;
            com.vk.video.ui.discovery.minimizable.related_videos.e eVar3 = y08.i;
            eVar3.getClass();
            com.vk.video.ui.discovery.minimizable.related_videos.h hVar9 = qVar.s;
            h.a aVar11 = hVar9 instanceof h.a ? (h.a) hVar9 : null;
            if (aVar11 != null) {
                VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource2 = aVar11.h;
                if (!(videoDiscoveryRelatedVideosSource2 instanceof VideoDiscoveryRelatedVideosSource.Playlist)) {
                    if (!(videoDiscoveryRelatedVideosSource2 instanceof VideoDiscoveryRelatedVideosSource.TemporaryPlaylist)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                List<VideoSeason> list = ((VideoDiscoveryRelatedVideosSource.Playlist) videoDiscoveryRelatedVideosSource2).b.q;
                Iterator<VideoSeason> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next().b == mct0Var3.a) {
                        r4 = i;
                        break;
                    }
                    i++;
                }
                h.a aVar12 = (h.a) hVar9;
                com.vk.video.ui.discovery.minimizable.related_videos.o oVar3 = aVar12.g;
                if (!(oVar3 instanceof o.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                VideoSeason videoSeason = (VideoSeason) j5g.b0(r4 - 1, list);
                if (videoSeason != null) {
                    o.a aVar13 = (o.a) oVar3;
                    if (videoSeason.b == ((mct0) j5g.i0(aVar13.a)).a) {
                        if (oVar3 == null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        o.a aVar14 = new o.a(j5g.v0(mct0Var3, aVar13.a));
                        eVar3.d.invoke(h.a.h(aVar11, null, com.vk.video.ui.discovery.minimizable.related_videos.p.d(aVar14, aVar12.a), 0, null, null, null, aVar14, null, null, false, false, false, 4029));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!(s0Var instanceof c.s0.k)) {
            if (!(s0Var instanceof c.s0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            y0().f(qVar, ((c.s0.b) s0Var).b);
            return;
        }
        com.vk.video.ui.discovery.minimizable.related_videos.k y09 = y0();
        mct0 mct0Var4 = ((c.s0.k) s0Var).b;
        com.vk.video.ui.discovery.minimizable.related_videos.e eVar4 = y09.i;
        eVar4.getClass();
        com.vk.video.ui.discovery.minimizable.related_videos.h hVar10 = qVar.s;
        h.a aVar15 = hVar10 instanceof h.a ? (h.a) hVar10 : null;
        if (aVar15 != null) {
            VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource3 = aVar15.h;
            if (!(videoDiscoveryRelatedVideosSource3 instanceof VideoDiscoveryRelatedVideosSource.Playlist)) {
                if (!(videoDiscoveryRelatedVideosSource3 instanceof VideoDiscoveryRelatedVideosSource.TemporaryPlaylist)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            List<VideoSeason> list2 = ((VideoDiscoveryRelatedVideosSource.Playlist) videoDiscoveryRelatedVideosSource3).b.q;
            Iterator<VideoSeason> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().b == mct0Var4.a) {
                    r4 = i;
                    break;
                }
                i++;
            }
            com.vk.video.ui.discovery.minimizable.related_videos.o oVar4 = ((h.a) hVar10).g;
            if (!(oVar4 instanceof o.a)) {
                throw new NoWhenBranchMatchedException();
            }
            VideoSeason videoSeason2 = (VideoSeason) j5g.b0(r4 + 1, list2);
            if (videoSeason2 != null) {
                o.a aVar16 = (o.a) oVar4;
                if (videoSeason2.b == ((mct0) j5g.Y(aVar16.a)).a) {
                    whe wheVar = eVar4.d;
                    if (oVar4 == null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wheVar.invoke(h.a.h(aVar15, null, null, 0, null, null, null, new o.a(j5g.u0(aVar16.a, Collections.singletonList(mct0Var4))), null, null, false, false, false, 4031));
                }
            }
        }
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        y0().j();
        io.reactivex.rxjava3.disposables.c cVar = this.X.f;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public final void p0(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r28v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public final void q0(q qVar, c.a1 a1Var) {
        VideoFile videoFile;
        Owner s;
        UserId userId;
        VideoFile videoFile2;
        a2s0 f;
        boolean z = a1Var instanceof c.a1.d;
        r1s0 r1s0Var = this.S;
        if (z) {
            a2s0 w0 = w0(this);
            MiniPlayerControllersWrapper.VideoInfo videoInfo = qVar.b;
            VideoFile videoFile3 = videoInfo != null ? videoInfo.b : null;
            if (videoFile3 != null && w0 != null) {
                try {
                    VideoFile videoFile4 = w0.a;
                    r1s0Var.getClass();
                    r1s0.a(CommonVideoStat$TypeNextVideoAnnouncement.EventSubtype.CLICK, videoFile3, videoFile4);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Exception e2) {
                    com.vk.metrics.eventtracking.b.a.a(e2);
                }
            }
            if (w0 != null) {
                d0(qVar, b.CLICK_ANNOUNCE);
                Y();
                return;
            }
            return;
        }
        if (a1Var instanceof c.a1.e) {
            if (fxc0.B().J().f1().b()) {
                yfs0 P0 = this.e0.P0();
                yfs0.a aVar = P0 instanceof yfs0.a ? (yfs0.a) P0 : null;
                if (aVar != null) {
                    f = aVar.f();
                }
                f = null;
            } else {
                lgs0 P02 = this.d0.P0();
                lgs0.a aVar2 = P02 instanceof lgs0.a ? (lgs0.a) P02 : null;
                if (aVar2 != null) {
                    f = aVar2.f();
                }
                f = null;
            }
            MiniPlayerControllersWrapper.VideoInfo videoInfo2 = qVar.b;
            VideoFile videoFile5 = videoInfo2 != null ? videoInfo2.b : null;
            com.vk.video.ui.discovery.minimizable.fullscreen_lock.a aVar3 = this.Z;
            aVar3.getClass();
            if (!(qVar.t instanceof FullscreenLockState.Unlocked)) {
                aVar3.h();
            }
            if (f != null) {
                VideoFile videoFile6 = f.a;
                if (videoFile5 != null) {
                    try {
                        r1s0Var.getClass();
                        CommonVideoStat$TypeNextVideoAnnouncement.EventSubtype eventSubtype = CommonVideoStat$TypeNextVideoAnnouncement.EventSubtype.CANCEL;
                        r1s0.a(eventSubtype, videoFile5, videoFile6);
                        try {
                            r1s0.a(eventSubtype, videoFile5, videoFile6);
                        } catch (Exception e3) {
                            com.vk.metrics.eventtracking.b.a.a(e3);
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                    } catch (Exception e4) {
                        com.vk.metrics.eventtracking.b.a.a(e4);
                    }
                    Y();
                    a1(MiniPlayerControllersWrapper.VideoInfo.a(qVar.b, videoFile5, null, null, 238), false);
                    return;
                }
                return;
            }
            return;
        }
        boolean z2 = a1Var instanceof c.a1.C1973c;
        f4z<VideoMinimizableDiscoverySideEffect> f4zVar = this.J;
        if (z2) {
            MiniPlayerControllersWrapper.VideoInfo videoInfo3 = qVar.b;
            if (videoInfo3 == null || (videoFile2 = videoInfo3.b) == null) {
                return;
            }
            f4zVar.b(new VideoMinimizableDiscoverySideEffect.j.i(videoFile2));
            return;
        }
        if (a1Var instanceof c.a1.g) {
            f4zVar.b(VideoMinimizableDiscoverySideEffect.w.a.a);
            c.a1.g gVar = (c.a1.g) a1Var;
            MiniPlayerControllersWrapper.VideoInfo videoInfo4 = qVar.b;
            if (videoInfo4 != null && videoInfo4.b != null) {
                f4zVar.b(VideoMinimizableDiscoverySideEffect.m0.a);
            }
            VideoAnnounceState videoAnnounceState = qVar.o;
            VideoAnnounceState.Shown shown = videoAnnounceState instanceof VideoAnnounceState.Shown ? (VideoAnnounceState.Shown) videoAnnounceState : null;
            if (shown == null) {
                return;
            }
            AuthorAnnounceState authorAnnounceState = shown.f;
            AuthorFullscreenSession authorFullscreenSession = authorAnnounceState.c;
            AuthorAnnounceState authorAnnounceState2 = new AuthorAnnounceState(authorAnnounceState.b, AuthorFullscreenSession.a(authorFullscreenSession), Boolean.valueOf(gVar.b));
            VideoMinimizableState videoMinimizableState = qVar.n;
            boolean H0 = H0(videoMinimizableState, videoMinimizableState, authorFullscreenSession);
            MiniPlayerControllersWrapper.VideoInfo videoInfo5 = qVar.b;
            Z0(qVar, t0(H0, authorAnnounceState2, videoInfo5 != null ? videoInfo5.b : null));
            return;
        }
        if (a1Var instanceof c.a1.f) {
            c.a1.f fVar = (c.a1.f) a1Var;
            VideoAnnounceState videoAnnounceState2 = qVar.o;
            MiniPlayerControllersWrapper.VideoInfo videoInfo6 = qVar.b;
            VideoAnnounceState.Shown shown2 = videoAnnounceState2 instanceof VideoAnnounceState.Shown ? (VideoAnnounceState.Shown) videoAnnounceState2 : null;
            if (shown2 == null) {
                return;
            }
            AuthorAnnounceState authorAnnounceState3 = shown2.f;
            AuthorFullscreenSession authorFullscreenSession2 = authorAnnounceState3.c;
            if (videoInfo6 == null || (videoFile = videoInfo6.b) == null || (s = videoFile.s()) == null || (userId = s.b) == null || !userId.equals(fVar.b)) {
                return;
            }
            AuthorAnnounceState authorAnnounceState4 = new AuthorAnnounceState(authorAnnounceState3.b, AuthorFullscreenSession.a(authorFullscreenSession2), Boolean.valueOf(fVar.c));
            VideoMinimizableState videoMinimizableState2 = qVar.n;
            Z0(qVar, t0(H0(videoMinimizableState2, videoMinimizableState2, authorFullscreenSession2), authorAnnounceState4, videoFile));
            return;
        }
        if (a1Var instanceof c.a1.h) {
            r0(qVar, ((c.a1.h) a1Var).b, null);
            return;
        }
        if (!(a1Var instanceof c.a1.b)) {
            if (!(a1Var instanceof c.a1.a)) {
                throw new NoWhenBranchMatchedException();
            }
            c.a1.a aVar4 = (c.a1.a) a1Var;
            T(new n.r(aVar4.d, aVar4.b, aVar4.c));
            return;
        }
        boolean z3 = ((c.a1.b) a1Var).b;
        i4s0 i4s0Var = this.n;
        if (z3) {
            ReentrantLock reentrantLock = i4s0Var.h;
            reentrantLock.lock();
            try {
                if (i4s0Var.c != null) {
                    i4s0Var.f = true;
                }
                s3q0 s3q0Var3 = s3q0.a;
                reentrantLock.unlock();
                this.Y = true;
                return;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.Y) {
            ReentrantLock reentrantLock2 = i4s0Var.h;
            reentrantLock2.lock();
            try {
                i4s0Var.f = false;
                s3q0 s3q0Var4 = s3q0.a;
                reentrantLock2.unlock();
                this.Y = false;
            } finally {
                reentrantLock2.unlock();
            }
        }
    }

    public final void r0(q qVar, VideoFile videoFile, Boolean bool) {
        VideoFile videoFile2;
        VideoAnnounceState videoAnnounceState = qVar.o;
        VideoAnnounceState.Shown shown = videoAnnounceState instanceof VideoAnnounceState.Shown ? (VideoAnnounceState.Shown) videoAnnounceState : null;
        if (!epx.f((shown == null || (videoFile2 = shown.c) == null) ? null : videoFile2.a1(), videoFile.a1())) {
            this.b0.a(videoFile.a1());
            MiniPlayerControllersWrapper.VideoInfo videoInfo = qVar.b;
            P0(qVar, videoInfo != null ? videoInfo.b : null, videoFile, true, bool);
        }
        i4s0 i4s0Var = this.n;
        io.reactivex.rxjava3.disposables.c cVar = i4s0Var.c;
        ReentrantLock reentrantLock = i4s0Var.h;
        if (cVar != null) {
            reentrantLock.lock();
            try {
                i4s0Var.f = false;
                s3q0 s3q0Var = s3q0.a;
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        q34 q34Var = new q34(videoFile, this, qVar, 8);
        y37 y37Var = new y37(this, qVar, videoFile, bool, 2);
        n85 n85Var = new n85(11, this, videoFile);
        reentrantLock.lock();
        try {
            if (i4s0Var.g) {
                return;
            }
            i4s0Var.a = y37Var;
            if (i4s0Var.c != null) {
                rdi.E();
                i4s0Var.a();
            }
            i4s0Var.c = i4s0Var.b.subscribe(new hdi0(new t3b(i4s0Var, n85Var, q34Var, 10), 6));
            s3q0 s3q0Var2 = s3q0.a;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void s0(q qVar) {
        this.s.e();
        this.J.b(VideoMinimizableDiscoverySideEffect.o0.a.a);
        com.vk.video.ui.discovery.minimizable.fullscreen_lock.a aVar = this.Z;
        aVar.getClass();
        FullscreenLockState fullscreenLockState = qVar.t;
        if ((fullscreenLockState instanceof FullscreenLockState.Locked) || (fullscreenLockState instanceof FullscreenLockState.TemporarilyUnlocked)) {
            aVar.d(qVar);
            aVar.g(new VideoMinimizableDiscoverySideEffect.p.a(false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AuthorAnnounceState t0(boolean z, AuthorAnnounceState authorAnnounceState, VideoFile videoFile) {
        boolean z2;
        bpn0 bpn0Var;
        Owner s;
        Artist artist;
        if (authorAnnounceState == null) {
            authorAnnounceState = new AuthorAnnounceState(null, null, null, 7, null);
        }
        Boolean bool = authorAnnounceState.d;
        AuthorFullscreenSession authorFullscreenSession = authorAnnounceState.c;
        boolean z3 = authorFullscreenSession.b;
        boolean z4 = false;
        if (!z || !z3) {
            if (z) {
                authorFullscreenSession = new AuthorFullscreenSession(true, videoFile != null && videoFile.U(), false);
            } else {
                authorFullscreenSession = new AuthorFullscreenSession(false, false, false, 7, null);
            }
        }
        if (!z || (!z3 && bool == null)) {
            bool = null;
        }
        boolean z5 = videoFile instanceof MusicVideoFile;
        if (z5 && fxc0.B().J().M0()) {
            List<Artist> list = ((MusicVideoFile) videoFile).B1;
            if (((list == null || (artist = (Artist) j5g.b0(0, list)) == null) ? null : artist.l) == null) {
                z2 = false;
                this.j.getClass();
                boolean z6 = com.vk.toggle.b.A.a(VideoFeatures.VIDEO_HELPER_CODEGEN_API) || fxc0.B().J().M0();
                if ((z5 || z6) && z2) {
                    z4 = true;
                }
                boolean Z = fxc0.B().J().Z();
                bpn0Var = o25.a;
                if (bpn0Var == null) {
                    bpn0Var = null;
                }
                boolean b2 = ((b25) bpn0Var.getValue()).b();
                UserId userId = (videoFile != null || (s = videoFile.s()) == null) ? null : s.b;
                bpn0 bpn0Var2 = o25.a;
                return new AuthorAnnounceState((Z || !z || !b2 || epx.f(userId, ((b25) (bpn0Var2 != null ? bpn0Var2 : null).getValue()).c()) || (authorFullscreenSession.c && !authorFullscreenSession.d) || !z4) ? AuthorAnnounceMode.Hidden : AuthorAnnounceMode.Shown, authorFullscreenSession, bool);
            }
        }
        z2 = true;
        this.j.getClass();
        if (com.vk.toggle.b.A.a(VideoFeatures.VIDEO_HELPER_CODEGEN_API)) {
        }
        if (z5) {
        }
        z4 = true;
        boolean Z2 = fxc0.B().J().Z();
        bpn0Var = o25.a;
        if (bpn0Var == null) {
        }
        boolean b22 = ((b25) bpn0Var.getValue()).b();
        if (videoFile != null) {
        }
        bpn0 bpn0Var22 = o25.a;
        return new AuthorAnnounceState((Z2 || !z || !b22 || epx.f(userId, ((b25) (bpn0Var22 != null ? bpn0Var22 : null).getValue()).c()) || (authorFullscreenSession.c && !authorFullscreenSession.d) || !z4) ? AuthorAnnounceMode.Hidden : AuthorAnnounceMode.Shown, authorFullscreenSession, bool);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void u0(VideoFile videoFile, long j) {
        if (this.f.v()) {
            if (((VideoGrowthComponent) this.H.getValue()).B3().b(videoFile.ab() == OfferVkVideo.LISTING)) {
                this.J.b(new VideoMinimizableDiscoverySideEffect.a0(new VideoGrowthVideoParams(videoFile.a1(), j, false, false, 12, null), new e()));
            }
        }
    }

    public final void v0() {
        this.X.b();
        this.l.c(VideoAdvertisementsRepository.AdType.SPORT_BANNER);
        this.h.getClass();
        hg1.f(this.j0);
        hg1.f(this.k0);
        qcy<Object> qcyVar = t0[0];
        hg1.f((io.reactivex.rxjava3.disposables.c) this.m0.b);
        this.n0 = false;
        C(c.s0.C1981c.b);
        a1(null, false);
        this.M.c(null);
        this.N.a(null);
        VideoMinimizableDiscoverySideEffect.p.b bVar = new VideoMinimizableDiscoverySideEffect.p.b();
        f4z<VideoMinimizableDiscoverySideEffect> f4zVar = this.J;
        f4zVar.b(bVar);
        f4zVar.b(VideoMinimizableDiscoverySideEffect.Motion.a.a);
        if (p1p0.a(this.p0)) {
            z0().getClass();
            qu5.c().getClass();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final com.vk.video.ui.discovery.minimizable.related_videos.k y0() {
        return (com.vk.video.ui.discovery.minimizable.related_videos.k) this.l0.getValue();
    }

    public final veg0 z0() {
        return (veg0) this.q0.getValue();
    }
}
