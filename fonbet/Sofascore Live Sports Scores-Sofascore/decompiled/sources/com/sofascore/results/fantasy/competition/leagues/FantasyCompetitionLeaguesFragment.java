package com.sofascore.results.fantasy.competition.leagues;

import android.os.Bundle;
import defpackage.a70;
import defpackage.as6;
import defpackage.do7;
import defpackage.duf;
import defpackage.fuf;
import defpackage.gz8;
import defpackage.hp6;
import defpackage.hs6;
import defpackage.is6;
import defpackage.jo6;
import defpackage.otk;
import defpackage.tc3;
import defpackage.un0;
import defpackage.xw3;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/competition/leagues/FantasyCompetitionLeaguesFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyCompetitionLeaguesFragment extends Hilt_FantasyCompetitionLeaguesFragment {
    public final otk r;
    public final otk s;

    public FantasyCompetitionLeaguesFragment() {
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(is6.class), new as6(this, 0), new as6(this, 2), new as6(this, 1));
        this.s = new otk(fufVar.getOrCreateKotlinClass(hp6.class), new as6(this, 3), new as6(this, 5), new as6(this, 4));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getX() {
        return new tc3(1820402062, new jo6(this, 4), true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        otk otkVar = this.r;
        is6 is6Var = (is6) otkVar.getValue();
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        Serializable M = gz8.M(requireArguments, "USER_COMPETITION_EXTRA", do7.class);
        if (M == null) {
            a70.p("Serializable USER_COMPETITION_EXTRA not found");
            return;
        }
        is6Var.f.b((do7) M, "USER_COMPETITION_EXTRA");
        this.i.b = ((is6) otkVar.getValue()).m().c.d.getAnalyticsName();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "LeaguesTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        is6 is6Var = (is6) this.r.getValue();
        xw3.L(un0.z(is6Var), null, null, new hs6(is6Var, null, 0), 3);
    }
}
