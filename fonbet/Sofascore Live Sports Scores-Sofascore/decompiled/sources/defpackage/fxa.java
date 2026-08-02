package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.details.compose.goat.LeagueGoatVoteBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class fxa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeagueGoatVoteBottomSheet b;

    public /* synthetic */ fxa(LeagueGoatVoteBottomSheet leagueGoatVoteBottomSheet, int i) {
        this.a = i;
        this.b = leagueGoatVoteBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        LeagueGoatVoteBottomSheet leagueGoatVoteBottomSheet = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(leagueGoatVoteBottomSheet.requireArguments().getInt("UNIQUE_TOURNAMENT_ID"));
            case 1:
                return leagueGoatVoteBottomSheet.requireArguments().getString("ANALYTICS_SOURCE");
            default:
                Context requireContext = leagueGoatVoteBottomSheet.requireContext();
                requireContext.getClass();
                leagueGoatVoteBottomSheet.startActivity(Intent.createChooser(uic.u(requireContext), leagueGoatVoteBottomSheet.getString(R.string.vote_for_your_goat)));
                return Unit.a;
        }
    }
}
