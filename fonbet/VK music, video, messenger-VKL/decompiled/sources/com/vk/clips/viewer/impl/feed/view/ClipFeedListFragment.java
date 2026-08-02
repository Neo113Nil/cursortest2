package com.vk.clips.viewer.impl.feed.view;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.design.view.component.video.seekbar.ClipSeekBarView;
import com.vk.clips.editor.templates.api.model.TemplatesFlowScreen;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.clips.interests.api.di.ClipsInterestsComponent;
import com.vk.clips.playlists.ClipsPlaylistContentLaunchParams;
import com.vk.clips.sdk.models.SdkMusicTrack;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.models.ads.SdkAdsChoices;
import com.vk.clips.sdk.models.ads.SdkAdsChoicesOptions;
import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.di.ClipsViewersSdkComponent;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.api.ui.ClipSeekBarController;
import com.vk.clips.sdk.shared.api.utils.ClipFeedScreenType;
import com.vk.clips.sdk.shared.api.utils.ClipFeedTooltip$ClipFeedTooltipType;
import com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.TrendingHashtag;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.feed.core.models.MyTargetAdsComplainOptions;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.models.comment.ReplyInfo;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.movika.sdk.base.ui.o0;
import com.vk.movika.sdk.base.ui.t;
import com.vk.newsfeed.api.contracts.modalcommon.ModalPostDestination;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.core.a;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.disposables.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.a0a;
import xsna.a5r;
import xsna.aeg0;
import xsna.ah;
import xsna.ai5;
import xsna.anj;
import xsna.asu0;
import xsna.awt0;
import xsna.axc;
import xsna.b25;
import xsna.b3;
import xsna.b9e;
import xsna.bb;
import xsna.bpn0;
import xsna.bv1;
import xsna.bwc;
import xsna.c5g;
import xsna.ca;
import xsna.cb;
import xsna.cn70;
import xsna.cro0;
import xsna.d370;
import xsna.d3m;
import xsna.d9e;
import xsna.d9f;
import xsna.dgd;
import xsna.dhr0;
import xsna.dkm;
import xsna.dux;
import xsna.dxc;
import xsna.dym0;
import xsna.dzc;
import xsna.e4;
import xsna.e43;
import xsna.e520;
import xsna.eb;
import xsna.efj0;
import xsna.efs;
import xsna.ek;
import xsna.enj;
import xsna.epx;
import xsna.eu1;
import xsna.exc;
import xsna.ey0;
import xsna.ezc;
import xsna.f4m;
import xsna.f84;
import xsna.fai;
import xsna.fb;
import xsna.fpf0;
import xsna.fqe;
import xsna.fss0;
import xsna.fto0;
import xsna.fwc;
import xsna.fxc0;
import xsna.fzc;
import xsna.g2v;
import xsna.g3d;
import xsna.gjz;
import xsna.gwc;
import xsna.gxc;
import xsna.gxp0;
import xsna.gy0;
import xsna.gzs;
import xsna.h3d;
import xsna.h6;
import xsna.he3;
import xsna.hg;
import xsna.hg1;
import xsna.hjj0;
import xsna.hwc;
import xsna.i0q0;
import xsna.i5s;
import xsna.i70;
import xsna.i8e;
import xsna.ikv0;
import xsna.il1;
import xsna.in0;
import xsna.iwc;
import xsna.ixc;
import xsna.iy0;
import xsna.iyc;
import xsna.izs;
import xsna.j5g;
import xsna.j70;
import xsna.jb;
import xsna.jg0;
import xsna.jgd;
import xsna.jof;
import xsna.jwc;
import xsna.jyc;
import xsna.k0d;
import xsna.k15;
import xsna.k9x;
import xsna.ka0;
import xsna.kbj0;
import xsna.kbs0;
import xsna.ki0;
import xsna.kih0;
import xsna.kwc;
import xsna.kxc;
import xsna.kyc;
import xsna.l0f;
import xsna.l1;
import xsna.ld;
import xsna.leh0;
import xsna.lkh0;
import xsna.lxc;
import xsna.m0f;
import xsna.m0v0;
import xsna.m1;
import xsna.m4;
import xsna.m6e;
import xsna.maz;
import xsna.mbs;
import xsna.mg;
import xsna.mh;
import xsna.mih0;
import xsna.msy;
import xsna.mxc;
import xsna.n11;
import xsna.nfd;
import xsna.ni5;
import xsna.nlh0;
import xsna.no;
import xsna.nqc;
import xsna.nw6;
import xsna.nxc;
import xsna.nyc;
import xsna.o0r0;
import xsna.o6e;
import xsna.ocd;
import xsna.oo;
import xsna.ow90;
import xsna.oxc;
import xsna.oz50;
import xsna.ozl;
import xsna.pd;
import xsna.pdv0;
import xsna.pge;
import xsna.pih0;
import xsna.piz;
import xsna.pkd;
import xsna.pu;
import xsna.px0;
import xsna.pxc;
import xsna.q0f;
import xsna.q8e;
import xsna.qc;
import xsna.qdz;
import xsna.qg1;
import xsna.qhh0;
import xsna.qvq;
import xsna.qxr;
import xsna.ra;
import xsna.ra0;
import xsna.rie;
import xsna.rj1;
import xsna.roc;
import xsna.rvx;
import xsna.rxc;
import xsna.ry0;
import xsna.s16;
import xsna.s1d;
import xsna.s3q0;
import xsna.s4;
import xsna.s5;
import xsna.s53;
import xsna.s7e;
import xsna.sa0;
import xsna.saf;
import xsna.sih0;
import xsna.sj1;
import xsna.soc;
import xsna.svc;
import xsna.sxc;
import xsna.t5;
import xsna.tb0;
import xsna.tci;
import xsna.tid;
import xsna.tke;
import xsna.tle;
import xsna.tlo0;
import xsna.tv4;
import xsna.tvk0;
import xsna.twc;
import xsna.txc;
import xsna.u40;
import xsna.u4f;
import xsna.uif0;
import xsna.ule;
import xsna.uyc;
import xsna.v0d;
import xsna.v40;
import xsna.v6;
import xsna.v7e;
import xsna.vf0;
import xsna.vp00;
import xsna.vv0;
import xsna.vxc;
import xsna.w1s0;
import xsna.w21;
import xsna.w380;
import xsna.w5e;
import xsna.w8l;
import xsna.wb1;
import xsna.we0;
import xsna.wkh0;
import xsna.wm1;
import xsna.wmf;
import xsna.wp50;
import xsna.wxc;
import xsna.x7c;
import xsna.xa4;
import xsna.xcd;
import xsna.xe90;
import xsna.xle;
import xsna.xm1;
import xsna.xp50;
import xsna.xqd;
import xsna.xxc;
import xsna.y5e;
import xsna.y6;
import xsna.y9t0;
import xsna.yg;
import xsna.yg5;
import xsna.yks0;
import xsna.yux;
import xsna.yxc;
import xsna.z1h0;
import xsna.z4;
import xsna.z5e;
import xsna.zf1;
import xsna.zg;
import xsna.zof;
import xsna.zqj;
import xsna.zyc;

/* compiled from: ClipFeedListFragment.kt */
/* loaded from: classes.dex */
public final class ClipFeedListFragment extends BaseFragment implements ai5, d9e, qhh0, nyc, h3d, wmf, pih0, roc, tid, tb0 {
    public static final /* synthetic */ int a2 = 0;
    public final Object A0;
    public int A1;
    public final bpn0 B0;
    public String B1;
    public final Object C0;
    public final bpn0 C1;
    public final bpn0 D0;
    public final bpn0 D1;
    public final Object E0;
    public b9e E1;
    public final bpn0 F0;
    public ClipsWrapperFragment.i F1;
    public final bpn0 G0;
    public wp50 G1;
    public final bpn0 H0;
    public ClipsWrapperFragment H1;
    public final Object I0;
    public boolean I1;
    public final Object J0;
    public final bpn0 J1;
    public final Object K0;
    public final bpn0 K1;
    public final Object L0;
    public final Object L1;
    public final bpn0 M0;
    public final bpn0 M1;
    public final bpn0 N0;
    public u4f N1;
    public final bpn0 O0;
    public final Object O1;
    public final Object P0;
    public final Object P1;
    public final ClipFeedListFragment$receiver$1 Q0;
    public final Object Q1;
    public final Object R0;
    public final Object R1;
    public ule S;
    public final Object S0;
    public final Object S1;
    public kwc T;
    public final Object T0;
    public final Object T1;
    public final bpn0 U0;
    public w380 U1;
    public final bpn0 V;
    public final bpn0 V0;
    public final Object V1;
    public final bpn0 W0;
    public final Object W1;
    public final bpn0 X0;
    public final Object X1;
    public final bpn0 Y0;
    public final bpn0 Y1;
    public final bpn0 Z0;
    public final bpn0 Z1;
    public final bpn0 a1;
    public final bpn0 b1;
    public final ry0 c1;
    public final Object d0;
    public final bpn0 d1;
    public final Object e0;
    public final bpn0 e1;
    public final Object f0;
    public final bpn0 f1;
    public final Object g0;
    public final k g1;
    public final Object h0;
    public final bpn0 h1;
    public final Object i0;
    public final bpn0 i1;
    public final Object j0;
    public final bpn0 j1;
    public final Object k0;
    public final bpn0 k1;
    public final Object l0;
    public final bpn0 l1;
    public final Object m0;
    public final bpn0 m1;
    public final Object n0;
    public final bpn0 n1;
    public final Object o0;
    public final bpn0 o1;
    public final bpn0 p0;
    public final bpn0 p1;
    public final bpn0 q0;
    public final Object q1;
    public final bpn0 r0;
    public final io.reactivex.rxjava3.disposables.b r1;
    public final Object s0;
    public final bpn0 s1;
    public final Object t0;
    public final bpn0 t1;
    public final Object u0;
    public final bpn0 u1;
    public final Object v0;
    public iwc v1;
    public final bpn0 w0;
    public final yux w1;
    public final bpn0 x0;
    public final yux x1;
    public final bpn0 y0;
    public final gxp0 y1;
    public final bpn0 z0;
    public SwipeRefreshLayout z1;
    public final bpn0 U = new bpn0(new ra(this, 19));
    public final bpn0 W = new bpn0(new vf0(this, 19));
    public final bpn0 X = new bpn0(new com.vk.movika.sdk.base.logic.processor.actions.h(this, 20));
    public final bpn0 Y = new bpn0(new gy0(this, 18));
    public final bpn0 Z = new bpn0(new ixc(this, 1));
    public final bpn0 a0 = new bpn0(new lxc(this, 1));
    public final bpn0 b0 = new bpn0(new s5(this, 24));
    public final bpn0 c0 = new bpn0(new yxc(this, 1));

    /* compiled from: ClipFeedListFragment.kt */
    /* loaded from: classes17.dex */
    public static final class a extends oz50 {
    }

    /* compiled from: ClipFeedListFragment.kt */
    /* loaded from: classes17.dex */
    public final class b implements v0d<FeedItem> {
        public b() {
        }

        @Override // xsna.v0d
        public final void a(int i) {
            ClipFeedListFragment.jo(ClipFeedListFragment.this, i);
        }

        @Override // xsna.v0d
        public final void b(qxr<FeedItem> qxrVar) {
            FeedItem feedItem = qxrVar.a;
            m0f.a<FeedItem> aVar = new m0f.a<>(qxrVar.c, qxrVar.b, feedItem);
            int i = ClipFeedListFragment.a2;
            ClipFeedListFragment.this.Lo(aVar);
        }

        @Override // xsna.v0d
        public final void c(qxr<FeedItem> qxrVar) {
            FeedItem feedItem = qxrVar.a;
            m0f.a<FeedItem> aVar = new m0f.a<>(qxrVar.c, qxrVar.b, feedItem);
            int i = ClipFeedListFragment.a2;
            ClipFeedListFragment.this.Ko(aVar);
        }
    }

    /* compiled from: ClipFeedListFragment.kt */
    /* loaded from: classes17.dex */
    public static final class c {
        public static final String a() {
            int i = ClipFeedListFragment.a2;
            return i5s.a(new StringBuilder("https://"), a0a.d, "/clip");
        }
    }

    /* compiled from: ClipFeedListFragment.kt */
    /* loaded from: classes17.dex */
    public final class d {
        public d() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:108:0x022b, code lost:
        
            if (r15 != null) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:153:0x02b4, code lost:
        
            if (r15 != null) goto L146;
         */
        /* JADX WARN: Type inference failed for: r15v69, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(a5r a5rVar) {
            MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr;
            List<SdkAdsChoicesOptions> list;
            MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr2;
            List<SdkAdsChoicesOptions> list2;
            s1d oo;
            k0d k0dVar;
            ClipFeedListFragment clipFeedListFragment = ClipFeedListFragment.this;
            ?? r1 = clipFeedListFragment.R0;
            ?? r2 = clipFeedListFragment.e0;
            ?? r3 = clipFeedListFragment.d0;
            if (a5rVar instanceof a5r.d) {
                int i = ClipFeedListFragment.a2;
                s16 s16Var = (s16) clipFeedListFragment.J0.getValue();
                s16Var.b.clear();
                s16Var.a.onNext(s16.a.C3647a.a);
                return;
            }
            if (a5rVar instanceof a5r.h) {
                clipFeedListFragment.vo().m(((a5r.h) a5rVar).a);
                return;
            }
            if (a5rVar instanceof a5r.a) {
                int i2 = ClipFeedListFragment.a2;
                clipFeedListFragment.vo().finish();
                return;
            }
            if (a5rVar instanceof a5r.g) {
                a5r.g gVar = (a5r.g) a5rVar;
                if (gVar instanceof a5r.g.a) {
                    clipFeedListFragment.m3(clipFeedListFragment.to() + 1, new qg1(4, gVar, clipFeedListFragment));
                    return;
                } else {
                    if (!(gVar instanceof a5r.g.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    clipFeedListFragment.Po(((a5r.g.b) gVar).a);
                    return;
                }
            }
            if (a5rVar instanceof a5r.f) {
                int i3 = ClipFeedListFragment.a2;
                ((rie) clipFeedListFragment.a0.getValue()).m();
                return;
            }
            if (a5rVar instanceof a5r.e) {
                a5r.e eVar = (a5r.e) a5rVar;
                if (!(eVar instanceof a5r.e.a)) {
                    if (!(eVar instanceof a5r.e.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a5r.e.b bVar = (a5r.e.b) a5rVar;
                    int i4 = ClipFeedListFragment.a2;
                    ClipsRouter.c(((pkd) clipFeedListFragment.R1.getValue()).a(), clipFeedListFragment.requireContext(), Collections.singletonList(new ClipFeedTab.Playlist.FromMiddle(bVar.a, bVar.b.a1())), null, null, fpf0.a(ClipFeedTab.Playlist.FromMiddle.class), null, null, true, null, 1900);
                    return;
                }
                a5r.e.a aVar = (a5r.e.a) a5rVar;
                int i5 = ClipFeedListFragment.a2;
                boolean c = dhr0.a.c(clipFeedListFragment.mo2getContext());
                if (aVar instanceof a5r.e.a.C2525a) {
                    ((com.vk.clips.playlists.a) r3.getValue()).b(clipFeedListFragment.requireContext(), new ClipsPlaylistContentLaunchParams(((a5r.e.a.C2525a) aVar).a, null, c, true, (fqe) r2.getValue(), 2, null), ((AppCompatActivity) clipFeedListFragment.kn()).getSupportFragmentManager(), new ca(clipFeedListFragment, 19));
                    return;
                } else {
                    if (!(aVar instanceof a5r.e.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a5r.e.a.b bVar2 = (a5r.e.a.b) aVar;
                    ((com.vk.clips.playlists.a) r3.getValue()).b(clipFeedListFragment.requireContext(), new ClipsPlaylistContentLaunchParams(bVar2.a, bVar2.b, c, true, (fqe) r2.getValue()), ((AppCompatActivity) clipFeedListFragment.kn()).getSupportFragmentManager(), new px0(clipFeedListFragment, 14));
                    return;
                }
            }
            if (a5rVar instanceof a5r.e.c) {
                FragmentActivity activity = clipFeedListFragment.getActivity();
                if (activity == null || (oo = clipFeedListFragment.oo()) == null || (k0dVar = oo.s) == null) {
                    return;
                }
                List<ClipsPlaylist> list3 = ((a5r.e.c) a5rVar).b;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new mih0.l.b(fai.F((ClipsPlaylist) it.next())));
                }
                mih0.e eVar2 = new mih0.e(R.string.clips_header_playlists);
                tlo0.Companion.getClass();
                e520 e520Var = nqc.a;
                nqc.a(j5g.u0(arrayList, Collections.singletonList(eVar2)), activity, k0dVar);
                return;
            }
            if (a5rVar instanceof a5r.b) {
                int i6 = ClipFeedListFragment.a2;
                clipFeedListFragment.uo().d(((a5r.b) a5rVar).a);
                return;
            }
            if (a5rVar instanceof a5r.i) {
                a5r.i iVar = (a5r.i) a5rVar;
                String str = iVar.a;
                SdkAdsChoices sdkAdsChoices = iVar.b;
                String str2 = sdkAdsChoices != null ? sdkAdsChoices.d : null;
                if (sdkAdsChoices != null && (list2 = sdkAdsChoices.f) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (SdkAdsChoicesOptions sdkAdsChoicesOptions : list2) {
                        boolean z = str2 == null;
                        Integer num = sdkAdsChoicesOptions.h;
                        String str3 = sdkAdsChoicesOptions.d;
                        String str4 = sdkAdsChoicesOptions.b;
                        MyTargetAdsComplainOptions myTargetAdsComplainOptions = ((z || num != null) && epx.f(sdkAdsChoicesOptions.c, "hide") && str3 != null && str4 != null) ? new MyTargetAdsComplainOptions(num != null ? num.intValue() : -1, str3, str4) : null;
                        if (myTargetAdsComplainOptions != null) {
                            arrayList2.add(myTargetAdsComplainOptions);
                        }
                    }
                    myTargetAdsComplainOptionsArr2 = (MyTargetAdsComplainOptions[]) arrayList2.toArray(new MyTargetAdsComplainOptions[0]);
                }
                myTargetAdsComplainOptionsArr2 = new MyTargetAdsComplainOptions[0];
                if (myTargetAdsComplainOptionsArr2.length != 0) {
                    ((n11) r1.getValue()).d((cro0) clipFeedListFragment.mo2getContext(), str, str2, myTargetAdsComplainOptionsArr2);
                    return;
                } else {
                    int i7 = ClipFeedListFragment.a2;
                    clipFeedListFragment.uo().d(str);
                    return;
                }
            }
            if (!(a5rVar instanceof a5r.j)) {
                if (!(a5rVar instanceof a5r.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i8 = ClipFeedListFragment.a2;
                a5r.c cVar = (a5r.c) a5rVar;
                clipFeedListFragment.mo().d(new ClipViewerAnalyticsEvent.FloatingButtonEvent(cVar.a, cVar.b, cVar.c));
                return;
            }
            a5r.j jVar = (a5r.j) a5rVar;
            String str5 = jVar.a;
            SdkAdsChoices sdkAdsChoices2 = jVar.b;
            String str6 = sdkAdsChoices2 != null ? sdkAdsChoices2.d : null;
            if (sdkAdsChoices2 != null && (list = sdkAdsChoices2.f) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (SdkAdsChoicesOptions sdkAdsChoicesOptions2 : list) {
                    boolean z2 = str6 == null;
                    Integer num2 = sdkAdsChoicesOptions2.h;
                    String str7 = sdkAdsChoicesOptions2.d;
                    String str8 = sdkAdsChoicesOptions2.b;
                    MyTargetAdsComplainOptions myTargetAdsComplainOptions2 = ((z2 || num2 != null) && epx.f(sdkAdsChoicesOptions2.c, "complain") && str7 != null && str8 != null) ? new MyTargetAdsComplainOptions(num2 != null ? num2.intValue() : -1, str7, str8) : null;
                    if (myTargetAdsComplainOptions2 != null) {
                        arrayList3.add(myTargetAdsComplainOptions2);
                    }
                }
                myTargetAdsComplainOptionsArr = (MyTargetAdsComplainOptions[]) arrayList3.toArray(new MyTargetAdsComplainOptions[0]);
            }
            myTargetAdsComplainOptionsArr = new MyTargetAdsComplainOptions[0];
            if (myTargetAdsComplainOptionsArr.length == 0) {
                ((lkh0) clipFeedListFragment.S0.getValue()).a(clipFeedListFragment.requireContext());
            } else {
                ((n11) r1.getValue()).a((cro0) clipFeedListFragment.mo2getContext(), str6, str5, myTargetAdsComplainOptionsArr);
            }
        }
    }

    /* compiled from: ClipFeedListFragment.kt */
    /* loaded from: classes17.dex */
    public static final class e {
    }

    /* compiled from: ClipFeedListFragment.kt */
    /* loaded from: classes17.dex */
    public static final class f {
        public f() {
        }
    }

    /* compiled from: ClipFeedListFragment.kt */
    /* loaded from: classes17.dex */
    public static final class g {
        public g() {
        }

        public final ArrayList a(k9x k9xVar) {
            rie.a aVar;
            int i = ClipFeedListFragment.a2;
            List<FeedItem> B0 = j5g.B0(ClipFeedListFragment.this.ro(), k9xVar);
            ArrayList arrayList = new ArrayList(c5g.u(B0, 10));
            for (FeedItem feedItem : B0) {
                if (feedItem instanceof FeedItem.d) {
                    FeedItem.d dVar = (FeedItem.d) feedItem;
                    if (dVar.k().X0() == null) {
                        aVar = new rie.a.C3610a(dVar.k());
                        arrayList.add(aVar);
                    }
                }
                aVar = rie.a.b.a;
                arrayList.add(aVar);
            }
            return arrayList;
        }
    }

    /* compiled from: ClipFeedListFragment.kt */
    /* loaded from: classes17.dex */
    public static final class h {
    }

    /* compiled from: ClipFeedListFragment.kt */
    /* loaded from: classes17.dex */
    public static final class i {
        public i() {
        }
    }

    /* compiled from: ClipFeedListFragment.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements izs<Integer, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Integer num) {
            ClipFeedListFragment.jo((ClipFeedListFragment) this.receiver, num.intValue());
            return s3q0.a;
        }
    }

    /* compiled from: ClipFeedListFragment.kt */
    /* loaded from: classes17.dex */
    public static final class k implements dux<FeedItem> {
        public k() {
        }

        @Override // xsna.dux
        public final rvx<FeedItem> a(int i) {
            int i2 = ClipFeedListFragment.a2;
            FeedItem yo = ClipFeedListFragment.this.yo(i);
            if (yo != null) {
                return new rvx<>(yo, yo.F());
            }
            return null;
        }
    }

    /* compiled from: ClipFeedListFragment.kt */
    /* loaded from: classes17.dex */
    public static final class l extends RecyclerView.t {
        public l() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 1) {
                int i2 = ClipFeedListFragment.a2;
                gjz zo = ClipFeedListFragment.this.zo();
                if (zo != null) {
                    zo.a0();
                }
            }
        }
    }

    /* compiled from: View.kt */
    /* loaded from: classes17.dex */
    public static final class n implements View.OnLayoutChangeListener {
        public final /* synthetic */ int c;

        public n(int i) {
            this.c = i;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            ClipFeedListFragment clipFeedListFragment = ClipFeedListFragment.this;
            int i9 = this.c;
            ClipFeedListFragment.jo(clipFeedListFragment, i9);
            if (clipFeedListFragment.Eo().G()) {
                return;
            }
            ((q0f) clipFeedListFragment.j1.getValue()).e(i9);
        }
    }

    /* compiled from: ClipFeedListFragment.kt */
    /* loaded from: classes17.dex */
    public static final class o extends RecyclerView.t {
        public final /* synthetic */ q8e b;
        public final /* synthetic */ gzs<s3q0> c;

        public o(q8e q8eVar, gzs gzsVar) {
            this.b = q8eVar;
            this.c = gzsVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (recyclerView.getScrollState() == 0) {
                q8e q8eVar = this.b;
                q8eVar.setTouchEnabled(true);
                q8eVar.removeOnScrollListener(this);
                this.c.invoke();
            }
        }
    }

    /* compiled from: ClipFeedListFragment.kt */
    /* loaded from: classes17.dex */
    public static final class p extends RecyclerView.t {
        public int b;
        public sj1 c;

        public p() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (recyclerView.getScrollState() != 0) {
                Runnable runnable = this.c;
                if (runnable != null) {
                    recyclerView.removeCallbacks(runnable);
                }
                this.c = null;
                return;
            }
            this.b = 0;
            Runnable runnable2 = this.c;
            if (runnable2 != null) {
                recyclerView.removeCallbacks(runnable2);
            }
            sj1 sj1Var = new sj1(ClipFeedListFragment.this, 3);
            recyclerView.post(sj1Var);
            this.c = sj1Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int height = recyclerView.getHeight();
            int i3 = this.b;
            if (i3 == Integer.MIN_VALUE) {
                return;
            }
            int i4 = i3 + i2;
            this.b = i4;
            if (Math.abs(i4) * 10 > height) {
                this.b = Integer.MIN_VALUE;
                sj1 sj1Var = this.c;
                if (sj1Var != null) {
                    recyclerView.removeCallbacks(sj1Var);
                }
                this.c = null;
                ClipFeedListFragment.this.Qo(false);
            }
        }
    }

    /* compiled from: ClipFeedListFragment.kt */
    /* loaded from: classes17.dex */
    public static final class q implements pge.a {
        public q() {
        }

        @Override // xsna.pge.a
        public final void a() {
            i0q0.i(0L, new kyc(ClipFeedListFragment.this, 0));
        }
    }

    /* JADX WARN: Type inference failed for: r0v72, types: [com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment$receiver$1] */
    public ClipFeedListFragment() {
        final int i2 = 0;
        this.V = new bpn0(new gzs(this) { // from class: xsna.uxc
            public final /* synthetic */ ClipFeedListFragment c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                int i3 = i2;
                ClipFeedListFragment clipFeedListFragment = this.c;
                switch (i3) {
                    case 0:
                        int i4 = ClipFeedListFragment.a2;
                        return (ClipsViewersSdkComponentImpl) m7m.d(clipFeedListFragment).a(fpf0.a(ClipsViewersSdkComponent.class));
                    default:
                        int i5 = ClipFeedListFragment.a2;
                        return (BridgeComponent) m7m.d(clipFeedListFragment).a(fpf0.a(BridgeComponent.class));
                }
            }
        });
        v40 v40Var = new v40(this, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d0 = msy.a(lazyThreadSafetyMode, v40Var);
        this.e0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.model.e(this, 14));
        this.f0 = msy.a(lazyThreadSafetyMode, new yg(this, 17));
        this.g0 = msy.a(lazyThreadSafetyMode, new mh(this, 20));
        this.h0 = msy.a(lazyThreadSafetyMode, new nxc(this, 1));
        this.i0 = msy.a(lazyThreadSafetyMode, new t5(this, 20));
        this.j0 = msy.a(lazyThreadSafetyMode, new xxc(this, 1));
        this.k0 = msy.a(lazyThreadSafetyMode, new t(this, 20));
        final int i3 = 0;
        this.l0 = msy.a(lazyThreadSafetyMode, new gzs(this) { // from class: xsna.fxc
            public final /* synthetic */ ClipFeedListFragment c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                int i4 = i3;
                ClipFeedListFragment clipFeedListFragment = this.c;
                switch (i4) {
                    case 0:
                        int i5 = ClipFeedListFragment.a2;
                        ClipsWrapperInputArguments.a aVar = ClipsWrapperInputArguments.r;
                        Bundle requireArguments = clipFeedListFragment.requireArguments();
                        aVar.getClass();
                        ClipFeedTab clipFeedTab = (ClipFeedTab) j5g.a0(ClipsWrapperInputArguments.a.c(requireArguments));
                        return clipFeedTab == null ? new ClipFeedTab.TopVideo(null, null, null, null, null, 31, null) : clipFeedTab;
                    default:
                        int i6 = ClipFeedListFragment.a2;
                        if (!((l8e) clipFeedListFragment.O0.getValue()).a().containsKey(Integer.valueOf(ClipFeedAdapter.ViewType.ADS_CONTROLS.ordinal()))) {
                            return rke.a;
                        }
                        clipFeedListFragment.qo().getClass();
                        return new qke();
                }
            }
        });
        this.m0 = msy.a(lazyThreadSafetyMode, new gzs(this) { // from class: xsna.jxc
            public final /* synthetic */ ClipFeedListFragment c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                int i4 = i3;
                ClipFeedListFragment clipFeedListFragment = this.c;
                switch (i4) {
                    case 0:
                        int i5 = ClipFeedListFragment.a2;
                        return (SearchStatsLoggingInfo) clipFeedListFragment.requireArguments().getParcelable("search_stats_logging_info");
                    default:
                        int i6 = ClipFeedListFragment.a2;
                        return new ocd(new pxc(clipFeedListFragment, 0), clipFeedListFragment.po(), clipFeedListFragment.y1, clipFeedListFragment.w1, clipFeedListFragment.x1, !clipFeedListFragment.isResumed());
                }
            }
        });
        this.n0 = msy.a(lazyThreadSafetyMode, new gzs(this) { // from class: xsna.qxc
            public final /* synthetic */ ClipFeedListFragment c;

            {
                this.c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.gzs
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        int i4 = ClipFeedListFragment.a2;
                        return (ClipFeedScreenType) ClipFeedScreenType.h().get(this.c.requireArguments().getInt("ClipFeedListFragment.screen_type"));
                    default:
                        int i5 = ClipFeedListFragment.a2;
                        ClipFeedListFragment clipFeedListFragment = this.c;
                        return new gwc(clipFeedListFragment.getWindow(), (zfj0) clipFeedListFragment.s1.getValue(), clipFeedListFragment, clipFeedListFragment.Do().getFeedContainer(), new nme(clipFeedListFragment.Ka(), (ki0) clipFeedListFragment.k0.getValue()));
                }
            }
        });
        this.o0 = msy.a(lazyThreadSafetyMode, new gzs(this) { // from class: xsna.ayc
            public final /* synthetic */ ClipFeedListFragment c;

            {
                this.c = this;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.gzs
            public final Object invoke() {
                int i4 = i3;
                ClipFeedListFragment clipFeedListFragment = this.c;
                switch (i4) {
                    case 0:
                        int i5 = ClipFeedListFragment.a2;
                        return Integer.valueOf(clipFeedListFragment.requireArguments().getInt("ClipFeedListFragment.bottom_nav_height"));
                    default:
                        int i6 = ClipFeedListFragment.a2;
                        Context requireContext = clipFeedListFragment.requireContext();
                        return new u7e((p7e) clipFeedListFragment.W1.getValue(), (q7e) clipFeedListFragment.X1.getValue(), clipFeedListFragment.D, requireContext);
                }
            }
        });
        this.p0 = new bpn0(new v6(this, 13));
        this.q0 = new bpn0(new y6(this, 15));
        this.r0 = new bpn0(new rj1(this, 18));
        this.s0 = msy.a(lazyThreadSafetyMode, new no(this, 19));
        this.t0 = msy.a(lazyThreadSafetyMode, new oo(this, 16));
        this.u0 = msy.a(lazyThreadSafetyMode, new wm1(this, 14));
        this.v0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.j(this, 18));
        this.w0 = new bpn0(new xm1(this, 19));
        this.x0 = new bpn0(new ka0(this, 19));
        this.y0 = new bpn0(new b3(this, 17));
        this.z0 = new bpn0(new f84(3));
        this.A0 = msy.a(lazyThreadSafetyMode, new ra0(this, 21));
        this.B0 = new bpn0(new sa0(this, 20));
        this.C0 = msy.a(lazyThreadSafetyMode, new wb1(2));
        this.D0 = new bpn0(new jg0(3));
        this.E0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.d(this, 16));
        this.F0 = new bpn0(new hg(this, 18));
        this.G0 = new bpn0(new com.vk.movika.sdk.base.logic.processor.actions.f(this, 18));
        this.H0 = new bpn0(new com.vk.movika.sdk.base.logic.processor.actions.g(this, 22));
        this.I0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.i(this, 13));
        this.J0 = msy.a(lazyThreadSafetyMode, new mg(5));
        this.K0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.h(this, 14));
        this.L0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.model.b(this, 18));
        this.M0 = new bpn0(new bb(this, 16));
        this.N0 = new bpn0(new cb(this, 14));
        this.O0 = new bpn0(new ey0(this, 14));
        this.P0 = msy.a(lazyThreadSafetyMode, new eb(this, 13));
        this.Q0 = new BroadcastReceiver() { // from class: com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment$receiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                c g2;
                wp50 myTargetFacade;
                wp50 myTargetFacade2;
                String action = intent != null ? intent.getAction() : null;
                if (action != null) {
                    int hashCode = action.hashCode();
                    ClipFeedListFragment clipFeedListFragment = ClipFeedListFragment.this;
                    if (hashCode == -266919404) {
                        if (action.equals("com.vkontakte.android.CLIPS_AD_REPORTED")) {
                            Bundle extras = intent.getExtras();
                            String string = extras != null ? extras.getString("adchoice_alias") : null;
                            if (string != null) {
                                int i4 = ClipFeedListFragment.a2;
                                s1d oo = clipFeedListFragment.oo();
                                if (oo != null && (myTargetFacade = oo.o.getMyTargetFacade()) != null) {
                                    myTargetFacade.f(new xp50.a(string));
                                }
                                iy0 ko = clipFeedListFragment.ko();
                                if (ko != null) {
                                    FeedItem.a aVar = ko.u;
                                    wp50 wp50Var = aVar != null ? aVar.i : null;
                                    if (wp50Var != null) {
                                        wp50Var.f(new xp50.a(string));
                                    }
                                }
                            }
                            Bundle extras2 = intent.getExtras();
                            SdkVideoFile sdkVideoFile = extras2 != null ? (SdkVideoFile) extras2.getParcelable("ad_video") : null;
                            if (sdkVideoFile != null) {
                                b bVar = clipFeedListFragment.r1;
                                gwc uo = clipFeedListFragment.uo();
                                uo.getClass();
                                g2 = hg1.g(a.l(new fwc(uo, sdkVideoFile, 0)), new ek(29));
                                hg1.e(bVar, g2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (hashCode == 314286503 && action.equals("com.vkontakte.android.CLIPS_MARKET_AD_REPORTED")) {
                        Bundle extras3 = intent.getExtras();
                        String string2 = extras3 != null ? extras3.getString("adchoice_alias") : null;
                        if (string2 != null) {
                            int i5 = ClipFeedListFragment.a2;
                            q8e Bo = clipFeedListFragment.Bo();
                            RecyclerView.e0 findViewHolderForAdapterPosition = Bo != null ? Bo.findViewHolderForAdapterPosition(clipFeedListFragment.to()) : null;
                            vp00 vp00Var = findViewHolderForAdapterPosition instanceof vp00 ? (vp00) findViewHolderForAdapterPosition : null;
                            if (vp00Var != null && (myTargetFacade2 = vp00Var.m.getMyTargetFacade()) != null) {
                                myTargetFacade2.f(new xp50.a(string2));
                            }
                            iy0 ko2 = clipFeedListFragment.ko();
                            if (ko2 != null) {
                                FeedItem.a aVar2 = ko2.u;
                                wp50 wp50Var2 = aVar2 != null ? aVar2.i : null;
                                if (wp50Var2 != null) {
                                    wp50Var2.f(new xp50.a(string2));
                                }
                            }
                        }
                        Bundle extras4 = intent.getExtras();
                        String string3 = extras4 != null ? extras4.getString("ad_unique_key") : null;
                        if (string3 != null) {
                            int i6 = ClipFeedListFragment.a2;
                            clipFeedListFragment.s5();
                            clipFeedListFragment.uo().d(string3);
                        }
                    }
                }
            }
        };
        this.R0 = msy.a(lazyThreadSafetyMode, new e4(this, 10));
        this.S0 = msy.a(lazyThreadSafetyMode, new il1(this, 14));
        this.T0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.model.props.d(12));
        this.U0 = new bpn0(new xsna.q(this, 14));
        this.V0 = new bpn0(new dxc(this, 1));
        this.W0 = new bpn0(new zg(this, 24));
        this.X0 = new bpn0(new ah(this, 19));
        this.Y0 = new bpn0(new jb(this));
        this.Z0 = new bpn0(new pu(this, 21));
        final int i4 = 1;
        this.a1 = new bpn0(new gzs(this) { // from class: xsna.fxc
            public final /* synthetic */ ClipFeedListFragment c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                int i42 = i4;
                ClipFeedListFragment clipFeedListFragment = this.c;
                switch (i42) {
                    case 0:
                        int i5 = ClipFeedListFragment.a2;
                        ClipsWrapperInputArguments.a aVar = ClipsWrapperInputArguments.r;
                        Bundle requireArguments = clipFeedListFragment.requireArguments();
                        aVar.getClass();
                        ClipFeedTab clipFeedTab = (ClipFeedTab) j5g.a0(ClipsWrapperInputArguments.a.c(requireArguments));
                        return clipFeedTab == null ? new ClipFeedTab.TopVideo(null, null, null, null, null, 31, null) : clipFeedTab;
                    default:
                        int i6 = ClipFeedListFragment.a2;
                        if (!((l8e) clipFeedListFragment.O0.getValue()).a().containsKey(Integer.valueOf(ClipFeedAdapter.ViewType.ADS_CONTROLS.ordinal()))) {
                            return rke.a;
                        }
                        clipFeedListFragment.qo().getClass();
                        return new qke();
                }
            }
        });
        this.b1 = new bpn0(new s4(this, 21));
        this.c1 = new ry0(this, 16);
        this.d1 = new bpn0(new in0(this, 17));
        this.e1 = new bpn0(new z4(this, 21));
        this.f1 = new bpn0(new defpackage.e(this, 17));
        this.g1 = new k();
        this.h1 = new bpn0(new defpackage.f(this, 10));
        this.i1 = new bpn0(new defpackage.g(this, 19));
        this.j1 = new bpn0(new vv0(8));
        final int i5 = 1;
        this.k1 = new bpn0(new gzs(this) { // from class: xsna.jxc
            public final /* synthetic */ ClipFeedListFragment c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                int i42 = i5;
                ClipFeedListFragment clipFeedListFragment = this.c;
                switch (i42) {
                    case 0:
                        int i52 = ClipFeedListFragment.a2;
                        return (SearchStatsLoggingInfo) clipFeedListFragment.requireArguments().getParcelable("search_stats_logging_info");
                    default:
                        int i6 = ClipFeedListFragment.a2;
                        return new ocd(new pxc(clipFeedListFragment, 0), clipFeedListFragment.po(), clipFeedListFragment.y1, clipFeedListFragment.w1, clipFeedListFragment.x1, !clipFeedListFragment.isResumed());
                }
            }
        });
        this.l1 = new bpn0(new kxc(this, 1));
        this.m1 = new bpn0(new defpackage.k(this, 12));
        this.n1 = new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.a(this, 16));
        this.o1 = new bpn0(new mxc(this, 1));
        this.p1 = new bpn0(new i70(this, 18));
        this.q1 = msy.a(lazyThreadSafetyMode, new j70(this, 18));
        this.r1 = new io.reactivex.rxjava3.disposables.b();
        this.s1 = new bpn0(new oxc(this, 1));
        this.t1 = new bpn0(new pxc(this, 1));
        final int i6 = 1;
        this.u1 = new bpn0(new gzs(this) { // from class: xsna.qxc
            public final /* synthetic */ ClipFeedListFragment c;

            {
                this.c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.gzs
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        int i42 = ClipFeedListFragment.a2;
                        return (ClipFeedScreenType) ClipFeedScreenType.h().get(this.c.requireArguments().getInt("ClipFeedListFragment.screen_type"));
                    default:
                        int i52 = ClipFeedListFragment.a2;
                        ClipFeedListFragment clipFeedListFragment = this.c;
                        return new gwc(clipFeedListFragment.getWindow(), (zfj0) clipFeedListFragment.s1.getValue(), clipFeedListFragment, clipFeedListFragment.Do().getFeedContainer(), new nme(clipFeedListFragment.Ka(), (ki0) clipFeedListFragment.k0.getValue()));
                }
            }
        });
        yux yuxVar = new yux();
        this.w1 = yuxVar;
        yux yuxVar2 = new yux();
        this.x1 = yuxVar2;
        final gxp0 gxp0Var = new gxp0();
        yuxVar.a(new yux.b() { // from class: xsna.fyc
            @Override // xsna.yux.b
            public final void a(boolean z) {
                int i7 = ClipFeedListFragment.a2;
                gxp0 gxp0Var2 = gxp0.this;
                gxp0Var2.e.setValue(gxp0Var2, gxp0.i[4], Boolean.valueOf(z));
            }
        });
        yuxVar2.a(new yux.b() { // from class: xsna.gyc
            @Override // xsna.yux.b
            public final void a(boolean z) {
                int i7 = ClipFeedListFragment.a2;
                gxp0 gxp0Var2 = gxp0.this;
                gxp0Var2.f.setValue(gxp0Var2, gxp0.i[5], Boolean.valueOf(z));
            }
        });
        this.y1 = gxp0Var;
        this.A1 = -1;
        this.C1 = new bpn0(new com.vk.movika.sdk.base.presenter.b(this, 12));
        this.D1 = new bpn0(new qc(this, 13));
        this.I1 = true;
        this.J1 = new bpn0(new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 19));
        this.K1 = new bpn0(new rxc(this, 1));
        int i7 = 1;
        this.L1 = msy.a(lazyThreadSafetyMode, new sxc(this, i7));
        this.M1 = new bpn0(new txc(this, i7));
        final int i8 = 1;
        this.O1 = msy.a(lazyThreadSafetyMode, new gzs(this) { // from class: xsna.uxc
            public final /* synthetic */ ClipFeedListFragment c;

            {
                this.c = this;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                int i32 = i8;
                ClipFeedListFragment clipFeedListFragment = this.c;
                switch (i32) {
                    case 0:
                        int i42 = ClipFeedListFragment.a2;
                        return (ClipsViewersSdkComponentImpl) m7m.d(clipFeedListFragment).a(fpf0.a(ClipsViewersSdkComponent.class));
                    default:
                        int i52 = ClipFeedListFragment.a2;
                        return (BridgeComponent) m7m.d(clipFeedListFragment).a(fpf0.a(BridgeComponent.class));
                }
            }
        });
        this.P1 = msy.a(lazyThreadSafetyMode, new vxc(this, i8));
        this.Q1 = msy.a(lazyThreadSafetyMode, new wxc(this, i8));
        this.R1 = msy.a(lazyThreadSafetyMode, new l1(this, 20));
        this.S1 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.g(this, 24));
        this.T1 = msy.a(lazyThreadSafetyMode, new m1(this, 18));
        this.V1 = msy.a(lazyThreadSafetyMode, new ld(this, 21));
        this.W1 = msy.a(lazyThreadSafetyMode, new h6(this, 17));
        this.X1 = msy.a(lazyThreadSafetyMode, new we0(this, 16));
        final int i9 = 1;
        this.Y1 = new bpn0(new gzs(this) { // from class: xsna.ayc
            public final /* synthetic */ ClipFeedListFragment c;

            {
                this.c = this;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.gzs
            public final Object invoke() {
                int i42 = i9;
                ClipFeedListFragment clipFeedListFragment = this.c;
                switch (i42) {
                    case 0:
                        int i52 = ClipFeedListFragment.a2;
                        return Integer.valueOf(clipFeedListFragment.requireArguments().getInt("ClipFeedListFragment.bottom_nav_height"));
                    default:
                        int i62 = ClipFeedListFragment.a2;
                        Context requireContext = clipFeedListFragment.requireContext();
                        return new u7e((p7e) clipFeedListFragment.W1.getValue(), (q7e) clipFeedListFragment.X1.getValue(), clipFeedListFragment.D, requireContext);
                }
            }
        });
        this.Z1 = new bpn0(new u40(this, 13));
    }

    public static cro0 io(ClipFeedListFragment clipFeedListFragment) {
        Context mo2getContext = super.mo2getContext();
        if (mo2getContext == null) {
            throw new IllegalStateException("Empty context!");
        }
        dhr0.a.getClass();
        return new cro0(mo2getContext, dhr0.u().c);
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    public static final void jo(final ClipFeedListFragment clipFeedListFragment, final int i2) {
        clipFeedListFragment.getClass();
        bpn0 bpn0Var = i0q0.a;
        Object b0 = j5g.b0(i2, clipFeedListFragment.po().getItems());
        final FeedItem feedItem = b0 instanceof FeedItem ? (FeedItem) b0 : null;
        if (feedItem == null) {
            return;
        }
        clipFeedListFragment.Do().getFeature().a(new qvq.h(feedItem.F()));
        if (!epx.f(clipFeedListFragment.B1, feedItem.F())) {
            clipFeedListFragment.B1 = feedItem.F();
            clipFeedListFragment.A1 = i2;
            final iwc vo = clipFeedListFragment.vo();
            clipFeedListFragment.go(new gzs() { // from class: xsna.cxc
                @Override // xsna.gzs
                public final Object invoke() {
                    iwc.this.i(i2, feedItem, clipFeedListFragment.y1.c().b);
                    return s3q0.a;
                }
            });
            ((hwc) clipFeedListFragment.s0.getValue()).d(feedItem);
            clipFeedListFragment.mo().a(feedItem);
            ((i8e) clipFeedListFragment.A0.getValue()).a(i2, feedItem);
            tle tleVar = (tle) clipFeedListFragment.B0.getValue();
            if (tleVar != null) {
                tleVar.a(feedItem);
            }
            kbs0 kbs0Var = (kbs0) clipFeedListFragment.X.getValue();
            feedItem.F();
            kbs0Var.getClass();
        }
        dzc dzcVar = (dzc) clipFeedListFragment.l1.getValue();
        clipFeedListFragment.Ka();
        dzcVar.c(feedItem);
    }

    public final ClipsScreenPerformanceReporter Ao() {
        return (ClipsScreenPerformanceReporter) this.M0.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.h3d
    @ozl
    public final void Bd(xcd xcdVar) {
        nlh0 so;
        FragmentActivity activity = getActivity();
        if (activity == null || (so = so()) == null) {
            return;
        }
        o2(new SdkClipViewerClick.u(so.k(), true));
        ((dym0) this.V1.getValue()).a(activity, so, wkh0.b.C3939b.a, null, new fb(xcdVar, 23));
    }

    public final q8e Bo() {
        return Do().getFeedContainer().getRecycler();
    }

    @Override // xsna.h3d
    public final void C5(SdkClipVideoFile sdkClipVideoFile) {
        uc(k15.A(sdkClipVideoFile));
    }

    @Override // xsna.wmf
    public final void Cb(VideoFile videoFile) {
        Oo(k15.B(videoFile));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final leh0 Co() {
        return (leh0) this.L0.getValue();
    }

    public final v7e Do() {
        return (v7e) this.Z1.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.h3d
    public final void Ef(Context context, String str) {
        maz.c(((qdz) this.S1.getValue()).e(), context, c.a() + str, new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108863), null, null, 24);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ai5
    public final y9t0 Eh(int i2) {
        SdkVideoFile k2;
        kih0 j2;
        FeedItem O0 = po().O0(i2);
        String str = null;
        FeedItem.d dVar = O0 instanceof FeedItem.d ? (FeedItem.d) O0 : null;
        yg5 R = (dVar == null || (j2 = dVar.j()) == null) ? null : d370.R(j2);
        String a3 = ((z5e) this.t0.getValue()).a();
        String a4 = lo().a();
        if (dVar != null && (k2 = dVar.k()) != null) {
            str = k2.r();
        }
        return new y9t0(R, new ni5(a3, a4, str, 8));
    }

    @Override // xsna.h3d
    public final void El() {
        iwc wo = wo();
        if (wo != null) {
            wo.a();
        }
    }

    public final zof Eo() {
        return (zof) this.J1.getValue();
    }

    public final boolean Fo() {
        return (Ka() instanceof ClipFeedTab.MusicTemplate) || (Ka() instanceof ClipFeedTab.CatalogClip.MusicTemplateCatalogClip);
    }

    @Override // xsna.h3d
    public final void Gm(SdkVideoFile sdkVideoFile, gzs<s3q0> gzsVar) {
        uo().e(sdkVideoFile, gzsVar);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean Go(FeedItem feedItem) {
        if (!(feedItem instanceof FeedItem.l)) {
            return (feedItem instanceof FeedItem.j) || (feedItem instanceof FeedItem.m);
        }
        FeedItem.l lVar = (FeedItem.l) feedItem;
        return dgd.c(lVar.k()) || ((s16) this.J0.getValue()).a(lVar.F());
    }

    @Override // xsna.h3d
    public final io.reactivex.rxjava3.core.a Hl(SdkVideoFile sdkVideoFile) {
        return uo().i(sdkVideoFile, new pd(this, 24));
    }

    public final void Ho(m0f.a<FeedItem> aVar, boolean z) {
        FeedItem a3 = aVar.a();
        int b2 = aVar.b();
        if (a3 instanceof FeedItem.f) {
            q8e Bo = Bo();
            RecyclerView.e0 findViewHolderForAdapterPosition = Bo != null ? Bo.findViewHolderForAdapterPosition(b2) : null;
            s1d s1dVar = findViewHolderForAdapterPosition instanceof s1d ? (s1d) findViewHolderForAdapterPosition : null;
            if (s1dVar != null) {
                s1dVar.j6(z);
                return;
            }
            return;
        }
        if (a3 instanceof FeedItem.a) {
            RecyclerView.e0 findViewHolderForAdapterPosition2 = Bo().findViewHolderForAdapterPosition(b2);
            iy0 iy0Var = findViewHolderForAdapterPosition2 instanceof iy0 ? (iy0) findViewHolderForAdapterPosition2 : null;
            if (iy0Var != null) {
                iy0Var.i6(z);
                return;
            }
            return;
        }
        if (a3 instanceof FeedItem.m) {
            q8e Bo2 = Bo();
            RecyclerView.e0 findViewHolderForAdapterPosition3 = Bo2 != null ? Bo2.findViewHolderForAdapterPosition(b2) : null;
            tvk0 tvk0Var = findViewHolderForAdapterPosition3 instanceof tvk0 ? (tvk0) findViewHolderForAdapterPosition3 : null;
            if (tvk0Var != null) {
                tvk0Var.h6(z);
                return;
            }
            return;
        }
        if (a3 instanceof FeedItem.j) {
            q8e Bo3 = Bo();
            RecyclerView.e0 findViewHolderForAdapterPosition4 = Bo3 != null ? Bo3.findViewHolderForAdapterPosition(b2) : null;
            vp00 vp00Var = findViewHolderForAdapterPosition4 instanceof vp00 ? (vp00) findViewHolderForAdapterPosition4 : null;
            if (vp00Var != null) {
                vp00Var.h6(z);
                return;
            }
            return;
        }
        if (a3 instanceof FeedItem.h) {
            q8e Bo4 = Bo();
            RecyclerView.e0 findViewHolderForAdapterPosition5 = Bo4 != null ? Bo4.findViewHolderForAdapterPosition(b2) : null;
            efj0 efj0Var = findViewHolderForAdapterPosition5 instanceof efj0 ? (efj0) findViewHolderForAdapterPosition5 : null;
            if (efj0Var != null) {
                efj0Var.h6(z);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.h3d
    public final void Ih() {
        SdkVideoFile k2;
        VideoFile A;
        nlh0 so = so();
        if (so == null || (k2 = so.k()) == null || (A = k15.A(k2)) == null) {
            return;
        }
        if (((b25) this.Q1.getValue()).b()) {
            w1s0.k(xa4.M(this), A, dhr0.a.c(mo2getContext()));
        } else {
            g2v.c().getClass();
            m0v0.a.c(requireContext(), fss0.a(A));
        }
    }

    public final void Io(nlh0 nlh0Var, String str, ReplyInfo replyInfo) {
        FragmentImpl fragmentImpl;
        mbs mbsVar;
        yks0 w;
        boolean y = Eo().y();
        boolean z = nlh0Var != null && qo().Y().a(nlh0Var.k());
        if (nlh0Var == null || (w = tci.w(nlh0Var)) == null) {
            fragmentImpl = null;
        } else {
            fragmentImpl = yks0.h(w, requireContext(), this, replyInfo, str, Boolean.FALSE, null, !y || z, 5712);
        }
        if (fragmentImpl == null || (mbsVar = fragmentImpl.D) == null) {
            return;
        }
        mbsVar.a(new jyc(fragmentImpl));
    }

    public final void Jo(boolean z) {
        tke r = Eo().r();
        if (!r.b() || r.a()) {
            this.I1 = z;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.d9e
    public final ClipFeedTab Ka() {
        return (ClipFeedTab) this.l0.getValue();
    }

    public final void Ko(m0f.a<FeedItem> aVar) {
        bpn0 bpn0Var = i0q0.a;
        FeedItem a3 = aVar.a();
        if (Eo().R()) {
            this.y1.e(a3.W3());
        }
        ((w8l) this.p1.getValue()).getClass();
        mo().b(aVar.a());
        Ho(aVar, true);
        L l2 = L.a;
        l2.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l2, L.LogType.d, new Object[]{"Item view focused = " + a3.F()});
    }

    public final void Lo(m0f.a<FeedItem> aVar) {
        bpn0 bpn0Var = i0q0.a;
        FeedItem a3 = aVar.a();
        if (Eo().R()) {
            this.y1.e(false);
        }
        ((w8l) this.p1.getValue()).getClass();
        mo().c(a3);
        Ho(aVar, false);
        L l2 = L.a;
        l2.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l2, L.LogType.d, new Object[]{"Item view unfocused = " + a3.F()});
    }

    @Override // xsna.roc
    public final void M7() {
        this.y1.f(true);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    public final void Mo(Context context, SdkVideoFile sdkVideoFile) {
        StoryMusicInfo storyMusicInfo;
        MusicTrack Nb;
        SdkClipVideoFile sdkClipVideoFile = sdkVideoFile instanceof SdkClipVideoFile ? (SdkClipVideoFile) sdkVideoFile : null;
        if (sdkClipVideoFile == null) {
            return;
        }
        ClipVideoFile z = k15.z(sdkClipVideoFile);
        TrendingHashtag trendingHashtag = (TrendingHashtag) j5g.a0(z.R0());
        SdkMusicTrack V = sdkClipVideoFile.V();
        if (V == null || !V.d() || (Nb = z.Nb()) == null) {
            storyMusicInfo = null;
        } else {
            String str = Nb.i;
            if (str == null) {
                str = "";
            }
            int i2 = 0;
            storyMusicInfo = new StoryMusicInfo(Nb, str, i2, Nb.Eb(), 0, null, false, i2, false, false, null, false, false, 8032, null);
        }
        ((ezc) this.C0.getValue()).getClass();
        ezc.a(z);
        ((ClipsEntryPointsComponent) this.g0.getValue()).e().a(context, new ClipsEntryPointsParams(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_VIEWER, storyMusicInfo, trendingHashtag != null ? trendingHashtag.zb() : null, false, false, null, false, null, 248, null));
    }

    public final void No(boolean z) {
        ClipsWrapperFragment.i iVar;
        ClipSeekBarController clipSeekBarController;
        ClipSeekBarView view;
        gjz zo = zo();
        if (zo != null) {
            zo.a(z);
        } else {
            if (z || (iVar = this.F1) == null || (clipSeekBarController = (ClipSeekBarController) iVar.invoke()) == null || (view = clipSeekBarController.getView()) == null) {
                return;
            }
            f4m.j(view);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void Oo(SdkVideoFile sdkVideoFile) {
        UserId b2;
        if (getActivity() == null || (b2 = dgd.b(sdkVideoFile)) == null) {
            return;
        }
        o2(new SdkClipViewerClick.b(sdkVideoFile, false));
        ((o0r0) this.P1.getValue()).m(requireContext(), b2, new o0r0.a(false, null, null, null, null, null, null, false, false, true, false, null, null, null, 64511));
    }

    public final void Po(int i2) {
        q8e Bo = Bo();
        if (Bo == null) {
            Bo = null;
        }
        if (Bo == null || Bo.a() || Bo.getScrollState() != 0) {
            return;
        }
        Bo.scrollToPosition(i2);
        if (!Bo.isLaidOut() || Bo.isLayoutRequested()) {
            Bo.addOnLayoutChangeListener(new n(i2));
            return;
        }
        jo(this, i2);
        if (Eo().G()) {
            return;
        }
        ((q0f) this.j1.getValue()).e(i2);
    }

    @Override // xsna.h3d
    public final void Qe(String str) {
        vo().c(str);
    }

    public final void Qo(boolean z) {
        ClipSeekBarController clipSeekBarController;
        yg5 j2;
        ClipsWrapperFragment.i iVar = this.F1;
        if (iVar == null || (clipSeekBarController = (ClipSeekBarController) iVar.invoke()) == null || clipSeekBarController.j() == ClipSeekBarController.SeekBarVisibilityPermission.DISABLED_TOGGLE || (j2 = j()) == null || j2.B()) {
            return;
        }
        ClipSeekBarView view = clipSeekBarController.getView();
        if (z) {
            if (view.getVisibility() == 0) {
                return;
            }
            d3m.c(view, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            if (view.getVisibility() == 0) {
                d3m.e(view, (r15 & 1) != 0 ? 300L : 50L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            }
        }
    }

    @Override // xsna.h3d
    public final void S9(SdkVideoFile sdkVideoFile) {
        uo().g(sdkVideoFile);
    }

    @Override // xsna.pih0
    public final void Ub(int i2, long j2) {
        no().x().h().getClass();
    }

    @Override // xsna.h3d
    public final zyc Ue(SdkVideoFile sdkVideoFile, ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType) {
        return ((dzc) this.l1.getValue()).a(sdkVideoFile, clipFeedTooltip$ClipFeedTooltipType);
    }

    @Override // xsna.h3d
    public final void X6(SdkVideoFile sdkVideoFile, ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType, hjj0 hjj0Var) {
        ((dzc) this.l1.getValue()).d(sdkVideoFile, clipFeedTooltip$ClipFeedTooltipType, hjj0Var);
    }

    @Override // xsna.h3d
    public final void Z4(SdkClipVideoFile sdkClipVideoFile) {
        SdkOwner s = sdkClipVideoFile.s();
        UserId d2 = s != null ? s.d() : null;
        if (d2 != null) {
            fxc0.B().Y().q(mo2getContext(), d2, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS, new he3(9, this, sdkClipVideoFile));
        } else {
            Oo(sdkClipVideoFile);
        }
    }

    @Override // xsna.h3d
    public final void ah(SdkVideoFile sdkVideoFile) {
        uo().f(sdkVideoFile);
    }

    @Override // xsna.pih0
    public final void ai(ClipViewerAnalyticsEvent clipViewerAnalyticsEvent) {
        mo().d(clipViewerAnalyticsEvent);
    }

    @Override // xsna.h3d
    public final void g9(Integer num, Integer num2, g3d g3dVar) {
        if (g3dVar != null) {
            if (num != null) {
                o2(new SdkClipViewerClick.i(num.intValue(), g3dVar.a()));
            }
        } else {
            if (g3dVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            nlh0 so = so();
            if (so == null) {
                return;
            } else {
                o2(new SdkClipViewerClick.c(so.k()));
            }
        }
        Io(so(), mo2getContext().getString(R.string.comments), num != null ? new ReplyInfo(num.intValue(), num2) : null);
    }

    @Override // xsna.dkf0
    public final int getAdapterOffset() {
        return 0;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        return (cro0) this.M1.getValue();
    }

    @Override // xsna.dkf0
    public final int getItemCount() {
        return po().getItemCount();
    }

    @Override // xsna.dkf0
    public final RecyclerView getRecyclerView() {
        return Bo();
    }

    @Override // xsna.ai5
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return null;
    }

    @Override // xsna.h3d
    public final Window getWindow() {
        return vo().getWindow();
    }

    @Override // xsna.h3d
    public final void gh(String str) {
        Do().getFeature().a(new qvq.p(str));
    }

    @Override // xsna.tid
    public final yg5 j() {
        kih0 j2;
        kih0 j3;
        yg5 autoPlay;
        RecyclerView.e0 findViewHolderForAdapterPosition;
        View view;
        q8e Bo = Bo();
        twc twcVar = (Bo == null || (findViewHolderForAdapterPosition = Bo.findViewHolderForAdapterPosition(to())) == null || (view = findViewHolderForAdapterPosition.itemView) == null) ? null : (twc) view.findViewById(R.id.clip_feed_item_view);
        if (twcVar == null) {
            twcVar = null;
        }
        if (twcVar != null && (autoPlay = twcVar.getAutoPlay()) != null) {
            return autoPlay;
        }
        s1d oo = oo();
        if (oo != null && (j3 = oo.j()) != null) {
            return d370.R(j3);
        }
        iy0 ko = ko();
        if (ko == null || (j2 = ko.j()) == null) {
            return null;
        }
        return d370.R(j2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pih0
    public final ki0 kd() {
        return (ki0) this.k0.getValue();
    }

    public final iy0 ko() {
        q8e Bo = Bo();
        RecyclerView.e0 findViewHolderForAdapterPosition = Bo != null ? Bo.findViewHolderForAdapterPosition(to()) : null;
        if (findViewHolderForAdapterPosition instanceof iy0) {
            return (iy0) findViewHolderForAdapterPosition;
        }
        return null;
    }

    @Override // xsna.pih0
    public final sih0 l8(SdkVideoFile sdkVideoFile) {
        uyc uycVar = (uyc) this.F0.getValue();
        if (uycVar != null) {
            return uycVar.a(k15.A(sdkVideoFile));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final y5e lo() {
        return (y5e) this.u0.getValue();
    }

    @Override // xsna.nyc
    public final void m3(int i2, gzs<s3q0> gzsVar) {
        q8e Bo = Bo();
        if (Bo == null) {
            Bo = null;
        }
        if (Bo == null || Bo.a() || Bo.getScrollState() != 0) {
            return;
        }
        Bo.setTouchEnabled(false);
        if (Eo().G()) {
            Bo.smoothScrollToPosition(i2);
        } else {
            ((q0f) this.j1.getValue()).f(i2);
        }
        Bo.addOnScrollListener(new o(Bo, gzsVar));
    }

    public final svc mo() {
        return (svc) this.w0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final BridgeComponent no() {
        return (BridgeComponent) this.O1.getValue();
    }

    @Override // xsna.pih0
    public final void o2(SdkClipViewerClick sdkClipViewerClick) {
        ((bwc) this.G0.getValue()).o2(sdkClipViewerClick);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.h3d
    public final void o4(int i2, final SdkClipVideoFile sdkClipVideoFile) {
        iwc wo = wo();
        if (wo != null) {
            Pair l2 = fto0.l(this, wo.getWindow());
            final Context context = (Context) l2.d();
            Window window = (Window) l2.g();
            final boolean z = sdkClipVideoFile != null;
            int i3 = z ? R.string.clips_feed_promo_snackbar_button : R.string.clips_disabled_menu_button;
            ikv0.a aVar = new ikv0.a(context);
            aVar.i(new ikv0.d(new ikv0.d.c(context.getString(i2)), (ikv0.d.b) null, (ikv0.d.a) (0 == true ? 1 : 0), 6));
            aVar.j(new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(i3), new izs() { // from class: xsna.eyc
                /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    boolean z2 = z;
                    SdkVideoFile sdkVideoFile = sdkClipVideoFile;
                    ClipFeedListFragment clipFeedListFragment = this;
                    Context context2 = context;
                    int i4 = ClipFeedListFragment.a2;
                    ((ikv0) obj).a();
                    if (z2 && sdkVideoFile != null) {
                        maz e2 = ((qdz) clipFeedListFragment.S1.getValue()).e();
                        StringBuilder sb = new StringBuilder();
                        sb.append("https://" + a0a.d + "/app6363684#?act=clip&clip_id=");
                        sb.append(sdkVideoFile.a1());
                        maz.c(e2, context2, sb.toString(), LaunchContext.A, null, null, 24);
                    }
                    return s3q0.a;
                }
            }));
            aVar.k(1500L);
            aVar.f();
            aVar.p(window);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        s1d oo;
        super.onActivityResult(i2, i3, intent);
        if (intent == null) {
            return;
        }
        ?? r1 = this.s0;
        if (i2 != 5551 || i3 != -1) {
            if (i2 == 5552 && i3 == -1 && intent.getBooleanExtra("VideoFileController_commented", false) && (oo = oo()) != null) {
                FeedItem yo = yo(to());
                if (yo != null) {
                    ((hwc) r1.getValue()).c(yo);
                }
                oo.i6();
                return;
            }
            return;
        }
        ArrayList r = ((kbj0) this.T1.getValue()).r();
        if (r.isEmpty()) {
            return;
        }
        Iterator it = r.iterator();
        while (it.hasNext()) {
            if (intent.getBooleanExtra((String) it.next(), false)) {
                s1d oo2 = oo();
                if (oo2 != null) {
                    FeedItem yo2 = yo(to());
                    if (yo2 != null) {
                        ((hwc) r1.getValue()).e(yo2);
                    }
                    oo2.l6();
                    return;
                }
                return;
            }
        }
    }

    @Override // xsna.d9e
    public final boolean onBack() {
        gjz zo = zo();
        return zo != null && zo.a0();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dkm.a((dkm) this.e1.getValue());
        if (Ka() instanceof ClipFeedTab.TopVideo) {
            ((ClipsInterestsComponent) this.Y.getValue()).Re().b((q) this.X0.getValue());
        }
        if (Fo()) {
            hg1.e(this.r1, hg1.h(((d9f) this.c0.getValue()).d(TemplatesFlowScreen.PREVIEW).a0(asu0.a.d()), new com.vk.movika.sdk.base.observable.a(this, 27)));
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.CLIPS_AD_REPORTED");
        intentFilter.addAction("com.vkontakte.android.CLIPS_MARKET_AD_REPORTED");
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        anj.d(context, this.Q0, intentFilter, null, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [xsna.hyc] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.Z1.isInitialized()) {
            tv4.b("clips feed view is initialized before onCreateView called", com.vk.metrics.eventtracking.b.a);
        }
        final s7e b2 = Do().b();
        this.z1 = b2;
        ?? r12 = new gxp0.a() { // from class: xsna.hyc
            @Override // xsna.gxp0.a
            public final void X2(ixp0 ixp0Var) {
                ww50<?> Y;
                int i2 = ClipFeedListFragment.a2;
                ComponentCallbacks2 h2 = e3m.h(SwipeRefreshLayout.this.getContext());
                ey50 ey50Var = h2 instanceof ey50 ? (ey50) h2 : null;
                if (ey50Var != null && (Y = ey50Var.Y()) != null) {
                    Y.l(!ixp0Var.b);
                }
                ClipFeedListFragment clipFeedListFragment = this;
                clipFeedListFragment.vo().f(!ixp0Var.d);
                clipFeedListFragment.Eo().e().getClass();
                clipFeedListFragment.Eo().e().getClass();
                q8e Bo = clipFeedListFragment.Bo();
                if (Bo != null) {
                    Bo.requestDisallowInterceptTouchEvent(ixp0Var.f);
                }
            }
        };
        Lifecycle lifecycle = getLifecycle();
        gxp0 gxp0Var = this.y1;
        gxp0Var.a(r12, lifecycle);
        ClipFeedAdapter po = po();
        b9e b9eVar = this.E1;
        bpn0 bpn0Var = this.D1;
        if (b9eVar != null) {
            ((w5e) bpn0Var.getValue()).b(b9eVar);
        }
        if (po != null) {
            ((w5e) bpn0Var.getValue()).a(po);
        } else {
            po = null;
        }
        this.E1 = po;
        q8e Bo = Bo();
        boolean z = Ka() instanceof ClipFeedTab.TopVideo;
        w21 a3 = w21.a.a(Ka(), Bo);
        if (a3 != null) {
            a3.b(new dxc(this, 0));
            a3.a(new com.vk.movika.sdk.base.observable.c(this, 23));
        }
        Bo.addOnScrollListener((xe90) this.U0.getValue());
        Co().e(Bo, (LinearLayoutManager) Bo.getLayoutManager(), po());
        int i2 = 5;
        if (Eo().G()) {
            ((m6e) this.i1.getValue()).a(new gxc(this, Bo, z));
        } else {
            exc excVar = new exc(this, Bo, z);
            w380 w380Var = new w380(Bo);
            w380Var.l(new ah(excVar, 18));
            po().registerAdapterDataObserver(w380Var);
            uif0.a(new m4(excVar, 16), Bo);
            this.U1 = w380Var;
            bpn0 bpn0Var2 = this.j1;
            ((q0f) bpn0Var2.getValue()).c((izs) this.k1.getValue());
            ((q0f) bpn0Var2.getValue()).c(new zf1(i2, this, Bo));
            Bo.addOnScrollListener((l0f) this.f1.getValue());
            Bo.addOnScrollListener(xo());
        }
        if (z) {
            Bo.addOnScrollListener((rie) this.a0.getValue());
        }
        if (fzc.a(Ka())) {
            Bo.addOnScrollListener((l) this.V0.getValue());
        }
        Bo.addOnScrollListener((p) this.W0.getValue());
        ow90 ow90Var = ow90.a;
        ((efs) ow90.n.getValue()).a(vo().getWindow(), this.D, ScrollScreenType.CLIPS_FEED, 15000L);
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        Bo().addOnItemTouchListener(new m(ref$BooleanRef));
        b2.setOnChildScrollUpCallback(new iyc(ref$BooleanRef, this));
        if (Fo()) {
            xle xleVar = new xle(requireContext());
            xleVar.e();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            f4m.v(cn70.b(20), xleVar);
            layoutParams.gravity = 80;
            xleVar.setLayoutParams(layoutParams);
            ule uleVar = new ule(xleVar, qo().If(), Ka(), new nw6(this, 4));
            uleVar.a(Bo());
            this.S = uleVar;
            Do().getFeedContainer().b().addView(xleVar);
        } else if ((Ka() instanceof ClipFeedTab.CatalogClip.TrendingHashtagCatalogClip) || (Ka() instanceof ClipFeedTab.CatalogClip.TrendingMusicCatalogClip)) {
            q8e Bo2 = Bo();
            xle xleVar2 = new xle(requireContext());
            xleVar2.e();
            xleVar2.setSelectButtonText(Bo2.getContext().getString(R.string.clip_grid_record_clip_with_trend));
            xleVar2.setType(zqj.b.a);
            xleVar2.setHashtagListener(new s53(7, this, Bo2));
            ((saf) this.E0.getValue()).b();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            f4m.v(cn70.b(20), xleVar2);
            layoutParams2.gravity = 80;
            xleVar2.setLayoutParams(layoutParams2);
            ule uleVar2 = new ule(xleVar2, qo().If(), Ka(), new x7c(1));
            uleVar2.a(Bo2);
            this.S = uleVar2;
            xleVar2.setOnSelectClickListener(new bv1(i2, this, Bo2));
            Do().getFeedContainer().b().addView(xleVar2);
        }
        Eo().e().getClass();
        this.N1 = new u4f(Do().getFeedContainer().b(), gxp0Var);
        gxp0Var.b(new gxp0.a() { // from class: xsna.bxc
            @Override // xsna.gxp0.a
            public final void X2(ixp0 ixp0Var) {
                bpn0 bpn0Var3 = ClipFeedListFragment.this.C1;
                int i3 = ClipFeedListFragment.a2;
                if (ixp0Var.b) {
                    ((soc) bpn0Var3.getValue()).M7();
                } else {
                    ((soc) bpn0Var3.getValue()).p5();
                }
            }
        });
        ((soc) this.C1.getValue()).a(this);
        tke r = Eo().r();
        if (r.b()) {
            this.I1 = r.c();
        }
        qo().Gf().a();
        LayoutInflater.Factory activity = getActivity();
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.Li(this);
        }
        return b2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        xqd xqdVar = (xqd) this.I0.getValue();
        if (xqdVar != null) {
            xqdVar.stop();
        }
        if (!Eo().G()) {
            Co().onDestroy();
        }
        ((ClipsInterestsComponent) this.Y.getValue()).Re().a((q) this.X0.getValue());
        ((dkm) this.e1.getValue()).c();
        b9e b9eVar = this.E1;
        if (b9eVar != null) {
            ((w5e) this.D1.getValue()).b(b9eVar);
        }
        this.E1 = null;
        Context context = e43.a;
        enj.s(context != null ? context : null, this.Q0);
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ule uleVar;
        q8e Bo;
        super.onDestroyView();
        u4f u4fVar = this.N1;
        if (u4fVar != null) {
            u4fVar.c();
        }
        this.N1 = null;
        Co().onDestroyView();
        this.r1.dispose();
        if (fzc.a(Ka()) && (Bo = Bo()) != null) {
            for (Object obj : awt0.d(Bo)) {
                piz pizVar = obj instanceof piz ? (piz) obj : null;
                if (pizVar != null) {
                    pizVar.release();
                }
            }
        }
        q8e Bo2 = Bo();
        if (Bo2 != null && (uleVar = this.S) != null) {
            uleVar.b(Bo2);
        }
        this.S = null;
        w380 w380Var = this.U1;
        if (w380Var != null) {
            po().unregisterAdapterDataObserver(w380Var);
        }
        w380 w380Var2 = this.U1;
        if (w380Var2 != null) {
            w380Var2.k();
        }
        this.U1 = null;
        jgd k0 = ((pkd) this.R1.getValue()).k0();
        k0.getClass();
        ((soc) this.C1.getValue()).b(this);
        if (Fo()) {
            ((d9f) this.c0.getValue()).a(TemplatesFlowScreen.PREVIEW);
        }
        this.v1 = null;
        LayoutInflater.Factory activity = getActivity();
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.yk(this);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        Ao().j();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onMultiWindowModeChanged(boolean z) {
        this.y1.g(z);
        super.onMultiWindowModeChanged(z);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.d, new Object[]{"ClipFeedListFragment#onPause"});
        }
        if (Eo().G()) {
            ((o6e) this.d1.getValue()).a();
        } else {
            Co().a();
            xo().n();
            ((ocd) this.k1.getValue()).c();
        }
        this.y1.f(false);
        uo().h();
        Ao().j();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.d, new Object[]{"ClipFeedListFragment#onResume"});
        }
        Ao().o();
        if (!vo().d(this) || vo().b()) {
            return;
        }
        if (Eo().G()) {
            ((o6e) this.d1.getValue()).b();
            return;
        }
        Co().d();
        xo().o();
        ((ocd) this.k1.getValue()).d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((jof) this.P0.getValue()).b(nfd.a.a);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            Ao().n(view);
        }
        SwipeRefreshLayout swipeRefreshLayout = this.z1;
        if (swipeRefreshLayout != null) {
            awt0.t(swipeRefreshLayout, new eu1(this, 15));
        }
        vo().k(this);
        jgd k0 = ((pkd) this.R1.getValue()).k0();
        k0.getClass();
        this.y1.g(kn().isInMultiWindowMode());
    }

    public final s1d oo() {
        q8e Bo = Bo();
        RecyclerView.e0 findViewHolderForAdapterPosition = Bo != null ? Bo.findViewHolderForAdapterPosition(to()) : null;
        if (findViewHolderForAdapterPosition instanceof s1d) {
            return (s1d) findViewHolderForAdapterPosition;
        }
        return null;
    }

    @Override // xsna.roc
    public final void p5() {
        this.y1.f(false);
    }

    @Override // xsna.h3d
    public final void pj(SdkClipVideoFile sdkClipVideoFile) {
        ClipVideoFile z = k15.z(sdkClipVideoFile);
        o2(new SdkClipViewerClick.j(sdkClipVideoFile));
        pdv0.a a3 = no().C1().a(z);
        a3.C();
        a3.B(z.r());
        a3.H();
        a3.G(ModalPostDestination.REACTIONS_ALL.ordinal());
        a3.f().Td(getChildFragmentManager(), "ClipsReactionsModal" + z.r1());
    }

    public final ClipFeedAdapter po() {
        return Do().getFeedContainer().getAdapter();
    }

    public final ClipsViewerComponentImpl qo() {
        return (ClipsViewerComponentImpl) this.U.getValue();
    }

    public final List<FeedItem> ro() {
        return Do().getFeedContainer().getCurrentItems();
    }

    @Override // xsna.qhh0
    public final boolean s() {
        if (to() == 0) {
            Do().a();
            return true;
        }
        Po(0);
        return true;
    }

    @Override // xsna.h3d
    public final void s5() {
        RecyclerView.e0 findViewHolderForAdapterPosition;
        q8e Bo = Bo();
        if (Bo == null || (findViewHolderForAdapterPosition = Bo.findViewHolderForAdapterPosition(to())) == null) {
            return;
        }
        m3(findViewHolderForAdapterPosition.getAbsoluteAdapterPosition() + 1, new o0(7));
    }

    public final nlh0 so() {
        FeedItem yo = yo(to());
        FeedItem.d dVar = yo instanceof FeedItem.d ? (FeedItem.d) yo : null;
        if (dVar != null) {
            return dVar.W();
        }
        return null;
    }

    public final int to() {
        q8e Bo = Bo();
        RecyclerView.o layoutManager = Bo != null ? Bo.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            Integer valueOf = Integer.valueOf(linearLayoutManager.s());
            Integer num = valueOf.intValue() != -1 ? valueOf : null;
            if (num != null) {
                return num.intValue();
            }
        }
        return this.A1;
    }

    @Override // xsna.wmf
    public final void uc(VideoFile videoFile) {
        ((axc) this.t1.getValue()).e(videoFile);
    }

    public final gwc uo() {
        return (gwc) this.u1.getValue();
    }

    public final iwc vo() {
        iwc iwcVar = this.v1;
        if (iwcVar != null) {
            return iwcVar;
        }
        iwc wo = wo();
        this.v1 = wo;
        if (wo == null) {
            Lifecycle.State currentState = getView() != null ? getViewLifecycleOwner().getLifecycle().getCurrentState() : null;
            com.vk.metrics.eventtracking.b.a.a(new NullPointerException("Trying to access feedHost, but it is null. Fragment ls: " + getLifecycle().getCurrentState() + "; View ls: " + currentState));
        }
        return wo;
    }

    public final iwc wo() {
        iwc ec;
        z1h0 parentFragment = getParentFragment();
        jwc jwcVar = parentFragment instanceof jwc ? (jwc) parentFragment : null;
        if (jwcVar != null && (ec = jwcVar.ec()) != null) {
            return ec;
        }
        z1h0 parentFragment2 = getParentFragment();
        if (parentFragment2 instanceof iwc) {
            return (iwc) parentFragment2;
        }
        return null;
    }

    public final m0f<FeedItem> xo() {
        return (m0f) this.h1.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        if (Fo()) {
            tle tleVar = (tle) this.B0.getValue();
            if (tleVar != null) {
                tleVar.b(uiTrackingScreen);
                return;
            }
            return;
        }
        if (!(Ka() instanceof ClipFeedTab.CatalogClip.TrendingHashtagCatalogClip) && !(Ka() instanceof ClipFeedTab.CatalogClip.TrendingMusicCatalogClip)) {
            mo().e(uiTrackingScreen);
        } else {
            ((ezc) this.C0.getValue()).getClass();
            ezc.b(uiTrackingScreen);
        }
    }

    @Override // xsna.h3d
    public final void ye(int i2) {
        m3(i2, new o0(7));
    }

    public final FeedItem yo(int i2) {
        Object b0 = j5g.b0(i2, po().getItems());
        if (b0 instanceof FeedItem) {
            return (FeedItem) b0;
        }
        return null;
    }

    public final gjz zo() {
        RecyclerView.e0 findViewHolderForAdapterPosition;
        View view;
        q8e Bo = Bo();
        gjz gjzVar = (Bo == null || (findViewHolderForAdapterPosition = Bo.findViewHolderForAdapterPosition(to())) == null || (view = findViewHolderForAdapterPosition.itemView) == null) ? null : (gjz) view.findViewById(R.id.live_item_view);
        if (gjzVar != null) {
            return gjzVar;
        }
        return null;
    }

    @Override // xsna.wmf
    public final ClipFeedListFragment Me() {
        return this;
    }

    /* compiled from: ClipFeedListFragment.kt */
    /* loaded from: classes17.dex */
    public static final class m implements RecyclerView.s {
        public final /* synthetic */ Ref$BooleanRef b;

        public m(Ref$BooleanRef ref$BooleanRef) {
            this.b = ref$BooleanRef;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void h(boolean z) {
            this.b.element = z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void f(RecyclerView recyclerView, MotionEvent motionEvent) {
        }
    }
}
