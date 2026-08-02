package ru.ozon.app.android.platform.rv.looped;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.platform.rv.looped.LoopedRecyclerView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView$ItemPosition;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class LoopedRecyclerView$scrollListenerForPositionChanges$1 extends AbstractC7737t implements Function1<LoopedRecyclerView.ItemPosition, Unit> {
    final /* synthetic */ LoopedRecyclerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoopedRecyclerView$scrollListenerForPositionChanges$1(LoopedRecyclerView loopedRecyclerView) {
        super(1);
        this.this$0 = loopedRecyclerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LoopedRecyclerView.ItemPosition itemPosition) {
        invoke2(itemPosition);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LoopedRecyclerView.ItemPosition it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.logicCurrentPosition = it.getLogicPosition();
        LoopedRecyclerView loopedRecyclerView = this.this$0;
        Integer realPosition = it.getRealPosition();
        loopedRecyclerView.realCurrentPosition = realPosition != null ? realPosition.intValue() : this.this$0.realCurrentPosition;
    }
}
