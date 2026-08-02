package com.squareup.wire.internal;

import com.ironsource.X3;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.brm0;
import xsna.c5g;
import xsna.dcy;
import xsna.drm0;
import xsna.epx;
import xsna.fpf0;
import xsna.i9x;
import xsna.j5g;
import xsna.jgp;
import xsna.on00;
import xsna.ozl;
import xsna.so;
import xsna.swe0;
import xsna.t33;
import xsna.tgw;
import xsna.y57;

/* compiled from: Internal.kt */
/* loaded from: classes14.dex */
final /* synthetic */ class Internal__InternalKt {
    private static final String ESCAPED_CHARS = ",[]{}\\";

    /* renamed from: -redactElements, reason: not valid java name */
    public static final <T> List<T> m40redactElements(List<? extends T> list, ProtoAdapter<T> protoAdapter) {
        List<? extends T> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(protoAdapter.redact(it.next()));
        }
        return arrayList;
    }

    public static final String boxedOneOfClassName(String str) {
        return brm0.o(str);
    }

    public static final String boxedOneOfKeyFieldName(String str, String str2) {
        return (str + '_' + str2).toUpperCase();
    }

    public static final String boxedOneOfKeysFieldName(String str) {
        return epx.j("_keys", str).toUpperCase();
    }

    public static final void checkElementsNotNull(List<?> list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (list.get(i) == null) {
                throw new NullPointerException(tgw.b(i, "Element at index ", " is null"));
            }
            i = i2;
        }
    }

    @ozl
    public static final <T> List<T> copyOf(String str, List<? extends T> list) {
        return Internal.copyOf(list);
    }

    public static final int countNonNull(Object obj, Object obj2) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0);
    }

    public static final boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private static final dcy<? extends Object> getTypeName$Internal__InternalKt(Object obj) {
        return fpf0.a(obj.getClass());
    }

    public static final <T> List<T> immutableCopyOf(String str, List<? extends T> list) {
        if (list instanceof MutableOnWriteList) {
            list = (List<T>) ((MutableOnWriteList) list).getMutableList$wire_runtime();
        }
        if (list == EmptyList.b || (list instanceof ImmutableList)) {
            return (List<T>) list;
        }
        ImmutableList immutableList = new ImmutableList(list);
        if (immutableList.contains(null)) {
            throw new IllegalArgumentException(epx.j(".contains(null)", str).toString());
        }
        return immutableList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> immutableCopyOfMapWithStructValues(String str, Map<K, ? extends V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null) {
                throw new IllegalArgumentException(epx.j(".containsKey(null)", str).toString());
            }
            linkedHashMap.put(key, Internal.immutableCopyOfStruct(str, value));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public static final <T> T immutableCopyOfStruct(String str, T t) {
        if (t == null) {
            return t;
        }
        if (t instanceof Boolean) {
            return t;
        }
        if (t instanceof Double) {
            return t;
        }
        if (t instanceof String) {
            return t;
        }
        if (t instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) t).iterator();
            while (it.hasNext()) {
                arrayList.add(Internal.immutableCopyOfStruct(str, it.next()));
            }
            return (T) Collections.unmodifiableList(arrayList);
        }
        if (!(t instanceof Map)) {
            StringBuilder a = t33.a("struct value ", str, " must be a JSON type (null, Boolean, Double, String, List, or Map) but was ");
            a.append(getTypeName$Internal__InternalKt(t));
            a.append(": ");
            a.append(t);
            throw new IllegalArgumentException(a.toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) t).entrySet()) {
            linkedHashMap.put(Internal.immutableCopyOfStruct(str, entry.getKey()), Internal.immutableCopyOfStruct(str, entry.getValue()));
        }
        return (T) Collections.unmodifiableMap(linkedHashMap);
    }

    public static final IllegalStateException missingRequiredFields(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        i9x p = swe0.p(2, swe0.q(0, objArr.length));
        int i = p.b;
        int i2 = p.c;
        int i3 = p.d;
        String str = "";
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                int i4 = i + i3;
                if (objArr[i] == null) {
                    if (sb.length() > 0) {
                        str = UcumUtils.UCUM_SECONDS;
                    }
                    sb.append("\n  ");
                    sb.append(objArr[i + 1]);
                }
                if (i == i2) {
                    break;
                }
                i = i4;
            }
        }
        throw new IllegalStateException(y57.a("Required field", str, " not set:", sb.toString()));
    }

    public static final <T> List<T> newMutableList() {
        return new MutableOnWriteList(EmptyList.b);
    }

    public static final <K, V> Map<K, V> newMutableMap() {
        return new LinkedHashMap();
    }

    public static final String sanitize(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            i++;
            if (drm0.E(ESCAPED_CHARS, charAt)) {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    @ozl
    public static final <K, V> Map<K, V> copyOf(String str, Map<K, ? extends V> map) {
        return Internal.copyOf(map);
    }

    public static final int countNonNull(Object obj, Object obj2, Object obj3) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0) + (obj3 != null ? 1 : 0);
    }

    public static final <K, V> Map<K, V> copyOf(Map<K, ? extends V> map) {
        return new LinkedHashMap(map);
    }

    public static final int countNonNull(Object obj, Object obj2, Object obj3, Object obj4, Object... objArr) {
        int i = 0;
        int i2 = obj != null ? 1 : 0;
        if (obj2 != null) {
            i2++;
        }
        if (obj3 != null) {
            i2++;
        }
        if (obj4 != null) {
            i2++;
        }
        int length = objArr.length;
        while (i < length) {
            Object obj5 = objArr[i];
            i++;
            if (obj5 != null) {
                i2++;
            }
        }
        return i2;
    }

    public static final <T> List<T> copyOf(List<? extends T> list) {
        if (list != EmptyList.b && !(list instanceof ImmutableList)) {
            return new ArrayList(list);
        }
        return new MutableOnWriteList(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: -redactElements, reason: not valid java name */
    public static final <K, V> Map<K, V> m41redactElements(Map<K, ? extends V> map, ProtoAdapter<V> protoAdapter) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), protoAdapter.redact(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final String sanitize(List<String> list) {
        return j5g.g0(list, null, X3.j.d, X3.j.e, 0, Internal__InternalKt$sanitize$2.INSTANCE, 25);
    }

    public static final <K, V> Map<K, V> immutableCopyOf(String str, Map<K, ? extends V> map) {
        if (map.isEmpty()) {
            return jgp.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (!linkedHashMap.keySet().contains(null)) {
            if (!linkedHashMap.values().contains(null)) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            throw new IllegalArgumentException(epx.j(".containsValue(null)", str).toString());
        }
        throw new IllegalArgumentException(epx.j(".containsKey(null)", str).toString());
    }

    public static final void checkElementsNotNull(Map<?, ?> map) {
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null) {
                throw new NullPointerException("map.containsKey(null)");
            }
            if (value == null) {
                throw new NullPointerException(so.a(key, "Value for key ", " is null"));
            }
        }
    }
}
