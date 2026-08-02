package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class th4 extends hoi implements Function2 {
    public final /* synthetic */ int r = 1;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ ai4 u;
    public final /* synthetic */ ArrayList v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th4(ai4 ai4Var, ArrayList arrayList, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = ai4Var;
        this.v = arrayList;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ArrayList arrayList = this.v;
        ai4 ai4Var = this.u;
        switch (i) {
            case 0:
                th4 th4Var = new th4(arrayList, ai4Var, rq3Var);
                th4Var.t = obj;
                return th4Var;
            default:
                th4 th4Var2 = new th4(ai4Var, arrayList, rq3Var);
                th4Var2.t = obj;
                return th4Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((th4) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        ArrayList arrayList = this.v;
        ai4 ai4Var = this.u;
        int i2 = 1;
        int i3 = 3;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(xw3.t(ku3Var, null, new sh4(ai4Var, (ci6) it.next(), rq3Var, i2), 3));
                }
                this.t = null;
                this.s = 1;
                Object u = m6k.u(arrayList2, this);
                return u == lu3Var ? lu3Var : u;
            default:
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    g9i L = xw3.L(ku3Var2, null, null, new mh4(ai4Var, rq3Var, i3), 3);
                    if (ai4Var.u()) {
                        this.t = ku3Var2;
                        this.s = 1;
                        if (L.Z(this) == lu3Var2) {
                            return lu3Var2;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                xw3.L(ku3Var2, null, null, new ce4(ai4Var, arrayList, rq3Var, 6), 3);
                xw3.L(ku3Var2, null, null, new mh4(ai4Var, rq3Var, 2), 3);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th4(ArrayList arrayList, ai4 ai4Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = arrayList;
        this.u = ai4Var;
    }
}
