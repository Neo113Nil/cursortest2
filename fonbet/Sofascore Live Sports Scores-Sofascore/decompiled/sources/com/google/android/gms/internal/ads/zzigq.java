package com.google.android.gms.internal.ads;

import defpackage.a70;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzigq extends LinkedHashMap {
    public static final zzigq b;
    public boolean a = true;

    static {
        zzigq zzigqVar = new zzigq();
        b = zzigqVar;
        zzigqVar.a = false;
    }

    private zzigq() {
    }

    public static int h(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof zzifq)) {
                return obj.hashCode();
            }
            a70.i();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int b2 = zzifz.b(length, 0, length, bArr);
        if (b2 == 0) {
            return 1;
        }
        return b2;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final zzigq g() {
        if (isEmpty()) {
            return new zzigq();
        }
        zzigq zzigqVar = new zzigq(this);
        zzigqVar.a = true;
        return zzigqVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += h(entry.getValue()) ^ h(entry.getKey());
        }
        return i;
    }

    public final void i() {
        if (this.a) {
            return;
        }
        a70.i();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        i();
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        i();
        for (Object obj : map.keySet()) {
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        return super.remove(obj);
    }
}
