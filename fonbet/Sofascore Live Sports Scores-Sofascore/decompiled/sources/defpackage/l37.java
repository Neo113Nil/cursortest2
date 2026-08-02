package defpackage;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.model.util.ChatInterfaceBasic;
import com.sofascore.results.R;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import com.sofascore.results.fantasy.league.chat.FantasyLeagueChatFragment;
import com.sofascore.results.fantasy.league.details.FantasyLeagueDetailsFragment;
import com.sofascore.results.fantasy.league.leaderboard.FantasyLeagueLeaderboardFragment;
import com.sofascore.results.fantasy.league.matchups.FantasyLeagueMatchupsFragment;
import com.sofascore.results.fantasy.league.settings.FantasyLeagueSettingsFragment;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l37 extends s8 {
    public final j67 r;
    public final ev6 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l37(AppCompatActivity appCompatActivity, ViewPager2 viewPager2, SofaTabLayout sofaTabLayout, j67 j67Var, ev6 ev6Var) {
        super(appCompatActivity, viewPager2, sofaTabLayout);
        j67Var.getClass();
        ev6Var.getClass();
        this.r = j67Var;
        this.s = ev6Var;
    }

    @Override // defpackage.d41
    public final Fragment C(Enum r11) {
        k37 k37Var = (k37) r11;
        k37Var.getClass();
        int ordinal = k37Var.ordinal();
        ev6 ev6Var = this.s;
        j67 j67Var = this.r;
        if (ordinal == 0) {
            j67Var.getClass();
            ev6Var.getClass();
            FantasyLeagueLeaderboardFragment fantasyLeagueLeaderboardFragment = new FantasyLeagueLeaderboardFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("FANTASY_COMPETITION_EXTRA", ev6Var);
            bundle.putSerializable("FANTASY_LEAGUE_EXTRA", j67Var);
            fantasyLeagueLeaderboardFragment.setArguments(bundle);
            return fantasyLeagueLeaderboardFragment;
        }
        if (ordinal == 1) {
            j67Var.getClass();
            ev6Var.getClass();
            FantasyLeagueMatchupsFragment fantasyLeagueMatchupsFragment = new FantasyLeagueMatchupsFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("FANTASY_COMPETITION_EXTRA", ev6Var);
            bundle2.putSerializable("FANTASY_LEAGUE_EXTRA", j67Var);
            fantasyLeagueMatchupsFragment.setArguments(bundle2);
            return fantasyLeagueMatchupsFragment;
        }
        if (ordinal == 2) {
            j67Var.getClass();
            ev6Var.getClass();
            FantasyLeagueDetailsFragment fantasyLeagueDetailsFragment = new FantasyLeagueDetailsFragment();
            Bundle bundle3 = new Bundle();
            bundle3.putSerializable("FANTASY_COMPETITION_EXTRA", ev6Var);
            bundle3.putSerializable("FANTASY_LEAGUE_EXTRA", j67Var);
            fantasyLeagueDetailsFragment.setArguments(bundle3);
            return fantasyLeagueDetailsFragment;
        }
        if (ordinal == 3) {
            j67Var.getClass();
            ev6Var.getClass();
            FantasyLeagueChatFragment fantasyLeagueChatFragment = new FantasyLeagueChatFragment();
            fantasyLeagueChatFragment.setArguments(fz8.C(fz8.G("FANTASY_LEAGUE_EXTRA", j67Var), fz8.G("FANTASY_COMPETITION_EXTRA", ev6Var), fz8.G("CHAT_INTERFACE_OBJECT", new ChatInterfaceBasic(j67Var.a, "fantasy.league", 0L, null, 12, null))));
            return fantasyLeagueChatFragment;
        }
        if (ordinal != 4) {
            zzl.b();
            return null;
        }
        j67Var.getClass();
        ev6Var.getClass();
        FantasyLeagueSettingsFragment fantasyLeagueSettingsFragment = new FantasyLeagueSettingsFragment();
        Bundle bundle4 = new Bundle();
        bundle4.putSerializable("FANTASY_COMPETITION_EXTRA", ev6Var);
        bundle4.putSerializable("FANTASY_LEAGUE_EXTRA", j67Var);
        fantasyLeagueSettingsFragment.setArguments(bundle4);
        return fantasyLeagueSettingsFragment;
    }

    @Override // defpackage.s8
    public final String H(Enum r3) {
        k37 k37Var = (k37) r3;
        k37Var.getClass();
        String string = y().getString(k37Var.a);
        string.getClass();
        Object orElse = A(k37Var).orElse(null);
        AbstractChatFragment abstractChatFragment = orElse instanceof AbstractChatFragment ? (AbstractChatFragment) orElse : null;
        return Intrinsics.c(abstractChatFragment != null ? Boolean.valueOf(abstractChatFragment.M) : null, Boolean.TRUE) ? string.concat(" ●") : string;
    }

    @Override // defpackage.s8
    public final int I() {
        return y().getColor(R.color.live);
    }
}
