package defpackage;

import com.sofascore.results.venue.matches.VenueMatchesFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lnk extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ VenueMatchesFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lnk(VenueMatchesFragment venueMatchesFragment, int i) {
        super(0);
        this.i = i;
        this.j = venueMatchesFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        VenueMatchesFragment venueMatchesFragment = this.j;
        switch (i) {
            case 0:
                return venueMatchesFragment.requireActivity().getViewModelStore();
            case 1:
                return venueMatchesFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return venueMatchesFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return venueMatchesFragment;
        }
    }
}
