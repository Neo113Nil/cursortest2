package com.sofascore.results.league.fragment.transactions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.league.fragment.transactions.LeagueTransactionsFragment;
import defpackage.duf;
import defpackage.faa;
import defpackage.fuf;
import defpackage.g4b;
import defpackage.gz6;
import defpackage.hv7;
import defpackage.ix7;
import defpackage.joa;
import defpackage.o4b;
import defpackage.otk;
import defpackage.rq3;
import defpackage.tc3;
import defpackage.un0;
import defpackage.wya;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yta;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/league/fragment/transactions/LeagueTransactionsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LeagueTransactionsFragment extends Hilt_LeagueTransactionsFragment {
    public final otk r;
    public final otk s;
    public final joa t;
    public final joa u;

    public LeagueTransactionsFragment() {
        fuf fufVar = duf.a;
        final int i = 0;
        final int i2 = 1;
        this.r = new otk(fufVar.getOrCreateKotlinClass(yta.class), new g4b(this, 0), new g4b(this, 2), new g4b(this, 1));
        g4b g4bVar = new g4b(this, 3);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new hv7(g4bVar, 18));
        this.s = new otk(fufVar.getOrCreateKotlinClass(o4b.class), new ix7(a, 17), new wya(2, this, a), new ix7(a, 18));
        this.t = ypa.a(ysaVar, new Function0(this) { // from class: f4b
            public final /* synthetic */ LeagueTransactionsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                LeagueTransactionsFragment leagueTransactionsFragment = this.b;
                switch (i3) {
                    case 0:
                        return Integer.valueOf(((yta) leagueTransactionsFragment.r.getValue()).i);
                    default:
                        return ((yta) leagueTransactionsFragment.r.getValue()).l();
                }
            }
        });
        this.u = ypa.a(ysaVar, new Function0(this) { // from class: f4b
            public final /* synthetic */ LeagueTransactionsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                LeagueTransactionsFragment leagueTransactionsFragment = this.b;
                switch (i3) {
                    case 0:
                        return Integer.valueOf(((yta) leagueTransactionsFragment.r.getValue()).i);
                    default:
                        return ((yta) leagueTransactionsFragment.r.getValue()).l();
                }
            }
        });
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getS() {
        return new tc3(1141103529, new faa(this, 13), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        l();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "TransactionsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        joa joaVar = this.t;
        this.i.a = Integer.valueOf(((Number) joaVar.getValue()).intValue());
        o4b o4bVar = (o4b) this.s.getValue();
        int intValue = ((Number) joaVar.getValue()).intValue();
        Season season = (Season) this.u.getValue();
        int id = season != null ? season.getId() : -1;
        String m = ((yta) this.r.getValue()).m();
        if (m == null) {
            m = "";
        }
        xw3.L(un0.z(o4bVar), null, null, new gz6(o4bVar, intValue, id, m, (rq3) null, 2), 3);
    }
}
