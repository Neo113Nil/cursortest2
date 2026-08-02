package li0;

import J4.s;
import J4.w;
import android.database.Cursor;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.joda.time.DateTime;
import ru.ozon.tracker.db.entities.DbEvent;
import ru.ozon.tracker.db.entities.EventStatus;
import ru.ozon.tracker.db.entities.EventType;

/* loaded from: classes7.dex */
final class f implements Callable<List<DbEvent>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f73361a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f73362b;

    f(e eVar, w wVar) {
        this.f73362b = eVar;
        this.f73361a = wVar;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final List<DbEvent> call() throws Exception {
        Cursor cursor;
        w wVar;
        e eVar;
        EventType eventType;
        EventStatus eventStatus;
        DateTime dateTime;
        e eVar2 = this.f73362b;
        s sVar = eVar2.f73342a;
        w wVar2 = this.f73361a;
        Cursor b11 = L4.b.b(sVar, wVar2, false);
        try {
            int b12 = L4.a.b(b11, "uuid");
            int b13 = L4.a.b(b11, "eventUuid");
            int b14 = L4.a.b(b11, "version");
            int b15 = L4.a.b(b11, "eventBody");
            int b16 = L4.a.b(b11, "type");
            int b17 = L4.a.b(b11, "markEventToSend");
            int b18 = L4.a.b(b11, "timestamp");
            ArrayList arrayList = new ArrayList(b11.getCount());
            while (b11.moveToNext()) {
                String string = b11.getString(b12);
                String string2 = b11.getString(b13);
                String string3 = b11.getString(b14);
                String string4 = b11.getString(b15);
                Integer valueOf = b11.isNull(b16) ? null : Integer.valueOf(b11.getInt(b16));
                if (valueOf != null) {
                    EventType[] values = EventType.values();
                    int length = values.length;
                    eVar = eVar2;
                    int i11 = 0;
                    while (i11 < length) {
                        eventType = values[i11];
                        int i12 = i11;
                        if (eventType.getType() == valueOf.intValue()) {
                            break;
                        }
                        i11 = i12 + 1;
                    }
                } else {
                    eVar = eVar2;
                }
                eventType = null;
                if (eventType == null) {
                    throw new IllegalStateException("Expected NON-NULL 'ru.ozon.tracker.db.entities.EventType', but it was NULL.");
                }
                Integer valueOf2 = b11.isNull(b17) ? null : Integer.valueOf(b11.getInt(b17));
                if (valueOf2 != null) {
                    EventStatus[] values2 = EventStatus.values();
                    int length2 = values2.length;
                    int i13 = 0;
                    while (i13 < length2) {
                        eventStatus = values2[i13];
                        Integer num = valueOf2;
                        EventStatus[] eventStatusArr = values2;
                        if (eventStatus.getStatus() == num.intValue()) {
                            break;
                        }
                        i13++;
                        valueOf2 = num;
                        values2 = eventStatusArr;
                    }
                }
                eventStatus = null;
                if (eventStatus == null) {
                    throw new IllegalStateException("Expected NON-NULL 'ru.ozon.tracker.db.entities.EventStatus', but it was NULL.");
                }
                Long valueOf3 = b11.isNull(b18) ? null : Long.valueOf(b11.getLong(b18));
                eVar.f73344c.getClass();
                if (valueOf3 != null) {
                    cursor = b11;
                    wVar = wVar2;
                    try {
                        dateTime = new DateTime(valueOf3.longValue());
                    } catch (Throwable th2) {
                        th = th2;
                        cursor.close();
                        wVar.release();
                        throw th;
                    }
                } else {
                    cursor = b11;
                    wVar = wVar2;
                    dateTime = null;
                }
                if (dateTime == null) {
                    throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                }
                arrayList.add(new DbEvent(string, string2, string3, string4, eventType, eventStatus, dateTime));
                wVar2 = wVar;
                b11 = cursor;
                eVar2 = eVar;
            }
            b11.close();
            wVar2.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursor = b11;
            wVar = wVar2;
        }
    }
}
