package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class u81 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ u81(int i, int i2) {
        this.a = 0;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                num.intValue();
                v81.d(this.b, aba.K(this.c | 1), of3Var);
                break;
            case 1:
                num.getClass();
                hxk.e(this.b, this.c, aba.K(1), of3Var);
                break;
            default:
                num.getClass();
                vha.f(this.b, this.c, aba.K(7), of3Var);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ u81(int i, int i2, int i3, int i4) {
        this.a = i4;
        this.b = i;
        this.c = i2;
    }
}
