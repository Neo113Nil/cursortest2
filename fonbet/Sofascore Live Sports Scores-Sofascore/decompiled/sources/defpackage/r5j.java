package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class r5j implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ s5j b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        s5j s5jVar = this.b;
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                return s5j.l(s5jVar, of3Var, num.intValue());
            default:
                num.getClass();
                s5jVar.a(aba.K(1), of3Var);
                return Unit.a;
        }
    }
}
