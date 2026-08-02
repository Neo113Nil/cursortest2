package K0;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f6216a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f6217b;

    public c(SharedPreferences prefs, Set set) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.f6216a = prefs;
        this.f6217b = set;
    }

    public final String a(String str) {
        Set set = this.f6217b;
        if (set == null || set.contains(str)) {
            return str;
        }
        throw new IllegalStateException(("Can't access key outside migration: " + str).toString());
    }

    public final Map b() {
        Map<String, ?> all = this.f6216a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set set = this.f6217b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = CollectionsKt.toSet((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final long c(String key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f6216a.getLong(a(key), j10);
    }

    public final String d(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f6216a.getString(a(key), str);
    }

    public final Set e(String key, Set set) {
        Intrinsics.checkNotNullParameter(key, "key");
        Set<String> stringSet = this.f6216a.getStringSet(a(key), set);
        if (stringSet != null) {
            return CollectionsKt.toMutableSet(stringSet);
        }
        return null;
    }
}
