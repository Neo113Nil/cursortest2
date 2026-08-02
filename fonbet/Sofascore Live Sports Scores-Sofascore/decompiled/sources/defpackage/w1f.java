package defpackage;

import com.sofascore.results.league.fragment.details.PopularPlayersModal;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class w1f extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ PopularPlayersModal j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1f(PopularPlayersModal popularPlayersModal, int i) {
        super(0);
        this.i = i;
        this.j = popularPlayersModal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        PopularPlayersModal popularPlayersModal = this.j;
        switch (i) {
            case 0:
                return popularPlayersModal.requireActivity().getViewModelStore();
            case 1:
                return popularPlayersModal.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return popularPlayersModal.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
