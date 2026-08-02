package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xc2 extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ ArrayList s;
    public final /* synthetic */ ghh t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc2(ArrayList arrayList, ghh ghhVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = arrayList;
        this.t = ghhVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        xc2 xc2Var = new xc2(this.s, this.t, rq3Var);
        xc2Var.r = obj;
        return xc2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xc2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        ku3 ku3Var = (ku3) this.r;
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            xw3.L(ku3Var, null, null, new ix0((yom) it.next(), this.t, null), 3);
        }
        return Unit.a;
    }
}
