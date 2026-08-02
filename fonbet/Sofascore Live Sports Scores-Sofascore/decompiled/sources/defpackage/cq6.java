package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import com.sofascore.model.fantasy.BasicTeam;
import com.sofascore.model.fantasy.FantasyFixtureDifficultyResponse;
import com.sofascore.model.fantasy.FantasyFixtureFDRView;
import com.sofascore.model.fantasy.FantasyRound;
import com.sofascore.model.fantasy.FantasyRoundEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.odds.OddsCountryProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcq6;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class cq6 extends q8 {
    public final SharedPreferences e;
    public final wi7 f;
    public final umd g;
    public final do7 h;
    public final yzc i;
    public final lec j;
    public final fdi k;
    public final jof l;
    public final fdi m;
    public final jof n;
    public final fdi o;
    public final fdi p;
    public final fdi q;
    public g9i r;
    public OddsCountryProvider s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq6(Application application, fqg fqgVar, SharedPreferences sharedPreferences, wi7 wi7Var, umd umdVar) {
        super(application);
        fqgVar.getClass();
        sharedPreferences.getClass();
        wi7Var.getClass();
        umdVar.getClass();
        this.e = sharedPreferences;
        this.f = wi7Var;
        this.g = umdVar;
        Object a = fqgVar.a("USER_COMPETITION_EXTRA");
        rq3 rq3Var = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.h = (do7) a;
        yzc yzcVar = new yzc();
        this.i = yzcVar;
        this.j = waa.w(yzcVar);
        fdi a2 = gdi.a(null);
        this.k = a2;
        this.l = un0.u(a2);
        fdi a3 = gdi.a(null);
        this.m = a3;
        this.n = un0.u(a3);
        this.o = gdi.a(null);
        fdi a4 = gdi.a(gy6.a);
        this.p = a4;
        this.q = gdi.a(Boolean.TRUE);
        fcp.m0(new v98(a4, new ce4(this, rq3Var, 24), 3), un0.z(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[LOOP:0: B:12:0x0057->B:14:0x005d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable k(Integer num, sq3 sq3Var) {
        zp6 zp6Var;
        int i;
        Iterable<FantasyRoundEvent> iterable;
        if (sq3Var instanceof zp6) {
            zp6Var = (zp6) sq3Var;
            int i2 = zp6Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zp6Var.t = i2 - Integer.MIN_VALUE;
                Object obj = zp6Var.r;
                lu3 lu3Var = lu3.a;
                i = zp6Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    if (num == null) {
                        iterable = km5.a;
                        ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                        for (FantasyRoundEvent fantasyRoundEvent : iterable) {
                            Event event = fantasyRoundEvent.getEvent();
                            event.setRoundInfo(new Round(new Integer(fantasyRoundEvent.getSequence()), fantasyRoundEvent.getRoundName()));
                            arrayList.add(event);
                        }
                        return arrayList;
                    }
                    int intValue = num.intValue();
                    zp6Var.t = 1;
                    obj = this.f.p(intValue, zp6Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                iterable = (List) obj;
                ArrayList arrayList2 = new ArrayList(k13.r(iterable, 10));
                while (r4.hasNext()) {
                }
                return arrayList2;
            }
        }
        zp6Var = new zp6(this, sq3Var);
        Object obj2 = zp6Var.r;
        lu3 lu3Var2 = lu3.a;
        i = zp6Var.t;
        if (i != 0) {
        }
        iterable = (List) obj2;
        ArrayList arrayList22 = new ArrayList(k13.r(iterable, 10));
        while (r4.hasNext()) {
        }
        return arrayList22;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(sq3 sq3Var) {
        bq6 bq6Var;
        int i;
        FantasyFixtureDifficultyResponse fantasyFixtureDifficultyResponse;
        tx6 tx6Var;
        List list;
        String str;
        cq6 cq6Var = this;
        if (sq3Var instanceof bq6) {
            bq6Var = (bq6) sq3Var;
            int i2 = bq6Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bq6Var.t = i2 - Integer.MIN_VALUE;
                Object obj = bq6Var.r;
                lu3 lu3Var = lu3.a;
                i = bq6Var.t;
                int i3 = 3;
                if (i != 0) {
                    y6a.M(obj);
                    int i4 = cq6Var.h.c.c;
                    bq6Var.t = 1;
                    obj = cq6Var.f.o(i4, 3, bq6Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fantasyFixtureDifficultyResponse = (FantasyFixtureDifficultyResponse) obj;
                if (fantasyFixtureDifficultyResponse != null) {
                    return Unit.a;
                }
                List<FantasyRound> L0 = CollectionsKt.L0(CollectionsKt.H0(fantasyFixtureDifficultyResponse.getRounds(), new v66(i3)), 5);
                int i5 = 10;
                ArrayList arrayList = new ArrayList(k13.r(L0, 10));
                Iterator it = L0.iterator();
                while (it.hasNext()) {
                    w1l.A(arrayList, ((FantasyRound) it.next()).getSequence());
                }
                while (true) {
                    fdi fdiVar = cq6Var.k;
                    Object value = fdiVar.getValue();
                    List<BasicTeam> teams = fantasyFixtureDifficultyResponse.getTeams();
                    int c = sub.c(k13.r(teams, i5));
                    if (c < 16) {
                        c = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                    for (Object obj2 : teams) {
                        linkedHashMap.put(new Integer(((BasicTeam) obj2).getId()), obj2);
                    }
                    List<BasicTeam> H0 = CollectionsKt.H0(fantasyFixtureDifficultyResponse.getTeams(), new v66(4));
                    ArrayList arrayList2 = new ArrayList(k13.r(H0, i5));
                    for (BasicTeam basicTeam : H0) {
                        int id = basicTeam.getId();
                        String nameCode = basicTeam.getNameCode();
                        if (nameCode == null) {
                            nameCode = basicTeam.getName();
                        }
                        ho1 ho1Var = new ho1(id, nameCode);
                        ArrayList arrayList3 = new ArrayList(k13.r(arrayList, i5));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            int intValue = ((Number) it2.next()).intValue();
                            Map map = (Map) me4.f(basicTeam.getId(), fantasyFixtureDifficultyResponse.getFixtureDifficulties());
                            if (map == null || (list = (List) me4.f(intValue, map)) == null) {
                                tx6Var = new tx6(rlh.b);
                            } else {
                                List<FantasyFixtureFDRView> H02 = CollectionsKt.H0(list, new v66(5));
                                ArrayList arrayList4 = new ArrayList(k13.r(H02, 10));
                                for (FantasyFixtureFDRView fantasyFixtureFDRView : H02) {
                                    int eventId = fantasyFixtureFDRView.getEventId();
                                    int opponentTeamId = fantasyFixtureFDRView.getOpponentTeamId();
                                    hjg hjgVar = o68.b;
                                    String fixtureDifficulty = fantasyFixtureFDRView.getFixtureDifficulty();
                                    hjgVar.getClass();
                                    o68 q = hjg.q(fixtureDifficulty);
                                    kpg kpgVar = p68.b;
                                    String locationType = fantasyFixtureFDRView.getLocationType();
                                    kpgVar.getClass();
                                    p68 s = kpg.s(locationType);
                                    BasicTeam basicTeam2 = (BasicTeam) linkedHashMap.get(new Integer(fantasyFixtureFDRView.getOpponentTeamId()));
                                    if (basicTeam2 != null) {
                                        String nameCode2 = basicTeam2.getNameCode();
                                        if (nameCode2 == null) {
                                            nameCode2 = basicTeam2.getName();
                                        }
                                        str = nameCode2;
                                    } else {
                                        str = null;
                                    }
                                    arrayList4.add(new ux6(eventId, opponentTeamId, q, s, str));
                                }
                                tx6Var = new tx6(l6g.W(arrayList4));
                            }
                            arrayList3.add(tx6Var);
                        }
                        arrayList2.add(new zwi(ho1Var, l6g.W(arrayList3)));
                        i5 = 10;
                    }
                    gv9 W = l6g.W(arrayList2);
                    ArrayList arrayList5 = new ArrayList(k13.r(L0, 10));
                    for (FantasyRound fantasyRound : L0) {
                        arrayList5.add(new fo1(fantasyRound.getId(), fantasyRound.getSequence(), fantasyRound.getName(), fantasyRound.getDeadlineTimestamp()));
                    }
                    if (fdiVar.k(value, new q68(W, l6g.W(arrayList5)))) {
                        return Unit.a;
                    }
                    cq6Var = this;
                    i5 = 10;
                }
            }
        }
        bq6Var = new bq6(cq6Var, sq3Var);
        Object obj3 = bq6Var.r;
        lu3 lu3Var2 = lu3.a;
        i = bq6Var.t;
        int i32 = 3;
        if (i != 0) {
        }
        fantasyFixtureDifficultyResponse = (FantasyFixtureDifficultyResponse) obj3;
        if (fantasyFixtureDifficultyResponse != null) {
        }
    }

    public final void m() {
        g9i g9iVar = this.r;
        rq3 rq3Var = null;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        iz2 z = un0.z(this);
        hs4 hs4Var = z45.a;
        this.r = xw3.L(z, hq4.c, null, new aq6(this, rq3Var, 2), 2);
    }
}
