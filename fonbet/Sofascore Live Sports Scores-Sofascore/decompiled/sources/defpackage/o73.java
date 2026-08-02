package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.TeamAverageRatingVersion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o73 {
    public final Context a;
    public final Map b;
    public final ArrayList c;

    public o73(Context context, Map map) {
        context.getClass();
        map.getClass();
        this.a = context;
        this.b = map;
        this.c = new ArrayList();
    }

    public final void a(r9k r9kVar, Function2 function2, Function1 function1, i83 i83Var) {
        Set set;
        Map map = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(sub.c(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            c73 c73Var = (c73) entry.getValue();
            linkedHashMap.put(key, c73Var.a != null ? (String) function2.invoke(c73Var, this.a) : null);
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((String) ((Map.Entry) it.next()).getValue()) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    String str = (String) ((Map.Entry) it2.next()).getValue();
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                if (CollectionsKt.W0(arrayList).size() <= 1 || function1 == null) {
                    set = rm5.a;
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(sub.c(map.size()));
                    for (Map.Entry entry2 : map.entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), (Number) function1.invoke((c73) entry2.getValue()));
                    }
                    set = l98.g0(linkedHashMap2);
                }
                this.c.add(new b83(r9kVar, l6g.X(linkedHashMap), set, i83Var));
                return;
            }
        }
    }

    public final void b(q9k q9kVar) {
        this.c.add(new e83(q9kVar));
    }

    public final void c(gvh gvhVar, String str, Function1 function1, Function1 function12) {
        boolean z;
        str.getClass();
        Map map = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(sub.c(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), (Double) function12.invoke((c73) entry.getValue()));
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((Double) ((Map.Entry) it.next()).getValue()) != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : map.entrySet()) {
                    if (linkedHashMap.get((e93) entry2.getKey()) != null) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                Collection values = linkedHashMap2.values();
                ArrayList arrayList = new ArrayList(k13.r(values, 10));
                Iterator it2 = values.iterator();
                while (it2.hasNext()) {
                    TeamAverageRatingVersion teamAverageRatingVersion = (TeamAverageRatingVersion) function1.invoke((c73) it2.next());
                    if (teamAverageRatingVersion == null) {
                        teamAverageRatingVersion = TeamAverageRatingVersion.ORIGINAL;
                    }
                    arrayList.add(teamAverageRatingVersion);
                }
                tee X = l6g.X(linkedHashMap);
                boolean z2 = CollectionsKt.S0(CollectionsKt.V0(arrayList)).size() > 1;
                if (!map.isEmpty()) {
                    Iterator it3 = map.entrySet().iterator();
                    while (it3.hasNext()) {
                        Season season = ((c73) ((Map.Entry) it3.next()).getValue()).b;
                        if (Intrinsics.c(season != null ? Boolean.valueOf(season.isAllTimeSeason()) : null, Boolean.TRUE)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                this.c.add(new h83(X, gvhVar, str, z2, z));
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [k83] */
    public final void d(Function1 function1) {
        Map map = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(sub.c(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Team team = (Team) function1.invoke((c73) entry.getValue());
            if (team != null) {
                Context context = this.a;
                String w = v8a.w(context, team);
                String x = v8a.x(context, team);
                int id = team.getId();
                r4 = StringsKt.R(x) ? null : x;
                if (r4 == null) {
                    r4 = w;
                }
                r4 = new k83(id, w, r4);
            }
            linkedHashMap.put(key, r4);
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((k83) ((Map.Entry) it.next()).getValue()) != null) {
                this.c.add(new j83(l6g.X(linkedHashMap)));
                return;
            }
        }
    }
}
