package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class dfe extends x6 implements Collection, fia {
    public bfe a;
    public Object b;
    public Object c;
    public final fee d;

    public dfe(bfe bfeVar) {
        this.a = bfeVar;
        this.b = bfeVar.b;
        this.c = bfeVar.c;
        this.d = new fee(bfeVar.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        k03 k03Var = k03.d;
        fee feeVar = this.d;
        if (feeVar.containsKey(obj)) {
            return false;
        }
        this.a = null;
        if (isEmpty()) {
            this.b = obj;
            this.c = obj;
            feeVar.put(obj, new pbb(k03Var, k03Var));
            return true;
        }
        Object obj2 = feeVar.get(this.c);
        obj2.getClass();
        feeVar.put(this.c, new pbb(((pbb) obj2).a, obj));
        feeVar.put(obj, new pbb(this.c, k03Var));
        this.c = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        fee feeVar = this.d;
        if (!feeVar.isEmpty()) {
            this.a = null;
        }
        feeVar.clear();
        k03 k03Var = k03.d;
        this.b = k03Var;
        this.c = k03Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.x6
    public final int d() {
        return this.d.f;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        byte b = 0;
        if (obj instanceof Set) {
            fee feeVar = this.d;
            Set set = (Set) obj;
            if (feeVar.f == set.size()) {
                return set instanceof bfe ? feeVar.c.g(((bfe) obj).d.d, new eee(b, 14)) : set instanceof dfe ? feeVar.c.g(((dfe) obj).d.c, new eee(b, 15)) : super.equals(obj);
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new efe(this);
    }

    public final bfe m() {
        bfe bfeVar = this.a;
        if (bfeVar != null) {
            return bfeVar;
        }
        bfe bfeVar2 = new bfe(this.b, this.c, this.d.build());
        this.a = bfeVar2;
        return bfeVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        fee feeVar = this.d;
        pbb pbbVar = (pbb) feeVar.remove(obj);
        if (pbbVar == null) {
            return false;
        }
        Object obj2 = pbbVar.b;
        Object obj3 = pbbVar.a;
        this.a = null;
        k03 k03Var = k03.d;
        if (obj3 != k03Var) {
            Object obj4 = feeVar.get(obj3);
            obj4.getClass();
            feeVar.put(obj3, new pbb(((pbb) obj4).a, obj2));
        } else {
            this.b = obj2;
        }
        if (obj2 == k03Var) {
            this.c = obj3;
            return true;
        }
        Object obj5 = feeVar.get(obj2);
        obj5.getClass();
        feeVar.put(obj2, new pbb(obj3, ((pbb) obj5).b));
        return true;
    }
}
