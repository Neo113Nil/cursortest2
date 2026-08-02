package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class z73 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boh b;
    public final /* synthetic */ k83 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ z73(boh bohVar, k83 k83Var, Function1 function1, int i) {
        this.a = i;
        this.b = bohVar;
        this.c = k83Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.d;
        k83 k83Var = this.c;
        boh bohVar = this.b;
        switch (i) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    if (k83Var != null) {
                        function1.invoke(new mxg(k83Var.a));
                    }
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis2);
                    if (k83Var != null) {
                        function1.invoke(new mxg(k83Var.a));
                    }
                }
                break;
        }
        return Unit.a;
    }
}
