package ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.sticky;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "widgetPosition", "", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SellerSortSwitcherStickyView$registerUiWidgetPositionWatcher$watcher$2 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ SellerSortSwitcherStickyView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerSortSwitcherStickyView$registerUiWidgetPositionWatcher$watcher$2(SellerSortSwitcherStickyView sellerSortSwitcherStickyView) {
        super(1);
        this.this$0 = sellerSortSwitcherStickyView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke2(num);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Integer num) {
        SellerSortSwitcherStickyListener sellerSortSwitcherStickyListener;
        sellerSortSwitcherStickyListener = this.this$0.scrollListener;
        if (sellerSortSwitcherStickyListener != null) {
            sellerSortSwitcherStickyListener.setUiWidgetPosition(num);
        }
    }
}
