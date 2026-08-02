package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.singleCartContainer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2CartButtonVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileRelatedProductsCurtainVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TileGrid2CartContainerViewHolder$bindButtons$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ TileGrid2CartButtonVO.TileGrid2SingleCartContainerVO $item;
    final /* synthetic */ TileGrid2CartContainerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2CartContainerViewHolder$bindButtons$2(TileGrid2CartButtonVO.TileGrid2SingleCartContainerVO tileGrid2SingleCartContainerVO, TileGrid2CartContainerViewHolder tileGrid2CartContainerViewHolder) {
        super(0);
        this.$item = tileGrid2SingleCartContainerVO;
        this.this$0 = tileGrid2CartContainerViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TileRelatedProductsCurtainVO relatedProductsCurtain = this.$item.getRelatedProductsCurtain();
        if (relatedProductsCurtain != null) {
            this.this$0.onPlusClicked(relatedProductsCurtain);
        }
    }
}
