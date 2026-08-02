package com.sofascore.results.fantasy.highlights.gameweek.points;

import defpackage.duf;
import defpackage.fi5;
import defpackage.jo6;
import defpackage.joa;
import defpackage.l07;
import defpackage.otk;
import defpackage.tc3;
import defpackage.xp6;
import defpackage.y07;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/highlights/gameweek/points/FantasyGameweekHighlightsPointsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyGameweekHighlightsPointsFragment extends Hilt_FantasyGameweekHighlightsPointsFragment {
    public final otk r;

    public FantasyGameweekHighlightsPointsFragment() {
        joa a = ypa.a(ysa.c, new l07(new l07(this, 1), 2));
        this.r = new otk(duf.a.getOrCreateKotlinClass(y07.class), new xp6(a, 21), new fi5(this, a, 29), new xp6(a, 22));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getS() {
        return new tc3(1648734905, new jo6(this, 12), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "PointsTab";
    }
}
