package com.sofascore.results.fantasy.competition.team;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.results.fantasy.competition.team.FantasyCompetitionMyTeamFragment;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayers;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import defpackage.a70;
import defpackage.ce;
import defpackage.de;
import defpackage.do7;
import defpackage.duf;
import defpackage.e6b;
import defpackage.fuf;
import defpackage.g9a;
import defpackage.g9i;
import defpackage.gz8;
import defpackage.hp6;
import defpackage.jo6;
import defpackage.k0;
import defpackage.otk;
import defpackage.pt6;
import defpackage.pu6;
import defpackage.r1;
import defpackage.tc3;
import defpackage.u6b;
import defpackage.xd;
import defpackage.z8e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/competition/team/FantasyCompetitionMyTeamFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyCompetitionMyTeamFragment extends Hilt_FantasyCompetitionMyTeamFragment {
    public final otk r;
    public final otk s;
    public final otk t;
    public g9i u;
    public MenuItem v;
    public final de w;
    public final de x;

    public FantasyCompetitionMyTeamFragment() {
        fuf fufVar = duf.a;
        final int i = 0;
        final int i2 = 1;
        this.r = new otk(fufVar.getOrCreateKotlinClass(pu6.class), new pt6(this, i), new pt6(this, 2), new pt6(this, i2));
        int i3 = 3;
        this.s = new otk(fufVar.getOrCreateKotlinClass(hp6.class), new pt6(this, i3), new pt6(this, 5), new pt6(this, 4));
        this.t = new otk(fufVar.getOrCreateKotlinClass(g9a.class), new pt6(this, 6), new pt6(this, 8), new pt6(this, 7));
        de registerForActivityResult = registerForActivityResult(new ce(i3), new xd(this) { // from class: lt6
            public final /* synthetic */ FantasyCompetitionMyTeamFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                Intent intent;
                Bundle extras;
                Intent intent2;
                Bundle extras2;
                int i4 = i;
                FantasyCompetitionMyTeamFragment fantasyCompetitionMyTeamFragment = this.b;
                rq3 rq3Var = null;
                switch (i4) {
                    case 0:
                        ActivityResult activityResult = (ActivityResult) obj;
                        activityResult.getClass();
                        if (activityResult.a == -1 && (intent = activityResult.b) != null && (extras = intent.getExtras()) != null) {
                            ArrayList L = gz8.L(extras, "squad", FantasyRoundPlayerUiModel.class);
                            ArrayList L2 = gz8.L(extras, "transfers", FantasyTransferPlayers.class);
                            Integer num = (Integer) gz8.M(extras, "freeTransfersUsed", Integer.class);
                            int intValue = num != null ? num.intValue() : 0;
                            Double d = (Double) gz8.M(extras, "balance", Double.class);
                            Boolean bool = (Boolean) gz8.M(extras, "tripleCaptain", Boolean.class);
                            Boolean bool2 = (Boolean) gz8.M(extras, "freeHit", Boolean.class);
                            Boolean bool3 = (Boolean) gz8.M(extras, "wildcard", Boolean.class);
                            if (L != null) {
                                fantasyCompetitionMyTeamFragment.D().z(L, L2, intValue, d, bool, bool2, bool3, true);
                            }
                        }
                        fantasyCompetitionMyTeamFragment.u = xw3.L(wca.x(fantasyCompetitionMyTeamFragment.getLifecycle()), null, null, new nt6(fantasyCompetitionMyTeamFragment, rq3Var, 2), 3);
                        break;
                    default:
                        ActivityResult activityResult2 = (ActivityResult) obj;
                        activityResult2.getClass();
                        if (activityResult2.a == -1 && (intent2 = activityResult2.b) != null && (extras2 = intent2.getExtras()) != null) {
                            ArrayList L3 = gz8.L(extras2, "squad", FantasyRoundPlayerUiModel.class);
                            Integer num2 = (Integer) gz8.M(extras2, "roundId", Integer.class);
                            if (L3 != null && num2 != null) {
                                fantasyCompetitionMyTeamFragment.D().A(L3, num2);
                                ((hp6) fantasyCompetitionMyTeamFragment.s.getValue()).l(wmh.e);
                            }
                        }
                        fantasyCompetitionMyTeamFragment.u = xw3.L(wca.x(fantasyCompetitionMyTeamFragment.getLifecycle()), null, null, new nt6(fantasyCompetitionMyTeamFragment, rq3Var, 1), 3);
                        break;
                }
            }
        });
        registerForActivityResult.getClass();
        this.w = registerForActivityResult;
        de registerForActivityResult2 = registerForActivityResult(new ce(i3), new xd(this) { // from class: lt6
            public final /* synthetic */ FantasyCompetitionMyTeamFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                Intent intent;
                Bundle extras;
                Intent intent2;
                Bundle extras2;
                int i4 = i2;
                FantasyCompetitionMyTeamFragment fantasyCompetitionMyTeamFragment = this.b;
                rq3 rq3Var = null;
                switch (i4) {
                    case 0:
                        ActivityResult activityResult = (ActivityResult) obj;
                        activityResult.getClass();
                        if (activityResult.a == -1 && (intent = activityResult.b) != null && (extras = intent.getExtras()) != null) {
                            ArrayList L = gz8.L(extras, "squad", FantasyRoundPlayerUiModel.class);
                            ArrayList L2 = gz8.L(extras, "transfers", FantasyTransferPlayers.class);
                            Integer num = (Integer) gz8.M(extras, "freeTransfersUsed", Integer.class);
                            int intValue = num != null ? num.intValue() : 0;
                            Double d = (Double) gz8.M(extras, "balance", Double.class);
                            Boolean bool = (Boolean) gz8.M(extras, "tripleCaptain", Boolean.class);
                            Boolean bool2 = (Boolean) gz8.M(extras, "freeHit", Boolean.class);
                            Boolean bool3 = (Boolean) gz8.M(extras, "wildcard", Boolean.class);
                            if (L != null) {
                                fantasyCompetitionMyTeamFragment.D().z(L, L2, intValue, d, bool, bool2, bool3, true);
                            }
                        }
                        fantasyCompetitionMyTeamFragment.u = xw3.L(wca.x(fantasyCompetitionMyTeamFragment.getLifecycle()), null, null, new nt6(fantasyCompetitionMyTeamFragment, rq3Var, 2), 3);
                        break;
                    default:
                        ActivityResult activityResult2 = (ActivityResult) obj;
                        activityResult2.getClass();
                        if (activityResult2.a == -1 && (intent2 = activityResult2.b) != null && (extras2 = intent2.getExtras()) != null) {
                            ArrayList L3 = gz8.L(extras2, "squad", FantasyRoundPlayerUiModel.class);
                            Integer num2 = (Integer) gz8.M(extras2, "roundId", Integer.class);
                            if (L3 != null && num2 != null) {
                                fantasyCompetitionMyTeamFragment.D().A(L3, num2);
                                ((hp6) fantasyCompetitionMyTeamFragment.s.getValue()).l(wmh.e);
                            }
                        }
                        fantasyCompetitionMyTeamFragment.u = xw3.L(wca.x(fantasyCompetitionMyTeamFragment.getLifecycle()), null, null, new nt6(fantasyCompetitionMyTeamFragment, rq3Var, 1), 3);
                        break;
                }
            }
        });
        registerForActivityResult2.getClass();
        this.x = registerForActivityResult2;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getT() {
        return new tc3(61984297, new jo6(this, 5), true);
    }

    public final pu6 D() {
        return (pu6) this.r.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        pu6 D = D();
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        Serializable M = gz8.M(requireArguments, "USER_COMPETITION_EXTRA", do7.class);
        if (M == null) {
            a70.p("Serializable USER_COMPETITION_EXTRA not found");
            return;
        }
        D.e.b((do7) M, "USER_COMPETITION_EXTRA");
        this.i.b = D().m().c.d.getAnalyticsName();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "MyTeamTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        FragmentActivity requireActivity = requireActivity();
        k0 k0Var = new k0(this, 7);
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        requireActivity.addMenuProvider(k0Var, viewLifecycleOwner, e6b.e);
        z8e.y(this, D().l, new r1(this, null, 26));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        pu6.u(D(), null, 3);
    }
}
