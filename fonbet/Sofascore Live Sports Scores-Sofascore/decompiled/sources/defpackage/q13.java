package defpackage;

import android.content.SharedPreferences;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class q13 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ q13(ksa ksaVar, int i) {
        this.a = 28;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        z = false;
        int i2 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException(lnb.n("Collection doesn't contain element at index ", i2, '.'));
            case 1:
                ((Integer) obj).getClass();
                return Integer.valueOf(i2);
            case 2:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V0 = glgVar.V0("DELETE FROM events_table WHERE id = ? AND NOT EXISTS ( SELECT * FROM leagues WHERE leagues.id = events_table.uniqueTournamentId ) AND NOT EXISTS ( SELECT * FROM my_teams WHERE  my_teams.teamId = events_table.homeTeamId OR my_teams.teamId = events_table.awayTeamId OR  my_teams.teamId = events_table.homeSubTeam1Id OR my_teams.teamId = events_table.awaySubTeam1Id OR  my_teams.teamId = events_table.homeSubTeam2Id OR my_teams.teamId = events_table.awaySubTeam2Id)");
                try {
                    V0.q(1, i2);
                    V0.U0();
                    int y = u0a.y(glgVar);
                    V0.close();
                    return Integer.valueOf(y);
                } finally {
                }
            case 3:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                nlg V02 = glgVar2.V0("UPDATE events_table SET mute = 1 WHERE id = ?");
                try {
                    V02.q(1, i2);
                    V02.U0();
                    int y2 = u0a.y(glgVar2);
                    V02.close();
                    return Integer.valueOf(y2);
                } finally {
                }
            case 4:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                nlg V03 = glgVar3.V0("DELETE FROM tournament WHERE id = ? AND NOT EXISTS ( SELECT events_table.tournamentId FROM events_table WHERE events_table.tournamentId = ? )");
                long j = i2;
                try {
                    V03.q(1, j);
                    V03.q(2, j);
                    V03.U0();
                    V03.close();
                    return Unit.a;
                } finally {
                }
            case 5:
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                nlg V04 = glgVar4.V0("UPDATE events_table SET mute = 0 WHERE id = ?");
                try {
                    V04.q(1, i2);
                    V04.U0();
                    int y3 = u0a.y(glgVar4);
                    V04.close();
                    return Integer.valueOf(y3);
                } finally {
                }
            case 6:
                glg glgVar5 = (glg) obj;
                glgVar5.getClass();
                nlg V05 = glgVar5.V0("SELECT EXISTS(SELECT * FROM events_table WHERE id = ?)");
                try {
                    V05.q(1, i2);
                    if (V05.U0()) {
                        if (((int) V05.getLong(0)) != 0) {
                            z = true;
                        }
                    }
                    V05.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 7:
                glg glgVar6 = (glg) obj;
                glgVar6.getClass();
                nlg V06 = glgVar6.V0("DELETE FROM my_stage_table WHERE id = ?");
                try {
                    V06.q(1, i2);
                    V06.U0();
                    int y4 = u0a.y(glgVar6);
                    V06.close();
                    return Integer.valueOf(y4);
                } finally {
                }
            case 8:
                glg glgVar7 = (glg) obj;
                glgVar7.getClass();
                nlg V07 = glgVar7.V0("SELECT COUNT(id) FROM events_table WHERE id = ? AND mute = 1");
                try {
                    V07.q(1, i2);
                    int i3 = V07.U0() ? (int) V07.getLong(0) : 0;
                    V07.close();
                    return Integer.valueOf(i3);
                } finally {
                }
            case 9:
                glg glgVar8 = (glg) obj;
                glgVar8.getClass();
                nlg V08 = glgVar8.V0("DELETE FROM my_stage_table WHERE stage_season_unique_stage_id = ?");
                try {
                    V08.q(1, i2);
                    V08.U0();
                    int y5 = u0a.y(glgVar8);
                    V08.close();
                    return Integer.valueOf(y5);
                } finally {
                }
            case 10:
                glg glgVar9 = (glg) obj;
                glgVar9.getClass();
                nlg V09 = glgVar9.V0("DELETE FROM events_table WHERE events_table.id = ?");
                try {
                    V09.q(1, i2);
                    V09.U0();
                    V09.close();
                    return Unit.a;
                } finally {
                }
            case 11:
                glg glgVar10 = (glg) obj;
                glgVar10.getClass();
                nlg V010 = glgVar10.V0("SELECT CASE WHEN SUM(isMuted) = COUNT(*) THEN 1 ELSE 0 END FROM my_stage_table WHERE parent_event_id = ?");
                try {
                    V010.q(1, i2);
                    int i4 = V010.U0() ? (int) V010.getLong(0) : 0;
                    V010.close();
                    return Integer.valueOf(i4);
                } finally {
                }
            case 12:
                glg glgVar11 = (glg) obj;
                glgVar11.getClass();
                nlg V011 = glgVar11.V0("UPDATE my_stage_table SET isMuted = 1 WHERE id == ?");
                try {
                    V011.q(1, i2);
                    V011.U0();
                    int y6 = u0a.y(glgVar11);
                    V011.close();
                    return Integer.valueOf(y6);
                } finally {
                }
            case 13:
                glg glgVar12 = (glg) obj;
                glgVar12.getClass();
                nlg V012 = glgVar12.V0("DELETE FROM teams WHERE id = ? AND NOT EXISTS(SELECT * FROM events_table WHERE homeTeamId = ? OR awayTeamId = ?)");
                long j2 = i2;
                try {
                    V012.q(1, j2);
                    V012.q(2, j2);
                    V012.q(3, j2);
                    V012.U0();
                    int y7 = u0a.y(glgVar12);
                    V012.close();
                    return Integer.valueOf(y7);
                } finally {
                }
            case 14:
                glg glgVar13 = (glg) obj;
                glgVar13.getClass();
                nlg V013 = glgVar13.V0("SELECT id FROM events_table WHERE uniqueTournamentId = ?");
                try {
                    V013.q(1, i2);
                    ArrayList arrayList = new ArrayList();
                    while (V013.U0()) {
                        arrayList.add(Integer.valueOf((int) V013.getLong(0)));
                    }
                    return arrayList;
                } finally {
                }
            case 15:
                glg glgVar14 = (glg) obj;
                glgVar14.getClass();
                nlg V014 = glgVar14.V0("DELETE FROM fantasy_competition_table WHERE id = ?");
                try {
                    V014.q(1, i2);
                    V014.U0();
                    int y8 = u0a.y(glgVar14);
                    V014.close();
                    return Integer.valueOf(y8);
                } finally {
                }
            case 16:
                return Integer.valueOf(((Integer) obj).intValue() + i2);
            case 17:
                return Integer.valueOf(((Integer) obj).intValue() + i2);
            case 18:
                return Integer.valueOf(((Integer) obj).intValue() * i2);
            case 19:
                return Integer.valueOf(i2 * (-((Integer) obj).intValue()));
            case 20:
                return Integer.valueOf(((Integer) obj).intValue() * i2);
            case 21:
                return Integer.valueOf(i2 * (-((Integer) obj).intValue()));
            case 22:
                return Integer.valueOf(((Integer) obj).intValue() * i2);
            case 23:
                return Integer.valueOf(i2 * (-((Integer) obj).intValue()));
            case 24:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                return Long.valueOf(sharedPreferences.getLong("competition_" + i2 + "_reveal_timestamp", -1L));
            case 25:
                glg glgVar15 = (glg) obj;
                glgVar15.getClass();
                nlg V015 = glgVar15.V0("DELETE FROM feed_post_feedback WHERE postId = ?");
                try {
                    V015.q(1, i2);
                    V015.U0();
                    V015.close();
                    return Unit.a;
                } finally {
                }
            case 26:
                return rfo.u(rd0.H(i2, ((nt9) obj).a));
            case 27:
                return rfo.u(rd0.H(i2, ((nt9) obj).a));
            case 28:
                cra craVar = (cra) obj;
                nnh w = bea.w();
                bea.K(w, bea.C(w), w != null ? w.e() : null);
                int i5 = craVar.a;
                int i6 = i5 != -1 ? i5 : 2;
                for (int i7 = 0; i7 < i6; i7++) {
                    craVar.a(i2 + i7);
                }
                return Unit.a;
            default:
                ppb ppbVar = (ppb) obj;
                ppbVar.getClass();
                gv9 gv9Var = ppbVar.a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : gv9Var) {
                    if (((do7) obj2).c.c != i2) {
                        arrayList2.add(obj2);
                    }
                }
                return ppb.a(ppbVar, l6g.W(arrayList2), null, null, null, null, false, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        }
    }

    public /* synthetic */ q13(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
