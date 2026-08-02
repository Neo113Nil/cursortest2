package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class GroupSwipeCoordinator$createTouchHelperCallback$5 extends AbstractC7737t implements Function0<String> {
    final /* synthetic */ GroupSwipeCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupSwipeCoordinator$createTouchHelperCallback$5(GroupSwipeCoordinator groupSwipeCoordinator) {
        super(0);
        this.this$0 = groupSwipeCoordinator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String str;
        str = this.this$0.currentlySwipingGroup;
        return str;
    }
}
