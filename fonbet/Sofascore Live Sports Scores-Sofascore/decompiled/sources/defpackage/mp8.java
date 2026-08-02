package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.results.mma.organisation.details.view.MmaOrganisationFeaturedEventView;
import com.sofascore.results.view.facts.MmaOrganisationInfoView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mp8 implements krk {
    public final SwipeRefreshLayout a;
    public final LinearLayout b;
    public final MmaOrganisationFeaturedEventView c;
    public final MmaOrganisationInfoView d;
    public final SwipeRefreshLayout e;

    public mp8(SwipeRefreshLayout swipeRefreshLayout, LinearLayout linearLayout, MmaOrganisationFeaturedEventView mmaOrganisationFeaturedEventView, MmaOrganisationInfoView mmaOrganisationInfoView, SwipeRefreshLayout swipeRefreshLayout2) {
        this.a = swipeRefreshLayout;
        this.b = linearLayout;
        this.c = mmaOrganisationFeaturedEventView;
        this.d = mmaOrganisationInfoView;
        this.e = swipeRefreshLayout2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
