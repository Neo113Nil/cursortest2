package com.sofascore.results.event.media;

import com.sofascore.model.mvvm.model.Event;
import defpackage.a70;
import defpackage.ay5;
import defpackage.duf;
import defpackage.f36;
import defpackage.fi5;
import defpackage.fuf;
import defpackage.joa;
import defpackage.l6g;
import defpackage.mr5;
import defpackage.otk;
import defpackage.r36;
import defpackage.t06;
import defpackage.tee;
import defpackage.w41;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/event/media/EventMediaFragment;", "Lcom/sofascore/results/media/BaseMediaFragment;", "Lcom/sofascore/model/mvvm/model/Event;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventMediaFragment extends Hilt_EventMediaFragment<Event> {
    public final otk r;
    public final otk s;
    public final String t;

    public EventMediaFragment() {
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new f36(this, 0), new f36(this, 2), new f36(this, 1));
        joa a = ypa.a(ysa.c, new t06(new f36(this, 3), 5));
        this.s = new otk(fufVar.getOrCreateKotlinClass(r36.class), new ay5(a, 13), new fi5(this, a, 10), new ay5(a, 14));
        this.t = "event";
    }

    @Override // com.sofascore.results.media.BaseMediaFragment
    public final tee B() {
        return l6g.L(new Pair("page", "event"));
    }

    @Override // com.sofascore.results.media.BaseMediaFragment
    /* renamed from: C, reason: from getter */
    public final String getT() {
        return this.t;
    }

    @Override // com.sofascore.results.media.BaseMediaFragment
    public final int D() {
        Object d = ((mr5) this.r.getValue()).v.d();
        if (d != null) {
            return ((Event) d).getId();
        }
        a70.r("Required value was null.");
        return 0;
    }

    @Override // com.sofascore.results.media.BaseMediaFragment
    public final w41 E() {
        return (r36) this.s.getValue();
    }

    @Override // com.sofascore.results.media.BaseMediaFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "MediaTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        r36 r36Var = (r36) this.s.getValue();
        Object d = ((mr5) this.r.getValue()).v.d();
        if (d != null) {
            r36Var.G((Event) d);
        } else {
            a70.r("Required value was null.");
        }
    }
}
