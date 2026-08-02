package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.PlayerTeamInfo;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.StageStandingsItem;
import com.sofascore.model.newNetwork.statistics.season.team.TennisTeamSeasonStatistics;
import com.sofascore.results.R;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class c8i implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ c8i(int i) {
        this.a = 18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x030b, code lost:
    
        if (r6 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0349, code lost:
    
        if (r5 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0397, code lost:
    
        if (r6 == null) goto L188;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        String gap;
        String gap2;
        PlayerTeamInfo playerTeamInfo;
        Double height;
        Double g;
        PlayerTeamInfo playerTeamInfo2;
        Long birthDateTimestamp;
        PlayerTeamInfo playerTeamInfo3;
        Double h;
        Double l;
        Double m;
        boolean z = false;
        String str = null;
        switch (this.a) {
            case 0:
                StageStandingsItem stageStandingsItem = (StageStandingsItem) obj2;
                ((Context) obj).getClass();
                stageStandingsItem.getClass();
                Double points = stageStandingsItem.getPoints();
                if (points != null) {
                    return String.valueOf(wzb.a(points.doubleValue()));
                }
                return null;
            case 1:
                StageStandingsItem stageStandingsItem2 = (StageStandingsItem) obj2;
                ((Context) obj).getClass();
                stageStandingsItem2.getClass();
                Integer sprint = stageStandingsItem2.getSprint();
                if (sprint != null) {
                    return String.valueOf(sprint.intValue());
                }
                return null;
            case 2:
                StageStandingsItem stageStandingsItem3 = (StageStandingsItem) obj2;
                ((Context) obj).getClass();
                stageStandingsItem3.getClass();
                Integer climb = stageStandingsItem3.getClimb();
                if (climb != null) {
                    return String.valueOf(climb.intValue());
                }
                return null;
            case 3:
                Context context = (Context) obj;
                StageStandingsItem stageStandingsItem4 = (StageStandingsItem) obj2;
                context.getClass();
                stageStandingsItem4.getClass();
                Integer lapsBehind = stageStandingsItem4.getLapsBehind();
                if (lapsBehind != null) {
                    if (lapsBehind.intValue() < 1 || stageStandingsItem4.getPosition() == null) {
                        lapsBehind = null;
                    }
                    if (lapsBehind != null) {
                        int intValue = lapsBehind.intValue();
                        gap = context.getResources().getQuantityString(R.plurals.motorsport_laps_behind, intValue, Integer.valueOf(intValue));
                        break;
                    }
                }
                gap = stageStandingsItem4.getGap();
                if (gap == null && (gap = stageStandingsItem4.getTotalTime()) == null && (gap = stageStandingsItem4.getTime()) == null) {
                    gap = stageStandingsItem4.getStatus();
                }
                if (gap != null) {
                    return StringsKt.V(gap, "0");
                }
                return null;
            case 4:
                StageStandingsItem stageStandingsItem5 = (StageStandingsItem) obj2;
                ((Context) obj).getClass();
                stageStandingsItem5.getClass();
                String interval = stageStandingsItem5.getInterval();
                if (interval != null) {
                    Integer position = stageStandingsItem5.getPosition();
                    if (position == null || position.intValue() != 1) {
                        str = interval;
                        break;
                    }
                }
                str = stageStandingsItem5.getTotalTime();
                if (str == null && (str = stageStandingsItem5.getTime()) == null && (str = stageStandingsItem5.getStatus()) == null) {
                    str = "-";
                }
                return StringsKt.V(str, "0");
            case 5:
                Context context2 = (Context) obj;
                StageStandingsItem stageStandingsItem6 = (StageStandingsItem) obj2;
                context2.getClass();
                stageStandingsItem6.getClass();
                Integer lapsBehind2 = stageStandingsItem6.getLapsBehind();
                if (lapsBehind2 != null) {
                    if (lapsBehind2.intValue() < 1 || stageStandingsItem6.getPosition() == null) {
                        lapsBehind2 = null;
                    }
                    if (lapsBehind2 != null) {
                        int intValue2 = lapsBehind2.intValue();
                        gap2 = context2.getResources().getQuantityString(R.plurals.motorsport_laps_behind, intValue2, Integer.valueOf(intValue2));
                        break;
                    }
                }
                gap2 = stageStandingsItem6.getGap();
                if (gap2 == null && (gap2 = stageStandingsItem6.getTotalTime()) == null && (gap2 = stageStandingsItem6.getTime()) == null) {
                    gap2 = stageStandingsItem6.getStatus();
                }
                if (gap2 != null) {
                    return StringsKt.V(gap2, "0");
                }
                return null;
            case 6:
                StageStandingsItem stageStandingsItem7 = (StageStandingsItem) obj2;
                ((Context) obj).getClass();
                stageStandingsItem7.getClass();
                String time = stageStandingsItem7.getTime();
                if (time == null) {
                    time = stageStandingsItem7.getTotalTime();
                }
                if (time != null) {
                    return StringsKt.V(time, "0");
                }
                return null;
            case 7:
                StageStandingsItem stageStandingsItem8 = (StageStandingsItem) obj2;
                ((Context) obj).getClass();
                stageStandingsItem8.getClass();
                String youngRider = stageStandingsItem8.getYoungRider();
                return youngRider != null ? StringsKt.V(youngRider, "0") : stageStandingsItem8.getStatus();
            case 8:
                StageStandingsItem stageStandingsItem9 = (StageStandingsItem) obj2;
                ((Context) obj).getClass();
                stageStandingsItem9.getClass();
                String totalTime = stageStandingsItem9.getTotalTime();
                if (totalTime == null && (totalTime = stageStandingsItem9.getTime()) == null) {
                    totalTime = stageStandingsItem9.getStatus();
                }
                if (totalTime != null) {
                    return StringsKt.V(totalTime, "0");
                }
                return null;
            case 9:
                StageStandingsItem stageStandingsItem10 = (StageStandingsItem) obj2;
                ((Context) obj).getClass();
                stageStandingsItem10.getClass();
                Integer personalFastestLap = stageStandingsItem10.getPersonalFastestLap();
                if (personalFastestLap != null) {
                    return String.valueOf(personalFastestLap.intValue());
                }
                return null;
            case 10:
                StageStandingsItem stageStandingsItem11 = (StageStandingsItem) obj2;
                ((Context) obj).getClass();
                stageStandingsItem11.getClass();
                String personalFastestLapTime = stageStandingsItem11.getPersonalFastestLapTime();
                if (personalFastestLapTime != null) {
                    return StringsKt.V(personalFastestLapTime, "0");
                }
                return null;
            case 11:
                ((Context) obj).getClass();
                ((StageStandingsItem) obj2).getClass();
                return null;
            case 12:
                ((Context) obj).getClass();
                ((StageStandingsItem) obj2).getClass();
                return null;
            case 13:
                return (fpi) ((eoh) ((e1d) ((epi) obj2).a.c)).getValue();
            case 14:
                ((Team) obj).getClass();
                ((n0i) obj2).getClass();
                return Boolean.TRUE;
            case 15:
                n0i n0iVar = (n0i) obj2;
                ((Team) obj).getClass();
                n0iVar.getClass();
                return Boolean.valueOf(n0iVar.a.getDateOfBirthTimestamp() != null);
            case 16:
                n0i n0iVar2 = (n0i) obj2;
                ((Team) obj).getClass();
                n0iVar2.getClass();
                return Boolean.valueOf(n0iVar2.a.getHeight() != null);
            case 17:
                n0i n0iVar3 = (n0i) obj2;
                ((Team) obj).getClass();
                n0iVar3.getClass();
                return Boolean.valueOf(n0iVar3.a.getProposedMarketValueRaw() != null);
            case 18:
                ((Integer) obj2).getClass();
                jaa.l(aba.K(1), (of3) obj);
                return Unit.a;
            case 19:
                c73 c73Var = (c73) obj;
                c73Var.getClass();
                ((Context) obj2).getClass();
                TennisTeamSeasonStatistics o = tba.o(c73Var);
                if (o != null) {
                    return u6j.c(o);
                }
                return null;
            case 20:
                c73 c73Var2 = (c73) obj;
                Context context3 = (Context) obj2;
                c73Var2.getClass();
                context3.getClass();
                qo2 qo2Var = c73Var2.a;
                b73 b73Var = qo2Var instanceof b73 ? (b73) qo2Var : null;
                if (b73Var == null || (playerTeamInfo = b73Var.c.getPlayerTeamInfo()) == null || (height = playerTeamInfo.getHeight()) == null) {
                    return null;
                }
                double doubleValue = height.doubleValue();
                if (!Intrinsics.c(v7a.u(context3), "METRIC")) {
                    return v7a.s(context3, doubleValue, false);
                }
                String string = context3.getString(R.string.centimeters_format, String.valueOf(wzb.a(doubleValue * 100.0d)));
                string.getClass();
                return string;
            case 21:
                c73 c73Var3 = (c73) obj;
                c73Var3.getClass();
                ((Context) obj2).getClass();
                TennisTeamSeasonStatistics o2 = tba.o(c73Var3);
                if (o2 != null) {
                    return u6j.n(o2);
                }
                return null;
            case 22:
                c73 c73Var4 = (c73) obj;
                c73Var4.getClass();
                ((Context) obj2).getClass();
                TennisTeamSeasonStatistics o3 = tba.o(c73Var4);
                if (o3 != null) {
                    return u6j.p(o3);
                }
                return null;
            case 23:
                c73 c73Var5 = (c73) obj;
                c73Var5.getClass();
                ((Context) obj2).getClass();
                TennisTeamSeasonStatistics o4 = tba.o(c73Var5);
                if (o4 != null) {
                    return u6j.o(o4);
                }
                return null;
            case 24:
                c73 c73Var6 = (c73) obj;
                Context context4 = (Context) obj2;
                c73Var6.getClass();
                context4.getClass();
                TennisTeamSeasonStatistics o5 = tba.o(c73Var6);
                if (o5 != null) {
                    return u6j.k(o5, context4);
                }
                return null;
            case 25:
                c73 c73Var7 = (c73) obj;
                c73Var7.getClass();
                ((Context) obj2).getClass();
                TennisTeamSeasonStatistics o6 = tba.o(c73Var7);
                if (o6 == null || (g = u6j.g(o6)) == null) {
                    return null;
                }
                return rei.e(Double.valueOf(g.doubleValue()), 0, 6);
            case 26:
                c73 c73Var8 = (c73) obj;
                c73Var8.getClass();
                ((Context) obj2).getClass();
                qo2 qo2Var2 = c73Var8.a;
                boolean z2 = qo2Var2 instanceof b73;
                b73 b73Var2 = z2 ? (b73) qo2Var2 : null;
                if (b73Var2 == null || (playerTeamInfo2 = b73Var2.c.getPlayerTeamInfo()) == null || (birthDateTimestamp = playerTeamInfo2.getBirthDateTimestamp()) == null) {
                    return null;
                }
                b73 b73Var3 = z2 ? (b73) qo2Var2 : null;
                if (b73Var3 != null && (playerTeamInfo3 = b73Var3.c.getPlayerTeamInfo()) != null) {
                    z = Intrinsics.c(playerTeamInfo3.getDeceased(), Boolean.TRUE);
                }
                if (z) {
                    birthDateTimestamp = null;
                }
                if (birthDateTimestamp != null) {
                    return String.valueOf((int) ChronoUnit.YEARS.between(vxd.o(Instant.ofEpochMilli(birthDateTimestamp.longValue() * 1000)), vxd.o(Instant.ofEpochMilli(yaa.v()))));
                }
                return null;
            case 27:
                c73 c73Var9 = (c73) obj;
                c73Var9.getClass();
                ((Context) obj2).getClass();
                TennisTeamSeasonStatistics o7 = tba.o(c73Var9);
                if (o7 == null || (h = u6j.h(o7)) == null) {
                    return null;
                }
                return rei.e(Double.valueOf(h.doubleValue()), 0, 6);
            case 28:
                c73 c73Var10 = (c73) obj;
                c73Var10.getClass();
                ((Context) obj2).getClass();
                TennisTeamSeasonStatistics o8 = tba.o(c73Var10);
                if (o8 == null || (l = u6j.l(o8)) == null) {
                    return null;
                }
                return rei.e(Double.valueOf(l.doubleValue()), 0, 6);
            default:
                c73 c73Var11 = (c73) obj;
                c73Var11.getClass();
                ((Context) obj2).getClass();
                TennisTeamSeasonStatistics o9 = tba.o(c73Var11);
                if (o9 == null || (m = u6j.m(o9)) == null) {
                    return null;
                }
                return rei.e(Double.valueOf(m.doubleValue()), 0, 6);
        }
    }

    public /* synthetic */ c8i(byte b, int i) {
        this.a = i;
    }
}
