package defpackage;

import com.sofascore.model.fantasy.FantasyRound;
import com.sofascore.model.fantasy.FantasyUserRound;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ku6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ pu6 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku6(pu6 pu6Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = pu6Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new ku6(this.t, rq3Var, 0);
            case 1:
                return new ku6(this.t, rq3Var, 1);
            case 2:
                return new ku6(this.t, rq3Var, 2);
            case 3:
                return new ku6(this.t, rq3Var, 3);
            case 4:
                return new ku6(this.t, rq3Var, 4);
            default:
                return new ku6(this.t, rq3Var, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ku6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        pu6 pu6Var = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    ej ejVar = new ej(pu6Var, null, 5);
                    this.s = 1;
                    obj = yaa.P(ejVar, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    gv9 gv9Var = pu6Var.l().g;
                    if (gv9Var != null) {
                        return gv9Var;
                    }
                    this.s = 1;
                    hs4 hs4Var = z45.a;
                    obj = xw3.R(hq4.c, new ku6(pu6Var, rq3Var, 0), this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List list = (List) obj;
                if (list != null) {
                    return l6g.W(list);
                }
                return null;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = pu6Var.f;
                    int i5 = pu6Var.m().c.c;
                    this.s = 1;
                    obj = wi7Var.i(i5, this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(pd0.K((FantasyRound) it.next()));
                }
                return l6g.W(arrayList);
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var2 = pu6Var.f;
                    String str = pu6Var.i;
                    int i7 = pu6Var.m().c.c;
                    this.s = 1;
                    obj = wi7Var2.P(i7, str, this);
                    if (obj == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List list2 = (List) obj;
                if (list2 != null) {
                    return l6g.W(td4.k0(list2));
                }
                return null;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wi7 wi7Var3 = pu6Var.f;
                String str2 = pu6Var.i;
                int i9 = pu6Var.m().c.c;
                this.s = 1;
                Object N = wi7Var3.N(i9, str2, this);
                return N == lu3Var5 ? lu3Var5 : N;
            default:
                lu3 lu3Var6 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var4 = pu6Var.f;
                    String str3 = pu6Var.i;
                    int i11 = pu6Var.m().c.c;
                    this.s = 1;
                    obj = wi7Var4.O(i11, str3, this);
                    if (obj == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List list3 = (List) obj;
                if (list3 == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(k13.r(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(pco.T((FantasyUserRound) it2.next()));
                }
                return CollectionsKt.H0(arrayList2, new v66(9));
        }
    }
}
