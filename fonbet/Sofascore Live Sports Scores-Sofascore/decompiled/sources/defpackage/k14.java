package defpackage;

import com.sofascore.results.event.details.view.cricket.wagonwheel.CricketWagonWheelView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class k14 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CricketWagonWheelView b;

    public /* synthetic */ k14(CricketWagonWheelView cricketWagonWheelView, int i) {
        this.a = i;
        this.b = cricketWagonWheelView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        CricketWagonWheelView cricketWagonWheelView = this.b;
        switch (i) {
            case 0:
                return CricketWagonWheelView.j(cricketWagonWheelView, (of3) obj, ((Integer) obj2).intValue());
            default:
                String str = (String) obj;
                ((Integer) obj2).getClass();
                int i2 = CricketWagonWheelView.l;
                str.getClass();
                cricketWagonWheelView.q(str);
                return Unit.a;
        }
    }
}
