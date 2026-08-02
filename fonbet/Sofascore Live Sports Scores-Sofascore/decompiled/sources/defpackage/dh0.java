package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class dh0 extends fhh implements Map {
    public yg0 d;
    public ah0 e;
    public ch0 f;

    @Override // java.util.Map
    public final Set entrySet() {
        yg0 yg0Var = this.d;
        if (yg0Var != null) {
            return yg0Var;
        }
        yg0 yg0Var2 = new yg0(this, 0);
        this.d = yg0Var2;
        return yg0Var2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        ah0 ah0Var = this.e;
        if (ah0Var != null) {
            return ah0Var;
        }
        ah0 ah0Var2 = new ah0(this);
        this.e = ah0Var2;
        return ah0Var2;
    }

    public final boolean l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean m(Collection collection) {
        int i = this.c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.c;
    }

    public final boolean n(Collection collection) {
        int i = this.c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(g(i2))) {
                i(i2);
            }
        }
        return i != this.c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        c(map.size() + this.c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        ch0 ch0Var = this.f;
        if (ch0Var != null) {
            return ch0Var;
        }
        ch0 ch0Var2 = new ch0(this);
        this.f = ch0Var2;
        return ch0Var2;
    }
}
