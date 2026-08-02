package ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class ProductFavoriteButtonV4ViewHolder$setCurrentButtonView$1$1 extends C7735q implements Function2<FavoriteProductModel, View, Unit> {
    ProductFavoriteButtonV4ViewHolder$setCurrentButtonView$1$1(Object obj) {
        super(2, obj, ProductFavoriteButtonV4ViewHolder.class, "processLongClick", "processLongClick(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Landroid/view/View;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(FavoriteProductModel favoriteProductModel, View view) {
        invoke2(favoriteProductModel, view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FavoriteProductModel p02, View p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((ProductFavoriteButtonV4ViewHolder) this.receiver).processLongClick(p02, p12);
    }
}
