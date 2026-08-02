package jw;

import k20.C7475g;
import ru.ozon.app.android.favorites.shoppinglistv2.di.ShoppingListsV2WidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.favorites.ui.shoppinglists.ShoppingListsViewModel;
import ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.di.FreshMiniappHeaderComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.presentation.FreshMiniappHeaderViewModel;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di.TileScrollComponent$Companion$create$1$1;

/* renamed from: jw.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C7442a implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f70239b;

    public /* synthetic */ C7442a(Object obj, int i11) {
        this.f70238a = i11;
        this.f70239b = obj;
    }

    @Override // Pc.a
    public final Object get() {
        FreshMiniappHeaderViewModel viewModelProvider$lambda$0;
        SmallTileAddToCartButtonBinder addToCartButtonBinderProvider$lambda$1;
        ShoppingListsViewModel shoppingListsViewModelProvider$lambda$0;
        switch (this.f70238a) {
            case 0:
                viewModelProvider$lambda$0 = FreshMiniappHeaderComponent$Companion$create$1$1.viewModelProvider$lambda$0((C7475g) this.f70239b);
                return viewModelProvider$lambda$0;
            case 1:
                addToCartButtonBinderProvider$lambda$1 = TileScrollComponent$Companion$create$1$1.addToCartButtonBinderProvider$lambda$1((TileScrollComponent$Companion$create$1$1) this.f70239b);
                return addToCartButtonBinderProvider$lambda$1;
            default:
                shoppingListsViewModelProvider$lambda$0 = ShoppingListsV2WidgetComponent$Companion$create$1$1.shoppingListsViewModelProvider$lambda$0((ShoppingListsV2WidgetComponent$Companion$create$1$1) this.f70239b);
                return shoppingListsViewModelProvider$lambda$0;
        }
    }
}
