package defpackage;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.playerOfTheSeason.POTSNetworkPlayer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i1e extends a7e {
    public final lue b;
    public final String c;
    public final e1e d;
    public final HashSet e;

    public i1e(lue lueVar, String str, e1e e1eVar) {
        lueVar.getClass();
        this.b = lueVar;
        this.c = str;
        this.d = e1eVar;
        this.e = new HashSet();
    }

    public static String d(POTSNetworkPlayer pOTSNetworkPlayer) {
        int id = pOTSNetworkPlayer.getPlayer().getId();
        int id2 = pOTSNetworkPlayer.getSeason().getId();
        UniqueTournament uniqueTournament = pOTSNetworkPlayer.getUniqueTournament();
        int m = yid.m(uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null);
        double rating = pOTSNetworkPlayer.getRating();
        StringBuilder s = lnb.s(id, id2, "playerId_", "_seasonId_", "_uniqueTournamentId_");
        s.append(m);
        s.append("_rating_");
        s.append(rating);
        return s.toString();
    }

    @Override // defpackage.a7e
    public final Object a(c7e c7eVar) {
        c7eVar.getClass();
        Integer num = c7eVar.b;
        if (num != null) {
            c7eVar.a(num.intValue());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.a7e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(y6e y6eVar, sq3 sq3Var) {
        h1e h1eVar;
        int i;
        int m;
        List list;
        if (sq3Var instanceof h1e) {
            h1eVar = (h1e) sq3Var;
            int i2 = h1eVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h1eVar.u = i2 - Integer.MIN_VALUE;
                Object obj = h1eVar.s;
                lu3 lu3Var = lu3.a;
                i = h1eVar.u;
                String str = this.c;
                e1e e1eVar = this.d;
                if (i != 0) {
                    y6a.M(obj);
                    m = yid.m((Integer) y6eVar.a());
                    ltb ltbVar = new ltb();
                    ltbVar.put("page", String.valueOf(m));
                    if (str != null) {
                        ltbVar.put("year", str);
                    }
                    c1e c1eVar = e1eVar.a;
                    if (c1eVar != null) {
                        ltbVar.put("nationality", c1eVar.b);
                    }
                    d1e d1eVar = e1eVar.b;
                    if (d1eVar != null) {
                        ltbVar.put("team", String.valueOf(d1eVar.a));
                    }
                    Gender gender = e1eVar.c;
                    if (gender != null) {
                        ltbVar.put(InneractiveMediationDefs.KEY_GENDER, gender.getValue());
                    }
                    String str2 = e1eVar.d;
                    if (str2 != null) {
                        ltbVar.put("position", str2);
                    }
                    TreeMap treeMap = new TreeMap(ltbVar.d());
                    h1eVar.r = m;
                    h1eVar.u = 1;
                    obj = this.b.b(treeMap, h1eVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m = h1eVar.r;
                    y6a.M(obj);
                }
                list = (List) obj;
                if (list == null) {
                    list = km5.a;
                }
                Integer num = list.isEmpty() ? null : new Integer(m + 1);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    POTSNetworkPlayer pOTSNetworkPlayer = (POTSNetworkPlayer) obj2;
                    if (this.e.add(d(pOTSNetworkPlayer))) {
                        arrayList.add(obj2);
                    } else {
                        s38 a = s38.a();
                        StringBuilder s = mz1.s("Duplicate item in paging. Item: ", d(pOTSNetworkPlayer), ", year: ", str, ", filters: ");
                        s.append(e1eVar);
                        a.c(new Throwable(s.toString()));
                    }
                }
                return new z6e(arrayList, num, Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
        }
        h1eVar = new h1e(this, sq3Var);
        Object obj3 = h1eVar.s;
        lu3 lu3Var2 = lu3.a;
        i = h1eVar.u;
        String str3 = this.c;
        e1e e1eVar2 = this.d;
        if (i != 0) {
        }
        list = (List) obj3;
        if (list == null) {
        }
        if (list.isEmpty()) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r12.hasNext()) {
        }
        return new z6e(arrayList2, num, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
