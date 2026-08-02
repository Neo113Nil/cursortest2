package ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.data.SearchFormBarMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/data/SearchFormBarMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SearchFormBarComponent$Companion$create$1$1$mapper$2 extends AbstractC7737t implements Function0<SearchFormBarMapper> {
    final /* synthetic */ SearchFormBarComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchFormBarComponent$Companion$create$1$1$mapper$2(SearchFormBarComponent$Companion$create$1$1 searchFormBarComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = searchFormBarComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SearchFormBarMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        return new SearchFormBarMapper(contextComponentDependencies.getContext());
    }
}
