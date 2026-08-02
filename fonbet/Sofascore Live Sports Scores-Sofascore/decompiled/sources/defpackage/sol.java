package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class sol implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boh c;

    public sol(boh bohVar, Function0 function0) {
        this.c = bohVar;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function0 function0 = this.b;
        boh bohVar = this.c;
        switch (i) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    function0.invoke();
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis2);
                    function0.invoke();
                }
                break;
        }
        return Unit.a;
    }

    public sol(Function0 function0, boh bohVar) {
        this.b = function0;
        this.c = bohVar;
    }
}
