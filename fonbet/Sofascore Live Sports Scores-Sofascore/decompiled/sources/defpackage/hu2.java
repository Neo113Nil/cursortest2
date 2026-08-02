package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hu2 extends hoi implements Function2 {
    public ku2 r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ ku2 u;
    public final /* synthetic */ LinkedHashSet v;
    public final /* synthetic */ long w;
    public final /* synthetic */ long x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu2(ku2 ku2Var, LinkedHashSet linkedHashSet, long j, long j2, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = ku2Var;
        this.v = linkedHashSet;
        this.w = j;
        this.x = j2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        hu2 hu2Var = new hu2(this.u, this.v, this.w, this.x, rq3Var);
        hu2Var.t = obj;
        return hu2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hu2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object value;
        Integer num;
        km5 km5Var;
        ku2 ku2Var;
        Integer D;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        ku2 ku2Var2 = this.u;
        if (i == 0) {
            y6a.M(obj);
            if (!ku2Var2.p) {
                fdi fdiVar = ku2Var2.q;
                do {
                    value = fdiVar.getValue();
                    num = new Integer(0);
                    km5Var = km5.a;
                    ((du2) value).getClass();
                    km5Var.getClass();
                } while (!fdiVar.k(value, new du2(true, num, km5Var, null, null)));
                ku2Var2.t = null;
                return Unit.a;
            }
            LinkedHashSet linkedHashSet = this.v;
            ArrayList arrayList = new ArrayList(k13.r(linkedHashSet, 10));
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(xw3.t(ku3Var, null, new gu2(ku2Var2, (String) it.next(), this.w, this.x, null), 3));
            }
            this.t = null;
            this.r = ku2Var2;
            this.s = 1;
            obj = m6k.u(arrayList, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
            ku2Var = ku2Var2;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ku2Var = this.r;
            y6a.M(obj);
        }
        ku2Var.n = k13.s((Iterable) obj);
        long j = ku2Var2.h;
        long j2 = ku2Var2.k;
        ku2Var2.m((!ku2Var2.i || (D = n9e.D(ku2Var2.n, new yz((j / j2) * j2, 8))) == null) ? 0 : D.intValue(), false);
        ku2Var2.t = null;
        return Unit.a;
    }
}
