package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class pu8 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pu8(int i, int i2, String str, long j) {
        this.b = i;
        this.d = str;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                pd0.f((gv9) this.d, this.c, (of3) obj, K, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(1);
                x2a.j(this.b, (String) this.d, this.c, (of3) obj, K2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ pu8(gv9 gv9Var, long j, int i, int i2) {
        this.d = gv9Var;
        this.c = j;
        this.b = i2;
    }
}
