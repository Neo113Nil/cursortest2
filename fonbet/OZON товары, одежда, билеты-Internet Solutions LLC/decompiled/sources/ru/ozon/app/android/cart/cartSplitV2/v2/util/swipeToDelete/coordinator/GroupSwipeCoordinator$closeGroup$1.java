package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.holder.SwipeableViewHolder;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeGroupState;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class GroupSwipeCoordinator$closeGroup$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Set<SwipeableViewHolder> $holders;
    final /* synthetic */ SwipeGroupState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupSwipeCoordinator$closeGroup$1(SwipeGroupState swipeGroupState, Set<SwipeableViewHolder> set) {
        super(0);
        this.$state = swipeGroupState;
        this.$holders = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$state.setOpen(false);
        Iterator<T> it = this.$holders.iterator();
        while (it.hasNext()) {
            ((SwipeableViewHolder) it.next()).onSwipeStateChanged(false);
        }
    }
}
