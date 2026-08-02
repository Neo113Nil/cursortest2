package com.sofascore.results.mma.fighter.statistics;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.model.mvvm.model.Record;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.mma.fighter.statistics.MmaFighterStatisticsFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.anc;
import defpackage.ao2;
import defpackage.duf;
import defpackage.eqb;
import defpackage.irc;
import defpackage.jmc;
import defpackage.joa;
import defpackage.koc;
import defpackage.krk;
import defpackage.llc;
import defpackage.mnc;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.otk;
import defpackage.qoc;
import defpackage.ta0;
import defpackage.un0;
import defpackage.wya;
import defpackage.xq5;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/mma/fighter/statistics/MmaFighterStatisticsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lirc;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MmaFighterStatisticsFragment extends Hilt_MmaFighterStatisticsFragment<irc> {
    public final otk r;
    public final mqi s;
    public final mqi t;
    public final mqi u;
    public final mqi v;

    public MmaFighterStatisticsFragment() {
        joa a = ypa.a(ysa.c, new jmc(new jmc(this, 9), 10));
        this.r = new otk(duf.a.getOrCreateKotlinClass(qoc.class), new llc(a, 11), new wya(14, this, a), new llc(a, 12));
        final int i = 0;
        this.s = ypa.b(new Function0(this) { // from class: noc
            public final /* synthetic */ MmaFighterStatisticsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MmaFighterStatisticsFragment mmaFighterStatisticsFragment = this.b;
                switch (i2) {
                    case 0:
                        Bundle requireArguments = mmaFighterStatisticsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "FIGHTER", Team.class);
                        if (M != null) {
                            return (Team) M;
                        }
                        a70.p("Serializable FIGHTER not found");
                        return null;
                    case 1:
                        Context requireContext = mmaFighterStatisticsFragment.requireContext();
                        requireContext.getClass();
                        Team team = (Team) mmaFighterStatisticsFragment.s.getValue();
                        krk krkVar = mmaFighterStatisticsFragment.l;
                        krkVar.getClass();
                        return new moc(requireContext, team, ((irc) krkVar).d);
                    case 2:
                        LayoutInflater layoutInflater = mmaFighterStatisticsFragment.getLayoutInflater();
                        krk krkVar2 = mmaFighterStatisticsFragment.l;
                        krkVar2.getClass();
                        View inflate = layoutInflater.inflate(R.layout.mma_fighter_record_layout, (ViewGroup) ((irc) krkVar2).a, false);
                        int i3 = R.id.draw_label;
                        if (((TextView) nq8.B(R.id.draw_label, inflate)) != null) {
                            i3 = R.id.draws;
                            TextView textView = (TextView) nq8.B(R.id.draws, inflate);
                            if (textView != null) {
                                i3 = R.id.loss_label;
                                if (((TextView) nq8.B(R.id.loss_label, inflate)) != null) {
                                    i3 = R.id.losses;
                                    TextView textView2 = (TextView) nq8.B(R.id.losses, inflate);
                                    if (textView2 != null) {
                                        i3 = R.id.title_header;
                                        View B = nq8.B(R.id.title_header, inflate);
                                        if (B != null) {
                                            kqb a2 = kqb.a(B);
                                            i3 = R.id.win_label;
                                            if (((TextView) nq8.B(R.id.win_label, inflate)) != null) {
                                                i3 = R.id.wins;
                                                TextView textView3 = (TextView) nq8.B(R.id.wins, inflate);
                                                if (textView3 != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                    koc kocVar = new koc(constraintLayout, textView, textView2, a2, textView3);
                                                    constraintLayout.getClass();
                                                    constraintLayout.setVisibility(8);
                                                    a2.c.setVisibility(8);
                                                    a2.d.setText(mmaFighterStatisticsFragment.requireContext().getString(R.string.mma_career_records));
                                                    return kocVar;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                        return null;
                    default:
                        Context requireContext2 = mmaFighterStatisticsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setVisibility(8);
                        composeView.setContent(new tc3(218615489, new faa(mmaFighterStatisticsFragment, 24), true));
                        return composeView;
                }
            }
        });
        final int i2 = 1;
        this.t = ypa.b(new Function0(this) { // from class: noc
            public final /* synthetic */ MmaFighterStatisticsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MmaFighterStatisticsFragment mmaFighterStatisticsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = mmaFighterStatisticsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "FIGHTER", Team.class);
                        if (M != null) {
                            return (Team) M;
                        }
                        a70.p("Serializable FIGHTER not found");
                        return null;
                    case 1:
                        Context requireContext = mmaFighterStatisticsFragment.requireContext();
                        requireContext.getClass();
                        Team team = (Team) mmaFighterStatisticsFragment.s.getValue();
                        krk krkVar = mmaFighterStatisticsFragment.l;
                        krkVar.getClass();
                        return new moc(requireContext, team, ((irc) krkVar).d);
                    case 2:
                        LayoutInflater layoutInflater = mmaFighterStatisticsFragment.getLayoutInflater();
                        krk krkVar2 = mmaFighterStatisticsFragment.l;
                        krkVar2.getClass();
                        View inflate = layoutInflater.inflate(R.layout.mma_fighter_record_layout, (ViewGroup) ((irc) krkVar2).a, false);
                        int i3 = R.id.draw_label;
                        if (((TextView) nq8.B(R.id.draw_label, inflate)) != null) {
                            i3 = R.id.draws;
                            TextView textView = (TextView) nq8.B(R.id.draws, inflate);
                            if (textView != null) {
                                i3 = R.id.loss_label;
                                if (((TextView) nq8.B(R.id.loss_label, inflate)) != null) {
                                    i3 = R.id.losses;
                                    TextView textView2 = (TextView) nq8.B(R.id.losses, inflate);
                                    if (textView2 != null) {
                                        i3 = R.id.title_header;
                                        View B = nq8.B(R.id.title_header, inflate);
                                        if (B != null) {
                                            kqb a2 = kqb.a(B);
                                            i3 = R.id.win_label;
                                            if (((TextView) nq8.B(R.id.win_label, inflate)) != null) {
                                                i3 = R.id.wins;
                                                TextView textView3 = (TextView) nq8.B(R.id.wins, inflate);
                                                if (textView3 != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                    koc kocVar = new koc(constraintLayout, textView, textView2, a2, textView3);
                                                    constraintLayout.getClass();
                                                    constraintLayout.setVisibility(8);
                                                    a2.c.setVisibility(8);
                                                    a2.d.setText(mmaFighterStatisticsFragment.requireContext().getString(R.string.mma_career_records));
                                                    return kocVar;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                        return null;
                    default:
                        Context requireContext2 = mmaFighterStatisticsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setVisibility(8);
                        composeView.setContent(new tc3(218615489, new faa(mmaFighterStatisticsFragment, 24), true));
                        return composeView;
                }
            }
        });
        final int i3 = 2;
        this.u = ypa.b(new Function0(this) { // from class: noc
            public final /* synthetic */ MmaFighterStatisticsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MmaFighterStatisticsFragment mmaFighterStatisticsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = mmaFighterStatisticsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "FIGHTER", Team.class);
                        if (M != null) {
                            return (Team) M;
                        }
                        a70.p("Serializable FIGHTER not found");
                        return null;
                    case 1:
                        Context requireContext = mmaFighterStatisticsFragment.requireContext();
                        requireContext.getClass();
                        Team team = (Team) mmaFighterStatisticsFragment.s.getValue();
                        krk krkVar = mmaFighterStatisticsFragment.l;
                        krkVar.getClass();
                        return new moc(requireContext, team, ((irc) krkVar).d);
                    case 2:
                        LayoutInflater layoutInflater = mmaFighterStatisticsFragment.getLayoutInflater();
                        krk krkVar2 = mmaFighterStatisticsFragment.l;
                        krkVar2.getClass();
                        View inflate = layoutInflater.inflate(R.layout.mma_fighter_record_layout, (ViewGroup) ((irc) krkVar2).a, false);
                        int i32 = R.id.draw_label;
                        if (((TextView) nq8.B(R.id.draw_label, inflate)) != null) {
                            i32 = R.id.draws;
                            TextView textView = (TextView) nq8.B(R.id.draws, inflate);
                            if (textView != null) {
                                i32 = R.id.loss_label;
                                if (((TextView) nq8.B(R.id.loss_label, inflate)) != null) {
                                    i32 = R.id.losses;
                                    TextView textView2 = (TextView) nq8.B(R.id.losses, inflate);
                                    if (textView2 != null) {
                                        i32 = R.id.title_header;
                                        View B = nq8.B(R.id.title_header, inflate);
                                        if (B != null) {
                                            kqb a2 = kqb.a(B);
                                            i32 = R.id.win_label;
                                            if (((TextView) nq8.B(R.id.win_label, inflate)) != null) {
                                                i32 = R.id.wins;
                                                TextView textView3 = (TextView) nq8.B(R.id.wins, inflate);
                                                if (textView3 != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                    koc kocVar = new koc(constraintLayout, textView, textView2, a2, textView3);
                                                    constraintLayout.getClass();
                                                    constraintLayout.setVisibility(8);
                                                    a2.c.setVisibility(8);
                                                    a2.d.setText(mmaFighterStatisticsFragment.requireContext().getString(R.string.mma_career_records));
                                                    return kocVar;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i32)));
                        return null;
                    default:
                        Context requireContext2 = mmaFighterStatisticsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setVisibility(8);
                        composeView.setContent(new tc3(218615489, new faa(mmaFighterStatisticsFragment, 24), true));
                        return composeView;
                }
            }
        });
        final int i4 = 3;
        this.v = ypa.b(new Function0(this) { // from class: noc
            public final /* synthetic */ MmaFighterStatisticsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                MmaFighterStatisticsFragment mmaFighterStatisticsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = mmaFighterStatisticsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "FIGHTER", Team.class);
                        if (M != null) {
                            return (Team) M;
                        }
                        a70.p("Serializable FIGHTER not found");
                        return null;
                    case 1:
                        Context requireContext = mmaFighterStatisticsFragment.requireContext();
                        requireContext.getClass();
                        Team team = (Team) mmaFighterStatisticsFragment.s.getValue();
                        krk krkVar = mmaFighterStatisticsFragment.l;
                        krkVar.getClass();
                        return new moc(requireContext, team, ((irc) krkVar).d);
                    case 2:
                        LayoutInflater layoutInflater = mmaFighterStatisticsFragment.getLayoutInflater();
                        krk krkVar2 = mmaFighterStatisticsFragment.l;
                        krkVar2.getClass();
                        View inflate = layoutInflater.inflate(R.layout.mma_fighter_record_layout, (ViewGroup) ((irc) krkVar2).a, false);
                        int i32 = R.id.draw_label;
                        if (((TextView) nq8.B(R.id.draw_label, inflate)) != null) {
                            i32 = R.id.draws;
                            TextView textView = (TextView) nq8.B(R.id.draws, inflate);
                            if (textView != null) {
                                i32 = R.id.loss_label;
                                if (((TextView) nq8.B(R.id.loss_label, inflate)) != null) {
                                    i32 = R.id.losses;
                                    TextView textView2 = (TextView) nq8.B(R.id.losses, inflate);
                                    if (textView2 != null) {
                                        i32 = R.id.title_header;
                                        View B = nq8.B(R.id.title_header, inflate);
                                        if (B != null) {
                                            kqb a2 = kqb.a(B);
                                            i32 = R.id.win_label;
                                            if (((TextView) nq8.B(R.id.win_label, inflate)) != null) {
                                                i32 = R.id.wins;
                                                TextView textView3 = (TextView) nq8.B(R.id.wins, inflate);
                                                if (textView3 != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                    koc kocVar = new koc(constraintLayout, textView, textView2, a2, textView3);
                                                    constraintLayout.getClass();
                                                    constraintLayout.setVisibility(8);
                                                    a2.c.setVisibility(8);
                                                    a2.d.setText(mmaFighterStatisticsFragment.requireContext().getString(R.string.mma_career_records));
                                                    return kocVar;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i32)));
                        return null;
                    default:
                        Context requireContext2 = mmaFighterStatisticsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setVisibility(8);
                        composeView.setContent(new tc3(218615489, new faa(mmaFighterStatisticsFragment, 24), true));
                        return composeView;
                }
            }
        });
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.mma_statistics_fragment_layout, (ViewGroup) null, false);
        int i = R.id.header_layout;
        AppBarLayout appBarLayout = (AppBarLayout) nq8.B(R.id.header_layout, inflate);
        if (appBarLayout != null) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
            int i2 = R.id.scroll_view;
            if (((NestedScrollView) nq8.B(R.id.scroll_view, inflate)) != null) {
                i2 = R.id.stats_container;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.stats_container, inflate);
                if (linearLayout != null) {
                    return new irc(swipeRefreshLayout, appBarLayout, swipeRefreshLayout, linearLayout);
                }
            }
            i = i2;
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "StatisticsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        ((irc) krkVar).d.getLayoutTransition().setAnimateParentHierarchy(false);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((irc) krkVar2).d.getLayoutTransition().enableTransitionType(4);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        LinearLayout linearLayout = ((irc) krkVar3).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), ao2.s(4, requireContext), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
        krk krkVar4 = this.l;
        krkVar4.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((irc) krkVar4).c;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        krk krkVar5 = this.l;
        krkVar5.getClass();
        ((irc) krkVar5).b.a(new xq5(this, 4));
        mqi mqiVar = this.u;
        ConstraintLayout constraintLayout = ((koc) mqiVar.getValue()).a;
        krk krkVar6 = this.l;
        krkVar6.getClass();
        ((irc) krkVar6).b.addView(constraintLayout);
        constraintLayout.getClass();
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            return;
        }
        ta0 ta0Var = (ta0) layoutParams;
        ta0Var.a = 1;
        constraintLayout.setLayoutParams(ta0Var);
        ComposeView composeView = (ComposeView) this.v.getValue();
        krk krkVar7 = this.l;
        krkVar7.getClass();
        ((irc) krkVar7).b.addView(composeView);
        ViewGroup.LayoutParams layoutParams2 = composeView.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            return;
        }
        ta0 ta0Var2 = (ta0) layoutParams2;
        ta0Var2.a = 0;
        composeView.setLayoutParams(ta0Var2);
        ((qoc) this.r.getValue()).g.e(getViewLifecycleOwner(), new eqb(10, new mnc(this, 3)));
        Record wdlRecord = ((Team) this.s.getValue()).getWdlRecord();
        if (wdlRecord != null) {
            koc kocVar = (koc) mqiVar.getValue();
            ConstraintLayout constraintLayout2 = kocVar.a;
            constraintLayout2.getClass();
            constraintLayout2.setVisibility(0);
            kocVar.d.setText(String.valueOf(wdlRecord.getWins()));
            kocVar.c.setText(String.valueOf(wdlRecord.getLosses()));
            kocVar.b.setText(String.valueOf(wdlRecord.getDraws()));
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        otk otkVar = this.r;
        if (((qoc) otkVar.getValue()).g.d() != null) {
            n();
            return;
        }
        qoc qocVar = (qoc) otkVar.getValue();
        xw3.L(un0.z(qocVar), null, null, new anc(qocVar, ((Team) this.s.getValue()).getId(), null, 1), 3);
    }
}
