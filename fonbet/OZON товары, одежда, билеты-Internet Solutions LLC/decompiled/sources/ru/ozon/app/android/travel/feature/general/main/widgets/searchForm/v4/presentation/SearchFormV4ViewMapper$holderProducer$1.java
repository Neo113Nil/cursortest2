package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.view.SearchFormV4View;
import ru.ozon.app.android.travel.utils.returnScreenRefresh.ReturnFromAnotherPageOrBackgroundObserver;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4WidgetViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SearchFormV4ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SearchFormV4WidgetViewHolder> {
    final /* synthetic */ SearchFormV4ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchFormV4ViewMapper$holderProducer$1(SearchFormV4ViewMapper searchFormV4ViewMapper) {
        super(2);
        this.this$0 = searchFormV4ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SearchFormV4WidgetViewHolder invoke(View view, ComposerReferences references) {
        SearchFormV4ViewModel searchFormV4ViewModel;
        ReturnFromAnotherPageOrBackgroundObserver lifecycleObserver;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        SearchFormV4ViewMapper searchFormV4ViewMapper = this.this$0;
        h viewModelOwnerProvider = references.getViewModelOwnerProvider();
        final SearchFormV4ViewMapper searchFormV4ViewMapper2 = this.this$0;
        searchFormV4ViewMapper.viewModel = (SearchFormV4ViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation.SearchFormV4ViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SearchFormV4ViewModel searchFormV4ViewModel2 = SearchFormV4ViewMapper.this.component().getSearchFormV4ViewModel();
                Intrinsics.g(searchFormV4ViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return searchFormV4ViewModel2;
            }
        }).a(SearchFormV4ViewModel.class);
        SearchFormV4View searchFormV4View = (SearchFormV4View) view;
        searchFormV4ViewModel = this.this$0.viewModel;
        lifecycleObserver = this.this$0.getLifecycleObserver();
        return new SearchFormV4WidgetViewHolder(this.this$0.component().getActionHandlersStoreFactory(), searchFormV4View, searchFormV4ViewModel, lifecycleObserver, references, this.this$0.component().getTokenizedAnalytics());
    }
}
