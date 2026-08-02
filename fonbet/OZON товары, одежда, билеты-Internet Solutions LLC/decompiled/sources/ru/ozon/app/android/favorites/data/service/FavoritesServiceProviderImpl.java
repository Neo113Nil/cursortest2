package ru.ozon.app.android.favorites.data.service;

import Bc.r;
import Bc.t;
import DJ.e;
import HZ.d;
import Hs.b;
import Hs.c;
import Mc.a;
import io.reactivex.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.data.api.ChangeFavoriteStateResponse;
import ru.ozon.app.android.favorites.data.api.FavoriteApi;
import ru.ozon.app.android.favorites.data.api.FavoriteRequest;
import ru.ozon.app.android.favorites.data.api.FavoriteResponse;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.tracker.sendEvent.Cell;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/favorites/data/service/FavoritesServiceProviderImpl;", "Lru/ozon/app/android/favorites/data/service/FavoritesServiceProvider;", "Lru/ozon/app/android/favorites/data/api/FavoriteApi;", "api", "LHZ/d;", "deeplinkMiniAppMapper", "<init>", "(Lru/ozon/app/android/favorites/data/api/FavoriteApi;LHZ/d;)V", "Lru/ozon/app/android/favorites/data/api/ChangeFavoriteStateResponse;", "response", "Lru/ozon/app/android/favorites/data/service/ChangeFavoriteAnalyticsData;", "toChangeFavoriteStateResult", "(Lru/ozon/app/android/favorites/data/api/ChangeFavoriteStateResponse;)Lru/ozon/app/android/favorites/data/service/ChangeFavoriteAnalyticsData;", "", "id", "Lio/reactivex/y;", "", "checkFavorite", "(J)Lio/reactivex/y;", "addFavorite", "removeFromFavorites", "Lru/ozon/app/android/favorites/data/api/FavoriteApi;", "LHZ/d;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoritesServiceProviderImpl implements FavoritesServiceProvider {

    @NotNull
    private final FavoriteApi api;

    @NotNull
    private final d deeplinkMiniAppMapper;

    public FavoritesServiceProviderImpl(@NotNull FavoriteApi api, @NotNull d deeplinkMiniAppMapper) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(deeplinkMiniAppMapper, "deeplinkMiniAppMapper");
        this.api = api;
        this.deeplinkMiniAppMapper = deeplinkMiniAppMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChangeFavoriteStateResponse addFavorite$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ChangeFavoriteStateResponse) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChangeFavoriteAnalyticsData addFavorite$lambda$3(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ChangeFavoriteAnalyticsData) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List checkFavorite$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (List) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChangeFavoriteStateResponse removeFromFavorites$lambda$5(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ChangeFavoriteStateResponse) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChangeFavoriteAnalyticsData removeFromFavorites$lambda$6(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ChangeFavoriteAnalyticsData) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final ChangeFavoriteAnalyticsData toChangeFavoriteStateResult(ChangeFavoriteStateResponse response) {
        ActionType actionType = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (response.getTrackingInfo() == null) {
            return new ChangeFavoriteAnalyticsData(actionType, objArr4 == true ? 1 : 0, 3, objArr3 == true ? 1 : 0);
        }
        ChangeFavoriteStateResponse.TrackingInfo.ComposerAction composerAction = response.getTrackingInfo().getComposerAction();
        JSONObject optJSONObject = new JSONObject(composerAction.getPayload()).optJSONObject("cell");
        if (optJSONObject == null) {
            return new ChangeFavoriteAnalyticsData(ActionType.INSTANCE.getByName(composerAction.getActionType()), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = optJSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            linkedHashMap.put(next, optJSONObject.get(next));
        }
        return new ChangeFavoriteAnalyticsData(ActionType.INSTANCE.getByName(composerAction.getActionType()), new Cell.CustomCell(linkedHashMap));
    }

    @Override // ru.ozon.app.android.favorites.data.service.FavoritesServiceProvider
    @NotNull
    public y<ChangeFavoriteAnalyticsData> addFavorite(long id2) {
        List a02 = C7714v.a0(Long.valueOf(id2));
        String a11 = this.deeplinkMiniAppMapper.a();
        if (Intrinsics.d(a11, "main")) {
            a11 = null;
        }
        y<ActionV2Response<ChangeFavoriteStateResponse>> addFavorite = this.api.addFavorite(new FavoriteRequest(a02, null, a11, 2, null));
        b bVar = new b(FavoritesServiceProviderImpl$addFavorite$1.INSTANCE, 6);
        addFavorite.getClass();
        t g10 = new r(new r(addFavorite, bVar), new c(new FavoritesServiceProviderImpl$addFavorite$2(this), 5)).j(a.b()).g(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(g10, "observeOn(...)");
        return g10;
    }

    @Override // ru.ozon.app.android.favorites.data.service.FavoritesServiceProvider
    @NotNull
    public y<List<Long>> checkFavorite(long id2) {
        y<ActionV2Response<FavoriteResponse>> checkFavorite = this.api.checkFavorite(new FavoriteRequest(C7714v.a0(Long.valueOf(id2)), null, null, 6, null));
        Hs.d dVar = new Hs.d(FavoritesServiceProviderImpl$checkFavorite$1.INSTANCE, 5);
        checkFavorite.getClass();
        r rVar = new r(checkFavorite, dVar);
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }

    @Override // ru.ozon.app.android.favorites.data.service.FavoritesServiceProvider
    @NotNull
    public y<ChangeFavoriteAnalyticsData> removeFromFavorites(long id2) {
        List a02 = C7714v.a0(Long.valueOf(id2));
        String a11 = this.deeplinkMiniAppMapper.a();
        if (Intrinsics.d(a11, "main")) {
            a11 = null;
        }
        y<ActionV2Response<ChangeFavoriteStateResponse>> removeFromFavorites = this.api.removeFromFavorites(new FavoriteRequest(a02, null, a11, 2, null));
        AJ.d dVar = new AJ.d(FavoritesServiceProviderImpl$removeFromFavorites$1.INSTANCE, 6);
        removeFromFavorites.getClass();
        t g10 = new r(new r(removeFromFavorites, dVar), new e(new FavoritesServiceProviderImpl$removeFromFavorites$2(this), 7)).j(a.b()).g(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(g10, "observeOn(...)");
        return g10;
    }
}
