package com.sofascore.results.pots.mostAwards;

import android.os.Bundle;
import defpackage.duf;
import defpackage.i2e;
import defpackage.jmc;
import defpackage.joa;
import defpackage.llc;
import defpackage.m2e;
import defpackage.otk;
import defpackage.t21;
import defpackage.tc3;
import defpackage.un0;
import defpackage.wya;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/pots/mostAwards/POTSMostAwardsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "", "isPullToRefreshing", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class POTSMostAwardsFragment extends Hilt_POTSMostAwardsFragment {
    public final otk r;

    public POTSMostAwardsFragment() {
        joa a = ypa.a(ysa.c, new jmc(new jmc(this, 23), 24));
        this.r = new otk(duf.a.getOrCreateKotlinClass(m2e.class), new llc(a, 25), new wya(22, this, a), new llc(a, 26));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getT() {
        return new tc3(-550606378, new t21(this, 3), true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "MostAwardsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        m2e m2eVar = (m2e) this.r.getValue();
        xw3.L(un0.z(m2eVar), null, null, new i2e(m2eVar, null, 0), 3);
    }
}
