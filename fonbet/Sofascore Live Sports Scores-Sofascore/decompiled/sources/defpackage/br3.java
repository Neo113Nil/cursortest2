package defpackage;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.mbridge.msdk.foundation.download.Command;
import com.sofascore.model.crowdsourcing.TeamSide;
import com.sofascore.model.favorites.FavoritesStagesData;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.PredictedEvent;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class br3 extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br3(bs4 bs4Var, rq3 rq3Var) {
        super(3, rq3Var);
        this.r = 3;
        this.t = bs4Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        switch (this.r) {
            case 0:
                br3 br3Var = new br3(i, (rq3) obj3, 0);
                br3Var.s = (h34) obj;
                br3Var.t = (w34) obj2;
                return br3Var.invokeSuspend(Unit.a);
            case 1:
                br3 br3Var2 = new br3(i, (rq3) obj3, 1);
                br3Var2.s = (kxe) obj;
                br3Var2.t = (kxe) obj2;
                return br3Var2.invokeSuspend(Unit.a);
            case 2:
                br3 br3Var3 = new br3(i, (rq3) obj3, 2);
                br3Var3.s = (TeamSide) obj;
                br3Var3.t = (k24) obj2;
                return br3Var3.invokeSuspend(Unit.a);
            case 3:
                br3 br3Var4 = new br3((bs4) this.t, (rq3) obj3);
                br3Var4.s = (ghe) obj;
                return br3Var4.invokeSuspend(Unit.a);
            case 4:
                br3 br3Var5 = new br3(i, (rq3) obj3, 4);
                br3Var5.s = (List) obj;
                br3Var5.t = (List) obj2;
                return br3Var5.invokeSuspend(Unit.a);
            case 5:
                br3 br3Var6 = new br3(i, (rq3) obj3, 5);
                br3Var6.s = (Map) obj;
                br3Var6.t = (List) obj2;
                return br3Var6.invokeSuspend(Unit.a);
            case 6:
                br3 br3Var7 = new br3(i, (rq3) obj3, 6);
                br3Var7.s = (ys7) obj;
                br3Var7.t = (ws7) obj2;
                return br3Var7.invokeSuspend(Unit.a);
            case 7:
                br3 br3Var8 = new br3(i, (rq3) obj3, 7);
                br3Var8.s = (yaf) obj;
                br3Var8.t = (yaf) obj2;
                return br3Var8.invokeSuspend(Unit.a);
            case 8:
                br3 br3Var9 = new br3(i, (rq3) obj3, 8);
                br3Var9.s = (keh) obj;
                br3Var9.t = (p0d) obj2;
                return br3Var9.invokeSuspend(Unit.a);
            default:
                String str = ((k38) obj).a;
                br3 br3Var10 = new br3(i, (rq3) obj3, 9);
                br3Var10.s = str;
                br3Var10.t = (Map) obj2;
                return br3Var10.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Set set;
        PredictedEvent predictedEvent;
        PredictedEvent predictedEvent2;
        switch (this.r) {
            case 0:
                h34 h34Var = (h34) this.s;
                w34 w34Var = (w34) this.t;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                return new k24(h34Var, w34Var);
            case 1:
                kxe kxeVar = (kxe) this.s;
                kxe kxeVar2 = (kxe) this.t;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                return new Pair(kxeVar, kxeVar2);
            case 2:
                TeamSide teamSide = (TeamSide) this.s;
                k24 k24Var = (k24) this.t;
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                int id = k24Var.a.c.getId();
                h34 h34Var2 = k24Var.a;
                Team team = h34Var2.c;
                Team team2 = h34Var2.d;
                return new c1j(new q2h(id, team.getName(), teamSide == TeamSide.HOME), new q2h(team2.getId(), team2.getName(), teamSide == TeamSide.AWAY));
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                ghe gheVar = (ghe) this.s;
                String m8kVar = ((yj9) gheVar.a).a.toString();
                as4 as4Var = new as4();
                bs4 bs4Var = (bs4) this.t;
                yj9 yj9Var = (yj9) gheVar.a;
                t89 t89Var = yj9Var.c;
                t89 t89Var2 = as4Var.a;
                sea.j(t89Var2, t89Var);
                Map map = (Map) t89Var2.b;
                rl2 rl2Var = new rl2();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    int size = list.size();
                    ArrayList arrayList = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        arrayList.add((String) list.get(i));
                    }
                    rl2Var.put(str, arrayList);
                }
                bs4Var.a.invoke(as4Var);
                Set entrySet = rl2Var.entrySet();
                entrySet.getClass();
                Set<Map.Entry> unmodifiableSet = Collections.unmodifiableSet(entrySet);
                unmodifiableSet.getClass();
                for (Map.Entry entry2 : unmodifiableSet) {
                    String str2 = (String) entry2.getKey();
                    List list2 = (List) entry2.getValue();
                    List u = t89Var2.u(str2);
                    if (u == null) {
                        t89Var2.r(str2, list2);
                    } else if (!u.equals(list2)) {
                        List list3 = zi9.a;
                        if (!str2.equals("Cookie")) {
                            map.remove(str2);
                            t89Var2.r(str2, list2);
                            List list4 = (List) map.get(str2);
                            if (list4 == null || (set = CollectionsKt.W0(list4)) == null) {
                                set = rm5.a;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : u) {
                                if (!set.contains((String) obj2)) {
                                    arrayList2.add(obj2);
                                }
                            }
                            t89Var2.r(str2, arrayList2);
                        }
                    }
                }
                lek b = as4Var.b.b();
                o8k o8kVar = b.g;
                inb inbVar = bs4.b;
                m8k m8kVar2 = yj9Var.a;
                if (m8kVar2.d == null) {
                    m8kVar2.d = o8kVar;
                }
                if (m8kVar2.a.length() <= 0) {
                    m8k m8kVar3 = new m8k();
                    m8kVar3.d = o8kVar;
                    m8kVar3.a = b.a;
                    int i2 = b.b;
                    Integer valueOf = i2 != 0 ? Integer.valueOf(i2) : null;
                    m8kVar3.e(valueOf != null ? valueOf.intValue() : b.h.b);
                    s6a.M(m8kVar3, (String) b.i.getValue());
                    m8kVar3.e = (String) b.k.getValue();
                    m8kVar3.f = (String) b.l.getValue();
                    v8e v8eVar = new v8e(8);
                    v8eVar.j(w3a.L((String) b.j.getValue()));
                    m8kVar3.i = v8eVar;
                    m8kVar3.j = new cqa(v8eVar);
                    String str3 = (String) b.m.getValue();
                    str3.getClass();
                    m8kVar3.g = str3;
                    m8kVar3.b = b.e;
                    m8kVar3.d = m8kVar2.d;
                    int i3 = m8kVar2.c;
                    if (i3 != 0) {
                        m8kVar3.e(i3);
                    }
                    List list5 = m8kVar3.h;
                    List list6 = m8kVar2.h;
                    if (!list6.isEmpty()) {
                        if (list5.isEmpty() || ((CharSequence) CollectionsKt.Y(list6)).length() == 0) {
                            list5 = list6;
                        } else {
                            xbb xbbVar = new xbb((list6.size() + list5.size()) - 1);
                            int size2 = list5.size() - 1;
                            for (int i4 = 0; i4 < size2; i4++) {
                                xbbVar.add(list5.get(i4));
                            }
                            xbbVar.addAll(list6);
                            list5 = a.a(xbbVar);
                        }
                    }
                    m8kVar3.d(list5);
                    if (m8kVar2.g.length() > 0) {
                        String str4 = m8kVar2.g;
                        str4.getClass();
                        m8kVar3.g = str4;
                    }
                    v8e v8eVar2 = new v8e(8);
                    sea.j(v8eVar2, m8kVar3.i);
                    v8e v8eVar3 = m8kVar2.i;
                    m8kVar3.i = v8eVar3;
                    m8kVar3.j = new cqa(v8eVar3);
                    for (Map.Entry entry3 : v8eVar2.c()) {
                        String str5 = (String) entry3.getKey();
                        List list7 = (List) entry3.getValue();
                        v8e v8eVar4 = m8kVar3.i;
                        str5.getClass();
                        if (!((Map) v8eVar4.b).containsKey(str5)) {
                            m8kVar3.i.r(str5, list7);
                        }
                    }
                    t6a.L(m8kVar2, m8kVar3);
                }
                xh3 xh3Var = as4Var.c;
                for (pm0 pm0Var : CollectionsKt.S0(xh3Var.c().keySet())) {
                    xh3 xh3Var2 = yj9Var.f;
                    pm0Var.getClass();
                    if (!xh3Var2.c().containsKey(pm0Var)) {
                        yj9Var.f.e(pm0Var, xh3Var.b(pm0Var));
                    }
                }
                yj9Var.c.m();
                t89 t89Var3 = yj9Var.c;
                rl2 rl2Var2 = new rl2();
                for (Map.Entry entry4 : map.entrySet()) {
                    String str6 = (String) entry4.getKey();
                    List list8 = (List) entry4.getValue();
                    int size3 = list8.size();
                    ArrayList arrayList3 = new ArrayList(size3);
                    for (int i5 = 0; i5 < size3; i5++) {
                        arrayList3.add((String) list8.get(i5));
                    }
                    rl2Var2.put(str6, arrayList3);
                }
                q8i q8iVar = new q8i(t89Var3, 2);
                for (Map.Entry entry5 : rl2Var2.entrySet()) {
                    q8iVar.invoke((String) entry5.getKey(), (List) entry5.getValue());
                }
                bjb bjbVar = cs4.a;
                StringBuilder q = wt3.q("Applied DefaultRequest to ", m8kVar, ". New url: ");
                q.append(yj9Var.a);
                bjbVar.l(q.toString());
                return Unit.a;
            case 4:
                List list9 = (List) this.s;
                List list10 = (List) this.t;
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                return new FavoritesStagesData(list9, CollectionsKt.W0(list10));
            case 5:
                Map map2 = (Map) this.s;
                List list11 = (List) this.t;
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                return new Pair(map2, list11);
            case 6:
                ys7 ys7Var = (ys7) this.s;
                ws7 ws7Var = (ws7) this.t;
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                return new xs7(ys7Var, ws7Var);
            case 7:
                yaf yafVar = (yaf) this.s;
                yaf yafVar2 = (yaf) this.t;
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                if (yafVar2 == null) {
                    return null;
                }
                boolean z = yafVar2 instanceof xaf;
                xaf xafVar = z ? (xaf) yafVar2 : null;
                if (xafVar == null || (predictedEvent = xafVar.a) == null) {
                    xaf xafVar2 = z ? (xaf) yafVar2 : null;
                    predictedEvent = xafVar2 != null ? xafVar2.a : null;
                }
                if (predictedEvent == null) {
                    return null;
                }
                LocalDate t = fc6.t(Instant.ofEpochSecond(predictedEvent.getStartDateTimestamp()));
                if (yafVar == null) {
                    return new waf(t);
                }
                boolean z2 = yafVar instanceof xaf;
                xaf xafVar3 = z2 ? (xaf) yafVar : null;
                if (xafVar3 == null || (predictedEvent2 = xafVar3.a) == null) {
                    xaf xafVar4 = z2 ? (xaf) yafVar : null;
                    predictedEvent2 = xafVar4 != null ? xafVar4.a : null;
                }
                if (predictedEvent2 == null) {
                    return null;
                }
                LocalDate localDate = Instant.ofEpochSecond(predictedEvent2.getStartDateTimestamp()).atZone(ZoneId.systemDefault()).toLocalDate();
                localDate.getClass();
                if (localDate.equals(t)) {
                    return null;
                }
                return new waf(t);
            case 8:
                lu3 lu3Var9 = lu3.a;
                y6a.M(obj);
                keh kehVar = (keh) this.s;
                p0d p0dVar = (p0d) this.t;
                Set keySet = p0dVar.a().keySet();
                ArrayList arrayList4 = new ArrayList(k13.r(keySet, 10));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((e5f) it.next()).a);
                }
                Map<String, ?> all = kehVar.a.getAll();
                all.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ?> entry6 : all.entrySet()) {
                    String key = entry6.getKey();
                    Set set2 = kehVar.b;
                    if (set2 != null ? set2.contains(key) : true) {
                        linkedHashMap.put(entry6.getKey(), entry6.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(sub.c(linkedHashMap.size()));
                for (Map.Entry entry7 : linkedHashMap.entrySet()) {
                    Object key2 = entry7.getKey();
                    Object value = entry7.getValue();
                    if (value instanceof Set) {
                        value = CollectionsKt.W0((Iterable) value);
                    }
                    linkedHashMap2.put(key2, value);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry8 : linkedHashMap2.entrySet()) {
                    if (!arrayList4.contains((String) entry8.getKey())) {
                        linkedHashMap3.put(entry8.getKey(), entry8.getValue());
                    }
                }
                p0d g = p0dVar.g();
                for (Map.Entry entry9 : linkedHashMap3.entrySet()) {
                    String str7 = (String) entry9.getKey();
                    Object value2 = entry9.getValue();
                    if (value2 instanceof Boolean) {
                        str7.getClass();
                        g.f(new e5f(str7), value2);
                    } else if (value2 instanceof Float) {
                        str7.getClass();
                        g.f(new e5f(str7), value2);
                    } else if (value2 instanceof Integer) {
                        str7.getClass();
                        g.f(new e5f(str7), value2);
                    } else if (value2 instanceof Long) {
                        str7.getClass();
                        g.f(new e5f(str7), value2);
                    } else if (value2 instanceof String) {
                        g.f(f6a.J(str7), value2);
                    } else if (value2 instanceof Set) {
                        str7.getClass();
                        g.f(new e5f(str7), (Set) value2);
                    }
                }
                return g.h();
            default:
                lu3 lu3Var10 = lu3.a;
                y6a.M(obj);
                String str8 = (String) this.s;
                Map map3 = (Map) this.t;
                ztj.b.getClass();
                str8.getClass();
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str8).openConnection());
                uRLConnection.getClass();
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                httpURLConnection.setConnectTimeout(60000);
                iie iieVar = iie.a;
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, iie.b());
                for (Map.Entry entry10 : map3.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry10.getKey(), (String) entry10.getValue());
                }
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    httpURLConnection.disconnect();
                    return new Integer(responseCode);
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br3(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.r = i2;
    }
}
