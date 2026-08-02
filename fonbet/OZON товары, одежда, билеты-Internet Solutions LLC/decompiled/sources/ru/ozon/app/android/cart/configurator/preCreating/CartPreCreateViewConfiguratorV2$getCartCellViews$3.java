package ru.ozon.app.android.cart.configurator.preCreating;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.configurator.preCreating.CartPreCreateViewConfiguratorV2;
import ru.ozon.app.android.fresh.common.widgets.molecules.cartClickTile.presentation.CartClickTileView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartPreCreateViewConfiguratorV2$getCartCellViews$3 extends AbstractC7737t implements Function0<View> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartPreCreateViewConfiguratorV2$getCartCellViews$3(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        CartPreCreateViewConfiguratorV2.Companion companion;
        Context context = this.$context;
        companion = CartPreCreateViewConfiguratorV2.Companion;
        return new CartClickTileView(context, null, 0, companion.getCartClickTileCellInitIds(), 6, null);
    }
}
