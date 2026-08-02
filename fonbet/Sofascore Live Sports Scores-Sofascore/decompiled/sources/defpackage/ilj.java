package defpackage;

import com.sofascore.results.bettingtips.fragment.TopH2HFragment;
import com.sofascore.results.bettingtips.fragment.TrendingOddsFragment;
import com.sofascore.results.event.details.view.tv.dialog.TvChannelContributionDialog;
import com.sofascore.results.event.details.view.tv.dialog.TvChannelCountriesDialog;
import com.sofascore.results.main.matches.redesign.trending.TrendingMatchesFragment;
import com.sofascore.results.main.matches.redesign.trendinggrid.TrendingGridFragment;
import com.sofascore.results.tracker.TrackerBottomSheet;
import com.sofascore.results.venue.matches.VenueMatchesFragment;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeUserDailyBonusModal;
import com.sofascore.results.weeklyChallenge.statistics.WeeklyChallengeStatisticsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ilj extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ilj(int i, Object obj, Object obj2) {
        super(0);
        this.i = i;
        this.k = obj;
        this.j = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        h79 h79Var;
        qtk defaultViewModelProviderFactory;
        qtk defaultViewModelProviderFactory2;
        qtk defaultViewModelProviderFactory3;
        qtk defaultViewModelProviderFactory4;
        qtk defaultViewModelProviderFactory5;
        qtk defaultViewModelProviderFactory6;
        qtk defaultViewModelProviderFactory7;
        qtk defaultViewModelProviderFactory8;
        qtk defaultViewModelProviderFactory9;
        qtk defaultViewModelProviderFactory10;
        int i = this.i;
        Object obj = this.k;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                ttk ttkVar = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar instanceof h79 ? (h79) ttkVar : null;
                return (h79Var == null || (defaultViewModelProviderFactory = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((TopH2HFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            case 1:
                ttk ttkVar2 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar2 instanceof h79 ? (h79) ttkVar2 : null;
                return (h79Var == null || (defaultViewModelProviderFactory2 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((TrackerBottomSheet) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory2;
            case 2:
                ttk ttkVar3 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar3 instanceof h79 ? (h79) ttkVar3 : null;
                return (h79Var == null || (defaultViewModelProviderFactory3 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((TrendingGridFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory3;
            case 3:
                ttk ttkVar4 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar4 instanceof h79 ? (h79) ttkVar4 : null;
                return (h79Var == null || (defaultViewModelProviderFactory4 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((TrendingMatchesFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory4;
            case 4:
                ttk ttkVar5 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar5 instanceof h79 ? (h79) ttkVar5 : null;
                return (h79Var == null || (defaultViewModelProviderFactory5 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((TrendingOddsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory5;
            case 5:
                ttk ttkVar6 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar6 instanceof h79 ? (h79) ttkVar6 : null;
                return (h79Var == null || (defaultViewModelProviderFactory6 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((TvChannelContributionDialog) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory6;
            case 6:
                ttk ttkVar7 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar7 instanceof h79 ? (h79) ttkVar7 : null;
                return (h79Var == null || (defaultViewModelProviderFactory7 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((TvChannelCountriesDialog) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory7;
            case 7:
                ttk ttkVar8 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar8 instanceof h79 ? (h79) ttkVar8 : null;
                return (h79Var == null || (defaultViewModelProviderFactory8 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((VenueMatchesFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory8;
            case 8:
                ((a3) obj).removeOnAttachStateChangeListener((a16) obj2);
                return Unit.a;
            case 9:
                ((g6b) obj).d((ga) obj2);
                return Unit.a;
            case 10:
                ttk ttkVar9 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar9 instanceof h79 ? (h79) ttkVar9 : null;
                return (h79Var == null || (defaultViewModelProviderFactory9 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((WeeklyChallengeStatisticsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory9;
            default:
                ttk ttkVar10 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar10 instanceof h79 ? (h79) ttkVar10 : null;
                return (h79Var == null || (defaultViewModelProviderFactory10 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((WeeklyChallengeUserDailyBonusModal) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory10;
        }
    }
}
