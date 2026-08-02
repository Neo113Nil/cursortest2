package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class cs6 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ cs6(xtc xtcVar, Integer num, String str, int i, int i2) {
        this.b = xtcVar;
        this.c = num;
        this.d = str;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                xw3.k(aba.K(this.e | 1), (of3) obj, this.b, this.c, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                b9b.b(this.b, this.c, this.d, (of3) obj, K, this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cs6(Integer num, String str, xtc xtcVar, int i) {
        this.d = str;
        this.c = num;
        this.b = xtcVar;
        this.e = i;
    }
}
