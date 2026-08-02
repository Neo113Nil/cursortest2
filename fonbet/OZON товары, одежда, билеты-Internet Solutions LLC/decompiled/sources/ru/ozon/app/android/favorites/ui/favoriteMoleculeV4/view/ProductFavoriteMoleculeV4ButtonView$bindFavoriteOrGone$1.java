package ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.uikit.extensions.view.VibrationExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ProductFavoriteMoleculeV4ButtonView$bindFavoriteOrGone$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ ProductFavoriteMoleculeV4ButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductFavoriteMoleculeV4ButtonView$bindFavoriteOrGone$1(ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView) {
        super(1);
        this.this$0 = productFavoriteMoleculeV4ButtonView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction it) {
        FavoriteProductModel currentModel;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof AtomAction.ComposerAction) || (currentModel = this.this$0.getCurrentModel()) == null) {
            return;
        }
        ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView = this.this$0;
        if (!currentModel.getIsFavorite() && productFavoriteMoleculeV4ButtonView.getNeedVibrate()) {
            VibrationExtKt.vibrateSingle(productFavoriteMoleculeV4ButtonView);
        }
        Function2<FavoriteProductModel, View, Unit> onClick = productFavoriteMoleculeV4ButtonView.getOnClick();
        if (onClick != null) {
            onClick.invoke(currentModel, productFavoriteMoleculeV4ButtonView);
        }
    }
}
