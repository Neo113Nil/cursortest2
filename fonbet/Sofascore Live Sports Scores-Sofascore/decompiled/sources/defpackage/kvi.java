package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.team.details.TeamDetailsFragment;
import com.sofascore.results.team.editteam.EditTeamDialog;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class kvi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TeamDetailsFragment b;

    public /* synthetic */ kvi(TeamDetailsFragment teamDetailsFragment, int i) {
        this.a = i;
        this.b = teamDetailsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SharedPreferences d;
        SharedPreferences d2;
        int i = this.a;
        TeamDetailsFragment teamDetailsFragment = this.b;
        switch (i) {
            case 0:
                Bundle requireArguments = teamDetailsFragment.requireArguments();
                requireArguments.getClass();
                Serializable M = gz8.M(requireArguments, "TEAM", Team.class);
                if (M != null) {
                    return (Team) M;
                }
                a70.p("Serializable TEAM not found");
                return null;
            case 1:
                return Boolean.valueOf(((nui) teamDetailsFragment.t.getValue()).y != null);
            case 2:
                Context requireContext = teamDetailsFragment.requireContext();
                requireContext.getClass();
                return new n4c(requireContext);
            case 3:
                yea yeaVar = j58.a;
                if (!j58.j()) {
                    return null;
                }
                Context requireContext2 = teamDetailsFragment.requireContext();
                requireContext2.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = requireContext2.getApplicationContext();
                    synchronized (uic.i) {
                        d2 = a5f.d(applicationContext);
                        uic.j = d2;
                    }
                    d2.getClass();
                    sharedPreferences = d2;
                }
                String string = sharedPreferences.getString("PR_XAIST", "");
                if ((string != null && string.length() != 0) || ke0.m.contains(-8)) {
                    return null;
                }
                Context requireContext3 = teamDetailsFragment.requireContext();
                requireContext3.getClass();
                SharedPreferences sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext2 = requireContext3.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext2);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences2 = d;
                }
                if (!sharedPreferences2.getBoolean("IN_APP_PURCHASE_AVAILABLE", true)) {
                    return null;
                }
                Context requireContext4 = teamDetailsFragment.requireContext();
                requireContext4.getClass();
                return new iuh(requireContext4);
            case 4:
                Team C = teamDetailsFragment.C();
                C.getClass();
                EditTeamDialog editTeamDialog = new EditTeamDialog();
                editTeamDialog.setArguments(fz8.C(fz8.G("ARG_TEAM", C)));
                editTeamDialog.p(teamDetailsFragment.requireActivity().k(), "EditTeamDialog");
                return Unit.a;
            default:
                Context requireContext5 = teamDetailsFragment.requireContext();
                requireContext5.getClass();
                nv.z0(requireContext5, kv.CLICK, "view_media", "team_details");
                ((dsi) teamDetailsFragment.u.getValue()).f(t4j.i);
                return Unit.a;
        }
    }
}
