package ru.ozon.app.android.search.widgets.searchbar.core.repository;

import We.D;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/core/repository/SearchByImageApi;", "", "LWe/D$c;", "body", "sourceMetadata", "Lru/ozon/app/android/search/widgets/searchbar/core/repository/SearchByImageResponse;", "searchByImage", "(LWe/D$c;LWe/D$c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SearchByImageApi {
    @POST("composer-api.bx/_action/searchByImage")
    @Multipart
    Object searchByImage(@NotNull @Part D.c cVar, @NotNull @Part D.c cVar2, @NotNull d<? super SearchByImageResponse> dVar);
}
