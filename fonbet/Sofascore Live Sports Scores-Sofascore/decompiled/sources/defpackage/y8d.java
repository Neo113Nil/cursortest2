package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class y8d {
    public h6d a;
    public boolean b;

    public abstract s6d a();

    public final h6d b() {
        h6d h6dVar = this.a;
        if (h6dVar != null) {
            return h6dVar;
        }
        a70.r("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, u7d u7dVar) {
        list.getClass();
        c38 c38Var = new c38(i5h.h(i5h.n(new oh0(list, 1), new lsb(19, this, u7dVar)), new z1h(4)));
        while (c38Var.hasNext()) {
            b().h((d6d) c38Var.next());
        }
    }

    public void e(h6d h6dVar) {
        this.a = h6dVar;
        this.b = true;
    }

    public void f(d6d d6dVar) {
        s6d s6dVar = d6dVar.b;
        if (s6dVar == null) {
            s6dVar = null;
        }
        if (s6dVar == null) {
            return;
        }
        t7d t7dVar = new t7d();
        Unit unit = Unit.a;
        t7dVar.a = true;
        t7dVar.b = false;
        t7dVar.c = -1;
        t7dVar.d = false;
        t7dVar.e = false;
        c(s6dVar, null, t7dVar.a());
        b().d(d6dVar);
    }

    public Bundle h() {
        return null;
    }

    public void i(d6d d6dVar, boolean z) {
        List list = (List) b().e.a.getValue();
        if (!list.contains(d6dVar)) {
            a70.n("popBackStack was called with ", d6dVar, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        d6d d6dVar2 = null;
        while (j()) {
            d6dVar2 = (d6d) listIterator.previous();
            if (Intrinsics.c(d6dVar2, d6dVar)) {
                break;
            }
        }
        if (d6dVar2 != null) {
            b().e(d6dVar2, z);
        }
    }

    public boolean j() {
        return true;
    }

    public void g(Bundle bundle) {
    }

    public s6d c(s6d s6dVar, Bundle bundle, u7d u7dVar) {
        return s6dVar;
    }
}
