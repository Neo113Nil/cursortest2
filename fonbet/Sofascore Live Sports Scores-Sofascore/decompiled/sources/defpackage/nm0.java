package defpackage;

import com.sofascore.results.R;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public enum nm0 {
    FOOTBALL(new q9k(R.string.football_match_momentum), new q9k(R.string.attack_momentum_description), km5.a),
    ICE_HOCKEY(new q9k(R.string.hockey_offensive_intensity_graph), new q9k(R.string.hockey_offensive_intensity_graph_description), b.j(new mm0(R.drawable.ic_pak, new q9k(R.string.hockey_goal)), new mm0(R.drawable.ic_ice_hockey_powerplay_goal_16, new q9k(R.string.hockey_powerplay_goal)), new mm0(R.drawable.ic_ice_hockey_shorthand_goal_16, new q9k(R.string.hockey_shorthanded_goal)), new mm0(R.drawable.ic_hockey_penalty_goal, new q9k(R.string.hockey_penalty_shot_goal)), new mm0(R.drawable.ic_penalty_missed_16, new q9k(R.string.hockey_penalty_shot_miss)), new mm0(R.drawable.ic_pak_autogoal_16, new q9k(R.string.hockey_own_goal))));

    public static final rik d = new rik(16);
    public final q9k a;
    public final q9k b;
    public final List c;

    nm0(q9k q9kVar, q9k q9kVar2, List list) {
        this.a = q9kVar;
        this.b = q9kVar2;
        this.c = list;
    }
}
