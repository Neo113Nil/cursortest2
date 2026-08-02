package ru.ozon.app.android.storefront.widgets.navbarApparel.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "view", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "dto", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NavBarApparelViewHolder$bind$2 extends AbstractC7737t implements Function2<ProductFavoriteMoleculeButtonView, FavoriteProductMolecule, Unit> {
    final /* synthetic */ NavBarApparelViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavBarApparelViewHolder$bind$2(NavBarApparelViewHolder navBarApparelViewHolder) {
        super(2);
        this.this$0 = navBarApparelViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView, FavoriteProductMolecule favoriteProductMolecule) {
        invoke2(productFavoriteMoleculeButtonView, favoriteProductMolecule);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProductFavoriteMoleculeButtonView view, FavoriteProductMolecule dto) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(dto, "dto");
        NavBarApparelViewHolder navBarApparelViewHolder = this.this$0;
        navBarApparelViewHolder.bindFavoriteProductButton(view, dto, new AnalyticData(navBarApparelViewHolder.getTrackingData(), this.this$0.getViewItem()));
    }
}
