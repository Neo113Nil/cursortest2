package com.sofascore.results.fantasy.competition.home;

import android.os.Bundle;
import android.view.View;
import defpackage.duf;
import defpackage.fi5;
import defpackage.fuf;
import defpackage.hp6;
import defpackage.jo6;
import defpackage.joa;
import defpackage.nr6;
import defpackage.otk;
import defpackage.t06;
import defpackage.tc3;
import defpackage.vq6;
import defpackage.xp6;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/competition/home/FantasyCompetitionHomeFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyCompetitionHomeFragment extends Hilt_FantasyCompetitionHomeFragment {
    public final otk r;
    public final otk s;

    public FantasyCompetitionHomeFragment() {
        joa a = ypa.a(ysa.c, new t06(new vq6(this, 3), 17));
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(nr6.class), new xp6(a, 1), new fi5(this, a, 19), new xp6(a, 2));
        this.s = new otk(fufVar.getOrCreateKotlinClass(hp6.class), new vq6(this, 0), new vq6(this, 2), new vq6(this, 1));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getS() {
        return new tc3(1992584999, new jo6(this, 2), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.i.b = ((nr6) this.r.getValue()).h.c.d.getAnalyticsName();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "HomeTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        ((nr6) this.r.getValue()).m();
    }
}
