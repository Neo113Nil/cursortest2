package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.details.compose.goat.LeagueGoatFullPlayersBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class cxa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeagueGoatFullPlayersBottomSheet b;

    public /* synthetic */ cxa(LeagueGoatFullPlayersBottomSheet leagueGoatFullPlayersBottomSheet, int i) {
        this.a = i;
        this.b = leagueGoatFullPlayersBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        LeagueGoatFullPlayersBottomSheet leagueGoatFullPlayersBottomSheet = this.b;
        switch (i) {
            case 0:
                return leagueGoatFullPlayersBottomSheet.requireArguments().getString("ANALYTICS_SOURCE");
            default:
                Context requireContext = leagueGoatFullPlayersBottomSheet.requireContext();
                requireContext.getClass();
                leagueGoatFullPlayersBottomSheet.startActivity(Intent.createChooser(uic.u(requireContext), leagueGoatFullPlayersBottomSheet.getString(R.string.vote_for_your_goat)));
                return Unit.a;
        }
    }
}
