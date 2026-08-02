package com.sofascore.results.event.lineups.othersports;

import defpackage.au5;
import defpackage.ay5;
import defpackage.duf;
import defpackage.fi5;
import defpackage.joa;
import defpackage.m46;
import defpackage.otk;
import defpackage.p46;
import defpackage.s16;
import defpackage.t06;
import defpackage.tc3;
import defpackage.x21;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/event/lineups/othersports/EventOtherSportsLineupsFragment;", "Lcom/sofascore/results/event/lineups/BaseEventLineupsFragment;", "Lm46;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventOtherSportsLineupsFragment extends Hilt_EventOtherSportsLineupsFragment<m46> {
    public final otk s;

    public EventOtherSportsLineupsFragment() {
        joa a = ypa.a(ysa.c, new t06(new t06(this, 6), 7));
        this.s = new otk(duf.a.getOrCreateKotlinClass(p46.class), new ay5(a, 15), new fi5(this, a, 11), new ay5(a, 16));
    }

    @Override // com.sofascore.results.event.lineups.BaseEventLineupsFragment
    public final tc3 C() {
        return new tc3(-1451245245, new s16(this, 2), true);
    }

    @Override // com.sofascore.results.event.lineups.BaseEventLineupsFragment
    public final x21 D() {
        return (p46) this.s.getValue();
    }

    @Override // com.sofascore.results.event.lineups.BaseEventLineupsFragment
    public final Function1 E() {
        return new au5(10);
    }
}
