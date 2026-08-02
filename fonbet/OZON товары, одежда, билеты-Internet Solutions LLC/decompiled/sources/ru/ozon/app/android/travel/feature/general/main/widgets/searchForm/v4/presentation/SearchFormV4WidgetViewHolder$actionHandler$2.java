package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.data.SearchFormV4DTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation.SearchFormV4VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SearchFormV4WidgetViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ SearchFormV4WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchFormV4WidgetViewHolder$actionHandler$2(SearchFormV4WidgetViewHolder searchFormV4WidgetViewHolder) {
        super(1);
        this.this$0 = searchFormV4WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction action) {
        SearchFormV4ViewModel searchFormV4ViewModel;
        boolean processSwapAction;
        SearchFormV4VO.Content viewObject;
        SearchFormV4DTO.AsyncFetchConfig asyncFetchConfig;
        Intrinsics.checkNotNullParameter(action, "action");
        SearchFormV4WidgetViewHolder searchFormV4WidgetViewHolder = this.this$0;
        searchFormV4ViewModel = searchFormV4WidgetViewHolder.viewModel;
        processSwapAction = searchFormV4WidgetViewHolder.processSwapAction(action, (searchFormV4ViewModel == null || (viewObject = searchFormV4ViewModel.getViewObject()) == null || (asyncFetchConfig = viewObject.getAsyncFetchConfig()) == null) ? null : asyncFetchConfig.getAsyncSwapParams());
        return Boolean.valueOf(processSwapAction);
    }
}
