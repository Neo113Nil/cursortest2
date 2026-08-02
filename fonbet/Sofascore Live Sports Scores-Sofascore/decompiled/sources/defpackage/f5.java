package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class f5 extends AbstractMap {
    public final /* synthetic */ int a;
    public final transient Map b;
    public transient AbstractSet c;
    public transient AbstractCollection d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ f5(Serializable serializable, Map map, int i) {
        this.a = i;
        this.e = serializable;
        this.b = map;
    }

    public xu9 a(Map.Entry entry) {
        Object key = entry.getKey();
        azc azcVar = (azc) this.e;
        List list = (List) ((Collection) entry.getValue());
        return new xu9(key, list instanceof RandomAccess ? new j5(azcVar, key, list, null) : new n5(azcVar, key, list, (n5) null));
    }

    public AbstractMap.SimpleImmutableEntry c(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        hjo hjoVar = (hjo) this.e;
        List list = (List) collection;
        return new AbstractMap.SimpleImmutableEntry(key, list instanceof RandomAccess ? new sho(hjoVar, key, list, null) : new n5(hjoVar, key, list, (n5) null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        int i = this.a;
        Map map = this.b;
        Serializable serializable = this.e;
        switch (i) {
            case 0:
                azc azcVar = (azc) serializable;
                if (map != azcVar.e) {
                    e5 e5Var = new e5(this);
                    while (e5Var.hasNext()) {
                        e5Var.next();
                        e5Var.remove();
                    }
                    break;
                } else {
                    azcVar.g();
                    break;
                }
            default:
                hjo hjoVar = (hjo) serializable;
                if (map != hjoVar.d) {
                    e5 e5Var2 = new e5(this, (byte) 0);
                    while (e5Var2.hasNext()) {
                        e5Var2.next();
                        e5Var2.remove();
                    }
                    break;
                } else {
                    hjoVar.g();
                    break;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        int i = this.a;
        Map map = this.b;
        switch (i) {
            case 0:
                map.getClass();
                try {
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                map.getClass();
                try {
                    break;
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
        }
        return map.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                d5 d5Var = (d5) this.c;
                if (d5Var != null) {
                    return d5Var;
                }
                d5 d5Var2 = new d5(this, 0);
                this.c = d5Var2;
                return d5Var2;
            default:
                oho ohoVar = (oho) this.c;
                if (ohoVar != null) {
                    return ohoVar;
                }
                oho ohoVar2 = new oho(this);
                this.c = ohoVar2;
                return ohoVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (this == obj || this.b.equals(obj)) {
                }
                break;
            default:
                if (this == obj || this.b.equals(obj)) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.a;
        Serializable serializable = this.e;
        Map map = this.b;
        switch (i) {
            case 0:
                map.getClass();
                try {
                    obj2 = map.get(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection == null) {
                    return null;
                }
                azc azcVar = (azc) serializable;
                List list = (List) collection;
                return list instanceof RandomAccess ? new j5(azcVar, obj, list, null) : new n5(azcVar, obj, list, (n5) null);
            default:
                map.getClass();
                try {
                    obj3 = map.get(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                hjo hjoVar = (hjo) serializable;
                List list2 = (List) collection2;
                return list2 instanceof RandomAccess ? new sho(hjoVar, obj, list2, null) : new n5(hjoVar, obj, list2, (n5) null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.a) {
            case 0:
                return this.b.hashCode();
            default:
                return this.b.hashCode();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        int i = this.a;
        Serializable serializable = this.e;
        switch (i) {
            case 0:
                return ((azc) serializable).o();
            default:
                hjo hjoVar = (hjo) serializable;
                Set set = hjoVar.a;
                if (set == null) {
                    Map map = hjoVar.d;
                    set = map instanceof NavigableMap ? new rho(hjoVar, (NavigableMap) map) : map instanceof SortedMap ? new uho(hjoVar, (SortedMap) map) : new pho(hjoVar, map);
                    hjoVar.a = set;
                }
                return set;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int i = this.a;
        Serializable serializable = this.e;
        Map map = this.b;
        switch (i) {
            case 0:
                azc azcVar = (azc) serializable;
                Collection collection = (Collection) map.remove(obj);
                if (collection == null) {
                    return null;
                }
                Collection r = azcVar.r();
                r.addAll(collection);
                azcVar.f -= collection.size();
                collection.clear();
                return r;
            default:
                Collection collection2 = (Collection) map.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                hjo hjoVar = (hjo) serializable;
                List list = (List) hjoVar.f.mo792zza();
                list.addAll(collection2);
                hjoVar.e -= collection2.size();
                collection2.clear();
                return list;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.a) {
        }
        return this.b.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                s6 s6Var = (s6) this.d;
                if (s6Var != null) {
                    return s6Var;
                }
                s6 s6Var2 = new s6((AbstractMap) this, 3);
                this.d = s6Var2;
                return s6Var2;
            default:
                s6 s6Var3 = (s6) this.d;
                if (s6Var3 != null) {
                    return s6Var3;
                }
                s6 s6Var4 = new s6((AbstractMap) this, 6);
                this.d = s6Var4;
                return s6Var4;
        }
    }
}
