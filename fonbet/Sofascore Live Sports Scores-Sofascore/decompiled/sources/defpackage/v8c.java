package defpackage;

import com.sofascore.model.database.DbMediaLike;
import com.sofascore.model.database.DbMediaShare;
import com.sofascore.model.database.DbMmaOrganizationViewCount;
import com.sofascore.model.database.DbNatsEvent;
import com.sofascore.model.database.DbPlayerOfTheMatchVote;
import com.sofascore.model.database.DbSportOrder;
import com.sofascore.model.database.DbVote;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.database.VoteTypeConverter;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.notifications.NotificationSetting;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v8c extends td4 {
    public final /* synthetic */ int m;

    public v8c(x8c x8cVar) {
        this.m = 0;
    }

    @Override // defpackage.td4
    public final void R(nlg nlgVar, Object obj) {
        String str;
        int i;
        int i2 = 1;
        switch (this.m) {
            case 0:
                DbMediaLike dbMediaLike = (DbMediaLike) obj;
                nlgVar.getClass();
                dbMediaLike.getClass();
                nlgVar.q(1, dbMediaLike.getMediaPostId());
                MediaReactionType reaction = dbMediaLike.getReaction();
                if (reaction == null) {
                    nlgVar.s(2);
                } else {
                    int i3 = w8c.a[reaction.ordinal()];
                    if (i3 == 1) {
                        str = "THUMBS_UP";
                    } else if (i3 != 2) {
                        zzl.b();
                        break;
                    } else {
                        str = "REMOVE_THUMBS_UP";
                    }
                    nlgVar.L(2, str);
                }
                nlgVar.q(3, dbMediaLike.getTimestamp());
                nlgVar.q(4, dbMediaLike.getMediaPostId());
                break;
            case 1:
                DbMediaShare dbMediaShare = (DbMediaShare) obj;
                nlgVar.getClass();
                dbMediaShare.getClass();
                nlgVar.q(1, dbMediaShare.getMediaPostId());
                nlgVar.q(2, dbMediaShare.getShareCount());
                nlgVar.q(3, dbMediaShare.getTimestamp());
                nlgVar.q(4, dbMediaShare.getMediaPostId());
                break;
            case 2:
                DbMmaOrganizationViewCount dbMmaOrganizationViewCount = (DbMmaOrganizationViewCount) obj;
                nlgVar.getClass();
                dbMmaOrganizationViewCount.getClass();
                nlgVar.q(1, dbMmaOrganizationViewCount.getId());
                nlgVar.q(2, dbMmaOrganizationViewCount.getViewCount());
                nlgVar.q(3, dbMmaOrganizationViewCount.getIgnored() ? 1L : 0L);
                nlgVar.q(4, dbMmaOrganizationViewCount.getId());
                break;
            case 3:
                DbNatsEvent dbNatsEvent = (DbNatsEvent) obj;
                nlgVar.getClass();
                dbNatsEvent.getClass();
                nlgVar.q(1, dbNatsEvent.getId());
                nlgVar.L(2, dbNatsEvent.getTopic());
                nlgVar.L(3, dbNatsEvent.getMessage());
                nlgVar.q(4, dbNatsEvent.getId());
                break;
            case 4:
                NotificationSetting notificationSetting = (NotificationSetting) obj;
                nlgVar.getClass();
                notificationSetting.getClass();
                nlgVar.L(1, notificationSetting.getGroup());
                nlgVar.L(2, notificationSetting.getName());
                nlgVar.q(3, notificationSetting.getEnabled() ? 1L : 0L);
                nlgVar.L(4, notificationSetting.getChannelId());
                nlgVar.L(5, notificationSetting.getGroupInSettingsScreen());
                nlgVar.L(6, notificationSetting.getGroup());
                nlgVar.L(7, notificationSetting.getName());
                break;
            case 5:
                DbPlayerOfTheMatchVote dbPlayerOfTheMatchVote = (DbPlayerOfTheMatchVote) obj;
                nlgVar.getClass();
                dbPlayerOfTheMatchVote.getClass();
                nlgVar.q(1, dbPlayerOfTheMatchVote.getEventId());
                nlgVar.q(2, dbPlayerOfTheMatchVote.getPlayerId());
                nlgVar.q(3, dbPlayerOfTheMatchVote.getEventTimestamp());
                nlgVar.q(4, dbPlayerOfTheMatchVote.getEventId());
                break;
            case 6:
                DbSportOrder dbSportOrder = (DbSportOrder) obj;
                nlgVar.getClass();
                dbSportOrder.getClass();
                nlgVar.L(1, dbSportOrder.getSportName());
                nlgVar.q(2, dbSportOrder.getSportOrder());
                nlgVar.q(3, dbSportOrder.isSelected() ? 1L : 0L);
                nlgVar.L(4, dbSportOrder.getSportName());
                break;
            case 7:
                TvChannel tvChannel = (TvChannel) obj;
                nlgVar.getClass();
                tvChannel.getClass();
                nlgVar.q(1, tvChannel.getId());
                nlgVar.L(2, tvChannel.getCountryCode());
                break;
            case 8:
                TvChannel tvChannel2 = (TvChannel) obj;
                nlgVar.getClass();
                tvChannel2.getClass();
                nlgVar.q(1, tvChannel2.getId());
                nlgVar.L(2, tvChannel2.getName());
                nlgVar.L(3, tvChannel2.getCountryCode());
                String link = tvChannel2.getLink();
                if (link == null) {
                    nlgVar.s(4);
                } else {
                    nlgVar.L(4, link);
                }
                nlgVar.q(5, tvChannel2.getId());
                nlgVar.L(6, tvChannel2.getCountryCode());
                break;
            case 9:
                DbVote dbVote = (DbVote) obj;
                nlgVar.getClass();
                dbVote.getClass();
                nlgVar.q(1, dbVote.getId());
                nlgVar.L(2, dbVote.getUserChoice());
                nlgVar.q(3, dbVote.getEventTimestamp());
                nlgVar.q(4, dbVote.getSuccess() ? 1L : 0L);
                nlgVar.L(5, VoteTypeConverter.voteTypeToString(dbVote.getVoteType()));
                nlgVar.q(6, dbVote.getId());
                nlgVar.L(7, VoteTypeConverter.voteTypeToString(dbVote.getVoteType()));
                break;
            default:
                lcl lclVar = (lcl) obj;
                nlgVar.getClass();
                lclVar.getClass();
                String str2 = lclVar.a;
                nlgVar.L(1, str2);
                nlgVar.q(2, sha.X(lclVar.b));
                nlgVar.L(3, lclVar.c);
                nlgVar.L(4, lclVar.d);
                md4 md4Var = md4.b;
                nlgVar.r(5, ww9.I(lclVar.e));
                nlgVar.r(6, ww9.I(lclVar.f));
                nlgVar.q(7, lclVar.g);
                nlgVar.q(8, lclVar.h);
                nlgVar.q(9, lclVar.i);
                nlgVar.q(10, lclVar.k);
                zy0 zy0Var = lclVar.l;
                zy0Var.getClass();
                int ordinal = zy0Var.ordinal();
                if (ordinal == 0) {
                    i = 0;
                } else if (ordinal != 1) {
                    zzl.b();
                    break;
                } else {
                    i = 1;
                }
                nlgVar.q(11, i);
                nlgVar.q(12, lclVar.m);
                nlgVar.q(13, lclVar.n);
                nlgVar.q(14, lclVar.o);
                nlgVar.q(15, lclVar.p);
                nlgVar.q(16, lclVar.q ? 1L : 0L);
                pwd pwdVar = lclVar.r;
                pwdVar.getClass();
                int ordinal2 = pwdVar.ordinal();
                if (ordinal2 == 0) {
                    i2 = 0;
                } else if (ordinal2 != 1) {
                    zzl.b();
                    break;
                }
                nlgVar.q(17, i2);
                nlgVar.q(18, lclVar.s);
                nlgVar.q(19, lclVar.t);
                nlgVar.q(20, lclVar.u);
                nlgVar.q(21, lclVar.v);
                nlgVar.q(22, lclVar.w);
                String str3 = lclVar.x;
                if (str3 == null) {
                    nlgVar.s(23);
                } else {
                    nlgVar.L(23, str3);
                }
                Boolean bool = lclVar.y;
                if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                    nlgVar.s(24);
                } else {
                    nlgVar.q(24, r0.intValue());
                }
                zm3 zm3Var = lclVar.j;
                nlgVar.q(25, sha.I(zm3Var.a));
                nlgVar.r(26, sha.s(zm3Var.b));
                nlgVar.q(27, zm3Var.c ? 1L : 0L);
                nlgVar.q(28, zm3Var.d ? 1L : 0L);
                nlgVar.q(29, zm3Var.e ? 1L : 0L);
                nlgVar.q(30, zm3Var.f ? 1L : 0L);
                nlgVar.q(31, zm3Var.g);
                nlgVar.q(32, zm3Var.h);
                nlgVar.r(33, sha.W(zm3Var.i));
                nlgVar.L(34, str2);
                break;
        }
    }

    @Override // defpackage.td4
    public final String W() {
        switch (this.m) {
            case 0:
                return "UPDATE `media_reaction_table` SET `mediaPostId` = ?,`reaction` = ?,`timestamp` = ? WHERE `mediaPostId` = ?";
            case 1:
                return "UPDATE `media_reaction_table` SET `mediaPostId` = ?,`shareCount` = ?,`timestamp` = ? WHERE `mediaPostId` = ?";
            case 2:
                return "UPDATE `mma_organization_view_table` SET `id` = ?,`viewCount` = ?,`ignored` = ? WHERE `id` = ?";
            case 3:
                return "UPDATE OR ABORT `nats_event_table` SET `id` = ?,`topic` = ?,`message` = ? WHERE `id` = ?";
            case 4:
                return "UPDATE OR ABORT `notification_settings` SET `group` = ?,`name` = ?,`enabled` = ?,`channelId` = ?,`groupInSettingsScreen` = ? WHERE `group` = ? AND `name` = ?";
            case 5:
                return "UPDATE `player_of_the_match_vote_table` SET `eventId` = ?,`playerId` = ?,`eventTimestamp` = ? WHERE `eventId` = ?";
            case 6:
                return "UPDATE `sport_order` SET `sportName` = ?,`sportOrder` = ?,`isSelected` = ? WHERE `sportName` = ?";
            case 7:
                return "DELETE FROM `my_channels_table` WHERE `id` = ? AND `countryCode` = ?";
            case 8:
                return "UPDATE `my_channels_table` SET `id` = ?,`name` = ?,`countryCode` = ?,`link` = ? WHERE `id` = ? AND `countryCode` = ?";
            case 9:
                return "UPDATE `vote_table` SET `id` = ?,`userChoice` = ?,`eventTimestamp` = ?,`success` = ?,`voteType` = ? WHERE `id` = ? AND `voteType` = ?";
            default:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    public /* synthetic */ v8c(int i) {
        this.m = i;
    }
}
