package ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.utils;

import We.M;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.favorites.data.shoppinglists.models.FavoritesListsError;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0006\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"parseHttpException", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/utils/FavoritesListsException;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "exception", "Lretrofit2/HttpException;", "getErrorBody", "Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoritesListsError;", "errorBody", "", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HttpExceptionUtilsKt {
    @NotNull
    public static final FavoritesListsError getErrorBody(@NotNull JsonParser jsonParser, @NotNull String errorBody) {
        Intrinsics.checkNotNullParameter(jsonParser, "<this>");
        Intrinsics.checkNotNullParameter(errorBody, "errorBody");
        return (FavoritesListsError) jsonParser.fromJson(errorBody, FavoritesListsError.class);
    }

    @NotNull
    public static final FavoritesListsException parseHttpException(@NotNull JsonParser jsonParser, @NotNull HttpException exception) {
        M errorBody;
        Intrinsics.checkNotNullParameter(jsonParser, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Response<?> response = exception.response();
        if (response == null || (errorBody = response.errorBody()) == null) {
            return new FavoritesListsException(null, null);
        }
        FavoritesListsError errorBody2 = getErrorBody(jsonParser, errorBody.string());
        return new FavoritesListsException(errorBody2.getError(), errorBody2.getAction());
    }
}
