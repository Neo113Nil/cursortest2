package com.sofascore.results.league.fragment.awards;

import android.os.Bundle;
import android.view.View;
import com.sofascore.model.mvvm.model.Season;
import defpackage.dsi;
import defpackage.dua;
import defpackage.duf;
import defpackage.faa;
import defpackage.fuf;
import defpackage.hv7;
import defpackage.ix7;
import defpackage.joa;
import defpackage.kua;
import defpackage.nua;
import defpackage.o3a;
import defpackage.otk;
import defpackage.tc3;
import defpackage.un0;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yta;
import defpackage.z07;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/league/fragment/awards/LeagueAwardsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LeagueAwardsFragment extends Hilt_LeagueAwardsFragment {
    public final otk r;
    public final otk s;
    public final otk t;
    public final tc3 u;

    public LeagueAwardsFragment() {
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(yta.class), new dua(this, 0), new dua(this, 2), new dua(this, 1));
        int i = 5;
        this.s = new otk(fufVar.getOrCreateKotlinClass(dsi.class), new dua(this, 3), new dua(this, i), new dua(this, 4));
        joa a = ypa.a(ysa.c, new hv7(new dua(this, 6), 13));
        this.t = new otk(fufVar.getOrCreateKotlinClass(nua.class), new ix7(a, 7), new z07(27, this, a), new ix7(a, 8));
        this.u = new tc3(757963628, new faa(this, i), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A, reason: from getter */
    public final tc3 getS() {
        return this.u;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "AwardsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        this.i.a = o3a.F(((yta) this.r.getValue()).o());
        l();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        nua nuaVar = (nua) this.t.getValue();
        otk otkVar = this.r;
        Integer F = o3a.F(((yta) otkVar.getValue()).o());
        int intValue = F != null ? F.intValue() : -1;
        Season l = ((yta) otkVar.getValue()).l();
        xw3.L(un0.z(nuaVar), null, null, new kua(nuaVar, intValue, l != null ? l.getId() : -1, null, 0), 3);
    }
}
