package com.sofascore.network.api;

import com.mbridge.msdk.MBridgeConstans;
import com.sofascore.model.fantasy.FantasyBasicCompetitionsResponse;
import com.sofascore.model.fantasy.FantasyChatMessageTimestampResponse;
import com.sofascore.model.fantasy.FantasyCompetitionAgeGroupsResponse;
import com.sofascore.model.fantasy.FantasyCompetitionFiltersResponse;
import com.sofascore.model.fantasy.FantasyCompetitionPlayersResponse;
import com.sofascore.model.fantasy.FantasyCompetitionPriceChangesResponse;
import com.sofascore.model.fantasy.FantasyCompetitionResponse;
import com.sofascore.model.fantasy.FantasyCompetitionsResponse;
import com.sofascore.model.fantasy.FantasyCreateLeagueBody;
import com.sofascore.model.fantasy.FantasyCreateTeamPostBody;
import com.sofascore.model.fantasy.FantasyCreateTeamResponse;
import com.sofascore.model.fantasy.FantasyEditLeagueBody;
import com.sofascore.model.fantasy.FantasyEditTeamNameBody;
import com.sofascore.model.fantasy.FantasyEventsResponse;
import com.sofascore.model.fantasy.FantasyFixtureDifficultyResponse;
import com.sofascore.model.fantasy.FantasyLeagueConfigResponse;
import com.sofascore.model.fantasy.FantasyLeagueJoinCodeResponse;
import com.sofascore.model.fantasy.FantasyLeagueKickUserBody;
import com.sofascore.model.fantasy.FantasyLeagueLeaderboardResponse;
import com.sofascore.model.fantasy.FantasyLeagueMatchupsResponse;
import com.sofascore.model.fantasy.FantasyLeagueParticipantsResponse;
import com.sofascore.model.fantasy.FantasyLeagueResponse;
import com.sofascore.model.fantasy.FantasyLeagueRoundSquadsResponse;
import com.sofascore.model.fantasy.FantasyNewsArticlesResponse;
import com.sofascore.model.fantasy.FantasyPlayerCompetitionsResponse;
import com.sofascore.model.fantasy.FantasyPlayerFormAndFixturesResponse;
import com.sofascore.model.fantasy.FantasyPlayerPointsBreakdownResponse;
import com.sofascore.model.fantasy.FantasyPlayerPostModel;
import com.sofascore.model.fantasy.FantasyPlayerPriceHistoryResponse;
import com.sofascore.model.fantasy.FantasyPlayerResponse;
import com.sofascore.model.fantasy.FantasyPointsForEventResponse;
import com.sofascore.model.fantasy.FantasyRoundPlayerResponse;
import com.sofascore.model.fantasy.FantasyRoundPlayerScoreResponse;
import com.sofascore.model.fantasy.FantasyRoundPlayerStatisticsResponse;
import com.sofascore.model.fantasy.FantasyRoundResponse;
import com.sofascore.model.fantasy.FantasyRoundsResponse;
import com.sofascore.model.fantasy.FantasySquadResponse;
import com.sofascore.model.fantasy.FantasySubstitutionsPostBody;
import com.sofascore.model.fantasy.FantasyTeamOfTheRoundResponse;
import com.sofascore.model.fantasy.FantasyTopPlayersPerRoundResponse;
import com.sofascore.model.fantasy.FantasyTopPlayersResponse;
import com.sofascore.model.fantasy.FantasyTransfersPostBody;
import com.sofascore.model.fantasy.FantasyTransfersResponse;
import com.sofascore.model.fantasy.FantasyUniqueTournamentCompetitionMapping;
import com.sofascore.model.fantasy.FantasyUpdateTeamPostBody;
import com.sofascore.model.fantasy.FantasyUserCompetitionResponse;
import com.sofascore.model.fantasy.FantasyUserCompetitionsResponse;
import com.sofascore.model.fantasy.FantasyUserLeague;
import com.sofascore.model.fantasy.FantasyUserLeaguesResponse;
import com.sofascore.model.fantasy.FantasyUserRoundRankingsResponse;
import com.sofascore.model.fantasy.FantasyUserRoundResponse;
import com.sofascore.model.fantasy.FantasyUserRoundSquadResponse;
import com.sofascore.model.fantasy.FantasyUserRoundsResponse;
import defpackage.c2g;
import defpackage.czd;
import defpackage.h3e;
import defpackage.i0e;
import defpackage.iu8;
import defpackage.kb4;
import defpackage.qif;
import defpackage.rq3;
import defpackage.s59;
import defpackage.vae;
import defpackage.yy1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000¨\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJl\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001b\u0010\rJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001d\u0010\rJ\u001a\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\b \u0010\rJ\u001a\u0010\"\u001a\u00020!2\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\"\u0010\rJ\u001a\u0010$\u001a\u00020#2\b\b\u0001\u0010\n\u001a\u00020\u000fH§@¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020#2\b\b\u0001\u0010\n\u001a\u00020\u000fH§@¢\u0006\u0004\b&\u0010%J$\u0010*\u001a\u00020)2\b\b\u0001\u0010'\u001a\u00020\u000f2\b\b\u0001\u0010(\u001a\u00020\u0002H§@¢\u0006\u0004\b*\u0010+J$\u0010-\u001a\u00020,2\b\b\u0001\u0010'\u001a\u00020\u000f2\b\b\u0001\u0010(\u001a\u00020\u0002H§@¢\u0006\u0004\b-\u0010+J$\u0010/\u001a\u00020.2\b\b\u0001\u0010'\u001a\u00020\u000f2\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\b/\u0010+J$\u00101\u001a\u0002002\b\b\u0001\u0010'\u001a\u00020\u000f2\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\b1\u0010+J$\u00103\u001a\u0002022\b\b\u0001\u0010'\u001a\u00020\u000f2\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\b3\u0010+J\u001a\u00106\u001a\u0002052\b\b\u0001\u00104\u001a\u00020\u0002H§@¢\u0006\u0004\b6\u0010\rJ$\u00109\u001a\u0002082\b\b\u0001\u0010\u001e\u001a\u00020\u00022\b\b\u0001\u00107\u001a\u00020\u0002H§@¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020;2\b\b\u0001\u00104\u001a\u00020\u0002H§@¢\u0006\u0004\b<\u0010\rJ\u001a\u0010?\u001a\u00020>2\b\b\u0001\u0010=\u001a\u00020\u0002H§@¢\u0006\u0004\b?\u0010\rJ$\u0010C\u001a\u00020B2\b\b\u0001\u0010\u001e\u001a\u00020\u00022\b\b\u0001\u0010A\u001a\u00020@H§@¢\u0006\u0004\bC\u0010DJ$\u0010F\u001a\u00020B2\b\b\u0001\u0010(\u001a\u00020\u00022\b\b\u0001\u0010A\u001a\u00020EH§@¢\u0006\u0004\bF\u0010GJ$\u0010J\u001a\u00020I2\b\b\u0001\u0010(\u001a\u00020\u00022\b\b\u0001\u0010A\u001a\u00020HH§@¢\u0006\u0004\bJ\u0010KJ$\u0010M\u001a\u00020B2\b\b\u0001\u0010(\u001a\u00020\u00022\b\b\u0001\u0010A\u001a\u00020LH§@¢\u0006\u0004\bM\u0010NJ$\u0010Q\u001a\u00020)2\b\b\u0001\u0010O\u001a\u00020\u00022\b\b\u0001\u0010A\u001a\u00020PH§@¢\u0006\u0004\bQ\u0010RJ \u0010U\u001a\b\u0012\u0004\u0012\u00020T0S2\b\b\u0001\u0010(\u001a\u00020\u0002H§@¢\u0006\u0004\bU\u0010\rJ\u001a\u0010W\u001a\u00020V2\b\b\u0001\u00107\u001a\u00020\u0002H§@¢\u0006\u0004\bW\u0010\rJ\u001a\u0010X\u001a\u00020V2\b\b\u0001\u00107\u001a\u00020\u0002H§@¢\u0006\u0004\bX\u0010\rJ.\u0010[\u001a\u00020Z2\b\b\u0001\u0010Y\u001a\u00020\u00022\b\b\u0001\u00104\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020\u0002H§@¢\u0006\u0004\b[\u0010\\J$\u0010^\u001a\u00020]2\b\b\u0001\u0010'\u001a\u00020\u000f2\b\b\u0001\u0010(\u001a\u00020\u0002H§@¢\u0006\u0004\b^\u0010+J$\u0010a\u001a\u00020`2\b\b\u0001\u0010_\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\ba\u0010:J.\u0010b\u001a\u00020`2\b\b\u0001\u0010_\u001a\u00020\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\bb\u0010\\J$\u0010e\u001a\u00020d2\b\b\u0001\u0010c\u001a\u00020\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\be\u0010:J$\u0010g\u001a\u00020f2\b\b\u0001\u0010c\u001a\u00020\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\bg\u0010:J\u001a\u0010i\u001a\u00020h2\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\bi\u0010\rJ$\u0010l\u001a\u00020k2\b\b\u0001\u0010(\u001a\u00020\u00022\b\b\u0001\u0010j\u001a\u00020\u0002H§@¢\u0006\u0004\bl\u0010:J \u0010m\u001a\b\u0012\u0004\u0012\u00020T0S2\b\b\u0001\u0010(\u001a\u00020\u0002H§@¢\u0006\u0004\bm\u0010\rJ*\u0010n\u001a\b\u0012\u0004\u0012\u00020T0S2\b\b\u0001\u0010'\u001a\u00020\u000f2\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\bn\u0010+J*\u0010r\u001a\u00020B2\b\b\u0001\u0010(\u001a\u00020\u00022\u000e\b\u0001\u0010q\u001a\b\u0012\u0004\u0012\u00020p0oH§@¢\u0006\u0004\br\u0010sJ\u001a\u0010u\u001a\u00020t2\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\bu\u0010\rJ\u001a\u0010w\u001a\u00020v2\b\b\u0001\u0010(\u001a\u00020\u0002H§@¢\u0006\u0004\bw\u0010\rJ\u001a\u0010y\u001a\u00020x2\b\b\u0001\u00104\u001a\u00020\u0002H§@¢\u0006\u0004\by\u0010\rJ \u0010z\u001a\b\u0012\u0004\u0012\u00020T0S2\b\b\u0001\u00104\u001a\u00020\u0002H§@¢\u0006\u0004\bz\u0010\rJ\u001a\u0010}\u001a\u00020|2\b\b\u0001\u0010A\u001a\u00020{H§@¢\u0006\u0004\b}\u0010~J(\u0010\u0081\u0001\u001a\u00030\u0080\u00012\b\b\u0001\u0010c\u001a\u00020\u00022\b\b\u0001\u0010A\u001a\u00020\u007fH§@¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\"\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020T0S2\b\b\u0001\u0010c\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0083\u0001\u0010\rJ\u001d\u0010\u0085\u0001\u001a\u00020|2\t\b\u0001\u0010\u0084\u0001\u001a\u00020\u000fH§@¢\u0006\u0005\b\u0085\u0001\u0010%J\u001c\u0010\u0086\u0001\u001a\u00020|2\b\b\u0001\u0010(\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0086\u0001\u0010\rJ\u001d\u0010\u0088\u0001\u001a\u00030\u0087\u00012\b\b\u0001\u0010c\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0088\u0001\u0010\rJ\u001d\u0010\u0089\u0001\u001a\u00030\u0087\u00012\b\b\u0001\u0010c\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0089\u0001\u0010\rJ.\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020T0S2\b\b\u0001\u0010c\u001a\u00020\u00022\t\b\u0001\u0010A\u001a\u00030\u008a\u0001H§@¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J&\u0010\u008d\u0001\u001a\u00020]2\b\b\u0001\u0010'\u001a\u00020\u000f2\b\b\u0001\u0010c\u001a\u00020\u0002H§@¢\u0006\u0005\b\u008d\u0001\u0010+J\u001d\u0010\u008e\u0001\u001a\u00030\u0080\u00012\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0005\b\u008e\u0001\u0010\rJ\u001d\u0010\u0090\u0001\u001a\u00030\u008f\u00012\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0090\u0001\u0010\rJ\"\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020T0S2\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0091\u0001\u0010\rJ4\u0010\u0093\u0001\u001a\u00030\u0092\u00012\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001d\u0010\u0096\u0001\u001a\u00030\u0095\u00012\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0096\u0001\u0010\rJ\u001d\u0010\u0098\u0001\u001a\u00030\u0097\u00012\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0098\u0001\u0010\rJ'\u0010\u009a\u0001\u001a\u00030\u0099\u00012\b\b\u0001\u0010'\u001a\u00020\u000f2\b\b\u0001\u0010(\u001a\u00020\u0002H§@¢\u0006\u0005\b\u009a\u0001\u0010+J\u001e\u0010\u009d\u0001\u001a\u00030\u009c\u00012\t\b\u0001\u0010\u009b\u0001\u001a\u00020\u000fH§@¢\u0006\u0005\b\u009d\u0001\u0010%J)\u0010\u009f\u0001\u001a\u00030\u009e\u00012\b\b\u0001\u0010(\u001a\u00020\u00022\t\b\u0001\u0010\u009b\u0001\u001a\u00020\u000fH§@¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u001d\u0010¢\u0001\u001a\u00030¡\u00012\b\b\u0001\u0010Y\u001a\u00020\u0002H§@¢\u0006\u0005\b¢\u0001\u0010\rJ\u001e\u0010¥\u0001\u001a\u00030¤\u00012\t\b\u0001\u0010£\u0001\u001a\u00020\u000fH§@¢\u0006\u0005\b¥\u0001\u0010%J\u001d\u0010§\u0001\u001a\u00030¦\u00012\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0005\b§\u0001\u0010\r¨\u0006¨\u0001À\u0006\u0003"}, d2 = {"Lcom/sofascore/network/api/FantasyAPI;", "Lcom/sofascore/network/api/FantasyHeadAPI;", "", "competitionType", "Lcom/sofascore/model/fantasy/FantasyCompetitionsResponse;", "getCompetitions", "(Ljava/lang/Integer;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/fantasy/FantasyBasicCompetitionsResponse;", "getUpcomingCompetitions", "(Lrq3;)Ljava/lang/Object;", "id", "Lcom/sofascore/model/fantasy/FantasyCompetitionResponse;", "getCompetition", "(ILrq3;)Ljava/lang/Object;", "page", "", MBridgeConstans.DYNAMIC_VIEW_WX_QUERY, "position", "teamId", "", "maxPrice", "sortCategory", "sortOrder", "Lcom/sofascore/model/fantasy/FantasyCompetitionPlayersResponse;", "getRoundPlayers", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/fantasy/FantasyRoundsResponse;", "getCompetitionRounds", "Lcom/sofascore/model/fantasy/FantasyTopPlayersResponse;", "getCompetitionTopPlayers", "roundId", "Lcom/sofascore/model/fantasy/FantasyCompetitionFiltersResponse;", "getCompetitionRoundFilterOptions", "Lcom/sofascore/model/fantasy/FantasyCompetitionPriceChangesResponse;", "getCompetitionPriceChanges", "Lcom/sofascore/model/fantasy/FantasyUserCompetitionsResponse;", "getUserCompetitions", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "getUserFinishedCompetitions", "userId", "competitionId", "Lcom/sofascore/model/fantasy/FantasyUserCompetitionResponse;", "getUserCompetition", "(Ljava/lang/String;ILrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/fantasy/FantasyUserRoundsResponse;", "getUserCompetitionRounds", "Lcom/sofascore/model/fantasy/FantasyUserRoundResponse;", "getUserRound", "Lcom/sofascore/model/fantasy/FantasyUserRoundRankingsResponse;", "getUserRoundRankings", "Lcom/sofascore/model/fantasy/FantasyUserRoundSquadResponse;", "getUserRoundSquad", "playerId", "Lcom/sofascore/model/fantasy/FantasyPlayerResponse;", "getPlayer", "fantasyPlayerId", "Lcom/sofascore/model/fantasy/FantasyRoundPlayerResponse;", "getRoundPlayer", "(IILrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/fantasy/FantasyPlayerPriceHistoryResponse;", "getPlayerPriceHistory", "roundPlayerId", "Lcom/sofascore/model/fantasy/FantasyRoundPlayerScoreResponse;", "getRoundPlayerScore", "Lcom/sofascore/model/fantasy/FantasySubstitutionsPostBody;", "body", "Lcom/sofascore/model/fantasy/FantasySquadResponse;", "postSubstitutions", "(ILcom/sofascore/model/fantasy/FantasySubstitutionsPostBody;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/fantasy/FantasyTransfersPostBody;", "postTransfers", "(ILcom/sofascore/model/fantasy/FantasyTransfersPostBody;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/fantasy/FantasyCreateTeamPostBody;", "Lcom/sofascore/model/fantasy/FantasyCreateTeamResponse;", "createTeam", "(ILcom/sofascore/model/fantasy/FantasyCreateTeamPostBody;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/fantasy/FantasyUpdateTeamPostBody;", "updateTeam", "(ILcom/sofascore/model/fantasy/FantasyUpdateTeamPostBody;Lrq3;)Ljava/lang/Object;", "userCompetitionId", "Lcom/sofascore/model/fantasy/FantasyEditTeamNameBody;", "editTeamName", "(ILcom/sofascore/model/fantasy/FantasyEditTeamNameBody;Lrq3;)Ljava/lang/Object;", "Lc2g;", "", "deleteTeam", "Lcom/sofascore/model/fantasy/FantasyPlayerFormAndFixturesResponse;", "getPlayerRecentFormAndFixtures", "getPlayerCompleteFormAndFixtures", "eventId", "Lcom/sofascore/model/fantasy/FantasyPlayerPointsBreakdownResponse;", "getPlayerEventPointsBreakdown", "(IIILrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/fantasy/FantasyUserLeaguesResponse;", "getUserLeagues", "leaderboardId", "Lcom/sofascore/model/fantasy/FantasyLeagueLeaderboardResponse;", "getLeagueLeaderboard", "getLeagueLeaderboardForRound", "leagueId", "Lcom/sofascore/model/fantasy/FantasyLeagueMatchupsResponse;", "getLeagueMatchupsForRound", "Lcom/sofascore/model/fantasy/FantasyLeagueRoundSquadsResponse;", "getLeagueRoundSquads", "Lcom/sofascore/model/fantasy/FantasyEventsResponse;", "getFixtures", "roundCount", "Lcom/sofascore/model/fantasy/FantasyFixtureDifficultyResponse;", "getCompetitionNextFixturesFDR", "hasCompetitionFDR", "userHasSquadForRound", "", "Lcom/sofascore/model/fantasy/FantasyPlayerPostModel;", "players", "autoSelectSquad", "(ILjava/util/List;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/fantasy/FantasyTeamOfTheRoundResponse;", "getTeamOfTheRound", "Lcom/sofascore/model/fantasy/FantasyTopPlayersPerRoundResponse;", "getTopPlayersPerRound", "Lcom/sofascore/model/fantasy/FantasyPlayerCompetitionsResponse;", "getPlayerFantasyCompetitions", "getHasPlayerFantasyCompetitions", "Lcom/sofascore/model/fantasy/FantasyCreateLeagueBody;", "Lcom/sofascore/model/fantasy/FantasyUserLeague;", "createLeague", "(Lcom/sofascore/model/fantasy/FantasyCreateLeagueBody;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/fantasy/FantasyEditLeagueBody;", "Lcom/sofascore/model/fantasy/FantasyLeagueResponse;", "editLeague", "(ILcom/sofascore/model/fantasy/FantasyEditLeagueBody;Lrq3;)Ljava/lang/Object;", "deleteLeague", "code", "joinLeague", "joinRandomLeague", "Lcom/sofascore/model/fantasy/FantasyLeagueJoinCodeResponse;", "getLeagueJoinCode", "regenerateLeagueJoinCode", "Lcom/sofascore/model/fantasy/FantasyLeagueKickUserBody;", "kickUserFromLeague", "(ILcom/sofascore/model/fantasy/FantasyLeagueKickUserBody;Lrq3;)Ljava/lang/Object;", "getUserLeagueLeaderboards", "getLeague", "Lcom/sofascore/model/fantasy/FantasyLeagueConfigResponse;", "getLeagueConfig", "leaveLeague", "Lcom/sofascore/model/fantasy/FantasyLeagueParticipantsResponse;", "getLeagueTeams", "(IILjava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/fantasy/FantasyRoundResponse;", "getCompetitionRound", "Lcom/sofascore/model/fantasy/FantasyChatMessageTimestampResponse;", "getLeagueChatLastMessageTimestamp", "Lcom/sofascore/model/fantasy/FantasyTransfersResponse;", "getUserCompetitionTransfers", "country", "Lcom/sofascore/model/fantasy/FantasyUniqueTournamentCompetitionMapping;", "getUniqueTournamentCompetitionMapping", "Lcom/sofascore/model/fantasy/FantasyCompetitionAgeGroupsResponse;", "getFantasyCompetitionAgeGroups", "(ILjava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/fantasy/FantasyPointsForEventResponse;", "getFantasyPointsForEvent", "locale", "Lcom/sofascore/model/fantasy/FantasyNewsArticlesResponse;", "getFantasyNewsArticles", "Lcom/sofascore/model/fantasy/FantasyRoundPlayerStatisticsResponse;", "getRoundPlayerStatistics", "network_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FantasyAPI extends FantasyHeadAPI {
    @i0e("api/v1/fantasy/competition/{competitionId}/squad/auto-select")
    @Nullable
    Object autoSelectSquad(@vae("competitionId") int i, @yy1 @NotNull List<FantasyPlayerPostModel> list, @NotNull rq3<? super FantasySquadResponse> rq3Var);

    @i0e("api/v1/fantasy/league")
    @Nullable
    Object createLeague(@yy1 @NotNull FantasyCreateLeagueBody fantasyCreateLeagueBody, @NotNull rq3<? super FantasyUserLeague> rq3Var);

    @i0e("api/v1/fantasy/competition/{id}/squad/create")
    @Nullable
    Object createTeam(@vae("id") int i, @yy1 @NotNull FantasyCreateTeamPostBody fantasyCreateTeamPostBody, @NotNull rq3<? super FantasyCreateTeamResponse> rq3Var);

    @kb4("api/v1/fantasy/league/{id}")
    @Nullable
    Object deleteLeague(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @kb4("api/v1/fantasy/competition/{id}/squad")
    @Nullable
    Object deleteTeam(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @czd("api/v1/fantasy/league/{id}")
    @Nullable
    Object editLeague(@vae("id") int i, @yy1 @NotNull FantasyEditLeagueBody fantasyEditLeagueBody, @NotNull rq3<? super FantasyLeagueResponse> rq3Var);

    @h3e("api/v1/fantasy/user-competition/{id}")
    @Nullable
    Object editTeamName(@vae("id") int i, @yy1 @NotNull FantasyEditTeamNameBody fantasyEditTeamNameBody, @NotNull rq3<? super FantasyUserCompetitionResponse> rq3Var);

    @iu8("api/v1/fantasy/competition/{id}")
    @Nullable
    Object getCompetition(@vae("id") int i, @NotNull rq3<? super FantasyCompetitionResponse> rq3Var);

    @iu8("api/v1/fantasy/competition/{competitionId}/fixture-difficulties/next-rounds/{roundCount}")
    @Nullable
    Object getCompetitionNextFixturesFDR(@vae("competitionId") int i, @vae("roundCount") int i2, @NotNull rq3<? super FantasyFixtureDifficultyResponse> rq3Var);

    @iu8("api/v1/fantasy/competition/{id}/price-changes")
    @Nullable
    Object getCompetitionPriceChanges(@vae("id") int i, @NotNull rq3<? super FantasyCompetitionPriceChangesResponse> rq3Var);

    @iu8("api/v1/fantasy/round/{id}")
    @Nullable
    Object getCompetitionRound(@vae("id") int i, @NotNull rq3<? super FantasyRoundResponse> rq3Var);

    @iu8("api/v1/fantasy/round/{roundId}/filters")
    @Nullable
    Object getCompetitionRoundFilterOptions(@vae("roundId") int i, @NotNull rq3<? super FantasyCompetitionFiltersResponse> rq3Var);

    @iu8("api/v1/fantasy/competition/{id}/rounds")
    @Nullable
    Object getCompetitionRounds(@vae("id") int i, @NotNull rq3<? super FantasyRoundsResponse> rq3Var);

    @iu8("api/v1/fantasy/competition/{id}/top-players")
    @Nullable
    Object getCompetitionTopPlayers(@vae("id") int i, @NotNull rq3<? super FantasyTopPlayersResponse> rq3Var);

    @iu8("api/v1/fantasy/competition/active-competitions")
    @Nullable
    Object getCompetitions(@qif("type") @Nullable Integer num, @NotNull rq3<? super FantasyCompetitionsResponse> rq3Var);

    @iu8("api/v1/fantasy/competition/{competitionId}/{country}/user-age-groups")
    @Nullable
    Object getFantasyCompetitionAgeGroups(@vae("competitionId") int i, @NotNull @vae("country") String str, @NotNull rq3<? super FantasyCompetitionAgeGroupsResponse> rq3Var);

    @iu8("api/v1/fantasy/news/{locale}")
    @Nullable
    Object getFantasyNewsArticles(@NotNull @vae("locale") String str, @NotNull rq3<? super FantasyNewsArticlesResponse> rq3Var);

    @iu8("api/v1/fantasy/event/{eventId}")
    @Nullable
    Object getFantasyPointsForEvent(@vae("eventId") int i, @NotNull rq3<? super FantasyPointsForEventResponse> rq3Var);

    @iu8("api/v1/fantasy/round/{roundId}/events")
    @Nullable
    Object getFixtures(@vae("roundId") int i, @NotNull rq3<? super FantasyEventsResponse> rq3Var);

    @s59("api/v1/fantasy/player/{playerId}/competitions")
    @Nullable
    Object getHasPlayerFantasyCompetitions(@vae("playerId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @iu8("api/v1/fantasy/league/{id}")
    @Nullable
    Object getLeague(@vae("id") int i, @NotNull rq3<? super FantasyLeagueResponse> rq3Var);

    @iu8("api/v1/chat/topic/fantasy.league.{id}/last-message")
    @Nullable
    Object getLeagueChatLastMessageTimestamp(@vae("id") int i, @NotNull rq3<? super FantasyChatMessageTimestampResponse> rq3Var);

    @iu8("api/v1/fantasy/league/{id}/config")
    @Nullable
    Object getLeagueConfig(@vae("id") int i, @NotNull rq3<? super FantasyLeagueConfigResponse> rq3Var);

    @i0e("api/v1/fantasy/league/{id}/join-code")
    @Nullable
    Object getLeagueJoinCode(@vae("id") int i, @NotNull rq3<? super FantasyLeagueJoinCodeResponse> rq3Var);

    @iu8("api/v1/fantasy/league/{leagueId}/{page}")
    @Nullable
    Object getLeagueLeaderboard(@vae("leagueId") int i, @vae("page") int i2, @NotNull rq3<? super FantasyLeagueLeaderboardResponse> rq3Var);

    @iu8("api/v1/fantasy/league/{leagueId}/round/{roundId}/{page}")
    @Nullable
    Object getLeagueLeaderboardForRound(@vae("leagueId") int i, @vae("roundId") int i2, @vae("page") int i3, @NotNull rq3<? super FantasyLeagueLeaderboardResponse> rq3Var);

    @iu8("api/v1/fantasy/league/{leagueId}/round/{roundId}/matchups")
    @Nullable
    Object getLeagueMatchupsForRound(@vae("leagueId") int i, @vae("roundId") int i2, @NotNull rq3<? super FantasyLeagueMatchupsResponse> rq3Var);

    @iu8("api/v1/fantasy/league/{leagueId}/round/{roundId}/squads")
    @Nullable
    Object getLeagueRoundSquads(@vae("leagueId") int i, @vae("roundId") int i2, @NotNull rq3<? super FantasyLeagueRoundSquadsResponse> rq3Var);

    @iu8("api/v1/fantasy/league/{id}/participants")
    @Nullable
    Object getLeagueTeams(@vae("id") int i, @qif("page") int i2, @qif("q") @Nullable String str, @NotNull rq3<? super FantasyLeagueParticipantsResponse> rq3Var);

    @iu8("api/v1/fantasy/player/{id}")
    @Nullable
    Object getPlayer(@vae("id") int i, @NotNull rq3<? super FantasyPlayerResponse> rq3Var);

    @iu8("api/v1/fantasy/player/{fantasyPlayerId}/fixtures/all")
    @Nullable
    Object getPlayerCompleteFormAndFixtures(@vae("fantasyPlayerId") int i, @NotNull rq3<? super FantasyPlayerFormAndFixturesResponse> rq3Var);

    @iu8("api/v1/fantasy/player/{playerId}/event/{eventId}/competition/{competitionId}")
    @Nullable
    Object getPlayerEventPointsBreakdown(@vae("eventId") int i, @vae("playerId") int i2, @vae("competitionId") int i3, @NotNull rq3<? super FantasyPlayerPointsBreakdownResponse> rq3Var);

    @iu8("api/v1/fantasy/player/{playerId}/competitions")
    @Nullable
    Object getPlayerFantasyCompetitions(@vae("playerId") int i, @NotNull rq3<? super FantasyPlayerCompetitionsResponse> rq3Var);

    @iu8("api/v1/fantasy/player/{id}/price-history")
    @Nullable
    Object getPlayerPriceHistory(@vae("id") int i, @NotNull rq3<? super FantasyPlayerPriceHistoryResponse> rq3Var);

    @iu8("api/v1/fantasy/player/{fantasyPlayerId}/fixtures")
    @Nullable
    Object getPlayerRecentFormAndFixtures(@vae("fantasyPlayerId") int i, @NotNull rq3<? super FantasyPlayerFormAndFixturesResponse> rq3Var);

    @iu8("api/v1/fantasy/player/{fantasyPlayerId}/round/{roundId}")
    @Nullable
    Object getRoundPlayer(@vae("roundId") int i, @vae("fantasyPlayerId") int i2, @NotNull rq3<? super FantasyRoundPlayerResponse> rq3Var);

    @iu8("api/v1/fantasy/player/{roundPlayerId}/score")
    @Nullable
    Object getRoundPlayerScore(@vae("roundPlayerId") int i, @NotNull rq3<? super FantasyRoundPlayerScoreResponse> rq3Var);

    @iu8("api/v1/fantasy/round/{id}/player-statistics")
    @Nullable
    Object getRoundPlayerStatistics(@vae("id") int i, @NotNull rq3<? super FantasyRoundPlayerStatisticsResponse> rq3Var);

    @iu8("api/v1/fantasy/round/{id}/players")
    @Nullable
    Object getRoundPlayers(@vae("id") int i, @qif("page") int i2, @qif("q") @Nullable String str, @qif("position") @Nullable String str2, @qif("teamId") @Nullable Integer num, @qif("maxPrice") @Nullable Float f, @qif("sortParam") @Nullable String str3, @qif("sortOrder") @Nullable String str4, @NotNull rq3<? super FantasyCompetitionPlayersResponse> rq3Var);

    @iu8("api/v1/fantasy/round/{roundId}/team-of-the-round")
    @Nullable
    Object getTeamOfTheRound(@vae("roundId") int i, @NotNull rq3<? super FantasyTeamOfTheRoundResponse> rq3Var);

    @iu8("api/v1/fantasy/competition/{competitionId}/top-players-per-round")
    @Nullable
    Object getTopPlayersPerRound(@vae("competitionId") int i, @NotNull rq3<? super FantasyTopPlayersPerRoundResponse> rq3Var);

    @iu8("api/v1/fantasy/competition/{country}/by-unique-tournament")
    @Nullable
    Object getUniqueTournamentCompetitionMapping(@NotNull @vae("country") String str, @NotNull rq3<? super FantasyUniqueTournamentCompetitionMapping> rq3Var);

    @iu8("api/v1/fantasy/competition/upcoming-competitions")
    @Nullable
    Object getUpcomingCompetitions(@NotNull rq3<? super FantasyBasicCompetitionsResponse> rq3Var);

    @iu8("api/v1/fantasy/user/{userId}/competition/{competitionId}")
    @Nullable
    Object getUserCompetition(@NotNull @vae("userId") String str, @vae("competitionId") int i, @NotNull rq3<? super FantasyUserCompetitionResponse> rq3Var);

    @iu8("api/v1/fantasy/user/{userId}/competition/{competitionId}/rounds")
    @Nullable
    Object getUserCompetitionRounds(@NotNull @vae("userId") String str, @vae("competitionId") int i, @NotNull rq3<? super FantasyUserRoundsResponse> rq3Var);

    @iu8("api/v1/fantasy/user/{userId}/competition/{competitionId}/transfers")
    @Nullable
    Object getUserCompetitionTransfers(@NotNull @vae("userId") String str, @vae("competitionId") int i, @NotNull rq3<? super FantasyTransfersResponse> rq3Var);

    @iu8("api/v1/fantasy/user/{id}/competitions")
    @Nullable
    Object getUserCompetitions(@NotNull @vae("id") String str, @NotNull rq3<? super FantasyUserCompetitionsResponse> rq3Var);

    @iu8("api/v1/fantasy/user/{id}/finished-competitions")
    @Nullable
    Object getUserFinishedCompetitions(@NotNull @vae("id") String str, @NotNull rq3<? super FantasyUserCompetitionsResponse> rq3Var);

    @iu8("api/v1/fantasy/user/{userId}/league/{leagueId}/leaderboards")
    @Nullable
    Object getUserLeagueLeaderboards(@NotNull @vae("userId") String str, @vae("leagueId") int i, @NotNull rq3<? super FantasyUserLeaguesResponse> rq3Var);

    @iu8("api/v1/fantasy/user/{userId}/competition/{competitionId}/leagues")
    @Nullable
    Object getUserLeagues(@NotNull @vae("userId") String str, @vae("competitionId") int i, @NotNull rq3<? super FantasyUserLeaguesResponse> rq3Var);

    @iu8("api/v1/fantasy/user/{userId}/round/{roundId}")
    @Nullable
    Object getUserRound(@NotNull @vae("userId") String str, @vae("roundId") int i, @NotNull rq3<? super FantasyUserRoundResponse> rq3Var);

    @iu8("api/v1/fantasy/user/{userId}/round/{roundId}/ranking-overview")
    @Nullable
    Object getUserRoundRankings(@NotNull @vae("userId") String str, @vae("roundId") int i, @NotNull rq3<? super FantasyUserRoundRankingsResponse> rq3Var);

    @iu8("api/v1/fantasy/user/{userId}/round/{roundId}/squad")
    @Nullable
    Object getUserRoundSquad(@NotNull @vae("userId") String str, @vae("roundId") int i, @NotNull rq3<? super FantasyUserRoundSquadResponse> rq3Var);

    @s59("api/v1/fantasy/competition/{competitionId}/fixture-difficulties/next-rounds")
    @Nullable
    Object hasCompetitionFDR(@vae("competitionId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/fantasy/league/join/{code}")
    @Nullable
    Object joinLeague(@NotNull @vae("code") String str, @NotNull rq3<? super FantasyUserLeague> rq3Var);

    @i0e("api/v1/fantasy/league/join/random/{competitionId}")
    @Nullable
    Object joinRandomLeague(@vae("competitionId") int i, @NotNull rq3<? super FantasyUserLeague> rq3Var);

    @i0e("api/v1/fantasy/league/{id}/kick")
    @Nullable
    Object kickUserFromLeague(@vae("id") int i, @yy1 @NotNull FantasyLeagueKickUserBody fantasyLeagueKickUserBody, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/fantasy/league/{id}/leave")
    @Nullable
    Object leaveLeague(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/fantasy/round/{id}/squad/substitute")
    @Nullable
    Object postSubstitutions(@vae("id") int i, @yy1 @NotNull FantasySubstitutionsPostBody fantasySubstitutionsPostBody, @NotNull rq3<? super FantasySquadResponse> rq3Var);

    @i0e("api/v1/fantasy/competition/{id}/squad/transfer")
    @Nullable
    Object postTransfers(@vae("id") int i, @yy1 @NotNull FantasyTransfersPostBody fantasyTransfersPostBody, @NotNull rq3<? super FantasySquadResponse> rq3Var);

    @i0e("api/v1/fantasy/league/{id}/regenerate-join-code")
    @Nullable
    Object regenerateLeagueJoinCode(@vae("id") int i, @NotNull rq3<? super FantasyLeagueJoinCodeResponse> rq3Var);

    @czd("api/v1/fantasy/competition/{id}/squad/update")
    @Nullable
    Object updateTeam(@vae("id") int i, @yy1 @NotNull FantasyUpdateTeamPostBody fantasyUpdateTeamPostBody, @NotNull rq3<? super FantasySquadResponse> rq3Var);

    @s59("api/v1/fantasy/user/{userId}/round/{roundId}/squad")
    @Nullable
    Object userHasSquadForRound(@NotNull @vae("userId") String str, @vae("roundId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);
}
