package defpackage;

import com.sofascore.results.event.statistics.EventStatisticsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class pb6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventStatisticsFragment b;

    public /* synthetic */ pb6(EventStatisticsFragment eventStatisticsFragment, int i) {
        this.a = i;
        this.b = eventStatisticsFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 1;
        EventStatisticsFragment eventStatisticsFragment = this.b;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ((String) obj).getClass();
                eventStatisticsFragment.C().p = true;
                nb6 C = eventStatisticsFragment.C();
                C.o = intValue;
                C.A();
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int intValue2 = ((Integer) obj2).intValue();
                if (booleanValue) {
                    ((sb6) eventStatisticsFragment.C.getValue()).setTargetPosition(intValue2);
                    krk krkVar = eventStatisticsFragment.l;
                    krkVar.getClass();
                    eventStatisticsFragment.t(((fo8) krkVar).c, new qb6(eventStatisticsFragment, i2));
                }
                break;
        }
        return Unit.a;
    }
}
