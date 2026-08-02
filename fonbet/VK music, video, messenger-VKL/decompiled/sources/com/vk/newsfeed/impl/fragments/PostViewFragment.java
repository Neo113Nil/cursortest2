package com.vk.newsfeed.impl.fragments;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.LruCache;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.common.links.LinksParserData;
import com.vk.core.apps.BuildInfo;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.dto.posting.DonutPostingSettings;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.common.presentation.model.items.CoownershipStatusUiDto;
import com.vk.newsfeed.common.util.a;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachActivity;
import com.vk.newsfeed.impl.presenters.b;
import com.vk.newsfeed.impl.stats.PostViewFragmentTimeSpentTracker;
import com.vk.newsfeed.impl.util.NewsEntryWatcherMode;
import com.vk.newsfeed.presentation.model.ActionsMenuType;
import com.vk.sharing.api.dto.Target;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedItemMenuAction;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.data.DonutAnalytics;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.BuildConfig;
import io.reactivex.rxjava3.internal.operators.completable.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import org.chromium.base.version_info.VersionConstants;
import xsna.a920;
import xsna.aa;
import xsna.anj;
import xsna.asu0;
import xsna.b2c0;
import xsna.b3g0;
import xsna.b9c0;
import xsna.bin0;
import xsna.bo8;
import xsna.bpn0;
import xsna.brm0;
import xsna.bwt0;
import xsna.by2;
import xsna.c3g0;
import xsna.c9c0;
import xsna.cbg;
import xsna.ce60;
import xsna.cuz;
import xsna.d220;
import xsna.d9c0;
import xsna.dhr0;
import xsna.di60;
import xsna.dl60;
import xsna.dw20;
import xsna.e3c0;
import xsna.e3m;
import xsna.e43;
import xsna.eg00;
import xsna.enj;
import xsna.epx;
import xsna.eul;
import xsna.f9c0;
import xsna.fac0;
import xsna.fae;
import xsna.fkq0;
import xsna.fnj;
import xsna.g3f0;
import xsna.g9c0;
import xsna.gbg0;
import xsna.gd60;
import xsna.gko;
import xsna.gxp;
import xsna.h3p0;
import xsna.hbt0;
import xsna.hd60;
import xsna.hf8;
import xsna.hl60;
import xsna.iag;
import xsna.iah0;
import xsna.ib6;
import xsna.ib60;
import xsna.ics0;
import xsna.id60;
import xsna.itg0;
import xsna.iuc0;
import xsna.j2c0;
import xsna.j9c0;
import xsna.jgg;
import xsna.jjc;
import xsna.jw30;
import xsna.k1c0;
import xsna.k7z;
import xsna.k9c0;
import xsna.k9q0;
import xsna.kgb;
import xsna.klt;
import xsna.l1i;
import xsna.l2c0;
import xsna.l7s;
import xsna.l7v;
import xsna.l8g;
import xsna.l9c0;
import xsna.lfg;
import xsna.ll60;
import xsna.lmk;
import xsna.m33;
import xsna.m360;
import xsna.m3a;
import xsna.m3g0;
import xsna.m3r;
import xsna.m7m;
import xsna.m9c0;
import xsna.mgz;
import xsna.msy;
import xsna.mzp0;
import xsna.n0n;
import xsna.n2r;
import xsna.n3g0;
import xsna.nbs;
import xsna.ni5;
import xsna.npu;
import xsna.nuv;
import xsna.o2u0;
import xsna.o440;
import xsna.oq;
import xsna.os30;
import xsna.p4g;
import xsna.p4r;
import xsna.p870;
import xsna.p90;
import xsna.pb00;
import xsna.pjb0;
import xsna.pla;
import xsna.q530;
import xsna.qi6;
import xsna.qni0;
import xsna.qs6;
import xsna.qye;
import xsna.rdg;
import xsna.rfc0;
import xsna.rkt;
import xsna.rtc0;
import xsna.rzp0;
import xsna.s1c0;
import xsna.sf2;
import xsna.t11;
import xsna.t6g0;
import xsna.tlo0;
import xsna.tzv;
import xsna.u17;
import xsna.u1c0;
import xsna.u210;
import xsna.u2b0;
import xsna.u3g0;
import xsna.udg;
import xsna.up2;
import xsna.uq50;
import xsna.uz;
import xsna.v0n;
import xsna.v100;
import xsna.v9j;
import xsna.vdg;
import xsna.vtk0;
import xsna.vz70;
import xsna.w100;
import xsna.w2a0;
import xsna.wx20;
import xsna.x0n;
import xsna.x6q;
import xsna.x850;
import xsna.xq70;
import xsna.xq8;
import xsna.xzb0;
import xsna.y0y0;
import xsna.y9t0;
import xsna.yif0;
import xsna.yrn;
import xsna.yw90;
import xsna.z0y0;
import xsna.z2f0;
import xsna.zjq;
import xsna.zl3;
import xsna.zou;
import xsna.zrd0;

/* compiled from: PostViewFragment.kt */
/* loaded from: classes4.dex */
public class PostViewFragment extends BaseCommentsFragment<c9c0> implements d9c0 {
    public static final String[] T0 = {"com.vkontakte.android.STICKERS_ANIMATION_ENABLED_CHANGED", "android.net.conn.CONNECTIVITY_CHANGE", "com.vkontakte.android.ACTION_GROUP_STATUS_CHANGED", "com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED", "com.vkontakte.android.DONUT_SUBSCRIPTION_PAID"};
    public static final ArrayList<dl60> U0 = e43.a(ll60.a.invoke());
    public final m3a A0;
    public final n2r<u1c0> B0;
    public lfg C0;
    public final com.vk.newsfeed.impl.presenters.b D0;
    public final nbs E0;
    public final bpn0 F0;
    public dw20 G0;
    public String H0;
    public final rtc0 I0;
    public final PostViewFragment$receiver$1 J0;
    public GestureDetector K0;
    public final d L0;
    public pjb0 M0;
    public int N0;
    public final bpn0 O0;
    public final l2c0 P0;
    public final Object Q0;
    public boolean R0;
    public final Object S0;
    public final boolean m0 = true;
    public final Object n0;
    public VkTopBar o0;
    public View p0;
    public String q0;
    public boolean r0;
    public b2c0 s0;
    public vdg t0;
    public final a920 u0;
    public final yif0 v0;
    public final ib60 w0;
    public final Object x0;
    public final g3f0 y0;
    public final b9c0 z0;

    /* compiled from: PostViewFragment.kt */
    public final class a implements gxp {
        public a() {
        }

        @Override // xsna.gxp
        public final by2 c(Throwable th) {
            return new by2(0, 7, new m360(PostViewFragment.this, 10));
        }
    }

    /* compiled from: PostViewFragment.kt */
    public static final class b extends eg00<u1c0> {
        @Override // xsna.eg00, xsna.zjf0
        public final void b(RecyclerView.e0 e0Var) {
            super.b(e0Var);
            if (e0Var instanceof qi6) {
                ((qi6) e0Var).I6();
            }
        }
    }

    /* compiled from: PostViewFragment.kt */
    public final class c extends RecyclerView.t {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                PostViewFragment.this.Ym();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            hl60 hl60Var = hl60.a;
            hl60.c(i2);
        }
    }

    /* compiled from: PostViewFragment.kt */
    public static final class d extends GestureDetector.SimpleOnGestureListener {
        public d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (jjc.b()) {
                return true;
            }
            lfg lfgVar = PostViewFragment.this.C0;
            if (lfgVar == null) {
                lfgVar = null;
            }
            lfgVar.lg();
            return true;
        }
    }

    /* compiled from: PostViewFragment.kt */
    public static final class e extends AbstractPaginatedView.i {
        public final /* synthetic */ View b;

        public e(View view) {
            this.b = view;
        }

        @Override // com.vk.lists.AbstractPaginatedView.i
        public final void b() {
            String[] strArr = PostViewFragment.T0;
            PostViewFragment postViewFragment = PostViewFragment.this;
            mzp0 mzp0Var = postViewFragment.J;
            if (mzp0Var != null) {
                mzp0Var.d(this.b);
            }
            postViewFragment.On().a();
        }
    }

    /* compiled from: PostViewFragment.kt */
    public static final class h extends z2f0 {
        public h() {
        }

        @Override // xsna.z2f0, xsna.x2f0
        public final void a() {
            hl60 hl60Var = hl60.a;
            hl60.b();
        }

        @Override // xsna.z2f0, xsna.x2f0
        public final void b() {
            PostViewFragment.this.Ym();
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
            String[] strArr = PostViewFragment.T0;
            l7v b = pla.e().b();
            HintId hintId = HintId.BADGES_POST_FEED_NO_BADGES_UNSEEN;
            if (b.a(hintId.getId())) {
                m3rVar.post(new eul(m3rVar, PostViewFragment.this, hintId.getId(), 1));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [com.vk.newsfeed.impl.fragments.PostViewFragment$receiver$1] */
    public PostViewFragment() {
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.FEED_POST, null, false, 62).j();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        zrd0 zrd0Var = zrd0.a;
        this.L = (yw90) zrd0.a(PerformanceScoreProduct.FEED_POST).j();
        On().init();
        k7z k7zVar = new k7z(this, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.n0 = msy.a(lazyThreadSafetyMode, k7zVar);
        this.q0 = "";
        this.u0 = new a920();
        this.v0 = new yif0();
        this.w0 = new ib60();
        this.x0 = msy.a(lazyThreadSafetyMode, new w2a0(1));
        this.y0 = new g3f0(new h(), 1);
        b9c0 b9c0Var = new b9c0(msy.a(lazyThreadSafetyMode, new uq50(this, 18)), new xzb0(new bin0() { // from class: xsna.i9c0
            @Override // xsna.bin0
            public final Object get() {
                return PostViewFragment.this.H0;
            }
        }, new klt(1, this), new f(), new d220(11), new g()));
        this.z0 = b9c0Var;
        this.A0 = new m3a(b9c0Var);
        this.B0 = new n2r<>(Collections.singletonList(new fac0()));
        com.vk.newsfeed.impl.presenters.b bVar = new com.vk.newsfeed.impl.presenters.b(this, this.J);
        Ho(bVar);
        this.D0 = bVar;
        this.E0 = new nbs(this.D);
        this.F0 = new bpn0(new x850(this, 13));
        this.H0 = "";
        this.I0 = vtk0.c();
        this.J0 = new BroadcastReceiver() { // from class: com.vk.newsfeed.impl.fragments.PostViewFragment$receiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                c9c0 Co = PostViewFragment.this.Co();
                if (Co != null) {
                    ((b) Co).Z3(intent);
                }
            }
        };
        this.L0 = new d();
        this.O0 = new bpn0(new l1i(this, 28));
        this.P0 = new l2c0();
        this.Q0 = msy.a(lazyThreadSafetyMode, new e3c0(1));
        this.S0 = msy.a(lazyThreadSafetyMode, new uz(27));
    }

    public hbt0 Ao() {
        return (hbt0) this.F0.getValue();
    }

    public void B2(boolean z) {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        View view = this.Y;
        if (view != null) {
            boolean z2 = false;
            if (z) {
                lfg lfgVar = this.C0;
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

    public boolean Bo() {
        return this.m0;
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void Ch(String str) {
        vdg vdgVar = this.t0;
        if (vdgVar == null) {
            vdgVar = null;
        }
        vdgVar.L0(str);
    }

    public c9c0 Co() {
        return this.D0;
    }

    @Override // xsna.d9c0
    public final void Db(Post post, PostingCreationEntryPoint postingCreationEntryPoint) {
        Activity h2;
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null || (h2 = e3m.h(mo2getContext)) == null) {
            return;
        }
        iuc0.b.c(4328, h2, post, postingCreationEntryPoint);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final PostViewFragmentTimeSpentTracker Do() {
        return (PostViewFragmentTimeSpentTracker) this.n0.getValue();
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
            b2c0 b2c0Var = this.s0;
            if (b2c0Var == null) {
                b2c0Var = null;
            }
            if (i < b2c0Var.getItemCount()) {
                b2c0 b2c0Var2 = this.s0;
                if (b2c0Var2 == null) {
                    b2c0Var2 = null;
                }
                u1c0 u1c0Var = (u1c0) b2c0Var2.c.c(i);
                if (u1c0Var != null) {
                    return new y9t0(u1c0Var.a(), new ni5(this.H0, null, u1c0Var.e(), 10));
                }
            }
        }
        return null;
    }

    public void Eo() {
        u3g0 u3g0Var = new u3g0(ko());
        lfg lfgVar = this.C0;
        if (lfgVar == null) {
            lfgVar = null;
        }
        m3g0 m3g0Var = new m3g0(lfgVar, u3g0Var, this.Z);
        lfg lfgVar2 = this.C0;
        (lfgVar2 != null ? lfgVar2 : null).S = m3g0Var;
        u3g0Var.c = m3g0Var;
        u3g0Var.v();
        vo(u3g0Var);
    }

    public void Fo(View view, Bundle bundle) {
        Bundle bundle2 = bundle != null ? bundle.getBundle("STATE_REPLY_BAR_VIEW") : null;
        u3g0 Bf = Bf();
        if (Bf != null) {
            Dialog dialog = this.s;
            Bf.p(view, bundle2, dialog != null ? dialog.getWindow() : null);
        }
        Jo();
        u3g0 Bf2 = Bf();
        if (Bf2 != null) {
            Bf2.v();
        }
    }

    public void Go(View view) {
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.setUiStateCallbacks(new e(view));
        }
    }

    @Override // xsna.d9c0
    public final CharSequence Hf(CharSequence charSequence, PodcastAttachment podcastAttachment, LinksParserData linksParserData, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        gd60 a2 = hd60.a();
        MusicTrack musicTrack = podcastAttachment.f;
        int i = musicTrack.f;
        pjb0 pjb0Var = this.M0;
        if (pjb0Var != null) {
            pjb0Var.d = musicTrack;
            pjb0Var.e = musicPlaybackLaunchContext;
        } else {
            pjb0Var = null;
        }
        return a2.d(charSequence, LinksParserData.a(linksParserData, i, pjb0Var));
    }

    public final void Ho(com.vk.newsfeed.impl.presenters.b bVar) {
        b2c0 b2c0Var = new b2c0(bVar.G, this.y0);
        b bVar2 = new b();
        this.B0.b(bVar2);
        b2c0Var.n = bVar2;
        b2c0Var.m = this.z0;
        this.s0 = b2c0Var;
        rkt rktVar = new rkt(this, 21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = msy.a(lazyThreadSafetyMode, rktVar);
        Lazy a3 = msy.a(lazyThreadSafetyMode, new nuv(this, 24));
        lfg lfgVar = new lfg(new ics0(a3), new fae(a3), a2, this, bVar, null);
        bVar.H = lfgVar;
        this.t0 = new vdg(lfgVar, lfgVar.K, new g3f0((z2f0) null, 3), this.A0);
        this.C0 = lfgVar;
        this.S = lfgVar;
    }

    @Override // xsna.d9c0
    public final void Il(boolean z) {
        View view = this.p0;
        if (view != null) {
            bwt0.p0(view, z);
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void Io(Context context, a.AbstractC1374a abstractC1374a, NewsEntry newsEntry) {
        com.vk.newsfeed.impl.presenters.b bVar;
        NewsEntry newsEntry2;
        com.vk.newsfeed.common.util.h hVar = new com.vk.newsfeed.common.util.h(newsEntry, null);
        hVar.b = new xq70(this, 5);
        hVar.k = this.R0;
        hVar.l = true;
        hVar.n = true;
        hVar.a(context, abstractC1374a).g();
        c9c0 Co = Co();
        if (Co == null || (newsEntry2 = (bVar = (com.vk.newsfeed.impl.presenters.b) Co).l) == null) {
            return;
        }
        p4r p4rVar = (p4r) bVar.e.getValue();
        UserId o = k9q0.o(newsEntry2);
        int n = di60.n(newsEntry2);
        String str = newsEntry2.Cb().b;
        MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action action = MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.CLICK_TO_DOTS;
        Integer valueOf = Integer.valueOf(n);
        p4rVar.getClass();
        p4r.d(action, o, valueOf, str, null);
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
        lfg lfgVar = this.C0;
        wx20 a2 = (lfgVar != null ? lfgVar : null).Ra(newsComment, new udg(z)).a(new zl3(this, newsComment, aaVar, 6));
        if (a2 != null) {
            Integer ko = ko();
            wx20.c(a2, context3, "post_view", 0, ko != null ? ko.intValue() : 0, 12);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final boolean L7() {
        return false;
    }

    @Override // xsna.d9c0
    public final s1c0 M0() {
        s1c0.a aVar = new s1c0.a();
        aVar.b = true;
        Bundle arguments = getArguments();
        boolean z = false;
        aVar.e = arguments != null && arguments.getBoolean("dismiss_on_opening_video", false);
        Bundle arguments2 = getArguments();
        aVar.d = arguments2 != null && arguments2.getBoolean("arg_show_only_comments", false);
        aVar.f = true;
        aVar.g = true;
        Bundle arguments3 = getArguments();
        aVar.h = arguments3 != null ? arguments3.getBoolean("should_show_reactions_panel", true) : true;
        Bundle arguments4 = getArguments();
        aVar.i = arguments4 != null ? arguments4.getBoolean("should_send_donut_button", true) : true;
        aVar.k = true;
        aVar.o = true;
        Bundle arguments5 = getArguments();
        aVar.m = arguments5 != null && arguments5.getBoolean("show_likes_info", true);
        Bundle arguments6 = getArguments();
        if (arguments6 != null && !arguments6.getBoolean("is_suggest_subscribe_allowed", true)) {
            z = true;
        }
        aVar.n = true ^ z;
        sf2 sf2Var = new sf2();
        sf2Var.b = mo2getContext();
        aVar.s = sf2Var.a();
        aVar.t = BuildInfo.r();
        aVar.u = ActionsMenuType.REDESIGN_AND_DISABLE;
        aVar.A = DonutAnalytics.DonutCustomTeaserScreen.DONUT_CONTENT_LINK;
        return aVar.a();
    }

    @Override // xsna.d9c0
    public final void Mj(Post post) {
        Activity h2;
        UserId userId;
        String str;
        String str2;
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null || (h2 = e3m.h(mo2getContext)) == null) {
            return;
        }
        vz70 a2 = rfc0.a();
        a2.n().a.putParcelable("newsEntry", post);
        Flags flags = post.l;
        a2.n().f();
        Owner owner = post.o;
        if (owner == null || (userId = owner.b) == null) {
            userId = UserId.d;
        }
        if (fkq0.d(userId)) {
            a2.n().h();
        } else {
            String str3 = (owner == null || (str2 = owner.c) == null) ? "" : str2;
            String str4 = (owner == null || (str = owner.e) == null) ? "" : str;
            boolean i = owner != null ? owner.i(2) : false;
            Group C0 = t6g0.b().C0(fkq0.e(userId));
            int i2 = C0 != null ? C0.s : 0;
            boolean i3 = owner != null ? owner.i(128) : false;
            boolean z = owner != null && owner.i(1024);
            a2.n().a();
            PostDonut postDonut = post.R;
            if (postDonut != null) {
                if (postDonut.d != null) {
                    a2.n().a.putBoolean("paywallDisabled", false);
                    i3 = true;
                }
                DonutPostingSettings donutPostingSettings = postDonut.f;
                if (donutPostingSettings != null) {
                    a2.n().a.putParcelable("donutEditingSettings", donutPostingSettings);
                }
                a2.n().a.putString("donutEditMode", postDonut.e);
            }
            a2.n().c(i2, fkq0.a(userId), str3, str4, i, i3, z);
        }
        if (post.oc()) {
            a2.n().a.putBoolean(BuildConfig.SDK_BUILD_FLAVOR, true);
        } else {
            a2.n().g();
        }
        if (!post.oc() || !epx.f(t11.b(), post.m)) {
            a2.n().i();
        }
        if (post.Lb() || flags.zb(16777216L)) {
            a2.n().b();
            if (flags.zb(16777216L)) {
                a2.n().a.putBoolean("commentsClosed", true);
            }
        }
        a2.n().d();
        a2.m();
        a2.i(PostingCreationEntryPoint.PostThreeDotMenuEditItem);
        a2.b.h(h2, 4328);
    }

    @Override // xsna.d9c0
    public final void P6(VideoFile videoFile) {
        dw20 dw20Var = this.G0;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.G0 = hd60.a().u1(activity, videoFile);
        }
    }

    @Override // xsna.d9c0
    public final void R1() {
        ho(200L, new w100(this, 24));
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void Rb(int i) {
        b2c0 b2c0Var = this.s0;
        if (b2c0Var == null) {
            b2c0Var = null;
        }
        super.Rb(b2c0Var.getItemCount() + i);
    }

    public void S2(NewsEntry newsEntry) {
        u3g0 Bf;
        u3g0 Bf2;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        m3g0 m3g0Var;
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.gl();
        }
        u3g0 Bf3 = Bf();
        if (Bf3 != null && (m3g0Var = Bf3.c) != null) {
            b3g0 b3g0Var = m3g0Var.b;
            n3g0 n3g0Var = m3g0Var.l;
            if (n3g0Var != null) {
                n3g0Var.b(b3g0Var.p());
                n3g0Var.f(b3g0Var.i0());
                n3g0Var.d(b3g0Var.f0());
                n3g0Var.a();
            }
        }
        b2c0 b2c0Var = this.s0;
        if (b2c0Var == null) {
            b2c0Var = null;
        }
        c9c0 Co = Co();
        b2c0Var.p.N = Co != null ? ((com.vk.newsfeed.impl.presenters.b) Co).h0() : false;
        PostViewFragmentTimeSpentTracker Do = Do();
        if (Do != null) {
            Do.c = newsEntry;
        }
        RecyclerPaginatedView recyclerPaginatedView2 = this.W;
        if (recyclerPaginatedView2 != null && (recyclerView2 = recyclerPaginatedView2.getRecyclerView()) != null) {
            recyclerView2.post(new qye(10, this, recyclerView2));
        }
        lfg lfgVar = this.C0;
        if (lfgVar == null) {
            lfgVar = null;
        }
        if (lfgVar.w) {
            y2();
        } else {
            k0();
        }
        this.K0 = new GestureDetector(getActivity(), this.L0);
        RecyclerPaginatedView recyclerPaginatedView3 = this.W;
        if (recyclerPaginatedView3 != null && (recyclerView = recyclerPaginatedView3.getRecyclerView()) != null) {
            recyclerView.addOnItemTouchListener(new j9c0(this));
        }
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("PostViewFrgament.show_keyboard", false) && (Bf2 = Bf()) != null) {
            c3g0.gg(Bf2, null, 3);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || arguments2.getBoolean("show_writebar_attach", true) || (Bf = Bf()) == null) {
            return;
        }
        Bf.l();
    }

    @Override // xsna.d9c0
    public final void S8() {
        RecyclerView recyclerView;
        mzp0 mzp0Var = this.J;
        if (mzp0Var != null) {
            mzp0Var.f();
        }
        On().stop();
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.fj(null, new a());
        }
        RecyclerPaginatedView recyclerPaginatedView2 = this.W;
        if (recyclerPaginatedView2 == null || (recyclerView = recyclerPaginatedView2.getRecyclerView()) == null) {
            return;
        }
        recyclerView.post(new v9j(5, this, recyclerView));
        this.w0.c();
    }

    public void V4() {
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.e0();
        }
    }

    @Override // xsna.d9c0
    public final boolean Yc(NewsEntry newsEntry) {
        VkTopBar vkTopBar = this.o0;
        if (vkTopBar == null) {
            return true;
        }
        Io(vkTopBar.getContext(), new a.AbstractC1374a.C1375a(zjq.n(vkTopBar.getRightMainRect()), vkTopBar), newsEntry);
        return true;
    }

    public void Ym() {
        m mVar = new m(new lmk(this, 1));
        asu0.a.getClass();
        eo(itg0.l(mVar.q(asu0.m())));
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public boolean a0() {
        Activity h2;
        if (super.a0()) {
            return true;
        }
        if (!this.I0.g(kn())) {
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
        recyclerView.post(new kgb(6, this, recyclerView));
        this.w0.g(recyclerView);
    }

    @Override // xsna.d9c0
    public final void a7(VideoFile videoFile) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(videoFile.w9().Ab(VideoUrl.EXTERNAL_URL)));
        Iterator<ResolveInfo> it = activity.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (true) {
            if (!it.hasNext()) {
                intent.addFlags(268435456);
                break;
            }
            ResolveInfo next = it.next();
            if (epx.f(next.activityInfo.packageName, "com.google.android.youtube")) {
                ActivityInfo activityInfo = next.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
                break;
            }
        }
        startActivityForResult(intent, 10500);
        activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    @Override // xsna.bfg
    public final void bm(int i) {
        vdg vdgVar = this.t0;
        if (vdgVar == null) {
            vdgVar = null;
        }
        vdgVar.i = i;
    }

    @Override // xsna.d9c0
    public final void c4() {
        this.u0.notifyDataSetChanged();
    }

    @Override // xsna.bfg
    public final void eg(NewsComment newsComment) {
        vdg vdgVar = this.t0;
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
            b2c0 b2c0Var = this.s0;
            so(new g9c0(this, (b2c0Var != null ? b2c0Var : null).E0() + i, 0));
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
        vdg vdgVar = this.t0;
        if (vdgVar == null) {
            vdgVar = null;
        }
        cbg cbgVar = (cbg) vdgVar.c.c(i);
        Integer valueOf = (cbgVar == null || (iagVar = cbgVar.a) == null) ? null : Integer.valueOf(iagVar.getId());
        if (valueOf != null) {
            vdg vdgVar2 = this.t0;
            if (vdgVar2 == null) {
                vdgVar2 = null;
            }
            vdgVar2.i = valueOf.intValue();
        }
        b2c0 b2c0Var = this.s0;
        int itemCount = (b2c0Var != null ? b2c0Var : null).getItemCount() + i;
        if (itemCount < s || itemCount > w) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.o(new RecyclerView.l.a() { // from class: xsna.h9c0
                    @Override // androidx.recyclerview.widget.RecyclerView.l.a
                    public final void a() {
                        String[] strArr = PostViewFragment.T0;
                        PostViewFragment.this.Rb(i);
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
        b2c0 b2c0Var = this.s0;
        if (b2c0Var == null) {
            b2c0Var = null;
        }
        return b2c0Var.getItemCount();
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

    public void in() {
        u3g0 Bf = Bf();
        if (Bf != null) {
            Bf.in();
        }
    }

    @Override // xsna.d9c0
    public final void invalidateOptionsMenu() {
        zo();
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final int mo() {
        return Math.max(0, this.u0.getItemCount() - 1);
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void nf() {
        vdg vdgVar = this.t0;
        if (vdgVar == null) {
            vdgVar = null;
        }
        vdgVar.N0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Target target;
        Post post;
        Integer num;
        u3g0 Bf;
        super.onActivityResult(i, i2, intent);
        if (i > 10000 && (Bf = Bf()) != null) {
            Bf.n(i, i2, intent);
        }
        if (i == 4329 && i2 == -1) {
            if (intent == null || (post = (Post) intent.getParcelableExtra("comment")) == null || (num = post.u) == null) {
                return;
            }
            int intValue = num.intValue();
            lfg lfgVar = this.C0;
            if (lfgVar == null) {
                lfgVar = null;
            }
            lfgVar.s8(post.s, post.z, intValue);
        }
        if (i != 4331 || i2 != -1 || intent == null || (target = (Target) intent.getParcelableExtra("result_target")) == null) {
            return;
        }
        lfg lfgVar2 = this.C0;
        (lfgVar2 != null ? lfgVar2 : null).b8(target);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c9c0 Co = Co();
        if (Co != null) {
            ((com.vk.newsfeed.impl.presenters.b) Co).Y0(configuration);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IntentFilter intentFilter = new IntentFilter();
        for (int i = 0; i < 5; i++) {
            intentFilter.addAction(T0[i]);
        }
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String str = hf8.a;
        PostViewFragment$receiver$1 postViewFragment$receiver$1 = this.J0;
        anj.d(context, postViewFragment$receiver$1, intentFilter, str, 4);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction(zou.a);
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        cuz.a(context2).b(postViewFragment$receiver$1, intentFilter2);
        ce60.b.getClass();
        p870.f().b(101, Co());
        p870.f().b(102, Co());
        p870.f().a(102, 100, Co());
        p870.f().b(104, Co());
        p870.f().b(100, Co());
        p870.f().b(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, Co());
        p870.f().b(125, Co());
        p870.f().b(113, Co());
        p870.f().a(113, 100, Co());
        p870.f().b(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Co());
        p870.f().b(120, Co());
        p870.f().b(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Co());
        p870.f().b(130, Co());
        p870.f().b(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, Co());
        p870 f2 = p870.f();
        lfg lfgVar = this.C0;
        if (lfgVar == null) {
            lfgVar = null;
        }
        f2.b(116, lfgVar);
        p870 f3 = p870.f();
        lfg lfgVar2 = this.C0;
        if (lfgVar2 == null) {
            lfgVar2 = null;
        }
        f3.b(9, lfgVar2);
        p870 f4 = p870.f();
        lfg lfgVar3 = this.C0;
        if (lfgVar3 == null) {
            lfgVar3 = null;
        }
        f4.b(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, lfgVar3);
        p870.f().b(134, Co());
        p870.f().b(VersionConstants.PRODUCT_MAJOR_VERSION, Co());
        p870 f5 = p870.f();
        lfg lfgVar4 = this.C0;
        if (lfgVar4 == null) {
            lfgVar4 = null;
        }
        f5.b(VersionConstants.PRODUCT_MAJOR_VERSION, lfgVar4);
        p870.f().b(147, Co());
        p870 f6 = p870.f();
        lfg lfgVar5 = this.C0;
        if (lfgVar5 == null) {
            lfgVar5 = null;
        }
        f6.b(147, lfgVar5);
        p870.f().b(149, Co());
        p870.f().b(150, Co());
        p870.f().b(151, Co());
        t6g0 t6g0Var = t6g0.b;
        t6g0.d().h();
        b2c0 b2c0Var = this.s0;
        if (b2c0Var == null) {
            b2c0Var = null;
        }
        a920 a920Var = this.u0;
        a920Var.K0(b2c0Var);
        vdg vdgVar = this.t0;
        if (vdgVar == null) {
            vdgVar = null;
        }
        a920Var.K0(vdgVar);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("referrer", "");
            this.H0 = string;
            vdg vdgVar2 = this.t0;
            if (vdgVar2 == null) {
                vdgVar2 = null;
            }
            vdgVar2.j = string;
        }
        if (!Bo()) {
            mzp0 mzp0Var = this.J;
            if (mzp0Var != null) {
                mzp0Var.f();
            }
            this.J = null;
            On().stop();
            this.L = null;
        }
        if (brm0.B(this.H0, "club", false) || brm0.B(this.H0, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, false)) {
            this.R0 = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerPaginatedView recyclerPaginatedView;
        RecyclerView recyclerView;
        final RecyclerView recyclerView2;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        FragmentActivity activity = getActivity();
        this.M0 = activity != null ? new pjb0(activity, (u2b0) this.O0.getValue()) : null;
        this.o0 = (VkTopBar) onCreateView.findViewById(com.vkontakte.android.R.id.toolbar);
        this.p0 = onCreateView.findViewById(com.vkontakte.android.R.id.post_view_shadow);
        this.U = (ViewGroup) onCreateView.findViewById(com.vkontakte.android.R.id.bottom_sheet_container);
        ym(false);
        RecyclerPaginatedView recyclerPaginatedView2 = this.W;
        if (recyclerPaginatedView2 != null && (recyclerView2 = recyclerPaginatedView2.getRecyclerView()) != null) {
            yo(recyclerView2);
            if (com.vk.toggle.d.i()) {
                recyclerView2.addItemDecoration(((Boolean) this.S0.getValue()).booleanValue() ? new x0n(recyclerView2) : new v0n(recyclerView2));
                final n0n n0nVar = new n0n();
                recyclerView2.setOnHoverListener(new View.OnHoverListener() { // from class: xsna.e9c0
                    @Override // android.view.View.OnHoverListener
                    public final boolean onHover(View view, MotionEvent motionEvent) {
                        String[] strArr = PostViewFragment.T0;
                        return n0n.this.a(recyclerView2, motionEvent);
                    }
                });
            }
            yrn yrnVar = new yrn(m33.a(com.vkontakte.android.R.drawable.archived_comment_divider, requireContext()), iah0.a(8.0f));
            yrnVar.m = new f9c0();
            recyclerView2.addItemDecoration(yrnVar);
            recyclerView2.setItemAnimator(null);
        }
        Eo();
        View view = this.Y;
        if (view != null) {
            jjc.g(view, new o440(this, 14));
        }
        setHasOptionsMenu(true);
        hbt0 Ao = Ao();
        if (Ao != null && (recyclerPaginatedView = this.W) != null && (recyclerView = recyclerPaginatedView.getRecyclerView()) != null) {
            recyclerView.addOnScrollListener(Ao);
        }
        return onCreateView;
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onDestroy() {
        c9c0 Co;
        if (!isStateSaved() && (Co = Co()) != null) {
            ((com.vk.newsfeed.impl.presenters.b) Co).z();
        }
        c9c0 Co2 = Co();
        if (Co2 != null) {
            ((com.vk.newsfeed.impl.presenters.b) Co2).onDestroy();
        }
        lfg lfgVar = this.C0;
        if (lfgVar == null) {
            lfgVar = null;
        }
        lfgVar.onDestroy();
        ce60.b.getClass();
        p870.f().g(Co());
        p870 f2 = p870.f();
        lfg lfgVar2 = this.C0;
        if (lfgVar2 == null) {
            lfgVar2 = null;
        }
        f2.g(lfgVar2);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        PostViewFragment$receiver$1 postViewFragment$receiver$1 = this.J0;
        enj.s(context, postViewFragment$receiver$1);
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        cuz.a(context2).d(postViewFragment$receiver$1);
        npu.a().a = null;
        super.onDestroy();
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view;
        FragmentActivity activity;
        RecyclerPaginatedView recyclerPaginatedView;
        RecyclerView recyclerView;
        this.o0 = null;
        hbt0 Ao = Ao();
        if (Ao != null && (recyclerPaginatedView = this.W) != null && (recyclerView = recyclerPaginatedView.getRecyclerView()) != null) {
            recyclerView.removeOnScrollListener(Ao);
        }
        if ((getActivity() instanceof PostingAttachActivity) && (view = getView()) != null && (activity = getActivity()) != null) {
            int i = this.N0;
            p90.c(activity, view, i, l8g.d(i));
        }
        hl60 hl60Var = hl60.a;
        hl60.b();
        u3g0 Bf = Bf();
        if (Bf != null) {
            Bf.onDestroyView();
        }
        super.onDestroyView();
        this.v0.c.clear();
        this.w0.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        c9c0 Co = Co();
        if (Co != null) {
            return ((com.vk.newsfeed.impl.presenters.b) Co).i1(menuItem.getItemId());
        }
        return false;
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onPause() {
        WriteBar writeBar;
        z0y0 z0y0Var;
        u3g0 Bf = Bf();
        if (Bf != null && (writeBar = Bf.e) != null) {
            y0y0 y0y0Var = writeBar.D;
            if (y0y0Var.c(null) && (z0y0Var = y0y0Var.d) != null) {
                y0y0Var.c.getInputState();
                z0y0Var.a(false, true);
            }
        }
        this.B0.pause();
        hl60 hl60Var = hl60.a;
        hl60.b();
        this.y0.a.a();
        PostViewFragmentTimeSpentTracker Do = Do();
        if (Do != null) {
            long a2 = qni0.a();
            EmptyList emptyList = EmptyList.b;
            for (PostViewFragmentTimeSpentTracker.SectionType sectionType : PostViewFragmentTimeSpentTracker.SectionType.values()) {
                emptyList.getClass();
                Do.b(sectionType, a2, false);
            }
        }
        this.w0.h();
        super.onPause();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onResume() {
        RecyclerView recyclerView;
        PostViewFragmentTimeSpentTracker Do;
        FragmentActivity activity;
        Window window;
        super.onResume();
        l7v b2 = pla.e().b();
        HintId hintId = HintId.BADGES_POST_FEED_NO_BADGES_UNSEEN;
        if (b2.a(hintId.getId())) {
            String id = hintId.getId();
            RecyclerPaginatedView recyclerPaginatedView = this.W;
            if (recyclerPaginatedView != null) {
                recyclerPaginatedView.post(new x6q(5, this, id));
            }
        }
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null) {
            this.B0.a(mo2getContext);
        }
        if (getActivity() instanceof PostingAttachActivity) {
            FragmentActivity activity2 = getActivity();
            this.N0 = (activity2 == null || (window = activity2.getWindow()) == null) ? 0 : window.getStatusBarColor();
            View view = getView();
            if (view != null && (activity = getActivity()) != null) {
                int c2 = dhr0.t.c(com.vkontakte.android.R.attr.vk_ui_header_background);
                p90.c(activity, view, c2, l8g.d(c2));
            }
        }
        Ym();
        RecyclerPaginatedView recyclerPaginatedView2 = this.W;
        if (recyclerPaginatedView2 != null && (recyclerView = recyclerPaginatedView2.getRecyclerView()) != null && (Do = Do()) != null) {
            Do.a(recyclerView);
        }
        this.w0.f();
        go(new os30(this, 14));
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        c9c0 Co = Co();
        if (Co != null) {
            k1c0 k1c0Var = ((com.vk.newsfeed.impl.presenters.b) Co).T;
            k1c0Var.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("invite_banner_status", k1c0Var.a);
            bundle2.putParcelableArrayList("invite_banner_requests", p4g.q(k1c0Var.b));
            bundle.putBundle("invite_banner_state", bundle2);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        b2c0 b2c0Var = this.s0;
        if (b2c0Var == null) {
            b2c0Var = null;
        }
        c9c0 Co = Co();
        b2c0Var.q = Co != null ? ((com.vk.newsfeed.impl.presenters.b) Co).u : null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        CoownershipStatusUiDto coownershipStatusUiDto;
        Object obj;
        super.onViewCreated(view, bundle);
        Go(view);
        q530 f2 = up2.f(m7m.d(this), requireContext(), this);
        b2c0 b2c0Var = this.s0;
        ArrayList arrayList = null;
        if (b2c0Var == null) {
            b2c0Var = null;
        }
        b2c0Var.N0(f2);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("has_similar_posts_action_bar_button", false)) {
            b2c0 b2c0Var2 = this.s0;
            if (b2c0Var2 == null) {
                b2c0Var2 = null;
            }
            b2c0Var2.l = new qs6(this, 29);
        }
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.setAdapter(this.u0);
        }
        Fo(view, bundle);
        c9c0 Co = Co();
        if (Co != null) {
            k1c0 k1c0Var = ((com.vk.newsfeed.impl.presenters.b) Co).T;
            k1c0Var.getClass();
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("invite_banner_state");
                if (bundle2 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        obj = bundle2.getSerializable("invite_banner_status", CoownershipStatusUiDto.class);
                    } else {
                        Object serializable = bundle2.getSerializable("invite_banner_status");
                        if (!(serializable instanceof CoownershipStatusUiDto)) {
                            serializable = null;
                        }
                        obj = (CoownershipStatusUiDto) serializable;
                    }
                    coownershipStatusUiDto = (CoownershipStatusUiDto) obj;
                } else {
                    coownershipStatusUiDto = null;
                }
                if (bundle2 != null) {
                    arrayList = Build.VERSION.SDK_INT >= 33 ? bundle2.getParcelableArrayList("invite_banner_requests", NewsfeedCoowners.CoownerRequest.class) : bundle2.getParcelableArrayList("invite_banner_requests");
                }
                if (coownershipStatusUiDto != null && arrayList != null) {
                    ArrayList q = p4g.q(arrayList);
                    if (k1c0Var.a == CoownershipStatusUiDto.None) {
                        k1c0Var.b = q;
                    }
                    k1c0Var.a = coownershipStatusUiDto;
                }
            }
        }
        zo();
        c9c0 Co2 = Co();
        if (Co2 != null) {
            ((com.vk.newsfeed.impl.presenters.b) Co2).I1(getArguments());
        }
        RecyclerPaginatedView recyclerPaginatedView2 = this.W;
        if (recyclerPaginatedView2 != null && (recyclerView2 = recyclerPaginatedView2.getRecyclerView()) != null) {
            recyclerView2.addOnScrollListener(new c());
        }
        this.v0.c.add(new l9c0());
        this.w0.a(new k9c0(this), NewsEntryWatcherMode.FAST);
        RecyclerPaginatedView recyclerPaginatedView3 = this.W;
        if (recyclerPaginatedView3 == null || (recyclerView = recyclerPaginatedView3.getRecyclerView()) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new m9c0(this));
    }

    @Override // xsna.d9c0
    public final void pa() {
        RecyclerView recyclerView;
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        recyclerView.post(new xq8(4, this, recyclerView));
        this.w0.c();
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public View ro(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(com.vkontakte.android.R.layout.fragment_post_view, viewGroup, false);
    }

    @Override // xsna.d9c0
    public final void setTitle(int i) {
        String string = getString(i);
        if (epx.f(this.q0, string)) {
            return;
        }
        this.q0 = string;
        zo();
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void wf(int i) {
        b2c0 b2c0Var = this.s0;
        if (b2c0Var == null) {
            b2c0Var = null;
        }
        uo(b2c0Var.getItemCount() + i, 0);
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public boolean wo(int i) {
        c9c0 Co = Co();
        return i < (Co != null ? ((com.vk.newsfeed.impl.presenters.b) Co).u4() : 0);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        c9c0 Co = Co();
        if (Co != null) {
            ((com.vk.newsfeed.impl.presenters.b) Co).r1(uiTrackingScreen);
        }
        PostViewFragmentTimeSpentTracker Do = Do();
        if (Do != null) {
            Do.d = uiTrackingScreen.a;
        }
    }

    @Override // xsna.d9c0
    public final void ym(boolean z) {
        if (this.r0 != z) {
            this.r0 = z;
            zo();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public void yo(RecyclerView recyclerView) {
        yrn yrnVar = new yrn(new ColorDrawable(dhr0.t.c(com.vkontakte.android.R.attr.vk_ui_separator_primary_alpha)), getResources().getDimensionPixelSize(com.vkontakte.android.R.dimen.toolbar_separator_height));
        yrnVar.o = gbg0.a(getResources(), 16.0f);
        yrnVar.m = Co();
        recyclerView.addItemDecoration(this.P0);
        recyclerView.addItemDecoration((j2c0) this.Q0.getValue());
        recyclerView.addItemDecoration(yrnVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public boolean z(rdg rdgVar) {
        boolean z = rdgVar instanceof rdg.d;
        ?? r1 = this.x0;
        if (z) {
            View findViewById = ((rdg.d) rdgVar).a.itemView.findViewById(com.vkontakte.android.R.id.comment_author_liked_photo);
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
        Ym();
        return true;
    }

    public final void zo() {
        VkTopBar.a.d a2;
        VkTopBar vkTopBar = this.o0;
        if (vkTopBar == null) {
            return;
        }
        vkTopBar.setContentDescription(this.q0);
        int i = 16;
        if (h3p0.a(this)) {
            Context context = vkTopBar.getContext();
            HashSet hashSet = iah0.a;
            if (!fnj.d(context)) {
                vkTopBar.setBack(new VkTopBar.b(new u210(this, i), null, null, null, com.vk.core.compose.component.semantics.b.a(SemanticsConfiguration.Mode.ClearAndSet, new pb00(this, i), 2), 14));
            }
        }
        VkTopBar.Middle.Text.Title title = new VkTopBar.Middle.Text.Title(oq.d(tlo0.Companion, this.q0), new tzv(this, 27), null, null, null, 28);
        VkTopBar.Middle.Text.c cVar = this.r0 ? new VkTopBar.Middle.Text.c(new tlo0.f(com.vkontakte.android.R.string.archive_post_subtitle), null, null, 30) : null;
        SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(title, cVar, null, com.vk.core.compose.component.semantics.b.a(mode, new mgz(this, 23), 2), 4));
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("has_similar_posts_action_bar_button", false)) {
            String string = getString(com.vkontakte.android.R.string.accessibility_actions);
            a2 = VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(com.vkontakte.android.R.drawable.vk_icon_more_vertical_24), new tlo0.h(string), new jw30(this, i), null, null, com.vk.core.compose.component.semantics.b.a(mode, new u17(string, 1), 2), 24), null, 6);
        } else {
            a2 = VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(com.vkontakte.android.R.drawable.vk_icon_stars_outline_28), new tlo0.f(com.vkontakte.android.R.string.similar_posts_title), new v100(this, 20), null, null, null, 56), null, 6);
        }
        vkTopBar.setAfter(a2);
    }

    @Override // xsna.d9c0
    public void Ae() {
    }

    public void Jo() {
    }

    @Override // xsna.d9c0
    public void le() {
    }

    /* compiled from: PostViewFragment.kt */
    public static final class f implements o2u0 {
        @Override // xsna.o2u0
        public final void F2(String str) {
        }

        @Override // xsna.o2u0
        public final void a(io.reactivex.rxjava3.disposables.c cVar) {
        }

        @Override // xsna.o2u0
        public final void fg(NewsEntry newsEntry, NewsEntry newsEntry2, int i) {
        }
    }

    public void hk(int i) {
    }

    @Override // xsna.d9c0
    public final void rd(boolean z) {
    }

    /* compiled from: PostViewFragment.kt */
    public static final class g implements id60 {
        @Override // xsna.id60
        public final void a(UserId userId, boolean z) {
        }
    }
}
