package com.vk.video.profile.presentation;

import android.R;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.accountmanager.di.VideoAccountHolderComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.log.L;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.profile.user.api.di.UserProfileParamsComponent;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.video.channel.common.di.VideoChannelComponent;
import com.vk.video.profile.di.VideoProfileComponent;
import com.vk.video.profile.onboarding.VideoProfileCreatorOnboardingComponent;
import com.vk.video.profile.onboarding.VideoProfileCreatorOnboardingComponent$Companion$STUB$1;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.a;
import com.vk.video.profile.presentation.catalog.VideoProfileCatalogFragment;
import com.vk.video.profile.presentation.models.StateSubscribeNotification;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.video.profile.presentation.views.VideoNewProfileToolbarV2;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.aeg0;
import xsna.afl0;
import xsna.akd0;
import xsna.anj;
import xsna.ao50;
import xsna.b8e0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c8t0;
import xsna.cck0;
import xsna.cqr0;
import xsna.cys0;
import xsna.dbj0;
import xsna.dck0;
import xsna.dhr0;
import xsna.dm7;
import xsna.dvq0;
import xsna.e43;
import xsna.edt0;
import xsna.es;
import xsna.ey50;
import xsna.f770;
import xsna.fkq0;
import xsna.fnj;
import xsna.fpf0;
import xsna.fxc0;
import xsna.fyd0;
import xsna.fzd0;
import xsna.ghn0;
import xsna.gm50;
import xsna.gyo0;
import xsna.gzs;
import xsna.hbj0;
import xsna.hf8;
import xsna.htq0;
import xsna.hvr0;
import xsna.i8t0;
import xsna.iah0;
import xsna.ie90;
import xsna.ikv0;
import xsna.izs;
import xsna.j8n0;
import xsna.jcf0;
import xsna.k2y;
import xsna.k7m;
import xsna.km50;
import xsna.ksq0;
import xsna.kyq0;
import xsna.l7v;
import xsna.lxh0;
import xsna.lzh0;
import xsna.m7a;
import xsna.m7m;
import xsna.m9t0;
import xsna.mdk0;
import xsna.mk50;
import xsna.mlf0;
import xsna.mo3;
import xsna.mqe0;
import xsna.msy;
import xsna.mvl0;
import xsna.mwm0;
import xsna.myd0;
import xsna.nbs;
import xsna.nds;
import xsna.nht0;
import xsna.o5o;
import xsna.o80;
import xsna.oqh0;
import xsna.orj0;
import xsna.ots;
import xsna.ou1;
import xsna.oz50;
import xsna.ozl;
import xsna.p1t;
import xsna.pu50;
import xsna.pwh0;
import xsna.q3s0;
import xsna.q6s0;
import xsna.qah0;
import xsna.qkd0;
import xsna.qmq0;
import xsna.r0e0;
import xsna.r9q;
import xsna.rns0;
import xsna.s01;
import xsna.s3q0;
import xsna.srq0;
import xsna.stg0;
import xsna.t8t0;
import xsna.tb0;
import xsna.tuq0;
import xsna.tvs0;
import xsna.u1r0;
import xsna.uft0;
import xsna.uho0;
import xsna.uhs0;
import xsna.vit0;
import xsna.vk50;
import xsna.vpj0;
import xsna.vyq0;
import xsna.w8i;
import xsna.wlg;
import xsna.ww50;
import xsna.x8t0;
import xsna.xds;
import xsna.xn50;
import xsna.yei0;
import xsna.yml;
import xsna.yqd0;
import xsna.yyl0;
import xsna.z23;
import xsna.zqu;
import xsna.zvr0;

/* compiled from: VideoProfileFragmentOld.kt */
@ozl
/* loaded from: classes6.dex */
public final class VideoProfileFragmentOld extends MviImplFragment<com.vk.video.profile.presentation.c, m9t0, com.vk.video.profile.presentation.a> implements w8i, xds, nds {
    public static final /* synthetic */ int p0 = 0;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object a0;
    public final Object b0;
    public final c8t0 c0;
    public final Object d0;
    public nht0 e0;
    public edt0 f0;
    public ikv0 g0;
    public cys0 h0;
    public final bpn0 i0;
    public final bpn0 j0;
    public final Object k0;
    public qah0 l0;
    public final VideoProfileFragmentOld$broadcastReceiver$1 m0;
    public final Object n0;
    public final nbs o0;

    /* compiled from: VideoProfileFragmentOld.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: VideoProfileFragmentOld.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StateSubscribeNotification.values().length];
            try {
                iArr[StateSubscribeNotification.SUBSCRIBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StateSubscribeNotification.UNSUBSCRIBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StateSubscribeNotification.ALL_NOTIFICATIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StateSubscribeNotification.PREFER_NOTIFICATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StateSubscribeNotification.NONE_NOTIFICATIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VideoProfileFragmentOld.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((VideoProfileFragmentOld) this.receiver).finish();
            return s3q0.a;
        }
    }

    /* compiled from: VideoProfileFragmentOld.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<com.vk.video.profile.presentation.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.video.profile.presentation.a aVar) {
            VideoProfileFragmentOld videoProfileFragmentOld = (VideoProfileFragmentOld) this.receiver;
            videoProfileFragmentOld.getClass();
            xn50.a.c(videoProfileFragmentOld, aVar);
            return s3q0.a;
        }
    }

    /* compiled from: VideoProfileFragmentOld.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<com.vk.video.profile.presentation.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.video.profile.presentation.a aVar) {
            VideoProfileFragmentOld videoProfileFragmentOld = (VideoProfileFragmentOld) this.receiver;
            videoProfileFragmentOld.getClass();
            xn50.a.c(videoProfileFragmentOld, aVar);
            return s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [xsna.c8t0] */
    /* JADX WARN: Type inference failed for: r0v31, types: [com.vk.video.profile.presentation.VideoProfileFragmentOld$broadcastReceiver$1] */
    public VideoProfileFragmentOld() {
        j8n0 j8n0Var = new j8n0(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, j8n0Var);
        this.R = msy.a(lazyThreadSafetyMode, new vpj0(this, 21));
        this.S = msy.a(lazyThreadSafetyMode, new mlf0(this, 21));
        this.T = msy.a(lazyThreadSafetyMode, new tvs0(this, 2));
        this.U = msy.a(lazyThreadSafetyMode, new srq0(this, 8));
        this.V = msy.a(lazyThreadSafetyMode, new rns0(this, 4));
        this.W = msy.a(lazyThreadSafetyMode, new myd0(this, 23));
        this.X = msy.a(lazyThreadSafetyMode, new qkd0(this, 27));
        this.Y = msy.a(lazyThreadSafetyMode, new hbj0(this, 23));
        this.Z = msy.a(lazyThreadSafetyMode, new pwh0(this, 25));
        this.a0 = msy.a(lazyThreadSafetyMode, new cqr0(this, 8));
        this.b0 = msy.a(lazyThreadSafetyMode, new uho0(this, 13));
        this.c0 = new tb0() { // from class: xsna.c8t0
            @Override // xsna.tb0
            public final void onActivityResult(int i, int i2, Intent intent) {
                int i3 = VideoProfileFragmentOld.p0;
                xn50.a.c(VideoProfileFragmentOld.this, new a.C1957a(i, i2, intent));
            }
        };
        this.d0 = msy.a(lazyThreadSafetyMode, new ksq0(this, 9));
        this.i0 = new bpn0(new cck0(this, 16));
        this.j0 = new bpn0(new dck0(this, 16));
        this.k0 = msy.a(lazyThreadSafetyMode, new mqe0(this, 28));
        this.m0 = new BroadcastReceiver() { // from class: com.vk.video.profile.presentation.VideoProfileFragmentOld$broadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if ("com.vkontakte.android.USER_PHOTO_CHANGED".equals(intent.getAction())) {
                    a.z zVar = a.z.b;
                    VideoProfileFragmentOld videoProfileFragmentOld = VideoProfileFragmentOld.this;
                    videoProfileFragmentOld.getClass();
                    xn50.a.c(videoProfileFragmentOld, zVar);
                }
            }
        };
        this.n0 = msy.a(lazyThreadSafetyMode, new dbj0(this, 19));
        this.o0 = new nbs(this.D);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    @SuppressLint({"WrongThread"})
    public final mk50 Fl() {
        if (fxc0.B().J().e0().a) {
            this.e0 = new nht0(requireContext());
        }
        if (fxc0.B().J().u0()) {
            this.f0 = new edt0(requireContext());
        }
        cys0 cys0Var = new cys0(requireContext(), getViewLifecycleOwner(), this.o0.getLifecycle(), new p1t(new wlg(kn(), ((VideoChannelComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(VideoChannelComponent.class))).h4(), new d(1, this, VideoProfileFragmentOld.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0), fkq0.b(ho())), getChildFragmentManager(), new c(0, this, VideoProfileFragmentOld.class, "finish", "finish()V", 0), (SearchStatsLoggingInfo) this.V.getValue()), fkq0.b(ho()), new e(1, this, VideoProfileFragmentOld.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));
        this.h0 = cys0Var;
        return new mk50.c(cys0Var.getView());
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        m9t0 m9t0Var = (m9t0) ao50Var;
        aeg0 aeg0Var = (aeg0) this.b0.getValue();
        if (aeg0Var != null) {
            aeg0Var.Li(this.c0);
        }
        final cys0 cys0Var = this.h0;
        if (cys0Var != null) {
            VideoNewProfileHeaderViewV2 videoNewProfileHeaderViewV2 = cys0Var.i0;
            videoNewProfileHeaderViewV2.setOnSubtitleClickListener(new jcf0(cys0Var, 22));
            videoNewProfileHeaderViewV2.setOnOwnerChangeTouchZoneClickListener(new q6s0(cys0Var, 5));
            videoNewProfileHeaderViewV2.setOnAgeMarkClickListener(new afl0(cys0Var, 16));
            videoNewProfileHeaderViewV2.setOnSubscribeButtonClickListener(new orj0(cys0Var, 22));
            videoNewProfileHeaderViewV2.setOnOwnerPhotoClickListener(new oqh0(cys0Var, 17));
            videoNewProfileHeaderViewV2.setOnEditProfileClickListener(new ghn0(cys0Var, 13));
            videoNewProfileHeaderViewV2.setOnDonutButtonClickListener(new kyq0(cys0Var, 5));
            videoNewProfileHeaderViewV2.setOnUploadVideoClickListener(new fyd0(cys0Var, 22));
            videoNewProfileHeaderViewV2.setOnOpenAuthorCabinetClickListener(new yqd0(cys0Var, 20));
            videoNewProfileHeaderViewV2.setCreatorOnboardingItemClickListener(new gyo0(cys0Var, 7));
            videoNewProfileHeaderViewV2.setCreatorOnboardingAnimationEndedCallback(new uhs0(cys0Var, 4));
            cys0Var.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xsna.bys0
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                public final void h() {
                    cys0.setListeners$lambda$14(cys0.this);
                }
            });
            VideoNewProfileToolbarV2 videoNewProfileToolbarV2 = cys0Var.d0;
            bwt0.i0(videoNewProfileToolbarV2.c, new ie90(new hvr0(cys0Var, 7), 26));
            bwt0.i0(videoNewProfileToolbarV2.g, new lxh0(new akd0(cys0Var, 21), 9));
            bwt0.i0(videoNewProfileToolbarV2.e, new q3s0(new stg0(cys0Var, 24), 2));
            yei0 yei0Var = new yei0(cys0Var, 19);
            bwt0.i0(videoNewProfileToolbarV2.f, new mvl0(yei0Var, 11));
            videoNewProfileToolbarV2.i.setOnActionSearchQueryClick(new s01(yei0Var, 12));
            bwt0.i0(videoNewProfileToolbarV2.h, new yyl0(new mwm0(cys0Var, 11), 14));
            View view2 = cys0Var.h0;
            if (view2 != null) {
                view2.setOnClickListener(new dm7(cys0Var, 6));
            }
            cys0Var.m0.setOnClickListener(new mo3(cys0Var, 18));
            gm50.a.b(cys0Var, m9t0Var.a, new vyq0(cys0Var, 5));
        }
        getFeature().A.a(new b8e0(this, 23), getViewLifecycleOwner());
    }

    @Override // xsna.nds
    public final boolean W9() {
        Boolean bool;
        cys0 cys0Var = this.h0;
        if (cys0Var != null) {
            bool = Boolean.valueOf(dhr0.C().b && (cys0Var.q0 || cys0Var.p0 >= 0.4f));
        } else {
            bool = null;
        }
        return bool != null ? bool.booleanValue() : dhr0.C().b;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void finish() {
        ww50<?> Y;
        LayoutInflater.Factory activity = getActivity();
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        if ((ey50Var == null || (Y = ey50Var.Y()) == null) ? false : Y.B(this)) {
            go().a().c(kn());
            return;
        }
        qah0 qah0Var = this.l0;
        if (qah0Var != null) {
            qah0Var.invoke();
        } else {
            super.finish();
        }
    }

    public final VideoProfileCatalogFragment fo() {
        Fragment H = getChildFragmentManager().H("VideoProfileCatalogFragment");
        if (H instanceof VideoProfileCatalogFragment) {
            return (VideoProfileCatalogFragment) H;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final VideoProfileComponent go() {
        return (VideoProfileComponent) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final UserId ho() {
        return (UserId) this.Q.getValue();
    }

    @Override // xsna.xoo0
    public final int l2() {
        return R.color.transparent;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        getFeature().C(new a.C1957a(i, i2, intent));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        IntentFilter a2 = z23.a("com.vkontakte.android.USER_PHOTO_CHANGED");
        FragmentActivity kn = kn();
        String str = hf8.a;
        anj.d(kn, this.m0, a2, str, 4);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID");
        anj.d(kn(), (BroadcastReceiver) this.n0.getValue(), intentFilter, str, 4);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        xn50.a.c(this, a.g.b);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        kn().getSupportFragmentManager().l0("VideoProfileFragment.profile_has_been_changed", fxc0.B().J().x() ? this.o0 : this, new pu50(this, 17));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        aeg0 aeg0Var = (aeg0) this.b0.getValue();
        if (aeg0Var != null) {
            aeg0Var.yk(this.c0);
        }
        this.h0 = null;
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        try {
            kn().unregisterReceiver(this.m0);
            kn().unregisterReceiver((BroadcastReceiver) this.n0.getValue());
        } catch (Exception e2) {
            L.i(e2);
        }
        super.onDetach();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        t8t0 t8t0Var = (t8t0) getFeature().z.getValue();
        t8t0Var.getClass();
        com.vk.core.utils.newtork.b.a.getClass();
        io.reactivex.rxjava3.subjects.d<com.vk.core.utils.newtork.d> dVar = com.vk.core.utils.newtork.b.d;
        dVar.getClass();
        t8t0Var.b = new y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).y(3L, TimeUnit.SECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new k2y(new mdk0(t8t0Var, 16), 26));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ikv0 ikv0Var = this.g0;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        io.reactivex.rxjava3.disposables.c cVar = ((t8t0) getFeature().z.getValue()).b;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        String nVar = toString();
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        UserProfileParamsComponent userProfileParamsComponent = (UserProfileParamsComponent) ((k7m) m7m.f(this)).b(fpf0.a(UserProfileParamsComponent.class), new qmq0(new htq0(nVar, null, null, null, fnj.b(requireContext), null, false, ((dvq0) this.W.getValue()).j(this), 16238)));
        tuq0 xd = userProfileParamsComponent.xd();
        zvr0 x9 = ((VideoAccountHolderComponent) ((k7m) m7m.f(this)).a(fpf0.a(VideoAccountHolderComponent.class))).x9();
        l7v b2 = ((BridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(BridgeComponent.class))).t().b();
        r0e0 aa = userProfileParamsComponent.aa();
        fzd0 P3 = userProfileParamsComponent.P3();
        VideoProfileCreatorOnboardingComponent$Companion$STUB$1.a Pc = ((VideoProfileCreatorOnboardingComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(VideoProfileCreatorOnboardingComponent.class))).Pc();
        x8t0 x8t0Var = new x8t0(new u1r0(), new zqu(), new es(), new uft0(), new ots());
        i8t0 d8 = go().d8();
        return new com.vk.video.profile.presentation.c(x8t0Var, xd, go().K4(), d8, (vit0) this.U.getValue(), (lzh0) this.k0.getValue(), Pc, b2, x9, aa, P3, (m7a) this.i0.getValue(), requireArguments().getBoolean("open_notify_settings", false), new g(requireContext().getApplicationContext().getResources(), ((Boolean) this.Z.getValue()).booleanValue(), (String) this.a0.getValue(), new o5o(e43.l(new f770(), new o80(), new r9q(), new yml())), (VideoProfileSource) this.Y.getValue(), new ou1(1, this, VideoProfileFragmentOld.class, "getStateUserId", "getStateUserId(Lcom/vk/video/profile/presentation/state/VideoProfileState;)Lcom/vk/dto/common/id/UserId;", 0, 12)), (com.vk.clips.viewer.vk.a) this.j0.getValue());
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.PROFILE, Long.valueOf(ho().b), Long.valueOf(ho().b), null, (String) this.R.getValue(), null, 40, null);
    }
}
