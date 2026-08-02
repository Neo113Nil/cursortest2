package com.sofascore.results.fantasy.highlights.gameweek.totgw;

import defpackage.duf;
import defpackage.jo6;
import defpackage.joa;
import defpackage.k17;
import defpackage.l07;
import defpackage.otk;
import defpackage.tc3;
import defpackage.xp6;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z07;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/highlights/gameweek/totgw/FantasyGameweekHighlightsTOTGWFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyGameweekHighlightsTOTGWFragment extends Hilt_FantasyGameweekHighlightsTOTGWFragment {
    public final otk r;

    public FantasyGameweekHighlightsTOTGWFragment() {
        joa a = ypa.a(ysa.c, new l07(new l07(this, 5), 6));
        this.r = new otk(duf.a.getOrCreateKotlinClass(k17.class), new xp6(a, 25), new z07(1, this, a), new xp6(a, 26));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getS() {
        return new tc3(224133801, new jo6(this, 16), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "TeamOfTheGameweekTab";
    }
}
