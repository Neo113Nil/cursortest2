package com.sofascore.results.weeklyChallenge.statistics;

import defpackage.ajj;
import defpackage.d3k;
import defpackage.duf;
import defpackage.ilj;
import defpackage.j3l;
import defpackage.joa;
import defpackage.lqj;
import defpackage.otk;
import defpackage.s2j;
import defpackage.tc3;
import defpackage.un0;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/weeklyChallenge/statistics/WeeklyChallengeStatisticsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WeeklyChallengeStatisticsFragment extends Hilt_WeeklyChallengeStatisticsFragment {
    public final otk r;
    public boolean s;

    public WeeklyChallengeStatisticsFragment() {
        joa a = ypa.a(ysa.c, new s2j(new s2j(this, 20), 21));
        this.r = new otk(duf.a.getOrCreateKotlinClass(j3l.class), new d3k(a, 5), new ilj(10, this, a), new d3k(a, 6));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getT() {
        return new tc3(908228278, new lqj(this, 13), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "StatisticsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        if (this.s) {
            return;
        }
        this.s = true;
        j3l j3lVar = (j3l) this.r.getValue();
        xw3.L(un0.z(j3lVar), null, null, new ajj(j3lVar, null, 7), 3);
    }
}
