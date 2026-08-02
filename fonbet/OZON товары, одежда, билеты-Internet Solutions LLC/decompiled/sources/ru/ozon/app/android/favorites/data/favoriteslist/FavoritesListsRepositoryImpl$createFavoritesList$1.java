package ru.ozon.app.android.favorites.data.favoriteslist;

import io.reactivex.C;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.utils.HttpExceptionUtilsKt;
import ru.ozon.app.android.favorites.data.shoppinglists.models.CreateFavoritesListResponse;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lio/reactivex/C;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesListResponse;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class FavoritesListsRepositoryImpl$createFavoritesList$1 extends AbstractC7737t implements Function1<Throwable, C<? extends ActionV2Response<CreateFavoritesListResponse>>> {
    final /* synthetic */ FavoritesListsRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoritesListsRepositoryImpl$createFavoritesList$1(FavoritesListsRepositoryImpl favoritesListsRepositoryImpl) {
        super(1);
        this.this$0 = favoritesListsRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends ActionV2Response<CreateFavoritesListResponse>> invoke(Throwable it) {
        JsonParser jsonParser;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof HttpException)) {
            return y.e(it);
        }
        jsonParser = this.this$0.jsonDeserializer;
        return y.e(HttpExceptionUtilsKt.parseHttpException(jsonParser, (HttpException) it));
    }
}
