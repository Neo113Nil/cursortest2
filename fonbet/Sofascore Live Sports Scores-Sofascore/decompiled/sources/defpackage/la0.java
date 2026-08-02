package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class la0 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ dt8 h;
    public final /* synthetic */ dt8 i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ la0(ek0 ek0Var, String str, xtc xtcVar, Function1 function1, Function1 function12, io ioVar, op3 op3Var, float f, int i, int i2) {
        this.f = ek0Var;
        this.g = str;
        this.b = xtcVar;
        this.h = function1;
        this.i = function12;
        this.j = ioVar;
        this.k = op3Var;
        this.c = f;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        int i3 = this.d;
        Object obj3 = this.k;
        Object obj4 = this.j;
        dt8 dt8Var = this.i;
        dt8 dt8Var2 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i3 | 1);
                int K2 = aba.K(i2);
                oa0.a(this.b, (dfj) obj6, (dfj) obj5, (tc3) dt8Var2, (ct8) dt8Var, this.c, (w8l) obj4, (zkj) obj3, (of3) obj, K, K2);
                break;
            default:
                ((Integer) obj2).getClass();
                int K3 = aba.K(i3 | 1);
                int K4 = aba.K(i2);
                s9a.a((ek0) obj6, (String) obj5, this.b, (Function1) dt8Var2, (Function1) dt8Var, (io) obj4, (op3) obj3, this.c, (of3) obj, K3, K4);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ la0(xtc xtcVar, dfj dfjVar, dfj dfjVar2, tc3 tc3Var, ct8 ct8Var, float f, w8l w8lVar, zkj zkjVar, int i, int i2) {
        this.b = xtcVar;
        this.f = dfjVar;
        this.g = dfjVar2;
        this.h = tc3Var;
        this.i = ct8Var;
        this.c = f;
        this.j = w8lVar;
        this.k = zkjVar;
        this.d = i;
        this.e = i2;
    }
}
