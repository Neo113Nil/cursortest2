package defpackage;

import android.content.SharedPreferences;
import com.sofascore.model.database.DbVote;
import com.sofascore.model.database.VoteTypeConverter;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class kwi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ kwi(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [gv9] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nlg V0;
        int i = this.a;
        Object obj2 = null;
        int i2 = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(i2 * (-((Integer) obj).intValue()));
            case 1:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                V0 = glgVar.V0("DELETE FROM events_table WHERE uniqueTournamentId = ? AND NOT EXISTS ( SELECT * FROM my_teams WHERE my_teams.teamId = events_table.homeTeamId OR my_teams.teamId = events_table.awayTeamId OR my_teams.teamId = events_table.homeSubTeam1Id OR my_teams.teamId = events_table.awaySubTeam1Id OR my_teams.teamId = events_table.homeSubTeam2Id OR my_teams.teamId = events_table.awaySubTeam2Id)");
                try {
                    V0.q(1, i2);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 2:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                V0 = glgVar2.V0("DELETE FROM leagues WHERE id = ?");
                try {
                    V0.q(1, i2);
                    V0.U0();
                    int y = u0a.y(glgVar2);
                    V0.close();
                    return Integer.valueOf(y);
                } finally {
                }
            case 3:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                V0 = glgVar3.V0("DELETE FROM tournament WHERE unique_tournament_id = ? AND NOT EXISTS ( SELECT events_table.uniqueTournamentId FROM events_table WHERE events_table.uniqueTournamentId = ? )");
                long j = i2;
                try {
                    V0.q(1, j);
                    V0.q(2, j);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 4:
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                V0 = glgVar4.V0("DELETE FROM pinned_tournaments_table WHERE id = ?");
                try {
                    V0.q(1, i2);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 5:
                glg glgVar5 = (glg) obj;
                glgVar5.getClass();
                V0 = glgVar5.V0("DELETE FROM my_leagues WHERE uniqueTournamentId = ?");
                try {
                    V0.q(1, i2);
                    V0.U0();
                    int y2 = u0a.y(glgVar5);
                    V0.close();
                    return Integer.valueOf(y2);
                } finally {
                }
            case 6:
                glg glgVar6 = (glg) obj;
                glgVar6.getClass();
                V0 = glgVar6.V0("UPDATE my_leagues SET notificationsEnabled = 0 WHERE uniqueTournamentId = ?");
                try {
                    V0.q(1, i2);
                    V0.U0();
                    int y3 = u0a.y(glgVar6);
                    V0.close();
                    return Integer.valueOf(y3);
                } finally {
                }
            case 7:
                glg glgVar7 = (glg) obj;
                glgVar7.getClass();
                V0 = glgVar7.V0("SELECT COUNT(*) FROM leagues WHERE id = ?");
                try {
                    V0.q(1, i2);
                    int i3 = V0.U0() ? (int) V0.getLong(0) : 0;
                    V0.close();
                    return Integer.valueOf(i3);
                } finally {
                }
            case 8:
                glg glgVar8 = (glg) obj;
                glgVar8.getClass();
                V0 = glgVar8.V0("SELECT orderIndex FROM pinned_tournaments_table WHERE id = ?");
                try {
                    V0.q(1, i2);
                    if (V0.U0() && !V0.isNull(0)) {
                        obj2 = Integer.valueOf((int) V0.getLong(0));
                    }
                    return obj2;
                } finally {
                }
            case 9:
                glg glgVar9 = (glg) obj;
                glgVar9.getClass();
                V0 = glgVar9.V0("DELETE FROM my_unique_stage WHERE id=?");
                try {
                    V0.q(1, i2);
                    V0.U0();
                    int y4 = u0a.y(glgVar9);
                    V0.close();
                    return Integer.valueOf(y4);
                } finally {
                }
            case 10:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                return Integer.valueOf(sharedPreferences.getInt("count_for_update_version_" + i2, 0));
            case 11:
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj;
                sharedPreferences2.getClass();
                return Long.valueOf(sharedPreferences2.getLong("timestamp_for_update_version_" + i2, 0L));
            case 12:
                glg glgVar10 = (glg) obj;
                glgVar10.getClass();
                V0 = glgVar10.V0("SELECT * FROM vote_table WHERE id = ?");
                try {
                    V0.q(1, i2);
                    int r = w1a.r(V0, "id");
                    int r2 = w1a.r(V0, "userChoice");
                    int r3 = w1a.r(V0, "eventTimestamp");
                    int r4 = w1a.r(V0, "success");
                    int r5 = w1a.r(V0, "voteType");
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        arrayList.add(new DbVote((int) V0.getLong(r), V0.F0(r2), V0.getLong(r3), ((int) V0.getLong(r4)) != 0, VoteTypeConverter.stringToVoteType(V0.F0(r5))));
                    }
                    return arrayList;
                } finally {
                }
            case 13:
                f4g f4gVar = (f4g) obj;
                f4gVar.getClass();
                f4gVar.w(i2);
                return Unit.a;
            default:
                oil oilVar = (oil) obj;
                gv9<rxb> gv9Var = oilVar.q;
                if (gv9Var != null) {
                    ArrayList arrayList2 = new ArrayList(k13.r(gv9Var, 10));
                    for (rxb rxbVar : gv9Var) {
                        if (rxbVar.c.getId() == i2) {
                            rxbVar = rxb.a(rxbVar, null, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                        }
                        arrayList2.add(rxbVar);
                    }
                    obj2 = l6g.W(arrayList2);
                }
                return oil.a(oilVar, null, null, null, null, null, false, null, false, false, null, null, false, null, null, null, null, obj2, null, null, null, null, null, null, null, null, 33488895);
        }
    }
}
