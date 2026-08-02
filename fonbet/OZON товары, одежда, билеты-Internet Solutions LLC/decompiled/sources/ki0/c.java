package ki0;

import B1.C2548q;
import J4.l;
import androidx.annotation.NonNull;
import org.joda.time.DateTime;
import ru.ozon.tracker.db.TrackerDataBase_Impl;
import ru.ozon.tracker.db.entities.PerfEventEntity;

/* loaded from: classes7.dex */
final class c extends l<PerfEventEntity> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f71650a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar, TrackerDataBase_Impl trackerDataBase_Impl) {
        super(trackerDataBase_Impl);
        this.f71650a = bVar;
    }

    @Override // J4.l
    protected final void bind(@NonNull O4.f fVar, @NonNull PerfEventEntity perfEventEntity) {
        PerfEventEntity perfEventEntity2 = perfEventEntity;
        fVar.m0(1, perfEventEntity2.getId());
        if (perfEventEntity2.getUuid() == null) {
            fVar.C0(2);
        } else {
            fVar.e0(2, perfEventEntity2.getUuid());
        }
        if (perfEventEntity2.getRequestId() == null) {
            fVar.C0(3);
        } else {
            fVar.e0(3, perfEventEntity2.getRequestId());
        }
        C2548q c2548q = this.f71650a.f71638c;
        DateTime timestamp = perfEventEntity2.getTimestamp();
        c2548q.getClass();
        Long valueOf = timestamp != null ? Long.valueOf(timestamp.getMillis()) : null;
        if (valueOf == null) {
            fVar.C0(4);
        } else {
            fVar.m0(4, valueOf.longValue());
        }
        if (perfEventEntity2.getTestingToolName() == null) {
            fVar.C0(5);
        } else {
            fVar.e0(5, perfEventEntity2.getTestingToolName());
        }
        if (perfEventEntity2.getAttributes() == null) {
            fVar.C0(6);
        } else {
            fVar.e0(6, perfEventEntity2.getAttributes());
        }
        if (perfEventEntity2.getUser() == null) {
            fVar.C0(7);
        } else {
            fVar.e0(7, perfEventEntity2.getUser());
        }
        if (perfEventEntity2.getPage() == null) {
            fVar.C0(8);
        } else {
            fVar.e0(8, perfEventEntity2.getPage());
        }
        if (perfEventEntity2.getObj() == null) {
            fVar.C0(9);
        } else {
            fVar.e0(9, perfEventEntity2.getObj());
        }
        if (perfEventEntity2.getProps() == null) {
            fVar.C0(10);
        } else {
            fVar.e0(10, perfEventEntity2.getProps());
        }
        if (perfEventEntity2.getWidget() == null) {
            fVar.C0(11);
        } else {
            fVar.e0(11, perfEventEntity2.getWidget());
        }
        if (perfEventEntity2.getMetrics() == null) {
            fVar.C0(12);
        } else {
            fVar.e0(12, perfEventEntity2.getMetrics());
        }
        if (perfEventEntity2.getMap() == null) {
            fVar.C0(13);
        } else {
            fVar.e0(13, perfEventEntity2.getMap());
        }
        if (perfEventEntity2.getCustomMetrics() == null) {
            fVar.C0(14);
        } else {
            fVar.e0(14, perfEventEntity2.getCustomMetrics());
        }
        if (perfEventEntity2.getVideoMetrics() == null) {
            fVar.C0(15);
        } else {
            fVar.e0(15, perfEventEntity2.getVideoMetrics());
        }
        if (perfEventEntity2.getServerTimings() == null) {
            fVar.C0(16);
        } else {
            fVar.e0(16, perfEventEntity2.getServerTimings());
        }
        if (perfEventEntity2.getPclpage() == null) {
            fVar.C0(17);
        } else {
            fVar.e0(17, perfEventEntity2.getPclpage());
        }
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "INSERT OR ABORT INTO `performance_event` (`id`,`uuid`,`requestId`,`timestamp`,`testingToolName`,`attributes`,`user`,`page`,`obj`,`props`,`widget`,`metrics`,`map`,`customMetrics`,`videoMetrics`,`serverTimings`,`pclpage`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
