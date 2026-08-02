package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uo3 extends hoi implements Function2 {
    public final /* synthetic */ int r = 1;
    public int s;
    public final /* synthetic */ long t;
    public /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo3(eje ejeVar, String str, long j, pej pejVar, tbj tbjVar, nnd nndVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = ejeVar;
        this.v = str;
        this.t = j;
        this.w = pejVar;
        this.x = tbjVar;
        this.y = nndVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.y;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.v;
        switch (i) {
            case 0:
                uo3 uo3Var = new uo3((idk) obj5, (wo3) obj4, (a42) obj3, this.t, (yda) obj2, rq3Var);
                uo3Var.u = obj;
                return uo3Var;
            default:
                return new uo3((eje) this.u, (String) obj5, this.t, (pej) obj4, (tbj) obj3, (nnd) obj2, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((uo3) create((qvg) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((uo3) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Object obj2 = this.w;
        Object obj3 = this.x;
        Object obj4 = this.v;
        Object obj5 = this.y;
        switch (i) {
            case 0:
                a42 a42Var = (a42) obj3;
                wo3 wo3Var = (wo3) obj2;
                idk idkVar = (idk) obj4;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    qvg qvgVar = (qvg) this.u;
                    idkVar.e = wo3Var.k1(a42Var, this.t);
                    fa faVar = new fa(wo3Var, idkVar, (yda) obj5, qvgVar);
                    mi miVar = new mi(15, wo3Var, idkVar, a42Var);
                    this.s = 1;
                    if (idkVar.a(faVar, miVar, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                nnd nndVar = (nnd) obj5;
                String str = (String) obj4;
                tbj tbjVar = (tbj) obj3;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    eje ejeVar = (eje) this.u;
                    this.s = 1;
                    kje kjeVar = (kje) ejeVar;
                    kjeVar.getClass();
                    if (str.length() != 0) {
                        long j = this.t;
                        if (!pej.d(j)) {
                            obj = xw3.R(kjeVar.a, new ije(kjeVar, new jje(str, j, kjeVar, null), null), this);
                            if (obj == lu3Var2) {
                                break;
                            }
                        }
                    }
                    obj = null;
                    if (obj == lu3Var2) {
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                pej pejVar = (pej) obj;
                if (pejVar == null) {
                    break;
                } else {
                    long j2 = pejVar.a;
                    long g = t6a.g(nndVar.i((int) (j2 >> 32)), nndVar.i((int) (j2 & 4294967295L)));
                    if (!pej.b((pej) obj2, g) && Intrinsics.c(tbjVar.l().a.b, str) && nndVar == tbjVar.b) {
                        tbjVar.c.invoke(tbj.b(tbjVar.l().a, g));
                        tbjVar.v = new pej(g);
                    }
                    break;
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo3(idk idkVar, wo3 wo3Var, a42 a42Var, long j, yda ydaVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = idkVar;
        this.w = wo3Var;
        this.x = a42Var;
        this.t = j;
        this.y = ydaVar;
    }
}
