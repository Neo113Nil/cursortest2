package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SearchResultsGridViewMapper$mapper$2 extends AbstractC7737t implements Function0<SearchResultsGridMapper> {
    final /* synthetic */ SearchResultsGridViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchResultsGridViewMapper$mapper$2(SearchResultsGridViewMapper searchResultsGridViewMapper) {
        super(0);
        this.this$0 = searchResultsGridViewMapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SearchResultsGridMapper invoke() {
        return new SearchResultsGridMapper(this.this$0.component().getAppContext(), this.this$0.component().getTextMeasurer(), this.this$0.component().getSelectedProductsManager());
    }
}
