package com.sofascore.results.fantasy.league.matchups;

import defpackage.d17;
import defpackage.duf;
import defpackage.e57;
import defpackage.jo6;
import defpackage.joa;
import defpackage.l07;
import defpackage.l27;
import defpackage.otk;
import defpackage.tc3;
import defpackage.un0;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z07;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/league/matchups/FantasyLeagueMatchupsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyLeagueMatchupsFragment extends Hilt_FantasyLeagueMatchupsFragment {
    public final otk r;

    public FantasyLeagueMatchupsFragment() {
        joa a = ypa.a(ysa.c, new l07(new l07(this, 13), 14));
        this.r = new otk(duf.a.getOrCreateKotlinClass(e57.class), new l27(a, 5), new z07(6, this, a), new l27(a, 6));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getX() {
        return new tc3(-1805392533, new jo6(this, 24), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "MatchupsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        e57 e57Var = (e57) this.r.getValue();
        xw3.L(un0.z(e57Var), null, null, new d17(e57Var, null, 3), 3);
    }
}
