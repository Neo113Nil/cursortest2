package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class mvd implements fed {
    public final String a;
    public final oh3 b;
    public final ArrayList c;

    public mvd(String str, oh3 oh3Var) {
        this.a = str;
        this.b = oh3Var;
        xbb b = a.b();
        n4o.v(b, oh3Var);
        xbb a = a.a(b);
        ArrayList arrayList = new ArrayList(k13.r(a, 10));
        ListIterator listIterator = a.listIterator(0);
        while (true) {
            hc9 hc9Var = (hc9) listIterator;
            if (!hc9Var.hasNext()) {
                break;
            } else {
                arrayList.add(((oz7) hc9Var.next()).c());
            }
        }
        List<l3> S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList));
        ArrayList arrayList2 = new ArrayList(k13.r(S0, 10));
        for (l3 l3Var : S0) {
            l3Var.getClass();
            Object b2 = l3Var.b();
            if (b2 == null) {
                pvd.A(l3Var.c(), "' does not define a default value", "The field '");
                throw null;
            }
            arrayList2.add(new lvd(l3Var.a(), b2));
        }
        this.c = arrayList2;
    }

    @Override // defpackage.vm8
    public final wm8 a() {
        Object tj3Var;
        wm8 a = this.b.a();
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lvd lvdVar = (lvd) it.next();
            arrayList2.add(new n73(lvdVar.b, new v9b(1, lvdVar.a, gef.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0, 20)));
        }
        boolean isEmpty = arrayList2.isEmpty();
        Object obj = w1k.a;
        if (isEmpty) {
            tj3Var = obj;
        } else {
            tj3Var = arrayList2.size() == 1 ? (l3f) CollectionsKt.D0(arrayList2) : new tj3(arrayList2);
        }
        return tj3Var instanceof w1k ? new ph3() : new zh3(b.j(new Pair(new v9b(1, tj3Var, l3f.class, "test", "test(Ljava/lang/Object;)Z", 0, 21), new ph3()), new Pair(new v9b(1, obj, w1k.class, "test", "test(Ljava/lang/Object;)Z", 0, 22), a)));
    }

    @Override // defpackage.vm8
    public final v9e b() {
        km5 km5Var = km5.a;
        return new v9e(km5Var, b.j(this.b.b(), nq8.v(b.j(new el3(this.a).b(), new v9e(this.c.isEmpty() ? km5Var : a.c(new u9k(new mnc(this, 20))), km5Var)))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mvd)) {
            return false;
        }
        mvd mvdVar = (mvd) obj;
        return this.a.equals(mvdVar.a) && this.b.equals(mvdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Optional(" + this.a + ", " + this.b + ')';
    }
}
