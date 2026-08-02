package com.vk.profile.community.impl.ui.profile;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.community.design.compose.topbar.PassthroughThemedComposeView;
import com.vk.community.design.view.cover.CommunityStaticCover;
import com.vk.core.fragments.FragmentImpl;
import com.vk.movika.sdk.base.ui.j;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.util.CommunityProfileLayoutManager;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.search.integration.api.SearchTab;
import com.vk.toggle.features.SearchFeatures;
import com.vkontakte.android.R;
import defpackage.e0;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ajh;
import xsna.aq0;
import xsna.asu0;
import xsna.auh;
import xsna.b3i;
import xsna.bwt0;
import xsna.c9b;
import xsna.d5h;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.euh;
import xsna.f4m;
import xsna.f5z;
import xsna.f8h;
import xsna.fnj;
import xsna.gjf0;
import xsna.gm50;
import xsna.guh;
import xsna.gvh;
import xsna.gzs;
import xsna.hg6;
import xsna.hmp0;
import xsna.hoh;
import xsna.htq0;
import xsna.iah0;
import xsna.iax;
import xsna.if6;
import xsna.ja5;
import xsna.jf6;
import xsna.jpf;
import xsna.js1;
import xsna.kbe;
import xsna.kpg;
import xsna.m0z;
import xsna.mph;
import xsna.msy;
import xsna.mzp0;
import xsna.n0z;
import xsna.nbs;
import xsna.o0z;
import xsna.oog0;
import xsna.p0z;
import xsna.qth;
import xsna.s200;
import xsna.s3q0;
import xsna.seh;
import xsna.sfg;
import xsna.soh;
import xsna.we6;
import xsna.wih;
import xsna.ww50;
import xsna.xdr0;
import xsna.xeh;
import xsna.y2h;
import xsna.y89;
import xsna.ynh;
import xsna.yrn;
import xsna.ysg0;
import xsna.yte;
import xsna.yve;
import xsna.yw90;
import xsna.zah;
import xsna.zth;
import xsna.zvw;

/* compiled from: CommunityProfileView.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes5.dex */
public final class f implements gm50 {
    public final qth A;
    public final ysg0<ajh> B;
    public final mph C;
    public final y2h D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final hmp0 H;
    public final com.vk.profile.community.impl.ui.profile.b b;
    public final iax c;
    public final soh d;
    public final mzp0 e;
    public final yw90 f;
    public final CommunityProfileFragment.c g;
    public final f5z h;
    public final boolean i;
    public final p0z j;
    public final View k;
    public final RecyclerView l;
    public final FrameLayout m;
    public final Object n;
    public final SwipeRefreshLayout o;
    public final ComposeView p;
    public final com.vk.lists.a<we6> q;
    public final View r;
    public final View s;
    public final xeh t;
    public final PassthroughThemedComposeView u;
    public final euh v;
    public final seh w;
    public final CommunityStaticCover x;
    public final zth y;
    public final auh z;

    /* compiled from: CommunityProfileView.kt */
    public static final class a extends m.e<we6> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(we6 we6Var, we6 we6Var2) {
            we6 we6Var3 = we6Var;
            we6 we6Var4 = we6Var2;
            if ((we6Var3 instanceof d5h) && (we6Var4 instanceof d5h)) {
                return epx.f(((d5h) we6Var3).l, ((d5h) we6Var4).l);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(we6 we6Var, we6 we6Var2) {
            return we6Var.h() == we6Var2.h();
        }
    }

    /* compiled from: CommunityProfileView.kt */
    public final class b implements View.OnTouchListener {
        public final GestureDetector b;

        /* compiled from: CommunityProfileView.kt */
        public static final class a extends GestureDetector.SimpleOnGestureListener {
            public final /* synthetic */ f b;

            public a(f fVar) {
                this.b = fVar;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                CommunityStaticCover communityStaticCover = this.b.x;
                if (communityStaticCover != null && motionEvent.getY() < communityStaticCover.getHeight() && communityStaticCover.getAlpha() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return communityStaticCover.performClick();
                }
                return false;
            }
        }

        public b(Context context) {
            this.b = new GestureDetector(context, new a(f.this));
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            p0z p0zVar = f.this.j;
            p0zVar.getClass();
            p0zVar.getClass();
            if (motionEvent != null) {
                return this.b.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* compiled from: CommunityProfileView.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CommunityProfileContent.InitialPosition.ScrollToContentType.values().length];
            try {
                iArr[CommunityProfileContent.InitialPosition.ScrollToContentType.SMOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityProfileContent.InitialPosition.ScrollToContentType.BASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityProfileContent.InitialPosition.ScrollToContentType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SearchTab.values().length];
            try {
                iArr2[SearchTab.VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SearchTab.WALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: CommunityProfileView.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((f) this.receiver).d.a(new CommunityProfileAction.g.d.f(false));
            return s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
    public f(Context context, f5z f5zVar, io.reactivex.rxjava3.disposables.b bVar, com.vk.profile.community.impl.ui.profile.b bVar2, ynh ynhVar, zah zahVar, b3i b3iVar, iax iaxVar, soh sohVar, mzp0 mzp0Var, yw90 yw90Var, boolean z, CommunityProfileFragment.b bVar3, CommunityProfileFragment.c cVar) {
        this.b = bVar2;
        this.c = iaxVar;
        this.d = sohVar;
        this.e = mzp0Var;
        this.f = yw90Var;
        this.g = cVar;
        this.h = f5zVar;
        SearchFeatures searchFeatures = SearchFeatures.SEARCH_INSIDE_COMMUNITY;
        searchFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(searchFeatures);
        this.i = a2;
        p0z p0zVar = new p0z();
        this.j = p0zVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.community_profile_fragment, (ViewGroup) null);
        this.k = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.community_profile_recycler);
        this.l = recyclerView;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.community_profile_search_fragment);
        this.m = frameLayout;
        this.n = msy.a(LazyThreadSafetyMode.NONE, new e0(7, ynhVar, this));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.community_profile_swipe_refresh);
        this.o = swipeRefreshLayout;
        this.p = (ComposeView) inflate.findViewById(R.id.community_profile_item_content_error);
        com.vk.lists.a<we6> aVar = new com.vk.lists.a<>(new a());
        this.q = aVar;
        zvw zvwVar = new zvw((hg6) aVar);
        View findViewById = inflate.findViewById(R.id.community_profile_statusbar_bg);
        this.r = findViewById;
        View findViewById2 = inflate.findViewById(R.id.progress_bar);
        this.s = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.community_profile_skeleton);
        if (findViewById3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.t = new m0z(findViewById3, findViewById, findViewById2, inflate.findViewById(R.id.community_profile_lego_skeleton));
        PassthroughThemedComposeView passthroughThemedComposeView = (PassthroughThemedComposeView) inflate.findViewById(R.id.community_profile_top_bar_compose_view);
        this.u = passthroughThemedComposeView;
        ja5 ja5Var = new ja5(0, 0);
        o0z o0zVar = new o0z(new guh(passthroughThemedComposeView, ((htq0) ynhVar.M.getValue()).h, z, a2, new y89(1, sohVar, kpg.class, "send", "send(Lcom/vk/mvi/core/data/MviAction;)V", 0, 3)));
        this.v = o0zVar;
        int i = 1;
        this.w = new seh((ViewStub) inflate.findViewById(R.id.community_profile_blocked_view), ynhVar.e(), new hoh(i, sohVar, kpg.class, "send", "send(Lcom/vk/mvi/core/data/MviAction;)V", 0, 1));
        CommunityStaticCover communityStaticCover = (CommunityStaticCover) inflate.findViewById(R.id.community_profile_static_cover);
        this.x = communityStaticCover;
        zth zthVar = new zth(communityStaticCover, recyclerView, new kbe(this, 8));
        this.y = zthVar;
        FragmentImpl fragmentImpl = bVar2.a;
        auh auhVar = new auh(fragmentImpl, inflate.findViewById(R.id.community_profile_statusbar_bg));
        this.z = auhVar;
        this.A = new n0z(recyclerView, zthVar, o0zVar, auhVar, new aq0(10));
        ysg0<ajh> ysg0Var = new ysg0<>();
        this.B = ysg0Var;
        this.C = new mph(aVar, ynhVar, bVar2, zahVar, b3iVar, new mph.a(o0zVar, auhVar), bVar, new nbs(fragmentImpl.D).getLifecycle(), fragmentImpl.getViewLifecycleOwner(), ysg0Var.a, bVar3, new yte(i, sohVar, kpg.class, "send", "send(Lcom/vk/mvi/core/data/MviAction;)V", 0, 2), ja5Var, p0zVar);
        y2h y2hVar = new y2h();
        this.D = y2hVar;
        gvh gvhVar = new gvh(this);
        this.F = true;
        this.G = true;
        CommunityProfileLayoutManager communityProfileLayoutManager = new CommunityProfileLayoutManager(context);
        this.H = new hmp0(inflate, new jpf(this, 5));
        recyclerView.setLayoutManager(communityProfileLayoutManager);
        recyclerView.setAdapter(zvwVar);
        recyclerView.setItemAnimator(null);
        recyclerView.setClipToPadding(false);
        recyclerView.setOverScrollMode(2);
        recyclerView.addOnScrollListener(gvhVar);
        oog0 oog0Var = new oog0(iah0.b(18.0f), iah0.a(8), zvwVar);
        oog0Var.n = false;
        recyclerView.addItemDecoration(oog0Var);
        recyclerView.addItemDecoration(y2hVar);
        sfg sfgVar = new sfg(this, 3);
        recyclerView.addItemDecoration(new if6.e(sfgVar));
        Context context2 = e43.a;
        yrn yrnVar = new yrn(R.attr.vk_ui_separator_primary_alpha, e3m.a(R.dimen.divider_width, context2 == null ? null : context2));
        yrnVar.n = true;
        yrnVar.m = new jf6(sfgVar);
        float f = 16;
        yrnVar.l(iah0.a(f), 0, iah0.a(f), 0);
        recyclerView.addItemDecoration(yrnVar);
        recyclerView.setOnTouchListener(new b(context));
        swipeRefreshLayout.setOnChildScrollUpCallback(new j(this, 11));
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xsna.fvh
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void h() {
                com.vk.profile.community.impl.ui.profile.f.this.d.a(new CommunityProfileAction.o(true));
            }
        });
        iaxVar.e(context, frameLayout);
        bVar.b(iaxVar.b().a0(asu0.a.d()).subscribe(new js1(new yve(this, 8), 20)));
        e();
    }

    public static final void a(f fVar, boolean z) {
        ww50 v = s200.v(fVar.k.getContext());
        xdr0 xdr0Var = v instanceof xdr0 ? (xdr0) v : null;
        if (xdr0Var != null) {
            xdr0Var.o0(z);
        }
    }

    public final Rect b(Rect rect) {
        final int i;
        ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = rect.bottom;
        }
        this.v.j(rect);
        this.z.b.getLayoutParams().height = rect.top;
        final qth qthVar = this.A;
        Integer num = qthVar.h;
        if (num != null) {
            int intValue = num.intValue();
            int i2 = rect.top;
            if (i2 != 0 && intValue != 0 && i2 != intValue && (i = intValue - i2) > 0) {
                qthVar.a.post(new Runnable() { // from class: xsna.pth
                    @Override // java.lang.Runnable
                    public final void run() {
                        qth.this.a.scrollBy(0, i);
                    }
                });
            }
        }
        qthVar.h = Integer.valueOf(rect.top);
        this.B.a(new ajh.c(rect));
        bwt0.f0(this.m, 0, this.u.getHeight() + rect.top, 0, 0, 13);
        rect.top = 0;
        return rect;
    }

    public final boolean c() {
        if (this.v.m()) {
            this.c.p();
            return true;
        }
        new d(0, this, f.class, "collapseExpandedLiveCover", "collapseExpandedLiveCover()V", 0);
        this.j.getClass();
        f8h f8hVar = this.b.f.f.b;
        if (f8hVar == null) {
            return false;
        }
        f8hVar.b(false);
        return true;
    }

    public final void d() {
        Iterator<we6> it = this.q.d.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            we6 next = it.next();
            if (i < 0) {
                e43.t();
                throw null;
            }
            if (next instanceof wih) {
                break;
            } else {
                i++;
            }
        }
        Integer valueOf = i == -1 ? null : Integer.valueOf(i);
        RecyclerView recyclerView = this.l;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (epx.f(linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.v()) : null, valueOf) || valueOf == null) {
            return;
        }
        recyclerView.smoothScrollToPosition(valueOf.intValue());
    }

    public final void e() {
        View view = this.k;
        Context context = view.getContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            int i = 1;
            int a2 = gjf0.a(view.getContext(), true);
            f4m.l(a2, a2, this.l);
            this.v.b(a2);
            CommunityStaticCover communityStaticCover = this.y.a;
            if (communityStaticCover != null) {
                bwt0.f0(communityStaticCover, a2, 0, a2, 0, 10);
            }
            this.t.b(a2);
            bwt0.S(this.u, new c9b(this, a2, i));
        }
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.h;
    }
}
