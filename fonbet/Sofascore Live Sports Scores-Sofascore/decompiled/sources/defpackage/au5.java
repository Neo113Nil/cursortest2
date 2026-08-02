package defpackage;

import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.media.F1;
import com.sofascore.model.mvvm.model.DbMyTeam;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.StageIds;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncident;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class au5 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ au5(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer intOrNull;
        Integer intOrNull2;
        nlg V0;
        Boolean bool;
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                i22 i22Var = (i22) obj;
                i22Var.getClass();
                return Double.valueOf(-((y12) CollectionsKt.Y(i22Var.u)).j);
            case 3:
                i22 i22Var2 = (i22) obj;
                i22Var2.getClass();
                return i22Var2.n.getShortName();
            case 4:
                k64 k64Var = (k64) obj;
                k64Var.getClass();
                return duf.a.getOrCreateKotlinClass(k64Var.getClass());
            case 5:
                vnb vnbVar = (vnb) obj;
                vnbVar.getClass();
                ww5 ww5Var = (ww5) vnbVar.a();
                return Boolean.valueOf(Intrinsics.c(ww5Var != null ? Boolean.valueOf(ww5Var.b) : null, Boolean.TRUE));
            case 6:
                j9b j9bVar = (j9b) obj;
                j9bVar.getClass();
                return yfa.n(j9bVar);
            case 7:
                vnb vnbVar2 = (vnb) obj;
                vnbVar2.getClass();
                f06 f06Var = (f06) vnbVar2.a();
                return Boolean.valueOf(Intrinsics.c(f06Var != null ? Boolean.valueOf(f06Var.h) : null, Boolean.TRUE));
            case 8:
                f06 f06Var2 = (f06) obj;
                f06Var2.getClass();
                return f06.a(f06Var2, null, null, null, null, null, null, null, false, 191);
            case 9:
                return Boolean.valueOf(((HockeyIncident) obj).getPeriodName() != null);
            case 10:
                vnb vnbVar3 = (vnb) obj;
                vnbVar3.getClass();
                m46 m46Var = (m46) vnbVar3.a();
                return Boolean.valueOf(Intrinsics.c(m46Var != null ? Boolean.valueOf(m46Var.c) : null, Boolean.TRUE));
            case 11:
                Player player = (Player) obj;
                player.getClass();
                String jerseyNumber = player.getJerseyNumber();
                if (jerseyNumber == null || (intOrNull = StringsKt.toIntOrNull(jerseyNumber)) == null) {
                    return Integer.MAX_VALUE;
                }
                return intOrNull;
            case 12:
                Player player2 = (Player) obj;
                player2.getClass();
                return tba.t(player2);
            case 13:
                Player player3 = (Player) obj;
                player3.getClass();
                String jerseyNumber2 = player3.getJerseyNumber();
                if (jerseyNumber2 == null || (intOrNull2 = StringsKt.toIntOrNull(jerseyNumber2)) == null) {
                    return Integer.MAX_VALUE;
                }
                return intOrNull2;
            case 14:
                Player player4 = (Player) obj;
                player4.getClass();
                return tba.t(player4);
            case 15:
                dqf dqfVar = (dqf) obj;
                dqfVar.getClass();
                return Integer.valueOf(dqfVar.a);
            case 16:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                V0 = glgVar.V0("DELETE FROM teams WHERE NOT EXISTS (SELECT 1 FROM events_table WHERE events_table.homeTeamId = teams.id OR events_table.awayTeamId = teams.id) AND NOT EXISTS (SELECT 1 FROM my_teams WHERE my_teams.teamId = teams.id)");
                try {
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 17:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                V0 = glgVar2.V0("DELETE FROM tournament WHERE NOT EXISTS (SELECT 1 FROM events_table WHERE events_table.tournamentId = tournament.id)");
                try {
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 18:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                V0 = glgVar3.V0("SELECT id, parent_event_id, stage_season_unique_stage_id, isMuted FROM my_stage_table");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        int i = (int) V0.getLong(0);
                        Integer valueOf = V0.isNull(1) ? null : Integer.valueOf((int) V0.getLong(1));
                        Integer valueOf2 = V0.isNull(2) ? null : Integer.valueOf((int) V0.getLong(2));
                        Integer valueOf3 = V0.isNull(3) ? null : Integer.valueOf((int) V0.getLong(3));
                        if (valueOf3 != null) {
                            bool = Boolean.valueOf(valueOf3.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        arrayList.add(new StageIds(i, valueOf, valueOf2, bool));
                    }
                    return arrayList;
                } catch (Throwable th) {
                    throw th;
                }
            case 19:
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                V0 = glgVar4.V0("SELECT * FROM my_teams");
                try {
                    int r = w1a.r(V0, "teamId");
                    int r2 = w1a.r(V0, "notificationsEnabled");
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.U0()) {
                        arrayList2.add(new DbMyTeam((int) V0.getLong(r), ((int) V0.getLong(r2)) != 0));
                    }
                    return arrayList2;
                } finally {
                }
            case 20:
                glg glgVar5 = (glg) obj;
                glgVar5.getClass();
                V0 = glgVar5.V0("SELECT id FROM my_unique_stage");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (V0.U0()) {
                        arrayList3.add(Integer.valueOf((int) V0.getLong(0)));
                    }
                    return arrayList3;
                } finally {
                }
            case 21:
                glg glgVar6 = (glg) obj;
                glgVar6.getClass();
                V0 = glgVar6.V0("DELETE FROM events_table WHERE NOT EXISTS (SELECT 1 FROM tournament WHERE tournament.id = events_table.tournamentId) OR NOT EXISTS (SELECT 1 FROM teams WHERE teams.id = events_table.homeTeamId) OR NOT EXISTS (SELECT 1 FROM teams WHERE teams.id = events_table.awayTeamId) OR NOT EXISTS (SELECT 1 FROM events_score WHERE events_score.eventId = events_table.id)");
                try {
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 22:
                ((ha5) obj).getClass();
                return Unit.a;
            case 23:
                ((ha5) obj).getClass();
                return Unit.a;
            case 24:
                ((ha5) obj).getClass();
                return Unit.a;
            case 25:
                ((ha5) obj).getClass();
                return Unit.a;
            case 26:
                ((ha5) obj).getClass();
                return Unit.a;
            case 27:
                return ((EventResponse) ((v2g) obj).a).getEvent();
            case 28:
                return F1.a((AppSetIdInfo) obj);
            default:
                ((kpa) obj).getClass();
                return new o39(waa.b(kpa.c));
        }
    }
}
