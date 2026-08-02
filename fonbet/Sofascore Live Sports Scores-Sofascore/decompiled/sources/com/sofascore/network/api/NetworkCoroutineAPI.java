package com.sofascore.network.api;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.GoogleTranslate;
import com.sofascore.model.TvType;
import com.sofascore.model.branding.ServerBrandingConfigResponse;
import com.sofascore.model.buzzer.BuzzerConfigResponse;
import com.sofascore.model.buzzer.BuzzerConfigResponseKt;
import com.sofascore.model.buzzer.BuzzerTilesResponse;
import com.sofascore.model.buzzer.NewBuzzerTilesResponse;
import com.sofascore.model.chat.BanReason;
import com.sofascore.model.crowdsourcing.CrowdsourcingSuggestRequest;
import com.sofascore.model.crowdsourcing.EventSuggestRequest;
import com.sofascore.model.crowdsourcing.GetCrowdsourcingEventContributionsResponse;
import com.sofascore.model.crowdsourcing.LatestCrowdsourcingSuggestResponse;
import com.sofascore.model.crowdsourcing.MyContributionsResponse;
import com.sofascore.model.cuptree.CupTreesResponse;
import com.sofascore.model.mvvm.model.OffersBannerResponse;
import com.sofascore.model.network.post.FeedbackPost;
import com.sofascore.model.network.response.AddedEventsResponse;
import com.sofascore.model.network.response.AiInsightsNextResponse;
import com.sofascore.model.network.response.AveragePositionsResponse;
import com.sofascore.model.network.response.CurrentlyRelevantEventsResponse;
import com.sofascore.model.network.response.EventBetBoostsResponse;
import com.sofascore.model.network.response.EventInningsResponse;
import com.sofascore.model.network.response.EventManagersResponse;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.network.response.EventStatisticsResponse;
import com.sofascore.model.network.response.EventTeamHeatmapResponse;
import com.sofascore.model.network.response.EventUmpiresResponse;
import com.sofascore.model.network.response.EventWeatherResponse;
import com.sofascore.model.network.response.FeaturedEventResponse;
import com.sofascore.model.network.response.GoalDistributionsResponse;
import com.sofascore.model.network.response.Head2HeadEventsResponse;
import com.sofascore.model.network.response.Head2HeadResponse;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.network.response.MediaHighlightSummaryResponse;
import com.sofascore.model.network.response.MessageCountResponse;
import com.sofascore.model.network.response.PickemResponse;
import com.sofascore.model.network.response.PlayerEventStatisticsResponse;
import com.sofascore.model.network.response.PlayerSeasonShotActionsResponse;
import com.sofascore.model.network.response.SearchResponse;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.SeasonShotActionAreaResponse;
import com.sofascore.model.network.response.SignupLinkResponse;
import com.sofascore.model.network.response.SofaSeasonResponse;
import com.sofascore.model.network.response.TeamEventShotmapResponse;
import com.sofascore.model.network.response.TeamRssFeedResponse;
import com.sofascore.model.network.response.TeamStreaksResponse;
import com.sofascore.model.network.response.TweetsResponse;
import com.sofascore.model.network.response.UserRegionResponse;
import com.sofascore.model.network.response.VotesResponse;
import com.sofascore.model.network.response.WinningOddsResponse;
import com.sofascore.model.network.response.bettingtips.BetBoostsResponse;
import com.sofascore.model.network.response.bettingtips.DroppingOddsResponse;
import com.sofascore.model.network.response.bettingtips.H2HStreaksResponse;
import com.sofascore.model.network.response.bettingtips.HighValueStreaksResponse;
import com.sofascore.model.network.response.bettingtips.TrendingOddsResponse;
import com.sofascore.model.network.response.playerOfTheSeason.POTSHighestRatedPlayersAvailableYears;
import com.sofascore.model.network.response.playerOfTheSeason.POTSHighestRatedPlayersResponse;
import com.sofascore.model.network.response.playerOfTheSeason.POTSLeagueTopPlayersResponse;
import com.sofascore.model.network.response.playerOfTheSeason.POTSMostAwardsResponse;
import com.sofascore.model.network.response.playerOfTheSeason.POTSPlayerAwardsResponse;
import com.sofascore.model.network.response.playerOfTheSeason.POTSTopCompetitionsResponse;
import com.sofascore.model.newNetwork.AdditionalOddsResponse;
import com.sofascore.model.newNetwork.AffiliateBannersResponse;
import com.sofascore.model.newNetwork.AiInsightsResponse;
import com.sofascore.model.newNetwork.AllOddsResponse;
import com.sofascore.model.newNetwork.ApiBranchesResponse;
import com.sofascore.model.newNetwork.AttributeOverviewResponse;
import com.sofascore.model.newNetwork.AvailableSportFiltersResponse;
import com.sofascore.model.newNetwork.BaseballAtBatsResponse;
import com.sofascore.model.newNetwork.BaseballEventTopPerformersResponse;
import com.sofascore.model.newNetwork.CareerHistoryResponse;
import com.sofascore.model.newNetwork.CategoriesForDateResponse;
import com.sofascore.model.newNetwork.CategoryUniqueStagesResponse;
import com.sofascore.model.newNetwork.CategoryUniqueTournamentResponse;
import com.sofascore.model.newNetwork.ChangeEventVoteBody;
import com.sofascore.model.newNetwork.ChatMessagesResponse;
import com.sofascore.model.newNetwork.ChronologicalListIndexesResponse;
import com.sofascore.model.newNetwork.CricketRunsPerOverGraphResponse;
import com.sofascore.model.newNetwork.DefaultPinnedLeaguesResponse;
import com.sofascore.model.newNetwork.DriverRacesResponse;
import com.sofascore.model.newNetwork.ESportsBansResponse;
import com.sofascore.model.newNetwork.ESportsGameLineupsResponse;
import com.sofascore.model.newNetwork.ESportsGameRoundsResponse;
import com.sofascore.model.newNetwork.EsportsGameStatisticsResponse;
import com.sofascore.model.newNetwork.EsportsGamesResponse;
import com.sofascore.model.newNetwork.EventBestPlayersResponse;
import com.sofascore.model.newNetwork.EventBestPlayersSummaryResponse;
import com.sofascore.model.newNetwork.EventChildEventsResponse;
import com.sofascore.model.newNetwork.EventGraphResponse;
import com.sofascore.model.newNetwork.EventGraphSequenceResponse;
import com.sofascore.model.newNetwork.EventIdsResponse;
import com.sofascore.model.newNetwork.EventIncidentsResponse;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.EventMediaNewsResponse;
import com.sofascore.model.newNetwork.EventSeriesResponse;
import com.sofascore.model.newNetwork.EventVoteBody;
import com.sofascore.model.newNetwork.EventsByMonthResponse;
import com.sofascore.model.newNetwork.FanPlayerOfTheMatchResponse;
import com.sofascore.model.newNetwork.FeaturedEventsResponse;
import com.sofascore.model.newNetwork.FeaturedOddsResponse;
import com.sofascore.model.newNetwork.FeaturedPrematchOddsResponse;
import com.sofascore.model.newNetwork.FootballEventPlayerRatingBreakdownResponse;
import com.sofascore.model.newNetwork.FootballShotmapResponse;
import com.sofascore.model.newNetwork.HighlightsResponse;
import com.sofascore.model.newNetwork.HistoricalSeasonComparisonResponse;
import com.sofascore.model.newNetwork.HockeyEventShotmapResponse;
import com.sofascore.model.newNetwork.HockeyPlayerShotmapResponse;
import com.sofascore.model.newNetwork.InfoResponse;
import com.sofascore.model.newNetwork.LiveCategoriesResponse;
import com.sofascore.model.newNetwork.ManagerDetailsResponse;
import com.sofascore.model.newNetwork.ManagerEventsResponse;
import com.sofascore.model.newNetwork.MatchdayHighlightsResponse;
import com.sofascore.model.newNetwork.MediaResponse;
import com.sofascore.model.newNetwork.MediaVideoResponse;
import com.sofascore.model.newNetwork.MmaEventListResponse;
import com.sofascore.model.newNetwork.MmaMonthsWithEventsResponse;
import com.sofascore.model.newNetwork.MonthlyStages;
import com.sofascore.model.newNetwork.MonthlyUniqueTournamentsResponse;
import com.sofascore.model.newNetwork.NationalTeamStatisticsResponse;
import com.sofascore.model.newNetwork.NetworkResponse;
import com.sofascore.model.newNetwork.NetworkUserSegmentation;
import com.sofascore.model.newNetwork.OddsProviderDetailsResponse;
import com.sofascore.model.newNetwork.OddsProvidersResponse;
import com.sofascore.model.newNetwork.OrderedSportsResponse;
import com.sofascore.model.newNetwork.PerformanceGraphDataResponse;
import com.sofascore.model.newNetwork.PlayerCharacteristicsResponse;
import com.sofascore.model.newNetwork.PlayerDetailsResponse;
import com.sofascore.model.newNetwork.PlayerEventsListResponse;
import com.sofascore.model.newNetwork.PlayerHeatmapResponse;
import com.sofascore.model.newNetwork.PlayerOfTheMatchVoteBody;
import com.sofascore.model.newNetwork.PlayerOfTheSeasonResponse;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse;
import com.sofascore.model.newNetwork.PlayerSeasonHeatMapResponse;
import com.sofascore.model.newNetwork.PlayerSeasonRatingsResponse;
import com.sofascore.model.newNetwork.PlayerShotmapResponse;
import com.sofascore.model.newNetwork.PlayerUniqueTournamentsResponse;
import com.sofascore.model.newNetwork.PlayerYearSummaryResponse;
import com.sofascore.model.newNetwork.PointByPointResponse;
import com.sofascore.model.newNetwork.PostChatMessage;
import com.sofascore.model.newNetwork.PostUserBadge;
import com.sofascore.model.newNetwork.PostUserNickname;
import com.sofascore.model.newNetwork.PowerRankingResponse;
import com.sofascore.model.newNetwork.PowerRankingRoundsResponse;
import com.sofascore.model.newNetwork.PowerRankingsGraphDataResponse;
import com.sofascore.model.newNetwork.PregameFormResponse;
import com.sofascore.model.newNetwork.RecentStageIdsResponse;
import com.sofascore.model.newNetwork.RecentTeamTournamentsResponse;
import com.sofascore.model.newNetwork.RefereeDetailsResponse;
import com.sofascore.model.newNetwork.RefereeStatisticsResponse;
import com.sofascore.model.newNetwork.RiskyTopicsResponse;
import com.sofascore.model.newNetwork.SearchManagersResponse;
import com.sofascore.model.newNetwork.SearchPlayersResponse;
import com.sofascore.model.newNetwork.SearchTeamsResponse;
import com.sofascore.model.newNetwork.SearchTournamentsResponse;
import com.sofascore.model.newNetwork.SearchVenuesResponse;
import com.sofascore.model.newNetwork.SeasonDaysWithEventsResponse;
import com.sofascore.model.newNetwork.SeasonInfoResponse;
import com.sofascore.model.newNetwork.SeasonStatisticsResponse;
import com.sofascore.model.newNetwork.SportCategoriesResponse;
import com.sofascore.model.newNetwork.SportItem;
import com.sofascore.model.newNetwork.SportRadarStreamUrlResponse;
import com.sofascore.model.newNetwork.SportRadarTokenResponse;
import com.sofascore.model.newNetwork.StageDriverPerformanceGraphResponse;
import com.sofascore.model.newNetwork.StageFeaturedOddsResponse;
import com.sofascore.model.newNetwork.StageOddsResponse;
import com.sofascore.model.newNetwork.StageRacesResponse;
import com.sofascore.model.newNetwork.StageResponse;
import com.sofascore.model.newNetwork.StageSeasonsResponse;
import com.sofascore.model.newNetwork.StageSportSeasonsResponse;
import com.sofascore.model.newNetwork.StageStandingsResponse;
import com.sofascore.model.newNetwork.StageTeamHistoryResponse;
import com.sofascore.model.newNetwork.StagesListResponse;
import com.sofascore.model.newNetwork.StandingsFormMultipleTournamentsResponse;
import com.sofascore.model.newNetwork.StandingsFormResponse;
import com.sofascore.model.newNetwork.StandingsResponse;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.model.newNetwork.SuggestedPlayersResponse;
import com.sofascore.model.newNetwork.SurveyAnswersPost;
import com.sofascore.model.newNetwork.SurveyResponse;
import com.sofascore.model.newNetwork.TeamAchievementsResponse;
import com.sofascore.model.newNetwork.TeamCareerStatisticsResponse;
import com.sofascore.model.newNetwork.TeamDetailsResponse;
import com.sofascore.model.newNetwork.TeamFeaturedPlayersResponse;
import com.sofascore.model.newNetwork.TeamNearEventsResponse;
import com.sofascore.model.newNetwork.TeamOfThePeriodRoundsResponse;
import com.sofascore.model.newNetwork.TeamOfTheWeekResponse;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponse;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import com.sofascore.model.newNetwork.TeamPlayerSeasonStatisticsResponse;
import com.sofascore.model.newNetwork.TeamPlayersResponse;
import com.sofascore.model.newNetwork.TeamSeasonPlacementResponse;
import com.sofascore.model.newNetwork.TeamStreakBettingOddsResponse;
import com.sofascore.model.newNetwork.TeamSuggestionResponse;
import com.sofascore.model.newNetwork.TeamTransfersResponse;
import com.sofascore.model.newNetwork.TeamUniqueTournamentsResponse;
import com.sofascore.model.newNetwork.TennisGrandSlamPerformanceResponse;
import com.sofascore.model.newNetwork.TennisPowerResponse;
import com.sofascore.model.newNetwork.TopFollowedPlayersResponse;
import com.sofascore.model.newNetwork.TournamentResponse;
import com.sofascore.model.newNetwork.TournamentSeasonsResponse;
import com.sofascore.model.newNetwork.TournamentsForDateResponse;
import com.sofascore.model.newNetwork.TransferHistoryResponse;
import com.sofascore.model.newNetwork.TransfersResponse;
import com.sofascore.model.newNetwork.TranslationResponse;
import com.sofascore.model.newNetwork.TrendingGridTilesResponse;
import com.sofascore.model.newNetwork.TvChannelScheduleResponse;
import com.sofascore.model.newNetwork.TvChannelVoteBody;
import com.sofascore.model.newNetwork.TvChannelVotesResponse;
import com.sofascore.model.newNetwork.TvChannelsResponse;
import com.sofascore.model.newNetwork.TvCountryChannelsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentAwardsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentChampionsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentDetailsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentDivisionsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentDraftInfoResponse;
import com.sofascore.model.newNetwork.UniqueTournamentDraftPicksResponse;
import com.sofascore.model.newNetwork.UniqueTournamentGroupsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentKeyPlayersResponse;
import com.sofascore.model.newNetwork.UniqueTournamentLastDanceResponse;
import com.sofascore.model.newNetwork.UniqueTournamentLotteryProbabilityResponse;
import com.sofascore.model.newNetwork.UniqueTournamentPlayerTransactionsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentPlayerUpdatesResponse;
import com.sofascore.model.newNetwork.UniqueTournamentPreviousWinnersResponse;
import com.sofascore.model.newNetwork.UniqueTournamentProspectsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentRecapTopPerformancesResponse;
import com.sofascore.model.newNetwork.UniqueTournamentResponse;
import com.sofascore.model.newNetwork.UniqueTournamentRoundsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentSuggestionResponse;
import com.sofascore.model.newNetwork.UniqueTournamentTeamsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentTopPerformersResponse;
import com.sofascore.model.newNetwork.UniqueTournamentVenuesResponse;
import com.sofascore.model.newNetwork.UserPlayerOfTheMatchVotesResponse;
import com.sofascore.model.newNetwork.UserPredictionsResponse;
import com.sofascore.model.newNetwork.UserPredictionsVotesResponse;
import com.sofascore.model.newNetwork.ValuableUserResponse;
import com.sofascore.model.newNetwork.VenueResponse;
import com.sofascore.model.newNetwork.VenueSportsResponse;
import com.sofascore.model.newNetwork.WSCStoriesResponse;
import com.sofascore.model.newNetwork.YoutubeVideoResponse;
import com.sofascore.model.newNetwork.commentary.CommentaryResponse;
import com.sofascore.model.newNetwork.commentary.HockeyPlayByPlayResponse;
import com.sofascore.model.newNetwork.cpc.ValuableUserVersionsResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPostReactionsResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPostResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaReactionPost;
import com.sofascore.model.newNetwork.mediaposts.PersonalizedMLMediaResponse;
import com.sofascore.model.newNetwork.newRankings.Ranking;
import com.sofascore.model.newNetwork.newRankings.RankingsSummaryResponse;
import com.sofascore.model.newNetwork.post.FighterSuggestPostBody;
import com.sofascore.model.newNetwork.post.ImageUploadResponse;
import com.sofascore.model.newNetwork.post.PlayerSuggestPostBody;
import com.sofascore.model.newNetwork.post.PremiumTokenResponse;
import com.sofascore.model.newNetwork.post.ProfileImageUploadResponse;
import com.sofascore.model.newNetwork.post.TeamSuggestPostBody;
import com.sofascore.model.newNetwork.post.TransferSuggestPostBody;
import com.sofascore.model.newNetwork.post.UserPurchasePostBody;
import com.sofascore.model.newNetwork.post.VenueSuggestPostBody;
import com.sofascore.model.newNetwork.statistics.BaseballPitchesResponse;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballPlayerSeasonRankedStatisticsResponse;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatisticsResponse;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsResponse;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatisticsResponse;
import com.sofascore.model.newNetwork.statistics.season.team.TennisTeamYearlyStatisticsResponse;
import com.sofascore.model.newNetwork.topperformance.TeamTopPlayerResponse;
import com.sofascore.model.newNetwork.topperformance.TopPerformanceResponse;
import com.sofascore.model.newNetwork.topperformance.response.LeagueGoatPlayerVoteBody;
import com.sofascore.model.newNetwork.topperformance.response.LeagueGoatPlayerVotesResponse;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import com.sofascore.model.profile.ContributionSummaryResponse;
import com.sofascore.model.profile.ContributionsResponse;
import com.sofascore.model.profile.EditorEventOpeningsGraphResponse;
import com.sofascore.model.profile.EditorsEventsCountResponse;
import com.sofascore.model.profile.EditorsPopularEventsResponse;
import com.sofascore.model.profile.EditorsTournamentsResponse;
import com.sofascore.model.profile.LeagueEditorsResponse;
import com.sofascore.model.profile.ProfileNetworkResponse;
import com.sofascore.model.profile.ReferralResponse;
import com.sofascore.model.profile.ReferralShareLink;
import com.sofascore.model.profile.UserBadgesResponse;
import com.sofascore.model.profile.UserSubscriptionsResponse;
import com.sofascore.model.profile.VoteRankingResponse;
import com.sofascore.model.weeklyChallenge.PopularEventsResponse;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeAssetsResponse;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeLeaderboardResponse;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeTimestampResponse;
import defpackage.c2g;
import defpackage.czc;
import defpackage.dzc;
import defpackage.h3e;
import defpackage.i0e;
import defpackage.iu8;
import defpackage.kb4;
import defpackage.kek;
import defpackage.qif;
import defpackage.r89;
import defpackage.rif;
import defpackage.rq3;
import defpackage.vae;
import defpackage.w79;
import defpackage.y9e;
import defpackage.yy1;
import defpackage.yzf;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000â\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000e\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u00020\u00142\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u001a\u0010\fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u001c\u0010\fJ\u0010\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010$\u001a\u00020#2\b\b\u0001\u0010!\u001a\u00020 2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\b$\u0010%J.\u0010(\u001a\u00020'2\b\b\u0001\u0010&\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020 2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*H§@¢\u0006\u0004\b+\u0010\u001fJ$\u0010/\u001a\u00020.2\b\b\u0001\u0010,\u001a\u00020\b2\b\b\u0001\u0010-\u001a\u00020\u0002H§@¢\u0006\u0004\b/\u0010\u0018J\u001a\u00101\u001a\u0002002\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b1\u0010\fJ\u001a\u00103\u001a\u0002022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b3\u0010\fJ\u001a\u00105\u001a\u0002042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b5\u0010\fJ\u001a\u00107\u001a\u0002062\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b7\u0010\fJ\u001a\u00109\u001a\u0002082\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b9\u0010\fJ\u001a\u0010;\u001a\u00020:2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b;\u0010\fJ\u001a\u0010=\u001a\u00020<2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b=\u0010\fJ\u001a\u0010?\u001a\u00020>2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b?\u0010\fJ\u001a\u0010A\u001a\u00020@2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\bA\u0010\fJ$\u0010D\u001a\u00020C2\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010B\u001a\u00020\bH§@¢\u0006\u0004\bD\u0010EJ$\u0010G\u001a\u00020F2\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010B\u001a\u00020\bH§@¢\u0006\u0004\bG\u0010EJ$\u0010J\u001a\u00020I2\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010H\u001a\u00020\bH§@¢\u0006\u0004\bJ\u0010EJ$\u0010K\u001a\u00020I2\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010H\u001a\u00020\bH§@¢\u0006\u0004\bK\u0010EJ$\u0010M\u001a\u00020L2\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010H\u001a\u00020\bH§@¢\u0006\u0004\bM\u0010EJ\u001a\u0010N\u001a\u00020I2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\bN\u0010\fJ\u001a\u0010P\u001a\u00020O2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\bP\u0010\fJ$\u0010R\u001a\u00020Q2\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010H\u001a\u00020\bH§@¢\u0006\u0004\bR\u0010EJ.\u0010V\u001a\u00020U2\b\b\u0001\u0010S\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0004\bV\u0010WJ\u001a\u0010Y\u001a\u00020X2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\bY\u0010\fJ\u001a\u0010\\\u001a\u00020[2\b\b\u0001\u0010Z\u001a\u00020\u0002H§@¢\u0006\u0004\b\\\u0010\u0011J\u001a\u0010^\u001a\u00020]2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b^\u0010\fJ\u001a\u0010`\u001a\u00020_2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b`\u0010\fJ$\u0010c\u001a\u00020b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010a\u001a\u00020\bH§@¢\u0006\u0004\bc\u0010EJ$\u0010e\u001a\u00020d2\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010H\u001a\u00020\bH§@¢\u0006\u0004\be\u0010EJ$\u0010g\u001a\u00020f2\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010H\u001a\u00020\bH§@¢\u0006\u0004\bg\u0010EJ.\u0010i\u001a\u00020h2\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010H\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0004\bi\u0010WJ\u001a\u0010j\u001a\u0002002\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\bj\u0010\fJ$\u0010l\u001a\u00020k2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010a\u001a\u00020\bH§@¢\u0006\u0004\bl\u0010EJ\u001a\u0010n\u001a\u00020m2\b\b\u0001\u0010Z\u001a\u00020\u0002H§@¢\u0006\u0004\bn\u0010\u0011J$\u0010q\u001a\u00020p2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010o\u001a\u00020\u0002H§@¢\u0006\u0004\bq\u0010\u0018J\u001a\u0010s\u001a\u00020r2\b\b\u0001\u0010H\u001a\u00020\bH§@¢\u0006\u0004\bs\u0010\fJ\u001a\u0010u\u001a\u00020t2\b\b\u0001\u0010H\u001a\u00020\bH§@¢\u0006\u0004\bu\u0010\fJ$\u0010y\u001a\u00020x2\b\b\u0001\u0010v\u001a\u00020\u00022\b\b\u0003\u0010w\u001a\u00020\u0002H§@¢\u0006\u0004\by\u0010\u0007J\u001a\u0010{\u001a\u00020z2\b\b\u0001\u0010H\u001a\u00020\bH§@¢\u0006\u0004\b{\u0010\fJ\u001a\u0010}\u001a\u00020|2\b\b\u0001\u0010H\u001a\u00020\bH§@¢\u0006\u0004\b}\u0010\fJ\u001a\u0010\u007f\u001a\u00020~2\b\b\u0001\u0010H\u001a\u00020\bH§@¢\u0006\u0004\b\u007f\u0010\fJ\u001d\u0010\u0081\u0001\u001a\u00030\u0080\u00012\b\b\u0001\u0010H\u001a\u00020\bH§@¢\u0006\u0005\b\u0081\u0001\u0010\fJ\u001d\u0010\u0083\u0001\u001a\u00030\u0082\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0083\u0001\u0010\fJ*\u0010\u0086\u0001\u001a\u00030\u0085\u00012\b\b\u0001\u0010\t\u001a\u00020\b2\u000b\b\u0001\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0005\b\u0086\u0001\u0010\u0018J\u001d\u0010\u0088\u0001\u001a\u00030\u0087\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0088\u0001\u0010\fJ(\u0010\u008b\u0001\u001a\u00030\u008a\u00012\b\b\u0001\u0010H\u001a\u00020\b2\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0005\b\u008b\u0001\u0010EJ4\u0010\u008d\u0001\u001a\u00030\u008a\u00012\b\b\u0001\u0010H\u001a\u00020\b2\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001JG\u0010\u0093\u0001\u001a\f\u0012\u0007\b\u0001\u0012\u00030\u0092\u00010\u0091\u00012\b\b\u0001\u0010H\u001a\u00020\b2\t\b\u0001\u0010\u008f\u0001\u001a\u00020\b2\t\b\u0001\u0010\u0090\u0001\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J2\u0010\u0096\u0001\u001a\u00030\u0095\u00012\b\b\u0001\u0010H\u001a\u00020\b2\t\b\u0001\u0010\u0090\u0001\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0096\u0001\u0010WJH\u0010\u0098\u0001\u001a\u00020h2\b\b\u0001\u0010H\u001a\u00020\b2\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\t\b\u0001\u0010\u0090\u0001\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u00022\t\b\u0001\u0010\u0097\u0001\u001a\u00020\u0002H§@¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J2\u0010\u009a\u0001\u001a\u00030\u0085\u00012\b\b\u0001\u0010H\u001a\u00020\b2\t\b\u0001\u0010\u008f\u0001\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0005\b\u009a\u0001\u0010WJ2\u0010\u009c\u0001\u001a\u00030\u009b\u00012\b\b\u0001\u0010H\u001a\u00020\b2\b\b\u0001\u0010S\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0006\b\u009c\u0001\u0010\u008e\u0001J\u001d\u0010\u009e\u0001\u001a\u00030\u009d\u00012\b\b\u0001\u0010H\u001a\u00020\bH§@¢\u0006\u0005\b\u009e\u0001\u0010\fJ3\u0010\u009e\u0001\u001a\u00030\u009d\u00012\b\b\u0001\u0010H\u001a\u00020\b2\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0006\b\u009e\u0001\u0010\u008e\u0001J\u001d\u0010\u009f\u0001\u001a\u00030\u009d\u00012\b\b\u0001\u0010H\u001a\u00020\bH§@¢\u0006\u0005\b\u009f\u0001\u0010\fJ<\u0010¡\u0001\u001a\u00030 \u00012\b\b\u0001\u0010H\u001a\u00020\b2\b\b\u0001\u0010S\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0006\b¡\u0001\u0010\u0094\u0001J<\u0010£\u0001\u001a\u00030¢\u00012\b\b\u0001\u0010H\u001a\u00020\b2\b\b\u0001\u0010S\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0006\b£\u0001\u0010\u0094\u0001J\u001c\u0010¤\u0001\u001a\u0002042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b¤\u0001\u0010\fJ\u001d\u0010¦\u0001\u001a\u00030¥\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b¦\u0001\u0010\fJ\u001d\u0010¨\u0001\u001a\u00030§\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b¨\u0001\u0010\fJ&\u0010©\u0001\u001a\u00020p2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010o\u001a\u00020\u0002H§@¢\u0006\u0005\b©\u0001\u0010\u0018J<\u0010ª\u0001\u001a\u00020U2\b\b\u0001\u0010S\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u00022\t\b\u0001\u0010\u0097\u0001\u001a\u00020\u0002H§@¢\u0006\u0006\bª\u0001\u0010«\u0001J\u001d\u0010\u00ad\u0001\u001a\u00030¬\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u00ad\u0001\u0010\fJ\u001d\u0010¯\u0001\u001a\u00030®\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b¯\u0001\u0010\fJ&\u0010°\u0001\u001a\u00020f2\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010H\u001a\u00020\bH§@¢\u0006\u0005\b°\u0001\u0010EJ'\u0010²\u0001\u001a\u00030±\u00012\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010H\u001a\u00020\bH§@¢\u0006\u0005\b²\u0001\u0010EJ\u001d\u0010´\u0001\u001a\u00030³\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b´\u0001\u0010\fJ\u001d\u0010¶\u0001\u001a\u00030µ\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b¶\u0001\u0010\fJ\u001d\u0010¸\u0001\u001a\u00030·\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b¸\u0001\u0010\fJ\u001d\u0010º\u0001\u001a\u00030¹\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bº\u0001\u0010\fJ'\u0010¼\u0001\u001a\u00030»\u00012\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010a\u001a\u00020\bH§@¢\u0006\u0005\b¼\u0001\u0010EJ(\u0010¿\u0001\u001a\u00030¾\u00012\t\b\u0001\u0010½\u0001\u001a\u00020\b2\b\b\u0001\u0010a\u001a\u00020\bH§@¢\u0006\u0005\b¿\u0001\u0010EJ'\u0010Á\u0001\u001a\u00030À\u00012\b\b\u0001\u0010B\u001a\u00020\b2\b\b\u0001\u0010a\u001a\u00020\bH§@¢\u0006\u0005\bÁ\u0001\u0010EJ(\u0010Ã\u0001\u001a\u00030À\u00012\t\b\u0001\u0010Â\u0001\u001a\u00020\b2\b\b\u0001\u0010a\u001a\u00020\bH§@¢\u0006\u0005\bÃ\u0001\u0010EJ(\u0010Ä\u0001\u001a\u00030À\u00012\t\b\u0001\u0010½\u0001\u001a\u00020\b2\b\b\u0001\u0010a\u001a\u00020\bH§@¢\u0006\u0005\bÄ\u0001\u0010EJ'\u0010Æ\u0001\u001a\u00030Å\u00012\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010a\u001a\u00020\bH§@¢\u0006\u0005\bÆ\u0001\u0010EJ'\u0010È\u0001\u001a\u00030Ç\u00012\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010a\u001a\u00020\bH§@¢\u0006\u0005\bÈ\u0001\u0010EJ'\u0010Ê\u0001\u001a\u00030É\u00012\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010a\u001a\u00020\bH§@¢\u0006\u0005\bÊ\u0001\u0010EJ\u001d\u0010Ì\u0001\u001a\u00030Ë\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bÌ\u0001\u0010\fJ\u001d\u0010Î\u0001\u001a\u00030Í\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bÎ\u0001\u0010\fJ\u001d\u0010Ð\u0001\u001a\u00030Ï\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bÐ\u0001\u0010\fJ\u001d\u0010Ñ\u0001\u001a\u00030Ï\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bÑ\u0001\u0010\fJ\u001d\u0010Ó\u0001\u001a\u00030Ò\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bÓ\u0001\u0010\fJ\u001d\u0010Õ\u0001\u001a\u00030Ô\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bÕ\u0001\u0010\fJ\u001d\u0010×\u0001\u001a\u00030Ö\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b×\u0001\u0010\fJ\u001d\u0010Ù\u0001\u001a\u00030Ø\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bÙ\u0001\u0010\fJ(\u0010Ü\u0001\u001a\u00030Û\u00012\b\b\u0001\u0010\t\u001a\u00020\b2\t\b\u0001\u0010Ú\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\bÜ\u0001\u0010\u0018J\u001d\u0010Þ\u0001\u001a\u00030Ý\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bÞ\u0001\u0010\fJ'\u0010à\u0001\u001a\u00020h2\b\b\u0001\u0010\"\u001a\u00020\b2\t\b\u0001\u0010ß\u0001\u001a\u00020\bH§@¢\u0006\u0005\bà\u0001\u0010EJ\u001d\u0010â\u0001\u001a\u00030á\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bâ\u0001\u0010\fJ\u001d\u0010ä\u0001\u001a\u00030ã\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bä\u0001\u0010\fJ\u001d\u0010æ\u0001\u001a\u00030å\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bæ\u0001\u0010\fJ\u001d\u0010è\u0001\u001a\u00030ç\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bè\u0001\u0010\fJ\u001d\u0010ê\u0001\u001a\u00030é\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bê\u0001\u0010\fJ\u001e\u0010ì\u0001\u001a\u00030ë\u00012\t\b\u0001\u0010\u008c\u0001\u001a\u00020\bH§@¢\u0006\u0005\bì\u0001\u0010\fJ\u001d\u0010î\u0001\u001a\u00030í\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bî\u0001\u0010\fJ\u001d\u0010ð\u0001\u001a\u00030ï\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bð\u0001\u0010\fJ\u001d\u0010ñ\u0001\u001a\u00030\u0087\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bñ\u0001\u0010\fJ2\u0010ó\u0001\u001a\u00030ò\u00012\b\b\u0001\u0010S\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010B\u001a\u00020\bH§@¢\u0006\u0006\bó\u0001\u0010\u008e\u0001JF\u0010ö\u0001\u001a\f\u0012\u0007\b\u0001\u0012\u00030õ\u00010ô\u00012\b\b\u0001\u0010B\u001a\u00020\b2\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0006\bö\u0001\u0010\u0094\u0001J3\u0010ø\u0001\u001a\u00030÷\u00012\b\b\u0001\u0010B\u001a\u00020\b2\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0006\bø\u0001\u0010\u008e\u0001J2\u0010ú\u0001\u001a\u00030ù\u00012\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010S\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0006\bú\u0001\u0010\u008e\u0001J3\u0010ü\u0001\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\t\b\u0001\u0010û\u0001\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\bü\u0001\u0010ý\u0001J=\u0010ü\u0001\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u00022\t\b\u0001\u0010û\u0001\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\bü\u0001\u0010þ\u0001J>\u0010ÿ\u0001\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\t\b\u0001\u0010û\u0001\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002J(\u0010\u0083\u0002\u001a\u00030\u0082\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\t\b\u0001\u0010\u0081\u0002\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0083\u0002\u0010\u0018J\u001d\u0010\u0085\u0002\u001a\u00030\u0084\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0085\u0002\u0010\fJ'\u0010\u0086\u0002\u001a\u00030\u0087\u00012\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0086\u0002\u0010\u0018JF\u0010\u0089\u0002\u001a\f\u0012\u0007\b\u0001\u0012\u00030\u0088\u00020\u0087\u00022\b\b\u0001\u0010B\u001a\u00020\b2\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0006\b\u0089\u0002\u0010\u0094\u0001J=\u0010\u008b\u0002\u001a\u00030\u008a\u00022\b\b\u0001\u0010B\u001a\u00020\b2\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0006\b\u008b\u0002\u0010\u0094\u0001JF\u0010\u008c\u0002\u001a\f\u0012\u0007\b\u0001\u0012\u00030\u0088\u00020\u0087\u00022\b\b\u0001\u0010B\u001a\u00020\b2\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0006\b\u008c\u0002\u0010\u0094\u0001J\u001c\u0010\u008d\u0002\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u008d\u0002\u0010\fJ\u001d\u0010\u008e\u0002\u001a\u00030ë\u00012\b\b\u0001\u0010B\u001a\u00020\bH§@¢\u0006\u0005\b\u008e\u0002\u0010\fJ\u001d\u0010\u0090\u0002\u001a\u00030\u008f\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0090\u0002\u0010\fJ\u001d\u0010\u0092\u0002\u001a\u00030\u0091\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0092\u0002\u0010\fJ\u001d\u0010\u0094\u0002\u001a\u00030\u0093\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0094\u0002\u0010\fJ\u001d\u0010\u0095\u0002\u001a\u00030\u0091\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0095\u0002\u0010\fJ\u001d\u0010\u0097\u0002\u001a\u00030\u0096\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0097\u0002\u0010\fJ\u001d\u0010\u0099\u0002\u001a\u00030\u0098\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0099\u0002\u0010\fJ(\u0010\u009c\u0002\u001a\u00030\u009b\u00022\b\b\u0001\u0010B\u001a\u00020\b2\t\b\u0001\u0010\u009a\u0002\u001a\u00020\u0002H§@¢\u0006\u0005\b\u009c\u0002\u0010\u0018J'\u0010\u009e\u0002\u001a\u00030\u009d\u00022\b\b\u0001\u0010B\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\b\u009e\u0002\u0010EJ\u001d\u0010 \u0002\u001a\u00030\u009f\u00022\b\b\u0001\u0010B\u001a\u00020\bH§@¢\u0006\u0005\b \u0002\u0010\fJ\u001d\u0010¢\u0002\u001a\u00030¡\u00022\b\b\u0001\u0010B\u001a\u00020\bH§@¢\u0006\u0005\b¢\u0002\u0010\fJ\u001d\u0010¤\u0002\u001a\u00030£\u00022\b\b\u0001\u0010B\u001a\u00020\bH§@¢\u0006\u0005\b¤\u0002\u0010\fJ\u001c\u0010¥\u0002\u001a\u0002042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b¥\u0002\u0010\fJ\u001d\u0010¦\u0002\u001a\u00030¥\u00012\b\b\u0001\u0010B\u001a\u00020\bH§@¢\u0006\u0005\b¦\u0002\u0010\fJ\u001c\u0010§\u0002\u001a\u0002062\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b§\u0002\u0010\fJ&\u0010¨\u0002\u001a\u00020p2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010o\u001a\u00020\u0002H§@¢\u0006\u0005\b¨\u0002\u0010\u0018J1\u0010ª\u0002\u001a\u00030©\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0005\bª\u0002\u0010WJ1\u0010«\u0002\u001a\u00030©\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0005\b«\u0002\u0010WJ1\u0010\u00ad\u0002\u001a\u00030¬\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0005\b\u00ad\u0002\u0010WJ1\u0010¯\u0002\u001a\u00030®\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0005\b¯\u0002\u0010WJ'\u0010±\u0002\u001a\u00030°\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\b±\u0002\u0010EJ'\u0010²\u0002\u001a\u00030°\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\b²\u0002\u0010EJ;\u0010³\u0002\u001a\f\u0012\u0007\b\u0001\u0012\u00030õ\u00010ô\u00012\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0005\b³\u0002\u0010WJ\u001e\u0010µ\u0002\u001a\u00030´\u00022\t\b\u0001\u0010\u008c\u0001\u001a\u00020\bH§@¢\u0006\u0005\bµ\u0002\u0010\fJ2\u0010º\u0002\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\n\b\u0001\u0010·\u0002\u001a\u00030¶\u0002H§@¢\u0006\u0006\bº\u0002\u0010»\u0002JG\u0010½\u0002\u001a\f\u0012\u0007\b\u0001\u0012\u00030õ\u00010ô\u00012\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u00022\t\b\u0001\u0010¼\u0002\u001a\u00020\u0002H§@¢\u0006\u0006\b½\u0002\u0010«\u0001J;\u0010¾\u0002\u001a\f\u0012\u0007\b\u0001\u0012\u00030õ\u00010ô\u00012\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0005\b¾\u0002\u0010WJG\u0010À\u0002\u001a\f\u0012\u0007\b\u0001\u0012\u00030õ\u00010ô\u00012\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u00022\t\b\u0001\u0010¿\u0002\u001a\u00020\u0002H§@¢\u0006\u0006\bÀ\u0002\u0010«\u0001J;\u0010Á\u0002\u001a\f\u0012\u0007\b\u0001\u0012\u00030õ\u00010ô\u00012\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0005\bÁ\u0002\u0010WJG\u0010Â\u0002\u001a\f\u0012\u0007\b\u0001\u0012\u00030õ\u00010ô\u00012\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\t\b\u0001\u0010¼\u0002\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0006\bÂ\u0002\u0010«\u0001J(\u0010Ä\u0002\u001a\u00030Ã\u00022\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\bÄ\u0002\u0010EJ(\u0010Æ\u0002\u001a\u00030Å\u00022\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\bÆ\u0002\u0010EJ'\u0010È\u0002\u001a\u00030Ç\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\bÈ\u0002\u0010EJ\u001d\u0010Ê\u0002\u001a\u00030É\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bÊ\u0002\u0010\fJ\u001d\u0010Ì\u0002\u001a\u00030Ë\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bÌ\u0002\u0010\fJ\u001d\u0010Î\u0002\u001a\u00030Í\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bÎ\u0002\u0010\fJ\u001d\u0010Ï\u0002\u001a\u00030Í\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bÏ\u0002\u0010\fJ<\u0010Ð\u0002\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\bÐ\u0002\u0010\u0080\u0002J<\u0010Ñ\u0002\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\bÑ\u0002\u0010\u0080\u0002J3\u0010Ô\u0002\u001a\u00030Ó\u00022\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010S\u001a\u00020\b2\t\b\u0001\u0010Ò\u0002\u001a\u00020\u0002H§@¢\u0006\u0005\bÔ\u0002\u0010WJ2\u0010Õ\u0002\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\bÕ\u0002\u0010ý\u0001J2\u0010Ö\u0002\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\bÖ\u0002\u0010ý\u0001J(\u0010Ù\u0002\u001a\u00030Ø\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\t\b\u0001\u0010×\u0002\u001a\u00020\u0002H§@¢\u0006\u0005\bÙ\u0002\u0010\u0018J2\u0010Ú\u0002\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\bÚ\u0002\u0010ý\u0001J(\u0010Ý\u0002\u001a\u00030Ü\u00022\t\b\u0001\u0010Û\u0002\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\bÝ\u0002\u0010EJ4\u0010à\u0002\u001a\u00030ß\u00022\t\b\u0001\u0010Û\u0002\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\t\b\u0001\u0010Þ\u0002\u001a\u00020\bH§@¢\u0006\u0006\bà\u0002\u0010\u008e\u0001J3\u0010â\u0002\u001a\u00030á\u00022\t\b\u0001\u0010Û\u0002\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010B\u001a\u00020\bH§@¢\u0006\u0006\bâ\u0002\u0010\u008e\u0001J'\u0010ä\u0002\u001a\u00030ã\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\bä\u0002\u0010EJ'\u0010æ\u0002\u001a\u00030å\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\bæ\u0002\u0010EJ'\u0010è\u0002\u001a\u00030ç\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\bè\u0002\u0010EJ'\u0010ê\u0002\u001a\u00030é\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\bê\u0002\u0010EJ'\u0010ì\u0002\u001a\u00030ë\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\bì\u0002\u0010EJ'\u0010î\u0002\u001a\u00030í\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\bî\u0002\u0010EJ'\u0010ð\u0002\u001a\u00030ï\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\bð\u0002\u0010EJ2\u0010ò\u0002\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\t\b\u0001\u0010ñ\u0002\u001a\u00020\bH§@¢\u0006\u0006\bò\u0002\u0010\u008e\u0001J=\u0010ò\u0002\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\t\b\u0001\u0010ñ\u0002\u001a\u00020\b2\t\b\u0001\u0010ó\u0002\u001a\u00020\u0002H§@¢\u0006\u0006\bò\u0002\u0010\u0094\u0001JG\u0010ô\u0002\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\t\b\u0001\u0010ñ\u0002\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\bô\u0002\u0010õ\u0002JV\u0010ô\u0002\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\t\b\u0001\u0010ñ\u0002\u001a\u00020\b2\u000b\b\u0001\u0010ó\u0002\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\bô\u0002\u0010ö\u0002JV\u0010ø\u0002\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\t\b\u0001\u0010ñ\u0002\u001a\u00020\b2\u000b\b\u0001\u0010÷\u0002\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\bø\u0002\u0010ö\u0002Jc\u0010ô\u0002\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\t\b\u0001\u0010ñ\u0002\u001a\u00020\b2\u000b\b\u0001\u0010ó\u0002\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010÷\u0002\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\bô\u0002\u0010ù\u0002JH\u0010ú\u0002\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\b\b\u0001\u0010B\u001a\u00020\b2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\bú\u0002\u0010õ\u0002JG\u0010ü\u0002\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\t\b\u0001\u0010û\u0002\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\bü\u0002\u0010õ\u0002J\u001d\u0010þ\u0002\u001a\u00030ý\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bþ\u0002\u0010\fJ\u001d\u0010ÿ\u0002\u001a\u00030§\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bÿ\u0002\u0010\fJ\u001c\u0010\u0080\u0003\u001a\u0002042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0080\u0003\u0010\fJ'\u0010\u0082\u0003\u001a\u00030\u0081\u00032\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010B\u001a\u00020\bH§@¢\u0006\u0005\b\u0082\u0003\u0010EJ\u001d\u0010\u0083\u0003\u001a\u00030\u0081\u00032\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0083\u0003\u0010\fJ)\u0010\u0086\u0003\u001a\u00030\u0085\u00032\t\b\u0001\u0010\u0084\u0003\u001a\u00020\b2\t\b\u0001\u0010\u0090\u0001\u001a\u00020\bH§@¢\u0006\u0005\b\u0086\u0003\u0010EJ'\u0010\u0088\u0003\u001a\u00030\u0087\u00032\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\b\u0088\u0003\u0010EJ1\u0010\u0089\u0003\u001a\f\u0012\u0007\b\u0001\u0012\u00030õ\u00010ô\u00012\t\b\u0001\u0010Û\u0002\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\b\u0089\u0003\u0010EJ'\u0010\u008b\u0003\u001a\u00030\u008a\u00032\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\b\u008b\u0003\u0010EJ\u001d\u0010\u008d\u0003\u001a\u00030\u008c\u00032\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u008d\u0003\u0010\fJ'\u0010\u008e\u0003\u001a\u00030\u008c\u00032\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\b\u008e\u0003\u0010EJ4\u0010\u0090\u0003\u001a\u00030\u008f\u00032\t\b\u0001\u0010Û\u0002\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\b2\t\b\u0001\u0010Þ\u0002\u001a\u00020\bH§@¢\u0006\u0006\b\u0090\u0003\u0010\u008e\u0001J(\u0010\u0091\u0003\u001a\u00030\u008f\u00032\t\b\u0001\u0010Û\u0002\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\b\u0091\u0003\u0010EJ'\u0010\u0093\u0003\u001a\u00030\u0092\u00032\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\b\u0093\u0003\u0010EJ\u001e\u0010\u0095\u0003\u001a\u00030\u008f\u00032\t\b\u0001\u0010\u0094\u0003\u001a\u00020\bH§@¢\u0006\u0005\b\u0095\u0003\u0010\fJ\u001d\u0010\u0096\u0003\u001a\u00030ï\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0096\u0003\u0010\fJ\u001d\u0010\u0098\u0003\u001a\u00030\u0097\u00032\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0098\u0003\u0010\fJ\u001d\u0010\u009a\u0003\u001a\u00030\u0099\u00032\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u009a\u0003\u0010\fJ4\u0010\u009d\u0003\u001a\u00030\u009c\u00032\b\b\u0001\u0010B\u001a\u00020\b2\t\b\u0001\u0010\u009b\u0003\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\b\u009d\u0003\u0010ý\u0001J4\u0010\u009e\u0003\u001a\u00030\u009c\u00032\b\b\u0001\u0010\t\u001a\u00020\b2\t\b\u0001\u0010\u009b\u0003\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\b\u009e\u0003\u0010ý\u0001J3\u0010 \u0003\u001a\u00030\u009f\u00032\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\t\b\u0001\u0010\u009a\u0002\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0005\b \u0003\u0010\u0016J)\u0010¢\u0003\u001a\u00030¡\u00032\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\t\b\u0001\u0010\u009a\u0002\u001a\u00020\u0002H§@¢\u0006\u0005\b¢\u0003\u0010\u0018J5\u0010¤\u0003\u001a\u00030£\u00032\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\t\b\u0001\u0010\u009a\u0002\u001a\u00020\u00022\t\b\u0001\u0010ñ\u0002\u001a\u00020\bH§@¢\u0006\u0006\b¤\u0003\u0010ý\u0001J(\u0010¦\u0003\u001a\u00030¥\u00032\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\b¦\u0003\u0010EJ)\u0010©\u0003\u001a\u00030¨\u00032\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\t\b\u0001\u0010§\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b©\u0003\u0010\u0018J\u001e\u0010«\u0003\u001a\u00030ª\u00032\t\b\u0001\u0010\u008c\u0001\u001a\u00020\bH§@¢\u0006\u0005\b«\u0003\u0010\fJ\u001e\u0010\u00ad\u0003\u001a\u00030¬\u00032\t\b\u0001\u0010\u008c\u0001\u001a\u00020\bH§@¢\u0006\u0005\b\u00ad\u0003\u0010\fJ(\u0010¯\u0003\u001a\u00030®\u00032\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\b¯\u0003\u0010EJ\u001e\u0010±\u0003\u001a\u00030°\u00032\t\b\u0001\u0010\u008c\u0001\u001a\u00020\bH§@¢\u0006\u0005\b±\u0003\u0010\fJ'\u0010³\u0003\u001a\u00030²\u00032\b\b\u0001\u0010v\u001a\u00020\u00022\b\b\u0003\u0010w\u001a\u00020\u0002H§@¢\u0006\u0005\b³\u0003\u0010\u0007J\u001d\u0010µ\u0003\u001a\u00030´\u00032\b\b\u0001\u0010v\u001a\u00020\u0002H§@¢\u0006\u0005\bµ\u0003\u0010\u0011J\u001d\u0010·\u0003\u001a\u00030¶\u00032\b\b\u0001\u0010v\u001a\u00020\u0002H§@¢\u0006\u0005\b·\u0003\u0010\u0011J+\u0010¸\u0003\u001a\u00030²\u00032\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010v\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0005\b¸\u0003\u0010\u0007J\u001e\u0010»\u0003\u001a\u00030º\u00032\t\b\u0001\u0010¹\u0003\u001a\u00020\bH§@¢\u0006\u0005\b»\u0003\u0010\fJ\u001e\u0010½\u0003\u001a\u00030¼\u00032\t\b\u0001\u0010¹\u0003\u001a\u00020\bH§@¢\u0006\u0005\b½\u0003\u0010\fJ2\u0010¾\u0003\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\b¾\u0003\u0010ý\u0001J\u0013\u0010À\u0003\u001a\u00030¿\u0003H§@¢\u0006\u0005\bÀ\u0003\u0010\u001fJ\u001e\u0010Ã\u0003\u001a\u00030Â\u00032\t\b\u0001\u0010Á\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bÃ\u0003\u0010\u0011J\u001e\u0010Å\u0003\u001a\u00030Ä\u00032\t\b\u0001\u0010Á\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bÅ\u0003\u0010\u0011J(\u0010È\u0003\u001a\u00030Ç\u00032\b\b\u0001\u0010\t\u001a\u00020\b2\t\b\u0001\u0010Æ\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bÈ\u0003\u0010\u0018J)\u0010Ë\u0003\u001a\u00030Ê\u00032\t\b\u0001\u0010É\u0003\u001a\u00020\u00022\t\b\u0001\u0010Æ\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bË\u0003\u0010\u0007J(\u0010Í\u0003\u001a\u00030Ì\u00032\b\b\u0001\u0010\t\u001a\u00020\b2\t\b\u0001\u0010Æ\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bÍ\u0003\u0010\u0018J(\u0010Ï\u0003\u001a\u00030Î\u00032\b\b\u0001\u0010\t\u001a\u00020\b2\t\b\u0001\u0010Æ\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bÏ\u0003\u0010\u0018J\u001d\u0010Ñ\u0003\u001a\u00030Ð\u00032\b\b\u0001\u0010a\u001a\u00020\bH§@¢\u0006\u0005\bÑ\u0003\u0010\fJ'\u0010Ó\u0003\u001a\u00030Ò\u00032\b\b\u0001\u0010S\u001a\u00020\b2\b\b\u0001\u0010a\u001a\u00020\bH§@¢\u0006\u0005\bÓ\u0003\u0010EJ)\u0010Ô\u0003\u001a\u00030Ò\u00032\t\b\u0001\u0010Æ\u0003\u001a\u00020\u00022\b\b\u0001\u0010a\u001a\u00020\bH§@¢\u0006\u0006\bÔ\u0003\u0010Õ\u0003J(\u0010×\u0003\u001a\u00030Ö\u00032\b\b\u0001\u0010\t\u001a\u00020\b2\t\b\u0001\u0010Æ\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b×\u0003\u0010\u0018J\u001e\u0010Ù\u0003\u001a\u00030Ø\u00032\t\b\u0001\u0010Á\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bÙ\u0003\u0010\u0011J3\u0010Û\u0003\u001a\u00030Ú\u00032\b\b\u0001\u0010\t\u001a\u00020\b2\t\b\u0001\u0010Á\u0003\u001a\u00020\u00022\t\b\u0001\u0010Ú\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\bÛ\u0003\u0010\u0016J3\u0010Ü\u0003\u001a\u00030Ú\u00032\b\b\u0001\u0010\t\u001a\u00020\b2\t\b\u0001\u0010Á\u0003\u001a\u00020\u00022\t\b\u0001\u0010Ú\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\bÜ\u0003\u0010\u0016J3\u0010Ý\u0003\u001a\u00030Ú\u00032\b\b\u0001\u0010\t\u001a\u00020\b2\t\b\u0001\u0010Á\u0003\u001a\u00020\u00022\t\b\u0001\u0010Ú\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\bÝ\u0003\u0010\u0016J5\u0010ß\u0003\u001a\u00030Þ\u00032\b\b\u0001\u0010v\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\bß\u0003\u0010à\u0003J*\u0010â\u0003\u001a\u00030Þ\u00032\t\b\u0001\u0010á\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0005\bâ\u0003\u0010\u0007J@\u0010ã\u0003\u001a\u00030Þ\u00032\t\b\u0001\u0010á\u0003\u001a\u00020\u00022\b\b\u0001\u0010v\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\bã\u0003\u0010ä\u0003JA\u0010é\u0003\u001a\u00030è\u00032+\b\u0001\u0010ç\u0003\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020å\u0003j\u0011\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002`æ\u0003H§@¢\u0006\u0006\bé\u0003\u0010ê\u0003J'\u0010ì\u0003\u001a\u00030ë\u00032\b\b\u0001\u0010v\u001a\u00020\u00022\b\b\u0003\u0010w\u001a\u00020\u0002H§@¢\u0006\u0005\bì\u0003\u0010\u0007J\u001d\u0010î\u0003\u001a\u00030í\u00032\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bî\u0003\u0010\u0011J3\u0010ñ\u0003\u001a\u00030ð\u00032\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\t\b\u0001\u0010ï\u0003\u001a\u00020\bH§@¢\u0006\u0006\bñ\u0003\u0010à\u0003J3\u0010ó\u0003\u001a\u00030ò\u00032\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\t\b\u0001\u0010ï\u0003\u001a\u00020\u0002H§@¢\u0006\u0006\bó\u0003\u0010ô\u0003J'\u0010õ\u0003\u001a\u00020\u00052\t\b\u0001\u0010Â\u0001\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\bõ\u0003\u0010\u0018J'\u0010ö\u0003\u001a\u00020\u00052\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\bö\u0003\u0010\u0018J'\u0010÷\u0003\u001a\u00020\u00052\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\b÷\u0003\u0010\u0018J\u001c\u0010ø\u0003\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bø\u0003\u0010\u0011J\u001d\u0010ú\u0003\u001a\u00030ù\u00032\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bú\u0003\u0010\u0011J3\u0010ü\u0003\u001a\u00030û\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00022\t\b\u0001\u0010ï\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0006\bü\u0003\u0010ô\u0003J(\u0010þ\u0003\u001a\u00030ý\u00032\b\b\u0001\u0010T\u001a\u00020\b2\t\b\u0001\u0010×\u0002\u001a\u00020\bH§@¢\u0006\u0005\bþ\u0003\u0010EJ\u001d\u0010\u0080\u0004\u001a\u00030ÿ\u00032\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0080\u0004\u0010\fJ2\u0010\u0081\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010Á\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0006\b\u0081\u0004\u0010ô\u0003J\u001d\u0010\u0082\u0004\u001a\u00020\u00052\t\b\u0001\u0010Á\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0082\u0004\u0010\u0011J\u001d\u0010\u0083\u0004\u001a\u00020\u00052\t\b\u0001\u0010Á\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0083\u0004\u0010\u0011J\u001e\u0010\u0085\u0004\u001a\u00030\u0084\u00042\t\b\u0001\u0010Á\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0085\u0004\u0010\u0011J4\u0010\u0089\u0004\u001a\u00030\u0088\u00042\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\t\b\u0001\u0010\u0086\u0004\u001a\u00020\u00022\t\b\u0001\u0010\u0087\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0089\u0004\u0010\u0016J\u001e\u0010\u008b\u0004\u001a\u00030\u0088\u00042\t\b\u0001\u0010\u008a\u0004\u001a\u00020\bH§@¢\u0006\u0005\b\u008b\u0004\u0010\fJ5\u0010\u008f\u0004\u001a\u00030\u008e\u00042\t\b\u0001\u0010\u008c\u0004\u001a\u00020\u00022\t\b\u0001\u0010\u008d\u0004\u001a\u00020\b2\t\b\u0001\u0010Ú\u0001\u001a\u00020\u0002H§@¢\u0006\u0006\b\u008f\u0004\u0010\u0090\u0004J\u001e\u0010\u0093\u0004\u001a\u00030\u0092\u00042\t\b\u0001\u0010\u0091\u0004\u001a\u00020\bH§@¢\u0006\u0005\b\u0093\u0004\u0010\fJ\u001e\u0010\u0095\u0004\u001a\u00030\u0094\u00042\t\b\u0001\u0010\u0091\u0004\u001a\u00020\bH§@¢\u0006\u0005\b\u0095\u0004\u0010\fJ3\u0010\u0097\u0004\u001a\u00030\u0096\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\b\u0097\u0004\u0010ý\u0001JE\u0010\u0099\u0004\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\b\b\u0001\u0010!\u001a\u00020 2\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010&\u001a\u00020\b2\n\b\u0001\u0010·\u0002\u001a\u00030\u0098\u0004H§@¢\u0006\u0006\b\u0099\u0004\u0010\u009a\u0004J1\u0010\u009c\u0004\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010·\u0002\u001a\u00030\u009b\u0004H§@¢\u0006\u0006\b\u009c\u0004\u0010\u009d\u0004J1\u0010\u009f\u0004\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010·\u0002\u001a\u00030\u009e\u0004H§@¢\u0006\u0006\b\u009f\u0004\u0010 \u0004J1\u0010¢\u0004\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010·\u0002\u001a\u00030¡\u0004H§@¢\u0006\u0006\b¢\u0004\u0010£\u0004J1\u0010¥\u0004\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010·\u0002\u001a\u00030¤\u0004H§@¢\u0006\u0006\b¥\u0004\u0010¦\u0004J1\u0010¨\u0004\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010·\u0002\u001a\u00030§\u0004H§@¢\u0006\u0006\b¨\u0004\u0010©\u0004J5\u0010®\u0004\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\n\b\u0001\u0010«\u0004\u001a\u00030ª\u00042\f\b\u0001\u0010\u00ad\u0004\u001a\u0005\u0018\u00010¬\u0004H§@¢\u0006\u0006\b®\u0004\u0010¯\u0004J@\u0010µ\u0004\u001a\u00030´\u00042\t\b\u0001\u0010°\u0004\u001a\u00020\u00022\t\b\u0001\u0010±\u0004\u001a\u00020\b2\t\b\u0001\u0010²\u0004\u001a\u00020\u00022\t\b\u0001\u0010³\u0004\u001a\u00020\bH§@¢\u0006\u0006\bµ\u0004\u0010¶\u0004J\u001d\u0010¸\u0004\u001a\u00030·\u00042\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0005\b¸\u0004\u0010\u0011J\u001d\u0010º\u0004\u001a\u00030¹\u00042\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0005\bº\u0004\u0010\u0011J\u001e\u0010¼\u0004\u001a\u00030»\u00042\t\b\u0001\u0010Á\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b¼\u0004\u0010\u0011J\u0013\u0010¾\u0004\u001a\u00030½\u0004H§@¢\u0006\u0005\b¾\u0004\u0010\u001fJ)\u0010Á\u0004\u001a\u00030À\u00042\t\b\u0001\u0010¿\u0004\u001a\u00020\u00022\t\b\u0001\u0010÷\u0002\u001a\u00020\u0002H§@¢\u0006\u0005\bÁ\u0004\u0010\u0007J0\u0010Æ\u0004\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030Ä\u00040Ã\u0004j\u0003`Å\u00042\t\b\u0001\u0010Â\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\bÆ\u0004\u0010\u0011J\u0013\u0010È\u0004\u001a\u00030Ç\u0004H§@¢\u0006\u0005\bÈ\u0004\u0010\u001fJ\u0013\u0010É\u0004\u001a\u00030Ç\u0004H§@¢\u0006\u0005\bÉ\u0004\u0010\u001fJ\u0013\u0010Ê\u0004\u001a\u00030Ç\u0004H§@¢\u0006\u0005\bÊ\u0004\u0010\u001fJ'\u0010Ì\u0004\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\n\b\u0001\u0010·\u0002\u001a\u00030Ë\u0004H§@¢\u0006\u0006\bÌ\u0004\u0010Í\u0004J1\u0010Ï\u0004\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010·\u0002\u001a\u00030Î\u0004H§@¢\u0006\u0006\bÏ\u0004\u0010Ð\u0004J\u001d\u0010Ò\u0004\u001a\u00030Ñ\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bÒ\u0004\u0010\fJ1\u0010Ô\u0004\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010·\u0002\u001a\u00030Ó\u0004H§@¢\u0006\u0006\bÔ\u0004\u0010Õ\u0004J1\u0010×\u0004\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010·\u0002\u001a\u00030Ö\u0004H§@¢\u0006\u0006\b×\u0004\u0010Ø\u0004J \u0010Ü\u0004\u001a\u00030Û\u00042\n\b\u0001\u0010Ú\u0004\u001a\u00030Ù\u0004H§@¢\u0006\u0006\bÜ\u0004\u0010Ý\u0004J3\u0010ß\u0004\u001a\u00030Þ\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\bß\u0004\u0010à\u0003J\u001e\u0010â\u0004\u001a\u00030á\u00042\t\b\u0001\u0010à\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\bâ\u0004\u0010\u0011J\u001e\u0010ä\u0004\u001a\u00030ã\u00042\t\b\u0001\u0010à\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\bä\u0004\u0010\u0011J\u001e\u0010æ\u0004\u001a\u00030å\u00042\t\b\u0001\u0010à\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\bæ\u0004\u0010\u0011J\u001e\u0010è\u0004\u001a\u00030ç\u00042\t\b\u0001\u0010à\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\bè\u0004\u0010\u0011J\u001e\u0010ê\u0004\u001a\u00030é\u00042\t\b\u0001\u0010à\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\bê\u0004\u0010\u0011J\u001e\u0010ì\u0004\u001a\u00030ë\u00042\t\b\u0001\u0010à\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\bì\u0004\u0010\u0011J'\u0010î\u0004\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\n\b\u0001\u0010·\u0002\u001a\u00030í\u0004H§@¢\u0006\u0006\bî\u0004\u0010ï\u0004J\u001e\u0010ñ\u0004\u001a\u00030ð\u00042\t\b\u0001\u0010à\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\bñ\u0004\u0010\u0011J\u001a\u0010ò\u0004\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u0002H§@¢\u0006\u0005\bò\u0004\u0010\u001fJ\u001e\u0010ô\u0004\u001a\u00030ó\u00042\t\b\u0001\u0010à\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\bô\u0004\u0010\u0011J\u0013\u0010õ\u0004\u001a\u00030ó\u0004H§@¢\u0006\u0005\bõ\u0004\u0010\u001fJ\u001e\u0010÷\u0004\u001a\u00030ö\u00042\t\b\u0001\u0010à\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\b÷\u0004\u0010\u0011J\u001e\u0010ú\u0004\u001a\u00030ù\u00042\t\b\u0001\u0010ø\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\bú\u0004\u0010\u0011J\u0013\u0010ü\u0004\u001a\u00030û\u0004H§@¢\u0006\u0005\bü\u0004\u0010\u001fJ\u0013\u0010þ\u0004\u001a\u00030ý\u0004H§@¢\u0006\u0005\bþ\u0004\u0010\u001fJ\u0013\u0010\u0080\u0005\u001a\u00030ÿ\u0004H§@¢\u0006\u0005\b\u0080\u0005\u0010\u001fJ?\u0010\u0081\u0005\u001a\u00030Þ\u00042\t\b\u0001\u0010ø\u0004\u001a\u00020\u00022\t\b\u0001\u0010à\u0004\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\b\u0081\u0005\u0010ä\u0003J\u001d\u0010\u0083\u0005\u001a\u00030\u0082\u00052\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0083\u0005\u0010\u0011J*\u0010\u0086\u0005\u001a\u00030\u0085\u00052\b\b\u0001\u0010\t\u001a\u00020\u00022\n\b\u0001\u0010·\u0002\u001a\u00030\u0084\u0005H§@¢\u0006\u0006\b\u0086\u0005\u0010\u0087\u0005J\u001d\u0010\u0088\u0005\u001a\u00030\u0085\u00052\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0088\u0005\u0010\fJ4\u0010\u008a\u0005\u001a\u00030\u0085\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\u00022\n\b\u0001\u0010·\u0002\u001a\u00030\u0089\u0005H§@¢\u0006\u0006\b\u008a\u0005\u0010\u008b\u0005J\u001d\u0010\u008c\u0005\u001a\u00030\u0085\u00052\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u008c\u0005\u0010\fJ\u001d\u0010\u008d\u0005\u001a\u00030\u0085\u00052\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u008d\u0005\u0010\fJ\u001d\u0010\u008e\u0005\u001a\u00030\u0085\u00052\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0005\b\u008e\u0005\u0010\u0011J \u0010\u0090\u0005\u001a\u00030\u008f\u00052\n\b\u0001\u0010Ú\u0004\u001a\u00030Ù\u0004H§@¢\u0006\u0006\b\u0090\u0005\u0010Ý\u0004J\u0013\u0010\u0092\u0005\u001a\u00030\u0091\u0005H§@¢\u0006\u0005\b\u0092\u0005\u0010\u001fJ\u001d\u0010\u0094\u0005\u001a\u00030\u0093\u00052\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0094\u0005\u0010\u0011J\u0013\u0010\u0096\u0005\u001a\u00030\u0095\u0005H§@¢\u0006\u0005\b\u0096\u0005\u0010\u001fJ4\u0010\u009a\u0005\u001a\u00030\u0099\u00052\t\b\u0001\u0010\u0097\u0005\u001a\u00020\u00022\t\b\u0001\u0010\u0098\u0005\u001a\u00020\u00022\b\b\u0001\u0010v\u001a\u00020\u0002H§@¢\u0006\u0006\b\u009a\u0005\u0010ô\u0003J\u001d\u0010\u009c\u0005\u001a\u00030\u009b\u00052\b\b\u0001\u0010o\u001a\u00020\u0002H§@¢\u0006\u0005\b\u009c\u0005\u0010\u0011J\u001d\u0010\u009e\u0005\u001a\u00030\u009d\u00052\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u009e\u0005\u0010\fJ*\u0010¡\u0005\u001a\u00030 \u00052\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010·\u0002\u001a\u00030\u009f\u0005H§@¢\u0006\u0006\b¡\u0005\u0010¢\u0005J\u001d\u0010¤\u0005\u001a\u00030£\u00052\b\b\u0001\u0010o\u001a\u00020\u0002H§@¢\u0006\u0005\b¤\u0005\u0010\u0011J\u001d\u0010¦\u0005\u001a\u00030¥\u00052\b\b\u0001\u0010o\u001a\u00020\u0002H§@¢\u0006\u0005\b¦\u0005\u0010\u0011J\u001d\u0010¨\u0005\u001a\u00030§\u00052\b\b\u0001\u0010o\u001a\u00020\u0002H§@¢\u0006\u0005\b¨\u0005\u0010\u0011J'\u0010©\u0005\u001a\u00030£\u00052\b\b\u0001\u0010o\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b©\u0005\u0010\u0007J'\u0010ª\u0005\u001a\u00030¥\u00052\b\b\u0001\u0010o\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bª\u0005\u0010\u0007J'\u0010«\u0005\u001a\u00030§\u00052\b\b\u0001\u0010o\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b«\u0005\u0010\u0007J\u001e\u0010\u00ad\u0005\u001a\u00030¬\u00052\t\b\u0001\u0010Á\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b\u00ad\u0005\u0010\u0011J\u001d\u0010¯\u0005\u001a\u00030®\u00052\b\b\u0001\u0010&\u001a\u00020\bH§@¢\u0006\u0005\b¯\u0005\u0010\fJ\u0012\u0010\u0081\u0004\u001a\u00020[H§@¢\u0006\u0005\b\u0081\u0004\u0010\u001fJ\u001d\u0010±\u0005\u001a\u00030°\u00052\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b±\u0005\u0010\fJ\u001d\u0010²\u0005\u001a\u00030°\u00052\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b²\u0005\u0010\fJ\u001d\u0010´\u0005\u001a\u00030³\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b´\u0005\u0010\u0011J\u001d\u0010¶\u0005\u001a\u00030µ\u00052\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b¶\u0005\u0010\fJ\u001e\u0010¸\u0005\u001a\u00030·\u00052\t\b\u0001\u0010Û\u0002\u001a\u00020\bH§@¢\u0006\u0005\b¸\u0005\u0010\fJ\u001e\u0010º\u0005\u001a\u00030¹\u00052\t\b\u0001\u0010Û\u0002\u001a\u00020\bH§@¢\u0006\u0005\bº\u0005\u0010\fJ\u001d\u0010»\u0005\u001a\u00030³\u00052\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0005\b»\u0005\u0010\fJ)\u0010¾\u0005\u001a\u00030½\u00052\t\b\u0001\u0010½\u0001\u001a\u00020\b2\t\b\u0001\u0010¼\u0005\u001a\u00020\u0002H§@¢\u0006\u0005\b¾\u0005\u0010\u0018J)\u0010À\u0005\u001a\u00030¿\u00052\t\b\u0001\u0010½\u0001\u001a\u00020\b2\t\b\u0001\u0010¼\u0005\u001a\u00020\u0002H§@¢\u0006\u0005\bÀ\u0005\u0010\u0018J\u001d\u0010Â\u0005\u001a\u00030Á\u00052\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bÂ\u0005\u0010\fJ'\u0010Ä\u0005\u001a\u00030Ã\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\bÄ\u0005\u0010EJ\u001d\u0010Æ\u0005\u001a\u00030Å\u00052\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bÆ\u0005\u0010\fJ3\u0010È\u0005\u001a\u00030Ç\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00022\t\b\u0001\u0010ï\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0006\bÈ\u0005\u0010ô\u0003J'\u0010É\u0005\u001a\u00030³\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\bÉ\u0005\u0010\u0007J\u001e\u0010Ë\u0005\u001a\u00030Ê\u00052\t\b\u0001\u0010½\u0001\u001a\u00020\bH§@¢\u0006\u0005\bË\u0005\u0010\fJ=\u0010Ï\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030Í\u00050Ì\u0005j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030Í\u0005`Î\u00052\t\b\u0001\u0010ï\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bÏ\u0005\u0010\u0011J*\u0010Ñ\u0005\u001a\u00030Ð\u00052\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u00022\t\b\u0001\u0010±\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\bÑ\u0005\u0010\u0007J1\u0010Ó\u0005\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010·\u0002\u001a\u00030Ò\u0005H§@¢\u0006\u0006\bÓ\u0005\u0010Ô\u0005J$\u0010Õ\u0005\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bÕ\u0005\u0010\fJ1\u0010×\u0005\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010·\u0002\u001a\u00030Ö\u0005H§@¢\u0006\u0006\b×\u0005\u0010Ø\u0005J(\u0010Û\u0005\u001a\u00030Ú\u00052\b\b\u0001\u0010\"\u001a\u00020\b2\t\b\u0001\u0010Ù\u0005\u001a\u00020\u0002H§@¢\u0006\u0005\bÛ\u0005\u0010\u0018J\u001d\u0010Ý\u0005\u001a\u00030Ü\u00052\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bÝ\u0005\u0010\fJ(\u0010ß\u0005\u001a\u00030Þ\u00052\t\b\u0001\u0010Á\u0003\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0005\bß\u0005\u0010\u0007J4\u0010á\u0005\u001a\u00030Þ\u00052\t\b\u0001\u0010Á\u0003\u001a\u00020\u00022\t\b\u0001\u0010à\u0005\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0006\bá\u0005\u0010ô\u0003J\u001e\u0010ä\u0005\u001a\u00030ã\u00052\t\b\u0001\u0010â\u0005\u001a\u00020\u0002H§@¢\u0006\u0005\bä\u0005\u0010\u0011J\u001d\u0010ä\u0005\u001a\u00030ã\u00052\b\b\u0001\u0010a\u001a\u00020\bH§@¢\u0006\u0005\bä\u0005\u0010\fJ\u001d\u0010æ\u0005\u001a\u00030å\u00052\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\bæ\u0005\u0010\fJ(\u0010é\u0005\u001a\u00030è\u00052\b\b\u0001\u0010\"\u001a\u00020\b2\t\b\u0001\u0010ç\u0005\u001a\u00020\u0002H§@¢\u0006\u0005\bé\u0005\u0010\u0018J\u001d\u0010ë\u0005\u001a\u00030ê\u00052\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0005\bë\u0005\u0010\u0011J\u001d\u0010í\u0005\u001a\u00030ì\u00052\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0005\bí\u0005\u0010\u0011J'\u0010ï\u0005\u001a\u00030î\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0005\bï\u0005\u0010EJ'\u0010ñ\u0005\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\n\b\u0001\u0010·\u0002\u001a\u00030ð\u0005H§@¢\u0006\u0006\bñ\u0005\u0010ò\u0005J \u0010ô\u0005\u001a\u00030ó\u00052\n\b\u0001\u0010·\u0002\u001a\u00030ð\u0005H§@¢\u0006\u0006\bô\u0005\u0010ò\u0005J\u001e\u0010ö\u0005\u001a\u00030õ\u00052\t\b\u0001\u0010Á\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bö\u0005\u0010\u0011J)\u0010÷\u0005\u001a\u00030õ\u00052\t\b\u0001\u0010Á\u0003\u001a\u00020\u00022\t\b\u0001\u0010à\u0005\u001a\u00020\u0002H§@¢\u0006\u0005\b÷\u0005\u0010\u0007J6\u0010û\u0005\u001a\u00030ú\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0016\b\u0001\u0010ù\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020ø\u0005H§@¢\u0006\u0006\bû\u0005\u0010ü\u0005J\u001d\u0010þ\u0005\u001a\u00030ý\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bþ\u0005\u0010\u0011J)\u0010\u0080\u0006\u001a\u00030ÿ\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\b\u0080\u0006\u0010Õ\u0003J\u001d\u0010\u0082\u0006\u001a\u00030\u0081\u00062\b\b\u0001\u0010H\u001a\u00020\bH§@¢\u0006\u0005\b\u0082\u0006\u0010\fJ\u001d\u0010\u0084\u0006\u001a\u00030\u0083\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0084\u0006\u0010\u0011J\u001e\u0010\u0086\u0006\u001a\u00030\u0085\u00062\t\b\u0001\u0010\u008c\u0001\u001a\u00020\bH§@¢\u0006\u0005\b\u0086\u0006\u0010\fJB\u0010\u008a\u0006\u001a\u00030\u0089\u00062\b\b\u0001\u0010!\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\u000b\b\u0003\u0010\u0087\u0006\u001a\u0004\u0018\u00010\u00022\u000b\b\u0003\u0010\u0088\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0006\b\u008a\u0006\u0010\u008b\u0006J\u0013\u0010\u008c\u0006\u001a\u00030\u0089\u0006H§@¢\u0006\u0005\b\u008c\u0006\u0010\u001fJ\u001d\u0010\u008e\u0006\u001a\u00030\u008d\u00062\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u008e\u0006\u0010\fJ\u001d\u0010\u0090\u0006\u001a\u00030\u008f\u00062\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0090\u0006\u0010\fJ*\u0010\u0093\u0006\u001a\u00030\u008f\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\u0092\u0006\u001a\u00030\u0091\u0006H§@¢\u0006\u0006\b\u0093\u0006\u0010\u0094\u0006J$\u0010\u0095\u0006\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0095\u0006\u0010\fJ\u001d\u0010\u0097\u0006\u001a\u00030\u0096\u00062\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0097\u0006\u0010\fJ\u001d\u0010\u0098\u0006\u001a\u00030\u008f\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u0098\u0006\u0010\fJ=\u0010\u0099\u0006\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010û\u0001\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\b\u0099\u0006\u0010þ\u0001J\u001d\u0010\u009b\u0006\u001a\u00030\u009a\u00062\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0005\b\u009b\u0006\u0010\fJ\u001e\u0010\u009d\u0006\u001a\u00030\u009c\u00062\t\b\u0001\u0010Ù\u0005\u001a\u00020\u0002H§@¢\u0006\u0005\b\u009d\u0006\u0010\u0011J%\u0010\u009e\u0006\u001a\n\u0012\u0005\u0012\u00030¹\u00020¸\u00022\t\b\u0001\u0010Ù\u0005\u001a\u00020\u0002H§@¢\u0006\u0005\b\u009e\u0006\u0010\u0011J\u001e\u0010 \u0006\u001a\u00030\u009f\u00062\t\b\u0001\u0010Á\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b \u0006\u0010\u0011J\u001d\u0010¢\u0006\u001a\u00030¡\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b¢\u0006\u0010\u0011J2\u0010£\u0006\u001a\u00030ð\u00032\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010v\u001a\u00020\u0002H§@¢\u0006\u0006\b£\u0006\u0010ô\u0003J\u001e\u0010¥\u0006\u001a\u00030¤\u00062\t\b\u0001\u0010Á\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b¥\u0006\u0010\u0011J'\u0010§\u0006\u001a\u00030¦\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\b§\u0006\u0010\u0007J2\u0010¨\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH§@¢\u0006\u0006\b¨\u0006\u0010à\u0003¨\u0006©\u0006À\u0006\u0003"}, d2 = {"Lcom/sofascore/network/api/NetworkCoroutineAPI;", "Lcom/sofascore/network/api/NetworkHeadAPI;", "", SearchResponseKt.SPORT_ENTITY, "date", "Lcom/sofascore/model/newNetwork/EventListResponse;", "sportMainEvents", "(Ljava/lang/String;Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "", "id", "Lcom/sofascore/model/network/response/EventResponse;", "getEvent", "(ILrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/newNetwork/EventIncidentsResponse;", "getEventIncidents", "Lcom/sofascore/model/network/response/AiInsightsNextResponse;", "getNextAiInsightsEvent", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "language", "premiumToken", "Lcom/sofascore/model/newNetwork/AiInsightsResponse;", "getEventAiInsights", "(ILjava/lang/String;Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "getEventAiInsightsPostMatch", "(ILjava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/newNetwork/PointByPointResponse;", "pointByPoint", "Lcom/sofascore/model/network/response/VotesResponse;", "getEventVotes", "Lcom/sofascore/model/network/response/AddedEventsResponse;", "getNewlyAddedEvents", "(Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/TvType;", "type", "eventId", "Lcom/sofascore/model/newNetwork/TvCountryChannelsResponse;", "getTvCountryChannels", "(Lcom/sofascore/model/TvType;ILrq3;)Ljava/lang/Object;", "channelId", "Lcom/sofascore/model/newNetwork/TvChannelVotesResponse;", "getTvChannelVotes", "(ILcom/sofascore/model/TvType;ILrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/newNetwork/SportRadarTokenResponse;", "getSportRadarToken", "streamContentId", "token", "Lcom/sofascore/model/newNetwork/SportRadarStreamUrlResponse;", "getSportRadarStreamUrl", "Lcom/sofascore/model/newNetwork/HighlightsResponse;", "getStageHighlights", "Lcom/sofascore/model/network/response/LineupsResponse;", "getLineups", "Lcom/sofascore/model/newNetwork/EventMediaNewsResponse;", "getEventMediaNews", "Lcom/sofascore/model/network/response/TweetsResponse;", "getEventTweets", "Lcom/sofascore/model/network/response/TeamRssFeedResponse;", "getTeamRssFeed", "Lcom/sofascore/model/network/response/EventStatisticsResponse;", "getEventStatistics", "Lcom/sofascore/model/network/response/EventUmpiresResponse;", "getEventUmpires", "Lcom/sofascore/model/network/response/EventWeatherResponse;", "getEventWeather", "Lcom/sofascore/model/network/response/EventInningsResponse;", "getEventInnings", "teamId", "Lcom/sofascore/model/network/response/EventTeamHeatmapResponse;", "getEventTeamHeatMap", "(IILrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/network/response/TeamEventShotmapResponse;", "getBasketballTeamEventShotmap", "playerId", "Lcom/sofascore/model/newNetwork/FootballShotmapResponse;", "getFootballPlayerEventShotmap", "getFootballGoalkeeperEventShotmap", "Lcom/sofascore/model/newNetwork/FootballEventPlayerRatingBreakdownResponse;", "getFootballPlayerEventRatingBreakdown", "getFootballEventShotmap", "Lcom/sofascore/model/newNetwork/HockeyEventShotmapResponse;", "getHockeyEventShotmap", "Lcom/sofascore/model/newNetwork/HockeyPlayerShotmapResponse;", "getHockeyPlayerEventShotmap", "tournamentId", "seasonId", "Lcom/sofascore/model/network/response/SeasonShotActionAreaResponse;", "getSeasonShotActionAreas", "(IILjava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/network/response/Head2HeadResponse;", "getHead2Head", "customId", "Lcom/sofascore/model/network/response/Head2HeadEventsResponse;", "getHead2HeadEvents", "Lcom/sofascore/model/network/response/TeamStreaksResponse;", "getTeamStreaks", "Lcom/sofascore/model/network/response/EventManagersResponse;", "getEventManagers", "providerId", "Lcom/sofascore/model/network/response/WinningOddsResponse;", "getWinningOdds", "Lcom/sofascore/model/network/response/PlayerEventStatisticsResponse;", "playerEventStatistics", "Lcom/sofascore/model/newNetwork/PlayerHeatmapResponse;", "playerEventHeatmap", "Lcom/sofascore/model/newNetwork/statistics/BaseballPitchesResponse;", "playerEventBaseballPitches", "getHighlights", "Lcom/sofascore/model/network/response/EventBetBoostsResponse;", "getEvenBetBoost", "Lcom/sofascore/model/network/response/CurrentlyRelevantEventsResponse;", "getCurrentlyRelevantEvents", "alpha2", "Lcom/sofascore/model/network/response/MediaHighlightSummaryResponse;", "getMediaHighlightSummary", "Lcom/sofascore/model/newNetwork/PlayerDetailsResponse;", "playerDetails", "Lcom/sofascore/model/newNetwork/PlayerCharacteristicsResponse;", "playerCharacteristics", MBridgeConstans.DYNAMIC_VIEW_WX_QUERY, "more", "Lcom/sofascore/model/newNetwork/SearchPlayersResponse;", "searchPlayers", "Lcom/sofascore/model/newNetwork/PlayerYearSummaryResponse;", "playerYearSummary", "Lcom/sofascore/model/newNetwork/AttributeOverviewResponse;", "playerAttributeOverview", "Lcom/sofascore/model/newNetwork/NationalTeamStatisticsResponse;", "playerNationalTeamStatistics", "Lcom/sofascore/model/newNetwork/TransferHistoryResponse;", "playerTransferHistory", "Lcom/sofascore/model/newNetwork/PlayerUniqueTournamentsResponse;", "playerTournaments", "selectedMatchType", "Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerCareerStatisticsResponse;", "playerCareerStatistics", "Lcom/sofascore/model/newNetwork/StatisticsSeasonsResponse;", "playerStatisticsSeasons", "page", "Lcom/sofascore/model/newNetwork/PlayerEventsListResponse;", "playerEventsList", "uniqueTournamentId", "playerTournamentEventsList", "(IIILrq3;)Ljava/lang/Object;", "tid", L6.e1, "Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerSeasonStatisticsResponse;", "Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "playerSeasonStatistics", "(IIILjava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballPlayerSeasonRankedStatisticsResponse;", "baseballPlayerRankedSeasonStatistics", "seasonType", "baseballSeasonPitches", "(IIILjava/lang/String;Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "playerTournamentStatistics", "Lcom/sofascore/model/newNetwork/PlayerSeasonHeatMapResponse;", "playerSeasonHeatMap", "Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryResponse;", "playerPenaltyHistory", "goalkeeperPenaltyHistory", "Lcom/sofascore/model/newNetwork/PlayerSeasonRatingsResponse;", "playerSeasonRatings", "Lcom/sofascore/model/network/response/PlayerSeasonShotActionsResponse;", "playerSubSeasonShotActions", "getPlayerMediaNews", "Lcom/sofascore/model/newNetwork/YoutubeVideoResponse;", "getPlayerVideos", "Lcom/sofascore/model/newNetwork/MediaResponse;", "getPlayerHighlights", "getPlayerHighlightSummary", "subSeasonShotActionAreas", "(IILjava/lang/String;Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/newNetwork/EventChildEventsResponse;", "eventChildEvents", "Lcom/sofascore/model/network/response/AveragePositionsResponse;", "getAveragePositions", "heatMap", "Lcom/sofascore/model/newNetwork/PlayerShotmapResponse;", "eventPlayerShotMap", "Lcom/sofascore/model/newNetwork/TeamFeaturedPlayersResponse;", "teamFeaturedPlayers", "Lcom/sofascore/model/newNetwork/EventBestPlayersResponse;", "bestPlayers", "Lcom/sofascore/model/newNetwork/EventBestPlayersSummaryResponse;", "bestPlayersSummary", "Lcom/sofascore/model/newNetwork/BaseballEventTopPerformersResponse;", "eventBaseballTopPerformers", "Lcom/sofascore/model/newNetwork/FeaturedOddsResponse;", "featuredOdds", "stageId", "Lcom/sofascore/model/newNetwork/StageFeaturedOddsResponse;", "stageFeaturedOdds", "Lcom/sofascore/model/newNetwork/StageOddsResponse;", "stageTeamOdds", "categoryId", "stageCategoryOdds", "stageAllOdds", "Lcom/sofascore/model/newNetwork/AdditionalOddsResponse;", "additionalOdds", "Lcom/sofascore/model/newNetwork/AllOddsResponse;", "allOdds", "Lcom/sofascore/model/newNetwork/TeamStreakBettingOddsResponse;", "teamStreakBettingOdds", "Lcom/sofascore/model/newNetwork/PregameFormResponse;", "pregameForm", "Lcom/sofascore/model/newNetwork/EventSeriesResponse;", "getEventSeries", "Lcom/sofascore/model/newNetwork/EventGraphResponse;", "eventGraph", "winProbability", "Lcom/sofascore/model/newNetwork/BaseballAtBatsResponse;", "baseballAtBats", "Lcom/sofascore/model/newNetwork/CricketRunsPerOverGraphResponse;", "cricketRunsPerOverGraph", "Lcom/sofascore/model/newNetwork/EventGraphSequenceResponse;", "eventGraphSequence", "Lcom/sofascore/model/newNetwork/TennisPowerResponse;", "tennisPower", "languageCode", "Lcom/sofascore/model/newNetwork/commentary/CommentaryResponse;", "getCommentary", "Lcom/sofascore/model/newNetwork/commentary/HockeyPlayByPlayResponse;", "getHockeyPlayByPlay", "atBatId", "getAtBatPitches", "Lcom/sofascore/model/newNetwork/EsportsGamesResponse;", "esportsGames", "Lcom/sofascore/model/newNetwork/EsportsGameStatisticsResponse;", "esportsGameStatistics", "Lcom/sofascore/model/newNetwork/ESportsGameRoundsResponse;", "eSportsGameRounds", "Lcom/sofascore/model/newNetwork/ESportsGameLineupsResponse;", "eSportsGameLineUps", "Lcom/sofascore/model/newNetwork/ESportsBansResponse;", "eSportsGameBans", "Lcom/sofascore/model/newNetwork/newRankings/RankingsSummaryResponse;", "mmaOrganisationRanking", "Lcom/sofascore/model/newNetwork/TeamDetailsResponse;", "teamDetails", "Lcom/sofascore/model/newNetwork/EventIdsResponse;", "teamEventIds", "teamStandingsSeasons", "Lcom/sofascore/model/newNetwork/PerformanceGraphDataResponse;", "performanceGraphData", "Lcom/sofascore/model/newNetwork/topperformance/TopPerformanceResponse;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "teamTopPlayers", "Lcom/sofascore/model/newNetwork/topperformance/TeamTopPlayerResponse;", "teamTopPlayer", "Lcom/sofascore/model/network/response/GoalDistributionsResponse;", "getGoalDistributions", TtmlNode.TAG_SPAN, "getTeamEventList", "(ILjava/lang/String;ILrq3;)Ljava/lang/Object;", "(ILjava/lang/String;Ljava/lang/String;ILrq3;)Ljava/lang/Object;", "getTeamEventListForTournament", "(IILjava/lang/String;ILrq3;)Ljava/lang/Object;", "monthYear", "Lcom/sofascore/model/newNetwork/EventsByMonthResponse;", "getTeamEventsByMonth", "Lcom/sofascore/model/newNetwork/TeamPlayersResponse;", "getTeamSquad", "teamStatisticsSeasons", "Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatisticsResponse;", "Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatistics;", "teamStatistics", "Lcom/sofascore/model/newNetwork/TeamPlayerSeasonStatisticsResponse;", "teamPlayerStatistics", "rankedTeamSeasonStatistics", "teamPerformance", "teamRankings", "Lcom/sofascore/model/newNetwork/TeamNearEventsResponse;", "teamNearEvents", "Lcom/sofascore/model/newNetwork/TeamUniqueTournamentsResponse;", "teamTournaments", "Lcom/sofascore/model/newNetwork/RecentTeamTournamentsResponse;", "recentTeamTournaments", "allTeamTournaments", "Lcom/sofascore/model/newNetwork/TeamTransfersResponse;", "teamTransfers", "Lcom/sofascore/model/newNetwork/TeamCareerStatisticsResponse;", "teamCareerStatistics", "year", "Lcom/sofascore/model/newNetwork/statistics/season/team/TennisTeamYearlyStatisticsResponse;", "getTennisTeamYearlyStatistics", "Lcom/sofascore/model/newNetwork/TeamSeasonPlacementResponse;", "getTeamSeasonPlacement", "Lcom/sofascore/model/newNetwork/TeamAchievementsResponse;", "getTeamAchievements", "Lcom/sofascore/model/network/response/FeaturedEventResponse;", "teamFeaturedEvent", "Lcom/sofascore/model/newNetwork/TennisGrandSlamPerformanceResponse;", "tennisTeamGrandSlamPerformance", "getTeamMediaNews", "getTeamVideos", "getTeamTweets", "getTeamHighlightSummary", "Lcom/sofascore/model/newNetwork/StandingsResponse;", "standings", "uniqueStandings", "Lcom/sofascore/model/newNetwork/StandingsFormResponse;", "standingsForm", "Lcom/sofascore/model/newNetwork/StandingsFormMultipleTournamentsResponse;", "uniqueStandingsForm", "Lcom/sofascore/model/newNetwork/SeasonStatisticsResponse;", "tournamentPlayerStatisticsTypes", "tournamentTeamStatisticsTypes", "leagueTopPlayers", "Lcom/sofascore/model/newNetwork/topperformance/response/LeagueGoatPlayerVotesResponse;", "leagueGoatPlayerVotes", "Lcom/sofascore/model/newNetwork/topperformance/response/LeagueGoatPlayerVoteBody;", "body", "Lc2g;", "", "leagueGoatPlayerVote", "(ILcom/sofascore/model/newNetwork/topperformance/response/LeagueGoatPlayerVoteBody;Lrq3;)Ljava/lang/Object;", "position", "leagueTopPlayersByPosition", "leagueTopTeams", "division", "leagueTopTeamsByDivision", "leagueTopStats", "leagueTopStatsByPosition", "Lcom/sofascore/model/profile/LeagueEditorsResponse;", "leagueEditors", "Lcom/sofascore/model/cuptree/CupTreesResponse;", "uniqueCupTree", "Lcom/sofascore/model/newNetwork/SeasonInfoResponse;", "uniqueTournamentSeasonInfo", "Lcom/sofascore/model/newNetwork/TournamentResponse;", "tournament", "Lcom/sofascore/model/newNetwork/UniqueTournamentResponse;", SearchResponseKt.LEAGUE_ENTITY, "Lcom/sofascore/model/newNetwork/TournamentSeasonsResponse;", "tournamentSeasons", "uniqueTournamentSeasons", "tournamentSeasonEvents", "uniqueTournamentSeasonEvents", "mmaEventType", "Lcom/sofascore/model/newNetwork/MmaEventListResponse;", "mmaFightNightEvents", "uniqueTournamentEvents", "uniqueTournamentMainEvents", U3.j.e0, "Lcom/sofascore/model/newNetwork/MmaMonthsWithEventsResponse;", "uniqueTournamentMonthsWithEvents", "tournamentEvents", "uniqueId", "Lcom/sofascore/model/newNetwork/PowerRankingRoundsResponse;", "powerRankingRounds", "roundId", "Lcom/sofascore/model/newNetwork/PowerRankingResponse;", "powerRanking", "Lcom/sofascore/model/newNetwork/PowerRankingsGraphDataResponse;", "powerRankingsGraphData", "Lcom/sofascore/model/newNetwork/UniqueTournamentGroupsResponse;", "uniqueTournamentGroups", "Lcom/sofascore/model/newNetwork/UniqueTournamentTeamsResponse;", "uniqueTournamentTeams", "Lcom/sofascore/model/newNetwork/UniqueTournamentRoundsResponse;", "uniqueTournamentRounds", "Lcom/sofascore/model/newNetwork/UniqueTournamentVenuesResponse;", "uniqueTournamentVenues", "Lcom/sofascore/model/newNetwork/UniqueTournamentDivisionsResponse;", "uniqueTournamentDivisions", "Lcom/sofascore/model/newNetwork/UniqueTournamentChampionsResponse;", "uniqueTournamentChampions", "Lcom/sofascore/model/newNetwork/UniqueTournamentAwardsResponse;", "uniqueTournamentAwards", TeamOfTheWeekRoundsResponseKt.TOTW_ROUND, "uniqueTournamentRoundAllEvents", "roundSlug", "uniqueTournamentRoundEvents", "(IIILjava/lang/String;ILrq3;)Ljava/lang/Object;", "(IIILjava/lang/String;Ljava/lang/String;ILrq3;)Ljava/lang/Object;", "prefix", "uniqueTournamentRoundEventsPrefix", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILrq3;)Ljava/lang/Object;", "uniqueTournamentTeamEvents", "venueId", "uniqueTournamentSeasonVenueEvents", "Lcom/sofascore/model/newNetwork/UniqueTournamentDetailsResponse;", "uniqueTournamentDetails", "uniqueTournamentMedia", "uniqueTournamentNews", "Lcom/sofascore/model/newNetwork/MediaVideoResponse;", "uniqueTournamentTeamVideos", "uniqueTournamentVideos", "utId", "Lcom/sofascore/model/newNetwork/MatchdayHighlightsResponse;", "matchdayHighlights", "Lcom/sofascore/model/newNetwork/PlayerOfTheSeasonResponse;", "playerOfTheSeason", "playerOfTheSeasonRace", "Lcom/sofascore/model/newNetwork/TeamOfTheWeekRoundsResponse;", "teamOfTheWeekPeriods", "Lcom/sofascore/model/newNetwork/FeaturedEventsResponse;", "uniqueTournamentFeaturedEvents", "uniqueTournamentSeasonFeaturedEvents", "Lcom/sofascore/model/newNetwork/TeamOfTheWeekResponse;", BuzzerConfigResponseKt.TEAM_OF_THE_WEEK, "teamOfTheSeason", "Lcom/sofascore/model/newNetwork/TeamOfThePeriodRoundsResponse;", "teamOfThePeriodAwardedPeriods", "periodId", "teamOfThePeriod", "myLeagueEventIds", "Lcom/sofascore/model/newNetwork/HistoricalSeasonComparisonResponse;", "historicalSeasonComparison", "Lcom/sofascore/model/newNetwork/UniqueTournamentPreviousWinnersResponse;", "uniqueTournamentPreviousWinners", "transactionType", "Lcom/sofascore/model/newNetwork/UniqueTournamentPlayerTransactionsResponse;", "uniqueTournamentTeamTransaction", "uniqueTournamentPlayersTransaction", "Lcom/sofascore/model/newNetwork/UniqueTournamentProspectsResponse;", "uniqueTournamentProspects", "Lcom/sofascore/model/newNetwork/UniqueTournamentLotteryProbabilityResponse;", "uniqueTournamentLotteryProbability", "Lcom/sofascore/model/newNetwork/UniqueTournamentDraftPicksResponse;", "uniqueTournamentDraftPicks", "Lcom/sofascore/model/newNetwork/UniqueTournamentDraftInfoResponse;", "uniqueTournamentDraftInfo", "orderBy", "Lcom/sofascore/model/newNetwork/UniqueTournamentRecapTopPerformancesResponse;", "uniqueTournamentRecapTopPerformances", "Lcom/sofascore/model/newNetwork/UniqueTournamentPlayerUpdatesResponse;", "uniqueTournamentPlayerUpdates", "Lcom/sofascore/model/newNetwork/UniqueTournamentKeyPlayersResponse;", "uniqueTournamentKeyPlayers", "Lcom/sofascore/model/newNetwork/UniqueTournamentTopPerformersResponse;", "uniqueTournamentMatchdayTopPerformers", "Lcom/sofascore/model/newNetwork/UniqueTournamentLastDanceResponse;", "uniqueTournamentLastDance", "Lcom/sofascore/model/newNetwork/SearchTeamsResponse;", "searchTeams", "Lcom/sofascore/model/newNetwork/SearchManagersResponse;", "searchManagers", "Lcom/sofascore/model/newNetwork/SearchVenuesResponse;", "searchVenues", "searchTeamsBySport", "refereeId", "Lcom/sofascore/model/newNetwork/RefereeDetailsResponse;", "refereeDetails", "Lcom/sofascore/model/newNetwork/RefereeStatisticsResponse;", "refereeStatistics", "refereeEvents", "Lcom/sofascore/model/buzzer/BuzzerConfigResponse;", "getBuzzerConfig", "countryCode", "Lcom/sofascore/model/buzzer/BuzzerTilesResponse;", "getBuzzerTiles", "Lcom/sofascore/model/buzzer/NewBuzzerTilesResponse;", "getNewBuzzerTiles", "sportSlug", "Lcom/sofascore/model/network/response/bettingtips/DroppingOddsResponse;", "droppingOdds", "streakName", "Lcom/sofascore/model/network/response/bettingtips/TeamStreaksResponse;", "teamStreaks", "Lcom/sofascore/model/network/response/bettingtips/H2HStreaksResponse;", "h2hStreaks", "Lcom/sofascore/model/network/response/bettingtips/TrendingOddsResponse;", "trendingOdds", "Lcom/sofascore/model/network/response/bettingtips/HighValueStreaksResponse;", "highValueStreaks", "Lcom/sofascore/model/newNetwork/FeaturedPrematchOddsResponse;", "recommendedPrematchOdds", "recommendedPrematchTopVotedOdds", "(Ljava/lang/String;ILrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/network/response/bettingtips/BetBoostsResponse;", "betBoosts", "Lcom/sofascore/model/network/response/SignupLinkResponse;", "signupLinks", "Lcom/sofascore/model/mvvm/model/OffersBannerResponse;", "offersBanner", "offersBannerTeam", "offersBannerPlayer", "Lcom/sofascore/model/network/response/SearchResponse;", "search", "(Ljava/lang/String;Ljava/lang/String;ILrq3;)Ljava/lang/Object;", "entityType", "searchSuggestionsByEntityType", "searchByEntityType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILrq3;)Ljava/lang/Object;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "options", "Lcom/sofascore/model/newNetwork/TransfersResponse;", "getTransfers", "(Ljava/util/LinkedHashMap;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/newNetwork/SearchTournamentsResponse;", "searchTournaments", "Lcom/sofascore/model/newNetwork/SportCategoriesResponse;", "sportCategories", "offset", "Lcom/sofascore/model/newNetwork/CategoriesForDateResponse;", "categoriesForDate", "Lcom/sofascore/model/newNetwork/TournamentsForDateResponse;", "tournamentsForDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "categoryScheduledEvents", "uniqueTournamentScheduledEvents", "uniqueTournamentScheduledMmaMainEvents", "sportLiveEvents", "Lcom/sofascore/model/newNetwork/LiveCategoriesResponse;", "liveCategories", "Lcom/sofascore/model/newNetwork/MonthlyUniqueTournamentsResponse;", "monthlyTournaments", "Lcom/sofascore/model/newNetwork/SeasonDaysWithEventsResponse;", "seasonDaysWithEvents", "Lcom/sofascore/model/newNetwork/CategoryUniqueTournamentResponse;", "categoryTournaments", "getPopularEvents", "trendingEvents", "trendingGridEvents", "Lcom/sofascore/model/newNetwork/TrendingGridTilesResponse;", "trendingGridTiles", "weightClass", InneractiveMediationDefs.KEY_GENDER, "Lcom/sofascore/model/newNetwork/newRankings/Ranking;", "mmaRankingByWeightClass", "rankingId", "rankings", "entity", "entityId", "Lcom/sofascore/model/newNetwork/TranslationResponse;", "translateDescription", "(Ljava/lang/String;ILjava/lang/String;Lrq3;)Ljava/lang/Object;", "managerId", "Lcom/sofascore/model/newNetwork/ManagerDetailsResponse;", "managerDetails", "Lcom/sofascore/model/newNetwork/CareerHistoryResponse;", "managerCareerHistory", "Lcom/sofascore/model/newNetwork/ManagerEventsResponse;", "managerEvents", "Lcom/sofascore/model/newNetwork/TvChannelVoteBody;", "voteTvChannel", "(Lcom/sofascore/model/TvType;IILcom/sofascore/model/newNetwork/TvChannelVoteBody;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/newNetwork/post/PlayerSuggestPostBody;", "editPlayer", "(ILcom/sofascore/model/newNetwork/post/PlayerSuggestPostBody;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/newNetwork/post/TransferSuggestPostBody;", "editPlayerTransfer", "(ILcom/sofascore/model/newNetwork/post/TransferSuggestPostBody;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/newNetwork/post/TeamSuggestPostBody;", "editTeam", "(ILcom/sofascore/model/newNetwork/post/TeamSuggestPostBody;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/newNetwork/post/FighterSuggestPostBody;", "editFighter", "(ILcom/sofascore/model/newNetwork/post/FighterSuggestPostBody;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/newNetwork/post/VenueSuggestPostBody;", "editVenue", "(ILcom/sofascore/model/newNetwork/post/VenueSuggestPostBody;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/network/post/FeedbackPost;", "payload", "Ldzc;", "screenshot", "feedback", "(Lcom/sofascore/model/network/post/FeedbackPost;Ldzc;Lrq3;)Ljava/lang/Object;", "url", U3.j.W, L6.H, "sdkVersion", "Lcom/sofascore/model/newNetwork/InfoResponse;", "info", "(Ljava/lang/String;ILjava/lang/String;ILrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/profile/ProfileNetworkResponse;", "profile", "Lcom/sofascore/model/profile/UserSubscriptionsResponse;", "userSubscriptions", "Lcom/sofascore/model/newNetwork/DefaultPinnedLeaguesResponse;", "defaultPinnedTournaments", "Lcom/sofascore/model/newNetwork/cpc/ValuableUserVersionsResponse;", "getValuableUsersVersions", "version", "Lcom/sofascore/model/newNetwork/ValuableUserResponse;", "getValuableUsersForVersion", "uuidPrefix", "", "Lcom/sofascore/model/newNetwork/NetworkUserSegmentation;", "Lcom/sofascore/model/newNetwork/UserSegmentationResponse;", "getUserSegmentation", "Lcom/sofascore/model/profile/VoteRankingResponse;", "voteRanking", "contributionRanking", "editorRanking", "Lcom/sofascore/model/newNetwork/PostUserNickname;", "nickname", "(Lcom/sofascore/model/newNetwork/PostUserNickname;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/newNetwork/EventVoteBody;", "eventVote", "(ILcom/sofascore/model/newNetwork/EventVoteBody;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchResponse;", "getEventPlayerOfTheMatchOptions", "Lcom/sofascore/model/newNetwork/PlayerOfTheMatchVoteBody;", "eventPlayerOfTheMatchVote", "(ILcom/sofascore/model/newNetwork/PlayerOfTheMatchVoteBody;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/newNetwork/ChangeEventVoteBody;", "changeEventVote", "(ILcom/sofascore/model/newNetwork/ChangeEventVoteBody;Lrq3;)Ljava/lang/Object;", "Lyzf;", U3.i.b, "Lcom/sofascore/model/newNetwork/post/ProfileImageUploadResponse;", "uploadProfileImage", "(Lyzf;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/newNetwork/UserPredictionsResponse;", "userPredictions", "userId", "Lcom/sofascore/model/profile/ContributionsResponse;", "getUserContributions", "Lcom/sofascore/model/profile/ContributionSummaryResponse;", "getUserContributionSummary", "Lcom/sofascore/model/profile/EditorsEventsCountResponse;", "getEditorsEventsCount", "Lcom/sofascore/model/profile/EditorsTournamentsResponse;", "getEditorsTournaments", "Lcom/sofascore/model/profile/EditorsPopularEventsResponse;", "getMostOpenedEditorMatches", "Lcom/sofascore/model/profile/EditorEventOpeningsGraphResponse;", "getEditorOpeningsGraphResponse", "Lcom/sofascore/model/newNetwork/PostUserBadge;", "changeUserBadge", "(Lcom/sofascore/model/newNetwork/PostUserBadge;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/profile/UserBadgesResponse;", "getUserBadges", "deleteReferral", "Lcom/sofascore/model/profile/ReferralShareLink;", "getReferralShareLink", "generateReferralShareLink", "Lcom/sofascore/model/profile/ReferralResponse;", "getReferrals", "leaderboardId", "Lcom/sofascore/model/weeklyChallenge/WeeklyChallengeLeaderboardResponse;", "getWeeklyChallengeRankings", "Lcom/sofascore/model/weeklyChallenge/PopularEventsResponse;", "getPopularUpcomingEvents", "Lcom/sofascore/model/weeklyChallenge/WeeklyChallengeTimestampResponse;", "getWeeklyChallengeTimestamp", "Lcom/sofascore/model/weeklyChallenge/WeeklyChallengeAssetsResponse;", "getWeeklyChallengeAssets", "userWeeklyPredictions", "Lcom/sofascore/model/newNetwork/ChatMessagesResponse;", "getChatMessages", "Lcom/sofascore/model/newNetwork/PostChatMessage;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "postMessage", "(Ljava/lang/String;Lcom/sofascore/model/newNetwork/PostChatMessage;Lrq3;)Ljava/lang/Object;", "upVoteMessage", "Lcom/sofascore/model/chat/BanReason;", "reportMessage", "(ILjava/lang/String;Lcom/sofascore/model/chat/BanReason;Lrq3;)Ljava/lang/Object;", "unReportMessage", "deleteMessage", "markNotRisky", "Lcom/sofascore/model/newNetwork/post/ImageUploadResponse;", "uploadChatImage", "Lcom/sofascore/model/newNetwork/RiskyTopicsResponse;", "riskyChatChannels", "Lcom/sofascore/model/network/response/MessageCountResponse;", "chatMessageCount", "Lcom/sofascore/model/network/response/UserRegionResponse;", "userRegion", "source", "target", "Lcom/sofascore/model/GoogleTranslate;", "translate", "Lcom/sofascore/model/network/response/PickemResponse;", "getPickemConfig", "Lcom/sofascore/model/newNetwork/SurveyResponse;", "getSurvey", "Lcom/sofascore/model/newNetwork/SurveyAnswersPost;", "", "postSurveyData", "(ILcom/sofascore/model/newNetwork/SurveyAnswersPost;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/newNetwork/TeamSuggestionResponse;", "teamSuggestions", "Lcom/sofascore/model/newNetwork/UniqueTournamentSuggestionResponse;", "uniqueTournamentSuggestion", "Lcom/sofascore/model/newNetwork/SuggestedPlayersResponse;", "suggestedPlayers", "teamSuggestionsPerSport", "uniqueTournamentSuggestionPerSport", "suggestedPlayersPerSport", "Lcom/sofascore/model/newNetwork/TvChannelsResponse;", "tvChannelsForCountry", "Lcom/sofascore/model/newNetwork/TvChannelScheduleResponse;", "tvChannelEvents", "Lcom/sofascore/model/newNetwork/StageResponse;", "stageDetails", "stageDetailsExtended", "Lcom/sofascore/model/newNetwork/StagesListResponse;", "featuredStages", "Lcom/sofascore/model/newNetwork/CategoryUniqueStagesResponse;", "stageSportUniqueStages", "Lcom/sofascore/model/newNetwork/StageSportSeasonsResponse;", "stageSportSeasons", "Lcom/sofascore/model/newNetwork/RecentStageIdsResponse;", "recentStageIds", "stageSportSubStages", "teamType", "Lcom/sofascore/model/newNetwork/StageStandingsResponse;", "stageStandings", "Lcom/sofascore/model/newNetwork/StageRacesResponse;", "stageSeasonRaceResults", "Lcom/sofascore/model/newNetwork/StageSeasonsResponse;", "driverStageSeasons", "Lcom/sofascore/model/newNetwork/DriverRacesResponse;", "stageSportDriverSeasonRaces", "Lcom/sofascore/model/newNetwork/StageTeamHistoryResponse;", "stageTeamCareerHistory", "Lcom/sofascore/model/newNetwork/MonthlyStages;", "monthlyStages", "stageEventsByWeek", "Lcom/sofascore/model/newNetwork/StageDriverPerformanceGraphResponse;", "stageDriverPerformanceGraph", "Ljava/util/HashMap;", "Lcom/sofascore/model/newNetwork/SportItem;", "Lkotlin/collections/HashMap;", "sportEventCount", "Lcom/sofascore/model/newNetwork/ApiBranchesResponse;", "availableBranches", "Lcom/sofascore/model/crowdsourcing/CrowdsourcingSuggestRequest;", "createSuggests", "(ILcom/sofascore/model/crowdsourcing/CrowdsourcingSuggestRequest;Lrq3;)Ljava/lang/Object;", "deleteSuggest", "Lcom/sofascore/model/crowdsourcing/EventSuggestRequest;", "updateSuggest", "(ILcom/sofascore/model/crowdsourcing/EventSuggestRequest;Lrq3;)Ljava/lang/Object;", "deviceId", "Lcom/sofascore/model/crowdsourcing/MyContributionsResponse;", "getMyContributions", "Lcom/sofascore/model/crowdsourcing/GetCrowdsourcingEventContributionsResponse;", "getCrowdsourcingEventContributions", "Lcom/sofascore/model/newNetwork/OddsProvidersResponse;", "oddsProvidersForCountry", "regionCode", "oddsProvidersForCountryRegion", "providerSlug", "Lcom/sofascore/model/newNetwork/OddsProviderDetailsResponse;", "oddsProviderDetails", "Lcom/sofascore/model/crowdsourcing/LatestCrowdsourcingSuggestResponse;", "latestCrowdsourcingSuggests", "alpha2code", "Lcom/sofascore/model/newNetwork/WSCStoriesResponse;", "getWSCHighlightsForEvent", "Lcom/sofascore/model/newNetwork/UserPredictionsVotesResponse;", "getUserVotes", "Lcom/sofascore/model/newNetwork/UserPlayerOfTheMatchVotesResponse;", "getUserPlayerOfTheMatchVotes", "Lcom/sofascore/model/newNetwork/TopFollowedPlayersResponse;", "getTopFollowedPlayers", "Lcom/sofascore/model/newNetwork/post/UserPurchasePostBody;", "purchaseAds", "(Lcom/sofascore/model/newNetwork/post/UserPurchasePostBody;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/newNetwork/post/PremiumTokenResponse;", "purchaseAnalyst", "Lcom/sofascore/model/branding/ServerBrandingConfigResponse;", "brandingProviders", "brandingProvidersForRegion", "Ljava/util/SortedMap;", "queryMap", "Lcom/sofascore/model/network/response/playerOfTheSeason/POTSHighestRatedPlayersResponse;", "playerOfTheSeasonHighestRatedPlayers", "(Ljava/lang/String;Ljava/util/SortedMap;Lrq3;)Ljava/lang/Object;", "Lcom/sofascore/model/network/response/playerOfTheSeason/POTSHighestRatedPlayersAvailableYears;", "playerOfTheSeasonAvailableYears", "Lcom/sofascore/model/network/response/playerOfTheSeason/POTSMostAwardsResponse;", "playerOfTheSeasonMostAwards", "Lcom/sofascore/model/network/response/playerOfTheSeason/POTSPlayerAwardsResponse;", "playerOfTheSeasonPlayerAwards", "Lcom/sofascore/model/network/response/playerOfTheSeason/POTSTopCompetitionsResponse;", "playerOfTheSeasonTopCompetitions", "Lcom/sofascore/model/network/response/playerOfTheSeason/POTSLeagueTopPlayersResponse;", "playerOfTheSeasonLeagueTopPlayers", "types", "excludeTypes", "Lcom/sofascore/model/newNetwork/mediaposts/PersonalizedMLMediaResponse;", "personalizedMLMediaPosts", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "getFeaturedTournamentMediaPosts", "Lcom/sofascore/model/newNetwork/mediaposts/MediaPostResponse;", "mediaPost", "Lcom/sofascore/model/newNetwork/mediaposts/MediaPostReactionsResponse;", "mediaPostReactions", "Lcom/sofascore/model/newNetwork/mediaposts/MediaReactionPost;", "reactionPost", "addMediaPostReaction", "(ILcom/sofascore/model/newNetwork/mediaposts/MediaReactionPost;Lrq3;)Ljava/lang/Object;", "addMediaPostShare", "Lcom/sofascore/model/newNetwork/VenueResponse;", "venue", "venueNearEvents", "venueMatches", "Lcom/sofascore/model/newNetwork/VenueSportsResponse;", "venueSports", "Lcom/sofascore/model/network/response/SofaSeasonResponse;", "getSofaSeason", "sendSofaSeasonWatched", "Lcom/sofascore/model/newNetwork/OrderedSportsResponse;", "getOrderedSports", "Lcom/sofascore/model/newNetwork/AvailableSportFiltersResponse;", "getFilterScreenConfig", "queryCategoriesForData", "Lcom/sofascore/model/newNetwork/AffiliateBannersResponse;", "getAffiliateBanners", "Lcom/sofascore/model/newNetwork/ChronologicalListIndexesResponse;", "getChronologicalIndexes", "getIndexedEventsPage", "network_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface NetworkCoroutineAPI extends NetworkHeadAPI {
    @i0e("/api/v1/media-posts/{id}/reactions")
    @Nullable
    Object addMediaPostReaction(@vae("id") int i, @yy1 @NotNull MediaReactionPost mediaReactionPost, @NotNull rq3<? super MediaPostReactionsResponse> rq3Var);

    @i0e("/api/v1/media-posts/{id}/post-shares")
    @Nullable
    Object addMediaPostShare(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @iu8("api/v1/event/{id}/odds/{providerId}/additional")
    @Nullable
    Object additionalOdds(@vae("id") int i, @vae("providerId") int i2, @NotNull rq3<? super AdditionalOddsResponse> rq3Var);

    @iu8("api/v1/event/{id}/odds/{providerId}/all")
    @Nullable
    Object allOdds(@vae("id") int i, @vae("providerId") int i2, @NotNull rq3<? super AllOddsResponse> rq3Var);

    @iu8("api/v1/team/{id}/unique-tournaments/all")
    @Nullable
    Object allTeamTournaments(@vae("id") int i, @NotNull rq3<? super TeamUniqueTournamentsResponse> rq3Var);

    @i0e("https://api.sofascore.com/api/v1/app/branches")
    @Nullable
    Object availableBranches(@Nullable @w79("Authorization") String str, @NotNull @w79("app-version") String str2, @NotNull rq3<? super ApiBranchesResponse> rq3Var);

    @iu8("api/v1/event/{id}/at-bats")
    @Nullable
    Object baseballAtBats(@vae("id") int i, @NotNull rq3<? super BaseballAtBatsResponse> rq3Var);

    @iu8("api/v1/player/{id}/season/{sid}/statistical-rankings/{type}")
    @Nullable
    Object baseballPlayerRankedSeasonStatistics(@vae("id") int i, @vae("sid") int i2, @NotNull @vae("type") String str, @NotNull rq3<? super BaseballPlayerSeasonRankedStatisticsResponse> rq3Var);

    @iu8("api/v1/player/{id}/unique-tournament/{tid}/season/{sid}/pitches/{type}/{seasonType}")
    @Nullable
    Object baseballSeasonPitches(@vae("id") int i, @vae("tid") int i2, @vae("sid") int i3, @NotNull @vae("type") String str, @NotNull @vae("seasonType") String str2, @NotNull rq3<? super BaseballPitchesResponse> rq3Var);

    @iu8("api/v1/event/{id}/best-players")
    @Nullable
    Object bestPlayers(@vae("id") int i, @NotNull rq3<? super EventBestPlayersResponse> rq3Var);

    @iu8("api/v1/event/{id}/best-players/summary")
    @Nullable
    Object bestPlayersSummary(@vae("id") int i, @NotNull rq3<? super EventBestPlayersSummaryResponse> rq3Var);

    @iu8("/api/v1/odds/{id}/boost/{sportSlug}")
    @Nullable
    Object betBoosts(@vae("id") int i, @NotNull @vae("sportSlug") String str, @NotNull rq3<? super BetBoostsResponse> rq3Var);

    @iu8("api/v1/branding/providers/{cc}/android")
    @Nullable
    Object brandingProviders(@NotNull @vae("cc") String str, @NotNull rq3<? super ServerBrandingConfigResponse> rq3Var);

    @iu8("api/v1/branding/providers/{cc}-{rc}/android")
    @Nullable
    Object brandingProvidersForRegion(@NotNull @vae("cc") String str, @NotNull @vae("rc") String str2, @NotNull rq3<? super ServerBrandingConfigResponse> rq3Var);

    @iu8("api/v1/sport/{sport}/{date}/{offset}/categories")
    @Nullable
    Object categoriesForDate(@NotNull @vae("sport") String str, @NotNull @vae("date") String str2, @vae("offset") int i, @NotNull rq3<? super CategoriesForDateResponse> rq3Var);

    @iu8("api/v1/category/{cid}/scheduled-events/{date}")
    @Nullable
    Object categoryScheduledEvents(@vae("cid") int i, @NotNull @vae("date") String str, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/category/{id}/unique-tournaments")
    @Nullable
    Object categoryTournaments(@vae("id") int i, @NotNull rq3<? super CategoryUniqueTournamentResponse> rq3Var);

    @h3e("api/v1/event/{id}/change-vote")
    @Nullable
    Object changeEventVote(@vae("id") int i, @yy1 @NotNull ChangeEventVoteBody changeEventVoteBody, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user/badge")
    @Nullable
    Object changeUserBadge(@yy1 @NotNull PostUserBadge postUserBadge, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @iu8("api/v1/chat/topic-message-count/{id}")
    @Nullable
    Object chatMessageCount(@NotNull @vae("id") String str, @NotNull rq3<? super MessageCountResponse> rq3Var);

    @iu8("api/v1/user-account/contribution-ranking-score")
    @Nullable
    Object contributionRanking(@NotNull rq3<? super VoteRankingResponse> rq3Var);

    @i0e("api/v1/suggest/event/{id}/crowdsourcing")
    @Nullable
    Object createSuggests(@vae("id") int i, @yy1 @NotNull CrowdsourcingSuggestRequest crowdsourcingSuggestRequest, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @iu8("api/v1/event/{id}/graph/cricket")
    @Nullable
    Object cricketRunsPerOverGraph(@vae("id") int i, @NotNull rq3<? super CricketRunsPerOverGraphResponse> rq3Var);

    @iu8("api/v1/config/default-unique-tournaments/{countryCode}")
    @Nullable
    Object defaultPinnedTournaments(@NotNull @vae("countryCode") String str, @NotNull rq3<? super DefaultPinnedLeaguesResponse> rq3Var);

    @kb4("/api/v1/chat/message/{id}")
    @Nullable
    Object deleteMessage(@vae("id") int i, @NotNull rq3<? super NetworkResponse> rq3Var);

    @kb4("api/v1/user-account/referral")
    @Nullable
    Object deleteReferral(@NotNull rq3<? super c2g<Unit>> rq3Var);

    @kb4("api/v1/suggest/{id}")
    @Nullable
    Object deleteSuggest(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @iu8("api/v1/team/{id}/stage-seasons")
    @Nullable
    Object driverStageSeasons(@vae("id") int i, @NotNull rq3<? super StageSeasonsResponse> rq3Var);

    @iu8("/api/v1/odds/{id}/dropping/{sportSlug}")
    @Nullable
    Object droppingOdds(@vae("id") int i, @NotNull @vae("sportSlug") String str, @NotNull rq3<? super DroppingOddsResponse> rq3Var);

    @iu8("api/v1/esports-game/{id}/bans")
    @Nullable
    Object eSportsGameBans(@vae("id") int i, @NotNull rq3<? super ESportsBansResponse> rq3Var);

    @iu8("api/v1/esports-game/{id}/lineups")
    @Nullable
    Object eSportsGameLineUps(@vae("id") int i, @NotNull rq3<? super ESportsGameLineupsResponse> rq3Var);

    @iu8("api/v1/esports-game/{id}/rounds")
    @Nullable
    Object eSportsGameRounds(@vae("id") int i, @NotNull rq3<? super ESportsGameRoundsResponse> rq3Var);

    @i0e("api/v1/suggest/team/{id}")
    @Nullable
    Object editFighter(@vae("id") int i, @yy1 @NotNull FighterSuggestPostBody fighterSuggestPostBody, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/suggest/player/{id}")
    @Nullable
    Object editPlayer(@vae("id") int i, @yy1 @NotNull PlayerSuggestPostBody playerSuggestPostBody, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/suggest/player/{id}/transfer")
    @Nullable
    Object editPlayerTransfer(@vae("id") int i, @yy1 @NotNull TransferSuggestPostBody transferSuggestPostBody, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/suggest/team/{id}")
    @Nullable
    Object editTeam(@vae("id") int i, @yy1 @NotNull TeamSuggestPostBody teamSuggestPostBody, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/suggest/venue/{id}")
    @Nullable
    Object editVenue(@vae("id") int i, @yy1 @NotNull VenueSuggestPostBody venueSuggestPostBody, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @iu8("api/v1/user-account/editor-ranking")
    @Nullable
    Object editorRanking(@NotNull rq3<? super VoteRankingResponse> rq3Var);

    @iu8("api/v1/esports-game/{id}/statistics")
    @Nullable
    Object esportsGameStatistics(@vae("id") int i, @NotNull rq3<? super EsportsGameStatisticsResponse> rq3Var);

    @iu8("api/v1/event/{id}/esports-games")
    @Nullable
    Object esportsGames(@vae("id") int i, @NotNull rq3<? super EsportsGamesResponse> rq3Var);

    @iu8("api/v1/event/baseball/{id}/top-performers")
    @Nullable
    Object eventBaseballTopPerformers(@vae("id") int i, @NotNull rq3<? super BaseballEventTopPerformersResponse> rq3Var);

    @iu8("api/v1/event/{id}/child-events")
    @Nullable
    Object eventChildEvents(@vae("id") int i, @NotNull rq3<? super EventChildEventsResponse> rq3Var);

    @iu8("api/v1/event/{id}/graph")
    @Nullable
    Object eventGraph(@vae("id") int i, @NotNull rq3<? super EventGraphResponse> rq3Var);

    @iu8("api/v1/event/{id}/graph/sequence")
    @Nullable
    Object eventGraphSequence(@vae("id") int i, @NotNull rq3<? super EventGraphSequenceResponse> rq3Var);

    @i0e("api/v1/event/{id}/player-of-the-match/vote")
    @Nullable
    Object eventPlayerOfTheMatchVote(@vae("id") int i, @yy1 @NotNull PlayerOfTheMatchVoteBody playerOfTheMatchVoteBody, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @iu8("api/v1/event/{id}/player/{playerid}/shotmap")
    @Nullable
    Object eventPlayerShotMap(@vae("id") int i, @vae("playerid") int i2, @NotNull rq3<? super PlayerShotmapResponse> rq3Var);

    @i0e("api/v1/event/{id}/vote")
    @Nullable
    Object eventVote(@vae("id") int i, @yy1 @NotNull EventVoteBody eventVoteBody, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @iu8("api/v1/event/{id}/odds/{providerId}/featured")
    @Nullable
    Object featuredOdds(@vae("id") int i, @vae("providerId") int i2, @NotNull rq3<? super FeaturedOddsResponse> rq3Var);

    @iu8("api/v1/stage/sport/{sport}/featured")
    @Nullable
    Object featuredStages(@NotNull @vae("sport") String str, @NotNull rq3<? super StagesListResponse> rq3Var);

    @czc
    @i0e("api/v1/app/feedback")
    @Nullable
    Object feedback(@y9e("payload") @NotNull FeedbackPost feedbackPost, @y9e @Nullable dzc dzcVar, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user-account/referral/share-link")
    @Nullable
    Object generateReferralShareLink(@NotNull rq3<? super ReferralShareLink> rq3Var);

    @iu8("api/v1/dsp/country/{countryCode}")
    @Nullable
    Object getAffiliateBanners(@NotNull @vae("countryCode") String str, @NotNull rq3<? super AffiliateBannersResponse> rq3Var);

    @iu8("api/v1/event/{id}/atbat/{atBatId}/pitches")
    @Nullable
    Object getAtBatPitches(@vae("id") int i, @vae("atBatId") int i2, @NotNull rq3<? super BaseballPitchesResponse> rq3Var);

    @iu8("api/v1/event/{id}/average-positions")
    @Nullable
    Object getAveragePositions(@vae("id") int i, @NotNull rq3<? super AveragePositionsResponse> rq3Var);

    @iu8("api/v1/event/{id}/shotmap/{teamid}")
    @Nullable
    Object getBasketballTeamEventShotmap(@vae("id") int i, @vae("teamid") int i2, @NotNull rq3<? super TeamEventShotmapResponse> rq3Var);

    @iu8("/api/v1/buzzer/config")
    @Nullable
    Object getBuzzerConfig(@NotNull rq3<? super BuzzerConfigResponse> rq3Var);

    @iu8("/api/v1/buzzer/tiles/{cc}")
    @Nullable
    Object getBuzzerTiles(@NotNull @vae("cc") String str, @NotNull rq3<? super BuzzerTilesResponse> rq3Var);

    @iu8("/api/v1/chat/topic/{id}")
    @Nullable
    Object getChatMessages(@NotNull @vae("id") String str, @NotNull rq3<? super ChatMessagesResponse> rq3Var);

    @iu8("api/v1/sport/{sport}/{date}/events/index")
    @Nullable
    Object getChronologicalIndexes(@NotNull @vae("sport") String str, @NotNull @vae("date") String str2, @NotNull rq3<? super ChronologicalListIndexesResponse> rq3Var);

    @iu8("api/v1/event/{id}/comments/{languageCode}")
    @Nullable
    Object getCommentary(@vae("id") int i, @NotNull @vae("languageCode") String str, @NotNull rq3<? super CommentaryResponse> rq3Var);

    @iu8("api/v1/suggest/event/{id}/participation")
    @Nullable
    Object getCrowdsourcingEventContributions(@vae("id") int i, @NotNull rq3<? super GetCrowdsourcingEventContributionsResponse> rq3Var);

    @iu8("https://api.sofascore.com/api/v1/event/{customId}/currently-relevant")
    @Nullable
    Object getCurrentlyRelevantEvents(@NotNull @vae("customId") String str, @NotNull rq3<? super CurrentlyRelevantEventsResponse> rq3Var);

    @iu8("api/v1/user-account/{id}/event-openings-graph")
    @Nullable
    Object getEditorOpeningsGraphResponse(@NotNull @vae("id") String str, @NotNull rq3<? super EditorEventOpeningsGraphResponse> rq3Var);

    @iu8("api/v1/user-account/{id}/editor-events-count")
    @Nullable
    Object getEditorsEventsCount(@NotNull @vae("id") String str, @NotNull rq3<? super EditorsEventsCountResponse> rq3Var);

    @iu8("api/v1/user-account/{id}/unique-tournaments")
    @Nullable
    Object getEditorsTournaments(@NotNull @vae("id") String str, @NotNull rq3<? super EditorsTournamentsResponse> rq3Var);

    @iu8("api/v1/event/{id}/odds/{providerId}/boost")
    @Nullable
    Object getEvenBetBoost(@vae("id") int i, @vae("providerId") int i2, @NotNull rq3<? super EventBetBoostsResponse> rq3Var);

    @iu8("api/v1/event/{eventId}")
    @Nullable
    Object getEvent(@vae("eventId") int i, @NotNull rq3<? super EventResponse> rq3Var);

    @iu8("api/v1/event/{eventId}/ai-insights/{language}")
    @Nullable
    Object getEventAiInsights(@vae("eventId") int i, @NotNull @vae("language") String str, @NotNull @w79("X-Premium-Token") String str2, @NotNull rq3<? super AiInsightsResponse> rq3Var);

    @iu8("api/v1/event/{eventId}/ai-insights-postmatch/{language}")
    @Nullable
    Object getEventAiInsightsPostMatch(@vae("eventId") int i, @NotNull @vae("language") String str, @NotNull rq3<? super AiInsightsResponse> rq3Var);

    @iu8("api/v1/event/{eventId}/incidents")
    @Nullable
    Object getEventIncidents(@vae("eventId") int i, @NotNull rq3<? super EventIncidentsResponse> rq3Var);

    @iu8("/api/v1/event/{id}/innings")
    @Nullable
    Object getEventInnings(@vae("id") int i, @NotNull rq3<? super EventInningsResponse> rq3Var);

    @iu8("api/v1/event/{id}/managers")
    @Nullable
    Object getEventManagers(@vae("id") int i, @NotNull rq3<? super EventManagersResponse> rq3Var);

    @iu8("api/v1/event/{eventId}/media/news")
    @Nullable
    Object getEventMediaNews(@vae("eventId") int i, @NotNull rq3<? super EventMediaNewsResponse> rq3Var);

    @iu8("api/v1/event/{id}/player-of-the-match")
    @Nullable
    Object getEventPlayerOfTheMatchOptions(@vae("id") int i, @NotNull rq3<? super FanPlayerOfTheMatchResponse> rq3Var);

    @iu8("api/v1/event/{id}/series")
    @Nullable
    Object getEventSeries(@vae("id") int i, @NotNull rq3<? super EventSeriesResponse> rq3Var);

    @iu8("/api/v1/event/{id}/statistics")
    @Nullable
    Object getEventStatistics(@vae("id") int i, @NotNull rq3<? super EventStatisticsResponse> rq3Var);

    @iu8("api/v1/event/{id}/heatmap/{teamId}")
    @Nullable
    Object getEventTeamHeatMap(@vae("id") int i, @vae("teamId") int i2, @NotNull rq3<? super EventTeamHeatmapResponse> rq3Var);

    @iu8("api/v1/event/{eventId}/official-tweets")
    @Nullable
    Object getEventTweets(@vae("eventId") int i, @NotNull rq3<? super TweetsResponse> rq3Var);

    @iu8("/api/v1/event/{id}/umpires")
    @Nullable
    Object getEventUmpires(@vae("id") int i, @NotNull rq3<? super EventUmpiresResponse> rq3Var);

    @iu8("api/v1/event/{id}/votes")
    @Nullable
    Object getEventVotes(@vae("id") int i, @NotNull rq3<? super VotesResponse> rq3Var);

    @iu8("/api/v1/event/{id}/weather")
    @Nullable
    Object getEventWeather(@vae("id") int i, @NotNull rq3<? super EventWeatherResponse> rq3Var);

    @iu8("api/v1/media-posts/featured")
    @Nullable
    Object getFeaturedTournamentMediaPosts(@NotNull rq3<? super PersonalizedMLMediaResponse> rq3Var);

    @iu8("api/v1/sport/{sport}/available-category-filters")
    @Nullable
    Object getFilterScreenConfig(@NotNull @vae("sport") String str, @NotNull rq3<? super AvailableSportFiltersResponse> rq3Var);

    @iu8("api/v1/event/{id}/shotmap")
    @Nullable
    Object getFootballEventShotmap(@vae("id") int i, @NotNull rq3<? super FootballShotmapResponse> rq3Var);

    @iu8("api/v1/event/{eventId}/goalkeeper-shotmap/player/{playerId}")
    @Nullable
    Object getFootballGoalkeeperEventShotmap(@vae("eventId") int i, @vae("playerId") int i2, @NotNull rq3<? super FootballShotmapResponse> rq3Var);

    @iu8("api/v1/event/{eventId}/player/{playerId}/rating-breakdown")
    @Nullable
    Object getFootballPlayerEventRatingBreakdown(@vae("eventId") int i, @vae("playerId") int i2, @NotNull rq3<? super FootballEventPlayerRatingBreakdownResponse> rq3Var);

    @iu8("api/v1/event/{eventId}/shotmap/player/{playerId}")
    @Nullable
    Object getFootballPlayerEventShotmap(@vae("eventId") int i, @vae("playerId") int i2, @NotNull rq3<? super FootballShotmapResponse> rq3Var);

    @iu8("api/v1/team/{id}/unique-tournament/{tid}/season/{sid}/goal-distributions")
    @Nullable
    Object getGoalDistributions(@vae("id") int i, @vae("tid") int i2, @vae("sid") int i3, @NotNull rq3<? super GoalDistributionsResponse> rq3Var);

    @iu8("api/v1/event/{id}/h2h")
    @Nullable
    Object getHead2Head(@vae("id") int i, @NotNull rq3<? super Head2HeadResponse> rq3Var);

    @iu8("api/v1/event/{customId}/h2h/events")
    @Nullable
    Object getHead2HeadEvents(@NotNull @vae("customId") String str, @NotNull rq3<? super Head2HeadEventsResponse> rq3Var);

    @iu8("api/v1/event/{eventId}/highlights")
    @Nullable
    Object getHighlights(@vae("eventId") int i, @NotNull rq3<? super HighlightsResponse> rq3Var);

    @iu8("api/v1/event/{id}/shotmap")
    @Nullable
    Object getHockeyEventShotmap(@vae("id") int i, @NotNull rq3<? super HockeyEventShotmapResponse> rq3Var);

    @iu8("api/v1/event/{id}/comments")
    @Nullable
    Object getHockeyPlayByPlay(@vae("id") int i, @NotNull rq3<? super HockeyPlayByPlayResponse> rq3Var);

    @iu8("api/v1/event/{eventId}/player/{playerId}/shotmap")
    @Nullable
    Object getHockeyPlayerEventShotmap(@vae("eventId") int i, @vae("playerId") int i2, @NotNull rq3<? super HockeyPlayerShotmapResponse> rq3Var);

    @iu8("api/v1/sport/{sport}/{date}/events/{page}")
    @Nullable
    Object getIndexedEventsPage(@NotNull @vae("sport") String str, @NotNull @vae("date") String str2, @vae("page") int i, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/event/{eventId}/lineups")
    @Nullable
    Object getLineups(@vae("eventId") int i, @NotNull rq3<? super LineupsResponse> rq3Var);

    @iu8("api/v1/event/{eventId}/media/summary/country/{alpha2}")
    @Nullable
    Object getMediaHighlightSummary(@vae("eventId") int i, @NotNull @vae("alpha2") String str, @NotNull rq3<? super MediaHighlightSummaryResponse> rq3Var);

    @iu8("api/v1/user-account/{id}/popular-events-action")
    @Nullable
    Object getMostOpenedEditorMatches(@NotNull @vae("id") String str, @NotNull rq3<? super EditorsPopularEventsResponse> rq3Var);

    @iu8("/api/v1/suggest/event/{eventId}/device/{deviceId}")
    @Nullable
    Object getMyContributions(@vae("eventId") int i, @NotNull @vae("deviceId") String str, @NotNull rq3<? super MyContributionsResponse> rq3Var);

    @iu8("/api/v1/buzzer/simple-tiles/{cc}")
    @Nullable
    Object getNewBuzzerTiles(@NotNull @vae("cc") String str, @NotNull rq3<? super NewBuzzerTilesResponse> rq3Var);

    @iu8("api/v1/event/newly-added-events")
    @Nullable
    Object getNewlyAddedEvents(@NotNull rq3<? super AddedEventsResponse> rq3Var);

    @iu8("api/v1/event/ai-insights/next/{sport}")
    @Nullable
    Object getNextAiInsightsEvent(@NotNull @vae("sport") String str, @NotNull rq3<? super AiInsightsNextResponse> rq3Var);

    @iu8("api/v1/config/country-sport-priorities/country/{countryCode}")
    @Nullable
    Object getOrderedSports(@NotNull @vae("countryCode") String str, @NotNull rq3<? super OrderedSportsResponse> rq3Var);

    @iu8("api/v1/pickem/{alpha2}/active")
    @Nullable
    Object getPickemConfig(@NotNull @vae("alpha2") String str, @NotNull rq3<? super PickemResponse> rq3Var);

    @iu8("api/v1/player/{playerId}/media/summary/country/{alpha2}")
    @Nullable
    Object getPlayerHighlightSummary(@vae("playerId") int i, @NotNull @vae("alpha2") String str, @NotNull rq3<? super MediaHighlightSummaryResponse> rq3Var);

    @iu8("api/v1/player/{playerId}/media")
    @Nullable
    Object getPlayerHighlights(@vae("playerId") int i, @NotNull rq3<? super MediaResponse> rq3Var);

    @iu8("api/v1/player/{playerId}/media/news")
    @Nullable
    Object getPlayerMediaNews(@vae("playerId") int i, @NotNull rq3<? super EventMediaNewsResponse> rq3Var);

    @iu8("api/v1/player/{playerId}/media/videos")
    @Nullable
    Object getPlayerVideos(@vae("playerId") int i, @NotNull rq3<? super YoutubeVideoResponse> rq3Var);

    @iu8("api/v1/sport/{sport}/{countryCode}/popular-events/{date}")
    @Nullable
    Object getPopularEvents(@NotNull @vae("sport") String str, @NotNull @vae("countryCode") String str2, @NotNull @vae("date") String str3, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/sport/all/popular-events")
    @Nullable
    Object getPopularEvents(@NotNull rq3<? super Head2HeadEventsResponse> rq3Var);

    @iu8("api/v1/league/popular-events")
    @Nullable
    Object getPopularUpcomingEvents(@NotNull rq3<? super PopularEventsResponse> rq3Var);

    @iu8("api/v1/user-account/referral/{uid}/share-link")
    @Nullable
    Object getReferralShareLink(@NotNull @vae("uid") String str, @NotNull rq3<? super ReferralShareLink> rq3Var);

    @iu8("api/v1/user-account/referral/{uid}")
    @Nullable
    Object getReferrals(@NotNull @vae("uid") String str, @NotNull rq3<? super ReferralResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{tid}/season/{sid}/shot-action-areas/{type}")
    @Nullable
    Object getSeasonShotActionAreas(@vae("tid") int i, @vae("sid") int i2, @NotNull @vae("type") String str, @NotNull rq3<? super SeasonShotActionAreaResponse> rq3Var);

    @iu8("api/v1/sofa-season/2025/{deviceId}")
    @Nullable
    Object getSofaSeason(@NotNull @vae("deviceId") String str, @NotNull rq3<? super SofaSeasonResponse> rq3Var);

    @i0e("https://ott.sofascore.com/api/v3/contents/{streamContentId}/access/hls")
    @Nullable
    Object getSportRadarStreamUrl(@vae("streamContentId") int i, @NotNull @w79("Authorization") String str, @NotNull rq3<? super SportRadarStreamUrlResponse> rq3Var);

    @i0e("api/v1/stream/token")
    @Nullable
    Object getSportRadarToken(@NotNull rq3<? super SportRadarTokenResponse> rq3Var);

    @iu8("api/v1/stage/{stageId}/highlights")
    @Nullable
    Object getStageHighlights(@vae("stageId") int i, @NotNull rq3<? super HighlightsResponse> rq3Var);

    @iu8("api/v1/survey/{id}")
    @Nullable
    Object getSurvey(@vae("id") int i, @NotNull rq3<? super SurveyResponse> rq3Var);

    @iu8("api/v1/team/{id}/achievements")
    @Nullable
    Object getTeamAchievements(@vae("id") int i, @NotNull rq3<? super TeamAchievementsResponse> rq3Var);

    @iu8("/api/v1/team/{id}/events/{span}/{page}")
    @Nullable
    Object getTeamEventList(@vae("id") int i, @NotNull @vae("span") String str, @vae("page") int i2, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("/api/v1/team/{id}/events/{type}/{span}/{page}")
    @Nullable
    Object getTeamEventList(@vae("id") int i, @NotNull @vae("type") String str, @NotNull @vae("span") String str2, @vae("page") int i2, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("/api/v1/team/{id}/unique-tournament/{uid}/events/{span}/{page}")
    @Nullable
    Object getTeamEventListForTournament(@vae("id") int i, @vae("uid") int i2, @NotNull @vae("span") String str, @vae("page") int i3, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("/api/v1/team/{id}/events/{monthYear}")
    @Nullable
    Object getTeamEventsByMonth(@vae("id") int i, @NotNull @vae("monthYear") String str, @NotNull rq3<? super EventsByMonthResponse> rq3Var);

    @iu8("api/v1/team/{teamId}/media/summary/country/{alpha2}")
    @Nullable
    Object getTeamHighlightSummary(@vae("teamId") int i, @NotNull @vae("alpha2") String str, @NotNull rq3<? super MediaHighlightSummaryResponse> rq3Var);

    @iu8("api/v1/team/{teamId}/media/news")
    @Nullable
    Object getTeamMediaNews(@vae("teamId") int i, @NotNull rq3<? super EventMediaNewsResponse> rq3Var);

    @iu8("/api/v1/team/{id}/rss")
    @Nullable
    Object getTeamRssFeed(@vae("id") int i, @NotNull rq3<? super TeamRssFeedResponse> rq3Var);

    @iu8("api/v1/team/{id}/season/{seasonId}/best-result")
    @Nullable
    Object getTeamSeasonPlacement(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super TeamSeasonPlacementResponse> rq3Var);

    @iu8("api/v1/team/{id}/players")
    @Nullable
    Object getTeamSquad(@vae("id") int i, @NotNull rq3<? super TeamPlayersResponse> rq3Var);

    @iu8("api/v1/event/{id}/team-streaks")
    @Nullable
    Object getTeamStreaks(@vae("id") int i, @NotNull rq3<? super TeamStreaksResponse> rq3Var);

    @iu8("api/v1/team/{teamId}/official-tweets")
    @Nullable
    Object getTeamTweets(@vae("teamId") int i, @NotNull rq3<? super TweetsResponse> rq3Var);

    @iu8("api/v1/team/{teamId}/media/videos")
    @Nullable
    Object getTeamVideos(@vae("teamId") int i, @NotNull rq3<? super YoutubeVideoResponse> rq3Var);

    @iu8("api/v1/team/{id}/year-statistics/{year}")
    @Nullable
    Object getTennisTeamYearlyStatistics(@vae("id") int i, @NotNull @vae("year") String str, @NotNull rq3<? super TennisTeamYearlyStatisticsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{tid}/season/{sid}/top-followed-players")
    @Nullable
    Object getTopFollowedPlayers(@vae("tid") int i, @vae("sid") int i2, @NotNull rq3<? super TopFollowedPlayersResponse> rq3Var);

    @iu8("api/v1/transfer")
    @Nullable
    Object getTransfers(@rif @NotNull LinkedHashMap<String, String> linkedHashMap, @NotNull rq3<? super TransfersResponse> rq3Var);

    @iu8("api/v1/tv/channel/{id}/{type}/{eventId}/votes")
    @Nullable
    Object getTvChannelVotes(@vae("id") int i, @NotNull @vae("type") TvType tvType, @vae("eventId") int i2, @NotNull rq3<? super TvChannelVotesResponse> rq3Var);

    @iu8("api/v1/tv/{type}/{eventId}/country-channels")
    @Nullable
    Object getTvCountryChannels(@NotNull @vae("type") TvType tvType, @vae("eventId") int i, @NotNull rq3<? super TvCountryChannelsResponse> rq3Var);

    @iu8("api/v1/user/{id}/badges")
    @Nullable
    Object getUserBadges(@NotNull @vae("id") String str, @NotNull rq3<? super UserBadgesResponse> rq3Var);

    @iu8("api/v1/user-account/{id}/contributions-count")
    @Nullable
    Object getUserContributionSummary(@NotNull @vae("id") String str, @NotNull rq3<? super ContributionSummaryResponse> rq3Var);

    @iu8("api/v1/user-account/{id}/contributions")
    @Nullable
    Object getUserContributions(@NotNull @vae("id") String str, @NotNull rq3<? super ContributionsResponse> rq3Var);

    @iu8("api/v1/player-of-the-match/user/{id}/votes")
    @Nullable
    Object getUserPlayerOfTheMatchVotes(@NotNull @vae("id") String str, @NotNull rq3<? super UserPlayerOfTheMatchVotesResponse> rq3Var);

    @iu8("/api/v1/user-segmentation/{uuidPrefix}")
    @Nullable
    Object getUserSegmentation(@NotNull @vae("uuidPrefix") String str, @NotNull rq3<? super Map<String, NetworkUserSegmentation>> rq3Var);

    @iu8("api/v1/user-account/{id}/predictions-future")
    @Nullable
    Object getUserVotes(@NotNull @vae("id") String str, @NotNull rq3<? super UserPredictionsVotesResponse> rq3Var);

    @iu8("/api/v1/valuable-user/{version}/{prefix}")
    @Nullable
    Object getValuableUsersForVersion(@NotNull @vae("version") String str, @NotNull @vae("prefix") String str2, @NotNull rq3<? super ValuableUserResponse> rq3Var);

    @iu8("/api/v1/valuable-user/versions")
    @Nullable
    Object getValuableUsersVersions(@NotNull rq3<? super ValuableUserVersionsResponse> rq3Var);

    @iu8("api/v1/event/{eventId}/sport-video-highlights/country/{alpha2code}/extended")
    @Nullable
    Object getWSCHighlightsForEvent(@vae("eventId") int i, @NotNull @vae("alpha2code") String str, @NotNull rq3<? super WSCStoriesResponse> rq3Var);

    @iu8("api/v1/league/assets")
    @Nullable
    Object getWeeklyChallengeAssets(@NotNull rq3<? super WeeklyChallengeAssetsResponse> rq3Var);

    @iu8("api/v1/league/leaderboard/{id}/rankings")
    @Nullable
    Object getWeeklyChallengeRankings(@NotNull @vae("id") String str, @NotNull rq3<? super WeeklyChallengeLeaderboardResponse> rq3Var);

    @iu8("api/v1/league/active-league-details")
    @Nullable
    Object getWeeklyChallengeTimestamp(@NotNull rq3<? super WeeklyChallengeTimestampResponse> rq3Var);

    @iu8("api/v1/event/{id}/provider/{providerId}/winning-odds")
    @Nullable
    Object getWinningOdds(@vae("id") int i, @vae("providerId") int i2, @NotNull rq3<? super WinningOddsResponse> rq3Var);

    @iu8("api/v1/player/{pid}/goalkeeper-penalty-history")
    @Nullable
    Object goalkeeperPenaltyHistory(@vae("pid") int i, @NotNull rq3<? super PlayerPenaltyHistoryResponse> rq3Var);

    @iu8("/api/v1/odds/{id}/top-h2h/{sportSlug}")
    @Nullable
    Object h2hStreaks(@vae("id") int i, @NotNull @vae("sportSlug") String str, @NotNull rq3<? super H2HStreaksResponse> rq3Var);

    @iu8("api/v1/event/{id}/player/{playerid}/heatmap")
    @Nullable
    Object heatMap(@vae("id") int i, @vae("playerid") int i2, @NotNull rq3<? super PlayerHeatmapResponse> rq3Var);

    @iu8("/api/v1/odds/{providerId}/high-value-streaks")
    @Nullable
    Object highValueStreaks(@vae("providerId") int i, @NotNull rq3<? super HighValueStreaksResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/historical-season-comparison")
    @Nullable
    Object historicalSeasonComparison(@vae("id") int i, @NotNull rq3<? super HistoricalSeasonComparisonResponse> rq3Var);

    @iu8
    @Nullable
    Object info(@kek @NotNull String str, @w79("app-version") int i, @qif("platform") @NotNull String str2, @qif("sdk_version") int i2, @NotNull rq3<? super InfoResponse> rq3Var);

    @iu8("api/v1/event/{id}/suggests")
    @Nullable
    Object latestCrowdsourcingSuggests(@vae("id") int i, @NotNull rq3<? super LatestCrowdsourcingSuggestResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{sid}/editors")
    @Nullable
    Object leagueEditors(@vae("id") int i, @vae("sid") int i2, @NotNull rq3<? super LeagueEditorsResponse> rq3Var);

    @i0e("api/v1/unique-tournament/{id}/player-votes/vote")
    @Nullable
    Object leagueGoatPlayerVote(@vae("id") int i, @yy1 @NotNull LeagueGoatPlayerVoteBody leagueGoatPlayerVoteBody, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/player-votes/ranking")
    @Nullable
    Object leagueGoatPlayerVotes(@vae("id") int i, @NotNull rq3<? super LeagueGoatPlayerVotesResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{sid}/top-players/{type}")
    @Nullable
    Object leagueTopPlayers(@vae("id") int i, @vae("sid") int i2, @NotNull @vae("type") String str, @NotNull rq3<? super TopPerformanceResponse<? extends TopPerformanceStatistics>> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{sid}/top-players/{type}/{positionDetailed}")
    @Nullable
    Object leagueTopPlayersByPosition(@vae("id") int i, @vae("sid") int i2, @NotNull @vae("type") String str, @NotNull @vae("positionDetailed") String str2, @NotNull rq3<? super TopPerformanceResponse<? extends TopPerformanceStatistics>> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{sid}/top-players-per-game/all/{type}")
    @Nullable
    Object leagueTopStats(@vae("id") int i, @vae("sid") int i2, @NotNull @vae("type") String str, @NotNull rq3<? super TopPerformanceResponse<? extends TopPerformanceStatistics>> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{sid}/top-players-per-game/{positionDetailed}/{type}")
    @Nullable
    Object leagueTopStatsByPosition(@vae("id") int i, @vae("sid") int i2, @NotNull @vae("positionDetailed") String str, @NotNull @vae("type") String str2, @NotNull rq3<? super TopPerformanceResponse<? extends TopPerformanceStatistics>> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{sid}/top-teams/{type}")
    @Nullable
    Object leagueTopTeams(@vae("id") int i, @vae("sid") int i2, @NotNull @vae("type") String str, @NotNull rq3<? super TopPerformanceResponse<? extends TopPerformanceStatistics>> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{sid}/top-teams/{type}/{division}")
    @Nullable
    Object leagueTopTeamsByDivision(@vae("id") int i, @vae("sid") int i2, @NotNull @vae("type") String str, @NotNull @vae("division") String str2, @NotNull rq3<? super TopPerformanceResponse<? extends TopPerformanceStatistics>> rq3Var);

    @iu8("api/v1/sport/{sport}/live-categories")
    @Nullable
    Object liveCategories(@NotNull @vae("sport") String str, @NotNull rq3<? super LiveCategoriesResponse> rq3Var);

    @iu8("api/v1/manager/{id}/career-history")
    @Nullable
    Object managerCareerHistory(@vae("id") int i, @NotNull rq3<? super CareerHistoryResponse> rq3Var);

    @iu8("api/v1/manager/{id}")
    @Nullable
    Object managerDetails(@vae("id") int i, @NotNull rq3<? super ManagerDetailsResponse> rq3Var);

    @iu8("api/v1/manager/{id}/events/{type}/{page}")
    @Nullable
    Object managerEvents(@vae("id") int i, @NotNull @vae("type") String str, @vae("page") int i2, @NotNull rq3<? super ManagerEventsResponse> rq3Var);

    @i0e("/api/v1/chat/topic/{id}/not-risky")
    @Nullable
    Object markNotRisky(@NotNull @vae("id") String str, @NotNull rq3<? super NetworkResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{utId}/media/season/{sid}/matchday-highlights")
    @Nullable
    Object matchdayHighlights(@vae("utId") int i, @vae("sid") int i2, @NotNull rq3<? super MatchdayHighlightsResponse> rq3Var);

    @iu8("api/v1/media-posts/{id}")
    @Nullable
    Object mediaPost(@vae("id") int i, @NotNull rq3<? super MediaPostResponse> rq3Var);

    @iu8("/api/v1/media-posts/{id}/reactions")
    @Nullable
    Object mediaPostReactions(@vae("id") int i, @NotNull rq3<? super MediaPostReactionsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{uid}/tournament/{tid}/mma-events/{type}")
    @Nullable
    Object mmaFightNightEvents(@vae("uid") int i, @vae("tid") int i2, @NotNull @vae("type") String str, @NotNull rq3<? super MmaEventListResponse> rq3Var);

    @iu8("api/v1/rankings/unique-tournament/{id}/summary")
    @Nullable
    Object mmaOrganisationRanking(@vae("id") int i, @NotNull rq3<? super RankingsSummaryResponse> rq3Var);

    @iu8("api/v1/rankings/unique-tournament/{uniqueTournamentId}/{weightClass}/{gender}")
    @Nullable
    Object mmaRankingByWeightClass(@vae("uniqueTournamentId") int i, @NotNull @vae("weightClass") String str, @NotNull @vae("gender") String str2, @NotNull rq3<? super Ranking> rq3Var);

    @iu8("api/v1/calendar/{yearAndMonth}/{timezoneOffset}/{sportSlug}/stages")
    @Nullable
    Object monthlyStages(@NotNull @vae("yearAndMonth") String str, @NotNull @vae("timezoneOffset") String str2, @NotNull @vae("sportSlug") String str3, @NotNull rq3<? super MonthlyStages> rq3Var);

    @iu8("api/v1/calendar/{yearAndMonth}/{timezoneOffset}/{sportSlug}/unique-tournaments")
    @Nullable
    Object monthlyTournaments(@NotNull @vae("yearAndMonth") String str, @NotNull @vae("timezoneOffset") String str2, @NotNull @vae("sportSlug") String str3, @NotNull rq3<? super MonthlyUniqueTournamentsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/recent-event-ids")
    @Nullable
    Object myLeagueEventIds(@vae("id") int i, @NotNull rq3<? super EventIdsResponse> rq3Var);

    @i0e("api/v1/user/nickname")
    @Nullable
    Object nickname(@yy1 @NotNull PostUserNickname postUserNickname, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @iu8("api/v1/odds/{providerId}")
    @Nullable
    Object oddsProviderDetails(@vae("providerId") int i, @NotNull rq3<? super OddsProviderDetailsResponse> rq3Var);

    @iu8("api/v1/odds/{providerSlug}")
    @Nullable
    Object oddsProviderDetails(@NotNull @vae("providerSlug") String str, @NotNull rq3<? super OddsProviderDetailsResponse> rq3Var);

    @iu8("api/v1/odds/providers/{cc}/{type}")
    @Nullable
    Object oddsProvidersForCountry(@NotNull @vae("cc") String str, @NotNull @vae("type") String str2, @NotNull rq3<? super OddsProvidersResponse> rq3Var);

    @iu8("api/v1/odds/providers/{cc}-{rc}/{type}")
    @Nullable
    Object oddsProvidersForCountryRegion(@NotNull @vae("cc") String str, @NotNull @vae("rc") String str2, @NotNull @vae("type") String str3, @NotNull rq3<? super OddsProvidersResponse> rq3Var);

    @iu8("api/v1/offers/banner/unique-tournament/{id}/{countryCode}/{languageCode}")
    @Nullable
    Object offersBanner(@vae("id") int i, @NotNull @vae("countryCode") String str, @NotNull @vae("languageCode") String str2, @NotNull rq3<? super OffersBannerResponse> rq3Var);

    @iu8("api/v1/offers/banner/player/{id}/{countryCode}/{languageCode}")
    @Nullable
    Object offersBannerPlayer(@vae("id") int i, @NotNull @vae("countryCode") String str, @NotNull @vae("languageCode") String str2, @NotNull rq3<? super OffersBannerResponse> rq3Var);

    @iu8("api/v1/offers/banner/team/{id}/{countryCode}/{languageCode}")
    @Nullable
    Object offersBannerTeam(@vae("id") int i, @NotNull @vae("countryCode") String str, @NotNull @vae("languageCode") String str2, @NotNull rq3<? super OffersBannerResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/team/{teamId}/team-performance-graph-data")
    @Nullable
    Object performanceGraphData(@vae("id") int i, @vae("seasonId") int i2, @vae("teamId") int i3, @NotNull rq3<? super PerformanceGraphDataResponse> rq3Var);

    @iu8("api/v1/media-posts/personalized/{type}/{id}")
    @Nullable
    Object personalizedMLMediaPosts(@NotNull @vae("type") String str, @NotNull @vae("id") String str2, @qif("types") @Nullable String str3, @qif("excludeTypes") @Nullable String str4, @NotNull rq3<? super PersonalizedMLMediaResponse> rq3Var);

    @iu8("api/v1/player/{id}/attribute-overviews")
    @Nullable
    Object playerAttributeOverview(@vae("id") int i, @NotNull rq3<? super AttributeOverviewResponse> rq3Var);

    @iu8("api/v1/player/{id}/statistics/match-type/{matchType}")
    @Nullable
    Object playerCareerStatistics(@vae("id") int i, @Nullable @vae("matchType") String str, @NotNull rq3<? super PlayerCareerStatisticsResponse> rq3Var);

    @iu8("api/v1/player/{id}/characteristics")
    @Nullable
    Object playerCharacteristics(@vae("id") int i, @NotNull rq3<? super PlayerCharacteristicsResponse> rq3Var);

    @iu8("api/v1/player/{id}")
    @Nullable
    Object playerDetails(@vae("id") int i, @NotNull rq3<? super PlayerDetailsResponse> rq3Var);

    @iu8("api/v1/event/{id}/player/{pid}/pitches/{type}")
    @Nullable
    Object playerEventBaseballPitches(@vae("id") int i, @vae("pid") int i2, @NotNull @vae("type") String str, @NotNull rq3<? super BaseballPitchesResponse> rq3Var);

    @iu8("api/v1/event/{id}/player/{pid}/heatmap")
    @Nullable
    Object playerEventHeatmap(@vae("id") int i, @vae("pid") int i2, @NotNull rq3<? super PlayerHeatmapResponse> rq3Var);

    @iu8("api/v1/event/{id}/player/{pid}/statistics")
    @Nullable
    Object playerEventStatistics(@vae("id") int i, @vae("pid") int i2, @NotNull rq3<? super PlayerEventStatisticsResponse> rq3Var);

    @iu8("api/v1/player/{id}/events/last/{page}")
    @Nullable
    Object playerEventsList(@vae("id") int i, @vae("page") int i2, @NotNull rq3<? super PlayerEventsListResponse> rq3Var);

    @iu8("api/v1/player/{id}/national-team-statistics")
    @Nullable
    Object playerNationalTeamStatistics(@vae("id") int i, @NotNull rq3<? super NationalTeamStatisticsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/player-of-the-season")
    @Nullable
    Object playerOfTheSeason(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super PlayerOfTheSeasonResponse> rq3Var);

    @iu8("api/v1/player-of-the-season/{sport}/available-years")
    @Nullable
    Object playerOfTheSeasonAvailableYears(@NotNull @vae("sport") String str, @NotNull rq3<? super POTSHighestRatedPlayersAvailableYears> rq3Var);

    @iu8("api/v1/player-of-the-season/{sport}/highest-ratings")
    @Nullable
    Object playerOfTheSeasonHighestRatedPlayers(@NotNull @vae("sport") String str, @rif @NotNull SortedMap<String, String> sortedMap, @NotNull rq3<? super POTSHighestRatedPlayersResponse> rq3Var);

    @iu8("api/v1/player-of-the-season/unique-tournament/{uniqueTournamentId}")
    @Nullable
    Object playerOfTheSeasonLeagueTopPlayers(@vae("uniqueTournamentId") int i, @NotNull rq3<? super POTSLeagueTopPlayersResponse> rq3Var);

    @iu8("api/v1/player-of-the-season/{sport}/most-awards/page/{page}")
    @Nullable
    Object playerOfTheSeasonMostAwards(@NotNull @vae("sport") String str, @vae("page") int i, @NotNull rq3<? super POTSMostAwardsResponse> rq3Var);

    @iu8("api/v1/player-of-the-season/player/{playerId}")
    @Nullable
    Object playerOfTheSeasonPlayerAwards(@vae("playerId") int i, @NotNull rq3<? super POTSPlayerAwardsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/player-of-the-season-race")
    @Nullable
    Object playerOfTheSeasonRace(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super TopPerformanceResponse<? extends TopPerformanceStatistics>> rq3Var);

    @iu8("api/v1/player-of-the-season/{sport}/top-competitions")
    @Nullable
    Object playerOfTheSeasonTopCompetitions(@NotNull @vae("sport") String str, @NotNull rq3<? super POTSTopCompetitionsResponse> rq3Var);

    @iu8("api/v1/player/{pid}/penalty-history/unique-tournament/{uid}/season/{sid}")
    @Nullable
    Object playerPenaltyHistory(@vae("pid") int i, @vae("uid") int i2, @vae("sid") int i3, @NotNull rq3<? super PlayerPenaltyHistoryResponse> rq3Var);

    @iu8("api/v1/player/{pid}/penalty-history")
    @Nullable
    Object playerPenaltyHistory(@vae("pid") int i, @NotNull rq3<? super PlayerPenaltyHistoryResponse> rq3Var);

    @iu8("api/v1/player/{pid}/unique-tournament/{tid}/season/{sid}/heatmap")
    @Nullable
    Object playerSeasonHeatMap(@vae("pid") int i, @vae("tid") int i2, @vae("sid") int i3, @NotNull rq3<? super PlayerSeasonHeatMapResponse> rq3Var);

    @iu8("api/v1/player/{pid}/unique-tournament/{tid}/season/{sid}/ratings/{type}")
    @Nullable
    Object playerSeasonRatings(@vae("pid") int i, @vae("tid") int i2, @vae("sid") int i3, @NotNull @vae("type") String str, @NotNull rq3<? super PlayerSeasonRatingsResponse> rq3Var);

    @iu8("api/v1/player/{id}/unique-tournament/{tid}/season/{sid}/statistics/{type}")
    @Nullable
    Object playerSeasonStatistics(@vae("id") int i, @vae("tid") int i2, @vae("sid") int i3, @NotNull @vae("type") String str, @NotNull rq3<? super PlayerSeasonStatisticsResponse<? extends AbstractPlayerSeasonStatistics>> rq3Var);

    @iu8("api/v1/player/{id}/statistics/seasons")
    @Nullable
    Object playerStatisticsSeasons(@vae("id") int i, @NotNull rq3<? super StatisticsSeasonsResponse> rq3Var);

    @iu8("api/v1/player/{pid}/unique-tournament/{tid}/season/{sid}/shot-actions/{type}")
    @Nullable
    Object playerSubSeasonShotActions(@vae("pid") int i, @vae("tid") int i2, @vae("sid") int i3, @NotNull @vae("type") String str, @NotNull rq3<? super PlayerSeasonShotActionsResponse> rq3Var);

    @iu8("api/v1/player/{id}/unique-tournament/{tid}/events/last/{page}")
    @Nullable
    Object playerTournamentEventsList(@vae("id") int i, @vae("tid") int i2, @vae("page") int i3, @NotNull rq3<? super PlayerEventsListResponse> rq3Var);

    @iu8("api/v1/player/{id}/unique-tournament/{tid}/statistics/{type}")
    @Nullable
    Object playerTournamentStatistics(@vae("id") int i, @vae("tid") int i2, @NotNull @vae("type") String str, @NotNull rq3<? super PlayerCareerStatisticsResponse> rq3Var);

    @iu8("api/v1/player/{id}/unique-tournaments")
    @Nullable
    Object playerTournaments(@vae("id") int i, @NotNull rq3<? super PlayerUniqueTournamentsResponse> rq3Var);

    @iu8("api/v1/player/{id}/transfer-history")
    @Nullable
    Object playerTransferHistory(@vae("id") int i, @NotNull rq3<? super TransferHistoryResponse> rq3Var);

    @iu8("api/v1/player/{id}/last-year-summary")
    @Nullable
    Object playerYearSummary(@vae("id") int i, @NotNull rq3<? super PlayerYearSummaryResponse> rq3Var);

    @iu8("api/v1/event/{id}/point-by-point")
    @Nullable
    Object pointByPoint(@vae("id") int i, @NotNull rq3<? super PointByPointResponse> rq3Var);

    @i0e("/api/v1/chat/topic/{id}")
    @Nullable
    Object postMessage(@NotNull @vae("id") String str, @yy1 @NotNull PostChatMessage postChatMessage, @NotNull rq3<? super NetworkResponse> rq3Var);

    @i0e("api/v1/survey/{id}")
    @Nullable
    Object postSurveyData(@vae("id") int i, @yy1 @NotNull SurveyAnswersPost surveyAnswersPost, @NotNull rq3<Object> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{sid}/power-rankings/round/{roundId}")
    @Nullable
    Object powerRanking(@vae("id") int i, @vae("sid") int i2, @vae("roundId") int i3, @NotNull rq3<? super PowerRankingResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{sid}/power-rankings/rounds")
    @Nullable
    Object powerRankingRounds(@vae("id") int i, @vae("sid") int i2, @NotNull rq3<? super PowerRankingRoundsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{sid}/power-rankings/team/{teamId}/team-performance-graph-data")
    @Nullable
    Object powerRankingsGraphData(@vae("id") int i, @vae("sid") int i2, @vae("teamId") int i3, @NotNull rq3<? super PowerRankingsGraphDataResponse> rq3Var);

    @iu8("api/v1/event/{id}/pregame-form")
    @Nullable
    Object pregameForm(@vae("id") int i, @NotNull rq3<? super PregameFormResponse> rq3Var);

    @iu8("api/v1/user-account/{id}")
    @Nullable
    Object profile(@NotNull @vae("id") String str, @NotNull rq3<? super ProfileNetworkResponse> rq3Var);

    @i0e("api/v1/user/purchase")
    @Nullable
    Object purchaseAds(@yy1 @NotNull UserPurchasePostBody userPurchasePostBody, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @i0e("api/v1/user/purchase")
    @Nullable
    Object purchaseAnalyst(@yy1 @NotNull UserPurchasePostBody userPurchasePostBody, @NotNull rq3<? super PremiumTokenResponse> rq3Var);

    @iu8("api/v1/sport/{sport}/{date}/query-categories/{query}")
    @Nullable
    Object queryCategoriesForData(@NotNull @vae("sport") String str, @NotNull @vae("date") String str2, @NotNull @vae(encoded = true, value = "query") String str3, @NotNull rq3<? super CategoriesForDateResponse> rq3Var);

    @iu8("api/v1/team/{tid}/unique-tournament/{uid}/season/{sid}/ranks/{type}")
    @Nullable
    Object rankedTeamSeasonStatistics(@vae("tid") int i, @vae("uid") int i2, @vae("sid") int i3, @NotNull @vae("type") String str, @NotNull rq3<? super TeamSeasonStatisticsResponse<? extends TeamSeasonStatistics>> rq3Var);

    @iu8("api/v1/rankings/{rankingId}")
    @Nullable
    Object rankings(@vae("rankingId") int i, @NotNull rq3<? super Ranking> rq3Var);

    @iu8("api/v1/unique-stage/{id}/recent-stage-ids")
    @Nullable
    Object recentStageIds(@vae("id") int i, @NotNull rq3<? super RecentStageIdsResponse> rq3Var);

    @iu8("api/v1/team/{id}/recent-unique-tournaments")
    @Nullable
    Object recentTeamTournaments(@vae("id") int i, @NotNull rq3<? super RecentTeamTournamentsResponse> rq3Var);

    @iu8("api/v1/odds/{providerId}/recommended-prematch/tournament/{tournamentId}")
    @Nullable
    Object recommendedPrematchOdds(@vae("tournamentId") int i, @vae("providerId") int i2, @NotNull rq3<? super FeaturedPrematchOddsResponse> rq3Var);

    @iu8("api/v1/odds/{providerId}/recommended-prematch-top-voted/sport/{sportSlug}")
    @Nullable
    Object recommendedPrematchTopVotedOdds(@NotNull @vae("sportSlug") String str, @vae("providerId") int i, @NotNull rq3<? super FeaturedPrematchOddsResponse> rq3Var);

    @iu8("api/v1/referee/{id}")
    @Nullable
    Object refereeDetails(@vae("id") int i, @NotNull rq3<? super RefereeDetailsResponse> rq3Var);

    @iu8("api/v1/referee/{id}/events/{type}/{page}")
    @Nullable
    Object refereeEvents(@vae("id") int i, @NotNull @vae("type") String str, @vae("page") int i2, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/referee/{id}/statistics")
    @Nullable
    Object refereeStatistics(@vae("id") int i, @NotNull rq3<? super RefereeStatisticsResponse> rq3Var);

    @i0e("/api/v1/chat/message/{id}/{type}")
    @Nullable
    Object reportMessage(@vae("id") int i, @NotNull @vae("type") String str, @yy1 @NotNull BanReason banReason, @NotNull rq3<? super NetworkResponse> rq3Var);

    @iu8("api/v1/chat/risky-topics")
    @Nullable
    Object riskyChatChannels(@NotNull rq3<? super RiskyTopicsResponse> rq3Var);

    @iu8("/api/v1/search/all")
    @Nullable
    Object search(@qif("q") @NotNull String str, @qif("sport") @Nullable String str2, @qif("page") int i, @NotNull rq3<? super SearchResponse> rq3Var);

    @iu8("/api/v1/search/{entityType}")
    @Nullable
    Object searchByEntityType(@NotNull @vae("entityType") String str, @qif("q") @NotNull String str2, @qif("sport") @Nullable String str3, @qif("page") int i, @NotNull rq3<? super SearchResponse> rq3Var);

    @iu8("api/v1/search/managers/{query}")
    @Nullable
    Object searchManagers(@NotNull @vae("query") String str, @NotNull rq3<? super SearchManagersResponse> rq3Var);

    @iu8("api/v1/search/players/{query}/{more}")
    @Nullable
    Object searchPlayers(@NotNull @vae("query") String str, @NotNull @vae("more") String str2, @NotNull rq3<? super SearchPlayersResponse> rq3Var);

    @iu8("/api/v1/search/suggestions/{entityType}")
    @Nullable
    Object searchSuggestionsByEntityType(@NotNull @vae("entityType") String str, @qif("sport") @Nullable String str2, @NotNull rq3<? super SearchResponse> rq3Var);

    @iu8("api/v1/search/teams/{query}/{more}")
    @Nullable
    Object searchTeams(@NotNull @vae("query") String str, @NotNull @vae("more") String str2, @NotNull rq3<? super SearchTeamsResponse> rq3Var);

    @iu8("api/v1/search/teams-by-sport/{sport}/{query}")
    @Nullable
    Object searchTeamsBySport(@Nullable @vae("sport") String str, @Nullable @vae("query") String str2, @NotNull rq3<? super SearchTeamsResponse> rq3Var);

    @iu8("api/v1/search/unique-tournaments/{query}/{more}")
    @Nullable
    Object searchTournaments(@NotNull @vae("query") String str, @NotNull @vae("more") String str2, @NotNull rq3<? super SearchTournamentsResponse> rq3Var);

    @iu8("api/v1/search/venues/{query}")
    @Nullable
    Object searchVenues(@NotNull @vae("query") String str, @NotNull rq3<? super SearchVenuesResponse> rq3Var);

    @iu8("api/v1/calendar/season/{sid}/{timezoneOffset}/days-with-events")
    @Nullable
    Object seasonDaysWithEvents(@vae("sid") int i, @vae("timezoneOffset") int i2, @NotNull rq3<? super SeasonDaysWithEventsResponse> rq3Var);

    @i0e("api/v1/sofa-season/2025/{deviceId}/finished")
    @Nullable
    Object sendSofaSeasonWatched(@NotNull @vae("deviceId") String str, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @iu8("api/v1/offers/signuplink/{countryCode}/app")
    @Nullable
    Object signupLinks(@NotNull @vae("countryCode") String str, @NotNull rq3<? super SignupLinkResponse> rq3Var);

    @iu8("api/v1/sport/{sport}/categories")
    @Nullable
    Object sportCategories(@NotNull @vae("sport") String str, @NotNull rq3<? super SportCategoriesResponse> rq3Var);

    @iu8("api/v1/sport/{offset}/event-count")
    @Nullable
    Object sportEventCount(@NotNull @vae("offset") String str, @NotNull rq3<? super HashMap<String, SportItem>> rq3Var);

    @iu8("api/v1/sport/{sport}/events/live")
    @Nullable
    Object sportLiveEvents(@NotNull @vae("sport") String str, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/sport/{sport}/main-events/{date}")
    @Nullable
    Object sportMainEvents(@NotNull @vae("sport") String str, @NotNull @vae("date") String str2, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/odds/stage/{id}/provider/{providerId}/all")
    @Nullable
    Object stageAllOdds(@vae("id") int i, @vae("providerId") int i2, @NotNull rq3<? super StageOddsResponse> rq3Var);

    @iu8("api/v1/odds/category/{id}/provider/{providerId}")
    @Nullable
    Object stageCategoryOdds(@vae("id") int i, @vae("providerId") int i2, @NotNull rq3<? super StageOddsResponse> rq3Var);

    @iu8("api/v1/stage/{id}")
    @Nullable
    Object stageDetails(@vae("id") int i, @NotNull rq3<? super StageResponse> rq3Var);

    @iu8("api/v1/stage/{id}/extended")
    @Nullable
    Object stageDetailsExtended(@vae("id") int i, @NotNull rq3<? super StageResponse> rq3Var);

    @iu8("/api/v1/stage/{stageId}/driver-performance")
    @Nullable
    Object stageDriverPerformanceGraph(@vae("stageId") int i, @NotNull rq3<? super StageDriverPerformanceGraphResponse> rq3Var);

    @iu8("api/v1/stage/sport/{sportSlug}/scheduled/{date}")
    @Nullable
    Object stageEventsByWeek(@NotNull @vae("sportSlug") String str, @NotNull @vae("date") String str2, @NotNull rq3<? super StagesListResponse> rq3Var);

    @iu8("api/v1/odds/stage/{id}/provider/{providerId}/featured")
    @Nullable
    Object stageFeaturedOdds(@vae("id") int i, @vae("providerId") int i2, @NotNull rq3<? super StageFeaturedOddsResponse> rq3Var);

    @iu8("api/v1/stage/{id}/races/type/{outrightTeamType}")
    @Nullable
    Object stageSeasonRaceResults(@vae("id") int i, @NotNull @vae("outrightTeamType") String str, @NotNull rq3<? super StageRacesResponse> rq3Var);

    @iu8("api/v1/team/{id}/stage-season/{seasonId}/races")
    @Nullable
    Object stageSportDriverSeasonRaces(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super DriverRacesResponse> rq3Var);

    @iu8("api/v1/unique-stage/{id}/seasons")
    @Nullable
    Object stageSportSeasons(@vae("id") int i, @NotNull rq3<? super StageSportSeasonsResponse> rq3Var);

    @iu8("api/v1/stage/{id}/v2/substages")
    @Nullable
    Object stageSportSubStages(@vae("id") int i, @NotNull rq3<? super StagesListResponse> rq3Var);

    @iu8("api/v1/category/{id}/unique-stages")
    @Nullable
    Object stageSportUniqueStages(@vae("id") int i, @NotNull rq3<? super CategoryUniqueStagesResponse> rq3Var);

    @iu8("api/v1/stage/{id}/standings/{outrightTeamType}")
    @Nullable
    Object stageStandings(@vae("id") int i, @NotNull @vae("outrightTeamType") String str, @NotNull rq3<? super StageStandingsResponse> rq3Var);

    @iu8("api/v1/team/{id}/driver-career-history")
    @Nullable
    Object stageTeamCareerHistory(@vae("id") int i, @NotNull rq3<? super StageTeamHistoryResponse> rq3Var);

    @iu8("api/v1/odds/team/{id}/provider/{providerId}")
    @Nullable
    Object stageTeamOdds(@vae("id") int i, @vae("providerId") int i2, @NotNull rq3<? super StageOddsResponse> rq3Var);

    @iu8("api/v1/tournament/{id}/season/{seasonId}/standings/{type}")
    @Nullable
    Object standings(@vae("id") int i, @vae("seasonId") int i2, @NotNull @vae("type") String str, @NotNull rq3<? super StandingsResponse> rq3Var);

    @iu8("api/v1/tournament/{id}/season/{seasonId}/team-events/{type}")
    @Nullable
    Object standingsForm(@vae("id") int i, @vae("seasonId") int i2, @NotNull @vae("type") String str, @NotNull rq3<? super StandingsFormResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{tid}/season/{sid}/shot-action-areas/{type}/{seasonType}")
    @Nullable
    Object subSeasonShotActionAreas(@vae("tid") int i, @vae("sid") int i2, @NotNull @vae("type") String str, @NotNull @vae("seasonType") String str2, @NotNull rq3<? super SeasonShotActionAreaResponse> rq3Var);

    @iu8("api/v1/config/follow-suggestions/players/{alpha2}")
    @Nullable
    Object suggestedPlayers(@NotNull @vae("alpha2") String str, @NotNull rq3<? super SuggestedPlayersResponse> rq3Var);

    @iu8("api/v1/config/follow-suggestions/players/{alpha2}/sport/{sport}")
    @Nullable
    Object suggestedPlayersPerSport(@NotNull @vae("alpha2") String str, @NotNull @vae("sport") String str2, @NotNull rq3<? super SuggestedPlayersResponse> rq3Var);

    @iu8("api/v1/team/{id}/career-statistics")
    @Nullable
    Object teamCareerStatistics(@vae("id") int i, @NotNull rq3<? super TeamCareerStatisticsResponse> rq3Var);

    @iu8("api/v1/team/{id}")
    @Nullable
    Object teamDetails(@vae("id") int i, @NotNull rq3<? super TeamDetailsResponse> rq3Var);

    @iu8("api/v1/team/{id}/recent-event-ids")
    @Nullable
    Object teamEventIds(@vae("id") int i, @NotNull rq3<? super EventIdsResponse> rq3Var);

    @iu8("api/v1/team/{id}/featured-event")
    @Nullable
    Object teamFeaturedEvent(@vae("id") int i, @NotNull rq3<? super FeaturedEventResponse> rq3Var);

    @iu8("api/v1/team/{id}/featured-players")
    @Nullable
    Object teamFeaturedPlayers(@vae("id") int i, @NotNull rq3<? super TeamFeaturedPlayersResponse> rq3Var);

    @iu8("api/v1/team/{id}/near-events")
    @Nullable
    Object teamNearEvents(@vae("id") int i, @NotNull rq3<? super TeamNearEventsResponse> rq3Var);

    @iu8("api/v1/team-of-the-period/{periodId}")
    @Nullable
    Object teamOfThePeriod(@vae("periodId") int i, @NotNull rq3<? super TeamOfTheWeekResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/team-of-the-period/periods/awarded")
    @Nullable
    Object teamOfThePeriodAwardedPeriods(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super TeamOfThePeriodRoundsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/team-of-the-season")
    @Nullable
    Object teamOfTheSeason(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super TeamOfTheWeekResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/team-of-the-week/{roundId}")
    @Nullable
    Object teamOfTheWeek(@vae("id") int i, @vae("seasonId") int i2, @vae("roundId") int i3, @NotNull rq3<? super TeamOfTheWeekResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/team-of-the-week/periods")
    @Nullable
    Object teamOfTheWeekPeriods(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super TeamOfTheWeekRoundsResponse> rq3Var);

    @iu8("api/v1/team/{id}/performance")
    @Nullable
    Object teamPerformance(@vae("id") int i, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/team/{id}/unique-tournament/{uniqueTournamentId}/season/{seasonId}/player-statistics/{type}")
    @Nullable
    Object teamPlayerStatistics(@vae("id") int i, @vae("uniqueTournamentId") int i2, @vae("seasonId") int i3, @NotNull @vae("type") String str, @NotNull rq3<? super TeamPlayerSeasonStatisticsResponse> rq3Var);

    @iu8("api/v1/rankings/team/{teamId}")
    @Nullable
    Object teamRankings(@vae("teamId") int i, @NotNull rq3<? super RankingsSummaryResponse> rq3Var);

    @iu8("api/v1/team/{id}/standings/seasons")
    @Nullable
    Object teamStandingsSeasons(@vae("id") int i, @NotNull rq3<? super StatisticsSeasonsResponse> rq3Var);

    @iu8("api/v1/team/{id}/unique-tournament/{uniqueTournamentId}/season/{seasonId}/statistics/{type}")
    @Nullable
    Object teamStatistics(@vae("id") int i, @vae("uniqueTournamentId") int i2, @vae("seasonId") int i3, @NotNull @vae("type") String str, @NotNull rq3<? super TeamSeasonStatisticsResponse<? extends TeamSeasonStatistics>> rq3Var);

    @iu8("api/v1/team/{id}/{type}-statistics/seasons")
    @Nullable
    Object teamStatisticsSeasons(@vae("id") int i, @NotNull @vae("type") String str, @NotNull rq3<? super StatisticsSeasonsResponse> rq3Var);

    @iu8("/api/v1/event/{eventId}/team-streaks/betting-odds/{providerId}")
    @Nullable
    Object teamStreakBettingOdds(@vae("eventId") int i, @vae("providerId") int i2, @NotNull rq3<? super TeamStreakBettingOddsResponse> rq3Var);

    @iu8("/api/v1/odds/top-team-streaks/{streakName}/{sportSlug}")
    @Nullable
    Object teamStreaks(@NotNull @vae("streakName") String str, @NotNull @vae("sportSlug") String str2, @NotNull rq3<? super com.sofascore.model.network.response.bettingtips.TeamStreaksResponse> rq3Var);

    @iu8("api/v1/config/follow-suggestions/teams/{alpha2}")
    @Nullable
    Object teamSuggestions(@NotNull @vae("alpha2") String str, @NotNull rq3<? super TeamSuggestionResponse> rq3Var);

    @iu8("api/v1/config/follow-suggestions/teams/{alpha2}/sport/{sport}")
    @Nullable
    Object teamSuggestionsPerSport(@NotNull @vae("alpha2") String str, @NotNull @vae("sport") String str2, @NotNull rq3<? super TeamSuggestionResponse> rq3Var);

    @iu8("api/v1/team/{id}/unique-tournament/{tid}/season/{sid}/top-player")
    @Nullable
    Object teamTopPlayer(@vae("id") int i, @vae("tid") int i2, @vae("sid") int i3, @NotNull rq3<? super TeamTopPlayerResponse> rq3Var);

    @iu8("api/v1/team/{id}/unique-tournament/{tid}/season/{sid}/top-players/{type}")
    @Nullable
    Object teamTopPlayers(@vae("id") int i, @vae("tid") int i2, @vae("sid") int i3, @NotNull @vae("type") String str, @NotNull rq3<? super TopPerformanceResponse<? extends TopPerformanceStatistics>> rq3Var);

    @iu8("api/v1/team/{id}/unique-tournaments")
    @Nullable
    Object teamTournaments(@vae("id") int i, @NotNull rq3<? super TeamUniqueTournamentsResponse> rq3Var);

    @iu8("api/v1/team/{id}/transfers")
    @Nullable
    Object teamTransfers(@vae("id") int i, @NotNull rq3<? super TeamTransfersResponse> rq3Var);

    @iu8("api/v1/event/{id}/tennis-power")
    @Nullable
    Object tennisPower(@vae("id") int i, @NotNull rq3<? super TennisPowerResponse> rq3Var);

    @iu8("api/v1/team/{id}/grand-slam/best-results")
    @Nullable
    Object tennisTeamGrandSlamPerformance(@vae("id") int i, @NotNull rq3<? super TennisGrandSlamPerformanceResponse> rq3Var);

    @iu8("api/v1/tournament/{id}")
    @Nullable
    Object tournament(@vae("id") int i, @NotNull rq3<? super TournamentResponse> rq3Var);

    @iu8("api/v1/tournament/{id}/events/{span}/{page}")
    @Nullable
    Object tournamentEvents(@vae("id") int i, @NotNull @vae("span") String str, @vae("page") int i2, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{sid}/player-statistics/types")
    @Nullable
    Object tournamentPlayerStatisticsTypes(@vae("id") int i, @vae("sid") int i2, @NotNull rq3<? super SeasonStatisticsResponse> rq3Var);

    @iu8("api/v1/tournament/{id}/season/{seasonId}/events/{span}/{page}")
    @Nullable
    Object tournamentSeasonEvents(@vae("id") int i, @vae("seasonId") int i2, @NotNull @vae("span") String str, @vae("page") int i3, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/tournament/{id}/seasons")
    @Nullable
    Object tournamentSeasons(@vae("id") int i, @NotNull rq3<? super TournamentSeasonsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{sid}/team-statistics/types")
    @Nullable
    Object tournamentTeamStatisticsTypes(@vae("id") int i, @vae("sid") int i2, @NotNull rq3<? super SeasonStatisticsResponse> rq3Var);

    @iu8("api/v1/sport/{sport}/{date}/{offset}/unique-tournaments")
    @Nullable
    Object tournamentsForDate(@NotNull @vae("sport") String str, @NotNull @vae("date") String str2, @NotNull @vae("offset") String str3, @NotNull rq3<? super TournamentsForDateResponse> rq3Var);

    @iu8("https://translate.google.com/translate_a/single?client=at&dt=t&dt=ld&dt=qca&dt=rm&dt=bd&dj=1&hl=es-ES&ie=UTF-8&oe=UTF-8&inputm=2&otf=2&iid=1dd3b944-fa62-4b55-b330-74909a99969e")
    @Nullable
    @r89({"User-Agent: AndroidTranslate/5.3.0.RC02.130475354-53000263 5.1 phone TRANSLATE_OPM5_TEST_1"})
    Object translate(@qif("sl") @NotNull String str, @qif("tl") @NotNull String str2, @qif("q") @NotNull String str3, @NotNull rq3<? super GoogleTranslate> rq3Var);

    @iu8("api/v1/translation/{entity}/{entityId}/language/{languageCode}")
    @Nullable
    Object translateDescription(@NotNull @vae("entity") String str, @vae("entityId") int i, @NotNull @vae("languageCode") String str2, @NotNull rq3<? super TranslationResponse> rq3Var);

    @iu8("api/v1/trending/events/{countryCodeAlpha2}/all")
    @Nullable
    Object trendingEvents(@NotNull @vae("countryCodeAlpha2") String str, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/trending/grid/events/{countryCodeAlpha2}")
    @Nullable
    Object trendingGridEvents(@NotNull @vae("countryCodeAlpha2") String str, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/trending/grid/tiles/{countryCodeAlpha2}")
    @Nullable
    Object trendingGridTiles(@NotNull @vae("countryCodeAlpha2") String str, @NotNull rq3<? super TrendingGridTilesResponse> rq3Var);

    @iu8("/api/v1/odds/{id}/winning/{sportSlug}")
    @Nullable
    Object trendingOdds(@vae("id") int i, @NotNull @vae("sportSlug") String str, @NotNull rq3<? super TrendingOddsResponse> rq3Var);

    @iu8("api/v1/tv/channel/{id}/schedule")
    @Nullable
    Object tvChannelEvents(@vae("id") int i, @NotNull rq3<? super TvChannelScheduleResponse> rq3Var);

    @iu8("api/v1/tv/country/{countryCode}/channels")
    @Nullable
    Object tvChannelsForCountry(@NotNull @vae("countryCode") String str, @NotNull rq3<? super TvChannelsResponse> rq3Var);

    @i0e("/api/v1/chat/message/{id}/unreport")
    @Nullable
    Object unReportMessage(@vae("id") int i, @NotNull rq3<? super NetworkResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{tid}/season/{sid}/cuptrees")
    @Nullable
    Object uniqueCupTree(@vae("tid") int i, @vae("sid") int i2, @NotNull rq3<? super CupTreesResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/standings/{type}")
    @Nullable
    Object uniqueStandings(@vae("id") int i, @vae("seasonId") int i2, @NotNull @vae("type") String str, @NotNull rq3<? super StandingsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/team-events/{type}")
    @Nullable
    Object uniqueStandingsForm(@vae("id") int i, @vae("seasonId") int i2, @NotNull @vae("type") String str, @NotNull rq3<? super StandingsFormMultipleTournamentsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}")
    @Nullable
    Object uniqueTournament(@vae("id") int i, @NotNull rq3<? super UniqueTournamentResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/individual-awards")
    @Nullable
    Object uniqueTournamentAwards(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super UniqueTournamentAwardsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/champions")
    @Nullable
    Object uniqueTournamentChampions(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super UniqueTournamentChampionsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}")
    @Nullable
    Object uniqueTournamentDetails(@vae("id") int i, @NotNull rq3<? super UniqueTournamentDetailsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/divisions")
    @Nullable
    Object uniqueTournamentDivisions(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super UniqueTournamentDivisionsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{unique_tournament_id}/season/{season_id}/draft")
    @Nullable
    Object uniqueTournamentDraftInfo(@vae("unique_tournament_id") int i, @vae("season_id") int i2, @NotNull rq3<? super UniqueTournamentDraftInfoResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{unique_tournament_id}/draft/{year}/pick/{round}")
    @Nullable
    Object uniqueTournamentDraftPicks(@vae("unique_tournament_id") int i, @NotNull @vae("year") String str, @vae("round") int i2, @NotNull rq3<? super UniqueTournamentDraftPicksResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/events/{span}/{page}")
    @Nullable
    Object uniqueTournamentEvents(@vae("id") int i, @NotNull @vae("span") String str, @vae("page") int i2, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/featured-events")
    @Nullable
    Object uniqueTournamentFeaturedEvents(@vae("id") int i, @NotNull rq3<? super FeaturedEventsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/groups")
    @Nullable
    Object uniqueTournamentGroups(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super UniqueTournamentGroupsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/key-players")
    @Nullable
    Object uniqueTournamentKeyPlayers(@vae("id") int i, @NotNull rq3<? super UniqueTournamentKeyPlayersResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/last-dance")
    @Nullable
    Object uniqueTournamentLastDance(@vae("id") int i, @NotNull rq3<? super UniqueTournamentLastDanceResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{unique_tournament_id}/draft/{year}/pick-lottery-probability")
    @Nullable
    Object uniqueTournamentLotteryProbability(@vae("unique_tournament_id") int i, @NotNull @vae("year") String str, @NotNull rq3<? super UniqueTournamentLotteryProbabilityResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/main-events/{span}/{page}")
    @Nullable
    Object uniqueTournamentMainEvents(@vae("id") int i, @NotNull @vae("span") String str, @vae("page") int i2, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{season_id}/matchday-top-players")
    @Nullable
    Object uniqueTournamentMatchdayTopPerformers(@vae("id") int i, @vae("season_id") int i2, @NotNull rq3<? super UniqueTournamentTopPerformersResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/media")
    @Nullable
    Object uniqueTournamentMedia(@vae("id") int i, @NotNull rq3<? super MediaResponse> rq3Var);

    @iu8("api/v1/calendar/unique-tournament/{id}/{timezoneOffset}/months-with-events")
    @Nullable
    Object uniqueTournamentMonthsWithEvents(@vae("id") int i, @NotNull @vae("timezoneOffset") String str, @NotNull rq3<? super MmaMonthsWithEventsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/media/news")
    @Nullable
    Object uniqueTournamentNews(@vae("id") int i, @NotNull rq3<? super EventMediaNewsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/player-news")
    @Nullable
    Object uniqueTournamentPlayerUpdates(@vae("id") int i, @NotNull rq3<? super UniqueTournamentPlayerUpdatesResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/player-transfer-history/{type}/{page}")
    @Nullable
    Object uniqueTournamentPlayersTransaction(@vae("id") int i, @NotNull @vae("type") String str, @vae("page") int i2, @NotNull rq3<? super UniqueTournamentPlayerTransactionsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/winners")
    @Nullable
    Object uniqueTournamentPreviousWinners(@vae("id") int i, @NotNull rq3<? super UniqueTournamentPreviousWinnersResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{unique_tournament_id}/draft/{year}/prospect/{type}")
    @Nullable
    Object uniqueTournamentProspects(@vae("unique_tournament_id") int i, @NotNull @vae("year") String str, @NotNull @vae("type") String str2, @NotNull rq3<? super UniqueTournamentProspectsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/top-player-performance")
    @Nullable
    Object uniqueTournamentRecapTopPerformances(@vae("id") int i, @qif("orderBy") @NotNull String str, @NotNull rq3<? super UniqueTournamentRecapTopPerformancesResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/events/round/{round}/slug/{roundSlug}")
    @Nullable
    Object uniqueTournamentRoundAllEvents(@vae("id") int i, @vae("seasonId") int i2, @vae("round") int i3, @NotNull @vae("roundSlug") String str, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/events/round/{round}")
    @Nullable
    Object uniqueTournamentRoundAllEvents(@vae("id") int i, @vae("seasonId") int i2, @vae("round") int i3, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/events/round/{round}/{span}/{page}")
    @Nullable
    Object uniqueTournamentRoundEvents(@vae("id") int i, @vae("seasonId") int i2, @vae("round") int i3, @NotNull @vae("span") String str, @vae("page") int i4, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/events/round/{round}/slug/{roundSlug}/{span}/{page}")
    @Nullable
    Object uniqueTournamentRoundEvents(@vae("id") int i, @vae("seasonId") int i2, @vae("round") int i3, @Nullable @vae("roundSlug") String str, @Nullable @vae("span") String str2, @vae("page") int i4, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/events/round/{round}/slug/{roundSlug}/prefix/{prefix}/{span}/{page}")
    @Nullable
    Object uniqueTournamentRoundEvents(@vae("id") int i, @vae("seasonId") int i2, @vae("round") int i3, @Nullable @vae("roundSlug") String str, @Nullable @vae("prefix") String str2, @Nullable @vae("span") String str3, @vae("page") int i4, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/events/round/{round}/prefix/{prefix}/{span}/{page}")
    @Nullable
    Object uniqueTournamentRoundEventsPrefix(@vae("id") int i, @vae("seasonId") int i2, @vae("round") int i3, @Nullable @vae("prefix") String str, @Nullable @vae("span") String str2, @vae("page") int i4, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/rounds")
    @Nullable
    Object uniqueTournamentRounds(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super UniqueTournamentRoundsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{uid}/scheduled-events/{date}")
    @Nullable
    Object uniqueTournamentScheduledEvents(@vae("uid") int i, @NotNull @vae("date") String str, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{uid}/scheduled-mma-main-events/{date}")
    @Nullable
    Object uniqueTournamentScheduledMmaMainEvents(@vae("uid") int i, @NotNull @vae("date") String str, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/events/{span}/{page}")
    @Nullable
    Object uniqueTournamentSeasonEvents(@vae("id") int i, @vae("seasonId") int i2, @NotNull @vae("span") String str, @vae("page") int i3, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/featured-events")
    @Nullable
    Object uniqueTournamentSeasonFeaturedEvents(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super FeaturedEventsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/info")
    @Nullable
    Object uniqueTournamentSeasonInfo(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super SeasonInfoResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{sid}/venue/{vid}/events/{span}/{page}")
    @Nullable
    Object uniqueTournamentSeasonVenueEvents(@vae("id") int i, @vae("sid") int i2, @vae("vid") int i3, @NotNull @vae("span") String str, @vae("page") int i4, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/seasons")
    @Nullable
    Object uniqueTournamentSeasons(@vae("id") int i, @NotNull rq3<? super TournamentSeasonsResponse> rq3Var);

    @iu8("api/v1/config/follow-suggestions/unique-tournaments/{alpha2}")
    @Nullable
    Object uniqueTournamentSuggestion(@NotNull @vae("alpha2") String str, @NotNull rq3<? super UniqueTournamentSuggestionResponse> rq3Var);

    @iu8("api/v1/config/follow-suggestions/unique-tournaments/{alpha2}/sport/{sport}")
    @Nullable
    Object uniqueTournamentSuggestionPerSport(@NotNull @vae("alpha2") String str, @NotNull @vae("sport") String str2, @NotNull rq3<? super UniqueTournamentSuggestionResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/team/{teamId}/events/{span}/{page}")
    @Nullable
    Object uniqueTournamentTeamEvents(@vae("id") int i, @vae("seasonId") int i2, @vae("teamId") int i3, @Nullable @vae("span") String str, @vae("page") int i4, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/team/{tid}/player-transfer-history/{type}/{page}")
    @Nullable
    Object uniqueTournamentTeamTransaction(@vae("tid") int i, @NotNull @vae("type") String str, @vae("page") int i2, @NotNull rq3<? super UniqueTournamentPlayerTransactionsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/media/team/{teamId}/videos")
    @Nullable
    Object uniqueTournamentTeamVideos(@vae("id") int i, @vae("teamId") int i2, @NotNull rq3<? super MediaVideoResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/teams")
    @Nullable
    Object uniqueTournamentTeams(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super UniqueTournamentTeamsResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/season/{seasonId}/venues")
    @Nullable
    Object uniqueTournamentVenues(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super UniqueTournamentVenuesResponse> rq3Var);

    @iu8("api/v1/unique-tournament/{id}/media/videos")
    @Nullable
    Object uniqueTournamentVideos(@vae("id") int i, @NotNull rq3<? super MediaVideoResponse> rq3Var);

    @i0e("/api/v1/chat/message/{id}/upvote")
    @Nullable
    Object upVoteMessage(@vae("id") int i, @NotNull rq3<? super NetworkResponse> rq3Var);

    @h3e("api/v1/suggest/{id}")
    @Nullable
    Object updateSuggest(@vae("id") int i, @yy1 @NotNull EventSuggestRequest eventSuggestRequest, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @h3e("api/v1/chat/upload-image")
    @Nullable
    Object uploadChatImage(@yy1 @NotNull yzf yzfVar, @NotNull rq3<? super ImageUploadResponse> rq3Var);

    @h3e("api/v1/user/image")
    @Nullable
    Object uploadProfileImage(@yy1 @NotNull yzf yzfVar, @NotNull rq3<? super ProfileImageUploadResponse> rq3Var);

    @iu8("api/v1/user-account/{id}/predictions/{type}/{page}")
    @Nullable
    Object userPredictions(@NotNull @vae("id") String str, @NotNull @vae("type") String str2, @vae("page") int i, @NotNull rq3<? super UserPredictionsResponse> rq3Var);

    @iu8("api/v1/country/alpha2")
    @Nullable
    Object userRegion(@NotNull rq3<? super UserRegionResponse> rq3Var);

    @iu8("api/v1/user-account/{id}/subscriptions")
    @Nullable
    Object userSubscriptions(@NotNull @vae("id") String str, @NotNull rq3<? super UserSubscriptionsResponse> rq3Var);

    @iu8("api/v1/league/leaderboard/{id}/user-account/{userAccountId}/predictions/{type}/{page}")
    @Nullable
    Object userWeeklyPredictions(@NotNull @vae("id") String str, @NotNull @vae("userAccountId") String str2, @NotNull @vae("type") String str3, @vae("page") int i, @NotNull rq3<? super UserPredictionsResponse> rq3Var);

    @iu8("api/v1/venue/{id}")
    @Nullable
    Object venue(@vae("id") int i, @NotNull rq3<? super VenueResponse> rq3Var);

    @iu8("api/v1/venue/{id}/events/{sport}/{span}/{page}")
    @Nullable
    Object venueMatches(@vae("id") int i, @NotNull @vae("sport") String str, @NotNull @vae("span") String str2, @vae("page") int i2, @NotNull rq3<? super EventListResponse> rq3Var);

    @iu8("api/v1/venue/{id}/near-events")
    @Nullable
    Object venueNearEvents(@vae("id") int i, @NotNull rq3<? super TeamNearEventsResponse> rq3Var);

    @iu8("api/v1/venue/{id}/sports")
    @Nullable
    Object venueSports(@vae("id") int i, @NotNull rq3<? super VenueSportsResponse> rq3Var);

    @iu8("api/v1/user-account/vote-ranking")
    @Nullable
    Object voteRanking(@NotNull rq3<? super VoteRankingResponse> rq3Var);

    @i0e("api/v1/tv/{type}/{eventId}/{channelId}/vote")
    @Nullable
    Object voteTvChannel(@NotNull @vae("type") TvType tvType, @vae("eventId") int i, @vae("channelId") int i2, @yy1 @NotNull TvChannelVoteBody tvChannelVoteBody, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @iu8("api/v1/event/{id}/graph/win-probability")
    @Nullable
    Object winProbability(@vae("id") int i, @NotNull rq3<? super EventGraphResponse> rq3Var);
}
