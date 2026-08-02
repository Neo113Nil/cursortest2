package ru.ozon.app.android.search.widgets.searchbar.core.repository;

import He.b;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/core/repository/SearchByImageRepositoryImpl;", "Lru/ozon/app/android/search/widgets/searchbar/core/repository/SearchByImageRepository;", "Lru/ozon/app/android/search/widgets/searchbar/core/repository/SearchByImageApi;", "searchByImageApi", "<init>", "(Lru/ozon/app/android/search/widgets/searchbar/core/repository/SearchByImageApi;)V", "Lru/ozon/app/android/search/widgets/searchbar/core/repository/SourceMetadata;", "sourceMetadata", "", "filePath", "Lru/ozon/app/android/search/widgets/searchbar/core/repository/SearchByImageResponse;", "searchByImage", "(Lru/ozon/app/android/search/widgets/searchbar/core/repository/SourceMetadata;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/search/widgets/searchbar/core/repository/SearchByImageApi;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchByImageRepositoryImpl implements SearchByImageRepository {

    @NotNull
    private final SearchByImageApi searchByImageApi;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/core/repository/SearchByImageRepositoryImpl$Companion;", "", "<init>", "()V", "DEFAULT_MIME_TYPE", "", "JSON_CONTENT_TYPE", "ATTACH_BODY_PART", "SOURCE_METADATA_PART", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SearchByImageRepositoryImpl(@NotNull SearchByImageApi searchByImageApi) {
        Intrinsics.checkNotNullParameter(searchByImageApi, "searchByImageApi");
        this.searchByImageApi = searchByImageApi;
    }

    @Override // ru.ozon.app.android.search.widgets.searchbar.core.repository.SearchByImageRepository
    public Object searchByImage(@NotNull SourceMetadata sourceMetadata, @NotNull String str, @NotNull d<? super SearchByImageResponse> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new SearchByImageRepositoryImpl$searchByImage$2(str, sourceMetadata, this, null), dVar);
    }
}
