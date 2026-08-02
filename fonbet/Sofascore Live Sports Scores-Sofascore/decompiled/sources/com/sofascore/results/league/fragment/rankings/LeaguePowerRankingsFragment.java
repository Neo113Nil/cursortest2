package com.sofascore.results.league.fragment.rankings;

import android.os.Bundle;
import android.view.View;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.league.fragment.rankings.LeaguePowerRankingsFragment;
import defpackage.cza;
import defpackage.duf;
import defpackage.eza;
import defpackage.faa;
import defpackage.fuf;
import defpackage.hv7;
import defpackage.ix7;
import defpackage.joa;
import defpackage.otk;
import defpackage.tba;
import defpackage.tc3;
import defpackage.un0;
import defpackage.vya;
import defpackage.wya;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yta;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/league/fragment/rankings/LeaguePowerRankingsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LeaguePowerRankingsFragment extends Hilt_LeaguePowerRankingsFragment {
    public final otk r;
    public final otk s;
    public final joa t;
    public final joa u;
    public final tc3 v;

    public LeaguePowerRankingsFragment() {
        fuf fufVar = duf.a;
        final int i = 0;
        final int i2 = 1;
        this.r = new otk(fufVar.getOrCreateKotlinClass(yta.class), new vya(this, 0), new vya(this, 2), new vya(this, 1));
        vya vyaVar = new vya(this, 3);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new hv7(vyaVar, 16));
        this.s = new otk(fufVar.getOrCreateKotlinClass(eza.class), new ix7(a, 13), new wya(0, this, a), new ix7(a, 14));
        this.t = ypa.a(ysaVar, new Function0(this) { // from class: uya
            public final /* synthetic */ LeaguePowerRankingsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                LeaguePowerRankingsFragment leaguePowerRankingsFragment = this.b;
                switch (i3) {
                    case 0:
                        return ((yta) leaguePowerRankingsFragment.r.getValue()).o();
                    default:
                        return Boolean.valueOf(tz9.H(((yta) leaguePowerRankingsFragment.r.getValue()).q));
                }
            }
        });
        this.u = ypa.a(ysaVar, new Function0(this) { // from class: uya
            public final /* synthetic */ LeaguePowerRankingsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                LeaguePowerRankingsFragment leaguePowerRankingsFragment = this.b;
                switch (i3) {
                    case 0:
                        return ((yta) leaguePowerRankingsFragment.r.getValue()).o();
                    default:
                        return Boolean.valueOf(tz9.H(((yta) leaguePowerRankingsFragment.r.getValue()).q));
                }
            }
        });
        this.v = new tc3(326289195, new faa(this, 11), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A, reason: from getter */
    public final tc3 getV() {
        return this.v;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        u();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        l();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "PowerRankingTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        String str;
        eza ezaVar = (eza) this.s.getValue();
        joa joaVar = this.t;
        UniqueTournament uniqueTournament = ((Tournament) joaVar.getValue()).getUniqueTournament();
        int id = uniqueTournament != null ? uniqueTournament.getId() : 0;
        otk otkVar = this.r;
        Season l = ((yta) otkVar.getValue()).l();
        int id2 = l != null ? l.getId() : 0;
        Season l2 = ((yta) otkVar.getValue()).l();
        if (l2 == null || (str = l2.getYear()) == null) {
            str = "";
        }
        String sportSlug = ((Tournament) joaVar.getValue()).getSportSlug();
        String w = tba.w((Tournament) joaVar.getValue());
        sportSlug.getClass();
        w.getClass();
        if (ezaVar.n == id && ezaVar.o == id2 && ezaVar.l().a() != null) {
            return;
        }
        ezaVar.n = id;
        ezaVar.o = id2;
        ezaVar.q = str;
        ezaVar.p = sportSlug;
        ezaVar.r = w;
        xw3.L(un0.z(ezaVar), null, null, new cza(ezaVar, null, 1), 3);
    }
}
