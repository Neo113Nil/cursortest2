package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.chat.Message;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyLeagueGameType;
import com.sofascore.model.fantasy.FantasyLeagueType;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.MissingPlayerData;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.results.event.details.view.odds.FeaturedOddsView;
import com.sofascore.results.event.lineups.EventPreMatchLineupsFragment;
import com.sofascore.results.event.lineups.othersports.EventOtherSportsLineupsFragment;
import com.sofascore.results.event.lineups.view.RugbyLineupsFieldView;
import com.sofascore.results.event.overs.EventOversFragment;
import com.sofascore.results.fantasy.comparison.FantasyPlayerComparisonActivity;
import com.sofascore.results.fantasy.comparison.selectplayer.FantasyComparisonPlayersDialogFragment;
import com.sofascore.results.fantasy.competition.FantasyCompetitionActivity;
import com.sofascore.results.fantasy.competition.chat.FantasyCompetitionChatFragment;
import com.sofascore.results.fantasy.competition.home.bottomsheet.topplayers.FantasyTopPlayersBottomSheet;
import com.sofascore.results.fantasy.competition.leagues.bottomsheet.FantasyCreateLeagueBottomSheet;
import com.sofascore.results.fantasy.competition.leagues.bottomsheet.FantasyJoinLeagueBottomSheet;
import com.sofascore.results.fantasy.competition.managerprofile.FantasyManagerProfileActivity;
import com.sofascore.results.fantasy.league.chat.FantasyLeagueChatFragment;
import com.sofascore.results.fantasy.league.settings.bottomsheet.edit.FantasyEditLeagueBottomSheet;
import com.sofascore.results.fantasy.shared.FantasySquadInfoDisplayModeBottomSheet;
import com.sofascore.results.fantasy.teammanagement.transfers.FantasyTransfersFragment;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.manager.ManagerActivity;
import com.sofascore.results.view.SofascoreRatingView;
import com.sofascore.results.view.SofascoreSmallRatingView;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class x16 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x16(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Lineups awayLineups$default;
        Lineups homeLineups$default;
        Object value;
        Object value2;
        int i = this.a;
        int i2 = 8;
        int i3 = 10;
        int i4 = 9;
        int i5 = 17;
        List<MissingPlayerData> list = null;
        list = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Event event = (Event) obj;
                event.getClass();
                if (event.getTournament().getGroupSign() != null) {
                    linkedHashSet.add(Integer.valueOf(event.getTournament().getId()));
                }
                return Unit.a;
            case 1:
                EventOtherSportsLineupsFragment eventOtherSportsLineupsFragment = (EventOtherSportsLineupsFragment) obj2;
                h46 h46Var = (h46) obj;
                h46Var.getClass();
                if (h46Var instanceof e46) {
                    int i6 = ManagerActivity.R;
                    Context requireContext = eventOtherSportsLineupsFragment.requireContext();
                    requireContext.getClass();
                    bea.M(((e46) h46Var).a, requireContext);
                } else {
                    p46 p46Var = (p46) eventOtherSportsLineupsFragment.s.getValue();
                    if (h46Var instanceof f46) {
                        p46Var.w(((f46) h46Var).a, null, null);
                    } else if (h46Var instanceof g46) {
                        p46Var.n(null, new xw5(i3, h46Var, p46Var));
                    }
                }
                return Unit.a;
            case 2:
                m46 m46Var = (m46) obj2;
                q9g q9gVar = (q9g) obj;
                q9gVar.getClass();
                z3f z3fVar = q9gVar.d;
                RugbyLineupsFieldView rugbyLineupsFieldView = (RugbyLineupsFieldView) z3fVar.d;
                RugbyLineupsFieldView rugbyLineupsFieldView2 = (RugbyLineupsFieldView) z3fVar.d;
                rugbyLineupsFieldView.a();
                RugbyLineupsFieldView rugbyLineupsFieldView3 = (RugbyLineupsFieldView) z3fVar.c;
                rugbyLineupsFieldView3.a();
                n9g n9gVar = m46Var.b;
                m4j m4jVar = m46Var.a.c == TeamSelection.First ? m4j.HOME : m4j.AWAY;
                n9gVar.getClass();
                o9g o9gVar = n9gVar.d;
                o9g o9gVar2 = n9gVar.c;
                boolean z = n9gVar.b;
                int i7 = n9gVar.a;
                int i8 = p9g.a[m4jVar.ordinal()];
                if (i8 == 1) {
                    rugbyLineupsFieldView2.b(i7, z, o9gVar2, m4jVar);
                    rugbyLineupsFieldView3.a();
                    rugbyLineupsFieldView3.setVisibility(8);
                } else if (i8 != 2) {
                    rugbyLineupsFieldView3.setVisibility(0);
                    rugbyLineupsFieldView2.b(i7, z, o9gVar2, m4j.HOME);
                    rugbyLineupsFieldView3.b(i7, z, o9gVar, m4j.AWAY);
                } else {
                    rugbyLineupsFieldView2.b(i7, z, o9gVar, m4jVar);
                    rugbyLineupsFieldView3.a();
                    rugbyLineupsFieldView3.setVisibility(8);
                }
                return Unit.a;
            case 3:
                EventOversFragment eventOversFragment = (EventOversFragment) obj2;
                List list2 = (List) obj;
                String selectedItem = ((SegmentedButtonsView) eventOversFragment.u.getValue()).getSelectedItem();
                if (selectedItem != null) {
                    r46 r46Var = (r46) eventOversFragment.t.getValue();
                    CricketEvent C = eventOversFragment.C();
                    list2.getClass();
                    r46Var.G(C, list2, TeamSelection.valueOf(selectedItem));
                }
                return Unit.a;
            case 4:
                EventPreMatchLineupsFragment eventPreMatchLineupsFragment = (EventPreMatchLineupsFragment) obj2;
                y56 y56Var = (y56) obj;
                u56 u56Var = (u56) eventPreMatchLineupsFragment.t.getValue();
                y56Var.getClass();
                u56Var.G(y56Var);
                ykc ykcVar = (ykc) eventPreMatchLineupsFragment.v.getValue();
                LineupsResponse lineupsResponse = y56Var.d;
                List<MissingPlayerData> missingPlayers = (lineupsResponse == null || (homeLineups$default = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null)) == null) ? null : homeLineups$default.getMissingPlayers();
                if (lineupsResponse != null && (awayLineups$default = LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null)) != null) {
                    list = awayLineups$default.getMissingPlayers();
                }
                ykc.j(ykcVar, missingPlayers, list, mr5.n(eventPreMatchLineupsFragment.C()));
                if (eventPreMatchLineupsFragment.u) {
                    eventPreMatchLineupsFragment.u = false;
                    krk krkVar = eventPreMatchLineupsFragment.l;
                    krkVar.getClass();
                    ((oo8) krkVar).d.scrollToPosition(0);
                }
                return Unit.a;
            case 5:
                FantasyComparisonPlayersDialogFragment fantasyComparisonPlayersDialogFragment = (FantasyComparisonPlayersDialogFragment) obj2;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel.getClass();
                ((yc7) fantasyComparisonPlayersDialogFragment.C.getValue()).n(new jc7((nc7) fantasyComparisonPlayersDialogFragment.A.getValue(), fantasyRoundPlayerUiModel));
                return Unit.a;
            case 6:
                FantasyCompetitionActivity fantasyCompetitionActivity = (FantasyCompetitionActivity) obj2;
                ip6 ip6Var = (ip6) obj;
                int i9 = FantasyCompetitionActivity.R;
                ip6Var.getClass();
                ViewPager2 viewPager2 = fantasyCompetitionActivity.Q().i;
                jp6 jp6Var = fantasyCompetitionActivity.O;
                if (jp6Var != null) {
                    return Boolean.valueOf(q5a.K(viewPager2, jp6Var.D(ip6Var)));
                }
                Intrinsics.i("viewPagerAdapter");
                throw null;
            case 7:
                FantasyCompetitionChatFragment fantasyCompetitionChatFragment = (FantasyCompetitionChatFragment) obj2;
                Message message = (Message) obj;
                message.getClass();
                ChatUser user = message.getUser();
                fantasyCompetitionChatFragment.O(user != null ? user.getName() : null, message.getText(), message.getImage(), message.getId());
                return Unit.a;
            case 8:
                nr6 nr6Var = (nr6) obj2;
                dp6 dp6Var = (dp6) obj;
                dp6Var.getClass();
                if (Intrinsics.c(dp6Var, dp6.a)) {
                    nr6Var.m();
                    return Unit.a;
                }
                zzl.b();
                return null;
            case 9:
                FantasyCreateLeagueBottomSheet fantasyCreateLeagueBottomSheet = (FantasyCreateLeagueBottomSheet) obj2;
                kv6 kv6Var = (kv6) obj;
                kv6Var.getClass();
                fantasyCreateLeagueBottomSheet.j();
                Context requireContext2 = fantasyCreateLeagueBottomSheet.requireContext();
                requireContext2.getClass();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                firebaseBundle.putString("location", "competition");
                nv.N(requireContext2, firebaseBundle, "fantasy_create_league");
                ((is6) fantasyCreateLeagueBottomSheet.C.getValue()).k(kv6Var.a, true);
                return Unit.a;
            case 10:
                FantasyEditLeagueBottomSheet fantasyEditLeagueBottomSheet = (FantasyEditLeagueBottomSheet) obj2;
                bw6 bw6Var = (bw6) obj;
                bw6Var.getClass();
                j67 j67Var = bw6Var.a;
                otk otkVar = fantasyEditLeagueBottomSheet.C;
                fdi fdiVar = ((j37) otkVar.getValue()).j;
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, j67Var));
                j37 j37Var = (j37) otkVar.getValue();
                umh umhVar = umh.e;
                xw3.L(un0.z(j37Var), null, null, new i37(j37Var, null, 1), 3);
                FragmentActivity requireActivity = fantasyEditLeagueBottomSheet.requireActivity();
                Intent intent = new Intent();
                intent.putExtra("FANTASY_LEAGUE_EXTRA", j67Var);
                Unit unit = Unit.a;
                requireActivity.setResult(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, intent);
                fantasyEditLeagueBottomSheet.j();
                return Unit.a;
            case 11:
                Double d = (Double) obj2;
                SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) obj;
                sofascoreRatingView.getClass();
                sofascoreRatingView.setRatingWithoutAnimation(d != null ? d.doubleValue() : 0.0d);
                return Unit.a;
            case 12:
                FantasyJoinLeagueBottomSheet fantasyJoinLeagueBottomSheet = (FantasyJoinLeagueBottomSheet) obj2;
                i47 i47Var = (i47) obj;
                i47Var.getClass();
                fantasyJoinLeagueBottomSheet.j();
                Context requireContext3 = fantasyJoinLeagueBottomSheet.requireContext();
                requireContext3.getClass();
                FirebaseBundle firebaseBundle2 = new FirebaseBundle();
                firebaseBundle2.putString("location", "competition");
                nv.N(requireContext3, firebaseBundle2, "fantasy_join_league");
                ((is6) fantasyJoinLeagueBottomSheet.C.getValue()).k(i47Var.a, false);
                return Unit.a;
            case 13:
                FantasyLeagueChatFragment fantasyLeagueChatFragment = (FantasyLeagueChatFragment) obj2;
                Message message2 = (Message) obj;
                message2.getClass();
                ChatUser user2 = message2.getUser();
                fantasyLeagueChatFragment.O(user2 != null ? user2.getName() : null, message2.getText(), message2.getImage(), message2.getId());
                return Unit.a;
            case 14:
                mj7 mj7Var = (mj7) obj2;
                z47 z47Var = (z47) obj;
                z47Var.getClass();
                return z47.a(z47Var, mj7Var, null, null, true, 13);
            case 15:
                j37 j37Var2 = (j37) obj2;
                z57 z57Var = (z57) obj;
                z57Var.getClass();
                if (!z57Var.equals(z57.a)) {
                    zzl.b();
                    return null;
                }
                j67 j67Var2 = (j67) j37Var2.k.a.getValue();
                int i10 = j67Var2.f - 1;
                int i11 = i10 < 0 ? 0 : i10;
                int i12 = j67Var2.a;
                String str = j67Var2.b;
                String str2 = j67Var2.c;
                String str3 = j67Var2.d;
                int i13 = j67Var2.e;
                String str4 = j67Var2.g;
                Long l = j67Var2.h;
                String str5 = j67Var2.i;
                FantasyLeagueType fantasyLeagueType = j67Var2.j;
                FantasyLeagueGameType fantasyLeagueGameType = j67Var2.k;
                str.getClass();
                fantasyLeagueGameType.getClass();
                j67 j67Var3 = new j67(i12, str, str2, str3, i13, i11, str4, l, str5, fantasyLeagueType, fantasyLeagueGameType);
                fdi fdiVar2 = j37Var2.j;
                do {
                    value2 = fdiVar2.getValue();
                } while (!fdiVar2.k(value2, j67Var3));
                return Unit.a;
            case 16:
                String str6 = (String) obj;
                int i14 = FantasyManagerProfileActivity.N;
                str6.getClass();
                ((AppCompatTextView) ((FantasyManagerProfileActivity) obj2).Q().d.d).setText(str6);
                return Unit.a;
            case 17:
                mp6 mp6Var = (mp6) obj;
                mp6Var.getClass();
                return "competition_" + ((FantasyCompetitionType) obj2) + "_" + mp6Var.a;
            case 18:
                FantasyPlayerComparisonActivity fantasyPlayerComparisonActivity = (FantasyPlayerComparisonActivity) obj2;
                nc7 nc7Var = (nc7) obj;
                int i15 = FantasyPlayerComparisonActivity.L;
                nc7Var.getClass();
                otk otkVar2 = fantasyPlayerComparisonActivity.K;
                int i16 = ((yc7) otkVar2.getValue()).f;
                int i17 = ((yc7) otkVar2.getValue()).g;
                FantasyComparisonPlayersDialogFragment fantasyComparisonPlayersDialogFragment2 = new FantasyComparisonPlayersDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("INDEX_EXTRA", nc7Var);
                bundle.putInt("competitionId", i16);
                bundle.putInt("roundId", i17);
                fantasyComparisonPlayersDialogFragment2.setArguments(bundle);
                fantasyComparisonPlayersDialogFragment2.p(fantasyPlayerComparisonActivity.k(), "comparison_players_dialog");
                return Unit.a;
            case 19:
                FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = (FantasyPlayerFixtureUiModel) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                frameLayout.getClass();
                View childAt = frameLayout.getChildAt(0);
                SofascoreSmallRatingView sofascoreSmallRatingView = childAt instanceof SofascoreSmallRatingView ? (SofascoreSmallRatingView) childAt : null;
                if (sofascoreSmallRatingView != null) {
                    SofascoreSmallRatingView.k(sofascoreSmallRatingView, fantasyPlayerFixtureUiModel.l, 6);
                }
                return Unit.a;
            case 20:
                ae7 ae7Var = (ae7) obj2;
                FrameLayout frameLayout2 = (FrameLayout) obj;
                frameLayout2.getClass();
                View childAt2 = frameLayout2.getChildAt(0);
                SofascoreSmallRatingView sofascoreSmallRatingView2 = childAt2 instanceof SofascoreSmallRatingView ? (SofascoreSmallRatingView) childAt2 : null;
                if (sofascoreSmallRatingView2 != null) {
                    SofascoreSmallRatingView.l(sofascoreSmallRatingView2, ae7Var.b);
                }
                return Unit.a;
            case 21:
                Context context = (Context) obj;
                context.getClass();
                SofascoreRatingView sofascoreRatingView2 = new SofascoreRatingView(context, null, 6);
                sofascoreRatingView2.setAllowZeroRating(true);
                String str7 = ((uk7) obj2).b;
                sofascoreRatingView2.setShouldAnimate(!Intrinsics.c(str7, "0.0"));
                sofascoreRatingView2.setRating(str7);
                return sofascoreRatingView2;
            case 22:
                FantasySquadInfoDisplayModeBottomSheet fantasySquadInfoDisplayModeBottomSheet = (FantasySquadInfoDisplayModeBottomSheet) obj2;
                il8 il8Var = (il8) obj;
                il8Var.getClass();
                Context requireContext4 = fantasySquadInfoDisplayModeBottomSheet.requireContext();
                requireContext4.getClass();
                String lowerCase = il8Var.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                nv.A(requireContext4, "pitch_view", lowerCase);
                mk7 F = fantasySquadInfoDisplayModeBottomSheet.F();
                F.getClass();
                F.q(il8Var);
                fantasySquadInfoDisplayModeBottomSheet.j();
                return Unit.a;
            case 23:
                ll7 ll7Var = (ll7) obj2;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                gv9 gv9Var = ll7Var.e;
                esaVar.a(gv9Var.size(), new j87(15, new gl7(0), gv9Var), new xo(gv9Var, i4), new tc3(802480018, new aj(7, gv9Var, ll7Var), true));
                return Unit.a;
            case 24:
                FantasyTopPlayersBottomSheet fantasyTopPlayersBottomSheet = (FantasyTopPlayersBottomSheet) obj2;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                gv9 gv9Var2 = fantasyTopPlayersBottomSheet.G().k().b;
                esaVar2.a(gv9Var2.size(), new j87(16, new sc6(17), gv9Var2), new xo(gv9Var2, i3), new tc3(2039820996, new aj(i2, gv9Var2, fantasyTopPlayersBottomSheet), true));
                return Unit.a;
            case 25:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((c51) obj2).invoke(bool);
                return Unit.a;
            case 26:
                rm7 rm7Var = (rm7) obj2;
                esa esaVar3 = (esa) obj;
                esaVar3.getClass();
                if (rm7Var.c != null) {
                    esa.d(esaVar3, null, "transfers_overview", new tc3(1125128596, new s16(rm7Var, 20), true), 1);
                }
                esa.d(esaVar3, null, "transfers_title", ktm.c, 1);
                gv9 gv9Var3 = rm7Var.b;
                esaVar3.a(gv9Var3.size(), new j87(i5, new sc6(18), gv9Var3), new xo(gv9Var3, 11), new tc3(2039820996, new aj(i4, gv9Var3, rm7Var), true));
                return Unit.a;
            case 27:
                FantasyTransfersFragment fantasyTransfersFragment = (FantasyTransfersFragment) obj2;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel2.getClass();
                yy6 yy6Var = fantasyRoundPlayerUiModel2.c;
                yy6 yy6Var2 = yy6.TRANSFERRING_IN;
                if (yy6Var == yy6Var2 && ((vn7) fantasyTransfersFragment.D().o.a.getValue()).h) {
                    fantasyTransfersFragment.D().w(fantasyRoundPlayerUiModel2);
                } else if (ph0.v(new yy6[]{yy6.AVAILABLE, yy6.AVAILABLE_REMOVED}, yy6Var)) {
                    fantasyTransfersFragment.D().w(fantasyRoundPlayerUiModel2);
                } else if (ph0.v(new yy6[]{yy6.REMOVED, yy6Var2, null}, yy6Var)) {
                    kn7 kn7Var = new kn7(fantasyRoundPlayerUiModel2, fantasyTransfersFragment.D().f.a.a, fantasyTransfersFragment.D().f.a.j, fantasyTransfersFragment.D().x, fantasyTransfersFragment.D().f.g);
                    kn7Var.a.put("assetsRestricted", Boolean.valueOf(fantasyTransfersFragment.D().g.A));
                    v8a.D(fantasyTransfersFragment, kn7Var);
                }
                return Unit.a;
            case 28:
                vl7 vl7Var = (vl7) obj;
                vl7Var.getClass();
                ((ao7) obj2).A(vl7Var);
                return Unit.a;
            default:
                zkd zkdVar = (zkd) obj;
                int i18 = FeaturedOddsView.p;
                zkdVar.getClass();
                Function1 function1 = ((FeaturedOddsView) obj2).action;
                if (function1 != null) {
                    function1.invoke(zkdVar);
                }
                return Unit.a;
        }
    }
}
