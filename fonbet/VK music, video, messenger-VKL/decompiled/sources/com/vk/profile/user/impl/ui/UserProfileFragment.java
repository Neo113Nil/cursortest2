package com.vk.profile.user.impl.ui;

import android.R;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.bridges.di.StickersBridgeComponent;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.view.components.topbar.a;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.fave.di.FaveComponent;
import com.vk.followersmode.api.di.FollowersModeComponent;
import com.vk.friends.api.di.FeedFriendsComponent;
import com.vk.im.ui.di.MaxUtilityComponent;
import com.vk.log.L;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.posting.di.PostingComponent;
import com.vk.profile.core.cover.ProfileCover;
import com.vk.profile.core.cover.a;
import com.vk.profile.user.api.data.UserProfileSkeletonParams;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.profile.user.api.di.UserProfileParamsComponent;
import com.vk.profile.user.api.domain.UserProfileMode;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.profile.user.impl.ui.f;
import com.vk.profile.user.impl.ui.g;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.profile.user.impl.ui.viewdelegates.SnowballsCoverHolder;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$TypeOpenProfileClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.subscription.api.di.SubscriptionComponent;
import com.vk.toggle.features.CoreFeatures;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.f0;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.mixed.o;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.utils.Logger;
import xsna.abg0;
import xsna.aeg0;
import xsna.ajh;
import xsna.anj;
import xsna.ao50;
import xsna.aq6;
import xsna.asl0;
import xsna.asu0;
import xsna.auq0;
import xsna.avq0;
import xsna.awt0;
import xsna.b0u0;
import xsna.b13;
import xsna.b1o0;
import xsna.b4s;
import xsna.b6f0;
import xsna.b960;
import xsna.bjc;
import xsna.bpn0;
import xsna.btq0;
import xsna.buq0;
import xsna.bvq0;
import xsna.bwt0;
import xsna.bzh0;
import xsna.c5e0;
import xsna.c960;
import xsna.cn70;
import xsna.ctn0;
import xsna.ctq0;
import xsna.cuz;
import xsna.cvq0;
import xsna.cwg0;
import xsna.cyn;
import xsna.d690;
import xsna.daz;
import xsna.dhr0;
import xsna.dsi0;
import xsna.dtq0;
import xsna.dul0;
import xsna.dvq0;
import xsna.dxn;
import xsna.dy2;
import xsna.e3m;
import xsna.e4;
import xsna.e43;
import xsna.epx;
import xsna.etq0;
import xsna.evq0;
import xsna.eyp0;
import xsna.f31;
import xsna.f4m;
import xsna.fhc0;
import xsna.fnj;
import xsna.fpf0;
import xsna.fpq0;
import xsna.fqq0;
import xsna.fxc0;
import xsna.fzd0;
import xsna.g13;
import xsna.ggb0;
import xsna.gjf0;
import xsna.gko;
import xsna.gm50;
import xsna.gpq0;
import xsna.gqh0;
import xsna.gqq0;
import xsna.gvq0;
import xsna.gxq0;
import xsna.h6m0;
import xsna.ha40;
import xsna.hbj0;
import xsna.hea0;
import xsna.hf8;
import xsna.hg1;
import xsna.hhj0;
import xsna.hlu0;
import xsna.hpq0;
import xsna.htq0;
import xsna.i6m0;
import xsna.iah0;
import xsna.ikk0;
import xsna.ipq0;
import xsna.irc0;
import xsna.iso0;
import xsna.itq0;
import xsna.iuq;
import xsna.iut0;
import xsna.izs;
import xsna.jcf0;
import xsna.je40;
import xsna.jlu0;
import xsna.jmq0;
import xsna.jnj0;
import xsna.jpq0;
import xsna.js6;
import xsna.jtq0;
import xsna.k4;
import xsna.k7m;
import xsna.kdg0;
import xsna.khc0;
import xsna.kld0;
import xsna.km50;
import xsna.koq0;
import xsna.kpq0;
import xsna.kqq0;
import xsna.ks2;
import xsna.ksb0;
import xsna.l36;
import xsna.lfa;
import xsna.lg4;
import xsna.loq0;
import xsna.lpj;
import xsna.lrv0;
import xsna.lyd0;
import xsna.lzh0;
import xsna.m5o0;
import xsna.m7m;
import xsna.mk50;
import xsna.mmm0;
import xsna.mpq0;
import xsna.msy;
import xsna.myc0;
import xsna.nbs;
import xsna.nh40;
import xsna.oga0;
import xsna.omq0;
import xsna.opq0;
import xsna.orq0;
import xsna.owd0;
import xsna.oz50;
import xsna.p870;
import xsna.p90;
import xsna.pnq0;
import xsna.pod0;
import xsna.q3s;
import xsna.q7a0;
import xsna.q7v0;
import xsna.qah0;
import xsna.qbc0;
import xsna.qfa0;
import xsna.qhh0;
import xsna.qmq0;
import xsna.qpq0;
import xsna.qvl0;
import xsna.r0e0;
import xsna.rl3;
import xsna.rlq0;
import xsna.rsr;
import xsna.rzl0;
import xsna.s0w0;
import xsna.s3q0;
import xsna.s520;
import xsna.slq0;
import xsna.std0;
import xsna.stq0;
import xsna.svk0;
import xsna.syk0;
import xsna.szf0;
import xsna.tb0;
import xsna.tfm0;
import xsna.tlo0;
import xsna.too0;
import xsna.tq;
import xsna.tsk0;
import xsna.tuq0;
import xsna.u2b0;
import xsna.uxb0;
import xsna.vc0;
import xsna.vif0;
import xsna.vk50;
import xsna.vlq0;
import xsna.vnq0;
import xsna.vpj0;
import xsna.vpq0;
import xsna.vtq0;
import xsna.vvd0;
import xsna.w8i;
import xsna.wod;
import xsna.wpq0;
import xsna.x150;
import xsna.x1e0;
import xsna.xn50;
import xsna.xsq0;
import xsna.xuq0;
import xsna.y1z;
import xsna.ye80;
import xsna.ynq0;
import xsna.yq1;
import xsna.yqq0;
import xsna.z4d0;

/* compiled from: UserProfileFragment.kt */
/* loaded from: classes5.dex */
public class UserProfileFragment extends MviImplFragment<fpq0, com.vk.profile.user.impl.ui.h, UserProfileAction> implements w8i, too0, qhh0, tb0, wod, owd0, szf0 {
    public static final /* synthetic */ int p0 = 0;
    public i Q;
    public final bpn0 V;
    public final Object Y;
    public final bpn0 Z;
    public final bpn0 a0;
    public final bpn0 b0;
    public final bpn0 c0;
    public final bpn0 d0;
    public final bpn0 e0;
    public final bpn0 f0;
    public final bpn0 g0;
    public final bpn0 h0;
    public final bpn0 i0;
    public final Object j0;
    public final UserProfileFragment$receiver$1 k0;
    public final h l0;
    public boolean m0;
    public final Object n0;
    public final b o0;
    public final UserProfileMode R = UserProfileMode.Profile;
    public final bpn0 S = new bpn0(new g13(25));
    public final nbs T = new nbs(this.D);
    public final bpn0 U = new bpn0(new ipq0(this, 0));
    public final bpn0 W = new bpn0(new kld0(this, 17));
    public final bpn0 X = new bpn0(new i6m0(this, 6));

    /* compiled from: UserProfileFragment.kt */
    public final class a implements avq0 {
        public a() {
        }

        @Override // xsna.avq0
        public final void a() {
            Window window;
            View decorView;
            UserProfileFragment userProfileFragment = UserProfileFragment.this;
            FragmentActivity activity = userProfileFragment.getActivity();
            if (activity != null) {
                p90.b(activity, userProfileFragment.requireContext().getColor(R.color.transparent), false);
            }
            FragmentActivity activity2 = userProfileFragment.getActivity();
            if (activity2 == null || (window = activity2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            awt0.e(8192, decorView);
        }

        @Override // xsna.avq0
        public final boolean b() {
            return UserProfileFragment.this.isVisible();
        }

        @Override // xsna.avq0
        public final void c() {
            Window window;
            View decorView;
            UserProfileFragment userProfileFragment = UserProfileFragment.this;
            FragmentActivity activity = userProfileFragment.getActivity();
            if (activity != null) {
                p90.b(activity, userProfileFragment.requireContext().getColor(R.color.transparent), false);
            }
            FragmentActivity activity2 = userProfileFragment.getActivity();
            if (activity2 == null || (window = activity2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            awt0.c(8192, decorView);
        }

        @Override // xsna.avq0
        public final boolean isEnabled() {
            if (UserProfileFragment.this.mo2getContext() == null) {
                return false;
            }
            HashSet hashSet = iah0.a;
            return !fnj.d(r0);
        }
    }

    /* compiled from: UserProfileFragment.kt */
    public static final class b extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class c implements izs {
        public static final c b = new c();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof asl0.a);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class d implements izs {
        public static final d b = new d();

        @Override // xsna.izs
        public final asl0.a invoke(Object obj) {
            if (obj != null) {
                return (asl0.a) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.story.api.di.StoriesEvent.AnimationBitmap");
        }
    }

    /* compiled from: UserProfileFragment.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: RxExt.kt */
    public static final class f implements izs {
        public static final f b = new f();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof asl0.b);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class g implements izs {
        public static final g b = new g();

        @Override // xsna.izs
        public final asl0.b invoke(Object obj) {
            if (obj != null) {
                return (asl0.b) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.story.api.di.StoriesEvent.AnimationReady");
        }
    }

    /* compiled from: UserProfileFragment.kt */
    public static final class h implements lrv0.a {
        public h() {
        }

        @Override // xsna.lrv0.a
        public final void xb() {
            if (UserProfileFragment.this.m0) {
                Intent intent = new Intent("request_update_bottom_theme_event");
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                cuz.a(context).c(intent);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [com.vk.profile.user.impl.ui.UserProfileFragment$receiver$1] */
    public UserProfileFragment() {
        int i = 13;
        this.V = new bpn0(new b6f0(this, i));
        x1e0 x1e0Var = new x1e0(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Y = msy.a(lazyThreadSafetyMode, x1e0Var);
        this.Z = new bpn0(new jcf0(this, i));
        this.a0 = new bpn0(new z4d0(this, 22));
        this.b0 = new bpn0(new tfm0(this, 8));
        this.c0 = new bpn0(new ye80(this, 27));
        this.d0 = new bpn0(new h6m0(this, 7));
        this.e0 = new bpn0(new ikk0(this, 7));
        this.f0 = new bpn0(new irc0(this, 21));
        this.g0 = new bpn0(new m5o0(this, 5));
        this.h0 = new bpn0(new qah0(this, 12));
        this.i0 = new bpn0(new qbc0(this, 23));
        this.j0 = msy.a(lazyThreadSafetyMode, new gqh0(this, 11));
        int i2 = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        this.k0 = new BroadcastReceiver() { // from class: com.vk.profile.user.impl.ui.UserProfileFragment$receiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                xn50.a.c(UserProfileFragment.this, new UserProfileAction.e(intent));
            }
        };
        this.l0 = new h();
        this.n0 = msy.a(lazyThreadSafetyMode, new daz(24));
        this.o0 = new b();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        kdg0 G2 = ((NewsFeedComponent) ((k7m) m7m.f(this)).a(fpf0.a(NewsFeedComponent.class))).G2();
        i iVar = new i(requireContext(), new hpq0(this), new khc0(this, 9), ho(), new opq0(this, (u2b0) this.S.getValue(), G2, this.J, On()), getViewLifecycleOwner(), new a(), jo() == UserProfileMode.Modal);
        this.Q = iVar;
        return lo(iVar.e);
    }

    @Override // xsna.szf0
    public final boolean Hg(Bundle bundle) {
        UserId userId = (UserId) bundle.getParcelable("id");
        Bundle arguments = getArguments();
        UserId userId2 = arguments != null ? (UserId) arguments.getParcelable("id") : null;
        if (bundle.getBoolean("to_edit_profile")) {
            return epx.f(userId, userId2) || epx.f(userId, UserId.d);
        }
        return false;
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((com.vk.profile.user.impl.ui.h) ao50Var).a, new mmm0(this, 6));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public FragmentImpl.a<lpj> Jn() {
        return this.o0;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        FragmentImpl.a<lpj> Jn = Jn();
        if (Jn != null) {
            Jn.b();
        }
        i iVar = this.Q;
        if (iVar == null) {
            iVar = null;
        }
        iVar.Ng();
        xn50.a.c(this, new UserProfileAction.x(null, 15));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        fpq0 fpq0Var = (fpq0) vk50Var;
        fpq0Var.R.a(new lfa(23, this, fpq0Var), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean Wn(Rect rect, Rect rect2) {
        i iVar = this.Q;
        if (iVar == null) {
            iVar = null;
        }
        com.vk.profile.user.impl.ui.a aVar = iVar.h;
        aVar.getClass();
        iVar.j.a(new ajh.c(rect2));
        s3q0 s3q0Var = s3q0.a;
        UserProfileHeaderView userProfileHeaderView = aVar.e;
        int i = rect2.top;
        f4m.y(i, userProfileHeaderView.A);
        int a2 = e3m.a(com.vkontakte.android.R.dimen.profile_header_button_vertical_margin, userProfileHeaderView.getContext()) + i;
        userProfileHeaderView.w = a2;
        com.vk.profile.core.cover.a aVar2 = userProfileHeaderView.t;
        com.vk.profile.core.cover.a aVar3 = aVar2 != null ? aVar2 : null;
        aVar3.j = a2;
        if (aVar3.q == ProfileCover.Mode.NONE) {
            f4m.y(a2, aVar3.d);
        }
        rect2.top = 0;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x038b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void fo(g.a aVar, boolean z, String str) {
        VkTopBar.a.c.f fVar;
        VkTopBar.a.c.f fVar2;
        s3q0 s3q0Var;
        int i;
        Pair pair;
        Pair pair2;
        boolean z2;
        Photo photo;
        Photo photo2;
        Photo photo3;
        VkTopBar.a.b.C0877b c0877b;
        i iVar = this.Q;
        if (iVar == null) {
            iVar = null;
        }
        com.vk.profile.user.impl.ui.a aVar2 = iVar.h;
        UserProfileHeaderView userProfileHeaderView = aVar2.e;
        hpq0 hpq0Var = aVar2.f;
        if (hpq0Var == null) {
            hpq0Var = null;
        }
        khc0 khc0Var = aVar2.g;
        if (khc0Var == null) {
            khc0Var = null;
        }
        VkTopBar vkTopBar = userProfileHeaderView.A;
        boolean z3 = aVar.d;
        ProfileCover profileCover = aVar.h;
        UserProfileMode userProfileMode = aVar.i;
        UserProfileMode userProfileMode2 = UserProfileMode.Profile;
        bwt0.p0(userProfileHeaderView, userProfileMode == userProfileMode2);
        if (profileCover != null) {
            profileCover.a();
        }
        userProfileHeaderView.v = new yq1(22, khc0Var, aVar);
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(aVar.a, (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14));
        SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
        com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(mode, new ha40(20), 2);
        if (z3) {
            fVar2 = new VkTopBar.a.c.f(new gko(com.vkontakte.android.R.drawable.vk_icon_more_vertical_28), tq.h(tlo0.Companion, com.vkontakte.android.R.string.user_profile_accessibility_dot_menu), new k4(19, hpq0Var, userProfileHeaderView), null, null, a2, 24);
        } else {
            g.a.C1728a c1728a = aVar.g;
            if (!c1728a.a) {
                fVar = null;
                if (fVar == null) {
                    g.a.b bVar = aVar.f;
                    int i2 = bVar.b;
                    if (bVar.a) {
                        VkTopBar.l.c cVar = i2 > 0 ? new VkTopBar.l.c(i2, VkCounter.CounterAppearance.Appearance.AccentRed, null, 12) : null;
                        gko.b bVar2 = gko.Companion;
                        c0877b = new VkTopBar.a.b.C0877b(new gko(com.vkontakte.android.R.drawable.vk_icon_services_outline_28), tq.h(tlo0.Companion, com.vkontakte.android.R.string.user_profile_accessibility_services), new hbj0(hpq0Var, 14), cVar, null, com.vk.core.compose.component.semantics.b.a(mode, new eyp0(2), 2), 16);
                    } else {
                        c0877b = null;
                    }
                    vkTopBar.setAfter(new VkTopBar.a.d(fVar, c0877b, aVar.e ? new VkTopBar.a.b.C0877b(new gko(com.vkontakte.android.R.drawable.vk_icon_search_outline_28), tq.h(tlo0.Companion, com.vkontakte.android.R.string.user_profile_toolbar_accessibility_search), new tsk0(hpq0Var, 14), null, null, com.vk.core.compose.component.semantics.b.a(mode, new b1o0(2), 2), 24) : null));
                    s3q0Var = s3q0.a;
                } else {
                    s3q0Var = null;
                }
                if (s3q0Var == null && myc0.f(aVar.a)) {
                    userProfileHeaderView.getOnToolbarComposedCallback().onNext(a.AbstractC0881a.C0882a.a);
                }
                vkTopBar.setBefore(!aVar.c ? userProfileHeaderView.B : null);
                bwt0.k0(vkTopBar, new q7a0(7, userProfileHeaderView, hpq0Var));
                bwt0.i0(vkTopBar, new gqq0(hpq0Var, 0));
                if (profileCover != null) {
                    int i3 = userProfileHeaderView.y;
                    int i4 = userProfileHeaderView.x;
                    ProfileCover.Mode a3 = profileCover.a();
                    ProfileCover.Mode mode2 = ProfileCover.Mode.NONE;
                    if (a3 != mode2) {
                        pair2 = new Pair(Integer.valueOf(userProfileHeaderView.z), null);
                        i = 0;
                    } else {
                        int i5 = UserProfileHeaderView.a.$EnumSwitchMapping$0[userProfileMode.ordinal()];
                        if (i5 == 1) {
                            i = 0;
                            pair = new Pair(Integer.valueOf(i3), Integer.valueOf(i3 + i4));
                        } else {
                            if (i5 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = 0;
                            pair = new Pair(Integer.valueOf(cn70.b(0)), Integer.valueOf(i4));
                        }
                        pair2 = pair;
                    }
                    int intValue = ((Number) pair2.d()).intValue();
                    Integer num = (Integer) pair2.g();
                    com.vk.profile.core.cover.a aVar3 = userProfileHeaderView.t;
                    com.vk.profile.core.cover.a aVar4 = aVar3;
                    if (aVar3 == null) {
                        aVar4 = null;
                    }
                    boolean z4 = userProfileMode == userProfileMode2 ? 1 : i;
                    aVar4.h = intValue;
                    bpn0 bpn0Var = aVar4.n;
                    bpn0 bpn0Var2 = aVar4.m;
                    VkImage vkImage = aVar4.a;
                    aVar4.k = z4;
                    aVar4.i = num != null ? num.intValue() : i;
                    aVar4.j = i4;
                    ProfileCover.Mode a4 = profileCover.a();
                    boolean z5 = (aVar4.q == null || a4 == mode2) ? i : 1;
                    aVar4.q = a4;
                    Context context = aVar4.e;
                    vkImage.setPlaceholderColor(context.getColor(R.color.transparent));
                    VkImage vkImage2 = aVar4.b;
                    vkImage2.setPlaceholderColor(context.getColor(R.color.transparent));
                    ProfileCover.Mode a5 = profileCover.a();
                    hea0 hea0Var = profileCover.d;
                    int i6 = a.c.$EnumSwitchMapping$0[a5.ordinal()];
                    if (i6 == 1) {
                        ProfileCover.a aVar5 = profileCover.b;
                        if (aVar5 != null) {
                            dhr0.g0(vkImage, new ColorDrawable(dhr0.t.c(com.vkontakte.android.R.attr.vk_ui_vkontakte_color_snippet_background)), com.vkontakte.android.R.attr.vk_ui_vkontakte_color_snippet_background);
                            vkImage.setImageDrawable((GradientDrawable) bpn0Var2.getValue());
                            vkImage2.setImageDrawable((GradientDrawable) bpn0Var2.getValue());
                            ((GradientDrawable) bpn0Var2.getValue()).setColors(rl3.q0(new Integer[]{Integer.valueOf(aVar5.a), Integer.valueOf(aVar5.b)}));
                            ((GradientDrawable) bpn0Var2.getValue()).setAlpha(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                        }
                    } else if (i6 == 2) {
                        abg0 abg0Var = dhr0.t;
                        vkImage.setPlaceholderColor(abg0Var.c(com.vkontakte.android.R.attr.vk_ui_image_placeholder));
                        vkImage2.setPlaceholderColor(abg0Var.c(com.vkontakte.android.R.attr.vk_ui_image_placeholder));
                        iso0 s = com.vk.toggle.d.s();
                        String str2 = (hea0Var == null || (photo3 = hea0Var.a) == null) ? null : photo3.P;
                        CoreFeatures coreFeatures = CoreFeatures.THUMB_HASH;
                        coreFeatures.getClass();
                        String b2 = s.b(str2, (com.vk.toggle.b.A.a(coreFeatures) && com.vk.toggle.d.s().d) ? 1 : i);
                        if (b2 != null) {
                            vkImage.setThumbHash(b2);
                            vkImage2.setThumbHash(b2);
                        }
                        vkImage.o0((hea0Var == null || (photo2 = hea0Var.a) == null) ? null : photo2.t, null);
                        vkImage2.o0((hea0Var == null || (photo = hea0Var.a) == null) ? null : photo.t, null);
                    } else if (i6 == 3) {
                        vkImage.setImageDrawable(null);
                        vkImage2.setImageDrawable(null);
                        dhr0.g0(vkImage, new ColorDrawable(dhr0.t.c(com.vkontakte.android.R.attr.vk_ui_image_placeholder_alpha)), com.vkontakte.android.R.attr.vk_ui_image_placeholder_alpha);
                    } else if (i6 == 4) {
                        Integer num2 = profileCover.c;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            ColorDrawable colorDrawable = (ColorDrawable) bpn0Var.getValue();
                            colorDrawable.setColor(intValue2);
                            vkImage.setImageDrawable(colorDrawable);
                            ColorDrawable colorDrawable2 = (ColorDrawable) bpn0Var.getValue();
                            colorDrawable2.setColor(intValue2);
                            vkImage2.setImageDrawable(colorDrawable2);
                        }
                    } else {
                        if (i6 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar4.c.a.setVisibility(8);
                        vkImage.setImageDrawable(null);
                        vkImage2.setImageDrawable(null);
                        dhr0.g0(vkImage, new ColorDrawable(dhr0.t.c(com.vkontakte.android.R.attr.vk_ui_background_content)), com.vkontakte.android.R.attr.vk_ui_background_content);
                    }
                    aVar4.b(z5);
                    ImageView imageView = userProfileHeaderView.D;
                    if (profileCover.a() == ProfileCover.Mode.COVER) {
                        a aVar6 = userProfileHeaderView.u;
                        if (aVar6 == null) {
                            aVar6 = null;
                        }
                        if (aVar6.isEnabled()) {
                            z2 = 1;
                            bwt0.p0(imageView, z2);
                            a aVar7 = userProfileHeaderView.u;
                            userProfileHeaderView.V4(aVar7 != null ? aVar7 : null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                    }
                    z2 = i;
                    bwt0.p0(imageView, z2);
                    a aVar72 = userProfileHeaderView.u;
                    userProfileHeaderView.V4(aVar72 != null ? aVar72 : null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                if (z3) {
                    return;
                }
                khc0Var.B(new f.k.a.C1727a(new WeakReference(vkTopBar), z, str, new vpj0(userProfileHeaderView, 10)));
                return;
            }
            fVar2 = new VkTopBar.a.c.f(new gko(c1728a.b ? com.vkontakte.android.R.drawable.vk_icon_notification_check_outline_28 : com.vkontakte.android.R.drawable.vk_icon_notification_add_outline_28), tq.h(tlo0.Companion, com.vkontakte.android.R.string.user_profile_accessibility_notification), new ks2(26, hpq0Var, userProfileHeaderView), null, null, a2, 24);
        }
        fVar = fVar2;
        if (fVar == null) {
        }
        if (s3q0Var == null) {
            userProfileHeaderView.getOnToolbarComposedCallback().onNext(a.AbstractC0881a.C0882a.a);
        }
        vkTopBar.setBefore(!aVar.c ? userProfileHeaderView.B : null);
        bwt0.k0(vkTopBar, new q7a0(7, userProfileHeaderView, hpq0Var));
        bwt0.i0(vkTopBar, new gqq0(hpq0Var, 0));
        if (profileCover != null) {
        }
        if (z3) {
        }
    }

    public final BridgeComponent go() {
        return (BridgeComponent) this.U.getValue();
    }

    @Override // xsna.y760
    public final void h9(Intent intent) {
        rsr rsrVar = oz50.k;
        Bundle b2 = oz50.b.b(intent);
        if (b2 != null ? b2.getBoolean("to_edit_profile") : false) {
            xn50.a.c(this, UserProfileAction.b0.b);
        }
    }

    public final loq0 ho() {
        return (loq0) this.g0.getValue();
    }

    public final lyd0 io() {
        return (lyd0) this.a0.getValue();
    }

    public UserProfileMode jo() {
        return this.R;
    }

    public final dvq0 ko() {
        return (dvq0) this.Z.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.fy50
    public final void lf() {
        xn50.a.c(this, UserProfileAction.r.d.b);
    }

    public mk50.c lo(View view) {
        return new mk50.c(view);
    }

    public btq0 mo() {
        return new btq0(((BridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(BridgeComponent.class))).F(), new slq0() { // from class: xsna.lpq0
            @Override // xsna.slq0
            public final void a(UserProfileAction userProfileAction) {
                int i = UserProfileFragment.p0;
                UserProfileFragment.this.getFeature().C(userProfileAction);
            }
        });
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        xn50.a.c(this, new UserProfileAction.a(i, i2, intent));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.USER_PHOTO_CHANGED");
        intentFilter.addAction("com.vkontakte.android.ACTION_PROFILE_UPDATED");
        intentFilter.addAction("com.vkontakte.android.USER_COVER_CHANGED");
        intentFilter.addAction("com.vkontakte.android.USER_STATUS_CHANGED");
        intentFilter.addAction("com.vkontakte.android.ACTION_USER_IMAGE_STATUS_CHANGED");
        intentFilter.addAction("com.vkontakte.android.COUNTERS_UPDATED");
        intentFilter.addAction("com.vkontakte.android.FRIEND_LIST_CHANGED");
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        anj.d(context2, this.k0, intentFilter, hf8.a, 4);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i iVar = this.Q;
        if (iVar == null) {
            iVar = null;
        }
        RecyclerView recyclerView = iVar.f;
        Context context = iVar.b;
        gjf0.d(recyclerView, context, 0, 12);
        com.vk.profile.user.impl.ui.a aVar = iVar.h;
        SnowballsCoverHolder snowballsCoverHolder = aVar.c;
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            int a2 = gjf0.a(context, true);
            bwt0.f0(aVar.e, a2, 0, a2, 0, 10);
            bwt0.f0(aVar.a, a2, 0, a2, 0, 10);
            bwt0.f0(snowballsCoverHolder.a, a2, 0, a2, 0, 10);
            bwt0.f0(aVar.b, a2, 0, a2, 0, 10);
            aVar.a.setOutlineProvider(new s0w0(e3m.a(com.vkontakte.android.R.dimen.profile_card_corner_radius, context), false, true));
            snowballsCoverHolder.a.setOutlineProvider(new s0w0(e3m.a(com.vkontakte.android.R.dimen.profile_card_corner_radius, context), false, true));
            bwt0.f0(aVar.d, a2, 0, a2, 0, 10);
        }
        iVar.j.a(ajh.a.a);
        iVar.n.K0(configuration);
        xn50.a.c(this, UserProfileAction.r.a.b);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xn50.a.c(this, new UserProfileAction.r.b(kn()));
        LayoutInflater.Factory activity = getActivity();
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.Li(this);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        LayoutInflater.Factory activity = getActivity();
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.yk(this);
        }
        getFeature().C(UserProfileAction.r.c.b);
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        Object failure;
        try {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            context.unregisterReceiver(this.k0);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            L.i(a2);
        }
        super.onDetach();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        getFeature().C(UserProfileAction.r.e.b);
        dhr0.a.d(this.l0);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        getFeature().C(UserProfileAction.r.f.b);
        dhr0.a.a(this.l0);
        i iVar = this.Q;
        if (iVar == null) {
            iVar = null;
        }
        com.vk.profile.user.impl.ui.adapter.b bVar = iVar.n;
        for (vif0 vif0Var : bVar.g) {
            aq6 aq6Var = vif0Var instanceof aq6 ? (aq6) vif0Var : null;
            if (aq6Var != null) {
                aq6Var.onResume();
            }
        }
        bVar.K0(null);
        UserProfileHeaderView userProfileHeaderView = iVar.h.e;
        userProfileHeaderView.getClass();
        userProfileHeaderView.post(new js6(userProfileHeaderView, 7));
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        getFeature().C(UserProfileAction.r.g.b);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getFeature().C(UserProfileAction.r.h.b);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        q qVar = (q) this.h0.getValue();
        hg1.j4 j4Var = new hg1.j4(c.b);
        qVar.getClass();
        i0 i0Var = new i0(new i0(qVar, j4Var).U(new hg1.i4(d.b)), new hhj0(new svk0(this, 14), 4));
        x150 x150Var = new x150(new pod0(this, 19), 16);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        o oVar = new o(i0Var.E(x150Var, lVar, kVar, kVar), new uxb0(new ggb0(this, 24), 13));
        asu0.a.getClass();
        hg1.a(new c0(oVar.a0(asu0.m()), lVar, new lg4(this, 7)).subscribe(new s520(new rzl0(this, 12), 26), new ksb0(new e(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 10)), getViewLifecycleOwner());
        i iVar = this.Q;
        if (iVar == null) {
            iVar = null;
        }
        iVar.e.setFitsSystemWindows(true);
        i iVar2 = this.Q;
        View view2 = (iVar2 != null ? iVar2 : null).e;
        jpq0 jpq0Var = new jpq0();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(view2, jpq0Var);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        i iVar = this.Q;
        if (iVar == null) {
            iVar = null;
        }
        RecyclerView recyclerView = iVar.f;
        recyclerView.scrollToPosition(1);
        recyclerView.smoothScrollToPosition(0);
        return true;
    }

    @Override // xsna.wod
    public final boolean vl() {
        return this.m0;
    }

    /* JADX WARN: Type inference failed for: r1v47, types: [T, xsna.fpq0, xsna.vk50] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        String nVar = toString();
        String string = bundle.getString("access_key");
        String string2 = bundle.getString("referrer");
        String string3 = bundle.getString("track_code");
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        boolean b2 = fnj.b(requireContext);
        SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) bundle.getParcelable("search_stats_logging_info");
        boolean z = bundle.getBoolean("show_change_ava");
        f0 j = ko().j(this);
        UserProfileMode jo = jo();
        UserProfileSkeletonParams userProfileSkeletonParams = (UserProfileSkeletonParams) bundle.getParcelable("skeleton_info");
        dvq0 ko = ko();
        UserId userId = (UserId) bundle.getParcelable("id");
        if (userId == null) {
            userId = ko().c();
        }
        htq0 htq0Var = new htq0(nVar, string, string2, string3, b2, searchStatsLoggingInfo, z, j, jo, userProfileSkeletonParams, ko.a(userId), bundle.getBoolean("community_from_clip") ? Integer.valueOf(com.vkontakte.android.R.string.profile_content_tab_clips) : null, bundle.getBoolean("community_as_viewpager_holder"), bundle.getBoolean("to_edit_profile"));
        this.m0 = bundle.getBoolean("community_from_clip");
        ((NewsFeedComponent) ((k7m) m7m.f(this)).a(fpf0.a(NewsFeedComponent.class))).G2();
        UserProfileComponent userProfileComponent = (UserProfileComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(UserProfileComponent.class));
        UserProfileParamsComponent userProfileParamsComponent = (UserProfileParamsComponent) ((k7m) m7m.f(this)).b(fpf0.a(UserProfileParamsComponent.class), new qmq0(htq0Var));
        evq0 Jc = userProfileComponent.Jc();
        vvd0 K7 = userProfileParamsComponent.K7();
        bzh0 Ga = ((SearchUiComponent) ((k7m) m7m.f(this)).a(fpf0.a(SearchUiComponent.class))).Ga();
        userProfileComponent.M7();
        r0e0 pf = userProfileParamsComponent.pf();
        tuq0 xd = userProfileParamsComponent.xd();
        vnq0 Y8 = userProfileParamsComponent.Y8();
        fzd0 P3 = userProfileParamsComponent.P3();
        l36 Pd = userProfileParamsComponent.Pd();
        UserId userId2 = (UserId) bundle.getParcelable("id");
        if (userId2 == null) {
            userId2 = Jc.b.c();
        }
        pf.b(userId2);
        b13 b3 = ((BridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(BridgeComponent.class))).id().b(searchStatsLoggingInfo);
        lzh0 lzh0Var = new lzh0(Ga, searchStatsLoggingInfo);
        long j2 = pf.a.b;
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.PROFILE, null, null, null, null, null, 62, null), new MobileOfficialAppsProfileStat$TypeOpenProfileClick(j2, string3), 2)).q();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        kpq0 kpq0Var = new kpq0(ref$ObjectRef);
        oga0 r4 = ((PhotosComponent) ((k7m) m7m.f(this)).a(fpf0.a(PhotosComponent.class))).r4();
        q3s q7 = ((FeedFriendsComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(FeedFriendsComponent.class))).q7();
        xsq0 xsq0Var = new xsq0(new xsq0.a(((ImBridgeComponent) this.W.getValue()).g5(), go().Le(), go().f5(), go().h8(), go().H2(), go().p(), go().id(), ((NewsFeedBridgeComponent) this.X.getValue()).Ad(), ((StickersBridgeComponent) this.V.getValue()).R(), go().F1(), go().s(), go().cb(), go().a0()), b3, new xsq0.b(io(), (qfa0) this.c0.getValue()), pf, lzh0Var, Jc, kpq0Var, (ClipsEntryPointsComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(ClipsEntryPointsComponent.class)), ((ClipsConfigViewersComponent) ((k7m) m7m.f(this)).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments(), (MaxUtilityComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(MaxUtilityComponent.class)), new xsq0.c(((NarrativeComponent) ((k7m) m7m.f(this)).a(fpf0.a(NarrativeComponent.class))).h3(), ((StoryViewerComponent) ((k7m) m7m.f(this)).a(fpf0.a(StoryViewerComponent.class))).tb(), r4, q7, ((NewsFeedComponent) ((k7m) m7m.f(this)).a(fpf0.a(NewsFeedComponent.class))).l0(), (syk0) this.i0.getValue(), ((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).x().a(), fxc0.B().Y()));
        btq0 mo = mo();
        UserProfileDialogs userProfileDialogs = new UserProfileDialogs(new mpq0(ref$ObjectRef), htq0Var, pf, K7, ((NewsFeedBridgeComponent) this.X.getValue()).Ad(), io(), ko(), new nh40(ref$ObjectRef, 21));
        yqq0 yqq0Var = new yqq0();
        u2b0 u2b0Var = (u2b0) this.S.getValue();
        UserProfileComponent userProfileComponent2 = (UserProfileComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(UserProfileComponent.class));
        std0 U0 = userProfileComponent2.U0();
        bvq0 bvq0Var = new bvq0(Jc, u2b0Var, io());
        p870 w = ((StoriesComponent) ((k7m) m7m.f(this)).a(fpf0.a(StoriesComponent.class))).w();
        q3s q72 = ((FeedFriendsComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(FeedFriendsComponent.class))).q7();
        b4s b4 = ((FollowersModeComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(FollowersModeComponent.class))).b();
        jnj0 X2 = userProfileComponent2.X2();
        fhc0 H6 = ((PostingComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(PostingComponent.class))).H6();
        cwg0 X1 = ((SubscriptionComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(SubscriptionComponent.class))).X1();
        qvl0 qvl0Var = new qvl0(requireContext(), pf, w, Jc, xd, new dul0(((StoryViewerComponent) ((k7m) m7m.f(this)).a(fpf0.a(StoryViewerComponent.class))).l9()));
        lyd0 io2 = io();
        FragmentEntry Kn = Kn();
        jmq0 jmq0Var = new jmq0(pf, Jc, P3, xd, io2, Kn != null ? Kn.d : null);
        rlq0 rlq0Var = new rlq0(pf, Jc, xd, io(), lzh0Var, X1);
        jtq0 jtq0Var = new jtq0(pf, htq0Var, Jc, ((NewsFeedBridgeComponent) this.X.getValue()).Ad().o(), ((NewsFeedComponent) this.Y.getValue()).N0(), io(), H6);
        cvq0 cvq0Var = new cvq0();
        cvq0Var.e = EmptyDisposable.INSTANCE;
        stq0 stq0Var = new stq0(xd, X2);
        koq0 koq0Var = new koq0(b3, q72);
        vlq0 vlq0Var = new vlq0(Jc, ((NewsFeedBridgeComponent) this.X.getValue()).Ad(), ((FaveComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(FaveComponent.class))).Va(), xd, U0, io(), lzh0Var);
        Context applicationContext = kn().getApplicationContext();
        lyd0 io3 = io();
        hlu0 hlu0Var = (hlu0) this.e0.getValue();
        jlu0 jlu0Var = (jlu0) this.d0.getValue();
        FragmentEntry Kn2 = Kn();
        iuq iuqVar = new iuq(jmq0Var, qvl0Var, rlq0Var, jtq0Var, cvq0Var, bvq0Var, stq0Var, koq0Var, vlq0Var, new vpq0(pf, Jc), new gpq0(b4), new buq0(), new ynq0(Jc, pf, b2, Y8, ho(), io(), go().t().b()), new fqq0(applicationContext, U0, xd, Jc, io3, Pd, hlu0Var, jlu0Var, Kn2 != null ? Kn2.d : null), new gvq0(), new gxq0(), new omq0(Jc, bvq0Var, io()), new c5e0(xd, io()), new b960(xd), new dsi0(Pd), new ctn0(Y8, pf, Jc, io()), new dxn(new cyn(new dy2())), new pnq0(requireContext()), new f31(new vc0(new d690()), requireContext(), ho()), null);
        je40 je40Var = new je40(ref$ObjectRef, 14);
        dtq0 dtq0Var = new dtq0(new orq0(htq0Var, pf, ((BridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(BridgeComponent.class))).p(), xd, Jc), new wpq0(Jc), new qpq0(Jc), new auq0(), new itq0(), new vtq0(), new xuq0(), new c960(), new kqq0());
        ?? fpq0Var = new fpq0(htq0Var, Jc, xsq0Var, mo, userProfileDialogs, yqq0Var, xd, iuqVar, new com.vk.profile.user.impl.ui.e(je40Var, io(), dtq0Var, new etq0(dtq0Var, new ctq0(htq0Var, Jc, xd), je40Var), htq0Var), io(), pf, this.J, userProfileComponent.fa(), (q7v0) this.j0.getValue());
        ref$ObjectRef.element = fpq0Var;
        return fpq0Var;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        Bundle arguments = getArguments();
        UserId userId = arguments != null ? (UserId) arguments.getParcelable("id") : null;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("access_key") : null;
        if (userId == null && (string == null || string.length() == 0)) {
            userId = ko().c();
        } else if (userId == null) {
            userId = UserId.d;
        }
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.USER, Long.valueOf(userId.b), Long.valueOf(userId.b), null, null, null, 56, null);
    }
}
