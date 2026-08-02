package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.results.league.service.LeagueWorker;
import com.sofascore.results.player.PlayerWorker;
import com.sofascore.results.service.StageWorker;
import com.sofascore.results.team.TeamWorker;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bt7 {
    public final qa6 a;
    public final s96 b;
    public final wve c;
    public final SharedPreferences d;

    public bt7(qa6 qa6Var, s96 s96Var, wve wveVar, SharedPreferences sharedPreferences, udl udlVar) {
        qa6Var.getClass();
        s96Var.getClass();
        wveVar.getClass();
        sharedPreferences.getClass();
        udlVar.getClass();
        this.a = qa6Var;
        this.b = s96Var;
        this.c = wveVar;
        this.d = sharedPreferences;
    }

    public final z88 a(Integer num, Integer num2, List list) {
        z88 wf2Var;
        qa6 qa6Var = this.a;
        qa6Var.getClass();
        int i = 6;
        rq3 rq3Var = null;
        if (num == null && num2 == null && list == null) {
            return new wf2(rq3Var, i);
        }
        v76 v76Var = qa6Var.a;
        v76Var.getClass();
        z88 g = num2 != null ? v76Var.g(Integer.valueOf(num2.intValue())) : new wf2(km5.a, i);
        z88 s = num != null ? zm2.s(v76Var.a, false, new String[]{"events_table"}, new l76(0, Integer.valueOf(num.intValue()))) : new wf2(km5.a, i);
        if (list != null) {
            StringBuilder q = fc6.q("SELECT * FROM my_teams WHERE teamId IN (");
            pea.m(list.size(), q);
            q.append(")");
            wf2Var = zm2.s(v76Var.a, false, new String[]{"my_teams"}, new g76(q.toString(), list, 3));
        } else {
            wf2Var = new wf2(km5.a, i);
        }
        return dy0.r(g, s, wf2Var, new y66(4, rq3Var, 1));
    }

    public final z88 b(Integer num) {
        if (num == null) {
            return new wf2(new FavoritesEventsData(null, null, null, 7, null), 6);
        }
        v76 v76Var = this.a.a;
        v76Var.getClass();
        return hkg.H(new a76(v76Var.g(num), 0));
    }

    public final o63 c(String str) {
        str.getClass();
        List a = l5i.a();
        qa6 qa6Var = this.a;
        qa6Var.getClass();
        a.getClass();
        v76 v76Var = qa6Var.a;
        Calendar calendar = Calendar.getInstance();
        int i = 0;
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(5, -7);
        o76 o76Var = new o76(calendar.getTimeInMillis() / 1000, v76Var, i);
        int i2 = 1;
        z88 H = hkg.H(zm2.s(v76Var.a, true, new String[]{"teams", "tournament", "events_score", "events_table"}, o76Var));
        int i3 = 3;
        rq3 rq3Var = null;
        t98 t98Var = new t98(H, new y96(i3, rq3Var, i), i2);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        calendar2.add(5, -7);
        long timeInMillis = calendar2.getTimeInMillis() / 1000;
        StringBuilder q = fc6.q("SELECT * FROM my_stage_table WHERE startDateTimestamp >= ? AND type in (");
        pea.m(a.size(), q);
        q.append(") AND isHidden = 0 ORDER BY startDateTimestamp ASC");
        return new o63(4, new yf4(t98Var, new t98(hkg.H(zm2.s(v76Var.a, true, new String[]{"my_stage_table"}, new n76(q.toString(), timeInMillis, a, v76Var, 0))), new y96(i3, rq3Var, i2), i2), new q41(qa6Var, rq3Var, 2), i2), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        if (r0 != r9) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0054, code lost:
    
        if (r0 == r9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(sq3 sq3Var) {
        at7 at7Var;
        int i;
        List list;
        asf asfVar;
        AtomicReference atomicReference;
        if (sq3Var instanceof at7) {
            at7Var = (at7) sq3Var;
            int i2 = at7Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                at7Var.w = i2 - Integer.MIN_VALUE;
                at7 at7Var2 = at7Var;
                Object obj = at7Var2.u;
                Object obj2 = lu3.a;
                i = at7Var2.w;
                qa6 qa6Var = this.a;
                if (i != 0) {
                    y6a.M(obj);
                    at7Var2.w = 1;
                    obj = qa6Var.e(at7Var2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            asfVar = at7Var2.t;
                            atomicReference = at7Var2.s;
                            y6a.M(obj);
                            if (((Boolean) atomicReference.get()).booleanValue()) {
                                return Boolean.FALSE;
                            }
                            ad2 ad2Var = qv5.a;
                            qv5.a(a52.a);
                            if (asfVar.a) {
                                return Boolean.FALSE;
                            }
                            return null;
                        }
                        list = at7Var2.r;
                        y6a.M(obj);
                        AtomicReference atomicReference2 = new AtomicReference(Boolean.TRUE);
                        asf asfVar2 = new asf();
                        jk jkVar = new jk(list, obj, (Object) this, (Serializable) asfVar2, (Serializable) atomicReference2, (rq3) null, 14);
                        at7Var2.r = null;
                        at7Var2.s = atomicReference2;
                        at7Var2.t = asfVar2;
                        at7Var2.w = 3;
                        if (s9a.r(jkVar, at7Var2) != obj2) {
                            asfVar = asfVar2;
                            atomicReference = atomicReference2;
                            if (((Boolean) atomicReference.get()).booleanValue()) {
                            }
                        }
                        return obj2;
                    }
                    y6a.M(obj);
                }
                list = (List) obj;
                at7Var2.r = list;
                at7Var2.w = 2;
                qa6Var.getClass();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                v76 v76Var = qa6Var.a;
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.add(5, -7);
                obj = gz8.U(at7Var2, v76Var.a, true, false, new k76(calendar.getTimeInMillis() / 1000, currentTimeMillis, 1));
            }
        }
        at7Var = new at7(this, sq3Var);
        at7 at7Var22 = at7Var;
        Object obj3 = at7Var22.u;
        Object obj22 = lu3.a;
        i = at7Var22.w;
        qa6 qa6Var2 = this.a;
        if (i != 0) {
        }
        list = (List) obj3;
        at7Var22.r = list;
        at7Var22.w = 2;
        qa6Var2.getClass();
        long currentTimeMillis2 = System.currentTimeMillis() / 1000;
        v76 v76Var2 = qa6Var2.a;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        calendar2.add(5, -7);
        obj3 = gz8.U(at7Var22, v76Var2.a, true, false, new k76(calendar2.getTimeInMillis() / 1000, currentTimeMillis2, 1));
    }

    public final void e(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = this.d;
        long j = sharedPreferences.getLong("UPDATE_TEAMS_AND_LEAGUES_TIMESTAMP", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (!waa.D(context) || Math.abs(currentTimeMillis - j) <= 21600000) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.putLong("UPDATE_TEAMS_AND_LEAGUES_TIMESTAMP", currentTimeMillis);
        edit.apply();
        Pair[] pairArr = {new Pair("ACTION", "REFRESH_TEAMS")};
        hpo hpoVar = new hpo(18);
        Pair pair = pairArr[0];
        hpoVar.B(pair.b, (String) pair.a);
        md4 l = hpoVar.l();
        ktd g = vxd.g(TeamWorker.class, l);
        xbl h = vxd.h(context);
        String concat = "TeamWorker-".concat(mha.o(l));
        nf6 nf6Var = nf6.a;
        h.b(concat, nf6Var, (ltd) g.a());
        Pair[] pairArr2 = {new Pair("ACTION", "REFRESH_LEAGUES")};
        hpo hpoVar2 = new hpo(18);
        Pair pair2 = pairArr2[0];
        hpoVar2.B(pair2.b, (String) pair2.a);
        md4 l2 = hpoVar2.l();
        vxd.h(context).b("LeagueWorker-".concat(mha.o(l2)), nf6Var, (ltd) vxd.g(LeagueWorker.class, l2).a());
        Pair[] pairArr3 = {new Pair("ACTION", "REFRESH_PLAYERS")};
        hpo hpoVar3 = new hpo(18);
        Pair pair3 = pairArr3[0];
        hpoVar3.B(pair3.b, (String) pair3.a);
        md4 l3 = hpoVar3.l();
        vxd.h(context).b("PlayerWorker-".concat(mha.o(l3)), nf6Var, (ltd) vxd.g(PlayerWorker.class, l3).a());
        Pair[] pairArr4 = {new Pair("ACTION", "REFRESH_UNIQUE_STAGES")};
        hpo hpoVar4 = new hpo(18);
        Pair pair4 = pairArr4[0];
        hpoVar4.B(pair4.b, (String) pair4.a);
        md4 l4 = hpoVar4.l();
        vxd.h(context).b("StageWorker-".concat(mha.o(l4)), nf6Var, (ltd) vxd.g(StageWorker.class, l4).a());
    }
}
