package defpackage;

import com.blaze.blazesdk.delegates.BlazeWidgetDelegate;
import com.sofascore.model.newNetwork.statistics.BaseballSeasonPitchesPerspective;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class e41 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ dt8 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ e41(ul1 ul1Var, gv9 gv9Var, kl1 kl1Var, BaseballSeasonPitchesPerspective baseballSeasonPitchesPerspective, Function1 function1, Function1 function12, Function1 function13, Function0 function0, int i) {
        this.e = ul1Var;
        this.f = gv9Var;
        this.g = kl1Var;
        this.h = baseballSeasonPitchesPerspective;
        this.b = function1;
        this.i = function12;
        this.j = function13;
        this.c = function0;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.j;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        dt8 dt8Var = this.b;
        Object obj7 = this.i;
        Object obj8 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                rfo.a((tc3) obj8, (tc3) obj6, (f41) obj5, (xtc) obj4, (String) obj7, (String) obj3, (Function1) dt8Var, this.c, (of3) obj, K);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2 | 1);
                o02.G((ul1) obj8, (gv9) obj6, (kl1) obj5, (BaseballSeasonPitchesPerspective) obj4, (Function1) dt8Var, (Function1) obj7, (Function1) obj3, this.c, (of3) obj, K2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int K3 = aba.K(i2 | 1);
                wkn.g(this.c, (s67) obj8, (Function0) obj6, (xtc) obj4, (s67) obj5, (Function0) obj7, (s67) obj3, (Function0) dt8Var, (of3) obj, K3);
                break;
            default:
                ((Integer) obj2).getClass();
                int K4 = aba.K(i2 | 1);
                rpm.b((lrl) obj8, (String) obj7, (Function1) dt8Var, (Function1) obj6, this.c, (Function0) obj5, (BlazeWidgetDelegate) obj4, (p3e) obj3, (of3) obj, K4);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ e41(tc3 tc3Var, tc3 tc3Var2, f41 f41Var, xtc xtcVar, String str, String str2, Function1 function1, Function0 function0, int i) {
        this.e = tc3Var;
        this.f = tc3Var2;
        this.g = f41Var;
        this.h = xtcVar;
        this.i = str;
        this.j = str2;
        this.b = function1;
        this.c = function0;
        this.d = i;
    }

    public /* synthetic */ e41(lrl lrlVar, String str, Function1 function1, Function1 function12, Function0 function0, Function0 function02, BlazeWidgetDelegate blazeWidgetDelegate, p3e p3eVar, int i) {
        this.e = lrlVar;
        this.i = str;
        this.b = function1;
        this.f = function12;
        this.c = function0;
        this.g = function02;
        this.h = blazeWidgetDelegate;
        this.j = p3eVar;
        this.d = i;
    }

    public /* synthetic */ e41(Function0 function0, s67 s67Var, Function0 function02, xtc xtcVar, s67 s67Var2, Function0 function03, s67 s67Var3, Function0 function04, int i) {
        this.c = function0;
        this.e = s67Var;
        this.f = function02;
        this.h = xtcVar;
        this.g = s67Var2;
        this.i = function03;
        this.j = s67Var3;
        this.b = function04;
        this.d = i;
    }
}
