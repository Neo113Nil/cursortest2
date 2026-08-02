package F5;

import G5.CoralogixAndroidStackFrame;
import G5.CoralogixDartObfuscatedStackFrame;
import G5.CoralogixJsStackFrame;
import G5.d;
import I5.j;
import Zh.InterfaceC1901b;
import ei.AbstractC4212b;
import ei.C4214d;
import ei.v;
import gi.e;
import gi.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final e f3565a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC4212b f3566b;

    static {
        f fVar = new f();
        gi.b bVar = new gi.b(Reflection.getOrCreateKotlinClass(j.class), null);
        bVar.b(Reflection.getOrCreateKotlinClass(j.InitInternalContext.class), j.InitInternalContext.INSTANCE.serializer());
        bVar.a(fVar);
        gi.b bVar2 = new gi.b(Reflection.getOrCreateKotlinClass(d.class), null);
        bVar2.b(Reflection.getOrCreateKotlinClass(CoralogixAndroidStackFrame.class), CoralogixAndroidStackFrame.INSTANCE.serializer());
        bVar2.b(Reflection.getOrCreateKotlinClass(CoralogixJsStackFrame.class), CoralogixJsStackFrame.INSTANCE.serializer());
        bVar2.b(Reflection.getOrCreateKotlinClass(CoralogixDartObfuscatedStackFrame.class), CoralogixDartObfuscatedStackFrame.INSTANCE.serializer());
        bVar2.a(fVar);
        f3565a = fVar.h();
        f3566b = v.b(null, new Function1() { // from class: F5.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit c10;
                c10 = b.c((C4214d) obj);
                return c10;
            }
        }, 1, null);
    }

    public static final AbstractC4212b b() {
        return f3566b;
    }

    public static final Unit c(C4214d Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.g(f3565a);
        Json.f(true);
        Json.e(true);
        Json.c(true);
        Json.d(false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object d(JsonElement jsonElement) {
        if (jsonElement instanceof JsonNull) {
            return null;
        }
        if (jsonElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
            return jsonPrimitive.b() ? jsonPrimitive.a() : ei.j.f(jsonPrimitive) != null ? Boolean.valueOf(ei.j.e(jsonPrimitive)) : ei.j.p(jsonPrimitive) != null ? Long.valueOf(ei.j.o(jsonPrimitive)) : ei.j.i(jsonPrimitive) != null ? Double.valueOf(ei.j.h(jsonPrimitive)) : jsonPrimitive.a();
        }
        if (jsonElement instanceof JsonObject) {
            return h((JsonObject) jsonElement);
        }
        if (!(jsonElement instanceof JsonArray)) {
            throw new NoWhenBranchMatchedException();
        }
        Iterable iterable = (Iterable) jsonElement;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(d((JsonElement) it.next()));
        }
        return arrayList;
    }

    public static final JsonElement e(Map map) {
        if (map == null) {
            return JsonNull.INSTANCE;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), f(entry.getValue()));
        }
        return new JsonObject(linkedHashMap);
    }

    public static final JsonElement f(Object obj) {
        if (obj == null) {
            return JsonNull.INSTANCE;
        }
        if (obj instanceof Boolean) {
            return ei.j.a((Boolean) obj);
        }
        if (obj instanceof Number) {
            return ei.j.b((Number) obj);
        }
        if (obj instanceof String) {
            return ei.j.c((String) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                return ei.j.c(obj.toString());
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(f(it.next()));
            }
            return new JsonArray(arrayList);
        }
        Set<Map.Entry> entrySet = ((Map) obj).entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (!(key instanceof String)) {
                throw new IllegalArgumentException("Map keys must be strings for JSON objects.");
            }
            Pair pair = TuplesKt.to(key, f(value));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return new JsonObject(linkedHashMap);
    }

    public static final Map g(Object obj, InterfaceC1901b serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        return h(ei.j.l(f3566b.e(serializer, obj)));
    }

    public static final Map h(JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(jsonObject.size()));
        Iterator<T> it = jsonObject.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), d((JsonElement) entry.getValue()));
        }
        return linkedHashMap;
    }
}
