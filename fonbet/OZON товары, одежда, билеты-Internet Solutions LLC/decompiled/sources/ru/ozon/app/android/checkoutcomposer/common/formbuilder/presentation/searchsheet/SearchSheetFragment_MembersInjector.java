package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet;

import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.adapter.SuggestionsAdapter;

/* loaded from: classes11.dex */
public final class SearchSheetFragment_MembersInjector implements Ib.b<SearchSheetFragment> {
    public static void injectPViewModel(SearchSheetFragment searchSheetFragment, Pc.a<SearchSheetViewModelImpl> aVar) {
        searchSheetFragment.pViewModel = aVar;
    }

    public static void injectSuggestionsAdapter(SearchSheetFragment searchSheetFragment, SuggestionsAdapter suggestionsAdapter) {
        searchSheetFragment.suggestionsAdapter = suggestionsAdapter;
    }
}
