package n8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class m {

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final C8451a<?> f76598a;

        /* renamed from: b, reason: collision with root package name */
        private final HashSet f76599b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final HashSet f76600c = new HashSet();

        a(C8451a<?> c8451a) {
            this.f76598a = c8451a;
        }

        final void a(a aVar) {
            this.f76599b.add(aVar);
        }

        final void b(a aVar) {
            this.f76600c.add(aVar);
        }

        final C8451a<?> c() {
            return this.f76598a;
        }

        final HashSet d() {
            return this.f76599b;
        }

        final boolean e() {
            return this.f76599b.isEmpty();
        }

        final boolean f() {
            return this.f76600c.isEmpty();
        }

        final void g(a aVar) {
            this.f76600c.remove(aVar);
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final w<?> f76601a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f76602b;

        private b() {
            throw null;
        }

        b(w wVar, boolean z11) {
            this.f76601a = wVar;
            this.f76602b = z11;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.f76601a.equals(this.f76601a) && bVar.f76602b == this.f76602b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((this.f76601a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f76602b).hashCode();
        }
    }

    static void a(ArrayList arrayList) {
        Set<a> set;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8451a c8451a = (C8451a) it.next();
            a aVar = new a(c8451a);
            for (w wVar : c8451a.h()) {
                b bVar = new b(wVar, !c8451a.m());
                if (!hashMap.containsKey(bVar)) {
                    hashMap.put(bVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(bVar);
                if (!set2.isEmpty() && !bVar.f76602b) {
                    throw new IllegalArgumentException("Multiple components provide " + wVar + ".");
                }
                set2.add(aVar);
            }
        }
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            for (a aVar2 : (Set) it2.next()) {
                for (n nVar : aVar2.c().e()) {
                    if (nVar.c() && (set = (Set) hashMap.get(new b(nVar.a(), nVar.e()))) != null) {
                        for (a aVar3 : set) {
                            aVar2.a(aVar3);
                            aVar3.b(aVar2);
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
        HashSet hashSet2 = new HashSet();
        Iterator it4 = hashSet.iterator();
        while (it4.hasNext()) {
            a aVar4 = (a) it4.next();
            if (aVar4.f()) {
                hashSet2.add(aVar4);
            }
        }
        int i11 = 0;
        while (!hashSet2.isEmpty()) {
            a aVar5 = (a) hashSet2.iterator().next();
            hashSet2.remove(aVar5);
            i11++;
            Iterator it5 = aVar5.d().iterator();
            while (it5.hasNext()) {
                a aVar6 = (a) it5.next();
                aVar6.g(aVar5);
                if (aVar6.f()) {
                    hashSet2.add(aVar6);
                }
            }
        }
        if (i11 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            a aVar7 = (a) it6.next();
            if (!aVar7.f() && !aVar7.e()) {
                arrayList2.add(aVar7.c());
            }
        }
        throw new o(arrayList2);
    }
}
