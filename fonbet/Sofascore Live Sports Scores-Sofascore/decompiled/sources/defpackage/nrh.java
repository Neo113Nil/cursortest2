package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class nrh implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;
    public final /* synthetic */ gv9 c;
    public final /* synthetic */ lrh d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ nrh(gv9 gv9Var, gv9 gv9Var2, lrh lrhVar, Function1 function1, int i) {
        this.a = i;
        this.b = gv9Var;
        this.c = gv9Var2;
        this.d = lrhVar;
        this.e = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = nf3.a;
        final Function1 function1 = this.e;
        gv9 gv9Var = this.c;
        gv9<vt2> gv9Var2 = this.b;
        Object[] objArr = 0;
        final int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((d98) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    for (final vt2 vt2Var : gv9Var2) {
                        String str = vt2Var.b;
                        boolean contains = gv9Var.contains(vt2Var.a);
                        Object O = av8Var.O();
                        if (O == obj4) {
                            final Object[] objArr2 = objArr == true ? 1 : 0;
                            O = new Function0() { // from class: mrh
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i3 = objArr2;
                                    vt2 vt2Var2 = vt2Var;
                                    Function1 function12 = function1;
                                    switch (i3) {
                                        case 0:
                                            function12.invoke(vt2Var2.a);
                                            break;
                                        default:
                                            function12.invoke(vt2Var2.a);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            av8Var.n0(O);
                        }
                        qha.f(str, contains, this.d, (Function0) O, null, false, vt2Var.d, null, true, true, new hdd(), vt2Var.g, av8Var, 805309440, 4272);
                    }
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((kb8) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    for (final vt2 vt2Var2 : gv9Var2) {
                        String str2 = vt2Var2.b;
                        boolean contains2 = gv9Var.contains(vt2Var2.a);
                        boolean z = vt2Var2.c;
                        ct8 ct8Var = vt2Var2.d;
                        tt2 tt2Var = vt2Var2.g;
                        boolean g = av8Var2.g(function1) | av8Var2.g(vt2Var2);
                        Object O2 = av8Var2.O();
                        if (g || O2 == obj4) {
                            O2 = new Function0() { // from class: mrh
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i3 = i2;
                                    vt2 vt2Var22 = vt2Var2;
                                    Function1 function12 = function1;
                                    switch (i3) {
                                        case 0:
                                            function12.invoke(vt2Var22.a);
                                            break;
                                        default:
                                            function12.invoke(vt2Var22.a);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            av8Var2.n0(O2);
                        }
                        qha.f(str2, contains2, this.d, (Function0) O2, null, z, ct8Var, null, true, true, null, tt2Var, av8Var2, 805306368, 5264);
                    }
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
