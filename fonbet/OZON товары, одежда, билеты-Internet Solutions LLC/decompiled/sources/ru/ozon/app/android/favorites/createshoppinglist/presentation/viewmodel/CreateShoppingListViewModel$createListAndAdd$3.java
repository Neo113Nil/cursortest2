package ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel;

import androidx.lifecycle.V;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel.CreateShoppingListViewModel;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteActionV2Response;
import ru.ozon.app.android.favorites.data.shoppinglists.models.CreateFavoritesList;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012@\u0010\u0002\u001a<\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006 \b*\u001d\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesList;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteActionV2Response;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CreateShoppingListViewModel$createListAndAdd$3 extends AbstractC7737t implements Function1<Pair<? extends CreateFavoritesList, ? extends ActionV2Response<FavoriteActionV2Response>>, Unit> {
    final /* synthetic */ boolean $hasProduct;
    final /* synthetic */ boolean $openList;
    final /* synthetic */ List<Long> $productIds;
    final /* synthetic */ CreateShoppingListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateShoppingListViewModel$createListAndAdd$3(CreateShoppingListViewModel createShoppingListViewModel, boolean z11, List<Long> list, boolean z12) {
        super(1);
        this.this$0 = createShoppingListViewModel;
        this.$hasProduct = z11;
        this.$productIds = list;
        this.$openList = z12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends CreateFavoritesList, ? extends ActionV2Response<FavoriteActionV2Response>> pair) {
        invoke2((Pair<CreateFavoritesList, ActionV2Response<FavoriteActionV2Response>>) pair);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<CreateFavoritesList, ActionV2Response<FavoriteActionV2Response>> pair) {
        String str;
        FavoritesListsEventsManager favoritesListsEventsManager;
        FavoritesListsEventsManager favoritesListsEventsManager2;
        FavoriteManager favoriteManager;
        FavoriteActionV2Response data;
        CreateFavoritesList e11 = pair.e();
        Intrinsics.checkNotNullExpressionValue(e11, "<get-first>(...)");
        CreateFavoritesList createFavoritesList = e11;
        ActionV2Response<FavoriteActionV2Response> f7 = pair.f();
        V<CreateShoppingListViewModel.Action> action = this.this$0.getAction();
        str = this.this$0.shoppingListTitle;
        action.setValue(new CreateShoppingListViewModel.Action.SuccessCreate(str, createFavoritesList.getDeeplink(), this.$hasProduct, createFavoritesList.getDescription(), this.$productIds.size(), this.$openList, (f7 == null || (data = f7.getData()) == null) ? null : data.getNotification(), f7 != null ? f7.getTrackingPayloads() : null));
        favoritesListsEventsManager = this.this$0.favoritesListManager;
        favoritesListsEventsManager.getShouldShowFlashbar().set(!this.$openList);
        favoritesListsEventsManager2 = this.this$0.favoritesListManager;
        FavoritesListsEventsManager.onListCreated$default(favoritesListsEventsManager2, null, null, null, null, 15, null);
        List<Long> list = this.$productIds;
        CreateShoppingListViewModel createShoppingListViewModel = this.this$0;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            favoriteManager = createShoppingListViewModel.favoriteManager;
            FavoriteManager.DefaultImpls.addFavorite$default(favoriteManager, longValue, null, 2, null);
        }
    }
}
