package io.sentry.android.replay;

import io.sentry.C7141f;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends LinkedHashMap<C7141f, io.sentry.util.network.a> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof C7141f) {
            return super.containsKey((C7141f) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof io.sentry.util.network.a) {
            return super.containsValue((io.sentry.util.network.a) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof C7141f) {
            return (io.sentry.util.network.a) super.get((C7141f) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof C7141f) ? obj2 : (io.sentry.util.network.a) super.getOrDefault((C7141f) obj, (io.sentry.util.network.a) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof C7141f) {
            return (io.sentry.util.network.a) super.remove((C7141f) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry<C7141f, io.sentry.util.network.a> entry) {
        return super.size() > 32;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof C7141f) && (obj2 instanceof io.sentry.util.network.a)) {
            return super.remove((C7141f) obj, (io.sentry.util.network.a) obj2);
        }
        return false;
    }
}
