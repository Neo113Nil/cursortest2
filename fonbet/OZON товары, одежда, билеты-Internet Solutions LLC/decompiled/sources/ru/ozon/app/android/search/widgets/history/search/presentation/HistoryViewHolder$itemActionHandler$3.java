package ru.ozon.app.android.search.widgets.history.search.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class HistoryViewHolder$itemActionHandler$3 extends C7735q implements Function1<AtomAction, Boolean> {
    HistoryViewHolder$itemActionHandler$3(Object obj) {
        super(1, obj, HistoryViewHolder.class, "handleViewEvent", "handleViewEvent(Lru/ozon/uni/atoms/af/AtomAction;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction p02) {
        boolean handleViewEvent;
        Intrinsics.checkNotNullParameter(p02, "p0");
        handleViewEvent = ((HistoryViewHolder) this.receiver).handleViewEvent(p02);
        return Boolean.valueOf(handleViewEvent);
    }
}
