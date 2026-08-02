package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uel implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boh b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ uel(int i, boh bohVar, Function1 function1) {
        this.a = i;
        this.b = bohVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.c;
        boh bohVar = this.b;
        switch (i) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    function1.invoke(zgl.a);
                }
                break;
            case 1:
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis2);
                    function1.invoke(sgl.a);
                }
                break;
            case 2:
                long currentTimeMillis3 = System.currentTimeMillis();
                if (currentTimeMillis3 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis3);
                    function1.invoke(ohl.a);
                }
                break;
            case 3:
                long currentTimeMillis4 = System.currentTimeMillis();
                if (currentTimeMillis4 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis4);
                    function1.invoke(thl.a);
                }
                break;
            default:
                long currentTimeMillis5 = System.currentTimeMillis();
                if (currentTimeMillis5 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis5);
                    function1.invoke(hhl.a);
                }
                break;
        }
        return Unit.a;
    }
}
