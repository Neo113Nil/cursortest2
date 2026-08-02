package ru.ozon.app.android.pdp.widgets.navBar.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarVO;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class NavBarFavoriteMoleculeButton$bind$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ NavBarVO.Button.FavoriteMoleculeButtonWrapper $item;
    final /* synthetic */ NavBarFavoriteMoleculeButton this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavBarFavoriteMoleculeButton$bind$1$1(NavBarVO.Button.FavoriteMoleculeButtonWrapper favoriteMoleculeButtonWrapper, NavBarFavoriteMoleculeButton navBarFavoriteMoleculeButton) {
        super(0);
        this.$item = favoriteMoleculeButtonWrapper;
        this.this$0 = navBarFavoriteMoleculeButton;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str;
        FavoriteProductMolecule favoriteMoleculeButton = this.$item.getFavoriteMoleculeButton();
        NavBarFavoriteMoleculeButton navBarFavoriteMoleculeButton = this.this$0;
        if (favoriteMoleculeButton.isFavorite()) {
            TestInfo testInfo = favoriteMoleculeButton.getFavoriteButton().getTestInfo();
            if (testInfo == null || (str = testInfo.getAutomatizationId()) == null) {
                str = "favoriteButton";
            }
        } else {
            TestInfo testInfo2 = favoriteMoleculeButton.getUnfavoriteButton().getTestInfo();
            if (testInfo2 == null || (str = testInfo2.getAutomatizationId()) == null) {
                str = "unfavoriteButton";
            }
        }
        navBarFavoriteMoleculeButton.setContentDescription(str);
        this.this$0.invalidate();
    }
}
