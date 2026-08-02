package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oy8 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ Set t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oy8(Set set, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = set;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Set set = this.t;
        switch (i) {
            case 0:
                oy8 oy8Var = new oy8(set, rq3Var, 0);
                oy8Var.s = obj;
                return oy8Var;
            default:
                oy8 oy8Var2 = new oy8(set, rq3Var, 1);
                oy8Var2.s = obj;
                return oy8Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        p0d p0dVar = (p0d) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((oy8) create(p0dVar, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Set set = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                p0d p0dVar = (p0d) this.s;
                Set set2 = (Set) p0dVar.c(ry8.g);
                if (set2 == null) {
                    return p0dVar;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set2) {
                    if (!set.contains((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return p0dVar;
                }
                p0d g = p0dVar.g();
                g.e(ry8.g, y9h.e(set2, arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    my8 my8Var = ry8.d;
                    KProperty[] kPropertyArr = my8.a;
                    my8Var.getClass();
                    g.d(my8.a(str));
                }
                return g.h();
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                Set keySet = ((p0d) this.s).a().keySet();
                ArrayList arrayList2 = new ArrayList(k13.r(keySet, 10));
                Iterator it2 = keySet.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((e5f) it2.next()).a);
                }
                boolean z = true;
                if (set != ieh.a) {
                    Set set3 = set;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        Iterator it3 = set3.iterator();
                        while (it3.hasNext()) {
                            if (!arrayList2.contains((String) it3.next())) {
                            }
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
