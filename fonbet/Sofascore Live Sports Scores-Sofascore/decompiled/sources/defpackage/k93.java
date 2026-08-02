package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class k93 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ k93(int i, String str, int i2) {
        this.a = 1;
        this.b = i;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                num.getClass();
                l93.b(this.c, of3Var, aba.K(this.b | 1));
                break;
            case 1:
                num.getClass();
                qea.b(this.b, aba.K(7), of3Var, this.c);
                break;
            default:
                num.intValue();
                rpm.c(this.c, of3Var, aba.K(this.b | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ k93(String str, int i, int i2) {
        this.a = i2;
        this.c = str;
        this.b = i;
    }
}
