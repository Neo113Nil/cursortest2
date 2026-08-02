package defpackage;

import com.sofascore.results.player.details.PlayerDetailsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class joe extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ PlayerDetailsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ joe(PlayerDetailsFragment playerDetailsFragment, int i) {
        super(0);
        this.i = i;
        this.j = playerDetailsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        PlayerDetailsFragment playerDetailsFragment = this.j;
        switch (i) {
            case 0:
                return playerDetailsFragment.requireActivity().getViewModelStore();
            case 1:
                return playerDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return playerDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return playerDetailsFragment.requireActivity().getViewModelStore();
            case 4:
                return playerDetailsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 5:
                return playerDetailsFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return playerDetailsFragment;
        }
    }
}
