package ru.ozon.app.android.pdp.widgets.sellerV7.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.pdp.seller.SellerV7VO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SellerV7SimpleCellWidgetPlaceholderVH$imagePlaceholderDelegate$3 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ SellerV7SimpleCellWidgetPlaceholderVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerV7SimpleCellWidgetPlaceholderVH$imagePlaceholderDelegate$3(SellerV7SimpleCellWidgetPlaceholderVH sellerV7SimpleCellWidgetPlaceholderVH) {
        super(0);
        this.this$0 = sellerV7SimpleCellWidgetPlaceholderVH;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        CellDTO sellerCell;
        boolean hasAction;
        SellerV7VO boundData = this.this$0.getBoundData();
        boolean z11 = false;
        if (boundData != null && (sellerCell = boundData.getSellerCell()) != null) {
            hasAction = SellerV7SimpleCellWidgetPlaceholderVHKt.getHasAction(sellerCell);
            if (hasAction) {
                z11 = true;
            }
        }
        return Boolean.valueOf(z11);
    }
}
