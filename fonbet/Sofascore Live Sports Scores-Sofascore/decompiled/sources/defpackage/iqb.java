package defpackage;

import androidx.fragment.app.Fragment;
import com.sofascore.results.R;
import com.sofascore.results.featuredtournament.FeaturedTournamentFragment;
import com.sofascore.results.feed.FeedFragment;
import com.sofascore.results.main.fantasy.MainFantasyFragment;
import com.sofascore.results.main.favorites.FavoritesRootFragment;
import com.sofascore.results.main.matches.redesign.MatchesRootFragment;
import com.sofascore.results.wc26.WorldCupFragment;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class iqb extends d41 {
    public String p;
    public Map q;

    public static int H(jqb jqbVar, boolean z) {
        int i = jqbVar.b;
        int i2 = jqbVar.c;
        if (jqbVar != jqb.n) {
            return z ? i2 : i;
        }
        yea yeaVar = j58.a;
        return fn0.B("should_use_official_world_cup_icon") ? z ? i2 : i : R.drawable.ic_world_cup_fallback;
    }

    @Override // defpackage.d41
    public final Fragment C(Enum r1) {
        jqb jqbVar = (jqb) r1;
        jqbVar.getClass();
        switch (jqbVar.ordinal()) {
            case 0:
                return new MatchesRootFragment();
            case 1:
                return new MatchesRootFragment();
            case 2:
                return new MatchesRootFragment();
            case 3:
                return new MatchesRootFragment();
            case 4:
                return new FavoritesRootFragment();
            case 5:
                return new WorldCupFragment();
            case 6:
                return new FeaturedTournamentFragment();
            case 7:
                return new FeedFragment();
            case 8:
                return new MainFantasyFragment();
            default:
                zzl.b();
                return null;
        }
    }

    @Override // defpackage.d41, defpackage.wp8, androidx.recyclerview.widget.l
    public final long getItemId(int i) {
        Long l = (Long) this.q.get((jqb) CollectionsKt.a0(i, this.l));
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    @Override // defpackage.d41, defpackage.wp8
    public final boolean p(long j) {
        return this.q.values().contains(Long.valueOf(j));
    }
}
