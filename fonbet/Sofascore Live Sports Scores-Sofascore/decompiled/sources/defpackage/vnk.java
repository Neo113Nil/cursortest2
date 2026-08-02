package defpackage;

import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.results.venue.editvenue.EditVenueDialog;
import com.sofascore.results.venue.summary.VenueSummaryFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class vnk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VenueSummaryFragment b;

    public /* synthetic */ vnk(VenueSummaryFragment venueSummaryFragment, int i) {
        this.a = i;
        this.b = venueSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        VenueSummaryFragment venueSummaryFragment = this.b;
        switch (i) {
            case 0:
                Venue venue = venueSummaryFragment.C().getVenue();
                venue.getClass();
                EditVenueDialog editVenueDialog = new EditVenueDialog();
                editVenueDialog.setArguments(fz8.C(fz8.G("ARG_VENUE", venue)));
                editVenueDialog.p(venueSummaryFragment.requireActivity().k(), "EditVenueDialog");
                break;
            default:
                dsi dsiVar = (dsi) venueSummaryFragment.t.getValue();
                dsiVar.b.d(bok.b);
                break;
        }
        return Unit.a;
    }
}
