package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class t6 {
    public transient Collection a;
    public transient Set b;
    public transient Collection c;
    public transient Map d;

    public Map d() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map i = i();
        this.d = i;
        return i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t6) {
            return d().equals(((t6) obj).d());
        }
        return false;
    }

    public abstract void g();

    public boolean h(Object obj) {
        Iterator it = d().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return d().hashCode();
    }

    public abstract Map i();

    public abstract Collection j();

    public abstract Set k();

    public Collection l() {
        Collection collection = this.a;
        if (collection != null) {
            return collection;
        }
        Collection j = j();
        this.a = j;
        return j;
    }

    public abstract Iterator m();

    public abstract Collection n(Object obj);

    public Set o() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set k = k();
        this.b = k;
        return k;
    }

    public boolean p(Object obj, Object obj2) {
        Collection collection = (Collection) d().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public abstract int q();

    public final String toString() {
        return d().toString();
    }
}
