package com.vk.im.ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.k0;
import com.vk.core.apps.BuildInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.reporters.DialogsFilterChangeSource;
import com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet;
import com.vk.im.ui.components.dialogs_list.c;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a06;
import xsna.a1w;
import xsna.amp;
import xsna.b25;
import xsna.bwt0;
import xsna.fpf0;
import xsna.fsm;
import xsna.g1j;
import xsna.g2v;
import xsna.g9e0;
import xsna.i7o0;
import xsna.ies;
import xsna.lrk;
import xsna.ltm;
import xsna.m40;
import xsna.mxv;
import xsna.nuv;
import xsna.o0w;
import xsna.o25;
import xsna.oz50;
import xsna.q1w;
import xsna.qcy;
import xsna.sxc0;
import xsna.t480;
import xsna.ubw;
import xsna.vtm;
import xsna.y760;
import xsna.zdw;

/* compiled from: ImRequestsFragment.kt */
/* loaded from: classes2.dex */
public class ImRequestsFragment extends ImFragment implements y760, ies {
    public static final /* synthetic */ qcy<Object>[] Z;
    public final a1w P;
    public final mxv Q;
    public final zdw R;
    public final b25 S;
    public View T;
    public View U;
    public c V;
    public vtm W;
    public final b X;
    public final g9e0 Y;

    /* compiled from: ImRequestsFragment.kt */
    public static class a extends oz50 {
        public a(int i) {
            super(ImRequestsFragment.class, null, null);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImRequestsFragment.class, "popups", "getPopups()Lcom/vk/im/ui/components/viewcontrollers/popup/PopupVc;", 0);
        fpf0.a.getClass();
        Z = new qcy[]{propertyReference1Impl};
    }

    public ImRequestsFragment() {
        a1w a1wVar = q1w.a;
        this.P = a1wVar == null ? null : a1wVar;
        this.Q = g2v.c();
        zdw zdwVar = i7o0.b;
        this.R = zdwVar != null ? zdwVar : null;
        this.S = o25.a();
        this.X = new b();
        new LinkedHashMap();
        this.Y = new g9e0(new nuv(this, 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.vkim_fragment_requests, viewGroup, false);
        ((Toolbar) inflate.findViewById(R.id.toolbar)).setNavigationOnClickListener(new a06(this, 5));
        this.T = inflate.findViewById(R.id.decline);
        this.U = inflate.findViewById(R.id.divider);
        View view = this.T;
        if (view == null) {
            view = null;
        }
        bwt0.i0(view, new lrk(this, 20));
        zdw zdwVar = this.R;
        k0 o = zdwVar.f().a.d.o();
        LayoutInflater p = zdwVar.f().a.d.p();
        fsm fsmVar = new fsm(kn(), this.R, sxc0.a(), false, false, false, false, false, BuildInfo.t(), new ubw(this, 0), null, null, 7168);
        ltm.a.getClass();
        vtm vtmVar = new vtm(o, p, this.Q, this.R, null, fsmVar.f, ltm.a.b);
        vtmVar.c((ViewStub) inflate.findViewById(R.id.im_dialogs_list_stub));
        this.W = vtmVar;
        a1w a1wVar = this.P;
        c cVar = new c(a1wVar, fsmVar);
        cVar.u = this.X;
        cVar.c(this.W);
        cVar.w(false);
        cVar.z(false);
        cVar.s(DialogsFilter.REQUESTS);
        this.V = cVar;
        this.N.b(new i0(a1wVar.l.a().b0(t480.class), new m40(new amp(8), 20)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new defpackage.i0(new g1j(this, 16), 25)));
        return inflate;
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.Y.d();
        c cVar = this.V;
        if (cVar != null) {
            cVar.u = null;
            cVar.e();
            cVar.d();
            this.V = null;
        }
        vtm vtmVar = this.W;
        if (vtmVar != null) {
            vtmVar.d();
            this.W = null;
        }
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        c cVar = this.V;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        c cVar = this.V;
        if (cVar != null) {
            cVar.h();
        }
    }

    /* compiled from: ImRequestsFragment.kt */
    public final class b implements com.vk.im.ui.components.dialogs_list.a {
        public b() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void f(DialogExt dialogExt) {
            o0w.x(g2v.c().b(), ImRequestsFragment.this.kn(), null, dialogExt.e, dialogExt, null, null, false, null, null, null, null, null, null, "list_requests", null, null, null, false, null, null, null, null, null, 1073733618);
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void g(InfoModalBottomSheet.Params params) {
            int i = InfoModalBottomSheet.g1;
            InfoModalBottomSheet.b.a(ImRequestsFragment.this.requireContext(), params);
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void k(boolean z) {
            qcy<Object>[] qcyVarArr = ImRequestsFragment.Z;
            ImRequestsFragment imRequestsFragment = ImRequestsFragment.this;
            imRequestsFragment.getClass();
            int i = z ? 8 : 0;
            View view = imRequestsFragment.T;
            if (view == null) {
                view = null;
            }
            view.setVisibility(i);
            View view2 = imRequestsFragment.U;
            (view2 != null ? view2 : null).setVisibility(i);
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void i() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void j() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void l() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void n() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void o() {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void c(DialogExt dialogExt) {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void h(boolean z) {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void m(DialogsFilter dialogsFilter) {
        }

        @Override // com.vk.im.ui.components.dialogs_list.a
        public final void b(DialogsFilter dialogsFilter, DialogsFilterChangeSource dialogsFilterChangeSource) {
        }
    }

    @Override // xsna.y760
    public final void h9(Intent intent) {
    }
}
