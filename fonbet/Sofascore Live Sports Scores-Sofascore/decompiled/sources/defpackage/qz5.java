package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qz5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boh b;
    public final /* synthetic */ mte c;
    public final /* synthetic */ Function1 d;

    public qz5(boh bohVar, mte mteVar, Function1 function1) {
        this.a = 1;
        this.b = bohVar;
        this.c = mteVar;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        mte mteVar = this.c;
        Function1 function1 = this.d;
        boh bohVar = this.b;
        switch (i) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    function1.invoke(Integer.valueOf(mteVar != null ? mteVar.a : -1));
                }
                break;
            case 1:
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis2);
                    if (mteVar != null) {
                        function1.invoke(Integer.valueOf(mteVar.a));
                    }
                }
                break;
            case 2:
                long currentTimeMillis3 = System.currentTimeMillis();
                if (currentTimeMillis3 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis3);
                    function1.invoke(Integer.valueOf(mteVar.a));
                }
                break;
            default:
                long currentTimeMillis4 = System.currentTimeMillis();
                if (currentTimeMillis4 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis4);
                    function1.invoke(Integer.valueOf(mteVar.a));
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qz5(boh bohVar, Function1 function1, mte mteVar, int i) {
        this.a = i;
        this.b = bohVar;
        this.d = function1;
        this.c = mteVar;
    }
}
