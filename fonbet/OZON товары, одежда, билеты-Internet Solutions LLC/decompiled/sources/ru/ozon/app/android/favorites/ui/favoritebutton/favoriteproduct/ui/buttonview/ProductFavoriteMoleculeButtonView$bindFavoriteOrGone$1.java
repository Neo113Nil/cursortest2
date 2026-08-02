package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.uikit.extensions.view.VibrationExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ProductFavoriteMoleculeButtonView$bindFavoriteOrGone$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ ProductFavoriteMoleculeButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductFavoriteMoleculeButtonView$bindFavoriteOrGone$1(ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView) {
        super(1);
        this.this$0 = productFavoriteMoleculeButtonView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
    
        r3 = r2.this$0.currentModel;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(AtomAction it) {
        FavoriteProductMolecule favoriteProductMolecule;
        Intrinsics.checkNotNullParameter(it, "it");
        if ((it instanceof AtomAction.ComposerAction) && favoriteProductMolecule != null) {
            ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = this.this$0;
            if (!favoriteProductMolecule.isFavorite() && productFavoriteMoleculeButtonView.getIsVibration()) {
                VibrationExtKt.vibrateSingle(productFavoriteMoleculeButtonView);
            }
            Function2<FavoriteProductMolecule, View, Unit> onButtonChanged = productFavoriteMoleculeButtonView.getOnButtonChanged();
            if (onButtonChanged != null) {
                onButtonChanged.invoke(favoriteProductMolecule, productFavoriteMoleculeButtonView);
            }
        }
        Function0<Unit> onClick = this.this$0.getOnClick();
        if (onClick != null) {
            onClick.invoke();
        }
    }
}
