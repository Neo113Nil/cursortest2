package ru.ozon.tracker.sendEvent;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.tracker.db.entities.DbEvent;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/tracker/db/entities/DbEvent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class EventManagerImpl$sendBatches$2$1$2 extends AbstractC7737t implements Function1<DbEvent, String> {
    public static final EventManagerImpl$sendBatches$2$1$2 INSTANCE = new EventManagerImpl$sendBatches$2$1$2();

    EventManagerImpl$sendBatches$2$1$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(DbEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getEventBody();
    }
}
