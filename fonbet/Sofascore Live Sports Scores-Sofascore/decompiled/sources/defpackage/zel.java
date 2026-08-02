package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class zel implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ zel(qel qelVar, xtc xtcVar, Integer num, float f, Function1 function1, int i) {
        this.f = qelVar;
        this.b = xtcVar;
        this.g = num;
        this.c = f;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                x2a.b((xel) obj4, (wla) obj3, this.b, this.c, this.d, (of3) obj, aba.K(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                xtc xtcVar = this.b;
                d7a.b((qel) obj4, xtcVar, (Integer) obj3, this.c, this.d, (of3) obj, K);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ zel(xel xelVar, wla wlaVar, xtc xtcVar, float f, Function1 function1, int i) {
        this.f = xelVar;
        this.g = wlaVar;
        this.b = xtcVar;
        this.c = f;
        this.d = function1;
        this.e = i;
    }
}
