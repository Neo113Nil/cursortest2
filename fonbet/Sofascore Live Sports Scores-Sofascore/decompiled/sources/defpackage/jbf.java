package defpackage;

import com.sofascore.results.profile.topLeaderboards.ProfileTopLeaderboardInfoModal;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jbf extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ProfileTopLeaderboardInfoModal j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jbf(ProfileTopLeaderboardInfoModal profileTopLeaderboardInfoModal, int i) {
        super(0);
        this.i = i;
        this.j = profileTopLeaderboardInfoModal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        ProfileTopLeaderboardInfoModal profileTopLeaderboardInfoModal = this.j;
        switch (i) {
            case 0:
                return profileTopLeaderboardInfoModal.requireActivity().getViewModelStore();
            case 1:
                return profileTopLeaderboardInfoModal.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return profileTopLeaderboardInfoModal.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
