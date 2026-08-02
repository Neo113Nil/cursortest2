package com.google.android.gms.internal.ads;

import com.ironsource.C4427z5;
import defpackage.kjo;
import defpackage.ljo;
import defpackage.mjo;
import defpackage.u0a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzgxp<K, V> implements Map<K, V>, Serializable {
    public transient zzgxw a;
    public transient zzgxw b;
    public transient zzgxi c;

    public static zzgxp a(Map map) {
        if ((map instanceof zzgxp) && !(map instanceof SortedMap)) {
            return (zzgxp) map;
        }
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        zzgxo zzgxoVar = new zzgxo(entrySet instanceof Collection ? entrySet.size() : 4);
        zzgxoVar.b(entrySet);
        return zzgxoVar.d(true);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        zzgxi zzgxiVar = this.c;
        if (zzgxiVar == null) {
            zzgxiVar = h();
            this.c = zzgxiVar;
        }
        return zzgxiVar.contains(obj);
    }

    public abstract kjo d();

    @Override // java.util.Map
    public final Set entrySet() {
        zzgxw zzgxwVar = this.a;
        if (zzgxwVar != null) {
            return zzgxwVar;
        }
        kjo d = d();
        this.a = d;
        return d;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzgyt.a(obj, this);
    }

    public abstract ljo g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public abstract mjo h();

    @Override // java.util.Map
    public final int hashCode() {
        zzgxw zzgxwVar = this.a;
        if (zzgxwVar == null) {
            zzgxwVar = d();
            this.a = zzgxwVar;
        }
        return zzgzw.c(zzgxwVar);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        zzgxw zzgxwVar = this.b;
        if (zzgxwVar != null) {
            return zzgxwVar;
        }
        ljo g = g();
        this.b = g;
        return g;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        u0a.S(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(C4427z5.U);
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        zzgxi zzgxiVar = this.c;
        if (zzgxiVar != null) {
            return zzgxiVar;
        }
        mjo h = h();
        this.c = h;
        return h;
    }
}
