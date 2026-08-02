package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.ClearSearchTextViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", SearchIntents.EXTRA_QUERY, "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SearchBarViewDelegate$bind$3 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ SearchBarViewDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarViewDelegate$bind$3(SearchBarViewDelegate searchBarViewDelegate) {
        super(1);
        this.this$0 = searchBarViewDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(SearchBarViewDelegate searchBarViewDelegate, AppCompatEditText appCompatEditText, String str) {
        ClearSearchTextViewModel clearSearchTextViewModel;
        searchBarViewDelegate.setTextFromBind(appCompatEditText, str);
        clearSearchTextViewModel = searchBarViewDelegate.clearSearchTextViewModel;
        clearSearchTextViewModel.setNeedClearText(false);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final String str) {
        StaticSearchBarView staticSearchBarView;
        SearchBarViewDelegate$editTextTextWatcher$1 searchBarViewDelegate$editTextTextWatcher$1;
        SearchBarViewDelegate$editTextTextWatcher$1 searchBarViewDelegate$editTextTextWatcher$12;
        ClearSearchTextViewModel clearSearchTextViewModel;
        staticSearchBarView = this.this$0.searchBarView;
        final AppCompatEditText searchEditText = staticSearchBarView.getSearchEditText();
        final SearchBarViewDelegate searchBarViewDelegate = this.this$0;
        searchBarViewDelegate$editTextTextWatcher$1 = searchBarViewDelegate.editTextTextWatcher;
        searchEditText.removeTextChangedListener(searchBarViewDelegate$editTextTextWatcher$1);
        searchBarViewDelegate$editTextTextWatcher$12 = searchBarViewDelegate.editTextTextWatcher;
        searchEditText.addTextChangedListener(searchBarViewDelegate$editTextTextWatcher$12);
        clearSearchTextViewModel = searchBarViewDelegate.clearSearchTextViewModel;
        if (clearSearchTextViewModel.getNeedClearText()) {
            searchEditText.post(new Runnable() { // from class: ru.ozon.app.android.search.searchscreen.presentation.fragment.a
                @Override // java.lang.Runnable
                public final void run() {
                    SearchBarViewDelegate$bind$3.invoke$lambda$1$lambda$0(SearchBarViewDelegate.this, searchEditText, str);
                }
            });
        } else {
            searchBarViewDelegate.setTextFromBind(searchEditText, str);
        }
    }
}
