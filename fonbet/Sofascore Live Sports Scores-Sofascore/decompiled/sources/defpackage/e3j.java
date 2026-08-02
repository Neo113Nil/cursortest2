package defpackage;

import com.sofascore.results.team.topplayers.TeamTopPlayersFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e3j extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ TeamTopPlayersFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3j(TeamTopPlayersFragment teamTopPlayersFragment, int i) {
        super(0);
        this.i = i;
        this.j = teamTopPlayersFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        TeamTopPlayersFragment teamTopPlayersFragment = this.j;
        switch (i) {
            case 0:
                return teamTopPlayersFragment.requireActivity().getViewModelStore();
            case 1:
                return teamTopPlayersFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return teamTopPlayersFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
