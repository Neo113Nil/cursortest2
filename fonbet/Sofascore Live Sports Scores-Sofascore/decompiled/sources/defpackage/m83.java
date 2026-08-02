package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m83 extends p83 {
    public static final m83 f = new m83(hwg.e, SearchResponseKt.PLAYER_ENTITY, Player.class, R.string.search_player, "players");

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof m83);
    }

    public final int hashCode() {
        return 295758911;
    }

    public final String toString() {
        return "PlayerSearchEntity";
    }
}
