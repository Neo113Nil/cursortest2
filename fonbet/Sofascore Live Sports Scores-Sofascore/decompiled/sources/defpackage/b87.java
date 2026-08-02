package defpackage;

import com.sofascore.local_persistance.Brand;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class b87 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ dt8 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ b87(tc3 tc3Var, Function0 function0, xtc xtcVar, Function2 function2, boolean z, cfc cfcVar, p3e p3eVar, wzc wzcVar, int i) {
        this.f = tc3Var;
        this.c = function0;
        this.j = xtcVar;
        this.g = function2;
        this.d = z;
        this.b = cfcVar;
        this.h = p3eVar;
        this.i = wzcVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.b;
        Object obj6 = this.g;
        Object obj7 = this.j;
        dt8 dt8Var = this.c;
        Object obj8 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                l6g.l((ho7) obj8, (rx6) obj6, (gv9) obj5, (String) obj4, (Function0) dt8Var, (Function0) obj3, this.d, (xtc) obj7, (of3) obj, K);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2 | 1);
                i9a.b((gv9) obj5, (Function1) obj8, (h1d) obj6, (Function0) dt8Var, (ad5) obj4, (oqf) obj3, (oqf) obj7, this.d, (of3) obj, K2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int K3 = aba.K(i2 | 1);
                sha.g((fwb) obj8, (mwb) obj6, (Brand) obj5, (wla) obj4, this.d, (Function1) dt8Var, (Function1) obj3, (xtc) obj7, (of3) obj, K3);
                break;
            default:
                ((Integer) obj2).getClass();
                int K4 = aba.K(i2 | 1);
                pea.c((tc3) obj8, (Function0) dt8Var, (xtc) obj7, (Function2) obj6, this.d, (cfc) obj5, (p3e) obj4, (wzc) obj3, (of3) obj, K4);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ b87(ho7 ho7Var, rx6 rx6Var, gv9 gv9Var, String str, Function0 function0, Function0 function02, boolean z, xtc xtcVar, int i) {
        this.f = ho7Var;
        this.g = rx6Var;
        this.b = gv9Var;
        this.h = str;
        this.c = function0;
        this.i = function02;
        this.d = z;
        this.j = xtcVar;
        this.e = i;
    }

    public /* synthetic */ b87(gv9 gv9Var, Function1 function1, h1d h1dVar, Function0 function0, ad5 ad5Var, oqf oqfVar, oqf oqfVar2, boolean z, int i) {
        this.b = gv9Var;
        this.f = function1;
        this.g = h1dVar;
        this.c = function0;
        this.h = ad5Var;
        this.i = oqfVar;
        this.j = oqfVar2;
        this.d = z;
        this.e = i;
    }

    public /* synthetic */ b87(fwb fwbVar, mwb mwbVar, Brand brand, wla wlaVar, boolean z, Function1 function1, Function1 function12, xtc xtcVar, int i) {
        this.f = fwbVar;
        this.g = mwbVar;
        this.b = brand;
        this.h = wlaVar;
        this.d = z;
        this.c = function1;
        this.i = function12;
        this.j = xtcVar;
        this.e = i;
    }
}
