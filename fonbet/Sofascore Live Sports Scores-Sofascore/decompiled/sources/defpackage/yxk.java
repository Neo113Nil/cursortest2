package defpackage;

import com.sofascore.model.database.DbUserWeeklyLeaderboard;
import com.sofascore.model.database.DbVote;
import com.sofascore.model.database.VoteTypeConverter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yxk extends ml4 {
    public final /* synthetic */ int w;

    public /* synthetic */ yxk(int i) {
        this.w = i;
    }

    @Override // defpackage.ml4
    public final void J(nlg nlgVar, Object obj) {
        int i;
        int i2 = 1;
        switch (this.w) {
            case 0:
                DbVote dbVote = (DbVote) obj;
                nlgVar.getClass();
                dbVote.getClass();
                nlgVar.q(1, dbVote.getId());
                nlgVar.L(2, dbVote.getUserChoice());
                nlgVar.q(3, dbVote.getEventTimestamp());
                nlgVar.q(4, dbVote.getSuccess() ? 1L : 0L);
                nlgVar.L(5, VoteTypeConverter.voteTypeToString(dbVote.getVoteType()));
                break;
            case 1:
                DbUserWeeklyLeaderboard dbUserWeeklyLeaderboard = (DbUserWeeklyLeaderboard) obj;
                nlgVar.getClass();
                dbUserWeeklyLeaderboard.getClass();
                nlgVar.L(1, dbUserWeeklyLeaderboard.getUserId());
                nlgVar.q(2, dbUserWeeklyLeaderboard.getLeaderboardId());
                break;
            case 2:
                acl aclVar = (acl) obj;
                nlgVar.getClass();
                aclVar.getClass();
                nlgVar.L(1, aclVar.a);
                nlgVar.L(2, aclVar.b);
                break;
            case 3:
                dcl dclVar = (dcl) obj;
                nlgVar.getClass();
                dclVar.getClass();
                nlgVar.L(1, dclVar.a);
                md4 md4Var = md4.b;
                nlgVar.r(2, ww9.I(dclVar.b));
                break;
            case 4:
                lcl lclVar = (lcl) obj;
                nlgVar.getClass();
                lclVar.getClass();
                nlgVar.L(1, lclVar.a);
                nlgVar.q(2, sha.X(lclVar.b));
                nlgVar.L(3, lclVar.c);
                nlgVar.L(4, lclVar.d);
                md4 md4Var2 = md4.b;
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
                String str = lclVar.x;
                if (str == null) {
                    nlgVar.s(23);
                } else {
                    nlgVar.L(23, str);
                }
                Boolean bool = lclVar.y;
                if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                    nlgVar.s(24);
                } else {
                    nlgVar.q(24, r7.intValue());
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
                break;
            default:
                rcl rclVar = (rcl) obj;
                nlgVar.getClass();
                rclVar.getClass();
                nlgVar.L(1, rclVar.a);
                nlgVar.L(2, rclVar.b);
                break;
        }
    }

    @Override // defpackage.ml4
    public final String O() {
        switch (this.w) {
            case 0:
                return "INSERT INTO `vote_table` (`id`,`userChoice`,`eventTimestamp`,`success`,`voteType`) VALUES (?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `user_weekly_leaderboard` (`userId`,`leaderboardId`) VALUES (?,?)";
            case 2:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 4:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}
