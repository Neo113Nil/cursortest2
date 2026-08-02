package com.vk.im.ui.dialogs_list;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.AppBarShadowView;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.engine.models.reporters.DialogsFilterChangeSource;
import com.vk.im.engine.models.search.SearchEntrypoint;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.components.msg_search.vc.HideReason;
import com.vk.im.ui.dialogs_list.ImDialogsFragment;
import com.vk.im.ui.fragments.ImFragment;
import com.vk.im.ui.fragments.chat.ChatAnalyticsParams;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.completable.o;
import kotlin.NoWhenBranchMatchedException;
import me.zhanghai.android.materialprogressbar.MaterialProgressBar;
import xsna.a1w;
import xsna.asm;
import xsna.asu0;
import xsna.b25;
import xsna.bcw;
import xsna.bwt0;
import xsna.cau0;
import xsna.dx90;
import xsna.e3m;
import xsna.fpf0;
import xsna.fsm;
import xsna.g2v;
import xsna.gv5;
import xsna.gzs;
import xsna.i34;
import xsna.i7o0;
import xsna.iou;
import xsna.ir4;
import xsna.itg0;
import xsna.jbs;
import xsna.jr4;
import xsna.jw5;
import xsna.k9u0;
import xsna.krl0;
import xsna.lmp0;
import xsna.ltm;
import xsna.m7m;
import xsna.mhy;
import xsna.mk5;
import xsna.mxv;
import xsna.n0v0;
import xsna.o0w;
import xsna.o25;
import xsna.ow90;
import xsna.ox30;
import xsna.q1w;
import xsna.qhh0;
import xsna.r0w;
import xsna.rw30;
import xsna.s1m;
import xsna.sxc0;
import xsna.szf0;
import xsna.too0;
import xsna.vtm;
import xsna.xqm;
import xsna.yqm;
import xsna.zdw;
import xsna.zmp0;
import xsna.zvm;

/* compiled from: ImDialogsFragment.kt */
/* loaded from: classes.dex */
public class ImDialogsFragment extends ImFragment implements qhh0, gv5, too0, szf0 {
    public static final /* synthetic */ int k0 = 0;
    public final a1w P;
    public final mxv Q;
    public final zdw R;
    public final b25 S;
    public final ir4 T;
    public final bcw U;
    public ViewGroup V;
    public FloatingActionButton W;
    public AppBarShadowView X;
    public final c Y;
    public com.vk.im.ui.components.dialogs_list.c Z;
    public vtm a0;
    public final b b0;
    public r0w c0;
    public final d d0;
    public rw30 e0;
    public zvm f0;
    public jr4 g0;
    public ViewGroup h0;
    public ViewStub i0;
    public asm j0;

    /* compiled from: ImDialogsFragment.kt */
    /* loaded from: classes2.dex */
    public final class b implements xqm {
        public b() {
        }

        @Override // xsna.xqm
        public final void a() {
            ImDialogsFragment.this.Mf(0, null);
        }

        @Override // xsna.xqm
        public final void b() {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.xqm
        public final void c() {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.xqm
        public final void d() {
            ImDialogsFragment imDialogsFragment = ImDialogsFragment.this;
            imDialogsFragment.Q.b().a(imDialogsFragment.requireContext());
        }

        @Override // xsna.xqm
        public final void e() {
            ImDialogsFragment imDialogsFragment = ImDialogsFragment.this;
            rw30.i1(imDialogsFragment.eo(), null, 3);
            FloatingActionButton floatingActionButton = imDialogsFragment.W;
            if (floatingActionButton == null) {
                floatingActionButton = null;
            }
            floatingActionButton.g(null, true);
        }

        @Override // xsna.xqm
        public final void f(View view) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ImDialogsFragment.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SearchMode.values().length];
            try {
                iArr[SearchMode.PEERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchMode.MESSAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchMode.CHANNELS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DialogsFilter.values().length];
            try {
                iArr2[DialogsFilter.BUSINESS_NOTIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DialogsFilter.ARCHIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ImDialogsFragment() {
        a1w a1wVar = q1w.a;
        this.P = a1wVar == null ? null : a1wVar;
        mxv c2 = g2v.c();
        this.Q = c2;
        zdw zdwVar = i7o0.b;
        this.R = zdwVar != null ? zdwVar : null;
        this.S = o25.a();
        this.T = c2.m();
        this.U = ((ImReportersComponent) m7m.d(this).a(fpf0.a(ImReportersComponent.class))).K().c();
        this.Y = new c();
        this.b0 = new b();
        this.d0 = new d();
    }

    public static void go(ImDialogsFragment imDialogsFragment, DialogExt dialogExt, Integer num, String str, ImSearchItemLoggingInfo imSearchItemLoggingInfo, int i) {
        Integer num2 = (i & 2) != 0 ? null : num;
        o0w.x(imDialogsFragment.Q.b(), imDialogsFragment.kn(), null, dialogExt.getId(), dialogExt, null, num2 == null ? MsgListOpenAtUnreadMode.b : new MsgListOpenAtMsgMode(MsgIdType.CNV_ID, num2.intValue()), (i & 8) == 0, null, null, null, null, null, null, str, null, null, null, false, null, null, new ChatAnalyticsParams(null, null, null, null, false, null, null, (i & 16) != 0 ? null : imSearchItemLoggingInfo, null, 383, null), null, null, 1040179090);
    }

    @Override // xsna.szf0
    public final boolean Hg(Bundle bundle) {
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        FloatingActionButton floatingActionButton = this.W;
        if (floatingActionButton == null) {
            floatingActionButton = null;
        }
        floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_background_modal, requireContext())));
        FloatingActionButton floatingActionButton2 = this.W;
        (floatingActionButton2 != null ? floatingActionButton2 : null).setImageTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_accent, requireContext())));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        boolean X0;
        rw30 rw30Var = this.e0;
        if (rw30Var == null) {
            return false;
        }
        X0 = rw30Var.X0(HideReason.BACK, false);
        return X0;
    }

    public final rw30 eo() {
        rw30 rw30Var = this.e0;
        if (rw30Var != null) {
            return rw30Var;
        }
        ViewGroup viewGroup = (ViewGroup) requireView();
        ox30.a aVar = ox30.a.b;
        this.Q.getClass();
        rw30 rw30Var2 = new rw30(this.P, k9u0.a, kn(), aVar, null, 112);
        rw30Var2.h1(this.d0);
        rw30Var2.D0(requireContext(), viewGroup, (ViewStub) viewGroup.findViewById(R.id.im_dialogs_search_container), null);
        this.e0 = rw30Var2;
        return rw30Var2;
    }

    public final void fo(boolean z) {
        if (z) {
            this.Q.getClass();
            n0v0.a.g();
            com.vk.im.ui.components.dialogs_list.c cVar = this.Z;
            if (cVar != null) {
                cVar.h();
            }
            jr4 jr4Var = this.g0;
            (jr4Var != null ? jr4Var : null).V0();
        } else {
            com.vk.im.ui.components.dialogs_list.c cVar2 = this.Z;
            if (cVar2 != null) {
                cVar2.g();
            }
            jr4 jr4Var2 = this.g0;
            (jr4Var2 != null ? jr4Var2 : null).W0();
        }
        ir4 ir4Var = this.T;
        if (ir4Var.m()) {
            ir4Var.E(jw5.f);
            ho(false);
        }
    }

    public final void ho(boolean z) {
        final boolean t = this.T.t();
        ViewGroup viewGroup = this.h0;
        ViewStub viewStub = this.i0;
        if (t && !bwt0.J(viewStub)) {
            jr4 jr4Var = this.g0;
            if (jr4Var == null) {
                jr4Var = null;
            }
            jr4Var.D0(requireContext(), (ViewGroup) viewStub.getParent(), viewStub, null);
        }
        if (t || bwt0.J(viewStub)) {
            if (!z) {
                AppBarShadowView appBarShadowView = this.X;
                if (appBarShadowView == null) {
                    appBarShadowView = null;
                }
                appBarShadowView.setForceMode(t ? 2 : null);
                viewGroup.setVisibility(t ? 0 : 8);
                return;
            }
            mk5 mk5Var = new mk5();
            mk5Var.e(180L);
            mk5Var.g(0);
            lmp0.a(mk5Var, new gzs() { // from class: xsna.q0w
                @Override // xsna.gzs
                public final Object invoke() {
                    AppBarShadowView appBarShadowView2 = ImDialogsFragment.this.X;
                    if (appBarShadowView2 == null) {
                        appBarShadowView2 = null;
                    }
                    appBarShadowView2.setForceMode(t ? 2 : null);
                    return s3q0.a;
                }
            });
            ViewGroup viewGroup2 = this.V;
            zmp0.a(viewGroup2 != null ? viewGroup2 : null, mk5Var);
            viewGroup.setVisibility(t ? 0 : 8);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.U.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        DialogsFilter o;
        this.V = (ViewGroup) layoutInflater.inflate(R.layout.im_fragment_dialogs, viewGroup, false);
        this.j0 = new asm(kn(), this.P);
        ViewGroup viewGroup2 = this.V;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        ViewStub viewStub = (ViewStub) viewGroup2.findViewById(R.id.im_dialogs_list_stub);
        a1w a1wVar = this.P;
        zdw zdwVar = this.R;
        RecyclerView.u b2 = zdwVar.f().a().b();
        LayoutInflater a2 = zdwVar.f().a().a();
        FragmentActivity kn = kn();
        zdw zdwVar2 = i7o0.b;
        zdw zdwVar3 = zdwVar2 != null ? zdwVar2 : null;
        krl0 a3 = sxc0.a();
        if (o25.b(this.S)) {
            cau0 cau0Var = a1wVar.r().h;
        }
        this.Q.getClass();
        fsm fsmVar = new fsm(kn, zdwVar3, a3, true, false, true, true, true, BuildInfo.t(), new s1m(this, 17), null, null, 6144);
        mxv mxvVar = this.Q;
        zdw zdwVar4 = this.R;
        asm asmVar = this.j0;
        boolean a4 = fsmVar.a();
        ltm.a.getClass();
        vtm vtmVar = new vtm(b2, a2, mxvVar, zdwVar4, asmVar, a4, ltm.a.a());
        vtmVar.c(viewStub);
        this.a0 = vtmVar;
        com.vk.im.ui.components.dialogs_list.c cVar = new com.vk.im.ui.components.dialogs_list.c(a1wVar, fsmVar);
        cVar.x(this.Y);
        cVar.c(this.a0);
        cVar.w(true);
        cVar.z(true);
        DialogsFilter dialogsFilter = DialogsFilter.MAIN;
        cVar.s(dialogsFilter);
        this.Z = cVar;
        ViewGroup viewGroup3 = this.V;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        ViewStub viewStub2 = (ViewStub) viewGroup3.findViewById(R.id.dialogs_header_container);
        r0w r0wVar = new r0w(this.P, this.Q, this.S);
        r0wVar.D0(viewStub2.getContext(), (ViewGroup) viewStub2.getParent(), viewStub2, null);
        r0wVar.Y0(this.b0);
        r0wVar.V0();
        r0wVar.X0();
        this.c0 = r0wVar;
        ViewGroup viewGroup4 = this.V;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        MaterialProgressBar materialProgressBar = (MaterialProgressBar) viewGroup4.findViewById(R.id.im_sync_state_progress_bar);
        a1w a1wVar2 = q1w.a;
        if (a1wVar2 == null) {
            a1wVar2 = null;
        }
        zvm zvmVar = new zvm(a1wVar2, materialProgressBar);
        zvmVar.C0(materialProgressBar.getContext(), (ViewGroup) materialProgressBar.getParent(), null);
        zvmVar.V0();
        zvmVar.Y0();
        this.f0 = zvmVar;
        ViewGroup viewGroup5 = this.V;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        FloatingActionButton floatingActionButton = (FloatingActionButton) viewGroup5.findViewById(R.id.vkim_fab);
        this.W = floatingActionButton;
        bwt0.i0(floatingActionButton, new iou(this, 4));
        FloatingActionButton floatingActionButton2 = this.W;
        if (floatingActionButton2 == null) {
            floatingActionButton2 = null;
        }
        floatingActionButton2.setBackgroundTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_background_modal, requireContext())));
        FloatingActionButton floatingActionButton3 = this.W;
        if (floatingActionButton3 == null) {
            floatingActionButton3 = null;
        }
        floatingActionButton3.setImageTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_accent, requireContext())));
        ViewGroup viewGroup6 = this.V;
        if (viewGroup6 == null) {
            viewGroup6 = null;
        }
        this.X = (AppBarShadowView) viewGroup6.findViewById(R.id.im_appbar_shadow);
        ViewGroup viewGroup7 = this.V;
        if (viewGroup7 == null) {
            viewGroup7 = null;
        }
        a aVar = new a();
        ViewGroup viewGroup8 = (ViewGroup) viewGroup7.findViewById(R.id.audio_msg_player_container);
        viewGroup8.setVisibility(8);
        this.h0 = viewGroup8;
        this.i0 = (ViewStub) viewGroup7.findViewById(R.id.audio_msg_player_stub);
        jr4 jr4Var = new jr4(this.P, this.Q.m(), aVar);
        this.g0 = jr4Var;
        jr4Var.Y0();
        ho(false);
        com.vk.im.ui.components.dialogs_list.c cVar2 = this.Z;
        if (cVar2 != null && (o = cVar2.o()) != null) {
            dialogsFilter = o;
        }
        r0w r0wVar2 = this.c0;
        if (r0wVar2 != null) {
            r0wVar2.Z0(dialogsFilter);
        }
        ViewGroup viewGroup9 = this.V;
        if (viewGroup9 == null) {
            return null;
        }
        return viewGroup9;
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.vk.im.ui.components.dialogs_list.c cVar = this.Z;
        if (cVar != null) {
            cVar.x(null);
            cVar.e();
            cVar.d();
            this.Z = null;
        }
        vtm vtmVar = this.a0;
        if (vtmVar != null) {
            vtmVar.d();
            this.a0 = null;
        }
        r0w r0wVar = this.c0;
        if (r0wVar != null) {
            r0wVar.Y0(null);
            r0wVar.H0();
            r0wVar.G0();
        }
        rw30 rw30Var = this.e0;
        if (rw30Var != null) {
            rw30Var.h1(null);
            rw30Var.H0();
            rw30Var.G0();
        }
        zvm zvmVar = this.f0;
        if (zvmVar != null) {
            zvmVar.H0();
            zvmVar.G0();
        }
        jr4 jr4Var = this.g0;
        if (jr4Var == null) {
            jr4Var = null;
        }
        jr4Var.H0();
        jr4Var.G0();
        this.h0 = null;
        this.i0 = null;
        asm asmVar = this.j0;
        if (asmVar != null) {
            asmVar.g();
        }
        this.j0 = null;
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        fo(false);
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        fo(true);
        ((ImReportersComponent) m7m.d(this).a(fpf0.a(ImReportersComponent.class))).K().h().a();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.e0 != null) {
            bundle.putBoolean("is_search_component_initialized", true);
            rw30 rw30Var = this.e0;
            if (rw30Var != null) {
                rw30Var.U0(bundle);
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.U.d();
        dx90 dx90Var = ow90.e;
        dx90Var.getClass();
        dx90Var.h = System.currentTimeMillis();
        dx90Var.r();
        this.N.b(itg0.l(new o(new com.vk.im.ui.fragments.chat.b()).q(asu0.a.c())));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle == null || !bundle.getBoolean("is_search_component_initialized", false)) {
            return;
        }
        eo().T0(bundle);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        boolean X0;
        rw30 rw30Var = this.e0;
        if (rw30Var != null) {
            X0 = rw30Var.X0(HideReason.BOTTOM_BAR, false);
            if (X0) {
                return true;
            }
        }
        vtm vtmVar = this.a0;
        if (vtmVar != null) {
            return vtmVar.j();
        }
        return false;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        rw30 rw30Var = this.e0;
        if (rw30Var == null || !rw30Var.c1()) {
            return;
        }
        int i = e.$EnumSwitchMapping$0[rw30Var.Z0().ordinal()];
        if (i == 1) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.IM_SEARCH_CHATS;
        } else if (i == 2) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.IM_SEARCH_MESSAGES;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.IM_SEARCH_CHANNELS;
        }
        uiTrackingScreen.a = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    /* compiled from: ImDialogsFragment.kt */
    /* loaded from: classes2.dex */
    public final class a implements jr4.a {
        public a() {
        }

        @Override // xsna.jr4.a
        public final void a() {
            int i = ImDialogsFragment.k0;
            ImDialogsFragment.this.ho(true);
        }

        @Override // xsna.jr4.a
        public final void b(i34 i34Var) {
            ImDialogsFragment imDialogsFragment = ImDialogsFragment.this;
            mxv mxvVar = imDialogsFragment.Q;
            DialogExt a = i34Var.a();
            Dialog a2 = i34Var.a.a();
            PinnedMsg dc = a2 != null ? a2.dc() : null;
            Msg a3 = i34Var.b.a();
            if (a != null && a3 != null) {
                o0w.x(mxvVar.b(), imDialogsFragment.kn(), null, a.e, a, null, new MsgListOpenAtMsgMode(MsgIdType.LOCAL_ID, a3.b), true, null, null, null, null, null, null, "audio_msg_player", null, null, null, false, null, null, null, null, null, 1073733522);
            } else {
                if (a == null || dc == null) {
                    return;
                }
                mxvVar.b().z(imDialogsFragment.requireContext(), dc, a, imDialogsFragment.P.q());
            }
        }

        @Override // xsna.jr4.a
        public final void c() {
        }

        @Override // xsna.jr4.a
        public final void d() {
        }
    }

    /* compiled from: ImDialogsFragment.kt */
    /* loaded from: classes2.dex */
    public final class c implements com.vk.im.ui.components.dialogs_list.a {

        /* compiled from: ImDialogsFragment.kt */
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
                try {
                    iArr[DialogsFilter.REQUESTS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DialogsFilter.BUSINESS_NOTIFY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public c() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void b(DialogsFilter dialogsFilter, DialogsFilterChangeSource dialogsFilterChangeSource) {
            ImDialogsFragment imDialogsFragment = ImDialogsFragment.this;
            mxv mxvVar = imDialogsFragment.Q;
            int i = e.$EnumSwitchMapping$1[dialogsFilter.ordinal()];
            if (i == 1) {
                mxvVar.b().S(imDialogsFragment.requireContext(), "conversations");
                return;
            }
            if (i == 2) {
                mxvVar.b().a(imDialogsFragment.requireContext());
                return;
            }
            ((ImReportersComponent) m7m.d(imDialogsFragment).a(fpf0.a(ImReportersComponent.class))).K().a().a(imDialogsFragment.Z.i, dialogsFilter, dialogsFilterChangeSource);
            if (dialogsFilter == DialogsFilter.REQUESTS) {
                mxvVar.b().l(imDialogsFragment.requireContext());
                return;
            }
            com.vk.im.ui.components.dialogs_list.c cVar = imDialogsFragment.Z;
            if (cVar != null) {
                cVar.n(dialogsFilter);
            }
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void c(DialogExt dialogExt) {
            asm asmVar = ImDialogsFragment.this.j0;
            if (asmVar != null) {
                asmVar.i(dialogExt);
            }
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void f(DialogExt dialogExt) {
            String str;
            ImDialogsFragment imDialogsFragment = ImDialogsFragment.this;
            DialogsFilter dialogsFilter = imDialogsFragment.Z.i;
            int i = a.$EnumSwitchMapping$0[dialogsFilter.ordinal()];
            if (i == 1) {
                str = "list_all";
            } else if (i == 2) {
                str = "list_unread";
            } else if (i == 3) {
                str = "list_requests";
            } else {
                if (i != 4) {
                    throw new IllegalArgumentException("Unsupported filter=" + dialogsFilter);
                }
                str = "list_business_notify";
            }
            ImDialogsFragment.go(imDialogsFragment, dialogExt, null, str, null, 26);
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void g(InfoModalBottomSheet.Params params) {
            int i = InfoModalBottomSheet.g1;
            InfoModalBottomSheet.b.a(ImDialogsFragment.this.requireContext(), params);
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void h(boolean z) {
            ImDialogsFragment imDialogsFragment = ImDialogsFragment.this;
            r0w r0wVar = imDialogsFragment.c0;
            if (r0wVar != null) {
                yqm yqmVar = r0wVar.n;
                if (yqmVar == null) {
                    yqmVar = null;
                }
                yqmVar.d = z;
                yqmVar.a();
            }
            zvm zvmVar = imDialogsFragment.f0;
            if (zvmVar != null) {
                zvmVar.k = z;
                zvmVar.X0();
            }
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void i() {
            mhy.d(ImDialogsFragment.this.getView());
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void l() {
            g2v.c().b().m(new jbs(ImDialogsFragment.this), false, false);
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void m(DialogsFilter dialogsFilter) {
            int i = ImDialogsFragment.k0;
            r0w r0wVar = ImDialogsFragment.this.c0;
            if (r0wVar != null) {
                r0wVar.Z0(dialogsFilter);
            }
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void o() {
            mhy.d(ImDialogsFragment.this.getView());
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void j() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void n() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void k(boolean z) {
        }
    }

    @Override // xsna.y760
    public final void h9(Intent intent) {
    }

    /* compiled from: ImDialogsFragment.kt */
    /* loaded from: classes2.dex */
    public final class d implements rw30.a {
        public final SearchEntrypoint a = SearchEntrypoint.IM_SEARCH_CHATS;

        public d() {
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
            ImDialogsFragment.go(ImDialogsFragment.this, new DialogExt(dialog, new ProfilesInfo()), Integer.valueOf(i), "message_search", null, 16);
        }

        @Override // xsna.rw30.a
        public final void e(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo, ImSearchItemLoggingInfo imSearchItemLoggingInfo) {
            ImDialogsFragment.go(ImDialogsFragment.this, new DialogExt(dialog, new ProfilesInfo(profilesSimpleInfo)), null, "conversations_search", imSearchItemLoggingInfo, 10);
        }

        @Override // xsna.rw30.a
        public final SearchEntrypoint g() {
            return this.a;
        }

        @Override // xsna.rw30.a
        public final void i() {
            ImDialogsFragment imDialogsFragment = ImDialogsFragment.this;
            FloatingActionButton floatingActionButton = imDialogsFragment.W;
            if (floatingActionButton == null) {
                floatingActionButton = null;
            }
            floatingActionButton.l(null, true);
            r0w r0wVar = imDialogsFragment.c0;
            if (r0wVar != null) {
                yqm yqmVar = r0wVar.n;
                (yqmVar != null ? yqmVar : null).c.show();
            }
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
