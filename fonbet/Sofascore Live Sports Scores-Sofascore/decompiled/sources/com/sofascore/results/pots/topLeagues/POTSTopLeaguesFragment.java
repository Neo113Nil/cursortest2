package com.sofascore.results.pots.topLeagues;

import defpackage.d3e;
import defpackage.duf;
import defpackage.e3e;
import defpackage.jmc;
import defpackage.joa;
import defpackage.llc;
import defpackage.otk;
import defpackage.t21;
import defpackage.tc3;
import defpackage.un0;
import defpackage.wya;
import defpackage.x2e;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/pots/topLeagues/POTSTopLeaguesFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "Lvnb;", "Lc3e;", "state", "", "isPullToRefreshing", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class POTSTopLeaguesFragment extends Hilt_POTSTopLeaguesFragment {
    public final otk r;

    public POTSTopLeaguesFragment() {
        joa a = ypa.a(ysa.c, new jmc(new jmc(this, 27), 28));
        this.r = new otk(duf.a.getOrCreateKotlinClass(e3e.class), new llc(a, 29), new wya(24, this, a), new x2e(a, 0));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getT() {
        return new tc3(421002804, new t21(this, 4), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "TopLeaguesTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        e3e e3eVar = (e3e) this.r.getValue();
        xw3.L(un0.z(e3eVar), null, null, new d3e(e3eVar, null, 1), 3);
    }
}
