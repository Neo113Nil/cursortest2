package com.sofascore.results.event.boxscoreAnimation;

import defpackage.duf;
import defpackage.fuf;
import defpackage.fv2;
import defpackage.joa;
import defpackage.mr5;
import defpackage.otk;
import defpackage.ov5;
import defpackage.pi;
import defpackage.q3;
import defpackage.tc3;
import defpackage.un0;
import defpackage.ut5;
import defpackage.w1;
import defpackage.x1;
import defpackage.xw3;
import defpackage.y1;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/boxscoreAnimation/EventBoxScoreFragmentNew;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventBoxScoreFragmentNew extends Hilt_EventBoxScoreFragmentNew {
    public final otk r;
    public final otk s;

    public EventBoxScoreFragmentNew() {
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new ut5(this, 0), new ut5(this, 2), new ut5(this, 1));
        pi piVar = new pi(7, this, this);
        joa a = ypa.a(ysa.c, new w1(new w1(this, 7), 8));
        this.s = new otk(fufVar.getOrCreateKotlinClass(ov5.class), new x1(a, 4), new y1(6, this, a), new y1(5, piVar, a));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getX() {
        return new tc3(491410822, new fv2(this, 14), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "BoxScoreTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        ov5 ov5Var = (ov5) this.s.getValue();
        xw3.L(un0.z(ov5Var), null, null, new q3(ov5Var, null, 23), 3);
    }
}
