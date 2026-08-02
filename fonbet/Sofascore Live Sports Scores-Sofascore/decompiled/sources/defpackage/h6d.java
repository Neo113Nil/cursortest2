package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h6d {
    public final y9f a;
    public final fdi b;
    public final fdi c;
    public boolean d;
    public final jof e;
    public final jof f;
    public final y8d g;
    public final /* synthetic */ k7d h;

    public h6d(k7d k7dVar, y8d y8dVar) {
        y8dVar.getClass();
        this.h = k7dVar;
        this.a = new y9f(3);
        fdi a = gdi.a(km5.a);
        this.b = a;
        fdi a2 = gdi.a(rm5.a);
        this.c = a2;
        this.e = un0.u(a);
        this.f = un0.u(a2);
        this.g = y8dVar;
    }

    public final void a(d6d d6dVar) {
        d6dVar.getClass();
        synchronized (this.a) {
            fdi fdiVar = this.b;
            fdiVar.m(null, CollectionsKt.x0((Collection) fdiVar.getValue(), d6dVar));
            Unit unit = Unit.a;
        }
    }

    public final d6d b(s6d s6dVar, Bundle bundle) {
        k6d k6dVar = this.h.b;
        k6dVar.getClass();
        return q1f.h(k6dVar.a.c, s6dVar, bundle, k6dVar.h(), k6dVar.o);
    }

    public final void c(d6d d6dVar) {
        l6d l6dVar;
        stk stkVar;
        d6dVar.getClass();
        k6d k6dVar = this.h.b;
        fdi fdiVar = k6dVar.h;
        f6d f6dVar = d6dVar.h;
        LinkedHashMap linkedHashMap = k6dVar.w;
        boolean c = Intrinsics.c(linkedHashMap.get(d6dVar), Boolean.TRUE);
        fdi fdiVar2 = this.c;
        fdiVar2.m(null, y9h.d((Set) fdiVar2.getValue(), d6dVar));
        Unit unit = Unit.a;
        linkedHashMap.remove(d6dVar);
        vg0 vg0Var = k6dVar.f;
        if (vg0Var.contains(d6dVar)) {
            if (this.d) {
                return;
            }
            k6dVar.t();
            fdi fdiVar3 = k6dVar.g;
            ArrayList arrayList = new ArrayList(vg0Var);
            fdiVar3.getClass();
            fdiVar3.m(null, arrayList);
            ArrayList p = k6dVar.p();
            fdiVar.getClass();
            fdiVar.m(null, p);
            return;
        }
        k6dVar.s(d6dVar);
        String str = d6dVar.f;
        if (f6dVar.j.i.compareTo(e6b.c) >= 0) {
            f6dVar.k = e6b.a;
            f6dVar.b();
        }
        if (!vg0Var.isEmpty()) {
            Iterator it = vg0Var.iterator();
            while (it.hasNext()) {
                if (((d6d) it.next()).f.equals(str)) {
                    break;
                }
            }
        }
        if (!c && (l6dVar = k6dVar.o) != null && (stkVar = (stk) l6dVar.b.remove(str)) != null) {
            stkVar.a();
        }
        k6dVar.t();
        ArrayList p2 = k6dVar.p();
        fdiVar.getClass();
        fdiVar.m(null, p2);
    }

    public final void d(d6d d6dVar) {
        int i;
        synchronized (this.a) {
            try {
                ArrayList U0 = CollectionsKt.U0((Collection) this.e.a.getValue());
                ListIterator listIterator = U0.listIterator(U0.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                        break;
                    } else if (((d6d) listIterator.previous()).f.equals(d6dVar.f)) {
                        i = listIterator.nextIndex();
                        break;
                    }
                }
                U0.set(i, d6dVar);
                this.b.m(null, U0);
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(d6d d6dVar, boolean z) {
        d6dVar.getClass();
        k6d k6dVar = this.h.b;
        ixa ixaVar = new ixa(this, d6dVar, z);
        k6dVar.getClass();
        y8d b = k6dVar.s.b(d6dVar.b.a);
        k6dVar.w.put(d6dVar, Boolean.valueOf(z));
        if (!b.equals(this.g)) {
            Object obj = k6dVar.t.get(b);
            obj.getClass();
            ((h6d) obj).e(d6dVar, z);
            return;
        }
        b05 b05Var = k6dVar.v;
        if (b05Var != null) {
            b05Var.invoke(d6dVar);
            ixaVar.invoke();
            return;
        }
        vg0 vg0Var = k6dVar.f;
        int indexOf = vg0Var.indexOf(d6dVar);
        if (indexOf < 0) {
            Objects.toString(d6dVar);
            return;
        }
        int i = indexOf + 1;
        if (i != vg0Var.size()) {
            k6dVar.m(((d6d) vg0Var.get(i)).b.b.b, true, false);
        }
        k6d.o(k6dVar, d6dVar);
        ixaVar.invoke();
        Unit unit = Unit.a;
        k6dVar.b.invoke();
        k6dVar.b();
    }

    public final void f(d6d d6dVar, boolean z) {
        Object obj;
        d6dVar.getClass();
        ddi ddiVar = this.e.a;
        fdi fdiVar = this.c;
        Iterable iterable = (Iterable) fdiVar.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((d6d) it.next()) == d6dVar) {
                    Iterable iterable2 = (Iterable) ddiVar.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((d6d) it2.next()) == d6dVar) {
                        }
                    }
                    return;
                }
            }
        }
        fdiVar.m(null, y9h.g((Set) fdiVar.getValue(), d6dVar));
        List list = (List) ddiVar.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            d6d d6dVar2 = (d6d) obj;
            if (!Intrinsics.c(d6dVar2, d6dVar) && ((List) ddiVar.getValue()).lastIndexOf(d6dVar2) < ((List) ddiVar.getValue()).lastIndexOf(d6dVar)) {
                break;
            }
        }
        d6d d6dVar3 = (d6d) obj;
        if (d6dVar3 != null) {
            fdiVar.m(null, y9h.g((Set) fdiVar.getValue(), d6dVar3));
        }
        e(d6dVar, z);
    }

    public final void g(d6d d6dVar) {
        d6dVar.getClass();
        fdi fdiVar = this.c;
        fdiVar.m(null, y9h.g((Set) fdiVar.getValue(), d6dVar));
        k6d k6dVar = this.h.b;
        k6dVar.getClass();
        if (!k6dVar.f.contains(d6dVar)) {
            a70.r("Cannot transition entry that is not in the back stack");
            return;
        }
        e6b e6bVar = e6b.d;
        f6d f6dVar = d6dVar.h;
        f6dVar.k = e6bVar;
        f6dVar.b();
    }

    public final void h(d6d d6dVar) {
        d6dVar.getClass();
        k6d k6dVar = this.h.b;
        k6dVar.getClass();
        y8d b = k6dVar.s.b(d6dVar.b.a);
        if (!b.equals(this.g)) {
            Object obj = k6dVar.t.get(b);
            if (obj != null) {
                ((h6d) obj).h(d6dVar);
                return;
            } else {
                hc5.f(mz1.o(new StringBuilder("NavigatorBackStack for "), d6dVar.b.a, " should already be created"));
                return;
            }
        }
        Function1 function1 = k6dVar.u;
        if (function1 == null) {
            Objects.toString(d6dVar.b);
        } else {
            function1.invoke(d6dVar);
            a(d6dVar);
        }
    }

    public final void i(d6d d6dVar) {
        ddi ddiVar = this.e.a;
        d6dVar.getClass();
        fdi fdiVar = this.c;
        Iterable iterable = (Iterable) fdiVar.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((d6d) it.next()) == d6dVar) {
                    Iterable iterable2 = (Iterable) ddiVar.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((d6d) it2.next()) == d6dVar) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        d6d d6dVar2 = (d6d) CollectionsKt.j0((List) ddiVar.getValue());
        if (d6dVar2 != null) {
            fdiVar.m(null, y9h.g((Set) fdiVar.getValue(), d6dVar2));
        }
        fdiVar.m(null, y9h.g((Set) fdiVar.getValue(), d6dVar));
        h(d6dVar);
    }
}
