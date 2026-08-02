package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class ks9 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ ks9(d7e d7eVar, String str, xtc xtcVar, io ioVar, op3 op3Var, float f, ay1 ay1Var, int i, int i2) {
        this.g = d7eVar;
        this.b = str;
        this.c = xtcVar;
        this.h = ioVar;
        this.i = op3Var;
        this.d = f;
        this.j = ay1Var;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                wkn.k((d7e) obj6, this.b, this.c, (io) obj5, (op3) obj4, this.d, (ay1) obj3, (of3) obj, K, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2 | 1);
                sha.m((unj) obj6, (vmj) obj5, this.b, this.c, (Integer) obj4, this.d, (Function2) obj3, (of3) obj, K2, this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ks9(unj unjVar, vmj vmjVar, String str, xtc xtcVar, Integer num, float f, Function2 function2, int i, int i2) {
        this.g = unjVar;
        this.h = vmjVar;
        this.b = str;
        this.c = xtcVar;
        this.i = num;
        this.d = f;
        this.j = function2;
        this.e = i;
        this.f = i2;
    }
}
