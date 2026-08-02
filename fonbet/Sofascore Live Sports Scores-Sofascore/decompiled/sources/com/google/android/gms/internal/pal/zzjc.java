package com.google.android.gms.internal.pal;

import com.ironsource.C4427z5;
import defpackage.a70;
import defpackage.ljg;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzjc implements Map, Serializable {
    public transient zzjd a;
    public transient zzjd b;
    public transient zziw c;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return d() != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        zziw zziwVar = this.c;
        if (zziwVar == null) {
            zziwVar = g();
            this.c = zziwVar;
        }
        return zziwVar.contains(obj);
    }

    public abstract Object d();

    @Override // java.util.Map
    public final Set entrySet() {
        zzjd zzjdVar = this.a;
        if (zzjdVar != null) {
            return zzjdVar;
        }
        zzjd h = h();
        this.a = h;
        return h;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public abstract zziw g();

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object d = d();
        return d != null ? d : obj2;
    }

    public abstract zzjd h();

    @Override // java.util.Map
    public final int hashCode() {
        zzjd zzjdVar = this.a;
        if (zzjdVar == null) {
            zzjdVar = h();
            this.a = zzjdVar;
        }
        Iterator it = zzjdVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public abstract zzjd i();

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        zzjd zzjdVar = this.b;
        if (zzjdVar != null) {
            return zzjdVar;
        }
        zzjd i = i();
        this.b = i;
        return i;
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
        if (size < 0) {
            a70.p(ljg.j(size, "size cannot be negative but was: "));
            return null;
        }
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
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
        zziw zziwVar = this.c;
        if (zziwVar != null) {
            return zziwVar;
        }
        zziw g = g();
        this.c = g;
        return g;
    }
}
