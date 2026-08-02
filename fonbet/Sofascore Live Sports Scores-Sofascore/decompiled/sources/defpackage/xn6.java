package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class xn6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ jvg f;

    public /* synthetic */ xn6(ysd ysdVar, osa osaVar, qpa qpaVar, float f, Function1 function1, int i) {
        this.a = 2;
        this.b = ysdVar;
        this.e = osaVar;
        this.f = qpaVar;
        this.d = f;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        jvg jvgVar = this.f;
        Object obj3 = this.e;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                ao6.a((ppb) obj4, this.c, (qpa) jvgVar, this.d, (xtc) obj3, (of3) obj, K);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(1);
                eo6.a((ppb) obj4, this.c, (ksa) jvgVar, this.d, (xtc) obj3, (of3) obj, K2);
                break;
            default:
                ((Integer) obj2).getClass();
                int K3 = aba.K(65);
                j72.q((ysd) obj4, (osa) obj3, (qpa) jvgVar, this.d, this.c, (of3) obj, K3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xn6(ppb ppbVar, Function1 function1, jvg jvgVar, float f, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = ppbVar;
        this.c = function1;
        this.f = jvgVar;
        this.d = f;
        this.e = xtcVar;
    }
}
