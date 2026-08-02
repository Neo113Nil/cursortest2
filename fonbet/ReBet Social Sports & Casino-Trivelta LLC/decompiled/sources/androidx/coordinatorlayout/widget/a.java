package androidx.coordinatorlayout.widget;

import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import x0.InterfaceC6775d;
import z.r;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6775d f18799a = new Pools$SimplePool(10);

    /* renamed from: b, reason: collision with root package name */
    public final r f18800b = new r();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18801c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f18802d = new HashSet();

    public void a(Object obj, Object obj2) {
        if (!this.f18800b.containsKey(obj) || !this.f18800b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f18800b.get(obj);
        if (arrayList == null) {
            arrayList = f();
            this.f18800b.put(obj, arrayList);
        }
        arrayList.add(obj2);
    }

    public void b(Object obj) {
        if (this.f18800b.containsKey(obj)) {
            return;
        }
        this.f18800b.put(obj, null);
    }

    public void c() {
        int size = this.f18800b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f18800b.j(i10);
            if (arrayList != null) {
                l(arrayList);
            }
        }
        this.f18800b.clear();
    }

    public boolean d(Object obj) {
        return this.f18800b.containsKey(obj);
    }

    public final void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f18800b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public final ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f18799a.acquire();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    public List g(Object obj) {
        ArrayList h10 = h(obj);
        if (h10 == null) {
            return null;
        }
        return new ArrayList(h10);
    }

    public ArrayList h(Object obj) {
        return (ArrayList) this.f18800b.get(obj);
    }

    public List i(Object obj) {
        int size = this.f18800b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) this.f18800b.j(i10);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f18800b.f(i10));
            }
        }
        return arrayList;
    }

    public ArrayList j() {
        this.f18801c.clear();
        this.f18802d.clear();
        int size = this.f18800b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f18800b.f(i10), this.f18801c, this.f18802d);
        }
        return this.f18801c;
    }

    public boolean k(Object obj) {
        int size = this.f18800b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f18800b.j(i10);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void l(ArrayList arrayList) {
        arrayList.clear();
        this.f18799a.release(arrayList);
    }
}
