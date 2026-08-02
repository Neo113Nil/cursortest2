package com.vk.newsfeed.impl.newsfeed_post.presentation.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.LruCache;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.common.links.LinksParserData;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.NewsfeedData;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.impl.fragments.BaseCommentsFragment;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.presenters.PostCommentsPresenter$receiver$1;
import com.vk.newsfeed.impl.stats.PostViewFragmentTimeSpentTracker;
import com.vk.newsfeed.impl.util.NewsEntryWatcherMode;
import com.vk.sharing.api.dto.Target;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.chromium.base.version_info.VersionConstants;
import xsna.a1c0;
import xsna.a920;
import xsna.aa;
import xsna.ad0;
import xsna.ai5;
import xsna.ain0;
import xsna.akf0;
import xsna.anj;
import xsna.asu0;
import xsna.azt;
import xsna.b1c0;
import xsna.b2c0;
import xsna.b3c0;
import xsna.b9c0;
import xsna.bi5;
import xsna.bin0;
import xsna.bo8;
import xsna.bpn0;
import xsna.brm0;
import xsna.bw60;
import xsna.bwt0;
import xsna.c5r;
import xsna.c9c0;
import xsna.cbg;
import xsna.ce60;
import xsna.cr20;
import xsna.cuz;
import xsna.d2y;
import xsna.d9c0;
import xsna.dhr0;
import xsna.dl60;
import xsna.doq;
import xsna.dui;
import xsna.e3c0;
import xsna.e3m;
import xsna.e43;
import xsna.e7q0;
import xsna.ehv;
import xsna.ek40;
import xsna.epx;
import xsna.f0c0;
import xsna.f2l;
import xsna.fac0;
import xsna.fae;
import xsna.fh9;
import xsna.fj60;
import xsna.fnj;
import xsna.fo50;
import xsna.fpf0;
import xsna.fxc0;
import xsna.g3c0;
import xsna.g3f0;
import xsna.ga3;
import xsna.gbg0;
import xsna.gd60;
import xsna.gib0;
import xsna.gko;
import xsna.gqo;
import xsna.gzs;
import xsna.h12;
import xsna.h3c0;
import xsna.h3p0;
import xsna.h7m;
import xsna.hd60;
import xsna.hf8;
import xsna.his0;
import xsna.hj60;
import xsna.hl60;
import xsna.hm60;
import xsna.ho60;
import xsna.i3c0;
import xsna.i440;
import xsna.iag;
import xsna.iah0;
import xsna.ib6;
import xsna.ib60;
import xsna.ics0;
import xsna.id60;
import xsna.j2c0;
import xsna.j3c0;
import xsna.j6f0;
import xsna.jgg;
import xsna.jjc;
import xsna.kun;
import xsna.l2c0;
import xsna.l3c0;
import xsna.l500;
import xsna.l7s;
import xsna.l7v;
import xsna.lfg;
import xsna.lmc;
import xsna.m1y;
import xsna.m33;
import xsna.m3a;
import xsna.m3c0;
import xsna.m3g0;
import xsna.m3r;
import xsna.m6o0;
import xsna.m7m;
import xsna.m960;
import xsna.mo60;
import xsna.msy;
import xsna.mzp0;
import xsna.n0n;
import xsna.n2r;
import xsna.ni5;
import xsna.npu;
import xsna.nr60;
import xsna.nuv;
import xsna.o170;
import xsna.o3w;
import xsna.oc60;
import xsna.og5;
import xsna.ol60;
import xsna.oq;
import xsna.or60;
import xsna.ozl;
import xsna.p870;
import xsna.pds;
import xsna.pjb0;
import xsna.pla;
import xsna.pn60;
import xsna.pr0;
import xsna.puq0;
import xsna.qn60;
import xsna.qni0;
import xsna.r1c0;
import xsna.r2c0;
import xsna.rdg;
import xsna.rl60;
import xsna.rm60;
import xsna.rru;
import xsna.rzp0;
import xsna.s1c0;
import xsna.s1x;
import xsna.s2c0;
import xsna.s3q0;
import xsna.sm60;
import xsna.sr60;
import xsna.sy50;
import xsna.t210;
import xsna.t2c0;
import xsna.t4c0;
import xsna.t6g0;
import xsna.tc60;
import xsna.tfh0;
import xsna.tlo0;
import xsna.tzz;
import xsna.u1c0;
import xsna.u2b0;
import xsna.u3g0;
import xsna.ubw;
import xsna.udg;
import xsna.uz;
import xsna.v0n;
import xsna.v89;
import xsna.vdg;
import xsna.vtk0;
import xsna.wjs0;
import xsna.wmi0;
import xsna.wx20;
import xsna.x0n;
import xsna.xl60;
import xsna.xn60;
import xsna.xzb0;
import xsna.y0y0;
import xsna.y22;
import xsna.y3v;
import xsna.y8c0;
import xsna.y9t0;
import xsna.yif0;
import xsna.yka0;
import xsna.yl60;
import xsna.yrn;
import xsna.yu60;
import xsna.yw90;
import xsna.z0y0;
import xsna.z1c0;
import xsna.z2f0;
import xsna.z6n;
import xsna.zf20;
import xsna.zjf0;
import xsna.zou;
import xsna.zrd0;

/* compiled from: PostFragment.kt */
/* loaded from: classes4.dex */
public final class PostFragment extends BaseCommentsFragment<c9c0> implements d9c0, pds, ai5 {
    public static final /* synthetic */ int S0 = 0;
    public final ib60 A0;
    public final Object B0;
    public final Object C0;
    public final m6o0 D0;
    public final Object E0;
    public final g3f0 F0;
    public final b9c0 G0;
    public final m3a H0;
    public final n2r<ol60> I0;
    public lfg J0;
    public final a1c0 K0;
    public GestureDetector L0;
    public final d M0;
    public pjb0 N0;
    public final bpn0 O0;
    public final l2c0 P0;
    public final Object Q0;
    public final Object R0;
    public final Object m0;
    public final c n0;
    public final h o0;
    public gzs<s3q0> p0;
    public final b q0;
    public VkTopBar r0;
    public View s0;
    public String t0;
    public boolean u0;
    public ho60 v0;
    public b2c0 w0;
    public vdg x0;
    public final a920 y0;
    public final yif0 z0;

    /* compiled from: PostFragment.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Post.SourceFrom.values().length];
            try {
                iArr[Post.SourceFrom.Discover.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PostFragment.kt */
    public static final class b implements ain0<String> {
        public b() {
        }

        @Override // xsna.ain0
        public final String get() {
            a1c0 a1c0Var = PostFragment.this.K0;
            if (a1c0Var != null) {
                return a1c0Var.e;
            }
            return null;
        }
    }

    /* compiled from: PostFragment.kt */
    public static final class c implements ain0<Activity> {
        public c() {
        }

        @Override // xsna.ain0
        public final Activity get() {
            return PostFragment.this.getActivity();
        }
    }

    /* compiled from: PostFragment.kt */
    public static final class d extends GestureDetector.SimpleOnGestureListener {
        public d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (jjc.b()) {
                return true;
            }
            lfg lfgVar = PostFragment.this.J0;
            if (lfgVar == null) {
                lfgVar = null;
            }
            lfgVar.lg();
            return true;
        }
    }

    /* compiled from: PostFragment.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            PostFragment postFragment = (PostFragment) this.receiver;
            int i = PostFragment.S0;
            postFragment.Bo().c().b(new t4c0.e(xn60.d.a.b));
            return s3q0.a;
        }
    }

    /* compiled from: PostFragment.kt */
    public static final class g extends z2f0 {
        public g() {
        }

        @Override // xsna.z2f0, xsna.x2f0
        public final void a() {
            hl60 hl60Var = hl60.a;
            hl60.b();
        }

        @Override // xsna.z2f0, xsna.x2f0
        public final void b() {
            PostFragment postFragment = PostFragment.this;
            postFragment.eo(m3c0.a(postFragment.o0));
        }

        @Override // xsna.z2f0, xsna.x2f0
        public final void c() {
            hl60 hl60Var = hl60.a;
            hl60.b();
        }

        @Override // xsna.z2f0, xsna.x2f0
        public final void f(m3r m3rVar) {
            hl60 hl60Var = hl60.a;
            hl60.b();
            c cVar = PostFragment.this.n0;
            ArrayList<dl60> arrayList = m3c0.a;
            l7v b = pla.e().b();
            HintId hintId = HintId.BADGES_POST_FEED_NO_BADGES_UNSEEN;
            if (b.a(hintId.getId())) {
                m3rVar.post(new l3c0(m3rVar, cVar, hintId.getId(), 0));
            }
        }
    }

    /* compiled from: PostFragment.kt */
    public static final class h implements ain0<RecyclerView> {
        public h() {
        }

        @Override // xsna.ain0
        public final RecyclerView get() {
            return PostFragment.this.getRecyclerView();
        }
    }

    public PostFragment() {
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.FEED_POST, null, false, 62).j();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        zrd0 zrd0Var = zrd0.a;
        this.L = (yw90) zrd0.a(PerformanceScoreProduct.FEED_POST).j();
        On().init();
        l500 l500Var = new l500(this, 26);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.m0 = msy.a(lazyThreadSafetyMode, l500Var);
        this.n0 = new c();
        this.o0 = new h();
        this.q0 = new b();
        this.t0 = "";
        this.y0 = new a920();
        this.z0 = new yif0();
        this.A0 = new ib60();
        this.B0 = msy.a(lazyThreadSafetyMode, new uz(26));
        this.C0 = msy.a(lazyThreadSafetyMode, new t210(this, 20));
        this.D0 = new m6o0(null);
        this.E0 = msy.a(lazyThreadSafetyMode, new sy50(this, 12));
        this.F0 = new g3f0(new g(), 1);
        b9c0 b9c0Var = new b9c0(msy.a(lazyThreadSafetyMode, new i440(this, 18)), new xzb0(new bin0() { // from class: xsna.z2c0
            @Override // xsna.bin0
            public final Object get() {
                int i = PostFragment.S0;
                return PostFragment.this.zo().m;
            }
        }, new fj60(1, this), new fo50(), new azt(18), new f()));
        this.G0 = b9c0Var;
        this.H0 = new m3a(b9c0Var);
        this.I0 = new n2r<>(Collections.singletonList(new fac0()));
        this.K0 = new a1c0(this, new zf20(this, 19));
        this.M0 = new d();
        this.O0 = new bpn0(new hj60(this, 10));
        this.P0 = new l2c0();
        this.Q0 = msy.a(lazyThreadSafetyMode, new pr0(28));
        this.R0 = msy.a(lazyThreadSafetyMode, new e3c0(0));
    }

    public final int Ao() {
        ho60 ho60Var = this.v0;
        if (ho60Var == null) {
            ho60Var = null;
        }
        int itemCount = ho60Var.getItemCount();
        b2c0 b2c0Var = this.w0;
        return (b2c0Var != null ? b2c0Var : null).getItemCount() + itemCount;
    }

    @Override // xsna.bfg
    public final void B2(boolean z) {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        View view = this.Y;
        if (view != null) {
            boolean z2 = false;
            if (z) {
                lfg lfgVar = this.J0;
                if (lfgVar == null) {
                    lfgVar = null;
                }
                if (lfgVar.a6() == 0) {
                    RecyclerPaginatedView recyclerPaginatedView = this.W;
                    if (((recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) ? 0 : adapter.getItemCount()) > 0) {
                        z2 = true;
                    }
                }
            }
            bwt0.p0(view, z2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final y8c0 Bo() {
        return (y8c0) this.E0.getValue();
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void Ch(String str) {
        vdg vdgVar = this.x0;
        if (vdgVar == null) {
            vdgVar = null;
        }
        vdgVar.L0(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final PostViewFragmentTimeSpentTracker Co() {
        return (PostViewFragmentTimeSpentTracker) this.m0.getValue();
    }

    @Override // xsna.d9c0
    public final void E3(long j) {
        Bundle arguments;
        Bundle arguments2 = getArguments();
        if ((arguments2 != null ? bo8.e(arguments2, "entry_key") : null) == null || (arguments = getArguments()) == null) {
            return;
        }
        arguments.putLong("entry_key", j);
    }

    @Override // xsna.ai5
    public final y9t0 Eh(int i) {
        if (i >= 0) {
            ho60 ho60Var = this.v0;
            if (ho60Var == null) {
                ho60Var = null;
            }
            if (i < ho60Var.getItemCount()) {
                ho60 ho60Var2 = this.v0;
                if (ho60Var2 == null) {
                    ho60Var2 = null;
                }
                ol60 y0 = ho60Var2.y0(i);
                z1c0 z1c0Var = y0 instanceof z1c0 ? (z1c0) y0 : null;
                if (z1c0Var != null) {
                    u1c0 u1c0Var = z1c0Var.h;
                    return new y9t0(u1c0Var.a(), new ni5(zo().m, null, u1c0Var.e(), 10));
                }
            }
        }
        return null;
    }

    @Override // xsna.d9c0
    public final CharSequence Hf(CharSequence charSequence, PodcastAttachment podcastAttachment, LinksParserData linksParserData, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        gd60 a2 = hd60.a();
        MusicTrack musicTrack = podcastAttachment.f;
        int i = musicTrack.f;
        pjb0 pjb0Var = this.N0;
        if (pjb0Var != null) {
            pjb0Var.d = musicTrack;
            pjb0Var.e = musicPlaybackLaunchContext;
        } else {
            pjb0Var = null;
        }
        return a2.d(charSequence, LinksParserData.a(linksParserData, i, pjb0Var));
    }

    @Override // xsna.d9c0
    public final void Il(boolean z) {
        View view = this.s0;
        if (view != null) {
            bwt0.p0(view, z);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pds
    public final void J0() {
        y8c0 Bo = Bo();
        ((tc60) Bo.a().r.getValue()).c();
        hl60 hl60Var = hl60.a;
        hl60.b();
        Bo.b().g();
    }

    @Override // xsna.bfg
    public final void Jg(NewsComment newsComment, aa aaVar) {
        if (newsComment.u) {
            return;
        }
        View view = aaVar.itemView;
        Context context = view != null ? view.getContext() : null;
        Context context2 = context instanceof l7s ? (l7s) context : null;
        if (context2 == null && (context2 = getActivity()) == null) {
            return;
        }
        Context context3 = context2;
        ib6 ib6Var = aaVar instanceof ib6 ? (ib6) aaVar : null;
        boolean z = newsComment.t && (ib6Var != null && ib6Var.N);
        lfg lfgVar = this.J0;
        wx20 a2 = (lfgVar != null ? lfgVar : null).Ra(newsComment, new udg(z)).a(new og5(this, newsComment, aaVar, 3));
        if (a2 != null) {
            Integer ko = ko();
            wx20.c(a2, context3, "post_view", 0, ko != null ? ko.intValue() : 0, 12);
        }
    }

    @Override // xsna.d9c0
    public final s1c0 M0() {
        return (s1c0) Bo().l.getValue();
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void Rb(int i) {
        super.Rb(Ao() + i);
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.FragmentImpl
    public final void Rn() {
        super.Rn();
        y8c0 Bo = Bo();
        VkContextMenu vkContextMenu = Bo.p;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        Bo.p = null;
    }

    @Override // xsna.d9c0
    public final void S8() {
        PostFragment postFragment;
        RecyclerView recyclerView;
        mzp0 mzp0Var = this.J;
        if (mzp0Var != null) {
            mzp0Var.f();
        }
        On().stop();
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            postFragment = this;
            recyclerPaginatedView.fj(null, new m6o0(new kun(0, postFragment, PostFragment.class, "reloadNewsEntry", "reloadNewsEntry()V", 0, 4)));
        } else {
            postFragment = this;
        }
        RecyclerPaginatedView recyclerPaginatedView2 = postFragment.W;
        if (recyclerPaginatedView2 == null || (recyclerView = recyclerPaginatedView2.getRecyclerView()) == null) {
            return;
        }
        recyclerView.post(new tzz(4, this, recyclerView));
        postFragment.A0.c();
    }

    @Override // xsna.d9c0
    public final void V4() {
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.e0();
        }
    }

    @Override // xsna.d9c0
    public final boolean Yc(NewsEntry newsEntry) {
        return false;
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        Activity h2;
        if (super.a0()) {
            return true;
        }
        if (!vtk0.c().g(kn())) {
            return false;
        }
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null && (h2 = e3m.h(mo2getContext)) != null) {
            hd60.a().d0(h2);
        }
        finish();
        return true;
    }

    @Override // xsna.d9c0
    public final void a1() {
        RecyclerView recyclerView;
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        recyclerView.post(new h12(10, this, recyclerView));
        this.A0.g(recyclerView);
    }

    @Override // xsna.bfg
    public final void bm(int i) {
        vdg vdgVar = this.x0;
        if (vdgVar == null) {
            vdgVar = null;
        }
        vdgVar.i = i;
    }

    @Override // xsna.d9c0
    public final void c4() {
        this.y0.notifyDataSetChanged();
    }

    @Override // xsna.bfg
    public final void eg(NewsComment newsComment) {
        vdg vdgVar = this.x0;
        if (vdgVar == null) {
            vdgVar = null;
        }
        Iterator it = ((ArrayList) vdgVar.y0()).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (epx.f(((cbg) it.next()).a, newsComment)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            final int Ao = Ao() + i;
            so(new gzs() { // from class: xsna.c3c0
                @Override // xsna.gzs
                public final Object invoke() {
                    int i2 = PostFragment.S0;
                    PostFragment.this.io(Ao);
                    return s3q0.a;
                }
            });
        }
    }

    @Override // xsna.bfg
    public final void ge(final int i) {
        iag iagVar;
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int s = linearLayoutManager.s();
        int w = linearLayoutManager.w();
        vdg vdgVar = this.x0;
        if (vdgVar == null) {
            vdgVar = null;
        }
        cbg cbgVar = (cbg) vdgVar.c.c(i);
        Integer valueOf = (cbgVar == null || (iagVar = cbgVar.a) == null) ? null : Integer.valueOf(iagVar.getId());
        if (valueOf != null) {
            vdg vdgVar2 = this.x0;
            (vdgVar2 != null ? vdgVar2 : null).i = valueOf.intValue();
        }
        int Ao = Ao() + i;
        if (Ao < s || Ao > w) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.o(new RecyclerView.l.a() { // from class: xsna.d3c0
                    @Override // androidx.recyclerview.widget.RecyclerView.l.a
                    public final void a() {
                        int i2 = PostFragment.S0;
                        PostFragment.this.Rb(i);
                    }
                });
            } else {
                Rb(i);
            }
        }
    }

    @Override // xsna.dkf0
    public final int getAdapterOffset() {
        return 0;
    }

    @Override // xsna.dkf0
    public final int getItemCount() {
        ho60 ho60Var = this.v0;
        if (ho60Var == null) {
            ho60Var = null;
        }
        return ho60Var.getItemCount();
    }

    @Override // xsna.dkf0
    public final RecyclerView getRecyclerView() {
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            return recyclerPaginatedView.getRecyclerView();
        }
        return null;
    }

    @Override // xsna.ai5
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return VideoAutoPlayDelayType.POST;
    }

    @Override // xsna.pds
    public final void i5(gzs<s3q0> gzsVar) {
        if (isResumed()) {
            gzsVar.invoke();
        } else {
            this.p0 = gzsVar;
        }
    }

    @Override // xsna.bfg
    public final void in() {
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null) {
            u3g0Var.in();
        }
    }

    @Override // xsna.d9c0
    public final void invalidateOptionsMenu() {
        yo();
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final int mo() {
        return Math.max(0, this.y0.getItemCount() - 1);
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void nf() {
        vdg vdgVar = this.x0;
        if (vdgVar == null) {
            vdgVar = null;
        }
        vdgVar.N0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pds
    public final void o1() {
        y8c0 Bo = Bo();
        ((tc60) Bo.a().r.getValue()).d();
        Bo.b().h();
    }

    @Override // androidx.fragment.app.Fragment
    @ozl
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ho60 c2 = Bo().a().c();
            ArrayList<dl60> arrayList = m3c0.a;
            c2.x0(((ModerationComponent) m7m.d(this).mo408a(fpf0.a(ModerationComponent.class))).pa().b(activity, this, false));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Target target;
        Post post;
        Integer num;
        u3g0 u3g0Var;
        super.onActivityResult(i, i2, intent);
        if (i > 10000 && (u3g0Var = this.X) != null) {
            u3g0Var.n(i, i2, intent);
        }
        if (i == 4329 && i2 == -1) {
            if (intent == null || (post = (Post) intent.getParcelableExtra("comment")) == null || (num = post.u) == null) {
                return;
            }
            int intValue = num.intValue();
            lfg lfgVar = this.J0;
            if (lfgVar == null) {
                lfgVar = null;
            }
            lfgVar.s8(post.s, post.z, intValue);
        }
        if (i != 4331 || i2 != -1 || intent == null || (target = (Target) intent.getParcelableExtra("result_target")) == null) {
            return;
        }
        lfg lfgVar2 = this.J0;
        (lfgVar2 != null ? lfgVar2 : null).b8(target);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        y8c0 Bo = Bo();
        Bo.e.a(new nr60(Bo.c, Bo.y));
        Bo.b().b();
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        PostFragment postFragment;
        super.onCreate(bundle);
        y8c0 Bo = Bo();
        Bo.getClass();
        his0.d++;
        int i = 5;
        int i2 = 4;
        if (his0.c == null || !(!r0.h())) {
            his0.c = wjs0.b.a0(asu0.a.d()).subscribe(new e7q0(new puq0(i2), i));
        }
        Bo.G = new ek40();
        t6g0 t6g0Var = t6g0.b;
        t6g0.d().h();
        a1c0 a1c0Var = this.K0;
        a1c0 a1c0Var2 = a1c0Var != null ? a1c0Var : null;
        if (a1c0Var2 != null) {
            PostCommentsPresenter$receiver$1 postCommentsPresenter$receiver$1 = a1c0Var2.k;
            ho60 c2 = Bo().a().c();
            akf0 akf0Var = new akf0(this.q0, new bi5(this, i));
            this.I0.b(akf0Var);
            c2.D0(akf0Var);
            this.v0 = c2;
            b2c0 b2c0Var = new b2c0(a1c0Var2.j, this.F0);
            b2c0Var.m = this.G0;
            this.w0 = b2c0Var;
            m1y m1yVar = new m1y(this, 29);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            Lazy a2 = msy.a(lazyThreadSafetyMode, m1yVar);
            Lazy a3 = msy.a(lazyThreadSafetyMode, new m960(this, 10));
            postFragment = this;
            lfg lfgVar = new lfg(new ics0(a3), new fae(a3), a2, postFragment, a1c0Var2, null);
            a1c0Var2.i = lfgVar;
            postFragment.x0 = new vdg(lfgVar, lfgVar.K, new g3f0((z2f0) null, 3), postFragment.H0);
            postFragment.J0 = lfgVar;
            postFragment.S = lfgVar;
            IntentFilter intentFilter = new IntentFilter();
            for (int i3 = 0; i3 < 2; i3++) {
                intentFilter.addAction(b1c0.a[i3]);
            }
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            anj.d(context, postCommentsPresenter$receiver$1, intentFilter, hf8.a, 4);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction(zou.a);
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            cuz.a(context2).b(postCommentsPresenter$receiver$1, intentFilter2);
            ce60.b.getClass();
            p870.f().b(VersionConstants.PRODUCT_MAJOR_VERSION, a1c0Var2.i);
            p870.f().b(147, a1c0Var2.i);
            p870.f().b(9, a1c0Var2.i);
            p870.f().b(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, a1c0Var2.i);
            p870.f().b(116, a1c0Var2.i);
        } else {
            postFragment = this;
        }
        t6g0 t6g0Var2 = t6g0.b;
        t6g0.d().h();
        ho60 ho60Var = postFragment.v0;
        if (ho60Var == null) {
            ho60Var = null;
        }
        a920 a920Var = postFragment.y0;
        a920Var.K0(ho60Var);
        b2c0 b2c0Var2 = postFragment.w0;
        if (b2c0Var2 == null) {
            b2c0Var2 = null;
        }
        a920Var.K0(b2c0Var2);
        vdg vdgVar = postFragment.x0;
        if (vdgVar == null) {
            vdgVar = null;
        }
        a920Var.K0(vdgVar);
        vdg vdgVar2 = postFragment.x0;
        (vdgVar2 != null ? vdgVar2 : null).j = zo().m;
        y8c0 Bo2 = Bo();
        String str = zo().m;
        Bo2.getClass();
        if (brm0.B(str, "club", false) || brm0.B(str, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, false)) {
            Bo2.s = true;
        }
    }

    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        ehv ehvVar;
        final RecyclerView recyclerView2;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        FragmentActivity activity = getActivity();
        this.N0 = activity != null ? new pjb0(activity, (u2b0) this.O0.getValue()) : null;
        this.r0 = (VkTopBar) onCreateView.findViewById(R.id.toolbar);
        this.s0 = onCreateView.findViewById(R.id.post_view_shadow);
        this.U = (ViewGroup) onCreateView.findViewById(R.id.bottom_sheet_container);
        ym(false);
        this.D0.b = new e(0, this, PostFragment.class, "reloadNewsEntry", "reloadNewsEntry()V", 0);
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null && (recyclerView2 = recyclerPaginatedView.getRecyclerView()) != null) {
            yrn yrnVar = new yrn(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_separator_primary_alpha)), getResources().getDimensionPixelSize(R.dimen.toolbar_separator_height));
            yrnVar.o = gbg0.a(getResources(), 16.0f);
            yrnVar.m = this.K0;
            recyclerView2.addItemDecoration(this.P0);
            recyclerView2.addItemDecoration((j2c0) this.Q0.getValue());
            recyclerView2.addItemDecoration(yrnVar);
            if (com.vk.toggle.d.i()) {
                recyclerView2.addItemDecoration(((Boolean) this.R0.getValue()).booleanValue() ? new x0n(recyclerView2) : new v0n(recyclerView2));
                final n0n n0nVar = new n0n();
                recyclerView2.setOnHoverListener(new View.OnHoverListener() { // from class: xsna.a3c0
                    @Override // android.view.View.OnHoverListener
                    public final boolean onHover(View view, MotionEvent motionEvent) {
                        int i = PostFragment.S0;
                        return n0n.this.a(recyclerView2, motionEvent);
                    }
                });
            }
            yrn yrnVar2 = new yrn(m33.a(R.drawable.archived_comment_divider, requireContext()), iah0.a(8.0f));
            yrnVar2.m = new b3c0();
            recyclerView2.addItemDecoration(yrnVar2);
            recyclerView2.setItemAnimator(null);
        }
        u3g0 u3g0Var = new u3g0(ko());
        lfg lfgVar = this.J0;
        if (lfgVar == null) {
            lfgVar = null;
        }
        m3g0 m3g0Var = new m3g0(lfgVar, u3g0Var, this.Z);
        lfg lfgVar2 = this.J0;
        if (lfgVar2 == null) {
            lfgVar2 = null;
        }
        lfgVar2.S = m3g0Var;
        u3g0Var.c = m3g0Var;
        u3g0Var.v();
        this.X = u3g0Var;
        View view = this.Y;
        int i = 1;
        if (view != null) {
            jjc.g(view, new yka0(this, i));
        }
        setHasOptionsMenu(true);
        RecyclerPaginatedView recyclerPaginatedView2 = this.W;
        if (recyclerPaginatedView2 != null && (recyclerView = recyclerPaginatedView2.getRecyclerView()) != null) {
            y8c0 Bo = Bo();
            Bo.A = recyclerView;
            r1c0 a2 = Bo.a();
            ?? r5 = a2.v;
            ?? r6 = a2.u;
            ?? r9 = a2.q;
            Bo.a().a.n.h(recyclerView);
            recyclerView.setHasFixedSize(true);
            EntriesListFragment.FocusableLinearLayoutManager focusableLinearLayoutManager = new EntriesListFragment.FocusableLinearLayoutManager(recyclerView.getContext(), Bo.c, (com.vk.stat.recycler.d) r6.getValue());
            focusableLinearLayoutManager.setOrientation(1);
            recyclerView.setLayoutManager(focusableLinearLayoutManager);
            recyclerView.setRecycledViewPool(new rru());
            recyclerView.setItemViewCacheSize(fxc0.B().N().a);
            h7m h7mVar = Bo.b;
            recyclerView.addOnScrollListener(new c5r((ClipsViewerComponent) h7mVar.a(fpf0.a(ClipsViewerComponent.class)), (NewsfeedOptionalAdsComponent) h7mVar.mo408a(fpf0.a(NewsfeedOptionalAdsComponent.class))));
            recyclerView.addOnScrollListener((dui) r9.getValue());
            ((tc60) a2.r.getValue()).a(recyclerView);
            ((o170) a2.s.getValue()).a(recyclerView);
            mo60 mo60Var = a2.a;
            mo60Var.e().a();
            ((dui) r9.getValue()).l(new j6f0(((sr60) a2.f.getValue()).a()));
            bw60 bw60Var = new bw60(recyclerView);
            fh9 fh9Var = a2.g;
            Context context = Bo.h.get();
            if (context != null) {
                ehvVar = new ehv(context, bw60Var, fh9Var.a());
                recyclerView.addOnScrollListener(ehvVar);
            } else {
                ehvVar = null;
            }
            fh9Var.b = ehvVar;
            recyclerView.setItemAnimator((hm60) a2.w.getValue());
            a2.c().C0((or60) a2.j.getValue());
            a2.c().C0((oc60) a2.l.getValue());
            a2.c().D0((rl60) a2.m.getValue());
            a2.c().D0((zjf0) a2.n.getValue());
            dui duiVar = (dui) r9.getValue();
            yl60 yl60Var = (yl60) r5.getValue();
            yl60Var.getClass();
            duiVar.l(new xl60(yl60Var));
            ((yl60) r5.getValue()).c();
            com.vk.stat.recycler.d dVar = (com.vk.stat.recycler.d) r6.getValue();
            if (dVar != null) {
                a2.c().k = dVar;
            }
            recyclerView.setAdapter(a2.c());
            mo60Var.n.f = new sm60(recyclerView, new rm60(recyclerView, null));
            if (((Boolean) Bo.m.getValue()).booleanValue()) {
                recyclerView.addOnScrollListener((y3v) Bo.F.getValue());
            }
            Bo.v.b.g.a(new o3w(Bo, 29));
            s3q0 s3q0Var = s3q0.a;
            ad0.c(y22.a(Bo.f), new gib0(Bo, 1));
            Bo.b().i();
        }
        mzp0 mzp0Var = this.J;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        return onCreateView;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar;
        Long l;
        y8c0 Bo = Bo();
        boolean isStateSaved = isStateSaved();
        doq doqVar = lmc.c;
        if (!isStateSaved && (l = Bo.a.n) != null) {
            Serializer.c<NewsfeedData> cVar2 = NewsfeedData.CREATOR;
            wmi0.a.c(k0.a(l.longValue(), "newsfeed_cache_post_to_open:"));
        }
        ek40 ek40Var = Bo.G;
        if (ek40Var != null) {
            ek40Var.a();
        }
        Bo.G = null;
        int i = his0.d - 1;
        his0.d = i;
        if (i == 0 && (cVar = his0.c) != null) {
            cVar.dispose();
        }
        ehv ehvVar = (ehv) Bo.a().g.b;
        if (ehvVar != null) {
            ehvVar.p();
        }
        Bo.a().g.b = null;
        Bo.B.e();
        Bo.c().clear();
        pn60 pn60Var = Bo.o;
        if (pn60Var != null) {
            pn60Var.a();
        }
        Bo.o = null;
        qn60 qn60Var = Bo.n;
        if (qn60Var != null) {
            qn60Var.a();
        }
        Bo.n = null;
        r1c0 r1c0Var = Bo.I;
        if (r1c0Var != null) {
            r1c0Var.a.a();
        }
        Bo.I = null;
        Bo.C = true;
        s2c0 s2c0Var = (s2c0) Bo.x.getValue();
        s2c0Var.c = r2c0.b;
        s2c0Var.d = z6n.d;
        Bo.h = doqVar;
        ((t2c0) Bo.E.getValue()).getClass();
        Bo.u.dispose();
        a1c0 a1c0Var = this.K0;
        if (a1c0Var != null) {
            a1c0Var.onDestroy();
        }
        npu.a().a = null;
        this.p0 = null;
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        io.reactivex.rxjava3.disposables.c cVar;
        this.r0 = null;
        hl60 hl60Var = hl60.a;
        hl60.b();
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null) {
            u3g0Var.onDestroyView();
        }
        y8c0 Bo = Bo();
        Bo.H.a();
        ek40 ek40Var = Bo.G;
        if (ek40Var != null) {
            ek40Var.a();
        }
        Bo.G = null;
        int i = his0.d - 1;
        his0.d = i;
        if (i == 0 && (cVar = his0.c) != null) {
            cVar.dispose();
        }
        Bo.v.clear();
        Bo.a().a.d().a();
        RecyclerView recyclerView3 = Bo.A;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(null);
        }
        RecyclerView recyclerView4 = Bo.A;
        if (recyclerView4 != null) {
            recyclerView4.removeOnScrollListener((dui) Bo.a().q.getValue());
        }
        if (((Boolean) Bo.m.getValue()).booleanValue() && (recyclerView2 = Bo.A) != null) {
            recyclerView2.removeOnScrollListener((y3v) Bo.F.getValue());
        }
        RecyclerView recyclerView5 = Bo.A;
        if (recyclerView5 != null) {
            recyclerView5.setItemAnimator(null);
        }
        ehv ehvVar = (ehv) Bo.a().g.b;
        if (ehvVar != null && (recyclerView = Bo.A) != null) {
            recyclerView.removeOnScrollListener(ehvVar);
        }
        Bo.a().a.n.b();
        Bo.a().c().F0((or60) Bo.a().j.getValue());
        Bo.a().c().F0((oc60) Bo.a().l.getValue());
        Bo.a().c().G0((rl60) Bo.a().m.getValue());
        Bo.a().c().G0((zjf0) Bo.a().n.getValue());
        Bo.a().c().k = null;
        Bo.a().c().E0();
        Bo.a().c().clear();
        ehv ehvVar2 = (ehv) Bo.a().g.b;
        if (ehvVar2 != null) {
            ehvVar2.q();
        }
        ((yl60) Bo.a().v.getValue()).d();
        Bo.A = null;
        Bo.b().c();
        Bo.a().a.n.c();
        Bo.a().a.n.f = null;
        super.onDestroyView();
        this.z0.c.clear();
        this.A0.e();
        View view = getView();
        if (view != null) {
            gqo.f(view, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        y8c0 Bo = Bo();
        if (menuItem.getItemId() == R.id.postviewfragment_options) {
            Bo.c().b(t4c0.f.a.b);
            return true;
        }
        Bo.getClass();
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        WriteBar writeBar;
        z0y0 z0y0Var;
        ((yl60) Bo().a().v.getValue()).a();
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null && (writeBar = u3g0Var.e) != null) {
            y0y0 y0y0Var = writeBar.D;
            if (y0y0Var.c(null) && (z0y0Var = y0y0Var.d) != null) {
                y0y0Var.c.getInputState();
                z0y0Var.a(false, true);
            }
        }
        this.I0.pause();
        hl60 hl60Var = hl60.a;
        hl60.b();
        this.F0.a.a();
        PostViewFragmentTimeSpentTracker Co = Co();
        if (Co != null) {
            long a2 = qni0.a();
            EmptyList emptyList = EmptyList.b;
            for (PostViewFragmentTimeSpentTracker.SectionType sectionType : PostViewFragmentTimeSpentTracker.SectionType.values()) {
                emptyList.getClass();
                Co.b(sectionType, a2, false);
            }
        }
        this.A0.h();
        super.onPause();
        J0();
        y8c0 Bo = Bo();
        Bo.b().d();
        ehv ehvVar = (ehv) Bo.a().g.b;
        if (ehvVar != null) {
            ehvVar.n();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        RecyclerView recyclerView;
        PostViewFragmentTimeSpentTracker Co;
        super.onResume();
        y8c0 Bo = Bo();
        Bo.b().e();
        ehv ehvVar = (ehv) Bo.a().g.b;
        if (ehvVar != null) {
            ehvVar.o();
        }
        ((yl60) Bo.a().v.getValue()).b();
        o1();
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null) {
            this.I0.a(mo2getContext);
        }
        eo(m3c0.a(this.o0));
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null && (recyclerView = recyclerPaginatedView.getRecyclerView()) != null && (Co = Co()) != null) {
            Co.a(recyclerView);
        }
        this.A0.f();
        go(new cr20(this, 22));
        gzs<s3q0> gzsVar = this.p0;
        if (gzsVar != null) {
            this.p0 = null;
            gzsVar.invoke();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        Bo().getClass();
        com.vkontakte.android.data.b.l();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        super.onViewCreated(view, bundle);
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.setUiStateCallbacks(new h3c0(this, view));
        }
        RecyclerPaginatedView recyclerPaginatedView2 = this.W;
        if (recyclerPaginatedView2 != null) {
            recyclerPaginatedView2.setAdapter(this.y0);
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle("STATE_REPLY_BAR_VIEW") : null;
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null) {
            Dialog dialog = this.s;
            u3g0Var.p(view, bundle2, dialog != null ? dialog.getWindow() : null);
        }
        u3g0 u3g0Var2 = this.X;
        if (u3g0Var2 != null) {
            u3g0Var2.v();
        }
        yo();
        mzp0 mzp0Var = this.J;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        RecyclerPaginatedView recyclerPaginatedView3 = this.W;
        if (recyclerPaginatedView3 != null && (recyclerView2 = recyclerPaginatedView3.getRecyclerView()) != null) {
            recyclerView2.addOnScrollListener(new tfh0(new yu60(this, 10)));
        }
        this.z0.c.add(new i3c0());
        this.A0.a(new g3c0(this), NewsEntryWatcherMode.FAST);
        RecyclerPaginatedView recyclerPaginatedView4 = this.W;
        if (recyclerPaginatedView4 != null && (recyclerView = recyclerPaginatedView4.getRecyclerView()) != null) {
            recyclerView.addOnScrollListener(new j3c0(this));
        }
        int i2 = zo().o;
        if (i2 != 1) {
            if (i2 == 2) {
                i = R.string.video;
            } else if (i2 != 7 && i2 != 9) {
                i = R.string.wall_view;
            }
            setTitle(i);
        }
        i = R.string.photo;
        setTitle(i);
    }

    @Override // xsna.d9c0
    public final void pa() {
        RecyclerView recyclerView;
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        recyclerView.post(new f2l(5, this, recyclerView));
        this.A0.c();
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_post_view, viewGroup, false);
    }

    @Override // xsna.d9c0
    public final void setTitle(int i) {
        String string = getString(i);
        if (epx.f(this.t0, string)) {
            return;
        }
        this.t0 = string;
        yo();
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void wf(int i) {
        uo(Ao() + i, 0);
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final boolean wo(int i) {
        return i < Ao();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = a.$EnumSwitchMapping$0[zo().a.ordinal()] == 1 ? MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_POST : MobileOfficialAppsCoreNavStat$EventScreen.FEED_POST;
        a1c0 a1c0Var = this.K0;
        if (a1c0Var == null) {
            a1c0Var = null;
        }
        if (a1c0Var != null) {
            f0c0 zo = zo();
            NewsEntry newsEntry = a1c0Var.d;
            if (newsEntry != null) {
                String str = zo.t;
                if (str == null) {
                    str = newsEntry.Cb().b;
                }
                String str2 = str;
                if (newsEntry instanceof Post) {
                    uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.POST, Long.valueOf(r0.n), Long.valueOf(((Post) newsEntry).m.b), null, str2, null, 40, null);
                } else if (newsEntry instanceof Photos) {
                    Attachment R1 = ((Photos) newsEntry).R1();
                    if (R1 instanceof PhotoAttachment) {
                        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.PHOTO, Long.valueOf(r0.f), Long.valueOf(((PhotoAttachment) R1).g.b), null, str2, null, 40, null);
                    }
                } else if (newsEntry instanceof Videos) {
                    Attachment R12 = ((Videos) newsEntry).R1();
                    if (R12 instanceof VideoAttachment) {
                        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(r0.k.o0()), Long.valueOf(((VideoAttachment) R12).k.I0().b), null, str2, null, 40, null);
                    }
                } else if (newsEntry instanceof PromoPost) {
                    uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.POST, Long.valueOf(r0.n), Long.valueOf(((PromoPost) newsEntry).n.m.b), null, str2, null, 40, null);
                }
            }
        }
        PostViewFragmentTimeSpentTracker Co = Co();
        if (Co != null) {
            Co.d = uiTrackingScreen.a;
        }
    }

    @Override // xsna.d9c0
    public final void ym(boolean z) {
        if (this.u0 != z) {
            this.u0 = z;
            yo();
        }
    }

    public final void yo() {
        VkTopBar vkTopBar = this.r0;
        if (vkTopBar == null) {
            return;
        }
        y8c0 Bo = Bo();
        String str = this.t0;
        boolean z = this.u0;
        ArrayList<dl60> arrayList = m3c0.a;
        vkTopBar.setContentDescription(str);
        int i = 2;
        if (h3p0.a(this)) {
            Context context = vkTopBar.getContext();
            HashSet hashSet = iah0.a;
            if (!fnj.d(context)) {
                vkTopBar.setBack(new VkTopBar.b(new nuv(this, 23), null, null, null, com.vk.core.compose.component.semantics.b.a(SemanticsConfiguration.Mode.ClearAndSet, new d2y(this, 18), 2), 14));
            }
        }
        VkTopBar.Middle.Text.Title title = new VkTopBar.Middle.Text.Title(oq.d(tlo0.Companion, str), new s1x(this, 26), null, null, null, 28);
        VkTopBar.Middle.Text.c cVar = z ? new VkTopBar.Middle.Text.c(new tlo0.f(R.string.archive_post_subtitle), null, null, 30) : null;
        SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(title, cVar, null, com.vk.core.compose.component.semantics.b.a(mode, new v89(str, i), 2), 4));
        String string = getString(R.string.accessibility_actions);
        vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_more_vertical_24), new tlo0.h(string), new ubw(Bo, 28), null, null, com.vk.core.compose.component.semantics.b.a(mode, new ga3(string, 3), 2), 24), null, 6));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.bfg
    public final boolean z(rdg rdgVar) {
        boolean z = rdgVar instanceof rdg.d;
        ?? r1 = this.B0;
        if (z) {
            View findViewById = ((rdg.d) rdgVar).a.itemView.findViewById(R.id.comment_author_liked_photo);
            if (findViewById == null) {
                return false;
            }
            jgg.d((jgg) r1.getValue(), findViewById, HintId.FEED_AUTHOR_LIKE_ONBOARDING.getId());
            return true;
        }
        if (rdgVar instanceof rdg.e) {
            jgg.b((jgg) r1.getValue(), ((rdg.e) rdgVar).a, HintId.FEED_AUTHOR_LIKED.getId());
            return true;
        }
        if (rdgVar instanceof rdg.f) {
            jgg.b((jgg) r1.getValue(), ((rdg.f) rdgVar).a, HintId.FEED_GROUP_LIKED.getId());
            return true;
        }
        if (!(rdgVar instanceof rdg.c)) {
            return false;
        }
        eo(m3c0.a(this.o0));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final f0c0 zo() {
        return (f0c0) this.C0.getValue();
    }

    @Override // xsna.d9c0
    public final void Ae() {
    }

    @Override // xsna.d9c0
    public final void R1() {
    }

    @Override // xsna.d9c0
    public final void le() {
    }

    @Override // xsna.d9c0
    public final void Mj(Post post) {
    }

    @Override // xsna.d9c0
    public final void P6(VideoFile videoFile) {
    }

    @Override // xsna.d9c0
    public final void S2(NewsEntry newsEntry) {
    }

    @Override // xsna.d9c0
    public final void a7(VideoFile videoFile) {
    }

    @Override // xsna.d9c0
    public final void hk(int i) {
    }

    @Override // xsna.d9c0
    public final void rd(boolean z) {
    }

    /* compiled from: PostFragment.kt */
    public static final class f implements id60 {
        @Override // xsna.id60
        public final void a(UserId userId, boolean z) {
        }
    }

    @Override // xsna.d9c0
    public final void Db(Post post, PostingCreationEntryPoint postingCreationEntryPoint) {
    }
}
