package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class s6 extends AbstractCollection {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ s6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((t6) obj).g();
                break;
            case 1:
                ((azc) obj).g();
                break;
            case 2:
                ((o53) obj).clear();
                break;
            case 3:
                ((AbstractMap) obj).clear();
                break;
            case 4:
                ((hjo) obj).g();
                break;
            case 5:
                ((fio) obj).clear();
                break;
            default:
                ((f5) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Collection collection = (Collection) ((t6) obj2).d().get(key);
                return collection != null && collection.contains(value);
            case 1:
                return ((azc) obj2).h(obj);
            case 2:
            case 5:
            default:
                return super.contains(obj);
            case 3:
                return ((AbstractMap) obj2).containsValue(obj);
            case 4:
                return ((hjo) obj2).e(obj);
            case 6:
                return ((f5) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 3:
                return ((AbstractMap) obj).isEmpty();
            case 6:
                return ((f5) obj).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        int i2 = 2;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((t6) obj).m();
            case 1:
                return new c5((azc) obj, 0);
            case 2:
                o53 o53Var = (o53) obj;
                Map g = o53Var.g();
                return g != null ? g.values().iterator() : new l53(o53Var, i2);
            case 3:
                return new oub(((AbstractMap) obj).entrySet().iterator(), 0);
            case 4:
                return new nho((hjo) obj);
            case 5:
                fio fioVar = (fio) obj;
                Map j = fioVar.j();
                return j != null ? j.values().iterator() : new cio(fioVar, i2);
            default:
                return new zio(((f5) obj).entrySet().iterator(), 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((t6) obj2).p(entry.getKey(), entry.getValue());
            case 3:
                AbstractMap abstractMap = (AbstractMap) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (sha.r(obj, entry2.getValue())) {
                            abstractMap.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 6:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    f5 f5Var = (f5) obj2;
                    for (Map.Entry entry3 : f5Var.entrySet()) {
                        if (Objects.equals(obj, entry3.getValue())) {
                            f5Var.remove(entry3.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 3:
                AbstractMap abstractMap = (AbstractMap) obj;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            case 6:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    f5 f5Var = (f5) obj;
                    for (Map.Entry entry2 : f5Var.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return f5Var.keySet().removeAll(hashSet2);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 3:
                AbstractMap abstractMap = (AbstractMap) obj;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            case 6:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    f5 f5Var = (f5) obj;
                    for (Map.Entry entry2 : f5Var.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return f5Var.keySet().retainAll(hashSet2);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((t6) obj).q();
            case 1:
                return ((azc) obj).f;
            case 2:
                return ((o53) obj).size();
            case 3:
                return ((AbstractMap) obj).size();
            case 4:
                return ((hjo) obj).e;
            case 5:
                return ((fio) obj).size();
            default:
                return ((f5) obj).b.size();
        }
    }

    public /* synthetic */ s6(AbstractMap abstractMap, int i) {
        this.a = i;
        this.b = abstractMap;
    }
}
