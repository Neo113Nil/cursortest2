package com.sofascore.results.main.matches.redesign.trendinggrid;

import defpackage.c0k;
import defpackage.duf;
import defpackage.fwi;
import defpackage.ilj;
import defpackage.joa;
import defpackage.lqj;
import defpackage.luj;
import defpackage.otk;
import defpackage.s2j;
import defpackage.tc3;
import defpackage.un0;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/main/matches/redesign/trendinggrid/TrendingGridFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrendingGridFragment extends Hilt_TrendingGridFragment {
    public final otk r;

    public TrendingGridFragment() {
        joa a = ypa.a(ysa.c, new s2j(new s2j(this, 8), 9));
        this.r = new otk(duf.a.getOrCreateKotlinClass(c0k.class), new fwi(a, 23), new ilj(2, this, a), new fwi(a, 24));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getX() {
        return new tc3(-854637531, new lqj(this, 3), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "TrendingNestedTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        c0k c0kVar = (c0k) this.r.getValue();
        xw3.L(un0.z(c0kVar), null, null, new luj(c0kVar, null, 1), 3);
    }
}
