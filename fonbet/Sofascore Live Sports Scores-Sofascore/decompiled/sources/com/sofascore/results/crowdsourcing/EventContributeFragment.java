package com.sofascore.results.crowdsourcing;

import android.os.Bundle;
import android.view.View;
import defpackage.ce;
import defpackage.de;
import defpackage.duf;
import defpackage.fuf;
import defpackage.fv2;
import defpackage.iw5;
import defpackage.kt4;
import defpackage.mr5;
import defpackage.nw5;
import defpackage.otk;
import defpackage.ow5;
import defpackage.rq3;
import defpackage.tc3;
import defpackage.tr3;
import defpackage.y7;
import defpackage.z8e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/crowdsourcing/EventContributeFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "Lk64;", "state", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventContributeFragment extends Hilt_EventContributeFragment {
    public final otk r;
    public final otk s;
    public final de t;

    public EventContributeFragment() {
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new ow5(this, 0), new ow5(this, 2), new ow5(this, 1));
        int i = 3;
        this.s = new otk(fufVar.getOrCreateKotlinClass(tr3.class), new ow5(this, i), new ow5(this, 5), new ow5(this, 4));
        de registerForActivityResult = registerForActivityResult(new ce(i), new kt4(this, i));
        registerForActivityResult.getClass();
        this.t = registerForActivityResult;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getX() {
        return new tc3(1613967718, new fv2(this, 17), true);
    }

    public final tr3 D() {
        return (tr3) this.s.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "ContributeTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        int i = 0;
        ((mr5) this.r.getValue()).v.e(getViewLifecycleOwner(), new y7(15, new iw5(this, i)));
        rq3 rq3Var = null;
        z8e.v(this, D().h, new nw5(this, rq3Var, i));
        z8e.v(this, D().j, new nw5(this, rq3Var, 1));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        D().v();
    }
}
