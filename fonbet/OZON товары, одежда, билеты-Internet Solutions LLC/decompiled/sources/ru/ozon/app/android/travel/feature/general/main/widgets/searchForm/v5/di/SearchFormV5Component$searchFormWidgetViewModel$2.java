package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.data.SearchFormV5Mapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.presentation.SearchFormV5WidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5WidgetViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class SearchFormV5Component$searchFormWidgetViewModel$2 extends AbstractC7737t implements Function0<Pc.a<SearchFormV5WidgetViewModel>> {
    final /* synthetic */ SearchFormV5Component this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchFormV5Component$searchFormWidgetViewModel$2(SearchFormV5Component searchFormV5Component) {
        super(0);
        this.this$0 = searchFormV5Component;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchFormV5WidgetViewModel invoke$lambda$0(SearchFormV5Component searchFormV5Component) {
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        composerWidgetAsyncComponentApi = searchFormV5Component.composerWidgetAsyncComponentApi;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository();
        SearchFormV5Mapper mapper = searchFormV5Component.getMapper();
        coroutineDispatchersComponentApi = searchFormV5Component.coroutineDispatchersComponentApi;
        return new SearchFormV5WidgetViewModel(composerAsyncWidgetRepository, mapper, coroutineDispatchersComponentApi.getDispatcherProvider());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<SearchFormV5WidgetViewModel> invoke() {
        final SearchFormV5Component searchFormV5Component = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.di.a
            @Override // Pc.a
            public final Object get() {
                SearchFormV5WidgetViewModel invoke$lambda$0;
                invoke$lambda$0 = SearchFormV5Component$searchFormWidgetViewModel$2.invoke$lambda$0(SearchFormV5Component.this);
                return invoke$lambda$0;
            }
        };
    }
}
