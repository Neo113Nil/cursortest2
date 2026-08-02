package com.sofascore.results.league.fragment.standings;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.local_persistance.Brand;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.view.branding.BrandingHeaderView;
import defpackage.bba;
import defpackage.ccd;
import defpackage.dla;
import defpackage.duf;
import defpackage.e6b;
import defpackage.fuf;
import defpackage.hai;
import defpackage.hv7;
import defpackage.ix7;
import defpackage.jai;
import defpackage.joa;
import defpackage.jtd;
import defpackage.k0;
import defpackage.krk;
import defpackage.mqi;
import defpackage.o3a;
import defpackage.oo8;
import defpackage.otk;
import defpackage.oza;
import defpackage.pyn;
import defpackage.pza;
import defpackage.qai;
import defpackage.qza;
import defpackage.rbi;
import defpackage.tz9;
import defpackage.u6b;
import defpackage.wya;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yta;
import defpackage.z1;
import defpackage.z3f;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/league/fragment/standings/LeagueStandingsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LeagueStandingsFragment extends Hilt_LeagueStandingsFragment<oo8> {
    public final otk r;
    public final otk s;
    public final joa t;
    public final joa u;
    public final mqi v;
    public boolean w;

    public LeagueStandingsFragment() {
        int i = 3;
        qza qzaVar = new qza(this, i);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new hv7(qzaVar, 17));
        fuf fufVar = duf.a;
        int i2 = 1;
        this.r = new otk(fufVar.getOrCreateKotlinClass(rbi.class), new ix7(a, 15), new wya(i2, this, a), new ix7(a, 16));
        int i3 = 2;
        this.s = new otk(fufVar.getOrCreateKotlinClass(yta.class), new qza(this, 0), new qza(this, i3), new qza(this, i2));
        this.t = ypa.a(ysaVar, new oza(this, i2));
        this.u = ypa.a(ysaVar, new oza(this, i3));
        this.v = ypa.b(new oza(this, i));
        this.w = true;
    }

    public final yta C() {
        return (yta) this.s.getValue();
    }

    public final jai D() {
        return (jai) this.v.getValue();
    }

    public final Tournament E() {
        return C().o();
    }

    public final rbi F() {
        return (rbi) this.r.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "StandingsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, C().n, null, 4);
        FragmentActivity requireActivity = requireActivity();
        k0 k0Var = new k0(this, 12);
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        requireActivity.addMenuProvider(k0Var, viewLifecycleOwner, e6b.e);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        RecyclerView recyclerView2 = ((oo8) krkVar3).d;
        jai D = D();
        hai[] haiVarArr = hai.a;
        krk krkVar4 = this.l;
        krkVar4.getClass();
        recyclerView2.addItemDecoration(new qai(D, ((oo8) krkVar4).d, D().u, tz9.H(C().q)));
        jai D2 = D();
        int i = 0;
        D2.w = new oza(this, i);
        D2.a.d = new bba(this, 5);
        jtd.a(view, new pyn(13, view, this));
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        Brand B = ccd.B(requireContext2, o3a.F(E()), BrandLocation.LeagueStandings);
        if (B != null) {
            LayoutInflater layoutInflater = getLayoutInflater();
            krk krkVar5 = this.l;
            krkVar5.getClass();
            z3f e = z3f.e(layoutInflater, ((oo8) krkVar5).d);
            TextView textView = (TextView) e.d;
            BrandingHeaderView.d((BrandingHeaderView) e.c, B, BrandLocation.LeagueScreen, o3a.F(E()), 24);
            if (!B.getStandingsText().isEmpty()) {
                textView.setVisibility(0);
                String str = B.getStandingsText().get(dla.a());
                if (str == null) {
                    str = B.getStandingsText().get("en");
                }
                textView.setText(str);
            }
            jai D3 = D();
            LinearLayout linearLayout = (LinearLayout) e.b;
            linearLayout.getClass();
            D3.p(D3.g.size(), linearLayout);
        }
        C().x.e(getViewLifecycleOwner(), new z1(19, new pza(this, i)));
        F().i.e(getViewLifecycleOwner(), new z1(19, new pza(this, 1)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        n();
        Season l = C().l();
        if (l != null) {
            UniqueTournament uniqueTournament = E().getUniqueTournament();
            if ((uniqueTournament != null ? uniqueTournament.getId() : 0) <= 0) {
                rbi.t(F(), E().getId(), l.getId(), E().getCategory().getSport().getSlug(), StringsKt.toIntOrNull(l.getYear()), 48);
                return;
            }
            rbi F = F();
            UniqueTournament uniqueTournament2 = E().getUniqueTournament();
            F.u(uniqueTournament2 != null ? uniqueTournament2.getId() : 0, l.getId(), E().getCategory().getSport().getSlug(), null, StringsKt.toIntOrNull(l.getYear()));
        }
    }
}
