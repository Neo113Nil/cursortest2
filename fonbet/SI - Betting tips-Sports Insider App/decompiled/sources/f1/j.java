package f1;

import com.google.android.gms.internal.measurement.d5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.m0;
import kotlin.collections.n0;
import kotlin.collections.v;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends mf.i implements vf.a {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ e1.d f9314b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ g1.a f9315c;

    @Override // vf.a
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j jVar = new j(3, (Continuation) obj3);
        jVar.f9314b = (e1.d) obj;
        jVar.f9315c = (g1.a) obj2;
        return jVar.invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        h8.b.B(obj);
        e1.d dVar = this.f9314b;
        g1.a aVar2 = this.f9315c;
        Set keySet = aVar2.a().keySet();
        ArrayList arrayList = new ArrayList(v.k(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((g1.c) it.next()).f9707a);
        }
        Map<String, ?> all = dVar.f8467a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = dVar.f8468b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m0.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = CollectionsKt.Z((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        g1.a aVar3 = new g1.a(n0.j(aVar2.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String name = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                Intrinsics.checkNotNullParameter(name, "name");
                g1.c key3 = new g1.c(name);
                Intrinsics.checkNotNullParameter(key3, "key");
                aVar3.f(key3, value2);
            } else if (value2 instanceof Float) {
                Intrinsics.checkNotNullParameter(name, "name");
                g1.c key4 = new g1.c(name);
                Intrinsics.checkNotNullParameter(key4, "key");
                aVar3.f(key4, value2);
            } else if (value2 instanceof Integer) {
                Intrinsics.checkNotNullParameter(name, "name");
                g1.c key5 = new g1.c(name);
                Intrinsics.checkNotNullParameter(key5, "key");
                aVar3.f(key5, value2);
            } else if (value2 instanceof Long) {
                g1.c key6 = d5.C(name);
                Intrinsics.checkNotNullParameter(key6, "key");
                aVar3.f(key6, value2);
            } else if (value2 instanceof String) {
                Intrinsics.checkNotNullParameter(name, "name");
                g1.c key7 = new g1.c(name);
                Intrinsics.checkNotNullParameter(key7, "key");
                aVar3.f(key7, value2);
            } else if (value2 instanceof Set) {
                g1.c key8 = d5.W(name);
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                Intrinsics.checkNotNullParameter(key8, "key");
                aVar3.f(key8, (Set) value2);
            }
        }
        return new g1.a(n0.j(aVar3.a()), true);
    }
}
