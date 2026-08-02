package ru.ozon.app.android.favorites.data.favoriteslist;

import BF.a;
import Bc.n;
import Bc.r;
import Bc.v;
import DM.b;
import DM.c;
import DM.e;
import Hs.d;
import android.net.Uri;
import io.reactivex.AbstractC7094b;
import io.reactivex.C;
import io.reactivex.f;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.data.shoppinglists.FavoritesListsApi;
import ru.ozon.app.android.favorites.data.shoppinglists.models.ChangeListPinStatusRequest;
import ru.ozon.app.android.favorites.data.shoppinglists.models.CreateFavoritesList;
import ru.ozon.app.android.favorites.data.shoppinglists.models.CreateFavoritesListRequest;
import ru.ozon.app.android.favorites.data.shoppinglists.models.CreateFavoritesListResponse;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoriteShareListRequest;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoriteShareListResponse;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoriteShareListVO;
import ru.ozon.app.android.favorites.data.shoppinglists.models.RemoveFavoritesListsRequest;
import ru.ozon.app.android.favorites.data.shoppinglists.models.RenameFavoritesListRequest;
import ru.ozon.app.android.favorites.data.shoppinglists.models.RenameFavoritesListResponse;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.utils.UriExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import vc.o;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJQ\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00142\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010&J+\u0010*\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u000b2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0(H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/favorites/data/favoriteslist/FavoritesListsRepositoryImpl;", "Lru/ozon/app/android/favorites/data/favoriteslist/FavoritesListsRepository;", "Lru/ozon/app/android/favorites/data/shoppinglists/FavoritesListsApi;", "favoritesListsApi", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "config", "<init>", "(Lru/ozon/app/android/favorites/data/shoppinglists/FavoritesListsApi;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/network/di/NetworkComponentConfig;)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "sharedListHash", "fromList", "", "category", "parentCategoryId", "", "isWishlist", "Lio/reactivex/y;", "Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesList;", "createFavoritesList", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lio/reactivex/y;", "id", "Lio/reactivex/b;", "renameFavoritesList", "(JLjava/lang/String;)Lio/reactivex/b;", "removeFavoritesList", "(J)Lio/reactivex/b;", "permission", "shareAsManager", "Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoriteShareListVO;", "shareFavoritesList", "(JLjava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/y;", "actionName", "listId", "changePinStatus", "(Ljava/lang/String;J)Lio/reactivex/b;", "path", "", "params", "changeAccess", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/b;", "Lru/ozon/app/android/favorites/data/shoppinglists/FavoritesListsApi;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoritesListsRepositoryImpl implements FavoritesListsRepository {

    @NotNull
    private final NetworkComponentConfig config;

    @NotNull
    private final FavoritesListsApi favoritesListsApi;

    @NotNull
    private final JsonParser jsonDeserializer;

    public FavoritesListsRepositoryImpl(@NotNull FavoritesListsApi favoritesListsApi, @NotNull JsonParser jsonDeserializer, @NotNull NetworkComponentConfig config) {
        Intrinsics.checkNotNullParameter(favoritesListsApi, "favoritesListsApi");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(config, "config");
        this.favoritesListsApi = favoritesListsApi;
        this.jsonDeserializer = jsonDeserializer;
        this.config = config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f changeAccess$lambda$10(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (f) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f changePinStatus$lambda$9(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (f) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C createFavoritesList$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateFavoritesListResponse createFavoritesList$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (CreateFavoritesListResponse) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateFavoritesList createFavoritesList$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (CreateFavoritesList) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f removeFavoritesList$lambda$5(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (f) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RenameFavoritesListResponse renameFavoritesList$lambda$3(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (RenameFavoritesListResponse) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f renameFavoritesList$lambda$4(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (f) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FavoriteShareListResponse shareFavoritesList$lambda$6(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (FavoriteShareListResponse) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FavoriteShareListVO shareFavoritesList$lambda$7(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (FavoriteShareListVO) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C shareFavoritesList$lambda$8(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    @Override // ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepository
    @NotNull
    public AbstractC7094b changeAccess(@NotNull String path, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(params, "params");
        Uri.Builder buildUpon = Uri.parse(this.config.getApiUrl()).buildUpon();
        Intrinsics.checkNotNullExpressionValue(buildUpon, "buildUpon(...)");
        String builder = UriExtKt.appendEndPoint(UriExtKt.appendEndPoint(buildUpon, "composer-api.bx/_action/v2"), path).toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        AbstractC7094b changeAccess = this.favoritesListsApi.changeAccess(builder, params);
        b bVar = new b(new FavoritesListsRepositoryImpl$changeAccess$1(this), 4);
        changeAccess.getClass();
        o oVar = new o(changeAccess, bVar);
        Intrinsics.checkNotNullExpressionValue(oVar, "onErrorResumeNext(...)");
        return oVar;
    }

    @Override // ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepository
    @NotNull
    public AbstractC7094b changePinStatus(@NotNull String actionName, long listId) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        AbstractC7094b changePinStatus = this.favoritesListsApi.changePinStatus(actionName, new ChangeListPinStatusRequest(listId));
        d dVar = new d(new FavoritesListsRepositoryImpl$changePinStatus$1(this), 4);
        changePinStatus.getClass();
        o oVar = new o(changePinStatus, dVar);
        Intrinsics.checkNotNullExpressionValue(oVar, "onErrorResumeNext(...)");
        return oVar;
    }

    @Override // ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepository
    @NotNull
    public y<CreateFavoritesList> createFavoritesList(String title, String sharedListHash, String fromList, Long category, Long parentCategoryId, Boolean isWishlist) {
        y<ActionV2Response<CreateFavoritesListResponse>> createFavoriteList = this.favoritesListsApi.createFavoriteList(new CreateFavoritesListRequest(title, sharedListHash, category, fromList != null ? h.y0(fromList) : null, parentCategoryId, isWishlist));
        c cVar = new c(new FavoritesListsRepositoryImpl$createFavoritesList$1(this), 5);
        createFavoriteList.getClass();
        r rVar = new r(new r(new v(createFavoriteList, cVar), new Fw.b(FavoritesListsRepositoryImpl$createFavoritesList$2.INSTANCE, 5)), new e(FavoritesListsRepositoryImpl$createFavoritesList$3.INSTANCE, 4));
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }

    @Override // ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepository
    @NotNull
    public AbstractC7094b removeFavoritesList(long id2) {
        AbstractC7094b removeFavoritesLists = this.favoritesListsApi.removeFavoritesLists(new RemoveFavoritesListsRequest(C7714v.a0(Long.valueOf(id2))));
        Hs.e eVar = new Hs.e(new FavoritesListsRepositoryImpl$removeFavoritesList$1(this), 4);
        removeFavoritesLists.getClass();
        o oVar = new o(removeFavoritesLists, eVar);
        Intrinsics.checkNotNullExpressionValue(oVar, "onErrorResumeNext(...)");
        return oVar;
    }

    @Override // ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepository
    @NotNull
    public AbstractC7094b renameFavoritesList(long id2, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        y<ActionV2Response<RenameFavoritesListResponse>> renameFavoritesList = this.favoritesListsApi.renameFavoritesList(new RenameFavoritesListRequest(title, id2));
        a aVar = new a(FavoritesListsRepositoryImpl$renameFavoritesList$1.INSTANCE, 6);
        renameFavoritesList.getClass();
        n nVar = new n(new r(renameFavoritesList, aVar), new BF.b(FavoritesListsRepositoryImpl$renameFavoritesList$2.INSTANCE, 9));
        Intrinsics.checkNotNullExpressionValue(nVar, "flatMapCompletable(...)");
        return nVar;
    }

    @Override // ru.ozon.app.android.favorites.data.favoriteslist.FavoritesListsRepository
    @NotNull
    public y<FavoriteShareListVO> shareFavoritesList(long id2, String permission, Boolean shareAsManager) {
        y<ActionV2Response<FavoriteShareListResponse>> favoriteShareList = this.favoritesListsApi.favoriteShareList(new FavoriteShareListRequest(id2, permission, shareAsManager));
        DM.a aVar = new DM.a(FavoritesListsRepositoryImpl$shareFavoritesList$1.INSTANCE, 6);
        favoriteShareList.getClass();
        v vVar = new v(new r(new r(favoriteShareList, aVar), new CJ.a(FavoritesListsRepositoryImpl$shareFavoritesList$2.INSTANCE, 5)), new CJ.b(new FavoritesListsRepositoryImpl$shareFavoritesList$3(this), 6));
        Intrinsics.checkNotNullExpressionValue(vVar, "onErrorResumeNext(...)");
        return vVar;
    }
}
