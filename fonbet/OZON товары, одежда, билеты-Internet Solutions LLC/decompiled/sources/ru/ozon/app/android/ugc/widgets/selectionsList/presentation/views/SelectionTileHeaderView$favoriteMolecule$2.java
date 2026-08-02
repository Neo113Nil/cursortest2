package ru.ozon.app.android.ugc.widgets.selectionsList.presentation.views;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectionTileHeaderView$favoriteMolecule$2 extends AbstractC7737t implements Function0<ProductFavoriteMoleculeButtonView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SelectionTileHeaderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionTileHeaderView$favoriteMolecule$2(Context context, SelectionTileHeaderView selectionTileHeaderView) {
        super(0);
        this.$context = context;
        this.this$0 = selectionTileHeaderView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ProductFavoriteMoleculeButtonView invoke() {
        FrameLayout frameLayout;
        ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = new ProductFavoriteMoleculeButtonView(this.$context, null, 0, 6, null);
        productFavoriteMoleculeButtonView.setId(R$id.selectionHeaderFavoriteMolecule);
        Dimens dimens = Dimens.INSTANCE;
        productFavoriteMoleculeButtonView.setLayoutParams(new ConstraintLayout.b(dimens.getDP_24(), dimens.getDP_24()));
        frameLayout = this.this$0.rightContainer;
        frameLayout.addView(productFavoriteMoleculeButtonView);
        return productFavoriteMoleculeButtonView;
    }
}
