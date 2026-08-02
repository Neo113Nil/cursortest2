package mb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class p {

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final C5576c f56476a;

        /* renamed from: b, reason: collision with root package name */
        public final Set f56477b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        public final Set f56478c = new HashSet();

        public b(C5576c c5576c) {
            this.f56476a = c5576c;
        }

        public void a(b bVar) {
            this.f56477b.add(bVar);
        }

        public void b(b bVar) {
            this.f56478c.add(bVar);
        }

        public C5576c c() {
            return this.f56476a;
        }

        public Set d() {
            return this.f56477b;
        }

        public boolean e() {
            return this.f56477b.isEmpty();
        }

        public boolean f() {
            return this.f56478c.isEmpty();
        }

        public void g(b bVar) {
            this.f56478c.remove(bVar);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final D f56479a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f56480b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f56479a.equals(this.f56479a) && cVar.f56480b == this.f56480b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f56479a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f56480b).hashCode();
        }

        public c(D d10, boolean z10) {
            this.f56479a = d10;
            this.f56480b = z10;
        }
    }

    public static void a(List list) {
        Set<b> c10 = c(list);
        Set b10 = b(c10);
        int i10 = 0;
        while (!b10.isEmpty()) {
            b bVar = (b) b10.iterator().next();
            b10.remove(bVar);
            i10++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    b10.add(bVar2);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : c10) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new r(arrayList);
    }

    public static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    public static Set c(List list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (q qVar : bVar.c().g()) {
                            if (qVar.d() && (set = (Set) hashMap.get(new c(qVar.b(), qVar.f()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C5576c c5576c = (C5576c) it.next();
            b bVar3 = new b(c5576c);
            for (D d10 : c5576c.j()) {
                c cVar = new c(d10, !c5576c.p());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.f56480b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", d10));
                }
                set2.add(bVar3);
            }
        }
    }
}
