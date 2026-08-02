package ru.ozon.app.android.pdp.widgets.sellerV7.presentation;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.sellerV7.presentation.SellerV7SimpleCellVH;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/cell/CellView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SellerV7SimpleCellWidgetPlaceholderVH$mainView$1 extends AbstractC7737t implements Function0<CellView> {
    final /* synthetic */ SellerV7SimpleCellWidgetPlaceholderVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerV7SimpleCellWidgetPlaceholderVH$mainView$1(SellerV7SimpleCellWidgetPlaceholderVH sellerV7SimpleCellWidgetPlaceholderVH) {
        super(0);
        this.this$0 = sellerV7SimpleCellWidgetPlaceholderVH;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CellView invoke() {
        FrameLayout frameLayout;
        SellerV7SimpleCellVH.Companion companion = SellerV7SimpleCellVH.INSTANCE;
        frameLayout = this.this$0.view;
        Context context = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return companion.createView(context);
    }
}
