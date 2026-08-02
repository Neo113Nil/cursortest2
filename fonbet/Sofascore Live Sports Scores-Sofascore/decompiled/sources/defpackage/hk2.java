package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class hk2 implements Function2 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ int c;
    public final /* synthetic */ dt8 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ hk2(xtc xtcVar, lg0 lg0Var, pg0 pg0Var, lv1 lv1Var, int i, jb8 jb8Var, tc3 tc3Var, int i2) {
        this.b = xtcVar;
        this.f = lg0Var;
        this.g = pg0Var;
        this.h = lv1Var;
        this.c = i;
        this.i = jb8Var;
        this.d = tc3Var;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        dt8 dt8Var = this.d;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                un0.a(this.b, (uah) obj6, (ek2) obj5, (gk2) obj4, (qz1) obj3, (tc3) dt8Var, (of3) obj, K, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(this.e | 1);
                s02.o(this.b, (lg0) obj6, (pg0) obj5, (lv1) obj4, this.c, (jb8) obj3, (tc3) dt8Var, (of3) obj, K2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int K3 = aba.K(i2 | 1);
                jca.i((String) obj6, (String) obj5, (String) obj4, (ImageVector) obj3, this.b, (Function2) dt8Var, (of3) obj, K3, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int K4 = aba.K(i2 | 1);
                hda.e((ale) obj6, this.b, (Function1) obj5, (Function2) obj4, (Function2) obj3, (Function1) dt8Var, (of3) obj, K4, this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hk2(xtc xtcVar, uah uahVar, ek2 ek2Var, gk2 gk2Var, qz1 qz1Var, tc3 tc3Var, int i, int i2) {
        this.b = xtcVar;
        this.f = uahVar;
        this.g = ek2Var;
        this.h = gk2Var;
        this.i = qz1Var;
        this.d = tc3Var;
        this.c = i;
        this.e = i2;
    }

    public /* synthetic */ hk2(ale aleVar, xtc xtcVar, Function1 function1, Function2 function2, Function2 function22, Function1 function12, int i, int i2) {
        this.f = aleVar;
        this.b = xtcVar;
        this.g = function1;
        this.h = function2;
        this.i = function22;
        this.d = function12;
        this.c = i;
        this.e = i2;
    }

    public /* synthetic */ hk2(String str, String str2, String str3, ImageVector imageVector, xtc xtcVar, Function2 function2, int i, int i2) {
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = imageVector;
        this.b = xtcVar;
        this.d = function2;
        this.c = i;
        this.e = i2;
    }
}
