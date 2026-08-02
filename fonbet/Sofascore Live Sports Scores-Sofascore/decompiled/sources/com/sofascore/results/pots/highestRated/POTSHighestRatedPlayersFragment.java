package com.sofascore.results.pots.highestRated;

import defpackage.duf;
import defpackage.f1e;
import defpackage.otk;
import defpackage.s1e;
import defpackage.t21;
import defpackage.tc3;
import defpackage.un0;
import defpackage.v1e;
import defpackage.xw3;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/pots/highestRated/POTSHighestRatedPlayersFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "Lvnb;", "Lq1e;", "state", "", "isPullToRefreshing", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class POTSHighestRatedPlayersFragment extends Hilt_POTSHighestRatedPlayersFragment {
    public final otk r = new otk(duf.a.getOrCreateKotlinClass(v1e.class), new f1e(this, 0), new f1e(this, 2), new f1e(this, 1));

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getT() {
        return new tc3(566245361, new t21(this, 2), true);
    }

    public final v1e D() {
        return (v1e) this.r.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "HighestRatingsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        v1e D = D();
        xw3.L(un0.z(D), null, null, new s1e(D, null, 1), 3);
    }
}
