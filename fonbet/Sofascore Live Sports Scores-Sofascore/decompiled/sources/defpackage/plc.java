package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class plc extends y21 {
    public final MmaEvent O;

    public plc(MmaEvent mmaEvent) {
        this.O = mmaEvent;
    }

    @Override // defpackage.y21
    public final Event d() {
        return this.O;
    }

    @Override // defpackage.y21
    public final void h(Context context, Event event) {
        Integer winnerCode$default;
        MmaEvent mmaEvent = (MmaEvent) event;
        Integer valueOf = Integer.valueOf(R.color.secondary_default);
        context.getClass();
        mmaEvent.getClass();
        if (ok3.C(mmaEvent)) {
            Integer winnerCode$default2 = Event.getWinnerCode$default(mmaEvent, null, 1, null);
            if ((winnerCode$default2 != null && winnerCode$default2.intValue() == 1) || ((winnerCode$default = Event.getWinnerCode$default(mmaEvent, null, 1, null)) != null && winnerCode$default.intValue() == 2)) {
                Integer winnerCode$default3 = Event.getWinnerCode$default(mmaEvent, null, 1, null);
                String str = (winnerCode$default3 != null && winnerCode$default3.intValue() == 1) ? "W" : null;
                if (str == null) {
                    str = "L";
                }
                Integer winnerCode$default4 = Event.getWinnerCode$default(mmaEvent, null, 1, null);
                Integer num = (winnerCode$default4 != null && winnerCode$default4.intValue() == 1) ? valueOf : null;
                int i = R.color.error;
                this.e = new jfj(4, str, Integer.valueOf(num != null ? num.intValue() : R.color.error));
                Integer winnerCode$default5 = Event.getWinnerCode$default(mmaEvent, null, 1, null);
                String str2 = (winnerCode$default5 == null || winnerCode$default5.intValue() != 2) ? null : "W";
                String str3 = str2 != null ? str2 : "L";
                Integer winnerCode$default6 = Event.getWinnerCode$default(mmaEvent, null, 1, null);
                if (winnerCode$default6 == null || winnerCode$default6.intValue() != 2) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    i = valueOf.intValue();
                }
                this.f = new jfj(4, str3, Integer.valueOf(i));
            }
        }
    }
}
