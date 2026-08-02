package defpackage;

import com.sofascore.model.chat.DbChatMessage;
import com.sofascore.model.database.DbDismissedBuzzerTile;
import com.sofascore.model.database.DbEventScore;
import com.sofascore.model.database.DbFantasyCompetition;
import com.sofascore.model.database.DbFeedPostFeedback;
import com.sofascore.model.database.DbMediaLike;
import com.sofascore.model.database.DbMediaShare;
import com.sofascore.model.database.DbMmaOrganizationViewCount;
import com.sofascore.model.database.DbNatsEvent;
import com.sofascore.model.database.DbPendingNotification;
import com.sofascore.model.database.DbPlayerOfTheMatchVote;
import com.sofascore.model.database.DbSavedSearches;
import com.sofascore.model.database.DbSportOrder;
import com.sofascore.model.database.DbUserSegmentation;
import com.sofascore.model.database.DbVote;
import com.sofascore.model.database.DbWatchedVideo;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.database.VoteTypeConverter;
import com.sofascore.model.mvvm.model.DbMyPlayer;
import com.sofascore.model.mvvm.model.DbMyTeam;
import com.sofascore.model.mvvm.model.DbMyUniqueTournament;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.mvvm.model.TvChannelVote;
import com.sofascore.model.mvvm.model.UniqueStageId;
import com.sofascore.model.mvvm.model.UserSegmentationTypeConverter;
import com.sofascore.model.notifications.NotificationSetting;
import com.sofascore.model.util.MarketValueUserVote;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s82 extends ml4 {
    public final /* synthetic */ int w;

    public /* synthetic */ s82(int i) {
        this.w = i;
    }

    @Override // defpackage.ml4
    public final void J(nlg nlgVar, Object obj) {
        String str;
        String str2;
        switch (this.w) {
            case 0:
                DbDismissedBuzzerTile dbDismissedBuzzerTile = (DbDismissedBuzzerTile) obj;
                nlgVar.getClass();
                dbDismissedBuzzerTile.getClass();
                nlgVar.q(1, dbDismissedBuzzerTile.getId());
                nlgVar.q(2, dbDismissedBuzzerTile.getTimestamp());
                break;
            case 1:
                DbChatMessage dbChatMessage = (DbChatMessage) obj;
                nlgVar.getClass();
                dbChatMessage.getClass();
                nlgVar.q(1, dbChatMessage.getEventId());
                nlgVar.q(2, dbChatMessage.getMessageTimestamp());
                nlgVar.q(3, dbChatMessage.getVoteTimestamp());
                nlgVar.q(4, dbChatMessage.getReportTimestamp());
                break;
            case 2:
                px4 px4Var = (px4) obj;
                nlgVar.getClass();
                px4Var.getClass();
                nlgVar.L(1, px4Var.a);
                nlgVar.L(2, px4Var.b);
                break;
            case 3:
                DbEventScore dbEventScore = (DbEventScore) obj;
                nlgVar.getClass();
                dbEventScore.getClass();
                nlgVar.q(1, dbEventScore.getEventId());
                Score homeScore = dbEventScore.getHomeScore();
                if (homeScore.getDisplay() == null) {
                    nlgVar.s(2);
                } else {
                    nlgVar.q(2, r4.intValue());
                }
                if (homeScore.getPeriod1() == null) {
                    nlgVar.s(3);
                } else {
                    nlgVar.q(3, r3.intValue());
                }
                if (homeScore.getPeriod2() == null) {
                    nlgVar.s(4);
                } else {
                    nlgVar.q(4, r2.intValue());
                }
                if (homeScore.getPeriod3() == null) {
                    nlgVar.s(5);
                } else {
                    nlgVar.q(5, r1.intValue());
                }
                if (homeScore.getPeriod4() == null) {
                    nlgVar.s(6);
                } else {
                    nlgVar.q(6, r0.intValue());
                }
                if (homeScore.getPeriod5() == null) {
                    nlgVar.s(7);
                } else {
                    nlgVar.q(7, r0.intValue());
                }
                if (homeScore.getPeriod6() == null) {
                    nlgVar.s(8);
                } else {
                    nlgVar.q(8, r0.intValue());
                }
                if (homeScore.getPeriod7() == null) {
                    nlgVar.s(9);
                } else {
                    nlgVar.q(9, r0.intValue());
                }
                if (homeScore.getPeriod8() == null) {
                    nlgVar.s(10);
                } else {
                    nlgVar.q(10, r0.intValue());
                }
                if (homeScore.getPeriod9() == null) {
                    nlgVar.s(11);
                } else {
                    nlgVar.q(11, r0.intValue());
                }
                if (homeScore.getPeriod10() == null) {
                    nlgVar.s(12);
                } else {
                    nlgVar.q(12, r0.intValue());
                }
                if (homeScore.getPeriod11() == null) {
                    nlgVar.s(13);
                } else {
                    nlgVar.q(13, r0.intValue());
                }
                if (homeScore.getPeriod12() == null) {
                    nlgVar.s(14);
                } else {
                    nlgVar.q(14, r0.intValue());
                }
                if (homeScore.getPeriod13() == null) {
                    nlgVar.s(15);
                } else {
                    nlgVar.q(15, r0.intValue());
                }
                if (homeScore.getPeriod1TieBreak() == null) {
                    nlgVar.s(16);
                } else {
                    nlgVar.q(16, r0.intValue());
                }
                if (homeScore.getPeriod2TieBreak() == null) {
                    nlgVar.s(17);
                } else {
                    nlgVar.q(17, r0.intValue());
                }
                if (homeScore.getPeriod3TieBreak() == null) {
                    nlgVar.s(18);
                } else {
                    nlgVar.q(18, r0.intValue());
                }
                if (homeScore.getPeriod4TieBreak() == null) {
                    nlgVar.s(19);
                } else {
                    nlgVar.q(19, r0.intValue());
                }
                if (homeScore.getPeriod5TieBreak() == null) {
                    nlgVar.s(20);
                } else {
                    nlgVar.q(20, r0.intValue());
                }
                String point = homeScore.getPoint();
                if (point == null) {
                    nlgVar.s(21);
                } else {
                    nlgVar.L(21, point);
                }
                if (homeScore.getOvertime() == null) {
                    nlgVar.s(22);
                } else {
                    nlgVar.q(22, r0.intValue());
                }
                if (homeScore.getPenalties() == null) {
                    nlgVar.s(23);
                } else {
                    nlgVar.q(23, r0.intValue());
                }
                if (homeScore.getAggregated() == null) {
                    nlgVar.s(24);
                } else {
                    nlgVar.q(24, r0.intValue());
                }
                if (homeScore.getSeries() == null) {
                    nlgVar.s(25);
                } else {
                    nlgVar.q(25, r0.intValue());
                }
                String currentCricketDisplay = homeScore.getCurrentCricketDisplay();
                if (currentCricketDisplay == null) {
                    nlgVar.s(26);
                } else {
                    nlgVar.L(26, currentCricketDisplay);
                }
                Score awayScore = dbEventScore.getAwayScore();
                if (awayScore.getDisplay() == null) {
                    nlgVar.s(27);
                } else {
                    nlgVar.q(27, r9.intValue());
                }
                if (awayScore.getPeriod1() == null) {
                    nlgVar.s(28);
                } else {
                    nlgVar.q(28, r9.intValue());
                }
                if (awayScore.getPeriod2() == null) {
                    nlgVar.s(29);
                } else {
                    nlgVar.q(29, r9.intValue());
                }
                if (awayScore.getPeriod3() == null) {
                    nlgVar.s(30);
                } else {
                    nlgVar.q(30, r9.intValue());
                }
                if (awayScore.getPeriod4() == null) {
                    nlgVar.s(31);
                } else {
                    nlgVar.q(31, r9.intValue());
                }
                if (awayScore.getPeriod5() == null) {
                    nlgVar.s(32);
                } else {
                    nlgVar.q(32, r9.intValue());
                }
                if (awayScore.getPeriod6() == null) {
                    nlgVar.s(33);
                } else {
                    nlgVar.q(33, r9.intValue());
                }
                if (awayScore.getPeriod7() == null) {
                    nlgVar.s(34);
                } else {
                    nlgVar.q(34, r9.intValue());
                }
                if (awayScore.getPeriod8() == null) {
                    nlgVar.s(35);
                } else {
                    nlgVar.q(35, r9.intValue());
                }
                if (awayScore.getPeriod9() == null) {
                    nlgVar.s(36);
                } else {
                    nlgVar.q(36, r9.intValue());
                }
                if (awayScore.getPeriod10() == null) {
                    nlgVar.s(37);
                } else {
                    nlgVar.q(37, r9.intValue());
                }
                if (awayScore.getPeriod11() == null) {
                    nlgVar.s(38);
                } else {
                    nlgVar.q(38, r9.intValue());
                }
                if (awayScore.getPeriod12() == null) {
                    nlgVar.s(39);
                } else {
                    nlgVar.q(39, r9.intValue());
                }
                if (awayScore.getPeriod13() == null) {
                    nlgVar.s(40);
                } else {
                    nlgVar.q(40, r9.intValue());
                }
                if (awayScore.getPeriod1TieBreak() == null) {
                    nlgVar.s(41);
                } else {
                    nlgVar.q(41, r9.intValue());
                }
                if (awayScore.getPeriod2TieBreak() == null) {
                    nlgVar.s(42);
                } else {
                    nlgVar.q(42, r9.intValue());
                }
                if (awayScore.getPeriod3TieBreak() == null) {
                    nlgVar.s(43);
                } else {
                    nlgVar.q(43, r9.intValue());
                }
                if (awayScore.getPeriod4TieBreak() == null) {
                    nlgVar.s(44);
                } else {
                    nlgVar.q(44, r9.intValue());
                }
                if (awayScore.getPeriod5TieBreak() == null) {
                    nlgVar.s(45);
                } else {
                    nlgVar.q(45, r9.intValue());
                }
                String point2 = awayScore.getPoint();
                if (point2 == null) {
                    nlgVar.s(46);
                } else {
                    nlgVar.L(46, point2);
                }
                if (awayScore.getOvertime() == null) {
                    nlgVar.s(47);
                } else {
                    nlgVar.q(47, r9.intValue());
                }
                if (awayScore.getPenalties() == null) {
                    nlgVar.s(48);
                } else {
                    nlgVar.q(48, r9.intValue());
                }
                if (awayScore.getAggregated() == null) {
                    nlgVar.s(49);
                } else {
                    nlgVar.q(49, r9.intValue());
                }
                if (awayScore.getSeries() == null) {
                    nlgVar.s(50);
                } else {
                    nlgVar.q(50, r9.intValue());
                }
                String currentCricketDisplay2 = awayScore.getCurrentCricketDisplay();
                if (currentCricketDisplay2 != null) {
                    nlgVar.L(51, currentCricketDisplay2);
                    break;
                } else {
                    nlgVar.s(51);
                    break;
                }
            case 4:
                nlgVar.getClass();
                ((DbFantasyCompetition) obj).getClass();
                nlgVar.q(1, r9.getId());
                break;
            case 5:
                DbFeedPostFeedback dbFeedPostFeedback = (DbFeedPostFeedback) obj;
                nlgVar.getClass();
                dbFeedPostFeedback.getClass();
                nlgVar.q(1, dbFeedPostFeedback.getPostId());
                nlgVar.q(2, dbFeedPostFeedback.getFeedbackTimestamp());
                break;
            case 6:
                MarketValueUserVote marketValueUserVote = (MarketValueUserVote) obj;
                nlgVar.getClass();
                marketValueUserVote.getClass();
                nlgVar.q(1, marketValueUserVote.getPlayerId());
                nlgVar.q(2, marketValueUserVote.getPlayerValue());
                nlgVar.L(3, marketValueUserVote.getCurrency());
                int i = cvb.a[marketValueUserVote.getVoteType().ordinal()];
                if (i == 1) {
                    str = "UP";
                } else if (i != 2) {
                    zzl.b();
                    break;
                } else {
                    str = "DOWN";
                }
                nlgVar.L(4, str);
                break;
            case 7:
                DbMediaLike dbMediaLike = (DbMediaLike) obj;
                nlgVar.getClass();
                dbMediaLike.getClass();
                nlgVar.q(1, dbMediaLike.getMediaPostId());
                MediaReactionType reaction = dbMediaLike.getReaction();
                if (reaction == null) {
                    nlgVar.s(2);
                } else {
                    int i2 = w8c.a[reaction.ordinal()];
                    if (i2 == 1) {
                        str2 = "THUMBS_UP";
                    } else if (i2 != 2) {
                        zzl.b();
                        break;
                    } else {
                        str2 = "REMOVE_THUMBS_UP";
                    }
                    nlgVar.L(2, str2);
                }
                nlgVar.q(3, dbMediaLike.getTimestamp());
                break;
            case 8:
                DbMediaShare dbMediaShare = (DbMediaShare) obj;
                nlgVar.getClass();
                dbMediaShare.getClass();
                nlgVar.q(1, dbMediaShare.getMediaPostId());
                nlgVar.q(2, dbMediaShare.getShareCount());
                nlgVar.q(3, dbMediaShare.getTimestamp());
                break;
            case 9:
                DbMmaOrganizationViewCount dbMmaOrganizationViewCount = (DbMmaOrganizationViewCount) obj;
                nlgVar.getClass();
                dbMmaOrganizationViewCount.getClass();
                nlgVar.q(1, dbMmaOrganizationViewCount.getId());
                nlgVar.q(2, dbMmaOrganizationViewCount.getViewCount());
                nlgVar.q(3, dbMmaOrganizationViewCount.getIgnored() ? 1L : 0L);
                break;
            case 10:
                DbNatsEvent dbNatsEvent = (DbNatsEvent) obj;
                nlgVar.getClass();
                dbNatsEvent.getClass();
                nlgVar.q(1, dbNatsEvent.getId());
                nlgVar.L(2, dbNatsEvent.getTopic());
                nlgVar.L(3, dbNatsEvent.getMessage());
                break;
            case 11:
                NotificationSetting notificationSetting = (NotificationSetting) obj;
                nlgVar.getClass();
                notificationSetting.getClass();
                nlgVar.L(1, notificationSetting.getGroup());
                nlgVar.L(2, notificationSetting.getName());
                nlgVar.q(3, notificationSetting.getEnabled() ? 1L : 0L);
                nlgVar.L(4, notificationSetting.getChannelId());
                nlgVar.L(5, notificationSetting.getGroupInSettingsScreen());
                break;
            case 12:
                NotificationSetting notificationSetting2 = (NotificationSetting) obj;
                nlgVar.getClass();
                notificationSetting2.getClass();
                nlgVar.L(1, notificationSetting2.getGroup());
                nlgVar.L(2, notificationSetting2.getName());
                nlgVar.q(3, notificationSetting2.getEnabled() ? 1L : 0L);
                nlgVar.L(4, notificationSetting2.getChannelId());
                nlgVar.L(5, notificationSetting2.getGroupInSettingsScreen());
                break;
            case 13:
                DbPendingNotification dbPendingNotification = (DbPendingNotification) obj;
                nlgVar.getClass();
                dbPendingNotification.getClass();
                nlgVar.q(1, dbPendingNotification.getId());
                nlgVar.q(2, dbPendingNotification.getNotificationId());
                nlgVar.L(3, dbPendingNotification.getTitle());
                nlgVar.L(4, dbPendingNotification.getMessage());
                String updatableNotificationId = dbPendingNotification.getUpdatableNotificationId();
                if (updatableNotificationId != null) {
                    nlgVar.L(5, updatableNotificationId);
                    break;
                } else {
                    nlgVar.s(5);
                    break;
                }
            case 14:
                DbMyPlayer dbMyPlayer = (DbMyPlayer) obj;
                nlgVar.getClass();
                dbMyPlayer.getClass();
                nlgVar.q(1, dbMyPlayer.getPlayerId());
                nlgVar.q(2, dbMyPlayer.getNotificationsEnabled() ? 1L : 0L);
                break;
            case 15:
                DbPlayerOfTheMatchVote dbPlayerOfTheMatchVote = (DbPlayerOfTheMatchVote) obj;
                nlgVar.getClass();
                dbPlayerOfTheMatchVote.getClass();
                nlgVar.q(1, dbPlayerOfTheMatchVote.getEventId());
                nlgVar.q(2, dbPlayerOfTheMatchVote.getPlayerId());
                nlgVar.q(3, dbPlayerOfTheMatchVote.getEventTimestamp());
                break;
            case 16:
                DbPlayerOfTheMatchVote dbPlayerOfTheMatchVote2 = (DbPlayerOfTheMatchVote) obj;
                nlgVar.getClass();
                dbPlayerOfTheMatchVote2.getClass();
                nlgVar.q(1, dbPlayerOfTheMatchVote2.getEventId());
                nlgVar.q(2, dbPlayerOfTheMatchVote2.getPlayerId());
                nlgVar.q(3, dbPlayerOfTheMatchVote2.getEventTimestamp());
                break;
            case 17:
                n4f n4fVar = (n4f) obj;
                nlgVar.getClass();
                n4fVar.getClass();
                nlgVar.L(1, n4fVar.a);
                nlgVar.q(2, n4fVar.b.longValue());
                break;
            case 18:
                DbSavedSearches dbSavedSearches = (DbSavedSearches) obj;
                nlgVar.getClass();
                dbSavedSearches.getClass();
                nlgVar.q(1, dbSavedSearches.getId());
                nlgVar.L(2, dbSavedSearches.getEntity());
                nlgVar.L(3, dbSavedSearches.getJson());
                nlgVar.q(4, dbSavedSearches.getTimestamp());
                break;
            case 19:
                DbSportOrder dbSportOrder = (DbSportOrder) obj;
                nlgVar.getClass();
                dbSportOrder.getClass();
                nlgVar.L(1, dbSportOrder.getSportName());
                nlgVar.q(2, dbSportOrder.getSportOrder());
                nlgVar.q(3, dbSportOrder.isSelected() ? 1L : 0L);
                break;
            case 20:
                DbSportOrder dbSportOrder2 = (DbSportOrder) obj;
                nlgVar.getClass();
                dbSportOrder2.getClass();
                nlgVar.L(1, dbSportOrder2.getSportName());
                nlgVar.q(2, dbSportOrder2.getSportOrder());
                nlgVar.q(3, dbSportOrder2.isSelected() ? 1L : 0L);
                break;
            case 21:
                ari ariVar = (ari) obj;
                nlgVar.getClass();
                ariVar.getClass();
                nlgVar.L(1, ariVar.a);
                nlgVar.q(2, ariVar.b);
                nlgVar.q(3, ariVar.c);
                break;
            case 22:
                DbMyTeam dbMyTeam = (DbMyTeam) obj;
                nlgVar.getClass();
                dbMyTeam.getClass();
                nlgVar.q(1, dbMyTeam.getTeamId());
                nlgVar.q(2, dbMyTeam.getNotificationsEnabled() ? 1L : 0L);
                break;
            case 23:
                DbMyUniqueTournament dbMyUniqueTournament = (DbMyUniqueTournament) obj;
                nlgVar.getClass();
                dbMyUniqueTournament.getClass();
                nlgVar.q(1, dbMyUniqueTournament.getUniqueTournamentId());
                nlgVar.q(2, dbMyUniqueTournament.getNotificationsEnabled() ? 1L : 0L);
                break;
            case 24:
                TvChannelVote tvChannelVote = (TvChannelVote) obj;
                nlgVar.getClass();
                tvChannelVote.getClass();
                nlgVar.q(1, tvChannelVote.getEventId());
                nlgVar.q(2, tvChannelVote.getChannelId());
                nlgVar.q(3, tvChannelVote.isConfirmed() ? 1L : 0L);
                nlgVar.q(4, tvChannelVote.getTimestamp());
                break;
            case 25:
                TvChannel tvChannel = (TvChannel) obj;
                nlgVar.getClass();
                tvChannel.getClass();
                nlgVar.q(1, tvChannel.getId());
                nlgVar.L(2, tvChannel.getName());
                nlgVar.L(3, tvChannel.getCountryCode());
                String link = tvChannel.getLink();
                if (link != null) {
                    nlgVar.L(4, link);
                    break;
                } else {
                    nlgVar.s(4);
                    break;
                }
            case 26:
                nlgVar.getClass();
                ((UniqueStageId) obj).getClass();
                nlgVar.q(1, r9.getId());
                break;
            case 27:
                nlgVar.getClass();
                ((DbUserSegmentation) obj).getClass();
                nlgVar.q(1, UserSegmentationTypeConverter.INSTANCE.fromEnum(r9.getType()));
                break;
            case 28:
                DbWatchedVideo dbWatchedVideo = (DbWatchedVideo) obj;
                nlgVar.getClass();
                dbWatchedVideo.getClass();
                nlgVar.q(1, dbWatchedVideo.getId());
                nlgVar.q(2, dbWatchedVideo.getTimestamp());
                break;
            default:
                DbVote dbVote = (DbVote) obj;
                nlgVar.getClass();
                dbVote.getClass();
                nlgVar.q(1, dbVote.getId());
                nlgVar.L(2, dbVote.getUserChoice());
                nlgVar.q(3, dbVote.getEventTimestamp());
                nlgVar.q(4, dbVote.getSuccess() ? 1L : 0L);
                nlgVar.L(5, VoteTypeConverter.voteTypeToString(dbVote.getVoteType()));
                break;
        }
    }

    @Override // defpackage.ml4
    public final String O() {
        switch (this.w) {
            case 0:
                return "INSERT OR REPLACE INTO `buzzer_table` (`id`,`timestamp`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `chat_message_table` (`eventId`,`messageTimestamp`,`voteTimestamp`,`reportTimestamp`) VALUES (?,?,?,?)";
            case 2:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `events_score` (`eventId`,`home_score_display`,`home_score_period1`,`home_score_period2`,`home_score_period3`,`home_score_period4`,`home_score_period5`,`home_score_period6`,`home_score_period7`,`home_score_period8`,`home_score_period9`,`home_score_period10`,`home_score_period11`,`home_score_period12`,`home_score_period13`,`home_score_period1TieBreak`,`home_score_period2TieBreak`,`home_score_period3TieBreak`,`home_score_period4TieBreak`,`home_score_period5TieBreak`,`home_score_point`,`home_score_overtime`,`home_score_penalties`,`home_score_aggregated`,`home_score_series`,`home_score_currentCricketDisplay`,`away_score_display`,`away_score_period1`,`away_score_period2`,`away_score_period3`,`away_score_period4`,`away_score_period5`,`away_score_period6`,`away_score_period7`,`away_score_period8`,`away_score_period9`,`away_score_period10`,`away_score_period11`,`away_score_period12`,`away_score_period13`,`away_score_period1TieBreak`,`away_score_period2TieBreak`,`away_score_period3TieBreak`,`away_score_period4TieBreak`,`away_score_period5TieBreak`,`away_score_point`,`away_score_overtime`,`away_score_penalties`,`away_score_aggregated`,`away_score_series`,`away_score_currentCricketDisplay`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `fantasy_competition_table` (`id`) VALUES (?)";
            case 5:
                return "INSERT OR IGNORE INTO `feed_post_feedback` (`postId`,`feedbackTimestamp`) VALUES (?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `market_value_user_votes_table` (`playerId`,`playerValue`,`currency`,`voteType`) VALUES (?,?,?,?)";
            case 7:
                return "INSERT INTO `media_reaction_table` (`mediaPostId`,`reaction`,`timestamp`) VALUES (?,?,?)";
            case 8:
                return "INSERT INTO `media_reaction_table` (`mediaPostId`,`shareCount`,`timestamp`) VALUES (?,?,?)";
            case 9:
                return "INSERT INTO `mma_organization_view_table` (`id`,`viewCount`,`ignored`) VALUES (?,?,?)";
            case 10:
                return "INSERT OR ABORT INTO `nats_event_table` (`id`,`topic`,`message`) VALUES (nullif(?, 0),?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `notification_settings` (`group`,`name`,`enabled`,`channelId`,`groupInSettingsScreen`) VALUES (?,?,?,?,?)";
            case 12:
                return "INSERT OR IGNORE INTO `notification_settings` (`group`,`name`,`enabled`,`channelId`,`groupInSettingsScreen`) VALUES (?,?,?,?,?)";
            case 13:
                return "INSERT OR REPLACE INTO `pending_notifications` (`id`,`notificationId`,`title`,`message`,`updatableNotificationId`) VALUES (nullif(?, 0),?,?,?,?)";
            case 14:
                return "INSERT OR REPLACE INTO `my_players` (`playerId`,`notificationsEnabled`) VALUES (?,?)";
            case 15:
                return "INSERT OR REPLACE INTO `player_of_the_match_vote_table` (`eventId`,`playerId`,`eventTimestamp`) VALUES (?,?,?)";
            case 16:
                return "INSERT INTO `player_of_the_match_vote_table` (`eventId`,`playerId`,`eventTimestamp`) VALUES (?,?,?)";
            case 17:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 18:
                return "INSERT OR REPLACE INTO `saved_searches_table` (`id`,`entity`,`json`,`timestamp`) VALUES (?,?,?,?)";
            case 19:
                return "INSERT OR REPLACE INTO `sport_order` (`sportName`,`sportOrder`,`isSelected`) VALUES (?,?,?)";
            case 20:
                return "INSERT INTO `sport_order` (`sportName`,`sportOrder`,`isSelected`) VALUES (?,?,?)";
            case 21:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 22:
                return "INSERT OR REPLACE INTO `my_teams` (`teamId`,`notificationsEnabled`) VALUES (?,?)";
            case 23:
                return "INSERT OR REPLACE INTO `my_leagues` (`uniqueTournamentId`,`notificationsEnabled`) VALUES (?,?)";
            case 24:
                return "INSERT OR IGNORE INTO `tv_channel_vote_table` (`eventId`,`channelId`,`isConfirmed`,`timestamp`) VALUES (?,?,?,?)";
            case 25:
                return "INSERT INTO `my_channels_table` (`id`,`name`,`countryCode`,`link`) VALUES (?,?,?,?)";
            case 26:
                return "INSERT OR ABORT INTO `my_unique_stage` (`id`) VALUES (?)";
            case 27:
                return "INSERT OR ABORT INTO `user_segmentation` (`type`) VALUES (?)";
            case 28:
                return "INSERT OR REPLACE INTO `video_table` (`id`,`timestamp`) VALUES (?,?)";
            default:
                return "INSERT OR IGNORE INTO `vote_table` (`id`,`userChoice`,`eventTimestamp`,`success`,`voteType`) VALUES (?,?,?,?,?)";
        }
    }

    public /* synthetic */ s82(Object obj, int i) {
        this.w = i;
    }
}
