package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class dt2 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ dt2(vl7 vl7Var, Function0 function0, Function2 function2, boolean z, boolean z2, int i, int i2) {
        this.f = vl7Var;
        this.e = function0;
        this.g = function2;
        this.c = z;
        this.d = z2;
        this.b = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.g;
        Object obj4 = this.e;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                l6g.d(this.c, (Function1) obj5, (xtc) obj4, this.d, (bt2) obj3, (of3) obj, K, this.b);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(1);
                ao2.d((FantasyRoundPlayerUiModel) obj5, this.b, this.c, this.d, (Function0) obj3, (xtc) obj4, (of3) obj, K2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int K3 = aba.K(i2 | 1);
                l6g.k(this.c, this.d, (String) obj5, (Function0) obj3, (xtc) obj4, (of3) obj, K3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int K4 = aba.K(1);
                iz8.j((vl7) obj5, (Function0) obj4, (Function2) obj3, this.c, this.d, (of3) obj, K4, this.b);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int K5 = aba.K(i2 | 1);
                boolean z = this.c;
                boolean z2 = this.d;
                vha.d((String) obj4, z, z2, (vnb) obj3, (Function1) obj5, (of3) obj, K5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int K6 = aba.K(i2 | 1);
                boolean z3 = this.c;
                k53.U((gv9) obj5, (wv9) obj3, z3, (xtc) obj4, this.d, (of3) obj, K6);
                break;
            default:
                ((Integer) obj2).getClass();
                kjl.b((String) obj5, (String) obj4, (n7g) obj3, this.c, this.d, (of3) obj, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ dt2(gv9 gv9Var, wv9 wv9Var, boolean z, xtc xtcVar, boolean z2, int i) {
        this.f = gv9Var;
        this.g = wv9Var;
        this.c = z;
        this.e = xtcVar;
        this.d = z2;
        this.b = i;
    }

    public /* synthetic */ dt2(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, int i, boolean z, boolean z2, Function0 function0, xtc xtcVar, int i2) {
        this.f = fantasyRoundPlayerUiModel;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.g = function0;
        this.e = xtcVar;
    }

    public /* synthetic */ dt2(String str, String str2, n7g n7gVar, boolean z, boolean z2, int i) {
        this.f = str;
        this.e = str2;
        this.g = n7gVar;
        this.c = z;
        this.d = z2;
        this.b = i;
    }

    public /* synthetic */ dt2(String str, boolean z, boolean z2, vnb vnbVar, Function1 function1, int i) {
        this.e = str;
        this.c = z;
        this.d = z2;
        this.g = vnbVar;
        this.f = function1;
        this.b = i;
    }

    public /* synthetic */ dt2(boolean z, Function1 function1, xtc xtcVar, boolean z2, bt2 bt2Var, int i, int i2) {
        this.c = z;
        this.f = function1;
        this.e = xtcVar;
        this.d = z2;
        this.g = bt2Var;
        this.b = i2;
    }

    public /* synthetic */ dt2(boolean z, boolean z2, String str, Function0 function0, xtc xtcVar, int i) {
        this.c = z;
        this.d = z2;
        this.f = str;
        this.g = function0;
        this.e = xtcVar;
        this.b = i;
    }
}
