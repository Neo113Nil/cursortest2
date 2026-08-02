package com.vk.im.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.generic.RoundingParams;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.view.AppBarShadowView;
import com.vk.dto.hints.HintId;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.dialogs.c;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.engine.models.reporters.DialogsFilterChangeSource;
import com.vk.im.engine.models.search.SearchEntrypoint;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.im.ui.components.msg_list.MsgListOpenMode;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.components.msg_search.vc.HideReason;
import com.vk.im.ui.fragments.DialogsFragment;
import com.vk.im.ui.fragments.chat.ChatAnalyticsParams;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import xsna.a1w;
import xsna.aes;
import xsna.asm;
import xsna.asu0;
import xsna.av20;
import xsna.ayv;
import xsna.bcw;
import xsna.bpn0;
import xsna.bu00;
import xsna.bwt0;
import xsna.c4g0;
import xsna.cew;
import xsna.clm;
import xsna.dhr0;
import xsna.dw20;
import xsna.e43;
import xsna.e520;
import xsna.equ0;
import xsna.f4m;
import xsna.fpf0;
import xsna.fsm;
import xsna.fx5;
import xsna.g2v;
import xsna.gzs;
import xsna.h20;
import xsna.i34;
import xsna.i7o0;
import xsna.ir4;
import xsna.itg0;
import xsna.jbs;
import xsna.jr4;
import xsna.jw5;
import xsna.k9u0;
import xsna.kkm;
import xsna.krl0;
import xsna.ktm;
import xsna.lmp0;
import xsna.lz2;
import xsna.m7m;
import xsna.mdz;
import xsna.mhy;
import xsna.mk5;
import xsna.mmf;
import xsna.msy;
import xsna.mtm;
import xsna.mxv;
import xsna.mzp0;
import xsna.n0v0;
import xsna.nef;
import xsna.nfj;
import xsna.o0w;
import xsna.o1e;
import xsna.o25;
import xsna.obh;
import xsna.ox30;
import xsna.oz50;
import xsna.pbw;
import xsna.pla;
import xsna.q1w;
import xsna.qhh0;
import xsna.rw30;
import xsna.rzp0;
import xsna.s200;
import xsna.s3q0;
import xsna.sxc0;
import xsna.szf0;
import xsna.t9e;
import xsna.v6j;
import xsna.vtm;
import xsna.wb1;
import xsna.wnh;
import xsna.wvw;
import xsna.ww50;
import xsna.xal;
import xsna.xqm;
import xsna.yqm;
import xsna.yxv;
import xsna.zcl;
import xsna.zdw;
import xsna.zmp0;
import xsna.zxv;

/* compiled from: DialogsFragment.kt */
/* loaded from: classes.dex */
public class DialogsFragment extends ImFragment implements qhh0, aes, szf0 {
    public static volatile boolean u0;
    public final Object P = new Object();
    public final Handler Q = new Handler(Looper.getMainLooper());
    public final zdw R;
    public final a1w S;
    public final mxv T;
    public final wvw U;
    public final krl0 V;
    public final ir4 W;
    public final pbw X;
    public final bcw Y;
    public final OpenChatListReporter Z;
    public final mdz<OpenChatListReporter.Span> a0;
    public final mtm b0;
    public final Object c0;
    public final Object d0;
    public ViewGroup e0;
    public ViewStub f0;
    public AppBarShadowView g0;
    public AppBarLayout h0;
    public equ0 i0;
    public com.vk.im.ui.components.dialogs_list.c j0;
    public vtm k0;
    public rw30 l0;
    public jr4 m0;
    public ViewGroup n0;
    public ViewStub o0;
    public asm p0;
    public VKImageView q0;
    public final bpn0 r0;
    public final Object s0;
    public final Object t0;

    /* compiled from: DialogsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends oz50 {
        public b() {
            super(DialogsFragment.class, null, null);
        }

        @Override // xsna.oz50
        public final Intent n(Context context) {
            this.j.putString("performance_track_id", UUID.randomUUID().toString());
            return super.n(context);
        }

        public final void y() {
            this.j.putString("entry_point", "voip_calls_promo_link");
        }
    }

    /* compiled from: DialogsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        public static boolean a() {
            return DialogsFragment.u0;
        }
    }

    /* compiled from: DialogsFragment.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DialogsFilter.values().length];
            try {
                iArr[DialogsFilter.BUSINESS_NOTIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DialogsFilter.REQUESTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DialogsFilter.ARCHIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DialogsFragment() {
        zdw zdwVar = i7o0.b;
        this.R = zdwVar == null ? null : zdwVar;
        a1w a1wVar = q1w.a;
        this.S = a1wVar == null ? null : a1wVar;
        mxv c2 = g2v.c();
        this.T = c2;
        this.U = pla.e();
        this.V = sxc0.a();
        this.W = c2.m();
        pbw K = ((ImReportersComponent) m7m.d(this).a(fpf0.a(ImReportersComponent.class))).K();
        this.X = K;
        this.Y = K.c();
        OpenChatListReporter g2 = K.n().g(c4g0.s());
        this.Z = g2;
        mdz<OpenChatListReporter.Span> a2 = mdz.a.a(OpenChatListReporter.Span.ROOT);
        g2.c(a2);
        this.a0 = a2;
        this.b0 = new mtm(g2, a2);
        wb1 wb1Var = new wb1(10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c0 = msy.a(lazyThreadSafetyMode, wb1Var);
        this.d0 = msy.a(lazyThreadSafetyMode, new h20(this, 24));
        RoundingParams.a();
        this.r0 = new bpn0(new obh(this, 5));
        int i = 6;
        this.s0 = msy.a(lazyThreadSafetyMode, new wnh(this, i));
        this.t0 = msy.a(lazyThreadSafetyMode, new nef(this, i));
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.IM, null, false, 62).j();
        mzp0Var.init();
        g2.d(mzp0Var);
        this.J = mzp0Var;
    }

    public static void ho(DialogsFragment dialogsFragment, DialogExt dialogExt, String str, MsgListOpenAtMsgMode msgListOpenAtMsgMode, ImSearchItemLoggingInfo imSearchItemLoggingInfo, int i) {
        MsgListOpenMode msgListOpenMode = (i & 4) != 0 ? MsgListOpenAtUnreadMode.b : msgListOpenAtMsgMode;
        ImSearchItemLoggingInfo imSearchItemLoggingInfo2 = (i & 8) != 0 ? null : imSearchItemLoggingInfo;
        com.vk.im.engine.models.dialogs.c Fb = dialogExt.Fb();
        FragmentActivity kn = dialogsFragment.kn();
        if (Fb != null) {
            a1w a1wVar = dialogsFragment.S;
            String str2 = Fb.a;
            zdw zdwVar = i7o0.b;
            if (zdwVar == null) {
                zdwVar = null;
            }
            zdwVar.u.getClass();
            String string = cew.h().getString("pref_cfg_chat_overriden_theme", c.g.c.a);
            zdw zdwVar2 = i7o0.b;
            (zdwVar2 != null ? zdwVar2 : null).u.getClass();
            dialogsFragment.N.b(itg0.n(a1wVar.C(dialogsFragment, new clm(str2, string, cew.d(), dhr0.M(), fx5.a(kn))).q(asu0.a.c())));
        }
        o0w.x(dialogsFragment.T.b(), dialogsFragment.kn(), null, dialogExt.getId(), dialogExt, null, msgListOpenMode, str.equals("message_search"), null, null, null, null, null, null, str, null, null, null, false, null, null, new ChatAnalyticsParams(null, null, null, null, false, null, null, imSearchItemLoggingInfo2, null, 383, null), null, null, 1040179090);
    }

    @Override // xsna.aes
    public final void A0() {
        fo();
    }

    @Override // xsna.szf0
    public final boolean Hg(Bundle bundle) {
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        rw30 rw30Var = this.l0;
        if (rw30Var == null) {
            rw30Var = null;
        }
        return rw30Var.X0(HideReason.BACK, false);
    }

    public final rw30 eo() {
        rw30 rw30Var = this.l0;
        if (rw30Var == null) {
            rw30Var = null;
        }
        if (rw30Var.J0()) {
            rw30 rw30Var2 = this.l0;
            if (rw30Var2 != null) {
                return rw30Var2;
            }
        } else {
            rw30 rw30Var3 = this.l0;
            if (rw30Var3 == null) {
                rw30Var3 = null;
            }
            FragmentActivity kn = kn();
            ViewGroup viewGroup = this.e0;
            if (viewGroup == null) {
                viewGroup = null;
            }
            ViewStub viewStub = this.f0;
            if (viewStub == null) {
                viewStub = null;
            }
            rw30Var3.D0(kn, viewGroup, viewStub, null);
            rw30 rw30Var4 = this.l0;
            if (rw30Var4 != null) {
                return rw30Var4;
            }
        }
        return null;
    }

    public final void fo() {
        ww50 v;
        FragmentActivity activity = getActivity();
        if (activity == null || (v = s200.v(activity)) == null || !v.D(this, true)) {
            VKImageView vKImageView = this.q0;
            f4m.j(vKImageView != null ? vKImageView : null);
            return;
        }
        VKImageView vKImageView2 = this.q0;
        if (vKImageView2 == null) {
            vKImageView2 = null;
        }
        vKImageView2.setVisibility(0);
        String str = o25.a().o().c;
        VKImageView vKImageView3 = this.q0;
        if (vKImageView3 == null) {
            vKImageView3 = null;
        }
        vKImageView3.load(str);
        VKImageView vKImageView4 = this.q0;
        if (vKImageView4 == null) {
            vKImageView4 = null;
        }
        bwt0.i0(vKImageView4, new mmf(this, 20));
        VKImageView vKImageView5 = this.q0;
        bwt0.k0(vKImageView5 != null ? vKImageView5 : null, new nfj(this, 10));
    }

    public final void go(final boolean z) {
        u0 = z;
        if (z) {
            this.T.getClass();
            n0v0.a.g();
            com.vk.im.ui.components.dialogs_list.c cVar = this.j0;
            (cVar != null ? cVar : null).h();
            this.Q.removeCallbacksAndMessages(this.P);
        } else {
            com.vk.im.ui.components.dialogs_list.c cVar2 = this.j0;
            (cVar2 != null ? cVar2 : null).g();
            this.Q.postAtTime(new Runnable() { // from class: xsna.oqm
                @Override // java.lang.Runnable
                public final void run() {
                    rw30 rw30Var = DialogsFragment.this.l0;
                    if (rw30Var == null) {
                        rw30Var = null;
                    }
                    rw30Var.X0(HideReason.FRAGMENT_SWITCHED, !z);
                }
            }, this.P, TimeUnit.SECONDS.toMillis(40L) + SystemClock.uptimeMillis());
        }
        if (this.W.m()) {
            this.W.E(jw5.f);
            io(false);
        }
    }

    @Override // xsna.aes
    public final void h7(v6j v6jVar) {
        VKImageView vKImageView = this.q0;
        if (vKImageView == null) {
            vKImageView = null;
        }
        vKImageView.load(v6jVar.f());
    }

    @Override // xsna.y760
    public final void h9(Intent intent) {
        this.T.getClass();
        intent.getExtras();
        AppBarLayout appBarLayout = this.h0;
        if (appBarLayout == null) {
            appBarLayout = null;
        }
        appBarLayout.g(true, false, true);
        rw30 rw30Var = this.l0;
        if (rw30Var == null) {
            rw30Var = null;
        }
        rw30Var.X0(HideReason.BOTTOM_BAR, false);
        com.vk.im.ui.components.dialogs_list.c cVar = this.j0;
        (cVar != null ? cVar : null).v();
    }

    public final void io(boolean z) {
        final boolean t = this.W.t();
        ViewStub viewStub = this.o0;
        if (viewStub == null) {
            viewStub = null;
        }
        boolean J = bwt0.J(viewStub);
        if (t && !J) {
            jr4 jr4Var = this.m0;
            if (jr4Var == null) {
                jr4Var = null;
            }
            Context requireContext = requireContext();
            ViewGroup viewGroup = this.e0;
            if (viewGroup == null) {
                viewGroup = null;
            }
            ViewStub viewStub2 = this.o0;
            if (viewStub2 == null) {
                viewStub2 = null;
            }
            jr4Var.D0(requireContext, viewGroup, viewStub2, null);
        }
        if (t || J) {
            if (!z) {
                AppBarShadowView appBarShadowView = this.g0;
                if (appBarShadowView == null) {
                    appBarShadowView = null;
                }
                appBarShadowView.setForceMode(t ? 2 : null);
                ViewGroup viewGroup2 = this.n0;
                bwt0.p0(viewGroup2 != null ? viewGroup2 : null, t);
                return;
            }
            mk5 mk5Var = new mk5();
            mk5Var.e(180L);
            mk5Var.g(0);
            lmp0.a(mk5Var, new gzs() { // from class: xsna.pqm
                @Override // xsna.gzs
                public final Object invoke() {
                    AppBarShadowView appBarShadowView2 = DialogsFragment.this.g0;
                    if (appBarShadowView2 == null) {
                        appBarShadowView2 = null;
                    }
                    appBarShadowView2.setForceMode(t ? 2 : null);
                    return s3q0.a;
                }
            });
            ViewGroup viewGroup3 = this.e0;
            if (viewGroup3 == null) {
                viewGroup3 = null;
            }
            zmp0.a(viewGroup3, mk5Var);
            ViewGroup viewGroup4 = this.n0;
            bwt0.p0(viewGroup4 != null ? viewGroup4 : null, t);
        }
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        equ0 equ0Var = this.i0;
        if (equ0Var == null) {
            equ0Var = null;
        }
        equ0Var.K0(configuration);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        OpenChatListReporter openChatListReporter = this.Z;
        bu00.m(openChatListReporter, bundle);
        mdz<OpenChatListReporter.Span> a2 = this.a0.a(OpenChatListReporter.Span.ON_CREATE);
        openChatListReporter.c(a2);
        super.onCreate(bundle);
        s3q0 s3q0Var = s3q0.a;
        openChatListReporter.f(a2, null);
        this.Y.a();
        String string = requireArguments().getString("performance_track_id");
        if (string != null) {
            openChatListReporter.m(string);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.Z.c((mdz) this.d0.getValue());
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.vkim_dialogs_fragment, viewGroup, false);
        this.e0 = viewGroup2;
        if (viewGroup2 == null) {
            return null;
        }
        return viewGroup2;
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.Q.removeCallbacksAndMessages(this.P);
        equ0 equ0Var = this.i0;
        if (equ0Var == null) {
            equ0Var = null;
        }
        equ0Var.Z0(null);
        equ0 equ0Var2 = this.i0;
        if (equ0Var2 == null) {
            equ0Var2 = null;
        }
        equ0Var2.H0();
        equ0 equ0Var3 = this.i0;
        if (equ0Var3 == null) {
            equ0Var3 = null;
        }
        equ0Var3.G0();
        com.vk.im.ui.components.dialogs_list.c cVar = this.j0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.x(null);
        com.vk.im.ui.components.dialogs_list.c cVar2 = this.j0;
        if (cVar2 == null) {
            cVar2 = null;
        }
        cVar2.e();
        com.vk.im.ui.components.dialogs_list.c cVar3 = this.j0;
        if (cVar3 == null) {
            cVar3 = null;
        }
        cVar3.d();
        vtm vtmVar = this.k0;
        if (vtmVar == null) {
            vtmVar = null;
        }
        vtmVar.d();
        rw30 rw30Var = this.l0;
        if (rw30Var == null) {
            rw30Var = null;
        }
        rw30Var.h1(null);
        rw30 rw30Var2 = this.l0;
        if (rw30Var2 == null) {
            rw30Var2 = null;
        }
        rw30Var2.H0();
        rw30 rw30Var3 = this.l0;
        if (rw30Var3 == null) {
            rw30Var3 = null;
        }
        rw30Var3.G0();
        asm asmVar = this.p0;
        if (asmVar == null) {
            asmVar = null;
        }
        asmVar.g();
        jr4 jr4Var = this.m0;
        if (jr4Var == null) {
            jr4Var = null;
        }
        jr4.a.a.getClass();
        jr4Var.X0(jr4.a.C3141a.a());
        jr4 jr4Var2 = this.m0;
        (jr4Var2 != null ? jr4Var2 : null).G0();
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        equ0 equ0Var = this.i0;
        if (equ0Var == null) {
            equ0Var = null;
        }
        equ0Var.W0();
        go(false);
        this.Z.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (((Boolean) this.c0.getValue()).booleanValue()) {
            AppBarLayout appBarLayout = this.h0;
            if (appBarLayout == null) {
                appBarLayout = null;
            }
            appBarLayout.g(true, false, true);
        }
        equ0 equ0Var = this.i0;
        (equ0Var != null ? equ0Var : null).V0();
        go(!isHidden());
        this.X.h().a();
        this.Z.n(OpenChatListReporter.MeasuringPoint.RESUMED);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        rw30 rw30Var = this.l0;
        if (rw30Var == null) {
            rw30Var = null;
        }
        rw30Var.U0(bundle);
        bu00.o(bundle);
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f0 = (ViewStub) view.findViewById(R.id.dialogs_search_container);
        this.g0 = (AppBarShadowView) view.findViewById(R.id.im_appbar_shadow);
        this.h0 = (AppBarLayout) view.findViewById(R.id.app_bar_layout);
        VKImageView vKImageView = (VKImageView) view.findViewById(R.id.user_icon);
        this.q0 = vKImageView;
        vKImageView.getHierarchy().getClass();
        FragmentActivity kn = kn();
        a1w a1wVar = this.S;
        this.p0 = new asm(kn, a1wVar);
        FragmentActivity kn2 = kn();
        mxv mxvVar = this.T;
        mxvVar.getClass();
        boolean t = BuildInfo.t();
        lz2 lz2Var = new lz2(10);
        zdw zdwVar = this.R;
        krl0 krl0Var = this.V;
        mtm mtmVar = this.b0;
        fsm fsmVar = new fsm(kn2, zdwVar, krl0Var, true, false, true, true, true, t, lz2Var, null, mtmVar, 1024);
        zdw zdwVar2 = this.R;
        RecyclerView.u b2 = zdwVar2.f().a().b();
        LayoutInflater a2 = zdwVar2.f().a().a();
        asm asmVar = this.p0;
        vtm vtmVar = new vtm(b2, a2, this.T, this.R, asmVar == null ? null : asmVar, fsmVar.a(), mtmVar);
        vtmVar.c((ViewStub) view.findViewById(R.id.im_dialogs_list_stub));
        this.k0 = vtmVar;
        com.vk.im.ui.components.dialogs_list.c cVar = new com.vk.im.ui.components.dialogs_list.c(a1wVar, fsmVar);
        cVar.z(true);
        cVar.w(true);
        cVar.y(false);
        cVar.A(false);
        DialogsFilter dialogsFilter = DialogsFilter.MAIN;
        cVar.s(dialogsFilter);
        vtm vtmVar2 = this.k0;
        if (vtmVar2 == null) {
            vtmVar2 = null;
        }
        cVar.c(vtmVar2);
        this.j0 = cVar;
        ViewGroup viewGroup = (ViewGroup) view;
        Toolbar toolbar = (Toolbar) viewGroup.findViewById(R.id.toolbar);
        equ0 equ0Var = new equ0(a1wVar, mxvVar, toolbar);
        equ0Var.C0(viewGroup.getContext(), viewGroup, bundle);
        equ0Var.Y0();
        equ0Var.a1(dialogsFilter);
        this.i0 = equ0Var;
        bwt0.i0(toolbar, new t9e(this, 17));
        fo();
        this.l0 = new rw30(this.S, k9u0.a, kn(), ox30.a.b, null, 112);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.audio_msg_player_container);
        this.n0 = viewGroup2;
        bwt0.p0(viewGroup2, false);
        this.o0 = (ViewStub) view.findViewById(R.id.audio_msg_player_stub);
        xal m = mxvVar.m();
        jr4.a.a.getClass();
        jr4 jr4Var = new jr4(this.S, m, jw5.f, jr4.a.C3141a.a(), new kkm(0));
        this.m0 = jr4Var;
        jr4Var.Y0();
        io(false);
        equ0 equ0Var2 = this.i0;
        if (equ0Var2 == null) {
            equ0Var2 = null;
        }
        equ0Var2.Z0(new d());
        com.vk.im.ui.components.dialogs_list.c cVar2 = this.j0;
        if (cVar2 == null) {
            cVar2 = null;
        }
        cVar2.x(new e());
        rw30 rw30Var = this.l0;
        if (rw30Var == null) {
            rw30Var = null;
        }
        rw30Var.h1(new f());
        jr4 jr4Var2 = this.m0;
        if (jr4Var2 == null) {
            jr4Var2 = null;
        }
        jr4Var2.X0(new a());
        this.Y.d();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("entry_point") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.remove("entry_point");
        }
        mxvVar.j().j(kn(), string);
        getArguments();
        this.Z.f((mdz) this.d0.getValue(), null);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        rw30 rw30Var = this.l0;
        if (rw30Var == null) {
            rw30Var = null;
        }
        rw30Var.T0(bundle);
    }

    @Override // xsna.aes
    public final RectF p1() {
        VKImageView vKImageView = this.q0;
        if (vKImageView == null) {
            vKImageView = null;
        }
        return bwt0.G(vKImageView);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        AppBarLayout appBarLayout = this.h0;
        if (appBarLayout == null) {
            appBarLayout = null;
        }
        appBarLayout.g(true, true, true);
        rw30 rw30Var = this.l0;
        if (rw30Var == null) {
            rw30Var = null;
        }
        if (!rw30Var.X0(HideReason.BOTTOM_BAR, false)) {
            com.vk.im.ui.components.dialogs_list.c cVar = this.j0;
            if (!(cVar != null ? cVar : null).v()) {
                return false;
            }
        }
        return true;
    }

    /* compiled from: DialogsFragment.kt */
    /* loaded from: classes2.dex */
    public final class a implements jr4.a {
        public a() {
        }

        @Override // xsna.jr4.a
        public final void a() {
            DialogsFragment dialogsFragment = DialogsFragment.this;
            boolean z = DialogsFragment.u0;
            dialogsFragment.io(true);
        }

        @Override // xsna.jr4.a
        public final void b(i34 i34Var) {
            DialogExt a = i34Var.a();
            PinnedMsg b = i34Var.b();
            Msg a2 = i34Var.b.a();
            DialogsFragment dialogsFragment = DialogsFragment.this;
            if (a != null && a2 != null) {
                DialogsFragment.ho(dialogsFragment, a, "audio_msg_player", new MsgListOpenAtMsgMode(MsgIdType.LOCAL_ID, a2.b), null, 8);
            } else {
                if (a == null || b == null) {
                    return;
                }
                dialogsFragment.T.b().z(dialogsFragment.requireContext(), b, a, dialogsFragment.S.q());
            }
        }

        @Override // xsna.jr4.a
        public final void c() {
        }

        @Override // xsna.jr4.a
        public final void d() {
        }
    }

    /* compiled from: DialogsFragment.kt */
    /* loaded from: classes2.dex */
    public final class d implements xqm {
        public d() {
        }

        @Override // xsna.xqm
        public final void a() {
            DialogsFragment.this.Mf(0, null);
        }

        @Override // xsna.xqm
        public final void b() {
            DialogsFragment dialogsFragment = DialogsFragment.this;
            FragmentActivity kn = dialogsFragment.kn();
            ayv ayvVar = new ayv(kn, new o1e(dialogsFragment, 15));
            if (ayvVar.b == null) {
                av20.a aVar = new av20.a();
                dhr0.a.getClass();
                aVar.d(R.layout.actions_popup_item, LayoutInflater.from(dhr0.E()));
                aVar.d = new yxv(kn);
                aVar.e = new zxv(ayvVar);
                av20 b = aVar.b();
                b.setItems(e43.l(new e520(R.id.call_action_create_with_link, R.drawable.vk_icon_chain_outline_28, R.string.vkim_text_call_action_create_with_link, 1, false, 0, 0, false, null, 0, null, false, 8176), new e520(R.id.call_action_create_scheduled, R.drawable.vk_icon_calendar_add_outline_28, R.string.vkim_text_call_action_create_scheduled, 2, false, 0, 0, false, null, 0, null, false, 8176), new e520(R.id.call_action_open_calls, R.drawable.vk_icon_logo_vk_calls_outline_28, R.string.vkim_text_call_action_go_to_calls, 3, false, 0, 0, false, null, 0, null, false, 8176)));
                ayvVar.b = ((dw20.b) dw20.a.k(new dw20.b(kn, null).a0(new wnh(ayvVar, 20)), b, 4)).I0("call_actions_bottomsheet");
            }
        }

        @Override // xsna.xqm
        public final void c() {
            DialogsFragment dialogsFragment = DialogsFragment.this;
            dialogsFragment.T.b().m(new jbs(dialogsFragment), false, false);
        }

        @Override // xsna.xqm
        public final void e() {
            rw30.i1(DialogsFragment.this.eo(), null, 3);
        }

        @Override // xsna.xqm
        public final void f(View view) {
            DialogsFragment.this.U.b().q(view, HintId.VOIP_PROMO_CREATE_CALL_BUTTON_ON_BAR);
        }

        @Override // xsna.xqm
        public final void d() {
        }
    }

    /* compiled from: DialogsFragment.kt */
    /* loaded from: classes2.dex */
    public final class e implements com.vk.im.ui.components.dialogs_list.a {

        /* compiled from: DialogsFragment.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DialogsFilter.values().length];
                try {
                    iArr[DialogsFilter.MAIN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DialogsFilter.UNREAD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public e() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void b(DialogsFilter dialogsFilter, DialogsFilterChangeSource dialogsFilterChangeSource) {
            DialogsFragment dialogsFragment = DialogsFragment.this;
            pbw pbwVar = dialogsFragment.X;
            mxv mxvVar = dialogsFragment.T;
            int i = g.$EnumSwitchMapping$0[dialogsFilter.ordinal()];
            if (i == 1) {
                mxvVar.b().S(dialogsFragment.requireContext(), "conversations");
                return;
            }
            if (i == 2) {
                ktm a2 = pbwVar.a();
                com.vk.im.ui.components.dialogs_list.c cVar = dialogsFragment.j0;
                a2.a((cVar != null ? cVar : null).i, dialogsFilter, dialogsFilterChangeSource);
                mxvVar.b().l(dialogsFragment.requireContext());
                return;
            }
            if (i == 3) {
                mxvVar.b().a(dialogsFragment.requireContext());
                return;
            }
            ktm a3 = pbwVar.a();
            com.vk.im.ui.components.dialogs_list.c cVar2 = dialogsFragment.j0;
            if (cVar2 == null) {
                cVar2 = null;
            }
            a3.a(cVar2.i, dialogsFilter, dialogsFilterChangeSource);
            equ0 equ0Var = dialogsFragment.i0;
            if (equ0Var == null) {
                equ0Var = null;
            }
            equ0Var.a1(dialogsFilter);
            com.vk.im.ui.components.dialogs_list.c cVar3 = dialogsFragment.j0;
            (cVar3 != null ? cVar3 : null).n(dialogsFilter);
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void c(DialogExt dialogExt) {
            asm asmVar = DialogsFragment.this.p0;
            if (asmVar == null) {
                asmVar = null;
            }
            asmVar.i(dialogExt);
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void f(DialogExt dialogExt) {
            DialogsFragment dialogsFragment = DialogsFragment.this;
            com.vk.im.ui.components.dialogs_list.c cVar = dialogsFragment.j0;
            if (cVar == null) {
                cVar = null;
            }
            int i = a.$EnumSwitchMapping$0[cVar.i.ordinal()];
            DialogsFragment.ho(dialogsFragment, dialogExt, i != 1 ? i != 2 ? "unknown" : "list_unread" : "list_all", null, null, 12);
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void g(InfoModalBottomSheet.Params params) {
            int i = InfoModalBottomSheet.g1;
            InfoModalBottomSheet.b.a(DialogsFragment.this.requireContext(), params);
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void h(boolean z) {
            equ0 equ0Var = DialogsFragment.this.i0;
            if (equ0Var == null) {
                equ0Var = null;
            }
            yqm yqmVar = equ0Var.o;
            yqm yqmVar2 = yqmVar != null ? yqmVar : null;
            yqmVar2.d = z;
            yqmVar2.a();
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void i() {
            mhy.b(DialogsFragment.this.getActivity());
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void j() {
            rw30.i1(DialogsFragment.this.eo(), null, 3);
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void l() {
            DialogsFragment dialogsFragment = DialogsFragment.this;
            dialogsFragment.T.b().m(new jbs(dialogsFragment), false, false);
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void o() {
            mhy.b(DialogsFragment.this.getActivity());
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void n() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void k(boolean z) {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void m(DialogsFilter dialogsFilter) {
        }
    }

    /* compiled from: DialogsFragment.kt */
    /* loaded from: classes2.dex */
    public final class f implements rw30.a {
        public final SearchEntrypoint a = SearchEntrypoint.SEARCH_CHATS;

        public f() {
        }

        @Override // xsna.rw30.a
        public final boolean a(Dialog dialog) {
            return true;
        }

        @Override // xsna.rw30.a
        public final boolean b(Dialog dialog) {
            return true;
        }

        @Override // xsna.rw30.a
        public final void d(Dialog dialog, int i) {
            DialogsFragment.ho(DialogsFragment.this, new DialogExt(dialog, (ProfilesInfo) null, 2, (zcl) null), "message_search", new MsgListOpenAtMsgMode(MsgIdType.CNV_ID, i), null, 8);
        }

        @Override // xsna.rw30.a
        public final void e(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo, ImSearchItemLoggingInfo imSearchItemLoggingInfo) {
            DialogsFragment.ho(DialogsFragment.this, new DialogExt(dialog, new ProfilesInfo(profilesSimpleInfo)), "conversations_search", null, imSearchItemLoggingInfo, 4);
        }

        @Override // xsna.rw30.a
        public final SearchEntrypoint g() {
            return this.a;
        }

        @Override // xsna.rw30.a
        public final void i() {
            equ0 equ0Var = DialogsFragment.this.i0;
            if (equ0Var == null) {
                equ0Var = null;
            }
            yqm yqmVar = equ0Var.o;
            (yqmVar != null ? yqmVar : null).c.show();
        }

        @Override // xsna.rw30.a
        public final void c(long j, boolean z) {
        }

        @Override // xsna.rw30.a
        public final void f(long j, boolean z) {
        }

        @Override // xsna.rw30.a
        public final void h(long j, boolean z) {
        }
    }
}
