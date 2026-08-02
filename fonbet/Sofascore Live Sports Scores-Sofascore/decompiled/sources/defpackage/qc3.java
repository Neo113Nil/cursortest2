package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class qc3 implements Function2 {
    public final /* synthetic */ int a = 4;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ qc3(tc3 tc3Var, Context context, Object obj, Integer num, Object obj2, Object obj3, Function0 function0, Object obj4, Object obj5, int i) {
        this.b = tc3Var;
        this.g = context;
        this.c = obj;
        this.j = num;
        this.d = obj2;
        this.e = obj3;
        this.k = function0;
        this.h = obj4;
        this.i = obj5;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        int i2 = this.f;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.j;
        Object obj9 = this.k;
        Object obj10 = this.g;
        Object obj11 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2) | 1;
                ((tc3) obj11).b((Context) obj10, this.c, (Integer) obj8, this.d, this.e, (Function0) obj9, this.h, this.i, (of3) obj, K);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2) | 1;
                ((tc3) obj11).c((Boolean) obj10, (Boolean) obj7, this.c, this.d, (Boolean) obj6, (Comparable) obj8, (y7k) obj9, this.e, (of3) obj, K2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                k44.c((l44) obj11, (Function1) obj10, (Function1) obj5, (Function1) obj4, (Function1) obj3, (Function0) obj9, (Function0) obj7, (Function1) obj6, (Function1) obj8, (of3) obj, aba.K(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                oj4.g((ksa) obj11, (Long) obj10, (Function1) obj5, (Function1) obj4, (kg2) obj3, (IntRange) obj7, (gi4) obj6, (di4) obj8, (ci4) obj9, (of3) obj, aba.K(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int K3 = aba.K(1);
                s02.e((do7) obj11, (ho7) obj10, (mj7) obj5, this.f, (sd7) obj4, (Function0) obj9, (Function0) obj3, (Function0) obj7, (Function0) obj6, (xtc) obj8, (of3) obj, K3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qc3(tc3 tc3Var, Boolean bool, Boolean bool2, Object obj, Object obj2, Boolean bool3, Comparable comparable, y7k y7kVar, Object obj3, int i) {
        this.b = tc3Var;
        this.g = bool;
        this.h = bool2;
        this.c = obj;
        this.d = obj2;
        this.i = bool3;
        this.j = comparable;
        this.k = y7kVar;
        this.e = obj3;
        this.f = i;
    }

    public /* synthetic */ qc3(l44 l44Var, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Function0 function02, Function1 function15, Function1 function16, int i) {
        this.b = l44Var;
        this.g = function1;
        this.c = function12;
        this.d = function13;
        this.e = function14;
        this.k = function0;
        this.h = function02;
        this.i = function15;
        this.j = function16;
        this.f = i;
    }

    public /* synthetic */ qc3(do7 do7Var, ho7 ho7Var, mj7 mj7Var, int i, sd7 sd7Var, Function0 function0, Function0 function02, Function0 function03, Function0 function04, xtc xtcVar, int i2) {
        this.b = do7Var;
        this.g = ho7Var;
        this.c = mj7Var;
        this.f = i;
        this.d = sd7Var;
        this.k = function0;
        this.e = function02;
        this.h = function03;
        this.i = function04;
        this.j = xtcVar;
    }

    public /* synthetic */ qc3(ksa ksaVar, Long l, Function1 function1, Function1 function12, kg2 kg2Var, IntRange intRange, gi4 gi4Var, di4 di4Var, ci4 ci4Var, int i) {
        this.b = ksaVar;
        this.g = l;
        this.c = function1;
        this.d = function12;
        this.e = kg2Var;
        this.h = intRange;
        this.i = gi4Var;
        this.j = di4Var;
        this.k = ci4Var;
        this.f = i;
    }
}
