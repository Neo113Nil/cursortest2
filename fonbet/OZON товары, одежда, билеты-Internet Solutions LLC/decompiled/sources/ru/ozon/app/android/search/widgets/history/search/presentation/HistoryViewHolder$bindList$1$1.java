package ru.ozon.app.android.search.widgets.history.search.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "vo", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class HistoryViewHolder$bindList$1$1 extends AbstractC7737t implements Function1<HistoryItem, Unit> {
    final /* synthetic */ HistoryViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryViewHolder$bindList$1$1(HistoryViewHolder historyViewHolder) {
        super(1);
        this.this$0 = historyViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(HistoryItem historyItem) {
        invoke2(historyItem);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HistoryItem vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.this$0.prefetch(vo);
    }
}
