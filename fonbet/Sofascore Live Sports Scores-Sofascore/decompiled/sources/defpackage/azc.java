package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class azc extends t6 implements Serializable {
    public transient Map e;
    public transient int f;
    public transient tmi g;

    public azc(Map map) {
        z1a.s(map.isEmpty());
        this.e = map;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        Objects.requireNonNull(readObject);
        this.g = (tmi) readObject;
        Object readObject2 = objectInputStream.readObject();
        Objects.requireNonNull(readObject2);
        Map map = (Map) readObject2;
        this.e = map;
        this.f = 0;
        for (Collection collection : map.values()) {
            z1a.s(!collection.isEmpty());
            this.f = collection.size() + this.f;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.g);
        objectOutputStream.writeObject(this.e);
    }

    @Override // defpackage.t6
    public final void g() {
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.e.clear();
        this.f = 0;
    }

    @Override // defpackage.t6
    public final Map i() {
        Map map = this.e;
        return map instanceof NavigableMap ? new h5(this, (NavigableMap) this.e) : map instanceof SortedMap ? new k5(this, (SortedMap) this.e) : new f5(this, this.e, 0);
    }

    @Override // defpackage.t6
    public final Collection j() {
        return new s6(this, 0);
    }

    @Override // defpackage.t6
    public final Set k() {
        Map map = this.e;
        return map instanceof NavigableMap ? new i5(this, (NavigableMap) this.e) : map instanceof SortedMap ? new l5(this, (SortedMap) this.e) : new g5(this, this.e);
    }

    @Override // defpackage.t6
    public final Iterator m() {
        return new c5(this, 1);
    }

    @Override // defpackage.t6
    public final Collection n(Object obj) {
        Collection collection = (Collection) this.e.get(obj);
        if (collection == null) {
            collection = r();
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new j5(this, obj, list, null) : new n5(this, obj, list, (n5) null);
    }

    @Override // defpackage.t6
    public final int q() {
        return this.f;
    }

    public final Collection r() {
        return (List) this.g.get();
    }

    public final boolean s(Object obj, Object obj2) {
        Collection collection = (Collection) this.e.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f++;
            return true;
        }
        Collection r = r();
        if (!r.add(obj2)) {
            a70.j("New Collection violated the Collection spec");
            return false;
        }
        this.f++;
        this.e.put(obj, r);
        return true;
    }

    public final Collection t() {
        Collection collection = this.c;
        if (collection != null) {
            return collection;
        }
        s6 s6Var = new s6(this, 1);
        this.c = s6Var;
        return s6Var;
    }
}
