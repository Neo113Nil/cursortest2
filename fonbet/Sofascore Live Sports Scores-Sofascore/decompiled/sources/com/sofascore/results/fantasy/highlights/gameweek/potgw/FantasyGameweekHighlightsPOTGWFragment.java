package com.sofascore.results.fantasy.highlights.gameweek.potgw;

import defpackage.duf;
import defpackage.fi5;
import defpackage.jo6;
import defpackage.joa;
import defpackage.l07;
import defpackage.otk;
import defpackage.p07;
import defpackage.t06;
import defpackage.tc3;
import defpackage.xp6;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/highlights/gameweek/potgw/FantasyGameweekHighlightsPOTGWFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyGameweekHighlightsPOTGWFragment extends Hilt_FantasyGameweekHighlightsPOTGWFragment {
    public final otk r;

    public FantasyGameweekHighlightsPOTGWFragment() {
        joa a = ypa.a(ysa.c, new l07(new t06(this, 29), 0));
        this.r = new otk(duf.a.getOrCreateKotlinClass(p07.class), new xp6(a, 19), new fi5(this, a, 28), new xp6(a, 20));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getS() {
        return new tc3(1374860853, new jo6(this, 11), true);
    }

    public final p07 D() {
        return (p07) this.r.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "PlayerOfTheGameweekTab";
    }
}
