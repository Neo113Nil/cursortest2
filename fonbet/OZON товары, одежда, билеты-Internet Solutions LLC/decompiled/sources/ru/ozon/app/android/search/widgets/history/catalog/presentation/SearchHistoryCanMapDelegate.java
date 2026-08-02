package ru.ozon.app.android.search.widgets.history.catalog.presentation;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.history.catalog.data.SearchHistoryDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/history/catalog/presentation/SearchHistoryCanMapDelegate;", "", "<init>", "()V", "canMap", "", "state", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchHistoryCanMapDelegate {

    @NotNull
    public static final SearchHistoryCanMapDelegate INSTANCE = new SearchHistoryCanMapDelegate();

    private SearchHistoryCanMapDelegate() {
    }

    public final boolean canMap(Object state) {
        List<SearchHistoryDTO.ItemDTO> items;
        if ((state instanceof SearchHistoryDTO) && (items = ((SearchHistoryDTO) state).getItems()) != null) {
            return !items.isEmpty();
        }
        return false;
    }
}
