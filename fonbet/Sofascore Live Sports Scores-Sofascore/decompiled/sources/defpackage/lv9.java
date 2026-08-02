package defpackage;

import com.ironsource.C4427z5;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class lv9 implements Map, Serializable {
    public transient xvf a;
    public transient yvf b;
    public transient zvf c;

    public static b10 d() {
        return new b10(4);
    }

    public static b10 e(int i) {
        yqo.w(i, "expectedSize");
        return new b10(i);
    }

    public static lv9 f(Map map) {
        if ((map instanceof lv9) && !(map instanceof SortedMap)) {
            return (lv9) map;
        }
        Set entrySet = map.entrySet();
        b10 b10Var = new b10(entrySet instanceof Collection ? entrySet.size() : 4);
        b10Var.B(entrySet);
        return b10Var.c(true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
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
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return aik.H(obj, this);
    }

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final vv9 entrySet() {
        xvf xvfVar = this.a;
        if (xvfVar != null) {
            return xvfVar;
        }
        awf awfVar = (awf) this;
        xvf xvfVar2 = new xvf(awfVar, awfVar.e, awfVar.f);
        this.a = xvfVar2;
        return xvfVar2;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final vv9 keySet() {
        yvf yvfVar = this.b;
        if (yvfVar != null) {
            return yvfVar;
        }
        awf awfVar = (awf) this;
        yvf yvfVar2 = new yvf(awfVar, new zvf(0, awfVar.f, awfVar.e));
        this.b = yvfVar2;
        return yvfVar2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return w1a.s(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final wu9 values() {
        zvf zvfVar = this.c;
        if (zvfVar != null) {
            return zvfVar;
        }
        awf awfVar = (awf) this;
        zvf zvfVar2 = new zvf(1, awfVar.f, awfVar.e);
        this.c = zvfVar2;
        return zvfVar2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((awf) this).size() == 0;
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
        int i = ((awf) this).f;
        yqo.w(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        cck it = ((xvf) entrySet()).iterator();
        boolean z = true;
        while (true) {
            i4 i4Var = (i4) it;
            if (!i4Var.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) i4Var.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(C4427z5.U);
            sb.append(entry.getValue());
            z = false;
        }
    }

    public Object writeReplace() {
        return new kv9(this);
    }
}
