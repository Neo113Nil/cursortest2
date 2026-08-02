package com.sofascore.results.mma.organisation.rankings;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.mma.organisation.rankings.MmaOrganisationRankingsFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.a70;
import defpackage.anc;
import defpackage.aqc;
import defpackage.bba;
import defpackage.duf;
import defpackage.e1d;
import defpackage.faa;
import defpackage.fpc;
import defpackage.fuf;
import defpackage.g5k;
import defpackage.gp8;
import defpackage.gz8;
import defpackage.jmc;
import defpackage.joa;
import defpackage.km5;
import defpackage.kr9;
import defpackage.krk;
import defpackage.llc;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.nqc;
import defpackage.otk;
import defpackage.rq3;
import defpackage.tc3;
import defpackage.un0;
import defpackage.ur1;
import defpackage.wya;
import defpackage.xpc;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ypc;
import defpackage.ysa;
import defpackage.z1;
import defpackage.z8e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/mma/organisation/rankings/MmaOrganisationRankingsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lgp8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MmaOrganisationRankingsFragment extends Hilt_MmaOrganisationRankingsFragment<gp8> {
    public UniqueTournament r;
    public final otk s;
    public final otk t;
    public String u;
    public boolean v;
    public final e1d w;
    public final mqi x;
    public final mqi y;

    public MmaOrganisationRankingsFragment() {
        fuf fufVar = duf.a;
        final int i = 0;
        final int i2 = 1;
        this.s = new otk(fufVar.getOrCreateKotlinClass(fpc.class), new ypc(this, 0), new ypc(this, 2), new ypc(this, 1));
        joa a = ypa.a(ysa.c, new jmc(new ypc(this, 3), 13));
        this.t = new otk(fufVar.getOrCreateKotlinClass(aqc.class), new llc(a, 17), new wya(17, this, a), new llc(a, 18));
        this.u = "";
        this.w = e.f(km5.a);
        this.x = ypa.b(new Function0(this) { // from class: wpc
            public final /* synthetic */ MmaOrganisationRankingsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                MmaOrganisationRankingsFragment mmaOrganisationRankingsFragment = this.b;
                switch (i3) {
                    case 0:
                        Context requireContext = mmaOrganisationRankingsFragment.requireContext();
                        requireContext.getClass();
                        return new nqc(requireContext);
                    default:
                        Context requireContext2 = mmaOrganisationRankingsFragment.requireContext();
                        requireContext2.getClass();
                        return new g8b(requireContext2);
                }
            }
        });
        this.y = ypa.b(new Function0(this) { // from class: wpc
            public final /* synthetic */ MmaOrganisationRankingsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                MmaOrganisationRankingsFragment mmaOrganisationRankingsFragment = this.b;
                switch (i3) {
                    case 0:
                        Context requireContext = mmaOrganisationRankingsFragment.requireContext();
                        requireContext.getClass();
                        return new nqc(requireContext);
                    default:
                        Context requireContext2 = mmaOrganisationRankingsFragment.requireContext();
                        requireContext2.getClass();
                        return new g8b(requireContext2);
                }
            }
        });
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_mma_rankings, (ViewGroup) null, false);
        int i = R.id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) nq8.B(R.id.app_bar, inflate);
        if (appBarLayout != null) {
            i = R.id.divider;
            View B = nq8.B(R.id.divider, inflate);
            if (B != null) {
                i = R.id.empty_state_statistics;
                ViewStub viewStub = (ViewStub) nq8.B(R.id.empty_state_statistics, inflate);
                if (viewStub != null) {
                    i = R.id.quick_find_spinner;
                    ComposeView composeView = (ComposeView) nq8.B(R.id.quick_find_spinner, inflate);
                    if (composeView != null) {
                        i = R.id.rankings_type_header;
                        TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.rankings_type_header, inflate);
                        if (typeHeaderView != null) {
                            i = R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                            if (recyclerView != null) {
                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                                return new gp8(swipeRefreshLayout, appBarLayout, B, viewStub, composeView, typeHeaderView, recyclerView, swipeRefreshLayout);
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "RankingTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        Serializable M = gz8.M(requireArguments, "ORGANISATION_DATA", UniqueTournament.class);
        if (M == null) {
            a70.p("Serializable ORGANISATION_DATA not found");
            return;
        }
        this.r = (UniqueTournament) M;
        l();
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((gp8) krkVar).h;
        swipeRefreshLayout.getClass();
        otk otkVar = this.s;
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 4);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        g5k g5kVar = new g5k(((gp8) krkVar2).f);
        g5kVar.k = true;
        g5kVar.d = new xpc(this, 1);
        g5kVar.m = new ur1(this, 15);
        g5kVar.b();
        krk krkVar3 = this.l;
        krkVar3.getClass();
        RecyclerView recyclerView = ((gp8) krkVar3).g;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        mqi mqiVar = this.x;
        recyclerView.setAdapter((nqc) mqiVar.getValue());
        ((fpc) otkVar.getValue()).h.e(getViewLifecycleOwner(), new z1(28, new xpc(this, 2)));
        ((aqc) this.t.getValue()).g.e(this, new z1(28, new xpc(this, 3)));
        krk krkVar4 = this.l;
        krkVar4.getClass();
        ((gp8) krkVar4).e.setContent(new tc3(1862799907, new faa(this, 26), true));
        nqc nqcVar = (nqc) mqiVar.getValue();
        bba bbaVar = new bba(this, 16);
        nqcVar.getClass();
        nqcVar.a.d = bbaVar;
        krk krkVar5 = this.l;
        krkVar5.getClass();
        ((gp8) krkVar5).h.setOnChildScrollUpCallback(new kr9(this, 13));
        u();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        aqc aqcVar = (aqc) this.t.getValue();
        UniqueTournament uniqueTournament = this.r;
        rq3 rq3Var = null;
        if (uniqueTournament == null) {
            Intrinsics.i("organisation");
            throw null;
        }
        xw3.L(un0.z(aqcVar), null, null, new anc(aqcVar, uniqueTournament.getId(), rq3Var, 3), 3);
    }
}
