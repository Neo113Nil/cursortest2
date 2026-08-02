package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class GroupSwipeCoordinator$createTouchHelperCallback$2 extends C7735q implements Function2<String, Float, Unit> {
    GroupSwipeCoordinator$createTouchHelperCallback$2(Object obj) {
        super(2, obj, GroupSwipeCoordinator.class, "processSwipeMovement", "processSwipeMovement(Ljava/lang/String;F)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Float f7) {
        invoke(str, f7.floatValue());
        return Unit.f71690a;
    }

    public final void invoke(String p02, float f7) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((GroupSwipeCoordinator) this.receiver).processSwipeMovement(p02, f7);
    }
}
