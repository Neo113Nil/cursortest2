package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.data.SearchFormV4Mapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation.SearchFormV4WidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4WidgetViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class SearchFormV4Component$Companion$create$1$1$searchFormV4WidgetViewModel$2 extends AbstractC7737t implements Function0<Pc.a<SearchFormV4WidgetViewModel>> {
    final /* synthetic */ SearchFormV4Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchFormV4Component$Companion$create$1$1$searchFormV4WidgetViewModel$2(SearchFormV4Component$Companion$create$1$1 searchFormV4Component$Companion$create$1$1) {
        super(0);
        this.this$0 = searchFormV4Component$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchFormV4WidgetViewModel invoke$lambda$0(SearchFormV4Component$Companion$create$1$1 searchFormV4Component$Companion$create$1$1) {
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        composerWidgetAsyncComponentApi = searchFormV4Component$Companion$create$1$1.composerWidgetAsyncComponentApi;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository();
        SearchFormV4Mapper mapper = searchFormV4Component$Companion$create$1$1.getMapper();
        coroutineDispatchersComponentApi = searchFormV4Component$Companion$create$1$1.coroutineDispatchersComponentApi;
        return new SearchFormV4WidgetViewModel(composerAsyncWidgetRepository, mapper, coroutineDispatchersComponentApi.getDispatcherProvider());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<SearchFormV4WidgetViewModel> invoke() {
        final SearchFormV4Component$Companion$create$1$1 searchFormV4Component$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.di.a
            @Override // Pc.a
            public final Object get() {
                SearchFormV4WidgetViewModel invoke$lambda$0;
                invoke$lambda$0 = SearchFormV4Component$Companion$create$1$1$searchFormV4WidgetViewModel$2.invoke$lambda$0(SearchFormV4Component$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
