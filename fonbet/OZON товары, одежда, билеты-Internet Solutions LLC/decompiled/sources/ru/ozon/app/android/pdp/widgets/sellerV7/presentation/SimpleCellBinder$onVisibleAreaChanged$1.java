package ru.ozon.app.android.pdp.widgets.sellerV7.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.pdp.seller.SellerV7VO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SimpleCellBinder$onVisibleAreaChanged$1 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ SimpleCellBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleCellBinder$onVisibleAreaChanged$1(SimpleCellBinder simpleCellBinder) {
        super(0);
        this.this$0 = simpleCellBinder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        IconView iconView;
        boolean z11;
        CellDTO sellerCell;
        CellDTO.LeftBlock leftBlock;
        CellDTO sellerCell2;
        CellDTO.LeftBlock leftBlock2;
        IconDTO icon;
        iconView = this.this$0.getIconView();
        ImageDTO imageDTO = null;
        if ((iconView != null ? iconView.getDrawable() : null) == null) {
            SellerV7VO boundData = this.this$0.getViewHolderOwner().getBoundData();
            if (((boundData == null || (sellerCell2 = boundData.getSellerCell()) == null || (leftBlock2 = sellerCell2.getLeftBlock()) == null || (icon = leftBlock2.getIcon()) == null) ? null : icon.getText()) == null) {
                SellerV7VO boundData2 = this.this$0.getViewHolderOwner().getBoundData();
                if (boundData2 != null && (sellerCell = boundData2.getSellerCell()) != null && (leftBlock = sellerCell.getLeftBlock()) != null) {
                    imageDTO = leftBlock.getImage();
                }
                if (imageDTO != null) {
                    z11 = false;
                    return Boolean.valueOf(z11);
                }
            }
        }
        z11 = true;
        return Boolean.valueOf(z11);
    }
}
