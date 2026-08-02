package com.sofascore.results.fantasy.league.leaderboard;

import defpackage.duf;
import defpackage.jo6;
import defpackage.joa;
import defpackage.l07;
import defpackage.l27;
import defpackage.m47;
import defpackage.otk;
import defpackage.tc3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z07;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/league/leaderboard/FantasyLeagueLeaderboardFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyLeagueLeaderboardFragment extends Hilt_FantasyLeagueLeaderboardFragment {
    public final otk r;

    public FantasyLeagueLeaderboardFragment() {
        joa a = ypa.a(ysa.c, new l07(new l07(this, 11), 12));
        this.r = new otk(duf.a.getOrCreateKotlinClass(m47.class), new l27(a, 3), new z07(5, this, a), new l27(a, 4));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getS() {
        return new tc3(2035906711, new jo6(this, 22), true);
    }

    public final m47 D() {
        return (m47) this.r.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "LeaderboardTab";
    }
}
