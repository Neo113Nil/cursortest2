package com.sofascore.results.event.odds.eventrecomended;

import defpackage.duf;
import defpackage.f66;
import defpackage.fuf;
import defpackage.fv2;
import defpackage.h10;
import defpackage.joa;
import defpackage.l66;
import defpackage.mr5;
import defpackage.otk;
import defpackage.ou4;
import defpackage.pi;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/event/odds/eventrecomended/EventRecommendedOddsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "Lvnb;", "Lzpf;", "state", "", "isPullRefreshing", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventRecommendedOddsFragment extends Hilt_EventRecommendedOddsFragment {
    public final otk r;
    public final otk s;
    public ou4 t;
    public final tc3 u;

    public EventRecommendedOddsFragment() {
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new f66(this, 0), new f66(this, 2), new f66(this, 1));
        pi piVar = new pi(9, this, this);
        joa a = ypa.a(ysa.c, new w1(new w1(this, 7), 8));
        this.s = new otk(fufVar.getOrCreateKotlinClass(l66.class), new x1(a, 4), new y1(6, this, a), new y1(5, piVar, a));
        this.u = new tc3(1134585329, new fv2(this, 22), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A, reason: from getter */
    public final tc3 getT() {
        return this.u;
    }

    public final l66 D() {
        return (l66) this.s.getValue();
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
        return "RecommendedOddsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        l66 D = D();
        xw3.L(un0.z(D), null, null, new h10(D, null, 7), 3);
    }
}
