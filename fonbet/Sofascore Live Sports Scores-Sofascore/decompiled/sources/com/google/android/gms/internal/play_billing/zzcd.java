package com.google.android.gms.internal.play_billing;

import com.ironsource.C4427z5;
import defpackage.a70;
import defpackage.aun;
import defpackage.hun;
import defpackage.ljg;
import defpackage.qtn;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzcd implements Map, Serializable {
    public transient zzcf a;
    public transient zzcf b;
    public transient zzbx c;

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
        zzbx zzbxVar = this.c;
        if (zzbxVar == null) {
            zzbxVar = d();
            this.c = zzbxVar;
        }
        return zzbxVar.contains(obj);
    }

    public abstract hun d();

    @Override // java.util.Map
    public final Set entrySet() {
        zzcf zzcfVar = this.a;
        if (zzcfVar != null) {
            return zzcfVar;
        }
        qtn g = g();
        this.a = g;
        return g;
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

    public abstract qtn g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public abstract aun h();

    @Override // java.util.Map
    public final int hashCode() {
        zzcf zzcfVar = this.a;
        if (zzcfVar == null) {
            zzcfVar = g();
            this.a = zzcfVar;
        }
        Iterator it = zzcfVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzcf zzcfVar = this.b;
        if (zzcfVar != null) {
            return zzcfVar;
        }
        aun h = h();
        this.b = h;
        return h;
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
        zzbx zzbxVar = this.c;
        if (zzbxVar != null) {
            return zzbxVar;
        }
        hun d = d();
        this.c = d;
        return d;
    }
}
