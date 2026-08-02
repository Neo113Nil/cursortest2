package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class su5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ su5(int i, Function2 function2) {
        this.a = i;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function2 function2 = this.b;
        switch (i) {
            case 0:
                Integer num = (Integer) obj;
                num.intValue();
                function2.invoke(num, Boolean.TRUE);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                function2.invoke(str, null);
                break;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                function2.invoke(null, str2);
                break;
            default:
                b80 b80Var = (b80) obj;
                function2.invoke(((eoh) b80Var.e).getValue(), lz.f.b.invoke(b80Var.f));
                break;
        }
        return Unit.a;
    }
}
