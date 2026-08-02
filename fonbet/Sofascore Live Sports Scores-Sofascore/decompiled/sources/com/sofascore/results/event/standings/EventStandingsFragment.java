package com.sofascore.results.event.standings;

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
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.view.branding.BrandingHeaderView;
import defpackage.a70;
import defpackage.ay5;
import defpackage.ccd;
import defpackage.dla;
import defpackage.duf;
import defpackage.e6b;
import defpackage.fi5;
import defpackage.fuf;
import defpackage.hai;
import defpackage.jai;
import defpackage.joa;
import defpackage.jtd;
import defpackage.k0;
import defpackage.krk;
import defpackage.lv4;
import defpackage.mr5;
import defpackage.o3a;
import defpackage.ok3;
import defpackage.oo8;
import defpackage.otk;
import defpackage.qai;
import defpackage.rbi;
import defpackage.s16;
import defpackage.t06;
import defpackage.xa6;
import defpackage.y7;
import defpackage.ya6;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z3f;
import defpackage.z8e;
import defpackage.za6;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/event/standings/EventStandingsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventStandingsFragment extends Hilt_EventStandingsFragment<oo8> {
    public final otk r;
    public final otk s;
    public final joa t;
    public final joa u;

    public EventStandingsFragment() {
        fuf fufVar = duf.a;
        int i = 0;
        int i2 = 1;
        this.r = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new za6(this, i), new za6(this, 2), new za6(this, i2));
        za6 za6Var = new za6(this, 3);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new t06(za6Var, 10));
        this.s = new otk(fufVar.getOrCreateKotlinClass(rbi.class), new ay5(a, 21), new fi5(this, a, 14), new ay5(a, 22));
        this.t = ypa.a(ysaVar, new xa6(this, i));
        this.u = ypa.a(ysaVar, new xa6(this, i2));
    }

    public final jai C() {
        return (jai) this.t.getValue();
    }

    public final Event D() {
        Object d = ((mr5) this.r.getValue()).v.d();
        if (d != null) {
            return (Event) d;
        }
        a70.r("Required value was null.");
        return null;
    }

    public final rbi E() {
        return (rbi) this.s.getValue();
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
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getClass();
        requireActivity.addMenuProvider(new k0(this, 4), getViewLifecycleOwner(), e6b.e);
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        int i = 0;
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        RecyclerView recyclerView2 = ((oo8) krkVar3).d;
        jai C = C();
        hai[] haiVarArr = hai.a;
        krk krkVar4 = this.l;
        krkVar4.getClass();
        recyclerView2.addItemDecoration(new qai(C, ((oo8) krkVar4).d, C().u, false));
        jai C2 = C();
        C2.w = new xa6(this, 2);
        C2.a.d = new s16(this, 6);
        jtd.a(view, new lv4(view, this, view, false, 2));
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        Brand B = ccd.B(requireContext2, o3a.F(D().getTournament()), BrandLocation.EventStandings);
        if (B != null) {
            LayoutInflater layoutInflater = getLayoutInflater();
            krk krkVar5 = this.l;
            krkVar5.getClass();
            z3f e = z3f.e(layoutInflater, ((oo8) krkVar5).d);
            TextView textView = (TextView) e.d;
            BrandingHeaderView.d((BrandingHeaderView) e.c, B, BrandLocation.EventScreen, Integer.valueOf(D().getId()), 24);
            if (!B.getStandingsText().isEmpty()) {
                textView.setVisibility(0);
                String str = B.getStandingsText().get(dla.a());
                if (str == null) {
                    str = B.getStandingsText().get("en");
                }
                textView.setText(str);
            }
            jai C3 = C();
            LinearLayout linearLayout = (LinearLayout) e.b;
            linearLayout.getClass();
            C3.p(C3.g.size(), linearLayout);
        }
        E().i.e(getViewLifecycleOwner(), new y7(22, new ya6(this, i)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        n();
        Season season = D().getSeason();
        if (season != null) {
            E().o(D().getTournament().getId(), o3a.F(D().getTournament()), season.getId(), ok3.s(D()), Integer.valueOf(Event.getHomeTeam$default(D(), null, 1, null).getId()), Integer.valueOf(Event.getAwayTeam$default(D(), null, 1, null).getId()), StringsKt.toIntOrNull(season.getYear()));
        }
    }
}
