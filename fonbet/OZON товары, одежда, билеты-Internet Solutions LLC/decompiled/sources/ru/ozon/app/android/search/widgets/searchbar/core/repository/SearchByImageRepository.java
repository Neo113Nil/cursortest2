package ru.ozon.app.android.search.widgets.searchbar.core.repository;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/core/repository/SearchByImageRepository;", "", "Lru/ozon/app/android/search/widgets/searchbar/core/repository/SourceMetadata;", "sourceMetadata", "", "filePath", "Lru/ozon/app/android/search/widgets/searchbar/core/repository/SearchByImageResponse;", "searchByImage", "(Lru/ozon/app/android/search/widgets/searchbar/core/repository/SourceMetadata;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SearchByImageRepository {
    Object searchByImage(@NotNull SourceMetadata sourceMetadata, @NotNull String str, @NotNull d<? super SearchByImageResponse> dVar);
}
