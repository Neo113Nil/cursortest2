package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wp4 extends c6o implements Map {
    public final /* synthetic */ int r;
    public final Map s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp4() {
        super(27);
        this.r = 2;
        this.s = new HashMap();
    }

    @Override // defpackage.c6o
    public final Object G() {
        int i = this.r;
        Map map = this.s;
        switch (i) {
            case 0:
            case 1:
                return map;
            default:
                return (HashMap) map;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        j0().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && h0(obj);
            case 1:
                return obj != null && h0(obj);
            default:
                return h0(obj);
        }
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        switch (this.r) {
            case 0:
                return aik.E(this, obj);
            case 1:
                return aik.E(this, obj);
            default:
                return i0(obj);
        }
    }

    @Override // java.util.Map
    public Set entrySet() {
        switch (this.r) {
            case 0:
                return w1a.p(l0(), new vp4(2));
            case 1:
                return w1a.p(l0(), new vp4(1));
            default:
                return l0();
        }
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && aik.H(obj, this);
            case 1:
                return obj != null && aik.H(obj, this);
            default:
                return m0(obj);
        }
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        switch (this.r) {
            case 0:
                if (obj == null) {
                    return null;
                }
                return (List) n0(obj);
            case 1:
                if (obj == null) {
                    return null;
                }
                return (List) n0(obj);
            default:
                return n0(obj);
        }
    }

    public final boolean h0(Object obj) {
        return j0().containsKey(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        switch (this.r) {
            case 0:
                return w1a.s(entrySet());
            case 1:
                return w1a.s(entrySet());
            default:
                return o0();
        }
    }

    public final boolean i0(Object obj) {
        return j0().containsValue(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        switch (this.r) {
            case 0:
                if (p0()) {
                    return true;
                }
                return r0() == 1 && h0(null);
            case 1:
                if (p0()) {
                    return true;
                }
                return r0() == 1 && h0(null);
            default:
                return p0();
        }
    }

    public final Map j0() {
        int i = this.r;
        Map map = this.s;
        switch (i) {
            case 0:
            case 1:
                return map;
            default:
                return (HashMap) map;
        }
    }

    public double k0() {
        HashMap hashMap = (HashMap) this.s;
        if (hashMap.isEmpty()) {
            return 0.0d;
        }
        Iterator it = hashMap.values().iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            i2++;
            if (((twd) it.next()).d()) {
                i++;
            }
        }
        return (i / i2) * 100.0d;
    }

    @Override // java.util.Map
    public Set keySet() {
        switch (this.r) {
            case 0:
                return w1a.p(q0(), new vp4(0));
            case 1:
                return w1a.p(q0(), new vp4(3));
            default:
                return q0();
        }
    }

    public final Set l0() {
        return j0().entrySet();
    }

    public final boolean m0(Object obj) {
        return obj == this || j0().equals(obj);
    }

    public final Object n0(Object obj) {
        return j0().get(obj);
    }

    public final int o0() {
        return j0().hashCode();
    }

    public final boolean p0() {
        return j0().isEmpty();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return j0().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        j0().putAll(map);
    }

    public final Set q0() {
        return j0().keySet();
    }

    public final int r0() {
        return j0().size();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return j0().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        int r0;
        int i;
        switch (this.r) {
            case 0:
                r0 = r0();
                i = h0(null);
                break;
            case 1:
                r0 = r0();
                i = h0(null);
                break;
            default:
                return r0();
        }
        return r0 - i;
    }

    @Override // java.util.Map
    public final Collection values() {
        return j0().values();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp4(Map map, int i) {
        super(27);
        this.r = i;
        this.s = map;
    }
}
