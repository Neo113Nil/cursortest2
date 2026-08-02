package defpackage;

import com.sofascore.local_persistance.Brand;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class et2 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ et2(mwb mwbVar, fwb fwbVar, Brand brand, qwb qwbVar, boolean z, Function1 function1, xtc xtcVar, int i) {
        this.e = mwbVar;
        this.f = fwbVar;
        this.g = brand;
        this.h = qwbVar;
        this.b = z;
        this.i = function1;
        this.c = xtcVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.e;
        Object obj7 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                l6g.w((vjj) obj6, (Function0) obj7, (jii) obj5, (jii) obj4, this.c, this.b, (bt2) obj3, (of3) obj, K);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2 | 1);
                sha.f((mwb) obj6, (fwb) obj7, (Brand) obj5, (qwb) obj4, this.b, (Function1) obj3, this.c, (of3) obj, K2);
                break;
            default:
                ((Integer) obj2).getClass();
                int K3 = aba.K(i2 | 1);
                x2a.h(this.b, (Function0) obj7, this.c, (xhf) obj6, (io) obj5, (ct8) obj4, (tc3) obj3, (of3) obj, K3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ et2(vjj vjjVar, Function0 function0, jii jiiVar, jii jiiVar2, xtc xtcVar, boolean z, bt2 bt2Var, int i) {
        this.e = vjjVar;
        this.f = function0;
        this.g = jiiVar;
        this.h = jiiVar2;
        this.c = xtcVar;
        this.b = z;
        this.i = bt2Var;
        this.d = i;
    }

    public /* synthetic */ et2(boolean z, Function0 function0, xtc xtcVar, xhf xhfVar, io ioVar, ct8 ct8Var, tc3 tc3Var, int i) {
        this.b = z;
        this.f = function0;
        this.c = xtcVar;
        this.e = xhfVar;
        this.g = ioVar;
        this.h = ct8Var;
        this.i = tc3Var;
        this.d = i;
    }
}
