package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.team.lastnext.TeamEventsFragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class owi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TeamEventsFragment b;

    public /* synthetic */ owi(TeamEventsFragment teamEventsFragment, int i) {
        this.a = i;
        this.b = teamEventsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Map map = null;
        TeamEventsFragment teamEventsFragment = this.b;
        switch (i) {
            case 0:
                teamEventsFragment.n();
                return Unit.a;
            case 1:
                Context requireContext = teamEventsFragment.requireContext();
                requireContext.getClass();
                Team team = teamEventsFragment.E().g;
                if (!teamEventsFragment.E().h) {
                    String sportSlug = teamEventsFragment.E().g.getSportSlug();
                    if (sportSlug == null) {
                        sportSlug = "";
                    }
                    map = wv8.o(SearchResponseKt.SPORT_ENTITY, sportSlug);
                }
                return new jzk(requireContext, team, teamEventsFragment, map);
            case 2:
                Context requireContext2 = teamEventsFragment.requireContext();
                requireContext2.getClass();
                GraphicLarge graphicLarge = new GraphicLarge(requireContext2, null, 6);
                graphicLarge.setLargeDrawableResource(Integer.valueOf(R.drawable.no_events_2));
                String string = teamEventsFragment.getString(R.string.no_games_title);
                string.getClass();
                graphicLarge.setTitleResource(string);
                String string2 = teamEventsFragment.getString(R.string.no_next_games);
                string2.getClass();
                graphicLarge.setSubtitleResource(string2);
                return graphicLarge;
            default:
                krk krkVar = teamEventsFragment.l;
                krkVar.getClass();
                ((dq8) krkVar).h.stopScroll();
                teamEventsFragment.F(teamEventsFragment.D().i);
                return Unit.a;
        }
    }
}
