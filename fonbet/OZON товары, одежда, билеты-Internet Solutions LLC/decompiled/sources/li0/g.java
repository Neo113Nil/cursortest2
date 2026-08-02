package li0;

import B1.C2548q;
import androidx.annotation.NonNull;
import org.joda.time.DateTime;
import ru.ozon.tracker.db.TrackerDataBase_Impl;
import ru.ozon.tracker.db.entities.DbEvent;
import ru.ozon.tracker.db.entities.EventStatus;
import ru.ozon.tracker.db.entities.EventType;

/* loaded from: classes7.dex */
final class g extends J4.l<DbEvent> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f73363a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(e eVar, TrackerDataBase_Impl trackerDataBase_Impl) {
        super(trackerDataBase_Impl);
        this.f73363a = eVar;
    }

    @Override // J4.l
    protected final void bind(@NonNull O4.f fVar, @NonNull DbEvent dbEvent) {
        DbEvent dbEvent2 = dbEvent;
        fVar.e0(1, dbEvent2.getUuid());
        fVar.e0(2, dbEvent2.getEventUuid());
        fVar.e0(3, dbEvent2.getVersion());
        fVar.e0(4, dbEvent2.getEventBody());
        EventType type = dbEvent2.getType();
        if ((type != null ? Integer.valueOf(type.getType()) : null) == null) {
            fVar.C0(5);
        } else {
            fVar.m0(5, r0.intValue());
        }
        EventStatus markEventToSend = dbEvent2.getMarkEventToSend();
        if ((markEventToSend != null ? Integer.valueOf(markEventToSend.getStatus()) : null) == null) {
            fVar.C0(6);
        } else {
            fVar.m0(6, r0.intValue());
        }
        C2548q c2548q = this.f73363a.f73344c;
        DateTime timestamp = dbEvent2.getTimestamp();
        c2548q.getClass();
        Long valueOf = timestamp != null ? Long.valueOf(timestamp.getMillis()) : null;
        if (valueOf == null) {
            fVar.C0(7);
        } else {
            fVar.m0(7, valueOf.longValue());
        }
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "INSERT OR REPLACE INTO `event` (`uuid`,`eventUuid`,`version`,`eventBody`,`type`,`markEventToSend`,`timestamp`) VALUES (?,?,?,?,?,?,?)";
    }
}
