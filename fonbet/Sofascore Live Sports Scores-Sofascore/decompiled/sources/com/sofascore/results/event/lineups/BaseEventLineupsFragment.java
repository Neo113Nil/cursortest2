package com.sofascore.results.event.lineups;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.mvvm.base.AbstractComposeFragment;
import defpackage.a70;
import defpackage.duf;
import defpackage.mr5;
import defpackage.otk;
import defpackage.rq3;
import defpackage.t21;
import defpackage.tc3;
import defpackage.u21;
import defpackage.un0;
import defpackage.w21;
import defpackage.x21;
import defpackage.xw3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00018\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/event/lineups/BaseEventLineupsFragment;", "State", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "Lvnb;", "state", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BaseEventLineupsFragment<State> extends AbstractComposeFragment {
    public final otk m = new otk(duf.a.getOrCreateKotlinClass(mr5.class), new u21(this, 0), new u21(this, 2), new u21(this, 1));

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getX() {
        return new tc3(-1019789177, new t21(this, 0), true);
    }

    public final Event B() {
        Object d = ((mr5) this.m.getValue()).v.d();
        if (d != null) {
            return (Event) d;
        }
        a70.r("Required value was null.");
        return null;
    }

    public abstract tc3 C();

    public abstract x21 D();

    public abstract Function1 E();

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "LineupsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        x21 D = D();
        Event B = B();
        D.getClass();
        xw3.L(un0.z(D), null, null, new w21(false, D, B, (rq3) null), 3);
    }
}
