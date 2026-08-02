package ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel;

import Bc.r;
import io.reactivex.C;
import io.reactivex.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import qc.o;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteActionV2Response;
import ru.ozon.app.android.favorites.data.shoppinglists.models.CreateFavoritesList;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\u008e\u0001\u0012@\b\u0001\u0012<\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0001\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005 \u0007*\u001d\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0001\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0018\u00010\u00040\u0004 \u0007*F\u0012@\b\u0001\u0012<\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0001\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005 \u0007*\u001d\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0001\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesList;", "Lkotlin/jvm/internal/EnhancedNullability;", "favoritesList", "Lio/reactivex/C;", "Lkotlin/Pair;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteActionV2Response;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesList;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class CreateShoppingListViewModel$createListAndAdd$1 extends AbstractC7737t implements Function1<CreateFavoritesList, C<? extends Pair<? extends CreateFavoritesList, ? extends ActionV2Response<FavoriteActionV2Response>>>> {
    final /* synthetic */ String $addLink;
    final /* synthetic */ boolean $hasProduct;
    final /* synthetic */ List<Long> $productIds;
    final /* synthetic */ CreateShoppingListViewModel this$0;

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001aB\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0003\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0003 \u0006* \u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0003\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0003\u0018\u00010\u00010\u00012\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesList;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteActionV2Response;", "kotlin.jvm.PlatformType", "it", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)Lkotlin/Pair;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel.CreateShoppingListViewModel$createListAndAdd$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<ActionV2Response<FavoriteActionV2Response>, Pair<? extends CreateFavoritesList, ? extends ActionV2Response<FavoriteActionV2Response>>> {
        final /* synthetic */ CreateFavoritesList $favoritesList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CreateFavoritesList createFavoritesList) {
            super(1);
            this.$favoritesList = createFavoritesList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Pair<CreateFavoritesList, ActionV2Response<FavoriteActionV2Response>> invoke(ActionV2Response<FavoriteActionV2Response> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Pair<>(this.$favoritesList, it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateShoppingListViewModel$createListAndAdd$1(boolean z11, CreateShoppingListViewModel createShoppingListViewModel, List<Long> list, String str) {
        super(1);
        this.$hasProduct = z11;
        this.this$0 = createShoppingListViewModel;
        this.$productIds = list;
        this.$addLink = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair invoke$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Pair) function1.invoke(p02);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends Pair<CreateFavoritesList, ActionV2Response<FavoriteActionV2Response>>> invoke(CreateFavoritesList favoritesList) {
        FavoritesListsInteractor favoritesListsInteractor;
        Intrinsics.checkNotNullParameter(favoritesList, "favoritesList");
        if (!this.$hasProduct) {
            return y.f(new Pair(favoritesList, null));
        }
        favoritesListsInteractor = this.this$0.interactor;
        y addProductsToFavoritesList$default = FavoritesListsInteractor.DefaultImpls.addProductsToFavoritesList$default(favoritesListsInteractor, favoritesList.getId(), this.$productIds, this.$addLink, this.this$0.getTrackingData(), null, 16, null);
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(favoritesList);
        o oVar = new o() { // from class: ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel.a
            @Override // qc.o
            public final Object apply(Object obj) {
                Pair invoke$lambda$0;
                invoke$lambda$0 = CreateShoppingListViewModel$createListAndAdd$1.invoke$lambda$0(Function1.this, obj);
                return invoke$lambda$0;
            }
        };
        addProductsToFavoritesList$default.getClass();
        return new r(addProductsToFavoritesList$default, oVar);
    }
}
