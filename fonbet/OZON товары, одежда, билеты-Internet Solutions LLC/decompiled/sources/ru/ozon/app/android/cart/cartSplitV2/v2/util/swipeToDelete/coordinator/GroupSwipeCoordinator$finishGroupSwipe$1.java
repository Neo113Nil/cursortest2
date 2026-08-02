package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.holder.SwipeableViewHolder;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeGroupState;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class GroupSwipeCoordinator$finishGroupSwipe$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Set<SwipeableViewHolder> $holders;
    final /* synthetic */ boolean $shouldOpen;
    final /* synthetic */ SwipeGroupState $state;
    final /* synthetic */ float $targetOffset;
    final /* synthetic */ GroupSwipeCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupSwipeCoordinator$finishGroupSwipe$1(GroupSwipeCoordinator groupSwipeCoordinator, SwipeGroupState swipeGroupState, Set<SwipeableViewHolder> set, boolean z11, float f7) {
        super(0);
        this.this$0 = groupSwipeCoordinator;
        this.$state = swipeGroupState;
        this.$holders = set;
        this.$shouldOpen = z11;
        this.$targetOffset = f7;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.finalizeSwipeState(this.$state, this.$holders, this.$shouldOpen, this.$targetOffset);
    }
}
