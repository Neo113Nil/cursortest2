package ru.ozon.app.android.search.widgets.history.search.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class HistoryViewHolder$showHistoryFiltersOnboarding$1 extends C7719a implements Function1<AtomAction, Unit> {
    HistoryViewHolder$showHistoryFiltersOnboarding$1(Object obj) {
        super(1, obj, HistoryViewHolder.class, "handleViewEvent", "handleViewEvent(Lru/ozon/uni/atoms/af/AtomAction;)Z", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((HistoryViewHolder) this.receiver).handleViewEvent(p02);
    }
}
