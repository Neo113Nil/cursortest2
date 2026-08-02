package defpackage;

import com.sofascore.results.calendar.CalendarView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class sg2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CalendarView b;

    public /* synthetic */ sg2(CalendarView calendarView, int i) {
        this.a = i;
        this.b = calendarView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        CalendarView calendarView = this.b;
        switch (i) {
            case 0:
                int i2 = CalendarView.i;
                return new wg2(calendarView);
            default:
                int i3 = CalendarView.i;
                calendarView.a(false);
                Function0 function0 = calendarView.selectWorldCupCallback;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.a;
        }
    }
}
