package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p3g {
    public final boolean a;
    public final List b;
    public final Collection c;
    public final Collection d;
    public final int e;
    public final r3g f;
    public final boolean g;
    public final boolean h;

    public p3g(List list, Collection collection, Collection collection2, r3g r3gVar, boolean z, boolean z2, boolean z3, int i) {
        this.b = list;
        z1a.y(collection, "drainedSubstreams");
        this.c = collection;
        this.f = r3gVar;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        z1a.D("passThrough should imply buffer is null", !z2 || list == null);
        z1a.D("passThrough should imply winningSubstream != null", (z2 && r3gVar == null) ? false : true);
        z1a.D("passThrough should imply winningSubstream is drained", !z2 || (collection.size() == 1 && collection.contains(r3gVar)) || (collection.size() == 0 && r3gVar.b));
        z1a.D("cancelled should imply committed", (z && r3gVar == null) ? false : true);
    }

    public final p3g a(r3g r3gVar) {
        Collection unmodifiableCollection;
        z1a.D("hedging frozen", !this.h);
        z1a.D("already committed", this.f == null);
        Collection collection = this.d;
        if (collection == null) {
            unmodifiableCollection = Collections.singleton(r3gVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(r3gVar);
            unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new p3g(this.b, this.c, unmodifiableCollection, this.f, this.g, this.a, this.h, this.e + 1);
    }

    public final p3g b(r3g r3gVar, r3g r3gVar2) {
        ArrayList arrayList = new ArrayList(this.d);
        arrayList.remove(r3gVar);
        arrayList.add(r3gVar2);
        return new p3g(this.b, this.c, Collections.unmodifiableCollection(arrayList), this.f, this.g, this.a, this.h, this.e);
    }

    public final p3g c(r3g r3gVar) {
        r3gVar.b = true;
        Collection collection = this.c;
        if (!collection.contains(r3gVar)) {
            return this;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.remove(r3gVar);
        return new p3g(this.b, Collections.unmodifiableCollection(arrayList), this.d, this.f, this.g, this.a, this.h, this.e);
    }

    public final p3g d(r3g r3gVar) {
        List list;
        z1a.D("Already passThrough", !this.a);
        boolean z = r3gVar.b;
        Collection collection = this.c;
        if (!z) {
            if (collection.isEmpty()) {
                collection = Collections.singletonList(r3gVar);
            } else {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.add(r3gVar);
                collection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection2 = collection;
        r3g r3gVar2 = this.f;
        boolean z2 = r3gVar2 != null;
        if (z2) {
            z1a.D("Another RPC attempt has already committed", r3gVar2 == r3gVar);
            list = null;
        } else {
            list = this.b;
        }
        return new p3g(list, collection2, this.d, this.f, this.g, z2, this.h, this.e);
    }
}
