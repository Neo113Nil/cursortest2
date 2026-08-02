package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.utils.returnScreenRefresh.ReturnFromAnotherPageOrBackgroundObserver;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/returnScreenRefresh/ReturnFromAnotherPageOrBackgroundObserver;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SearchFormV4ViewMapper$lifecycleObserver$2 extends AbstractC7737t implements Function0<ReturnFromAnotherPageOrBackgroundObserver> {
    final /* synthetic */ SearchFormV4ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchFormV4ViewMapper$lifecycleObserver$2(SearchFormV4ViewMapper searchFormV4ViewMapper) {
        super(0);
        this.this$0 = searchFormV4ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ReturnFromAnotherPageOrBackgroundObserver invoke() {
        SearchFormV4ViewModel searchFormV4ViewModel;
        searchFormV4ViewModel = this.this$0.viewModel;
        if (searchFormV4ViewModel != null) {
            return new ReturnFromAnotherPageOrBackgroundObserver(searchFormV4ViewModel);
        }
        return null;
    }
}
