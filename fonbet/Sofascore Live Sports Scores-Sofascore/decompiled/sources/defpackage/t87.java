package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class t87 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ku3 b;
    public final /* synthetic */ dfh c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ t87(dfh dfhVar, ku3 ku3Var, Function0 function0) {
        this.a = 4;
        this.c = dfhVar;
        this.b = ku3Var;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 0;
        int i3 = 7;
        int i4 = 8;
        int i5 = 2;
        int i6 = 1;
        rq3 rq3Var = null;
        ku3 ku3Var = this.b;
        Function0 function0 = this.d;
        dfh dfhVar = this.c;
        int i7 = 3;
        switch (i) {
            case 0:
                xw3.L(ku3Var, null, null, new u87(dfhVar, rq3Var, i2), 3).n(new ma0(5, function0));
                break;
            case 1:
                xw3.L(ku3Var, null, null, new u87(dfhVar, rq3Var, i6), 3).n(new ma0(6, function0));
                break;
            case 2:
                xw3.L(ku3Var, null, null, new u87(dfhVar, rq3Var, i5), 3).n(new ma0(7, function0));
                break;
            case 3:
                xw3.L(ku3Var, null, null, new u87(dfhVar, rq3Var, i7), 3).n(new ma0(8, function0));
                break;
            case 4:
                if (((Boolean) ((Function1) dfhVar.d.b).invoke(efh.a)).booleanValue()) {
                    xw3.L(ku3Var, null, null, new u87(dfhVar, rq3Var, i3), 3).n(new xsc(dfhVar, function0, 0));
                }
                break;
            default:
                int ordinal = ((efh) ((eoh) ((e1d) dfhVar.d.c)).getValue()).ordinal();
                if (ordinal == 1) {
                    function0.invoke();
                    Unit unit = Unit.a;
                } else if (ordinal != 2) {
                    xw3.L(ku3Var, null, null, new u87(dfhVar, rq3Var, 9), 3);
                } else {
                    xw3.L(ku3Var, null, null, new u87(dfhVar, rq3Var, i4), 3);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ t87(ku3 ku3Var, dfh dfhVar, Function0 function0, int i) {
        this.a = i;
        this.b = ku3Var;
        this.c = dfhVar;
        this.d = function0;
    }

    public /* synthetic */ t87(dfh dfhVar, Function0 function0, ku3 ku3Var) {
        this.a = 5;
        this.c = dfhVar;
        this.d = function0;
        this.b = ku3Var;
    }
}
