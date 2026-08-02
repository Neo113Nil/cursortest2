package com.vk.im.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.k0;
import com.vk.contacts.AndroidContact;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.reporters.DialogsFilterChangeSource;
import com.vk.im.engine.models.search.SearchEntrypoint;
import com.vk.im.engine.models.user.ImAddChatUserSource;
import com.vk.im.ui.components.dialogs_list.ChooseMode;
import com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet;
import com.vk.im.ui.components.dialogs_list.e;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.components.msg_search.vc.HideReason;
import com.vk.im.ui.views.settings.SwitchSettingsView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.j;
import io.reactivex.rxjava3.internal.operators.single.n;
import io.reactivex.rxjava3.internal.operators.single.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a1w;
import xsna.asu0;
import xsna.b0u0;
import xsna.b25;
import xsna.bpn0;
import xsna.bwt0;
import xsna.bzb0;
import xsna.c5g;
import xsna.cem;
import xsna.cwb0;
import xsna.cwg;
import xsna.d5;
import xsna.ez;
import xsna.f1w;
import xsna.fsm;
import xsna.g2v;
import xsna.g54;
import xsna.h60;
import xsna.ho1;
import xsna.i7o0;
import xsna.ies;
import xsna.iut0;
import xsna.jbs;
import xsna.k82;
import xsna.k9u0;
import xsna.krl0;
import xsna.ll1;
import xsna.ltm;
import xsna.lzv;
import xsna.mhy;
import xsna.mm6;
import xsna.msy;
import xsna.mtb;
import xsna.mxv;
import xsna.o0r0;
import xsna.o0w;
import xsna.o25;
import xsna.oh;
import xsna.ox30;
import xsna.oz50;
import xsna.p4g;
import xsna.qcy;
import xsna.rl3;
import xsna.rw30;
import xsna.sbc;
import xsna.sxc0;
import xsna.urm;
import xsna.v0w;
import xsna.vtm;
import xsna.vu5;
import xsna.wvv;
import xsna.x5i;
import xsna.xis;
import xsna.xqf;
import xsna.xqm;
import xsna.y3i;
import xsna.yi2;
import xsna.yqm;
import xsna.zdw;
import xsna.zf1;

/* compiled from: ImDialogsSelectionFragment.kt */
/* loaded from: classes2.dex */
public final class ImDialogsSelectionFragment extends ImFragment implements ies {
    public static final /* synthetic */ int n0 = 0;
    public final Object P = msy.a(LazyThreadSafetyMode.NONE, new x5i(this, 27));
    public final bpn0 Q = new bpn0(new xqf(this, 26));
    public final bpn0 R = new bpn0(new xis(this, 9));
    public final bpn0 S = new bpn0(new cwg(this, 27));
    public final mxv T = g2v.c();
    public final zdw U;
    public final b25 V;
    public final int W;
    public boolean X;
    public Bundle Y;
    public ChooseMode Z;
    public Object a0;
    public Object b0;
    public ViewGroup c0;
    public SwitchSettingsView d0;
    public FrameLayout e0;
    public final c f0;
    public com.vk.im.ui.components.dialogs_list.c g0;
    public vtm h0;
    public final b i0;
    public sbc j0;
    public final d k0;
    public rw30 l0;
    public bzb0 m0;

    /* compiled from: ImDialogsSelectionFragment.kt */
    public static final class a extends oz50 {
        public a(ChooseMode chooseMode) {
            super(ImDialogsSelectionFragment.class, null, null);
            this.j.putParcelable("choose_mode", chooseMode);
        }

        public final void A(boolean z) {
            this.j.putBoolean("is_pop_up", z);
        }

        public final void B(Bundle bundle) {
            this.j.putBundle("arguments", bundle);
        }

        public final void y() {
            this.j.putBoolean("instant", true);
        }

        public final void z(Peer peer) {
            this.j.putParcelableArrayList("members", p4g.q(Collections.singletonList(peer)));
        }
    }

    /* compiled from: ImDialogsSelectionFragment.kt */
    public final class b implements xqm {
        public b() {
        }

        @Override // xsna.xqm
        public final void a() {
            ImDialogsSelectionFragment.this.Mf(0, null);
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
            throw new UnsupportedOperationException();
        }

        @Override // xsna.xqm
        public final void e() {
            ImDialogsSelectionFragment imDialogsSelectionFragment = ImDialogsSelectionFragment.this;
            rw30 rw30Var = imDialogsSelectionFragment.l0;
            if (rw30Var == null) {
                ViewGroup viewGroup = (ViewGroup) imDialogsSelectionFragment.requireView();
                a1w a1wVar = (a1w) imDialogsSelectionFragment.Q.getValue();
                imDialogsSelectionFragment.T.getClass();
                rw30 rw30Var2 = new rw30(a1wVar, k9u0.a, imDialogsSelectionFragment.kn(), ox30.c.b, null, 112);
                rw30Var2.w = imDialogsSelectionFragment.k0;
                rw30Var2.D0(imDialogsSelectionFragment.requireContext(), viewGroup, (ViewStub) viewGroup.findViewById(R.id.im_dialogs_search_container), null);
                imDialogsSelectionFragment.l0 = rw30Var2;
                rw30Var = rw30Var2;
            }
            rw30.i1(rw30Var, null, 3);
        }

        @Override // xsna.xqm
        public final void f(View view) {
            throw new UnsupportedOperationException();
        }
    }

    public ImDialogsSelectionFragment() {
        zdw zdwVar = i7o0.b;
        this.U = zdwVar == null ? null : zdwVar;
        this.V = o25.a();
        this.W = 1;
        this.X = true;
        this.f0 = new c();
        this.i0 = new b();
        this.k0 = new d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [io.reactivex.rxjava3.disposables.b] */
    /* JADX WARN: Type inference failed for: r12v3, types: [T, io.reactivex.rxjava3.disposables.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    public static final void eo(ImDialogsSelectionFragment imDialogsSelectionFragment, DialogExt dialogExt) {
        Dialog Cb = dialogExt.Cb();
        if (Cb != null) {
            ChooseMode chooseMode = imDialogsSelectionFragment.Z;
            if (chooseMode == null) {
                chooseMode = null;
            }
            if (chooseMode.a(Cb)) {
                ChooseMode chooseMode2 = imDialogsSelectionFragment.Z;
                if (chooseMode2 == null) {
                    chooseMode2 = null;
                }
                if (chooseMode2 instanceof ChooseMode.ReturnDialog) {
                    if (imDialogsSelectionFragment.X) {
                        imDialogsSelectionFragment.fo(dialogExt);
                        return;
                    } else {
                        bzb0 bzb0Var = imDialogsSelectionFragment.m0;
                        bzb0.d(bzb0Var == null ? null : bzb0Var, cwb0.x0.l, new d5(10, imDialogsSelectionFragment, dialogExt), null, null, 28);
                        return;
                    }
                }
                if (!(chooseMode2 instanceof ChooseMode.InviteToChat)) {
                    throw new NoWhenBranchMatchedException();
                }
                ImAddChatUserSource imAddChatUserSource = ((ChooseMode.InviteToChat) chooseMode2).f;
                SwitchSettingsView switchSettingsView = imDialogsSelectionFragment.d0;
                if (switchSettingsView == null) {
                    switchSettingsView = null;
                }
                int i = switchSettingsView.getChecked() ? ((f1w) imDialogsSelectionFragment.R.getValue()).c().i() : 0;
                Peer peer = dialogExt.f;
                Source source = Source.CACHE;
                Object obj = imDialogsSelectionFragment.a0;
                ?? r5 = obj;
                if (obj == null) {
                    r5 = 0;
                }
                cem cemVar = new cem(peer, source, false, r5);
                Peer peer2 = dialogExt.f;
                Object obj2 = imDialogsSelectionFragment.a0;
                if (obj2 == null) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                ?? r52 = imDialogsSelectionFragment.b0;
                urm urmVar = new urm(peer2, collection, (Collection) (r52 != 0 ? r52 : null), i, imAddChatUserSource, true, null, 64);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                x b2 = ((lzv) imDialogsSelectionFragment.S.getValue()).b(imDialogsSelectionFragment, cemVar);
                asu0 asu0Var = asu0.a;
                ?? subscribe = new j(new n(new r(b2.q(asu0Var.c()).l(new yi2(new g54(28), 22)), new mm6(new ll1(11, imDialogsSelectionFragment, urmVar), 20)), new ho1(new com.vk.libvideo.b(16, imDialogsSelectionFragment, ref$ObjectRef), 28)).m(asu0Var.d()), new mtb(imDialogsSelectionFragment, 2)).subscribe(new ez(new zf1(15, imDialogsSelectionFragment, dialogExt), 24), new h60(new k82(10, imDialogsSelectionFragment, dialogExt), 28));
                imDialogsSelectionFragment.N.b(subscribe);
                ref$ObjectRef.element = subscribe;
                return;
            }
        }
        ChooseMode chooseMode3 = imDialogsSelectionFragment.Z;
        (chooseMode3 != null ? chooseMode3 : null).d(imDialogsSelectionFragment.requireContext(), Cb);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017 A[RETURN] */
    @Override // com.vk.core.fragments.FragmentImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a0() {
        boolean z;
        rw30 rw30Var = this.l0;
        if (rw30Var != null) {
            HideReason hideReason = HideReason.BACK;
            qcy<Object>[] qcyVarArr = rw30.D;
            if (rw30Var.X0(hideReason, false)) {
                z = true;
                com.vk.im.ui.components.dialogs_list.c cVar = this.g0;
                if (!z) {
                    return true;
                }
                if (cVar != null) {
                    DialogsFilter dialogsFilter = cVar.i;
                    ChooseMode chooseMode = this.Z;
                    if (dialogsFilter != (chooseMode == null ? null : chooseMode).c) {
                        if (chooseMode == null) {
                            chooseMode = null;
                        }
                        cVar.n(chooseMode.c);
                        return true;
                    }
                }
                return false;
            }
        }
        z = false;
        com.vk.im.ui.components.dialogs_list.c cVar2 = this.g0;
        if (!z) {
        }
    }

    public final void fo(DialogExt dialogExt) {
        Bundle bundle;
        Peer peer = dialogExt.f;
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("is_pop_up")) {
            Intent putExtra = new Intent().putExtra("dialog_id", peer);
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (bundle = arguments2.getBundle("arguments")) == null) {
                bundle = Bundle.EMPTY;
            }
            Intent putExtra2 = putExtra.putExtra("arguments", bundle);
            String a2 = vu5.a(']', dialogExt.e, new StringBuilder("DialogExt["));
            LinkedBlockingDeque<String> linkedBlockingDeque = com.vk.core.util.state.a.a;
            Bundle bundle2 = new Bundle();
            com.vk.core.util.state.a.c(bundle2, a2, dialogExt);
            bundle2.putString("dialog_ext_state_key", a2);
            bundle2.putParcelable("dialog_id", peer);
            putExtra2.putExtra("dialog_ext_state", bundle2);
            setResult(-1, putExtra2);
        } else {
            o0w b2 = this.T.b();
            Context requireContext = requireContext();
            long j = dialogExt.e;
            Bundle bundle3 = this.Y;
            if (bundle3 == null) {
                bundle3 = null;
            }
            ArrayList parcelableArrayList = bundle3.getParcelableArrayList("fwd_ids");
            if (parcelableArrayList == null) {
                parcelableArrayList = new ArrayList();
            }
            o0w.x(b2, requireContext, null, j, dialogExt, null, null, false, null, null, parcelableArrayList, null, null, null, "share", null, null, null, false, null, null, null, null, null, 1073733106);
        }
        finish();
    }

    public final void go(DialogExt dialogExt) {
        o0w.x(this.T.b(), kn(), null, dialogExt.e, dialogExt, null, null, false, null, null, null, null, null, null, "share", null, null, null, false, null, null, null, null, null, 1073733618);
        wvv.b(wvv.a, new oh(this, 6), 300L, 0L, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r1 != null) goto L18;
     */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i, int i2, Intent intent) {
        long[] jArr;
        List list;
        if (i2 != -1) {
            finish();
            return;
        }
        if (i == this.W) {
            if (intent == null || (jArr = intent.getLongArrayExtra("ids")) == null) {
                jArr = new long[0];
            }
            if (intent != null) {
                list = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("selectedContacts", AndroidContact.class) : intent.getParcelableArrayListExtra("selectedContacts");
            }
            list = EmptyList.b;
            o0w.P(this.T.b(), new jbs(this), rl3.t0(jArr), list, null, 24);
            wvv.b(wvv.a, new oh(this, 6), 300L, 0L, 12);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Parcelable parcelable;
        Object parcelable2;
        super.onAttach(context);
        Bundle requireArguments = requireArguments();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelable2 = requireArguments.getParcelable("choose_mode", ChooseMode.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable("choose_mode");
            if (!(parcelable3 instanceof ChooseMode)) {
                parcelable3 = null;
            }
            parcelable = (ChooseMode) parcelable3;
        }
        this.Z = (ChooseMode) parcelable;
        this.X = requireArguments.getBoolean("instant", this.X);
        Bundle bundle = requireArguments.getBundle("arguments");
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        this.Y = bundle;
        Object parcelableArrayList = i >= 33 ? requireArguments.getParcelableArrayList("members", Peer.class) : requireArguments.getParcelableArrayList("members");
        if (parcelableArrayList == null) {
            parcelableArrayList = EmptyList.b;
        }
        this.a0 = parcelableArrayList;
        Object stringArrayList = requireArguments.getStringArrayList("selectedPhoneNumbers");
        if (stringArrayList == null) {
            stringArrayList = EmptyList.b;
        }
        this.b0 = stringArrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.vkim_fragment_choose_dialogs, viewGroup, false);
        this.c0 = viewGroup2;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        ViewStub viewStub = (ViewStub) viewGroup2.findViewById(R.id.im_dialogs_list_stub);
        zdw zdwVar = this.U;
        k0 o = zdwVar.f().a.d.o();
        LayoutInflater p = zdwVar.f().a.d.p();
        FragmentActivity kn = kn();
        krl0 a2 = sxc0.a();
        boolean t = BuildInfo.t();
        y3i y3iVar = new y3i(this, 15);
        ChooseMode chooseMode = this.Z;
        fsm fsmVar = new fsm(kn, this.U, a2, false, false, false, false, true, t, y3iVar, chooseMode == null ? null : chooseMode, null, 6144);
        ltm.a.getClass();
        vtm vtmVar = new vtm(o, p, this.T, this.U, null, fsmVar.f, ltm.a.b);
        vtmVar.c(viewStub);
        this.h0 = vtmVar;
        bpn0 bpn0Var = this.Q;
        com.vk.im.ui.components.dialogs_list.c cVar = new com.vk.im.ui.components.dialogs_list.c((a1w) bpn0Var.getValue(), fsmVar);
        cVar.u = this.f0;
        cVar.c(this.h0);
        cVar.w(false);
        cVar.z(false);
        ChooseMode chooseMode2 = this.Z;
        if (chooseMode2 == null) {
            chooseMode2 = null;
        }
        boolean z = chooseMode2.d;
        e eVar = cVar.h;
        if (eVar.l != z) {
            eVar.l = z;
            if (eVar.d) {
                cVar.t(cVar);
            }
        }
        ChooseMode chooseMode3 = this.Z;
        if (chooseMode3 == null) {
            chooseMode3 = null;
        }
        boolean z2 = chooseMode3.e;
        if (eVar.m != z2) {
            eVar.m = z2;
            if (eVar.d) {
                cVar.t(cVar);
            }
        }
        ChooseMode chooseMode4 = this.Z;
        if (chooseMode4 == null) {
            chooseMode4 = null;
        }
        cVar.s(chooseMode4.c);
        this.g0 = cVar;
        ViewGroup viewGroup3 = this.c0;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        ViewStub viewStub2 = (ViewStub) viewGroup3.findViewById(R.id.dialogs_header_container);
        a1w a1wVar = (a1w) bpn0Var.getValue();
        ChooseMode chooseMode5 = this.Z;
        if (chooseMode5 == null) {
            chooseMode5 = null;
        }
        sbc sbcVar = new sbc(a1wVar, this.T, chooseMode5);
        sbcVar.D0(viewStub2.getContext(), (ViewGroup) viewStub2.getParent(), viewStub2, null);
        sbcVar.l = this.i0;
        sbcVar.V0();
        yqm yqmVar = sbcVar.n;
        if (yqmVar == null) {
            yqmVar = null;
        }
        yqmVar.b();
        this.j0 = sbcVar;
        ViewGroup viewGroup4 = this.c0;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        ViewGroup viewGroup5 = this.c0;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        ChooseMode chooseMode6 = this.Z;
        if (chooseMode6 == null) {
            chooseMode6 = null;
        }
        boolean z3 = chooseMode6 instanceof ChooseMode.InviteToChat;
        this.d0 = (SwitchSettingsView) viewGroup5.findViewById(R.id.im_show_chat_history);
        FrameLayout frameLayout = (FrameLayout) viewGroup5.findViewById(R.id.im_show_chat_history_layout);
        this.e0 = frameLayout;
        if (z3) {
            bwt0.p0(frameLayout, true);
            View findViewById = viewGroup5.findViewById(R.id.im_dialogs_list_container);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (viewGroup5.isLaidOut()) {
                FrameLayout frameLayout2 = this.e0;
                if (frameLayout2 == null) {
                    frameLayout2 = null;
                }
                findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), frameLayout2.getHeight());
            } else {
                viewGroup5.addOnLayoutChangeListener(new v0w(findViewById, this));
            }
        }
        this.m0 = new bzb0(kn());
        ViewGroup viewGroup6 = this.c0;
        if (viewGroup6 == null) {
            return null;
        }
        return viewGroup6;
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.vk.im.ui.components.dialogs_list.c cVar = this.g0;
        if (cVar != null) {
            cVar.u = null;
            cVar.e();
            cVar.d();
            this.g0 = null;
        }
        vtm vtmVar = this.h0;
        if (vtmVar != null) {
            vtmVar.d();
            this.h0 = null;
        }
        sbc sbcVar = this.j0;
        if (sbcVar != null) {
            sbcVar.l = null;
            sbcVar.H0();
            sbcVar.G0();
        }
        rw30 rw30Var = this.l0;
        if (rw30Var != null) {
            rw30Var.w = null;
            rw30Var.H0();
            rw30Var.G0();
        }
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        com.vk.im.ui.components.dialogs_list.c cVar = this.g0;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.vk.im.ui.components.dialogs_list.c cVar = this.g0;
        if (cVar != null) {
            cVar.h();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        ChooseMode chooseMode = this.Z;
        if (chooseMode == null) {
            chooseMode = null;
        }
        uiTrackingScreen.a = chooseMode instanceof ChooseMode.InviteToChat ? MobileOfficialAppsCoreNavStat$EventScreen.IM_INVITING_TO_CHAT : MobileOfficialAppsCoreNavStat$EventScreen.IM;
    }

    /* compiled from: ImDialogsSelectionFragment.kt */
    public final class c implements com.vk.im.ui.components.dialogs_list.a {
        public c() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void b(DialogsFilter dialogsFilter, DialogsFilterChangeSource dialogsFilterChangeSource) {
            DialogsFilter dialogsFilter2 = DialogsFilter.ARCHIVE;
            ImDialogsSelectionFragment imDialogsSelectionFragment = ImDialogsSelectionFragment.this;
            if (dialogsFilter != dialogsFilter2) {
                ChooseMode chooseMode = imDialogsSelectionFragment.Z;
                if (chooseMode == null) {
                    chooseMode = null;
                }
                if (chooseMode.c != dialogsFilter) {
                    throw new UnsupportedOperationException();
                }
            }
            com.vk.im.ui.components.dialogs_list.c cVar = imDialogsSelectionFragment.g0;
            if (cVar != null) {
                cVar.n(dialogsFilter);
            }
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void f(DialogExt dialogExt) {
            ImDialogsSelectionFragment.eo(ImDialogsSelectionFragment.this, dialogExt);
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void g(InfoModalBottomSheet.Params params) {
            int i = InfoModalBottomSheet.g1;
            InfoModalBottomSheet.b.a(ImDialogsSelectionFragment.this.requireContext(), params);
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void h(boolean z) {
            sbc sbcVar = ImDialogsSelectionFragment.this.j0;
            if (sbcVar != null) {
                yqm yqmVar = sbcVar.n;
                if (yqmVar == null) {
                    yqmVar = null;
                }
                yqmVar.d = z;
                yqmVar.a();
            }
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void i() {
            mhy.d(ImDialogsSelectionFragment.this.getView());
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void n() {
            ImDialogsSelectionFragment imDialogsSelectionFragment = ImDialogsSelectionFragment.this;
            o0r0 d = imDialogsSelectionFragment.T.d();
            jbs jbsVar = new jbs(imDialogsSelectionFragment);
            int i = imDialogsSelectionFragment.W;
            String string = imDialogsSelectionFragment.requireContext().getString(R.string.vkim_create_chat_title);
            String string2 = imDialogsSelectionFragment.requireContext().getString(R.string.vkim_empty_selection_hint);
            String string3 = imDialogsSelectionFragment.requireContext().getString(R.string.vkim_continue);
            Object obj = imDialogsSelectionFragment.a0;
            if (obj == null) {
                obj = null;
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(com.vk.dto.common.a.b((Peer) it.next()));
            }
            o0r0.h(d, jbsVar, true, true, i, string, string2, string3, null, null, null, arrayList, MobileOfficialAppsCoreNavStat$EventScreen.IM_CONVERSATION_CREATE_FRIENDS_ADD, null, 241152);
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void o() {
            mhy.d(ImDialogsSelectionFragment.this.getView());
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void j() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void l() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void c(DialogExt dialogExt) {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void k(boolean z) {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void m(DialogsFilter dialogsFilter) {
        }
    }

    /* compiled from: ImDialogsSelectionFragment.kt */
    public final class d implements rw30.a {
        public d() {
        }

        @Override // xsna.rw30.a
        public final boolean a(Dialog dialog) {
            ChooseMode chooseMode = ImDialogsSelectionFragment.this.Z;
            if (chooseMode == null) {
                chooseMode = null;
            }
            return chooseMode.b(dialog);
        }

        @Override // xsna.rw30.a
        public final boolean b(Dialog dialog) {
            ChooseMode chooseMode = ImDialogsSelectionFragment.this.Z;
            if (chooseMode == null) {
                chooseMode = null;
            }
            return chooseMode.a(dialog);
        }

        @Override // xsna.rw30.a
        public final void d(Dialog dialog, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.rw30.a
        public final void e(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo, ImSearchItemLoggingInfo imSearchItemLoggingInfo) {
            ImDialogsSelectionFragment.eo(ImDialogsSelectionFragment.this, new DialogExt(dialog, new ProfilesInfo(profilesSimpleInfo)));
        }

        @Override // xsna.rw30.a
        public final SearchEntrypoint g() {
            ChooseMode chooseMode = ImDialogsSelectionFragment.this.Z;
            if (chooseMode == null) {
                chooseMode = null;
            }
            if (chooseMode instanceof ChooseMode.InviteToChat) {
                return SearchEntrypoint.SEARCH_INVITE_TO_CHAT;
            }
            if (chooseMode instanceof ChooseMode.ReturnDialog) {
                return SearchEntrypoint.SEARCH_DIALOG_TO_SHARE;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // xsna.rw30.a
        public final void i() {
            sbc sbcVar = ImDialogsSelectionFragment.this.j0;
            if (sbcVar != null) {
                yqm yqmVar = sbcVar.n;
                if (yqmVar == null) {
                    yqmVar = null;
                }
                yqmVar.c.show();
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
