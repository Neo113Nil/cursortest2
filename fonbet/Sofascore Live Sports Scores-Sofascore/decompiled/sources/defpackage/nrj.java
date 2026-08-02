package defpackage;

import com.sofascore.results.league.fragment.details.view.TournamentPreviousWinnersBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class nrj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TournamentPreviousWinnersBottomSheet b;

    public /* synthetic */ nrj(TournamentPreviousWinnersBottomSheet tournamentPreviousWinnersBottomSheet, int i) {
        this.a = i;
        this.b = tournamentPreviousWinnersBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        TournamentPreviousWinnersBottomSheet tournamentPreviousWinnersBottomSheet = this.b;
        switch (i) {
            case 0:
                return tournamentPreviousWinnersBottomSheet.requireArguments().getString("PREVIOUS_WINNERS_SPORT_SLUG", "");
            default:
                tournamentPreviousWinnersBottomSheet.j();
                return Unit.a;
        }
    }
}
