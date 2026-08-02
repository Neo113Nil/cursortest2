package com.vk.catalog2.common.ui.mvp.holder.video.playlist;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.NonBounceAppBarBlockableBehavior;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.PlaceholderCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAlbumAnalyticsInfo;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.catalog2.common.ui.holders.ErrorStateVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemNoAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistRootVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.video.VideoAlbum;
import com.vk.dto.video.VideoSeason;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.libvideo.api.ui.VideoTransitionSource;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.autoplay.j;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import defpackage.q0;
import io.reactivex.rxjava3.disposables.f;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asu0;
import xsna.ayn0;
import xsna.b0u0;
import xsna.b25;
import xsna.bjc;
import xsna.bnn0;
import xsna.bpn0;
import xsna.cfp0;
import xsna.d5t0;
import xsna.dd80;
import xsna.df90;
import xsna.e43;
import xsna.eeh0;
import xsna.epx;
import xsna.f5z;
import xsna.fxc0;
import xsna.g380;
import xsna.g3a;
import xsna.g7s0;
import xsna.gpt0;
import xsna.h6m0;
import xsna.hkj0;
import xsna.hu50;
import xsna.ikk0;
import xsna.iut0;
import xsna.j5g;
import xsna.jvl0;
import xsna.ltz;
import xsna.mf3;
import xsna.msy;
import xsna.n4t0;
import xsna.nda;
import xsna.o25;
import xsna.o5a;
import xsna.oan0;
import xsna.ou5;
import xsna.oyp0;
import xsna.p1s0;
import xsna.pyr0;
import xsna.q3a;
import xsna.rrn0;
import xsna.s1v;
import xsna.s3q0;
import xsna.sba;
import xsna.shy;
import xsna.swp;
import xsna.u080;
import xsna.u4a;
import xsna.u4t0;
import xsna.uzp0;
import xsna.whg0;
import xsna.wjs0;
import xsna.wzs;
import xsna.x0a;
import xsna.x2j0;
import xsna.x9l0;
import xsna.ydt0;
import xsna.yg5;
import xsna.yka0;
import xsna.z27;
import xsna.zjq;

/* compiled from: VideoPlaylistRootVh.kt */
/* loaded from: classes16.dex */
public final class VideoPlaylistRootVh extends CatalogRootViewHolder implements CatalogStatesViewHolder, df90, ViewPager.j {
    public View A;
    public CoordinatorLayout.c<View> B;
    public rrn0 C;
    public final d5t0 D;
    public io.reactivex.rxjava3.disposables.c E;
    public final int F;
    public final UserId G;
    public final String H;
    public io.reactivex.rxjava3.disposables.c I;
    public String J;
    public boolean K;
    public final SearchStatsLoggingInfo L;
    public final SwitchCatalogVh M;
    public ViewGroup N;
    public final x0a O;
    public final Object P;
    public final g7s0 p;
    public final boolean q;
    public final int r;
    public final Object s;
    public final boolean t;
    public CatalogRecyclerPaginatedView u;
    public final VideoPlaylistHeaderVh v;
    public final g3a w;
    public final ViewPagerVh x;
    public a y;
    public UIBlockCatalog z;

    /* compiled from: VideoPlaylistRootVh.kt */
    public static final class a {
        public final UIBlockVideoAlbum a;
        public final int b;
        public final boolean c;

        public a(UIBlockVideoAlbum uIBlockVideoAlbum, int i, boolean z) {
            this.a = uIBlockVideoAlbum;
            this.b = i;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            UIBlockVideoAlbum uIBlockVideoAlbum = this.a;
            return Boolean.hashCode(this.c) + shy.a(this.b, (uIBlockVideoAlbum == null ? 0 : uIBlockVideoAlbum.hashCode()) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CoverData(uiBlockVideoAlbum=");
            sb.append(this.a);
            sb.append(", videosCount=");
            sb.append(this.b);
            sb.append(", hasCover=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VideoPlaylistRootVh.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoAlbumAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr[VideoAlbumAnalyticsInfo.ClickTarget.PlayAll.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VideoPlaylistRootVh.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements wzs<CatalogViewHolder, u4a.a, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(CatalogViewHolder catalogViewHolder, u4a.a aVar) {
            CatalogViewHolder catalogViewHolder2 = catalogViewHolder;
            u4a.a aVar2 = aVar;
            ((VideoPlaylistRootVh) this.receiver).getClass();
            if (catalogViewHolder2 instanceof VideoItemVh) {
                VideoItemVh videoItemVh = (VideoItemVh) catalogViewHolder2;
                if (videoItemVh instanceof VideoItemNoAutoPlayVh) {
                    videoItemVh = ((VideoItemNoAutoPlayVh) catalogViewHolder2).m;
                } else if ((videoItemVh instanceof VideoItemAutoPlayVh) && (videoItemVh = ((VideoItemAutoPlayVh) catalogViewHolder2).m) == null) {
                    videoItemVh = null;
                }
                if (videoItemVh != null) {
                    videoItemVh.i = aVar2;
                }
            }
            return s3q0.a;
        }
    }

    public VideoPlaylistRootVh() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v12, types: [xsna.d5t0] */
    public VideoPlaylistRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar, boolean z) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) o5aVar, false, (f5z) null, 112);
        String str;
        g7s0 B = fxc0.B();
        this.p = B;
        this.q = z;
        this.r = R.layout.catalog2_video_playlist;
        pyr0 pyr0Var = new pyr0(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.s = msy.a(lazyThreadSafetyMode, pyr0Var);
        this.t = fxc0.B().J().x0();
        this.v = new VideoPlaylistHeaderVh(this.m);
        u4a u4aVar = this.m;
        this.w = u4aVar.b.s.S(u4aVar, null);
        ErrorStateVh errorStateVh = new ErrorStateVh(this, new x9l0(this, 15));
        ViewPagerVh viewPagerVh = new ViewPagerVh(this.m, true, null, false, null, null, null, N(), null, null, 7164);
        this.x = viewPagerVh;
        this.D = new b25.a() { // from class: xsna.d5t0
            @Override // xsna.b25.a
            public final void d(tbu0 tbu0Var) {
                if (tbu0Var.b()) {
                    VideoPlaylistRootVh videoPlaylistRootVh = VideoPlaylistRootVh.this;
                    if (videoPlaylistRootVh.q) {
                        videoPlaylistRootVh.w.d();
                    }
                }
            }
        };
        this.E = new f(io.reactivex.rxjava3.internal.functions.a.b);
        this.G = UserId.d;
        if (bundle != null) {
            int i = bundle.getInt("album_id");
            this.F = i;
            UserId userId = (UserId) bundle.getParcelable("owner_id");
            this.G = userId;
            Serializer.c<VideoAlbum> cVar = VideoAlbum.CREATOR;
            str = VideoAlbum.a.a(i, userId);
        } else {
            str = null;
        }
        this.H = str == null ? "" : str;
        this.J = "";
        SearchStatsLoggingInfo searchStatsLoggingInfo = bundle != null ? (SearchStatsLoggingInfo) bundle.getParcelable("search_stats_logging_info") : null;
        this.L = searchStatsLoggingInfo;
        new BroadcastReceiver() { // from class: com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistRootVh$broadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                Parcelable parcelable;
                Object parcelableExtra;
                String action = intent.getAction();
                if (action != null && action.hashCode() == 3866578 && action.equals("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelableExtra = intent.getParcelableExtra("id", UserId.class);
                        parcelable = (Parcelable) parcelableExtra;
                    } else {
                        Parcelable parcelableExtra2 = intent.getParcelableExtra("id");
                        if (!(parcelableExtra2 instanceof UserId)) {
                            parcelableExtra2 = null;
                        }
                        parcelable = (UserId) parcelableExtra2;
                    }
                    UserId userId2 = (UserId) parcelable;
                    if (userId2 == null) {
                        return;
                    }
                    VideoPlaylistRootVh videoPlaylistRootVh = VideoPlaylistRootVh.this;
                    if (epx.f(videoPlaylistRootVh.G, userId2)) {
                        videoPlaylistRootVh.w.d();
                    }
                }
            }
        };
        if (searchStatsLoggingInfo != null) {
            SearchStatInfoProvider searchStatInfoProvider = this.m.b.m;
            searchStatInfoProvider.getClass();
            searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Enabled;
        }
        this.M = new SwitchCatalogVh(viewPagerVh, null, errorStateVh, null, null, R.layout.catalog_frame_layout_with_scrolling_non_bounced, null, null, false, false, null, 2010);
        this.O = new x0a(new x2j0(this, 14), new h6m0(this, 16));
        this.P = msy.a(lazyThreadSafetyMode, new ikk0(this, 16));
    }

    public static boolean n0(UIBlockCatalog uIBlockCatalog) {
        UIBlockPlaceholder uIBlockPlaceholder;
        ArrayList<UIBlock> arrayList;
        ArrayList<UIBlock> arrayList2 = uIBlockCatalog.A;
        if (arrayList2 == null || !arrayList2.isEmpty()) {
            for (UIBlock uIBlock : arrayList2) {
                UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
                if (uIBlockList == null || (arrayList = uIBlockList.y) == null) {
                    uIBlockPlaceholder = null;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (obj instanceof UIBlockPlaceholder) {
                            arrayList3.add(obj);
                        }
                    }
                    uIBlockPlaceholder = (UIBlockPlaceholder) j5g.a0(arrayList3);
                }
                boolean z = uIBlockPlaceholder != null;
                CatalogViewStyle catalogViewStyle = uIBlockPlaceholder != null ? uIBlockPlaceholder.l : null;
                PlaceholderCatalogViewStyle placeholderCatalogViewStyle = catalogViewStyle instanceof PlaceholderCatalogViewStyle ? (PlaceholderCatalogViewStyle) catalogViewStyle : null;
                boolean z2 = (placeholderCatalogViewStyle != null ? placeholderCatalogViewStyle.b : null) == PlaceholderCatalogViewStyle.Style.Elongate;
                if (z && !z2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
    public static void p0(VideoPlaylistRootVh videoPlaylistRootVh, VideoFile videoFile, List list, String str, String str2, SearchStatsLoggingInfo searchStatsLoggingInfo, int i, VideoTransitionSource videoTransitionSource, int i2) {
        ?? r7;
        UIBlockVideoAlbum uIBlockVideoAlbum;
        VideoAlbum videoAlbum;
        Activity activity = videoPlaylistRootVh.b;
        int i3 = -1;
        int i4 = (i2 & 32) != 0 ? -1 : i;
        VideoTransitionSource videoTransitionSource2 = (i2 & 64) != 0 ? null : videoTransitionSource;
        g7s0 g7s0Var = videoPlaylistRootVh.p;
        x0a x0aVar = videoPlaylistRootVh.O;
        if (list.isEmpty()) {
            r7 = EmptyList.b;
        } else {
            r7 = new ArrayList();
            for (Object obj : list) {
                if (!((VideoFile) obj).w8()) {
                    r7.add(obj);
                }
            }
        }
        List list2 = r7;
        Iterator it = list2.iterator();
        boolean z = false;
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (epx.f(((VideoFile) it.next()).r1(), videoFile != null ? videoFile.r1() : null)) {
                i3 = i5;
                break;
            }
            i5++;
        }
        int i6 = i3 >= 0 ? i3 : 0;
        VideoFile videoFile2 = (VideoFile) j5g.b0(i6, list2);
        if (videoFile2 != null) {
            if (!gpt0.c(activity)) {
                ydt0.s(g7s0Var.Y(), videoPlaylistRootVh.b, videoFile2, x0a.b(x0aVar, videoFile2, 2), false, searchStatsLoggingInfo, null, null, null, null, 16288);
                return;
            }
            a aVar = videoPlaylistRootVh.y;
            Integer valueOf = (aVar == null || (uIBlockVideoAlbum = aVar.a) == null || (videoAlbum = uIBlockVideoAlbum.y) == null) ? null : Integer.valueOf(videoAlbum.f);
            x0a.b(x0aVar, null, 3);
            VideoFile videoFile3 = (VideoFile) list2.get(i6);
            if (g7s0Var.J().k0()) {
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                yg5 e = b.C1208b.a().e(videoFile3, null);
                if (((e.isPlaying() || e.getPosition() > 0) ? e.getPosition() : j.b(e.A())) >= e.getDuration()) {
                    z = true;
                }
            }
            g7s0Var.Y().i(activity, videoFile3, new VideoFeedDialogParams.Playlist(str, null, videoPlaylistRootVh.F, videoPlaylistRootVh.G, list2, valueOf, i6, str2, i4, searchStatsLoggingInfo, z, videoTransitionSource2));
        }
    }

    public static /* synthetic */ void t0(VideoPlaylistRootVh videoPlaylistRootVh, String str, String str2, VideoFile videoFile, int i) {
        if ((i & 4) != 0) {
            videoFile = null;
        }
        videoPlaylistRootVh.s0(str, str2, videoFile, 0, null);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.M.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.VideoPlaylistType videoPlaylistType;
        UIBlockVideoAlbum uIBlockVideoAlbum;
        boolean z = uIBlock instanceof UIBlockCatalog;
        if (z) {
            UIBlockCatalog uIBlockCatalog = (UIBlockCatalog) uIBlock;
            boolean n0 = n0(uIBlockCatalog);
            View view = this.A;
            ((CoordinatorLayout.f) (view != null ? view.getLayoutParams() : null)).c(n0 ? null : this.B);
            this.z = uIBlockCatalog;
            if (z) {
                UIBlock f = dd80.f(uIBlock, new oan0(9));
                UIBlockVideoAlbum uIBlockVideoAlbum2 = f instanceof UIBlockVideoAlbum ? (UIBlockVideoAlbum) f : null;
                if (uIBlockVideoAlbum2 != null) {
                    String str = uIBlockVideoAlbum2.y.d;
                    if (str == null) {
                        str = "";
                    }
                    this.J = str;
                    r0(uIBlock);
                }
            }
            r0(uIBlock);
            if (this.p.J().C1()) {
                a aVar = this.y;
                VideoAlbum videoAlbum = (aVar == null || (uIBlockVideoAlbum = aVar.a) == null) ? null : uIBlockVideoAlbum.y;
                if (!this.K && videoAlbum != null) {
                    s1v s1vVar = p1s0.a;
                    SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO_PLAYLIST, null, null, null, videoAlbum.n, null, 46, null);
                    MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.EventType eventType = MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.EventType.OPEN;
                    MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.PREVIEW;
                    int i = videoAlbum.b;
                    long j = videoAlbum.c.b;
                    int i2 = p1s0.a.$EnumSwitchMapping$0[videoAlbum.r.ordinal()];
                    if (i2 == 1) {
                        videoPlaylistType = MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.VideoPlaylistType.SIMPLE_PLAYLIST;
                    } else if (i2 == 2) {
                        videoPlaylistType = MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.VideoPlaylistType.SERIAL;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        videoPlaylistType = MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.VideoPlaylistType.SEASON;
                    }
                    SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick(eventType, mobileOfficialAppsVideoStat$TypeScreenMode, i, videoPlaylistType, j, null, 32, null), 2);
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c2, b2, uzp0Var.a).q();
                    this.K = true;
                }
            }
            this.M.N6(uIBlock);
            CatalogConfiguration catalogConfiguration = this.m.b.s;
            n4t0 n4t0Var = catalogConfiguration instanceof n4t0 ? (n4t0) catalogConfiguration : null;
            if (n4t0Var != null && n4t0Var.J != null) {
                UIBlock f2 = dd80.f(uIBlock, new jvl0(8));
                if (f2 == null) {
                    return;
                }
                String str2 = f2.f;
                String str3 = this.J;
                VideoFile videoFile = n4t0Var.J;
                t0(this, str2, str3, videoFile != null ? videoFile.copy() : null, 24);
                n4t0Var.J = null;
            }
            if (n0) {
                o0();
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.too0
    public final void Ng() {
        this.v.Ng();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.VideoPlaylistType videoPlaylistType;
        if (this.p.J().C1()) {
            Object obj = cfp0Var.b;
            if (obj instanceof VideoAlbumAnalyticsInfo) {
                if (b.$EnumSwitchMapping$0[((VideoAlbumAnalyticsInfo) obj).a.ordinal()] == 1) {
                    s1v s1vVar = p1s0.a;
                    UIBlock uIBlock = cfp0Var.a;
                    if (uIBlock instanceof UIBlockVideoAlbum) {
                        VideoAlbum videoAlbum = ((UIBlockVideoAlbum) uIBlock).y;
                        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO_PLAYLIST, null, null, null, p1s0.a.e(uIBlock), null, 46, null);
                        MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.EventType eventType = MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.EventType.PLAY_ALL_PLAYLIST_BUTTON;
                        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.PREVIEW;
                        int i = videoAlbum.b;
                        long j = videoAlbum.c.b;
                        int i2 = p1s0.a.$EnumSwitchMapping$0[videoAlbum.r.ordinal()];
                        if (i2 == 1) {
                            videoPlaylistType = MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.VideoPlaylistType.SIMPLE_PLAYLIST;
                        } else if (i2 == 2) {
                            videoPlaylistType = MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.VideoPlaylistType.SERIAL;
                        } else {
                            if (i2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            videoPlaylistType = MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.VideoPlaylistType.SEASON;
                        }
                        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick(eventType, mobileOfficialAppsVideoStat$TypeScreenMode, i, videoPlaylistType, j, null, 32, null), 2);
                        UiTracker uiTracker = UiTracker.a;
                        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                        uzp0 uzp0Var = UiTracker.h;
                        uzp0Var.getClass();
                        new bjc(c2, b2, uzp0Var.a).q();
                    }
                }
            }
        }
        if (this.L != null) {
            com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, true, null, 16);
        } else {
            super.S(cfp0Var);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VideoPlaylistRootVh videoPlaylistRootVh;
        View inflate = layoutInflater.inflate(this.r, viewGroup, false);
        o25.a().b0(this.D);
        final ViewGroup viewGroup2 = (ViewGroup) inflate;
        this.N = viewGroup2;
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.video_playlist_root_coordinator);
        SwitchCatalogVh switchCatalogVh = this.M;
        View k5 = switchCatalogVh.k5(layoutInflater, viewGroup3, null);
        this.A = k5;
        if (k5.getLayoutParams() instanceof CoordinatorLayout.f) {
            View view = this.A;
            this.B = ((CoordinatorLayout.f) (view != null ? view.getLayoutParams() : null)).a;
        }
        viewGroup3.addView(this.v.k5(layoutInflater, viewGroup3, null), 0);
        viewGroup3.addView(this.A, 1);
        switchCatalogVh.i8(ltz.a);
        u080 u080Var = new u080() { // from class: xsna.c5t0
            @Override // xsna.u080
            public final bqx0 b(View view2, bqx0 bqx0Var) {
                boolean q = BuildInfo.q();
                ViewGroup viewGroup4 = viewGroup2;
                if (!q) {
                    awt0.x(viewGroup4, 0, 0, 0, 0, 13);
                    return bqx0Var;
                }
                h4x j = bqx0Var.a.j(130);
                viewGroup4.setPadding(j.a, 0, j.c, j.d);
                return bqx0Var;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(viewGroup2, u080Var);
        viewGroup3.post(new mf3(this, 14));
        u4a u4aVar = this.m;
        j1 b0 = u4aVar.b.e.a().b0(oyp0.class);
        asu0 asu0Var = asu0.a;
        this.I = b0.a0(asu0Var.d()).subscribe(new eeh0(new yka0(this, 23), 15));
        CatalogConfiguration catalogConfiguration = u4aVar.b.s;
        n4t0 n4t0Var = catalogConfiguration instanceof n4t0 ? (n4t0) catalogConfiguration : null;
        if (n4t0Var != null) {
            videoPlaylistRootVh = this;
            n4t0Var.P = new c(2, videoPlaylistRootVh, VideoPlaylistRootVh.class, "onViewHolderCreated", "onViewHolderCreated(Lcom/vk/catalog2/common/ui/holders/api/CatalogViewHolder;Lcom/vk/catalog2/common/ui/mvp/CatalogEntryPointParams$CatalogScopeParams;)V", 0);
        } else {
            videoPlaylistRootVh = this;
        }
        DisableableViewPager disableableViewPager = videoPlaylistRootVh.x.o;
        (disableableViewPager != null ? disableableViewPager : null).addOnPageChangeListener(this);
        videoPlaylistRootVh.E = wjs0.b.a0(asu0Var.d()).subscribe(new hu50(new whg0(this, 23), 28));
        return inflate;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        ((hkj0) this.s.getValue()).dispose();
        this.E.dispose();
        this.v.L();
        this.M.L();
        this.w.b();
        io.reactivex.rxjava3.disposables.c cVar = this.I;
        if (cVar != null) {
            cVar.dispose();
        }
        o25.a().B(this.D);
        DisableableViewPager disableableViewPager = this.x.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        disableableViewPager.removeOnPageChangeListener(this);
    }

    @Override // xsna.df90
    public final void e(int i, int i2, int i3, int i4) {
        VideoPlaylistHeaderVh videoPlaylistHeaderVh = this.v;
        if (i2 > 1 && !videoPlaylistHeaderVh.h) {
            videoPlaylistHeaderVh.e(true);
        } else if (i2 > 1) {
            videoPlaylistHeaderVh.getClass();
        } else if (videoPlaylistHeaderVh.h) {
            videoPlaylistHeaderVh.e(false);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.M.r;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c h0(q3a q3aVar) {
        return new f(io.reactivex.rxjava3.internal.functions.a.b);
    }

    public final void i0(String str, String str2, VideoFile videoFile, List<? extends VideoFile> list, VideoTransitionSource videoTransitionSource) {
        String str3;
        SearchStatInfoProvider searchStatInfoProvider = this.m.b.m;
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
        if (videoFile == null || (str3 = videoFile.r()) == null) {
            str3 = "";
        }
        SearchStatsLoggingInfo b2 = searchStatInfoProvider.b(type, str3, false);
        if (videoFile == null || videoFile.isEmpty() || !(videoFile.w8() || videoFile.isExternal())) {
            p0(this, videoFile, list, str, str2, b2, 0, videoTransitionSource, 32);
        } else {
            q0(videoFile, str, b2);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        this.M.i8(bnn0Var);
    }

    public final a j0(UIBlockList uIBlockList) {
        Iterator<T> it = uIBlockList.y.iterator();
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = -1;
        while (true) {
            if (!it.hasNext()) {
                return i3 != -1 ? new a((UIBlockVideoAlbum) uIBlockList.y.get(i3), i2, z) : new a(null, i2, z);
            }
            Object next = it.next();
            int i4 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            UIBlock uIBlock = (UIBlock) next;
            if (uIBlock instanceof UIBlockVideoAlbum) {
                i3 = i;
            } else if (uIBlock instanceof UIBlockVideo) {
                UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
                uIBlockVideo.M = this.G;
                uIBlockVideo.N = Integer.valueOf(this.F);
                i2++;
            } else if (uIBlock instanceof UIBlockPlaceholder) {
                CatalogViewStyle catalogViewStyle = uIBlock.l;
                PlaceholderCatalogViewStyle placeholderCatalogViewStyle = catalogViewStyle instanceof PlaceholderCatalogViewStyle ? (PlaceholderCatalogViewStyle) catalogViewStyle : null;
                z = (placeholderCatalogViewStyle != null ? placeholderCatalogViewStyle.b : null) == PlaceholderCatalogViewStyle.Style.Elongate;
            }
            i = i4;
        }
    }

    public final void k0(UIBlock uIBlock, VideoTransitionSource videoTransitionSource) {
        if (uIBlock instanceof UIBlockVideo) {
            CatalogConfiguration catalogConfiguration = this.m.b.s;
            n4t0 n4t0Var = catalogConfiguration instanceof n4t0 ? (n4t0) catalogConfiguration : null;
            List<? extends VideoFile> list = n4t0Var != null ? n4t0Var.I : null;
            int i = 0;
            if (list != null) {
                String r1 = ((UIBlockVideo) uIBlock).B.r1();
                Iterator<? extends VideoFile> it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (epx.f(r1, it.next().r1())) {
                        break;
                    } else {
                        i2++;
                    }
                }
                Integer valueOf = i2 != -1 ? Integer.valueOf(i2) : null;
                if (valueOf != null) {
                    i = valueOf.intValue();
                }
            }
            UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
            s0(uIBlockVideo.f, this.J, uIBlockVideo.B, i, videoTransitionSource);
        }
    }

    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void l0(int i, UIBlock uIBlock, View view) {
        Object obj = null;
        if (i == R.id.small_video_item_root) {
            if (!((Boolean) this.P.getValue()).booleanValue() || view == null) {
                k0(uIBlock, null);
                return;
            } else {
                k0(uIBlock, zjq.f(view));
                return;
            }
        }
        u4a u4aVar = this.m;
        if (i != R.id.watch_button) {
            if (i == R.id.toolbar) {
                this.x.s();
                return;
            } else if (i == R.id.watch_with_shuffle_button) {
                ((hkj0) this.s.getValue()).a(uIBlock, u4aVar.b.s, this.b);
                return;
            } else {
                if (i == -1) {
                    u4aVar.b.b.c(false);
                    return;
                }
                return;
            }
        }
        CatalogConfiguration catalogConfiguration = u4aVar.b.s;
        if ((uIBlock instanceof UIBlockVideoAlbum) && (catalogConfiguration instanceof n4t0)) {
            if (!this.p.J().Y1()) {
                UIBlockVideoAlbum uIBlockVideoAlbum = (UIBlockVideoAlbum) uIBlock;
                t0(this, uIBlockVideoAlbum.f, uIBlockVideoAlbum.y.d, null, 20);
                return;
            }
            List<? extends VideoFile> list = ((n4t0) catalogConfiguration).I;
            for (Object obj2 : list) {
                VideoRestriction O = ((VideoFile) obj2).O();
                if (O == null || O.f) {
                    obj = obj2;
                    break;
                }
            }
            VideoFile videoFile = (VideoFile) obj;
            if (videoFile != null) {
                UIBlockVideoAlbum uIBlockVideoAlbum2 = (UIBlockVideoAlbum) uIBlock;
                i0(uIBlockVideoAlbum2.f, uIBlockVideoAlbum2.y.d, videoFile, list, null);
            }
        }
    }

    public final void o0() {
        VideoPlaylistHeaderVh videoPlaylistHeaderVh = this.v;
        NonBouncedAppBarLayout nonBouncedAppBarLayout = videoPlaylistHeaderVh.d;
        if (nonBouncedAppBarLayout == null) {
            nonBouncedAppBarLayout = null;
        }
        nonBouncedAppBarLayout.h(false, false, true);
        CollapsingToolbarLayout collapsingToolbarLayout = videoPlaylistHeaderVh.c;
        if (collapsingToolbarLayout == null) {
            collapsingToolbarLayout = null;
        }
        collapsingToolbarLayout.setVisibility(8);
        NonBouncedAppBarLayout nonBouncedAppBarLayout2 = videoPlaylistHeaderVh.d;
        if (nonBouncedAppBarLayout2 == null) {
            nonBouncedAppBarLayout2 = null;
        }
        nonBouncedAppBarLayout2.setVisibility(8);
        NonBouncedAppBarLayout nonBouncedAppBarLayout3 = videoPlaylistHeaderVh.d;
        VideoPlaylistHeaderVh.a(nonBouncedAppBarLayout3 != null ? nonBouncedAppBarLayout3 : null, false);
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.p.J().v0() || !(this.m.b.c || this.t)) {
            this.M.onConfigurationChanged(configuration);
            VideoPlaylistHeaderVh videoPlaylistHeaderVh = this.v;
            videoPlaylistHeaderVh.getClass();
            videoPlaylistHeaderVh.k = configuration.orientation == 1;
            videoPlaylistHeaderVh.b(videoPlaylistHeaderVh.c() && !videoPlaylistHeaderVh.h);
            if (fxc0.B().J().v0()) {
                NonBouncedAppBarLayout nonBouncedAppBarLayout = videoPlaylistHeaderVh.d;
                if (nonBouncedAppBarLayout == null) {
                    nonBouncedAppBarLayout = null;
                }
                videoPlaylistHeaderVh.j = nonBouncedAppBarLayout.f();
            } else if (!videoPlaylistHeaderVh.k) {
                NonBouncedAppBarLayout nonBouncedAppBarLayout2 = videoPlaylistHeaderVh.d;
                if (nonBouncedAppBarLayout2 == null) {
                    nonBouncedAppBarLayout2 = null;
                }
                videoPlaylistHeaderVh.j = nonBouncedAppBarLayout2.f();
            }
            u4t0 u4t0Var = videoPlaylistHeaderVh.e;
            boolean c2 = videoPlaylistHeaderVh.c();
            ImageView imageView = u4t0Var.d;
            if (imageView != null) {
                imageView.setVisibility((!u4t0Var.i || c2) ? 8 : 0);
            }
            videoPlaylistHeaderVh.f.d(videoPlaylistHeaderVh.i);
            videoPlaylistHeaderVh.g.d(videoPlaylistHeaderVh.i);
            NonBouncedAppBarLayout nonBouncedAppBarLayout3 = videoPlaylistHeaderVh.d;
            if (nonBouncedAppBarLayout3 == null) {
                nonBouncedAppBarLayout3 = null;
            }
            nonBouncedAppBarLayout3.setExpanded(videoPlaylistHeaderVh.c() && videoPlaylistHeaderVh.j);
            sba sbaVar = this.x.s;
            if (sbaVar != null) {
                SparseArray<ayn0> sparseArray = sbaVar.t;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    sparseArray.valueAt(i).b();
                }
                SparseArray<CatalogViewHolder> sparseArray2 = sbaVar.r;
                SparseArray sparseArray3 = new SparseArray();
                int size2 = sparseArray2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    int keyAt = sparseArray2.keyAt(i2);
                    CatalogViewHolder valueAt = sparseArray2.valueAt(i2);
                    g380 g380Var = valueAt instanceof g380 ? (g380) valueAt : null;
                    if (g380Var != null) {
                        sparseArray3.put(keyAt, g380Var);
                    }
                }
                int size3 = sparseArray3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((g380) sparseArray3.valueAt(i3)).onConfigurationChanged(configuration);
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
        rrn0 rrn0Var = this.C;
        if (rrn0Var != null) {
            rrn0Var.invoke();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        CatalogRecyclerPaginatedView catalogRecyclerPaginatedView = this.u;
        if (catalogRecyclerPaginatedView != null) {
            catalogRecyclerPaginatedView.M9(this);
        }
        this.C = null;
        this.x.onPause();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        this.x.onResume();
        ViewGroup viewGroup = this.N;
        if (viewGroup != null) {
            viewGroup.post(new ou5(this, 15));
        }
        VideoPlaylistHeaderVh videoPlaylistHeaderVh = this.v;
        NonBouncedAppBarLayout nonBouncedAppBarLayout = videoPlaylistHeaderVh.d;
        if (nonBouncedAppBarLayout == null) {
            nonBouncedAppBarLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = nonBouncedAppBarLayout.getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        CoordinatorLayout.c cVar = fVar != null ? fVar.a : null;
        NonBounceAppBarBlockableBehavior nonBounceAppBarBlockableBehavior = cVar instanceof NonBounceAppBarBlockableBehavior ? (NonBounceAppBarBlockableBehavior) cVar : null;
        int D = nonBounceAppBarBlockableBehavior != null ? nonBounceAppBarBlockableBehavior.D() : 0;
        NonBouncedAppBarLayout nonBouncedAppBarLayout2 = videoPlaylistHeaderVh.d;
        VideoPlaylistHeaderVh.a(nonBouncedAppBarLayout2 != null ? nonBouncedAppBarLayout2 : null, videoPlaylistHeaderVh.d(D));
    }

    public final void q0(VideoFile videoFile, String str, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        this.p.Y().k(this.b, videoFile, (r43 & 4) != 0 ? null : str, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : searchStatsLoggingInfo, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
    }

    public final void r0(UIBlock uIBlock) {
        a aVar;
        if (uIBlock instanceof UIBlockList) {
            aVar = j0((UIBlockList) uIBlock);
        } else {
            if (uIBlock instanceof UIBlockCatalog) {
                Object a0 = j5g.a0(((UIBlockCatalog) uIBlock).A);
                UIBlockList uIBlockList = a0 instanceof UIBlockList ? (UIBlockList) a0 : null;
                if (uIBlockList != null) {
                    aVar = j0(uIBlockList);
                }
            }
            aVar = null;
        }
        this.y = aVar;
        if (aVar != null) {
            UIBlockVideoAlbum uIBlockVideoAlbum = aVar.a;
            int i = aVar.b;
            boolean z = aVar.c;
            if (uIBlockVideoAlbum == null || uIBlockVideoAlbum.y.b != this.F) {
                return;
            }
            VideoPlaylistHeaderVh videoPlaylistHeaderVh = this.v;
            if (i > 0 || z) {
                videoPlaylistHeaderVh.N6(uIBlockVideoAlbum);
                return;
            }
            NonBouncedAppBarLayout nonBouncedAppBarLayout = videoPlaylistHeaderVh.d;
            if (nonBouncedAppBarLayout == null) {
                nonBouncedAppBarLayout = null;
            }
            nonBouncedAppBarLayout.setVisibility(0);
            CollapsingToolbarLayout collapsingToolbarLayout = videoPlaylistHeaderVh.c;
            if (collapsingToolbarLayout == null) {
                collapsingToolbarLayout = null;
            }
            collapsingToolbarLayout.setScrimAnimationDuration(0L);
            NonBouncedAppBarLayout nonBouncedAppBarLayout2 = videoPlaylistHeaderVh.d;
            if (nonBouncedAppBarLayout2 == null) {
                nonBouncedAppBarLayout2 = null;
            }
            nonBouncedAppBarLayout2.h(false, false, true);
            videoPlaylistHeaderVh.e(true);
            videoPlaylistHeaderVh.f.c(uIBlockVideoAlbum);
            NonBouncedAppBarLayout nonBouncedAppBarLayout3 = videoPlaylistHeaderVh.d;
            (nonBouncedAppBarLayout3 != null ? nonBouncedAppBarLayout3 : null).post(new z27(videoPlaylistHeaderVh, 17));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        this.M.i8(new swp(th));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(String str, String str2, VideoFile videoFile, int i, VideoTransitionSource videoTransitionSource) {
        boolean z;
        List<? extends VideoFile> list;
        Iterator<T> it;
        boolean z2;
        List<VideoSeason> list2;
        UIBlockVideoAlbum uIBlockVideoAlbum;
        CatalogConfiguration catalogConfiguration = this.m.b.s;
        if (catalogConfiguration instanceof n4t0) {
            List<? extends VideoFile> list3 = ((n4t0) catalogConfiguration).I;
            boolean z3 = false;
            if (this.p.J().C1()) {
                a aVar = this.y;
                VideoAlbum videoAlbum = (aVar == null || (uIBlockVideoAlbum = aVar.a) == null) ? null : uIBlockVideoAlbum.y;
                if ((videoAlbum == null || (list2 = videoAlbum.q) == null) ? false : !list2.isEmpty()) {
                    z = true;
                    if (z && videoFile != null) {
                        list = list3;
                        if ((list instanceof Collection) || !list.isEmpty()) {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (epx.f(((VideoFile) it.next()).r1(), videoFile.r1())) {
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                        z2 = true;
                        if (z2) {
                            z3 = true;
                        }
                    }
                    if (z3) {
                        list3 = Collections.singletonList(videoFile);
                    }
                    List<? extends VideoFile> list4 = list3;
                    if (videoFile == null) {
                        videoFile = (VideoFile) j5g.b0(i, list4);
                    }
                    i0(str, str2, videoFile, list4, videoTransitionSource);
                }
            }
            z = false;
            if (z) {
                list = list3;
                if (list instanceof Collection) {
                }
                it = list.iterator();
                while (it.hasNext()) {
                }
                z2 = true;
                if (z2) {
                }
            }
            if (z3) {
            }
            List<? extends VideoFile> list42 = list3;
            if (videoFile == null) {
            }
            i0(str, str2, videoFile, list42, videoTransitionSource);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mba
    public final void w(View view, UIBlock uIBlock, Object obj) {
        if (((Boolean) this.P.getValue()).booleanValue()) {
            l0(view.getId(), uIBlock, view);
        } else {
            super.w(view, uIBlock, obj);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        this.M.i8(ltz.a);
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        l0(i, uIBlock, null);
    }

    @Override // xsna.df90
    public final void l(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
