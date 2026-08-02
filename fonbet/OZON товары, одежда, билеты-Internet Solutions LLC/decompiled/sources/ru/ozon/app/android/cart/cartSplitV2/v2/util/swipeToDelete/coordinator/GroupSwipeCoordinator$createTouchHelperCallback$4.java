package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeGroupState;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeGroupState;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class GroupSwipeCoordinator$createTouchHelperCallback$4 extends AbstractC7737t implements Function0<Map<String, ? extends SwipeGroupState>> {
    final /* synthetic */ GroupSwipeCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupSwipeCoordinator$createTouchHelperCallback$4(GroupSwipeCoordinator groupSwipeCoordinator) {
        super(0);
        this.this$0 = groupSwipeCoordinator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends SwipeGroupState> invoke() {
        Map<String, ? extends SwipeGroupState> map;
        map = this.this$0.activeSwipeGroups;
        return map;
    }
}
