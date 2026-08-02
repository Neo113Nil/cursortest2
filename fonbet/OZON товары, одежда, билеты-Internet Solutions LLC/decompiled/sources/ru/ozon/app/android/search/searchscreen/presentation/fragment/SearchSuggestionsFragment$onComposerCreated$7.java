package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SearchSuggestionsFragment$onComposerCreated$7 extends AbstractC7737t implements Function0<SearchByImageViewModel> {
    final /* synthetic */ SearchSuggestionsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchSuggestionsFragment$onComposerCreated$7(SearchSuggestionsFragment searchSuggestionsFragment) {
        super(0);
        this.this$0 = searchSuggestionsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SearchByImageViewModel invoke() {
        SearchByImageViewModel searchByImageViewModel;
        searchByImageViewModel = this.this$0.searchByImageViewModel;
        if (searchByImageViewModel != null) {
            return searchByImageViewModel;
        }
        Intrinsics.n("searchByImageViewModel");
        throw null;
    }
}
