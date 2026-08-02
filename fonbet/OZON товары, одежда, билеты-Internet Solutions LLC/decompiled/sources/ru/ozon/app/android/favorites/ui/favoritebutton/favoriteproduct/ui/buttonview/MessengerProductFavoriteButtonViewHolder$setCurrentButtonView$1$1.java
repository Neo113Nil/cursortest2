package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class MessengerProductFavoriteButtonViewHolder$setCurrentButtonView$1$1 extends C7735q implements Function2<FavoriteProductMolecule, View, Unit> {
    MessengerProductFavoriteButtonViewHolder$setCurrentButtonView$1$1(Object obj) {
        super(2, obj, MessengerProductFavoriteButtonViewHolder.class, "processLongClick", "processLongClick(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Landroid/view/View;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(FavoriteProductMolecule favoriteProductMolecule, View view) {
        invoke2(favoriteProductMolecule, view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FavoriteProductMolecule p02, View p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((MessengerProductFavoriteButtonViewHolder) this.receiver).processLongClick(p02, p12);
    }
}
