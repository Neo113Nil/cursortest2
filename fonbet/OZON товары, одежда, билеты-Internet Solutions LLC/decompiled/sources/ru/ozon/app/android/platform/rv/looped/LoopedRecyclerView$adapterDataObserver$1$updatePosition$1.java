package ru.ozon.app.android.platform.rv.looped;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.platform.rv.looped.LoopedRecyclerView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class LoopedRecyclerView$adapterDataObserver$1$updatePosition$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ LoopedRecyclerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoopedRecyclerView$adapterDataObserver$1$updatePosition$1(LoopedRecyclerView loopedRecyclerView) {
        super(0);
        this.this$0 = loopedRecyclerView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        LoopedRecyclerView.ScrollListenerForPositionChanges scrollListenerForPositionChanges;
        LoopedRecyclerView loopedRecyclerView = this.this$0;
        loopedRecyclerView.itemsCount = loopedRecyclerView.getAdapter().getCorrectItemsCount();
        scrollListenerForPositionChanges = this.this$0.scrollListenerForPositionChanges;
        scrollListenerForPositionChanges.setItemsCount(this.this$0.getAdapter().getCorrectItemsCount());
        this.this$0.setInitialPosition();
    }
}
