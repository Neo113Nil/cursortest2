package defpackage;

import com.sofascore.results.calendar.CalendarView;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ug2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CalendarView b;

    public /* synthetic */ ug2(CalendarView calendarView, int i) {
        this.a = i;
        this.b = calendarView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Long b;
        int i = this.a;
        CalendarView calendarView = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = CalendarView.i;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-1753193136, av8Var, new ug2(calendarView, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i4 = CalendarView.i;
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    hg2 hg2Var = calendarView.calendarLogic;
                    cdi M = hda.M((hg2Var == null || (b = hg2Var.b()) == null) ? 0L : b.longValue(), av8Var2, 0);
                    if (((js8) M.getValue()).a) {
                        av8Var2.d0(1720768715);
                        xtc f0 = l98.f0(utc.a, 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                        js8 js8Var = (js8) M.getValue();
                        boolean i5 = av8Var2.i(calendarView);
                        Object O = av8Var2.O();
                        if (i5 || O == nf3.a) {
                            O = new sg2(calendarView, 1);
                            av8Var2.n0(O);
                        }
                        i9a.o(js8Var, f0, false, null, null, null, null, null, (Function0) O, av8Var2, 0, 252);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(1721170258);
                        av8Var2.s(false);
                    }
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
