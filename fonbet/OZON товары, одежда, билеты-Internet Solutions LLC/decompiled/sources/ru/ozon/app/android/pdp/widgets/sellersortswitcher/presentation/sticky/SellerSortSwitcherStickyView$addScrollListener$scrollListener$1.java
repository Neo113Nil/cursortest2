package ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.sticky;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class SellerSortSwitcherStickyView$addScrollListener$scrollListener$1 extends C7735q implements Function1<ViewGroup, Boolean> {
    SellerSortSwitcherStickyView$addScrollListener$scrollListener$1(Object obj) {
        super(1, obj, SellerSortSwitcherStickyHelper.class, "checkTextViewInSight", "checkTextViewInSight(Landroid/view/ViewGroup;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ViewGroup p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return Boolean.valueOf(((SellerSortSwitcherStickyHelper) this.receiver).checkTextViewInSight(p02));
    }
}
