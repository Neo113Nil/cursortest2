package defpackage;

import com.sofascore.results.league.fragment.transactions.LeagueTransactionsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g4b extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ LeagueTransactionsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4b(LeagueTransactionsFragment leagueTransactionsFragment, int i) {
        super(0);
        this.i = i;
        this.j = leagueTransactionsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        LeagueTransactionsFragment leagueTransactionsFragment = this.j;
        switch (i) {
            case 0:
                return leagueTransactionsFragment.requireActivity().getViewModelStore();
            case 1:
                return leagueTransactionsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return leagueTransactionsFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return leagueTransactionsFragment;
        }
    }
}
