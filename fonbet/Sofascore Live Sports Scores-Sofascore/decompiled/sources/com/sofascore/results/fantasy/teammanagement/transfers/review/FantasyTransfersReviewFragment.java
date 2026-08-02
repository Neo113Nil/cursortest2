package com.sofascore.results.fantasy.teammanagement.transfers.review;

import android.os.Bundle;
import android.view.View;
import defpackage.ao7;
import defpackage.duf;
import defpackage.hl7;
import defpackage.joa;
import defpackage.mqi;
import defpackage.otk;
import defpackage.pi;
import defpackage.ps4;
import defpackage.qa7;
import defpackage.qo6;
import defpackage.rq3;
import defpackage.tc3;
import defpackage.vz6;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/teammanagement/transfers/review/FantasyTransfersReviewFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyTransfersReviewFragment extends Hilt_FantasyTransfersReviewFragment {
    public final otk r;
    public final joa s;

    public FantasyTransfersReviewFragment() {
        mqi b = ypa.b(new ps4(this, 2));
        vz6 vz6Var = new vz6(b, 7);
        this.r = new otk(duf.a.getOrCreateKotlinClass(ao7.class), vz6Var, new pi(11, this, b), new vz6(b, 8));
        this.s = ypa.a(ysa.c, new qo6(this, 19));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getX() {
        return new tc3(-1832876523, new hl7(this, 4), true);
    }

    public final ao7 D() {
        return (ao7) this.r.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "ReviewTransfersTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        z8e.v(this, D().q, new qa7(this, (rq3) null, 8));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
