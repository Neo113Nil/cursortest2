package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class li4 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ li4(gv9 gv9Var, gv9 gv9Var2, ev6 ev6Var, il8 il8Var, boolean z, Function1 function1, boolean z2, boolean z3, Function0 function0) {
        this.f = gv9Var;
        this.g = gv9Var2;
        this.h = ev6Var;
        this.i = il8Var;
        this.b = z;
        this.j = function1;
        this.c = z2;
        this.d = z3;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                oj4.j((xtc) obj7, this.b, this.c, this.d, (String) obj6, this.e, (Function0) obj5, (Function0) obj4, (ci4) obj3, (of3) obj, aba.K(7));
                break;
            default:
                gv9 gv9Var = (gv9) obj7;
                gv9 gv9Var2 = (gv9) obj6;
                ev6 ev6Var = (ev6) obj5;
                il8 il8Var = (il8) obj4;
                Function1 function1 = (Function1) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    s02.g(gv9Var, gv9Var2, ev6Var, il8Var, this.b, function1, this.c, this.d, this.e, null, false, false, av8Var, 0, 0, 3584);
                } else {
                    av8Var.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ li4(xtc xtcVar, boolean z, boolean z2, boolean z3, String str, Function0 function0, Function0 function02, Function0 function03, ci4 ci4Var, int i) {
        this.f = xtcVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.g = str;
        this.e = function0;
        this.h = function02;
        this.i = function03;
        this.j = ci4Var;
    }
}
