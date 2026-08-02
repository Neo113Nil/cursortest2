package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hc3 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;

    public hc3(ic3 ic3Var) {
        this.a = CollectionsKt.U0(ic3Var.a);
        this.b = CollectionsKt.U0(ic3Var.b);
        this.c = CollectionsKt.U0(ic3Var.c);
        List list = (List) ic3Var.f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new h63((Pair) it.next(), 2));
        }
        this.d = arrayList;
        List list2 = (List) ic3Var.g.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new gc3((zl4) it2.next(), 0));
        }
        this.e = arrayList2;
    }

    public void a(q40 q40Var, KClass kClass) {
        this.b.add(new Pair(q40Var, kClass));
    }

    public void b(s92 s92Var, Class cls) {
        this.b.add(new Pair(s92Var, cls));
    }

    public void c(bz7 bz7Var, KClass kClass) {
        this.d.add(new ix1(21, bz7Var, kClass));
    }

    public void d(cz7 cz7Var, Class cls) {
        this.d.add(new Pair(cz7Var, cls));
    }

    public hc3(jc3 jc3Var) {
        this.a = CollectionsKt.U0(jc3Var.a);
        this.b = CollectionsKt.U0(jc3Var.b);
        this.c = CollectionsKt.U0(jc3Var.c);
        this.d = CollectionsKt.U0(jc3Var.d);
        this.e = CollectionsKt.U0(jc3Var.e);
    }
}
