package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.results.featuredtournament.view.FeaturedTournamentCalendarRailView;
import com.sofascore.results.featuredtournament.view.FeaturedTournamentHeaderView;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jo8 implements krk {
    public final CoordinatorLayout a;
    public final FeaturedTournamentCalendarRailView b;
    public final GraphicLarge c;
    public final FeaturedTournamentHeaderView d;
    public final RecyclerView e;
    public final SwipeRefreshLayout f;

    public jo8(CoordinatorLayout coordinatorLayout, FeaturedTournamentCalendarRailView featuredTournamentCalendarRailView, GraphicLarge graphicLarge, FeaturedTournamentHeaderView featuredTournamentHeaderView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.a = coordinatorLayout;
        this.b = featuredTournamentCalendarRailView;
        this.c = graphicLarge;
        this.d = featuredTournamentHeaderView;
        this.e = recyclerView;
        this.f = swipeRefreshLayout;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
