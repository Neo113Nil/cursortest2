package defpackage;

import com.sofascore.results.fantasy.league.settings.dialog.FantasyLeagueTeamsFullScreenDialog;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class b67 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FantasyLeagueTeamsFullScreenDialog j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b67(FantasyLeagueTeamsFullScreenDialog fantasyLeagueTeamsFullScreenDialog, int i) {
        super(0);
        this.i = i;
        this.j = fantasyLeagueTeamsFullScreenDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FantasyLeagueTeamsFullScreenDialog fantasyLeagueTeamsFullScreenDialog = this.j;
        switch (i) {
            case 0:
                return fantasyLeagueTeamsFullScreenDialog.requireActivity().getViewModelStore();
            case 1:
                return fantasyLeagueTeamsFullScreenDialog.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return fantasyLeagueTeamsFullScreenDialog.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return fantasyLeagueTeamsFullScreenDialog;
        }
    }
}
