package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class eel implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn1 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ eel(Function1 function1, wn1 wn1Var) {
        this.a = 2;
        this.c = function1;
        this.b = wn1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        wn1 wn1Var = this.b;
        Function1 function1 = this.c;
        switch (i) {
            case 0:
                if (wn1Var != null) {
                    function1.invoke(Integer.valueOf(wn1Var.a));
                }
                break;
            case 1:
                if (wn1Var != null) {
                    function1.invoke(Integer.valueOf(wn1Var.a));
                }
                break;
            default:
                function1.invoke(new ugl(wn1Var.a));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ eel(wn1 wn1Var, Function1 function1, int i) {
        this.a = i;
        this.b = wn1Var;
        this.c = function1;
    }
}
