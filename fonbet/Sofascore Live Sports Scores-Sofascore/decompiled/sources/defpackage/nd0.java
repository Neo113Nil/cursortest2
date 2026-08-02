package defpackage;

import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase_Impl;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.U3;
import com.ironsource.Y1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.localPersistence.database.AppDatabase_Impl;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nd0 extends o6g {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ k6g e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd0(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.e = workDatabase_Impl;
    }

    private final n6g h(glg glgVar) {
        glgVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        linkedHashMap.put("name", new psi(0, 1, "name", "TEXT", null, false));
        linkedHashMap.put("orderIndex", new psi(0, 1, "orderIndex", "INTEGER", "0", true));
        linkedHashMap.put("category_id", new psi(0, 1, "category_id", "INTEGER", null, true));
        linkedHashMap.put("category_name", new psi(0, 1, "category_name", "TEXT", null, true));
        linkedHashMap.put("category_flag", new psi(0, 1, "category_flag", "TEXT", null, true));
        linkedHashMap.put("category_sport_id", new psi(0, 1, "category_sport_id", "INTEGER", null, true));
        linkedHashMap.put("category_sport_slug", new psi(0, 1, "category_sport_slug", "TEXT", null, true));
        linkedHashMap.put("category_nameTranslation", new psi(0, 1, "category_nameTranslation", "TEXT", null, false));
        linkedHashMap.put("category_shortNameTranslation", new psi(0, 1, "category_shortNameTranslation", "TEXT", null, false));
        linkedHashMap.put("nameTranslation", new psi(0, 1, "nameTranslation", "TEXT", null, false));
        ssi ssiVar = new ssi("pinned_tournaments_table", linkedHashMap, w1l.m(linkedHashMap, "shortNameTranslation", new psi(0, 1, "shortNameTranslation", "TEXT", null, false)), new LinkedHashSet());
        ssi I = o6a.I(glgVar, "pinned_tournaments_table");
        if (!ssiVar.equals(I)) {
            return new n6g(0, w1l.h("pinned_tournaments_table(com.sofascore.model.mvvm.model.PinnedTournament).\n Expected:\n", ssiVar, "\n Found:\n", I), false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        linkedHashMap2.put("name", new psi(0, 1, "name", "TEXT", null, true));
        linkedHashMap2.put("userCount", new psi(0, 1, "userCount", "INTEGER", null, true));
        linkedHashMap2.put("team_id", new psi(0, 1, "team_id", "INTEGER", null, false));
        linkedHashMap2.put("team_name", new psi(0, 1, "team_name", "TEXT", null, false));
        linkedHashMap2.put("team_slug", new psi(0, 1, "team_slug", "TEXT", null, false));
        linkedHashMap2.put("team_userCount", new psi(0, 1, "team_userCount", "INTEGER", null, false));
        linkedHashMap2.put("team_type", new psi(0, 1, "team_type", "INTEGER", null, false));
        linkedHashMap2.put("team_nameCode", new psi(0, 1, "team_nameCode", "TEXT", null, false));
        linkedHashMap2.put("team_shortName", new psi(0, 1, "team_shortName", "TEXT", null, false));
        linkedHashMap2.put("team_gender", new psi(0, 1, "team_gender", "TEXT", null, false));
        linkedHashMap2.put("team_ranking", new psi(0, 1, "team_ranking", "INTEGER", null, false));
        linkedHashMap2.put("team_disabled", new psi(0, 1, "team_disabled", "INTEGER", null, false));
        linkedHashMap2.put("team_national", new psi(0, 1, "team_national", "INTEGER", "0", false));
        linkedHashMap2.put("team_sub_team_one_id", new psi(0, 1, "team_sub_team_one_id", "INTEGER", null, false));
        linkedHashMap2.put("team_sub_team_one_name", new psi(0, 1, "team_sub_team_one_name", "TEXT", null, false));
        linkedHashMap2.put("team_sub_team_one_nameTranslation", new psi(0, 1, "team_sub_team_one_nameTranslation", "TEXT", null, false));
        linkedHashMap2.put("team_sub_team_one_shortNameTranslation", new psi(0, 1, "team_sub_team_one_shortNameTranslation", "TEXT", null, false));
        linkedHashMap2.put("team_sub_team_two_id", new psi(0, 1, "team_sub_team_two_id", "INTEGER", null, false));
        linkedHashMap2.put("team_sub_team_two_name", new psi(0, 1, "team_sub_team_two_name", "TEXT", null, false));
        linkedHashMap2.put("team_sub_team_two_nameTranslation", new psi(0, 1, "team_sub_team_two_nameTranslation", "TEXT", null, false));
        linkedHashMap2.put("team_sub_team_two_shortNameTranslation", new psi(0, 1, "team_sub_team_two_shortNameTranslation", "TEXT", null, false));
        linkedHashMap2.put("team_sport_id", new psi(0, 1, "team_sport_id", "INTEGER", null, false));
        linkedHashMap2.put("team_sport_slug", new psi(0, 1, "team_sport_slug", "TEXT", null, false));
        linkedHashMap2.put("team_country_name", new psi(0, 1, "team_country_name", "TEXT", null, false));
        linkedHashMap2.put("team_country_alpha2", new psi(0, 1, "team_country_alpha2", "TEXT", null, false));
        linkedHashMap2.put("team_nameTranslation", new psi(0, 1, "team_nameTranslation", "TEXT", null, false));
        linkedHashMap2.put("team_shortNameTranslation", new psi(0, 1, "team_shortNameTranslation", "TEXT", null, false));
        linkedHashMap2.put("nameTranslation", new psi(0, 1, "nameTranslation", "TEXT", null, false));
        ssi ssiVar2 = new ssi("players", linkedHashMap2, w1l.m(linkedHashMap2, "shortNameTranslation", new psi(0, 1, "shortNameTranslation", "TEXT", null, false)), new LinkedHashSet());
        ssi I2 = o6a.I(glgVar, "players");
        if (!ssiVar2.equals(I2)) {
            return new n6g(0, w1l.h("players(com.sofascore.model.mvvm.model.Player).\n Expected:\n", ssiVar2, "\n Found:\n", I2), false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("description", new psi(0, 1, "description", "TEXT", null, true));
        linkedHashMap3.put("type", new psi(0, 1, "type", "TEXT", null, false));
        linkedHashMap3.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        linkedHashMap3.put("startDateTimestamp", new psi(0, 1, "startDateTimestamp", "INTEGER", null, false));
        linkedHashMap3.put("flag", new psi(0, 1, "flag", "TEXT", null, false));
        linkedHashMap3.put("lastUpdate", new psi(0, 1, "lastUpdate", "INTEGER", null, true));
        linkedHashMap3.put("isMuted", new psi(0, 1, "isMuted", "INTEGER", "0", true));
        linkedHashMap3.put("isHidden", new psi(0, 1, "isHidden", "INTEGER", "0", true));
        linkedHashMap3.put("status_code", new psi(0, 1, "status_code", "INTEGER", null, false));
        linkedHashMap3.put("status_description", new psi(0, 1, "status_description", "TEXT", null, false));
        linkedHashMap3.put("status_type", new psi(0, 1, "status_type", "TEXT", null, false));
        linkedHashMap3.put("winner_id", new psi(0, 1, "winner_id", "INTEGER", null, false));
        linkedHashMap3.put("winner_name", new psi(0, 1, "winner_name", "TEXT", null, false));
        linkedHashMap3.put("parent_event_id", new psi(0, 1, "parent_event_id", "INTEGER", null, false));
        linkedHashMap3.put("parent_event_description", new psi(0, 1, "parent_event_description", "TEXT", null, false));
        linkedHashMap3.put("parent_event_startTimestamp", new psi(0, 1, "parent_event_startTimestamp", "INTEGER", null, false));
        linkedHashMap3.put("parent_event_flag", new psi(0, 1, "parent_event_flag", "TEXT", null, false));
        linkedHashMap3.put("stage_season_description", new psi(0, 1, "stage_season_description", "TEXT", null, false));
        linkedHashMap3.put("stage_season_year", new psi(0, 1, "stage_season_year", "TEXT", null, false));
        linkedHashMap3.put("stage_season_id", new psi(0, 1, "stage_season_id", "INTEGER", null, false));
        linkedHashMap3.put("stage_season_unique_stage_id", new psi(0, 1, "stage_season_unique_stage_id", "INTEGER", null, false));
        linkedHashMap3.put("stage_season_unique_stage_name", new psi(0, 1, "stage_season_unique_stage_name", "TEXT", null, false));
        linkedHashMap3.put("stage_season_unique_stage_primaryColorHex", new psi(0, 1, "stage_season_unique_stage_primaryColorHex", "TEXT", null, false));
        linkedHashMap3.put("stage_season_unique_stage_secondaryColorHex", new psi(0, 1, "stage_season_unique_stage_secondaryColorHex", "TEXT", null, false));
        linkedHashMap3.put("stage_season_unique_stage_category_id", new psi(0, 1, "stage_season_unique_stage_category_id", "INTEGER", null, false));
        linkedHashMap3.put("stage_season_unique_stage_category_name", new psi(0, 1, "stage_season_unique_stage_category_name", "TEXT", null, false));
        linkedHashMap3.put("stage_season_unique_stage_category_flag", new psi(0, 1, "stage_season_unique_stage_category_flag", "TEXT", null, false));
        linkedHashMap3.put("stage_season_unique_stage_category_sport_id", new psi(0, 1, "stage_season_unique_stage_category_sport_id", "INTEGER", null, false));
        linkedHashMap3.put("stage_season_unique_stage_category_sport_slug", new psi(0, 1, "stage_season_unique_stage_category_sport_slug", "TEXT", null, false));
        linkedHashMap3.put("stage_season_unique_stage_category_nameTranslation", new psi(0, 1, "stage_season_unique_stage_category_nameTranslation", "TEXT", null, false));
        ssi ssiVar3 = new ssi("my_stage_table", linkedHashMap3, w1l.m(linkedHashMap3, "stage_season_unique_stage_category_shortNameTranslation", new psi(0, 1, "stage_season_unique_stage_category_shortNameTranslation", "TEXT", null, false)), new LinkedHashSet());
        ssi I3 = o6a.I(glgVar, "my_stage_table");
        if (!ssiVar3.equals(I3)) {
            return new n6g(0, w1l.h("my_stage_table(com.sofascore.model.mvvm.model.Stage).\n Expected:\n", ssiVar3, "\n Found:\n", I3), false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        linkedHashMap4.put("name", new psi(0, 1, "name", "TEXT", null, true));
        linkedHashMap4.put("slug", new psi(0, 1, "slug", "TEXT", null, true));
        linkedHashMap4.put("userCount", new psi(0, 1, "userCount", "INTEGER", null, true));
        linkedHashMap4.put("type", new psi(0, 1, "type", "INTEGER", null, true));
        linkedHashMap4.put("nameCode", new psi(0, 1, "nameCode", "TEXT", null, false));
        linkedHashMap4.put("shortName", new psi(0, 1, "shortName", "TEXT", null, false));
        linkedHashMap4.put(InneractiveMediationDefs.KEY_GENDER, new psi(0, 1, InneractiveMediationDefs.KEY_GENDER, "TEXT", null, false));
        linkedHashMap4.put("ranking", new psi(0, 1, "ranking", "INTEGER", null, false));
        linkedHashMap4.put(Y1.e, new psi(0, 1, Y1.e, "INTEGER", null, true));
        linkedHashMap4.put("national", new psi(0, 1, "national", "INTEGER", "0", true));
        linkedHashMap4.put("sub_team_one_id", new psi(0, 1, "sub_team_one_id", "INTEGER", null, false));
        linkedHashMap4.put("sub_team_one_name", new psi(0, 1, "sub_team_one_name", "TEXT", null, false));
        linkedHashMap4.put("sub_team_one_nameTranslation", new psi(0, 1, "sub_team_one_nameTranslation", "TEXT", null, false));
        linkedHashMap4.put("sub_team_one_shortNameTranslation", new psi(0, 1, "sub_team_one_shortNameTranslation", "TEXT", null, false));
        linkedHashMap4.put("sub_team_two_id", new psi(0, 1, "sub_team_two_id", "INTEGER", null, false));
        linkedHashMap4.put("sub_team_two_name", new psi(0, 1, "sub_team_two_name", "TEXT", null, false));
        linkedHashMap4.put("sub_team_two_nameTranslation", new psi(0, 1, "sub_team_two_nameTranslation", "TEXT", null, false));
        linkedHashMap4.put("sub_team_two_shortNameTranslation", new psi(0, 1, "sub_team_two_shortNameTranslation", "TEXT", null, false));
        linkedHashMap4.put("sport_id", new psi(0, 1, "sport_id", "INTEGER", null, false));
        linkedHashMap4.put("sport_slug", new psi(0, 1, "sport_slug", "TEXT", null, false));
        linkedHashMap4.put("country_name", new psi(0, 1, "country_name", "TEXT", null, false));
        linkedHashMap4.put("country_alpha2", new psi(0, 1, "country_alpha2", "TEXT", null, false));
        linkedHashMap4.put("nameTranslation", new psi(0, 1, "nameTranslation", "TEXT", null, false));
        ssi ssiVar4 = new ssi("teams", linkedHashMap4, w1l.m(linkedHashMap4, "shortNameTranslation", new psi(0, 1, "shortNameTranslation", "TEXT", null, false)), new LinkedHashSet());
        ssi I4 = o6a.I(glgVar, "teams");
        if (!ssiVar4.equals(I4)) {
            return new n6g(0, w1l.h("teams(com.sofascore.model.mvvm.model.Team).\n Expected:\n", ssiVar4, "\n Found:\n", I4), false);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        linkedHashMap5.put("name", new psi(0, 1, "name", "TEXT", null, true));
        linkedHashMap5.put("countryCode", new psi(2, 1, "countryCode", "TEXT", null, true));
        ssi ssiVar5 = new ssi("my_channels_table", linkedHashMap5, w1l.m(linkedHashMap5, "link", new psi(0, 1, "link", "TEXT", null, false)), new LinkedHashSet());
        ssi I5 = o6a.I(glgVar, "my_channels_table");
        if (!ssiVar5.equals(I5)) {
            return new n6g(0, w1l.h("my_channels_table(com.sofascore.model.mvvm.model.TvChannel).\n Expected:\n", ssiVar5, "\n Found:\n", I5), false);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        linkedHashMap6.put("name", new psi(0, 1, "name", "TEXT", null, true));
        linkedHashMap6.put("category_id", new psi(0, 1, "category_id", "INTEGER", null, true));
        linkedHashMap6.put("category_name", new psi(0, 1, "category_name", "TEXT", null, true));
        linkedHashMap6.put("category_flag", new psi(0, 1, "category_flag", "TEXT", null, true));
        linkedHashMap6.put("category_sport_id", new psi(0, 1, "category_sport_id", "INTEGER", null, true));
        linkedHashMap6.put("category_sport_slug", new psi(0, 1, "category_sport_slug", "TEXT", null, true));
        linkedHashMap6.put("category_nameTranslation", new psi(0, 1, "category_nameTranslation", "TEXT", null, false));
        linkedHashMap6.put("category_shortNameTranslation", new psi(0, 1, "category_shortNameTranslation", "TEXT", null, false));
        linkedHashMap6.put("unique_tournament_id", new psi(0, 1, "unique_tournament_id", "INTEGER", null, false));
        linkedHashMap6.put("unique_tournament_name", new psi(0, 1, "unique_tournament_name", "TEXT", null, false));
        linkedHashMap6.put("unique_tournament_userCount", new psi(0, 1, "unique_tournament_userCount", "INTEGER", null, false));
        linkedHashMap6.put("unique_tournament_hasEventPlayerStatistics", new psi(0, 1, "unique_tournament_hasEventPlayerStatistics", "INTEGER", null, false));
        linkedHashMap6.put("unique_tournament_hasBoxScore", new psi(0, 1, "unique_tournament_hasBoxScore", "INTEGER", null, false));
        linkedHashMap6.put("unique_tournament_displayInverseHomeAwayTeams", new psi(0, 1, "unique_tournament_displayInverseHomeAwayTeams", "INTEGER", null, false));
        linkedHashMap6.put("unique_tournament_groundType", new psi(0, 1, "unique_tournament_groundType", "TEXT", null, false));
        linkedHashMap6.put("unique_tournament_tennisPoints", new psi(0, 1, "unique_tournament_tennisPoints", "INTEGER", null, false));
        linkedHashMap6.put("unique_tournament_gender", new psi(0, 1, "unique_tournament_gender", "TEXT", null, false));
        linkedHashMap6.put("unique_tournament_category_id", new psi(0, 1, "unique_tournament_category_id", "INTEGER", null, false));
        linkedHashMap6.put("unique_tournament_category_name", new psi(0, 1, "unique_tournament_category_name", "TEXT", null, false));
        linkedHashMap6.put("unique_tournament_category_flag", new psi(0, 1, "unique_tournament_category_flag", "TEXT", null, false));
        linkedHashMap6.put("unique_tournament_category_sport_id", new psi(0, 1, "unique_tournament_category_sport_id", "INTEGER", null, false));
        linkedHashMap6.put("unique_tournament_category_sport_slug", new psi(0, 1, "unique_tournament_category_sport_slug", "TEXT", null, false));
        linkedHashMap6.put("unique_tournament_category_nameTranslation", new psi(0, 1, "unique_tournament_category_nameTranslation", "TEXT", null, false));
        linkedHashMap6.put("unique_tournament_category_shortNameTranslation", new psi(0, 1, "unique_tournament_category_shortNameTranslation", "TEXT", null, false));
        linkedHashMap6.put("unique_tournament_nameTranslation", new psi(0, 1, "unique_tournament_nameTranslation", "TEXT", null, false));
        linkedHashMap6.put("unique_tournament_shortNameTranslation", new psi(0, 1, "unique_tournament_shortNameTranslation", "TEXT", null, false));
        linkedHashMap6.put("nameTranslation", new psi(0, 1, "nameTranslation", "TEXT", null, false));
        ssi ssiVar6 = new ssi("tournament", linkedHashMap6, w1l.m(linkedHashMap6, "shortNameTranslation", new psi(0, 1, "shortNameTranslation", "TEXT", null, false)), new LinkedHashSet());
        ssi I6 = o6a.I(glgVar, "tournament");
        if (!ssiVar6.equals(I6)) {
            return new n6g(0, w1l.h("tournament(com.sofascore.model.mvvm.model.Tournament).\n Expected:\n", ssiVar6, "\n Found:\n", I6), false);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("eventId", new psi(1, 1, "eventId", "INTEGER", null, true));
        linkedHashMap7.put("channelId", new psi(2, 1, "channelId", "INTEGER", null, true));
        linkedHashMap7.put("isConfirmed", new psi(0, 1, "isConfirmed", "INTEGER", null, true));
        ssi ssiVar7 = new ssi("tv_channel_vote_table", linkedHashMap7, w1l.m(linkedHashMap7, "timestamp", new psi(0, 1, "timestamp", "INTEGER", null, true)), new LinkedHashSet());
        ssi I7 = o6a.I(glgVar, "tv_channel_vote_table");
        if (!ssiVar7.equals(I7)) {
            return new n6g(0, w1l.h("tv_channel_vote_table(com.sofascore.model.mvvm.model.TvChannelVote).\n Expected:\n", ssiVar7, "\n Found:\n", I7), false);
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        linkedHashMap8.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        linkedHashMap8.put("name", new psi(0, 1, "name", "TEXT", null, false));
        linkedHashMap8.put("userCount", new psi(0, 1, "userCount", "INTEGER", null, true));
        linkedHashMap8.put("hasEventPlayerStatistics", new psi(0, 1, "hasEventPlayerStatistics", "INTEGER", null, true));
        linkedHashMap8.put("hasBoxScore", new psi(0, 1, "hasBoxScore", "INTEGER", null, false));
        linkedHashMap8.put("displayInverseHomeAwayTeams", new psi(0, 1, "displayInverseHomeAwayTeams", "INTEGER", null, true));
        linkedHashMap8.put("groundType", new psi(0, 1, "groundType", "TEXT", null, false));
        linkedHashMap8.put("tennisPoints", new psi(0, 1, "tennisPoints", "INTEGER", null, false));
        linkedHashMap8.put(InneractiveMediationDefs.KEY_GENDER, new psi(0, 1, InneractiveMediationDefs.KEY_GENDER, "TEXT", null, false));
        linkedHashMap8.put("category_id", new psi(0, 1, "category_id", "INTEGER", null, true));
        linkedHashMap8.put("category_name", new psi(0, 1, "category_name", "TEXT", null, true));
        linkedHashMap8.put("category_flag", new psi(0, 1, "category_flag", "TEXT", null, true));
        linkedHashMap8.put("category_sport_id", new psi(0, 1, "category_sport_id", "INTEGER", null, true));
        linkedHashMap8.put("category_sport_slug", new psi(0, 1, "category_sport_slug", "TEXT", null, true));
        linkedHashMap8.put("category_nameTranslation", new psi(0, 1, "category_nameTranslation", "TEXT", null, false));
        linkedHashMap8.put("category_shortNameTranslation", new psi(0, 1, "category_shortNameTranslation", "TEXT", null, false));
        linkedHashMap8.put("nameTranslation", new psi(0, 1, "nameTranslation", "TEXT", null, false));
        ssi ssiVar8 = new ssi("leagues", linkedHashMap8, w1l.m(linkedHashMap8, "shortNameTranslation", new psi(0, 1, "shortNameTranslation", "TEXT", null, false)), new LinkedHashSet());
        ssi I8 = o6a.I(glgVar, "leagues");
        if (!ssiVar8.equals(I8)) {
            return new n6g(0, w1l.h("leagues(com.sofascore.model.mvvm.model.UniqueTournament).\n Expected:\n", ssiVar8, "\n Found:\n", I8), false);
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        linkedHashMap9.put("playerId", new psi(1, 1, "playerId", "INTEGER", null, true));
        linkedHashMap9.put("playerValue", new psi(0, 1, "playerValue", "INTEGER", null, true));
        linkedHashMap9.put(InAppPurchaseMetaData.KEY_CURRENCY, new psi(0, 1, InAppPurchaseMetaData.KEY_CURRENCY, "TEXT", null, true));
        ssi ssiVar9 = new ssi("market_value_user_votes_table", linkedHashMap9, w1l.m(linkedHashMap9, "voteType", new psi(0, 1, "voteType", "TEXT", null, true)), new LinkedHashSet());
        ssi I9 = o6a.I(glgVar, "market_value_user_votes_table");
        if (!ssiVar9.equals(I9)) {
            return new n6g(0, w1l.h("market_value_user_votes_table(com.sofascore.model.util.MarketValueUserVote).\n Expected:\n", ssiVar9, "\n Found:\n", I9), false);
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        linkedHashMap10.put("teamId", new psi(1, 1, "teamId", "INTEGER", null, true));
        ssi ssiVar10 = new ssi("my_teams", linkedHashMap10, w1l.m(linkedHashMap10, "notificationsEnabled", new psi(0, 1, "notificationsEnabled", "INTEGER", "1", true)), new LinkedHashSet());
        ssi I10 = o6a.I(glgVar, "my_teams");
        if (!ssiVar10.equals(I10)) {
            return new n6g(0, w1l.h("my_teams(com.sofascore.model.mvvm.model.DbMyTeam).\n Expected:\n", ssiVar10, "\n Found:\n", I10), false);
        }
        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
        linkedHashMap11.put("winnerCode", new psi(0, 1, "winnerCode", "INTEGER", null, false));
        linkedHashMap11.put("aggregatedWinnerCode", new psi(0, 1, "aggregatedWinnerCode", "INTEGER", null, false));
        linkedHashMap11.put("homeTeamId", new psi(0, 1, "homeTeamId", "INTEGER", null, true));
        linkedHashMap11.put("homeSubTeam1Id", new psi(0, 1, "homeSubTeam1Id", "INTEGER", null, false));
        linkedHashMap11.put("homeSubTeam2Id", new psi(0, 1, "homeSubTeam2Id", "INTEGER", null, false));
        linkedHashMap11.put("awayTeamId", new psi(0, 1, "awayTeamId", "INTEGER", null, true));
        linkedHashMap11.put("awaySubTeam1Id", new psi(0, 1, "awaySubTeam1Id", "INTEGER", null, false));
        linkedHashMap11.put("awaySubTeam2Id", new psi(0, 1, "awaySubTeam2Id", "INTEGER", null, false));
        linkedHashMap11.put("hasEventPlayerHeatMap", new psi(0, 1, "hasEventPlayerHeatMap", "INTEGER", null, true));
        linkedHashMap11.put("startTimestamp", new psi(0, 1, "startTimestamp", "INTEGER", null, true));
        linkedHashMap11.put("endTimestamp", new psi(0, 1, "endTimestamp", "INTEGER", null, false));
        linkedHashMap11.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        linkedHashMap11.put("tournamentId", new psi(0, 1, "tournamentId", "INTEGER", null, true));
        linkedHashMap11.put("uniqueTournamentId", new psi(0, 1, "uniqueTournamentId", "INTEGER", null, false));
        linkedHashMap11.put("previousLegEventId", new psi(0, 1, "previousLegEventId", "INTEGER", null, false));
        linkedHashMap11.put("lastPeriod", new psi(0, 1, "lastPeriod", "TEXT", null, false));
        linkedHashMap11.put("homeRedCards", new psi(0, 1, "homeRedCards", "INTEGER", null, false));
        linkedHashMap11.put("awayRedCards", new psi(0, 1, "awayRedCards", "INTEGER", null, false));
        linkedHashMap11.put("currentBattingTeamId", new psi(0, 1, "currentBattingTeamId", "INTEGER", null, false));
        linkedHashMap11.put("firstToServe", new psi(0, 1, "firstToServe", "INTEGER", null, false));
        linkedHashMap11.put("bestOfSets", new psi(0, 1, "bestOfSets", "INTEGER", null, false));
        linkedHashMap11.put("bestOfLegs", new psi(0, 1, "bestOfLegs", "INTEGER", null, false));
        linkedHashMap11.put("finalRound", new psi(0, 1, "finalRound", "INTEGER", null, false));
        linkedHashMap11.put("winType", new psi(0, 1, "winType", "TEXT", null, false));
        linkedHashMap11.put("crowdsourcingDataDisplayEnabled", new psi(0, 1, "crowdsourcingDataDisplayEnabled", "INTEGER", null, false));
        linkedHashMap11.put("crowdsourcingEnabled", new psi(0, 1, "crowdsourcingEnabled", "INTEGER", null, false));
        linkedHashMap11.put("finalResultOnly", new psi(0, 1, "finalResultOnly", "INTEGER", null, false));
        linkedHashMap11.put("streamContentId", new psi(0, 1, "streamContentId", "INTEGER", "NULL", false));
        linkedHashMap11.put("streamContentGeoRestrictions", new psi(0, 1, "streamContentGeoRestrictions", "TEXT", "NULL", false));
        linkedHashMap11.put("eventFilters", new psi(0, 1, "eventFilters", "TEXT", null, false));
        linkedHashMap11.put("homeTeamSeed", new psi(0, 1, "homeTeamSeed", "TEXT", "NULL", false));
        linkedHashMap11.put("awayTeamSeed", new psi(0, 1, "awayTeamSeed", "TEXT", "NULL", false));
        linkedHashMap11.put("hide", new psi(0, 1, "hide", "INTEGER", null, true));
        linkedHashMap11.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, new psi(0, 1, CampaignEx.JSON_NATIVE_VIDEO_MUTE, "INTEGER", null, true));
        linkedHashMap11.put("lastUpdate", new psi(0, 1, "lastUpdate", "INTEGER", null, true));
        linkedHashMap11.put("season_id", new psi(0, 1, "season_id", "INTEGER", null, false));
        linkedHashMap11.put("status_code", new psi(0, 1, "status_code", "INTEGER", null, true));
        linkedHashMap11.put("status_description", new psi(0, 1, "status_description", "TEXT", null, false));
        linkedHashMap11.put("status_type", new psi(0, 1, "status_type", "TEXT", null, true));
        linkedHashMap11.put("time_played", new psi(0, 1, "time_played", "INTEGER", null, false));
        linkedHashMap11.put("time_periodLength", new psi(0, 1, "time_periodLength", "INTEGER", null, false));
        linkedHashMap11.put("time_overtimeLength", new psi(0, 1, "time_overtimeLength", "INTEGER", null, false));
        linkedHashMap11.put("time_totalPeriodCount", new psi(0, 1, "time_totalPeriodCount", "INTEGER", null, false));
        linkedHashMap11.put("time_initial", new psi(0, 1, "time_initial", "INTEGER", null, false));
        linkedHashMap11.put("time_max", new psi(0, 1, "time_max", "INTEGER", null, false));
        linkedHashMap11.put("time_currentPeriodStartTimestamp", new psi(0, 1, "time_currentPeriodStartTimestamp", "INTEGER", null, false));
        linkedHashMap11.put("time_extra", new psi(0, 1, "time_extra", "INTEGER", null, false));
        linkedHashMap11.put("changes_changes", new psi(0, 1, "changes_changes", "TEXT", null, false));
        linkedHashMap11.put("changes_changeTimestamp", new psi(0, 1, "changes_changeTimestamp", "INTEGER", null, false));
        linkedHashMap11.put("am_football_currentYardsToFirstDown", new psi(0, 1, "am_football_currentYardsToFirstDown", "INTEGER", null, false));
        linkedHashMap11.put("am_football_currentDown", new psi(0, 1, "am_football_currentDown", "INTEGER", null, false));
        linkedHashMap11.put("am_football_currentYardline", new psi(0, 1, "am_football_currentYardline", "INTEGER", null, false));
        linkedHashMap11.put("am_football_isGoalPossession", new psi(0, 1, "am_football_isGoalPossession", "INTEGER", null, false));
        linkedHashMap11.put("am_football_currentPossession", new psi(0, 1, "am_football_currentPossession", "INTEGER", null, false));
        linkedHashMap11.put("am_football_currentTeamHalf", new psi(0, 1, "am_football_currentTeamHalf", "INTEGER", null, false));
        linkedHashMap11.put("var_homeTeam", new psi(0, 1, "var_homeTeam", "INTEGER", null, false));
        ssi ssiVar11 = new ssi("events_table", linkedHashMap11, w1l.m(linkedHashMap11, "var_awayTeam", new psi(0, 1, "var_awayTeam", "INTEGER", null, false)), new LinkedHashSet());
        ssi I11 = o6a.I(glgVar, "events_table");
        if (!ssiVar11.equals(I11)) {
            return new n6g(0, w1l.h("events_table(com.sofascore.model.database.DbEvent).\n Expected:\n", ssiVar11, "\n Found:\n", I11), false);
        }
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        linkedHashMap12.put("eventId", new psi(1, 1, "eventId", "INTEGER", null, true));
        linkedHashMap12.put("home_score_display", new psi(0, 1, "home_score_display", "INTEGER", null, false));
        linkedHashMap12.put("home_score_period1", new psi(0, 1, "home_score_period1", "INTEGER", null, false));
        linkedHashMap12.put("home_score_period2", new psi(0, 1, "home_score_period2", "INTEGER", null, false));
        linkedHashMap12.put("home_score_period3", new psi(0, 1, "home_score_period3", "INTEGER", null, false));
        linkedHashMap12.put("home_score_period4", new psi(0, 1, "home_score_period4", "INTEGER", null, false));
        linkedHashMap12.put("home_score_period5", new psi(0, 1, "home_score_period5", "INTEGER", null, false));
        linkedHashMap12.put("home_score_period6", new psi(0, 1, "home_score_period6", "INTEGER", null, false));
        linkedHashMap12.put("home_score_period7", new psi(0, 1, "home_score_period7", "INTEGER", null, false));
        linkedHashMap12.put("home_score_period8", new psi(0, 1, "home_score_period8", "INTEGER", null, false));
        linkedHashMap12.put("home_score_period9", new psi(0, 1, "home_score_period9", "INTEGER", null, false));
        linkedHashMap12.put("home_score_period10", new psi(0, 1, "home_score_period10", "INTEGER", null, false));
        linkedHashMap12.put("home_score_period11", new psi(0, 1, "home_score_period11", "INTEGER", null, false));
        linkedHashMap12.put("home_score_period12", new psi(0, 1, "home_score_period12", "INTEGER", null, false));
        linkedHashMap12.put("home_score_period13", new psi(0, 1, "home_score_period13", "INTEGER", null, false));
        linkedHashMap12.put("home_score_period1TieBreak", new psi(0, 1, "home_score_period1TieBreak", "INTEGER", null, false));
        linkedHashMap12.put("home_score_period2TieBreak", new psi(0, 1, "home_score_period2TieBreak", "INTEGER", null, false));
        linkedHashMap12.put("home_score_period3TieBreak", new psi(0, 1, "home_score_period3TieBreak", "INTEGER", null, false));
        linkedHashMap12.put("home_score_period4TieBreak", new psi(0, 1, "home_score_period4TieBreak", "INTEGER", null, false));
        linkedHashMap12.put("home_score_period5TieBreak", new psi(0, 1, "home_score_period5TieBreak", "INTEGER", null, false));
        linkedHashMap12.put("home_score_point", new psi(0, 1, "home_score_point", "TEXT", null, false));
        linkedHashMap12.put("home_score_overtime", new psi(0, 1, "home_score_overtime", "INTEGER", null, false));
        linkedHashMap12.put("home_score_penalties", new psi(0, 1, "home_score_penalties", "INTEGER", null, false));
        linkedHashMap12.put("home_score_aggregated", new psi(0, 1, "home_score_aggregated", "INTEGER", null, false));
        linkedHashMap12.put("home_score_series", new psi(0, 1, "home_score_series", "INTEGER", null, false));
        linkedHashMap12.put("home_score_currentCricketDisplay", new psi(0, 1, "home_score_currentCricketDisplay", "TEXT", null, false));
        linkedHashMap12.put("away_score_display", new psi(0, 1, "away_score_display", "INTEGER", null, false));
        linkedHashMap12.put("away_score_period1", new psi(0, 1, "away_score_period1", "INTEGER", null, false));
        linkedHashMap12.put("away_score_period2", new psi(0, 1, "away_score_period2", "INTEGER", null, false));
        linkedHashMap12.put("away_score_period3", new psi(0, 1, "away_score_period3", "INTEGER", null, false));
        linkedHashMap12.put("away_score_period4", new psi(0, 1, "away_score_period4", "INTEGER", null, false));
        linkedHashMap12.put("away_score_period5", new psi(0, 1, "away_score_period5", "INTEGER", null, false));
        linkedHashMap12.put("away_score_period6", new psi(0, 1, "away_score_period6", "INTEGER", null, false));
        linkedHashMap12.put("away_score_period7", new psi(0, 1, "away_score_period7", "INTEGER", null, false));
        linkedHashMap12.put("away_score_period8", new psi(0, 1, "away_score_period8", "INTEGER", null, false));
        linkedHashMap12.put("away_score_period9", new psi(0, 1, "away_score_period9", "INTEGER", null, false));
        linkedHashMap12.put("away_score_period10", new psi(0, 1, "away_score_period10", "INTEGER", null, false));
        linkedHashMap12.put("away_score_period11", new psi(0, 1, "away_score_period11", "INTEGER", null, false));
        linkedHashMap12.put("away_score_period12", new psi(0, 1, "away_score_period12", "INTEGER", null, false));
        linkedHashMap12.put("away_score_period13", new psi(0, 1, "away_score_period13", "INTEGER", null, false));
        linkedHashMap12.put("away_score_period1TieBreak", new psi(0, 1, "away_score_period1TieBreak", "INTEGER", null, false));
        linkedHashMap12.put("away_score_period2TieBreak", new psi(0, 1, "away_score_period2TieBreak", "INTEGER", null, false));
        linkedHashMap12.put("away_score_period3TieBreak", new psi(0, 1, "away_score_period3TieBreak", "INTEGER", null, false));
        linkedHashMap12.put("away_score_period4TieBreak", new psi(0, 1, "away_score_period4TieBreak", "INTEGER", null, false));
        linkedHashMap12.put("away_score_period5TieBreak", new psi(0, 1, "away_score_period5TieBreak", "INTEGER", null, false));
        linkedHashMap12.put("away_score_point", new psi(0, 1, "away_score_point", "TEXT", null, false));
        linkedHashMap12.put("away_score_overtime", new psi(0, 1, "away_score_overtime", "INTEGER", null, false));
        linkedHashMap12.put("away_score_penalties", new psi(0, 1, "away_score_penalties", "INTEGER", null, false));
        linkedHashMap12.put("away_score_aggregated", new psi(0, 1, "away_score_aggregated", "INTEGER", null, false));
        linkedHashMap12.put("away_score_series", new psi(0, 1, "away_score_series", "INTEGER", null, false));
        LinkedHashSet m = w1l.m(linkedHashMap12, "away_score_currentCricketDisplay", new psi(0, 1, "away_score_currentCricketDisplay", "TEXT", null, false));
        m.add(new qsi("events_table", "CASCADE", "NO ACTION", a.c("eventId"), a.c("id")));
        ssi ssiVar12 = new ssi("events_score", linkedHashMap12, m, new LinkedHashSet());
        ssi I12 = o6a.I(glgVar, "events_score");
        if (!ssiVar12.equals(I12)) {
            return new n6g(0, w1l.h("events_score(com.sofascore.model.database.DbEventScore).\n Expected:\n", ssiVar12, "\n Found:\n", I12), false);
        }
        LinkedHashMap linkedHashMap13 = new LinkedHashMap();
        linkedHashMap13.put("sportName", new psi(1, 1, "sportName", "TEXT", null, true));
        linkedHashMap13.put("sportOrder", new psi(0, 1, "sportOrder", "INTEGER", null, true));
        ssi ssiVar13 = new ssi("sport_order", linkedHashMap13, w1l.m(linkedHashMap13, "isSelected", new psi(0, 1, "isSelected", "INTEGER", "0", true)), new LinkedHashSet());
        ssi I13 = o6a.I(glgVar, "sport_order");
        if (!ssiVar13.equals(I13)) {
            return new n6g(0, w1l.h("sport_order(com.sofascore.model.database.DbSportOrder).\n Expected:\n", ssiVar13, "\n Found:\n", I13), false);
        }
        LinkedHashMap linkedHashMap14 = new LinkedHashMap();
        linkedHashMap14.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        linkedHashMap14.put("notificationId", new psi(0, 1, "notificationId", "INTEGER", null, true));
        linkedHashMap14.put("title", new psi(0, 1, "title", "TEXT", null, true));
        linkedHashMap14.put(PglCryptUtils.KEY_MESSAGE, new psi(0, 1, PglCryptUtils.KEY_MESSAGE, "TEXT", null, true));
        ssi ssiVar14 = new ssi("pending_notifications", linkedHashMap14, w1l.m(linkedHashMap14, "updatableNotificationId", new psi(0, 1, "updatableNotificationId", "TEXT", null, false)), new LinkedHashSet());
        ssi I14 = o6a.I(glgVar, "pending_notifications");
        if (!ssiVar14.equals(I14)) {
            return new n6g(0, w1l.h("pending_notifications(com.sofascore.model.database.DbPendingNotification).\n Expected:\n", ssiVar14, "\n Found:\n", I14), false);
        }
        LinkedHashMap linkedHashMap15 = new LinkedHashMap();
        linkedHashMap15.put("sportName", new psi(1, 1, "sportName", "TEXT", null, true));
        linkedHashMap15.put("categoryId", new psi(2, 1, "categoryId", "INTEGER", null, true));
        ssi ssiVar15 = new ssi("popular_categories", linkedHashMap15, w1l.m(linkedHashMap15, "orderIndex", new psi(0, 1, "orderIndex", "INTEGER", null, true)), new LinkedHashSet());
        ssi I15 = o6a.I(glgVar, "popular_categories");
        if (!ssiVar15.equals(I15)) {
            return new n6g(0, w1l.h("popular_categories(com.sofascore.model.database.DbPopularCategories).\n Expected:\n", ssiVar15, "\n Found:\n", I15), false);
        }
        LinkedHashMap linkedHashMap16 = new LinkedHashMap();
        linkedHashMap16.put("eventId", new psi(1, 1, "eventId", "INTEGER", null, true));
        linkedHashMap16.put("messageTimestamp", new psi(2, 1, "messageTimestamp", "INTEGER", null, true));
        linkedHashMap16.put("voteTimestamp", new psi(0, 1, "voteTimestamp", "INTEGER", null, true));
        ssi ssiVar16 = new ssi("chat_message_table", linkedHashMap16, w1l.m(linkedHashMap16, "reportTimestamp", new psi(0, 1, "reportTimestamp", "INTEGER", null, true)), new LinkedHashSet());
        ssi I16 = o6a.I(glgVar, "chat_message_table");
        if (!ssiVar16.equals(I16)) {
            return new n6g(0, w1l.h("chat_message_table(com.sofascore.model.chat.DbChatMessage).\n Expected:\n", ssiVar16, "\n Found:\n", I16), false);
        }
        LinkedHashMap linkedHashMap17 = new LinkedHashMap();
        linkedHashMap17.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        linkedHashMap17.put("entity", new psi(2, 1, "entity", "TEXT", null, true));
        linkedHashMap17.put("json", new psi(0, 1, "json", "TEXT", null, true));
        ssi ssiVar17 = new ssi("saved_searches_table", linkedHashMap17, w1l.m(linkedHashMap17, "timestamp", new psi(0, 1, "timestamp", "INTEGER", null, true)), new LinkedHashSet());
        ssi I17 = o6a.I(glgVar, "saved_searches_table");
        if (!ssiVar17.equals(I17)) {
            return new n6g(0, w1l.h("saved_searches_table(com.sofascore.model.database.DbSavedSearches).\n Expected:\n", ssiVar17, "\n Found:\n", I17), false);
        }
        LinkedHashMap linkedHashMap18 = new LinkedHashMap();
        linkedHashMap18.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        ssi ssiVar18 = new ssi("video_table", linkedHashMap18, w1l.m(linkedHashMap18, "timestamp", new psi(0, 1, "timestamp", "INTEGER", null, true)), new LinkedHashSet());
        ssi I18 = o6a.I(glgVar, "video_table");
        if (!ssiVar18.equals(I18)) {
            return new n6g(0, w1l.h("video_table(com.sofascore.model.database.DbWatchedVideo).\n Expected:\n", ssiVar18, "\n Found:\n", I18), false);
        }
        LinkedHashMap linkedHashMap19 = new LinkedHashMap();
        linkedHashMap19.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        ssi ssiVar19 = new ssi("news_table", linkedHashMap19, w1l.m(linkedHashMap19, "timestamp", new psi(0, 1, "timestamp", "INTEGER", null, true)), new LinkedHashSet());
        ssi I19 = o6a.I(glgVar, "news_table");
        if (!ssiVar19.equals(I19)) {
            return new n6g(0, w1l.h("news_table(com.sofascore.model.database.DbSeenNews).\n Expected:\n", ssiVar19, "\n Found:\n", I19), false);
        }
        LinkedHashMap linkedHashMap20 = new LinkedHashMap();
        linkedHashMap20.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        linkedHashMap20.put("userChoice", new psi(0, 1, "userChoice", "TEXT", null, true));
        linkedHashMap20.put("eventTimestamp", new psi(0, 1, "eventTimestamp", "INTEGER", null, true));
        linkedHashMap20.put("success", new psi(0, 1, "success", "INTEGER", null, true));
        ssi ssiVar20 = new ssi("vote_table", linkedHashMap20, w1l.m(linkedHashMap20, "voteType", new psi(2, 1, "voteType", "TEXT", "'Full time'", true)), new LinkedHashSet());
        ssi I20 = o6a.I(glgVar, "vote_table");
        if (!ssiVar20.equals(I20)) {
            return new n6g(0, w1l.h("vote_table(com.sofascore.model.database.DbVote).\n Expected:\n", ssiVar20, "\n Found:\n", I20), false);
        }
        LinkedHashMap linkedHashMap21 = new LinkedHashMap();
        linkedHashMap21.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        linkedHashMap21.put("eventId", new psi(0, 1, "eventId", "INTEGER", null, true));
        linkedHashMap21.put("eventTimestamp", new psi(0, 1, "eventTimestamp", "INTEGER", null, true));
        linkedHashMap21.put("isHomeTeamIncident", new psi(0, 1, "isHomeTeamIncident", "INTEGER", null, true));
        linkedHashMap21.put("homeScoreSuggest", new psi(0, 1, "homeScoreSuggest", "INTEGER", null, true));
        linkedHashMap21.put("awayScoreSuggest", new psi(0, 1, "awayScoreSuggest", "INTEGER", null, true));
        linkedHashMap21.put("scoreType", new psi(0, 1, "scoreType", "TEXT", null, false));
        linkedHashMap21.put("eventStatusType", new psi(0, 1, "eventStatusType", "TEXT", null, false));
        linkedHashMap21.put("scorerId", new psi(0, 1, "scorerId", "INTEGER", null, false));
        linkedHashMap21.put("assistId", new psi(0, 1, "assistId", "INTEGER", null, false));
        ssi ssiVar21 = new ssi("crowdscourcing_scorer_table", linkedHashMap21, w1l.m(linkedHashMap21, "group", new psi(0, 1, "group", "INTEGER", null, true)), new LinkedHashSet());
        ssi I21 = o6a.I(glgVar, "crowdscourcing_scorer_table");
        if (!ssiVar21.equals(I21)) {
            return new n6g(0, w1l.h("crowdscourcing_scorer_table(com.sofascore.model.database.DbCrowdsourcingIncident).\n Expected:\n", ssiVar21, "\n Found:\n", I21), false);
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
        linkedHashMap22.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        ssi ssiVar22 = new ssi("buzzer_table", linkedHashMap22, w1l.m(linkedHashMap22, "timestamp", new psi(0, 1, "timestamp", "INTEGER", null, true)), new LinkedHashSet());
        ssi I22 = o6a.I(glgVar, "buzzer_table");
        if (!ssiVar22.equals(I22)) {
            return new n6g(0, w1l.h("buzzer_table(com.sofascore.model.database.DbDismissedBuzzerTile).\n Expected:\n", ssiVar22, "\n Found:\n", I22), false);
        }
        LinkedHashMap linkedHashMap23 = new LinkedHashMap();
        linkedHashMap23.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        linkedHashMap23.put("viewCount", new psi(0, 1, "viewCount", "INTEGER", null, true));
        ssi ssiVar23 = new ssi("mma_organization_view_table", linkedHashMap23, w1l.m(linkedHashMap23, "ignored", new psi(0, 1, "ignored", "INTEGER", null, true)), new LinkedHashSet());
        ssi I23 = o6a.I(glgVar, "mma_organization_view_table");
        if (!ssiVar23.equals(I23)) {
            return new n6g(0, w1l.h("mma_organization_view_table(com.sofascore.model.database.DbMmaOrganizationViewCount).\n Expected:\n", ssiVar23, "\n Found:\n", I23), false);
        }
        LinkedHashMap linkedHashMap24 = new LinkedHashMap();
        ssi ssiVar24 = new ssi("my_unique_stage", linkedHashMap24, w1l.m(linkedHashMap24, "id", new psi(1, 1, "id", "INTEGER", null, true)), new LinkedHashSet());
        ssi I24 = o6a.I(glgVar, "my_unique_stage");
        if (!ssiVar24.equals(I24)) {
            return new n6g(0, w1l.h("my_unique_stage(com.sofascore.model.mvvm.model.UniqueStageId).\n Expected:\n", ssiVar24, "\n Found:\n", I24), false);
        }
        LinkedHashMap linkedHashMap25 = new LinkedHashMap();
        linkedHashMap25.put("mediaPostId", new psi(1, 1, "mediaPostId", "INTEGER", null, true));
        linkedHashMap25.put("reaction", new psi(0, 1, "reaction", "TEXT", null, false));
        linkedHashMap25.put("timestamp", new psi(0, 1, "timestamp", "INTEGER", null, true));
        ssi ssiVar25 = new ssi("media_reaction_table", linkedHashMap25, w1l.m(linkedHashMap25, "shareCount", new psi(0, 1, "shareCount", "INTEGER", "0", true)), new LinkedHashSet());
        ssi I25 = o6a.I(glgVar, "media_reaction_table");
        if (!ssiVar25.equals(I25)) {
            return new n6g(0, w1l.h("media_reaction_table(com.sofascore.model.database.DbMediaReaction).\n Expected:\n", ssiVar25, "\n Found:\n", I25), false);
        }
        LinkedHashMap linkedHashMap26 = new LinkedHashMap();
        linkedHashMap26.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        linkedHashMap26.put("topic", new psi(0, 1, "topic", "TEXT", null, true));
        ssi ssiVar26 = new ssi("nats_event_table", linkedHashMap26, w1l.m(linkedHashMap26, PglCryptUtils.KEY_MESSAGE, new psi(0, 1, PglCryptUtils.KEY_MESSAGE, "TEXT", null, true)), new LinkedHashSet());
        ssi I26 = o6a.I(glgVar, "nats_event_table");
        if (!ssiVar26.equals(I26)) {
            return new n6g(0, w1l.h("nats_event_table(com.sofascore.model.database.DbNatsEvent).\n Expected:\n", ssiVar26, "\n Found:\n", I26), false);
        }
        LinkedHashMap linkedHashMap27 = new LinkedHashMap();
        linkedHashMap27.put("userId", new psi(1, 1, "userId", "TEXT", null, true));
        ssi ssiVar27 = new ssi("user_weekly_leaderboard", linkedHashMap27, w1l.m(linkedHashMap27, "leaderboardId", new psi(0, 1, "leaderboardId", "INTEGER", null, true)), new LinkedHashSet());
        ssi I27 = o6a.I(glgVar, "user_weekly_leaderboard");
        if (!ssiVar27.equals(I27)) {
            return new n6g(0, w1l.h("user_weekly_leaderboard(com.sofascore.model.database.DbUserWeeklyLeaderboard).\n Expected:\n", ssiVar27, "\n Found:\n", I27), false);
        }
        LinkedHashMap linkedHashMap28 = new LinkedHashMap();
        ssi ssiVar28 = new ssi("fantasy_competition_table", linkedHashMap28, w1l.m(linkedHashMap28, "id", new psi(1, 1, "id", "INTEGER", null, true)), new LinkedHashSet());
        ssi I28 = o6a.I(glgVar, "fantasy_competition_table");
        if (!ssiVar28.equals(I28)) {
            return new n6g(0, w1l.h("fantasy_competition_table(com.sofascore.model.database.DbFantasyCompetition).\n Expected:\n", ssiVar28, "\n Found:\n", I28), false);
        }
        LinkedHashMap linkedHashMap29 = new LinkedHashMap();
        linkedHashMap29.put("playerId", new psi(1, 1, "playerId", "INTEGER", null, true));
        ssi ssiVar29 = new ssi("my_players", linkedHashMap29, w1l.m(linkedHashMap29, "notificationsEnabled", new psi(0, 1, "notificationsEnabled", "INTEGER", "1", true)), new LinkedHashSet());
        ssi I29 = o6a.I(glgVar, "my_players");
        if (!ssiVar29.equals(I29)) {
            return new n6g(0, w1l.h("my_players(com.sofascore.model.mvvm.model.DbMyPlayer).\n Expected:\n", ssiVar29, "\n Found:\n", I29), false);
        }
        LinkedHashMap linkedHashMap30 = new LinkedHashMap();
        linkedHashMap30.put("uniqueTournamentId", new psi(1, 1, "uniqueTournamentId", "INTEGER", null, true));
        ssi ssiVar30 = new ssi("my_leagues", linkedHashMap30, w1l.m(linkedHashMap30, "notificationsEnabled", new psi(0, 1, "notificationsEnabled", "INTEGER", "1", true)), new LinkedHashSet());
        ssi I30 = o6a.I(glgVar, "my_leagues");
        if (!ssiVar30.equals(I30)) {
            return new n6g(0, w1l.h("my_leagues(com.sofascore.model.mvvm.model.DbMyUniqueTournament).\n Expected:\n", ssiVar30, "\n Found:\n", I30), false);
        }
        LinkedHashMap linkedHashMap31 = new LinkedHashMap();
        linkedHashMap31.put("postId", new psi(1, 1, "postId", "INTEGER", null, true));
        ssi ssiVar31 = new ssi("feed_post_feedback", linkedHashMap31, w1l.m(linkedHashMap31, "feedbackTimestamp", new psi(0, 1, "feedbackTimestamp", "INTEGER", null, true)), new LinkedHashSet());
        ssi I31 = o6a.I(glgVar, "feed_post_feedback");
        if (!ssiVar31.equals(I31)) {
            return new n6g(0, w1l.h("feed_post_feedback(com.sofascore.model.database.DbFeedPostFeedback).\n Expected:\n", ssiVar31, "\n Found:\n", I31), false);
        }
        LinkedHashMap linkedHashMap32 = new LinkedHashMap();
        linkedHashMap32.put("sportName", new psi(1, 1, "sportName", "TEXT", null, true));
        linkedHashMap32.put("selectedFilters", new psi(0, 1, "selectedFilters", "TEXT", null, true));
        ssi ssiVar32 = new ssi("homescreen_filter", linkedHashMap32, w1l.m(linkedHashMap32, "displayType", new psi(0, 1, "displayType", "TEXT", "'default'", true)), new LinkedHashSet());
        ssi I32 = o6a.I(glgVar, "homescreen_filter");
        if (!ssiVar32.equals(I32)) {
            return new n6g(0, w1l.h("homescreen_filter(com.sofascore.model.database.DbHomescreenFilter).\n Expected:\n", ssiVar32, "\n Found:\n", I32), false);
        }
        LinkedHashMap linkedHashMap33 = new LinkedHashMap();
        linkedHashMap33.put("group", new psi(1, 1, "group", "TEXT", null, true));
        linkedHashMap33.put("name", new psi(2, 1, "name", "TEXT", null, true));
        linkedHashMap33.put("enabled", new psi(0, 1, "enabled", "INTEGER", null, true));
        linkedHashMap33.put("channelId", new psi(0, 1, "channelId", "TEXT", null, true));
        ssi ssiVar33 = new ssi("notification_settings", linkedHashMap33, w1l.m(linkedHashMap33, "groupInSettingsScreen", new psi(0, 1, "groupInSettingsScreen", "TEXT", null, true)), new LinkedHashSet());
        ssi I33 = o6a.I(glgVar, "notification_settings");
        if (!ssiVar33.equals(I33)) {
            return new n6g(0, w1l.h("notification_settings(com.sofascore.model.notifications.NotificationSetting).\n Expected:\n", ssiVar33, "\n Found:\n", I33), false);
        }
        LinkedHashMap linkedHashMap34 = new LinkedHashMap();
        ssi ssiVar34 = new ssi("user_segmentation", linkedHashMap34, w1l.m(linkedHashMap34, "type", new psi(1, 1, "type", "INTEGER", null, true)), new LinkedHashSet());
        ssi I34 = o6a.I(glgVar, "user_segmentation");
        if (!ssiVar34.equals(I34)) {
            return new n6g(0, w1l.h("user_segmentation(com.sofascore.model.database.DbUserSegmentation).\n Expected:\n", ssiVar34, "\n Found:\n", I34), false);
        }
        LinkedHashMap linkedHashMap35 = new LinkedHashMap();
        linkedHashMap35.put("eventId", new psi(1, 1, "eventId", "INTEGER", null, true));
        linkedHashMap35.put("playerId", new psi(0, 1, "playerId", "INTEGER", null, true));
        ssi ssiVar35 = new ssi("player_of_the_match_vote_table", linkedHashMap35, w1l.m(linkedHashMap35, "eventTimestamp", new psi(0, 1, "eventTimestamp", "INTEGER", null, true)), new LinkedHashSet());
        ssi I35 = o6a.I(glgVar, "player_of_the_match_vote_table");
        return !ssiVar35.equals(I35) ? new n6g(0, w1l.h("player_of_the_match_vote_table(com.sofascore.model.database.DbPlayerOfTheMatchVote).\n Expected:\n", ssiVar35, "\n Found:\n", I35), false) : new n6g(0, null, true);
    }

    @Override // defpackage.o6g
    public final void a(glg glgVar) {
        switch (this.d) {
            case 0:
                w1l.t(glgVar, glgVar, "CREATE TABLE IF NOT EXISTS `pinned_tournaments_table` (`id` INTEGER NOT NULL, `name` TEXT, `orderIndex` INTEGER NOT NULL DEFAULT 0, `category_id` INTEGER NOT NULL, `category_name` TEXT NOT NULL, `category_flag` TEXT NOT NULL, `category_sport_id` INTEGER NOT NULL, `category_sport_slug` TEXT NOT NULL, `category_nameTranslation` TEXT, `category_shortNameTranslation` TEXT, `nameTranslation` TEXT, `shortNameTranslation` TEXT, PRIMARY KEY(`id`))", glgVar, "CREATE TABLE IF NOT EXISTS `players` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `userCount` INTEGER NOT NULL, `team_id` INTEGER, `team_name` TEXT, `team_slug` TEXT, `team_userCount` INTEGER, `team_type` INTEGER, `team_nameCode` TEXT, `team_shortName` TEXT, `team_gender` TEXT, `team_ranking` INTEGER, `team_disabled` INTEGER, `team_national` INTEGER DEFAULT 0, `team_sub_team_one_id` INTEGER, `team_sub_team_one_name` TEXT, `team_sub_team_one_nameTranslation` TEXT, `team_sub_team_one_shortNameTranslation` TEXT, `team_sub_team_two_id` INTEGER, `team_sub_team_two_name` TEXT, `team_sub_team_two_nameTranslation` TEXT, `team_sub_team_two_shortNameTranslation` TEXT, `team_sport_id` INTEGER, `team_sport_slug` TEXT, `team_country_name` TEXT, `team_country_alpha2` TEXT, `team_nameTranslation` TEXT, `team_shortNameTranslation` TEXT, `nameTranslation` TEXT, `shortNameTranslation` TEXT, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `my_stage_table` (`description` TEXT NOT NULL, `type` TEXT, `id` INTEGER NOT NULL, `startDateTimestamp` INTEGER, `flag` TEXT, `lastUpdate` INTEGER NOT NULL, `isMuted` INTEGER NOT NULL DEFAULT 0, `isHidden` INTEGER NOT NULL DEFAULT 0, `status_code` INTEGER, `status_description` TEXT, `status_type` TEXT, `winner_id` INTEGER, `winner_name` TEXT, `parent_event_id` INTEGER, `parent_event_description` TEXT, `parent_event_startTimestamp` INTEGER, `parent_event_flag` TEXT, `stage_season_description` TEXT, `stage_season_year` TEXT, `stage_season_id` INTEGER, `stage_season_unique_stage_id` INTEGER, `stage_season_unique_stage_name` TEXT, `stage_season_unique_stage_primaryColorHex` TEXT, `stage_season_unique_stage_secondaryColorHex` TEXT, `stage_season_unique_stage_category_id` INTEGER, `stage_season_unique_stage_category_name` TEXT, `stage_season_unique_stage_category_flag` TEXT, `stage_season_unique_stage_category_sport_id` INTEGER, `stage_season_unique_stage_category_sport_slug` TEXT, `stage_season_unique_stage_category_nameTranslation` TEXT, `stage_season_unique_stage_category_shortNameTranslation` TEXT, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `teams` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `slug` TEXT NOT NULL, `userCount` INTEGER NOT NULL, `type` INTEGER NOT NULL, `nameCode` TEXT, `shortName` TEXT, `gender` TEXT, `ranking` INTEGER, `disabled` INTEGER NOT NULL, `national` INTEGER NOT NULL DEFAULT 0, `sub_team_one_id` INTEGER, `sub_team_one_name` TEXT, `sub_team_one_nameTranslation` TEXT, `sub_team_one_shortNameTranslation` TEXT, `sub_team_two_id` INTEGER, `sub_team_two_name` TEXT, `sub_team_two_nameTranslation` TEXT, `sub_team_two_shortNameTranslation` TEXT, `sport_id` INTEGER, `sport_slug` TEXT, `country_name` TEXT, `country_alpha2` TEXT, `nameTranslation` TEXT, `shortNameTranslation` TEXT, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `my_channels_table` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `countryCode` TEXT NOT NULL, `link` TEXT, PRIMARY KEY(`id`, `countryCode`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `tournament` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `category_id` INTEGER NOT NULL, `category_name` TEXT NOT NULL, `category_flag` TEXT NOT NULL, `category_sport_id` INTEGER NOT NULL, `category_sport_slug` TEXT NOT NULL, `category_nameTranslation` TEXT, `category_shortNameTranslation` TEXT, `unique_tournament_id` INTEGER, `unique_tournament_name` TEXT, `unique_tournament_userCount` INTEGER, `unique_tournament_hasEventPlayerStatistics` INTEGER, `unique_tournament_hasBoxScore` INTEGER, `unique_tournament_displayInverseHomeAwayTeams` INTEGER, `unique_tournament_groundType` TEXT, `unique_tournament_tennisPoints` INTEGER, `unique_tournament_gender` TEXT, `unique_tournament_category_id` INTEGER, `unique_tournament_category_name` TEXT, `unique_tournament_category_flag` TEXT, `unique_tournament_category_sport_id` INTEGER, `unique_tournament_category_sport_slug` TEXT, `unique_tournament_category_nameTranslation` TEXT, `unique_tournament_category_shortNameTranslation` TEXT, `unique_tournament_nameTranslation` TEXT, `unique_tournament_shortNameTranslation` TEXT, `nameTranslation` TEXT, `shortNameTranslation` TEXT, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `tv_channel_vote_table` (`eventId` INTEGER NOT NULL, `channelId` INTEGER NOT NULL, `isConfirmed` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`eventId`, `channelId`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `leagues` (`id` INTEGER NOT NULL, `name` TEXT, `userCount` INTEGER NOT NULL, `hasEventPlayerStatistics` INTEGER NOT NULL, `hasBoxScore` INTEGER, `displayInverseHomeAwayTeams` INTEGER NOT NULL, `groundType` TEXT, `tennisPoints` INTEGER, `gender` TEXT, `category_id` INTEGER NOT NULL, `category_name` TEXT NOT NULL, `category_flag` TEXT NOT NULL, `category_sport_id` INTEGER NOT NULL, `category_sport_slug` TEXT NOT NULL, `category_nameTranslation` TEXT, `category_shortNameTranslation` TEXT, `nameTranslation` TEXT, `shortNameTranslation` TEXT, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `market_value_user_votes_table` (`playerId` INTEGER NOT NULL, `playerValue` INTEGER NOT NULL, `currency` TEXT NOT NULL, `voteType` TEXT NOT NULL, PRIMARY KEY(`playerId`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `my_teams` (`teamId` INTEGER NOT NULL, `notificationsEnabled` INTEGER NOT NULL DEFAULT 1, PRIMARY KEY(`teamId`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `events_table` (`winnerCode` INTEGER, `aggregatedWinnerCode` INTEGER, `homeTeamId` INTEGER NOT NULL, `homeSubTeam1Id` INTEGER, `homeSubTeam2Id` INTEGER, `awayTeamId` INTEGER NOT NULL, `awaySubTeam1Id` INTEGER, `awaySubTeam2Id` INTEGER, `hasEventPlayerHeatMap` INTEGER NOT NULL, `startTimestamp` INTEGER NOT NULL, `endTimestamp` INTEGER, `id` INTEGER NOT NULL, `tournamentId` INTEGER NOT NULL, `uniqueTournamentId` INTEGER, `previousLegEventId` INTEGER, `lastPeriod` TEXT, `homeRedCards` INTEGER, `awayRedCards` INTEGER, `currentBattingTeamId` INTEGER, `firstToServe` INTEGER, `bestOfSets` INTEGER, `bestOfLegs` INTEGER, `finalRound` INTEGER, `winType` TEXT, `crowdsourcingDataDisplayEnabled` INTEGER, `crowdsourcingEnabled` INTEGER, `finalResultOnly` INTEGER, `streamContentId` INTEGER DEFAULT NULL, `streamContentGeoRestrictions` TEXT DEFAULT NULL, `eventFilters` TEXT, `homeTeamSeed` TEXT DEFAULT NULL, `awayTeamSeed` TEXT DEFAULT NULL, `hide` INTEGER NOT NULL, `mute` INTEGER NOT NULL, `lastUpdate` INTEGER NOT NULL, `season_id` INTEGER, `status_code` INTEGER NOT NULL, `status_description` TEXT, `status_type` TEXT NOT NULL, `time_played` INTEGER, `time_periodLength` INTEGER, `time_overtimeLength` INTEGER, `time_totalPeriodCount` INTEGER, `time_initial` INTEGER, `time_max` INTEGER, `time_currentPeriodStartTimestamp` INTEGER, `time_extra` INTEGER, `changes_changes` TEXT, `changes_changeTimestamp` INTEGER, `am_football_currentYardsToFirstDown` INTEGER, `am_football_currentDown` INTEGER, `am_football_currentYardline` INTEGER, `am_football_isGoalPossession` INTEGER, `am_football_currentPossession` INTEGER, `am_football_currentTeamHalf` INTEGER, `var_homeTeam` INTEGER, `var_awayTeam` INTEGER, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `events_score` (`eventId` INTEGER NOT NULL, `home_score_display` INTEGER, `home_score_period1` INTEGER, `home_score_period2` INTEGER, `home_score_period3` INTEGER, `home_score_period4` INTEGER, `home_score_period5` INTEGER, `home_score_period6` INTEGER, `home_score_period7` INTEGER, `home_score_period8` INTEGER, `home_score_period9` INTEGER, `home_score_period10` INTEGER, `home_score_period11` INTEGER, `home_score_period12` INTEGER, `home_score_period13` INTEGER, `home_score_period1TieBreak` INTEGER, `home_score_period2TieBreak` INTEGER, `home_score_period3TieBreak` INTEGER, `home_score_period4TieBreak` INTEGER, `home_score_period5TieBreak` INTEGER, `home_score_point` TEXT, `home_score_overtime` INTEGER, `home_score_penalties` INTEGER, `home_score_aggregated` INTEGER, `home_score_series` INTEGER, `home_score_currentCricketDisplay` TEXT, `away_score_display` INTEGER, `away_score_period1` INTEGER, `away_score_period2` INTEGER, `away_score_period3` INTEGER, `away_score_period4` INTEGER, `away_score_period5` INTEGER, `away_score_period6` INTEGER, `away_score_period7` INTEGER, `away_score_period8` INTEGER, `away_score_period9` INTEGER, `away_score_period10` INTEGER, `away_score_period11` INTEGER, `away_score_period12` INTEGER, `away_score_period13` INTEGER, `away_score_period1TieBreak` INTEGER, `away_score_period2TieBreak` INTEGER, `away_score_period3TieBreak` INTEGER, `away_score_period4TieBreak` INTEGER, `away_score_period5TieBreak` INTEGER, `away_score_point` TEXT, `away_score_overtime` INTEGER, `away_score_penalties` INTEGER, `away_score_aggregated` INTEGER, `away_score_series` INTEGER, `away_score_currentCricketDisplay` TEXT, PRIMARY KEY(`eventId`), FOREIGN KEY(`eventId`) REFERENCES `events_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `sport_order` (`sportName` TEXT NOT NULL, `sportOrder` INTEGER NOT NULL, `isSelected` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`sportName`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `pending_notifications` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `notificationId` INTEGER NOT NULL, `title` TEXT NOT NULL, `message` TEXT NOT NULL, `updatableNotificationId` TEXT)");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `popular_categories` (`sportName` TEXT NOT NULL, `categoryId` INTEGER NOT NULL, `orderIndex` INTEGER NOT NULL, PRIMARY KEY(`sportName`, `categoryId`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `chat_message_table` (`eventId` INTEGER NOT NULL, `messageTimestamp` INTEGER NOT NULL, `voteTimestamp` INTEGER NOT NULL, `reportTimestamp` INTEGER NOT NULL, PRIMARY KEY(`eventId`, `messageTimestamp`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `saved_searches_table` (`id` INTEGER NOT NULL, `entity` TEXT NOT NULL, `json` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`, `entity`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `video_table` (`id` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `news_table` (`id` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `vote_table` (`id` INTEGER NOT NULL, `userChoice` TEXT NOT NULL, `eventTimestamp` INTEGER NOT NULL, `success` INTEGER NOT NULL, `voteType` TEXT NOT NULL DEFAULT 'Full time', PRIMARY KEY(`id`, `voteType`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `crowdscourcing_scorer_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `eventId` INTEGER NOT NULL, `eventTimestamp` INTEGER NOT NULL, `isHomeTeamIncident` INTEGER NOT NULL, `homeScoreSuggest` INTEGER NOT NULL, `awayScoreSuggest` INTEGER NOT NULL, `scoreType` TEXT, `eventStatusType` TEXT, `scorerId` INTEGER, `assistId` INTEGER, `group` INTEGER NOT NULL)");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `buzzer_table` (`id` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `mma_organization_view_table` (`id` INTEGER NOT NULL, `viewCount` INTEGER NOT NULL, `ignored` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `my_unique_stage` (`id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `media_reaction_table` (`mediaPostId` INTEGER NOT NULL, `reaction` TEXT, `timestamp` INTEGER NOT NULL, `shareCount` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`mediaPostId`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `nats_event_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `topic` TEXT NOT NULL, `message` TEXT NOT NULL)");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `user_weekly_leaderboard` (`userId` TEXT NOT NULL, `leaderboardId` INTEGER NOT NULL, PRIMARY KEY(`userId`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `fantasy_competition_table` (`id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `my_players` (`playerId` INTEGER NOT NULL, `notificationsEnabled` INTEGER NOT NULL DEFAULT 1, PRIMARY KEY(`playerId`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `my_leagues` (`uniqueTournamentId` INTEGER NOT NULL, `notificationsEnabled` INTEGER NOT NULL DEFAULT 1, PRIMARY KEY(`uniqueTournamentId`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `feed_post_feedback` (`postId` INTEGER NOT NULL, `feedbackTimestamp` INTEGER NOT NULL, PRIMARY KEY(`postId`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `homescreen_filter` (`sportName` TEXT NOT NULL, `selectedFilters` TEXT NOT NULL, `displayType` TEXT NOT NULL DEFAULT 'default', PRIMARY KEY(`sportName`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `notification_settings` (`group` TEXT NOT NULL, `name` TEXT NOT NULL, `enabled` INTEGER NOT NULL, `channelId` TEXT NOT NULL, `groupInSettingsScreen` TEXT NOT NULL, PRIMARY KEY(`group`, `name`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `user_segmentation` (`type` INTEGER NOT NULL, PRIMARY KEY(`type`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `player_of_the_match_vote_table` (`eventId` INTEGER NOT NULL, `playerId` INTEGER NOT NULL, `eventTimestamp` INTEGER NOT NULL, PRIMARY KEY(`eventId`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                b0a.F(glgVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1ffa78994fa3b00bc2e1911091880d4f')");
                break;
            default:
                w1l.t(glgVar, glgVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", glgVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                b0a.F(glgVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                b0a.F(glgVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                b0a.F(glgVar, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                b0a.F(glgVar, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                b0a.F(glgVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
                break;
        }
    }

    @Override // defpackage.o6g
    public final void b(glg glgVar) {
        switch (this.d) {
            case 0:
                w1l.t(glgVar, glgVar, "DROP TABLE IF EXISTS `pinned_tournaments_table`", glgVar, "DROP TABLE IF EXISTS `players`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `my_stage_table`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `teams`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `my_channels_table`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `tournament`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `tv_channel_vote_table`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `leagues`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `market_value_user_votes_table`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `my_teams`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `events_table`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `events_score`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `sport_order`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `pending_notifications`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `popular_categories`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `chat_message_table`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `saved_searches_table`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `video_table`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `news_table`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `vote_table`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `crowdscourcing_scorer_table`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `buzzer_table`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `mma_organization_view_table`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `my_unique_stage`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `media_reaction_table`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `nats_event_table`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `user_weekly_leaderboard`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `fantasy_competition_table`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `my_players`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `my_leagues`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `feed_post_feedback`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `homescreen_filter`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `notification_settings`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `user_segmentation`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `player_of_the_match_vote_table`");
                break;
            default:
                w1l.t(glgVar, glgVar, "DROP TABLE IF EXISTS `Dependency`", glgVar, "DROP TABLE IF EXISTS `WorkSpec`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `WorkTag`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `SystemIdInfo`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `WorkName`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `WorkProgress`");
                b0a.F(glgVar, "DROP TABLE IF EXISTS `Preference`");
                break;
        }
    }

    @Override // defpackage.o6g
    public final void c(glg glgVar) {
        int i = this.d;
        glgVar.getClass();
    }

    @Override // defpackage.o6g
    public final void d(glg glgVar) {
        int i = this.d;
        k6g k6gVar = this.e;
        glgVar.getClass();
        switch (i) {
            case 0:
                b0a.F(glgVar, "PRAGMA foreign_keys = ON");
                ((AppDatabase_Impl) k6gVar).internalInitInvalidationTracker(glgVar);
                break;
            default:
                b0a.F(glgVar, "PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) k6gVar).internalInitInvalidationTracker(glgVar);
                break;
        }
    }

    @Override // defpackage.o6g
    public final void e(glg glgVar) {
        int i = this.d;
        glgVar.getClass();
    }

    @Override // defpackage.o6g
    public final void f(glg glgVar) {
        int i = this.d;
        glgVar.getClass();
        switch (i) {
            case 0:
                fz8.N(glgVar);
                break;
            default:
                fz8.N(glgVar);
                break;
        }
    }

    @Override // defpackage.o6g
    public final n6g g(glg glgVar) {
        switch (this.d) {
            case 0:
                return h(glgVar);
            default:
                glgVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("work_spec_id", new psi(1, 1, "work_spec_id", "TEXT", null, true));
                LinkedHashSet m = w1l.m(linkedHashMap, "prerequisite_id", new psi(2, 1, "prerequisite_id", "TEXT", null, true));
                m.add(new qsi("WorkSpec", "CASCADE", "CASCADE", a.c("work_spec_id"), a.c("id")));
                m.add(new qsi("WorkSpec", "CASCADE", "CASCADE", a.c("prerequisite_id"), a.c("id")));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new rsi("index_Dependency_work_spec_id", a.c("work_spec_id"), a.c("ASC"), false));
                linkedHashSet.add(new rsi("index_Dependency_prerequisite_id", a.c("prerequisite_id"), a.c("ASC"), false));
                ssi ssiVar = new ssi("Dependency", linkedHashMap, m, linkedHashSet);
                ssi I = o6a.I(glgVar, "Dependency");
                if (!ssiVar.equals(I)) {
                    return new n6g(0, w1l.h("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", ssiVar, "\n Found:\n", I), false);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new psi(1, 1, "id", "TEXT", null, true));
                linkedHashMap2.put("state", new psi(0, 1, "state", "INTEGER", null, true));
                linkedHashMap2.put("worker_class_name", new psi(0, 1, "worker_class_name", "TEXT", null, true));
                linkedHashMap2.put("input_merger_class_name", new psi(0, 1, "input_merger_class_name", "TEXT", null, true));
                linkedHashMap2.put("input", new psi(0, 1, "input", "BLOB", null, true));
                linkedHashMap2.put("output", new psi(0, 1, "output", "BLOB", null, true));
                linkedHashMap2.put("initial_delay", new psi(0, 1, "initial_delay", "INTEGER", null, true));
                linkedHashMap2.put("interval_duration", new psi(0, 1, "interval_duration", "INTEGER", null, true));
                linkedHashMap2.put("flex_duration", new psi(0, 1, "flex_duration", "INTEGER", null, true));
                linkedHashMap2.put("run_attempt_count", new psi(0, 1, "run_attempt_count", "INTEGER", null, true));
                linkedHashMap2.put("backoff_policy", new psi(0, 1, "backoff_policy", "INTEGER", null, true));
                linkedHashMap2.put("backoff_delay_duration", new psi(0, 1, "backoff_delay_duration", "INTEGER", null, true));
                linkedHashMap2.put("last_enqueue_time", new psi(0, 1, "last_enqueue_time", "INTEGER", Y1.f, true));
                linkedHashMap2.put("minimum_retention_duration", new psi(0, 1, "minimum_retention_duration", "INTEGER", null, true));
                linkedHashMap2.put("schedule_requested_at", new psi(0, 1, "schedule_requested_at", "INTEGER", null, true));
                linkedHashMap2.put("run_in_foreground", new psi(0, 1, "run_in_foreground", "INTEGER", null, true));
                linkedHashMap2.put("out_of_quota_policy", new psi(0, 1, "out_of_quota_policy", "INTEGER", null, true));
                linkedHashMap2.put("period_count", new psi(0, 1, "period_count", "INTEGER", "0", true));
                linkedHashMap2.put("generation", new psi(0, 1, "generation", "INTEGER", "0", true));
                linkedHashMap2.put("next_schedule_time_override", new psi(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
                linkedHashMap2.put("next_schedule_time_override_generation", new psi(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
                linkedHashMap2.put("stop_reason", new psi(0, 1, "stop_reason", "INTEGER", "-256", true));
                linkedHashMap2.put("trace_tag", new psi(0, 1, "trace_tag", "TEXT", null, false));
                linkedHashMap2.put("backoff_on_system_interruptions", new psi(0, 1, "backoff_on_system_interruptions", "INTEGER", null, false));
                linkedHashMap2.put("required_network_type", new psi(0, 1, "required_network_type", "INTEGER", null, true));
                linkedHashMap2.put("required_network_request", new psi(0, 1, "required_network_request", "BLOB", "x''", true));
                linkedHashMap2.put("requires_charging", new psi(0, 1, "requires_charging", "INTEGER", null, true));
                linkedHashMap2.put("requires_device_idle", new psi(0, 1, "requires_device_idle", "INTEGER", null, true));
                linkedHashMap2.put("requires_battery_not_low", new psi(0, 1, "requires_battery_not_low", "INTEGER", null, true));
                linkedHashMap2.put("requires_storage_not_low", new psi(0, 1, "requires_storage_not_low", "INTEGER", null, true));
                linkedHashMap2.put("trigger_content_update_delay", new psi(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
                linkedHashMap2.put("trigger_max_content_delay", new psi(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
                LinkedHashSet m2 = w1l.m(linkedHashMap2, "content_uri_triggers", new psi(0, 1, "content_uri_triggers", "BLOB", null, true));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new rsi("index_WorkSpec_schedule_requested_at", a.c("schedule_requested_at"), a.c("ASC"), false));
                linkedHashSet2.add(new rsi("index_WorkSpec_last_enqueue_time", a.c("last_enqueue_time"), a.c("ASC"), false));
                ssi ssiVar2 = new ssi("WorkSpec", linkedHashMap2, m2, linkedHashSet2);
                ssi I2 = o6a.I(glgVar, "WorkSpec");
                if (!ssiVar2.equals(I2)) {
                    return new n6g(0, w1l.h("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", ssiVar2, "\n Found:\n", I2), false);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("tag", new psi(1, 1, "tag", "TEXT", null, true));
                LinkedHashSet m3 = w1l.m(linkedHashMap3, "work_spec_id", new psi(2, 1, "work_spec_id", "TEXT", null, true));
                m3.add(new qsi("WorkSpec", "CASCADE", "CASCADE", a.c("work_spec_id"), a.c("id")));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                linkedHashSet3.add(new rsi("index_WorkTag_work_spec_id", a.c("work_spec_id"), a.c("ASC"), false));
                ssi ssiVar3 = new ssi("WorkTag", linkedHashMap3, m3, linkedHashSet3);
                ssi I3 = o6a.I(glgVar, "WorkTag");
                if (!ssiVar3.equals(I3)) {
                    return new n6g(0, w1l.h("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", ssiVar3, "\n Found:\n", I3), false);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("work_spec_id", new psi(1, 1, "work_spec_id", "TEXT", null, true));
                linkedHashMap4.put("generation", new psi(2, 1, "generation", "INTEGER", "0", true));
                LinkedHashSet m4 = w1l.m(linkedHashMap4, "system_id", new psi(0, 1, "system_id", "INTEGER", null, true));
                m4.add(new qsi("WorkSpec", "CASCADE", "CASCADE", a.c("work_spec_id"), a.c("id")));
                ssi ssiVar4 = new ssi("SystemIdInfo", linkedHashMap4, m4, new LinkedHashSet());
                ssi I4 = o6a.I(glgVar, "SystemIdInfo");
                if (!ssiVar4.equals(I4)) {
                    return new n6g(0, w1l.h("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", ssiVar4, "\n Found:\n", I4), false);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("name", new psi(1, 1, "name", "TEXT", null, true));
                LinkedHashSet m5 = w1l.m(linkedHashMap5, "work_spec_id", new psi(2, 1, "work_spec_id", "TEXT", null, true));
                m5.add(new qsi("WorkSpec", "CASCADE", "CASCADE", a.c("work_spec_id"), a.c("id")));
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add(new rsi("index_WorkName_work_spec_id", a.c("work_spec_id"), a.c("ASC"), false));
                ssi ssiVar5 = new ssi("WorkName", linkedHashMap5, m5, linkedHashSet4);
                ssi I5 = o6a.I(glgVar, "WorkName");
                if (!ssiVar5.equals(I5)) {
                    return new n6g(0, w1l.h("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", ssiVar5, "\n Found:\n", I5), false);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("work_spec_id", new psi(1, 1, "work_spec_id", "TEXT", null, true));
                LinkedHashSet m6 = w1l.m(linkedHashMap6, NotificationCompat.CATEGORY_PROGRESS, new psi(0, 1, NotificationCompat.CATEGORY_PROGRESS, "BLOB", null, true));
                m6.add(new qsi("WorkSpec", "CASCADE", "CASCADE", a.c("work_spec_id"), a.c("id")));
                ssi ssiVar6 = new ssi("WorkProgress", linkedHashMap6, m6, new LinkedHashSet());
                ssi I6 = o6a.I(glgVar, "WorkProgress");
                if (!ssiVar6.equals(I6)) {
                    return new n6g(0, w1l.h("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", ssiVar6, "\n Found:\n", I6), false);
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put(U3.i.W, new psi(1, 1, U3.i.W, "TEXT", null, true));
                ssi ssiVar7 = new ssi("Preference", linkedHashMap7, w1l.m(linkedHashMap7, "long_value", new psi(0, 1, "long_value", "INTEGER", null, false)), new LinkedHashSet());
                ssi I7 = o6a.I(glgVar, "Preference");
                return !ssiVar7.equals(I7) ? new n6g(0, w1l.h("Preference(androidx.work.impl.model.Preference).\n Expected:\n", ssiVar7, "\n Found:\n", I7), false) : new n6g(0, null, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd0(AppDatabase_Impl appDatabase_Impl) {
        super(154, "1ffa78994fa3b00bc2e1911091880d4f", "b4a3a73c13fd4e44384060c65903b0c2");
        this.e = appDatabase_Impl;
    }
}
