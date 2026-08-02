package defpackage;

import com.sofascore.results.fantasy.league.settings.FantasyLeagueSettingsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class n57 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FantasyLeagueSettingsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n57(FantasyLeagueSettingsFragment fantasyLeagueSettingsFragment, int i) {
        super(0);
        this.i = i;
        this.j = fantasyLeagueSettingsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FantasyLeagueSettingsFragment fantasyLeagueSettingsFragment = this.j;
        switch (i) {
            case 0:
                return fantasyLeagueSettingsFragment.requireActivity().getViewModelStore();
            case 1:
                return fantasyLeagueSettingsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return fantasyLeagueSettingsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return fantasyLeagueSettingsFragment.requireActivity().getViewModelStore();
            case 4:
                return fantasyLeagueSettingsFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return fantasyLeagueSettingsFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
