package ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.sticky;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class SellerSortSwitcherStickyView$registerUiWidgetPositionWatcher$watcher$1 extends C7735q implements Function0<Integer> {
    SellerSortSwitcherStickyView$registerUiWidgetPositionWatcher$watcher$1(Object obj) {
        super(0, obj, SellerSortSwitcherStickyView.class, "findSellerSortSwitcherUiPosition", "findSellerSortSwitcherUiPosition()Ljava/lang/Integer;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Integer findSellerSortSwitcherUiPosition;
        findSellerSortSwitcherUiPosition = ((SellerSortSwitcherStickyView) this.receiver).findSellerSortSwitcherUiPosition();
        return findSellerSortSwitcherUiPosition;
    }
}
