package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class nj6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ nj6(int i, int i2, int i3, Function0 function0) {
        this.a = i3;
        this.b = i;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                num.getClass();
                qx9.k(this.c, of3Var, aba.K(this.b | 1));
                break;
            case 1:
                num.getClass();
                fsd.g(this.b, this.c, of3Var, aba.K(49));
                break;
            case 2:
                num.getClass();
                fsd.e(this.b, this.c, of3Var, aba.K(1));
                break;
            case 3:
                num.getClass();
                fsd.d(this.b, this.c, of3Var, aba.K(1));
                break;
            default:
                num.intValue();
                sea.e(this.c, of3Var, aba.K(this.b | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ nj6(int i, int i2, Function0 function0) {
        this.a = i2;
        this.c = function0;
        this.b = i;
    }
}
