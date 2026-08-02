package defpackage;

import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public enum boj {
    PLAYERS(R.string.players, SearchResponseKt.PLAYER_ENTITY),
    PERFORMANCES(R.string.stats_performances, "performances"),
    TEAMS(R.string.teams, "teams");

    public final int a;
    public final String b;

    boj(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
