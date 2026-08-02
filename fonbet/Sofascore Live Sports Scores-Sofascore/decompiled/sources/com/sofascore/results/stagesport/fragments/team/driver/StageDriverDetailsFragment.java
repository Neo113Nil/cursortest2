package com.sofascore.results.stagesport.fragments.team.driver;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.redesign.dividers.SofaDivider;
import com.sofascore.results.stagesport.StageTeamOddsView;
import com.sofascore.results.stagesport.fragments.team.driver.StageDriverDetailsFragment;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a5i;
import defpackage.aba;
import defpackage.ah5;
import defpackage.ajh;
import defpackage.ao2;
import defpackage.apf;
import defpackage.bte;
import defpackage.chf;
import defpackage.duf;
import defpackage.eyd;
import defpackage.fuf;
import defpackage.g2i;
import defpackage.g7;
import defpackage.h8i;
import defpackage.ht9;
import defpackage.ioe;
import defpackage.joa;
import defpackage.jrg;
import defpackage.krk;
import defpackage.mqi;
import defpackage.n9e;
import defpackage.nb5;
import defpackage.o1i;
import defpackage.o8i;
import defpackage.oo8;
import defpackage.otk;
import defpackage.pco;
import defpackage.sea;
import defpackage.tba;
import defpackage.u4i;
import defpackage.vt9;
import defpackage.wsf;
import defpackage.xz0;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.zsk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/stagesport/fragments/team/driver/StageDriverDetailsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageDriverDetailsFragment extends Hilt_StageDriverDetailsFragment<oo8> {
    public final otk r;
    public final otk s;
    public final mqi t;
    public final joa u;
    public final joa v;
    public final joa w;
    public zsk x;

    public StageDriverDetailsFragment() {
        fuf fufVar = duf.a;
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.r = new otk(fufVar.getOrCreateKotlinClass(h8i.class), new u4i(this, i), new u4i(this, i3), new u4i(this, i2));
        final int i4 = 3;
        u4i u4iVar = new u4i(this, i4);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new o1i(u4iVar, 8));
        this.s = new otk(fufVar.getOrCreateKotlinClass(o8i.class), new wsf(a, 19), new bte(this, a, 17), new wsf(a, 20));
        this.t = ypa.b(new Function0(this) { // from class: t4i
            public final /* synthetic */ StageDriverDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                StageDriverDetailsFragment stageDriverDetailsFragment = this.b;
                switch (i5) {
                    case 0:
                        LayoutInflater layoutInflater = stageDriverDetailsFragment.getLayoutInflater();
                        krk krkVar = stageDriverDetailsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.driver_details_header, (ViewGroup) ((oo8) krkVar).d, false);
                        int i6 = R.id.odds_view;
                        StageTeamOddsView stageTeamOddsView = (StageTeamOddsView) nq8.B(R.id.odds_view, inflate);
                        if (stageTeamOddsView != null) {
                            i6 = R.id.player_details_grid;
                            GridView gridView = (GridView) nq8.B(R.id.player_details_grid, inflate);
                            if (gridView != null) {
                                i6 = R.id.team_layout;
                                View B = nq8.B(R.id.team_layout, inflate);
                                if (B != null) {
                                    return new nb5((LinearLayout) inflate, stageTeamOddsView, gridView, xz0.a(B));
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 1:
                        return Boolean.valueOf(((o8i) stageDriverDetailsFragment.s.getValue()).k());
                    case 2:
                        Context requireContext = stageDriverDetailsFragment.requireContext();
                        requireContext.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 3:
                        Context requireContext2 = stageDriverDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new ofe(requireContext2, 0);
                    default:
                        Context requireContext3 = stageDriverDetailsFragment.requireContext();
                        requireContext3.getClass();
                        return new a5i(requireContext3);
                }
            }
        });
        this.u = n9e.M(new Function0(this) { // from class: t4i
            public final /* synthetic */ StageDriverDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                StageDriverDetailsFragment stageDriverDetailsFragment = this.b;
                switch (i5) {
                    case 0:
                        LayoutInflater layoutInflater = stageDriverDetailsFragment.getLayoutInflater();
                        krk krkVar = stageDriverDetailsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.driver_details_header, (ViewGroup) ((oo8) krkVar).d, false);
                        int i6 = R.id.odds_view;
                        StageTeamOddsView stageTeamOddsView = (StageTeamOddsView) nq8.B(R.id.odds_view, inflate);
                        if (stageTeamOddsView != null) {
                            i6 = R.id.player_details_grid;
                            GridView gridView = (GridView) nq8.B(R.id.player_details_grid, inflate);
                            if (gridView != null) {
                                i6 = R.id.team_layout;
                                View B = nq8.B(R.id.team_layout, inflate);
                                if (B != null) {
                                    return new nb5((LinearLayout) inflate, stageTeamOddsView, gridView, xz0.a(B));
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 1:
                        return Boolean.valueOf(((o8i) stageDriverDetailsFragment.s.getValue()).k());
                    case 2:
                        Context requireContext = stageDriverDetailsFragment.requireContext();
                        requireContext.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 3:
                        Context requireContext2 = stageDriverDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new ofe(requireContext2, 0);
                    default:
                        Context requireContext3 = stageDriverDetailsFragment.requireContext();
                        requireContext3.getClass();
                        return new a5i(requireContext3);
                }
            }
        }, new Function0(this) { // from class: t4i
            public final /* synthetic */ StageDriverDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                StageDriverDetailsFragment stageDriverDetailsFragment = this.b;
                switch (i5) {
                    case 0:
                        LayoutInflater layoutInflater = stageDriverDetailsFragment.getLayoutInflater();
                        krk krkVar = stageDriverDetailsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.driver_details_header, (ViewGroup) ((oo8) krkVar).d, false);
                        int i6 = R.id.odds_view;
                        StageTeamOddsView stageTeamOddsView = (StageTeamOddsView) nq8.B(R.id.odds_view, inflate);
                        if (stageTeamOddsView != null) {
                            i6 = R.id.player_details_grid;
                            GridView gridView = (GridView) nq8.B(R.id.player_details_grid, inflate);
                            if (gridView != null) {
                                i6 = R.id.team_layout;
                                View B = nq8.B(R.id.team_layout, inflate);
                                if (B != null) {
                                    return new nb5((LinearLayout) inflate, stageTeamOddsView, gridView, xz0.a(B));
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 1:
                        return Boolean.valueOf(((o8i) stageDriverDetailsFragment.s.getValue()).k());
                    case 2:
                        Context requireContext = stageDriverDetailsFragment.requireContext();
                        requireContext.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 3:
                        Context requireContext2 = stageDriverDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new ofe(requireContext2, 0);
                    default:
                        Context requireContext3 = stageDriverDetailsFragment.requireContext();
                        requireContext3.getClass();
                        return new a5i(requireContext3);
                }
            }
        });
        this.v = ypa.a(ysaVar, new Function0(this) { // from class: t4i
            public final /* synthetic */ StageDriverDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i4;
                StageDriverDetailsFragment stageDriverDetailsFragment = this.b;
                switch (i5) {
                    case 0:
                        LayoutInflater layoutInflater = stageDriverDetailsFragment.getLayoutInflater();
                        krk krkVar = stageDriverDetailsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.driver_details_header, (ViewGroup) ((oo8) krkVar).d, false);
                        int i6 = R.id.odds_view;
                        StageTeamOddsView stageTeamOddsView = (StageTeamOddsView) nq8.B(R.id.odds_view, inflate);
                        if (stageTeamOddsView != null) {
                            i6 = R.id.player_details_grid;
                            GridView gridView = (GridView) nq8.B(R.id.player_details_grid, inflate);
                            if (gridView != null) {
                                i6 = R.id.team_layout;
                                View B = nq8.B(R.id.team_layout, inflate);
                                if (B != null) {
                                    return new nb5((LinearLayout) inflate, stageTeamOddsView, gridView, xz0.a(B));
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 1:
                        return Boolean.valueOf(((o8i) stageDriverDetailsFragment.s.getValue()).k());
                    case 2:
                        Context requireContext = stageDriverDetailsFragment.requireContext();
                        requireContext.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 3:
                        Context requireContext2 = stageDriverDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new ofe(requireContext2, 0);
                    default:
                        Context requireContext3 = stageDriverDetailsFragment.requireContext();
                        requireContext3.getClass();
                        return new a5i(requireContext3);
                }
            }
        });
        final int i5 = 4;
        this.w = ypa.a(ysaVar, new Function0(this) { // from class: t4i
            public final /* synthetic */ StageDriverDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i52 = i5;
                StageDriverDetailsFragment stageDriverDetailsFragment = this.b;
                switch (i52) {
                    case 0:
                        LayoutInflater layoutInflater = stageDriverDetailsFragment.getLayoutInflater();
                        krk krkVar = stageDriverDetailsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.driver_details_header, (ViewGroup) ((oo8) krkVar).d, false);
                        int i6 = R.id.odds_view;
                        StageTeamOddsView stageTeamOddsView = (StageTeamOddsView) nq8.B(R.id.odds_view, inflate);
                        if (stageTeamOddsView != null) {
                            i6 = R.id.player_details_grid;
                            GridView gridView = (GridView) nq8.B(R.id.player_details_grid, inflate);
                            if (gridView != null) {
                                i6 = R.id.team_layout;
                                View B = nq8.B(R.id.team_layout, inflate);
                                if (B != null) {
                                    return new nb5((LinearLayout) inflate, stageTeamOddsView, gridView, xz0.a(B));
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 1:
                        return Boolean.valueOf(((o8i) stageDriverDetailsFragment.s.getValue()).k());
                    case 2:
                        Context requireContext = stageDriverDetailsFragment.requireContext();
                        requireContext.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    case 3:
                        Context requireContext2 = stageDriverDetailsFragment.requireContext();
                        requireContext2.getClass();
                        return new ofe(requireContext2, 0);
                    default:
                        Context requireContext3 = stageDriverDetailsFragment.requireContext();
                        requireContext3.getClass();
                        return new a5i(requireContext3);
                }
            }
        });
    }

    public final h8i C() {
        return (h8i) this.r.getValue();
    }

    public final nb5 D() {
        return (nb5) this.t.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "DetailsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        Category category;
        Category category2;
        l();
        krk krkVar = this.l;
        krkVar.getClass();
        ((oo8) krkVar).e.setEnabled(false);
        Team l = C().l();
        if (l == null) {
            return;
        }
        otk otkVar = this.s;
        ((o8i) otkVar.getValue()).l(l);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        RecyclerView recyclerView2 = ((oo8) krkVar3).d;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        int i = 4;
        recyclerView2.setPaddingRelative(recyclerView2.getPaddingStart(), ao2.s(4, requireContext2), recyclerView2.getPaddingEnd(), recyclerView2.getPaddingBottom());
        krk krkVar4 = this.l;
        krkVar4.getClass();
        RecyclerView recyclerView3 = ((oo8) krkVar4).d;
        joa joaVar = this.w;
        recyclerView3.setAdapter((a5i) joaVar.getValue());
        Team l2 = C().l();
        Team parentTeam = l2 != null ? l2.getParentTeam() : null;
        xz0 xz0Var = D().d;
        ConstraintLayout constraintLayout = (ConstraintLayout) xz0Var.j;
        constraintLayout.getClass();
        sea.v(constraintLayout, true, true, 0, 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
        ((TextView) xz0Var.h).setVisibility(8);
        ((SofaDivider) xz0Var.f).setDividerVisibility(false);
        TextView textView = xz0Var.e;
        Context requireContext3 = requireContext();
        requireContext3.getClass();
        textView.setText(tba.p(requireContext3, parentTeam));
        if (parentTeam != null) {
            String R = pco.R(parentTeam.getId());
            ImageView imageView = xz0Var.c;
            apf a = ajh.a(imageView.getContext());
            ht9 ht9Var = new ht9(imageView.getContext());
            ht9Var.c = R;
            vt9.f(ht9Var, imageView);
            vt9.e(ht9Var, R.drawable.team_logo_placeholder);
            vt9.a(ht9Var, R.drawable.team_logo_placeholder);
            ht9Var.q = jrg.b;
            a.a(ht9Var.a());
            Team l3 = C().l();
            if ((l3 != null && (category2 = l3.getCategory()) != null && category2.getId() == 36) || (l3 != null && (category = l3.getCategory()) != null && category.getId() == 1325)) {
                aba.u(constraintLayout);
                constraintLayout.setOnClickListener(new eyd(21, this, parentTeam));
            }
        } else {
            constraintLayout.setVisibility(8);
        }
        D().c.setAdapter((ListAdapter) this.v.getValue());
        sea.v(D().c, true, true, 0, 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
        D().c.setOnItemClickListener(new ah5(6, this, l));
        a5i a5iVar = (a5i) joaVar.getValue();
        LinearLayout linearLayout = D().a;
        linearLayout.getClass();
        a5iVar.p(a5iVar.g.size(), linearLayout);
        GambleRegulationFooterView gambleRegulationFooterView = (GambleRegulationFooterView) this.u.getValue();
        if (gambleRegulationFooterView != null) {
            g7.o((a5i) joaVar.getValue(), gambleRegulationFooterView, 6);
        }
        C().m.e(getViewLifecycleOwner(), new ioe(13, new chf(1, this, StageDriverDetailsFragment.class, "showCareerInfo", "showCareerInfo(Lcom/sofascore/model/newNetwork/StageTeamHistoryResponse;)V", 0, 14)));
        ((o8i) otkVar.getValue()).j.e(getViewLifecycleOwner(), new ioe(13, new g2i(this, i)));
        C().k();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
