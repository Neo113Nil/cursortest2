package com.sofascore.results.event.odds.oddscomparison;

import defpackage.duf;
import defpackage.fuf;
import defpackage.hj;
import defpackage.ij;
import defpackage.joa;
import defpackage.mr5;
import defpackage.ni;
import defpackage.otk;
import defpackage.ou4;
import defpackage.pi;
import defpackage.rq3;
import defpackage.t21;
import defpackage.tc3;
import defpackage.un0;
import defpackage.w1;
import defpackage.x1;
import defpackage.xw3;
import defpackage.y1;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/event/odds/oddscomparison/AdditionalOddsComparisonFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "Lvnb;", "Lcj;", "state", "", "isPullRefreshing", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdditionalOddsComparisonFragment extends Hilt_AdditionalOddsComparisonFragment {
    public final otk r;
    public final otk s;
    public ou4 t;
    public final tc3 u;

    public AdditionalOddsComparisonFragment() {
        fuf fufVar = duf.a;
        int i = 0;
        this.r = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new ni(this, i), new ni(this, 2), new ni(this, 1));
        pi piVar = new pi(i, this, this);
        joa a = ypa.a(ysa.c, new w1(new w1(this, 7), 8));
        int i2 = 5;
        this.s = new otk(fufVar.getOrCreateKotlinClass(ij.class), new x1(a, 4), new y1(6, this, a), new y1(i2, piVar, a));
        this.u = new tc3(-1151806562, new t21(this, i2), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A, reason: from getter */
    public final tc3 getV() {
        return this.u;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ou4 ou4Var = this.t;
        if (ou4Var != null) {
            ou4Var.b();
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ou4 ou4Var = this.t;
        if (ou4Var != null) {
            ou4Var.f();
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "AdditionalOddsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        ij ijVar = (ij) this.s.getValue();
        xw3.L(un0.z(ijVar), null, null, new hj(ijVar, (rq3) null, 0), 3);
    }
}
