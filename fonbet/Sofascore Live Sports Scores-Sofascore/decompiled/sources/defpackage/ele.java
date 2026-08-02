package defpackage;

import com.sofascore.model.Injury;
import com.sofascore.model.PlayerActiveSuspension;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class ele {
    public static int a(PlayerActiveSuspension.SuspensionReason suspensionReason) {
        switch (dle.b[suspensionReason.ordinal()]) {
            case 1:
                return R.string.red_card;
            case 2:
                return R.string.accumulated_yellow_cards;
            case 3:
                return R.string.suspension_2nd_yellow_red_card;
            case 4:
                return R.string.suspension_improper_conduct;
            case 5:
                return R.string.suspension_doping_violation;
            case 6:
                return R.string.suspension_after_video_review;
            case 7:
                return R.string.injury_reason_personal;
            case 8:
                return R.string.missing_reason_legal;
            case 9:
                return R.string.missing_reason_coach_decision;
            case 10:
                return R.string.missing_reason_club_decision;
            case 11:
                return R.string.missing_reason_transfer_pending;
            case 12:
                return R.string.injury_reason_rest;
            case 13:
                return R.string.missing_reason_betting_violation;
            case 14:
                return R.string.missing_reason_international_duty;
            case 15:
                return R.string.suspension;
            default:
                zzl.b();
                return 0;
        }
    }

    public static gv9 b(Player player, boolean z) {
        Iterator it;
        r9k q9kVar;
        Object u2gVar;
        player.getClass();
        xbb b = a.b();
        Injury injury = player.getInjury();
        int i = 1;
        int i2 = R.string.reason;
        if (injury != null) {
            boolean c = Intrinsics.c(player.getSportSlug(), Sports.FOOTBALL);
            q9k q9kVar2 = (c && Intrinsics.c(injury.getStatus(), "dayToDay")) ? new q9k(R.string.injury_status_doubtful) : c ? new q9k(R.string.player_injured) : f7a.r(injury.getStatus(), z);
            int id = injury.getId();
            fle fleVar = fle.a;
            long updateDateTimestamp = injury.getUpdateDateTimestamp();
            bi4 bi4Var = bi4.PATTERN_DMMY;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            m9k m9kVar = new m9k(fc6.i(updateDateTimestamp, hk4.a(bi4Var.d())));
            Integer p = f7a.p(injury.getReason());
            r9k q9kVar3 = p != null ? new q9k(p.intValue()) : new m9k(injury.getReason());
            int i3 = Intrinsics.c(injury.getStatus(), "dayToDay") ? R.color.alert : R.color.error;
            xbb b2 = a.b();
            Integer p2 = f7a.p(injury.getReason());
            b2.add(new cle(new q9k(R.string.reason), p2 != null ? new q9k(p2.intValue()) : new m9k(injury.getReason())));
            b2.add(new cle(new q9k(R.string.injury_start_date), new m9k(fc6.i(injury.getStartDateTimestamp(), hk4.a(bi4Var.d())))));
            Injury.ExpectedReturn expectedReturn = injury.getExpectedReturn();
            switch (expectedReturn == null ? -1 : dle.a[expectedReturn.ordinal()]) {
                case 1:
                    q9kVar = new q9k(R.string.injury_return_a_few_days);
                    break;
                case 2:
                    q9kVar = new q9k(R.string.injury_status_day_to_day);
                    break;
                case 3:
                    q9kVar = new q9k(R.string.injury_status_season);
                    break;
                case 4:
                    q9kVar = new q9k(R.string.injury_return_back_in_training);
                    break;
                case 5:
                    q9kVar = new q9k(R.string.injury_return_few_weeks);
                    break;
                case 6:
                    q9kVar = new q9k(R.string.injury_return_about_a_week);
                    break;
                case 7:
                    q9kVar = new q9k(R.string.injury_return_1_2_weeks);
                    break;
                case 8:
                case 9:
                case 10:
                    Injury.ExpectedReturnDateData expectedReturnDateData = injury.getExpectedReturnDateData();
                    if (expectedReturnDateData != null) {
                        try {
                            p2g p2gVar = w2g.b;
                            LocalDate of = LocalDate.of(expectedReturnDateData.getYear(), expectedReturnDateData.getMonth(), 1);
                            of.getClass();
                            String format = of.format(hk4.a(bi4.PATTERN_MMMMY.d()));
                            format.getClass();
                            u2gVar = new m9k(format);
                        } catch (Throwable th) {
                            p2g p2gVar2 = w2g.b;
                            u2gVar = new u2g(th);
                        }
                        if (u2gVar instanceof u2g) {
                            u2gVar = null;
                        }
                        q9kVar = (m9k) u2gVar;
                        break;
                    }
                default:
                    q9kVar = null;
                    break;
            }
            if (q9kVar != null) {
                b2.add(new cle(new q9k(R.string.player_expected_return), q9kVar));
            }
            b.add(new hle(id, fleVar, R.drawable.ic_cross, q9kVar2, q9kVar3, m9kVar, null, l6g.W(a.a(b2)), i3, false, 576));
        }
        List<PlayerActiveSuspension> activeSeasonSuspensions = player.getActiveSeasonSuspensions();
        if (activeSeasonSuspensions != null) {
            ArrayList arrayList = new ArrayList(k13.r(activeSeasonSuspensions, 10));
            Iterator it2 = activeSeasonSuspensions.iterator();
            while (it2.hasNext()) {
                PlayerActiveSuspension playerActiveSuspension = (PlayerActiveSuspension) it2.next();
                int id2 = playerActiveSuspension.getId();
                fle fleVar2 = fle.b;
                q9k q9kVar4 = new q9k(a(playerActiveSuspension.getReason()));
                int i4 = dle.b[playerActiveSuspension.getReason().ordinal()];
                int i5 = i4 != i ? i4 != 2 ? i4 != 3 ? i4 != 5 ? R.drawable.ic_suspended_16 : R.drawable.ic_doping : R.drawable.ic_yellow_double_16 : R.drawable.ic_card_yellows : R.drawable.ic_card_red_16;
                boolean z2 = !ph0.a0(new PlayerActiveSuspension.SuspensionReason[]{PlayerActiveSuspension.SuspensionReason.YellowCardAccumulation, PlayerActiveSuspension.SuspensionReason.YellowToRedCard, PlayerActiveSuspension.SuspensionReason.RedCard}).contains(playerActiveSuspension.getReason());
                q9k q9kVar5 = new q9k(R.string.player_suspended);
                UniqueTournament uniqueTournament = playerActiveSuspension.getUniqueTournament();
                gle gleVar = uniqueTournament != null ? new gle(uniqueTournament.getId(), tba.x(uniqueTournament)) : null;
                xbb b3 = a.b();
                b3.add(new cle(new q9k(i2), new q9k(a(playerActiveSuspension.getReason()))));
                Integer matches = playerActiveSuspension.getMatches();
                if (matches != null) {
                    int intValue = matches.intValue();
                    it = it2;
                    b3.add(new cle(new q9k(R.string.time_duration), new p9k(R.plurals.general_number_of_matches, intValue, l6g.K(Integer.valueOf(intValue)))));
                } else {
                    it = it2;
                }
                Long startDateTimestamp = playerActiveSuspension.getStartDateTimestamp();
                if (startDateTimestamp != null) {
                    long longValue = startDateTimestamp.longValue();
                    q9k q9kVar6 = new q9k(R.string.suspension_date);
                    bi4 bi4Var2 = bi4.PATTERN_DMMY;
                    ConcurrentHashMap concurrentHashMap2 = hk4.a;
                    b3.add(new cle(q9kVar6, new m9k(fc6.i(longValue, hk4.a(bi4Var2.d())))));
                }
                Long endDateTimestamp = playerActiveSuspension.getEndDateTimestamp();
                if (endDateTimestamp != null) {
                    long longValue2 = endDateTimestamp.longValue();
                    q9k q9kVar7 = new q9k(R.string.return_date);
                    bi4 bi4Var3 = bi4.PATTERN_DMMY;
                    ConcurrentHashMap concurrentHashMap3 = hk4.a;
                    b3.add(new cle(q9kVar7, new m9k(fc6.i(longValue2, hk4.a(bi4Var3.d())))));
                }
                arrayList.add(new hle(id2, fleVar2, i5, q9kVar5, q9kVar4, null, gleVar, l6g.W(a.a(b3)), 0, z2, 288));
                it2 = it;
                i = 1;
                i2 = R.string.reason;
            }
            b.addAll(arrayList);
        }
        xbb a = a.a(b);
        if (a.isEmpty()) {
            a = null;
        }
        if (a != null) {
            return l6g.W(a);
        }
        return null;
    }
}
