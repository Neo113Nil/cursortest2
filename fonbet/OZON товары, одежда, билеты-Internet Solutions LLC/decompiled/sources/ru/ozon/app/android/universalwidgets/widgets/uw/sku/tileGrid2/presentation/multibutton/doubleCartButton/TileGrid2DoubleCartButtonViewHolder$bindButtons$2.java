package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.doubleCartButton;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2CartButtonVO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "params", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TileGrid2DoubleCartButtonViewHolder$bindButtons$2 extends AbstractC7737t implements Function1<Map<String, ? extends String>, Unit> {
    final /* synthetic */ TileGrid2CartButtonVO.TileGrid2DoubleCartButtonVO $item;
    final /* synthetic */ TileGrid2DoubleCartButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2DoubleCartButtonViewHolder$bindButtons$2(TileGrid2CartButtonVO.TileGrid2DoubleCartButtonVO tileGrid2DoubleCartButtonVO, TileGrid2DoubleCartButtonViewHolder tileGrid2DoubleCartButtonViewHolder) {
        super(1);
        this.$item = tileGrid2DoubleCartButtonVO;
        this.this$0 = tileGrid2DoubleCartButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map) {
        invoke2((Map<String, String>) map);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, String> map) {
        if (this.$item.getRelatedProductsCurtain() != null) {
            this.this$0.onSuccessFromCart(map);
        }
    }
}
