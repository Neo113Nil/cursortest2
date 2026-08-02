package com.sofascore.results.event.baseballPrematchLineups;

import com.sofascore.model.mvvm.model.Event;
import defpackage.a70;
import defpackage.at5;
import defpackage.ce4;
import defpackage.ct5;
import defpackage.duf;
import defpackage.fi5;
import defpackage.fuf;
import defpackage.fv2;
import defpackage.j63;
import defpackage.joa;
import defpackage.mr5;
import defpackage.otk;
import defpackage.p24;
import defpackage.rq3;
import defpackage.tc3;
import defpackage.un0;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/baseballPrematchLineups/EventBaseballPrematchLineupsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventBaseballPrematchLineupsFragment extends Hilt_EventBaseballPrematchLineupsFragment {
    public final otk r;
    public final otk s;

    public EventBaseballPrematchLineupsFragment() {
        joa a = ypa.a(ysa.c, new j63(new at5(this, 3), 21));
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(ct5.class), new p24(a, 19), new fi5(this, a, 1), new p24(a, 20));
        this.s = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new at5(this, 0), new at5(this, 2), new at5(this, 1));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getU() {
        return new tc3(1241823263, new fv2(this, 13), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "PreMatchLineupsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        ct5 ct5Var = (ct5) this.r.getValue();
        Object d = ((mr5) this.s.getValue()).v.d();
        if (d != null) {
            xw3.L(un0.z(ct5Var), null, null, new ce4(ct5Var, (Event) d, (rq3) null, 11), 3);
        } else {
            a70.r("Required value was null.");
        }
    }
}
