package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.util.MonthWithYear;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lvpc;", "Lq8;", "qpc", "rpc", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class vpc extends q8 {
    public final wqc e;
    public final yzc f;
    public final yzc g;
    public final yzc h;
    public final yzc i;
    public g9i j;
    public g9i k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpc(Application application, wqc wqcVar) {
        super(application);
        wqcVar.getClass();
        this.e = wqcVar;
        yzc yzcVar = new yzc();
        this.f = yzcVar;
        this.g = yzcVar;
        yzc yzcVar2 = new yzc();
        this.h = yzcVar2;
        this.i = yzcVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable k(int i, MonthWithYear monthWithYear, sq3 sq3Var) {
        upc upcVar;
        int i2;
        EventListResponse eventListResponse;
        List<Event> events;
        Calendar calendar;
        Calendar calendar2;
        if (sq3Var instanceof upc) {
            upcVar = (upc) sq3Var;
            int i3 = upcVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                upcVar.u = i3 - Integer.MIN_VALUE;
                Object obj = upcVar.s;
                lu3 lu3Var = lu3.a;
                i2 = upcVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    String format = String.format(Locale.US, "%d-%02d", Arrays.copyOf(new Object[]{new Integer(monthWithYear.getYear()), new Integer(monthWithYear.getMonth())}, 2));
                    upcVar.r = monthWithYear;
                    upcVar.u = 1;
                    obj = this.e.d(i, format, upcVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    monthWithYear = upcVar.r;
                    y6a.M(obj);
                }
                eventListResponse = (EventListResponse) obj;
                if (eventListResponse != null || (events = eventListResponse.getEvents()) == null) {
                    return km5.a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : events) {
                    Event event = (Event) obj2;
                    if (Intrinsics.c(event.getTournament().isLive(), Boolean.FALSE) && (me4.t(StatusKt.STATUS_FINISHED, event) || (ph0.v(new String[]{StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}, event.getStatus().getType()) && event.getStartTimestamp() * 1000 <= System.currentTimeMillis()))) {
                        Long startTimestamp = event.getTournament().getStartTimestamp();
                        Long endTimestamp = event.getTournament().getEndTimestamp();
                        monthWithYear.getClass();
                        if (startTimestamp != null || endTimestamp != null) {
                            if (startTimestamp != null) {
                                long longValue = startTimestamp.longValue();
                                calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(longValue * 1000);
                            } else {
                                calendar = null;
                            }
                            if (endTimestamp != null) {
                                long longValue2 = endTimestamp.longValue();
                                calendar2 = Calendar.getInstance();
                                calendar2.setTimeInMillis(longValue2 * 1000);
                            } else {
                                calendar2 = null;
                            }
                            Calendar calendar3 = Calendar.getInstance();
                            calendar3.set(monthWithYear.getYear(), monthWithYear.getMonth() - 1, 1);
                            if (calendar != null) {
                                if (calendar.get(2) == calendar3.get(2)) {
                                }
                            }
                            if (calendar2 != null && calendar2.get(2) == calendar3.get(2)) {
                            }
                        }
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        }
        upcVar = new upc(this, sq3Var);
        Object obj3 = upcVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = upcVar.u;
        if (i2 != 0) {
        }
        eventListResponse = (EventListResponse) obj3;
        if (eventListResponse != null) {
        }
        return km5.a;
    }
}
