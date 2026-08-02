package defpackage;

import com.sofascore.model.mvvm.model.BaseballInningInfo;
import com.sofascore.model.mvvm.model.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class f81 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Event b;
    public final /* synthetic */ BaseballInningInfo c;
    public final /* synthetic */ h81 d;

    public /* synthetic */ f81(Event event, BaseballInningInfo baseballInningInfo, h81 h81Var, int i) {
        this.a = i;
        this.b = event;
        this.c = baseballInningInfo;
        this.d = h81Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        h81 h81Var = this.d;
        BaseballInningInfo baseballInningInfo = this.c;
        Event event = this.b;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(182160376, av8Var, new f81(event, baseballInningInfo, h81Var, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    v81.a(new w81(yid.m(Event.getHomeScore$default(event, null, 1, null).getDisplay()), yid.m(Event.getAwayScore$default(event, null, 1, null).getDisplay()), baseballInningInfo), h81Var.getProgress(), av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
