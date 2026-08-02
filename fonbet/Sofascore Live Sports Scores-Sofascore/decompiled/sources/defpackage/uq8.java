package defpackage;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.results.venue.summary.venueinfo.VenueHighlightsView;
import com.sofascore.results.venue.summary.venueinfo.VenueInfoView;
import com.sofascore.results.view.FeatureMatchCardView;
import com.sofascore.results.view.SuggestEditView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uq8 implements krk {
    public final SwipeRefreshLayout a;
    public final FeatureMatchCardView b;
    public final SwipeRefreshLayout c;
    public final SuggestEditView d;
    public final VenueHighlightsView e;
    public final VenueInfoView f;

    public uq8(SwipeRefreshLayout swipeRefreshLayout, FeatureMatchCardView featureMatchCardView, SwipeRefreshLayout swipeRefreshLayout2, SuggestEditView suggestEditView, VenueHighlightsView venueHighlightsView, VenueInfoView venueInfoView) {
        this.a = swipeRefreshLayout;
        this.b = featureMatchCardView;
        this.c = swipeRefreshLayout2;
        this.d = suggestEditView;
        this.e = venueHighlightsView;
        this.f = venueInfoView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
