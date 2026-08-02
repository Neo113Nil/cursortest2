package defpackage;

import com.sofascore.results.wc26.widget.configurationActivity.WorldCupWidgetConfigActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ykl implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WorldCupWidgetConfigActivity b;

    public /* synthetic */ ykl(WorldCupWidgetConfigActivity worldCupWidgetConfigActivity, int i) {
        this.a = i;
        this.b = worldCupWidgetConfigActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-523149598, av8Var, new ykl(this.b, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    int i3 = WorldCupWidgetConfigActivity.N;
                    WorldCupWidgetConfigActivity worldCupWidgetConfigActivity = this.b;
                    ill illVar = (ill) worldCupWidgetConfigActivity.M.getValue();
                    boolean i4 = av8Var2.i(worldCupWidgetConfigActivity);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (i4 || O == a99Var) {
                        zkl zklVar = new zkl(0, worldCupWidgetConfigActivity, WorldCupWidgetConfigActivity.class, "confirmWidget", "confirmWidget()V", 0, 0);
                        av8Var2.n0(zklVar);
                        O = zklVar;
                    }
                    Function0 function0 = (Function0) ((KFunction) O);
                    boolean i5 = av8Var2.i(worldCupWidgetConfigActivity);
                    Object O2 = av8Var2.O();
                    if (i5 || O2 == a99Var) {
                        O2 = new zkl(0, worldCupWidgetConfigActivity, WorldCupWidgetConfigActivity.class, "finish", "finish()V", 0, 1);
                        av8Var2.n0(O2);
                    }
                    gz8.w(illVar, function0, (Function0) ((KFunction) O2), av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
